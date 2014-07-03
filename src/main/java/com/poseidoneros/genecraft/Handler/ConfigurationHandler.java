package com.poseidoneros.genecraft.Handler;


import com.poseidoneros.genecraft.reference.Reference;
import cpw.mods.fml.client.event.ConfigChangedEvent;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.common.config.Configuration;

import java.io.File;

public class ConfigurationHandler
{
    public static Configuration modConfig;
    public static boolean test = false;

    public static void init(File configFile)
    {
        if (modConfig == null) {
            modConfig = new Configuration(configFile);
            loadConfig();
        }
    }
    private static void loadConfig()
    {
        test = modConfig.getBoolean("test", modConfig.CATEGORY_GENERAL, false, "testing configs and GUI config");
        if(modConfig.hasChanged())
        {
            modConfig.save();
        }
    }
    @SubscribeEvent
    public void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event)
    {
        if(event.modID.equalsIgnoreCase(Reference.MOD_ID))
        {
            loadConfig();
        }
    }
}
