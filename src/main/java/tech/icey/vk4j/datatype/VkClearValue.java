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

public record VkClearValue(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        VkClearColorValue.LAYOUT.withName("color"),
        VkClearDepthStencilValue.LAYOUT.withName("depthStencil")
    );

    public static final PathElement PATH$color = PathElement.groupElement(0);
    public static final PathElement PATH$depthStencil = PathElement.groupElement(1);

    public static final UnionLayout LAYOUT$color = (UnionLayout) LAYOUT.select(PATH$color);
    public static final StructLayout LAYOUT$depthStencil = (StructLayout) LAYOUT.select(PATH$depthStencil);

    public static final long OFFSET$color = LAYOUT.byteOffset(PATH$color);
    public static final long OFFSET$depthStencil = LAYOUT.byteOffset(PATH$depthStencil);

    public VkClearValue(MemorySegment segment) {
        this.segment = segment;
    }

    public VkClearColorValue color() {
        return new VkClearColorValue(segment.asSlice(OFFSET$color, LAYOUT$color));
    }

    public void color(VkClearColorValue value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$color, LAYOUT$color.byteSize());
    }

    public VkClearDepthStencilValue depthStencil() {
        return new VkClearDepthStencilValue(segment.asSlice(OFFSET$depthStencil, LAYOUT$depthStencil));
    }

    public void depthStencil(VkClearDepthStencilValue value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$depthStencil, LAYOUT$depthStencil.byteSize());
    }


    public static final class VkClearValueFactory implements IDataTypeFactory<VkClearValue> {
        @Override
        public Class<VkClearValue> clazz() {
            return VkClearValue.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkClearValue.LAYOUT;
        }

        @Override
        public VkClearValue create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkClearValue createUninit(MemorySegment segment) {
            return new VkClearValue(segment);
        }
    }

    public static final VkClearValueFactory FACTORY = new VkClearValueFactory();
}
