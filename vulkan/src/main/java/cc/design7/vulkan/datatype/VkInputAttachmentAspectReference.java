package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

public record VkInputAttachmentAspectReference(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$subpass = ValueLayout.JAVA_INT.withName("subpass");
    public static final OfInt LAYOUT$inputAttachmentIndex = ValueLayout.JAVA_INT.withName("inputAttachmentIndex");
    public static final OfInt LAYOUT$aspectMask = ValueLayout.JAVA_INT.withName("aspectMask");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$subpass, LAYOUT$inputAttachmentIndex, LAYOUT$aspectMask);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkInputAttachmentAspectReference allocate(Arena arena) {
        return new VkInputAttachmentAspectReference(arena.allocate(LAYOUT));
    }

    public static VkInputAttachmentAspectReference[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkInputAttachmentAspectReference[] ret = new VkInputAttachmentAspectReference[count];
        for (int i = 0; i < count; i ++) {
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$subpass = PathElement.groupElement("PATH$subpass");
    public static final PathElement PATH$inputAttachmentIndex = PathElement.groupElement("PATH$inputAttachmentIndex");
    public static final PathElement PATH$aspectMask = PathElement.groupElement("PATH$aspectMask");

    public static final long SIZE$subpass = LAYOUT$subpass.byteSize();
    public static final long SIZE$inputAttachmentIndex = LAYOUT$inputAttachmentIndex.byteSize();
    public static final long SIZE$aspectMask = LAYOUT$aspectMask.byteSize();

    public static final long OFFSET$subpass = LAYOUT.byteOffset(PATH$subpass);
    public static final long OFFSET$inputAttachmentIndex = LAYOUT.byteOffset(PATH$inputAttachmentIndex);
    public static final long OFFSET$aspectMask = LAYOUT.byteOffset(PATH$aspectMask);

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

}
/// dummy, not implemented yet
