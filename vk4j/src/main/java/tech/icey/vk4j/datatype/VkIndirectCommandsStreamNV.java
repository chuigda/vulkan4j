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

public record VkIndirectCommandsStreamNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("buffer"),
        ValueLayout.JAVA_LONG.withName("offset")
    );

    public static final PathElement PATH$buffer = PathElement.groupElement("buffer");
    public static final PathElement PATH$offset = PathElement.groupElement("offset");

    public static final AddressLayout LAYOUT$buffer = (AddressLayout) LAYOUT.select(PATH$buffer);
    public static final OfLong LAYOUT$offset = (OfLong) LAYOUT.select(PATH$offset);

    public static final long OFFSET$buffer = LAYOUT.byteOffset(PATH$buffer);
    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);

    public VkIndirectCommandsStreamNV(MemorySegment segment) {
        this.segment = segment;
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


    public static final class VkIndirectCommandsStreamNVFactory implements IFactory<VkIndirectCommandsStreamNV> {
        @Override
        public Class<VkIndirectCommandsStreamNV> clazz() {
            return VkIndirectCommandsStreamNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkIndirectCommandsStreamNV.LAYOUT;
        }

        @Override
        public VkIndirectCommandsStreamNV create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkIndirectCommandsStreamNV createUninit(MemorySegment segment) {
            return new VkIndirectCommandsStreamNV(segment);
        }
    }

    public static final VkIndirectCommandsStreamNVFactory FACTORY = new VkIndirectCommandsStreamNVFactory();
}
