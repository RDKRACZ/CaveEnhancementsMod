package com.exdrill.ce;

import com.exdrill.ce.registry.*;
import com.exdrill.ce.world.biome.CaveEnhancementsRegion;
import net.fabricmc.api.ModInitializer;
import net.minecraft.util.Identifier;
import terrablender.api.Regions;
import terrablender.api.TerraBlenderApi;

public class CaveEnhancements implements ModInitializer, TerraBlenderApi {
    public static final String NAMESPACE = "ce";

    @Override
    public void onInitialize() {
        ModBlocks.registerBlocks();
        ModItems.registerItems();
        ModParticles.registerParticles();
        ModBlocks.registerBlockEntities();
        ModSounds.registerSounds();
        ModEntities.registerEntities();
        ModBiomes.registerBiomes();
        ModBiomes.registerBiomeModifications();
    }

    @Override
    public void onTerraBlenderInitialized() {
        Regions.register(new CaveEnhancementsRegion(new Identifier(NAMESPACE, "cave_enhancements"), 1));
    }

    public static final Identifier PacketID = new Identifier(CaveEnhancements.NAMESPACE, "spawn_packet");
}

