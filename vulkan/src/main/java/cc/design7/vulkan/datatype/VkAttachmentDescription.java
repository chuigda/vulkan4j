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

public record VkAttachmentDescription(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final OfInt LAYOUT$format = ValueLayout.JAVA_INT.withName("format");
    public static final OfInt LAYOUT$samples = ValueLayout.JAVA_INT.withName("samples");
    public static final OfInt LAYOUT$loadOp = ValueLayout.JAVA_INT.withName("loadOp");
    public static final OfInt LAYOUT$storeOp = ValueLayout.JAVA_INT.withName("storeOp");
    public static final OfInt LAYOUT$stencilLoadOp = ValueLayout.JAVA_INT.withName("stencilLoadOp");
    public static final OfInt LAYOUT$stencilStoreOp = ValueLayout.JAVA_INT.withName("stencilStoreOp");
    public static final OfInt LAYOUT$initialLayout = ValueLayout.JAVA_INT.withName("initialLayout");
    public static final OfInt LAYOUT$finalLayout = ValueLayout.JAVA_INT.withName("finalLayout");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$flags, LAYOUT$format, LAYOUT$samples, LAYOUT$loadOp, LAYOUT$storeOp, LAYOUT$stencilLoadOp, LAYOUT$stencilStoreOp, LAYOUT$initialLayout, LAYOUT$finalLayout);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkAttachmentDescription allocate(Arena arena) {
        return new VkAttachmentDescription(arena.allocate(LAYOUT));
    }

    public static VkAttachmentDescription[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAttachmentDescription[] ret = new VkAttachmentDescription[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkAttachmentDescription(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkAttachmentDescription clone(Arena arena, VkAttachmentDescription src) {
        VkAttachmentDescription ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAttachmentDescription[] clone(Arena arena, VkAttachmentDescription[] src) {
        VkAttachmentDescription[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$format = PathElement.groupElement("PATH$format");
    public static final PathElement PATH$samples = PathElement.groupElement("PATH$samples");
    public static final PathElement PATH$loadOp = PathElement.groupElement("PATH$loadOp");
    public static final PathElement PATH$storeOp = PathElement.groupElement("PATH$storeOp");
    public static final PathElement PATH$stencilLoadOp = PathElement.groupElement("PATH$stencilLoadOp");
    public static final PathElement PATH$stencilStoreOp = PathElement.groupElement("PATH$stencilStoreOp");
    public static final PathElement PATH$initialLayout = PathElement.groupElement("PATH$initialLayout");
    public static final PathElement PATH$finalLayout = PathElement.groupElement("PATH$finalLayout");

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$format = LAYOUT$format.byteSize();
    public static final long SIZE$samples = LAYOUT$samples.byteSize();
    public static final long SIZE$loadOp = LAYOUT$loadOp.byteSize();
    public static final long SIZE$storeOp = LAYOUT$storeOp.byteSize();
    public static final long SIZE$stencilLoadOp = LAYOUT$stencilLoadOp.byteSize();
    public static final long SIZE$stencilStoreOp = LAYOUT$stencilStoreOp.byteSize();
    public static final long SIZE$initialLayout = LAYOUT$initialLayout.byteSize();
    public static final long SIZE$finalLayout = LAYOUT$finalLayout.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);
    public static final long OFFSET$samples = LAYOUT.byteOffset(PATH$samples);
    public static final long OFFSET$loadOp = LAYOUT.byteOffset(PATH$loadOp);
    public static final long OFFSET$storeOp = LAYOUT.byteOffset(PATH$storeOp);
    public static final long OFFSET$stencilLoadOp = LAYOUT.byteOffset(PATH$stencilLoadOp);
    public static final long OFFSET$stencilStoreOp = LAYOUT.byteOffset(PATH$stencilStoreOp);
    public static final long OFFSET$initialLayout = LAYOUT.byteOffset(PATH$initialLayout);
    public static final long OFFSET$finalLayout = LAYOUT.byteOffset(PATH$finalLayout);

    public @enumtype(VkAttachmentDescriptionFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkAttachmentDescriptionFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @enumtype(VkFormat.class) int format() {
        return segment.get(LAYOUT$format, OFFSET$format);
    }

    public void format(@enumtype(VkFormat.class) int value) {
        segment.set(LAYOUT$format, OFFSET$format, value);
    }

    public @enumtype(VkSampleCountFlags.class) int samples() {
        return segment.get(LAYOUT$samples, OFFSET$samples);
    }

    public void samples(@enumtype(VkSampleCountFlags.class) int value) {
        segment.set(LAYOUT$samples, OFFSET$samples, value);
    }

    public @enumtype(VkAttachmentLoadOp.class) int loadOp() {
        return segment.get(LAYOUT$loadOp, OFFSET$loadOp);
    }

    public void loadOp(@enumtype(VkAttachmentLoadOp.class) int value) {
        segment.set(LAYOUT$loadOp, OFFSET$loadOp, value);
    }

    public @enumtype(VkAttachmentStoreOp.class) int storeOp() {
        return segment.get(LAYOUT$storeOp, OFFSET$storeOp);
    }

    public void storeOp(@enumtype(VkAttachmentStoreOp.class) int value) {
        segment.set(LAYOUT$storeOp, OFFSET$storeOp, value);
    }

    public @enumtype(VkAttachmentLoadOp.class) int stencilLoadOp() {
        return segment.get(LAYOUT$stencilLoadOp, OFFSET$stencilLoadOp);
    }

    public void stencilLoadOp(@enumtype(VkAttachmentLoadOp.class) int value) {
        segment.set(LAYOUT$stencilLoadOp, OFFSET$stencilLoadOp, value);
    }

    public @enumtype(VkAttachmentStoreOp.class) int stencilStoreOp() {
        return segment.get(LAYOUT$stencilStoreOp, OFFSET$stencilStoreOp);
    }

    public void stencilStoreOp(@enumtype(VkAttachmentStoreOp.class) int value) {
        segment.set(LAYOUT$stencilStoreOp, OFFSET$stencilStoreOp, value);
    }

    public @enumtype(VkImageLayout.class) int initialLayout() {
        return segment.get(LAYOUT$initialLayout, OFFSET$initialLayout);
    }

    public void initialLayout(@enumtype(VkImageLayout.class) int value) {
        segment.set(LAYOUT$initialLayout, OFFSET$initialLayout, value);
    }

    public @enumtype(VkImageLayout.class) int finalLayout() {
        return segment.get(LAYOUT$finalLayout, OFFSET$finalLayout);
    }

    public void finalLayout(@enumtype(VkImageLayout.class) int value) {
        segment.set(LAYOUT$finalLayout, OFFSET$finalLayout, value);
    }

}
/// dummy, not implemented yet
