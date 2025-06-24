package club.doki7.vma.datatype;

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
import club.doki7.vma.bitmask.*;
import club.doki7.vma.handle.*;
import club.doki7.vma.enumtype.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;
import static club.doki7.vulkan.VkConstants.*;

/// General statistics from current state of the Allocator -
/// total memory usage across all memory heaps and types.
///
/// These are slower to calculate. Use for debugging purposes.
/// See function vmaCalculateStatistics().
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VmaTotalStatistics {
///     VmaDetailedStatistics[VK_MAX_MEMORY_TYPES] memoryType; // @link substring="VmaDetailedStatistics" target="VmaDetailedStatistics" @link substring="memoryType" target="#memoryType"
///     VmaDetailedStatistics[VK_MAX_MEMORY_HEAPS] memoryHeap; // @link substring="VmaDetailedStatistics" target="VmaDetailedStatistics" @link substring="memoryHeap" target="#memoryHeap"
///     VmaDetailedStatistics total; // @link substring="VmaDetailedStatistics" target="VmaDetailedStatistics" @link substring="total" target="#total"
/// } VmaTotalStatistics;
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
public record VmaTotalStatistics(@NotNull MemorySegment segment) implements IVmaTotalStatistics {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VmaTotalStatistics}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVmaTotalStatistics to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VmaTotalStatistics.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVmaTotalStatistics, Iterable<VmaTotalStatistics> {
        public long size() {
            return segment.byteSize() / VmaTotalStatistics.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VmaTotalStatistics at(long index) {
            return new VmaTotalStatistics(segment.asSlice(index * VmaTotalStatistics.BYTES, VmaTotalStatistics.BYTES));
        }

        public void write(long index, @NotNull VmaTotalStatistics value) {
            MemorySegment s = segment.asSlice(index * VmaTotalStatistics.BYTES, VmaTotalStatistics.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * VmaTotalStatistics.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VmaTotalStatistics.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VmaTotalStatistics.BYTES,
                (end - start) * VmaTotalStatistics.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VmaTotalStatistics.BYTES));
        }

        public VmaTotalStatistics[] toArray() {
            VmaTotalStatistics[] ret = new VmaTotalStatistics[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<VmaTotalStatistics> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<VmaTotalStatistics> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= VmaTotalStatistics.BYTES;
            }

            @Override
            public VmaTotalStatistics next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                VmaTotalStatistics ret = new VmaTotalStatistics(segment.asSlice(0, VmaTotalStatistics.BYTES));
                segment = segment.asSlice(VmaTotalStatistics.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static VmaTotalStatistics allocate(Arena arena) {
        return new VmaTotalStatistics(arena.allocate(LAYOUT));
    }

    public static VmaTotalStatistics.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new VmaTotalStatistics.Ptr(segment);
    }

    public static VmaTotalStatistics clone(Arena arena, VmaTotalStatistics src) {
        VmaTotalStatistics ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public VmaDetailedStatistics.Ptr memoryType() {
        return new VmaDetailedStatistics.Ptr(memoryTypeRaw());
    }

    public VmaTotalStatistics memoryType(VmaDetailedStatistics.Ptr value) {
        MemorySegment s = memoryTypeRaw();
        s.copyFrom(value.segment());
        return this;
    }

    public VmaDetailedStatistics memoryTypeAt(int index) {
        MemorySegment s = memoryTypeRaw();
        return new VmaDetailedStatistics(s.asSlice(index * VmaDetailedStatistics.BYTES, VmaDetailedStatistics.BYTES));
    }

    public void memoryTypeAt(int index, VmaDetailedStatistics value) {
        MemorySegment s = memoryTypeRaw();
        MemorySegment.copy(value.segment(), 0, s, index * VmaDetailedStatistics.BYTES, VmaDetailedStatistics.BYTES);
    }

    public @NotNull MemorySegment memoryTypeRaw() {
        return segment.asSlice(OFFSET$memoryType, SIZE$memoryType);
    }

    public VmaDetailedStatistics.Ptr memoryHeap() {
        return new VmaDetailedStatistics.Ptr(memoryHeapRaw());
    }

    public VmaTotalStatistics memoryHeap(VmaDetailedStatistics.Ptr value) {
        MemorySegment s = memoryHeapRaw();
        s.copyFrom(value.segment());
        return this;
    }

    public VmaDetailedStatistics memoryHeapAt(int index) {
        MemorySegment s = memoryHeapRaw();
        return new VmaDetailedStatistics(s.asSlice(index * VmaDetailedStatistics.BYTES, VmaDetailedStatistics.BYTES));
    }

    public void memoryHeapAt(int index, VmaDetailedStatistics value) {
        MemorySegment s = memoryHeapRaw();
        MemorySegment.copy(value.segment(), 0, s, index * VmaDetailedStatistics.BYTES, VmaDetailedStatistics.BYTES);
    }

    public @NotNull MemorySegment memoryHeapRaw() {
        return segment.asSlice(OFFSET$memoryHeap, SIZE$memoryHeap);
    }

    public @NotNull VmaDetailedStatistics total() {
        return new VmaDetailedStatistics(segment.asSlice(OFFSET$total, LAYOUT$total));
    }

    public VmaTotalStatistics total(@NotNull VmaDetailedStatistics value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$total, SIZE$total);
        return this;
    }

    public VmaTotalStatistics total(Consumer<@NotNull VmaDetailedStatistics> consumer) {
        consumer.accept(total());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        MemoryLayout.sequenceLayout(MAX_MEMORY_TYPES, VmaDetailedStatistics.LAYOUT).withName("memoryType"),
        MemoryLayout.sequenceLayout(MAX_MEMORY_HEAPS, VmaDetailedStatistics.LAYOUT).withName("memoryHeap"),
        VmaDetailedStatistics.LAYOUT.withName("total")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$memoryType = PathElement.groupElement("memoryType");
    public static final PathElement PATH$memoryHeap = PathElement.groupElement("memoryHeap");
    public static final PathElement PATH$total = PathElement.groupElement("total");

    public static final SequenceLayout LAYOUT$memoryType = (SequenceLayout) LAYOUT.select(PATH$memoryType);
    public static final SequenceLayout LAYOUT$memoryHeap = (SequenceLayout) LAYOUT.select(PATH$memoryHeap);
    public static final StructLayout LAYOUT$total = (StructLayout) LAYOUT.select(PATH$total);

    public static final long SIZE$memoryType = LAYOUT$memoryType.byteSize();
    public static final long SIZE$memoryHeap = LAYOUT$memoryHeap.byteSize();
    public static final long SIZE$total = LAYOUT$total.byteSize();

    public static final long OFFSET$memoryType = LAYOUT.byteOffset(PATH$memoryType);
    public static final long OFFSET$memoryHeap = LAYOUT.byteOffset(PATH$memoryHeap);
    public static final long OFFSET$total = LAYOUT.byteOffset(PATH$total);
}
