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

/// Represents a pointer to a {@code WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE {
///     WGPUChainedStruct chain; // @link substring="WGPUChainedStruct" target="WGPUChainedStruct" @link substring="chain" target="#chain"
///     WGPUPipelineStatisticName const* pipelineStatistics; // @link substring="WGPUPipelineStatisticName" target="WGPUPipelineStatisticName" @link substring="pipelineStatistics" target="#pipelineStatistics"
///     size_t pipelineStatisticCount; // @link substring="pipelineStatisticCount" target="#pipelineStatisticCount"
/// } WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE;
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
public record WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE(@NotNull MemorySegment segment) implements IWGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE, Iterable<WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE> {
        public long size() {
            return segment.byteSize() / WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE at(long index) {
            return new WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE(segment.asSlice(index * WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE.BYTES, WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE.BYTES));
        }

        public WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE.Ptr at(long index, @NotNull Consumer<@NotNull WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE value) {
            MemorySegment s = segment.asSlice(index * WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE.BYTES, WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE.BYTES,
                (end - start) * WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE.BYTES));
        }

        public WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE[] toArray() {
            WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE[] ret = new WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE.BYTES;
            }

            @Override
            public WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE ret = new WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE(segment.asSlice(0, WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE.BYTES));
                segment = segment.asSlice(WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE allocate(Arena arena) {
        return new WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE(arena.allocate(LAYOUT));
    }

    public static WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE.Ptr(segment);
    }

    public static WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE clone(Arena arena, WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE src) {
        WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NotNull WGPUChainedStruct chain() {
        return new WGPUChainedStruct(segment.asSlice(OFFSET$chain, LAYOUT$chain));
    }

    public WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE chain(@NotNull WGPUChainedStruct value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$chain, SIZE$chain);
        return this;
    }

    public WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE chain(Consumer<@NotNull WGPUChainedStruct> consumer) {
        consumer.accept(chain());
        return this;
    }


    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @EnumType(WGPUPipelineStatisticName.class) IntPtr pipelineStatistics() {
        MemorySegment s = pipelineStatisticsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE pipelineStatistics(@Nullable @EnumType(WGPUPipelineStatisticName.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pipelineStatisticsRaw(s);
        return this;
    }

    public @Pointer(target=WGPUPipelineStatisticName.class) @NotNull MemorySegment pipelineStatisticsRaw() {
        return segment.get(LAYOUT$pipelineStatistics, OFFSET$pipelineStatistics);
    }

    public void pipelineStatisticsRaw(@Pointer(target=WGPUPipelineStatisticName.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$pipelineStatistics, OFFSET$pipelineStatistics, value);
    }

    public @Unsigned long pipelineStatisticCount() {
        return NativeLayout.readCSizeT(segment, OFFSET$pipelineStatisticCount);
    }

    public WGPUQuerySetDescriptorExtras WGPU_STRUCTURE_ATTRIBUTE pipelineStatisticCount(@Unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$pipelineStatisticCount, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        WGPUChainedStruct.LAYOUT.withName("chain"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pipelineStatistics"),
        NativeLayout.C_SIZE_T.withName("pipelineStatisticCount")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$chain = PathElement.groupElement("chain");
    public static final PathElement PATH$pipelineStatistics = PathElement.groupElement("pipelineStatistics");
    public static final PathElement PATH$pipelineStatisticCount = PathElement.groupElement("pipelineStatisticCount");

    public static final StructLayout LAYOUT$chain = (StructLayout) LAYOUT.select(PATH$chain);
    public static final AddressLayout LAYOUT$pipelineStatistics = (AddressLayout) LAYOUT.select(PATH$pipelineStatistics);

    public static final long SIZE$chain = LAYOUT$chain.byteSize();
    public static final long SIZE$pipelineStatistics = LAYOUT$pipelineStatistics.byteSize();
    public static final long SIZE$pipelineStatisticCount = NativeLayout.C_SIZE_T.byteSize();

    public static final long OFFSET$chain = LAYOUT.byteOffset(PATH$chain);
    public static final long OFFSET$pipelineStatistics = LAYOUT.byteOffset(PATH$pipelineStatistics);
    public static final long OFFSET$pipelineStatisticCount = LAYOUT.byteOffset(PATH$pipelineStatisticCount);
}
