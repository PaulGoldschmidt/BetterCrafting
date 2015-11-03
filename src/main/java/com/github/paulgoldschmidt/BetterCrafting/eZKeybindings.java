//Grundcode V. 1.0 by Paul Goldschmidt
package com.github.paulgoldschmidt.BetterCrafting;

import java.io.*;
import net.minecraft.client.settings.KeyBinding;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import org.lwjgl.input.Keyboard;

/**
 * Created by Paul Goldschmidt on 01.11.2015.
 */
public class eZKeybindings {

    private static void ladeDatei(String datName);
    public static KeyBinding S1;
    public static KeyBinding S2;

    @Mod(modid = "eZShortcuts²", name = "eZ Shortcuts²", version = "0.10 Alpha")
    public static class MCMod {
        @Mod.Instance
        public static MCMod instance = new MCMod();

        {
            System.out.println("Loading Mod ");
            System.out.println("");
            System.out.println("Loading Mod Instance...");
        }

        @Mod.EventHandler
        public void preInit(FMLPreInitializationEvent e) {
            System.out.println("...done!");
            ModPreInit();
            System.out.println("");
            System.out.println("pre-Init Method phase loading...");
        }

        @Mod.EventHandler
        public void init(FMLInitializationEvent e) {
            System.out.println("...done!");
            ModInit();
            System.out.println("");
            System.out.println("init-Method phase loading...");
        }

        @Mod.EventHandler
        public void postInit(FMLPostInitializationEvent e) {
            System.out.println("...done!");
            System.out.println("postInit-Method phase loading..");
            ModPostInit();
            System.out.println("");
            System.out.println("Successful loaded Mod! The Mod DEINMOD is ready. :O");
            System.out.println("");
            System.out.println("");
        }

        //This is the free Space for your Code. The Mod PreInit phase is a phase, where FML load the Configs.
        private void ModPreInit() {
            System.out.println("PreInit void reached. Load Code...");
            //YOUR CODE
            //YOUR CODE
            System.out.println("PreInit void successful loaded. GoTo Initialization");
            //Next step: In this step loading FML your Mod. Here is the main space for the main code. :D
        }

        private void ModInit() {
            System.out.println("Init Phase loading the main Code.");
            //CODE

            S1 = new KeyBinding("S1.lang", Keyboard.KEY_F, "Keybindings²");
            ClientRegistry.registerKeyBinding(S1);
            //END OF MAIN CODE
            System.out.println("Init Phase loading successful the Code.");

        }

        private void ModPostInit() {
            System.out.println("PostInit Phase loading.");
            //YOUR CODE
            //YOUR CODE
            System.out.println("PostInit Phase successful loaded. The Mod/Mods is/are ready");
            //Congratulation! Your mod is ready!
        }
    }
}

//Main Code by Paul Goldschmidt (C)