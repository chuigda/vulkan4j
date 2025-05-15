package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

public record VkPhysicalDeviceRayTracingPropertiesNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$shaderGroupHandleSize = ValueLayout.JAVA_INT.withName("shaderGroupHandleSize");
    public static final OfInt LAYOUT$maxRecursionDepth = ValueLayout.JAVA_INT.withName("maxRecursionDepth");
    public static final OfInt LAYOUT$maxShaderGroupStride = ValueLayout.JAVA_INT.withName("maxShaderGroupStride");
    public static final OfInt LAYOUT$shaderGroupBaseAlignment = ValueLayout.JAVA_INT.withName("shaderGroupBaseAlignment");
    public static final OfLong LAYOUT$maxGeometryCount = ValueLayout.JAVA_LONG.withName("maxGeometryCount");
    public static final OfLong LAYOUT$maxInstanceCount = ValueLayout.JAVA_LONG.withName("maxInstanceCount");
    public static final OfLong LAYOUT$maxTriangleCount = ValueLayout.JAVA_LONG.withName("maxTriangleCount");
    public static final OfInt LAYOUT$maxDescriptorSetAccelerationStructures = ValueLayout.JAVA_INT.withName("maxDescriptorSetAccelerationStructures");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$shaderGroupHandleSize, LAYOUT$maxRecursionDepth, LAYOUT$maxShaderGroupStride, LAYOUT$shaderGroupBaseAlignment, LAYOUT$maxGeometryCount, LAYOUT$maxInstanceCount, LAYOUT$maxTriangleCount, LAYOUT$maxDescriptorSetAccelerationStructures);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceRayTracingPropertiesNV allocate(Arena arena) {
        return new VkPhysicalDeviceRayTracingPropertiesNV(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceRayTracingPropertiesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceRayTracingPropertiesNV[] ret = new VkPhysicalDeviceRayTracingPropertiesNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceRayTracingPropertiesNV(segment.asSlice(i * SIZE, SIZE));
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
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

}
/// dummy, not implemented yet
