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

    public ByteArray layerName() {
        return new ByteArray(layerNameRaw(), LAYOUT$layerName.elementCount());
    }

    public void layerName(ByteArray value) {
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

    public ByteArray description() {
        return new ByteArray(descriptionRaw(), LAYOUT$description.elementCount());
    }

    public void description(ByteArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$description, LAYOUT$description.byteSize());
    }


    public static final class VkLayerPropertiesFactory implements IDataTypeFactory<VkLayerProperties> {
        @Override
        public Class<VkLayerProperties> clazz() {
            return VkLayerProperties.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkLayerProperties.LAYOUT;
        }

        @Override
        public VkLayerProperties create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkLayerProperties createUninit(MemorySegment segment) {
            return new VkLayerProperties(segment);
        }
    }

    public static final VkLayerPropertiesFactory FACTORY = new VkLayerPropertiesFactory();
}
