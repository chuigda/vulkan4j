package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkSubpassFragmentDensityMapOffsetEndInfoQCOM(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("fragmentDensityOffsetCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkOffset2D.LAYOUT).withName("pFragmentDensityOffsets")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$fragmentDensityOffsetCount = PathElement.groupElement("fragmentDensityOffsetCount");
    public static final PathElement PATH$pFragmentDensityOffsets = PathElement.groupElement("pFragmentDensityOffsets");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$fragmentDensityOffsetCount = (OfInt) LAYOUT.select(PATH$fragmentDensityOffsetCount);
    public static final AddressLayout LAYOUT$pFragmentDensityOffsets = (AddressLayout) LAYOUT.select(PATH$pFragmentDensityOffsets);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$fragmentDensityOffsetCount = LAYOUT.byteOffset(PATH$fragmentDensityOffsetCount);
    public static final long OFFSET$pFragmentDensityOffsets = LAYOUT.byteOffset(PATH$pFragmentDensityOffsets);

    public VkSubpassFragmentDensityMapOffsetEndInfoQCOM(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SUBPASS_FRAGMENT_DENSITY_MAP_OFFSET_END_INFO_QCOM);
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

    public @unsigned int fragmentDensityOffsetCount() {
        return segment.get(LAYOUT$fragmentDensityOffsetCount, OFFSET$fragmentDensityOffsetCount);
    }

    public void fragmentDensityOffsetCount(@unsigned int value) {
        segment.set(LAYOUT$fragmentDensityOffsetCount, OFFSET$fragmentDensityOffsetCount, value);
    }

    public @pointer(comment="VkOffset2D*") MemorySegment pFragmentDensityOffsetsRaw() {
        return segment.get(LAYOUT$pFragmentDensityOffsets, OFFSET$pFragmentDensityOffsets);
    }

    public void pFragmentDensityOffsetsRaw(@pointer(comment="VkOffset2D*") MemorySegment value) {
        segment.set(LAYOUT$pFragmentDensityOffsets, OFFSET$pFragmentDensityOffsets, value);
    }

    public @nullable VkOffset2D pFragmentDensityOffsets() {
        MemorySegment s = pFragmentDensityOffsetsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkOffset2D(s);
    }

    public void pFragmentDensityOffsets(@nullable VkOffset2D value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pFragmentDensityOffsetsRaw(s);
    }


    public static final class Factory implements IFactory<VkSubpassFragmentDensityMapOffsetEndInfoQCOM> {
        @Override
        public Class<VkSubpassFragmentDensityMapOffsetEndInfoQCOM> clazz() {
            return VkSubpassFragmentDensityMapOffsetEndInfoQCOM.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkSubpassFragmentDensityMapOffsetEndInfoQCOM.LAYOUT;
        }

        @Override
        public VkSubpassFragmentDensityMapOffsetEndInfoQCOM create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkSubpassFragmentDensityMapOffsetEndInfoQCOM createUninit(MemorySegment segment) {
            return new VkSubpassFragmentDensityMapOffsetEndInfoQCOM(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
