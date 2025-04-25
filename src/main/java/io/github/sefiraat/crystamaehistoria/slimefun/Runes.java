package io.github.sefiraat.crystamaehistoria.slimefun;

import io.github.sefiraat.crystamaehistoria.CrystamaeHistoria;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import lombok.Getter;
import lombok.experimental.UtilityClass;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

@UtilityClass
public class Runes {

    @Getter
    private static UnplaceableBlock runeBeast;
    @Getter
    private static UnplaceableBlock runeBeginning;
    @Getter
    private static UnplaceableBlock runeMoon;
    @Getter
    private static UnplaceableBlock runeGate;
    @Getter
    private static UnplaceableBlock runeTrueEarth;
    @Getter
    private static UnplaceableBlock runeChange;
    @Getter
    private static UnplaceableBlock runeNight;
    @Getter
    private static UnplaceableBlock runeBlack;
    @Getter
    private static UnplaceableBlock runeTrueHoly;
    @Getter
    private static UnplaceableBlock runeDragon;
    @Getter
    private static UnplaceableBlock runeTrueWater;
    @Getter
    private static UnplaceableBlock runeSovereign;
    @Getter
    private static UnplaceableBlock runeSun;
    @Getter
    private static UnplaceableBlock runeDawn;
    @Getter
    private static UnplaceableBlock runeTwilight;
    @Getter
    private static UnplaceableBlock runeTrueFire;
    @Getter
    private static UnplaceableBlock runeCircle;
    @Getter
    private static UnplaceableBlock runeBlinking;
    @Getter
    private static UnplaceableBlock runeSoul;
    @Getter
    private static UnplaceableBlock runePunishment;
    @Getter
    private static UnplaceableBlock runeTrueLightning;
    @Getter
    private static UnplaceableBlock runeEightfold;
    @Getter
    private static UnplaceableBlock runeCharm;
    @Getter
    private static UnplaceableBlock runeTrueWind;
    @Getter
    private static UnplaceableBlock runeBlackSword;
    @Getter
    private static UnplaceableBlock runeBrightShield;

    public static void setup() {

        CrystamaeHistoria plugin = CrystamaeHistoria.getInstance();

        // Rune A
        runeBeast = new UnplaceableBlock(
            ItemGroups.RUNES,
            CrystaStacks.RUNE_BEAST,
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[]{
                SlimefunItems.INFERNAL_BONEMEAL.item(), SlimefunItems.NECROTIC_SKULL.item(), new ItemStack(Material.BONE),
                new ItemStack(Material.LEAD), CrystaStacks.ARCANE_SIGIL.item(), new ItemStack(Material.LEAD),
                new ItemStack(Material.BONE), SlimefunItems.NECROTIC_SKULL.item(), SlimefunItems.INFERNAL_BONEMEAL.item()
            }
        );

        // Rune B
        runeBeginning = new UnplaceableBlock(
            ItemGroups.RUNES,
            CrystaStacks.RUNE_BEGINNING,
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[]{
                CrystaStacks.GILDED_PEARL.item(), new ItemStack(Material.SHULKER_SHELL), SlimefunItems.URANIUM.item(),
                new ItemStack(Material.AZURE_BLUET), CrystaStacks.ARCANE_SIGIL.item(), new ItemStack(Material.AZURE_BLUET),
                SlimefunItems.URANIUM.item(), new ItemStack(Material.SHULKER_SHELL), CrystaStacks.GILDED_PEARL.item()
            }
        );

        // Rune C
        runeMoon = new UnplaceableBlock(
            ItemGroups.RUNES,
            CrystaStacks.RUNE_MOON,
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[]{
                CrystaStacks.ANGEL_BLOCK.item(), new ItemStack(Material.WITHER_ROSE), SlimefunItems.POWER_CRYSTAL.item(),
                new ItemStack(Material.GRAY_DYE), CrystaStacks.ARCANE_SIGIL.item(), new ItemStack(Material.GRAY_DYE),
                SlimefunItems.POWER_CRYSTAL.item(), new ItemStack(Material.WITHER_ROSE), CrystaStacks.ANGEL_BLOCK.item()
            }
        );

        // Rune D
        runeGate = new UnplaceableBlock(
            ItemGroups.RUNES,
            CrystaStacks.RUNE_GATE,
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[]{
                CrystaStacks.STAVE_BASIC.item(), new ItemStack(Material.BLAZE_ROD), SlimefunItems.GOLD_24K.item(),
                new ItemStack(Material.CRIMSON_FENCE_GATE), CrystaStacks.ARCANE_SIGIL.item(), new ItemStack(Material.CRIMSON_FENCE_GATE),
                SlimefunItems.GOLD_24K.item(), new ItemStack(Material.BLAZE_ROD), CrystaStacks.STAVE_BASIC.item()
            }
        );

        // Rune E
        runeTrueEarth = new UnplaceableBlock(
            ItemGroups.RUNES,
            CrystaStacks.RUNE_TRUE_EARTH,
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[]{
                CrystaStacks.DREADFUL_DIRT.item(), new ItemStack(Material.PODZOL), CrystaStacks.CURSED_EARTH.item(),
                new ItemStack(Material.MOSS_BLOCK), CrystaStacks.ARCANE_SIGIL.item(), new ItemStack(Material.MOSS_BLOCK),
                CrystaStacks.CURSED_EARTH.item(), new ItemStack(Material.PODZOL), CrystaStacks.DREADFUL_DIRT.item()
            }
        );

        // Rune F
        runeChange = new UnplaceableBlock(
            ItemGroups.RUNES,
            CrystaStacks.RUNE_CHANGE,
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[]{
                CrystaStacks.ENDER_INHIBITOR_BASIC.item(), new ItemStack(Material.LEVER), SlimefunItems.PROGRAMMABLE_ANDROID.item(),
                new ItemStack(Material.POLISHED_BLACKSTONE_BUTTON), CrystaStacks.ARCANE_SIGIL.item(), new ItemStack(Material.POLISHED_BLACKSTONE_BUTTON),
                SlimefunItems.PROGRAMMABLE_ANDROID.item(), new ItemStack(Material.LEVER), CrystaStacks.ENDER_INHIBITOR_BASIC.item()
            }
        );

        // Rune G
        runeNight = new UnplaceableBlock(
            ItemGroups.RUNES,
            CrystaStacks.RUNE_NIGHT,
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[]{
                CrystaStacks.DISPLACED_VOID.item(), new ItemStack(Material.CLOCK), SlimefunItems.NEPTUNIUM.item(),
                new ItemStack(Material.WEEPING_VINES), CrystaStacks.ARCANE_SIGIL.item(), new ItemStack(Material.WEEPING_VINES),
                SlimefunItems.NEPTUNIUM.item(), new ItemStack(Material.CLOCK), CrystaStacks.DISPLACED_VOID.item()
            }
        );

        // Rune H
        runeBlack = new UnplaceableBlock(
            ItemGroups.RUNES,
            CrystaStacks.RUNE_BLACK,
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[]{
                CrystaStacks.PAINT_BRUSH_BLACK_100.item(), new ItemStack(Material.BLACK_CANDLE), SlimefunItems.NECROTIC_SKULL.item(),
                new ItemStack(Material.BLACK_STAINED_GLASS_PANE), CrystaStacks.ARCANE_SIGIL.item(), new ItemStack(Material.BLACK_STAINED_GLASS_PANE),
                SlimefunItems.NECROTIC_SKULL.item(), new ItemStack(Material.BLACK_CANDLE), CrystaStacks.PAINT_BRUSH_BLACK_100.item()
            }
        );

        // Rune I
        runeTrueHoly = new UnplaceableBlock(
            ItemGroups.RUNES,
            CrystaStacks.RUNE_TRUE_HOLY,
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[]{
                CrystaStacks.SOUL_STAND.item(), new ItemStack(Material.WHITE_TULIP), CrystaStacks.BODY_STAND.item(),
                CrystaStacks.MIND_STAND.item(), CrystaStacks.ARCANE_SIGIL.item(), CrystaStacks.MIND_STAND.item(),
                CrystaStacks.BODY_STAND.item(), new ItemStack(Material.WHITE_TULIP), CrystaStacks.SOUL_STAND.item()
            }
        );

        // Rune J
        runeDragon = new UnplaceableBlock(
            ItemGroups.RUNES,
            CrystaStacks.RUNE_DRAGON,
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[]{
                CrystaStacks.AMALGAMATE_DUST_RARE.item(), new ItemStack(Material.DRAGON_HEAD), new ItemStack(Material.DRAGON_EGG),
                new ItemStack(Material.DRAGON_BREATH), CrystaStacks.ARCANE_SIGIL.item(), new ItemStack(Material.DRAGON_BREATH),
                new ItemStack(Material.DRAGON_EGG), new ItemStack(Material.DRAGON_HEAD), CrystaStacks.AMALGAMATE_DUST_RARE.item()
            }
        );

        // Rune K
        runeTrueWater = new UnplaceableBlock(
            ItemGroups.RUNES,
            CrystaStacks.RUNE_TRUE_WATER,
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[]{
                CrystaStacks.EXALTED_SEA_BREEZE.item(), new ItemStack(Material.WATER_BUCKET), SlimefunItems.WATER_RUNE.item(),
                new ItemStack(Material.NAUTILUS_SHELL), CrystaStacks.ARCANE_SIGIL.item(), new ItemStack(Material.NAUTILUS_SHELL),
                SlimefunItems.WATER_RUNE.item(), new ItemStack(Material.WATER_BUCKET), CrystaStacks.EXALTED_SEA_BREEZE.item()
            }
        );

        // Rune L
        runeSovereign = new UnplaceableBlock(
            ItemGroups.RUNES,
            CrystaStacks.RUNE_SOVEREIGN,
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[]{
                CrystaStacks.CONNECTING_COMPASS.item(), new ItemStack(Material.BELL), SlimefunItems.CARBONADO.item(),
                new ItemStack(Material.OBSIDIAN), CrystaStacks.ARCANE_SIGIL.item(), new ItemStack(Material.OBSIDIAN),
                SlimefunItems.CARBONADO.item(), new ItemStack(Material.BELL), CrystaStacks.CONNECTING_COMPASS.item()
            }
        );

        // Rune M
        runeSun = new UnplaceableBlock(
            ItemGroups.RUNES,
            CrystaStacks.RUNE_SUN,
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[]{
                CrystaStacks.EXALTED_SUN.item(), new ItemStack(Material.SHROOMLIGHT), SlimefunItems.BLISTERING_INGOT_3.item(),
                new ItemStack(Material.GLOWSTONE), CrystaStacks.ARCANE_SIGIL.item(), new ItemStack(Material.GLOWSTONE),
                SlimefunItems.BLISTERING_INGOT_3.item(), new ItemStack(Material.SHROOMLIGHT), CrystaStacks.EXALTED_SUN.item()
            }
        );

        // Rune N
        runeDawn = new UnplaceableBlock(
            ItemGroups.RUNES,
            CrystaStacks.RUNE_DAWN,
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[]{
                CrystaStacks.EXALTED_DAWN.item(), new ItemStack(Material.DEAD_FIRE_CORAL_BLOCK), SlimefunItems.APPLE_JUICE.item(),
                new ItemStack(Material.ORANGE_TULIP), CrystaStacks.ARCANE_SIGIL.item(), new ItemStack(Material.ORANGE_TULIP),
                SlimefunItems.APPLE_JUICE.item(), new ItemStack(Material.DEAD_FIRE_CORAL_BLOCK), CrystaStacks.EXALTED_DAWN.item()
            }
        );

        // Rune O
        runeTwilight = new UnplaceableBlock(
            ItemGroups.RUNES,
            CrystaStacks.RUNE_TWILIGHT,
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[]{
                CrystaStacks.EXALTED_DUSK.item(), new ItemStack(Material.FIRE_CORAL_BLOCK), SlimefunItems.PUMPKIN_JUICE.item(),
                new ItemStack(Material.CORNFLOWER), CrystaStacks.ARCANE_SIGIL.item(), new ItemStack(Material.CORNFLOWER),
                SlimefunItems.PUMPKIN_JUICE.item(), new ItemStack(Material.FIRE_CORAL_BLOCK), CrystaStacks.EXALTED_DUSK.item()
            }
        );

        // Rune P
        runeTrueFire = new UnplaceableBlock(
            ItemGroups.RUNES,
            CrystaStacks.RUNE_TRUE_FIRE,
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[]{
                CrystaStacks.EVISCERATING_PLATE.item(), new ItemStack(Material.SOUL_CAMPFIRE), SlimefunItems.FIRE_RUNE.item(),
                new ItemStack(Material.FIRE_CHARGE), CrystaStacks.ARCANE_SIGIL.item(), new ItemStack(Material.FIRE_CHARGE),
                SlimefunItems.FIRE_RUNE.item(), new ItemStack(Material.SOUL_CAMPFIRE), CrystaStacks.EVISCERATING_PLATE.item()
            }
        );

        // Rune Q
        runeCircle = new UnplaceableBlock(
            ItemGroups.RUNES,
            CrystaStacks.RUNE_CIRCLE,
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[]{
                CrystaStacks.EXALTED_FERTILITY_PHARO.item(), new ItemStack(Material.OBSERVER), SlimefunItems.ELECTRIC_INGOT_FACTORY_3.item(),
                new ItemStack(Material.TARGET), CrystaStacks.ARCANE_SIGIL.item(), new ItemStack(Material.TARGET),
                SlimefunItems.ELECTRIC_INGOT_FACTORY_3.item(), new ItemStack(Material.OBSERVER), CrystaStacks.EXALTED_FERTILITY_PHARO.item()
            }
        );

        // Rune R
        runeBlinking = new UnplaceableBlock(
            ItemGroups.RUNES,
            CrystaStacks.RUNE_BLINKING,
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[]{
                CrystaStacks.WAYSTONE.item(), new ItemStack(Material.ENDER_EYE), SlimefunItems.GPS_EMERGENCY_TRANSMITTER.item(),
                new ItemStack(Material.ENDER_PEARL), CrystaStacks.ARCANE_SIGIL.item(), new ItemStack(Material.ENDER_PEARL),
                SlimefunItems.GPS_EMERGENCY_TRANSMITTER.item(), new ItemStack(Material.ENDER_EYE), CrystaStacks.WAYSTONE.item()
            }
        );

        // Rune S
        runeSoul = new UnplaceableBlock(
            ItemGroups.RUNES,
            CrystaStacks.RUNE_SOUL,
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[]{
                CrystaStacks.SOUL_STAND.item(), new ItemStack(Material.ELYTRA), SlimefunItems.SOULBOUND_RUNE.item(),
                new ItemStack(Material.CAKE), CrystaStacks.ARCANE_SIGIL.item(), new ItemStack(Material.CAKE),
                SlimefunItems.SOULBOUND_RUNE.item(), new ItemStack(Material.ELYTRA), CrystaStacks.SOUL_STAND.item()
            }
        );

        // Rune T
        runePunishment = new UnplaceableBlock(
            ItemGroups.RUNES,
            CrystaStacks.RUNE_PUNISHMENT,
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[]{
                CrystaStacks.MOB_CANDLE_DIM.item(), new ItemStack(Material.LEAD), SlimefunItems.MONSTER_JERKY.item(),
                new ItemStack(Material.SOUL_LANTERN), CrystaStacks.ARCANE_SIGIL.item(), new ItemStack(Material.SOUL_LANTERN),
                SlimefunItems.MONSTER_JERKY.item(), new ItemStack(Material.LEAD), CrystaStacks.MOB_CANDLE_DIM.item()
            }
        );

        // Rune U
        runeTrueLightning = new UnplaceableBlock(
            ItemGroups.RUNES,
            CrystaStacks.RUNE_TRUE_LIGHTNING,
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[]{
                CrystaStacks.LUMINESCENCE_SCOOP.item(), new ItemStack(Material.LIGHTNING_ROD), SlimefunItems.LIGHTNING_RUNE.item(),
                new ItemStack(Material.CHAIN), CrystaStacks.ARCANE_SIGIL.item(), new ItemStack(Material.CHAIN),
                SlimefunItems.LIGHTNING_RUNE.item(), new ItemStack(Material.LIGHTNING_ROD), CrystaStacks.LUMINESCENCE_SCOOP.item()
            }
        );

        // Rune V
        runeEightfold = new UnplaceableBlock(
            ItemGroups.RUNES,
            CrystaStacks.RUNE_EIGHTFOLD,
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[]{
                CrystaStacks.EPHEMERAL_WORKBENCH.item(), new ItemStack(Material.SPONGE), SlimefunItems.ENCHANTMENT_RUNE.item(),
                new ItemStack(Material.BASALT), CrystaStacks.ARCANE_SIGIL.item(), new ItemStack(Material.BASALT),
                SlimefunItems.ENCHANTMENT_RUNE.item(), new ItemStack(Material.SPONGE), CrystaStacks.EPHEMERAL_WORKBENCH.item()
            }
        );

        // Rune W
        runeCharm = new UnplaceableBlock(
            ItemGroups.RUNES,
            CrystaStacks.RUNE_CHARM,
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[]{
                CrystaStacks.EXALTED_BEACON.item(), new ItemStack(Material.RED_CANDLE), SlimefunItems.RAINBOW_RUNE.item(),
                new ItemStack(Material.POPPY), CrystaStacks.ARCANE_SIGIL.item(), new ItemStack(Material.POPPY),
                SlimefunItems.RAINBOW_RUNE.item(), new ItemStack(Material.RED_CANDLE), CrystaStacks.EXALTED_BEACON.item()
            }
        );

        // Rune X
        runeTrueWind = new UnplaceableBlock(
            ItemGroups.RUNES,
            CrystaStacks.RUNE_TRUE_WIND,
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[]{
                CrystaStacks.SPIRITUAL_SILKEN.item(), new ItemStack(Material.END_ROD), SlimefunItems.AIR_RUNE.item(),
                new ItemStack(Material.FEATHER), CrystaStacks.ARCANE_SIGIL.item(), new ItemStack(Material.FEATHER),
                SlimefunItems.AIR_RUNE.item(), new ItemStack(Material.END_ROD), CrystaStacks.SPIRITUAL_SILKEN.item()
            }
        );

        // Rune Y
        runeBlackSword = new UnplaceableBlock(
            ItemGroups.RUNES,
            CrystaStacks.RUNE_BLACK_SWORD,
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[]{
                CrystaStacks.INERT_PLATE.item(), new ItemStack(Material.NETHERITE_SWORD), SlimefunItems.SWORD_OF_BEHEADING.item(),
                new ItemStack(Material.GOLDEN_SWORD), CrystaStacks.ARCANE_SIGIL.item(), new ItemStack(Material.GOLDEN_SWORD),
                SlimefunItems.SWORD_OF_BEHEADING.item(), new ItemStack(Material.NETHERITE_SWORD), CrystaStacks.INERT_PLATE.item()
            }
        );

        // Rune Z
        runeBrightShield = new UnplaceableBlock(
            ItemGroups.RUNES,
            CrystaStacks.RUNE_BRIGHT_SHIELD,
            RecipeType.ANCIENT_ALTAR,
            new ItemStack[]{
                CrystaStacks.INERT_PLATE.item(), new ItemStack(Material.TURTLE_HELMET), SlimefunItems.SOLAR_HELMET.item(),
                new ItemStack(Material.SHIELD), CrystaStacks.ARCANE_SIGIL.item(), new ItemStack(Material.SHIELD),
                SlimefunItems.SOLAR_HELMET.item(), new ItemStack(Material.TURTLE_HELMET), CrystaStacks.INERT_PLATE.item()
            }
        );

        // Slimefun Registry
        runeBeast.register(plugin);
        runeBeginning.register(plugin);
        runeMoon.register(plugin);
        runeGate.register(plugin);
        runeTrueEarth.register(plugin);
        runeChange.register(plugin);
        runeNight.register(plugin);
        runeBlack.register(plugin);
        runeTrueHoly.register(plugin);
        runeDragon.register(plugin);
        runeTrueWater.register(plugin);
        runeSovereign.register(plugin);
        runeSun.register(plugin);
        runeDawn.register(plugin);
        runeTwilight.register(plugin);
        runeTrueFire.register(plugin);
        runeCircle.register(plugin);
        runeBlinking.register(plugin);
        runeSoul.register(plugin);
        runePunishment.register(plugin);
        runeTrueLightning.register(plugin);
        runeEightfold.register(plugin);
        runeCharm.register(plugin);
        runeTrueWind.register(plugin);
        runeBlackSword.register(plugin);
        runeBrightShield.register(plugin);

    }

}
