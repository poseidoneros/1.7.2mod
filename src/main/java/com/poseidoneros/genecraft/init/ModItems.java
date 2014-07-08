package com.poseidoneros.genecraft.init;


import com.poseidoneros.genecraft.item.ItemGeneCraft;
import com.poseidoneros.genecraft.item.ItemSyringe;
import cpw.mods.fml.common.registry.GameRegistry;

public class ModItems
{
    public static final ItemGeneCraft syringe = new ItemSyringe();

    public static void init()
    {
        GameRegistry.registerItem(syringe, "syringe");
    }
}
