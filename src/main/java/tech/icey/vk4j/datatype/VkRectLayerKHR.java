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

public record VkRectLayerKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        VkOffset2D.LAYOUT.withName("offset"),
        VkExtent2D.LAYOUT.withName("extent"),
        ValueLayout.JAVA_INT.withName("layer")
    );

    public static final PathElement PATH$offset = PathElement.groupElement(0);
    public static final PathElement PATH$extent = PathElement.groupElement(1);
    public static final PathElement PATH$layer = PathElement.groupElement(2);

    public static final StructLayout LAYOUT$offset = (StructLayout) LAYOUT.select(PATH$offset);
    public static final StructLayout LAYOUT$extent = (StructLayout) LAYOUT.select(PATH$extent);
    public static final OfInt LAYOUT$layer = (OfInt) LAYOUT.select(PATH$layer);

    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);
    public static final long OFFSET$extent = LAYOUT.byteOffset(PATH$extent);
    public static final long OFFSET$layer = LAYOUT.byteOffset(PATH$layer);

    public VkRectLayerKHR(MemorySegment segment) {
        this.segment = segment;
    }

    public VkOffset2D offset() {
        return new VkOffset2D(segment.asSlice(OFFSET$offset, LAYOUT$offset));
    }

    public void offset(VkOffset2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$offset, LAYOUT$offset.byteSize());
    }

    public VkExtent2D extent() {
        return new VkExtent2D(segment.asSlice(OFFSET$extent, LAYOUT$extent));
    }

    public void extent(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$extent, LAYOUT$extent.byteSize());
    }

    public @unsigned int layer() {
        return segment.get(LAYOUT$layer, OFFSET$layer);
    }

    public void layer(@unsigned int value) {
        segment.set(LAYOUT$layer, OFFSET$layer, value);
    }


    public static final class VkRectLayerKHRFactory implements IDataTypeFactory<VkRectLayerKHR> {
        @Override
        public Class<VkRectLayerKHR> clazz() {
            return VkRectLayerKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkRectLayerKHR.LAYOUT;
        }

        @Override
        public VkRectLayerKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkRectLayerKHR createUninit(MemorySegment segment) {
            return new VkRectLayerKHR(segment);
        }
    }

    public static final VkRectLayerKHRFactory FACTORY = new VkRectLayerKHRFactory();
}