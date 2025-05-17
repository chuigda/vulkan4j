package club.doki7.ffm.bits;

import club.doki7.ffm.annotation.unsigned;
import org.jetbrains.annotations.NotNull;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.MemorySegment;
import java.nio.ByteOrder;

public final class BitfieldUtil {
    public static @unsigned boolean readBit(
            @NotNull MemorySegment segment,
            @unsigned int bit
    ) {
        return switch ((int) segment.byteSize()) {
            case 1 -> readBit(segment.get(AddressLayout.JAVA_BYTE, 0), bit);
            case 2 -> readBit(segment.get(AddressLayout.JAVA_SHORT, 0), bit);
            case 4 -> readBit(segment.get(AddressLayout.JAVA_INT, 0), bit);
            default -> throw new IllegalArgumentException("Unsupported size: " + segment.byteSize());
        };
    }

    public static @unsigned int readBits(
            @NotNull MemorySegment segment,
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

    public static void writeBit(
            @NotNull MemorySegment segment,
            @unsigned int bit,
            boolean bitValue
    ) {
        switch ((int) segment.byteSize()) {
            case 1 -> segment.set(AddressLayout.JAVA_BYTE, 0, writeBit(segment.get(AddressLayout.JAVA_BYTE, 0), bit, bitValue));
            case 2 -> segment.set(AddressLayout.JAVA_SHORT, 0, writeBit(segment.get(AddressLayout.JAVA_SHORT, 0), bit, bitValue));
            case 4 -> segment.set(AddressLayout.JAVA_INT, 0, writeBit(segment.get(AddressLayout.JAVA_INT, 0), bit, bitValue));
            default -> throw new IllegalArgumentException("Unsupported size: " + segment.byteSize());
        }
    }

    public static void writeBits(
            @NotNull MemorySegment segment,
            @unsigned int startBit,
            @unsigned int endBit,
            @unsigned int bits
    ) {
        switch ((int) segment.byteSize()) {
            case 1 -> segment.set(AddressLayout.JAVA_BYTE, 0, writeBits(segment.get(AddressLayout.JAVA_BYTE, 0), startBit, endBit, (byte) bits));
            case 2 -> segment.set(AddressLayout.JAVA_SHORT, 0, writeBits(segment.get(AddressLayout.JAVA_SHORT, 0), startBit, endBit, (short) bits));
            case 4 -> segment.set(AddressLayout.JAVA_INT, 0, writeBits(segment.get(AddressLayout.JAVA_INT, 0), startBit, endBit, bits));
            default -> throw new IllegalArgumentException("Unsupported size: " + segment.byteSize());
        }
    }

    public static boolean readBit(
            @unsigned byte value,
            @unsigned int bit
    ) {
        checkBitRange(bit, Byte.SIZE);
        return impl.readBitUnchecked(value, bit);
    }

    public static boolean readBit(
            @unsigned short value,
            @unsigned int bit
    ) {
        checkBitRange(bit, Short.SIZE);
        return impl.readBitUnchecked(value, bit);
    }

    public static boolean readBit(
            @unsigned int value,
            @unsigned int bit
    ) {
        checkBitRange(bit, Integer.SIZE);
        return impl.readBitUnchecked(value, bit);
    }

    public static @unsigned byte readBits(
            @unsigned byte value,
            @unsigned int startBit,
            @unsigned int endBit
    ) {
        checkBitRange(startBit, endBit, Byte.SIZE);
        return impl.readBitsUnchecked(value, startBit, endBit);
    }

    public static @unsigned short readBits(
            @unsigned short value,
            @unsigned int startBit,
            @unsigned int endBit
    ) {
        checkBitRange(startBit, endBit, Short.SIZE);
        return impl.readBitsUnchecked(value, startBit, endBit);
    }

    public static @unsigned int readBits(
            @unsigned int value,
            @unsigned int startBit,
            @unsigned int endBit
    ) {
        checkBitRange(startBit, endBit, Integer.SIZE);
        return impl.readBitsUnchecked(value, startBit, endBit);
    }

    public static @unsigned byte writeBit(
            @unsigned byte value,
            @unsigned int bit,
            boolean bitValue
    ) {
        checkBitRange(bit, Byte.SIZE);
        return impl.writeBitUnchecked(value, bit, bitValue);
    }

    public static @unsigned short writeBit(
            @unsigned short value,
            @unsigned int bit,
            boolean bitValue
    ) {
        checkBitRange(bit, Short.SIZE);
        return impl.writeBitUnchecked(value, bit, bitValue);
    }

    public static @unsigned int writeBit(
            @unsigned int value,
            @unsigned int bit,
            boolean bitValue
    ) {
        checkBitRange(bit, Integer.SIZE);
        return impl.writeBitUnchecked(value, bit, bitValue);
    }

    public static @unsigned byte writeBits(
            @unsigned byte value,
            @unsigned int startBit,
            @unsigned int endBit,
            @unsigned byte bits
    ) {
        checkBitRange(startBit, endBit, Byte.SIZE);
        return impl.writeBitsUnchecked(value, startBit, endBit, bits);
    }

    public static @unsigned short writeBits(
            @unsigned short value,
            @unsigned int startBit,
            @unsigned int endBit,
            @unsigned short bits
    ) {
        checkBitRange(startBit, endBit, Short.SIZE);
        return impl.writeBitsUnchecked(value, startBit, endBit, bits);
    }

    public static @unsigned int writeBits(
            @unsigned int value,
            @unsigned int startBit,
            @unsigned int endBit,
            @unsigned int bits
    ) {
        checkBitRange(startBit, endBit, Integer.SIZE);
        return impl.writeBitsUnchecked(value, startBit, endBit, bits);
    }

    private static void checkBitRange(int bit, int size) {
        if (bit < 0 || bit >= size) {
            throw new IllegalArgumentException("bit must be no less than 0 and less than " + size);
        }
    }

    private static void checkBitRange(int startBit, int endBit, int size) {
        if (startBit < 0 || endBit > size) {
            throw new IllegalArgumentException("startBit must be no less than 0 and endBit must be no more than " + size);
        }
        if (startBit >= endBit) {
            throw new IllegalArgumentException("startBit must be less than endBit");
        }
    }

    private static final @NotNull IBitfieldUtilImpl impl;
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
            // May need future refinement, but adequate for now.
            impl = new BitfieldUtilImplR2L();
        }
    }
}
