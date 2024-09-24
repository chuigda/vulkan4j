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

public record VkPipelineExecutablePropertiesKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stages"),
        MemoryLayout.sequenceLayout(VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("name"),
        MemoryLayout.sequenceLayout(VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("description"),
        ValueLayout.JAVA_INT.withName("subgroupSize")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$stages = PathElement.groupElement("stages");
    public static final PathElement PATH$name = PathElement.groupElement("name");
    public static final PathElement PATH$description = PathElement.groupElement("description");
    public static final PathElement PATH$subgroupSize = PathElement.groupElement("subgroupSize");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$stages = (OfInt) LAYOUT.select(PATH$stages);
    public static final SequenceLayout LAYOUT$name = (SequenceLayout) LAYOUT.select(PATH$name);
    public static final SequenceLayout LAYOUT$description = (SequenceLayout) LAYOUT.select(PATH$description);
    public static final OfInt LAYOUT$subgroupSize = (OfInt) LAYOUT.select(PATH$subgroupSize);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$stages = LAYOUT.byteOffset(PATH$stages);
    public static final long OFFSET$name = LAYOUT.byteOffset(PATH$name);
    public static final long OFFSET$description = LAYOUT.byteOffset(PATH$description);
    public static final long OFFSET$subgroupSize = LAYOUT.byteOffset(PATH$subgroupSize);

    public VkPipelineExecutablePropertiesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_PROPERTIES_KHR);
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

    public @enumtype(VkShaderStageFlags.class) int stages() {
        return segment.get(LAYOUT$stages, OFFSET$stages);
    }

    public void stages(@enumtype(VkShaderStageFlags.class) int value) {
        segment.set(LAYOUT$stages, OFFSET$stages, value);
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

    public MemorySegment descriptionRaw() {
        return segment.asSlice(OFFSET$description, LAYOUT$description.byteSize());
    }

    public ByteArray description() {
        return new ByteArray(descriptionRaw(), LAYOUT$description.elementCount());
    }

    public void description(ByteArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$description, LAYOUT$description.byteSize());
    }

    public @unsigned int subgroupSize() {
        return segment.get(LAYOUT$subgroupSize, OFFSET$subgroupSize);
    }

    public void subgroupSize(@unsigned int value) {
        segment.set(LAYOUT$subgroupSize, OFFSET$subgroupSize, value);
    }


    public static final class VkPipelineExecutablePropertiesKHRFactory implements IFactory<VkPipelineExecutablePropertiesKHR> {
        @Override
        public Class<VkPipelineExecutablePropertiesKHR> clazz() {
            return VkPipelineExecutablePropertiesKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPipelineExecutablePropertiesKHR.LAYOUT;
        }

        @Override
        public VkPipelineExecutablePropertiesKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPipelineExecutablePropertiesKHR createUninit(MemorySegment segment) {
            return new VkPipelineExecutablePropertiesKHR(segment);
        }
    }

    public static final VkPipelineExecutablePropertiesKHRFactory FACTORY = new VkPipelineExecutablePropertiesKHRFactory();
}
