package net.vinogorov.mptmod.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.vinogorov.mptmod.MptMod;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, MptMod.MOD_ID);


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

    private static final RegistryObject<Item> FISH = ITEMS.register("fish",
        () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    private static final RegistryObject<Item> FISH2 = ITEMS.register("fish2",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    private static final RegistryObject<Item> FISH3 = ITEMS.register("fish3",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));

    private static final RegistryObject<Item> FISH4 = ITEMS.register("fish4",
            () -> new Item(new Item.Properties().tab(CreativeModeTab.TAB_MISC)));
}