package net.fabricmc.mechanicsplus;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import net.fabricmc.fabric.api.client.screenhandler.v1.ScreenRegistry;
import net.fabricmc.mechanicsplus.screens.*;

@Environment(EnvType.CLIENT)
public class MechanicsPlusClientMod implements ClientModInitializer {
  @Override
  public void onInitializeClient() {
    ScreenRegistry.register(MechanicsPlusMod.BREAKER_SCREEN_HANDLER, BreakerScreen::new);
    ScreenRegistry.register(MechanicsPlusMod.AUTOCRAFTER_SCREEN_HANDLER, AutoCrafterScreen::new);
    ScreenRegistry.register(MechanicsPlusMod.PLACER_SCREEN_HANDLER, PlacerScreen::new);
    ScreenRegistry.register(MechanicsPlusMod.FAST_HOPPER_SCREEN_HANDLER, FastHopperScreen::new);
    ScreenRegistry.register(MechanicsPlusMod.HUPPER_SCREEN_HANDLER, HupperScreen::new);
    ScreenRegistry.register(MechanicsPlusMod.SPLITTER_SCREEN_HANDLER, SplitterScreen::new);
  }
}
