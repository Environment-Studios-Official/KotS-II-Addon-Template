package com.esmods.keepersofthestonesaddontemplate.procedures;

import net.minecraft.world.entity.Entity;

import com.esmods.keepersofthestonestwo.network.PowerModVariables;

public class GetFakeWheelThreeProcedure {
	public static boolean execute(Entity entity) {
		if (entity == null)
			return false;
		return !(entity.getData(PowerModVariables.PLAYER_VARIABLES).fake_element_name_third).equals("0");
	}
}
