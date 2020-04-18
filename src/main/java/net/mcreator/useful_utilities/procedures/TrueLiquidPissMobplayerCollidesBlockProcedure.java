package net.mcreator.useful_utilities.procedures;

import net.minecraft.util.DamageSource;
import net.minecraft.entity.Entity;

import net.mcreator.useful_utilities.UsefulUtilitiesElements;

@UsefulUtilitiesElements.ModElement.Tag
public class TrueLiquidPissMobplayerCollidesBlockProcedure extends UsefulUtilitiesElements.ModElement {
	public TrueLiquidPissMobplayerCollidesBlockProcedure(UsefulUtilitiesElements instance) {
		super(instance, 10);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		if (dependencies.get("entity") == null) {
			System.err.println("Failed to load dependency entity for procedure TrueLiquidPissMobplayerCollidesBlock!");
			return;
		}
		Entity entity = (Entity) dependencies.get("entity");
		entity.attackEntityFrom(DamageSource.LIGHTNING_BOLT, (float) 0.1);
	}
}
