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

/// Represents a pointer to a {@code WGPUTextureDescriptor} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPUTextureDescriptor {
///     WGPUChainedStruct const* nextInChain; // optional // @link substring="WGPUChainedStruct" target="WGPUChainedStruct" @link substring="nextInChain" target="#nextInChain"
///     WGPUStringView label; // @link substring="WGPUStringView" target="WGPUStringView" @link substring="label" target="#label"
///     WGPUTextureUsage usage; // @link substring="WGPUTextureUsage" target="WGPUTextureUsage" @link substring="usage" target="#usage"
///     WGPUTextureDimension dimension; // @link substring="WGPUTextureDimension" target="WGPUTextureDimension" @link substring="dimension" target="#dimension"
///     WGPUExtent3d size; // @link substring="WGPUExtent3d" target="WGPUExtent3d" @link substring="size" target="#size"
///     WGPUTextureFormat format; // @link substring="WGPUTextureFormat" target="WGPUTextureFormat" @link substring="format" target="#format"
///     uint32_t mipLevelCount; // @link substring="mipLevelCount" target="#mipLevelCount"
///     uint32_t sampleCount; // @link substring="sampleCount" target="#sampleCount"
///     size_t viewFormatCount; // @link substring="viewFormatCount" target="#viewFormatCount"
///     WGPUTextureFormat const* viewFormats; // @link substring="WGPUTextureFormat" target="WGPUTextureFormat" @link substring="viewFormats" target="#viewFormats"
/// } WGPUTextureDescriptor;
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
public record WGPUTextureDescriptor(@NotNull MemorySegment segment) implements IWGPUTextureDescriptor {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUTextureDescriptor}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUTextureDescriptor to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUTextureDescriptor.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUTextureDescriptor, Iterable<WGPUTextureDescriptor> {
        public long size() {
            return segment.byteSize() / WGPUTextureDescriptor.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUTextureDescriptor at(long index) {
            return new WGPUTextureDescriptor(segment.asSlice(index * WGPUTextureDescriptor.BYTES, WGPUTextureDescriptor.BYTES));
        }

        public WGPUTextureDescriptor.Ptr at(long index, @NotNull Consumer<@NotNull WGPUTextureDescriptor> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUTextureDescriptor value) {
            MemorySegment s = segment.asSlice(index * WGPUTextureDescriptor.BYTES, WGPUTextureDescriptor.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUTextureDescriptor.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUTextureDescriptor.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUTextureDescriptor.BYTES,
                (end - start) * WGPUTextureDescriptor.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUTextureDescriptor.BYTES));
        }

        public WGPUTextureDescriptor[] toArray() {
            WGPUTextureDescriptor[] ret = new WGPUTextureDescriptor[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUTextureDescriptor> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUTextureDescriptor> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUTextureDescriptor.BYTES;
            }

            @Override
            public WGPUTextureDescriptor next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUTextureDescriptor ret = new WGPUTextureDescriptor(segment.asSlice(0, WGPUTextureDescriptor.BYTES));
                segment = segment.asSlice(WGPUTextureDescriptor.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUTextureDescriptor allocate(Arena arena) {
        return new WGPUTextureDescriptor(arena.allocate(LAYOUT));
    }

    public static WGPUTextureDescriptor.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUTextureDescriptor.Ptr(segment);
    }

    public static WGPUTextureDescriptor clone(Arena arena, WGPUTextureDescriptor src) {
        WGPUTextureDescriptor ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public WGPUTextureDescriptor nextInChain(@Nullable IWGPUChainedStruct value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        nextInChainRaw(s);
        return this;
    }

    @Unsafe public @Nullable WGPUChainedStruct.Ptr nextInChain(int assumedCount) {
        MemorySegment s = nextInChainRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * WGPUChainedStruct.BYTES);
        return new WGPUChainedStruct.Ptr(s);
    }

    public @Nullable WGPUChainedStruct nextInChain() {
        MemorySegment s = nextInChainRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new WGPUChainedStruct(s);
    }

    public @Pointer(target=WGPUChainedStruct.class) @NotNull MemorySegment nextInChainRaw() {
        return segment.get(LAYOUT$nextInChain, OFFSET$nextInChain);
    }

    public void nextInChainRaw(@Pointer(target=WGPUChainedStruct.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$nextInChain, OFFSET$nextInChain, value);
    }

    public @NotNull WGPUStringView label() {
        return new WGPUStringView(segment.asSlice(OFFSET$label, LAYOUT$label));
    }

    public WGPUTextureDescriptor label(@NotNull WGPUStringView value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$label, SIZE$label);
        return this;
    }

    public WGPUTextureDescriptor label(Consumer<@NotNull WGPUStringView> consumer) {
        consumer.accept(label());
        return this;
    }

    public @Bitmask(WGPUTextureUsage.class) long usage() {
        return segment.get(LAYOUT$usage, OFFSET$usage);
    }

    public WGPUTextureDescriptor usage(@Bitmask(WGPUTextureUsage.class) long value) {
        segment.set(LAYOUT$usage, OFFSET$usage, value);
        return this;
    }

    public @EnumType(WGPUTextureDimension.class) int dimension() {
        return segment.get(LAYOUT$dimension, OFFSET$dimension);
    }

    public WGPUTextureDescriptor dimension(@EnumType(WGPUTextureDimension.class) int value) {
        segment.set(LAYOUT$dimension, OFFSET$dimension, value);
        return this;
    }

    public @NotNull WGPUExtent3d size() {
        return new WGPUExtent3d(segment.asSlice(OFFSET$size, LAYOUT$size));
    }

    public WGPUTextureDescriptor size(@NotNull WGPUExtent3d value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$size, SIZE$size);
        return this;
    }

    public WGPUTextureDescriptor size(Consumer<@NotNull WGPUExtent3d> consumer) {
        consumer.accept(size());
        return this;
    }

    public @EnumType(WGPUTextureFormat.class) int format() {
        return segment.get(LAYOUT$format, OFFSET$format);
    }

    public WGPUTextureDescriptor format(@EnumType(WGPUTextureFormat.class) int value) {
        segment.set(LAYOUT$format, OFFSET$format, value);
        return this;
    }

    public @Unsigned int mipLevelCount() {
        return segment.get(LAYOUT$mipLevelCount, OFFSET$mipLevelCount);
    }

    public WGPUTextureDescriptor mipLevelCount(@Unsigned int value) {
        segment.set(LAYOUT$mipLevelCount, OFFSET$mipLevelCount, value);
        return this;
    }

    public @Unsigned int sampleCount() {
        return segment.get(LAYOUT$sampleCount, OFFSET$sampleCount);
    }

    public WGPUTextureDescriptor sampleCount(@Unsigned int value) {
        segment.set(LAYOUT$sampleCount, OFFSET$sampleCount, value);
        return this;
    }

    public @Unsigned long viewFormatCount() {
        return NativeLayout.readCSizeT(segment, OFFSET$viewFormatCount);
    }

    public WGPUTextureDescriptor viewFormatCount(@Unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$viewFormatCount, value);
        return this;
    }


    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @EnumType(WGPUTextureFormat.class) IntPtr viewFormats() {
        MemorySegment s = viewFormatsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public WGPUTextureDescriptor viewFormats(@Nullable @EnumType(WGPUTextureFormat.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        viewFormatsRaw(s);
        return this;
    }

    public @Pointer(target=WGPUTextureFormat.class) @NotNull MemorySegment viewFormatsRaw() {
        return segment.get(LAYOUT$viewFormats, OFFSET$viewFormats);
    }

    public void viewFormatsRaw(@Pointer(target=WGPUTextureFormat.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$viewFormats, OFFSET$viewFormats, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(WGPUChainedStruct.LAYOUT).withName("nextInChain"),
        WGPUStringView.LAYOUT.withName("label"),
        ValueLayout.JAVA_LONG.withName("usage"),
        ValueLayout.JAVA_INT.withName("dimension"),
        WGPUExtent3d.LAYOUT.withName("size"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_INT.withName("mipLevelCount"),
        ValueLayout.JAVA_INT.withName("sampleCount"),
        NativeLayout.C_SIZE_T.withName("viewFormatCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("viewFormats")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$nextInChain = PathElement.groupElement("nextInChain");
    public static final PathElement PATH$label = PathElement.groupElement("label");
    public static final PathElement PATH$usage = PathElement.groupElement("usage");
    public static final PathElement PATH$dimension = PathElement.groupElement("dimension");
    public static final PathElement PATH$size = PathElement.groupElement("size");
    public static final PathElement PATH$format = PathElement.groupElement("format");
    public static final PathElement PATH$mipLevelCount = PathElement.groupElement("mipLevelCount");
    public static final PathElement PATH$sampleCount = PathElement.groupElement("sampleCount");
    public static final PathElement PATH$viewFormatCount = PathElement.groupElement("viewFormatCount");
    public static final PathElement PATH$viewFormats = PathElement.groupElement("viewFormats");

    public static final AddressLayout LAYOUT$nextInChain = (AddressLayout) LAYOUT.select(PATH$nextInChain);
    public static final StructLayout LAYOUT$label = (StructLayout) LAYOUT.select(PATH$label);
    public static final OfLong LAYOUT$usage = (OfLong) LAYOUT.select(PATH$usage);
    public static final OfInt LAYOUT$dimension = (OfInt) LAYOUT.select(PATH$dimension);
    public static final StructLayout LAYOUT$size = (StructLayout) LAYOUT.select(PATH$size);
    public static final OfInt LAYOUT$format = (OfInt) LAYOUT.select(PATH$format);
    public static final OfInt LAYOUT$mipLevelCount = (OfInt) LAYOUT.select(PATH$mipLevelCount);
    public static final OfInt LAYOUT$sampleCount = (OfInt) LAYOUT.select(PATH$sampleCount);
    public static final AddressLayout LAYOUT$viewFormats = (AddressLayout) LAYOUT.select(PATH$viewFormats);

    public static final long SIZE$nextInChain = LAYOUT$nextInChain.byteSize();
    public static final long SIZE$label = LAYOUT$label.byteSize();
    public static final long SIZE$usage = LAYOUT$usage.byteSize();
    public static final long SIZE$dimension = LAYOUT$dimension.byteSize();
    public static final long SIZE$size = LAYOUT$size.byteSize();
    public static final long SIZE$format = LAYOUT$format.byteSize();
    public static final long SIZE$mipLevelCount = LAYOUT$mipLevelCount.byteSize();
    public static final long SIZE$sampleCount = LAYOUT$sampleCount.byteSize();
    public static final long SIZE$viewFormatCount = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$viewFormats = LAYOUT$viewFormats.byteSize();

    public static final long OFFSET$nextInChain = LAYOUT.byteOffset(PATH$nextInChain);
    public static final long OFFSET$label = LAYOUT.byteOffset(PATH$label);
    public static final long OFFSET$usage = LAYOUT.byteOffset(PATH$usage);
    public static final long OFFSET$dimension = LAYOUT.byteOffset(PATH$dimension);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);
    public static final long OFFSET$mipLevelCount = LAYOUT.byteOffset(PATH$mipLevelCount);
    public static final long OFFSET$sampleCount = LAYOUT.byteOffset(PATH$sampleCount);
    public static final long OFFSET$viewFormatCount = LAYOUT.byteOffset(PATH$viewFormatCount);
    public static final long OFFSET$viewFormats = LAYOUT.byteOffset(PATH$viewFormats);
}
