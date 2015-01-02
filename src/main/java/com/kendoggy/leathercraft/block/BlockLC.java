package com.kendoggy.leathercraft.block;

import com.kendoggy.leathercraft.creativetab.CreativeTabLC;
import com.kendoggy.leathercraft.init.ModBlocks;
import com.kendoggy.leathercraft.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;
import net.minecraft.item.Item;

import java.util.Random;

/**
 * Created by kenny on 23/07/2014.
 */
public class BlockLC extends Block
{
        public BlockLC(Material material)
        {
            super(material);
            this.setCreativeTab(CreativeTabLC.LC_TAB);
        }

        public BlockLC()
        {
            this(Material.rock);
        }

        @Override
        public String getUnlocalizedName()
        {
            return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
        }

        @Override
        @SideOnly(Side.CLIENT)
        public void registerBlockIcons(IIconRegister iconRegister)
        {
            blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
        }

    protected String getUnwrappedUnlocalizedName(String unlocalizedName)
    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }


}

