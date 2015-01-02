package com.kendoggy.leathercraft.init;


import com.kendoggy.leathercraft.item.*;
import com.kendoggy.leathercraft.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemLC leatherCutter = new ItemLeatherCutter();
    public static final ItemLC LeatherStrip = new ItemLeatherStrip();
    public static final ItemLC drenchedLeather = new ItemDrenchedLeather();
    public static final ItemLC tannedLeather = new ItemTannedLeather();

    public static void init()
    {
        GameRegistry.registerItem(leatherCutter,"leatherCutter");
        GameRegistry.registerItem(LeatherStrip, "leatherStrip");
        GameRegistry.registerItem(drenchedLeather,"drenchedLeather");
        GameRegistry.registerItem(tannedLeather,"tannedLeather");
    }
}
