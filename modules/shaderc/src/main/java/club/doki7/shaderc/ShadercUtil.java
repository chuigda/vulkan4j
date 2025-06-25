package club.doki7.shaderc;

import club.doki7.ffm.LibcArena;
import club.doki7.ffm.annotation.Bitmask;
import club.doki7.ffm.annotation.EnumType;
import club.doki7.ffm.annotation.NativeType;
import club.doki7.ffm.annotation.Pointer;
import club.doki7.ffm.ptr.BytePtr;
import club.doki7.shaderc.datatype.ShadercIncludeResult;
import club.doki7.shaderc.enumtype.ShadercIncludeType;
import org.jetbrains.annotations.NotNull;

import java.lang.foreign.Arena;
import java.lang.foreign.Linker;
import java.lang.foreign.MemorySegment;
import java.lang.invoke.MethodHandle;
import java.lang.invoke.MethodHandles;
import java.lang.invoke.MethodType;

public final class ShadercUtil {
    public static class IncludeResult {
        public final @NotNull String sourceName;
        public final @NotNull String content;

        public IncludeResult(@NotNull String sourceName, @NotNull String content) {
            this.sourceName = sourceName;
            this.content = content;
        }
    }

    @FunctionalInterface
    public interface IncludeResolve {
        IncludeResult resolve(
                String requestedSource,
                @EnumType(ShadercIncludeType.class) int includeType,
                String requestingSource,
                long includeDepth
        ) throws Exception;
    }

    public static class IncludeCallbacks {
        public final @NotNull MemorySegment pfnIncludeResolve;
        public final @NotNull MemorySegment pfnIncludeResultRelease;

        IncludeCallbacks(
                @NotNull MemorySegment pfnIncludeResolve,
                @NotNull MemorySegment pfnIncludeResultRelease
        ) {
            this.pfnIncludeResolve = pfnIncludeResolve;
            this.pfnIncludeResultRelease = pfnIncludeResultRelease;
        }
    }

    public static IncludeCallbacks makeCallbacks(Arena arena, IncludeResolve resolve) {
        MemorySegment pfnIncludeResolve = Linker.nativeLinker().upcallStub(
                hCallIncludeResolve.bindTo(resolve),
                ShadercFunctionTypes.shaderc_include_resolve_fn,
                arena
        );

        return new IncludeCallbacks(pfnIncludeResolve, pfnIncludeResultRelease);
    }

    private static @Pointer(target=ShadercIncludeResult.class) MemorySegment callIncludeResolve(
            IncludeResolve resolve,
            MemorySegment ignoredUserData,
            @NativeType("char const*") MemorySegment requestedSource,
            @EnumType(ShadercIncludeType.class) int includeType,
            @NativeType("char const*") MemorySegment requestingSource,
            MemorySegment includeDepth
    ) {
        String requestedSourceStr = new BytePtr(requestedSource).readString();
        String requestingSourceStr = new BytePtr(requestingSource).readString();

        ShadercIncludeResult result = ShadercIncludeResult.allocate(LibcArena.INSTANCE);
        try {
            IncludeResult r = resolve.resolve(
                    requestedSourceStr,
                    includeType,
                    requestingSourceStr,
                    includeDepth.address()
            );
            BytePtr sourceName = BytePtr.allocateString(LibcArena.INSTANCE, r.sourceName);
            BytePtr sourceContent = BytePtr.allocateString(LibcArena.INSTANCE, r.content);
            result.sourceName(sourceName)
                    .sourceNameLength(sourceName.size() - 1)
                    .content(sourceContent)
                    .contentLength(sourceContent.size() - 1)
                    .userData(MemorySegment.NULL);
        } catch (Exception e) {
            BytePtr errSourceContent = BytePtr.allocateString(LibcArena.INSTANCE, e.getMessage());
            result.sourceName(null)
                    .sourceNameLength(0)
                    .content(errSourceContent)
                    .contentLength(errSourceContent.size() - 1)
                    .userData(MemorySegment.NULL);
        }
        return result.segment();
    }

    private static void includeResultRelease(
            MemorySegment ignoredUserData,
            @Pointer(target=ShadercIncludeResult.class) MemorySegment result
    ) {
        ShadercIncludeResult r = new ShadercIncludeResult(result);
        LibcArena.INSTANCE.free(r.sourceNameRaw());
        LibcArena.INSTANCE.free(r.contentRaw());
        LibcArena.INSTANCE.free(result);
    }

    private static final MethodHandle hCallIncludeResolve;
    private static final MethodHandle hIncludeResultRelease;
    private static final MemorySegment pfnIncludeResultRelease;
    static {
        try {
            hCallIncludeResolve = MethodHandles.lookup().findStatic(
                    ShadercUtil.class,
                    "callIncludeResolve",
                    MethodType.methodType(
                            MemorySegment.class,
                            IncludeResolve.class,
                            MemorySegment.class,
                            MemorySegment.class,
                            int.class,
                            MemorySegment.class,
                            MemorySegment.class
                    )
            );
            hIncludeResultRelease = MethodHandles.lookup().findStatic(
                    ShadercUtil.class,
                    "includeResultRelease",
                    ShadercFunctionTypes.shaderc_include_result_release_fn.toMethodType()
            );
            pfnIncludeResultRelease = Linker.nativeLinker().upcallStub(
                    hIncludeResultRelease,
                    ShadercFunctionTypes.shaderc_include_result_release_fn,
                    Arena.global()
            );
        } catch (NoSuchMethodException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }
    }
}
