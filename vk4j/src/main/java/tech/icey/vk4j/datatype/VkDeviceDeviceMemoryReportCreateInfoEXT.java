package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotations.*;
import tech.icey.vk4j.array.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.ptr.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkDeviceDeviceMemoryReportCreateInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("pfnUserCallback"),
        ValueLayout.ADDRESS.withName("pUserData")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$pfnUserCallback = PathElement.groupElement("pfnUserCallback");
    public static final PathElement PATH$pUserData = PathElement.groupElement("pUserData");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$pfnUserCallback = (AddressLayout) LAYOUT.select(PATH$pfnUserCallback);
    public static final AddressLayout LAYOUT$pUserData = (AddressLayout) LAYOUT.select(PATH$pUserData);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$pfnUserCallback = LAYOUT.byteOffset(PATH$pfnUserCallback);
    public static final long OFFSET$pUserData = LAYOUT.byteOffset(PATH$pUserData);

    public VkDeviceDeviceMemoryReportCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEVICE_DEVICE_MEMORY_REPORT_CREATE_INFO_EXT);
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

    public @enumtype(VkDeviceMemoryReportFlagsEXT.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkDeviceMemoryReportFlagsEXT.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @pointer(comment="PFN_vkDeviceMemoryReportCallbackEXT") MemorySegment pfnUserCallback() {
        return segment.get(LAYOUT$pfnUserCallback, OFFSET$pfnUserCallback);
    }

    public void pfnUserCallback(@pointer(comment="PFN_vkDeviceMemoryReportCallbackEXT") MemorySegment value) {
        segment.set(LAYOUT$pfnUserCallback, OFFSET$pfnUserCallback, value);
    }

    public @pointer(comment="void*") MemorySegment pUserData() {
        return segment.get(LAYOUT$pUserData, OFFSET$pUserData);
    }

    public void pUserData(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pUserData, OFFSET$pUserData, value);
    }


    public static final class VkDeviceDeviceMemoryReportCreateInfoEXTFactory implements IFactory<VkDeviceDeviceMemoryReportCreateInfoEXT> {
        @Override
        public Class<VkDeviceDeviceMemoryReportCreateInfoEXT> clazz() {
            return VkDeviceDeviceMemoryReportCreateInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDeviceDeviceMemoryReportCreateInfoEXT.LAYOUT;
        }

        @Override
        public VkDeviceDeviceMemoryReportCreateInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDeviceDeviceMemoryReportCreateInfoEXT createUninit(MemorySegment segment) {
            return new VkDeviceDeviceMemoryReportCreateInfoEXT(segment);
        }
    }

    public static final VkDeviceDeviceMemoryReportCreateInfoEXTFactory FACTORY = new VkDeviceDeviceMemoryReportCreateInfoEXTFactory();
}
