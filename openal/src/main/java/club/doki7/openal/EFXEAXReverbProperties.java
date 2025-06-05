package club.doki7.openal;

import org.jetbrains.annotations.NotNull;

public final class EFXEAXReverbProperties {
    public final float flDensity;
    public final float flDiffusion;
    public final float flGain;
    public final float flGainHF;
    public final float flGainLF;
    public final float flDecayTime;
    public final float flDecayHFRatio;
    public final float flDecayLFRatio;
    public final float flReflectionsGain;
    public final float flReflectionsDelay;
    public final float @NotNull [] flReflectionsPan;
    public final float flLateReverbGain;
    public final float flLateReverbDelay;
    public final float @NotNull [] flLateReverbPan;
    public final float flEchoTime;
    public final float flEchoDepth;
    public final float flModulationTime;
    public final float flModulationDepth;
    public final float flAirAbsorptionGainHF;
    public final float flHFReference;
    public final float flLFReference;
    public final float flRoomRolloffFactor;
    public final int iDecayHFLimit;

    public EFXEAXReverbProperties(
            float flDensity,
            float flDiffusion,
            float flGain,
            float flGainHF,
            float flGainLF,
            float flDecayTime,
            float flDecayHFRatio,
            float flDecayLFRatio,
            float flReflectionsGain,
            float flReflectionsDelay,
            float @NotNull [] flReflectionsPan,
            float flLateReverbGain,
            float flLateReverbDelay,
            float @NotNull [] flLateReverbPan,
            float flEchoTime,
            float flEchoDepth,
            float flModulationTime,
            float flModulationDepth,
            float flAirAbsorptionGainHF,
            float flHFReference,
            float flLFReference,
            float flRoomRolloffFactor,
            int iDecayHFLimit
    ) {
        this.flDensity = flDensity;
        this.flDiffusion = flDiffusion;
        this.flGain = flGain;
        this.flGainHF = flGainHF;
        this.flGainLF = flGainLF;
        this.flDecayTime = flDecayTime;
        this.flDecayHFRatio = flDecayHFRatio;
        this.flDecayLFRatio = flDecayLFRatio;
        this.flReflectionsGain = flReflectionsGain;
        this.flReflectionsDelay = flReflectionsDelay;
        this.flReflectionsPan = flReflectionsPan;
        this.flLateReverbGain = flLateReverbGain;
        this.flLateReverbDelay = flLateReverbDelay;
        this.flLateReverbPan = flLateReverbPan;
        this.flEchoTime = flEchoTime;
        this.flEchoDepth = flEchoDepth;
        this.flModulationTime = flModulationTime;
        this.flModulationDepth = flModulationDepth;
        this.flAirAbsorptionGainHF = flAirAbsorptionGainHF;
        this.flHFReference = flHFReference;
        this.flLFReference = flLFReference;
        this.flRoomRolloffFactor = flRoomRolloffFactor;
        this.iDecayHFLimit = iDecayHFLimit;
    }
}
