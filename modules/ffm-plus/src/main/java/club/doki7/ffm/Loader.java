package club.doki7.ffm;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

@Deprecated
public final class Loader {
    private static final Linker nativeLinker = Linker.nativeLinker();
    private static final SymbolLookup stdlibLookup = nativeLinker.defaultLookup();
    private static final SymbolLookup loaderLookup = SymbolLookup.loaderLookup();

    public static @NotNull MethodHandle loadFunction(String name, FunctionDescriptor descriptor) {
        return loaderLookup.find(name)
                .or(() -> stdlibLookup.find(name))
                .map(segment -> RawFunctionLoader.link(segment, descriptor))
                .orElseThrow(() -> new RuntimeException("native function " + name + " not found"));
    }

    public static @Nullable MethodHandle loadFunctionOrNull(String name, FunctionDescriptor descriptor) {
        return loaderLookup.find(name)
                .or(() -> stdlibLookup.find(name))
                .map(segment -> RawFunctionLoader.link(segment, descriptor))
                .orElse(null);
    }

    public static @NotNull MemorySegment loadFunction(String name) {
        return loaderLookup.find(name)
                .or(() -> stdlibLookup.find(name))
                .orElseThrow(() -> new RuntimeException("native function " + name + " not found"));
    }

    public static @Nullable MemorySegment loadFunctionOrNull(String name) {
        return loaderLookup.find(name)
                .or(() -> stdlibLookup.find(name))
                .orElse(null);
    }

    private Loader() {}
}
