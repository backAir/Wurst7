/*
 * Copyright (c) 2014-2021 Wurst-Imperium and contributors.
 *
 * This source code is subject to the terms of the GNU General Public
 * License, version 3. If a copy of the GPL was not distributed with this
 * file, You can obtain one at: https://www.gnu.org/licenses/gpl-3.0.txt
 */
package net.wurstclient.commands;

import net.minecraft.enchantment.Enchantment;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.util.registry.Registry;
import net.wurstclient.command.CmdError;
import net.wurstclient.command.CmdException;
import net.wurstclient.command.CmdSyntaxError;
import net.wurstclient.command.Command;
import net.wurstclient.util.ChatUtils;

public final class EnchantCmd extends Command
{
	public EnchantCmd()
	{
		super("enchant", "Enchants an item with everything,\n"
				+ "except for silk touch and curses.", ".enchant");
	}

	@Override
	public void call(String[] args) throws CmdException
	{
		if(!MC.player.abilities.creativeMode)
			throw new CmdError("Creative mode only.");

		if(args.length > 1) {
			ChatUtils.message("args: " + args[0]+" "+args[1]);


			ChatUtils.message((args[0]));
			int hello = Integer.parseInt(args[1]);

			for(Enchantment enchantment : Registry.ENCHANTMENT)
			{

				if(args[0].toLowerCase().equals("silk_touch")&&enchantment == Enchantments.SILK_TOUCH) {

					MC.player.inventory.getMainHandStack().addEnchantment(enchantment, 1 * hello);
					throw new CmdSyntaxError();
				}
				if(args[0].toLowerCase().equals("protection")&&enchantment == Enchantments.PROTECTION) {

					MC.player.inventory.getMainHandStack().addEnchantment(enchantment, 1 * hello);
					throw new CmdSyntaxError();
				}
				if(args[0].toLowerCase().equals("sweeping")&&enchantment == Enchantments.SWEEPING) {

					MC.player.inventory.getMainHandStack().addEnchantment(enchantment, 1 * hello);
					throw new CmdSyntaxError();
				}
				if(args[0].toLowerCase().equals("fire_protection")&&enchantment == Enchantments.FIRE_PROTECTION) {

					MC.player.inventory.getMainHandStack().addEnchantment(enchantment, 1 * hello);
					throw new CmdSyntaxError();
				}
				if(args[0].toLowerCase().equals("quick_charge")&&enchantment == Enchantments.QUICK_CHARGE) {

					MC.player.inventory.getMainHandStack().addEnchantment(enchantment, 1 * hello);
					throw new CmdSyntaxError();
				}
				if(args[0].toLowerCase().equals("channeling")&&enchantment == Enchantments.CHANNELING) {

					MC.player.inventory.getMainHandStack().addEnchantment(enchantment, 1 * hello);
					throw new CmdSyntaxError();
				}
				if(args[0].toLowerCase().equals("piercing")&&enchantment == Enchantments.PIERCING) {

					MC.player.inventory.getMainHandStack().addEnchantment(enchantment, 1 * hello);
					throw new CmdSyntaxError();
				}
				if(args[0].toLowerCase().equals("infinity")&&enchantment == Enchantments.INFINITY) {

					MC.player.inventory.getMainHandStack().addEnchantment(enchantment, 1 * hello);
					throw new CmdSyntaxError();
				}if(args[0].toLowerCase().equals("vanishing_curse")&&enchantment == Enchantments.VANISHING_CURSE) {

				MC.player.inventory.getMainHandStack().addEnchantment(enchantment, 1 * hello);
				throw new CmdSyntaxError();
			}if(args[0].toLowerCase().equals("punch")&&enchantment == Enchantments.PUNCH) {

				MC.player.inventory.getMainHandStack().addEnchantment(enchantment, 1 * hello);
				throw new CmdSyntaxError();
			}if(args[0].toLowerCase().equals("piercing")&&enchantment == Enchantments.PIERCING) {

				MC.player.inventory.getMainHandStack().addEnchantment(enchantment, 1 * hello);
				throw new CmdSyntaxError();
			}if(args[0].toLowerCase().equals("mending")&&enchantment == Enchantments.MENDING) {

				MC.player.inventory.getMainHandStack().addEnchantment(enchantment, 1 * hello);
				throw new CmdSyntaxError();
			}if(args[0].toLowerCase().equals("multishot")&&enchantment == Enchantments.MULTISHOT) {

				MC.player.inventory.getMainHandStack().addEnchantment(enchantment, 1 * hello);
				throw new CmdSyntaxError();
			}if(args[0].toLowerCase().equals("impaling")&&enchantment == Enchantments.IMPALING) {

				MC.player.inventory.getMainHandStack().addEnchantment(enchantment, 1 * hello);
				throw new CmdSyntaxError();
			}if(args[0].toLowerCase().equals("riptide")&&enchantment == Enchantments.RIPTIDE) {

				MC.player.inventory.getMainHandStack().addEnchantment(enchantment, 1 * hello);
				throw new CmdSyntaxError();
			}if(args[0].toLowerCase().equals("loyalty")&&enchantment == Enchantments.LOYALTY) {

				MC.player.inventory.getMainHandStack().addEnchantment(enchantment, 1 * hello);
				throw new CmdSyntaxError();
			}if(args[0].toLowerCase().equals("lure")&&enchantment == Enchantments.LURE) {

				MC.player.inventory.getMainHandStack().addEnchantment(enchantment, 1 * hello);
				throw new CmdSyntaxError();
			}if(args[0].toLowerCase().equals("luck_of_the_sea")&&enchantment == Enchantments.LUCK_OF_THE_SEA) {

				MC.player.inventory.getMainHandStack().addEnchantment(enchantment, 1 * hello);
				throw new CmdSyntaxError();
			}if(args[0].toLowerCase().equals("flame")&&enchantment == Enchantments.FLAME) {

				MC.player.inventory.getMainHandStack().addEnchantment(enchantment, 1 * hello);
				throw new CmdSyntaxError();
			}if(args[0].toLowerCase().equals("power")&&enchantment == Enchantments.POWER) {

				MC.player.inventory.getMainHandStack().addEnchantment(enchantment, 1 * hello);
				throw new CmdSyntaxError();
			}if(args[0].toLowerCase().equals("efficiency")&&enchantment == Enchantments.EFFICIENCY) {

				MC.player.inventory.getMainHandStack().addEnchantment(enchantment, 1 * hello);
				throw new CmdSyntaxError();
			}if(args[0].toLowerCase().equals("unbreaking")&&enchantment == Enchantments.UNBREAKING) {

				MC.player.inventory.getMainHandStack().addEnchantment(enchantment, 1 * hello);
				throw new CmdSyntaxError();
			}if(args[0].toLowerCase().equals("fortune")&&enchantment == Enchantments.FORTUNE) {

				MC.player.inventory.getMainHandStack().addEnchantment(enchantment, 1 * hello);
				throw new CmdSyntaxError();
			}if(args[0].toLowerCase().equals("feather_falling")&&enchantment == Enchantments.FEATHER_FALLING) {

				MC.player.inventory.getMainHandStack().addEnchantment(enchantment, 1 * hello);
				throw new CmdSyntaxError();
			}if(args[0].toLowerCase().equals("looting")&&enchantment == Enchantments.LOOTING) {

				MC.player.inventory.getMainHandStack().addEnchantment(enchantment, 1 * hello);
				throw new CmdSyntaxError();
			}if(args[0].toLowerCase().equals("fire_aspect")&&enchantment == Enchantments.FIRE_ASPECT) {

				MC.player.inventory.getMainHandStack().addEnchantment(enchantment, 1 * hello);
				throw new CmdSyntaxError();
			}if(args[0].toLowerCase().equals("bane_of_arthropods")&&enchantment == Enchantments.BANE_OF_ARTHROPODS) {

				MC.player.inventory.getMainHandStack().addEnchantment(enchantment, 1 * hello);
				throw new CmdSyntaxError();
			}if(args[0].toLowerCase().equals("blast_protection")&&enchantment == Enchantments.BLAST_PROTECTION) {

				MC.player.inventory.getMainHandStack().addEnchantment(enchantment, 1 * hello);
				throw new CmdSyntaxError();
			}if(args[0].toLowerCase().equals("projectile_protection")&&enchantment == Enchantments.PROJECTILE_PROTECTION) {

				MC.player.inventory.getMainHandStack().addEnchantment(enchantment, 1 * hello);
				throw new CmdSyntaxError();
			}if(args[0].toLowerCase().equals("knockback")&&enchantment == Enchantments.KNOCKBACK) {

				MC.player.inventory.getMainHandStack().addEnchantment(enchantment, 1 * hello);
				throw new CmdSyntaxError();
			}if(args[0].toLowerCase().equals("smite")&&enchantment == Enchantments.SMITE) {

				MC.player.inventory.getMainHandStack().addEnchantment(enchantment, 1 * hello);
				throw new CmdSyntaxError();
			}if(args[0].toLowerCase().equals("sharpness")&&enchantment == Enchantments.SHARPNESS) {

				MC.player.inventory.getMainHandStack().addEnchantment(enchantment, 1 * hello);
				throw new CmdSyntaxError();
			}if(args[0].toLowerCase().equals("respiration")&&enchantment == Enchantments.RESPIRATION) {

				MC.player.inventory.getMainHandStack().addEnchantment(enchantment, 1 * hello);
				throw new CmdSyntaxError();
			}if(args[0].toLowerCase().equals("aqua_affinity")&&enchantment == Enchantments.AQUA_AFFINITY) {

				MC.player.inventory.getMainHandStack().addEnchantment(enchantment, 1 * hello);
				throw new CmdSyntaxError();
			}if(args[0].toLowerCase().equals("soul_speed")&&enchantment == Enchantments.SOUL_SPEED) {

				MC.player.inventory.getMainHandStack().addEnchantment(enchantment, 1 * hello);
				throw new CmdSyntaxError();
			}if(args[0].toLowerCase().equals("binding_curse")&&enchantment == Enchantments.BINDING_CURSE) {

				MC.player.inventory.getMainHandStack().addEnchantment(enchantment, 1 * hello);
				throw new CmdSyntaxError();
			}if(args[0].toLowerCase().equals("thorns")&&enchantment == Enchantments.THORNS) {

				MC.player.inventory.getMainHandStack().addEnchantment(enchantment, 1 * hello);
				throw new CmdSyntaxError();
			}if(args[0].toLowerCase().equals("frost_walker")&&enchantment == Enchantments.FROST_WALKER) {

				MC.player.inventory.getMainHandStack().addEnchantment(enchantment, 1 * hello);
				throw new CmdSyntaxError();
			}if(args[0].toLowerCase().equals("depth_strider")&&enchantment == Enchantments.DEPTH_STRIDER) {

				MC.player.inventory.getMainHandStack().addEnchantment(enchantment, 1 * hello);
				throw new CmdSyntaxError();
			}



			}

			throw new CmdSyntaxError();
		}
		ItemStack stack = getHeldItem();
		enchant(stack);

		ChatUtils.message("Item enchanted.");
	}

	private ItemStack getHeldItem() throws CmdError
	{
		ItemStack stack = MC.player.inventory.getMainHandStack();

		if(stack.isEmpty())
			throw new CmdError("There is no item in your hand.");

		return stack;
	}

	private void enchant(ItemStack stack)
	{

		for(Enchantment enchantment : Registry.ENCHANTMENT)
		{
			if(enchantment == Enchantments.SILK_TOUCH)
				continue;

			if(enchantment.isCursed())
				continue;

			if(enchantment == Enchantments.QUICK_CHARGE)
			{
				stack.addEnchantment(enchantment, 5);
				continue;
			}

			stack.addEnchantment(enchantment, 127);
		}
	}

	@Override
	public String getPrimaryAction()
	{
		return "Enchant Held Item";
	}

	@Override
	public void doPrimaryAction()
	{
		WURST.getCmdProcessor().process("enchant");
	}
}
