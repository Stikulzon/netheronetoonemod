package com.netheronetoonemod;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NetherOneToOneMod implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("netheronetoonemod");

	@Override
	public void onInitialize() {
		LOGGER.info("NetherOneToOneMod initialized");
	}
}