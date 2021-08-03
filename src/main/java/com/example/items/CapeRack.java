package com.example.items;

import net.runelite.api.ItemID;

import java.util.HashSet;

public class CapeRack {
    private final HashSet<Integer> CapeRackHash;
    public boolean checkList(int Item)
    {
        return this.CapeRackHash.contains(Item);
    }
    public CapeRack()
    {
        this.CapeRackHash = new HashSet<Integer>();
        this.CapeRackHash.add(ItemID.ACHIEVEMENT_DIARY_HOOD);
        this.CapeRackHash.add(ItemID.ACHIEVEMENT_DIARY_CAPE);
        this.CapeRackHash.add(ItemID.ACHIEVEMENT_DIARY_CAPE_T);
        this.CapeRackHash.add(ItemID.AGILITY_HOOD);
        this.CapeRackHash.add(ItemID.AGILITY_CAPE);
        this.CapeRackHash.add(ItemID.AGILITY_CAPET);
        this.CapeRackHash.add(ItemID.ATTACK_HOOD);
        this.CapeRackHash.add(ItemID.ATTACK_CAPE);
        this.CapeRackHash.add(ItemID.ATTACK_CAPET);
        this.CapeRackHash.add(ItemID.CHAMPIONS_CAPE);
        this.CapeRackHash.add(ItemID.CONSTRUCT_HOOD);
        this.CapeRackHash.add(ItemID.CONSTRUCT_CAPE);
        this.CapeRackHash.add(ItemID.CONSTRUCT_CAPET);
        this.CapeRackHash.add(ItemID.COOKING_HOOD);
        this.CapeRackHash.add(ItemID.COOKING_CAPE);
        this.CapeRackHash.add(ItemID.COOKING_CAPET);
        this.CapeRackHash.add(ItemID.CRAFTING_HOOD);
        this.CapeRackHash.add(ItemID.CRAFTING_CAPE);
        this.CapeRackHash.add(ItemID.CRAFTING_CAPET);
        this.CapeRackHash.add(ItemID.DEFENCE_HOOD);
        this.CapeRackHash.add(ItemID.DEFENCE_CAPE);
        this.CapeRackHash.add(ItemID.DEFENCE_CAPET);
        this.CapeRackHash.add(ItemID.FARMING_HOOD);
        this.CapeRackHash.add(ItemID.FARMING_CAPE);
        this.CapeRackHash.add(ItemID.FARMING_CAPET);
        this.CapeRackHash.add(ItemID.FIRE_CAPE);
        this.CapeRackHash.add(ItemID.FIREMAKING_HOOD);
        this.CapeRackHash.add(ItemID.FIREMAKING_CAPE);
        this.CapeRackHash.add(ItemID.FIREMAKING_CAPET);
        this.CapeRackHash.add(ItemID.FISHING_HOOD);
        this.CapeRackHash.add(ItemID.FISHING_CAPE);
        this.CapeRackHash.add(ItemID.FISHING_CAPET);
        this.CapeRackHash.add(ItemID.FLETCHING_HOOD);
        this.CapeRackHash.add(ItemID.FLETCHING_CAPE);
        this.CapeRackHash.add(ItemID.FLETCHING_CAPET);
        this.CapeRackHash.add(ItemID.GAUNTLET_CAPE);
        this.CapeRackHash.add(ItemID.HERBLORE_HOOD);
        this.CapeRackHash.add(ItemID.HERBLORE_CAPE);
        this.CapeRackHash.add(ItemID.HERBLORE_CAPET);
        this.CapeRackHash.add(ItemID.HITPOINTS_HOOD);
        this.CapeRackHash.add(ItemID.HITPOINTS_CAPE);
        this.CapeRackHash.add(ItemID.HITPOINTS_CAPET);
        this.CapeRackHash.add(ItemID.HUNTER_HOOD);
        this.CapeRackHash.add(ItemID.HUNTER_CAPE);
        this.CapeRackHash.add(ItemID.HUNTER_CAPET);
        this.CapeRackHash.add(ItemID.INFERNAL_CAPE);
        this.CapeRackHash.add(ItemID.CAPE_OF_LEGENDS);
        this.CapeRackHash.add(ItemID.GUTHIX_CAPE);
        this.CapeRackHash.add(ItemID.IMBUED_GUTHIX_CAPE);
        this.CapeRackHash.add(ItemID.SARADOMIN_CAPE);
        this.CapeRackHash.add(ItemID.IMBUED_SARADOMIN_CAPE);
        this.CapeRackHash.add(ItemID.ZAMORAK_CAPE);
        this.CapeRackHash.add(ItemID.IMBUED_ZAMORAK_CAPE);
        this.CapeRackHash.add(ItemID.MAGIC_HOOD);
        this.CapeRackHash.add(ItemID.MAGIC_CAPE);
        this.CapeRackHash.add(ItemID.MAGIC_CAPET);
        this.CapeRackHash.add(ItemID.MAX_HOOD);
        this.CapeRackHash.add(ItemID.MAX_CAPE);
        this.CapeRackHash.add(ItemID.MINING_HOOD);
        this.CapeRackHash.add(ItemID.MINING_CAPE);
        this.CapeRackHash.add(ItemID.MINING_CAPET);
        this.CapeRackHash.add(ItemID.MUSIC_HOOD);
        this.CapeRackHash.add(ItemID.MUSIC_CAPE);
        this.CapeRackHash.add(ItemID.MUSIC_CAPET);
        this.CapeRackHash.add(ItemID.MYTHICAL_CAPE);
        this.CapeRackHash.add(ItemID.OBSIDIAN_CAPE);
        this.CapeRackHash.add(ItemID.PRAYER_HOOD);
        this.CapeRackHash.add(ItemID.PRAYER_CAPE);
        this.CapeRackHash.add(ItemID.PRAYER_CAPET);
        this.CapeRackHash.add(ItemID.QUEST_POINT_HOOD);
        this.CapeRackHash.add(ItemID.QUEST_POINT_CAPE);
        this.CapeRackHash.add(ItemID.QUEST_POINT_CAPE_T);
        this.CapeRackHash.add(ItemID.RANGING_HOOD);
        this.CapeRackHash.add(ItemID.RANGING_CAPE);
        this.CapeRackHash.add(ItemID.RANGING_CAPET);
        this.CapeRackHash.add(ItemID.RUNECRAFT_HOOD);
        this.CapeRackHash.add(ItemID.RUNECRAFT_CAPE);
        this.CapeRackHash.add(ItemID.RUNECRAFT_CAPET);
        this.CapeRackHash.add(ItemID.SOUL_CAPE);
        this.CapeRackHash.add(ItemID.SINHAZA_SHROUD_TIER_1);
        this.CapeRackHash.add(ItemID.SINHAZA_SHROUD_TIER_2);
        this.CapeRackHash.add(ItemID.SINHAZA_SHROUD_TIER_3);
        this.CapeRackHash.add(ItemID.SINHAZA_SHROUD_TIER_4);
        this.CapeRackHash.add(ItemID.SINHAZA_SHROUD_TIER_5);
        this.CapeRackHash.add(ItemID.SLAYER_HOOD);
        this.CapeRackHash.add(ItemID.SLAYER_CAPE);
        this.CapeRackHash.add(ItemID.SLAYER_CAPET);
        this.CapeRackHash.add(ItemID.SMITHING_HOOD);
        this.CapeRackHash.add(ItemID.SMITHING_CAPE);
        this.CapeRackHash.add(ItemID.SMITHING_CAPET);
        this.CapeRackHash.add(ItemID.SPOTTED_CAPE);
        this.CapeRackHash.add(ItemID.SPOTTIER_CAPE);
        this.CapeRackHash.add(ItemID.STRENGTH_HOOD);
        this.CapeRackHash.add(ItemID.STRENGTH_CAPE);
        this.CapeRackHash.add(ItemID.STRENGTH_CAPET);
        this.CapeRackHash.add(ItemID.THIEVING_HOOD);
        this.CapeRackHash.add(ItemID.THIEVING_CAPE);
        this.CapeRackHash.add(ItemID.THIEVING_CAPET);
        this.CapeRackHash.add(ItemID.VICTORS_CAPE_1);
        this.CapeRackHash.add(ItemID.VICTORS_CAPE_10);
        this.CapeRackHash.add(ItemID.VICTORS_CAPE_50);
        this.CapeRackHash.add(ItemID.VICTORS_CAPE_100);
        this.CapeRackHash.add(ItemID.VICTORS_CAPE_500);
        this.CapeRackHash.add(ItemID.VICTORS_CAPE_1000);
        this.CapeRackHash.add(ItemID.TEAM_CAPE_ZERO);
        this.CapeRackHash.add(ItemID.TEAM_CAPE_I);
        this.CapeRackHash.add(ItemID.TEAM_CAPE_X);
        this.CapeRackHash.add(ItemID.WOODCUTTING_HOOD);
        this.CapeRackHash.add(ItemID.WOODCUTTING_CAPE);
        this.CapeRackHash.add(ItemID.WOODCUT_CAPET);
        this.CapeRackHash.add(ItemID.XERICS_CHAMPION);
        this.CapeRackHash.add(ItemID.XERICS_GENERAL);
        this.CapeRackHash.add(ItemID.XERICS_GUARD);
        this.CapeRackHash.add(ItemID.XERICS_SENTINEL);
        this.CapeRackHash.add(ItemID.XERICS_WARRIOR);
        this.CapeRackHash.add(ItemID.TEAM1_CAPE);
        this.CapeRackHash.add(ItemID.TEAM2_CAPE);
        this.CapeRackHash.add(ItemID.TEAM3_CAPE);
        this.CapeRackHash.add(ItemID.TEAM4_CAPE);
        this.CapeRackHash.add(ItemID.TEAM5_CAPE);
        this.CapeRackHash.add(ItemID.TEAM6_CAPE);
        this.CapeRackHash.add(ItemID.TEAM7_CAPE);
        this.CapeRackHash.add(ItemID.TEAM8_CAPE);
        this.CapeRackHash.add(ItemID.TEAM9_CAPE);
        this.CapeRackHash.add(ItemID.TEAM10_CAPE);
        this.CapeRackHash.add(ItemID.TEAM11_CAPE);
        this.CapeRackHash.add(ItemID.TEAM12_CAPE);
        this.CapeRackHash.add(ItemID.TEAM13_CAPE);
        this.CapeRackHash.add(ItemID.TEAM14_CAPE);
        this.CapeRackHash.add(ItemID.TEAM15_CAPE);
        this.CapeRackHash.add(ItemID.TEAM16_CAPE);
        this.CapeRackHash.add(ItemID.TEAM17_CAPE);
        this.CapeRackHash.add(ItemID.TEAM18_CAPE);
        this.CapeRackHash.add(ItemID.TEAM19_CAPE);
        this.CapeRackHash.add(ItemID.TEAM20_CAPE);
        this.CapeRackHash.add(ItemID.TEAM21_CAPE);
        this.CapeRackHash.add(ItemID.TEAM22_CAPE);
        this.CapeRackHash.add(ItemID.TEAM23_CAPE);
        this.CapeRackHash.add(ItemID.TEAM24_CAPE);
        this.CapeRackHash.add(ItemID.TEAM25_CAPE);
        this.CapeRackHash.add(ItemID.TEAM26_CAPE);
        this.CapeRackHash.add(ItemID.TEAM27_CAPE);
        this.CapeRackHash.add(ItemID.TEAM28_CAPE);
        this.CapeRackHash.add(ItemID.TEAM29_CAPE);
        this.CapeRackHash.add(ItemID.TEAM30_CAPE);
        this.CapeRackHash.add(ItemID.TEAM31_CAPE);
        this.CapeRackHash.add(ItemID.TEAM32_CAPE);
        this.CapeRackHash.add(ItemID.TEAM33_CAPE);
        this.CapeRackHash.add(ItemID.TEAM34_CAPE);
        this.CapeRackHash.add(ItemID.TEAM35_CAPE);
        this.CapeRackHash.add(ItemID.TEAM36_CAPE);
        this.CapeRackHash.add(ItemID.TEAM37_CAPE);
        this.CapeRackHash.add(ItemID.TEAM38_CAPE);
        this.CapeRackHash.add(ItemID.TEAM39_CAPE);
        this.CapeRackHash.add(ItemID.TEAM40_CAPE);
        this.CapeRackHash.add(ItemID.TEAM41_CAPE);
        this.CapeRackHash.add(ItemID.TEAM42_CAPE);
        this.CapeRackHash.add(ItemID.TEAM43_CAPE);
        this.CapeRackHash.add(ItemID.TEAM44_CAPE);
        this.CapeRackHash.add(ItemID.TEAM45_CAPE);
        this.CapeRackHash.add(ItemID.TEAM46_CAPE);
        this.CapeRackHash.add(ItemID.TEAM47_CAPE);
        this.CapeRackHash.add(ItemID.TEAM48_CAPE);
        this.CapeRackHash.add(ItemID.TEAM49_CAPE);
        this.CapeRackHash.add(ItemID.TEAM50_CAPE);

    }
}
