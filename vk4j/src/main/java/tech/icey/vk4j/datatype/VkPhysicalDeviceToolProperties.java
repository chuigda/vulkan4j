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

public record VkPhysicalDeviceToolProperties(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(VK_MAX_EXTENSION_NAME_SIZE, ValueLayout.JAVA_BYTE).withName("name"),
        MemoryLayout.sequenceLayout(VK_MAX_EXTENSION_NAME_SIZE, ValueLayout.JAVA_BYTE).withName("version"),
        ValueLayout.JAVA_INT.withName("purposes"),
        MemoryLayout.sequenceLayout(VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("description"),
        MemoryLayout.sequenceLayout(VK_MAX_EXTENSION_NAME_SIZE, ValueLayout.JAVA_BYTE).withName("layer")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$name = PathElement.groupElement("name");
    public static final PathElement PATH$version = PathElement.groupElement("version");
    public static final PathElement PATH$purposes = PathElement.groupElement("purposes");
    public static final PathElement PATH$description = PathElement.groupElement("description");
    public static final PathElement PATH$layer = PathElement.groupElement("layer");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final SequenceLayout LAYOUT$name = (SequenceLayout) LAYOUT.select(PATH$name);
    public static final SequenceLayout LAYOUT$version = (SequenceLayout) LAYOUT.select(PATH$version);
    public static final OfInt LAYOUT$purposes = (OfInt) LAYOUT.select(PATH$purposes);
    public static final SequenceLayout LAYOUT$description = (SequenceLayout) LAYOUT.select(PATH$description);
    public static final SequenceLayout LAYOUT$layer = (SequenceLayout) LAYOUT.select(PATH$layer);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$name = LAYOUT.byteOffset(PATH$name);
    public static final long OFFSET$version = LAYOUT.byteOffset(PATH$version);
    public static final long OFFSET$purposes = LAYOUT.byteOffset(PATH$purposes);
    public static final long OFFSET$description = LAYOUT.byteOffset(PATH$description);
    public static final long OFFSET$layer = LAYOUT.byteOffset(PATH$layer);

    public VkPhysicalDeviceToolProperties(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_TOOL_PROPERTIES);
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

    public MemorySegment nameRaw() {
        return segment.asSlice(OFFSET$name, LAYOUT$name.byteSize());
    }

    public ByteArray name() {
        return new ByteArray(nameRaw(), LAYOUT$name.elementCount());
    }

    public void name(ByteArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$name, LAYOUT$name.byteSize());
    }

    public MemorySegment versionRaw() {
        return segment.asSlice(OFFSET$version, LAYOUT$version.byteSize());
    }

    public ByteArray version() {
        return new ByteArray(versionRaw(), LAYOUT$version.elementCount());
    }

    public void version(ByteArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$version, LAYOUT$version.byteSize());
    }

    public @enumtype(VkToolPurposeFlags.class) int purposes() {
        return segment.get(LAYOUT$purposes, OFFSET$purposes);
    }

    public void purposes(@enumtype(VkToolPurposeFlags.class) int value) {
        segment.set(LAYOUT$purposes, OFFSET$purposes, value);
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

    public MemorySegment layerRaw() {
        return segment.asSlice(OFFSET$layer, LAYOUT$layer.byteSize());
    }

    public ByteArray layer() {
        return new ByteArray(layerRaw(), LAYOUT$layer.elementCount());
    }

    public void layer(ByteArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$layer, LAYOUT$layer.byteSize());
    }


    public static final class Factory implements IFactory<VkPhysicalDeviceToolProperties> {
        @Override
        public Class<VkPhysicalDeviceToolProperties> clazz() {
            return VkPhysicalDeviceToolProperties.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceToolProperties.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceToolProperties create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceToolProperties createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceToolProperties(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
