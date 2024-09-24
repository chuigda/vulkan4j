package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxVertexAttribDivisor"),
        ValueLayout.JAVA_INT.withName("supportsNonZeroFirstInstance")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$maxVertexAttribDivisor = PathElement.groupElement("maxVertexAttribDivisor");
    public static final PathElement PATH$supportsNonZeroFirstInstance = PathElement.groupElement("supportsNonZeroFirstInstance");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maxVertexAttribDivisor = (OfInt) LAYOUT.select(PATH$maxVertexAttribDivisor);
    public static final OfInt LAYOUT$supportsNonZeroFirstInstance = (OfInt) LAYOUT.select(PATH$supportsNonZeroFirstInstance);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxVertexAttribDivisor = LAYOUT.byteOffset(PATH$maxVertexAttribDivisor);
    public static final long OFFSET$supportsNonZeroFirstInstance = LAYOUT.byteOffset(PATH$supportsNonZeroFirstInstance);

    public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VERTEX_ATTRIBUTE_DIVISOR_PROPERTIES_KHR);
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

    public @unsigned int maxVertexAttribDivisor() {
        return segment.get(LAYOUT$maxVertexAttribDivisor, OFFSET$maxVertexAttribDivisor);
    }

    public void maxVertexAttribDivisor(@unsigned int value) {
        segment.set(LAYOUT$maxVertexAttribDivisor, OFFSET$maxVertexAttribDivisor, value);
    }

    public @unsigned int supportsNonZeroFirstInstance() {
        return segment.get(LAYOUT$supportsNonZeroFirstInstance, OFFSET$supportsNonZeroFirstInstance);
    }

    public void supportsNonZeroFirstInstance(@unsigned int value) {
        segment.set(LAYOUT$supportsNonZeroFirstInstance, OFFSET$supportsNonZeroFirstInstance, value);
    }


    public static final class Factory implements IFactory<VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR> {
        @Override
        public Class<VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR> clazz() {
            return VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceVertexAttributeDivisorPropertiesKHR(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
