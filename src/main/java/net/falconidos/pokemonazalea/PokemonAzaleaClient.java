package net.falconidos.pokemonazalea;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.blockrenderlayer.v1.BlockRenderLayerMap;
import net.falconidos.pokemonazalea.block.ModBlocks;
import net.falconidos.pokemonazalea.screen.ModScreenHandlers;
import net.falconidos.pokemonazalea.screen.custom.pokeball.starters.abra.AbraScreen;
import net.falconidos.pokemonazalea.screen.custom.pokeball.starters.applin.ApplinScreen;
import net.falconidos.pokemonazalea.screen.custom.pokeball.starters.elekid.ElekidScreen;
import net.falconidos.pokemonazalea.screen.custom.pokeball.starters.gastly.GastlyScreen;
import net.falconidos.pokemonazalea.screen.custom.pokeball.starters.gligar.GligarScreen;
import net.falconidos.pokemonazalea.screen.custom.pokeball.starters.honedge.HonedgeScreen;
import net.falconidos.pokemonazalea.screen.custom.pokeball.starters.litten.LittenScreen;
import net.falconidos.pokemonazalea.screen.custom.pokeball.starters.mudkip.MudkipScreen;
import net.falconidos.pokemonazalea.screen.custom.pokeball.starters.munchlax.MunchlaxScreen;
import net.falconidos.pokemonazalea.screen.custom.pokeball.starters.nacli.NacliScreen;
import net.falconidos.pokemonazalea.screen.custom.pokeball.starters.pawniard.PawniardScreen;
import net.falconidos.pokemonazalea.screen.custom.pokeball.starters.riolu.RioluScreen;
import net.falconidos.pokemonazalea.screen.custom.pokeball.starters.rookidee.RookideeScreen;
import net.falconidos.pokemonazalea.screen.custom.pokeball.starters.scyther.ScytherScreen;
import net.falconidos.pokemonazalea.screen.custom.pokeball.starters.sneasel.SneaselScreen;
import net.falconidos.pokemonazalea.screen.custom.pokeball.starters.sprigatitto.SprigatittoScreen;
import net.falconidos.pokemonazalea.screen.custom.pokeball.starters.tinkatink.TinkatinkScreen;
import net.falconidos.pokemonazalea.screen.custom.pokeball.starters.vulpix.VulpixScreen;
import net.minecraft.client.gui.screen.ingame.HandledScreens;
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

        HandledScreens.register(ModScreenHandlers.APPLIN_SCREEN_HANDLER, ApplinScreen::new);
        HandledScreens.register(ModScreenHandlers.VULPIX_SCREEN_HANDLER, VulpixScreen::new);
        HandledScreens.register(ModScreenHandlers.ABRA_SCREEN_HANDLER, AbraScreen::new);
        HandledScreens.register(ModScreenHandlers.HONEDGE_SCREEN_HANDLER, HonedgeScreen::new);
        HandledScreens.register(ModScreenHandlers.SNEASEL_SCREEN_HANDLER, SneaselScreen::new);
        HandledScreens.register(ModScreenHandlers.SCYTHER_SCREEN_HANDLER, ScytherScreen::new);
        HandledScreens.register(ModScreenHandlers.SPRIGATITTO_SCREEN_HANDLER, SprigatittoScreen::new);
        HandledScreens.register(ModScreenHandlers.MUDKIP_SCREEN_HANDLER, MudkipScreen::new);
        HandledScreens.register(ModScreenHandlers.LITTEN_SCREEN_HANDLER, LittenScreen::new);
        HandledScreens.register(ModScreenHandlers.GLIGAR_SCREEN_HANDLER, GligarScreen::new);
        HandledScreens.register(ModScreenHandlers.ELEKID_SCREEN_HANDLER, ElekidScreen::new);
        HandledScreens.register(ModScreenHandlers.ROOKIDEE_SCREEN_HANDLER, RookideeScreen::new);
        HandledScreens.register(ModScreenHandlers.TINKATINK_SCREEN_HANDLER, TinkatinkScreen::new);
        HandledScreens.register(ModScreenHandlers.RIOLU_SCREEN_HANDLER, RioluScreen::new);
        HandledScreens.register(ModScreenHandlers.PAWNIARD_SCREEN_HANDLER, PawniardScreen::new);
        HandledScreens.register(ModScreenHandlers.MUNCHLAX_SCREEN_HANDLER, MunchlaxScreen::new);
        HandledScreens.register(ModScreenHandlers.NACLI_SCREEN_HANDLER, NacliScreen::new);
        HandledScreens.register(ModScreenHandlers.GASTLY_SCREEN_HANDLER, GastlyScreen::new);
    }

}
