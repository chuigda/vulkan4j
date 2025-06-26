package club.doki7.ffm.util;

import club.doki7.ffm.RawFunctionLoader;
import club.doki7.ffm.library.JavaSystemLibrary;
import org.jetbrains.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;
import java.util.Objects;

public final class WindowsUtil {
    /// Force the {@link WindowsUtil} class to be loaded and initialized, in order to avoid some
    /// initialization order issues.
    ///
    /// @implNote The loading of {@link WindowsUtil} is done in the static initializer, involving
    /// retrieving several function handles. Thus, at the point you call the class methods, if the
    /// `WindowsUtil` class has not been loaded yet, the loading process may reset the
    /// `GetLastError` value, which is not what you want. This method is a workaround to force the
    /// class to be loaded and initialized, so that the function handles are already retrieved, and
    /// the `GetLastError` value is not reset.
    public static void forceLoad() {}

    /// Retrieves the calling thread's last-error code value from the Windows API.
    ///
    /// @return -1 if the retrieval fails, otherwise returns the last-error code value.
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
        hGetLastError = RawFunctionLoader.link(pfnGetLastError, DESCRIPTOR$GetLastError);
    }
}
