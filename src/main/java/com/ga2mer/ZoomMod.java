package com.ga2mer;

import cpw.mods.fml.client.registry.KeyBindingRegistry;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import net.minecraft.client.settings.KeyBinding;
import org.lwjgl.input.Keyboard;

@Mod(modid = ZoomMod.MODID, version = ZoomMod.VERSION)
public class ZoomMod
{
    public static final String MODID = "zoommod";
    public static final String VERSION = "1.2";

    @EventHandler
    public void init(FMLInitializationEvent event)
    {
        KeyBinding[] key = {
                new KeyBinding("Key ZoomMod", Keyboard.KEY_Z),
        };
        boolean[] repeat = {
                false
        };
        KeyBindingRegistry.registerKeyBinding(new ZoomKeyHandler(key, repeat));
    }
}
