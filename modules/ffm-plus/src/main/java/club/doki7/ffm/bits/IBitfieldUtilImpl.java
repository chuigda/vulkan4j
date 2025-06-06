package club.doki7.ffm.bits;

import club.doki7.ffm.annotation.Unsigned;

sealed interface IBitfieldUtilImpl permits BitfieldUtilImplL2R, BitfieldUtilImplR2L {
    boolean readBitUnchecked(@Unsigned byte value, @Unsigned int bit);
    boolean readBitUnchecked(@Unsigned short value, @Unsigned int bit);
    boolean readBitUnchecked(@Unsigned int value, @Unsigned int bit);

    @Unsigned
    byte readBitsUnchecked(@Unsigned byte value, @Unsigned int startBit, @Unsigned int endBit);
    @Unsigned
    short readBitsUnchecked(@Unsigned short value, @Unsigned int startBit, @Unsigned int endBit);
    @Unsigned
    int readBitsUnchecked(@Unsigned int value, @Unsigned int startBit, @Unsigned int endBit);

    @Unsigned
    byte writeBitUnchecked(@Unsigned byte value, @Unsigned int bit, boolean bitValue);
    @Unsigned
    short writeBitUnchecked(@Unsigned short value, @Unsigned int bit, boolean bitValue);
    @Unsigned
    int writeBitUnchecked(@Unsigned int value, @Unsigned int bit, boolean bitValue);

    @Unsigned
    byte writeBitsUnchecked(
            @Unsigned byte value,
            @Unsigned int startBit,
            @Unsigned int endBit,
            @Unsigned byte bits
    );
    @Unsigned
    short writeBitsUnchecked(
            @Unsigned short value,
            @Unsigned int startBit,
            @Unsigned int endBit,
            @Unsigned short bits
    );
    @Unsigned
    int writeBitsUnchecked(
            @Unsigned int value,
            @Unsigned int startBit,
            @Unsigned int endBit,
            @Unsigned int bits
    );
}
