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

public record VkBlitImageCubicWeightsInfoQCOM(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("cubicWeights")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$cubicWeights = PathElement.groupElement(2);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$cubicWeights = (OfInt) LAYOUT.select(PATH$cubicWeights);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$cubicWeights = LAYOUT.byteOffset(PATH$cubicWeights);

    public VkBlitImageCubicWeightsInfoQCOM(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_BLIT_IMAGE_CUBIC_WEIGHTS_INFO_QCOM);
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

    public @enumtype(VkCubicFilterWeightsQCOM.class) int cubicWeights() {
        return segment.get(LAYOUT$cubicWeights, OFFSET$cubicWeights);
    }

    public void cubicWeights(@enumtype(VkCubicFilterWeightsQCOM.class) int value) {
        segment.set(LAYOUT$cubicWeights, OFFSET$cubicWeights, value);
    }


    public static final class VkBlitImageCubicWeightsInfoQCOMFactory implements IDataTypeFactory<VkBlitImageCubicWeightsInfoQCOM> {
        @Override
        public Class<VkBlitImageCubicWeightsInfoQCOM> clazz() {
            return VkBlitImageCubicWeightsInfoQCOM.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkBlitImageCubicWeightsInfoQCOM.LAYOUT;
        }

        @Override
        public VkBlitImageCubicWeightsInfoQCOM create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkBlitImageCubicWeightsInfoQCOM createUninit(MemorySegment segment) {
            return new VkBlitImageCubicWeightsInfoQCOM(segment);
        }
    }

    public static final VkBlitImageCubicWeightsInfoQCOMFactory FACTORY = new VkBlitImageCubicWeightsInfoQCOMFactory();
}
