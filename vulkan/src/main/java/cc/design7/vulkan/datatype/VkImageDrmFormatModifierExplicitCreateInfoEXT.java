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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageDrmFormatModifierExplicitCreateInfoEXT.html">VkImageDrmFormatModifierExplicitCreateInfoEXT</a>
@ValueBasedCandidate
public record VkImageDrmFormatModifierExplicitCreateInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfLong LAYOUT$drmFormatModifier = ValueLayout.JAVA_LONG.withName("drmFormatModifier");
    public static final OfInt LAYOUT$drmFormatModifierPlaneCount = ValueLayout.JAVA_INT.withName("drmFormatModifierPlaneCount");
    public static final AddressLayout LAYOUT$pPlaneLayouts = ValueLayout.ADDRESS.withTargetLayout(VkSubresourceLayout.LAYOUT).withName("pPlaneLayouts");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$drmFormatModifier, LAYOUT$drmFormatModifierPlaneCount, LAYOUT$pPlaneLayouts);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkImageDrmFormatModifierExplicitCreateInfoEXT allocate(Arena arena) {
        return new VkImageDrmFormatModifierExplicitCreateInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkImageDrmFormatModifierExplicitCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageDrmFormatModifierExplicitCreateInfoEXT[] ret = new VkImageDrmFormatModifierExplicitCreateInfoEXT[count];
        for (int i = 0; i < count; i ++) {
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$drmFormatModifier = PathElement.groupElement("PATH$drmFormatModifier");
    public static final PathElement PATH$drmFormatModifierPlaneCount = PathElement.groupElement("PATH$drmFormatModifierPlaneCount");
    public static final PathElement PATH$pPlaneLayouts = PathElement.groupElement("PATH$pPlaneLayouts");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$drmFormatModifier = LAYOUT$drmFormatModifier.byteSize();
    public static final long SIZE$drmFormatModifierPlaneCount = LAYOUT$drmFormatModifierPlaneCount.byteSize();
    public static final long SIZE$pPlaneLayouts = LAYOUT$pPlaneLayouts.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$drmFormatModifier = LAYOUT.byteOffset(PATH$drmFormatModifier);
    public static final long OFFSET$drmFormatModifierPlaneCount = LAYOUT.byteOffset(PATH$drmFormatModifierPlaneCount);
    public static final long OFFSET$pPlaneLayouts = LAYOUT.byteOffset(PATH$pPlaneLayouts);

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

    public @Nullable VkSubresourceLayout pPlaneLayouts() {
        MemorySegment s = pPlaneLayoutsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSubresourceLayout(s);
    }

    public void pPlaneLayouts(@Nullable VkSubresourceLayout value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPlaneLayoutsRaw(s);
    }

    @unsafe public @Nullable VkSubresourceLayout[] pPlaneLayouts(int assumedCount) {
        MemorySegment s = pPlaneLayoutsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkSubresourceLayout.SIZE);
        VkSubresourceLayout[] ret = new VkSubresourceLayout[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkSubresourceLayout(s.asSlice(i * VkSubresourceLayout.SIZE, VkSubresourceLayout.SIZE));
        }
        return ret;
    }

}
