package cc.design7.ffm;

import org.jetbrains.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

@FunctionalInterface
public interface RawFunctionLoader {
    MemorySegment apply(String name);

    Linker nativeLinker = Linker.nativeLinker();

    static @Nullable MethodHandle link(@Nullable MemorySegment segment, FunctionDescriptor descriptor) {
        if (segment == null) {
            return null;
        }

        if (segment.address() == 0) {
            return null;
        }

        return nativeLinker.downcallHandle(segment, descriptor);
    }
}
