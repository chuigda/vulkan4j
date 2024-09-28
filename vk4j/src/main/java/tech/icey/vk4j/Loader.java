package tech.icey.vk4j;

import tech.icey.vk4j.annotation.nullable;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;

public final class Loader {
    private static final Linker nativeLinker = Linker.nativeLinker();
    private static final SymbolLookup stdlibLookup = nativeLinker.defaultLookup();
    private static final SymbolLookup loaderLookup = SymbolLookup.loaderLookup();

    public static MethodHandle loadFunction(String name, FunctionDescriptor descriptor) {
        return loaderLookup.find(name)
                .or(() -> stdlibLookup.find(name))
                .map(symbolSegment -> nativeLinker.downcallHandle(symbolSegment, descriptor))
                .orElseThrow(() -> new RuntimeException("未找到函数 " + name));
    }

    public static @nullable MethodHandle loadFunctionOrNull(String name, FunctionDescriptor descriptor) {
        return loaderLookup.find(name)
                .or(() -> stdlibLookup.find(name))
                .map(symbolSegment -> nativeLinker.downcallHandle(symbolSegment, descriptor))
                .orElse(null);
    }
}
