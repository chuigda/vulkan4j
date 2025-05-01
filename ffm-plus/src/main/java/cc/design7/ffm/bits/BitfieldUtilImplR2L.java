package cc.design7.ffm.bits;

import cc.design7.ffm.annotation.unsigned;

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
    public @unsigned boolean readBitUnchecked(@unsigned byte value, @unsigned int bit) {
        return ((value >>> bit) & 0x01) != 0;
    }

    @Override
    public @unsigned boolean readBitUnchecked(@unsigned short value, @unsigned int bit) {
        return ((value >>> bit) & 0x01) != 0;
    }

    @Override
    public @unsigned boolean readBitUnchecked(@unsigned int value, @unsigned int bit) {
        return ((value >>> bit) & 0x01) != 0;
    }

    @Override
    public @unsigned byte readBitsUnchecked(
            @unsigned byte value,
            @unsigned int startBit,
            @unsigned int endBit
    ) {
        int mask = (1 << (endBit - startBit)) - 1;
        return (byte) ((value >>> startBit) & mask);
    }

    @Override
    public @unsigned short readBitsUnchecked(
            @unsigned short value,
            @unsigned int startBit,
            @unsigned int endBit
    ) {
        int mask = (1 << (endBit - startBit)) - 1;
        return (short) ((value >>> startBit) & mask);
    }

    @Override
    public @unsigned int readBitsUnchecked(
            @unsigned int value,
            @unsigned int startBit,
            @unsigned int endBit
    ) {
        long mask = (1L << (endBit - startBit)) - 1;
        return (int) ((value >>> startBit) & mask);
    }

    @Override
    public @unsigned byte writeBitUnchecked(
            @unsigned byte value,
            @unsigned int bit,
            boolean bitValue
    ) {
        if (bitValue) {
            return (byte) (value | (1 << bit));
        } else {
            return (byte) (value & ~(1 << bit));
        }
    }

    @Override
    public @unsigned short writeBitUnchecked(
            @unsigned short value,
            @unsigned int bit,
            boolean bitValue
    ) {
        if (bitValue) {
            return (short) (value | (1 << bit));
        } else {
            return (short) (value & ~(1 << bit));
        }
    }

    @Override
    public @unsigned int writeBitUnchecked(
            @unsigned int value,
            @unsigned int bit,
            boolean bitValue
    ) {
        if (bitValue) {
            return value | (1 << bit);
        } else {
            return value & ~(1 << bit);
        }
    }

    @Override
    public @unsigned byte writeBitsUnchecked(
            @unsigned byte value,
            @unsigned int startBit,
            @unsigned int endBit,
            @unsigned byte bits
    ) {
        int mask = (1 << (endBit - startBit)) - 1;
        return (byte) ((value & ~mask) | ((bits << startBit) & mask));
    }

    @Override
    public @unsigned short writeBitsUnchecked(
            @unsigned short value,
            @unsigned int startBit,
            @unsigned int endBit,
            @unsigned short bits
    ) {
        int mask = (1 << (endBit - startBit)) - 1;
        return (short) ((value & ~mask) | ((bits << startBit) & mask));
    }

    @Override
    public @unsigned int writeBitsUnchecked(
            @unsigned int value,
            @unsigned int startBit,
            @unsigned int endBit,
            @unsigned int bits
    ) {
        long mask = (1L << (endBit - startBit)) - 1;
        return (int) ((value & ~mask) | ((bits << startBit) & mask));
    }

    BitfieldUtilImplR2L() {}
}
