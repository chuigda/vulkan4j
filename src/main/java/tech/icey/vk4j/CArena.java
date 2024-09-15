package tech.icey.vk4j;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;

public final class CArena implements Arena {
    private static final FunctionDescriptor DESCRIPTOR$aligned_alloc = FunctionDescriptor.of(
            ValueLayout.ADDRESS,
            NativeLayout.C_SIZE_T,
            NativeLayout.C_SIZE_T
    );

    private static final FunctionDescriptor DESCRIPTOR$free = FunctionDescriptor.ofVoid(
            ValueLayout.ADDRESS
    );

    private static final MethodHandle HANDLE$aligned_alloc =
            Loader.loadFunction("aligned_alloc", DESCRIPTOR$aligned_alloc);
    private static final MethodHandle HANDLE$free =
            Loader.loadFunction("free", DESCRIPTOR$free);

    private CArena() {}

    @Override
    public MemorySegment allocate(long byteSize, long byteAlignment) {
        try {
            MemorySegment ms = (MemorySegment) HANDLE$aligned_alloc.invokeExact(byteAlignment, byteSize);
            ms = ms.reinterpret(byteSize);
            ms.fill((byte) 0);
            return ms;
        } catch (Throwable _) {
            throw new RuntimeException("Failed to allocate memory");
        }
    }

    @Override
    public MemorySegment.Scope scope() {
        return null;
    }

    @Override
    public void close() {
        throw new UnsupportedOperationException("Cannot close CArena");
    }

    public static final CArena INSTANCE = new CArena();
}
