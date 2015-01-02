package com.kendoggy.leathercraft.init;

import com.kendoggy.leathercraft.block.BlockLC;
import com.kendoggy.leathercraft.block.BlockTanner;
import com.kendoggy.leathercraft.block.BlockTannerHolder;
import com.kendoggy.leathercraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;


@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockLC tanner = new BlockTanner();
    public static final BlockLC tannerHolder = new BlockTannerHolder();

    public static void init()
    {
        GameRegistry.registerBlock(tanner,"tanner");
        GameRegistry.registerBlock(tannerHolder,"tannerHolder");

    }
}
