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

/// Represents a pointer to a {@code WGPUTextureViewDescriptor} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPUTextureViewDescriptor {
///     WGPUChainedStruct const* nextInChain; // optional // @link substring="WGPUChainedStruct" target="WGPUChainedStruct" @link substring="nextInChain" target="#nextInChain"
///     WGPUStringView label; // @link substring="WGPUStringView" target="WGPUStringView" @link substring="label" target="#label"
///     WGPUTextureFormat format; // @link substring="WGPUTextureFormat" target="WGPUTextureFormat" @link substring="format" target="#format"
///     WGPUTextureViewDimension dimension; // @link substring="WGPUTextureViewDimension" target="WGPUTextureViewDimension" @link substring="dimension" target="#dimension"
///     uint32_t baseMipLevel; // @link substring="baseMipLevel" target="#baseMipLevel"
///     uint32_t mipLevelCount; // @link substring="mipLevelCount" target="#mipLevelCount"
///     uint32_t baseArrayLayer; // @link substring="baseArrayLayer" target="#baseArrayLayer"
///     uint32_t arrayLayerCount; // @link substring="arrayLayerCount" target="#arrayLayerCount"
///     WGPUTextureAspect aspect; // @link substring="WGPUTextureAspect" target="WGPUTextureAspect" @link substring="aspect" target="#aspect"
///     WGPUTextureUsage usage; // @link substring="WGPUTextureUsage" target="WGPUTextureUsage" @link substring="usage" target="#usage"
/// } WGPUTextureViewDescriptor;
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
public record WGPUTextureViewDescriptor(@NotNull MemorySegment segment) implements IWGPUTextureViewDescriptor {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUTextureViewDescriptor}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUTextureViewDescriptor to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUTextureViewDescriptor.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUTextureViewDescriptor, Iterable<WGPUTextureViewDescriptor> {
        public long size() {
            return segment.byteSize() / WGPUTextureViewDescriptor.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUTextureViewDescriptor at(long index) {
            return new WGPUTextureViewDescriptor(segment.asSlice(index * WGPUTextureViewDescriptor.BYTES, WGPUTextureViewDescriptor.BYTES));
        }

        public WGPUTextureViewDescriptor.Ptr at(long index, @NotNull Consumer<@NotNull WGPUTextureViewDescriptor> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUTextureViewDescriptor value) {
            MemorySegment s = segment.asSlice(index * WGPUTextureViewDescriptor.BYTES, WGPUTextureViewDescriptor.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUTextureViewDescriptor.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUTextureViewDescriptor.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUTextureViewDescriptor.BYTES,
                (end - start) * WGPUTextureViewDescriptor.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUTextureViewDescriptor.BYTES));
        }

        public WGPUTextureViewDescriptor[] toArray() {
            WGPUTextureViewDescriptor[] ret = new WGPUTextureViewDescriptor[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUTextureViewDescriptor> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUTextureViewDescriptor> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUTextureViewDescriptor.BYTES;
            }

            @Override
            public WGPUTextureViewDescriptor next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUTextureViewDescriptor ret = new WGPUTextureViewDescriptor(segment.asSlice(0, WGPUTextureViewDescriptor.BYTES));
                segment = segment.asSlice(WGPUTextureViewDescriptor.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUTextureViewDescriptor allocate(Arena arena) {
        return new WGPUTextureViewDescriptor(arena.allocate(LAYOUT));
    }

    public static WGPUTextureViewDescriptor.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUTextureViewDescriptor.Ptr(segment);
    }

    public static WGPUTextureViewDescriptor clone(Arena arena, WGPUTextureViewDescriptor src) {
        WGPUTextureViewDescriptor ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public WGPUTextureViewDescriptor nextInChain(@Nullable IWGPUChainedStruct value) {
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

    public WGPUTextureViewDescriptor label(@NotNull WGPUStringView value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$label, SIZE$label);
        return this;
    }

    public WGPUTextureViewDescriptor label(Consumer<@NotNull WGPUStringView> consumer) {
        consumer.accept(label());
        return this;
    }

    public @EnumType(WGPUTextureFormat.class) int format() {
        return segment.get(LAYOUT$format, OFFSET$format);
    }

    public WGPUTextureViewDescriptor format(@EnumType(WGPUTextureFormat.class) int value) {
        segment.set(LAYOUT$format, OFFSET$format, value);
        return this;
    }

    public @EnumType(WGPUTextureViewDimension.class) int dimension() {
        return segment.get(LAYOUT$dimension, OFFSET$dimension);
    }

    public WGPUTextureViewDescriptor dimension(@EnumType(WGPUTextureViewDimension.class) int value) {
        segment.set(LAYOUT$dimension, OFFSET$dimension, value);
        return this;
    }

    public @Unsigned int baseMipLevel() {
        return segment.get(LAYOUT$baseMipLevel, OFFSET$baseMipLevel);
    }

    public WGPUTextureViewDescriptor baseMipLevel(@Unsigned int value) {
        segment.set(LAYOUT$baseMipLevel, OFFSET$baseMipLevel, value);
        return this;
    }

    public @Unsigned int mipLevelCount() {
        return segment.get(LAYOUT$mipLevelCount, OFFSET$mipLevelCount);
    }

    public WGPUTextureViewDescriptor mipLevelCount(@Unsigned int value) {
        segment.set(LAYOUT$mipLevelCount, OFFSET$mipLevelCount, value);
        return this;
    }

    public @Unsigned int baseArrayLayer() {
        return segment.get(LAYOUT$baseArrayLayer, OFFSET$baseArrayLayer);
    }

    public WGPUTextureViewDescriptor baseArrayLayer(@Unsigned int value) {
        segment.set(LAYOUT$baseArrayLayer, OFFSET$baseArrayLayer, value);
        return this;
    }

    public @Unsigned int arrayLayerCount() {
        return segment.get(LAYOUT$arrayLayerCount, OFFSET$arrayLayerCount);
    }

    public WGPUTextureViewDescriptor arrayLayerCount(@Unsigned int value) {
        segment.set(LAYOUT$arrayLayerCount, OFFSET$arrayLayerCount, value);
        return this;
    }

    public @EnumType(WGPUTextureAspect.class) int aspect() {
        return segment.get(LAYOUT$aspect, OFFSET$aspect);
    }

    public WGPUTextureViewDescriptor aspect(@EnumType(WGPUTextureAspect.class) int value) {
        segment.set(LAYOUT$aspect, OFFSET$aspect, value);
        return this;
    }

    public @Bitmask(WGPUTextureUsage.class) long usage() {
        return segment.get(LAYOUT$usage, OFFSET$usage);
    }

    public WGPUTextureViewDescriptor usage(@Bitmask(WGPUTextureUsage.class) long value) {
        segment.set(LAYOUT$usage, OFFSET$usage, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(WGPUChainedStruct.LAYOUT).withName("nextInChain"),
        WGPUStringView.LAYOUT.withName("label"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_INT.withName("dimension"),
        ValueLayout.JAVA_INT.withName("baseMipLevel"),
        ValueLayout.JAVA_INT.withName("mipLevelCount"),
        ValueLayout.JAVA_INT.withName("baseArrayLayer"),
        ValueLayout.JAVA_INT.withName("arrayLayerCount"),
        ValueLayout.JAVA_INT.withName("aspect"),
        ValueLayout.JAVA_LONG.withName("usage")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$nextInChain = PathElement.groupElement("nextInChain");
    public static final PathElement PATH$label = PathElement.groupElement("label");
    public static final PathElement PATH$format = PathElement.groupElement("format");
    public static final PathElement PATH$dimension = PathElement.groupElement("dimension");
    public static final PathElement PATH$baseMipLevel = PathElement.groupElement("baseMipLevel");
    public static final PathElement PATH$mipLevelCount = PathElement.groupElement("mipLevelCount");
    public static final PathElement PATH$baseArrayLayer = PathElement.groupElement("baseArrayLayer");
    public static final PathElement PATH$arrayLayerCount = PathElement.groupElement("arrayLayerCount");
    public static final PathElement PATH$aspect = PathElement.groupElement("aspect");
    public static final PathElement PATH$usage = PathElement.groupElement("usage");

    public static final AddressLayout LAYOUT$nextInChain = (AddressLayout) LAYOUT.select(PATH$nextInChain);
    public static final StructLayout LAYOUT$label = (StructLayout) LAYOUT.select(PATH$label);
    public static final OfInt LAYOUT$format = (OfInt) LAYOUT.select(PATH$format);
    public static final OfInt LAYOUT$dimension = (OfInt) LAYOUT.select(PATH$dimension);
    public static final OfInt LAYOUT$baseMipLevel = (OfInt) LAYOUT.select(PATH$baseMipLevel);
    public static final OfInt LAYOUT$mipLevelCount = (OfInt) LAYOUT.select(PATH$mipLevelCount);
    public static final OfInt LAYOUT$baseArrayLayer = (OfInt) LAYOUT.select(PATH$baseArrayLayer);
    public static final OfInt LAYOUT$arrayLayerCount = (OfInt) LAYOUT.select(PATH$arrayLayerCount);
    public static final OfInt LAYOUT$aspect = (OfInt) LAYOUT.select(PATH$aspect);
    public static final OfLong LAYOUT$usage = (OfLong) LAYOUT.select(PATH$usage);

    public static final long SIZE$nextInChain = LAYOUT$nextInChain.byteSize();
    public static final long SIZE$label = LAYOUT$label.byteSize();
    public static final long SIZE$format = LAYOUT$format.byteSize();
    public static final long SIZE$dimension = LAYOUT$dimension.byteSize();
    public static final long SIZE$baseMipLevel = LAYOUT$baseMipLevel.byteSize();
    public static final long SIZE$mipLevelCount = LAYOUT$mipLevelCount.byteSize();
    public static final long SIZE$baseArrayLayer = LAYOUT$baseArrayLayer.byteSize();
    public static final long SIZE$arrayLayerCount = LAYOUT$arrayLayerCount.byteSize();
    public static final long SIZE$aspect = LAYOUT$aspect.byteSize();
    public static final long SIZE$usage = LAYOUT$usage.byteSize();

    public static final long OFFSET$nextInChain = LAYOUT.byteOffset(PATH$nextInChain);
    public static final long OFFSET$label = LAYOUT.byteOffset(PATH$label);
    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);
    public static final long OFFSET$dimension = LAYOUT.byteOffset(PATH$dimension);
    public static final long OFFSET$baseMipLevel = LAYOUT.byteOffset(PATH$baseMipLevel);
    public static final long OFFSET$mipLevelCount = LAYOUT.byteOffset(PATH$mipLevelCount);
    public static final long OFFSET$baseArrayLayer = LAYOUT.byteOffset(PATH$baseArrayLayer);
    public static final long OFFSET$arrayLayerCount = LAYOUT.byteOffset(PATH$arrayLayerCount);
    public static final long OFFSET$aspect = LAYOUT.byteOffset(PATH$aspect);
    public static final long OFFSET$usage = LAYOUT.byteOffset(PATH$usage);
}
