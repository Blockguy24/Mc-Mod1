package com.blockguy.mc_mod1.proxy;

import com.blockguy.mc_mod1.item.ModItems;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

public class ClientProxy extends CommonProxy{
    @Override
    public void preInit(FMLPreInitializationEvent event) {

    }

    @Override
    public void Init(FMLInitializationEvent event) {
        ModItems.registerRenders();
    }

    @Override
    public void PostInit(FMLPostInitializationEvent event) {

    }
}
