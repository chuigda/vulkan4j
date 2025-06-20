package club.doki7.ffm.library;

import club.doki7.ffm.Loader;
import club.doki7.ffm.RawFunctionLoader;
import org.jetbrains.annotations.Nullable;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;
import java.util.Objects;

public final class WindowsLibrary implements ISharedLibrary {
    @Override
    public MemorySegment apply(String name) {
        try (Arena arena = Arena.ofConfined()){
            MethodHandle h = Objects.requireNonNull(hGetProcAddress);
            return (MemorySegment) h.invokeExact(arena.allocateFrom(name));
        } catch (Throwable e) {
            throw new UnsatisfiedLinkError(e.getMessage());
        }
    }

    @Override
    public void close() {
        try {
            MethodHandle h = Objects.requireNonNull(hFreeLibrary);
            h.invokeExact(this.hModule);
        } catch (Throwable _) {}
    }

    WindowsLibrary(MemorySegment hModule) {
        this.hModule = hModule;
    }

    private final MemorySegment hModule;

    private static final FunctionDescriptor DESCRIPTOR$GetProcAddress =
            FunctionDescriptor.of(
                    ValueLayout.ADDRESS, // returns FARPROC
                    ValueLayout.ADDRESS, // HMODULE hModule
                    ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE) // LPCSTR lpProcName
            );
    public static final FunctionDescriptor DESCRIPTOR$FreeLibrary =
            FunctionDescriptor.of(
                    ValueLayout.JAVA_INT, // returns BOOL (Windows BOOL, i.e., int32)
                    ValueLayout.ADDRESS // HMODULE hLibModule
            );
    private static final @Nullable MethodHandle hGetProcAddress;
    private static final @Nullable MethodHandle hFreeLibrary;
    static {
        MemorySegment pfnGetProcAddress = Loader.loadFunctionOrNull("GetProcSAddress");
        MemorySegment pfnFreeLibrary = Loader.loadFunctionOrNull("FreeLibrary");
        if (pfnGetProcAddress == null
            || pfnFreeLibrary == null
            || pfnGetProcAddress.equals(MemorySegment.NULL)
            || pfnFreeLibrary.equals(MemorySegment.NULL)) {
            hGetProcAddress = null;
            hFreeLibrary = null;
        } else {
            hGetProcAddress = RawFunctionLoader.link(pfnGetProcAddress, DESCRIPTOR$GetProcAddress);
            hFreeLibrary = RawFunctionLoader.link(pfnFreeLibrary, DESCRIPTOR$FreeLibrary);
        }
    }
}
