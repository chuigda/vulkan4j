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

public record VkPhysicalDeviceImageAlignmentControlPropertiesMESA(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$supportedImageAlignmentMask = ValueLayout.JAVA_INT.withName("supportedImageAlignmentMask");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$supportedImageAlignmentMask);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceImageAlignmentControlPropertiesMESA allocate(Arena arena) {
        return new VkPhysicalDeviceImageAlignmentControlPropertiesMESA(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceImageAlignmentControlPropertiesMESA[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceImageAlignmentControlPropertiesMESA[] ret = new VkPhysicalDeviceImageAlignmentControlPropertiesMESA[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceImageAlignmentControlPropertiesMESA(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceImageAlignmentControlPropertiesMESA clone(Arena arena, VkPhysicalDeviceImageAlignmentControlPropertiesMESA src) {
        VkPhysicalDeviceImageAlignmentControlPropertiesMESA ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceImageAlignmentControlPropertiesMESA[] clone(Arena arena, VkPhysicalDeviceImageAlignmentControlPropertiesMESA[] src) {
        VkPhysicalDeviceImageAlignmentControlPropertiesMESA[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$supportedImageAlignmentMask = PathElement.groupElement("PATH$supportedImageAlignmentMask");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$supportedImageAlignmentMask = LAYOUT$supportedImageAlignmentMask.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$supportedImageAlignmentMask = LAYOUT.byteOffset(PATH$supportedImageAlignmentMask);

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

    public @unsigned int supportedImageAlignmentMask() {
        return segment.get(LAYOUT$supportedImageAlignmentMask, OFFSET$supportedImageAlignmentMask);
    }

    public void supportedImageAlignmentMask(@unsigned int value) {
        segment.set(LAYOUT$supportedImageAlignmentMask, OFFSET$supportedImageAlignmentMask, value);
    }

}
/// dummy, not implemented yet
