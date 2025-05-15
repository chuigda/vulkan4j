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

public record VkImageAlignmentControlCreateInfoMESA(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$maximumRequestedAlignment = ValueLayout.JAVA_INT.withName("maximumRequestedAlignment");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$maximumRequestedAlignment);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkImageAlignmentControlCreateInfoMESA allocate(Arena arena) {
        return new VkImageAlignmentControlCreateInfoMESA(arena.allocate(LAYOUT));
    }

    public static VkImageAlignmentControlCreateInfoMESA[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageAlignmentControlCreateInfoMESA[] ret = new VkImageAlignmentControlCreateInfoMESA[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkImageAlignmentControlCreateInfoMESA(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkImageAlignmentControlCreateInfoMESA clone(Arena arena, VkImageAlignmentControlCreateInfoMESA src) {
        VkImageAlignmentControlCreateInfoMESA ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkImageAlignmentControlCreateInfoMESA[] clone(Arena arena, VkImageAlignmentControlCreateInfoMESA[] src) {
        VkImageAlignmentControlCreateInfoMESA[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$maximumRequestedAlignment = PathElement.groupElement("PATH$maximumRequestedAlignment");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maximumRequestedAlignment = LAYOUT$maximumRequestedAlignment.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maximumRequestedAlignment = LAYOUT.byteOffset(PATH$maximumRequestedAlignment);

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

    public @unsigned int maximumRequestedAlignment() {
        return segment.get(LAYOUT$maximumRequestedAlignment, OFFSET$maximumRequestedAlignment);
    }

    public void maximumRequestedAlignment(@unsigned int value) {
        segment.set(LAYOUT$maximumRequestedAlignment, OFFSET$maximumRequestedAlignment, value);
    }

}
/// dummy, not implemented yet
