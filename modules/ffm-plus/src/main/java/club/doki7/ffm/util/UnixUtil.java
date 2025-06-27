package club.doki7.ffm.util;

import club.doki7.ffm.RawFunctionLoader;
import club.doki7.ffm.library.JavaSystemLibrary;
import org.jetbrains.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;
import java.nio.charset.StandardCharsets;
import java.util.Objects;

public final class UnixUtil {
    /// Force the {@link UnixUtil} class to be loaded, in order to avoid some initialization order
    /// issues.
    ///
    /// @implNote The loading of {@link UnixUtil} is done in the static initializer, involving
    /// retrieving several function handles. Thus, at the point you call the class methods, if the
    /// `UnixUtil` class has not been loaded yet, the loading process may reset the `dlerror` value,
    /// which is not what you want. This method is a workaround to force the class to be loaded and
    /// initialized, so that the function handles are already retrieved, and the `dlerror` value is
    /// not reset.
    public static void forceLoad() {}

    public static @Nullable String dlerror() {
        try {
            MethodHandle h = Objects.requireNonNull(hDlerror);
            MemorySegment result = (MemorySegment) h.invokeExact();
            if (result.equals(MemorySegment.NULL)) {
                return null;
            }
            return result.reinterpret(Long.MAX_VALUE).getString(0, StandardCharsets.UTF_8);
        } catch (Throwable e) {
            return "dlerror failed to retrieve error message: " + e.getMessage();
        }
    }

    private static final FunctionDescriptor DESCRIPTOR$dlerror =
            FunctionDescriptor.of(ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE));
    private static final @Nullable MethodHandle hDlerror;

    static {
        MemorySegment pfnDlerror = JavaSystemLibrary.INSTANCE.load("dlerror");
        if (pfnDlerror.equals(MemorySegment.NULL)) {
            hDlerror = null;
        } else {
            hDlerror = RawFunctionLoader.link(pfnDlerror, DESCRIPTOR$dlerror);
        }
    }
}
