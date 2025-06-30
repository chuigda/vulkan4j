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
import club.doki7.vma.VMAFunctionTypes.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;
import static club.doki7.vulkan.VkConstants.*;

/// Extended parameters of a {@code VmaAllocation} object that can be retrieved using function vmaGetAllocationInfo2().
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VmaAllocationInfo2 {
///     VmaAllocationInfo allocationInfo; // @link substring="VmaAllocationInfo" target="VmaAllocationInfo" @link substring="allocationInfo" target="#allocationInfo"
///     VkDeviceSize blockSize; // @link substring="blockSize" target="#blockSize"
///     VkBool32 dedicatedMemory; // @link substring="dedicatedMemory" target="#dedicatedMemory"
/// } VmaAllocationInfo2;
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
/// <li>{@link #allocationInfo} Basic parameters of the allocation.
///
/// If you need only these, you can use function vmaGetAllocationInfo() and structure {@code VmaAllocationInfo} instead.
/// </li>
/// <li>{@link #blockSize} Size of the `VkDeviceMemory` block that the allocation belongs to.
///
/// In case of an allocation with dedicated memory, it will be equal to `allocationInfo.size`.
/// </li>
/// <li>{@link #dedicatedMemory} `VK_TRUE` if the allocation has dedicated memory, `VK_FALSE` if it was placed as part of a larger memory block.
///
/// When `VK_TRUE`, it also means `VkMemoryDedicatedAllocateInfo` was used when creating the allocation
/// (if VK_KHR_dedicated_allocation extension or Vulkan version &amp;gt;= 1.1 is enabled).
/// </li>
/// </ul>
@ValueBasedCandidate
@UnsafeConstructor
public record VmaAllocationInfo2(@NotNull MemorySegment segment) implements IVmaAllocationInfo2 {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VmaAllocationInfo2}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVmaAllocationInfo2 to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VmaAllocationInfo2.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVmaAllocationInfo2, Iterable<VmaAllocationInfo2> {
        public long size() {
            return segment.byteSize() / VmaAllocationInfo2.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VmaAllocationInfo2 at(long index) {
            return new VmaAllocationInfo2(segment.asSlice(index * VmaAllocationInfo2.BYTES, VmaAllocationInfo2.BYTES));
        }

        public VmaAllocationInfo2.Ptr at(long index, @NotNull Consumer<@NotNull VmaAllocationInfo2> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull VmaAllocationInfo2 value) {
            MemorySegment s = segment.asSlice(index * VmaAllocationInfo2.BYTES, VmaAllocationInfo2.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * VmaAllocationInfo2.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VmaAllocationInfo2.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VmaAllocationInfo2.BYTES,
                (end - start) * VmaAllocationInfo2.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VmaAllocationInfo2.BYTES));
        }

        public VmaAllocationInfo2[] toArray() {
            VmaAllocationInfo2[] ret = new VmaAllocationInfo2[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<VmaAllocationInfo2> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<VmaAllocationInfo2> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= VmaAllocationInfo2.BYTES;
            }

            @Override
            public VmaAllocationInfo2 next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                VmaAllocationInfo2 ret = new VmaAllocationInfo2(segment.asSlice(0, VmaAllocationInfo2.BYTES));
                segment = segment.asSlice(VmaAllocationInfo2.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static VmaAllocationInfo2 allocate(Arena arena) {
        return new VmaAllocationInfo2(arena.allocate(LAYOUT));
    }

    public static VmaAllocationInfo2.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new VmaAllocationInfo2.Ptr(segment);
    }

    public static VmaAllocationInfo2 clone(Arena arena, VmaAllocationInfo2 src) {
        VmaAllocationInfo2 ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NotNull VmaAllocationInfo allocationInfo() {
        return new VmaAllocationInfo(segment.asSlice(OFFSET$allocationInfo, LAYOUT$allocationInfo));
    }

    public VmaAllocationInfo2 allocationInfo(@NotNull VmaAllocationInfo value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$allocationInfo, SIZE$allocationInfo);
        return this;
    }

    public VmaAllocationInfo2 allocationInfo(Consumer<@NotNull VmaAllocationInfo> consumer) {
        consumer.accept(allocationInfo());
        return this;
    }

    public @NativeType("VkDeviceSize") @Unsigned long blockSize() {
        return segment.get(LAYOUT$blockSize, OFFSET$blockSize);
    }

    public VmaAllocationInfo2 blockSize(@NativeType("VkDeviceSize") @Unsigned long value) {
        segment.set(LAYOUT$blockSize, OFFSET$blockSize, value);
        return this;
    }

    public @NativeType("VkBool32") @Unsigned int dedicatedMemory() {
        return segment.get(LAYOUT$dedicatedMemory, OFFSET$dedicatedMemory);
    }

    public VmaAllocationInfo2 dedicatedMemory(@NativeType("VkBool32") @Unsigned int value) {
        segment.set(LAYOUT$dedicatedMemory, OFFSET$dedicatedMemory, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        VmaAllocationInfo.LAYOUT.withName("allocationInfo"),
        ValueLayout.JAVA_LONG.withName("blockSize"),
        ValueLayout.JAVA_INT.withName("dedicatedMemory")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$allocationInfo = PathElement.groupElement("allocationInfo");
    public static final PathElement PATH$blockSize = PathElement.groupElement("blockSize");
    public static final PathElement PATH$dedicatedMemory = PathElement.groupElement("dedicatedMemory");

    public static final StructLayout LAYOUT$allocationInfo = (StructLayout) LAYOUT.select(PATH$allocationInfo);
    public static final OfLong LAYOUT$blockSize = (OfLong) LAYOUT.select(PATH$blockSize);
    public static final OfInt LAYOUT$dedicatedMemory = (OfInt) LAYOUT.select(PATH$dedicatedMemory);

    public static final long SIZE$allocationInfo = LAYOUT$allocationInfo.byteSize();
    public static final long SIZE$blockSize = LAYOUT$blockSize.byteSize();
    public static final long SIZE$dedicatedMemory = LAYOUT$dedicatedMemory.byteSize();

    public static final long OFFSET$allocationInfo = LAYOUT.byteOffset(PATH$allocationInfo);
    public static final long OFFSET$blockSize = LAYOUT.byteOffset(PATH$blockSize);
    public static final long OFFSET$dedicatedMemory = LAYOUT.byteOffset(PATH$dedicatedMemory);
}
