package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceAccelerationStructurePropertiesKHR.html"><code>VkPhysicalDeviceAccelerationStructurePropertiesKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceAccelerationStructurePropertiesKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint64_t maxGeometryCount; // @link substring="maxGeometryCount" target="#maxGeometryCount"
///     uint64_t maxInstanceCount; // @link substring="maxInstanceCount" target="#maxInstanceCount"
///     uint64_t maxPrimitiveCount; // @link substring="maxPrimitiveCount" target="#maxPrimitiveCount"
///     uint32_t maxPerStageDescriptorAccelerationStructures; // @link substring="maxPerStageDescriptorAccelerationStructures" target="#maxPerStageDescriptorAccelerationStructures"
///     uint32_t maxPerStageDescriptorUpdateAfterBindAccelerationStructures; // @link substring="maxPerStageDescriptorUpdateAfterBindAccelerationStructures" target="#maxPerStageDescriptorUpdateAfterBindAccelerationStructures"
///     uint32_t maxDescriptorSetAccelerationStructures; // @link substring="maxDescriptorSetAccelerationStructures" target="#maxDescriptorSetAccelerationStructures"
///     uint32_t maxDescriptorSetUpdateAfterBindAccelerationStructures; // @link substring="maxDescriptorSetUpdateAfterBindAccelerationStructures" target="#maxDescriptorSetUpdateAfterBindAccelerationStructures"
///     uint32_t minAccelerationStructureScratchOffsetAlignment; // @link substring="minAccelerationStructureScratchOffsetAlignment" target="#minAccelerationStructureScratchOffsetAlignment"
/// } VkPhysicalDeviceAccelerationStructurePropertiesKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_PROPERTIES_KHR`
///
/// The {@code allocate} ({@link VkPhysicalDeviceAccelerationStructurePropertiesKHR#allocate(Arena)}, {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPhysicalDeviceAccelerationStructurePropertiesKHR#autoInit}
/// to initialize these fields manually for non-allocated instances.
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceAccelerationStructurePropertiesKHR.html"><code>VkPhysicalDeviceAccelerationStructurePropertiesKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceAccelerationStructurePropertiesKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR allocate(Arena arena) {
        VkPhysicalDeviceAccelerationStructurePropertiesKHR ret = new VkPhysicalDeviceAccelerationStructurePropertiesKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_PROPERTIES_KHR);
        return ret;
    }

    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceAccelerationStructurePropertiesKHR[] ret = new VkPhysicalDeviceAccelerationStructurePropertiesKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceAccelerationStructurePropertiesKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_PROPERTIES_KHR);
        }
        return ret;
    }

    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR clone(Arena arena, VkPhysicalDeviceAccelerationStructurePropertiesKHR src) {
        VkPhysicalDeviceAccelerationStructurePropertiesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceAccelerationStructurePropertiesKHR[] clone(Arena arena, VkPhysicalDeviceAccelerationStructurePropertiesKHR[] src) {
        VkPhysicalDeviceAccelerationStructurePropertiesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_PROPERTIES_KHR);
    }

    public @enumtype(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@enumtype(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @unsigned long maxGeometryCount() {
        return segment.get(LAYOUT$maxGeometryCount, OFFSET$maxGeometryCount);
    }

    public void maxGeometryCount(@unsigned long value) {
        segment.set(LAYOUT$maxGeometryCount, OFFSET$maxGeometryCount, value);
    }

    public @unsigned long maxInstanceCount() {
        return segment.get(LAYOUT$maxInstanceCount, OFFSET$maxInstanceCount);
    }

    public void maxInstanceCount(@unsigned long value) {
        segment.set(LAYOUT$maxInstanceCount, OFFSET$maxInstanceCount, value);
    }

    public @unsigned long maxPrimitiveCount() {
        return segment.get(LAYOUT$maxPrimitiveCount, OFFSET$maxPrimitiveCount);
    }

    public void maxPrimitiveCount(@unsigned long value) {
        segment.set(LAYOUT$maxPrimitiveCount, OFFSET$maxPrimitiveCount, value);
    }

    public @unsigned int maxPerStageDescriptorAccelerationStructures() {
        return segment.get(LAYOUT$maxPerStageDescriptorAccelerationStructures, OFFSET$maxPerStageDescriptorAccelerationStructures);
    }

    public void maxPerStageDescriptorAccelerationStructures(@unsigned int value) {
        segment.set(LAYOUT$maxPerStageDescriptorAccelerationStructures, OFFSET$maxPerStageDescriptorAccelerationStructures, value);
    }

    public @unsigned int maxPerStageDescriptorUpdateAfterBindAccelerationStructures() {
        return segment.get(LAYOUT$maxPerStageDescriptorUpdateAfterBindAccelerationStructures, OFFSET$maxPerStageDescriptorUpdateAfterBindAccelerationStructures);
    }

    public void maxPerStageDescriptorUpdateAfterBindAccelerationStructures(@unsigned int value) {
        segment.set(LAYOUT$maxPerStageDescriptorUpdateAfterBindAccelerationStructures, OFFSET$maxPerStageDescriptorUpdateAfterBindAccelerationStructures, value);
    }

    public @unsigned int maxDescriptorSetAccelerationStructures() {
        return segment.get(LAYOUT$maxDescriptorSetAccelerationStructures, OFFSET$maxDescriptorSetAccelerationStructures);
    }

    public void maxDescriptorSetAccelerationStructures(@unsigned int value) {
        segment.set(LAYOUT$maxDescriptorSetAccelerationStructures, OFFSET$maxDescriptorSetAccelerationStructures, value);
    }

    public @unsigned int maxDescriptorSetUpdateAfterBindAccelerationStructures() {
        return segment.get(LAYOUT$maxDescriptorSetUpdateAfterBindAccelerationStructures, OFFSET$maxDescriptorSetUpdateAfterBindAccelerationStructures);
    }

    public void maxDescriptorSetUpdateAfterBindAccelerationStructures(@unsigned int value) {
        segment.set(LAYOUT$maxDescriptorSetUpdateAfterBindAccelerationStructures, OFFSET$maxDescriptorSetUpdateAfterBindAccelerationStructures, value);
    }

    public @unsigned int minAccelerationStructureScratchOffsetAlignment() {
        return segment.get(LAYOUT$minAccelerationStructureScratchOffsetAlignment, OFFSET$minAccelerationStructureScratchOffsetAlignment);
    }

    public void minAccelerationStructureScratchOffsetAlignment(@unsigned int value) {
        segment.set(LAYOUT$minAccelerationStructureScratchOffsetAlignment, OFFSET$minAccelerationStructureScratchOffsetAlignment, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("maxGeometryCount"),
        ValueLayout.JAVA_LONG.withName("maxInstanceCount"),
        ValueLayout.JAVA_LONG.withName("maxPrimitiveCount"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorAccelerationStructures"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindAccelerationStructures"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetAccelerationStructures"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindAccelerationStructures"),
        ValueLayout.JAVA_INT.withName("minAccelerationStructureScratchOffsetAlignment")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$maxGeometryCount = PathElement.groupElement("PATH$maxGeometryCount");
    public static final PathElement PATH$maxInstanceCount = PathElement.groupElement("PATH$maxInstanceCount");
    public static final PathElement PATH$maxPrimitiveCount = PathElement.groupElement("PATH$maxPrimitiveCount");
    public static final PathElement PATH$maxPerStageDescriptorAccelerationStructures = PathElement.groupElement("PATH$maxPerStageDescriptorAccelerationStructures");
    public static final PathElement PATH$maxPerStageDescriptorUpdateAfterBindAccelerationStructures = PathElement.groupElement("PATH$maxPerStageDescriptorUpdateAfterBindAccelerationStructures");
    public static final PathElement PATH$maxDescriptorSetAccelerationStructures = PathElement.groupElement("PATH$maxDescriptorSetAccelerationStructures");
    public static final PathElement PATH$maxDescriptorSetUpdateAfterBindAccelerationStructures = PathElement.groupElement("PATH$maxDescriptorSetUpdateAfterBindAccelerationStructures");
    public static final PathElement PATH$minAccelerationStructureScratchOffsetAlignment = PathElement.groupElement("PATH$minAccelerationStructureScratchOffsetAlignment");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$maxGeometryCount = (OfLong) LAYOUT.select(PATH$maxGeometryCount);
    public static final OfLong LAYOUT$maxInstanceCount = (OfLong) LAYOUT.select(PATH$maxInstanceCount);
    public static final OfLong LAYOUT$maxPrimitiveCount = (OfLong) LAYOUT.select(PATH$maxPrimitiveCount);
    public static final OfInt LAYOUT$maxPerStageDescriptorAccelerationStructures = (OfInt) LAYOUT.select(PATH$maxPerStageDescriptorAccelerationStructures);
    public static final OfInt LAYOUT$maxPerStageDescriptorUpdateAfterBindAccelerationStructures = (OfInt) LAYOUT.select(PATH$maxPerStageDescriptorUpdateAfterBindAccelerationStructures);
    public static final OfInt LAYOUT$maxDescriptorSetAccelerationStructures = (OfInt) LAYOUT.select(PATH$maxDescriptorSetAccelerationStructures);
    public static final OfInt LAYOUT$maxDescriptorSetUpdateAfterBindAccelerationStructures = (OfInt) LAYOUT.select(PATH$maxDescriptorSetUpdateAfterBindAccelerationStructures);
    public static final OfInt LAYOUT$minAccelerationStructureScratchOffsetAlignment = (OfInt) LAYOUT.select(PATH$minAccelerationStructureScratchOffsetAlignment);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maxGeometryCount = LAYOUT$maxGeometryCount.byteSize();
    public static final long SIZE$maxInstanceCount = LAYOUT$maxInstanceCount.byteSize();
    public static final long SIZE$maxPrimitiveCount = LAYOUT$maxPrimitiveCount.byteSize();
    public static final long SIZE$maxPerStageDescriptorAccelerationStructures = LAYOUT$maxPerStageDescriptorAccelerationStructures.byteSize();
    public static final long SIZE$maxPerStageDescriptorUpdateAfterBindAccelerationStructures = LAYOUT$maxPerStageDescriptorUpdateAfterBindAccelerationStructures.byteSize();
    public static final long SIZE$maxDescriptorSetAccelerationStructures = LAYOUT$maxDescriptorSetAccelerationStructures.byteSize();
    public static final long SIZE$maxDescriptorSetUpdateAfterBindAccelerationStructures = LAYOUT$maxDescriptorSetUpdateAfterBindAccelerationStructures.byteSize();
    public static final long SIZE$minAccelerationStructureScratchOffsetAlignment = LAYOUT$minAccelerationStructureScratchOffsetAlignment.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxGeometryCount = LAYOUT.byteOffset(PATH$maxGeometryCount);
    public static final long OFFSET$maxInstanceCount = LAYOUT.byteOffset(PATH$maxInstanceCount);
    public static final long OFFSET$maxPrimitiveCount = LAYOUT.byteOffset(PATH$maxPrimitiveCount);
    public static final long OFFSET$maxPerStageDescriptorAccelerationStructures = LAYOUT.byteOffset(PATH$maxPerStageDescriptorAccelerationStructures);
    public static final long OFFSET$maxPerStageDescriptorUpdateAfterBindAccelerationStructures = LAYOUT.byteOffset(PATH$maxPerStageDescriptorUpdateAfterBindAccelerationStructures);
    public static final long OFFSET$maxDescriptorSetAccelerationStructures = LAYOUT.byteOffset(PATH$maxDescriptorSetAccelerationStructures);
    public static final long OFFSET$maxDescriptorSetUpdateAfterBindAccelerationStructures = LAYOUT.byteOffset(PATH$maxDescriptorSetUpdateAfterBindAccelerationStructures);
    public static final long OFFSET$minAccelerationStructureScratchOffsetAlignment = LAYOUT.byteOffset(PATH$minAccelerationStructureScratchOffsetAlignment);
}
