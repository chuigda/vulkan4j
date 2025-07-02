package club.doki7.webgpu.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.webgpu.bitmask.*;
import club.doki7.webgpu.handle.*;
import club.doki7.webgpu.enumtype.*;
import static club.doki7.webgpu.WGPUConstants.*;
import club.doki7.webgpu.WGPUFunctionTypes.*;

/// Represents a pointer to a {@code WGPUShaderSourceGLSL} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPUShaderSourceGLSL {
///     WGPUChainedStruct chain; // @link substring="WGPUChainedStruct" target="WGPUChainedStruct" @link substring="chain" target="#chain"
///     WGPUShaderStage stage; // @link substring="WGPUShaderStage" target="WGPUShaderStage" @link substring="stage" target="#stage"
///     WGPUStringView code; // @link substring="WGPUStringView" target="WGPUStringView" @link substring="code" target="#code"
///     uint32_t defineCount; // @link substring="defineCount" target="#defineCount"
///     WGPUShaderDefine* defines; // @link substring="WGPUShaderDefine" target="WGPUShaderDefine" @link substring="defines" target="#defines"
/// } WGPUShaderSourceGLSL;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
@ValueBasedCandidate
@UnsafeConstructor
public record WGPUShaderSourceGLSL(@NotNull MemorySegment segment) implements IWGPUShaderSourceGLSL {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUShaderSourceGLSL}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUShaderSourceGLSL to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUShaderSourceGLSL.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUShaderSourceGLSL, Iterable<WGPUShaderSourceGLSL> {
        public long size() {
            return segment.byteSize() / WGPUShaderSourceGLSL.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUShaderSourceGLSL at(long index) {
            return new WGPUShaderSourceGLSL(segment.asSlice(index * WGPUShaderSourceGLSL.BYTES, WGPUShaderSourceGLSL.BYTES));
        }

        public WGPUShaderSourceGLSL.Ptr at(long index, @NotNull Consumer<@NotNull WGPUShaderSourceGLSL> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUShaderSourceGLSL value) {
            MemorySegment s = segment.asSlice(index * WGPUShaderSourceGLSL.BYTES, WGPUShaderSourceGLSL.BYTES);
            s.copyFrom(value.segment);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} structures,
        /// create a new view {@link Ptr} that uses the same backing storage as this
        /// {@link Ptr}, but with the new size. Since there is actually no way to really check
        /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
        /// marked as {@link Unsafe}.
        ///
        /// This method could be useful when handling data returned from some C API, where the size of
        /// the data is not known in advance.
        ///
        /// If the size of the underlying segment is actually known in advance and correctly set, and
        /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
        /// instead.
        @Unsafe
        public @NotNull Ptr reinterpret(long newSize) {
            return new Ptr(segment.reinterpret(newSize * WGPUShaderSourceGLSL.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUShaderSourceGLSL.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUShaderSourceGLSL.BYTES,
                (end - start) * WGPUShaderSourceGLSL.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUShaderSourceGLSL.BYTES));
        }

        public WGPUShaderSourceGLSL[] toArray() {
            WGPUShaderSourceGLSL[] ret = new WGPUShaderSourceGLSL[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUShaderSourceGLSL> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUShaderSourceGLSL> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUShaderSourceGLSL.BYTES;
            }

            @Override
            public WGPUShaderSourceGLSL next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUShaderSourceGLSL ret = new WGPUShaderSourceGLSL(segment.asSlice(0, WGPUShaderSourceGLSL.BYTES));
                segment = segment.asSlice(WGPUShaderSourceGLSL.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUShaderSourceGLSL allocate(Arena arena) {
        return new WGPUShaderSourceGLSL(arena.allocate(LAYOUT));
    }

    public static WGPUShaderSourceGLSL.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUShaderSourceGLSL.Ptr(segment);
    }

    public static WGPUShaderSourceGLSL clone(Arena arena, WGPUShaderSourceGLSL src) {
        WGPUShaderSourceGLSL ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NotNull WGPUChainedStruct chain() {
        return new WGPUChainedStruct(segment.asSlice(OFFSET$chain, LAYOUT$chain));
    }

    public WGPUShaderSourceGLSL chain(@NotNull WGPUChainedStruct value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$chain, SIZE$chain);
        return this;
    }

    public WGPUShaderSourceGLSL chain(Consumer<@NotNull WGPUChainedStruct> consumer) {
        consumer.accept(chain());
        return this;
    }

    public @Bitmask(WGPUShaderStage.class) long stage() {
        return segment.get(LAYOUT$stage, OFFSET$stage);
    }

    public WGPUShaderSourceGLSL stage(@Bitmask(WGPUShaderStage.class) long value) {
        segment.set(LAYOUT$stage, OFFSET$stage, value);
        return this;
    }

    public @NotNull WGPUStringView code() {
        return new WGPUStringView(segment.asSlice(OFFSET$code, LAYOUT$code));
    }

    public WGPUShaderSourceGLSL code(@NotNull WGPUStringView value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$code, SIZE$code);
        return this;
    }

    public WGPUShaderSourceGLSL code(Consumer<@NotNull WGPUStringView> consumer) {
        consumer.accept(code());
        return this;
    }

    public @Unsigned int defineCount() {
        return segment.get(LAYOUT$defineCount, OFFSET$defineCount);
    }

    public WGPUShaderSourceGLSL defineCount(@Unsigned int value) {
        segment.set(LAYOUT$defineCount, OFFSET$defineCount, value);
        return this;
    }

    public WGPUShaderSourceGLSL defines(@Nullable IWGPUShaderDefine value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        definesRaw(s);
        return this;
    }

    @Unsafe public @Nullable WGPUShaderDefine.Ptr defines(int assumedCount) {
        MemorySegment s = definesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * WGPUShaderDefine.BYTES);
        return new WGPUShaderDefine.Ptr(s);
    }

    public @Nullable WGPUShaderDefine defines() {
        MemorySegment s = definesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new WGPUShaderDefine(s);
    }

    public @Pointer(target=WGPUShaderDefine.class) @NotNull MemorySegment definesRaw() {
        return segment.get(LAYOUT$defines, OFFSET$defines);
    }

    public void definesRaw(@Pointer(target=WGPUShaderDefine.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$defines, OFFSET$defines, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        WGPUChainedStruct.LAYOUT.withName("chain"),
        ValueLayout.JAVA_LONG.withName("stage"),
        WGPUStringView.LAYOUT.withName("code"),
        ValueLayout.JAVA_INT.withName("defineCount"),
        ValueLayout.ADDRESS.withTargetLayout(WGPUShaderDefine.LAYOUT).withName("defines")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$chain = PathElement.groupElement("chain");
    public static final PathElement PATH$stage = PathElement.groupElement("stage");
    public static final PathElement PATH$code = PathElement.groupElement("code");
    public static final PathElement PATH$defineCount = PathElement.groupElement("defineCount");
    public static final PathElement PATH$defines = PathElement.groupElement("defines");

    public static final StructLayout LAYOUT$chain = (StructLayout) LAYOUT.select(PATH$chain);
    public static final OfLong LAYOUT$stage = (OfLong) LAYOUT.select(PATH$stage);
    public static final StructLayout LAYOUT$code = (StructLayout) LAYOUT.select(PATH$code);
    public static final OfInt LAYOUT$defineCount = (OfInt) LAYOUT.select(PATH$defineCount);
    public static final AddressLayout LAYOUT$defines = (AddressLayout) LAYOUT.select(PATH$defines);

    public static final long SIZE$chain = LAYOUT$chain.byteSize();
    public static final long SIZE$stage = LAYOUT$stage.byteSize();
    public static final long SIZE$code = LAYOUT$code.byteSize();
    public static final long SIZE$defineCount = LAYOUT$defineCount.byteSize();
    public static final long SIZE$defines = LAYOUT$defines.byteSize();

    public static final long OFFSET$chain = LAYOUT.byteOffset(PATH$chain);
    public static final long OFFSET$stage = LAYOUT.byteOffset(PATH$stage);
    public static final long OFFSET$code = LAYOUT.byteOffset(PATH$code);
    public static final long OFFSET$defineCount = LAYOUT.byteOffset(PATH$defineCount);
    public static final long OFFSET$defines = LAYOUT.byteOffset(PATH$defines);
}
