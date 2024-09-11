package tech.icey.vk4j;

import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

public final class NativeLayout {
    public static final ValueLayout C_SIZE_T = ValueLayout.ADDRESS;
    public static final int POINTER_SIZE = (int) C_SIZE_T.byteSize();

    public static final ValueLayout C_LONG;
    public static final int C_LONG_SIZE;

    static {
        // See:
        //
        // https://en.cppreference.com/w/cpp/language/types#Data_models
        // https://github.com/LWJGL/lwjgl3/blob/813400f21ebfce5a9e1566cbf8ff96ca1d8f4921/modules/lwjgl/core/src/main/java/org/lwjgl/system/Pointer.java#L34
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
}
