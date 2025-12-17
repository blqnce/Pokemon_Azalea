package net.falconidos.pokemonazalea;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.falconidos.pokemonazalea.block.ModBlocks;
import net.minecraft.client.render.RenderLayer;

public class PokemonAzaleaClient implements ClientModInitializer {


    @Override
    public void onInitializeClient() {
        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.BLUE_ULTRA_CRYSTAL_BUD, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.GREEN_ULTRA_CRYSTAL_BUD, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.ORANGE_ULTRA_CRYSTAL_BUD, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.PINK_ULTRA_CRYSTAL_BUD, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.RED_ULTRA_CRYSTAL_BUD, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.WHITE_ULTRA_CRYSTAL_BUD, RenderLayer.getCutout());

        BlockRenderLayerMap.INSTANCE.putBlock(ModBlocks.YELLOW_ULTRA_CRYSTAL_BUD, RenderLayer.getCutout());


    }
}
