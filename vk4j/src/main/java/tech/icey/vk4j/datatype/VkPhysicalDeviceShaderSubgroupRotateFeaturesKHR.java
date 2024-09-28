package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderSubgroupRotate;
///     VkBool32 shaderSubgroupRotateClustered;
/// } VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR.html">VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR</a>
public record VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_SUBGROUP_ROTATE_FEATURES_KHR);
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @unsigned int shaderSubgroupRotate() {
        return segment.get(LAYOUT$shaderSubgroupRotate, OFFSET$shaderSubgroupRotate);
    }

    public void shaderSubgroupRotate(@unsigned int value) {
        segment.set(LAYOUT$shaderSubgroupRotate, OFFSET$shaderSubgroupRotate, value);
    }

    public @unsigned int shaderSubgroupRotateClustered() {
        return segment.get(LAYOUT$shaderSubgroupRotateClustered, OFFSET$shaderSubgroupRotateClustered);
    }

    public void shaderSubgroupRotateClustered(@unsigned int value) {
        segment.set(LAYOUT$shaderSubgroupRotateClustered, OFFSET$shaderSubgroupRotateClustered, value);
    }

    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR allocate(Arena arena) {
        return new VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR[] ret = new VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceShaderSubgroupRotateFeaturesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderSubgroupRotate"),
        ValueLayout.JAVA_INT.withName("shaderSubgroupRotateClustered")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$shaderSubgroupRotate = PathElement.groupElement("shaderSubgroupRotate");
    public static final PathElement PATH$shaderSubgroupRotateClustered = PathElement.groupElement("shaderSubgroupRotateClustered");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shaderSubgroupRotate = (OfInt) LAYOUT.select(PATH$shaderSubgroupRotate);
    public static final OfInt LAYOUT$shaderSubgroupRotateClustered = (OfInt) LAYOUT.select(PATH$shaderSubgroupRotateClustered);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderSubgroupRotate = LAYOUT.byteOffset(PATH$shaderSubgroupRotate);
    public static final long OFFSET$shaderSubgroupRotateClustered = LAYOUT.byteOffset(PATH$shaderSubgroupRotateClustered);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shaderSubgroupRotate = LAYOUT$shaderSubgroupRotate.byteSize();
    public static final long SIZE$shaderSubgroupRotateClustered = LAYOUT$shaderSubgroupRotateClustered.byteSize();
}
