package tech.icey.panama;

import tech.icey.panama.annotation.nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

@FunctionalInterface
public interface RawFunctionLoader {
    MemorySegment apply(String name);

    Linker nativeLinker = Linker.nativeLinker();

    static @nullable MethodHandle link(@nullable MemorySegment segment, FunctionDescriptor descriptor) {
        if (segment == null) {
            return null;
        }

        if (segment.address() == 0) {
            return null;
        }

        return nativeLinker.downcallHandle(segment, descriptor);
    }
}
