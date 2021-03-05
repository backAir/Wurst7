/*
 * Copyright (c) 2014-2021 Wurst-Imperium and contributors.
 *
 * This source code is subject to the terms of the GNU General Public
 * License, version 3. If a copy of the GPL was not distributed with this
 * file, You can obtain one at: https://www.gnu.org/licenses/gpl-3.0.txt
 */
package net.wurstclient.mixin;

import net.wurstclient.util.ChatUtils;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import net.minecraft.client.font.TextRenderer;
import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.EntityRenderDispatcher;
import net.minecraft.client.render.entity.EntityRenderer;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.text.Text;
import net.minecraft.util.math.Matrix4f;
import net.wurstclient.WurstClient;
import net.wurstclient.hacks.NameTagsHack;

@Mixin(EntityRenderer.class)
public abstract class EntityRendererMixin<T extends Entity>
{
    @Shadow
    @Final
    protected EntityRenderDispatcher dispatcher;

    @Inject(at = {@At("HEAD")},
            method = {
                    "renderLabelIfPresent(Lnet/minecraft/entity/Entity;Lnet/minecraft/text/Text;Lnet/minecraft/client/util/math/MatrixStack;Lnet/minecraft/client/render/VertexConsumerProvider;I)V"},
            cancellable = true)
    private void onRenderLabelIfPresent(T entity, Text text,
                                        MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider,
                                        int i, CallbackInfo ci)
    {
        if(entity instanceof LivingEntity)
            text = WurstClient.INSTANCE.getHax().healthTagsHack
                    .addHealth((LivingEntity)entity, text);

        wurstRenderLabelIfPresent(entity, text, matrixStack,
                vertexConsumerProvider, i);

    }

    /**
     * Copy of renderLabelIfPresent() since calling the original would result in
     * an infinite loop. Also makes it easier to modify.
     */
    protected void wurstRenderLabelIfPresent(T entity, Text text,
                                             MatrixStack matrixStack, VertexConsumerProvider vertexConsumerProvider,
                                             int i)
    {
        double d = this.dispatcher.getSquaredDistanceToCamera(entity);

        if(d > 4096)
            return;

        NameTagsHack nameTagsHack = WurstClient.INSTANCE.getHax().nameTagsHack;

        boolean bl = !entity.isSneaky() || nameTagsHack.isEnabled();
        float f = entity.getHeight() + 0.5F;
        int j = "deadmau5".equals(text.getString()) ? -10 : 0;

        matrixStack.push();
        matrixStack.translate(0.0D, f, 0.0D);
        matrixStack.multiply(this.dispatcher.getRotation());



        Matrix4f matrix4f = matrixStack.peek().getModel();




        matrixStack.pop();
    }

    @Shadow
    public TextRenderer getFontRenderer()
    {
        return null;
    }
}