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

/// Description of a Allocator to be created.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VmaAllocatorCreateInfo {
///     VmaAllocatorCreateFlags flags; // @link substring="VmaAllocatorCreateFlags" target="VmaAllocatorCreateFlags" @link substring="flags" target="#flags"
///     VkPhysicalDevice physicalDevice; // @link substring="VkPhysicalDevice" target="VkPhysicalDevice" @link substring="physicalDevice" target="#physicalDevice"
///     VkDevice device; // @link substring="VkDevice" target="VkDevice" @link substring="device" target="#device"
///     VkDeviceSize preferredLargeHeapBlockSize; // @link substring="preferredLargeHeapBlockSize" target="#preferredLargeHeapBlockSize"
///     VkAllocationCallbacks const* pAllocationCallbacks; // optional // @link substring="VkAllocationCallbacks" target="VkAllocationCallbacks" @link substring="pAllocationCallbacks" target="#pAllocationCallbacks"
///     VmaDeviceMemoryCallbacks const* pDeviceMemoryCallbacks; // optional // @link substring="VmaDeviceMemoryCallbacks" target="VmaDeviceMemoryCallbacks" @link substring="pDeviceMemoryCallbacks" target="#pDeviceMemoryCallbacks"
///     VkDeviceSize const* pHeapSizeLimit; // optional // @link substring="pHeapSizeLimit" target="#pHeapSizeLimit"
///     VmaVulkanFunctions const* pVulkanFunctions; // optional // @link substring="VmaVulkanFunctions" target="VmaVulkanFunctions" @link substring="pVulkanFunctions" target="#pVulkanFunctions"
///     VkInstance instance; // @link substring="VkInstance" target="VkInstance" @link substring="instance" target="#instance"
///     uint32_t vulkanApiVersion; // @link substring="vulkanApiVersion" target="#vulkanApiVersion"
///     VkExternalMemoryHandleTypeFlagsKHR const* pTypeExternalMemoryHandleTypes; // optional // @link substring="VkExternalMemoryHandleTypeFlags" target="VkExternalMemoryHandleTypeFlagsKHR" @link substring="pTypeExternalMemoryHandleTypes" target="#pTypeExternalMemoryHandleTypes"
///     void*[8] reserved;
/// } VmaAllocatorCreateInfo;
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
/// <li>{@link #flags} Flags for created allocator. Use {@code VmaAllocatorCreateFlagBits} enum.</li>
/// <li>{@link #physicalDevice} It must be valid throughout whole lifetime of created allocator.</li>
/// <li>{@link #device} It must be valid throughout whole lifetime of created allocator.</li>
/// <li>{@link #preferredLargeHeapBlockSize} Set to 0 to use default, which is currently 256 MiB.</li>
/// <li>{@link #pAllocationCallbacks} Optional, can be null. When specified, will also be used for all CPU-side memory allocations.</li>
/// <li>{@link #pDeviceMemoryCallbacks} Optional, can be null.</li>
/// <li>{@link #pHeapSizeLimit} Either null or a pointer to an array of limits on maximum number of bytes that can be allocated out of particular Vulkan memory heap.
///
/// If not NULL, it must be a pointer to an array of
/// `VkPhysicalDeviceMemoryProperties::memoryHeapCount` elements, defining limit on
/// maximum number of bytes that can be allocated out of particular Vulkan memory
/// heap.
///
/// Any of the elements may be equal to `VK_WHOLE_SIZE`, which means no limit on that
/// heap. This is also the default in case of `pHeapSizeLimit` = NULL.
///
/// If there is a limit defined for a heap:
///
/// - If user tries to allocate more memory from that heap using this allocator,
/// the allocation fails with `VK_ERROR_OUT_OF_DEVICE_MEMORY`.
/// - If the limit is smaller than heap size reported in `VkMemoryHeap::size`, the
/// value of this limit will be reported instead when using vmaGetMemoryProperties().
///
/// Warning! Using this feature may not be equivalent to installing a GPU with
/// smaller amount of memory, because graphics driver doesn't necessary fail new
/// allocations with `VK_ERROR_OUT_OF_DEVICE_MEMORY` result when memory capacity is
/// exceeded. It may return success and just silently migrate some device memory
/// blocks to system RAM. This driver behavior can also be controlled using
/// VK_AMD_memory_overallocation_behavior extension.
/// </li>
/// <li>{@link #pVulkanFunctions} Pointers to Vulkan functions. Can be null.
///
/// For details see [Pointers to Vulkan functions](@ref config_Vulkan_functions).
/// </li>
/// <li>{@link #instance} Handle to Vulkan instance object.
///
/// Starting from version 3.0.0 this member is no longer optional, it must be set!
/// </li>
/// <li>{@link #vulkanApiVersion} Optional. Vulkan version that the application uses.
///
/// It must be a value in the format as created by macro `VK_MAKE_VERSION` or a constant like: `VK_API_VERSION_1_1`, `VK_API_VERSION_1_0`.
/// The patch version number specified is ignored. Only the major and minor versions are considered.
/// Only versions 1.0...1.4 are supported by the current implementation.
/// Leaving it initialized to zero is equivalent to `VK_API_VERSION_1_0`.
/// It must match the Vulkan version used by the application and supported on the selected physical device,
/// so it must be no higher than `VkApplicationInfo::apiVersion` passed to `vkCreateInstance`
/// and no higher than `VkPhysicalDeviceProperties::apiVersion` found on the physical device used.
/// </li>
/// <li>{@link #pTypeExternalMemoryHandleTypes} Either null or a pointer to an array of external memory handle types for each Vulkan memory type.
///
/// If not NULL, it must be a pointer to an array of `VkPhysicalDeviceMemoryProperties::memoryTypeCount`
/// elements, defining external memory handle types of particular Vulkan memory type,
/// to be passed using `VkExportMemoryAllocateInfoKHR`.
///
/// Any of the elements may be equal to 0, which means not to use `VkExportMemoryAllocateInfoKHR` on this memory type.
/// This is also the default in case of `pTypeExternalMemoryHandleTypes` = NULL.
/// </li>
/// </ul>
@ValueBasedCandidate
@UnsafeConstructor
public record VmaAllocatorCreateInfo(@NotNull MemorySegment segment) implements IVmaAllocatorCreateInfo {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VmaAllocatorCreateInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVmaAllocatorCreateInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VmaAllocatorCreateInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVmaAllocatorCreateInfo, Iterable<VmaAllocatorCreateInfo> {
        public long size() {
            return segment.byteSize() / VmaAllocatorCreateInfo.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VmaAllocatorCreateInfo at(long index) {
            return new VmaAllocatorCreateInfo(segment.asSlice(index * VmaAllocatorCreateInfo.BYTES, VmaAllocatorCreateInfo.BYTES));
        }

        public void at(long index, @NotNull Consumer<@NotNull VmaAllocatorCreateInfo> consumer) {
            consumer.accept(at(index));
        }

        public void write(long index, @NotNull VmaAllocatorCreateInfo value) {
            MemorySegment s = segment.asSlice(index * VmaAllocatorCreateInfo.BYTES, VmaAllocatorCreateInfo.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * VmaAllocatorCreateInfo.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VmaAllocatorCreateInfo.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VmaAllocatorCreateInfo.BYTES,
                (end - start) * VmaAllocatorCreateInfo.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VmaAllocatorCreateInfo.BYTES));
        }

        public VmaAllocatorCreateInfo[] toArray() {
            VmaAllocatorCreateInfo[] ret = new VmaAllocatorCreateInfo[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<VmaAllocatorCreateInfo> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<VmaAllocatorCreateInfo> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= VmaAllocatorCreateInfo.BYTES;
            }

            @Override
            public VmaAllocatorCreateInfo next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                VmaAllocatorCreateInfo ret = new VmaAllocatorCreateInfo(segment.asSlice(0, VmaAllocatorCreateInfo.BYTES));
                segment = segment.asSlice(VmaAllocatorCreateInfo.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static VmaAllocatorCreateInfo allocate(Arena arena) {
        return new VmaAllocatorCreateInfo(arena.allocate(LAYOUT));
    }

    public static VmaAllocatorCreateInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new VmaAllocatorCreateInfo.Ptr(segment);
    }

    public static VmaAllocatorCreateInfo clone(Arena arena, VmaAllocatorCreateInfo src) {
        VmaAllocatorCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Bitmask(VmaAllocatorCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public VmaAllocatorCreateInfo flags(@Bitmask(VmaAllocatorCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
        return this;
    }

    public @Nullable VkPhysicalDevice physicalDevice() {
        MemorySegment s = segment.asSlice(OFFSET$physicalDevice, SIZE$physicalDevice);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkPhysicalDevice(s);
    }

    public VmaAllocatorCreateInfo physicalDevice(@Nullable VkPhysicalDevice value) {
        segment.set(LAYOUT$physicalDevice, OFFSET$physicalDevice, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @Nullable VkDevice device() {
        MemorySegment s = segment.asSlice(OFFSET$device, SIZE$device);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkDevice(s);
    }

    public VmaAllocatorCreateInfo device(@Nullable VkDevice value) {
        segment.set(LAYOUT$device, OFFSET$device, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @NativeType("VkDeviceSize") @Unsigned long preferredLargeHeapBlockSize() {
        return segment.get(LAYOUT$preferredLargeHeapBlockSize, OFFSET$preferredLargeHeapBlockSize);
    }

    public VmaAllocatorCreateInfo preferredLargeHeapBlockSize(@NativeType("VkDeviceSize") @Unsigned long value) {
        segment.set(LAYOUT$preferredLargeHeapBlockSize, OFFSET$preferredLargeHeapBlockSize, value);
        return this;
    }

    public VmaAllocatorCreateInfo pAllocationCallbacks(@Nullable IVkAllocationCallbacks value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pAllocationCallbacksRaw(s);
        return this;
    }

    @Unsafe public @Nullable VkAllocationCallbacks.Ptr pAllocationCallbacks(int assumedCount) {
        MemorySegment s = pAllocationCallbacksRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkAllocationCallbacks.BYTES);
        return new VkAllocationCallbacks.Ptr(s);
    }

    public @Nullable VkAllocationCallbacks pAllocationCallbacks() {
        MemorySegment s = pAllocationCallbacksRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkAllocationCallbacks(s);
    }

    public @Pointer(target=VkAllocationCallbacks.class) @NotNull MemorySegment pAllocationCallbacksRaw() {
        return segment.get(LAYOUT$pAllocationCallbacks, OFFSET$pAllocationCallbacks);
    }

    public void pAllocationCallbacksRaw(@Pointer(target=VkAllocationCallbacks.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$pAllocationCallbacks, OFFSET$pAllocationCallbacks, value);
    }

    public VmaAllocatorCreateInfo pDeviceMemoryCallbacks(@Nullable IVmaDeviceMemoryCallbacks value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDeviceMemoryCallbacksRaw(s);
        return this;
    }

    @Unsafe public @Nullable VmaDeviceMemoryCallbacks.Ptr pDeviceMemoryCallbacks(int assumedCount) {
        MemorySegment s = pDeviceMemoryCallbacksRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VmaDeviceMemoryCallbacks.BYTES);
        return new VmaDeviceMemoryCallbacks.Ptr(s);
    }

    public @Nullable VmaDeviceMemoryCallbacks pDeviceMemoryCallbacks() {
        MemorySegment s = pDeviceMemoryCallbacksRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VmaDeviceMemoryCallbacks(s);
    }

    public @Pointer(target=VmaDeviceMemoryCallbacks.class) @NotNull MemorySegment pDeviceMemoryCallbacksRaw() {
        return segment.get(LAYOUT$pDeviceMemoryCallbacks, OFFSET$pDeviceMemoryCallbacks);
    }

    public void pDeviceMemoryCallbacksRaw(@Pointer(target=VmaDeviceMemoryCallbacks.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$pDeviceMemoryCallbacks, OFFSET$pDeviceMemoryCallbacks, value);
    }

    /// Note: the returned {@link LongPtr} does not have correct
    /// {@link LongPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link LongPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @Pointer(comment="VkDeviceSize") @Unsigned LongPtr pHeapSizeLimit() {
        MemorySegment s = pHeapSizeLimitRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new LongPtr(s);
    }

    public VmaAllocatorCreateInfo pHeapSizeLimit(@Nullable @Pointer(comment="VkDeviceSize") @Unsigned LongPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pHeapSizeLimitRaw(s);
        return this;
    }

    public @Pointer(comment="uint64_t*") @NotNull MemorySegment pHeapSizeLimitRaw() {
        return segment.get(LAYOUT$pHeapSizeLimit, OFFSET$pHeapSizeLimit);
    }

    public void pHeapSizeLimitRaw(@Pointer(comment="uint64_t*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$pHeapSizeLimit, OFFSET$pHeapSizeLimit, value);
    }

    public VmaAllocatorCreateInfo pVulkanFunctions(@Nullable IVmaVulkanFunctions value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pVulkanFunctionsRaw(s);
        return this;
    }

    @Unsafe public @Nullable VmaVulkanFunctions.Ptr pVulkanFunctions(int assumedCount) {
        MemorySegment s = pVulkanFunctionsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VmaVulkanFunctions.BYTES);
        return new VmaVulkanFunctions.Ptr(s);
    }

    public @Nullable VmaVulkanFunctions pVulkanFunctions() {
        MemorySegment s = pVulkanFunctionsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VmaVulkanFunctions(s);
    }

    public @Pointer(target=VmaVulkanFunctions.class) @NotNull MemorySegment pVulkanFunctionsRaw() {
        return segment.get(LAYOUT$pVulkanFunctions, OFFSET$pVulkanFunctions);
    }

    public void pVulkanFunctionsRaw(@Pointer(target=VmaVulkanFunctions.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$pVulkanFunctions, OFFSET$pVulkanFunctions, value);
    }

    public @Nullable VkInstance instance() {
        MemorySegment s = segment.asSlice(OFFSET$instance, SIZE$instance);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkInstance(s);
    }

    public VmaAllocatorCreateInfo instance(@Nullable VkInstance value) {
        segment.set(LAYOUT$instance, OFFSET$instance, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int vulkanApiVersion() {
        return segment.get(LAYOUT$vulkanApiVersion, OFFSET$vulkanApiVersion);
    }

    public VmaAllocatorCreateInfo vulkanApiVersion(@Unsigned int value) {
        segment.set(LAYOUT$vulkanApiVersion, OFFSET$vulkanApiVersion, value);
        return this;
    }


    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @Bitmask(VkExternalMemoryHandleTypeFlags.class) IntPtr pTypeExternalMemoryHandleTypes() {
        MemorySegment s = pTypeExternalMemoryHandleTypesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public VmaAllocatorCreateInfo pTypeExternalMemoryHandleTypes(@Nullable @Bitmask(VkExternalMemoryHandleTypeFlags.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pTypeExternalMemoryHandleTypesRaw(s);
        return this;
    }

    public @Pointer(target=VkExternalMemoryHandleTypeFlags.class) @NotNull MemorySegment pTypeExternalMemoryHandleTypesRaw() {
        return segment.get(LAYOUT$pTypeExternalMemoryHandleTypes, OFFSET$pTypeExternalMemoryHandleTypes);
    }

    public void pTypeExternalMemoryHandleTypesRaw(@Pointer(target=VkExternalMemoryHandleTypeFlags.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$pTypeExternalMemoryHandleTypes, OFFSET$pTypeExternalMemoryHandleTypes, value);
    }


    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("physicalDevice"),
        ValueLayout.ADDRESS.withName("device"),
        ValueLayout.JAVA_LONG.withName("preferredLargeHeapBlockSize"),
        ValueLayout.ADDRESS.withTargetLayout(VkAllocationCallbacks.LAYOUT).withName("pAllocationCallbacks"),
        ValueLayout.ADDRESS.withTargetLayout(VmaDeviceMemoryCallbacks.LAYOUT).withName("pDeviceMemoryCallbacks"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG).withName("pHeapSizeLimit"),
        ValueLayout.ADDRESS.withTargetLayout(VmaVulkanFunctions.LAYOUT).withName("pVulkanFunctions"),
        ValueLayout.ADDRESS.withName("instance"),
        ValueLayout.JAVA_INT.withName("vulkanApiVersion"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pTypeExternalMemoryHandleTypes"),
        MemoryLayout.sequenceLayout(8, ValueLayout.ADDRESS).withName("reserved")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$physicalDevice = PathElement.groupElement("physicalDevice");
    public static final PathElement PATH$device = PathElement.groupElement("device");
    public static final PathElement PATH$preferredLargeHeapBlockSize = PathElement.groupElement("preferredLargeHeapBlockSize");
    public static final PathElement PATH$pAllocationCallbacks = PathElement.groupElement("pAllocationCallbacks");
    public static final PathElement PATH$pDeviceMemoryCallbacks = PathElement.groupElement("pDeviceMemoryCallbacks");
    public static final PathElement PATH$pHeapSizeLimit = PathElement.groupElement("pHeapSizeLimit");
    public static final PathElement PATH$pVulkanFunctions = PathElement.groupElement("pVulkanFunctions");
    public static final PathElement PATH$instance = PathElement.groupElement("instance");
    public static final PathElement PATH$vulkanApiVersion = PathElement.groupElement("vulkanApiVersion");
    public static final PathElement PATH$pTypeExternalMemoryHandleTypes = PathElement.groupElement("pTypeExternalMemoryHandleTypes");

    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$physicalDevice = (AddressLayout) LAYOUT.select(PATH$physicalDevice);
    public static final AddressLayout LAYOUT$device = (AddressLayout) LAYOUT.select(PATH$device);
    public static final OfLong LAYOUT$preferredLargeHeapBlockSize = (OfLong) LAYOUT.select(PATH$preferredLargeHeapBlockSize);
    public static final AddressLayout LAYOUT$pAllocationCallbacks = (AddressLayout) LAYOUT.select(PATH$pAllocationCallbacks);
    public static final AddressLayout LAYOUT$pDeviceMemoryCallbacks = (AddressLayout) LAYOUT.select(PATH$pDeviceMemoryCallbacks);
    public static final AddressLayout LAYOUT$pHeapSizeLimit = (AddressLayout) LAYOUT.select(PATH$pHeapSizeLimit);
    public static final AddressLayout LAYOUT$pVulkanFunctions = (AddressLayout) LAYOUT.select(PATH$pVulkanFunctions);
    public static final AddressLayout LAYOUT$instance = (AddressLayout) LAYOUT.select(PATH$instance);
    public static final OfInt LAYOUT$vulkanApiVersion = (OfInt) LAYOUT.select(PATH$vulkanApiVersion);
    public static final AddressLayout LAYOUT$pTypeExternalMemoryHandleTypes = (AddressLayout) LAYOUT.select(PATH$pTypeExternalMemoryHandleTypes);

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$physicalDevice = LAYOUT$physicalDevice.byteSize();
    public static final long SIZE$device = LAYOUT$device.byteSize();
    public static final long SIZE$preferredLargeHeapBlockSize = LAYOUT$preferredLargeHeapBlockSize.byteSize();
    public static final long SIZE$pAllocationCallbacks = LAYOUT$pAllocationCallbacks.byteSize();
    public static final long SIZE$pDeviceMemoryCallbacks = LAYOUT$pDeviceMemoryCallbacks.byteSize();
    public static final long SIZE$pHeapSizeLimit = LAYOUT$pHeapSizeLimit.byteSize();
    public static final long SIZE$pVulkanFunctions = LAYOUT$pVulkanFunctions.byteSize();
    public static final long SIZE$instance = LAYOUT$instance.byteSize();
    public static final long SIZE$vulkanApiVersion = LAYOUT$vulkanApiVersion.byteSize();
    public static final long SIZE$pTypeExternalMemoryHandleTypes = LAYOUT$pTypeExternalMemoryHandleTypes.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$physicalDevice = LAYOUT.byteOffset(PATH$physicalDevice);
    public static final long OFFSET$device = LAYOUT.byteOffset(PATH$device);
    public static final long OFFSET$preferredLargeHeapBlockSize = LAYOUT.byteOffset(PATH$preferredLargeHeapBlockSize);
    public static final long OFFSET$pAllocationCallbacks = LAYOUT.byteOffset(PATH$pAllocationCallbacks);
    public static final long OFFSET$pDeviceMemoryCallbacks = LAYOUT.byteOffset(PATH$pDeviceMemoryCallbacks);
    public static final long OFFSET$pHeapSizeLimit = LAYOUT.byteOffset(PATH$pHeapSizeLimit);
    public static final long OFFSET$pVulkanFunctions = LAYOUT.byteOffset(PATH$pVulkanFunctions);
    public static final long OFFSET$instance = LAYOUT.byteOffset(PATH$instance);
    public static final long OFFSET$vulkanApiVersion = LAYOUT.byteOffset(PATH$vulkanApiVersion);
    public static final long OFFSET$pTypeExternalMemoryHandleTypes = LAYOUT.byteOffset(PATH$pTypeExternalMemoryHandleTypes);
}
