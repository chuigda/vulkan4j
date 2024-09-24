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

public record VkClearAttachment(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("aspectMask"),
        ValueLayout.JAVA_INT.withName("colorAttachment"),
        VkClearValue.LAYOUT.withName("clearValue")
    );

    public static final PathElement PATH$aspectMask = PathElement.groupElement("aspectMask");
    public static final PathElement PATH$colorAttachment = PathElement.groupElement("colorAttachment");
    public static final PathElement PATH$clearValue = PathElement.groupElement("clearValue");

    public static final OfInt LAYOUT$aspectMask = (OfInt) LAYOUT.select(PATH$aspectMask);
    public static final OfInt LAYOUT$colorAttachment = (OfInt) LAYOUT.select(PATH$colorAttachment);
    public static final UnionLayout LAYOUT$clearValue = (UnionLayout) LAYOUT.select(PATH$clearValue);

    public static final long OFFSET$aspectMask = LAYOUT.byteOffset(PATH$aspectMask);
    public static final long OFFSET$colorAttachment = LAYOUT.byteOffset(PATH$colorAttachment);
    public static final long OFFSET$clearValue = LAYOUT.byteOffset(PATH$clearValue);

    public VkClearAttachment(MemorySegment segment) {
        this.segment = segment;
    }

    public @enumtype(VkImageAspectFlags.class) int aspectMask() {
        return segment.get(LAYOUT$aspectMask, OFFSET$aspectMask);
    }

    public void aspectMask(@enumtype(VkImageAspectFlags.class) int value) {
        segment.set(LAYOUT$aspectMask, OFFSET$aspectMask, value);
    }

    public @unsigned int colorAttachment() {
        return segment.get(LAYOUT$colorAttachment, OFFSET$colorAttachment);
    }

    public void colorAttachment(@unsigned int value) {
        segment.set(LAYOUT$colorAttachment, OFFSET$colorAttachment, value);
    }

    public VkClearValue clearValue() {
        return new VkClearValue(segment.asSlice(OFFSET$clearValue, LAYOUT$clearValue));
    }

    public void clearValue(VkClearValue value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$clearValue, LAYOUT$clearValue.byteSize());
    }


    public static final class VkClearAttachmentFactory implements IFactory<VkClearAttachment> {
        @Override
        public Class<VkClearAttachment> clazz() {
            return VkClearAttachment.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkClearAttachment.LAYOUT;
        }

        @Override
        public VkClearAttachment create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkClearAttachment createUninit(MemorySegment segment) {
            return new VkClearAttachment(segment);
        }
    }

    public static final VkClearAttachmentFactory FACTORY = new VkClearAttachmentFactory();
}
