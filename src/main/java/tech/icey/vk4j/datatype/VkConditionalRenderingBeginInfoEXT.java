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

public record VkConditionalRenderingBeginInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("buffer"),
        ValueLayout.JAVA_LONG.withName("offset"),
        ValueLayout.JAVA_INT.withName("flags")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$buffer = PathElement.groupElement("buffer");
    public static final PathElement PATH$offset = PathElement.groupElement("offset");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$buffer = (AddressLayout) LAYOUT.select(PATH$buffer);
    public static final OfLong LAYOUT$offset = (OfLong) LAYOUT.select(PATH$offset);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$buffer = LAYOUT.byteOffset(PATH$buffer);
    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);

    public VkConditionalRenderingBeginInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_CONDITIONAL_RENDERING_BEGIN_INFO_EXT);
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

    public VkBuffer buffer() {
        return new VkBuffer(segment.asSlice(OFFSET$buffer, LAYOUT$buffer));
    }

    public void buffer(VkBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$buffer, LAYOUT$buffer.byteSize());
    }

    public @unsigned long offset() {
        return segment.get(LAYOUT$offset, OFFSET$offset);
    }

    public void offset(@unsigned long value) {
        segment.set(LAYOUT$offset, OFFSET$offset, value);
    }

    public @enumtype(VkConditionalRenderingFlagsEXT.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkConditionalRenderingFlagsEXT.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }


    public static final class VkConditionalRenderingBeginInfoEXTFactory implements IDataTypeFactory<VkConditionalRenderingBeginInfoEXT> {
        @Override
        public Class<VkConditionalRenderingBeginInfoEXT> clazz() {
            return VkConditionalRenderingBeginInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkConditionalRenderingBeginInfoEXT.LAYOUT;
        }

        @Override
        public VkConditionalRenderingBeginInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkConditionalRenderingBeginInfoEXT createUninit(MemorySegment segment) {
            return new VkConditionalRenderingBeginInfoEXT(segment);
        }
    }

    public static final VkConditionalRenderingBeginInfoEXTFactory FACTORY = new VkConditionalRenderingBeginInfoEXTFactory();
}
