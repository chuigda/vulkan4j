package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPipelineCacheHeaderVersionOne(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("headerSize"),
        ValueLayout.JAVA_INT.withName("headerVersion"),
        ValueLayout.JAVA_INT.withName("vendorID"),
        ValueLayout.JAVA_INT.withName("deviceID"),
        MemoryLayout.sequenceLayout(VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("pipelineCacheUUID")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$headerSize = PathElement.groupElement("headerSize");
    public static final PathElement PATH$headerVersion = PathElement.groupElement("headerVersion");
    public static final PathElement PATH$vendorID = PathElement.groupElement("vendorID");
    public static final PathElement PATH$deviceID = PathElement.groupElement("deviceID");
    public static final PathElement PATH$pipelineCacheUUID = PathElement.groupElement("pipelineCacheUUID");

    public static final OfInt LAYOUT$headerSize = (OfInt) LAYOUT.select(PATH$headerSize);
    public static final OfInt LAYOUT$headerVersion = (OfInt) LAYOUT.select(PATH$headerVersion);
    public static final OfInt LAYOUT$vendorID = (OfInt) LAYOUT.select(PATH$vendorID);
    public static final OfInt LAYOUT$deviceID = (OfInt) LAYOUT.select(PATH$deviceID);
    public static final SequenceLayout LAYOUT$pipelineCacheUUID = (SequenceLayout) LAYOUT.select(PATH$pipelineCacheUUID);

    public static final long OFFSET$headerSize = LAYOUT.byteOffset(PATH$headerSize);
    public static final long OFFSET$headerVersion = LAYOUT.byteOffset(PATH$headerVersion);
    public static final long OFFSET$vendorID = LAYOUT.byteOffset(PATH$vendorID);
    public static final long OFFSET$deviceID = LAYOUT.byteOffset(PATH$deviceID);
    public static final long OFFSET$pipelineCacheUUID = LAYOUT.byteOffset(PATH$pipelineCacheUUID);

    public static final long SIZE$headerSize = LAYOUT$headerSize.byteSize();
    public static final long SIZE$headerVersion = LAYOUT$headerVersion.byteSize();
    public static final long SIZE$vendorID = LAYOUT$vendorID.byteSize();
    public static final long SIZE$deviceID = LAYOUT$deviceID.byteSize();
    public static final long SIZE$pipelineCacheUUID = LAYOUT$pipelineCacheUUID.byteSize();

    public VkPipelineCacheHeaderVersionOne(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int headerSize() {
        return segment.get(LAYOUT$headerSize, OFFSET$headerSize);
    }

    public void headerSize(@unsigned int value) {
        segment.set(LAYOUT$headerSize, OFFSET$headerSize, value);
    }

    public @enumtype(VkPipelineCacheHeaderVersion.class) int headerVersion() {
        return segment.get(LAYOUT$headerVersion, OFFSET$headerVersion);
    }

    public void headerVersion(@enumtype(VkPipelineCacheHeaderVersion.class) int value) {
        segment.set(LAYOUT$headerVersion, OFFSET$headerVersion, value);
    }

    public @unsigned int vendorID() {
        return segment.get(LAYOUT$vendorID, OFFSET$vendorID);
    }

    public void vendorID(@unsigned int value) {
        segment.set(LAYOUT$vendorID, OFFSET$vendorID, value);
    }

    public @unsigned int deviceID() {
        return segment.get(LAYOUT$deviceID, OFFSET$deviceID);
    }

    public void deviceID(@unsigned int value) {
        segment.set(LAYOUT$deviceID, OFFSET$deviceID, value);
    }

    public MemorySegment pipelineCacheUUIDRaw() {
        return segment.asSlice(OFFSET$pipelineCacheUUID, SIZE$pipelineCacheUUID);
    }

    public @unsigned ByteBuffer pipelineCacheUUID() {
        return new ByteBuffer(pipelineCacheUUIDRaw());
    }

    public void pipelineCacheUUID(@unsigned ByteBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$pipelineCacheUUID, SIZE$pipelineCacheUUID);
    }

    public static VkPipelineCacheHeaderVersionOne allocate(Arena arena) {
        return new VkPipelineCacheHeaderVersionOne(arena.allocate(LAYOUT));
    }
    
    public static VkPipelineCacheHeaderVersionOne[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineCacheHeaderVersionOne[] ret = new VkPipelineCacheHeaderVersionOne[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPipelineCacheHeaderVersionOne(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
