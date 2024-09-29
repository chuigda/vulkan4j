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
/// typedef struct VkSparseImageFormatProperties {
///     VkImageAspectFlags aspectMask;
///     VkExtent3D imageGranularity;
///     VkSparseImageFormatFlags flags;
/// } VkSparseImageFormatProperties;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkSparseImageFormatProperties.html">VkSparseImageFormatProperties</a>
public record VkSparseImageFormatProperties(MemorySegment segment) implements IPointer {
    public VkSparseImageFormatProperties(MemorySegment segment) {
        this.segment = segment;
    }

    public @enumtype(VkImageAspectFlags.class) int aspectMask() {
        return segment.get(LAYOUT$aspectMask, OFFSET$aspectMask);
    }

    public void aspectMask(@enumtype(VkImageAspectFlags.class) int value) {
        segment.set(LAYOUT$aspectMask, OFFSET$aspectMask, value);
    }

    public VkExtent3D imageGranularity() {
        return new VkExtent3D(segment.asSlice(OFFSET$imageGranularity, LAYOUT$imageGranularity));
    }

    public void imageGranularity(VkExtent3D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$imageGranularity, SIZE$imageGranularity);
    }

    public @enumtype(VkSparseImageFormatFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkSparseImageFormatFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public static VkSparseImageFormatProperties allocate(Arena arena) {
        return new VkSparseImageFormatProperties(arena.allocate(LAYOUT));
    }
    
    public static VkSparseImageFormatProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSparseImageFormatProperties[] ret = new VkSparseImageFormatProperties[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkSparseImageFormatProperties(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSparseImageFormatProperties clone(Arena arena, VkSparseImageFormatProperties src) {
        VkSparseImageFormatProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSparseImageFormatProperties[] clone(Arena arena, VkSparseImageFormatProperties[] src) {
        VkSparseImageFormatProperties[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("aspectMask"),
        VkExtent3D.LAYOUT.withName("imageGranularity"),
        ValueLayout.JAVA_INT.withName("flags")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$aspectMask = PathElement.groupElement("aspectMask");
    public static final PathElement PATH$imageGranularity = PathElement.groupElement("imageGranularity");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");

    public static final OfInt LAYOUT$aspectMask = (OfInt) LAYOUT.select(PATH$aspectMask);
    public static final StructLayout LAYOUT$imageGranularity = (StructLayout) LAYOUT.select(PATH$imageGranularity);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);

    public static final long OFFSET$aspectMask = LAYOUT.byteOffset(PATH$aspectMask);
    public static final long OFFSET$imageGranularity = LAYOUT.byteOffset(PATH$imageGranularity);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);

    public static final long SIZE$aspectMask = LAYOUT$aspectMask.byteSize();
    public static final long SIZE$imageGranularity = LAYOUT$imageGranularity.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
}
