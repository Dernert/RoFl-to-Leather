package de.nertgaming.rofl2leather;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemTier;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegisterItem {

    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Main.MODID);

    public static final RegistryObject<Item> dried_flesh = ITEMS.register("dried_flesh",
            () -> new Item(new Item.Properties().group(ItemGroup.MISC)));

    public static final RegistryObject<Item> skin = ITEMS.register("skin",
            () -> new Item(new Item.Properties().group(ItemGroup.MISC)));

    public static final RegistryObject<Item> hunting_knife_bone = ITEMS.register("hunting_knife_bone",
            () -> new ItemHuntingKnife(ItemTier.IRON, 0, -2.2f, new Item.Properties().group(ItemGroup.COMBAT)));

    public static final RegistryObject<Item> hunting_knife_wood = ITEMS.register("hunting_knife_wood",
            () -> new ItemHuntingKnife(ItemTier.WOOD, 1, -2.2f, new Item.Properties().group(ItemGroup.COMBAT)));

    public RegisterItem(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
