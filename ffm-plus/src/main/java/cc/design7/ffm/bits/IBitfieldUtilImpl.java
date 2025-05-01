package cc.design7.ffm.bits;

import cc.design7.ffm.annotation.unsigned;

sealed interface IBitfieldUtilImpl permits BitfieldUtilImplL2R, BitfieldUtilImplR2L {
    boolean readBitUnchecked(@unsigned byte value, @unsigned int bit);
    boolean readBitUnchecked(@unsigned short value, @unsigned int bit);
    boolean readBitUnchecked(@unsigned int value, @unsigned int bit);

    @unsigned byte readBitsUnchecked(@unsigned byte value, @unsigned int startBit, @unsigned int endBit);
    @unsigned short readBitsUnchecked(@unsigned short value, @unsigned int startBit, @unsigned int endBit);
    @unsigned int readBitsUnchecked(@unsigned int value, @unsigned int startBit, @unsigned int endBit);

    @unsigned byte writeBitUnchecked(@unsigned byte value, @unsigned int bit, boolean bitValue);
    @unsigned short writeBitUnchecked(@unsigned short value, @unsigned int bit, boolean bitValue);
    @unsigned int writeBitUnchecked(@unsigned int value, @unsigned int bit, boolean bitValue);

    @unsigned byte writeBitsUnchecked(
            @unsigned byte value,
            @unsigned int startBit,
            @unsigned int endBit,
            @unsigned byte bits
    );
    @unsigned short writeBitsUnchecked(
            @unsigned short value,
            @unsigned int startBit,
            @unsigned int endBit,
            @unsigned short bits
    );
    @unsigned int writeBitsUnchecked(
            @unsigned int value,
            @unsigned int startBit,
            @unsigned int endBit,
            @unsigned int bits
    );
}
