package club.doki7.vma.datatype;

import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.Unsafe;
import club.doki7.ffm.annotation.UnsafeConstructor;
import club.doki7.ffm.ptr.IntPtr;
import org.jetbrains.annotations.NotNull;

import java.lang.foreign.*;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

import static club.doki7.vulkan.VkConstants.*;
import static java.lang.foreign.ValueLayout.*;

/// More detailed statistics than {@code VmaStatistics}.
///
/// These are slower to calculate. Use for debugging purposes.
/// See functions: vmaCalculateStatistics(), vmaCalculatePoolStatistics().
///
/// Previous version of the statistics API provided averages, but they have been removed
/// because they can be easily calculated as:
///
/// {@snippet lang=c:
/// VkDeviceSize allocationSizeAvg = detailedStats.statistics.allocationBytes / detailedStats.statistics.allocationCount;
/// VkDeviceSize unusedBytes = detailedStats.statistics.blockBytes - detailedStats.statistics.allocationBytes;
/// VkDeviceSize unusedRangeSizeAvg = unusedBytes / detailedStats.unusedRangeCount;
/// }
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VmaDetailedStatistics {
///     VmaStatistics statistics; // @link substring="VmaStatistics" target="VmaStatistics" @link substring="statistics" target="#statistics"
///     uint32_t unusedRangeCount; // @link substring="unusedRangeCount" target="#unusedRangeCount"
///     VkDeviceSize allocationSizeMin; // @link substring="allocationSizeMin" target="#allocationSizeMin"
///     VkDeviceSize allocationSizeMax; // @link substring="allocationSizeMax" target="#allocationSizeMax"
///     VkDeviceSize unusedRangeSizeMin; // @link substring="unusedRangeSizeMin" target="#unusedRangeSizeMin"
///     VkDeviceSize unusedRangeSizeMax; // @link substring="unusedRangeSizeMax" target="#unusedRangeSizeMax"
/// } VmaDetailedStatistics;
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
///
/// ## Member documentation
///
/// <ul>
/// <li>{@link #statistics} Basic statistics.</li>
/// <li>{@link #unusedRangeCount} Number of free ranges of memory between allocations.</li>
/// <li>{@link #allocationSizeMin} Smallest allocation size. `VK_WHOLE_SIZE` if there are 0 allocations.</li>
/// <li>{@link #allocationSizeMax} Largest allocation size. 0 if there are 0 allocations.</li>
/// <li>{@link #unusedRangeSizeMin} Smallest empty range size. `VK_WHOLE_SIZE` if there are 0 empty ranges.</li>
/// <li>{@link #unusedRangeSizeMax} Largest empty range size. 0 if there are 0 empty ranges.</li>
/// </ul>
@ValueBasedCandidate
@UnsafeConstructor
public record VmaDetailedStatistics(@NotNull MemorySegment segment) implements IVmaDetailedStatistics {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VmaDetailedStatistics}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVmaDetailedStatistics to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VmaDetailedStatistics.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVmaDetailedStatistics, Iterable<VmaDetailedStatistics> {
        public long size() {
            return segment.byteSize() / VmaDetailedStatistics.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VmaDetailedStatistics at(long index) {
            return new VmaDetailedStatistics(segment.asSlice(index * VmaDetailedStatistics.BYTES, VmaDetailedStatistics.BYTES));
        }

        public void write(long index, @NotNull VmaDetailedStatistics value) {
            MemorySegment s = segment.asSlice(index * VmaDetailedStatistics.BYTES, VmaDetailedStatistics.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * VmaDetailedStatistics.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VmaDetailedStatistics.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VmaDetailedStatistics.BYTES,
                (end - start) * VmaDetailedStatistics.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VmaDetailedStatistics.BYTES));
        }

        public VmaDetailedStatistics[] toArray() {
            VmaDetailedStatistics[] ret = new VmaDetailedStatistics[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<VmaDetailedStatistics> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<VmaDetailedStatistics> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= VmaDetailedStatistics.BYTES;
            }

            @Override
            public VmaDetailedStatistics next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                VmaDetailedStatistics ret = new VmaDetailedStatistics(segment.asSlice(0, VmaDetailedStatistics.BYTES));
                segment = segment.asSlice(VmaDetailedStatistics.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static VmaDetailedStatistics allocate(Arena arena) {
        return new VmaDetailedStatistics(arena.allocate(LAYOUT));
    }

    public static VmaDetailedStatistics.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new VmaDetailedStatistics.Ptr(segment);
    }

    public static VmaDetailedStatistics clone(Arena arena, VmaDetailedStatistics src) {
        VmaDetailedStatistics ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NotNull VmaStatistics statistics() {
        return new VmaStatistics(segment.asSlice(OFFSET$statistics, LAYOUT$statistics));
    }

    public VmaDetailedStatistics statistics(@NotNull VmaStatistics value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$statistics, SIZE$statistics);
        return this;
    }

    public VmaDetailedStatistics statistics(Consumer<@NotNull VmaStatistics> consumer) {
        consumer.accept(statistics());
        return this;
    }

    public @Unsigned int unusedRangeCount() {
        return segment.get(LAYOUT$unusedRangeCount, OFFSET$unusedRangeCount);
    }

    public VmaDetailedStatistics unusedRangeCount(@Unsigned int value) {
        segment.set(LAYOUT$unusedRangeCount, OFFSET$unusedRangeCount, value);
        return this;
    }

    public @NativeType("VkDeviceSize") @Unsigned long allocationSizeMin() {
        return segment.get(LAYOUT$allocationSizeMin, OFFSET$allocationSizeMin);
    }

    public VmaDetailedStatistics allocationSizeMin(@NativeType("VkDeviceSize") @Unsigned long value) {
        segment.set(LAYOUT$allocationSizeMin, OFFSET$allocationSizeMin, value);
        return this;
    }

    public @NativeType("VkDeviceSize") @Unsigned long allocationSizeMax() {
        return segment.get(LAYOUT$allocationSizeMax, OFFSET$allocationSizeMax);
    }

    public VmaDetailedStatistics allocationSizeMax(@NativeType("VkDeviceSize") @Unsigned long value) {
        segment.set(LAYOUT$allocationSizeMax, OFFSET$allocationSizeMax, value);
        return this;
    }

    public @NativeType("VkDeviceSize") @Unsigned long unusedRangeSizeMin() {
        return segment.get(LAYOUT$unusedRangeSizeMin, OFFSET$unusedRangeSizeMin);
    }

    public VmaDetailedStatistics unusedRangeSizeMin(@NativeType("VkDeviceSize") @Unsigned long value) {
        segment.set(LAYOUT$unusedRangeSizeMin, OFFSET$unusedRangeSizeMin, value);
        return this;
    }

    public @NativeType("VkDeviceSize") @Unsigned long unusedRangeSizeMax() {
        return segment.get(LAYOUT$unusedRangeSizeMax, OFFSET$unusedRangeSizeMax);
    }

    public VmaDetailedStatistics unusedRangeSizeMax(@NativeType("VkDeviceSize") @Unsigned long value) {
        segment.set(LAYOUT$unusedRangeSizeMax, OFFSET$unusedRangeSizeMax, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        VmaStatistics.LAYOUT.withName("statistics"),
        ValueLayout.JAVA_INT.withName("unusedRangeCount"),
        ValueLayout.JAVA_LONG.withName("allocationSizeMin"),
        ValueLayout.JAVA_LONG.withName("allocationSizeMax"),
        ValueLayout.JAVA_LONG.withName("unusedRangeSizeMin"),
        ValueLayout.JAVA_LONG.withName("unusedRangeSizeMax")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$statistics = PathElement.groupElement("statistics");
    public static final PathElement PATH$unusedRangeCount = PathElement.groupElement("unusedRangeCount");
    public static final PathElement PATH$allocationSizeMin = PathElement.groupElement("allocationSizeMin");
    public static final PathElement PATH$allocationSizeMax = PathElement.groupElement("allocationSizeMax");
    public static final PathElement PATH$unusedRangeSizeMin = PathElement.groupElement("unusedRangeSizeMin");
    public static final PathElement PATH$unusedRangeSizeMax = PathElement.groupElement("unusedRangeSizeMax");

    public static final StructLayout LAYOUT$statistics = (StructLayout) LAYOUT.select(PATH$statistics);
    public static final OfInt LAYOUT$unusedRangeCount = (OfInt) LAYOUT.select(PATH$unusedRangeCount);
    public static final OfLong LAYOUT$allocationSizeMin = (OfLong) LAYOUT.select(PATH$allocationSizeMin);
    public static final OfLong LAYOUT$allocationSizeMax = (OfLong) LAYOUT.select(PATH$allocationSizeMax);
    public static final OfLong LAYOUT$unusedRangeSizeMin = (OfLong) LAYOUT.select(PATH$unusedRangeSizeMin);
    public static final OfLong LAYOUT$unusedRangeSizeMax = (OfLong) LAYOUT.select(PATH$unusedRangeSizeMax);

    public static final long SIZE$statistics = LAYOUT$statistics.byteSize();
    public static final long SIZE$unusedRangeCount = LAYOUT$unusedRangeCount.byteSize();
    public static final long SIZE$allocationSizeMin = LAYOUT$allocationSizeMin.byteSize();
    public static final long SIZE$allocationSizeMax = LAYOUT$allocationSizeMax.byteSize();
    public static final long SIZE$unusedRangeSizeMin = LAYOUT$unusedRangeSizeMin.byteSize();
    public static final long SIZE$unusedRangeSizeMax = LAYOUT$unusedRangeSizeMax.byteSize();

    public static final long OFFSET$statistics = LAYOUT.byteOffset(PATH$statistics);
    public static final long OFFSET$unusedRangeCount = LAYOUT.byteOffset(PATH$unusedRangeCount);
    public static final long OFFSET$allocationSizeMin = LAYOUT.byteOffset(PATH$allocationSizeMin);
    public static final long OFFSET$allocationSizeMax = LAYOUT.byteOffset(PATH$allocationSizeMax);
    public static final long OFFSET$unusedRangeSizeMin = LAYOUT.byteOffset(PATH$unusedRangeSizeMin);
    public static final long OFFSET$unusedRangeSizeMax = LAYOUT.byteOffset(PATH$unusedRangeSizeMax);
}
