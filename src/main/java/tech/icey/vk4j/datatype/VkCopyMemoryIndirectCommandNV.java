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

public record VkCopyMemoryIndirectCommandNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("srcAddress"),
        ValueLayout.JAVA_LONG.withName("dstAddress"),
        ValueLayout.JAVA_LONG.withName("size")
    );

    public static final PathElement PATH$srcAddress = PathElement.groupElement(0);
    public static final PathElement PATH$dstAddress = PathElement.groupElement(1);
    public static final PathElement PATH$size = PathElement.groupElement(2);

    public static final OfLong LAYOUT$srcAddress = (OfLong) LAYOUT.select(PATH$srcAddress);
    public static final OfLong LAYOUT$dstAddress = (OfLong) LAYOUT.select(PATH$dstAddress);
    public static final OfLong LAYOUT$size = (OfLong) LAYOUT.select(PATH$size);

    public static final long OFFSET$srcAddress = LAYOUT.byteOffset(PATH$srcAddress);
    public static final long OFFSET$dstAddress = LAYOUT.byteOffset(PATH$dstAddress);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);

    public VkCopyMemoryIndirectCommandNV(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned long srcAddress() {
        return segment.get(LAYOUT$srcAddress, OFFSET$srcAddress);
    }

    public void srcAddress(@unsigned long value) {
        segment.set(LAYOUT$srcAddress, OFFSET$srcAddress, value);
    }

    public @unsigned long dstAddress() {
        return segment.get(LAYOUT$dstAddress, OFFSET$dstAddress);
    }

    public void dstAddress(@unsigned long value) {
        segment.set(LAYOUT$dstAddress, OFFSET$dstAddress, value);
    }

    public @unsigned long size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public void size(@unsigned long value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
    }


    public static final class VkCopyMemoryIndirectCommandNVFactory implements IDataTypeFactory<VkCopyMemoryIndirectCommandNV> {
        @Override
        public Class<VkCopyMemoryIndirectCommandNV> clazz() {
            return VkCopyMemoryIndirectCommandNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkCopyMemoryIndirectCommandNV.LAYOUT;
        }

        @Override
        public VkCopyMemoryIndirectCommandNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkCopyMemoryIndirectCommandNV createUninit(MemorySegment segment) {
            return new VkCopyMemoryIndirectCommandNV(segment);
        }
    }

    public static final VkCopyMemoryIndirectCommandNVFactory FACTORY = new VkCopyMemoryIndirectCommandNVFactory();
}