package tech.icey.vk4j.datatype;

import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.annotation.unsigned;
import tech.icey.vk4j.buffer.ByteBuffer;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.Constants.VK_MAX_DESCRIPTION_SIZE;
import static tech.icey.vk4j.Constants.VK_MAX_EXTENSION_NAME_SIZE;

public record VkLayerProperties(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        MemoryLayout.sequenceLayout(VK_MAX_EXTENSION_NAME_SIZE, ValueLayout.JAVA_BYTE).withName("layerName"),
        ValueLayout.JAVA_INT.withName("specVersion"),
        ValueLayout.JAVA_INT.withName("implementationVersion"),
        MemoryLayout.sequenceLayout(VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("description")
    );

    public static final PathElement PATH$layerName = PathElement.groupElement("layerName");
    public static final PathElement PATH$specVersion = PathElement.groupElement("specVersion");
    public static final PathElement PATH$implementationVersion = PathElement.groupElement("implementationVersion");
    public static final PathElement PATH$description = PathElement.groupElement("description");

    public static final SequenceLayout LAYOUT$layerName = (SequenceLayout) LAYOUT.select(PATH$layerName);
    public static final OfInt LAYOUT$specVersion = (OfInt) LAYOUT.select(PATH$specVersion);
    public static final OfInt LAYOUT$implementationVersion = (OfInt) LAYOUT.select(PATH$implementationVersion);
    public static final SequenceLayout LAYOUT$description = (SequenceLayout) LAYOUT.select(PATH$description);

    public static final long OFFSET$layerName = LAYOUT.byteOffset(PATH$layerName);
    public static final long OFFSET$specVersion = LAYOUT.byteOffset(PATH$specVersion);
    public static final long OFFSET$implementationVersion = LAYOUT.byteOffset(PATH$implementationVersion);
    public static final long OFFSET$description = LAYOUT.byteOffset(PATH$description);

    public VkLayerProperties(MemorySegment segment) {
        this.segment = segment;
    }

    public MemorySegment layerNameRaw() {
        return segment.asSlice(OFFSET$layerName, LAYOUT$layerName.byteSize());
    }

    public ByteBuffer layerName() {
        return new ByteBuffer(layerNameRaw());
    }

    public void layerName(ByteBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$layerName, LAYOUT$layerName.byteSize());
    }

    public @unsigned int specVersion() {
        return segment.get(LAYOUT$specVersion, OFFSET$specVersion);
    }

    public void specVersion(@unsigned int value) {
        segment.set(LAYOUT$specVersion, OFFSET$specVersion, value);
    }

    public @unsigned int implementationVersion() {
        return segment.get(LAYOUT$implementationVersion, OFFSET$implementationVersion);
    }

    public void implementationVersion(@unsigned int value) {
        segment.set(LAYOUT$implementationVersion, OFFSET$implementationVersion, value);
    }

    public MemorySegment descriptionRaw() {
        return segment.asSlice(OFFSET$description, LAYOUT$description.byteSize());
    }

    public ByteBuffer description() {
        return new ByteBuffer(descriptionRaw());
    }

    public void description(ByteBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$description, LAYOUT$description.byteSize());
    }

    public static VkLayerProperties allocate(Arena arena) {
        return new VkLayerProperties(arena.allocate(LAYOUT));
    }

    public static VkLayerProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkLayerProperties[] ret = new VkLayerProperties[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkLayerProperties(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}
