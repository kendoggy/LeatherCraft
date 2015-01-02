package com.kendoggy.leathercraft.creativetab;

import com.kendoggy.leathercraft.init.ModItems;
import com.kendoggy.leathercraft.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;


public class CreativeTabLC
{
    public static final CreativeTabs LC_TAB = new CreativeTabs(Reference.MOD_ID.toLowerCase())
    {
        @Override
        public Item getTabIconItem() {
            return ModItems.leatherCutter;
        }
    };



}
