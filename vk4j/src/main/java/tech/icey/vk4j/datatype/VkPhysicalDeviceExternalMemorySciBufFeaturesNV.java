package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceExternalMemorySciBufFeaturesNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("sciBufImport"),
        ValueLayout.JAVA_INT.withName("sciBufExport")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$sciBufImport = PathElement.groupElement("sciBufImport");
    public static final PathElement PATH$sciBufExport = PathElement.groupElement("sciBufExport");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$sciBufImport = (OfInt) LAYOUT.select(PATH$sciBufImport);
    public static final OfInt LAYOUT$sciBufExport = (OfInt) LAYOUT.select(PATH$sciBufExport);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$sciBufImport = LAYOUT.byteOffset(PATH$sciBufImport);
    public static final long OFFSET$sciBufExport = LAYOUT.byteOffset(PATH$sciBufExport);

    public VkPhysicalDeviceExternalMemorySciBufFeaturesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_SCI_BUF_FEATURES_NV);
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

    public @unsigned int sciBufImport() {
        return segment.get(LAYOUT$sciBufImport, OFFSET$sciBufImport);
    }

    public void sciBufImport(@unsigned int value) {
        segment.set(LAYOUT$sciBufImport, OFFSET$sciBufImport, value);
    }

    public @unsigned int sciBufExport() {
        return segment.get(LAYOUT$sciBufExport, OFFSET$sciBufExport);
    }

    public void sciBufExport(@unsigned int value) {
        segment.set(LAYOUT$sciBufExport, OFFSET$sciBufExport, value);
    }


    public static final class Factory implements IFactory<VkPhysicalDeviceExternalMemorySciBufFeaturesNV> {
        @Override
        public Class<VkPhysicalDeviceExternalMemorySciBufFeaturesNV> clazz() {
            return VkPhysicalDeviceExternalMemorySciBufFeaturesNV.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceExternalMemorySciBufFeaturesNV.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceExternalMemorySciBufFeaturesNV create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceExternalMemorySciBufFeaturesNV createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceExternalMemorySciBufFeaturesNV(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
