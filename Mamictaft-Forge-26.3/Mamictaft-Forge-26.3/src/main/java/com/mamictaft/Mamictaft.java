package com.mamictaft;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

@Mod(Mamictaft.MODID)
public class Mamictaft {
    public static final String MODID = "mamictaft";

    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MODID);
    public static final DeferredRegister<CreativeModeTab> TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MODID);

    // ---- Bloklar ----
    public static final RegistryObject<Block> ADALIUM_ORE = BLOCKS.register("adalium_ore", id ->
        new Block(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, id))
            .strength(3.0f, 3.0f).requiresCorrectToolForDrops().lightLevel(s -> 4).sound(SoundType.STONE)));
    public static final RegistryObject<Block> ATOM_BOMB = BLOCKS.register("atom_bomb", id ->
        new AtomBombBlock(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, id))
            .strength(1.0f).lightLevel(s -> 2).sound(SoundType.GRASS)));
    public static final RegistryObject<Block> BITING_PLANT = BLOCKS.register("biting_plant", id ->
        new Block(BlockBehaviour.Properties.of().setId(ResourceKey.create(Registries.BLOCK, id))
            .noCollission().noOcclusion().instabreak().sound(SoundType.GRASS)));

    // ---- Blok eşyaları ----
    public static final RegistryObject<Item> ADALIUM_ORE_ITEM = ITEMS.register("adalium_ore", id ->
        new BlockItem(ADALIUM_ORE.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, id)).useBlockDescriptionPrefix()));
    public static final RegistryObject<Item> ATOM_BOMB_ITEM = ITEMS.register("atom_bomb", id ->
        new BlockItem(ATOM_BOMB.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, id)).useBlockDescriptionPrefix()));
    public static final RegistryObject<Item> BITING_PLANT_ITEM = ITEMS.register("biting_plant", id ->
        new BlockItem(BITING_PLANT.get(), new Item.Properties().setId(ResourceKey.create(Registries.ITEM, id)).useBlockDescriptionPrefix()));

    // ---- Eşyalar ----
    public static final RegistryObject<Item> ADALIUM = ITEMS.register("adalium", id -> new Item(new Item.Properties().stacksTo(64).setId(ResourceKey.create(Registries.ITEM, id))));
    public static final RegistryObject<Item> ADALIUM_CLUSTER = ITEMS.register("adalium_cluster", id -> new Item(new Item.Properties().stacksTo(64).setId(ResourceKey.create(Registries.ITEM, id))));
    public static final RegistryObject<Item> ADALIUM_CORE = ITEMS.register("adalium_core", id -> new Item(new Item.Properties().stacksTo(64).setId(ResourceKey.create(Registries.ITEM, id))));
    public static final RegistryObject<Item> BALTIC_BUCKET = ITEMS.register("baltic_bucket", id -> new Item(new Item.Properties().stacksTo(1).setId(ResourceKey.create(Registries.ITEM, id))));
    public static final RegistryObject<Item> BITING_PLANT_SEED = ITEMS.register("biting_plant_seed", id -> new Item(new Item.Properties().stacksTo(64).setId(ResourceKey.create(Registries.ITEM, id))));
    public static final RegistryObject<Item> BUBBLE = ITEMS.register("bubble", id -> new Item(new Item.Properties().stacksTo(64).setId(ResourceKey.create(Registries.ITEM, id))));
    public static final RegistryObject<Item> CHAIN_ITEM = ITEMS.register("chain_item", id -> new Item(new Item.Properties().stacksTo(64).setId(ResourceKey.create(Registries.ITEM, id))));
    public static final RegistryObject<Item> CHINESE_TEMPLE = ITEMS.register("chinese_temple", id -> new Item(new Item.Properties().stacksTo(64).setId(ResourceKey.create(Registries.ITEM, id))));
    public static final RegistryObject<Item> WIND = ITEMS.register("wind", id -> new Item(new Item.Properties().stacksTo(1).setId(ResourceKey.create(Registries.ITEM, id))));
    public static final RegistryObject<Item> THROWING_DISC_COPPER = ITEMS.register("throwing_disc_copper", id -> new Item(new Item.Properties().durability(190).setId(ResourceKey.create(Registries.ITEM, id))));
    public static final RegistryObject<Item> THROWING_DISC_IRON = ITEMS.register("throwing_disc_iron", id -> new Item(new Item.Properties().durability(250).setId(ResourceKey.create(Registries.ITEM, id))));
    public static final RegistryObject<Item> THROWING_DISC_GOLD = ITEMS.register("throwing_disc_gold", id -> new Item(new Item.Properties().durability(32).setId(ResourceKey.create(Registries.ITEM, id))));
    public static final RegistryObject<Item> THROWING_DISC_DIAMOND = ITEMS.register("throwing_disc_diamond", id -> new Item(new Item.Properties().durability(1561).setId(ResourceKey.create(Registries.ITEM, id))));
    public static final RegistryObject<Item> THROWING_DISC_NETHERITE = ITEMS.register("throwing_disc_netherite", id -> new Item(new Item.Properties().durability(2031).setId(ResourceKey.create(Registries.ITEM, id))));

    public static final RegistryObject<CreativeModeTab> TAB = TABS.register("tab", () ->
        CreativeModeTab.builder()
            .title(Component.translatable("itemGroup.mamictaft.tab"))
            .icon(() -> ADALIUM.get().getDefaultInstance())
            .displayItems((params, out) -> ITEMS.getEntries().forEach(e -> out.accept(e.get())))
            .build());

    public Mamictaft(FMLJavaModLoadingContext context) {
        var bus = context.getModBusGroup();
        BLOCKS.register(bus);
        ITEMS.register(bus);
        TABS.register(bus);
    }
}
