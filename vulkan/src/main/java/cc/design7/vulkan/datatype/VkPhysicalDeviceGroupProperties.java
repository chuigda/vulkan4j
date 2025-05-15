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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceGroupProperties.html">VkPhysicalDeviceGroupProperties</a>
@ValueBasedCandidate
public record VkPhysicalDeviceGroupProperties(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$physicalDeviceCount = ValueLayout.JAVA_INT.withName("physicalDeviceCount");
    public static final AddressLayout LAYOUT$physicalDevices = ValueLayout.ADDRESS.withName("physicalDevices");
    public static final OfInt LAYOUT$subsetAllocation = ValueLayout.JAVA_INT.withName("subsetAllocation");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$physicalDeviceCount, LAYOUT$physicalDevices, LAYOUT$subsetAllocation);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceGroupProperties allocate(Arena arena) {
        return new VkPhysicalDeviceGroupProperties(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceGroupProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceGroupProperties[] ret = new VkPhysicalDeviceGroupProperties[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceGroupProperties(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceGroupProperties clone(Arena arena, VkPhysicalDeviceGroupProperties src) {
        VkPhysicalDeviceGroupProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceGroupProperties[] clone(Arena arena, VkPhysicalDeviceGroupProperties[] src) {
        VkPhysicalDeviceGroupProperties[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$physicalDeviceCount = PathElement.groupElement("PATH$physicalDeviceCount");
    public static final PathElement PATH$physicalDevices = PathElement.groupElement("PATH$physicalDevices");
    public static final PathElement PATH$subsetAllocation = PathElement.groupElement("PATH$subsetAllocation");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$physicalDeviceCount = LAYOUT$physicalDeviceCount.byteSize();
    public static final long SIZE$physicalDevices = LAYOUT$physicalDevices.byteSize();
    public static final long SIZE$subsetAllocation = LAYOUT$subsetAllocation.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$physicalDeviceCount = LAYOUT.byteOffset(PATH$physicalDeviceCount);
    public static final long OFFSET$physicalDevices = LAYOUT.byteOffset(PATH$physicalDevices);
    public static final long OFFSET$subsetAllocation = LAYOUT.byteOffset(PATH$subsetAllocation);

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

    public @unsigned int physicalDeviceCount() {
        return segment.get(LAYOUT$physicalDeviceCount, OFFSET$physicalDeviceCount);
    }

    public void physicalDeviceCount(@unsigned int value) {
        segment.set(LAYOUT$physicalDeviceCount, OFFSET$physicalDeviceCount, value);
    }

    public @Nullable VkPhysicalDevice physicalDevices() {
        MemorySegment s = segment.asSlice(OFFSET$physicalDevices, SIZE$physicalDevices);
        if (s.address() == 0) {
            return null;
        }
        return new VkPhysicalDevice(s);
    }

    public void physicalDevices() {
        segment.set(LAYOUT$physicalDevices, OFFSET$physicalDevices, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned int subsetAllocation() {
        return segment.get(LAYOUT$subsetAllocation, OFFSET$subsetAllocation);
    }

    public void subsetAllocation(@unsigned int value) {
        segment.set(LAYOUT$subsetAllocation, OFFSET$subsetAllocation, value);
    }

}
