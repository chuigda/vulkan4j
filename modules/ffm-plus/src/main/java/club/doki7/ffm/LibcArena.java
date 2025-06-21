package club.doki7.ffm;

import club.doki7.ffm.library.JavaSystemLibrary;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;
import java.util.Objects;

public final class LibcArena implements Arena {
    private static final FunctionDescriptor DESCRIPTOR$aligned_alloc = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            NativeLayout.C_SIZE_T,
            NativeLayout.C_SIZE_T
    );

    private static final FunctionDescriptor DESCRIPTOR$free = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
    );

    private static final MethodHandle HANDLE$aligned_alloc = RawFunctionLoader.link(
            Objects.requireNonNull(JavaSystemLibrary.INSTANCE.load("aligned_alloc")),
            DESCRIPTOR$aligned_alloc
    );
    private static final MethodHandle HANDLE$free = RawFunctionLoader.link(
            Objects.requireNonNull(JavaSystemLibrary.INSTANCE.load("free")),
            DESCRIPTOR$free
    );

    private LibcArena() {}

    public void free(@NotNull MemorySegment ms) {
        try {
            HANDLE$free.invokeExact(ms);
        } catch (Throwable _) {
            throw new RuntimeException("Failed to free memory");
        }
    }

    /// Allocates memory using system libc {@code aligned_alloc}
    ///
    /// Note that you're in charge of freeing the memory using {@link LibcArena#free}, otherwise
    /// there will be a memory leak. Be extra careful when using {@link LibcArena} in combination
    /// with `allocate` series methods.
    ///
    /// @param byteSize The size of the memory to allocate
    /// @param byteAlignment The alignment of the memory to allocate
    /// @return A {@link MemorySegment} representing the allocated memory with all bytes zeroed
    /// @throws IllegalArgumentException If the byte size or alignment is invalid
    /// @throws OutOfMemoryError If the memory allocation fails
    @Override
    public @NotNull MemorySegment allocate(long byteSize, long byteAlignment) {
        if (byteSize <= 0 || byteAlignment <= 0 || (byteAlignment & (byteAlignment - 1)) != 0) {
            throw new IllegalArgumentException("Invalid byte size or alignment");
        }

        MemorySegment ms;
        try {
            ms = (MemorySegment) HANDLE$aligned_alloc.invokeExact(
                    MemorySegment.ofAddress(byteAlignment),
                    MemorySegment.ofAddress(byteSize)
            );
        } catch (Throwable _) {
            throw new RuntimeException("Failed to allocate memory");
        }

        if (ms.address() == 0) {
            throw new OutOfMemoryError("Failed allocating memory with aligned_alloc");
        }

        ms = ms.reinterpret(byteSize);
        ms.fill((byte) 0);
        return ms;
    }

    @Override
    public @Nullable MemorySegment.Scope scope() {
        return null;
    }

    @Override
    public void close() {
        throw new UnsupportedOperationException("Cannot close CArena");
    }

    public static final LibcArena INSTANCE = new LibcArena();
}
