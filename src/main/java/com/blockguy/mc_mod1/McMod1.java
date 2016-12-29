package com.blockguy.mc_mod1;


import com.blockguy.mc_mod1.item.ModItems;
import com.blockguy.mc_mod1.tabs.CreativeTab1;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import com.blockguy.mc_mod1.proxy.CommonProxy;

@Mod(modid = McMod1.MODID, version = McMod1.VERSION)

public class McMod1
{
    public static final String MODID = "mcmod1";
    public static final String VERSION = "1.0";
    public static final String NAME = "Blockguy's Minecraft Mod 1";

    @SidedProxy(clientSide = "com.blockguy.mc_mod1.proxy.ClientProxy", serverSide = "com.blockguy.mc_mod1.proxy.CommonProxy")
    public static CommonProxy proxy;

    @Mod.Instance
    public static McMod1 instance;

    public static CreativeTab1 tabs;

    @EventHandler
    public void preinit(FMLPreInitializationEvent event)
    {
        tabs = new CreativeTab1(CreativeTabs.getNextID(), "mcmod1tab");
        ModItems.preInit();
        proxy.preInit(event);
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        proxy.Init(event);
    }

    @EventHandler
    public void postinit(FMLPostInitializationEvent event)
    {
        proxy.PostInit(event);
    }
}
