package cc.design7.ffm.bits;

import cc.design7.ffm.annotation.unsigned;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.MemorySegment;
import java.nio.ByteOrder;

public final class BitfieldUtil {
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
        // on both Windows and System V, bitfields are packed from "right to left"
        // on ARM, bitfield packing depends on the byte order

        // TODO this may be not very precise, needs refinement

        String osName = System.getProperty("os.name").toLowerCase();
        String arch = System.getProperty("os.arch").toLowerCase();

        if (osName.contains("windows") || osName.contains("linux")) {
            impl = new BitfieldUtilImplR2L();
        } else if (arch.contains("arm") || arch.contains("aarch")) {
            if (ByteOrder.nativeOrder() == ByteOrder.BIG_ENDIAN) {
                impl = new BitfieldUtilImplL2R();
            } else {
                impl = new BitfieldUtilImplR2L();
            }
        } else {
            throw new UnsupportedOperationException("Unsupported OS or architecture: " + osName + " " + arch);
        }
    }
}
