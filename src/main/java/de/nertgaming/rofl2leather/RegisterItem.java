package de.nertgaming.rofl2leather;

import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class RegisterItem {

    //The ITEMS deferred register in which you can register items.
    public static final DeferredRegister<Item> ITEMS = new DeferredRegister<>(ForgeRegistries.ITEMS, Main.MODID);

    //Register the tutorial dust with "tutorial_dust" as registry name and default properties
    public static final RegistryObject<Item> dried_flesh = ITEMS.register("dried_flesh",
            () -> new Item(new Item.Properties().group(ItemGroup.MISC)));

    public RegisterItem(){
        ITEMS.register(FMLJavaModLoadingContext.get().getModEventBus());
    }
}
