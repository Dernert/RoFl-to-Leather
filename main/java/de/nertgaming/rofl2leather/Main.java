package de.nertgaming.rofl2leather;

import net.minecraftforge.fml.common.Mod;

@Mod(Main.MODID)
public class Main {

    public static final String MODID = "rofl2leather";

    public Main(){
        new RegisterItem();
    }
}
