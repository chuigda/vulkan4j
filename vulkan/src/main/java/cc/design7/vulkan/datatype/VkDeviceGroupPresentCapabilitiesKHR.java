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

public record VkDeviceGroupPresentCapabilitiesKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$presentMask = ValueLayout.JAVA_INT.withName("presentMask");
    public static final OfInt LAYOUT$modes = ValueLayout.JAVA_INT.withName("modes");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$presentMask, LAYOUT$modes);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkDeviceGroupPresentCapabilitiesKHR allocate(Arena arena) {
        return new VkDeviceGroupPresentCapabilitiesKHR(arena.allocate(LAYOUT));
    }

    public static VkDeviceGroupPresentCapabilitiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceGroupPresentCapabilitiesKHR[] ret = new VkDeviceGroupPresentCapabilitiesKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDeviceGroupPresentCapabilitiesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDeviceGroupPresentCapabilitiesKHR clone(Arena arena, VkDeviceGroupPresentCapabilitiesKHR src) {
        VkDeviceGroupPresentCapabilitiesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDeviceGroupPresentCapabilitiesKHR[] clone(Arena arena, VkDeviceGroupPresentCapabilitiesKHR[] src) {
        VkDeviceGroupPresentCapabilitiesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$presentMask = PathElement.groupElement("PATH$presentMask");
    public static final PathElement PATH$modes = PathElement.groupElement("PATH$modes");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$presentMask = LAYOUT$presentMask.byteSize();
    public static final long SIZE$modes = LAYOUT$modes.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$presentMask = LAYOUT.byteOffset(PATH$presentMask);
    public static final long OFFSET$modes = LAYOUT.byteOffset(PATH$modes);

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

    public @unsigned int presentMask() {
        return segment.get(LAYOUT$presentMask, OFFSET$presentMask);
    }

    public void presentMask(@unsigned int value) {
        segment.set(LAYOUT$presentMask, OFFSET$presentMask, value);
    }

    public @enumtype(VkDeviceGroupPresentModeFlagsKHR.class) int modes() {
        return segment.get(LAYOUT$modes, OFFSET$modes);
    }

    public void modes(@enumtype(VkDeviceGroupPresentModeFlagsKHR.class) int value) {
        segment.set(LAYOUT$modes, OFFSET$modes, value);
    }

}
/// dummy, not implemented yet
