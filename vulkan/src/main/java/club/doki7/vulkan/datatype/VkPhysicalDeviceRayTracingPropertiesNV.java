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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceRayTracingPropertiesNV.html"><code>VkPhysicalDeviceRayTracingPropertiesNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceRayTracingPropertiesNV {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t shaderGroupHandleSize; // @link substring="shaderGroupHandleSize" target="#shaderGroupHandleSize"
///     uint32_t maxRecursionDepth; // @link substring="maxRecursionDepth" target="#maxRecursionDepth"
///     uint32_t maxShaderGroupStride; // @link substring="maxShaderGroupStride" target="#maxShaderGroupStride"
///     uint32_t shaderGroupBaseAlignment; // @link substring="shaderGroupBaseAlignment" target="#shaderGroupBaseAlignment"
///     uint64_t maxGeometryCount; // @link substring="maxGeometryCount" target="#maxGeometryCount"
///     uint64_t maxInstanceCount; // @link substring="maxInstanceCount" target="#maxInstanceCount"
///     uint64_t maxTriangleCount; // @link substring="maxTriangleCount" target="#maxTriangleCount"
///     uint32_t maxDescriptorSetAccelerationStructures; // @link substring="maxDescriptorSetAccelerationStructures" target="#maxDescriptorSetAccelerationStructures"
/// } VkPhysicalDeviceRayTracingPropertiesNV;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES_NV`
///
/// The {@code allocate} ({@link VkPhysicalDeviceRayTracingPropertiesNV#allocate(Arena)}, {@link VkPhysicalDeviceRayTracingPropertiesNV#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPhysicalDeviceRayTracingPropertiesNV#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceRayTracingPropertiesNV.html"><code>VkPhysicalDeviceRayTracingPropertiesNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceRayTracingPropertiesNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkPhysicalDeviceRayTracingPropertiesNV allocate(Arena arena) {
        VkPhysicalDeviceRayTracingPropertiesNV ret = new VkPhysicalDeviceRayTracingPropertiesNV(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES_NV);
        return ret;
    }

    public static VkPhysicalDeviceRayTracingPropertiesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceRayTracingPropertiesNV[] ret = new VkPhysicalDeviceRayTracingPropertiesNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceRayTracingPropertiesNV(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES_NV);
        }
        return ret;
    }

    public static VkPhysicalDeviceRayTracingPropertiesNV clone(Arena arena, VkPhysicalDeviceRayTracingPropertiesNV src) {
        VkPhysicalDeviceRayTracingPropertiesNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceRayTracingPropertiesNV[] clone(Arena arena, VkPhysicalDeviceRayTracingPropertiesNV[] src) {
        VkPhysicalDeviceRayTracingPropertiesNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PHYSICAL_DEVICE_RAY_TRACING_PROPERTIES_NV);
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

    public @unsigned int shaderGroupHandleSize() {
        return segment.get(LAYOUT$shaderGroupHandleSize, OFFSET$shaderGroupHandleSize);
    }

    public void shaderGroupHandleSize(@unsigned int value) {
        segment.set(LAYOUT$shaderGroupHandleSize, OFFSET$shaderGroupHandleSize, value);
    }

    public @unsigned int maxRecursionDepth() {
        return segment.get(LAYOUT$maxRecursionDepth, OFFSET$maxRecursionDepth);
    }

    public void maxRecursionDepth(@unsigned int value) {
        segment.set(LAYOUT$maxRecursionDepth, OFFSET$maxRecursionDepth, value);
    }

    public @unsigned int maxShaderGroupStride() {
        return segment.get(LAYOUT$maxShaderGroupStride, OFFSET$maxShaderGroupStride);
    }

    public void maxShaderGroupStride(@unsigned int value) {
        segment.set(LAYOUT$maxShaderGroupStride, OFFSET$maxShaderGroupStride, value);
    }

    public @unsigned int shaderGroupBaseAlignment() {
        return segment.get(LAYOUT$shaderGroupBaseAlignment, OFFSET$shaderGroupBaseAlignment);
    }

    public void shaderGroupBaseAlignment(@unsigned int value) {
        segment.set(LAYOUT$shaderGroupBaseAlignment, OFFSET$shaderGroupBaseAlignment, value);
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

    public @unsigned long maxTriangleCount() {
        return segment.get(LAYOUT$maxTriangleCount, OFFSET$maxTriangleCount);
    }

    public void maxTriangleCount(@unsigned long value) {
        segment.set(LAYOUT$maxTriangleCount, OFFSET$maxTriangleCount, value);
    }

    public @unsigned int maxDescriptorSetAccelerationStructures() {
        return segment.get(LAYOUT$maxDescriptorSetAccelerationStructures, OFFSET$maxDescriptorSetAccelerationStructures);
    }

    public void maxDescriptorSetAccelerationStructures(@unsigned int value) {
        segment.set(LAYOUT$maxDescriptorSetAccelerationStructures, OFFSET$maxDescriptorSetAccelerationStructures, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderGroupHandleSize"),
        ValueLayout.JAVA_INT.withName("maxRecursionDepth"),
        ValueLayout.JAVA_INT.withName("maxShaderGroupStride"),
        ValueLayout.JAVA_INT.withName("shaderGroupBaseAlignment"),
        ValueLayout.JAVA_LONG.withName("maxGeometryCount"),
        ValueLayout.JAVA_LONG.withName("maxInstanceCount"),
        ValueLayout.JAVA_LONG.withName("maxTriangleCount"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetAccelerationStructures")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$shaderGroupHandleSize = PathElement.groupElement("PATH$shaderGroupHandleSize");
    public static final PathElement PATH$maxRecursionDepth = PathElement.groupElement("PATH$maxRecursionDepth");
    public static final PathElement PATH$maxShaderGroupStride = PathElement.groupElement("PATH$maxShaderGroupStride");
    public static final PathElement PATH$shaderGroupBaseAlignment = PathElement.groupElement("PATH$shaderGroupBaseAlignment");
    public static final PathElement PATH$maxGeometryCount = PathElement.groupElement("PATH$maxGeometryCount");
    public static final PathElement PATH$maxInstanceCount = PathElement.groupElement("PATH$maxInstanceCount");
    public static final PathElement PATH$maxTriangleCount = PathElement.groupElement("PATH$maxTriangleCount");
    public static final PathElement PATH$maxDescriptorSetAccelerationStructures = PathElement.groupElement("PATH$maxDescriptorSetAccelerationStructures");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shaderGroupHandleSize = (OfInt) LAYOUT.select(PATH$shaderGroupHandleSize);
    public static final OfInt LAYOUT$maxRecursionDepth = (OfInt) LAYOUT.select(PATH$maxRecursionDepth);
    public static final OfInt LAYOUT$maxShaderGroupStride = (OfInt) LAYOUT.select(PATH$maxShaderGroupStride);
    public static final OfInt LAYOUT$shaderGroupBaseAlignment = (OfInt) LAYOUT.select(PATH$shaderGroupBaseAlignment);
    public static final OfLong LAYOUT$maxGeometryCount = (OfLong) LAYOUT.select(PATH$maxGeometryCount);
    public static final OfLong LAYOUT$maxInstanceCount = (OfLong) LAYOUT.select(PATH$maxInstanceCount);
    public static final OfLong LAYOUT$maxTriangleCount = (OfLong) LAYOUT.select(PATH$maxTriangleCount);
    public static final OfInt LAYOUT$maxDescriptorSetAccelerationStructures = (OfInt) LAYOUT.select(PATH$maxDescriptorSetAccelerationStructures);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shaderGroupHandleSize = LAYOUT$shaderGroupHandleSize.byteSize();
    public static final long SIZE$maxRecursionDepth = LAYOUT$maxRecursionDepth.byteSize();
    public static final long SIZE$maxShaderGroupStride = LAYOUT$maxShaderGroupStride.byteSize();
    public static final long SIZE$shaderGroupBaseAlignment = LAYOUT$shaderGroupBaseAlignment.byteSize();
    public static final long SIZE$maxGeometryCount = LAYOUT$maxGeometryCount.byteSize();
    public static final long SIZE$maxInstanceCount = LAYOUT$maxInstanceCount.byteSize();
    public static final long SIZE$maxTriangleCount = LAYOUT$maxTriangleCount.byteSize();
    public static final long SIZE$maxDescriptorSetAccelerationStructures = LAYOUT$maxDescriptorSetAccelerationStructures.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderGroupHandleSize = LAYOUT.byteOffset(PATH$shaderGroupHandleSize);
    public static final long OFFSET$maxRecursionDepth = LAYOUT.byteOffset(PATH$maxRecursionDepth);
    public static final long OFFSET$maxShaderGroupStride = LAYOUT.byteOffset(PATH$maxShaderGroupStride);
    public static final long OFFSET$shaderGroupBaseAlignment = LAYOUT.byteOffset(PATH$shaderGroupBaseAlignment);
    public static final long OFFSET$maxGeometryCount = LAYOUT.byteOffset(PATH$maxGeometryCount);
    public static final long OFFSET$maxInstanceCount = LAYOUT.byteOffset(PATH$maxInstanceCount);
    public static final long OFFSET$maxTriangleCount = LAYOUT.byteOffset(PATH$maxTriangleCount);
    public static final long OFFSET$maxDescriptorSetAccelerationStructures = LAYOUT.byteOffset(PATH$maxDescriptorSetAccelerationStructures);
}
