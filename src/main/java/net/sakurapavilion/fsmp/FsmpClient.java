package net.sakurapavilion.fsmp;

import net.fabricmc.api.ClientModInitializer;

public class FsmpClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        Fsmp.LOGGER.info("Hello Fabric world!");
    }
}
