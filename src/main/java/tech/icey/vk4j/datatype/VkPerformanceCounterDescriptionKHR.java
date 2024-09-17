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

public record VkPerformanceCounterDescriptionKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        MemoryLayout.sequenceLayout(VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("name"),
        MemoryLayout.sequenceLayout(VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("category"),
        MemoryLayout.sequenceLayout(VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("description")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$name = PathElement.groupElement("name");
    public static final PathElement PATH$category = PathElement.groupElement("category");
    public static final PathElement PATH$description = PathElement.groupElement("description");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final SequenceLayout LAYOUT$name = (SequenceLayout) LAYOUT.select(PATH$name);
    public static final SequenceLayout LAYOUT$category = (SequenceLayout) LAYOUT.select(PATH$category);
    public static final SequenceLayout LAYOUT$description = (SequenceLayout) LAYOUT.select(PATH$description);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$name = LAYOUT.byteOffset(PATH$name);
    public static final long OFFSET$category = LAYOUT.byteOffset(PATH$category);
    public static final long OFFSET$description = LAYOUT.byteOffset(PATH$description);

    public VkPerformanceCounterDescriptionKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_KHR);
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

    public @enumtype(VkPerformanceCounterDescriptionFlagsKHR.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkPerformanceCounterDescriptionFlagsKHR.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
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

    public MemorySegment categoryRaw() {
        return segment.asSlice(OFFSET$category, LAYOUT$category.byteSize());
    }

    public ByteArray category() {
        return new ByteArray(categoryRaw(), LAYOUT$category.elementCount());
    }

    public void category(ByteArray value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$category, LAYOUT$category.byteSize());
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


    public static final class VkPerformanceCounterDescriptionKHRFactory implements IDataTypeFactory<VkPerformanceCounterDescriptionKHR> {
        @Override
        public Class<VkPerformanceCounterDescriptionKHR> clazz() {
            return VkPerformanceCounterDescriptionKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPerformanceCounterDescriptionKHR.LAYOUT;
        }

        @Override
        public VkPerformanceCounterDescriptionKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPerformanceCounterDescriptionKHR createUninit(MemorySegment segment) {
            return new VkPerformanceCounterDescriptionKHR(segment);
        }
    }

    public static final VkPerformanceCounterDescriptionKHRFactory FACTORY = new VkPerformanceCounterDescriptionKHRFactory();
}
