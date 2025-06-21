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
