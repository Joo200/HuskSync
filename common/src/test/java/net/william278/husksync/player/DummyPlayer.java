/*
 * This file is part of HuskSync by William278. Do not redistribute!
 *
 *  Copyright (c) William278 <will27528@gmail.com>
 *  All rights reserved.
 *
 *  This source code is provided as reference to licensed individuals that have purchased the HuskSync
 *  plugin once from any of the official sources it is provided. The availability of this code does
 *  not grant you the rights to modify, re-distribute, compile or redistribute this source code or
 *  "plugin" outside this intended purpose. This license does not cover libraries developed by third
 *  parties that are utilised in the plugin.
 */

package net.william278.husksync.player;

import de.themoep.minedown.adventure.MineDown;
import net.kyori.adventure.audience.Audience;
import net.william278.desertwell.util.Version;
import net.william278.husksync.config.Settings;
import net.william278.husksync.data.*;
import org.jetbrains.annotations.NotNull;

import java.util.*;
import java.util.concurrent.CompletableFuture;

public class DummyPlayer extends OnlineUser {

    private DummyPlayer() {
        super(UUID.fromString("00000000-0000-0000-0000-000000000000"),
                "DummyPlayer");
    }

    public static DummyPlayer create() {
        return new DummyPlayer();
    }

    @Override
    public CompletableFuture<StatusData> getStatus() {
        return CompletableFuture.supplyAsync(() -> new StatusData(20, 20, 0,
                20, 5, 5, 1,
                100, 1, 1f, "SURVIVAL", false));
    }

    @Override
    public CompletableFuture<Void> setStatus(@NotNull StatusData statusData, @NotNull Settings settings) {
        return CompletableFuture.runAsync(() -> {
            // do nothing
        });
    }

    @Override
    public CompletableFuture<ItemData> getInventory() {
        return CompletableFuture.supplyAsync(() -> new ItemData(""));
    }

    @Override
    public CompletableFuture<Void> setInventory(@NotNull ItemData itemData) {
        return CompletableFuture.runAsync(() -> {
            // do nothing
        });
    }

    @Override
    public CompletableFuture<ItemData> getEnderChest() {
        return CompletableFuture.supplyAsync(() -> new ItemData(""));
    }

    @Override
    public CompletableFuture<Void> setEnderChest(@NotNull ItemData enderChestData) {
        return CompletableFuture.runAsync(() -> {
            // do nothing
        });
    }

    @Override
    public CompletableFuture<PotionEffectData> getPotionEffects() {
        return CompletableFuture.supplyAsync(() -> new PotionEffectData(""));
    }

    @Override
    public CompletableFuture<Void> setPotionEffects(@NotNull PotionEffectData potionEffectData) {
        return CompletableFuture.runAsync(() -> {
            // do nothing
        });
    }

    @Override
    public CompletableFuture<List<AdvancementData>> getAdvancements() {
        return CompletableFuture.supplyAsync(ArrayList::new);
    }

    @Override
    public CompletableFuture<Void> setAdvancements(@NotNull List<AdvancementData> advancementData) {
        return CompletableFuture.runAsync(() -> {
            // do nothing
        });
    }

    @Override
    public CompletableFuture<StatisticsData> getStatistics() {
        return CompletableFuture.supplyAsync(() -> new StatisticsData(new HashMap<>(),
                new HashMap<>(), new HashMap<>(), new HashMap<>()));
    }

    @Override
    public CompletableFuture<Void> setStatistics(@NotNull StatisticsData statisticsData) {
        return CompletableFuture.runAsync(() -> {
            // do nothing
        });
    }

    @Override
    public CompletableFuture<LocationData> getLocation() {
        return CompletableFuture.supplyAsync(() -> new LocationData("dummy_world",
                UUID.fromString("00000000-0000-0000-0000-000000000000"),
                "NORMAL", 0, 64, 0, 90f, 180f));
    }

    @Override
    public CompletableFuture<Void> setLocation(@NotNull LocationData locationData) {
        return CompletableFuture.runAsync(() -> {
            // do nothing
        });
    }

    @Override
    public CompletableFuture<PersistentDataContainerData> getPersistentDataContainer() {
        return CompletableFuture.supplyAsync(() -> new PersistentDataContainerData(new HashMap<>()));
    }

    @Override
    public CompletableFuture<Void> setPersistentDataContainer(@NotNull PersistentDataContainerData persistentDataContainerData) {
        return CompletableFuture.runAsync(() -> {
            // do nothing
        });
    }

    @Override
    public boolean isOffline() {
        return false;
    }

    @NotNull
    @Override
    public Version getMinecraftVersion() {
        return Version.fromString("1.19-beta123456");
    }

    @Override
    @NotNull
    public Audience getAudience() {
        return Audience.empty();
    }

    @Override
    public void sendMessage(@NotNull MineDown mineDown) {
        // do nothing
    }

    @Override
    public void sendActionBar(@NotNull MineDown mineDown) {
        // do nothing
    }

    @Override
    public void sendToast(@NotNull MineDown title, @NotNull MineDown description,
                          @NotNull String iconMaterial, @NotNull String backgroundType) {
        // do nothing
    }

    @Override
    public boolean hasPermission(@NotNull String node) {
        return true;
    }

    @Override
    public CompletableFuture<Optional<ItemData>> showMenu(@NotNull ItemData itemData, boolean editable,
                                                          int minimumRows, @NotNull MineDown title) {
        // do nothing
        return CompletableFuture.completedFuture(Optional.empty());
    }


    @Override
    public boolean isDead() {
        return false;
    }

    @Override
    public boolean isLocked() {
        return false;
    }

    @Override
    public boolean isNpc() {
        return false;
    }

}
