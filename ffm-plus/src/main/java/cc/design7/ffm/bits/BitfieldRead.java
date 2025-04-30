package cc.design7.ffm.bits;

import cc.design7.ffm.annotation.unsigned;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.MemorySegment;

public final class BitfieldRead {
    public static @unsigned int readBits(
            MemorySegment segment,
            @unsigned int startBit,
            @unsigned int endBit
    ) {
        return switch ((int) segment.byteSize()) {
            case 1 -> readBits(segment.get(AddressLayout.JAVA_BYTE, 0), startBit, endBit);
            case 2 -> readBits(segment.get(AddressLayout.JAVA_SHORT, 0), startBit, endBit);
            case 4 -> readBits(segment.get(AddressLayout.JAVA_INT, 0), startBit, endBit);
            default -> throw new IllegalArgumentException("Unsupported size: " + segment.byteSize());
        };
    }

    public static @unsigned byte readBits(
            @unsigned byte value,
            @unsigned int startBit,
            @unsigned int endBit
    ) {
        if (startBit > endBit) {
            throw new IllegalArgumentException("startBit must be less than or equal to endBit");
        }

        if (endBit > 8) {
            throw new IllegalArgumentException("endBit must be no bigger than 8");
        }

        return readBitsUnchecked(value, startBit, endBit);
    }

    public static @unsigned byte readBitsUnchecked(
            @unsigned byte value,
            @unsigned int startBit,
            @unsigned int endBit
    ) {
        int shiftRight = Byte.SIZE - endBit;
        int mask = (1 << (endBit - startBit)) - 1;
        return (byte) ((value >> shiftRight) & mask);
    }

    public static @unsigned short readBits(
            @unsigned short value,
            @unsigned int startBit,
            @unsigned int endBit
    ) {
        if (startBit > endBit) {
            throw new IllegalArgumentException("startBit must be less than or equal to endBit");
        }

        if (endBit > 16) {
            throw new IllegalArgumentException("endBit must be no bigger than 16");
        }

        int shiftRight = Short.SIZE - endBit;
        int mask = (1 << (endBit - startBit)) - 1;
        return (short) ((value >> shiftRight) & mask);
    }

    public static @unsigned short readBitsUnchecked(
            @unsigned short value,
            @unsigned int startBit,
            @unsigned int endBit
    ) {
        int shiftRight = Short.SIZE - endBit;
        int mask = (1 << (endBit - startBit)) - 1;
        return (short) ((value >> shiftRight) & mask);
    }

    public static @unsigned int readBits(
            @unsigned int value,
            @unsigned int startBit,
            @unsigned int endBit
    ) {
        if (startBit > endBit) {
            throw new IllegalArgumentException("startBit must be less than or equal to endBit");
        }

        if (endBit > 32) {
            throw new IllegalArgumentException("endBit must be no bigger than 32");
        }

        int shiftRight = Integer.SIZE - endBit;
        long mask = (1L << (endBit - startBit)) - 1;
        return (int) ((value >> shiftRight) & mask);
    }
}
