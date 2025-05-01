package cc.design7.ffm.bits;

import cc.design7.ffm.annotation.unsigned;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.MemorySegment;
import java.nio.ByteOrder;

public final class BitfieldUtil {
    public static @unsigned boolean readBit(MemorySegment segment, @unsigned int bit) {
        return switch ((int) segment.byteSize()) {
            case 1 -> readBit(segment.get(AddressLayout.JAVA_BYTE, 0), bit);
            case 2 -> readBit(segment.get(AddressLayout.JAVA_SHORT, 0), bit);
            case 4 -> readBit(segment.get(AddressLayout.JAVA_INT, 0), bit);
            default -> throw new IllegalArgumentException("Unsupported size: " + segment.byteSize());
        };
    }

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

    public static boolean readBit(
            @unsigned byte value,
            @unsigned int bit
    ) {
        if (bit > 7) {
            throw new IllegalArgumentException("bit must be no bigger than 7");
        }

        return impl.readBitUnchecked(value, bit);
    }

    public static boolean readBit(
            @unsigned short value,
            @unsigned int bit
    ) {
        if (bit > 15) {
            throw new IllegalArgumentException("bit must be no bigger than 15");
        }

        return impl.readBitUnchecked(value, bit);
    }

    public static boolean readBit(
            @unsigned int value,
            @unsigned int bit
    ) {
        if (bit > 31) {
            throw new IllegalArgumentException("bit must be no bigger than 31");
        }

        return impl.readBitUnchecked(value, bit);
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

        return impl.readBitsUnchecked(value, startBit, endBit);
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

        return impl.readBitsUnchecked(value, startBit, endBit);
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

        return impl.readBitsUnchecked(value, startBit, endBit);
    }

    private static final IBitfieldUtilImpl impl;
    static {
        // On most platforms, the bitfields are packed from right to left. However, on ARM platform,
        // the bitfields packing depends on the endianness.
        String arch = System.getProperty("os.arch").toLowerCase();
        if (arch.contains("arm") || arch.contains("aarch")) {
            if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
                impl = new BitfieldUtilImplL2R();
            } else {
                impl = new BitfieldUtilImplR2L();
            }
        } else {
            // May need future refinement, but adequate
            impl = new BitfieldUtilImplR2L();
        }
    }
}
