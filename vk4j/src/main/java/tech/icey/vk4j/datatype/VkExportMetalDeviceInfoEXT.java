package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
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

public record VkExportMetalDeviceInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("mtlDevice")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$mtlDevice = PathElement.groupElement("mtlDevice");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$mtlDevice = (AddressLayout) LAYOUT.select(PATH$mtlDevice);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$mtlDevice = LAYOUT.byteOffset(PATH$mtlDevice);

    public VkExportMetalDeviceInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_EXPORT_METAL_DEVICE_INFO_EXT);
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

    public @pointer(comment="void*") MemorySegment mtlDevice() {
        return segment.get(LAYOUT$mtlDevice, OFFSET$mtlDevice);
    }

    public void mtlDevice(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$mtlDevice, OFFSET$mtlDevice, value);
    }


    public static final class Factory implements IFactory<VkExportMetalDeviceInfoEXT> {
        @Override
        public Class<VkExportMetalDeviceInfoEXT> clazz() {
            return VkExportMetalDeviceInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkExportMetalDeviceInfoEXT.LAYOUT;
        }

        @Override
        public VkExportMetalDeviceInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkExportMetalDeviceInfoEXT createUninit(MemorySegment segment) {
            return new VkExportMetalDeviceInfoEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
