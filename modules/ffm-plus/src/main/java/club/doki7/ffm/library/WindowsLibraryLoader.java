package club.doki7.ffm.library;

import club.doki7.ffm.Loader;
import club.doki7.ffm.RawFunctionLoader;
import club.doki7.ffm.util.WindowsUtil;
import org.jetbrains.annotations.Nullable;

import java.lang.foreign.Arena;
import java.lang.foreign.FunctionDescriptor;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;
import java.lang.invoke.MethodHandle;
import java.util.Objects;

public final class WindowsLibraryLoader implements ILibraryLoader {
    @Override
    public ISharedLibrary loadLibrary(String libName) throws UnsatisfiedLinkError {
        MemorySegment result;
        try (Arena arena = Arena.ofConfined()) {
            MethodHandle h = Objects.requireNonNull(hLoadLibraryW);

            char[] charArray = libName.toCharArray();
            MemorySegment lpLibName = arena.allocate(ValueLayout.JAVA_SHORT, charArray.length + 1);
            lpLibName.copyFrom(MemorySegment.ofArray(charArray));
            result = (MemorySegment) h.invokeExact(lpLibName);
        } catch (Throwable e) {
            throw new UnsatisfiedLinkError(e.getMessage());
        }

        if (result == MemorySegment.NULL) {
            int lastError = WindowsUtil.getLastError();
            if (lastError < 0) {
                throw new UnsatisfiedLinkError("Unknown error");
            } else {
                throw new UnsatisfiedLinkError("Windows LoadLibraryW error: " + lastError);
            }
        }

        return new WindowsLibrary(result);
    }

    private static final FunctionDescriptor DESCRIPTOR$LoadLibraryW = FunctionDescriptor.of(
            ValueLayout.ADDRESS, // returns HMODULE
            ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_SHORT) // LPCWSTR lpLibFileName
    );
    private static final @Nullable MethodHandle hLoadLibraryW;
    static {
        MemorySegment pfnLoadLibraryW = Loader.loadFunctionOrNull("LoadLibraryW");
        if (pfnLoadLibraryW == null || pfnLoadLibraryW.equals(MemorySegment.NULL)) {
            hLoadLibraryW = null;
        } else {
            hLoadLibraryW = RawFunctionLoader.link(pfnLoadLibraryW, DESCRIPTOR$LoadLibraryW);
        }
    }
}
