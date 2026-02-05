package net.falconidos.pokemonazalea.network.c2s_handlers;

import net.fabricmc.fabric.api.networking.v1.PacketByteBufs;
import net.fabricmc.fabric.api.networking.v1.ServerPlayNetworking;
import net.falconidos.pokemonazalea.data.PlayerData;
import net.falconidos.pokemonazalea.data.StateSaverAndLoader;
import net.falconidos.pokemonazalea.network.c2s.StarterActionC2SPayload;
import net.falconidos.pokemonazalea.sound.ModSounds;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.server.MinecraftServer;
import net.minecraft.server.command.CommandManager;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.world.World;

public final class StarterActionReceiver {

    private StarterActionReceiver() {}

    public static void handle(StarterActionC2SPayload payload, ServerPlayNetworking.Context ctx){

        ServerPlayerEntity player = ctx.player();
        MinecraftServer server = ctx.server();
        CommandManager commandManager = server.getCommandManager();



        if (server==null) return;

        World world = player.getWorld();

        PlayerData playerState = StateSaverAndLoader.getPlayerState(player);

        if(playerState.starterSelected == 1) {

                String command = "title " + player.getName().getString() + " " + "actionbar \"Ya seleccionaste un starter\"";
                commandManager.executeWithPrefix(player.getCommandSource().withLevel(4).withSilent(), command);

        } else if (playerState.starterSelected == 0) {

            String command = "";

            if(payload.pokemon().equals("applin")){
                command = "pokegiveother " + player.getName().getString() + " " + "applin level=5";
            } else

            if(payload.pokemon().equals("vulpix")){
                command = "pokegiveother " + player.getName().getString() + " " + "vulpix alolan level=5";
            } else

            if(payload.pokemon().equals("abra")){
                command = "pokegiveother " + player.getName().getString() + " " + "abra level=5 moves=storedpower";
            } else

            if(payload.pokemon().equals("honedge")){
                command = "pokegiveother " + player.getName().getString() + " " + "honedge level=5";
            } else

            if(payload.pokemon().equals("sneasel")){
                command = "pokegiveother " + player.getName().getString() + " " + "sneasel hisuian level=5";
            } else

            if(payload.pokemon().equals("scyther")){
                command = "pokegiveother " + player.getName().getString() + " " + "scyther level=5";
            } else

            if(payload.pokemon().equals("sprigatitto")){
                command = "pokegiveother " + player.getName().getString() + " " + "sprigatitto level=5";
            }else

            if(payload.pokemon().equals("litten")){
                command = "pokegiveother " + player.getName().getString() + " " + "litten level=5";
            }else

            if(payload.pokemon().equals("gligar")){
                command = "pokegiveother " + player.getName().getString() + " " + "gligar level=5";
            }else

            if(payload.pokemon().equals("elekid")){
                command = "pokegiveother " + player.getName().getString() + " " + "elekid level=5";
            }else

            if(payload.pokemon().equals("rookidee")){
                command = "pokegiveother " + player.getName().getString() + " " + "rookidee level=5";
            }else

            if(payload.pokemon().equals("tinkatink")){
                command = "pokegiveother " + player.getName().getString() + " " + "tinkatink level=5";
            }else

            if(payload.pokemon().equals("riolu")){
                command = "pokegiveother " + player.getName().getString() + " " + "riolu level=5";
            }else

            if(payload.pokemon().equals("pawniard")){
                command = "pokegiveother " + player.getName().getString() + " " + "pawniard level=5";
            }else

            if(payload.pokemon().equals("munchlax")){
                command = "pokegiveother " + player.getName().getString() + " " + "munchlax level=5";
            }else

            if(payload.pokemon().equals("nacli")){
                command = "pokegiveother " + player.getName().getString() + " " + "nacli level=5";
            }else

            if(payload.pokemon().equals("gastly")){
                command = "pokegiveother " + player.getName().getString() + " " + "gastly level=5";
            }

            commandManager.executeWithPrefix(player.getCommandSource().withLevel(4).withSilent(), command);
            commandManager.executeWithPrefix(player.getCommandSource().withLevel(4).withSilent(), "playsound pokemonazalea:starter.get player " + player.getName().getString());

            playerState = StateSaverAndLoader.getPlayerState(player);
            playerState.starterSelected +=1;

            PacketByteBuf data = PacketByteBufs.create();
            data.writeInt(playerState.starterSelected);

        }

    }

}
