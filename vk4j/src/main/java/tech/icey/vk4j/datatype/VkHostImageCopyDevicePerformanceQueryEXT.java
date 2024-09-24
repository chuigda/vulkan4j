package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkHostImageCopyDevicePerformanceQueryEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("optimalDeviceAccess"),
        ValueLayout.JAVA_INT.withName("identicalMemoryLayout")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$optimalDeviceAccess = PathElement.groupElement("optimalDeviceAccess");
    public static final PathElement PATH$identicalMemoryLayout = PathElement.groupElement("identicalMemoryLayout");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$optimalDeviceAccess = (OfInt) LAYOUT.select(PATH$optimalDeviceAccess);
    public static final OfInt LAYOUT$identicalMemoryLayout = (OfInt) LAYOUT.select(PATH$identicalMemoryLayout);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$optimalDeviceAccess = LAYOUT.byteOffset(PATH$optimalDeviceAccess);
    public static final long OFFSET$identicalMemoryLayout = LAYOUT.byteOffset(PATH$identicalMemoryLayout);

    public VkHostImageCopyDevicePerformanceQueryEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY_EXT);
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

    public @unsigned int optimalDeviceAccess() {
        return segment.get(LAYOUT$optimalDeviceAccess, OFFSET$optimalDeviceAccess);
    }

    public void optimalDeviceAccess(@unsigned int value) {
        segment.set(LAYOUT$optimalDeviceAccess, OFFSET$optimalDeviceAccess, value);
    }

    public @unsigned int identicalMemoryLayout() {
        return segment.get(LAYOUT$identicalMemoryLayout, OFFSET$identicalMemoryLayout);
    }

    public void identicalMemoryLayout(@unsigned int value) {
        segment.set(LAYOUT$identicalMemoryLayout, OFFSET$identicalMemoryLayout, value);
    }


    public static final class Factory implements IFactory<VkHostImageCopyDevicePerformanceQueryEXT> {
        @Override
        public Class<VkHostImageCopyDevicePerformanceQueryEXT> clazz() {
            return VkHostImageCopyDevicePerformanceQueryEXT.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkHostImageCopyDevicePerformanceQueryEXT.LAYOUT;
        }

        @Override
        public VkHostImageCopyDevicePerformanceQueryEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkHostImageCopyDevicePerformanceQueryEXT createUninit(MemorySegment segment) {
            return new VkHostImageCopyDevicePerformanceQueryEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
