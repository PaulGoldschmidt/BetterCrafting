package com.github.paulgoldschmidt.BetterCrafting;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

/**
 * Created by Paul Goldschmidt on 01.11.2015.
 */
public class BetterCrafting {

    @Mod(modid = "Better Crafing", name = "Better Crafting", version = "0.001")
    public static class MCMod {

        @Mod.Instance
        public static MCMod instance = new MCMod();

        @Mod.EventHandler
        public void preInit (FMLPreInitializationEvent e)
        {
            System.out.print("preInit-Methode wird geladen...");
        }

        @Mod.EventHandler
        public  void init(FMLInitializationEvent e) {
            System.out.print("init-Methode wird geladen...");

        }

        @Mod.EventHandler
        public  void postInit(FMLPostInitializationEvent e)  {
            System.out.print("postInit-Methode wird geladen...");
        }
    }
}
