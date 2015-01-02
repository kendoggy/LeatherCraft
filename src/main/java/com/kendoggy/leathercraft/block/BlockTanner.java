package com.kendoggy.leathercraft.block;


import com.kendoggy.leathercraft.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.world.World;

import java.util.Random;

public class BlockTanner extends BlockLC
{
    public BlockTanner()
    {
        super();
        this.setBlockName("tanner");
        this.setBlockTextureName("tanner");
        this.setHarvestLevel("axe",2);
        this.setHardness(3.0F);


    }

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune)
    {
        return Item.getItemFromBlock(ModBlocks.tanner);
    }

}


