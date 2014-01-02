package com.ga2mer;

import java.util.EnumSet;

import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;
import net.minecraft.client.settings.KeyBinding;
import cpw.mods.fml.client.registry.KeyBindingRegistry.KeyHandler;
import cpw.mods.fml.common.TickType;

public class ZoomKeyHandler extends KeyHandler
{
    private EnumSet tickTypes = EnumSet.of(TickType.CLIENT);
    private float originalFOV = Minecraft.getMinecraft().gameSettings.fovSetting;

    public ZoomKeyHandler(KeyBinding[] keyBindings, boolean[] repeatings)
    {
        super(keyBindings, repeatings);
    }

    @Override
    public String getLabel()
    {
        return "ZoomModKey";
    }

    @Override
    public void keyDown(EnumSet<TickType> types, KeyBinding kb, boolean tickEnd, boolean isRepeat)
    {
            Minecraft.getMinecraft().gameSettings.smoothCamera = true;
            Minecraft.getMinecraft().gameSettings.fovSetting = -1.5F;
    }

    @Override
    public void keyUp(EnumSet<TickType> types, KeyBinding kb, boolean tickEnd)
    {
            Minecraft.getMinecraft().gameSettings.fovSetting = originalFOV;
            Minecraft.getMinecraft().gameSettings.smoothCamera = false;
    }

    @Override
    public EnumSet<TickType> ticks()
    {
        return this.tickTypes;
    }
}