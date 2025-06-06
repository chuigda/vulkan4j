package club.doki7.ffm.bits;

import club.doki7.ffm.annotation.Unsigned;

/// On certain platforms, bitfields are packed from left to right.
///
/// For example, for the following
/// C struct:
///
/// {@snippet lang=c :
/// typedef struct {
///    uint8_t r : 3; // startBit = 0, endBit = 3
///    uint8_t g : 3; // startBit = 3, endBit = 6
///    uint8_t b : 2; // startBit = 6, endBit = 8
/// } rgb332_t;
/// }
///
/// The bitfield is packed as such:
///
/// {@snippet :
/// bit   765 432 10
/// value RRR GGG BB
/// }
///
/// So to read the {@code G} field, we need to shift the value right by 2 ({@code = 8 - endBit})
/// bits and mask it with 0x07 ({@code = (1 << (endBit - startBit)) - 1}).
final class BitfieldUtilImplL2R implements IBitfieldUtilImpl {
    @Override
    public boolean readBitUnchecked(@Unsigned byte value, @Unsigned int bit) {
        return ((value >>> (Byte.SIZE - bit - 1)) & 0x01) != 0;
    }

    @Override
    public boolean readBitUnchecked(@Unsigned short value, @Unsigned int bit) {
        return ((value >>> (Short.SIZE - bit - 1)) & 0x01) != 0;
    }

    @Override
    public boolean readBitUnchecked(@Unsigned int value, @Unsigned int bit) {
        return ((value >>> (Integer.SIZE - bit - 1)) & 0x01) != 0;
    }

    @Override
    public @Unsigned byte readBitsUnchecked(
            @Unsigned byte value,
            @Unsigned int startBit,
            @Unsigned int endBit
    ) {
        int shiftRight = Byte.SIZE - endBit;
        int mask = (1 << (endBit - startBit)) - 1;
        return (byte) ((value >>> shiftRight) & mask);
    }

    @Override
    public @Unsigned short readBitsUnchecked(
            @Unsigned short value,
            @Unsigned int startBit,
            @Unsigned int endBit
    ) {
        int shiftRight = Short.SIZE - endBit;
        int mask = (1 << (endBit - startBit)) - 1;
        return (short) ((value >>> shiftRight) & mask);
    }

    @Override
    public int readBitsUnchecked(
            @Unsigned int value,
            @Unsigned int startBit,
            @Unsigned int endBit
    ) {
        int shiftRight = Integer.SIZE - endBit;
        long mask = (1L << (endBit - startBit)) - 1;
        return (int) ((value >>> shiftRight) & mask);
    }

    @Override
    public @Unsigned byte writeBitUnchecked(
            @Unsigned byte value,
            @Unsigned int bit,
            boolean bitValue
    ) {
        if (bitValue) {
            return (byte) (value | (1 << (Byte.SIZE - bit - 1)));
        } else {
            return (byte) (value & ~(1 << (Byte.SIZE - bit - 1)));
        }
    }

    @Override
    public @Unsigned short writeBitUnchecked(
            @Unsigned short value,
            @Unsigned int bit,
            boolean bitValue
    ) {
        if (bitValue) {
            return (short) (value | (1 << (Short.SIZE - bit - 1)));
        } else {
            return (short) (value & ~(1 << (Short.SIZE - bit - 1)));
        }
    }

    @Override
    public @Unsigned int writeBitUnchecked(
            @Unsigned int value,
            @Unsigned int bit,
            boolean bitValue
    ) {
        if (bitValue) {
            return (value | (1 << (Integer.SIZE - bit - 1)));
        } else {
            return (value & ~(1 << (Integer.SIZE - bit - 1)));
        }
    }

    @Override
    public @Unsigned byte writeBitsUnchecked(
            @Unsigned byte value,
            @Unsigned int startBit,
            @Unsigned int endBit,
            @Unsigned byte bits
    ) {
        int shiftLeft = Byte.SIZE - endBit;
        int mask = (1 << (endBit - startBit)) - 1;
        int maskShifted = mask << shiftLeft;
        int bitsShifted = (bits & mask) << shiftLeft;
        return (byte) ((value & ~maskShifted) | bitsShifted);
    }

    @Override
    public @Unsigned short writeBitsUnchecked(
            @Unsigned short value,
            @Unsigned int startBit,
            @Unsigned int endBit,
            @Unsigned short bits
    ) {
        int shiftLeft = Short.SIZE - endBit;
        int mask = (1 << (endBit - startBit)) - 1;
        int maskShifted = mask << shiftLeft;
        int bitsShifted = (bits & mask) << shiftLeft;
        return (short) ((value & ~maskShifted) | bitsShifted);
    }

    @Override
    public @Unsigned int writeBitsUnchecked(
            @Unsigned int value,
            @Unsigned int startBit,
            @Unsigned int endBit,
            @Unsigned int bits
    ) {
        int shiftLeft = Integer.SIZE - endBit;
        long mask = (1L << (endBit - startBit)) - 1;
        long maskShifted = mask << shiftLeft;
        long bitsShifted = (bits & mask) << shiftLeft;
        return (int) ((value & ~maskShifted) | bitsShifted);
    }

    BitfieldUtilImplL2R() {}
}
