package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkInputAttachmentAspectReference {
///     uint32_t subpass;
///     uint32_t inputAttachmentIndex;
///     VkImageAspectFlags aspectMask;
/// } VkInputAttachmentAspectReference;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkInputAttachmentAspectReference.html">VkInputAttachmentAspectReference</a>
public record VkInputAttachmentAspectReference(MemorySegment segment) implements IPointer {
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

    public static VkInputAttachmentAspectReference allocate(Arena arena) {
        return new VkInputAttachmentAspectReference(arena.allocate(LAYOUT));
    }

    public static VkInputAttachmentAspectReference[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkInputAttachmentAspectReference[] ret = new VkInputAttachmentAspectReference[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkInputAttachmentAspectReference(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkInputAttachmentAspectReference clone(Arena arena, VkInputAttachmentAspectReference src) {
        VkInputAttachmentAspectReference ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkInputAttachmentAspectReference[] clone(Arena arena, VkInputAttachmentAspectReference[] src) {
        VkInputAttachmentAspectReference[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("subpass"),
        ValueLayout.JAVA_INT.withName("inputAttachmentIndex"),
        ValueLayout.JAVA_INT.withName("aspectMask")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$subpass = PathElement.groupElement("subpass");
    public static final PathElement PATH$inputAttachmentIndex = PathElement.groupElement("inputAttachmentIndex");
    public static final PathElement PATH$aspectMask = PathElement.groupElement("aspectMask");

    public static final OfInt LAYOUT$subpass = (OfInt) LAYOUT.select(PATH$subpass);
    public static final OfInt LAYOUT$inputAttachmentIndex = (OfInt) LAYOUT.select(PATH$inputAttachmentIndex);
    public static final OfInt LAYOUT$aspectMask = (OfInt) LAYOUT.select(PATH$aspectMask);

    public static final long OFFSET$subpass = LAYOUT.byteOffset(PATH$subpass);
    public static final long OFFSET$inputAttachmentIndex = LAYOUT.byteOffset(PATH$inputAttachmentIndex);
    public static final long OFFSET$aspectMask = LAYOUT.byteOffset(PATH$aspectMask);

    public static final long SIZE$subpass = LAYOUT$subpass.byteSize();
    public static final long SIZE$inputAttachmentIndex = LAYOUT$inputAttachmentIndex.byteSize();
    public static final long SIZE$aspectMask = LAYOUT$aspectMask.byteSize();
}
