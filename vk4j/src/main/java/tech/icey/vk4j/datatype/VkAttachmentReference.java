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

public record VkAttachmentReference(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("attachment"),
        ValueLayout.JAVA_INT.withName("layout")
    );

    public static final PathElement PATH$attachment = PathElement.groupElement("attachment");
    public static final PathElement PATH$layout = PathElement.groupElement("layout");

    public static final OfInt LAYOUT$attachment = (OfInt) LAYOUT.select(PATH$attachment);
    public static final OfInt LAYOUT$layout = (OfInt) LAYOUT.select(PATH$layout);

    public static final long OFFSET$attachment = LAYOUT.byteOffset(PATH$attachment);
    public static final long OFFSET$layout = LAYOUT.byteOffset(PATH$layout);

    public VkAttachmentReference(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int attachment() {
        return segment.get(LAYOUT$attachment, OFFSET$attachment);
    }

    public void attachment(@unsigned int value) {
        segment.set(LAYOUT$attachment, OFFSET$attachment, value);
    }

    public @enumtype(VkImageLayout.class) int layout() {
        return segment.get(LAYOUT$layout, OFFSET$layout);
    }

    public void layout(@enumtype(VkImageLayout.class) int value) {
        segment.set(LAYOUT$layout, OFFSET$layout, value);
    }


    public static final class VkAttachmentReferenceFactory implements IFactory<VkAttachmentReference> {
        @Override
        public Class<VkAttachmentReference> clazz() {
            return VkAttachmentReference.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkAttachmentReference.LAYOUT;
        }

        @Override
        public VkAttachmentReference create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkAttachmentReference createUninit(MemorySegment segment) {
            return new VkAttachmentReference(segment);
        }
    }

    public static final VkAttachmentReferenceFactory FACTORY = new VkAttachmentReferenceFactory();
}
