package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("fragmentShaderBarycentric")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$fragmentShaderBarycentric = PathElement.groupElement("fragmentShaderBarycentric");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$fragmentShaderBarycentric = (OfInt) LAYOUT.select(PATH$fragmentShaderBarycentric);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$fragmentShaderBarycentric = LAYOUT.byteOffset(PATH$fragmentShaderBarycentric);

    public VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_SHADER_BARYCENTRIC_FEATURES_KHR);
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

    public @unsigned int fragmentShaderBarycentric() {
        return segment.get(LAYOUT$fragmentShaderBarycentric, OFFSET$fragmentShaderBarycentric);
    }

    public void fragmentShaderBarycentric(@unsigned int value) {
        segment.set(LAYOUT$fragmentShaderBarycentric, OFFSET$fragmentShaderBarycentric, value);
    }

    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR allocate(Arena arena) {
        return new VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR[] ret = new VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceFragmentShaderBarycentricFeaturesKHR(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}
