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
import static club.doki7.webgpu.WebGPUConstants.*;

/// Represents a pointer to a {@code DepthStencilState} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct DepthStencilState {
///     ChainedStruct* nextInChain; // @link substring="ChainedStruct" target="ChainedStruct" @link substring="nextInChain" target="#nextInChain"
///     TextureFormat format; // @link substring="TextureFormat" target="TextureFormat" @link substring="format" target="#format"
///     OptionalBool depthWriteEnabled; // @link substring="OptionalBool" target="OptionalBool" @link substring="depthWriteEnabled" target="#depthWriteEnabled"
///     CompareFunction depthCompare; // @link substring="CompareFunction" target="CompareFunction" @link substring="depthCompare" target="#depthCompare"
///     StencilFaceState stencilFront; // @link substring="StencilFaceState" target="StencilFaceState" @link substring="stencilFront" target="#stencilFront"
///     StencilFaceState stencilBack; // @link substring="StencilFaceState" target="StencilFaceState" @link substring="stencilBack" target="#stencilBack"
///     uint32_t stencilReadMask; // @link substring="stencilReadMask" target="#stencilReadMask"
///     uint32_t stencilWriteMask; // @link substring="stencilWriteMask" target="#stencilWriteMask"
///     int32_t depthBias; // @link substring="depthBias" target="#depthBias"
///     float depthBiasSlopeScale; // @link substring="depthBiasSlopeScale" target="#depthBiasSlopeScale"
///     float depthBiasClamp; // @link substring="depthBiasClamp" target="#depthBiasClamp"
/// } DepthStencilState;
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
public record DepthStencilState(@NotNull MemorySegment segment) implements IDepthStencilState {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link DepthStencilState}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IDepthStencilState to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code DepthStencilState.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IDepthStencilState, Iterable<DepthStencilState> {
        public long size() {
            return segment.byteSize() / DepthStencilState.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull DepthStencilState at(long index) {
            return new DepthStencilState(segment.asSlice(index * DepthStencilState.BYTES, DepthStencilState.BYTES));
        }

        public void write(long index, @NotNull DepthStencilState value) {
            MemorySegment s = segment.asSlice(index * DepthStencilState.BYTES, DepthStencilState.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * DepthStencilState.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * DepthStencilState.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * DepthStencilState.BYTES,
                (end - start) * DepthStencilState.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * DepthStencilState.BYTES));
        }

        public DepthStencilState[] toArray() {
            DepthStencilState[] ret = new DepthStencilState[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<DepthStencilState> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<DepthStencilState> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= DepthStencilState.BYTES;
            }

            @Override
            public DepthStencilState next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                DepthStencilState ret = new DepthStencilState(segment.asSlice(0, DepthStencilState.BYTES));
                segment = segment.asSlice(DepthStencilState.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static DepthStencilState allocate(Arena arena) {
        return new DepthStencilState(arena.allocate(LAYOUT));
    }

    public static DepthStencilState.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new DepthStencilState.Ptr(segment);
    }

    public static DepthStencilState clone(Arena arena, DepthStencilState src) {
        DepthStencilState ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public DepthStencilState nextInChain(@Nullable IChainedStruct value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        nextInChainRaw(s);
        return this;
    }

    @Unsafe public @Nullable ChainedStruct.Ptr nextInChain(int assumedCount) {
        MemorySegment s = nextInChainRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * ChainedStruct.BYTES);
        return new ChainedStruct.Ptr(s);
    }

    public @Nullable ChainedStruct nextInChain() {
        MemorySegment s = nextInChainRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new ChainedStruct(s);
    }

    public @Pointer(target=ChainedStruct.class) MemorySegment nextInChainRaw() {
        return segment.get(LAYOUT$nextInChain, OFFSET$nextInChain);
    }

    public void nextInChainRaw(@Pointer(target=ChainedStruct.class) MemorySegment value) {
        segment.set(LAYOUT$nextInChain, OFFSET$nextInChain, value);
    }

    public @EnumType(TextureFormat.class) int format() {
        return segment.get(LAYOUT$format, OFFSET$format);
    }

    public DepthStencilState format(@EnumType(TextureFormat.class) int value) {
        segment.set(LAYOUT$format, OFFSET$format, value);
        return this;
    }

    public @EnumType(OptionalBool.class) int depthWriteEnabled() {
        return segment.get(LAYOUT$depthWriteEnabled, OFFSET$depthWriteEnabled);
    }

    public DepthStencilState depthWriteEnabled(@EnumType(OptionalBool.class) int value) {
        segment.set(LAYOUT$depthWriteEnabled, OFFSET$depthWriteEnabled, value);
        return this;
    }

    public @EnumType(CompareFunction.class) int depthCompare() {
        return segment.get(LAYOUT$depthCompare, OFFSET$depthCompare);
    }

    public DepthStencilState depthCompare(@EnumType(CompareFunction.class) int value) {
        segment.set(LAYOUT$depthCompare, OFFSET$depthCompare, value);
        return this;
    }

    public @NotNull StencilFaceState stencilFront() {
        return new StencilFaceState(segment.asSlice(OFFSET$stencilFront, LAYOUT$stencilFront));
    }

    public DepthStencilState stencilFront(@NotNull StencilFaceState value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$stencilFront, SIZE$stencilFront);
        return this;
    }

    public DepthStencilState stencilFront(Consumer<@NotNull StencilFaceState> consumer) {
        consumer.accept(stencilFront());
        return this;
    }

    public @NotNull StencilFaceState stencilBack() {
        return new StencilFaceState(segment.asSlice(OFFSET$stencilBack, LAYOUT$stencilBack));
    }

    public DepthStencilState stencilBack(@NotNull StencilFaceState value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$stencilBack, SIZE$stencilBack);
        return this;
    }

    public DepthStencilState stencilBack(Consumer<@NotNull StencilFaceState> consumer) {
        consumer.accept(stencilBack());
        return this;
    }

    public @Unsigned int stencilReadMask() {
        return segment.get(LAYOUT$stencilReadMask, OFFSET$stencilReadMask);
    }

    public DepthStencilState stencilReadMask(@Unsigned int value) {
        segment.set(LAYOUT$stencilReadMask, OFFSET$stencilReadMask, value);
        return this;
    }

    public @Unsigned int stencilWriteMask() {
        return segment.get(LAYOUT$stencilWriteMask, OFFSET$stencilWriteMask);
    }

    public DepthStencilState stencilWriteMask(@Unsigned int value) {
        segment.set(LAYOUT$stencilWriteMask, OFFSET$stencilWriteMask, value);
        return this;
    }

    public int depthBias() {
        return segment.get(LAYOUT$depthBias, OFFSET$depthBias);
    }

    public DepthStencilState depthBias(int value) {
        segment.set(LAYOUT$depthBias, OFFSET$depthBias, value);
        return this;
    }

    public float depthBiasSlopeScale() {
        return segment.get(LAYOUT$depthBiasSlopeScale, OFFSET$depthBiasSlopeScale);
    }

    public DepthStencilState depthBiasSlopeScale(float value) {
        segment.set(LAYOUT$depthBiasSlopeScale, OFFSET$depthBiasSlopeScale, value);
        return this;
    }

    public float depthBiasClamp() {
        return segment.get(LAYOUT$depthBiasClamp, OFFSET$depthBiasClamp);
    }

    public DepthStencilState depthBiasClamp(float value) {
        segment.set(LAYOUT$depthBiasClamp, OFFSET$depthBiasClamp, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(ChainedStruct.LAYOUT).withName("nextInChain"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_INT.withName("depthWriteEnabled"),
        ValueLayout.JAVA_INT.withName("depthCompare"),
        StencilFaceState.LAYOUT.withName("stencilFront"),
        StencilFaceState.LAYOUT.withName("stencilBack"),
        ValueLayout.JAVA_INT.withName("stencilReadMask"),
        ValueLayout.JAVA_INT.withName("stencilWriteMask"),
        ValueLayout.JAVA_INT.withName("depthBias"),
        ValueLayout.JAVA_FLOAT.withName("depthBiasSlopeScale"),
        ValueLayout.JAVA_FLOAT.withName("depthBiasClamp")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$nextInChain = PathElement.groupElement("nextInChain");
    public static final PathElement PATH$format = PathElement.groupElement("format");
    public static final PathElement PATH$depthWriteEnabled = PathElement.groupElement("depthWriteEnabled");
    public static final PathElement PATH$depthCompare = PathElement.groupElement("depthCompare");
    public static final PathElement PATH$stencilFront = PathElement.groupElement("stencilFront");
    public static final PathElement PATH$stencilBack = PathElement.groupElement("stencilBack");
    public static final PathElement PATH$stencilReadMask = PathElement.groupElement("stencilReadMask");
    public static final PathElement PATH$stencilWriteMask = PathElement.groupElement("stencilWriteMask");
    public static final PathElement PATH$depthBias = PathElement.groupElement("depthBias");
    public static final PathElement PATH$depthBiasSlopeScale = PathElement.groupElement("depthBiasSlopeScale");
    public static final PathElement PATH$depthBiasClamp = PathElement.groupElement("depthBiasClamp");

    public static final AddressLayout LAYOUT$nextInChain = (AddressLayout) LAYOUT.select(PATH$nextInChain);
    public static final OfInt LAYOUT$format = (OfInt) LAYOUT.select(PATH$format);
    public static final OfInt LAYOUT$depthWriteEnabled = (OfInt) LAYOUT.select(PATH$depthWriteEnabled);
    public static final OfInt LAYOUT$depthCompare = (OfInt) LAYOUT.select(PATH$depthCompare);
    public static final StructLayout LAYOUT$stencilFront = (StructLayout) LAYOUT.select(PATH$stencilFront);
    public static final StructLayout LAYOUT$stencilBack = (StructLayout) LAYOUT.select(PATH$stencilBack);
    public static final OfInt LAYOUT$stencilReadMask = (OfInt) LAYOUT.select(PATH$stencilReadMask);
    public static final OfInt LAYOUT$stencilWriteMask = (OfInt) LAYOUT.select(PATH$stencilWriteMask);
    public static final OfInt LAYOUT$depthBias = (OfInt) LAYOUT.select(PATH$depthBias);
    public static final OfFloat LAYOUT$depthBiasSlopeScale = (OfFloat) LAYOUT.select(PATH$depthBiasSlopeScale);
    public static final OfFloat LAYOUT$depthBiasClamp = (OfFloat) LAYOUT.select(PATH$depthBiasClamp);

    public static final long SIZE$nextInChain = LAYOUT$nextInChain.byteSize();
    public static final long SIZE$format = LAYOUT$format.byteSize();
    public static final long SIZE$depthWriteEnabled = LAYOUT$depthWriteEnabled.byteSize();
    public static final long SIZE$depthCompare = LAYOUT$depthCompare.byteSize();
    public static final long SIZE$stencilFront = LAYOUT$stencilFront.byteSize();
    public static final long SIZE$stencilBack = LAYOUT$stencilBack.byteSize();
    public static final long SIZE$stencilReadMask = LAYOUT$stencilReadMask.byteSize();
    public static final long SIZE$stencilWriteMask = LAYOUT$stencilWriteMask.byteSize();
    public static final long SIZE$depthBias = LAYOUT$depthBias.byteSize();
    public static final long SIZE$depthBiasSlopeScale = LAYOUT$depthBiasSlopeScale.byteSize();
    public static final long SIZE$depthBiasClamp = LAYOUT$depthBiasClamp.byteSize();

    public static final long OFFSET$nextInChain = LAYOUT.byteOffset(PATH$nextInChain);
    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);
    public static final long OFFSET$depthWriteEnabled = LAYOUT.byteOffset(PATH$depthWriteEnabled);
    public static final long OFFSET$depthCompare = LAYOUT.byteOffset(PATH$depthCompare);
    public static final long OFFSET$stencilFront = LAYOUT.byteOffset(PATH$stencilFront);
    public static final long OFFSET$stencilBack = LAYOUT.byteOffset(PATH$stencilBack);
    public static final long OFFSET$stencilReadMask = LAYOUT.byteOffset(PATH$stencilReadMask);
    public static final long OFFSET$stencilWriteMask = LAYOUT.byteOffset(PATH$stencilWriteMask);
    public static final long OFFSET$depthBias = LAYOUT.byteOffset(PATH$depthBias);
    public static final long OFFSET$depthBiasSlopeScale = LAYOUT.byteOffset(PATH$depthBiasSlopeScale);
    public static final long OFFSET$depthBiasClamp = LAYOUT.byteOffset(PATH$depthBiasClamp);
}
