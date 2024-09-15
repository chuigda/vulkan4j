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
import tech.icey.vk4j.IDataTypeFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceExternalSciSyncFeaturesNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sciSyncFence"),
        ValueLayout.JAVA_INT.withName("sciSyncSemaphore"),
        ValueLayout.JAVA_INT.withName("sciSyncImport"),
        ValueLayout.JAVA_INT.withName("sciSyncExport")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$sciSyncFence = PathElement.groupElement(2);
    public static final PathElement PATH$sciSyncSemaphore = PathElement.groupElement(3);
    public static final PathElement PATH$sciSyncImport = PathElement.groupElement(4);
    public static final PathElement PATH$sciSyncExport = PathElement.groupElement(5);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$sciSyncFence = (OfInt) LAYOUT.select(PATH$sciSyncFence);
    public static final OfInt LAYOUT$sciSyncSemaphore = (OfInt) LAYOUT.select(PATH$sciSyncSemaphore);
    public static final OfInt LAYOUT$sciSyncImport = (OfInt) LAYOUT.select(PATH$sciSyncImport);
    public static final OfInt LAYOUT$sciSyncExport = (OfInt) LAYOUT.select(PATH$sciSyncExport);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$sciSyncFence = LAYOUT.byteOffset(PATH$sciSyncFence);
    public static final long OFFSET$sciSyncSemaphore = LAYOUT.byteOffset(PATH$sciSyncSemaphore);
    public static final long OFFSET$sciSyncImport = LAYOUT.byteOffset(PATH$sciSyncImport);
    public static final long OFFSET$sciSyncExport = LAYOUT.byteOffset(PATH$sciSyncExport);

    public VkPhysicalDeviceExternalSciSyncFeaturesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_SCI_SYNC_FEATURES_NV);
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

    public @unsigned int sciSyncFence() {
        return segment.get(LAYOUT$sciSyncFence, OFFSET$sciSyncFence);
    }

    public void sciSyncFence(@unsigned int value) {
        segment.set(LAYOUT$sciSyncFence, OFFSET$sciSyncFence, value);
    }

    public @unsigned int sciSyncSemaphore() {
        return segment.get(LAYOUT$sciSyncSemaphore, OFFSET$sciSyncSemaphore);
    }

    public void sciSyncSemaphore(@unsigned int value) {
        segment.set(LAYOUT$sciSyncSemaphore, OFFSET$sciSyncSemaphore, value);
    }

    public @unsigned int sciSyncImport() {
        return segment.get(LAYOUT$sciSyncImport, OFFSET$sciSyncImport);
    }

    public void sciSyncImport(@unsigned int value) {
        segment.set(LAYOUT$sciSyncImport, OFFSET$sciSyncImport, value);
    }

    public @unsigned int sciSyncExport() {
        return segment.get(LAYOUT$sciSyncExport, OFFSET$sciSyncExport);
    }

    public void sciSyncExport(@unsigned int value) {
        segment.set(LAYOUT$sciSyncExport, OFFSET$sciSyncExport, value);
    }


    public static final class VkPhysicalDeviceExternalSciSyncFeaturesNVFactory implements IDataTypeFactory<VkPhysicalDeviceExternalSciSyncFeaturesNV> {
        @Override
        public Class<VkPhysicalDeviceExternalSciSyncFeaturesNV> clazz() {
            return VkPhysicalDeviceExternalSciSyncFeaturesNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceExternalSciSyncFeaturesNV.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceExternalSciSyncFeaturesNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceExternalSciSyncFeaturesNV createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceExternalSciSyncFeaturesNV(segment);
        }
    }

    public static final VkPhysicalDeviceExternalSciSyncFeaturesNVFactory FACTORY = new VkPhysicalDeviceExternalSciSyncFeaturesNVFactory();
}
