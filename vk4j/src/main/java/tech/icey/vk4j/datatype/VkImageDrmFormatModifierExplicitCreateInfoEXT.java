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

public record VkImageDrmFormatModifierExplicitCreateInfoEXT(MemorySegment segment) {
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

    public void pPlaneLayouts(@nullable VkSubresourceLayout value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPlaneLayoutsRaw(s);
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
}
