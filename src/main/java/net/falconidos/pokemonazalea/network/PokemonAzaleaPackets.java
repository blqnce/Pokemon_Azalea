package net.falconidos.pokemonazalea.network;

import net.fabricmc.fabric.api.networking.v1.PayloadTypeRegistry;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.falconidos.pokemonazalea.network.c2s.StarterActionC2SPayload;
import net.falconidos.pokemonazalea.network.c2s_handlers.StarterActionReceiver;

public class PokemonAzaleaPackets {

    public static void registerC2S(){


        PayloadTypeRegistry.playC2S().register(StarterActionC2SPayload.ID, StarterActionC2SPayload.CODEC);
        ServerPlayNetworking.registerGlobalReceiver(StarterActionC2SPayload.ID, StarterActionReceiver::handle);


    }
}
