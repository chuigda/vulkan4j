package club.doki7.ffm;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;

@FunctionalInterface
public interface RawFunctionLoader {
    @NotNull MemorySegment apply(@NotNull String name);

    default @NotNull MemorySegment load(@NotNull String name) {
        return apply(name);
    }

    Linker nativeLinker = Linker.nativeLinker();

    static @Nullable MethodHandle link(@NotNull MemorySegment segment, FunctionDescriptor descriptor) {
        if (segment.equals(MemorySegment.NULL)) {
            return null;
        }

        return nativeLinker.downcallHandle(segment, descriptor);
    }

    static @Nullable MethodHandle linkWithOptions(
            @NotNull MemorySegment segment,
            FunctionDescriptor descriptor,
            Linker.Option ...options
    ) {
        if (segment.equals(MemorySegment.NULL)) {
            return null;
        }

        return nativeLinker.downcallHandle(segment, descriptor, options);
    }
}
