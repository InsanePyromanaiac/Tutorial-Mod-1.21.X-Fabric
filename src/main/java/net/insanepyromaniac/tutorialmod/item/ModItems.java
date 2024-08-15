package net.insanepyromaniac.tutorialmod.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.insanepyromaniac.tutorialmod.TutorialMod;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems {

    public static final Item PINK_GARNET = registerItem("pink_garnet",new Item(new Item.Settings()));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registries.ITEM, Identifier.of(TutorialMod.ModID),item);
    }

    public static void registerModitems(){
        TutorialMod.LOGGER.info("registering mod items for"+TutorialMod.ModID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(PINK_GARNET);
        });
    }
}
