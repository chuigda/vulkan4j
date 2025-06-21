package club.doki7.ffm.library;

import club.doki7.ffm.RawFunctionLoader;
import club.doki7.ffm.util.UnixUtil;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;
import java.util.Objects;

public final class UnixLibraryLoader implements ILibraryLoader {
    @Override
    public @NotNull ISharedLibrary loadLibrary(@NotNull String libName) throws UnsatisfiedLinkError {
        if (!libName.startsWith("/")) {
            libName = "lib" + libName + ".so";
        }

        MemorySegment result;
        try (Arena arena = Arena.ofConfined()) {
            MethodHandle h = Objects.requireNonNull(hDlopen);
            MemorySegment nameSegment = arena.allocateFrom(libName);
            result = (MemorySegment) h.invokeExact(nameSegment, RTLD_LAZY | RTLD_LOCAL);
        } catch (Throwable e) {
            throw new UnsatisfiedLinkError(e.getMessage());
        }

        if (result.equals(MemorySegment.NULL)) {
            String error = UnixUtil.dlerror();
            if (error != null) {
                throw new UnsatisfiedLinkError("dlopen error: " + error);
            } else {
                throw new UnsatisfiedLinkError("dlopen error: unknown error");
            }
        }

        return new UnixLibrary(result);
    }

    public static final UnixLibraryLoader INSTANCE = new UnixLibraryLoader();

    private UnixLibraryLoader() {}

    private static final FunctionDescriptor DESCRIPTOR$dlopen = FunctionDescriptor.of(
            ValueLayout.ADDRESS, // returns void*
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE), // const char* filename
            ValueLayout.JAVA_INT // int flag
    );
    private static final @Nullable MethodHandle hDlopen;
    static {
        MemorySegment pfnDlopen = JavaSystemLibrary.INSTANCE.load("dlopen");
        if (pfnDlopen.equals(MemorySegment.NULL)) {
            hDlopen = null;
        } else {
            hDlopen = RawFunctionLoader.link(pfnDlopen, DESCRIPTOR$dlopen);
        }
    }

    private static final int RTLD_LAZY = 0x1;
    private static final int RTLD_LOCAL = 0;
}
