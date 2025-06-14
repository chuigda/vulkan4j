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

/// Represents a pointer to a {@code RenderBundleEncoderDescriptor} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct RenderBundleEncoderDescriptor {
///     ChainedStruct* nextInChain; // @link substring="ChainedStruct" target="ChainedStruct" @link substring="nextInChain" target="#nextInChain"
///     StringView label; // @link substring="StringView" target="StringView" @link substring="label" target="#label"
///     size_t colorFormatCount; // @link substring="colorFormatCount" target="#colorFormatCount"
///     TextureFormat const* colorFormats; // @link substring="TextureFormat" target="TextureFormat" @link substring="colorFormats" target="#colorFormats"
///     TextureFormat depthStencilFormat; // @link substring="TextureFormat" target="TextureFormat" @link substring="depthStencilFormat" target="#depthStencilFormat"
///     uint32_t sampleCount; // @link substring="sampleCount" target="#sampleCount"
///     bool depthReadOnly; // @link substring="depthReadOnly" target="#depthReadOnly"
///     bool stencilReadOnly; // @link substring="stencilReadOnly" target="#stencilReadOnly"
/// } RenderBundleEncoderDescriptor;
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
public record RenderBundleEncoderDescriptor(@NotNull MemorySegment segment) implements IRenderBundleEncoderDescriptor {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link RenderBundleEncoderDescriptor}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IRenderBundleEncoderDescriptor to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code RenderBundleEncoderDescriptor.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IRenderBundleEncoderDescriptor, Iterable<RenderBundleEncoderDescriptor> {
        public long size() {
            return segment.byteSize() / RenderBundleEncoderDescriptor.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull RenderBundleEncoderDescriptor at(long index) {
            return new RenderBundleEncoderDescriptor(segment.asSlice(index * RenderBundleEncoderDescriptor.BYTES, RenderBundleEncoderDescriptor.BYTES));
        }

        public void write(long index, @NotNull RenderBundleEncoderDescriptor value) {
            MemorySegment s = segment.asSlice(index * RenderBundleEncoderDescriptor.BYTES, RenderBundleEncoderDescriptor.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * RenderBundleEncoderDescriptor.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * RenderBundleEncoderDescriptor.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * RenderBundleEncoderDescriptor.BYTES,
                (end - start) * RenderBundleEncoderDescriptor.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * RenderBundleEncoderDescriptor.BYTES));
        }

        public RenderBundleEncoderDescriptor[] toArray() {
            RenderBundleEncoderDescriptor[] ret = new RenderBundleEncoderDescriptor[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<RenderBundleEncoderDescriptor> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<RenderBundleEncoderDescriptor> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= RenderBundleEncoderDescriptor.BYTES;
            }

            @Override
            public RenderBundleEncoderDescriptor next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                RenderBundleEncoderDescriptor ret = new RenderBundleEncoderDescriptor(segment.asSlice(0, RenderBundleEncoderDescriptor.BYTES));
                segment = segment.asSlice(RenderBundleEncoderDescriptor.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static RenderBundleEncoderDescriptor allocate(Arena arena) {
        return new RenderBundleEncoderDescriptor(arena.allocate(LAYOUT));
    }

    public static RenderBundleEncoderDescriptor.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new RenderBundleEncoderDescriptor.Ptr(segment);
    }

    public static RenderBundleEncoderDescriptor clone(Arena arena, RenderBundleEncoderDescriptor src) {
        RenderBundleEncoderDescriptor ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public RenderBundleEncoderDescriptor nextInChain(@Nullable IChainedStruct value) {
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

    public @NotNull StringView label() {
        return new StringView(segment.asSlice(OFFSET$label, LAYOUT$label));
    }

    public RenderBundleEncoderDescriptor label(@NotNull StringView value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$label, SIZE$label);
        return this;
    }

    public RenderBundleEncoderDescriptor label(Consumer<@NotNull StringView> consumer) {
        consumer.accept(label());
        return this;
    }

    public @Unsigned long colorFormatCount() {
        return NativeLayout.readCSizeT(segment, OFFSET$colorFormatCount);
    }

    public RenderBundleEncoderDescriptor colorFormatCount(@Unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$colorFormatCount, value);
        return this;
    }


    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @EnumType(TextureFormat.class) IntPtr colorFormats() {
        MemorySegment s = colorFormatsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public RenderBundleEncoderDescriptor colorFormats(@Nullable @EnumType(TextureFormat.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        colorFormatsRaw(s);
        return this;
    }

    public @Pointer(target=TextureFormat.class) MemorySegment colorFormatsRaw() {
        return segment.get(LAYOUT$colorFormats, OFFSET$colorFormats);
    }

    public void colorFormatsRaw(@Pointer(target=TextureFormat.class) MemorySegment value) {
        segment.set(LAYOUT$colorFormats, OFFSET$colorFormats, value);
    }

    public @EnumType(TextureFormat.class) int depthStencilFormat() {
        return segment.get(LAYOUT$depthStencilFormat, OFFSET$depthStencilFormat);
    }

    public RenderBundleEncoderDescriptor depthStencilFormat(@EnumType(TextureFormat.class) int value) {
        segment.set(LAYOUT$depthStencilFormat, OFFSET$depthStencilFormat, value);
        return this;
    }

    public @Unsigned int sampleCount() {
        return segment.get(LAYOUT$sampleCount, OFFSET$sampleCount);
    }

    public RenderBundleEncoderDescriptor sampleCount(@Unsigned int value) {
        segment.set(LAYOUT$sampleCount, OFFSET$sampleCount, value);
        return this;
    }

    public @NativeType("boolean") boolean depthReadOnly() {
        return segment.get(LAYOUT$depthReadOnly, OFFSET$depthReadOnly);
    }

    public RenderBundleEncoderDescriptor depthReadOnly(@NativeType("boolean") boolean value) {
        segment.set(LAYOUT$depthReadOnly, OFFSET$depthReadOnly, value);
        return this;
    }

    public @NativeType("boolean") boolean stencilReadOnly() {
        return segment.get(LAYOUT$stencilReadOnly, OFFSET$stencilReadOnly);
    }

    public RenderBundleEncoderDescriptor stencilReadOnly(@NativeType("boolean") boolean value) {
        segment.set(LAYOUT$stencilReadOnly, OFFSET$stencilReadOnly, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(ChainedStruct.LAYOUT).withName("nextInChain"),
        StringView.LAYOUT.withName("label"),
        NativeLayout.C_SIZE_T.withName("colorFormatCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("colorFormats"),
        ValueLayout.JAVA_INT.withName("depthStencilFormat"),
        ValueLayout.JAVA_INT.withName("sampleCount"),
        ValueLayout.JAVA_BOOLEAN.withName("depthReadOnly"),
        ValueLayout.JAVA_BOOLEAN.withName("stencilReadOnly")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$nextInChain = PathElement.groupElement("nextInChain");
    public static final PathElement PATH$label = PathElement.groupElement("label");
    public static final PathElement PATH$colorFormatCount = PathElement.groupElement("colorFormatCount");
    public static final PathElement PATH$colorFormats = PathElement.groupElement("colorFormats");
    public static final PathElement PATH$depthStencilFormat = PathElement.groupElement("depthStencilFormat");
    public static final PathElement PATH$sampleCount = PathElement.groupElement("sampleCount");
    public static final PathElement PATH$depthReadOnly = PathElement.groupElement("depthReadOnly");
    public static final PathElement PATH$stencilReadOnly = PathElement.groupElement("stencilReadOnly");

    public static final AddressLayout LAYOUT$nextInChain = (AddressLayout) LAYOUT.select(PATH$nextInChain);
    public static final StructLayout LAYOUT$label = (StructLayout) LAYOUT.select(PATH$label);
    public static final AddressLayout LAYOUT$colorFormats = (AddressLayout) LAYOUT.select(PATH$colorFormats);
    public static final OfInt LAYOUT$depthStencilFormat = (OfInt) LAYOUT.select(PATH$depthStencilFormat);
    public static final OfInt LAYOUT$sampleCount = (OfInt) LAYOUT.select(PATH$sampleCount);
    public static final OfBoolean LAYOUT$depthReadOnly = (OfBoolean) LAYOUT.select(PATH$depthReadOnly);
    public static final OfBoolean LAYOUT$stencilReadOnly = (OfBoolean) LAYOUT.select(PATH$stencilReadOnly);

    public static final long SIZE$nextInChain = LAYOUT$nextInChain.byteSize();
    public static final long SIZE$label = LAYOUT$label.byteSize();
    public static final long SIZE$colorFormatCount = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$colorFormats = LAYOUT$colorFormats.byteSize();
    public static final long SIZE$depthStencilFormat = LAYOUT$depthStencilFormat.byteSize();
    public static final long SIZE$sampleCount = LAYOUT$sampleCount.byteSize();
    public static final long SIZE$depthReadOnly = LAYOUT$depthReadOnly.byteSize();
    public static final long SIZE$stencilReadOnly = LAYOUT$stencilReadOnly.byteSize();

    public static final long OFFSET$nextInChain = LAYOUT.byteOffset(PATH$nextInChain);
    public static final long OFFSET$label = LAYOUT.byteOffset(PATH$label);
    public static final long OFFSET$colorFormatCount = LAYOUT.byteOffset(PATH$colorFormatCount);
    public static final long OFFSET$colorFormats = LAYOUT.byteOffset(PATH$colorFormats);
    public static final long OFFSET$depthStencilFormat = LAYOUT.byteOffset(PATH$depthStencilFormat);
    public static final long OFFSET$sampleCount = LAYOUT.byteOffset(PATH$sampleCount);
    public static final long OFFSET$depthReadOnly = LAYOUT.byteOffset(PATH$depthReadOnly);
    public static final long OFFSET$stencilReadOnly = LAYOUT.byteOffset(PATH$stencilReadOnly);
}
