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

/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE.html">VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE</a>
public record VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("descriptorSetHostMapping")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$descriptorSetHostMapping = PathElement.groupElement("descriptorSetHostMapping");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$descriptorSetHostMapping = (OfInt) LAYOUT.select(PATH$descriptorSetHostMapping);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$descriptorSetHostMapping = LAYOUT.byteOffset(PATH$descriptorSetHostMapping);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$descriptorSetHostMapping = LAYOUT$descriptorSetHostMapping.byteSize();

    public VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DESCRIPTOR_SET_HOST_MAPPING_FEATURES_VALVE);
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

    public @unsigned int descriptorSetHostMapping() {
        return segment.get(LAYOUT$descriptorSetHostMapping, OFFSET$descriptorSetHostMapping);
    }

    public void descriptorSetHostMapping(@unsigned int value) {
        segment.set(LAYOUT$descriptorSetHostMapping, OFFSET$descriptorSetHostMapping, value);
    }

    public static VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE allocate(Arena arena) {
        return new VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE[] ret = new VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceDescriptorSetHostMappingFeaturesVALVE(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
