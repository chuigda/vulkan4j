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

/// Parameters of {@code VmaAllocation} objects, that can be retrieved using function vmaGetAllocationInfo().
///
/// There is also an extended version of this structure that carries additional parameters: {@code VmaAllocationInfo2}.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VmaAllocationInfo {
///     uint32_t memoryType; // @link substring="memoryType" target="#memoryType"
///     VkDeviceMemory deviceMemory; // optional // @link substring="VkDeviceMemory" target="VkDeviceMemory" @link substring="deviceMemory" target="#deviceMemory"
///     VkDeviceSize offset; // @link substring="offset" target="#offset"
///     VkDeviceSize size; // @link substring="size" target="#size"
///     void* pMappedData; // optional // @link substring="pMappedData" target="#pMappedData"
///     void* pUserData; // optional // @link substring="pUserData" target="#pUserData"
///     char const* pName; // optional // @link substring="pName" target="#pName"
/// } VmaAllocationInfo;
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
/// <li>{@link #memoryType} Memory type index that this allocation was allocated from.
///
/// It never changes.
/// </li>
/// <li>{@link #deviceMemory} Handle to Vulkan memory object.
///
/// Same memory object can be shared by multiple allocations.
///
/// It can change after the allocation is moved during  defragmentation.
/// </li>
/// <li>{@link #offset} Offset in `VkDeviceMemory` object to the beginning of this allocation, in bytes. `(deviceMemory, offset)` pair is unique to this allocation.
///
/// You usually don't need to use this offset. If you create a buffer or an image together with the allocation using e.g. function
/// vmaCreateBuffer(), vmaCreateImage(), functions that operate on these resources refer to the beginning of the buffer or image,
/// not entire device memory block. Functions like vmaMapMemory(), vmaBindBufferMemory() also refer to the beginning of the allocation
/// and apply this offset automatically.
///
/// It can change after the allocation is moved during  defragmentation.
/// </li>
/// <li>{@link #size} Size of this allocation, in bytes.
///
/// It never changes.
///
///
/// ote Allocation size returned in this variable may be greater than the size
/// requested for the resource e.g. as `VkBufferCreateInfo::size`. Whole size of the
/// allocation is accessible for operations on memory e.g. using a pointer after
/// mapping with vmaMapMemory(), but operations on the resource e.g. using
/// `vkCmdCopyBuffer` must be limited to the size of the resource.
/// </li>
/// <li>{@link #pMappedData} Pointer to the beginning of this allocation as mapped data.
///
/// If the allocation hasn't been mapped using vmaMapMemory() and hasn't been
/// created with {@code VMA_ALLOCATION_CREATE_MAPPED_BIT} flag, this value is null.
///
/// It can change after call to vmaMapMemory(), vmaUnmapMemory().
/// It can also change after the allocation is moved during  defragmentation.
/// </li>
/// <li>{@link #pUserData} Custom general-purpose pointer that was passed as VmaAllocationCreateInfo::pUserData or set using vmaSetAllocationUserData().
///
/// It can change after call to vmaSetAllocationUserData() for this allocation.
/// </li>
/// <li>{@link #pName} Custom allocation name that was set with vmaSetAllocationName().
///
/// It can change after call to vmaSetAllocationName() for this allocation.
///
/// Another way to set custom name is to pass it in VmaAllocationCreateInfo::pUserData with
/// additional flag {@code VMA_ALLOCATION_CREATE_USER_DATA_COPY_STRING_BIT} set (deprecated).
/// </li>
/// </ul>
@ValueBasedCandidate
@UnsafeConstructor
public record VmaAllocationInfo(@NotNull MemorySegment segment) implements IVmaAllocationInfo {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VmaAllocationInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVmaAllocationInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VmaAllocationInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVmaAllocationInfo, Iterable<VmaAllocationInfo> {
        public long size() {
            return segment.byteSize() / VmaAllocationInfo.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VmaAllocationInfo at(long index) {
            return new VmaAllocationInfo(segment.asSlice(index * VmaAllocationInfo.BYTES, VmaAllocationInfo.BYTES));
        }

        public void write(long index, @NotNull VmaAllocationInfo value) {
            MemorySegment s = segment.asSlice(index * VmaAllocationInfo.BYTES, VmaAllocationInfo.BYTES);
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
        public @NotNull Ptr reinterpret(long index) {
            return new Ptr(segment.asSlice(index * VmaAllocationInfo.BYTES, VmaAllocationInfo.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VmaAllocationInfo.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VmaAllocationInfo.BYTES,
                (end - start) * VmaAllocationInfo.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VmaAllocationInfo.BYTES));
        }

        public VmaAllocationInfo[] toArray() {
            VmaAllocationInfo[] ret = new VmaAllocationInfo[(int) size()];
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
        public static final class Iter implements Iterator<VmaAllocationInfo> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= VmaAllocationInfo.BYTES;
            }

            @Override
            public VmaAllocationInfo next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                VmaAllocationInfo ret = new VmaAllocationInfo(segment.asSlice(0, VmaAllocationInfo.BYTES));
                segment = segment.asSlice(VmaAllocationInfo.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static VmaAllocationInfo allocate(Arena arena) {
        return new VmaAllocationInfo(arena.allocate(LAYOUT));
    }

    public static VmaAllocationInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new VmaAllocationInfo.Ptr(segment);
    }

    public static VmaAllocationInfo clone(Arena arena, VmaAllocationInfo src) {
        VmaAllocationInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Unsigned int memoryType() {
        return segment.get(LAYOUT$memoryType, OFFSET$memoryType);
    }

    public void memoryType(@Unsigned int value) {
        segment.set(LAYOUT$memoryType, OFFSET$memoryType, value);
    }

    public @Nullable VkDeviceMemory deviceMemory() {
        MemorySegment s = segment.asSlice(OFFSET$deviceMemory, SIZE$deviceMemory);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkDeviceMemory(s);
    }

    public void deviceMemory(@Nullable VkDeviceMemory value) {
        segment.set(LAYOUT$deviceMemory, OFFSET$deviceMemory, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @NativeType("VkDeviceSize") @Unsigned long offset() {
        return segment.get(LAYOUT$offset, OFFSET$offset);
    }

    public void offset(@NativeType("VkDeviceSize") @Unsigned long value) {
        segment.set(LAYOUT$offset, OFFSET$offset, value);
    }

    public @NativeType("VkDeviceSize") @Unsigned long size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public void size(@NativeType("VkDeviceSize") @Unsigned long value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
    }

    public @Pointer(comment="void*") MemorySegment pMappedData() {
        return segment.get(LAYOUT$pMappedData, OFFSET$pMappedData);
    }

    public void pMappedData(@Pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pMappedData, OFFSET$pMappedData, value);
    }

    public void pMappedData(@Nullable IPointer pointer) {
        pMappedData(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @Pointer(comment="void*") MemorySegment pUserData() {
        return segment.get(LAYOUT$pUserData, OFFSET$pUserData);
    }

    public void pUserData(@Pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pUserData, OFFSET$pUserData, value);
    }

    public void pUserData(@Nullable IPointer pointer) {
        pUserData(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    /// Note: the returned {@link BytePtr} does not have correct
    /// {@link BytePtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link BytePtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable BytePtr pName() {
        MemorySegment s = pNameRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new BytePtr(s);
    }

    public void pName(@Nullable BytePtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pNameRaw(s);
    }

    public @Pointer(comment="int8_t*") MemorySegment pNameRaw() {
        return segment.get(LAYOUT$pName, OFFSET$pName);
    }

    public void pNameRaw(@Pointer(comment="int8_t*") MemorySegment value) {
        segment.set(LAYOUT$pName, OFFSET$pName, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("memoryType"),
        ValueLayout.ADDRESS.withName("deviceMemory"),
        ValueLayout.JAVA_LONG.withName("offset"),
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.ADDRESS.withName("pMappedData"),
        ValueLayout.ADDRESS.withName("pUserData"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("pName")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$memoryType = PathElement.groupElement("memoryType");
    public static final PathElement PATH$deviceMemory = PathElement.groupElement("deviceMemory");
    public static final PathElement PATH$offset = PathElement.groupElement("offset");
    public static final PathElement PATH$size = PathElement.groupElement("size");
    public static final PathElement PATH$pMappedData = PathElement.groupElement("pMappedData");
    public static final PathElement PATH$pUserData = PathElement.groupElement("pUserData");
    public static final PathElement PATH$pName = PathElement.groupElement("pName");

    public static final OfInt LAYOUT$memoryType = (OfInt) LAYOUT.select(PATH$memoryType);
    public static final AddressLayout LAYOUT$deviceMemory = (AddressLayout) LAYOUT.select(PATH$deviceMemory);
    public static final OfLong LAYOUT$offset = (OfLong) LAYOUT.select(PATH$offset);
    public static final OfLong LAYOUT$size = (OfLong) LAYOUT.select(PATH$size);
    public static final AddressLayout LAYOUT$pMappedData = (AddressLayout) LAYOUT.select(PATH$pMappedData);
    public static final AddressLayout LAYOUT$pUserData = (AddressLayout) LAYOUT.select(PATH$pUserData);
    public static final AddressLayout LAYOUT$pName = (AddressLayout) LAYOUT.select(PATH$pName);

    public static final long SIZE$memoryType = LAYOUT$memoryType.byteSize();
    public static final long SIZE$deviceMemory = LAYOUT$deviceMemory.byteSize();
    public static final long SIZE$offset = LAYOUT$offset.byteSize();
    public static final long SIZE$size = LAYOUT$size.byteSize();
    public static final long SIZE$pMappedData = LAYOUT$pMappedData.byteSize();
    public static final long SIZE$pUserData = LAYOUT$pUserData.byteSize();
    public static final long SIZE$pName = LAYOUT$pName.byteSize();

    public static final long OFFSET$memoryType = LAYOUT.byteOffset(PATH$memoryType);
    public static final long OFFSET$deviceMemory = LAYOUT.byteOffset(PATH$deviceMemory);
    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
    public static final long OFFSET$pMappedData = LAYOUT.byteOffset(PATH$pMappedData);
    public static final long OFFSET$pUserData = LAYOUT.byteOffset(PATH$pUserData);
    public static final long OFFSET$pName = LAYOUT.byteOffset(PATH$pName);
}
