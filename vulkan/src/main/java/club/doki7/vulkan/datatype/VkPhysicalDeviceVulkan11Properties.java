package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceVulkan11Properties.html"><code>VkPhysicalDeviceVulkan11Properties</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceVulkan11Properties {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint8_t deviceUUID; // @link substring="deviceUUID" target="#deviceUUID"
///     uint8_t driverUUID; // @link substring="driverUUID" target="#driverUUID"
///     uint8_t deviceLUID; // @link substring="deviceLUID" target="#deviceLUID"
///     uint32_t deviceNodeMask; // @link substring="deviceNodeMask" target="#deviceNodeMask"
///     VkBool32 deviceLUIDValid; // @link substring="deviceLUIDValid" target="#deviceLUIDValid"
///     uint32_t subgroupSize; // @link substring="subgroupSize" target="#subgroupSize"
///     VkShaderStageFlags subgroupSupportedStages; // @link substring="VkShaderStageFlags" target="VkShaderStageFlags" @link substring="subgroupSupportedStages" target="#subgroupSupportedStages"
///     VkSubgroupFeatureFlags subgroupSupportedOperations; // @link substring="VkSubgroupFeatureFlags" target="VkSubgroupFeatureFlags" @link substring="subgroupSupportedOperations" target="#subgroupSupportedOperations"
///     VkBool32 subgroupQuadOperationsInAllStages; // @link substring="subgroupQuadOperationsInAllStages" target="#subgroupQuadOperationsInAllStages"
///     VkPointClippingBehavior pointClippingBehavior; // @link substring="VkPointClippingBehavior" target="VkPointClippingBehavior" @link substring="pointClippingBehavior" target="#pointClippingBehavior"
///     uint32_t maxMultiviewViewCount; // @link substring="maxMultiviewViewCount" target="#maxMultiviewViewCount"
///     uint32_t maxMultiviewInstanceIndex; // @link substring="maxMultiviewInstanceIndex" target="#maxMultiviewInstanceIndex"
///     VkBool32 protectedNoFault; // @link substring="protectedNoFault" target="#protectedNoFault"
///     uint32_t maxPerSetDescriptors; // @link substring="maxPerSetDescriptors" target="#maxPerSetDescriptors"
///     VkDeviceSize maxMemoryAllocationSize; // @link substring="maxMemoryAllocationSize" target="#maxMemoryAllocationSize"
/// } VkPhysicalDeviceVulkan11Properties;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VULKAN_1_1_PROPERTIES`
///
/// The {@code allocate} ({@link VkPhysicalDeviceVulkan11Properties#allocate(Arena)}, {@link VkPhysicalDeviceVulkan11Properties#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPhysicalDeviceVulkan11Properties#autoInit}
/// to initialize these fields manually for non-allocated instances.
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceVulkan11Properties.html"><code>VkPhysicalDeviceVulkan11Properties</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceVulkan11Properties(@NotNull MemorySegment segment) implements IVkPhysicalDeviceVulkan11Properties {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceVulkan11Properties.html"><code>VkPhysicalDeviceVulkan11Properties</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkPhysicalDeviceVulkan11Properties}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkPhysicalDeviceVulkan11Properties to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkPhysicalDeviceVulkan11Properties.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkPhysicalDeviceVulkan11Properties {
        public long size() {
            return segment.byteSize() / VkPhysicalDeviceVulkan11Properties.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkPhysicalDeviceVulkan11Properties at(long index) {
            return new VkPhysicalDeviceVulkan11Properties(segment.asSlice(index * VkPhysicalDeviceVulkan11Properties.BYTES, VkPhysicalDeviceVulkan11Properties.BYTES));
        }

        public void write(long index, @NotNull VkPhysicalDeviceVulkan11Properties value) {
            MemorySegment s = segment.asSlice(index * VkPhysicalDeviceVulkan11Properties.BYTES, VkPhysicalDeviceVulkan11Properties.BYTES);
            s.copyFrom(value.segment);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} structures,
        /// create a new view {@link Ptr} that uses the same backing storage as this
        /// {@link Ptr}, but with the new size. Since there is actually no way to really check
        /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
        /// marked as {@link unsafe}.
        ///
        /// This method could be useful when handling data returned from some C API, where the size of
        /// the data is not known in advance.
        ///
        /// If the size of the underlying segment is actually known in advance and correctly set, and
        /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
        /// instead.
        @Unsafe
        public @NotNull Ptr reinterpret(long index) {
            return new Ptr(segment.asSlice(index * VkPhysicalDeviceVulkan11Properties.BYTES, VkPhysicalDeviceVulkan11Properties.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkPhysicalDeviceVulkan11Properties.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkPhysicalDeviceVulkan11Properties.BYTES,
                (end - start) * VkPhysicalDeviceVulkan11Properties.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkPhysicalDeviceVulkan11Properties.BYTES));
        }

        public VkPhysicalDeviceVulkan11Properties[] toArray() {
            VkPhysicalDeviceVulkan11Properties[] ret = new VkPhysicalDeviceVulkan11Properties[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static VkPhysicalDeviceVulkan11Properties allocate(Arena arena) {
        VkPhysicalDeviceVulkan11Properties ret = new VkPhysicalDeviceVulkan11Properties(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_VULKAN_1_1_PROPERTIES);
        return ret;
    }

    public static VkPhysicalDeviceVulkan11Properties.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceVulkan11Properties.Ptr ret = new VkPhysicalDeviceVulkan11Properties.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).sType(VkStructureType.PHYSICAL_DEVICE_VULKAN_1_1_PROPERTIES);
        }
        return ret;
    }

    public static VkPhysicalDeviceVulkan11Properties clone(Arena arena, VkPhysicalDeviceVulkan11Properties src) {
        VkPhysicalDeviceVulkan11Properties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_VULKAN_1_1_PROPERTIES);
    }

    public @EnumType(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@EnumType(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @Pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@Pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @unsigned byte deviceUUID() {
        return segment.get(LAYOUT$deviceUUID, OFFSET$deviceUUID);
    }

    public void deviceUUID(@unsigned byte value) {
        segment.set(LAYOUT$deviceUUID, OFFSET$deviceUUID, value);
    }

    public @unsigned byte driverUUID() {
        return segment.get(LAYOUT$driverUUID, OFFSET$driverUUID);
    }

    public void driverUUID(@unsigned byte value) {
        segment.set(LAYOUT$driverUUID, OFFSET$driverUUID, value);
    }

    public @unsigned byte deviceLUID() {
        return segment.get(LAYOUT$deviceLUID, OFFSET$deviceLUID);
    }

    public void deviceLUID(@unsigned byte value) {
        segment.set(LAYOUT$deviceLUID, OFFSET$deviceLUID, value);
    }

    public @unsigned int deviceNodeMask() {
        return segment.get(LAYOUT$deviceNodeMask, OFFSET$deviceNodeMask);
    }

    public void deviceNodeMask(@unsigned int value) {
        segment.set(LAYOUT$deviceNodeMask, OFFSET$deviceNodeMask, value);
    }

    public @unsigned int deviceLUIDValid() {
        return segment.get(LAYOUT$deviceLUIDValid, OFFSET$deviceLUIDValid);
    }

    public void deviceLUIDValid(@unsigned int value) {
        segment.set(LAYOUT$deviceLUIDValid, OFFSET$deviceLUIDValid, value);
    }

    public @unsigned int subgroupSize() {
        return segment.get(LAYOUT$subgroupSize, OFFSET$subgroupSize);
    }

    public void subgroupSize(@unsigned int value) {
        segment.set(LAYOUT$subgroupSize, OFFSET$subgroupSize, value);
    }

    public @EnumType(VkShaderStageFlags.class) int subgroupSupportedStages() {
        return segment.get(LAYOUT$subgroupSupportedStages, OFFSET$subgroupSupportedStages);
    }

    public void subgroupSupportedStages(@EnumType(VkShaderStageFlags.class) int value) {
        segment.set(LAYOUT$subgroupSupportedStages, OFFSET$subgroupSupportedStages, value);
    }

    public @EnumType(VkSubgroupFeatureFlags.class) int subgroupSupportedOperations() {
        return segment.get(LAYOUT$subgroupSupportedOperations, OFFSET$subgroupSupportedOperations);
    }

    public void subgroupSupportedOperations(@EnumType(VkSubgroupFeatureFlags.class) int value) {
        segment.set(LAYOUT$subgroupSupportedOperations, OFFSET$subgroupSupportedOperations, value);
    }

    public @unsigned int subgroupQuadOperationsInAllStages() {
        return segment.get(LAYOUT$subgroupQuadOperationsInAllStages, OFFSET$subgroupQuadOperationsInAllStages);
    }

    public void subgroupQuadOperationsInAllStages(@unsigned int value) {
        segment.set(LAYOUT$subgroupQuadOperationsInAllStages, OFFSET$subgroupQuadOperationsInAllStages, value);
    }

    public @EnumType(VkPointClippingBehavior.class) int pointClippingBehavior() {
        return segment.get(LAYOUT$pointClippingBehavior, OFFSET$pointClippingBehavior);
    }

    public void pointClippingBehavior(@EnumType(VkPointClippingBehavior.class) int value) {
        segment.set(LAYOUT$pointClippingBehavior, OFFSET$pointClippingBehavior, value);
    }

    public @unsigned int maxMultiviewViewCount() {
        return segment.get(LAYOUT$maxMultiviewViewCount, OFFSET$maxMultiviewViewCount);
    }

    public void maxMultiviewViewCount(@unsigned int value) {
        segment.set(LAYOUT$maxMultiviewViewCount, OFFSET$maxMultiviewViewCount, value);
    }

    public @unsigned int maxMultiviewInstanceIndex() {
        return segment.get(LAYOUT$maxMultiviewInstanceIndex, OFFSET$maxMultiviewInstanceIndex);
    }

    public void maxMultiviewInstanceIndex(@unsigned int value) {
        segment.set(LAYOUT$maxMultiviewInstanceIndex, OFFSET$maxMultiviewInstanceIndex, value);
    }

    public @unsigned int protectedNoFault() {
        return segment.get(LAYOUT$protectedNoFault, OFFSET$protectedNoFault);
    }

    public void protectedNoFault(@unsigned int value) {
        segment.set(LAYOUT$protectedNoFault, OFFSET$protectedNoFault, value);
    }

    public @unsigned int maxPerSetDescriptors() {
        return segment.get(LAYOUT$maxPerSetDescriptors, OFFSET$maxPerSetDescriptors);
    }

    public void maxPerSetDescriptors(@unsigned int value) {
        segment.set(LAYOUT$maxPerSetDescriptors, OFFSET$maxPerSetDescriptors, value);
    }

    public @unsigned long maxMemoryAllocationSize() {
        return segment.get(LAYOUT$maxMemoryAllocationSize, OFFSET$maxMemoryAllocationSize);
    }

    public void maxMemoryAllocationSize(@unsigned long value) {
        segment.set(LAYOUT$maxMemoryAllocationSize, OFFSET$maxMemoryAllocationSize, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_BYTE.withName("deviceUUID"),
        ValueLayout.JAVA_BYTE.withName("driverUUID"),
        ValueLayout.JAVA_BYTE.withName("deviceLUID"),
        ValueLayout.JAVA_INT.withName("deviceNodeMask"),
        ValueLayout.JAVA_INT.withName("deviceLUIDValid"),
        ValueLayout.JAVA_INT.withName("subgroupSize"),
        ValueLayout.JAVA_INT.withName("subgroupSupportedStages"),
        ValueLayout.JAVA_INT.withName("subgroupSupportedOperations"),
        ValueLayout.JAVA_INT.withName("subgroupQuadOperationsInAllStages"),
        ValueLayout.JAVA_INT.withName("pointClippingBehavior"),
        ValueLayout.JAVA_INT.withName("maxMultiviewViewCount"),
        ValueLayout.JAVA_INT.withName("maxMultiviewInstanceIndex"),
        ValueLayout.JAVA_INT.withName("protectedNoFault"),
        ValueLayout.JAVA_INT.withName("maxPerSetDescriptors"),
        ValueLayout.JAVA_LONG.withName("maxMemoryAllocationSize")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$deviceUUID = PathElement.groupElement("deviceUUID");
    public static final PathElement PATH$driverUUID = PathElement.groupElement("driverUUID");
    public static final PathElement PATH$deviceLUID = PathElement.groupElement("deviceLUID");
    public static final PathElement PATH$deviceNodeMask = PathElement.groupElement("deviceNodeMask");
    public static final PathElement PATH$deviceLUIDValid = PathElement.groupElement("deviceLUIDValid");
    public static final PathElement PATH$subgroupSize = PathElement.groupElement("subgroupSize");
    public static final PathElement PATH$subgroupSupportedStages = PathElement.groupElement("subgroupSupportedStages");
    public static final PathElement PATH$subgroupSupportedOperations = PathElement.groupElement("subgroupSupportedOperations");
    public static final PathElement PATH$subgroupQuadOperationsInAllStages = PathElement.groupElement("subgroupQuadOperationsInAllStages");
    public static final PathElement PATH$pointClippingBehavior = PathElement.groupElement("pointClippingBehavior");
    public static final PathElement PATH$maxMultiviewViewCount = PathElement.groupElement("maxMultiviewViewCount");
    public static final PathElement PATH$maxMultiviewInstanceIndex = PathElement.groupElement("maxMultiviewInstanceIndex");
    public static final PathElement PATH$protectedNoFault = PathElement.groupElement("protectedNoFault");
    public static final PathElement PATH$maxPerSetDescriptors = PathElement.groupElement("maxPerSetDescriptors");
    public static final PathElement PATH$maxMemoryAllocationSize = PathElement.groupElement("maxMemoryAllocationSize");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfByte LAYOUT$deviceUUID = (OfByte) LAYOUT.select(PATH$deviceUUID);
    public static final OfByte LAYOUT$driverUUID = (OfByte) LAYOUT.select(PATH$driverUUID);
    public static final OfByte LAYOUT$deviceLUID = (OfByte) LAYOUT.select(PATH$deviceLUID);
    public static final OfInt LAYOUT$deviceNodeMask = (OfInt) LAYOUT.select(PATH$deviceNodeMask);
    public static final OfInt LAYOUT$deviceLUIDValid = (OfInt) LAYOUT.select(PATH$deviceLUIDValid);
    public static final OfInt LAYOUT$subgroupSize = (OfInt) LAYOUT.select(PATH$subgroupSize);
    public static final OfInt LAYOUT$subgroupSupportedStages = (OfInt) LAYOUT.select(PATH$subgroupSupportedStages);
    public static final OfInt LAYOUT$subgroupSupportedOperations = (OfInt) LAYOUT.select(PATH$subgroupSupportedOperations);
    public static final OfInt LAYOUT$subgroupQuadOperationsInAllStages = (OfInt) LAYOUT.select(PATH$subgroupQuadOperationsInAllStages);
    public static final OfInt LAYOUT$pointClippingBehavior = (OfInt) LAYOUT.select(PATH$pointClippingBehavior);
    public static final OfInt LAYOUT$maxMultiviewViewCount = (OfInt) LAYOUT.select(PATH$maxMultiviewViewCount);
    public static final OfInt LAYOUT$maxMultiviewInstanceIndex = (OfInt) LAYOUT.select(PATH$maxMultiviewInstanceIndex);
    public static final OfInt LAYOUT$protectedNoFault = (OfInt) LAYOUT.select(PATH$protectedNoFault);
    public static final OfInt LAYOUT$maxPerSetDescriptors = (OfInt) LAYOUT.select(PATH$maxPerSetDescriptors);
    public static final OfLong LAYOUT$maxMemoryAllocationSize = (OfLong) LAYOUT.select(PATH$maxMemoryAllocationSize);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$deviceUUID = LAYOUT$deviceUUID.byteSize();
    public static final long SIZE$driverUUID = LAYOUT$driverUUID.byteSize();
    public static final long SIZE$deviceLUID = LAYOUT$deviceLUID.byteSize();
    public static final long SIZE$deviceNodeMask = LAYOUT$deviceNodeMask.byteSize();
    public static final long SIZE$deviceLUIDValid = LAYOUT$deviceLUIDValid.byteSize();
    public static final long SIZE$subgroupSize = LAYOUT$subgroupSize.byteSize();
    public static final long SIZE$subgroupSupportedStages = LAYOUT$subgroupSupportedStages.byteSize();
    public static final long SIZE$subgroupSupportedOperations = LAYOUT$subgroupSupportedOperations.byteSize();
    public static final long SIZE$subgroupQuadOperationsInAllStages = LAYOUT$subgroupQuadOperationsInAllStages.byteSize();
    public static final long SIZE$pointClippingBehavior = LAYOUT$pointClippingBehavior.byteSize();
    public static final long SIZE$maxMultiviewViewCount = LAYOUT$maxMultiviewViewCount.byteSize();
    public static final long SIZE$maxMultiviewInstanceIndex = LAYOUT$maxMultiviewInstanceIndex.byteSize();
    public static final long SIZE$protectedNoFault = LAYOUT$protectedNoFault.byteSize();
    public static final long SIZE$maxPerSetDescriptors = LAYOUT$maxPerSetDescriptors.byteSize();
    public static final long SIZE$maxMemoryAllocationSize = LAYOUT$maxMemoryAllocationSize.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$deviceUUID = LAYOUT.byteOffset(PATH$deviceUUID);
    public static final long OFFSET$driverUUID = LAYOUT.byteOffset(PATH$driverUUID);
    public static final long OFFSET$deviceLUID = LAYOUT.byteOffset(PATH$deviceLUID);
    public static final long OFFSET$deviceNodeMask = LAYOUT.byteOffset(PATH$deviceNodeMask);
    public static final long OFFSET$deviceLUIDValid = LAYOUT.byteOffset(PATH$deviceLUIDValid);
    public static final long OFFSET$subgroupSize = LAYOUT.byteOffset(PATH$subgroupSize);
    public static final long OFFSET$subgroupSupportedStages = LAYOUT.byteOffset(PATH$subgroupSupportedStages);
    public static final long OFFSET$subgroupSupportedOperations = LAYOUT.byteOffset(PATH$subgroupSupportedOperations);
    public static final long OFFSET$subgroupQuadOperationsInAllStages = LAYOUT.byteOffset(PATH$subgroupQuadOperationsInAllStages);
    public static final long OFFSET$pointClippingBehavior = LAYOUT.byteOffset(PATH$pointClippingBehavior);
    public static final long OFFSET$maxMultiviewViewCount = LAYOUT.byteOffset(PATH$maxMultiviewViewCount);
    public static final long OFFSET$maxMultiviewInstanceIndex = LAYOUT.byteOffset(PATH$maxMultiviewInstanceIndex);
    public static final long OFFSET$protectedNoFault = LAYOUT.byteOffset(PATH$protectedNoFault);
    public static final long OFFSET$maxPerSetDescriptors = LAYOUT.byteOffset(PATH$maxPerSetDescriptors);
    public static final long OFFSET$maxMemoryAllocationSize = LAYOUT.byteOffset(PATH$maxMemoryAllocationSize);
}
