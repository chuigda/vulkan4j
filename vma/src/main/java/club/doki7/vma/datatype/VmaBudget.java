package club.doki7.vma.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;
import java.util.Iterator;
import java.util.NoSuchElementException;

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

/// Statistics of current memory usage and available budget for a specific memory heap.
///
/// These are fast to calculate.
/// See function vmaGetHeapBudgets().
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VmaBudget {
///     VmaStatistics statistics; // @link substring="VmaStatistics" target="VmaStatistics" @link substring="statistics" target="#statistics"
///     VkDeviceSize usage; // @link substring="usage" target="#usage"
///     VkDeviceSize budget; // @link substring="budget" target="#budget"
/// } VmaBudget;
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
/// <li>{@link #statistics} Statistics fetched from the library.</li>
/// <li>{@link #usage} Estimated current memory usage of the program, in bytes.
///
/// Fetched from system using VK_EXT_memory_budget extension if enabled.
///
/// It might be different than `statistics.blockBytes` (usually higher) due to additional implicit objects
/// also occupying the memory, like swapchain, pipelines, descriptor heaps, command buffers, or
/// `VkDeviceMemory` blocks allocated outside of this library, if any.
/// </li>
/// <li>{@link #budget} Estimated amount of memory available to the program, in bytes.
///
/// Fetched from system using VK_EXT_memory_budget extension if enabled.
///
/// It might be different (most probably smaller) than `VkMemoryHeap::size[heapIndex]` due to factors
/// external to the program, decided by the operating system.
/// Difference `budget - usage` is the amount of additional memory that can probably
/// be allocated without problems. Exceeding the budget may result in various problems.
/// </li>
/// </ul>
@ValueBasedCandidate
@UnsafeConstructor
public record VmaBudget(@NotNull MemorySegment segment) implements IVmaBudget {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VmaBudget}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVmaBudget to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VmaBudget.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVmaBudget, Iterable<VmaBudget> {
        public long size() {
            return segment.byteSize() / VmaBudget.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VmaBudget at(long index) {
            return new VmaBudget(segment.asSlice(index * VmaBudget.BYTES, VmaBudget.BYTES));
        }

        public void write(long index, @NotNull VmaBudget value) {
            MemorySegment s = segment.asSlice(index * VmaBudget.BYTES, VmaBudget.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * VmaBudget.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VmaBudget.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VmaBudget.BYTES,
                (end - start) * VmaBudget.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VmaBudget.BYTES));
        }

        public VmaBudget[] toArray() {
            VmaBudget[] ret = new VmaBudget[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iter iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        public static final class Iter implements Iterator<VmaBudget> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= VmaBudget.BYTES;
            }

            @Override
            public VmaBudget next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                VmaBudget ret = new VmaBudget(segment.asSlice(0, VmaBudget.BYTES));
                segment = segment.asSlice(VmaBudget.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static VmaBudget allocate(Arena arena) {
        return new VmaBudget(arena.allocate(LAYOUT));
    }

    public static VmaBudget.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new VmaBudget.Ptr(segment);
    }

    public static VmaBudget clone(Arena arena, VmaBudget src) {
        VmaBudget ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NotNull VmaStatistics statistics() {
        return new VmaStatistics(segment.asSlice(OFFSET$statistics, LAYOUT$statistics));
    }

    public VmaBudget statistics(@NotNull VmaStatistics value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$statistics, SIZE$statistics);
        return this;
    }

    public @NativeType("VkDeviceSize") @Unsigned long usage() {
        return segment.get(LAYOUT$usage, OFFSET$usage);
    }

    public VmaBudget usage(@NativeType("VkDeviceSize") @Unsigned long value) {
        segment.set(LAYOUT$usage, OFFSET$usage, value);
        return this;
    }

    public @NativeType("VkDeviceSize") @Unsigned long budget() {
        return segment.get(LAYOUT$budget, OFFSET$budget);
    }

    public VmaBudget budget(@NativeType("VkDeviceSize") @Unsigned long value) {
        segment.set(LAYOUT$budget, OFFSET$budget, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        VmaStatistics.LAYOUT.withName("statistics"),
        ValueLayout.JAVA_LONG.withName("usage"),
        ValueLayout.JAVA_LONG.withName("budget")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$statistics = PathElement.groupElement("statistics");
    public static final PathElement PATH$usage = PathElement.groupElement("usage");
    public static final PathElement PATH$budget = PathElement.groupElement("budget");

    public static final StructLayout LAYOUT$statistics = (StructLayout) LAYOUT.select(PATH$statistics);
    public static final OfLong LAYOUT$usage = (OfLong) LAYOUT.select(PATH$usage);
    public static final OfLong LAYOUT$budget = (OfLong) LAYOUT.select(PATH$budget);

    public static final long SIZE$statistics = LAYOUT$statistics.byteSize();
    public static final long SIZE$usage = LAYOUT$usage.byteSize();
    public static final long SIZE$budget = LAYOUT$budget.byteSize();

    public static final long OFFSET$statistics = LAYOUT.byteOffset(PATH$statistics);
    public static final long OFFSET$usage = LAYOUT.byteOffset(PATH$usage);
    public static final long OFFSET$budget = LAYOUT.byteOffset(PATH$budget);
}
