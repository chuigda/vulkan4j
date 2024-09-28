package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("attachmentFeedbackLoopLayout")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$attachmentFeedbackLoopLayout = PathElement.groupElement("attachmentFeedbackLoopLayout");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$attachmentFeedbackLoopLayout = (OfInt) LAYOUT.select(PATH$attachmentFeedbackLoopLayout);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$attachmentFeedbackLoopLayout = LAYOUT.byteOffset(PATH$attachmentFeedbackLoopLayout);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$attachmentFeedbackLoopLayout = LAYOUT$attachmentFeedbackLoopLayout.byteSize();

    public VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ATTACHMENT_FEEDBACK_LOOP_LAYOUT_FEATURES_EXT);
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

    public @unsigned int attachmentFeedbackLoopLayout() {
        return segment.get(LAYOUT$attachmentFeedbackLoopLayout, OFFSET$attachmentFeedbackLoopLayout);
    }

    public void attachmentFeedbackLoopLayout(@unsigned int value) {
        segment.set(LAYOUT$attachmentFeedbackLoopLayout, OFFSET$attachmentFeedbackLoopLayout, value);
    }

    public static VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT[] ret = new VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceAttachmentFeedbackLoopLayoutFeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
