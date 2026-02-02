package net.falconidos.pokemonazalea.item;

import net.falconidos.pokemonazalea.PokemonAzalea;

import net.falconidos.pokemonazalea.item.custom.BilleteraItem;
import net.falconidos.pokemonazalea.item.custom.CartaItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;


public class ModItems {

    public static final BilleteraItem BILLETERA = registerCustomItem("billetera", new BilleteraItem(new Item.Settings()));
    public static final CartaItem CARTA = registerCustomItem("carta", new CartaItem(new Item.Settings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(PokemonAzalea.MOD_ID, name), item);
    }

    private static <T extends Item> T registerCustomItem(String name, T item) {
        return Registry.register(Registries.ITEM, Identifier.of(PokemonAzalea.MOD_ID, name), item);
    }

    public static void registerModItems() {
        PokemonAzalea.LOGGER.info("Registering Mod Items for " + PokemonAzalea.MOD_ID);
    }

}
