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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageViewCreateInfo.html">VkImageViewCreateInfo</a>
@ValueBasedCandidate
public record VkImageViewCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final AddressLayout LAYOUT$image = ValueLayout.ADDRESS.withName("image");
    public static final OfInt LAYOUT$viewType = ValueLayout.JAVA_INT.withName("viewType");
    public static final OfInt LAYOUT$format = ValueLayout.JAVA_INT.withName("format");
    public static final StructLayout LAYOUT$components = VkComponentMapping.LAYOUT.withName("components");
    public static final StructLayout LAYOUT$subresourceRange = VkImageSubresourceRange.LAYOUT.withName("subresourceRange");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$flags, LAYOUT$image, LAYOUT$viewType, LAYOUT$format, LAYOUT$components, LAYOUT$subresourceRange);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkImageViewCreateInfo allocate(Arena arena) {
        return new VkImageViewCreateInfo(arena.allocate(LAYOUT));
    }

    public static VkImageViewCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageViewCreateInfo[] ret = new VkImageViewCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkImageViewCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkImageViewCreateInfo clone(Arena arena, VkImageViewCreateInfo src) {
        VkImageViewCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkImageViewCreateInfo[] clone(Arena arena, VkImageViewCreateInfo[] src) {
        VkImageViewCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$image = PathElement.groupElement("PATH$image");
    public static final PathElement PATH$viewType = PathElement.groupElement("PATH$viewType");
    public static final PathElement PATH$format = PathElement.groupElement("PATH$format");
    public static final PathElement PATH$components = PathElement.groupElement("PATH$components");
    public static final PathElement PATH$subresourceRange = PathElement.groupElement("PATH$subresourceRange");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$image = LAYOUT$image.byteSize();
    public static final long SIZE$viewType = LAYOUT$viewType.byteSize();
    public static final long SIZE$format = LAYOUT$format.byteSize();
    public static final long SIZE$components = LAYOUT$components.byteSize();
    public static final long SIZE$subresourceRange = LAYOUT$subresourceRange.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$image = LAYOUT.byteOffset(PATH$image);
    public static final long OFFSET$viewType = LAYOUT.byteOffset(PATH$viewType);
    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);
    public static final long OFFSET$components = LAYOUT.byteOffset(PATH$components);
    public static final long OFFSET$subresourceRange = LAYOUT.byteOffset(PATH$subresourceRange);

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

    public @Nullable VkImage image() {
        MemorySegment s = segment.asSlice(OFFSET$image, SIZE$image);
        if (s.address() == 0) {
            return null;
        }
        return new VkImage(s);
    }

    public void image(@Nullable VkImage value) {
        segment.set(LAYOUT$image, OFFSET$image, value != null ? value.segment() : MemorySegment.NULL);
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

}
