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

public record VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$swapchainMaintenance1 = ValueLayout.JAVA_INT.withName("swapchainMaintenance1");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$swapchainMaintenance1);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT[] ret = new VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT clone(Arena arena, VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT src) {
        VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT[] clone(Arena arena, VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT[] src) {
        VkPhysicalDeviceSwapchainMaintenance1FeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$swapchainMaintenance1 = PathElement.groupElement("PATH$swapchainMaintenance1");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$swapchainMaintenance1 = LAYOUT$swapchainMaintenance1.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$swapchainMaintenance1 = LAYOUT.byteOffset(PATH$swapchainMaintenance1);

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

    public @unsigned int swapchainMaintenance1() {
        return segment.get(LAYOUT$swapchainMaintenance1, OFFSET$swapchainMaintenance1);
    }

    public void swapchainMaintenance1(@unsigned int value) {
        segment.set(LAYOUT$swapchainMaintenance1, OFFSET$swapchainMaintenance1, value);
    }

}
/// dummy, not implemented yet
