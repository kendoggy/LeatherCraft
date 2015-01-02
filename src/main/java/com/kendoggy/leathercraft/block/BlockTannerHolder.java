package com.kendoggy.leathercraft.block;


import com.kendoggy.leathercraft.init.ModBlocks;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;
import net.minecraft.util.IIcon;

import java.util.Random;

public class BlockTannerHolder extends BlockLC {

    public IIcon[] icons = new IIcon[6];

    public BlockTannerHolder()
    {
        super();
        this.setBlockName("tannerHolder");
        this.setBlockTextureName("tannerHolder");
        this.setHarvestLevel("pickaxe", 1);
        this.setHardness(3.0F);
    }

    @Override
    public Item getItemDropped(int metadata, Random random, int fortune)
    {
        return Item.getItemFromBlock(ModBlocks.tannerHolder);
    }
    @Override
    public IIcon getIcon(int side, int meta) {
        return this.icons[side];
    }

    @Override
    public void registerBlockIcons(IIconRegister reg) {
        for (int i = 0; i < 6; i ++) {
            this.icons[i] = reg.registerIcon(this.textureName + "_" + i);
        }
    }
}
