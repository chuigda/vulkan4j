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

public record VkPhysicalDeviceExternalSciSync2FeaturesNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sciSyncFence"),
        ValueLayout.JAVA_INT.withName("sciSyncSemaphore2"),
        ValueLayout.JAVA_INT.withName("sciSyncImport"),
        ValueLayout.JAVA_INT.withName("sciSyncExport")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$sciSyncFence = PathElement.groupElement("sciSyncFence");
    public static final PathElement PATH$sciSyncSemaphore2 = PathElement.groupElement("sciSyncSemaphore2");
    public static final PathElement PATH$sciSyncImport = PathElement.groupElement("sciSyncImport");
    public static final PathElement PATH$sciSyncExport = PathElement.groupElement("sciSyncExport");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$sciSyncFence = (OfInt) LAYOUT.select(PATH$sciSyncFence);
    public static final OfInt LAYOUT$sciSyncSemaphore2 = (OfInt) LAYOUT.select(PATH$sciSyncSemaphore2);
    public static final OfInt LAYOUT$sciSyncImport = (OfInt) LAYOUT.select(PATH$sciSyncImport);
    public static final OfInt LAYOUT$sciSyncExport = (OfInt) LAYOUT.select(PATH$sciSyncExport);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$sciSyncFence = LAYOUT.byteOffset(PATH$sciSyncFence);
    public static final long OFFSET$sciSyncSemaphore2 = LAYOUT.byteOffset(PATH$sciSyncSemaphore2);
    public static final long OFFSET$sciSyncImport = LAYOUT.byteOffset(PATH$sciSyncImport);
    public static final long OFFSET$sciSyncExport = LAYOUT.byteOffset(PATH$sciSyncExport);

    public VkPhysicalDeviceExternalSciSync2FeaturesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_SCI_SYNC_2_FEATURES_NV);
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

    public @unsigned int sciSyncSemaphore2() {
        return segment.get(LAYOUT$sciSyncSemaphore2, OFFSET$sciSyncSemaphore2);
    }

    public void sciSyncSemaphore2(@unsigned int value) {
        segment.set(LAYOUT$sciSyncSemaphore2, OFFSET$sciSyncSemaphore2, value);
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


    public static final class Factory implements IFactory<VkPhysicalDeviceExternalSciSync2FeaturesNV> {
        @Override
        public Class<VkPhysicalDeviceExternalSciSync2FeaturesNV> clazz() {
            return VkPhysicalDeviceExternalSciSync2FeaturesNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceExternalSciSync2FeaturesNV.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceExternalSciSync2FeaturesNV create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceExternalSciSync2FeaturesNV createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceExternalSciSync2FeaturesNV(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
