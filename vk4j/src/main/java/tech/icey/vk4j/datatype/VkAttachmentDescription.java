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

/// {@snippet lang=c :
/// typedef struct VkAttachmentDescription {
///     VkAttachmentDescriptionFlags flags;
///     VkFormat format;
///     VkSampleCountFlagBits samples;
///     VkAttachmentLoadOp loadOp;
///     VkAttachmentStoreOp storeOp;
///     VkAttachmentLoadOp stencilLoadOp;
///     VkAttachmentStoreOp stencilStoreOp;
///     VkImageLayout initialLayout;
///     VkImageLayout finalLayout;
/// } VkAttachmentDescription;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkAttachmentDescription.html">VkAttachmentDescription</a>
public record VkAttachmentDescription(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_INT.withName("samples"),
        ValueLayout.JAVA_INT.withName("loadOp"),
        ValueLayout.JAVA_INT.withName("storeOp"),
        ValueLayout.JAVA_INT.withName("stencilLoadOp"),
        ValueLayout.JAVA_INT.withName("stencilStoreOp"),
        ValueLayout.JAVA_INT.withName("initialLayout"),
        ValueLayout.JAVA_INT.withName("finalLayout")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$format = PathElement.groupElement("format");
    public static final PathElement PATH$samples = PathElement.groupElement("samples");
    public static final PathElement PATH$loadOp = PathElement.groupElement("loadOp");
    public static final PathElement PATH$storeOp = PathElement.groupElement("storeOp");
    public static final PathElement PATH$stencilLoadOp = PathElement.groupElement("stencilLoadOp");
    public static final PathElement PATH$stencilStoreOp = PathElement.groupElement("stencilStoreOp");
    public static final PathElement PATH$initialLayout = PathElement.groupElement("initialLayout");
    public static final PathElement PATH$finalLayout = PathElement.groupElement("finalLayout");

    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$format = (OfInt) LAYOUT.select(PATH$format);
    public static final OfInt LAYOUT$samples = (OfInt) LAYOUT.select(PATH$samples);
    public static final OfInt LAYOUT$loadOp = (OfInt) LAYOUT.select(PATH$loadOp);
    public static final OfInt LAYOUT$storeOp = (OfInt) LAYOUT.select(PATH$storeOp);
    public static final OfInt LAYOUT$stencilLoadOp = (OfInt) LAYOUT.select(PATH$stencilLoadOp);
    public static final OfInt LAYOUT$stencilStoreOp = (OfInt) LAYOUT.select(PATH$stencilStoreOp);
    public static final OfInt LAYOUT$initialLayout = (OfInt) LAYOUT.select(PATH$initialLayout);
    public static final OfInt LAYOUT$finalLayout = (OfInt) LAYOUT.select(PATH$finalLayout);

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);
    public static final long OFFSET$samples = LAYOUT.byteOffset(PATH$samples);
    public static final long OFFSET$loadOp = LAYOUT.byteOffset(PATH$loadOp);
    public static final long OFFSET$storeOp = LAYOUT.byteOffset(PATH$storeOp);
    public static final long OFFSET$stencilLoadOp = LAYOUT.byteOffset(PATH$stencilLoadOp);
    public static final long OFFSET$stencilStoreOp = LAYOUT.byteOffset(PATH$stencilStoreOp);
    public static final long OFFSET$initialLayout = LAYOUT.byteOffset(PATH$initialLayout);
    public static final long OFFSET$finalLayout = LAYOUT.byteOffset(PATH$finalLayout);

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$format = LAYOUT$format.byteSize();
    public static final long SIZE$samples = LAYOUT$samples.byteSize();
    public static final long SIZE$loadOp = LAYOUT$loadOp.byteSize();
    public static final long SIZE$storeOp = LAYOUT$storeOp.byteSize();
    public static final long SIZE$stencilLoadOp = LAYOUT$stencilLoadOp.byteSize();
    public static final long SIZE$stencilStoreOp = LAYOUT$stencilStoreOp.byteSize();
    public static final long SIZE$initialLayout = LAYOUT$initialLayout.byteSize();
    public static final long SIZE$finalLayout = LAYOUT$finalLayout.byteSize();

    public VkAttachmentDescription(MemorySegment segment) {
        this.segment = segment;
    }

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

    public static VkAttachmentDescription allocate(Arena arena) {
        return new VkAttachmentDescription(arena.allocate(LAYOUT));
    }
    
    public static VkAttachmentDescription[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAttachmentDescription[] ret = new VkAttachmentDescription[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkAttachmentDescription(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
