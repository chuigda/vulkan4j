package club.doki7.ffm.library;

import club.doki7.ffm.RawFunctionLoader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;
import java.util.Objects;

public final class UnixLibrary implements ISharedLibrary {
    @Override
    public @NotNull MemorySegment apply(@NotNull String libName) throws UnsatisfiedLinkError {
        try (Arena arena = Arena.ofConfined()){
            MethodHandle h = Objects.requireNonNull(hDlsym);
            MemorySegment nameSegment = arena.allocateFrom(libName);
            return (MemorySegment) h.invokeExact(library, nameSegment);
        } catch (Throwable e) {
            throw new UnsatisfiedLinkError("Failed to load symbol '" + libName + "': " + e.getMessage());
        }
    }

    @Override
    public void close() {
        try {
            MethodHandle h = Objects.requireNonNull(hDlclose);
            h.invokeExact(library);
        } catch (Throwable _) {}
    }

    UnixLibrary(MemorySegment library) {
        this.library = library;
    }

    private final MemorySegment library;

    private static final FunctionDescriptor DESCRIPTOR$dlsym =
            FunctionDescriptor.of(
                    ValueLayout.ADDRESS, // returns void*
                    ValueLayout.ADDRESS, // void *handle
                    ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE) // const char *symbol
            );
    private static final FunctionDescriptor DESCRIPTOR$dlclose =
            FunctionDescriptor.of(
                    ValueLayout.JAVA_INT, // returns int
                    ValueLayout.ADDRESS // void *handle
            );
    private static final @Nullable MethodHandle hDlsym;
    private static final @Nullable MethodHandle hDlclose;

    static {
        MemorySegment pfnDlsym = JavaSystemLibrary.INSTANCE.load("dlsym");
        MemorySegment pfnDlclose = JavaSystemLibrary.INSTANCE.load("dlclose");
        hDlsym = RawFunctionLoader.link(pfnDlsym, DESCRIPTOR$dlsym);
        hDlclose = RawFunctionLoader.link(pfnDlclose, DESCRIPTOR$dlclose);
    }
}
