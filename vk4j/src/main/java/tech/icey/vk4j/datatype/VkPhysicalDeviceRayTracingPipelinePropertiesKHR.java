package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceRayTracingPipelinePropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t shaderGroupHandleSize;
///     uint32_t maxRayRecursionDepth;
///     uint32_t maxShaderGroupStride;
///     uint32_t shaderGroupBaseAlignment;
///     uint32_t shaderGroupHandleCaptureReplaySize;
///     uint32_t maxRayDispatchInvocationCount;
///     uint32_t shaderGroupHandleAlignment;
///     uint32_t maxRayHitAttributeSize;
/// } VkPhysicalDeviceRayTracingPipelinePropertiesKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceRayTracingPipelinePropertiesKHR.html">VkPhysicalDeviceRayTracingPipelinePropertiesKHR</a>
public record VkPhysicalDeviceRayTracingPipelinePropertiesKHR(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceRayTracingPipelinePropertiesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RAY_TRACING_PIPELINE_PROPERTIES_KHR);
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
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @unsigned int shaderGroupHandleSize() {
        return segment.get(LAYOUT$shaderGroupHandleSize, OFFSET$shaderGroupHandleSize);
    }

    public void shaderGroupHandleSize(@unsigned int value) {
        segment.set(LAYOUT$shaderGroupHandleSize, OFFSET$shaderGroupHandleSize, value);
    }

    public @unsigned int maxRayRecursionDepth() {
        return segment.get(LAYOUT$maxRayRecursionDepth, OFFSET$maxRayRecursionDepth);
    }

    public void maxRayRecursionDepth(@unsigned int value) {
        segment.set(LAYOUT$maxRayRecursionDepth, OFFSET$maxRayRecursionDepth, value);
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

    public @unsigned int shaderGroupHandleCaptureReplaySize() {
        return segment.get(LAYOUT$shaderGroupHandleCaptureReplaySize, OFFSET$shaderGroupHandleCaptureReplaySize);
    }

    public void shaderGroupHandleCaptureReplaySize(@unsigned int value) {
        segment.set(LAYOUT$shaderGroupHandleCaptureReplaySize, OFFSET$shaderGroupHandleCaptureReplaySize, value);
    }

    public @unsigned int maxRayDispatchInvocationCount() {
        return segment.get(LAYOUT$maxRayDispatchInvocationCount, OFFSET$maxRayDispatchInvocationCount);
    }

    public void maxRayDispatchInvocationCount(@unsigned int value) {
        segment.set(LAYOUT$maxRayDispatchInvocationCount, OFFSET$maxRayDispatchInvocationCount, value);
    }

    public @unsigned int shaderGroupHandleAlignment() {
        return segment.get(LAYOUT$shaderGroupHandleAlignment, OFFSET$shaderGroupHandleAlignment);
    }

    public void shaderGroupHandleAlignment(@unsigned int value) {
        segment.set(LAYOUT$shaderGroupHandleAlignment, OFFSET$shaderGroupHandleAlignment, value);
    }

    public @unsigned int maxRayHitAttributeSize() {
        return segment.get(LAYOUT$maxRayHitAttributeSize, OFFSET$maxRayHitAttributeSize);
    }

    public void maxRayHitAttributeSize(@unsigned int value) {
        segment.set(LAYOUT$maxRayHitAttributeSize, OFFSET$maxRayHitAttributeSize, value);
    }

    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR allocate(Arena arena) {
        return new VkPhysicalDeviceRayTracingPipelinePropertiesKHR(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceRayTracingPipelinePropertiesKHR[] ret = new VkPhysicalDeviceRayTracingPipelinePropertiesKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceRayTracingPipelinePropertiesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR clone(Arena arena, VkPhysicalDeviceRayTracingPipelinePropertiesKHR src) {
        VkPhysicalDeviceRayTracingPipelinePropertiesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceRayTracingPipelinePropertiesKHR[] clone(Arena arena, VkPhysicalDeviceRayTracingPipelinePropertiesKHR[] src) {
        VkPhysicalDeviceRayTracingPipelinePropertiesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderGroupHandleSize"),
        ValueLayout.JAVA_INT.withName("maxRayRecursionDepth"),
        ValueLayout.JAVA_INT.withName("maxShaderGroupStride"),
        ValueLayout.JAVA_INT.withName("shaderGroupBaseAlignment"),
        ValueLayout.JAVA_INT.withName("shaderGroupHandleCaptureReplaySize"),
        ValueLayout.JAVA_INT.withName("maxRayDispatchInvocationCount"),
        ValueLayout.JAVA_INT.withName("shaderGroupHandleAlignment"),
        ValueLayout.JAVA_INT.withName("maxRayHitAttributeSize")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$shaderGroupHandleSize = PathElement.groupElement("shaderGroupHandleSize");
    public static final PathElement PATH$maxRayRecursionDepth = PathElement.groupElement("maxRayRecursionDepth");
    public static final PathElement PATH$maxShaderGroupStride = PathElement.groupElement("maxShaderGroupStride");
    public static final PathElement PATH$shaderGroupBaseAlignment = PathElement.groupElement("shaderGroupBaseAlignment");
    public static final PathElement PATH$shaderGroupHandleCaptureReplaySize = PathElement.groupElement("shaderGroupHandleCaptureReplaySize");
    public static final PathElement PATH$maxRayDispatchInvocationCount = PathElement.groupElement("maxRayDispatchInvocationCount");
    public static final PathElement PATH$shaderGroupHandleAlignment = PathElement.groupElement("shaderGroupHandleAlignment");
    public static final PathElement PATH$maxRayHitAttributeSize = PathElement.groupElement("maxRayHitAttributeSize");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shaderGroupHandleSize = (OfInt) LAYOUT.select(PATH$shaderGroupHandleSize);
    public static final OfInt LAYOUT$maxRayRecursionDepth = (OfInt) LAYOUT.select(PATH$maxRayRecursionDepth);
    public static final OfInt LAYOUT$maxShaderGroupStride = (OfInt) LAYOUT.select(PATH$maxShaderGroupStride);
    public static final OfInt LAYOUT$shaderGroupBaseAlignment = (OfInt) LAYOUT.select(PATH$shaderGroupBaseAlignment);
    public static final OfInt LAYOUT$shaderGroupHandleCaptureReplaySize = (OfInt) LAYOUT.select(PATH$shaderGroupHandleCaptureReplaySize);
    public static final OfInt LAYOUT$maxRayDispatchInvocationCount = (OfInt) LAYOUT.select(PATH$maxRayDispatchInvocationCount);
    public static final OfInt LAYOUT$shaderGroupHandleAlignment = (OfInt) LAYOUT.select(PATH$shaderGroupHandleAlignment);
    public static final OfInt LAYOUT$maxRayHitAttributeSize = (OfInt) LAYOUT.select(PATH$maxRayHitAttributeSize);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderGroupHandleSize = LAYOUT.byteOffset(PATH$shaderGroupHandleSize);
    public static final long OFFSET$maxRayRecursionDepth = LAYOUT.byteOffset(PATH$maxRayRecursionDepth);
    public static final long OFFSET$maxShaderGroupStride = LAYOUT.byteOffset(PATH$maxShaderGroupStride);
    public static final long OFFSET$shaderGroupBaseAlignment = LAYOUT.byteOffset(PATH$shaderGroupBaseAlignment);
    public static final long OFFSET$shaderGroupHandleCaptureReplaySize = LAYOUT.byteOffset(PATH$shaderGroupHandleCaptureReplaySize);
    public static final long OFFSET$maxRayDispatchInvocationCount = LAYOUT.byteOffset(PATH$maxRayDispatchInvocationCount);
    public static final long OFFSET$shaderGroupHandleAlignment = LAYOUT.byteOffset(PATH$shaderGroupHandleAlignment);
    public static final long OFFSET$maxRayHitAttributeSize = LAYOUT.byteOffset(PATH$maxRayHitAttributeSize);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shaderGroupHandleSize = LAYOUT$shaderGroupHandleSize.byteSize();
    public static final long SIZE$maxRayRecursionDepth = LAYOUT$maxRayRecursionDepth.byteSize();
    public static final long SIZE$maxShaderGroupStride = LAYOUT$maxShaderGroupStride.byteSize();
    public static final long SIZE$shaderGroupBaseAlignment = LAYOUT$shaderGroupBaseAlignment.byteSize();
    public static final long SIZE$shaderGroupHandleCaptureReplaySize = LAYOUT$shaderGroupHandleCaptureReplaySize.byteSize();
    public static final long SIZE$maxRayDispatchInvocationCount = LAYOUT$maxRayDispatchInvocationCount.byteSize();
    public static final long SIZE$shaderGroupHandleAlignment = LAYOUT$shaderGroupHandleAlignment.byteSize();
    public static final long SIZE$maxRayHitAttributeSize = LAYOUT$maxRayHitAttributeSize.byteSize();
}
