package net.falconidos.pokemonazalea.screen;

import net.falconidos.pokemonazalea.PokemonAzalea;
import net.minecraft.util.Identifier;

public final class ModGuiTextures {

    private ModGuiTextures() {}

    private static Identifier id(String path) {
        return Identifier.of(PokemonAzalea.MOD_ID, path);
    }

    // Botones

    public static final Identifier ACCEPT =
            id("textures/gui/common/buttons/accept.png");

    public static final Identifier REJECT =
            id("textures/gui/common/buttons/reject.png");

    public static final Identifier BLOCKED =
            id("textures/gui/common/buttons/blocked.png");

    // Gui

    public static final Identifier APPLIN=
            id("textures/gui/pokeball/applin.png");

    public static final Identifier VULPIX=
            id("textures/gui/pokeball/vulpix.png");


    public static final Identifier HONEDGE=
            id("textures/gui/pokeball/honedge.png");


    public static final Identifier SNEASEL=
            id("textures/gui/pokeball/sneasel.png");

    public static final Identifier SCYTHER=
            id("textures/gui/pokeball/scyther.png");

    public static final Identifier ABRA=
            id("textures/gui/pokeball/abra.png");


    public static final Identifier SPRIGATITTO=
            id("textures/gui/pokeball/sprigatitto.png");

    public static final Identifier MUDKIP=
            id("textures/gui/pokeball/mudkip.png");

    public static final Identifier LITTEN=
            id("textures/gui/pokeball/litten.png");


    public static final Identifier GLIGAR=
            id("textures/gui/pokeball/gligar.png");

    public static final Identifier ELEKID=
            id("textures/gui/pokeball/elekid.png");

    public static final Identifier ROOKIDEE=
            id("textures/gui/pokeball/rookidee.png");


    public static final Identifier TINKATINK=
            id("textures/gui/pokeball/tinkatink.png");
    public static final Identifier RIOLU=
            id("textures/gui/pokeball/riolu.png");
    public static final Identifier PAWNIARD=
            id("textures/gui/pokeball/pawniard.png");


    public static final Identifier MUNCHLAX=
            id("textures/gui/pokeball/munchlax.png");
    public static final Identifier NACLI=
            id("textures/gui/pokeball/nacli.png");
    public static final Identifier GASTLY=
            id("textures/gui/pokeball/gastly.png");

}
