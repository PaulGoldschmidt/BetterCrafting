package com.github.paulgoldschmidt.BetterCrafting.until;

import com.github.paulgoldschmidt.BetterCrafting.eZKeybindings;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.gameevent.InputEvent.KeyInputEvent;
/**
 * Created by Paul Goldschmidt on 03.11.2015.
 */
public class KeyHandler {

    @SubscribeEvent
    public void onKeyPressed(KeyInputEvent event1) {
        if(eZKeybindings.S1.isKeyDown()) {

        }
    }
}
