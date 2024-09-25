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

public record VkImageViewSampleWeightCreateInfoQCOM(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkOffset2D.LAYOUT.withName("filterCenter"),
        VkExtent2D.LAYOUT.withName("filterSize"),
        ValueLayout.JAVA_INT.withName("numPhases")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$filterCenter = PathElement.groupElement("filterCenter");
    public static final PathElement PATH$filterSize = PathElement.groupElement("filterSize");
    public static final PathElement PATH$numPhases = PathElement.groupElement("numPhases");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$filterCenter = (StructLayout) LAYOUT.select(PATH$filterCenter);
    public static final StructLayout LAYOUT$filterSize = (StructLayout) LAYOUT.select(PATH$filterSize);
    public static final OfInt LAYOUT$numPhases = (OfInt) LAYOUT.select(PATH$numPhases);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$filterCenter = LAYOUT.byteOffset(PATH$filterCenter);
    public static final long OFFSET$filterSize = LAYOUT.byteOffset(PATH$filterSize);
    public static final long OFFSET$numPhases = LAYOUT.byteOffset(PATH$numPhases);

    public VkImageViewSampleWeightCreateInfoQCOM(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IMAGE_VIEW_SAMPLE_WEIGHT_CREATE_INFO_QCOM);
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

    public VkOffset2D filterCenter() {
        return new VkOffset2D(segment.asSlice(OFFSET$filterCenter, LAYOUT$filterCenter));
    }

    public void filterCenter(VkOffset2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$filterCenter, LAYOUT$filterCenter.byteSize());
    }

    public VkExtent2D filterSize() {
        return new VkExtent2D(segment.asSlice(OFFSET$filterSize, LAYOUT$filterSize));
    }

    public void filterSize(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$filterSize, LAYOUT$filterSize.byteSize());
    }

    public @unsigned int numPhases() {
        return segment.get(LAYOUT$numPhases, OFFSET$numPhases);
    }

    public void numPhases(@unsigned int value) {
        segment.set(LAYOUT$numPhases, OFFSET$numPhases, value);
    }


    public static final class Factory implements IFactory<VkImageViewSampleWeightCreateInfoQCOM> {
        @Override
        public Class<VkImageViewSampleWeightCreateInfoQCOM> clazz() {
            return VkImageViewSampleWeightCreateInfoQCOM.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkImageViewSampleWeightCreateInfoQCOM.LAYOUT;
        }

        @Override
        public VkImageViewSampleWeightCreateInfoQCOM create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkImageViewSampleWeightCreateInfoQCOM createUninit(MemorySegment segment) {
            return new VkImageViewSampleWeightCreateInfoQCOM(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
