package club.doki7.ffm.util;

import club.doki7.ffm.Loader;
import club.doki7.ffm.RawFunctionLoader;
import org.jetbrains.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;
import java.util.Objects;

public final class WindowsUtil {
    public static int getLastError() {
        try {
            MethodHandle h = Objects.requireNonNull(hGetLastError);
            return (int) h.invokeExact();
        } catch (Throwable e) {
            return -1;
        }
    }

    private static final FunctionDescriptor DESCRIPTOR$GetLastError =
            FunctionDescriptor.of(ValueLayout.JAVA_INT);
    private static final @Nullable MethodHandle hGetLastError;

    static {
        MemorySegment pfnGetLastError = Loader.loadFunctionOrNull("GetLastError");
        if (pfnGetLastError == null || pfnGetLastError.equals(MemorySegment.NULL)) {
            hGetLastError = null;
        } else {
            hGetLastError = RawFunctionLoader.link(pfnGetLastError, DESCRIPTOR$GetLastError);
        }
    }
}
