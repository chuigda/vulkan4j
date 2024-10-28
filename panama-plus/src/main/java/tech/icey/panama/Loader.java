package tech.icey.panama;

import tech.icey.panama.annotation.nullable;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

public final class Loader {
    private static final Linker nativeLinker = Linker.nativeLinker();
    private static final SymbolLookup stdlibLookup = nativeLinker.defaultLookup();
    private static final SymbolLookup loaderLookup = SymbolLookup.loaderLookup();

    public static MethodHandle loadFunction(String name, FunctionDescriptor descriptor) {
        return loaderLookup.find(name)
                .or(() -> stdlibLookup.find(name))
                .map(segment -> RawFunctionLoader.link(segment, descriptor))
                .orElseThrow(() -> new RuntimeException("未找到函数 " + name));
    }

    public static @nullable MethodHandle loadFunctionOrNull(String name, FunctionDescriptor descriptor) {
        return loaderLookup.find(name)
                .or(() -> stdlibLookup.find(name))
                .map(segment -> RawFunctionLoader.link(segment, descriptor))
                .orElse(null);
    }

    public static MemorySegment loadFunction(String name) {
        return loaderLookup.find(name)
                .or(() -> stdlibLookup.find(name))
                .orElseThrow(() -> new RuntimeException("未找到函数 " + name));
    }

    public static MemorySegment loadFunctionOrNull(String name) {
        return loaderLookup.find(name)
                .or(() -> stdlibLookup.find(name))
                .orElse(null);
    }
}
