package com.exdrill.ce.world.biome;

import com.exdrill.ce.registry.ModBiomes;
import com.mojang.datafixers.util.Pair;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.biome.source.util.MultiNoiseUtil;
import terrablender.api.Region;
import terrablender.api.RegionType;

import java.util.function.Consumer;

public class CaveEnhancementsRegion extends Region {

    public CaveEnhancementsRegion(Identifier name, int weight) {
        super(name, RegionType.OVERWORLD, weight);
    }


    @Override
    public void addBiomes(Registry<Biome> registry, Consumer<Pair<MultiNoiseUtil.NoiseHypercube, RegistryKey<Biome>>> mapper) {
        this.addModifiedVanillaOverworldBiomes(mapper, builder -> {
            builder.replaceBiome(ModBiomes.GOOP_CAVES_KEY, ModBiomes.GOOP_CAVES_KEY);
            builder.replaceBiome(ModBiomes.ROSE_QUARTZ_CAVES_KEY, ModBiomes.ROSE_QUARTZ_CAVES_KEY);
        });
    }

}
