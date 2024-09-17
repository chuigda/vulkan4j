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

public record VkInputAttachmentAspectReference(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("subpass"),
        ValueLayout.JAVA_INT.withName("inputAttachmentIndex"),
        ValueLayout.JAVA_INT.withName("aspectMask")
    );

    public static final PathElement PATH$subpass = PathElement.groupElement("subpass");
    public static final PathElement PATH$inputAttachmentIndex = PathElement.groupElement("inputAttachmentIndex");
    public static final PathElement PATH$aspectMask = PathElement.groupElement("aspectMask");

    public static final OfInt LAYOUT$subpass = (OfInt) LAYOUT.select(PATH$subpass);
    public static final OfInt LAYOUT$inputAttachmentIndex = (OfInt) LAYOUT.select(PATH$inputAttachmentIndex);
    public static final OfInt LAYOUT$aspectMask = (OfInt) LAYOUT.select(PATH$aspectMask);

    public static final long OFFSET$subpass = LAYOUT.byteOffset(PATH$subpass);
    public static final long OFFSET$inputAttachmentIndex = LAYOUT.byteOffset(PATH$inputAttachmentIndex);
    public static final long OFFSET$aspectMask = LAYOUT.byteOffset(PATH$aspectMask);

    public VkInputAttachmentAspectReference(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int subpass() {
        return segment.get(LAYOUT$subpass, OFFSET$subpass);
    }

    public void subpass(@unsigned int value) {
        segment.set(LAYOUT$subpass, OFFSET$subpass, value);
    }

    public @unsigned int inputAttachmentIndex() {
        return segment.get(LAYOUT$inputAttachmentIndex, OFFSET$inputAttachmentIndex);
    }

    public void inputAttachmentIndex(@unsigned int value) {
        segment.set(LAYOUT$inputAttachmentIndex, OFFSET$inputAttachmentIndex, value);
    }

    public @enumtype(VkImageAspectFlags.class) int aspectMask() {
        return segment.get(LAYOUT$aspectMask, OFFSET$aspectMask);
    }

    public void aspectMask(@enumtype(VkImageAspectFlags.class) int value) {
        segment.set(LAYOUT$aspectMask, OFFSET$aspectMask, value);
    }


    public static final class VkInputAttachmentAspectReferenceFactory implements IFactory<VkInputAttachmentAspectReference> {
        @Override
        public Class<VkInputAttachmentAspectReference> clazz() {
            return VkInputAttachmentAspectReference.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkInputAttachmentAspectReference.LAYOUT;
        }

        @Override
        public VkInputAttachmentAspectReference create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkInputAttachmentAspectReference createUninit(MemorySegment segment) {
            return new VkInputAttachmentAspectReference(segment);
        }
    }

    public static final VkInputAttachmentAspectReferenceFactory FACTORY = new VkInputAttachmentAspectReferenceFactory();
}
