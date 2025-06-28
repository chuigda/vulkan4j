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

public enum LibcArena implements Arena {
    INSTANCE;

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

        if (HANDLE$aligned_alloc == null) {
            return allocateLegacy(byteSize, byteAlignment);
        }

        MemorySegment ms;
        try {
            ms = (MemorySegment) HANDLE$aligned_alloc.invokeExact(
                    MemorySegment.ofAddress(byteAlignment),
                    MemorySegment.ofAddress(byteSize)
            );
        } catch (Throwable e) {
            throw new RuntimeException("Failed to allocate memory", e);
        }

        if (ms.equals(MemorySegment.NULL)) {
            throw new OutOfMemoryError("Failed allocating memory with aligned_alloc");
        }

        ms = ms.reinterpret(byteSize);
        ms.fill((byte) 0);
        return ms;
    }

    public void free(@NotNull MemorySegment ms) {
        if (ms.equals(MemorySegment.NULL)) {
            return;
        }

        if (HANDLE$aligned_alloc == null) {
            freeLegacy(ms);
        }

        try {
            Objects.requireNonNull(HANDLE$free).invokeExact(ms);
        } catch (Throwable e) {
            throw new RuntimeException("Failed to free memory", e);
        }
    }

    @Override
    public @Nullable MemorySegment.Scope scope() {
        return null;
    }

    @Override
    public void close() {
        throw new UnsupportedOperationException("Cannot close CArena");
    }

    private static MemorySegment allocateLegacy(long byteSize, long byteAlignment) {
        final long pointerSize = ValueLayout.ADDRESS.byteSize();
        final long totalSize = byteSize + byteAlignment - 1 + pointerSize;

        MemorySegment rawMS;
        try {
            MethodHandle hMalloc = Objects.requireNonNull(HANDLE$malloc);
            rawMS = (MemorySegment) hMalloc.invokeExact(MemorySegment.ofAddress(totalSize));
        } catch (Throwable e) {
            throw new RuntimeException("Failed to allocate memory using malloc", e);
        }

        if (rawMS.equals(MemorySegment.NULL)) {
            throw new OutOfMemoryError("Failed allocating memory with malloc");
        }

        final long rawAddress = rawMS.address();
        final long alignedAddress = (rawAddress + pointerSize + byteAlignment - 1) & -byteAlignment;
        final long metadataAddress = alignedAddress - pointerSize;

        MemorySegment ms = MemorySegment.ofAddress(alignedAddress).reinterpret(byteSize);
        MemorySegment metadata = MemorySegment.ofAddress(metadataAddress).reinterpret(pointerSize);
        metadata.set(ValueLayout.ADDRESS, 0, rawMS);
        ms.fill((byte) 0);

        return ms;
    }

    private static void freeLegacy(@NotNull MemorySegment ms) {
        if (ms.equals(MemorySegment.NULL)) {
            return;
        }

        final long pointerSize = ValueLayout.ADDRESS.byteSize();
        final long metadataAddress = ms.address() - pointerSize;
        MemorySegment metadata = MemorySegment.ofAddress(metadataAddress).reinterpret(pointerSize);
        MemorySegment rawMS = metadata.get(ValueLayout.ADDRESS, 0);

        if (rawMS.equals(MemorySegment.NULL)) {
            throw new IllegalStateException("Memory segment does not have allocated memory");
        }

        try {
            Objects.requireNonNull(HANDLE$free).invokeExact(rawMS);
        } catch (Throwable e) {
            throw new RuntimeException("Failed to free memory", e);
        }
    }

    private static final FunctionDescriptor DESCRIPTOR$aligned_alloc = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            NativeLayout.C_SIZE_T,
            NativeLayout.C_SIZE_T
    );

    private static final FunctionDescriptor DESCRIPTOR$malloc = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            NativeLayout.C_SIZE_T
    );

    private static final FunctionDescriptor DESCRIPTOR$free = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
    );

    private static final @Nullable MethodHandle HANDLE$aligned_alloc = RawFunctionLoader.link(
            JavaSystemLibrary.INSTANCE.load("aligned_alloc"),
            DESCRIPTOR$aligned_alloc
    );
    private static final @Nullable MethodHandle HANDLE$malloc = RawFunctionLoader.link(
            JavaSystemLibrary.INSTANCE.load("malloc"),
            DESCRIPTOR$malloc
    );
    private static final MethodHandle HANDLE$free = RawFunctionLoader.link(
            JavaSystemLibrary.INSTANCE.load("free"),
            DESCRIPTOR$free
    );
}
