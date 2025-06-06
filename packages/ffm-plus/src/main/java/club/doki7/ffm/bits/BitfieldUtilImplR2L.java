package club.doki7.ffm.bits;

import club.doki7.ffm.annotation.Unsigned;

/// On certain platforms, bitfields are packed from right to left.
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
/// bit   76 543 210
/// value BB GGG RRR
/// }
///
/// So to read the {@code G} field, we need to shift the value right by 3 ({@code = startBit}) bits
/// and mask it with 0x07 ({@code = (1 << (endBit - startBit)) - 1}).
final class BitfieldUtilImplR2L implements IBitfieldUtilImpl {
    @Override
    public @Unsigned boolean readBitUnchecked(@Unsigned byte value, @Unsigned int bit) {
        return ((value >>> bit) & 0x01) != 0;
    }

    @Override
    public @Unsigned boolean readBitUnchecked(@Unsigned short value, @Unsigned int bit) {
        return ((value >>> bit) & 0x01) != 0;
    }

    @Override
    public @Unsigned boolean readBitUnchecked(@Unsigned int value, @Unsigned int bit) {
        return ((value >>> bit) & 0x01) != 0;
    }

    @Override
    public @Unsigned byte readBitsUnchecked(
            @Unsigned byte value,
            @Unsigned int startBit,
            @Unsigned int endBit
    ) {
        int mask = (1 << (endBit - startBit)) - 1;
        return (byte) ((value >>> startBit) & mask);
    }

    @Override
    public @Unsigned short readBitsUnchecked(
            @Unsigned short value,
            @Unsigned int startBit,
            @Unsigned int endBit
    ) {
        int mask = (1 << (endBit - startBit)) - 1;
        return (short) ((value >>> startBit) & mask);
    }

    @Override
    public @Unsigned int readBitsUnchecked(
            @Unsigned int value,
            @Unsigned int startBit,
            @Unsigned int endBit
    ) {
        long mask = (1L << (endBit - startBit)) - 1;
        return (int) ((value >>> startBit) & mask);
    }

    @Override
    public @Unsigned byte writeBitUnchecked(
            @Unsigned byte value,
            @Unsigned int bit,
            boolean bitValue
    ) {
        if (bitValue) {
            return (byte) (value | (1 << bit));
        } else {
            return (byte) (value & ~(1 << bit));
        }
    }

    @Override
    public @Unsigned short writeBitUnchecked(
            @Unsigned short value,
            @Unsigned int bit,
            boolean bitValue
    ) {
        if (bitValue) {
            return (short) (value | (1 << bit));
        } else {
            return (short) (value & ~(1 << bit));
        }
    }

    @Override
    public @Unsigned int writeBitUnchecked(
            @Unsigned int value,
            @Unsigned int bit,
            boolean bitValue
    ) {
        if (bitValue) {
            return value | (1 << bit);
        } else {
            return value & ~(1 << bit);
        }
    }

    @Override
    public @Unsigned byte writeBitsUnchecked(
            @Unsigned byte value,
            @Unsigned int startBit,
            @Unsigned int endBit,
            @Unsigned byte bits
    ) {
        int mask = (1 << (endBit - startBit)) - 1;
        int maskShifted = mask << startBit;
        int bitsShifted = (bits & mask) << startBit;
        return (byte) ((value & ~maskShifted) | bitsShifted);
    }

    @Override
    public @Unsigned short writeBitsUnchecked(
            @Unsigned short value,
            @Unsigned int startBit,
            @Unsigned int endBit,
            @Unsigned short bits
    ) {
        int mask = (1 << (endBit - startBit)) - 1;
        int maskShifted = mask << startBit;
        int bitsShifted = (bits & mask) << startBit;
        return (short) ((value & ~maskShifted) | bitsShifted);
    }

    @Override
    public @Unsigned int writeBitsUnchecked(
            @Unsigned int value,
            @Unsigned int startBit,
            @Unsigned int endBit,
            @Unsigned int bits
    ) {
        long mask = (1L << (endBit - startBit)) - 1;
        long maskShifted = mask << startBit;
        long bitsShifted = (bits & mask) << startBit;
        return (int) ((value & ~maskShifted) | bitsShifted);
    }

    BitfieldUtilImplR2L() {}
}
