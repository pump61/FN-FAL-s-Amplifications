package ne.fnfal113.fnamplifications.items;

import io.github.thebusybiscuit.slimefun4.api.MinecraftVersion;
import io.github.thebusybiscuit.slimefun4.implementation.Slimefun;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.api.items.groups.NestedItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.groups.SubItemGroup;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineTier;
import io.github.thebusybiscuit.slimefun4.core.attributes.MachineType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerHead;
import io.github.thebusybiscuit.slimefun4.libraries.dough.skins.PlayerSkin;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;

import dev.j3fftw.extrautils.utils.LoreBuilderDynamic;

import ne.fnfal113.fnamplifications.FNAmplifications;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemFlag;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

public class FNAmpItems {

    private static final ItemStack STICK = new ItemStack(Material.STICK);

    private static final ItemStack ARMOR = Slimefun.getMinecraftVersion().isAtLeast(MinecraftVersion.MINECRAFT_1_16) ?
            new ItemStack(Material.NETHERITE_CHESTPLATE) : new ItemStack(Material.DIAMOND_CHESTPLATE);

    static{
        ItemMeta meta = STICK.getItemMeta();
        if(meta != null) {
            meta.addEnchant(Enchantment.BINDING_CURSE, 1, false);
            meta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            STICK.setItemMeta(meta);
        }

        ItemMeta armorMeta = ARMOR.getItemMeta();
        if(armorMeta != null) {
            armorMeta.addEnchant(Enchantment.BINDING_CURSE, 1, false);
            armorMeta.addItemFlags(ItemFlag.HIDE_ENCHANTS);
            ARMOR.setItemMeta(armorMeta);
        }

    }

    // start of Item Groups
    public static final NestedItemGroup FN_MAIN_GROUP = new NestedItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "FN_ITEMS"),
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "115b670a704ba080a730acf246da64c413901644847edd671c3da9a97441ddc5")),
            "&e&lFN &b&lTecno&c&llogia"));

    public static final SubItemGroup POWER_GENERATORS = new SubItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "POWER_GENERATORS"),
            FN_MAIN_GROUP,
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "ecb316f7a227a8c59d58ae0dd6768fe4fa546d55b9cfdd56cfe40b6586d81c24")),
                    "&eFN Evolucao de Energia"));

    public static final SubItemGroup MATERIAL_GENERATORS = new SubItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "MATERIAL_GENERATORS"),
            FN_MAIN_GROUP,
            new CustomItemStack(Material.EMERALD_BLOCK,
                    "&eFN Geradores de Materiais"));

    public static final SubItemGroup MATERIAL_GENERATORS_UPGRADES = new SubItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "MATERIAL_GENERATORS_UPGRADES"),
            FN_MAIN_GROUP,
            new CustomItemStack(Material.GOLD_BLOCK,
                    "&eFN Modulos de Upgrade dos Geradores"));

    public static final SubItemGroup SOLAR_GENERATORS = new SubItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "SOLAR_GENERATORS"),
            FN_MAIN_GROUP,
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "e7f4c00356d1addb85b45ba5352992d3ecc0c9d11feb9041482f8531fd27d014")),
            "&eFN Geradores Solares"));

    public static final SubItemGroup MACHINES = new SubItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "MACHINERY"),
            FN_MAIN_GROUP,
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "4a7d54ca45a398c364cebbffb5390ce5e0345e0c7bc5e863acabf57d1342c4bd")),
            "&eFN Maquinas"));

    public static final SubItemGroup ITEMS = new SubItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "MACHINERY_ITEMS"),
            FN_MAIN_GROUP,
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "8245a1c3e8d7c3d59d05e3634b04af4cbf8d11b70e2a40e2e6364386db49e737")),
            "&eFN Pecas"));

    public static final SubItemGroup MAGICAL_ITEMS = new SubItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "MAGICAL_ITEMS"),
            FN_MAIN_GROUP,
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "72114a80357463fe2f59e397aab9fc66d482a65d524f8870d21c724c18ecf757")),
                    "&eFN Itens Magicos"));

    public static final SubItemGroup MULTIBLOCK = new SubItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "MULTIBLOCK"),
            FN_MAIN_GROUP,
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "550c3306bb11522fec380ea248eb6a5b180f4a7ab8843d635d14d4a778d6351")),
            "&eFN Maquinas Multibloco"));

    public static final SubItemGroup METAL_SCRAP_RECIPES = new SubItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "METAL_SCRAP_RECIPES"),
            FN_MAIN_GROUP,
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "3ff0bee591e5f0000ef16f966b949adcb5c2f409a14ccfc5b91222fd925045db")),
            "&eReceitas de Sucata Metalica"));

    public static final SubItemGroup MYSTERY_STICKS = new SubItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "MYSTERY_STICKS"),
            FN_MAIN_GROUP,
            new CustomItemStack(STICK,
                    "&eFN Bastoes Misteriosos PVP/PVE"));

    public static final SubItemGroup FN_GEARS = new SubItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "FN_GEARS"),
            FN_MAIN_GROUP,
            new CustomItemStack(ARMOR,
                    "&eFN Armaduras"));

    public static final SubItemGroup FN_STAFFS = new SubItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "FN_STAFFS"),
            FN_MAIN_GROUP,
            new CustomItemStack(Material.BLAZE_ROD,
                    "&eFN Cajados"));

    public static final SubItemGroup FN_MISC = new SubItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "FN_MISC"),
            FN_MAIN_GROUP,
            new CustomItemStack(Material.CHEST,
                    "&eFN Diversos"));

    public static final SubItemGroup FN_QUIVERS = new SubItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "FN_QUIVERS"),
            FN_MAIN_GROUP,
            new CustomItemStack(Material.LEATHER,
                    "&eFN Aljavas"));

    public static final SubItemGroup FN_GEMS = new SubItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "FN_GEMS"),
            FN_MAIN_GROUP,
            new CustomItemStack(Material.EMERALD,
                    "&eFN Gemas"));

    public static final ItemGroup FN_AMPLIFICATIONS = new ItemGroup(
            new NamespacedKey(FNAmplifications.getInstance(), "FN_AMPLIFICATIONS"),
            new CustomItemStack(PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "115b670a704ba080a730acf246da64c413901644847edd671c3da9a97441ddc5")),
            "&e&lFN &b&lTecno&c&llogia"));

    // start of FN itemstacks
    public static final SlimefunItemStack FN_XPANSION_POWER_R1 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R1",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "33165e254de7863459343543f933481f0dcf8d4730a23433b9a7ff0d3ff79c5a")),
            "&d&lFN Gerador R1",
            "&9Funciona durante a noite",
            "&9Apos instalado, clique direito neste gerador",
            "&9para ver informacoes de energia",
            ""
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R2 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R2",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "5b78e55e3ea6b3682bd7cead43eb1c91b2527a81aa2894f095801f6ee47a3")),
            "&d&lFN Gerador R2",
            "&9Funciona durante a noite",
            "&9Apos instalado, clique direito neste gerador",
            "&9para ver informacoes de energia",
            ""
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R3 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R3",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "45ff60d863d1cf76742f275e2ac5749dd0a978a231d3c51e816132c75aef608a")),
            "&d&lFN Gerador R3",
            "&9Funciona durante a noite",
            "&9Apos instalado, clique direito neste gerador",
            "&9para ver informacoes de energia",
            ""
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R4 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R4",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "efc05af0e88c6fb10b4c8c8b81b7aa658e64649724cb73bb9bb0f25f28bd")),
            "&d&lFN Gerador R4",
            "&9Funciona durante a noite",
            "&9Apos instalado, clique direito neste gerador",
            "&9para ver informacoes de energia",
            ""
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R5 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R5",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "8f14f3179b86f69b3efa7472dacaeb2339f6290d2d817362793348abd98e021")),
            "&d&lFN Gerador R5",
            "&9Funciona durante a noite",
            "&9Apos instalado, clique direito neste gerador",
            "&9para ver informacoes de energia",
            ""
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R6 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R6",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "1d5a09884cb83ef5c908dddd385f246fefdee221712c010177f54376da238fdd")),
            "&d&lFN Gerador R6",
            "&9Funciona durante a noite",
            "&9Apos instalado, clique direito neste gerador",
            "&9para ver informacoes de energia",
            ""
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R7 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R7",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "f7e541dfb4ba1f7dc28b548e347abbdc987ebe0e61c49fa87111ef1b2dcb2218")),
            "&d&lFN Gerador R7",
            "&9Funciona durante a noite",
            "&9Apos instalado, clique direito neste gerador",
            "&9para ver informacoes de energia",
            ""
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R8 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R8",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "de31efefdd9551af8a4349d3d21e5ec8f37e53c801eb25b14279d6a89fe0c01e")),
            "&d&lFN Gerador R8",
            "&9Funciona durante a noite",
            "&9Apos instalado, clique direito neste gerador",
            "&9para ver informacoes de energia",
            ""
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R9 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R9",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "6db32b15d7f32704ed626fa52d06fb2b4071d336fdbfe61e6e41c669d6e37f47")),
            "&d&lFN Gerador R9",
            "&9Funciona durante a noite",
            "&9Apos instalado, clique direito neste gerador",
            "&9para ver informacoes de energia",
            ""
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R10 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R10",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "7b7c9b6a23f21cca2b362b85b36dece3d8389e363014defe5b92ff6ee64f1ae")),
            "&d&lFN Gerador R10",
            "&9Funciona durante a noite",
            "&9Apos instalado, clique direito neste gerador",
            "&9para ver informacoes de energia",
            ""
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R11 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R11",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "7f9f356f5fe7d1bc92cddfaeba3ee773ac9df1cc4d1c2f8fe5f47013032c551d")),
            "&d&lFN Gerador R11",
            "&9Funciona durante a noite",
            "&9Apos instalado, clique direito neste gerador",
            "&9para ver informacoes de energia",
            ""
    );

    public static final SlimefunItemStack FN_XPANSION_POWER_R12 = new SlimefunItemStack(
            "FN_POWER_XPANSION_POWER_R12",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode(
                    "3464874df452c1d717eddd0fb3b848202ad15571245af6fade2ecf514f3c80bb")),
            "&d&lFN Gerador R12",
            "&9Funciona durante a noite",
            "&9Apos instalado, clique direito neste gerador",
            "&9para ver informacoes de energia",
            ""
    );

    public static final SlimefunItemStack FMG_GENERATOR_MULTIBLOCK = new SlimefunItemStack(
            "FMG_GENERATOR_MULTIBLOCK",
            Material.BEDROCK,
            "&9Gerador de Materiais",
            "",
            "&dEm cima de qualquer gerador de materiais,",
            "&dcoloque um bau desta forma.",
            "&aOs produtos gerados serao colocados no bau."
    );

    public static final SlimefunItemStack FMG_GENERATOR_CLAY_BROKEN = new SlimefunItemStack(
            "FMG_GENERATOR_CLAY_BROKEN",
            Material.CLAY,
            "&3FN Gerador de Argila &8(Danificado)",
            "&8Necessita reparo",
            "",
            "&d&oFN Gerador de Materiais"
    );

    public static SlimefunItemStack FMG_GENERATOR_CLAY = new SlimefunItemStack(
            "FMG_GENERATOR_CLAY",
            Material.CLAY,
            "&3FN Gerador de Argila",
            "&6Gera Argila automaticamente a uma taxa fixa",
            "&6Clique direito para ver o progresso",
            "",
            "&6Ticks necessarios: " + "&6tick",
            "",
            "&cAviso:",
            "&fQuebrar a maquina diretamente ira danifica-la",
            "&fe voce recebera a versao danificada!",
            "",
            "&d&oFN Gerador de Materiais"
    );

    public static final SlimefunItemStack FMG_GENERATOR_TERRACOTTA_BROKEN = new SlimefunItemStack(
            "FMG_GENERATOR_TERRACOTTA_BROKEN",
            Material.TERRACOTTA,
            "&4FN Gerador de Terracota &8(Danificado)",
            "&8Necessita reparo",
            "",
            "&d&oFN Gerador de Materiais"
    );

    public static final SlimefunItemStack FMG_GENERATOR_TERRACOTTA = new SlimefunItemStack(
            "FMG_GENERATOR_TERRACOTTA",
            Material.TERRACOTTA,
            "&4FN Gerador de Terracota",
            "&6Gera Terracota automaticamente a uma taxa fixa",
            "&6Clique direito para ver o progresso",
            "",
            "&6Ticks necessarios: " + "&6tick",
            "",
            "&cAviso:",
            "&fQuebrar a maquina diretamente ira danifica-la",
            "&fe voce recebera a versao danificada!",
            "",
            "&d&oFN Gerador de Materiais"
    );

    public static final SlimefunItemStack FMG_GENERATOR_BONE_BROKEN = new SlimefunItemStack(
            "FMG_GENERATOR_BONE_BROKEN",
            Material.BONE_BLOCK,
            "&fFN Gerador de Osso &8(Danificado)",
            "&8Necessita reparo",
            "",
            "&d&oFN Gerador de Materiais"
    );

    public static final SlimefunItemStack FMG_GENERATOR_BONE = new SlimefunItemStack(
            "FMG_GENERATOR_BONE",
            Material.BONE_BLOCK,
            "&fFN Gerador de Osso",
            "&6Gera Osso automaticamente a uma taxa fixa",
            "&6Clique direito para ver o progresso",
            "",
            "&6Ticks necessarios: " + "&6tick",
            "",
            "&cAviso:",
            "&fQuebrar a maquina diretamente ira danifica-la",
            "&fe voce recebera a versao danificada!",
            "",
            "&d&oFN Gerador de Materiais"
    );

    public static final SlimefunItemStack FMG_GENERATOR_DIAMOND_BROKEN = new SlimefunItemStack(
            "FMG_GENERATOR_DIAMOND_BROKEN",
            Material.DIAMOND_BLOCK,
            "&bFN Gerador de Diamante &8(Danificado)",
            "&8Necessita reparo",
            "",
            "&d&oFN Gerador de Materiais"
    );

    public static final SlimefunItemStack FMG_GENERATOR_DIAMOND = new SlimefunItemStack(
            "FMG_GENERATOR_DIAMOND",
            Material.DIAMOND_BLOCK,
            "&bFN Gerador de Diamante",
            "&6Gera Diamante automaticamente a uma taxa fixa",
            "&6Clique direito para ver o progresso",
            "",
            "&6Ticks necessarios: " + "&6tick",
            "",
            "&cAviso:",
            "&fQuebrar a maquina diretamente ira danifica-la",
            "&fe voce recebera a versao danificada!",
            "",
            "&d&oFN Gerador de Materiais"
    );

    public static final SlimefunItemStack FMG_GENERATOR_EMERALD_BROKEN = new SlimefunItemStack(
            "FMG_GENERATOR_EMERALD_BROKEN",
            Material.EMERALD_BLOCK,
            "&aFN Gerador de Esmeralda &8(Danificado)",
            "&8Necessita reparo",
            "",
            "&d&oFN Gerador de Materiais"
    );

    public static final SlimefunItemStack FMG_GENERATOR_EMERALD = new SlimefunItemStack(
            "FMG_GENERATOR_EMERALD",
            Material.EMERALD_BLOCK,
            "&aFN Gerador de Esmeralda",
            "&6Gera Esmeralda automaticamente a uma taxa fixa",
            "&6Clique direito para ver o progresso",
            "",
            "&6Ticks necessarios: " + "&6tick",
            "",
            "&cAviso:",
            "&fQuebrar a maquina diretamente ira danifica-la",
            "&fe voce recebera a versao danificada!",
            "",
            "&d&oFN Gerador de Materiais"
    );

    public static final SlimefunItemStack FMG_GENERATOR_DIRT_BROKEN = new SlimefunItemStack(
            "FMG_GENERATOR_DIRT_BROKEN",
            Material.DIRT,
            "&fFN Gerador de Terra &8(Danificado)",
            "&8Necessita reparo",
            "",
            "&d&oFN Gerador de Materiais"
    );

    public static final SlimefunItemStack FMG_GENERATOR_DIRT = new SlimefunItemStack(
            "FMG_GENERATOR_DIRT",
            Material.DIRT,
            "&fFN Gerador de Terra",
            "&6Gera Terra automaticamente a uma taxa fixa",
            "&6Clique direito para ver o progresso",
            "",
            "&6Ticks necessarios: " + "&6tick",
            "",
            "&cAviso:",
            "&fQuebrar a maquina diretamente ira danifica-la",
            "&fe voce recebera a versao danificada!",
            "",
            "&d&oFN Gerador de Materiais"
    );

    public static final SlimefunItemStack FMG_GENERATOR_HONEYCOMB_BROKEN = new SlimefunItemStack(
            "FMG_GENERATOR_HONEYCOMB_BROKEN",
            Material.HONEYCOMB_BLOCK,
            "&6FN Gerador de Favo de Mel &8(Danificado)",
            "&8Necessita reparo",
            "",
            "&d&oFN Gerador de Materiais"
    );

    public static final SlimefunItemStack FMG_GENERATOR_HONEYCOMB = new SlimefunItemStack(
            "FMG_GENERATOR_HONEYCOMB",
            Material.HONEYCOMB_BLOCK,
            "&6FN Gerador de Favo de Mel",
            "&6Gera Favo de Mel automaticamente a uma taxa fixa",
            "&6Clique direito para ver o progresso",
            "",
            "&6Ticks necessarios: " + "&6tick",
            "",
            "&cAviso:",
            "&fQuebrar a maquina diretamente ira danifica-la",
            "&fe voce recebera a versao danificada!",
            "",
            "&d&oFN Gerador de Materiais"
    );

    public static final SlimefunItemStack FMG_GENERATOR_QUARTZ_BROKEN = new SlimefunItemStack(
            "FMG_GENERATOR_QUARTZ_BROKEN",
            Material.QUARTZ_BLOCK,
            "&fFN Gerador de Quartzo &8(Danificado)",
            "&8Necessita reparo",
            "",
            "&d&oFN Gerador de Materiais"
    );

    public static final SlimefunItemStack FMG_GENERATOR_QUARTZ = new SlimefunItemStack(
            "FMG_GENERATOR_QUARTZ",
            Material.QUARTZ_BLOCK,
            "&fFN Gerador de Quartzo",
            "&6Gera Quartzo automaticamente a uma taxa fixa",
            "&6Clique direito para ver o progresso",
            "",
            "&6Ticks necessarios: " + "&6tick",
            "",
            "&cAviso:",
            "&fQuebrar a maquina diretamente ira danifica-la",
            "&fe voce recebera a versao danificada!",
            "",
            "&d&oFN Gerador de Materiais"
    );

    public static SlimefunItemStack FMG_GENERATOR_WARPED_BROKEN;
    public static SlimefunItemStack FMG_GENERATOR_WARPED;
    public static SlimefunItemStack FMG_GENERATOR_AMETHYST_BROKEN;
    public static SlimefunItemStack FMG_GENERATOR_AMETHYST;

    static {
        if(Slimefun.getMinecraftVersion().isAtLeast(MinecraftVersion.MINECRAFT_1_17)) {
            FMG_GENERATOR_AMETHYST_BROKEN = new SlimefunItemStack(
                    "FMG_GENERATOR_AMETHYST_BROKEN",
                    Material.AMETHYST_BLOCK,
                    "&dFN Gerador de Cacho de Ametista &8(Danificado)",
                    "&8Necessita reparo",
                    "",
                    "&d&oFN Gerador de Materiais"
            );

            FMG_GENERATOR_AMETHYST = new SlimefunItemStack(
                    "FMG_GENERATOR_AMETHYST",
                    Material.AMETHYST_BLOCK,
                    "&dFN Gerador de Cacho de Ametista",
                    "&6Gera Cacho de Ametista automaticamente a uma taxa fixa",
                    "&6Clique direito para ver o progresso",
                    "",
                    "&6Ticks necessarios: " + "&6tick",
                    "",
                    "&cAviso:",
                    "&fQuebrar a maquina diretamente ira danifica-la",
                    "&fe voce recebera a versao danificada!",
                    "",
                    "&d&oFN Gerador de Materiais"
            );
        }

        if(Slimefun.getMinecraftVersion().isAtLeast(MinecraftVersion.MINECRAFT_1_16)){
            FMG_GENERATOR_WARPED_BROKEN = new SlimefunItemStack(
                    "FMG_GENERATOR_WARPED_BROKEN",
                    Material.WARPED_NYLIUM,
                    "&4FN Gerador de Micelio Deformado &8(Danificado)",
                    "&8Necessita reparo",
                    "",
                    "&d&oFN Gerador de Materiais"
            );

           FMG_GENERATOR_WARPED = new SlimefunItemStack(
                    "FMG_GENERATOR_WARPED",
                    Material.WARPED_NYLIUM,
                    "&4FN Gerador de Micelio Deformado",
                    "&6Gera Micelio Deformado automaticamente a uma taxa fixa",
                    "&6Clique direito para ver o progresso",
                    "",
                    "&6Ticks necessarios: " + "&6tick",
                    "",
                    "&cAviso:",
                    "&fQuebrar a maquina diretamente ira danifica-la",
                    "&fe voce recebera a versao danificada!",
                    "",
                   "&d&oFN Gerador de Materiais"
            );
        }
    }

    public static final SlimefunItemStack FN_MAT_GEN_UPGRADES_REPAIR_ITEM = new SlimefunItemStack(
            "FN_MAT_GEN_UPGRADES_REPAIR_ITEM",
            Material.BLACK_DYE,
            "&fFN Item de Reparo de Gerador",
            "&6Repara ou adiciona durabilidade",
            "",
            "&e+20 de durabilidade",
            "",
            "&aClique direito em um gerador de materiais",
            "&d&oFN Upgrades de Geradores de Materiais"
    );

    public static final SlimefunItemStack FN_MAT_GEN_UPGRADES_FAST_PRODUCE = new SlimefunItemStack(
            "FN_MAT_GEN_UPGRADES_FAST_PRODUCE",
            Material.YELLOW_DYE,
            "&fFN Modulo de Producao Acelerada",
            "&6Aumenta a velocidade de producao",
            "",
            "&ePor 30 minutos, aumenta a producao em +1.75x",
            "",
            "&aClique direito em um gerador de materiais para usar",
            "&d&oFN Modulos de Upgrade dos Geradores"
    );

    public static final SlimefunItemStack FN_FAL_GENERATOR_TIER1 = new SlimefunItemStack(
            "FN_FAL_GENERATOR_TIER1",
            "6d2822cedb3abd579d6dfa2966c1433c3c36cb9732e2c23ec0cc81daedd4403b",
            "&dFN Gerador Solar Nivel I",
            "", "&eGerador para quem so precisa de energia durante o dia",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR));

    public static final SlimefunItemStack FN_FAL_GENERATOR_TIER2 = new SlimefunItemStack(
            "FN_FAL_GENERATOR_TIER2",
            "35dd37f729fc88133e314a552204c0fa2c0168428b353f957bf15ff24b7707e0",
            "&dFN Gerador Solar Nivel II",
            "", "&eGerador para quem so precisa de energia durante o dia",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR));

    public static final SlimefunItemStack FN_FAL_GENERATOR_TIER3 = new SlimefunItemStack(
            "FN_FAL_GENERATOR_TIER3",
            "25ddf6af2d6271d8fdfadbdc54faaad5a68d7b8ac20e163883fc38d76336ea6",
            "&dFN Gerador Solar Nivel III",
            "", "&eGerador para quem so precisa de energia durante o dia",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR));

    public static final SlimefunItemStack FN_FAL_GENERATOR_TIER4 = new SlimefunItemStack(
            "FN_FAL_GENERATOR_TIER4",
            "e7f4c00356d1addb85b45ba5352992d3ecc0c9d11feb9041482f8531fd27d014",
            "&dFN Gerador Solar Nivel IV",
            "", "&eGerador para quem so precisa de energia durante o dia",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR));

    public static final SlimefunItemStack FN_FAL_GENERATOR_TIER5 = new SlimefunItemStack(
            "FN_FAL_GENERATOR_TIER5",
            "afdd9e588d2461d2d3d058cb3e0af2b3a3367607aa14d124ed92a833f25fb112",
            "&dFN Gerador Solar Nivel V",
            "", "&eGerador para quem so precisa de energia durante o dia",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR));

    public static final SlimefunItemStack FN_FAL_GENERATOR_TIER6 = new SlimefunItemStack(
            "FN_FAL_GENERATOR_TIER6",
            "224ad26209fa02f559ef6aa863ee9ba8f3bef0a02f1e9cff8fdc09196402fb6f",
            "&dFN Gerador Solar Nivel VI",
            "", "&eGerador para quem so precisa de energia durante o dia",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR));

    public static final SlimefunItemStack FN_FAL_GENERATOR_TIER7 = new SlimefunItemStack(
            "FN_FAL_GENERATOR_TIER7",
            "c4fe135c311f7086edcc5e6dbc4ef4b23f819fddaa42f827dac46e3574de2287",
            "&dFN Gerador Solar Nivel VII",
            "", "&eGerador para quem so precisa de energia durante o dia",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR));

    public static final SlimefunItemStack FN_FAL_GENERATOR_TIER8 = new SlimefunItemStack(
            "FN_FAL_GENERATOR_TIER8",
            "240775c3ad75763613f32f04986881bbe4eee4366d0c57f17f7c7514e2d0a77d",
            "&dFN Painel Solar Nivel VIII",
            "", "&eGerador para quem so precisa de energia durante o dia",
            "",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.GENERATOR));

    public static final SlimefunItemStack FN_FAL_TRANSFORMER_1 = new SlimefunItemStack(
            "FN_FAL_TRANSFORMER_1",
            Material.BLUE_GLAZED_TERRACOTTA,
            "&dFN Transformador de Itens I",
            "", "&eUma maquina capaz de transformar itens",
            "",
            "&d&oFN Maquinario",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(256));

    public static final SlimefunItemStack FN_FAL_TRANSFORMER_2 = new SlimefunItemStack(
            "FN_FAL_TRANSFORMER_2",
            Material.BLUE_GLAZED_TERRACOTTA, "&dFN Transformador de Itens II",
            "", "&eUma maquina capaz de transformar itens",
            "",
            "&d&oFN Maquinario",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(2),
            LoreBuilder.powerPerSecond(384));

    public static final SlimefunItemStack FN_FAL_TRANSFORMER_3 = new SlimefunItemStack(
            "FN_FAL_TRANSFORMER_3",
            Material.BLUE_GLAZED_TERRACOTTA,
            "&dFN Transformador de Itens III",
            "", "&eUma maquina capaz de transformar itens",
            "",
            "&d&oFN Maquinario",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(4),
            LoreBuilder.powerPerSecond(768));

    public static final SlimefunItemStack FN_FAL_COMPRESSOR_1 = new SlimefunItemStack(
            "FN_FAL_COMPRESSOR_1",
            Material.GREEN_GLAZED_TERRACOTTA,
            "&dFN Compressor I",
            "", "&eUma maquina capaz de comprimir itens",
            "",
            "&d&oFN Maquinario",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(128));

    public static final SlimefunItemStack FN_FAL_COMPRESSOR_2 = new SlimefunItemStack(
            "FN_FAL_COMPRESSOR_2",
            Material.GREEN_GLAZED_TERRACOTTA,
            "&dFN Compressor II",
            "", "&eUma maquina capaz de comprimir itens",
            "",
            "&d&oFN Maquinario",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(2),
            LoreBuilder.powerPerSecond(256));

    public static final SlimefunItemStack FN_FAL_COMPRESSOR_3 = new SlimefunItemStack(
            "FN_FAL_COMPRESSOR_3",
            Material.GREEN_GLAZED_TERRACOTTA,
            "&dFN Compressor III",
            "", "&eUma maquina capaz de comprimir itens",
            "",
            "&d&oFN Maquinario",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(4),
            LoreBuilder.powerPerSecond(512));

    public static final SlimefunItemStack FN_FAL_CONDENSER_1 = new SlimefunItemStack(
            "FN_FAL_CONDENSER_1",
            Material.YELLOW_STAINED_GLASS,
            "&dFN Condensador de Lingotes I",
            "", "&eUma maquina capaz de concentrar metais",
            "",
            "&d&oFN Maquinario",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(256));

    public static final SlimefunItemStack FN_FAL_CONDENSER_2 = new SlimefunItemStack(
            "FN_FAL_CONDENSER_2",
            Material.YELLOW_STAINED_GLASS,
            "&dFN Condensador de Lingotes II",
            "", "&eUma maquina capaz de concentrar metais",
            "",
            "&d&oFN Maquinario",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(2),
            LoreBuilder.powerPerSecond(384));

    public static final SlimefunItemStack FN_FAL_CONDENSER_3 = new SlimefunItemStack(
            "FN_FAL_CONDENSER_3",
            Material.YELLOW_STAINED_GLASS,
            "&dFN Condensador de Lingotes III",
            "", "&eUma maquina capaz de concentrar metais",
            "",
            "&d&oFN Maquinario",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(4),
            LoreBuilder.powerPerSecond(768));

    public static final SlimefunItemStack FN_FAL_RECYCLER_1 = new SlimefunItemStack(
            "FN_FAL_RECYCLER_1",
            Material.PURPLE_STAINED_GLASS,
            "&dFN Reciclador I",
            "", "&eReduz o nivel do item correspondente",
            "",
            "&d&oFN Maquinario",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(1),
            LoreBuilder.powerPerSecond(168));

    public static final SlimefunItemStack FN_FAL_RECYCLER_2 = new SlimefunItemStack(
            "FN_FAL_RECYCLER_2",
            Material.PURPLE_STAINED_GLASS,
            "&dFN Reciclador II",
            "", "&eReduz o nivel do item correspondente",
            "",
            "&d&oFN Maquinario",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(2),
            LoreBuilder.powerPerSecond(336));

    public static final SlimefunItemStack FN_FAL_RECYCLER_3 = new SlimefunItemStack(
            "FN_FAL_RECYCLER_3",
            Material.PURPLE_STAINED_GLASS,
            "&dFN Reciclador III",
            "", "&eReduz o nivel do item correspondente",
            "",
            "&d&oFN Maquinario",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(4),
            LoreBuilder.powerPerSecond(672));

    public static final SlimefunItemStack FN_FAL_DOWNGRADER = new SlimefunItemStack(
            "FN_FAL_DOWNGRADER",
            Material.WHITE_GLAZED_TERRACOTTA,
            "&dFN Rebaixador de Maquinas",
            "", "&eUsado para rebaixar maquinas do Slimefun",
            "&eIdeal para quem craftou sem querer uma maquina de nivel alto,",
            "&eou para quem quer rebaixar maquinas excedentes",
            "",
            "&e- E preciso abrir o menu da maquina para ter chance de sucata",
            "&e- Chance de 25% de obter",
            "",
            "&d&oFN Maquinario",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.speed(4),
            LoreBuilder.powerPerSecond(1500));

    public static final SlimefunItemStack MACHINE_PART = new SlimefunItemStack(
            "FN_MACHINERY_MACHINE_PART",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("6ddd4a12da1cc2c9f9d6cd49fc778e3a11f3757de6dd312d70a0d47885189c0")),
            "&dPeca de Maquina",
            "&fPeca basica de maquinario FN",
            "",
            "&d&oFN Material de Maquinario");

    public static final SlimefunItemStack MACHINE_PART_SCRAP = new SlimefunItemStack(
            "FN_MACHINERY_MACHINE_PART_SCRAP",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("6ddd4a12da1cc2c9f9d6cd49fc778e3a11f3757de6dd312d70a0d47885189c0")),
            "&dPeca de Maquina",
            "&fCraftado com sucata metalica");

    public static final SlimefunItemStack COMPONENT_PART = new SlimefunItemStack(
            "FN_MACHINERY_COMPONENT_PART",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("74657e89167b17ed581e87ce4215ce8d47145ab34038202d5ccefb0a9bd0d8f4")),
            "&dDissipador de Calor",
            "&fPeca basica de maquinario FN",
            "",
            "&d&oFN Material de Maquinario");

    public static final SlimefunItemStack COMPONENT_PART_SCRAP = new SlimefunItemStack(
            "FN_MACHINERY_COMPONENT_PART_SCRAP",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("74657e89167b17ed581e87ce4215ce8d47145ab34038202d5ccefb0a9bd0d8f4")),
            "&dDissipador de Calor",
            "&fCraftado com sucata metalica");

    public static final SlimefunItemStack MOTOR_SWITCH = new SlimefunItemStack(
            "FN_MACHINERY_MOTOR_SWITCH",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("48748ce96cedbfecaa463966d8fb1ac83c408feea89bd60d76d6024d3befe")),
            "&dInterruptor do Motor",
            "&fPeca basica de maquinario FN",
            "",
            "&d&oFN Material de Maquinario");

    public static final SlimefunItemStack MOTOR_SWITCH_SCRAP = new SlimefunItemStack(
            "FN_MACHINERY_MOTOR_SWITCH_SCRAP",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("48748ce96cedbfecaa463966d8fb1ac83c408feea89bd60d76d6024d3befe")),
            "&dInterruptor do Motor",
            "&fCraftado com sucata metalica");

    public static final SlimefunItemStack POWER_COMPONENT = new SlimefunItemStack(
            "FN_MACHINERY_POWER_COMPONENT",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("25ba8456e92f0790222c19c06f61180a195af1008569ed352b93a3c6d9ec7a98")),
            "&dComponente de Energia",
            "&fPeca basica de maquinas e geradores FN",
            "",
            "&d&oFN Material de Maquinario");

    public static final SlimefunItemStack POWER_COMPONENT_SCRAP = new SlimefunItemStack(
            "FN_MACHINERY_POWER_COMPONENT_SCRAP",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("25ba8456e92f0790222c19c06f61180a195af1008569ed352b93a3c6d9ec7a98")),
            "&dComponente de Energia",
            "&fCraftado com sucata metalica");

    public static final SlimefunItemStack GEAR_PART = new SlimefunItemStack(
            "FN_MACHINERY_GEAR_PART",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("faf0c95ceba34c7fe6d33404feb87b4184ccce143978622c1647feaed2b63274")),
            "&dPeca de Engrenagem",
            "&fPeca basica de maquinas e geradores FN",
            "",
            "&d&oFN Material de Maquinario");

    public static final SlimefunItemStack GEAR_PART_SCRAP = new SlimefunItemStack(
            "FN_MACHINERY_GEAR_PART_SCRAP",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("faf0c95ceba34c7fe6d33404feb87b4184ccce143978622c1647feaed2b63274")),
            "&dPeca de Engrenagem",
            "&fCraftado com sucata metalica");

    public static final SlimefunItemStack THREAD_PART = new SlimefunItemStack(
            "FN_MACHINERY_THREAD_PART",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("87ec65d6649ac1bf7b282575cef299f8601e51d8418d6e546e4fc71b218f7")),
            "&dComponente Rosqueado",
            "&fPeca basica de maquinario FN",
            "",
            "&d&oFN Material de Maquinario");

    public static final SlimefunItemStack THREAD_PART_SCRAP = new SlimefunItemStack(
            "FN_MACHINERY_THREAD_PART_SCRAP",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("87ec65d6649ac1bf7b282575cef299f8601e51d8418d6e546e4fc71b218f7")),
            "&dComponente Rosqueado",
            "&fCraftado com sucata metalica");

    public static final SlimefunItemStack COMPRESSOR_PART = new SlimefunItemStack(
            "FN_MACHINERY_COMPRESSOR_PART",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("d3898f7c444223b7a91a8f038e224222fef8960cfbef94836b014a06ea4cba63")),
            "&dPeca de Compressor",
            "&fPeca basica de maquinario FN",
            "",
            "&d&oFN Material de Maquinario");

    public static final SlimefunItemStack CONDENSER_PART = new SlimefunItemStack(
            "FN_MACHINERY_CONDENSER_PART",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("63be652b2e1b93ed8e93b427de455d446582e6c8d929f8fc96ac488a8f7f53")),
            "&dComponente de Condensador",
            "&fPeca basica de maquinario FN",
            "",
            "&d&oFN Material de Maquinario");

    public static final SlimefunItemStack RECYCLER_PART = new SlimefunItemStack(
            "FN_MACHINERY_RECYCLER_PART",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("4817fc8e16b8e994efb908b71acd1d1352ca5aefa09fecc9339ebea450d83fb8")),
            "&dPeca de Reciclador",
            "&fPeca basica de maquinario FN",
            "",
            "&d&oFN Material de Maquinario");

    public static final SlimefunItemStack DOWNGRADER_PART = new SlimefunItemStack(
            "FN_MACHINERY_DOWNGRADER_PART",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("a44c5ce2eb643f8671c667e8802c9317ad8cc6af680d4ef671d8c0c63277900a")),
            "&dPeca de Rebaixador",
            "&fPeca basica de maquinario FN",
            "",
            "&d&oFN Material de Maquinario");

    public static final SlimefunItemStack FUNNEL_PART = new SlimefunItemStack(
            "FN_MACHINERY_FUNNEL_PART",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("bb2abd66939f4cb7257a88cf52fbc6fdceec1433ec2a6ef16d62e34f6238781")),
            "&dPeca de Funil",
            "&fPeca basica de maquinario FN",
            "",
            "&d&oFN Material de Maquinario");

    public static final SlimefunItemStack FUNNEL_PART_SCRAP = new SlimefunItemStack(
            "FN_MACHINERY_FUNNEL_PART_SCRAP",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("bb2abd66939f4cb7257a88cf52fbc6fdceec1433ec2a6ef16d62e34f6238781")),
            "&dPeca de Funil",
            "&fCraftado com sucata metalica");

    public static final SlimefunItemStack DIAMOND_PLATING = new SlimefunItemStack(
            "FN_MACHINERY_DIAMOND_PLATING",
            Material.LIGHT_BLUE_CARPET,
            "&dRevestimento de Diamante",
            "&fPeca basica de maquinas e geradores FN",
            "",
            "&d&oFN Material de Maquinario");

    public static final SlimefunItemStack ALUMINUM_PLATING = new SlimefunItemStack(
            "FN_MACHINERY_ALUMINUM_PLATING",
            Material.WHITE_CARPET,
            "&dRevestimento de Aluminio",
            "&fPeca basica de maquinas e geradores FN",
            "",
            "&d&oFN Material de Maquinario");

    public static final SlimefunItemStack GOLD_PLATING = new SlimefunItemStack(
            "FN_MACHINERY_GOLD_PLATING",
            Material.YELLOW_CARPET,
            "&dRevestimento de Ouro",
            "&fPeca basica de maquinas e geradores FN",
            "",
            "&d&oFN Material de Maquinario");

    public static final SlimefunItemStack BRASS_PLATING = new SlimefunItemStack(
            "FN_MACHINERY_BRASS_PLATING",
            Material.BROWN_CARPET,
            "&dRevestimento de Latao",
            "&fPeca basica de maquinas e geradores FN",
            "",
            "&d&oFN Material de Maquinario");

    public static final SlimefunItemStack REINFORCED_CASING = new SlimefunItemStack(
            "FN_MACHINERY_REINFORCED_CASING",
            Material.LIGHT_GRAY_CARPET,
            "&dRevestimento de Liga Reforcada",
            "&fPeca basica de maquinas e geradores FN",
            "",
            "&d&oFN Material de Maquinario");

    public static final SlimefunItemStack UNBIND_RUNE = new SlimefunItemStack(
            "FN_MAGICAL_ITEMS_UNBIND_RUNE",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("4f01ec6331a3bc30a8204ec56398d08ca38788556bca9b81d776f6238d567367")),
            "&6Runa de Desvinculo",
            "&fRuna magica de uma era esquecida",
            "",
            "&d&oFN Item Magico");

    public static final SlimefunItemStack SPIRAL_FIRE_RUNE = new SlimefunItemStack(
            "FN_MAGICAL_ITEMS_SPIRAL_FIRE_RUNE",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("8301aa86cafd4b2d732a9b4894cfcfc65edc828e8571b45dbf0a3ba96575cccf")),
            "&cRuna de Chamas em Espiral",
            "&fUm coracao ardente se eleva em espiral da runa",
            "",
            "&d&oFN Item Magico");

    public static final SlimefunItemStack SPIRIT_RUNE = new SlimefunItemStack(
            "FN_MAGICAL_ITEMS_SPIRIT_RUNE",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("c738b8af8d7ce1a26dc6d40180b3589403e11ef36a66d7c4590037732829542e")),
            "&fRuna da Alma",
            "&fA alma foi resgatada, o dia esta proximo",
            "",
            "&d&oFN Item Magico");

    public static final SlimefunItemStack PESTILENCE_RUNE = new SlimefunItemStack(
            "FN_MAGICAL_ITEMS_PESTILENCE_RUNE",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("a8c4811395fbf7f620f05cc3175cef1515aaf775ba04a01045027f0693a90147")),
            "&aRuna da Peste",
            "&fRuna da era da Peste Negra",
            "&fCarrega um pecado mortal",
            "",
            "&d&oFN Item Magico");

    public static final SlimefunItemStack SPARKLING_RUNE = new SlimefunItemStack(
            "FN_MAGICAL_ITEMS_SPARKLING_RUNE",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("f1e2428cb359988f4c4ff0e61de21385c62269de19a69762d773223b75dd1666")),
            "&eRuna Cintilante",
            "&fUma runa brilhante demais, mortal demais",
            "",
            "&d&oFN Item Magico");

    public static final SlimefunItemStack CLOUD_RUNE = new SlimefunItemStack(
            "FN_MAGICAL_ITEMS_CLOUD_RUNE",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("2273740d454de962484712f9835e35119b37ab867fa6982d5cc1f333c2334e59")),
            "&3Runa das Nuvens",
            "&fLeva direto ate as nuvens",
            "",
            "&d&oFN Item Magico");

    public static final SlimefunItemStack ICE_RUNE = new SlimefunItemStack(
            "FN_MAGICAL_ITEMS_ICE_RUNE",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("cdc57c75adf39ec6f0e0916049dd9671e98a8a1e600104e84e645c988950bd7")),
            "&bRuna do Gelo",
            "&fUma runa repleta de frio",
            "&fMas sera que voce consegue ficar parado?",
            "",
            "&d&oFN Item Magico");

    public static final SlimefunItemStack POWER_RUNE = new SlimefunItemStack(
            "FN_MAGICAL_ITEMS_POWER_RUNE",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("3b481c31dc683bdcb7d375a7c5db7ac7adf9e9fe8b6c04a64931613e29fe470e")),
            "&9Runa de Energia",
            "&fO poder imenso desta runa",
            "&fpode realizar feitos perigosos",
            "",
            "&d&oFN Item Magico");

    public static final SlimefunItemStack LINGER_RUNE = new SlimefunItemStack(
            "FN_MAGICAL_ITEMS_LINGER_RUNE",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("2c4a65c689b2d36409100a60c2ab8d3d0a67ce94eea3c1f7ac974fd893568b5d")),
            "&2Runa Errante",
            "&fDo topo ao fundo do mundo,",
            "&flogo estara vagando pelo chao",
            "",
            "&d&oFN Item Magico");

    public static final SlimefunItemStack AGILITY_RUNE = new SlimefunItemStack(
            "FN_MAGICAL_ITEMS_AGILITY_RUNE",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("35f4861aa5b22ee28a90e75dab45d221efd14c0b1ecc8ee998fb67e43bb8f3de")),
            "&eRuna da Agilidade",
            "&fMais rapido significa melhor",
            "&fmas sera que isso realmente importa?",
            "",
            "&d&oFN Item Magico");

    public static final SlimefunItemStack INTELLECT_RUNE = new SlimefunItemStack(
            "FN_MAGICAL_ITEMS_INTELLECT_RUNE",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("977c1fc93216e96d435cf962e1173de8d1a249b644894d72676eba732fcd56e7")),
            "&9Runa da Sabedoria",
            "&fUma runa muito util em momentos de desespero",
            "",
            "&d&oFN Item Magico");

    public static final SlimefunItemStack HEART_RUNE = new SlimefunItemStack(
            "FN_MAGICAL_ITEMS_HEART_RUNE",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("2c1c179ad51955f1522c48ea9931f09c162741b45e22e9d3feb682c7e5ed8274")),
            "&dRuna do Coracao",
            "&fA energia desta runa pode restaurar suas forcas",
            "",
            "&d&oFN Item Magico");

    public static final SlimefunItemStack BASIC_MACHINE_BLOCK = new SlimefunItemStack(
            "FN_MACHINERY_BASIC_MACHINE_BLOCK",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("883dd0f90df05fe6a09aaccaf54bc043e455e1c865bda1fd272e3f47fb9bb910")),
            "&dBloco Mecanico Basico",
            "&fComponente basico de maquinas e geradores FN",
            "",
            "&d&oFN Material de Maquinario");

    public static final SlimefunItemStack HIGHTECH_MACHINE_BLOCK = new SlimefunItemStack(
            "FN_MACHINERY_HIGHTECH_MACHINE_BLOCK",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("5a7b3b16e5d0c4cfd21c4eb9133e969aad7cc7303ccdf317512e26a4879b51")),
            "&dBloco Mecanico de Alta Tecnologia",
            "&fComponente basico de maquinas e geradores FN",
            "",
            "&d&oFN Material de Maquinario");

    public static final SlimefunItemStack FN_ASSEMBLY_STATION = new SlimefunItemStack(
            "FN_ASSEMBLY_STATION",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("583150f055935058634576185977ffba49ff4679faa03ad0008feaa0161865b3")),
            "&dFN Estacao de Montagem"
    );

    public static final SlimefunItemStack FN_SCRAP_RECYCLER = new SlimefunItemStack(
            "FN_SCRAP_RECYCLER",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("656634b556caf5382de65038a10e4d79c7c18695048599df74f9c67c1e1e8736")),
            "&dFN Reciclador de Sucata"
    );

    public static final SlimefunItemStack FN_METAL_SCRAPS = new SlimefunItemStack(
            "FN_METAL_SCRAPS",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("3ff0bee591e5f0000ef16f966b949adcb5c2f409a14ccfc5b91222fd925045db")),
            "&dSucata Metalica",
            "&fResiduo deixado ao rebaixar maquinas"
            , "&fPode ser usado para craftar materiais de maquinario FN",
            "",
            "&d&oFN Material de Maquinario"
    );

    public static final SlimefunItemStack FN_BLOCK_BREAKER_1 = new SlimefunItemStack(
            "FN_BLOCK_BREAKER_I",
            Material.DISPENSER,
            "&4Minerador de Blocos I",
            "",
            "&6O bloco a frente do dispensador sera minerado",
            "&d(bloco vanilla)",
            "",
            "&eTaxa: " + "&eticks",
            "",
            "&d&oFN Maquinario",
            LoreBuilder.machine(MachineTier.AVERAGE, MachineType.MACHINE),
            LoreBuilder.powerBuffer(512),
            LoreBuilderDynamic.powerPerTick(32)
    );

    public static final SlimefunItemStack FN_BLOCK_BREAKER_2 = new SlimefunItemStack(
            "FN_BLOCK_BREAKER_II",
            Material.DISPENSER,
            "&4Minerador de Blocos II",
            "",
            "&6O bloco a frente do dispensador sera minerado",
            "&d(bloco vanilla)",
            "",
            "&eTaxa: " + "&eticks",
            "",
            "&d&oFN Maquinario",
            LoreBuilder.machine(MachineTier.ADVANCED, MachineType.MACHINE),
            LoreBuilder.powerBuffer(1024),
            LoreBuilderDynamic.powerPerTick(64)
    );

    public static final SlimefunItemStack FN_BLOCK_BREAKER_3 = new SlimefunItemStack(
            "FN_BLOCK_BREAKER_III",
            Material.DISPENSER,
            "&4Minerador de Blocos III",
            "",
            "&6O bloco a frente do dispensador sera minerado",
            "&d(bloco vanilla)",
            "",
            "&eTaxa: " + "&eticks",
            "",
            "&d&oFN Maquinario",
            LoreBuilder.machine(MachineTier.END_GAME, MachineType.MACHINE),
            LoreBuilder.powerBuffer(2048),
            LoreBuilderDynamic.powerPerTick(128)
    );

    public static final SlimefunItemStack FN_STICK = new SlimefunItemStack(
            "FN_MYSTERY_STICK_1",
            Material.STICK,
            "&cBastao Misterioso",
            "&fAte eu estou curioso pra saber o que esse bastao faz",
            "",
            "&f𳭚"
    );


    public static final SlimefunItemStack FN_STICK_2 = new SlimefunItemStack(
            "FN_MYSTERY_STICK_2",
            Material.STICK,
            "&cBastao Misterioso II",
            "&fMais um bastao de utilidade desconhecida",
            "",
            "&f𳭚"
    );

    public static final SlimefunItemStack FN_STICK_3 = new SlimefunItemStack(
            "FN_MYSTERY_STICK_3",
            Material.STICK,
            "&cBastao Misterioso III",
            "&fSegurar este bastao parece sintoniza-lo com voce",
            "",
            "&f𳭚"
    );

    public static final SlimefunItemStack FN_STICK_4 = new SlimefunItemStack(
            "FN_MYSTERY_STICK_4",
            Material.STICK,
            "&cBastao Misterioso IV",
            "&fTalvez eu ja tenha usado este bastao antes",
            "",
            "&f𳭉"
    );

    public static final SlimefunItemStack FN_STICK_5 = new SlimefunItemStack(
            "FN_MYSTERY_STICK_5",
            Material.STICK,
            "&cBastao Misterioso V",
            "&fJa estou cansado desses bastoes",
            "",
            "&f𳭉"
    );

    public static final SlimefunItemStack FN_STICK_6 = new SlimefunItemStack(
            "FN_MYSTERY_STICK_6",
            Material.STICK,
            "&cBastao Misterioso VI",
            "&fQue a forca esteja com voce",
            "",
            "&f𳭉"
    );

    public static final SlimefunItemStack FN_STICK_7 = new SlimefunItemStack(
            "FN_MYSTERY_STICK_7",
            Material.STICK,
            "&cBastao Misterioso VII",
            "&fA aura que emana deste bastao e fascinante",
            "",
            "&f𳭉"
    );

    public static final SlimefunItemStack FN_STICK_8 = new SlimefunItemStack(
            "FN_MYSTERY_STICK_8",
            Material.STICK,
            "&cBastao Misterioso VIII",
            "&fUm bastao um tanto pesado",
            "",
            "&f𳭉"
    );

    public static final SlimefunItemStack FN_STICK_9 = new SlimefunItemStack(
            "FN_MYSTERY_STICK_9",
            Material.STICK,
            "&cBastao Misterioso IX",
            "&fEste bastao exige mais mana para ser usado",
            "",
            "&f𳭉"
    );

    public static final SlimefunItemStack FN_STICK_10 = new SlimefunItemStack(
            "FN_MYSTERY_STICK_10",
            Material.STICK,
            "&cBastao Misterioso X",
            "&fUm bastao as vezes letal, as vezes assustador",
            "",
            "&f𳭋"
    );

    public static final SlimefunItemStack FN_STICK_11 = new SlimefunItemStack(
            "FN_MYSTERY_STICK_11",
            Material.STICK,
            "&cBastao Misterioso XI",
            "&fO bastao dos nordicos",
            "",
            "&f𳭋"
    );

    public static final SlimefunItemStack FN_STICK_ALTAR = new SlimefunItemStack(
            "FN_STICK_ALTAR",
            Material.ENCHANTING_TABLE,
            "&dFN Altar dos Bastoes Misteriosos"
    );

    public static final SlimefunItemStack FN_GEM_ALTAR = new SlimefunItemStack(
            "FN_GEM_ALTAR",
            Material.SMITHING_TABLE,
            "&dFN Altar das Gemas"
    );

    public static final SlimefunItemStack FN_GEM_UPGRADER = new SlimefunItemStack(
            "FN_GEM_UPGRADER",
            Material.SMITHING_TABLE,
            "&dFN Aprimorador de Gemas"
    );

    public static final SlimefunItemStack FN_GEM_DOWNGRADER = new SlimefunItemStack(
            "FN_GEM_DOWNGRADER",
            Material.STONECUTTER,
            "&dFN Rebaixador de Gemas"
    );

    public static final SlimefunItemStack FN_MAGIC_ALTAR = new SlimefunItemStack(
            "FN_MAGIC_ALTAR",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("e34930125767c2e34ac939ec94a2aa4e79c381ee336760695c6c874cf12")),
            "&dFN Altar Magico"
    );

    public static final SlimefunItemStack FN_GEAR_HELMET = new SlimefunItemStack(
            "FN_GEAR_HELMET",
            Slimefun.getMinecraftVersion().isAtLeast(MinecraftVersion.MINECRAFT_1_16) ?
                    Material.NETHERITE_HELMET : Material.DIAMOND_HELMET,
            "&cElmo de Batalha FN",
            "&c◬◬◬◬◬◬| &d&lIntroducao &6|◬◬◬◬◬◬",
            "",
            "&fVista o elmo em nome da FN",
            "&fA batalha so o torna mais forte",
            "&fe concede atributos e encantamentos extras",
            "",
            "&c◈◈◈◈◈◈| &d&lDados &6|◈◈◈◈◈◈",
            ChatColor.YELLOW + "Nivel do elmo: 0",
            ChatColor.YELLOW + "Progresso de avanco:",
            ChatColor.GRAY + "[" + "■■■■■■■■■■" + ChatColor.GRAY + "]",
            "",
            "&f𳭊"
    );

    public static final SlimefunItemStack FN_GEAR_CHESTPLATE = new SlimefunItemStack(
            "FN_GEAR_CHESTPLATE",
            Slimefun.getMinecraftVersion().isAtLeast(MinecraftVersion.MINECRAFT_1_16) ?
                    Material.NETHERITE_CHESTPLATE : Material.DIAMOND_CHESTPLATE,
            "&cPeitoral Marcado pela Guerra FN",
            "&c◬◬◬◬◬◬| &d&lIntroducao &6|◬◬◬◬◬◬",
            "",
            "&fUma armadura do passado, trazida de volta a vida",
            "&fNa guerra e no conflito, ela se torna ainda mais forte",
            "",
            "&c◈◈◈◈◈◈| &d&lDados &6|◈◈◈◈◈◈",
            ChatColor.YELLOW + "Nivel da armadura: 0",
            ChatColor.YELLOW + "Progresso de avanco:",
            ChatColor.GRAY + "[" + "■■■■■■■■■■" + ChatColor.GRAY + "]",
            "",
            "&f𳭊"
    );

    public static final SlimefunItemStack FN_GEAR_LEGGINGS = new SlimefunItemStack(
            "FN_GEAR_LEGGINGS",
            Slimefun.getMinecraftVersion().isAtLeast(MinecraftVersion.MINECRAFT_1_16) ?
                    Material.NETHERITE_LEGGINGS: Material.DIAMOND_LEGGINGS,
            "&cCalcas Excepcionais FN",
            "&c◬◬◬◬◬◬| &d&lIntroducao &6|◬◬◬◬◬◬",
            "",
            "&fCalcas gloriosas usadas pela FN em guerra",
            "&fque ganham honra a cada vitoria sobre o inimigo",
            "",
            "&c◈◈◈◈◈◈| &d&lDados &6|◈◈◈◈◈◈",
            ChatColor.YELLOW + "Nivel das calcas: 0",
            ChatColor.YELLOW + "Progresso de avanco:",
            ChatColor.GRAY + "[" + "■■■■■■■■■■" + ChatColor.GRAY + "]",
            "",
            "&f𳭊"
    );

    public static final SlimefunItemStack FN_GEAR_BOOTS = new SlimefunItemStack(
            "FN_GEAR_BOOTS",
            Slimefun.getMinecraftVersion().isAtLeast(MinecraftVersion.MINECRAFT_1_16) ?
                    Material.NETHERITE_BOOTS : Material.DIAMOND_BOOTS,
            "&cBotas de Combate Expedicionarias FN",
            "&c◬◬◬◬◬◬| &d&lIntroducao &6|◬◬◬◬◬◬",
            "",
            "&fOs soldados do exercito FN so queriam possuir estas botas historicas,",
            "&fmas elas foram escondidas pelos habitantes de Ziao",
            "",
            "&c◈◈◈◈◈◈| &d&lDados &6|◈◈◈◈◈◈",
            ChatColor.YELLOW + "Nivel das botas: 0",
            ChatColor.YELLOW + "Progresso de avanco:",
            ChatColor.GRAY + "[" + "■■■■■■■■■■" + ChatColor.GRAY + "]",
            "",
            "&f𳭊"
    );

    public static final SlimefunItemStack FN_STAFF_TP = new SlimefunItemStack(
            "FN_STAFF_TP",
            Material.BLAZE_ROD,
            "&cCajado de Teleporte",
            "",
            "&dClique direito para teleportar ate o bloco mirado",
            "",
            "&eUsos restantes: " + "&eusos",
            "",
            "&f𳭚"
    );

    public static final SlimefunItemStack FN_STAFF_INVI = new SlimefunItemStack(
            "FN_STAFF_INVI",
            Material.BLAZE_ROD,
            "&cCajado da Invisibilidade",
            "",
            "&dConcede 6s de invisibilidade",
            "&de tambem oculta sua armadura e seu nome!",
            "",
            "&eUsos restantes: " + "&eusos",
            "",
            "&f𳭚"
    );

    public static final SlimefunItemStack FN_STAFF_LOCOMOTION = new SlimefunItemStack(
            "FN_STAFF_LOCOMOTION",
            Material.BLAZE_ROD,
            "&cCajado de Deslocamento",
            "",
            "&dClique direito para selecionar uma entidade e",
            "&dmove-la ate o local do clique esquerdo",
            "",
            "&eUsos restantes: " + "&eusos",
            "&eEntidade armazenada: Nenhuma",
            "",
            "&f𳭚"
    );

    public static final SlimefunItemStack FN_STAFF_HELLFIRE = new SlimefunItemStack(
            "FN_STAFF_HELLFIRE",
            Material.BLAZE_ROD,
            "&cCajado do Fogo Infernal",
            "",
            "&dInvoca um circulo de fogo infernal",
            "&dEntidades dentro do circulo pegam fogo por 8s",
            "",
            "&eUsos restantes: " + "&eusos",
            "",
            "&f𳭉"
    );

    public static final SlimefunItemStack FN_STAFF_DEEPFREEZE = new SlimefunItemStack(
            "FN_STAFF_DEEPFREEZE",
            Material.BLAZE_ROD,
            "&cCajado do Congelamento Profundo",
            "",
            "&dInvoca um circulo de gelo",
            "&dEntidades dentro do circulo, por causa do frio,",
            "&drecebem 8s de Lentidao",
            "",
            "&eUsos restantes: " + "&eusos",
            "",
            "&f𳭉"
    );

    public static final SlimefunItemStack FN_STAFF_CONFUSION = new SlimefunItemStack(
            "FN_STAFF_CONFUSION",
            Material.BLAZE_ROD,
            "&cCajado da Confusao",
            "",
            "&dInvoca um circulo de confusao",
            "&dEntidades dentro do circulo",
            "&drecebem 8s de Nausea",
            "",
            "&eUsos restantes: " + "&eusos",
            "",
            "&f𳭉"
    );

    public static final SlimefunItemStack FN_STAFF_GRAVITY = new SlimefunItemStack(
            "FN_STAFF_GRAVITY",
            Material.BLAZE_ROD,
            "&cCajado Gravitacional",
            "",
            "&dInvoca um circulo gravitacional",
            "&dEntidades dentro do circulo sofrem efeitos de gravidade por 8s",
            "",
            "&eUsos restantes: " + "&eusos",
            "",
            "&f𳭉"
    );

    public static final SlimefunItemStack FN_STAFF_STALLION = new SlimefunItemStack(
            "FN_STAFF_STALLION",
            Material.BLAZE_ROD,
            "&cCajado do Corcel",
            "",
            "&dInvoca um cavalo esqueleto montavel",
            "&dNao pode ser montado novamente apos descer",
            "",
            "&eUsos restantes: " + "&eusos",
            "",
            "&f𳭚"
    );

    public static final SlimefunItemStack FN_STAFF_FORCE = new SlimefunItemStack(
            "FN_STAFF_FORCE",
            Material.BLAZE_ROD,
            "&cCajado do Vento",
            "",
            "&dClique direito invoca uma rajada a frente que empurra inimigos",
            "&dShift + clique direito invoca uma rajada na direcao oposta",
            "",
            "&eUsos restantes: " + "&eusos",
            "",
            "&f𳭉"
    );

    public static final SlimefunItemStack FN_STAFF_HEALING = new SlimefunItemStack(
            "FN_STAFF_HEALING",
            Material.BLAZE_ROD,
            "&cCajado da Cura",
            "",
            "&dClique direito invoca um circulo de cura",
            "&dCura quem o invocou por 8s enquanto estiver no circulo",
            "",
            "&eUsos restantes: " + "&eusos",
            "",
            "&f𳭉"
    );

    public static final SlimefunItemStack FN_STAFF_INVULNERABILITY = new SlimefunItemStack(
            "FN_STAFF_INVULNERABILITY",
            Material.BLAZE_ROD,
            "&cCajado da Invulnerabilidade",
            "",
            "&dClique direito invoca um circulo de invulnerabilidade",
            "&dProtege entidades no circulo contra qualquer dano por 8s",
            "",
            "&eUsos restantes: " + "&eusos",
            "",
            "&f𳭋"
    );

    public static final SlimefunItemStack FN_STAFF_EXPLOSION = new SlimefunItemStack(
            "FN_STAFF_EXPLOSION",
            Material.BLAZE_ROD,
            "&cCajado da Explosao",
            "",
            "&dClique direito faz o bloco mirado explodir, causando dano",

            "",
            "&eUsos restantes: " + "&eusos",
            "",
            "&f𳭋"
    );

    public static final SlimefunItemStack FN_STAFF_MUSTER = new SlimefunItemStack(
            "FN_STAFF_MUSTER",
            Material.BLAZE_ROD,
            "&cCajado do Agrupamento",
            "",
            "&dClique direito em um bloco para teleportar",
            "&dentidades num raio de 50 blocos ate ele",
            "",
            "&eUsos restantes: " + "&eusos",
            "",
            "&f𳭋"
    );

    public static final SlimefunItemStack FN_STAFF_AWARENESS = new SlimefunItemStack(
            "FN_STAFF_AWARENESS",
            Material.BLAZE_ROD,
            "&cCajado da Percepcao",
            "",
            "&dClique direito para obter informacoes de jogadores num raio de 50 blocos",
            "",
            "&eUsos restantes: " + "&eusos",
            "",
            "&f𳭚"
    );

    public static final SlimefunItemStack FN_STAFF_MINERALS = new SlimefunItemStack(
            "FN_STAFF_MINERALS",
            Material.BLAZE_ROD,
            "&cCajado dos Minerais",
            "",
            "&dClique direito para obter do cajado",
            "&dinformacoes magicas",
            "&dque o guiam ate onde os minerais estao",
            "",
            "&eUsos restantes: " + "&eusos",
            "",
            "&f𳭚"
    );

    public static final SlimefunItemStack FN_STAFF_FANGS = new SlimefunItemStack(
            "FN_STAFF_FANGS",
            Material.BLAZE_ROD,
            "&cCajado das Presas",
            "",
            "&dClique direito invoca Presas de Evocador",
            "&dcausando dano aos inimigos",
            "",
            "&eUsos restantes: " + "&eusos",
            "",
            "&f𳭉"
    );

    public static final SlimefunItemStack FN_STAFF_SKULLS = new SlimefunItemStack(
            "FN_STAFF_SKULLS",
            Material.BLAZE_ROD,
            "&cCajado das Caveiras do Wither",
            "",
            "&dClique direito dispara caveiras do Wither contra inimigos",
            "",
            "&eUsos restantes: " + "&eusos",
            "",
            "&f𳭉"
    );

    public static final SlimefunItemStack FN_STAFF_AIR_STRIDER = new SlimefunItemStack(
            "FN_STAFF_AIR_STRIDER",
            Material.BLAZE_ROD,
            "&cCajado do Voo Suspenso",
            "",
            "&dClique direito concede a habilidade de se mover no ar por 10s",
            "",
            "&eUsos restantes: " + "&eusos",
            "",
            "&f𳭚"
    );

    public static final SlimefunItemStack FN_STAFF_COBWEB = new SlimefunItemStack(
            "FN_STAFF_COBWEB",
            Material.BLAZE_ROD,
            "&cCajado da Teia",
            "",
            "&dClique direito em um bloco gera uma parede de teia",
            "",
            "&eUsos restantes: " + "&eusos",
            "",
            "&f𳭚"
    );

    public static final SlimefunItemStack FN_QUIVER = new SlimefunItemStack(
            "FN_QUIVER",
            Material.LEATHER,
            "&bAljava (Comum)",
            "",
            "&dClique direito para guardar flechas na aljava",
            "&dShift + clique direito para retirar flechas",
            "",
            "&eClique direito para alternar o status",
            "&eCapacidade: 192 flechas",
            "&eFlechas restantes: " + "&f0",
            "&eStatus: Fechado (sem flechas)",
            "",
            "&f𳭚"
    );

    public static final SlimefunItemStack FN_SPECTRAL_QUIVER = new SlimefunItemStack(
            "FN_SPECTRAL_QUIVER",
            Material.LEATHER,
            "&aAljava (Flechas Espectrais)",
            "",
            "&dClique direito para guardar flechas na aljava",
            "&dShift + clique direito para retirar flechas",
            "",
            "&eClique para abrir/fechar a aljava",
            "&eCapacidade: 192 flechas espectrais",
            "&eFlechas restantes: " + "&f0",
            "&eStatus: Fechado (sem flechas)",
            "",
            "&f𳭉"
    );

    public static final SlimefunItemStack FN_UPGRADED_QUIVER = new SlimefunItemStack(
            "FN_UPGRADED_QUIVER",
            Material.LEATHER,
            "&6Aljava Aprimorada (Comum)",
            "",
            "&dClique direito para guardar flechas na aljava",
            "&dShift + clique direito para retirar flechas",
            "",
            "&eClique direito para alternar o status",
            "&eCapacidade: 288 flechas",
            "&eFlechas restantes: " + "&f0",
            "&eStatus: Fechado (sem flechas)",
            "",
            "&f𳭉"
    );

    public static final SlimefunItemStack FN_UPGRADED_SPECTRAL_QUIVER = new SlimefunItemStack(
            "FN_UPGRADED_SPECTRAL_QUIVER",
            Material.LEATHER,
            "&cAljava Aprimorada (Flechas Espectrais)",
            "",
            "&dClique direito para guardar flechas na aljava",
            "&dShift + clique direito para retirar flechas",
            "",
            "&eClique direito para alternar o status",
            "&eCapacidade: 288 flechas",
            "&eFlechas restantes: " + "&f0",
            "&eStatus: Fechado (sem flechas)",
            "",
            "&f𳭋"
    );

    public static final SlimefunItemStack FN_HOE_5X5 = new SlimefunItemStack(
            "FN_HOE_5X5",
            Material.DIAMOND_HOE,
            "&cEnxada FN",
            "",
            "&dColhe automaticamente plantacoes numa area 5x5",
            "",
            "&f𳭚"
    );

    public static final SlimefunItemStack FN_HOE_5X5_AUTO_PLANT = new SlimefunItemStack(
            "FN_HOE_5X5_AUTO_PLANT",
            Material.DIAMOND_HOE,
            "&cEnxada Replantadora FN",
            "",
            "&dColhe automaticamente plantacoes numa area 5x5",
            "",
            "&dAo colher uma plantacao madura,",
            "&dreplanta automaticamente a cultura correspondente",
            "",
            "&f𳭉"
    );

    public static final SlimefunItemStack FN_GEM_INFERNO = new SlimefunItemStack(
            "FN_GEM_INFERNO",
            Material.EMERALD,
            "&cGema Infernal",
            "",
            "&eChance de incendiar inimigos num raio de 7 blocos",
            "",
            "&c◢◤◢◤◢◤ Chance &6◥◣◥◣◥◣",
            "&6⨳ Nivel I: " + "&e%",
            "&6⨳ Nivel II: " + "&e%",
            "&6⨳ Nivel III: " + "&e%",
            "&6⨳ Nivel IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&dArraste e solte a gema em qualquer espada para vincular",
            "",
            "&f𳭚"
    );

    public static final SlimefunItemStack FN_GEM_ARMOR_IMPAIR = new SlimefunItemStack(
            "FN_GEM_ARMOR_IMPAIR",
            Material.EMERALD,
            "&cGema Quebra-Armadura",
            "",
            "&eChance de causar dano extra de durabilidade",
            "&ea armadura do inimigo ao atacar",
            "",
            "&c◢◤◢◤◢◤ Chance &6◥◣◥◣◥◣",
            "&6⨳ Nivel I: " + "&e%",
            "&6⨳ Nivel II: " + "&e%",
            "&6⨳ Nivel III: " + "&e%",
            "&6⨳ Nivel IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&dArraste e solte a gema em qualquer espada ou machado para vincular",
            "",
            "&f𳭚"
    );

    public static final SlimefunItemStack FN_GEM_TELEPATHY = new SlimefunItemStack(
            "FN_GEM_TELEPATHY",
            Material.EMERALD,
            "&cGema da Telepatia",
            "",
            "&eBlocos minerados pela ferramenta correspondente",
            "&evao automaticamente para o inventario do jogador",
            "",
            "&dArraste e solte a gema em qualquer ferramenta para vincular",
            "",
            "&f𳭙"
    );

    public static final SlimefunItemStack FN_GEM_THUNDER = new SlimefunItemStack(
            "FN_GEM_THUNDER",
            Material.EMERALD,
            "&cGema do Relampago",
            "",
            "&eChance de atingir o inimigo com um raio",
            "",
            "&c◢◤◢◤◢◤ Chance &6◥◣◥◣◥◣",
            "&6⨳ Nivel I: " + "&e%",
            "&6⨳ Nivel II: " + "&e%",
            "&6⨳ Nivel III: " + "&e%",
            "&6⨳ Nivel IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&dArraste e solte a gema em qualquer espada ou machado para vincular",
            "",
            "&f𳭚"
    );

    public static final SlimefunItemStack FN_GEM_HASTY = new SlimefunItemStack(
            "FN_GEM_HASTY",
            Material.EMERALD,
            "&cGema da Pressa",
            "",
            "&eChance de ganhar 4s de Pressa",
            "&eao minerar",
            "",
            "&c◢◤◢◤◢◤ Chance &6◥◣◥◣◥◣",
            "&6⨳ Nivel I: " + "&e%",
            "&6⨳ Nivel II: " + "&e%",
            "&6⨳ Nivel III: " + "&e%",
            "&6⨳ Nivel IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&dArraste e solte a gema em qualquer ferramenta para vincular",
            "",
            "&f𳭚"
    );

    public static final SlimefunItemStack FN_GEM_THORN_AWAY = new SlimefunItemStack(
            "FN_GEM_THORN_AWAY",
            Material.EMERALD,
            "&cGema Anti-Espinhos",
            "",
            "&eChance de anular todo o dano de Espinhos",
            "",
            "&c◢◤◢◤◢◤ Chance &6◥◣◥◣◥◣",
            "&6⨳ Nivel I: " + "&e%",
            "&6⨳ Nivel II: " + "&e%",
            "&6⨳ Nivel III: " + "&e%",
            "&6⨳ Nivel IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&dArraste e solte a gema em qualquer armadura para vincular",
            "",
            "&f𳭚"
    );

    public static final SlimefunItemStack FN_GEM_IMPOSTOR = new SlimefunItemStack(
            "FN_GEM_IMPOSTOR",
            Material.EMERALD,
            "&cGema do Impostor",
            "",
            "&eChance de se teleportar atras do jogador que te atacou",
            "",
            "&c◢◤◢◤◢◤ Chance &6◥◣◥◣◥◣",
            "&6⨳ Nivel I: " + "&e%",
            "&6⨳ Nivel II: " + "&e%",
            "&6⨳ Nivel III: " + "&e%",
            "&6⨳ Nivel IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&dArraste e solte a gema em qualquer capacete para vincular",
            "",
            "&f𳭚"
    );

    public static final SlimefunItemStack FN_GEM_PSYCHOKINESIS = new SlimefunItemStack(
            "FN_GEM_PSYCHOKINESIS",
            Material.EMERALD,
            "&cGema da Vontade",
            "",
            "&eQuando uma flecha acerta um inimigo,",
            "&echance de teleporta-lo para a sua frente",
            "",
            "&c◢◤◢◤◢◤ Chance &6◥◣◥◣◥◣",
            "&6⨳ Nivel I: " + "&e%",
            "&6⨳ Nivel II: " + "&e%",
            "&6⨳ Nivel III: " + "&e%",
            "&6⨳ Nivel IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&dArraste e solte a gema em qualquer arco para vincular",
            "",
            "&f𳭚"
    );

    public static final SlimefunItemStack FN_GEM_AXETHROWIE = new SlimefunItemStack(
            "FN_GEM_AXETHROWIE",
            Material.EMERALD,
            "&cGema do Machado Voador",
            "",
            "&eConcede a habilidade de arremessar machados para ferir inimigos",
            "",
            "&dArraste e solte a gema em qualquer machado para vincular",
            "",
            "&f𳭚"
    );

    public static final SlimefunItemStack FN_GEM_TRI_SWORD = new SlimefunItemStack(
            "FN_GEM_TRI_SWORD",
            Material.EMERALD,
            "&cGema da Espada Triplice",
            "",
            "&eConcede a habilidade de arremessar espadas",
            "&eAo arremessar, mais duas espadas sao lancadas junto",
            "&ecapazes de cortar e ferir entidades",
            "",
            "&dArraste e solte a gema em qualquer espada para vincular",
            "",
            "&f𳭉"
    );

    public static final SlimefunItemStack FN_GEM_DAMNATION = new SlimefunItemStack(
            "FN_GEM_DAMNATION",
            Material.EMERALD,
            "&cGema da Danacao",
            "",
            "&eShift + clique direito na arma vinculada a esta gema",
            "&epara coloca-la em modo de combate",
            "&eNos proximos 8s, ela atacara",
            "&eo inimigo que voce estiver mirando",
            "",
            "&dArraste e solte a gema em qualquer espada ou machado para vincular",
            "",
            "&f𳭉"
    );

    public static final SlimefunItemStack FN_GEM_RETALIATE = new SlimefunItemStack(
            "FN_GEM_RETALIATE",
            Material.EMERALD,
            "&cGema da Lealdade",
            "",
            "&eFaz com que a arma arremessada",
            "&eretorne sozinha a mao do jogador apos acertar",
            "&eEsta gema requer uma das seguintes",
            "&egemas de arma arremessavel:",
            "&e- Gema da Danacao",
            "&e- Gema da Espada Triplice",
            "&e- Gema do Machado Voador",
            "",
            "&dArraste e solte a gema em qualquer espada ou machado para vincular",
            "",
            "&f𳭚"
    );

    public static final SlimefunItemStack FN_GEM_BLINDBIND = new SlimefunItemStack(
            "FN_GEM_BLINDBIND",
            Material.EMERALD,
            "&cGema da Cegueira",
            "",
            "&eChance de conceder ao inimigo atingido",
            "&e4 segundos de Cegueira",
            "",
            "&c◢◤◢◤◢◤ Chance &6◥◣◥◣◥◣",
            "&6⨳ Nivel I: " + "&e%",
            "&6⨳ Nivel II: " + "&e%",
            "&6⨳ Nivel III: " + "&e%",
            "&6⨳ Nivel IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&dArraste e solte a gema em qualquer arco para vincular",
            "",
            "&f𳭚"
    );

    public static final SlimefunItemStack FN_GEM_GUARDIAN = new SlimefunItemStack(
            "FN_GEM_GUARDIAN",
            Material.EMERALD,
            "&cGema do Guardiao",
            "",
            "&eChance de invocar, quando voce esta perto da morte,",
            "&eum zumbi guardiao para ajudar na luta.",
            "&eVoce precisa estar usando a armadura com esta gema",
            "&epara que o efeito seja ativado.",
            "&f- Remover a armadura correspondente cancela o efeito",
            "&f- Guardioes nao atacam outros guardioes,",
            "  &fapenas os donos de outros guardioes",
            "",
            "&c◢◤◢◤◢◤ Chance &6◥◣◥◣◥◣",
            "&6⨳ Nivel I: " + "&e%",
            "&6⨳ Nivel II: " + "&e%",
            "&6⨳ Nivel III: " + "&e%",
            "&6⨳ Nivel IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&dArraste e solte a gema em qualquer armadura para vincular",
            "",
            "&f𳭉"
    );

    public static final SlimefunItemStack FN_GEM_DISRUPTED = new SlimefunItemStack(
            "FN_GEM_DISRUPTED",
            Material.EMERALD,
            "&cGema da Perturbacao",
            "",
            "&eChance de impedir que o guardiao do inimigo seja invocado",
            "",
            "&c◢◤◢◤◢◤ Chance &6◥◣◥◣◥◣",
            "&6⨳ Nivel I: " + "&e%",
            "&6⨳ Nivel II: " + "&e%",
            "&6⨳ Nivel III: " + "&e%",
            "&6⨳ Nivel IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&dArraste e solte a gema em qualquer espada para vincular",
            "",
            "&f𳭚"
    );

    public static final SlimefunItemStack FN_GEM_ARROW_AVERT = new SlimefunItemStack(
            "FN_GEM_ARROW_AVERT",
            Material.EMERALD,
            "&cGema Desvio de Flechas",
            "",
            "&eChance de impedir que flechas de outros jogadores",
            "&ete causem dano",
            "",
            "&c◢◤◢◤◢◤ Chance &6◥◣◥◣◥◣",
            "&6⨳ Nivel I: " + "&e%",
            "&6⨳ Nivel II: " + "&e%",
            "&6⨳ Nivel III: " + "&e%",
            "&6⨳ Nivel IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&dArraste e solte a gema em qualquer arco para vincular",
            "",
            "&f𳭚"
    );

    public static final SlimefunItemStack FN_GEM_DEBERSERK = new SlimefunItemStack(
            "FN_GEM_DEBERSERK",
            Material.EMERALD,
            "&cGema da Resiliencia",
            "",
            "&eChance de reduzir em 30% o dano recebido de machados",
            "",
            "&c◢◤◢◤◢◤ Chance &6◥◣◥◣◥◣",
            "&6⨳ Nivel I: " + "&e%",
            "&6⨳ Nivel II: " + "&e%",
            "&6⨳ Nivel III: " + "&e%",
            "&6⨳ Nivel IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&dArraste e solte a gema em qualquer armadura para vincular",
            "",
            "&f𳭚"
    );

    public static final SlimefunItemStack FN_GEM_PARRY = new SlimefunItemStack(
            "FN_GEM_PARRY",
            Material.EMERALD,
            "&cGema do Bloqueio",
            "",
            "&eChance de reduzir em 25% o dano recebido de espadas",
            "",
            "&c◢◤◢◤◢◤ Chance &6◥◣◥◣◥◣",
            "&6⨳ Nivel I: " + "&e%",
            "&6⨳ Nivel II: " + "&e%",
            "&6⨳ Nivel III: " + "&e%",
            "&6⨳ Nivel IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&dArraste e solte a gema em qualquer armadura para vincular",
            "",
            "&f𳭚"
    );

    public static final SlimefunItemStack FN_GEM_FLAWLESS_UNBIND = new SlimefunItemStack(
            "FN_GEM_FLAWLESS_UNBIND",
            Material.DIAMOND,
            "&bGema de Desvinculo Impecavel",
            "",
            "&e% de chance de desvincular do item",
            "&euma gema selecionada",
            "",
            "&f&lComo usar",
            "&dSegure na mao direita a &cGema de Desvinculo",
            "&dSegure na mao esquerda &ca arma/armadura/ferramenta a desvincular",
            "&cClique direito &dpara desvincular",
            "",
            "&f𳭋"
    );

    public static final SlimefunItemStack FN_GEM_PRECIOUS_UNBIND = new SlimefunItemStack(
            "FN_GEM_PRECIOUS_UNBIND",
            Material.DIAMOND,
            "&dGema de Desvinculo Preciosa",
            "",
            "&e% de chance de desvincular do item",
            "&euma gema selecionada",
            "",
            "&f&lComo usar",
            "&dSegure na mao direita a &cGema de Desvinculo",
            "&dSegure na mao esquerda &ca arma/armadura/ferramenta a desvincular",
            "&cClique direito &dpara desvincular",
            "",
            "&f𳭉"
    );

    public static final SlimefunItemStack FN_GEM_BLEMISHED_UNBIND = new SlimefunItemStack(
            "FN_GEM_BLEMISHED_UNBIND",
            Material.DIAMOND,
            "&aGema de Desvinculo Imperfeita",
            "",
            "&e% de chance de desvincular do item",
            "&euma gema selecionada",
            "",
            "&f&lComo usar",
            "&dSegure na mao direita a &cGema de Desvinculo",
            "&dSegure na mao esquerda &ca arma/armadura/ferramenta a desvincular",
            "&cClique direito &dpara desvincular",
            "",
            "&f𳭚"
    );

    public static final SlimefunItemStack FN_GEM_DAMAGED_UNBIND = new SlimefunItemStack(
            "FN_GEM_DAMAGED_UNBIND",
            Material.DIAMOND,
            "&6Gema de Desvinculo Danificada",
            "",
            "&e% de chance de desvincular do item",
            "&euma gema selecionada",
            "",
            "&f&lComo usar",
            "&dSegure na mao direita a &cGema de Desvinculo",
            "&dSegure na mao esquerda &ca arma/armadura/ferramenta a desvincular",
            "&cClique direito &dpara desvincular",
            "",
            "&f𳭙"
    );

    public static final SlimefunItemStack FN_GEM_ADAMANTINE = new SlimefunItemStack(
            "FN_GEM_ADAMANTINE",
            Material.EMERALD,
            "&cGema Adamantina",
            "",
            "&eChance de evitar que sua arma/ferramenta",
            "&eperca durabilidade",
            "",
            "&c◢◤◢◤◢◤ Chance &6◥◣◥◣◥◣",
            "&6⨳ Nivel I: " + "&e%",
            "&6⨳ Nivel II: " + "&e%",
            "&6⨳ Nivel III: " + "&e%",
            "&6⨳ Nivel IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&dArraste e solte a gema em qualquer arma/ferramenta para vincular",
            "",
            "&f𳭙"
    );

    public static final SlimefunItemStack FN_GEM_STOUT = new SlimefunItemStack(
            "FN_GEM_STOUT",
            Material.EMERALD,
            "&cGema Robusta",
            "",
            "&eChance de evitar que sua armadura",
            "&eperca durabilidade",
            "",
            "&c◢◤◢◤◢◤ Chance &6◥◣◥◣◥◣",
            "&6⨳ Nivel I: " + "&e%",
            "&6⨳ Nivel II: " + "&e%",
            "&6⨳ Nivel III: " + "&e%",
            "&6⨳ Nivel IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&dArraste e solte a gema em qualquer armadura para vincular",
            "",
            "&f𳭙"
    );

    public static final SlimefunItemStack FN_GEM_AWAKEN = new SlimefunItemStack(
            "FN_GEM_AWAKEN",
            Material.EMERALD,
            "&cGema do Despertar",
            "",
            "&eChance de reviver no mesmo local apos a morte",
            "",
            "&c◢◤◢◤◢◤ Chance &6◥◣◥◣◥◣",
            "&6⨳ Nivel I: " + "&e%",
            "&6⨳ Nivel II: " + "&e%",
            "&6⨳ Nivel III: " + "&e%",
            "&6⨳ Nivel IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&dArraste e solte a gema em qualquer capacete para vincular",
            "",
            "&f𳭋"
    );

    public static final SlimefunItemStack FN_GEM_AVENGE = new SlimefunItemStack(
            "FN_GEM_AVENGE",
            Material.EMERALD,
            "&cGema da Vinganca",
            "",
            "&eApos a morte do jogador,",
            "&echance de invocar um Creeper carregado",
            "",
            "&c◢◤◢◤◢◤ Chance &6◥◣◥◣◥◣",
            "&6⨳ Nivel I: " + "&e%",
            "&6⨳ Nivel II: " + "&e%",
            "&6⨳ Nivel III: " + "&e%",
            "&6⨳ Nivel IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&dArraste e solte a gema em qualquer bota para vincular",
            "",
            "&f𳭚"
    );

    public static final SlimefunItemStack FN_GEM_ACHILLES_HEEL = new SlimefunItemStack(
            "FN_GEM_ACHILLES_HEEL",
            Material.EMERALD,
            "&cGema do Calcanhar de Aquiles",
            "",
            "&eQuando uma flecha acerta o ponto fatal de uma entidade,",
            "&echance de causar o dobro de dano",
            "",
            "&c◢◤◢◤◢◤ Chance &6◥◣◥◣◥◣",
            "&6⨳ Nivel I: " + "&e%",
            "&6⨳ Nivel II: " + "&e%",
            "&6⨳ Nivel III: " + "&e%",
            "&6⨳ Nivel IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&dArraste e solte a gema em qualquer arco ou besta para vincular",
            "",
            "&f𳭉"
    );

    public static final SlimefunItemStack FN_GEM_DISARMOR = new SlimefunItemStack(
            "FN_GEM_DISARMOR",
            Material.EMERALD,
            "&cGema Desarmadora",
            "",
            "&eChance de remover aleatoriamente",
            "&euma peca de armadura do inimigo",
            "",
            "&c◢◤◢◤◢◤ Chance &6◥◣◥◣◥◣",
            "&6⨳ Nivel I: " + "&e%",
            "&6⨳ Nivel II: " + "&e%",
            "&6⨳ Nivel III: " + "&e%",
            "&6⨳ Nivel IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&dArraste e solte a gema em qualquer espada ou machado para vincular",
            "",
            "&f𳭉"
    );

    public static final SlimefunItemStack FN_GEM_DISARM = new SlimefunItemStack(
            "FN_GEM_DISARM",
            Material.EMERALD,
            "&cGema do Desarme",
            "",
            "&eChance de remover aleatoriamente",
            "&ea arma que o inimigo segura",
            "",
            "&c◢◤◢◤◢◤ Chance &6◥◣◥◣◥◣",
            "&6⨳ Nivel I: " + "&e%",
            "&6⨳ Nivel II: " + "&e%",
            "&6⨳ Nivel III: " + "&e%",
            "&6⨳ Nivel IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&dArraste e solte a gema em qualquer espada ou machado para vincular",
            "",
            "&f𳭉"
    );

    public static final SlimefunItemStack FN_GEM_SMOKE_CRIMINAL = new SlimefunItemStack(
            "FN_GEM_SMOKE_CRIMINAL",
            Material.EMERALD,
            "&cGema do Fumaceiro",
            "",
            "&eQuando a vida estiver abaixo de 30%,",
            "&echance de ganhar 5s de invulnerabilidade",
            "&ee gerar fumaca ao redor para proteger o jogador",
            "",
            "&c◢◤◢◤◢◤ Chance &6◥◣◥◣◥◣",
            "&6⨳ Nivel I: " + "&e%",
            "&6⨳ Nivel II: " + "&e%",
            "&6⨳ Nivel III: " + "&e%",
            "&6⨳ Nivel IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&dArraste e solte a gema em qualquer bota para vincular",
            "",
            "&f𳭉"
    );

    public static final SlimefunItemStack FN_GEM_LIFESTEAL = new SlimefunItemStack(
            "FN_GEM_LIFESTEAL",
            Material.EMERALD,
            "&cGema do Roubo de Vida",
            "",
            "&eQuando sua vida nao estiver cheia,",
            "&eao atacar, chance de roubar 2 pontos de vida do inimigo",
            "",
            "&c◢◤◢◤◢◤ Chance &6◥◣◥◣◥◣",
            "&6⨳ Nivel I: " + "&e%",
            "&6⨳ Nivel II: " + "&e%",
            "&6⨳ Nivel III: " + "&e%",
            "&6⨳ Nivel IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&dArraste e solte a gema em qualquer espada ou machado para vincular",
            "",
            "&f𳭚"
    );

    public static final SlimefunItemStack FN_GEM_ATROPHY = new SlimefunItemStack(
            "FN_GEM_ATROPHY",
            Material.EMERALD,
            "&cGema da Atrofia",
            "",
            "&eChance de, ao atacar,",
            "&econceder ao inimigo 4s de Definhamento",
            "",
            "&c◢◤◢◤◢◤ Chance &6◥◣◥◣◥◣",
            "&6⨳ Nivel I: " + "&e%",
            "&6  - Definhamento nivel 1",
            "&6⨳ Nivel II: " + "&e%",
            "&6  - Definhamento nivel 2",
            "&6⨳ Nivel III: " + "&e%",
            "&6  - Definhamento nivel 3",
            "&6⨳ Nivel IV: " + "&e%",
            "&6  - Definhamento nivel 4",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&dArraste e solte a gema em qualquer espada ou machado para vincular",
            "",
            "&f𳭚"
    );

    public static final SlimefunItemStack FN_GEM_BANE = new SlimefunItemStack(
            "FN_GEM_BANE",
            Material.EMERALD,
            "&cGema da Perdicao",
            "",
            "&eChance de, ao atacar,",
            "&econceder ao inimigo 4s de Veneno",
            "",
            "&c◢◤◢◤◢◤ Chance &6◥◣◥◣◥◣",
            "&6⨳ Nivel I: " + "&e%",
            "&6  - Veneno nivel 1",
            "&6⨳ Nivel II: " + "&e%",
            "&6  - Veneno nivel 2",
            "&6⨳ Nivel III: " + "&e%",
            "&6  - Veneno nivel 3",
            "&6⨳ Nivel IV: " + "&e%",
            "&6  - Veneno nivel 4",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&dArraste e solte a gema em qualquer espada ou machado para vincular",
            "",
            "&f𳭚"
    );

    public static final SlimefunItemStack FN_GEM_SEDATE = new SlimefunItemStack(
            "FN_GEM_SEDATE",
            Material.EMERALD,
            "&cGema do Sedativo",
            "",
            "&eChance de, ao atacar,",
            "&econceder ao inimigo 4s de Lentidao",
            "",
            "&c◢◤◢◤◢◤ Chance &6◥◣◥◣◥◣",
            "&6⨳ Nivel I: " + "&e%",
            "&6  - Lentidao nivel 1",
            "&6⨳ Nivel II: " + "&e%",
            "&6  - Lentidao nivel 2",
            "&6⨳ Nivel III: " + "&e%",
            "&6  - Lentidao nivel 3",
            "&6⨳ Nivel IV: " + "&e%",
            "&6  - Lentidao nivel 4",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&dArraste e solte a gema em qualquer espada ou machado para vincular",
            "",
            "&f𳭚"
    );

    public static final SlimefunItemStack FN_GEM_DECREPIT = new SlimefunItemStack(
            "FN_GEM_DECREPIT",
            Material.EMERALD,
            "&cGema da Decrepitude",
            "",
            "&eChance de conceder ao inimigo 4s de Fraqueza",
            "",
            "&c◢◤◢◤◢◤ Chance &6◥◣◥◣◥◣",
            "&6⨳ Nivel I: " + "&e%",
            "&6  - Fraqueza nivel 1",
            "&6⨳ Nivel II: " + "&e%",
            "&6  - Fraqueza nivel 2",
            "&6⨳ Nivel III: " + "&e%",
            "&6  - Fraqueza nivel 3",
            "&6⨳ Nivel IV: " + "&e%",
            "&6  - Fraqueza nivel 4",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&dArraste e solte a gema em qualquer armadura para vincular",
            "",
            "&f𳭚"
    );

    public static final SlimefunItemStack FN_GEM_DECEPTION = new SlimefunItemStack(
            "FN_GEM_DECEPTION",
            Material.EMERALD,
            "&cGema do Engano",
            "",
            "&eChance de conceder ao inimigo 4s de Cegueira",
            "",
            "&c◢◤◢◤◢◤ Chance &6◥◣◥◣◥◣",
            "&6⨳ Nivel I: " + "&e%",
            "&6  - Cegueira nivel 1",
            "&6⨳ Nivel II: " + "&e%",
            "&6  - Cegueira nivel 2",
            "&6⨳ Nivel III: " + "&e%",
            "&6  - Cegueira nivel 3",
            "&6⨳ Nivel IV: " + "&e%",
            "&6  - Cegueira nivel 4",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&dArraste e solte a gema em qualquer armadura para vincular",
            "",
            "&f𳭚"
    );

    public static final SlimefunItemStack FN_GEM_CELERITY = new SlimefunItemStack(
            "FN_GEM_CELERITY",
            Material.EMERALD,
            "&cGema da Celeridade",
            "",
            "&eChance de conceder a voce mesmo 4s de Velocidade ao ser atingido",
            "",
            "&c◢◤◢◤◢◤ Chance &6◥◣◥◣◥◣",
            "&6⨳ Nivel I: " + "&e%",
            "&6  - Velocidade nivel 1",
            "&6⨳ Nivel II: " + "&e%",
            "&6  - Velocidade nivel 2",
            "&6⨳ Nivel III: " + "&e%",
            "&6  - Velocidade nivel 3",
            "&6⨳ Nivel IV: " + "&e%",
            "&6  - Velocidade nivel 4",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&dArraste e solte a gema em qualquer armadura para vincular",
            "",
            "&f𳭚"
    );

    public static final SlimefunItemStack FN_GEM_LOOT = new SlimefunItemStack(
            "FN_GEM_LOOT",
            Material.EMERALD,
            "&cGema da Pilhagem",
            "",
            "&eChance de roubar dinheiro do inimigo (4 pontos)",
            "&eFaca seu inimigo perder dinheiro!",
            "",
            "&c◢◤◢◤◢◤ Chance &6◥◣◥◣◥◣",
            "&6⨳ Nivel I: " + "&e%",
            "&6⨳ Nivel II: " + "&e%",
            "&6⨳ Nivel III: " + "&e%",
            "&6⨳ Nivel IV: " + "&e%",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&dArraste e solte a gema em qualquer espada ou machado para vincular",
            "",
            "&f𳭚"
    );

    public static final SlimefunItemStack FN_GEM_SHOCKWAVE = new SlimefunItemStack(
            "FN_GEM_SHOCKWAVE",
            Material.EMERALD,
            "&cGema da Onda de Choque",
            "",
            "&eChance de causar uma onda de choque",
            "&ede raio 8 que lanca e fere o inimigo",
            "",
            "&c◢◤◢◤◢◤ Chance &6◥◣◥◣◥◣",
            "&6⨳ Nivel I: " + "&e%",
            "&6  - Dano: &f3",
            "&6⨳ Nivel II: " + "&e%",
            "&6  - Dano: &f6",
            "&6⨳ Nivel III: " + "&e%",
            "&6  - Dano: &f9",
            "&6⨳ Nivel IV: " + "&e%",
            "&6  - Dano: &f12",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&dArraste e solte a gema em qualquer armadura para vincular",
            "",
            "&f𳭉"
    );

    public static final SlimefunItemStack FN_GEM_BERSERK = new SlimefunItemStack(
            "FN_GEM_BERSERK",
            Material.EMERALD,
            "&cGema da Furia",
            "",
            "&eChance de causar mais dano contra",
            "&einimigos quando sua vida estiver abaixo de 30%.",
            "&eQuanto maior o nivel da gema, mais letal!",
            "",
            "&c◢◤◢◤◢◤ Niveis &6◥◣◥◣◥◣",
            "&6⨳ Nivel I: " + "&e%",
            "&6  - Dano: &f+6% do dano base",
            "&6⨳ Nivel II: " + "&e%",
            "&6  - Dano: &f+12% do dano base",
            "&6⨳ Nivel III: " + "&e%",
            "&6  - Dano: &f+18% do dano base",
            "&6⨳ Nivel IV: " + "&e%",
            "&6  - Dano: &f+30% do dano base",
            "&c◢◤◢◤◢◤◢◤◢◤◢&6◣◥◣◥◣◥◣◥◣◥◣",
            "",
            "&dArraste e solte em uma espada ou machado",
            "&dpara vincular esta gema",
            "",
            "&f𳭉"
    );

    public static final SlimefunItemStack FN_GEM_UPGRADES_DISPLAY_ITEM = new SlimefunItemStack(
            "FN_GEM_UPGRADES_DISPLAY_ITEM",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("d3623521c8111ad29e9dcf7acc56085a9ab07da732d1518976aee61d0b3e3bd6")),
            "&bUpgrade de Nivel de Gema",
            "",
            "&dClique neste item para saber como aprimorar gemas",
            "&dea receita necessaria no Aprimorador de Gemas FN"
    );

    public static final SlimefunItemStack FN_GEM_DOWNGRADES_DISPLAY_ITEM = new SlimefunItemStack(
            "FN_GEM_DOWNGRADE_DISPLAY_ITEM",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("36161daa3589ec9c8187459ac36fd4dd2646c040678d3bfacb72a2210c6c801c")),
            "&bRebaixamento de Gema",
            "",
            "&dClique aqui para saber como rebaixar gemas",
            "&dea receita no Rebaixador de Gemas FN"
    );

    public static final SlimefunItemStack FN_GEM_FINE_JASPER_CRAFTING = new SlimefunItemStack(
            "FN_GEM_FINE_JASPER_CRAFTING",
            PlayerHead.getItemStack(PlayerSkin.fromHashCode("aac15f6fcf2ce963ef4ca71f1a8685adb97eb769e1d11194cbbd2e964a88978c")),
            "&bGema de Jaspe Refinado",
            "",
            "&fUma gema reluzente",
            "&fusada para aprimorar as gemas FN que voce utiliza"
    );

    public static final SlimefunItemStack FN_BLOCK_ROTATOR = new SlimefunItemStack(
            "FN_BLOCK_ROTATOR",
            Material.CLOCK,
            "&cRotacionador de Blocos FN",
            "",
            "&dClique direito para girar blocos direcionaveis.",
            "&d&f(como terracota, etc.)",
            "",
            "&dShift + clique direito inverte lajes, blocos de 2 de altura",
            "&de blocos direcionaveis &f(como degraus, escadas, etc.)",
            "",
            "&f𳭙"
    );

    public static final SlimefunItemStack FN_AUTO_LADDER = new SlimefunItemStack(
            "FN_AUTO_LADDER",
            Material.LADDER,
            "&cAutoescada FN",
            "",
            "&dColoca escadas automaticamente em blocos ate 8 de altura, para cima ou para baixo",
            "",
            "&f𳭙"
    );

    public static final SlimefunItemStack FN_ORIENT_PEARL = new SlimefunItemStack(
            "FN_ORIENT_PEARL",
            Material.ENDER_PEARL,
            "&cPerola Radiante FN",
            "",
            "&dUma perola do fim que teletransporta voce e",
            "&da entidade que estiver montando (como um cavalo)",
            "&djunto com voce",
            "",
            "&f𳭚"
    );

    public static final SlimefunItemStack FN_THROWABLE_TORCH = new SlimefunItemStack(
            "FN_THROWABLE_TORCH",
            Material.TORCH,
            "&cTocha Arremessavel FN",
            "",
            "&dClique direito para arremessar a tocha",
            "&dEla se posiciona automaticamente",
            "&dao cair no chao. Se atingir uma criatura,",
            "&dcausa 4 segundos de queimadura",
            "",
            "&f𳭚"
    );

    public static final SlimefunItemStack FN_JUKEBOX_I = new SlimefunItemStack(
            "FN_JUKEBOX_I",
            Material.JUKEBOX, "&5F&dN &fToca-discos &4I",
            "", "&eO toca-discos pode guardar e tocar discos inseridos",
            "&ee os reproduz em ordem",
            "",
            "&dArmazena ate &d&o3 discos",
            "",
            LoreBuilder.powerBuffer(512),
            LoreBuilder.powerPerSecond(3));

    public static final SlimefunItemStack FN_JUKEBOX_II = new SlimefunItemStack(
            "FN_JUKEBOX_II",
            Material.JUKEBOX, "&5F&dN &fToca-discos &4II",
            "", "&eO toca-discos pode guardar e tocar discos inseridos",
            "&ee os reproduz em ordem",
            "",
            "&dArmazena ate &d&o7 discos",
            "",
            LoreBuilder.powerBuffer(768),
            LoreBuilder.powerPerSecond(8));

    public static final SlimefunItemStack FN_JUKEBOX_III = new SlimefunItemStack(
            "FN_JUKEBOX_III",
            Material.JUKEBOX, "&5F&dN &fToca-discos &4III",
            "", "&eO toca-discos pode guardar e tocar discos inseridos",
            "&ee os reproduz em ordem",
            "",
            "&dArmazena ate &d&o12 discos",
            "",
            LoreBuilder.powerBuffer(1024),
            LoreBuilder.powerPerSecond(16));

}