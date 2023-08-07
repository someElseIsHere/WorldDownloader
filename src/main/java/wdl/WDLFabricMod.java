/*
 * This file is part of WDL Forge.  WDL Forge contains the forge-specific
 * code for World Downloader: A mod to make backups of your multiplayer worlds.
 * https://www.minecraftforum.net/forums/mapping-and-modding-java-edition/minecraft-mods/2520465-world-downloader-mod-create-backups-of-your-builds
 *
 * Copyright (c) 2014 nairol, cubic72
 * Copyright (c) 2019-2020 Pokechu22, julialy
 *
 * This project is licensed under the MMPLv2.  The full text of the MMPL can be
 * found in LICENSE.md, or online at https://github.com/iopleke/MMPLv2/blob/master/LICENSE.md
 * For information about this the MMPLv2, see https://stopmodreposts.org/
 *
 * Do not redistribute (in modified or unmodified form) without prior permission.
 */
package wdl;

import net.fabricmc.api.ClientModInitializer;
import net.minecraft.client.MinecraftClient;

public class WDLFabricMod implements ClientModInitializer {
	@Override
	public void onInitializeClient() {
		WDL.bootstrap(MinecraftClient.getInstance());
	}
}
