package cc.design7.ffm;

import cc.design7.ffm.annotation.unsigned;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.util.ArrayList;
import java.util.List;

public final class NativeLayout {
    /// Memory layout of current JVM platform C {@code size_t} type.
    ///
    /// Currently, this field is set to {@link ValueLayout#ADDRESS}, whose JavaDoc claims that it
    /// has the same size and alignment with a C {@code size_t} type.
    public static final ValueLayout C_SIZE_T = ValueLayout.ADDRESS;
    public static final int POINTER_SIZE = (int) C_SIZE_T.byteSize();

    /// Memory layout of current JVM platform C {@code long} type.
    ///
    /// Currently, all 32bit platforms will use {@link ValueLayout#JAVA_INT}. For 64bit platforms,
    /// Windows will use {@link ValueLayout#JAVA_INT}, while other platforms will use
    /// {@link ValueLayout#JAVA_LONG}.
    ///
    /// The detection algorithm came from LWJGL3.
    /// @see <a href="https://github.com/LWJGL/lwjgl3/blob/813400f21ebfce5a9e1566cbf8ff96ca1d8f4921/modules/lwjgl/core/src/main/java/org/lwjgl/system/Pointer.java">lwjgl/core/src/main/java/org/lwgjl/system/Pointer.java</a>
    public static final ValueLayout C_LONG;
    public static final int C_LONG_SIZE;

    public static final @unsigned int UINT32_MAX = (~0);
    public static final @unsigned long UINT64_MAX = (~0L);

    static {
        if (POINTER_SIZE == 4) {
            // On typical 32bit platforms, long is 4 bytes
            C_LONG = ValueLayout.JAVA_INT;
        }
        else if (POINTER_SIZE == 8) {
            if (System.getProperty("os.name").toLowerCase().contains("windows")) {
                // On 64bit Windows, long is 4 bytes
                C_LONG = ValueLayout.JAVA_INT;
            } else {
                // Otherwise, long is 8 bytes
                C_LONG = ValueLayout.JAVA_LONG;
            }
        }
        else {
            throw new RuntimeException(String.format("unsupported pointer size: %d", POINTER_SIZE));
        }

        C_LONG_SIZE = (int) C_LONG.byteSize();
    }

    public static long readCLong(MemorySegment segment, long offset) {
        if (C_LONG == ValueLayout.JAVA_INT) {
            return segment.get(ValueLayout.JAVA_INT, offset);
        } else {
            return segment.get(ValueLayout.JAVA_LONG, offset);
        }
    }

    public static void writeCLong(MemorySegment segment, long offset, long value) {
        if (C_LONG == ValueLayout.JAVA_INT) {
            segment.set(ValueLayout.JAVA_INT, offset, (int) value);
        } else {
            segment.set(ValueLayout.JAVA_LONG, offset, value);
        }
    }

    public static long readCSizeT(MemorySegment segment, long offset) {
        return segment.get(ValueLayout.ADDRESS, offset).address();
    }

    public static void writeCSizeT(MemorySegment segment, long offset, long value) {
        segment.set(ValueLayout.ADDRESS, offset, MemorySegment.ofAddress(value));
    }

    /// Unlike {@link MemoryLayout#structLayout MemoryLayout.structLayout}, this function will
    /// automatically compute and add padding to the layout to ensure that each element is properly
    /// aligned. The resulting layout should be the same with a C struct layout.
    ///
    /// @param elements the elements of the struct
    /// @return the struct layout
    public static MemoryLayout structLayout(MemoryLayout... elements) {
        long currentSize = 0;
        long maxAlignment = 0;
        List<MemoryLayout> paddedElements = new ArrayList<>();

        for (MemoryLayout element : elements) {
            long alignment = element.byteAlignment();
            if (alignment > maxAlignment) {
                maxAlignment = alignment;
            }
            long padding = (alignment - (currentSize % alignment)) % alignment;
            if (padding != 0) {
                paddedElements.add(MemoryLayout.paddingLayout(padding));
                currentSize += padding;
            }

            paddedElements.add(element);
            currentSize += element.byteSize();
        }

        if (maxAlignment != 0) {
            long padding = (maxAlignment - (currentSize % maxAlignment)) % maxAlignment;
            if (padding != 0) {
                paddedElements.add(MemoryLayout.paddingLayout(padding));
            }
        }

        MemoryLayout[] paddedElementsArray = paddedElements.toArray(new MemoryLayout[0]);
        return MemoryLayout.structLayout(paddedElementsArray);
    }

    /// Currently forwards to {@link MemoryLayout#unionLayout}.
    public static MemoryLayout unionLayout(MemoryLayout... elements) {
        return MemoryLayout.unionLayout(elements);
    }

    private NativeLayout() {}
}
