package dev.tildejustin.example;

import net.fabricmc.loader.api.entrypoint.PreLaunchEntrypoint;
import org.spongepowered.asm.mixin.Mixins;

public class Main implements PreLaunchEntrypoint {
    @Override
    public void onPreLaunch() {
        System.out.println("mixin config added");
        Mixins.addConfiguration("optifabric-mixin.mixins.json");
    }
}
