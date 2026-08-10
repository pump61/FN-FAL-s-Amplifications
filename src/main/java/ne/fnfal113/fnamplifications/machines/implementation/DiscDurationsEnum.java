package ne.fnfal113.fnamplifications.machines.implementation;

public enum DiscDurationsEnum {

    MUSIC_DISC_13(180),
    MUSIC_DISC_CAT(185),
    MUSIC_DISC_BLOCKS(545),
    MUSIC_DISC_CHIRP(185),
    MUSIC_DISC_FAR(174),
    MUSIC_DISC_MALL(197),
    MUSIC_DISC_MELLOHI(96),
    MUSIC_DISC_STAL(150),
    MUSIC_DISC_STRAD(188),
    MUSIC_DISC_WARD(251),
    MUSIC_DISC_11(71),
    MUSIC_DISC_WAIT(235),
    MUSIC_DISC_OTHERSIDE(180),
    MUSIC_DISC_PIGSTEP(148),
    // Discs added in later Minecraft versions (Trails & Tales, Tricky Trials, Minecraft Movie update).
    // Durations from the official track lengths (minecraft.wiki/w/Music_Disc).
    MUSIC_DISC_5(178),
    MUSIC_DISC_RELIC(219),
    MUSIC_DISC_CREATOR(176),
    MUSIC_DISC_CREATOR_MUSIC_BOX(73),
    MUSIC_DISC_PRECIPICE(299),
    MUSIC_DISC_TEARS(175),
    MUSIC_DISC_LAVA_CHICKEN(135),
    MUSIC_DISC_BOUNCE(234),
    ;

    private final int durationInSec;

    DiscDurationsEnum(int durationInSec) {
        this.durationInSec = durationInSec;
    }

    public int getDurationInSec(){
        return durationInSec;
    }

    /**
     * Same as {@link #valueOf(String)} but falls back to {@code defaultSeconds} instead of
     * throwing when Mojang ships a new music disc this enum hasn't been updated for yet -
     * an unmapped disc used to disable the whole jukebox machine (see FN_JUKEBOX_II crash
     * on Minecraft Tears/Bounce/Lava Chicken discs before this enum knew about them).
     */
    public static int getDurationInSecOrDefault(String materialName, int defaultSeconds) {
        try {
            return valueOf(materialName).getDurationInSec();
        } catch (IllegalArgumentException e) {
            return defaultSeconds;
        }
    }

}