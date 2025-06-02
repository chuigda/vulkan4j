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

/// Calculated statistics of memory usage e.g. in a specific memory type, heap, custom pool, or total.
///
/// These are fast to calculate.
/// See functions: vmaGetHeapBudgets(), vmaGetPoolStatistics().
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VmaStatistics {
///     uint32_t blockCount; // @link substring="blockCount" target="#blockCount"
///     uint32_t allocationCount; // @link substring="allocationCount" target="#allocationCount"
///     VkDeviceSize blockBytes; // @link substring="blockBytes" target="#blockBytes"
///     VkDeviceSize allocationBytes; // @link substring="allocationBytes" target="#allocationBytes"
/// } VmaStatistics;
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
/// <li>{@link #blockCount} Number of `VkDeviceMemory` objects - Vulkan memory blocks allocated.</li>
/// <li>{@link #allocationCount} Number of {@code VmaAllocation} objects allocated.
///
/// Dedicated allocations have their own blocks, so each one adds 1 to `allocationCount` as well as `blockCount`.
/// </li>
/// <li>{@link #blockBytes} Number of bytes allocated in `VkDeviceMemory` blocks.
///
///
/// ote To avoid confusion, please be aware that what Vulkan calls an "allocation" - a whole `VkDeviceMemory` object
/// (e.g. as in `VkPhysicalDeviceLimits::maxMemoryAllocationCount`) is called a "block" in VMA, while VMA calls
/// "allocation" a {@code VmaAllocation} object that represents a memory region sub-allocated from such block, usually for a single buffer or image.
/// </li>
/// <li>{@link #allocationBytes} Total number of bytes occupied by all {@code VmaAllocation} objects.
///
/// Always less or equal than `blockBytes`.
/// Difference `(blockBytes - allocationBytes)` is the amount of memory allocated from Vulkan
/// but unused by any {@code VmaAllocation}.
/// </li>
/// </ul>
@ValueBasedCandidate
@UnsafeConstructor
public record VmaStatistics(@NotNull MemorySegment segment) implements IVmaStatistics {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VmaStatistics}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVmaStatistics to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VmaStatistics.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVmaStatistics, Iterable<VmaStatistics> {
        public long size() {
            return segment.byteSize() / VmaStatistics.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VmaStatistics at(long index) {
            return new VmaStatistics(segment.asSlice(index * VmaStatistics.BYTES, VmaStatistics.BYTES));
        }

        public void write(long index, @NotNull VmaStatistics value) {
            MemorySegment s = segment.asSlice(index * VmaStatistics.BYTES, VmaStatistics.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * VmaStatistics.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VmaStatistics.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VmaStatistics.BYTES,
                (end - start) * VmaStatistics.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VmaStatistics.BYTES));
        }

        public VmaStatistics[] toArray() {
            VmaStatistics[] ret = new VmaStatistics[(int) size()];
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
        public static final class Iter implements Iterator<VmaStatistics> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= VmaStatistics.BYTES;
            }

            @Override
            public VmaStatistics next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                VmaStatistics ret = new VmaStatistics(segment.asSlice(0, VmaStatistics.BYTES));
                segment = segment.asSlice(VmaStatistics.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static VmaStatistics allocate(Arena arena) {
        return new VmaStatistics(arena.allocate(LAYOUT));
    }

    public static VmaStatistics.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new VmaStatistics.Ptr(segment);
    }

    public static VmaStatistics clone(Arena arena, VmaStatistics src) {
        VmaStatistics ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Unsigned int blockCount() {
        return segment.get(LAYOUT$blockCount, OFFSET$blockCount);
    }

    public VmaStatistics blockCount(@Unsigned int value) {
        segment.set(LAYOUT$blockCount, OFFSET$blockCount, value);
        return this;
    }

    public @Unsigned int allocationCount() {
        return segment.get(LAYOUT$allocationCount, OFFSET$allocationCount);
    }

    public VmaStatistics allocationCount(@Unsigned int value) {
        segment.set(LAYOUT$allocationCount, OFFSET$allocationCount, value);
        return this;
    }

    public @NativeType("VkDeviceSize") @Unsigned long blockBytes() {
        return segment.get(LAYOUT$blockBytes, OFFSET$blockBytes);
    }

    public VmaStatistics blockBytes(@NativeType("VkDeviceSize") @Unsigned long value) {
        segment.set(LAYOUT$blockBytes, OFFSET$blockBytes, value);
        return this;
    }

    public @NativeType("VkDeviceSize") @Unsigned long allocationBytes() {
        return segment.get(LAYOUT$allocationBytes, OFFSET$allocationBytes);
    }

    public VmaStatistics allocationBytes(@NativeType("VkDeviceSize") @Unsigned long value) {
        segment.set(LAYOUT$allocationBytes, OFFSET$allocationBytes, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("blockCount"),
        ValueLayout.JAVA_INT.withName("allocationCount"),
        ValueLayout.JAVA_LONG.withName("blockBytes"),
        ValueLayout.JAVA_LONG.withName("allocationBytes")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$blockCount = PathElement.groupElement("blockCount");
    public static final PathElement PATH$allocationCount = PathElement.groupElement("allocationCount");
    public static final PathElement PATH$blockBytes = PathElement.groupElement("blockBytes");
    public static final PathElement PATH$allocationBytes = PathElement.groupElement("allocationBytes");

    public static final OfInt LAYOUT$blockCount = (OfInt) LAYOUT.select(PATH$blockCount);
    public static final OfInt LAYOUT$allocationCount = (OfInt) LAYOUT.select(PATH$allocationCount);
    public static final OfLong LAYOUT$blockBytes = (OfLong) LAYOUT.select(PATH$blockBytes);
    public static final OfLong LAYOUT$allocationBytes = (OfLong) LAYOUT.select(PATH$allocationBytes);

    public static final long SIZE$blockCount = LAYOUT$blockCount.byteSize();
    public static final long SIZE$allocationCount = LAYOUT$allocationCount.byteSize();
    public static final long SIZE$blockBytes = LAYOUT$blockBytes.byteSize();
    public static final long SIZE$allocationBytes = LAYOUT$allocationBytes.byteSize();

    public static final long OFFSET$blockCount = LAYOUT.byteOffset(PATH$blockCount);
    public static final long OFFSET$allocationCount = LAYOUT.byteOffset(PATH$allocationCount);
    public static final long OFFSET$blockBytes = LAYOUT.byteOffset(PATH$blockBytes);
    public static final long OFFSET$allocationBytes = LAYOUT.byteOffset(PATH$allocationBytes);
}
