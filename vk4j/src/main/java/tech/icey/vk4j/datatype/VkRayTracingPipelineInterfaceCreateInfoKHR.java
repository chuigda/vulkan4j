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
/// typedef struct VkRayTracingPipelineInterfaceCreateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t maxPipelineRayPayloadSize;
///     uint32_t maxPipelineRayHitAttributeSize;
/// } VkRayTracingPipelineInterfaceCreateInfoKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkRayTracingPipelineInterfaceCreateInfoKHR.html">VkRayTracingPipelineInterfaceCreateInfoKHR</a>
public record VkRayTracingPipelineInterfaceCreateInfoKHR(MemorySegment segment) implements IPointer {
    public VkRayTracingPipelineInterfaceCreateInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_RAY_TRACING_PIPELINE_INTERFACE_CREATE_INFO_KHR);
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

    public @unsigned int maxPipelineRayPayloadSize() {
        return segment.get(LAYOUT$maxPipelineRayPayloadSize, OFFSET$maxPipelineRayPayloadSize);
    }

    public void maxPipelineRayPayloadSize(@unsigned int value) {
        segment.set(LAYOUT$maxPipelineRayPayloadSize, OFFSET$maxPipelineRayPayloadSize, value);
    }

    public @unsigned int maxPipelineRayHitAttributeSize() {
        return segment.get(LAYOUT$maxPipelineRayHitAttributeSize, OFFSET$maxPipelineRayHitAttributeSize);
    }

    public void maxPipelineRayHitAttributeSize(@unsigned int value) {
        segment.set(LAYOUT$maxPipelineRayHitAttributeSize, OFFSET$maxPipelineRayHitAttributeSize, value);
    }

    public static VkRayTracingPipelineInterfaceCreateInfoKHR allocate(Arena arena) {
        return new VkRayTracingPipelineInterfaceCreateInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkRayTracingPipelineInterfaceCreateInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRayTracingPipelineInterfaceCreateInfoKHR[] ret = new VkRayTracingPipelineInterfaceCreateInfoKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkRayTracingPipelineInterfaceCreateInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkRayTracingPipelineInterfaceCreateInfoKHR clone(Arena arena, VkRayTracingPipelineInterfaceCreateInfoKHR src) {
        VkRayTracingPipelineInterfaceCreateInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkRayTracingPipelineInterfaceCreateInfoKHR[] clone(Arena arena, VkRayTracingPipelineInterfaceCreateInfoKHR[] src) {
        VkRayTracingPipelineInterfaceCreateInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxPipelineRayPayloadSize"),
        ValueLayout.JAVA_INT.withName("maxPipelineRayHitAttributeSize")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$maxPipelineRayPayloadSize = PathElement.groupElement("maxPipelineRayPayloadSize");
    public static final PathElement PATH$maxPipelineRayHitAttributeSize = PathElement.groupElement("maxPipelineRayHitAttributeSize");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maxPipelineRayPayloadSize = (OfInt) LAYOUT.select(PATH$maxPipelineRayPayloadSize);
    public static final OfInt LAYOUT$maxPipelineRayHitAttributeSize = (OfInt) LAYOUT.select(PATH$maxPipelineRayHitAttributeSize);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxPipelineRayPayloadSize = LAYOUT.byteOffset(PATH$maxPipelineRayPayloadSize);
    public static final long OFFSET$maxPipelineRayHitAttributeSize = LAYOUT.byteOffset(PATH$maxPipelineRayHitAttributeSize);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maxPipelineRayPayloadSize = LAYOUT$maxPipelineRayPayloadSize.byteSize();
    public static final long SIZE$maxPipelineRayHitAttributeSize = LAYOUT$maxPipelineRayHitAttributeSize.byteSize();
}
