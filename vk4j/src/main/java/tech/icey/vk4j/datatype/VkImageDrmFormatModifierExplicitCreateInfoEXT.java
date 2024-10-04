package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.vk4j.enumtype.VkStructureType;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.*;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_EXPLICIT_CREATE_INFO_EXT;

/// {@snippet lang=c :
/// typedef struct VkImageDrmFormatModifierExplicitCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     uint64_t drmFormatModifier;
///     uint32_t drmFormatModifierPlaneCount;
///     const VkSubresourceLayout* pPlaneLayouts;
/// } VkImageDrmFormatModifierExplicitCreateInfoEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkImageDrmFormatModifierExplicitCreateInfoEXT.html">VkImageDrmFormatModifierExplicitCreateInfoEXT</a>
public record VkImageDrmFormatModifierExplicitCreateInfoEXT(MemorySegment segment) implements IPointer {
    public VkImageDrmFormatModifierExplicitCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IMAGE_DRM_FORMAT_MODIFIER_EXPLICIT_CREATE_INFO_EXT);
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

    public void pNext(@nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @unsigned long drmFormatModifier() {
        return segment.get(LAYOUT$drmFormatModifier, OFFSET$drmFormatModifier);
    }

    public void drmFormatModifier(@unsigned long value) {
        segment.set(LAYOUT$drmFormatModifier, OFFSET$drmFormatModifier, value);
    }

    public @unsigned int drmFormatModifierPlaneCount() {
        return segment.get(LAYOUT$drmFormatModifierPlaneCount, OFFSET$drmFormatModifierPlaneCount);
    }

    public void drmFormatModifierPlaneCount(@unsigned int value) {
        segment.set(LAYOUT$drmFormatModifierPlaneCount, OFFSET$drmFormatModifierPlaneCount, value);
    }

    public @pointer(comment="VkSubresourceLayout*") MemorySegment pPlaneLayoutsRaw() {
        return segment.get(LAYOUT$pPlaneLayouts, OFFSET$pPlaneLayouts);
    }

    public void pPlaneLayoutsRaw(@pointer(comment="VkSubresourceLayout*") MemorySegment value) {
        segment.set(LAYOUT$pPlaneLayouts, OFFSET$pPlaneLayouts, value);
    }

    public @nullable VkSubresourceLayout pPlaneLayouts() {
        MemorySegment s = pPlaneLayoutsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSubresourceLayout(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkSubresourceLayout[] pPlaneLayouts(int assumedCount) {
        MemorySegment s = pPlaneLayoutsRaw().reinterpret(assumedCount * VkSubresourceLayout.SIZE);
        VkSubresourceLayout[] arr = new VkSubresourceLayout[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkSubresourceLayout(s.asSlice(i * VkSubresourceLayout.SIZE, VkSubresourceLayout.SIZE));
        }
        return arr;
    }

    public void pPlaneLayouts(@nullable VkSubresourceLayout value) {
        pPlaneLayoutsRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public static VkImageDrmFormatModifierExplicitCreateInfoEXT allocate(Arena arena) {
        return new VkImageDrmFormatModifierExplicitCreateInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkImageDrmFormatModifierExplicitCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageDrmFormatModifierExplicitCreateInfoEXT[] ret = new VkImageDrmFormatModifierExplicitCreateInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkImageDrmFormatModifierExplicitCreateInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkImageDrmFormatModifierExplicitCreateInfoEXT clone(Arena arena, VkImageDrmFormatModifierExplicitCreateInfoEXT src) {
        VkImageDrmFormatModifierExplicitCreateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkImageDrmFormatModifierExplicitCreateInfoEXT[] clone(Arena arena, VkImageDrmFormatModifierExplicitCreateInfoEXT[] src) {
        VkImageDrmFormatModifierExplicitCreateInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("drmFormatModifier"),
        ValueLayout.JAVA_INT.withName("drmFormatModifierPlaneCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkSubresourceLayout.LAYOUT).withName("pPlaneLayouts")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$drmFormatModifier = PathElement.groupElement("drmFormatModifier");
    public static final PathElement PATH$drmFormatModifierPlaneCount = PathElement.groupElement("drmFormatModifierPlaneCount");
    public static final PathElement PATH$pPlaneLayouts = PathElement.groupElement("pPlaneLayouts");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$drmFormatModifier = (OfLong) LAYOUT.select(PATH$drmFormatModifier);
    public static final OfInt LAYOUT$drmFormatModifierPlaneCount = (OfInt) LAYOUT.select(PATH$drmFormatModifierPlaneCount);
    public static final AddressLayout LAYOUT$pPlaneLayouts = (AddressLayout) LAYOUT.select(PATH$pPlaneLayouts);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$drmFormatModifier = LAYOUT.byteOffset(PATH$drmFormatModifier);
    public static final long OFFSET$drmFormatModifierPlaneCount = LAYOUT.byteOffset(PATH$drmFormatModifierPlaneCount);
    public static final long OFFSET$pPlaneLayouts = LAYOUT.byteOffset(PATH$pPlaneLayouts);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$drmFormatModifier = LAYOUT$drmFormatModifier.byteSize();
    public static final long SIZE$drmFormatModifierPlaneCount = LAYOUT$drmFormatModifierPlaneCount.byteSize();
    public static final long SIZE$pPlaneLayouts = LAYOUT$pPlaneLayouts.byteSize();
}
