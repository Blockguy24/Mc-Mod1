package com.blockguy.mc_mod1.item;

import com.blockguy.mc_mod1.McMod1;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.EnumRarity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumActionResult;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.EnumHand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.TextComponentString;
import net.minecraft.world.World;

import java.util.List;

public class ItemMcModItem1 extends ItemSword {
    public ItemMcModItem1(ToolMaterial material, String name) {
        super(material);
        setUnlocalizedName(name);
        setCreativeTab(McMod1.tabs);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(ItemStack itemStackIn, World world, EntityPlayer player, EnumHand hand) {
        if(!world.isRemote){
            player.addChatComponentMessage(new TextComponentString("Activated!"));
        }

        return super.onItemRightClick(itemStackIn, world, player, hand);
    }

    @Override
    public EnumActionResult onItemUse(ItemStack stack, EntityPlayer playerIn, World world, BlockPos pos, EnumHand hand, EnumFacing facing, float hitX, float hitY, float hitZ) {
        if(world.getBlockState(pos).getBlock() == Blocks.GRASS){
            world.setBlockState(pos, Blocks.DIAMOND_BLOCK.getDefaultState());
            return EnumActionResult.SUCCESS;
        }
        return EnumActionResult.PASS;
    }

    @Override
    public void addInformation(ItemStack stack, EntityPlayer playerIn, List<String> tooltip, boolean advanced) {
        if(advanced){
            tooltip.add("Debug Info");
        } else {
            tooltip.add("Item Tooltip");
        }

        super.addInformation(stack, playerIn, tooltip, advanced);
    }

    @Override
    public EnumRarity getRarity(ItemStack stack) {
        return EnumRarity.EPIC;
    }

    @Override
    public boolean hasEffect(ItemStack stack) {
        return true;
    }

}
