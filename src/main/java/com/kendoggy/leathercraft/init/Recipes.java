package com.kendoggy.leathercraft.init;


import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.ShapedOreRecipe;

public class Recipes
{
    public static void init()
    {
        GameRegistry.addRecipe(new ShapedOreRecipe(new ItemStack (ModItems.leatherCutter),"s s"," s ","w w",'s',new ItemStack(Items.iron_ingot),'w',"stickWood"));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.LeatherStrip,2), new ItemStack(Items.leather));
        GameRegistry.addSmelting(new ItemStack(ModItems.drenchedLeather), new ItemStack(Items.leather), 45);
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.drenchedLeather), new ItemStack(Items.rotten_flesh),new ItemStack(Items.water_bucket),new ItemStack(Items.dye,1,15));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.LeatherStrip,3),new ItemStack(Items.leather),new ItemStack(ModItems.leatherCutter));
        GameRegistry.addShapelessRecipe(new ItemStack(ModItems.LeatherStrip,6), new ItemStack(ModItems.tannedLeather),new ItemStack(ModItems.leatherCutter));
    }
}
