package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

public record VkSpecializationMapEntry(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("constantID"),
        ValueLayout.JAVA_INT.withName("offset"),
        NativeLayout.C_SIZE_T.withName("size")
    );

    public static final PathElement PATH$constantID = PathElement.groupElement("constantID");
    public static final PathElement PATH$offset = PathElement.groupElement("offset");
    public static final PathElement PATH$size = PathElement.groupElement("size");

    public static final OfInt LAYOUT$constantID = (OfInt) LAYOUT.select(PATH$constantID);
    public static final OfInt LAYOUT$offset = (OfInt) LAYOUT.select(PATH$offset);

    public static final long OFFSET$constantID = LAYOUT.byteOffset(PATH$constantID);
    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);

    public VkSpecializationMapEntry(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int constantID() {
        return segment.get(LAYOUT$constantID, OFFSET$constantID);
    }

    public void constantID(@unsigned int value) {
        segment.set(LAYOUT$constantID, OFFSET$constantID, value);
    }

    public @unsigned int offset() {
        return segment.get(LAYOUT$offset, OFFSET$offset);
    }

    public void offset(@unsigned int value) {
        segment.set(LAYOUT$offset, OFFSET$offset, value);
    }

    public @unsigned long size() {
            return NativeLayout.readCSizeT(segment, OFFSET$size);
        }

        public void size(@unsigned long value) {
            NativeLayout.writeCSizeT(segment, OFFSET$size, value);
        }


    public static final class Factory implements IFactory<VkSpecializationMapEntry> {
        @Override
        public Class<VkSpecializationMapEntry> clazz() {
            return VkSpecializationMapEntry.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkSpecializationMapEntry.LAYOUT;
        }

        @Override
        public VkSpecializationMapEntry create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkSpecializationMapEntry createUninit(MemorySegment segment) {
            return new VkSpecializationMapEntry(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
