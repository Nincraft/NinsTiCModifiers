package com.nincraft.ninsticmodifiers.proxy;


import net.minecraft.client.audio.PositionedSoundRecord;
import net.minecraft.util.ResourceLocation;
import cpw.mods.fml.client.FMLClientHandler;

public class ClientProxy extends CommonProxy {

	@Override
	public ClientProxy getClientProxy() {
		return this;
	}

	@Override
	public void registerEventHandlers() {
		super.registerEventHandlers();
	}

	@Override
	public void playSound(String soundName, float xCoord, float yCoord,
			float zCoord, float volume, float pitch) {
		FMLClientHandler
				.instance()
				.getClient()
				.getSoundHandler()
				.playSound(
						new PositionedSoundRecord(new ResourceLocation(
								soundName), volume, pitch, xCoord, yCoord,
								zCoord));
	}

	@Override
	public void spawnParticle(String particleName, double xCoord,
			double yCoord, double zCoord, double xVelocity, double yVelocity,
			double zVelocity) {
		FMLClientHandler
				.instance()
				.getWorldClient()
				.spawnParticle(particleName, xCoord, yCoord, zCoord, xVelocity,
						yVelocity, zVelocity);
	}

}
