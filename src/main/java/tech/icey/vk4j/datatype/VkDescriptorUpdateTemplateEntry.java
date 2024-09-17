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

public record VkDescriptorUpdateTemplateEntry(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("dstBinding"),
        ValueLayout.JAVA_INT.withName("dstArrayElement"),
        ValueLayout.JAVA_INT.withName("descriptorCount"),
        ValueLayout.JAVA_INT.withName("descriptorType"),
        NativeLayout.C_SIZE_T.withName("offset"),
        NativeLayout.C_SIZE_T.withName("stride")
    );

    public static final PathElement PATH$dstBinding = PathElement.groupElement("dstBinding");
    public static final PathElement PATH$dstArrayElement = PathElement.groupElement("dstArrayElement");
    public static final PathElement PATH$descriptorCount = PathElement.groupElement("descriptorCount");
    public static final PathElement PATH$descriptorType = PathElement.groupElement("descriptorType");
    public static final PathElement PATH$offset = PathElement.groupElement("offset");
    public static final PathElement PATH$stride = PathElement.groupElement("stride");

    public static final OfInt LAYOUT$dstBinding = (OfInt) LAYOUT.select(PATH$dstBinding);
    public static final OfInt LAYOUT$dstArrayElement = (OfInt) LAYOUT.select(PATH$dstArrayElement);
    public static final OfInt LAYOUT$descriptorCount = (OfInt) LAYOUT.select(PATH$descriptorCount);
    public static final OfInt LAYOUT$descriptorType = (OfInt) LAYOUT.select(PATH$descriptorType);

    public static final long OFFSET$dstBinding = LAYOUT.byteOffset(PATH$dstBinding);
    public static final long OFFSET$dstArrayElement = LAYOUT.byteOffset(PATH$dstArrayElement);
    public static final long OFFSET$descriptorCount = LAYOUT.byteOffset(PATH$descriptorCount);
    public static final long OFFSET$descriptorType = LAYOUT.byteOffset(PATH$descriptorType);
    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);
    public static final long OFFSET$stride = LAYOUT.byteOffset(PATH$stride);

    public VkDescriptorUpdateTemplateEntry(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int dstBinding() {
        return segment.get(LAYOUT$dstBinding, OFFSET$dstBinding);
    }

    public void dstBinding(@unsigned int value) {
        segment.set(LAYOUT$dstBinding, OFFSET$dstBinding, value);
    }

    public @unsigned int dstArrayElement() {
        return segment.get(LAYOUT$dstArrayElement, OFFSET$dstArrayElement);
    }

    public void dstArrayElement(@unsigned int value) {
        segment.set(LAYOUT$dstArrayElement, OFFSET$dstArrayElement, value);
    }

    public @unsigned int descriptorCount() {
        return segment.get(LAYOUT$descriptorCount, OFFSET$descriptorCount);
    }

    public void descriptorCount(@unsigned int value) {
        segment.set(LAYOUT$descriptorCount, OFFSET$descriptorCount, value);
    }

    public @enumtype(VkDescriptorType.class) int descriptorType() {
        return segment.get(LAYOUT$descriptorType, OFFSET$descriptorType);
    }

    public void descriptorType(@enumtype(VkDescriptorType.class) int value) {
        segment.set(LAYOUT$descriptorType, OFFSET$descriptorType, value);
    }

    public @unsigned long offset() {
            return NativeLayout.readCSizeT(segment, OFFSET$offset);
        }
    
        public void offset(@unsigned long value) {
            NativeLayout.writeCSizeT(segment, OFFSET$offset, value);
        }

    public @unsigned long stride() {
            return NativeLayout.readCSizeT(segment, OFFSET$stride);
        }
    
        public void stride(@unsigned long value) {
            NativeLayout.writeCSizeT(segment, OFFSET$stride, value);
        }


    public static final class VkDescriptorUpdateTemplateEntryFactory implements IDataTypeFactory<VkDescriptorUpdateTemplateEntry> {
        @Override
        public Class<VkDescriptorUpdateTemplateEntry> clazz() {
            return VkDescriptorUpdateTemplateEntry.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkDescriptorUpdateTemplateEntry.LAYOUT;
        }

        @Override
        public VkDescriptorUpdateTemplateEntry create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkDescriptorUpdateTemplateEntry createUninit(MemorySegment segment) {
            return new VkDescriptorUpdateTemplateEntry(segment);
        }
    }

    public static final VkDescriptorUpdateTemplateEntryFactory FACTORY = new VkDescriptorUpdateTemplateEntryFactory();
}
