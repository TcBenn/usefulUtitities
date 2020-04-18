package net.mcreator.useful_utilities.procedures;

import net.minecraftforge.fml.server.ServerLifecycleHooks;

import net.minecraft.util.text.StringTextComponent;
import net.minecraft.server.MinecraftServer;

import net.mcreator.useful_utilities.UsefulUtilitiesElements;

@UsefulUtilitiesElements.ModElement.Tag
public class SolidPissOreRedstoneOnProcedure extends UsefulUtilitiesElements.ModElement {
	public SolidPissOreRedstoneOnProcedure(UsefulUtilitiesElements instance) {
		super(instance, 7);
	}

	public static void executeProcedure(java.util.HashMap<String, Object> dependencies) {
		{
			MinecraftServer mcserv = ServerLifecycleHooks.getCurrentServer();
			if (mcserv != null)
				mcserv.getPlayerList().sendMessage(new StringTextComponent("Nice Cock!"));
		}
	}
}
