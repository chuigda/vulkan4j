package club.doki7.ffm.bits;

import club.doki7.ffm.annotation.Unsigned;
import org.jetbrains.annotations.NotNull;

import java.lang.foreign.AddressLayout;
import java.lang.foreign.MemorySegment;
import java.nio.ByteOrder;

public final class BitfieldUtil {
    public static @Unsigned boolean readBit(
            @NotNull MemorySegment segment,
            @Unsigned int bit
    ) {
        return switch ((int) segment.byteSize()) {
            case 1 -> readBit(segment.get(AddressLayout.JAVA_BYTE, 0), bit);
            case 2 -> readBit(segment.get(AddressLayout.JAVA_SHORT, 0), bit);
            case 4 -> readBit(segment.get(AddressLayout.JAVA_INT, 0), bit);
            default -> throw new IllegalArgumentException("Unsupported size: " + segment.byteSize());
        };
    }

    public static @Unsigned int readBits(
            @NotNull MemorySegment segment,
            @Unsigned int startBit,
            @Unsigned int endBit
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
            @Unsigned int bit,
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
            @Unsigned int startBit,
            @Unsigned int endBit,
            @Unsigned int bits
    ) {
        switch ((int) segment.byteSize()) {
            case 1 -> segment.set(AddressLayout.JAVA_BYTE, 0, writeBits(segment.get(AddressLayout.JAVA_BYTE, 0), startBit, endBit, (byte) bits));
            case 2 -> segment.set(AddressLayout.JAVA_SHORT, 0, writeBits(segment.get(AddressLayout.JAVA_SHORT, 0), startBit, endBit, (short) bits));
            case 4 -> segment.set(AddressLayout.JAVA_INT, 0, writeBits(segment.get(AddressLayout.JAVA_INT, 0), startBit, endBit, bits));
            default -> throw new IllegalArgumentException("Unsupported size: " + segment.byteSize());
        }
    }

    public static boolean readBit(
            @Unsigned byte value,
            @Unsigned int bit
    ) {
        checkBitRange(bit, Byte.SIZE);
        return impl.readBitUnchecked(value, bit);
    }

    public static boolean readBit(
            @Unsigned short value,
            @Unsigned int bit
    ) {
        checkBitRange(bit, Short.SIZE);
        return impl.readBitUnchecked(value, bit);
    }

    public static boolean readBit(
            @Unsigned int value,
            @Unsigned int bit
    ) {
        checkBitRange(bit, Integer.SIZE);
        return impl.readBitUnchecked(value, bit);
    }

    public static @Unsigned byte readBits(
            @Unsigned byte value,
            @Unsigned int startBit,
            @Unsigned int endBit
    ) {
        checkBitRange(startBit, endBit, Byte.SIZE);
        return impl.readBitsUnchecked(value, startBit, endBit);
    }

    public static @Unsigned short readBits(
            @Unsigned short value,
            @Unsigned int startBit,
            @Unsigned int endBit
    ) {
        checkBitRange(startBit, endBit, Short.SIZE);
        return impl.readBitsUnchecked(value, startBit, endBit);
    }

    public static @Unsigned int readBits(
            @Unsigned int value,
            @Unsigned int startBit,
            @Unsigned int endBit
    ) {
        checkBitRange(startBit, endBit, Integer.SIZE);
        return impl.readBitsUnchecked(value, startBit, endBit);
    }

    public static @Unsigned byte writeBit(
            @Unsigned byte value,
            @Unsigned int bit,
            boolean bitValue
    ) {
        checkBitRange(bit, Byte.SIZE);
        return impl.writeBitUnchecked(value, bit, bitValue);
    }

    public static @Unsigned short writeBit(
            @Unsigned short value,
            @Unsigned int bit,
            boolean bitValue
    ) {
        checkBitRange(bit, Short.SIZE);
        return impl.writeBitUnchecked(value, bit, bitValue);
    }

    public static @Unsigned int writeBit(
            @Unsigned int value,
            @Unsigned int bit,
            boolean bitValue
    ) {
        checkBitRange(bit, Integer.SIZE);
        return impl.writeBitUnchecked(value, bit, bitValue);
    }

    public static @Unsigned byte writeBits(
            @Unsigned byte value,
            @Unsigned int startBit,
            @Unsigned int endBit,
            @Unsigned byte bits
    ) {
        checkBitRange(startBit, endBit, Byte.SIZE);
        return impl.writeBitsUnchecked(value, startBit, endBit, bits);
    }

    public static @Unsigned short writeBits(
            @Unsigned short value,
            @Unsigned int startBit,
            @Unsigned int endBit,
            @Unsigned short bits
    ) {
        checkBitRange(startBit, endBit, Short.SIZE);
        return impl.writeBitsUnchecked(value, startBit, endBit, bits);
    }

    public static @Unsigned int writeBits(
            @Unsigned int value,
            @Unsigned int startBit,
            @Unsigned int endBit,
            @Unsigned int bits
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
