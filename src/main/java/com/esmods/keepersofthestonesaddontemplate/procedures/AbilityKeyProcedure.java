package com.esmods.keepersofthestonesaddontemplate.procedures;

import net.neoforged.neoforge.event.TickEvent;
import net.neoforged.fml.common.Mod;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.Entity;

import javax.annotation.Nullable;

import com.esmods.keepersofthestonestwo.network.PowerModVariables;
import com.esmods.keepersofthestonesaddontemplate.init.PowerTemplateModMobEffects;

@Mod.EventBusSubscriber
public class AbilityKeyProcedure {
	@SubscribeEvent
	public static void onPlayerTick(TickEvent.PlayerTickEvent event) {
		if (event.phase == TickEvent.Phase.END) {
			execute(event, event.player.getX(), event.player.getY(), event.player.getZ(), event.player);
		}
	}

	public static void execute(double x, double y, double z, Entity entity) {
		execute(null, x, y, z, entity);
	}

	private static void execute(@Nullable Event event, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity.getData(PowerModVariables.PLAYER_VARIABLES).use_ability_key_var) {
			if (entity.getData(PowerModVariables.PLAYER_VARIABLES).ability_block == false) {
				if (entity instanceof LivingEntity _livEnt2 && _livEnt2.hasEffect(PowerTemplateModMobEffects.CUSTOM_MASTER.get())) {
					CustomSpecialAttackProcedure.execute(entity);
				}
			}
		}
	}
}
