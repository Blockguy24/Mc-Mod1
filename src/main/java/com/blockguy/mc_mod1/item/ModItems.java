package com.blockguy.mc_mod1.item;

import com.blockguy.mc_mod1.McMod1;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {
    public static Item McModItem;

    public static void preInit(){

        McModItem = new ItemMcModItem1(EnumHelper.addToolMaterial("lol", 3, 20, 200.0F, 1000.0F, 1000), "mc_mod_item1");

        registerItems();
    }

    public static void registerItems() {
        GameRegistry.register(McModItem, new ResourceLocation(McMod1.MODID, "mc_mod_item1"));
    }

    public static void registerRenders(){
        registerRender(McModItem);
    }

    public static void registerRender(Item item){
        Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(McMod1.MODID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
    }


}
