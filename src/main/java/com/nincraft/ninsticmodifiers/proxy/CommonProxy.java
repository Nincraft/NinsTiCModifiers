package com.nincraft.ninsticmodifiers.proxy;

import com.nincraft.ninsticmodifiers.handler.ConfigurationHandler;

import cpw.mods.fml.common.FMLCommonHandler;

public abstract class CommonProxy implements IProxy {

	public void registerEventHandlers() {
		FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
	}

}
