package club.doki7.ffm.library;

import club.doki7.ffm.RawFunctionLoader;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import java.lang.foreign.*;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.VarHandle;
import java.util.Objects;

public enum WindowsLibraryLoader implements ILibraryLoader {
    INSTANCE;

    @Override
    public @NotNull ISharedLibrary loadLibrary(
            @NotNull String libName
    ) throws UnsatisfiedLinkError {
        try (Arena arena = Arena.ofConfined()) {
            MethodHandle h = Objects.requireNonNull(hLoadLibraryW);
            StructLayout captureStateLayout = Linker.Option.captureStateLayout();
            MemorySegment capturedState = arena.allocate(captureStateLayout);

            char[] charArray = libName.toCharArray();
            MemorySegment lpLibName = arena.allocate(ValueLayout.JAVA_SHORT, charArray.length + 1);
            lpLibName.copyFrom(MemorySegment.ofArray(charArray));

            MemorySegment result;
            try {
                result = (MemorySegment) h.invokeExact(capturedState, lpLibName);
            } catch (Throwable e) {
                throw new UnsatisfiedLinkError(e.getMessage());
            }

            if (result.equals(MemorySegment.NULL)) {
                VarHandle vh = captureStateLayout.varHandle(
                        MemoryLayout.PathElement.groupElement("GetLastError")
                );
                int lastError = (int) vh.get(capturedState, 0L);
                if (lastError < 0) {
                    throw new UnsatisfiedLinkError("LoadLibraryW error: unknown error");
                } else {
                    throw new UnsatisfiedLinkError("LoadLibraryW error: " + lastError);
                }
            }

            return new WindowsLibrary(result);
        }
    }

    private static final FunctionDescriptor DESCRIPTOR$LoadLibraryW = FunctionDescriptor.of(
            ValueLayout.ADDRESS, // returns HMODULE
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_SHORT) // LPCWSTR lpLibFileName
    );
    private static final @Nullable MethodHandle hLoadLibraryW;
    static {
        if (System.getProperty("os.name").toLowerCase().contains("windows")) {
            try {
                System.loadLibrary("kernel32");
            } catch (Throwable e) {
                throw new RuntimeException(e);
            }

            MemorySegment pfnLoadLibraryW = JavaSystemLibrary.INSTANCE.load("LoadLibraryW");
            hLoadLibraryW = RawFunctionLoader.linkWithOptions(
                    pfnLoadLibraryW,
                    DESCRIPTOR$LoadLibraryW,
                    Linker.Option.captureCallState("GetLastError")
            );
        } else {
            hLoadLibraryW = null;
        }
    }
}
