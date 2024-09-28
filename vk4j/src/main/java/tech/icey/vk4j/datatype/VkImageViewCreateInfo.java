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
/// typedef struct VkImageViewCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkImageViewCreateFlags flags;
///     VkImage image;
///     VkImageViewType viewType;
///     VkFormat format;
///     VkComponentMapping components;
///     VkImageSubresourceRange subresourceRange;
/// } VkImageViewCreateInfo;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkImageViewCreateInfo.html">VkImageViewCreateInfo</a>
public record VkImageViewCreateInfo(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("image"),
        ValueLayout.JAVA_INT.withName("viewType"),
        ValueLayout.JAVA_INT.withName("format"),
        VkComponentMapping.LAYOUT.withName("components"),
        VkImageSubresourceRange.LAYOUT.withName("subresourceRange")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$image = PathElement.groupElement("image");
    public static final PathElement PATH$viewType = PathElement.groupElement("viewType");
    public static final PathElement PATH$format = PathElement.groupElement("format");
    public static final PathElement PATH$components = PathElement.groupElement("components");
    public static final PathElement PATH$subresourceRange = PathElement.groupElement("subresourceRange");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$image = (AddressLayout) LAYOUT.select(PATH$image);
    public static final OfInt LAYOUT$viewType = (OfInt) LAYOUT.select(PATH$viewType);
    public static final OfInt LAYOUT$format = (OfInt) LAYOUT.select(PATH$format);
    public static final StructLayout LAYOUT$components = (StructLayout) LAYOUT.select(PATH$components);
    public static final StructLayout LAYOUT$subresourceRange = (StructLayout) LAYOUT.select(PATH$subresourceRange);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$image = LAYOUT.byteOffset(PATH$image);
    public static final long OFFSET$viewType = LAYOUT.byteOffset(PATH$viewType);
    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);
    public static final long OFFSET$components = LAYOUT.byteOffset(PATH$components);
    public static final long OFFSET$subresourceRange = LAYOUT.byteOffset(PATH$subresourceRange);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$image = LAYOUT$image.byteSize();
    public static final long SIZE$viewType = LAYOUT$viewType.byteSize();
    public static final long SIZE$format = LAYOUT$format.byteSize();
    public static final long SIZE$components = LAYOUT$components.byteSize();
    public static final long SIZE$subresourceRange = LAYOUT$subresourceRange.byteSize();

    public VkImageViewCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IMAGE_VIEW_CREATE_INFO);
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @enumtype(VkImageViewCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkImageViewCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public VkImage image() {
        return new VkImage(segment.get(LAYOUT$image, OFFSET$image));
    }

    public void image(VkImage value) {
        segment.set(LAYOUT$image, OFFSET$image, value.segment());
    }

    public @enumtype(VkImageViewType.class) int viewType() {
        return segment.get(LAYOUT$viewType, OFFSET$viewType);
    }

    public void viewType(@enumtype(VkImageViewType.class) int value) {
        segment.set(LAYOUT$viewType, OFFSET$viewType, value);
    }

    public @enumtype(VkFormat.class) int format() {
        return segment.get(LAYOUT$format, OFFSET$format);
    }

    public void format(@enumtype(VkFormat.class) int value) {
        segment.set(LAYOUT$format, OFFSET$format, value);
    }

    public VkComponentMapping components() {
        return new VkComponentMapping(segment.asSlice(OFFSET$components, LAYOUT$components));
    }

    public void components(VkComponentMapping value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$components, SIZE$components);
    }

    public VkImageSubresourceRange subresourceRange() {
        return new VkImageSubresourceRange(segment.asSlice(OFFSET$subresourceRange, LAYOUT$subresourceRange));
    }

    public void subresourceRange(VkImageSubresourceRange value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$subresourceRange, SIZE$subresourceRange);
    }

    public static VkImageViewCreateInfo allocate(Arena arena) {
        return new VkImageViewCreateInfo(arena.allocate(LAYOUT));
    }
    
    public static VkImageViewCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageViewCreateInfo[] ret = new VkImageViewCreateInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkImageViewCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
