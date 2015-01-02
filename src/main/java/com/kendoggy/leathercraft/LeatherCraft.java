package com.kendoggy.leathercraft;


import com.kendoggy.leathercraft.handler.ConfigurationHandler;
import com.kendoggy.leathercraft.init.ModBlocks;
import com.kendoggy.leathercraft.init.ModItems;
import com.kendoggy.leathercraft.init.Recipes;
import com.kendoggy.leathercraft.proxy.IProxy;
import com.kendoggy.leathercraft.reference.Reference;
import com.kendoggy.leathercraft.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID,name = Reference.MOD_NAME,version =Reference.VERSION,guiFactory = Reference.GUI_FACTORY_CLASS)

public class LeatherCraft
{
    @Mod.Instance(Reference.MOD_ID)
    public static LeatherCraft instance;

    @SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS,serverSide = Reference.SERVER_PROXY_CLASS)
    public static IProxy proxy;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());
        LogHelper.info("Pre Initialisation complete");

        ModItems.init();

        ModBlocks.init();

    }
    @Mod.EventHandler
    public void init(FMLInitializationEvent event)
    {
        Recipes.init();
        LogHelper.info("Initialization Complete!");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {
        LogHelper.info("Post Initialization Complete!");
    }
}
