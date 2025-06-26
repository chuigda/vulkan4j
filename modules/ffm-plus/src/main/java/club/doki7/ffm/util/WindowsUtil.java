package club.doki7.ffm.util;

import club.doki7.ffm.RawFunctionLoader;
import club.doki7.ffm.library.JavaSystemLibrary;
import org.jetbrains.annotations.Nullable;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.util.Objects;

public final class WindowsUtil {
    /// @deprecated According to documentation of {@link java.lang.foreign.Linker.Option Linker.Option},
    /// Windows `GetLastError` should be retrieved via `captureCallState`. This function is not
    /// correctly implemented and has known bugs.
    @Deprecated(forRemoval = true, since = "0.4.2")
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
        MemorySegment pfnGetLastError = JavaSystemLibrary.INSTANCE.load("GetLastError");
        if (pfnGetLastError.equals(MemorySegment.NULL)) {
            hGetLastError = null;
        } else {
            hGetLastError = RawFunctionLoader.link(pfnGetLastError, DESCRIPTOR$GetLastError);
        }
    }
}
