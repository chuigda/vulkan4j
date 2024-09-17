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

public record VkPhysicalDeviceDriverProperties(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("driverID"),
        MemoryLayout.sequenceLayout(VK_MAX_DRIVER_NAME_SIZE, ValueLayout.JAVA_BYTE).withName("driverName"),
        MemoryLayout.sequenceLayout(VK_MAX_DRIVER_INFO_SIZE, ValueLayout.JAVA_BYTE).withName("driverInfo"),
        VkConformanceVersion.LAYOUT.withName("conformanceVersion")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$driverID = PathElement.groupElement("driverID");
    public static final PathElement PATH$driverName = PathElement.groupElement("driverName");
    public static final PathElement PATH$driverInfo = PathElement.groupElement("driverInfo");
    public static final PathElement PATH$conformanceVersion = PathElement.groupElement("conformanceVersion");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$driverID = (OfInt) LAYOUT.select(PATH$driverID);
    public static final SequenceLayout LAYOUT$driverName = (SequenceLayout) LAYOUT.select(PATH$driverName);
    public static final SequenceLayout LAYOUT$driverInfo = (SequenceLayout) LAYOUT.select(PATH$driverInfo);
    public static final StructLayout LAYOUT$conformanceVersion = (StructLayout) LAYOUT.select(PATH$conformanceVersion);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$driverID = LAYOUT.byteOffset(PATH$driverID);
    public static final long OFFSET$driverName = LAYOUT.byteOffset(PATH$driverName);
    public static final long OFFSET$driverInfo = LAYOUT.byteOffset(PATH$driverInfo);
    public static final long OFFSET$conformanceVersion = LAYOUT.byteOffset(PATH$conformanceVersion);

    public VkPhysicalDeviceDriverProperties(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DRIVER_PROPERTIES);
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

    public @enumtype(VkDriverId.class) int driverID() {
        return segment.get(LAYOUT$driverID, OFFSET$driverID);
    }

    public void driverID(@enumtype(VkDriverId.class) int value) {
        segment.set(LAYOUT$driverID, OFFSET$driverID, value);
    }

    public MemorySegment driverNameRaw() {
        return segment.asSlice(OFFSET$driverName, LAYOUT$driverName.byteSize());
    }

    public ByteArray driverName() {
        return new ByteArray(driverNameRaw(), LAYOUT$driverName.elementCount());
    }

    public void driverName(ByteArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$driverName, LAYOUT$driverName.byteSize());
    }

    public MemorySegment driverInfoRaw() {
        return segment.asSlice(OFFSET$driverInfo, LAYOUT$driverInfo.byteSize());
    }

    public ByteArray driverInfo() {
        return new ByteArray(driverInfoRaw(), LAYOUT$driverInfo.elementCount());
    }

    public void driverInfo(ByteArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$driverInfo, LAYOUT$driverInfo.byteSize());
    }

    public VkConformanceVersion conformanceVersion() {
        return new VkConformanceVersion(segment.asSlice(OFFSET$conformanceVersion, LAYOUT$conformanceVersion));
    }

    public void conformanceVersion(VkConformanceVersion value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$conformanceVersion, LAYOUT$conformanceVersion.byteSize());
    }


    public static final class VkPhysicalDeviceDriverPropertiesFactory implements IFactory<VkPhysicalDeviceDriverProperties> {
        @Override
        public Class<VkPhysicalDeviceDriverProperties> clazz() {
            return VkPhysicalDeviceDriverProperties.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceDriverProperties.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceDriverProperties create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceDriverProperties createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceDriverProperties(segment);
        }
    }

    public static final VkPhysicalDeviceDriverPropertiesFactory FACTORY = new VkPhysicalDeviceDriverPropertiesFactory();
}
