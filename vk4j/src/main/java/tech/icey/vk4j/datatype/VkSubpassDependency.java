package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkSubpassDependency(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("srcSubpass"),
        ValueLayout.JAVA_INT.withName("dstSubpass"),
        ValueLayout.JAVA_INT.withName("srcStageMask"),
        ValueLayout.JAVA_INT.withName("dstStageMask"),
        ValueLayout.JAVA_INT.withName("srcAccessMask"),
        ValueLayout.JAVA_INT.withName("dstAccessMask"),
        ValueLayout.JAVA_INT.withName("dependencyFlags")
    );

    public static final PathElement PATH$srcSubpass = PathElement.groupElement("srcSubpass");
    public static final PathElement PATH$dstSubpass = PathElement.groupElement("dstSubpass");
    public static final PathElement PATH$srcStageMask = PathElement.groupElement("srcStageMask");
    public static final PathElement PATH$dstStageMask = PathElement.groupElement("dstStageMask");
    public static final PathElement PATH$srcAccessMask = PathElement.groupElement("srcAccessMask");
    public static final PathElement PATH$dstAccessMask = PathElement.groupElement("dstAccessMask");
    public static final PathElement PATH$dependencyFlags = PathElement.groupElement("dependencyFlags");

    public static final OfInt LAYOUT$srcSubpass = (OfInt) LAYOUT.select(PATH$srcSubpass);
    public static final OfInt LAYOUT$dstSubpass = (OfInt) LAYOUT.select(PATH$dstSubpass);
    public static final OfInt LAYOUT$srcStageMask = (OfInt) LAYOUT.select(PATH$srcStageMask);
    public static final OfInt LAYOUT$dstStageMask = (OfInt) LAYOUT.select(PATH$dstStageMask);
    public static final OfInt LAYOUT$srcAccessMask = (OfInt) LAYOUT.select(PATH$srcAccessMask);
    public static final OfInt LAYOUT$dstAccessMask = (OfInt) LAYOUT.select(PATH$dstAccessMask);
    public static final OfInt LAYOUT$dependencyFlags = (OfInt) LAYOUT.select(PATH$dependencyFlags);

    public static final long OFFSET$srcSubpass = LAYOUT.byteOffset(PATH$srcSubpass);
    public static final long OFFSET$dstSubpass = LAYOUT.byteOffset(PATH$dstSubpass);
    public static final long OFFSET$srcStageMask = LAYOUT.byteOffset(PATH$srcStageMask);
    public static final long OFFSET$dstStageMask = LAYOUT.byteOffset(PATH$dstStageMask);
    public static final long OFFSET$srcAccessMask = LAYOUT.byteOffset(PATH$srcAccessMask);
    public static final long OFFSET$dstAccessMask = LAYOUT.byteOffset(PATH$dstAccessMask);
    public static final long OFFSET$dependencyFlags = LAYOUT.byteOffset(PATH$dependencyFlags);

    public VkSubpassDependency(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int srcSubpass() {
        return segment.get(LAYOUT$srcSubpass, OFFSET$srcSubpass);
    }

    public void srcSubpass(@unsigned int value) {
        segment.set(LAYOUT$srcSubpass, OFFSET$srcSubpass, value);
    }

    public @unsigned int dstSubpass() {
        return segment.get(LAYOUT$dstSubpass, OFFSET$dstSubpass);
    }

    public void dstSubpass(@unsigned int value) {
        segment.set(LAYOUT$dstSubpass, OFFSET$dstSubpass, value);
    }

    public @enumtype(VkPipelineStageFlags.class) int srcStageMask() {
        return segment.get(LAYOUT$srcStageMask, OFFSET$srcStageMask);
    }

    public void srcStageMask(@enumtype(VkPipelineStageFlags.class) int value) {
        segment.set(LAYOUT$srcStageMask, OFFSET$srcStageMask, value);
    }

    public @enumtype(VkPipelineStageFlags.class) int dstStageMask() {
        return segment.get(LAYOUT$dstStageMask, OFFSET$dstStageMask);
    }

    public void dstStageMask(@enumtype(VkPipelineStageFlags.class) int value) {
        segment.set(LAYOUT$dstStageMask, OFFSET$dstStageMask, value);
    }

    public @enumtype(VkAccessFlags.class) int srcAccessMask() {
        return segment.get(LAYOUT$srcAccessMask, OFFSET$srcAccessMask);
    }

    public void srcAccessMask(@enumtype(VkAccessFlags.class) int value) {
        segment.set(LAYOUT$srcAccessMask, OFFSET$srcAccessMask, value);
    }

    public @enumtype(VkAccessFlags.class) int dstAccessMask() {
        return segment.get(LAYOUT$dstAccessMask, OFFSET$dstAccessMask);
    }

    public void dstAccessMask(@enumtype(VkAccessFlags.class) int value) {
        segment.set(LAYOUT$dstAccessMask, OFFSET$dstAccessMask, value);
    }

    public @enumtype(VkDependencyFlags.class) int dependencyFlags() {
        return segment.get(LAYOUT$dependencyFlags, OFFSET$dependencyFlags);
    }

    public void dependencyFlags(@enumtype(VkDependencyFlags.class) int value) {
        segment.set(LAYOUT$dependencyFlags, OFFSET$dependencyFlags, value);
    }

    public static VkSubpassDependency allocate(Arena arena) {
        return new VkSubpassDependency(arena.allocate(LAYOUT));
    }
    
    public static VkSubpassDependency[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSubpassDependency[] ret = new VkSubpassDependency[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkSubpassDependency(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}
