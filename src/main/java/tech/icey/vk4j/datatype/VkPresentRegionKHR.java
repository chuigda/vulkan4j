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

public record VkPresentRegionKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("rectangleCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkRectLayerKHR.LAYOUT).withName("pRectangles")
    );

    public static final PathElement PATH$rectangleCount = PathElement.groupElement("rectangleCount");
    public static final PathElement PATH$pRectangles = PathElement.groupElement("pRectangles");

    public static final OfInt LAYOUT$rectangleCount = (OfInt) LAYOUT.select(PATH$rectangleCount);
    public static final AddressLayout LAYOUT$pRectangles = (AddressLayout) LAYOUT.select(PATH$pRectangles);

    public static final long OFFSET$rectangleCount = LAYOUT.byteOffset(PATH$rectangleCount);
    public static final long OFFSET$pRectangles = LAYOUT.byteOffset(PATH$pRectangles);

    public VkPresentRegionKHR(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int rectangleCount() {
        return segment.get(LAYOUT$rectangleCount, OFFSET$rectangleCount);
    }

    public void rectangleCount(@unsigned int value) {
        segment.set(LAYOUT$rectangleCount, OFFSET$rectangleCount, value);
    }

    public @pointer(comment="VkRectLayerKHR*") MemorySegment pRectanglesRaw() {
        return segment.get(LAYOUT$pRectangles, OFFSET$pRectangles);
    }

    public void pRectanglesRaw(@pointer(comment="VkRectLayerKHR*") MemorySegment value) {
        segment.set(LAYOUT$pRectangles, OFFSET$pRectangles, value);
    }
    
    public @nullable VkRectLayerKHR pRectangles() {
        MemorySegment s = pRectanglesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkRectLayerKHR(s);
    }

    public void pRectangles(@nullable VkRectLayerKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pRectanglesRaw(s);
    }


    public static final class VkPresentRegionKHRFactory implements IDataTypeFactory<VkPresentRegionKHR> {
        @Override
        public Class<VkPresentRegionKHR> clazz() {
            return VkPresentRegionKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPresentRegionKHR.LAYOUT;
        }

        @Override
        public VkPresentRegionKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPresentRegionKHR createUninit(MemorySegment segment) {
            return new VkPresentRegionKHR(segment);
        }
    }

    public static final VkPresentRegionKHRFactory FACTORY = new VkPresentRegionKHRFactory();
}
