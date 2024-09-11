package tech.icey.vk4j;

import java.lang.foreign.ValueLayout;

public final class NativeLayout {
    // TODO: detect pointer size at runtime to support both 32bit and 64bit, Windows and Linux
    public static final int POINTER_SIZE = 8;
    public static final int CLONG_SIZE = 8;
    public static final ValueLayout C_LONG = ValueLayout.JAVA_LONG;

    // TODO: I don't know if this is correct
    public static final ValueLayout C_SIZE_T = ValueLayout.ADDRESS;
}
