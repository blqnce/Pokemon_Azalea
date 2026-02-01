package net.falconidos.pokemonazalea.screen;

import net.fabricmc.fabric.api.screenhandler.v1.ExtendedScreenHandlerType;
import net.falconidos.pokemonazalea.PokemonAzalea;
import net.falconidos.pokemonazalea.screen.custom.pokeball.starters.abra.AbraScreenHandler;
import net.falconidos.pokemonazalea.screen.custom.pokeball.starters.applin.ApplinScreenHandler;
import net.falconidos.pokemonazalea.screen.custom.pokeball.starters.elekid.ElekidScreenHandler;
import net.falconidos.pokemonazalea.screen.custom.pokeball.starters.gastly.GastlyScreenHandler;
import net.falconidos.pokemonazalea.screen.custom.pokeball.starters.gligar.GligarScreenHandler;
import net.falconidos.pokemonazalea.screen.custom.pokeball.starters.honedge.HonedgeScreenHandler;
import net.falconidos.pokemonazalea.screen.custom.pokeball.starters.litten.LittenScreenHandler;
import net.falconidos.pokemonazalea.screen.custom.pokeball.starters.mudkip.MudkipScreenHandler;
import net.falconidos.pokemonazalea.screen.custom.pokeball.starters.munchlax.MunchlaxScreenHandler;
import net.falconidos.pokemonazalea.screen.custom.pokeball.starters.nacli.NacliScreenHandler;
import net.falconidos.pokemonazalea.screen.custom.pokeball.starters.pawniard.PawniardScreenHandler;
import net.falconidos.pokemonazalea.screen.custom.pokeball.starters.riolu.RioluScreenHandler;
import net.falconidos.pokemonazalea.screen.custom.pokeball.starters.rookidee.RookideeScreenHandler;
import net.falconidos.pokemonazalea.screen.custom.pokeball.starters.scyther.ScytherScreenHandler;
import net.falconidos.pokemonazalea.screen.custom.pokeball.starters.sneasel.SneaselScreenHandler;
import net.falconidos.pokemonazalea.screen.custom.pokeball.starters.sprigatitto.SprigatittoScreenHandler;
import net.falconidos.pokemonazalea.screen.custom.pokeball.starters.tinkatink.TinkatinkScreenHandler;
import net.falconidos.pokemonazalea.screen.custom.pokeball.starters.vulpix.VulpixScreenHandler;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.screen.ScreenHandlerType;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;

public class ModScreenHandlers {

    public static final ScreenHandlerType<ApplinScreenHandler> APPLIN_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(PokemonAzalea.MOD_ID, "applin_screen_handler"),
                    new ExtendedScreenHandlerType<>(ApplinScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<VulpixScreenHandler> VULPIX_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(PokemonAzalea.MOD_ID, "vulpix_screen_handler"),
                    new ExtendedScreenHandlerType<>(VulpixScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<AbraScreenHandler> ABRA_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(PokemonAzalea.MOD_ID, "abra_screen_handler"),
                    new ExtendedScreenHandlerType<>(AbraScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<GastlyScreenHandler> GASTLY_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(PokemonAzalea.MOD_ID, "gastly_screen_handler"),
                    new ExtendedScreenHandlerType<>(GastlyScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<NacliScreenHandler> NACLI_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(PokemonAzalea.MOD_ID, "nacli_screen_handler"),
                    new ExtendedScreenHandlerType<>(NacliScreenHandler::new, BlockPos.PACKET_CODEC));


    public static final ScreenHandlerType<MunchlaxScreenHandler> MUNCHLAX_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(PokemonAzalea.MOD_ID, "munchlax_screen_handler"),
                    new ExtendedScreenHandlerType<>(MunchlaxScreenHandler::new, BlockPos.PACKET_CODEC));


    public static final ScreenHandlerType<PawniardScreenHandler> PAWNIARD_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(PokemonAzalea.MOD_ID, "pawniard_screen_handler"),
                    new ExtendedScreenHandlerType<>(PawniardScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<RioluScreenHandler> RIOLU_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(PokemonAzalea.MOD_ID, "riolu_screen_handler"),
                    new ExtendedScreenHandlerType<>(RioluScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<TinkatinkScreenHandler> TINKATINK_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(PokemonAzalea.MOD_ID, "tinkatink_screen_handler"),
                    new ExtendedScreenHandlerType<>(TinkatinkScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<RookideeScreenHandler> ROOKIDEE_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(PokemonAzalea.MOD_ID, "rookidee_screen_handler"),
                    new ExtendedScreenHandlerType<>(RookideeScreenHandler::new, BlockPos.PACKET_CODEC));


    public static final ScreenHandlerType<HonedgeScreenHandler> HONEDGE_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(PokemonAzalea.MOD_ID, "honedge_screen_handler"),
                    new ExtendedScreenHandlerType<>(HonedgeScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<SneaselScreenHandler> SNEASEL_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(PokemonAzalea.MOD_ID, "sneasel_screen_handler"),
                    new ExtendedScreenHandlerType<>(SneaselScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<ScytherScreenHandler> SCYTHER_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(PokemonAzalea.MOD_ID, "scyther_screen_handler"),
                    new ExtendedScreenHandlerType<>(ScytherScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<SprigatittoScreenHandler> SPRIGATITTO_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(PokemonAzalea.MOD_ID, "sprigatitto_screen_handler"),
                    new ExtendedScreenHandlerType<>(SprigatittoScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<MudkipScreenHandler> MUDKIP_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(PokemonAzalea.MOD_ID, "mudkip_screen_handler"),
                    new ExtendedScreenHandlerType<>(MudkipScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<LittenScreenHandler> LITTEN_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(PokemonAzalea.MOD_ID, "litten_screen_handler"),
                    new ExtendedScreenHandlerType<>(LittenScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<GligarScreenHandler> GLIGAR_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(PokemonAzalea.MOD_ID, "gligar_screen_handler"),
                    new ExtendedScreenHandlerType<>(GligarScreenHandler::new, BlockPos.PACKET_CODEC));

    public static final ScreenHandlerType<ElekidScreenHandler> ELEKID_SCREEN_HANDLER =
            Registry.register(Registries.SCREEN_HANDLER, Identifier.of(PokemonAzalea.MOD_ID, "elekid_screen_handler"),
                    new ExtendedScreenHandlerType<>(ElekidScreenHandler::new, BlockPos.PACKET_CODEC));


    public static void registerScreenHandlers() {
        PokemonAzalea.LOGGER.info("Registering screen handlers for " + PokemonAzalea.MOD_ID);
    }



}
