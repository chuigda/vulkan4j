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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceMemoryProperties.html">VkPhysicalDeviceMemoryProperties</a>
@ValueBasedCandidate
public record VkPhysicalDeviceMemoryProperties(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$memoryTypeCount = ValueLayout.JAVA_INT.withName("memoryTypeCount");
    public static final StructLayout LAYOUT$memoryTypes = VkMemoryType.LAYOUT.withName("memoryTypes");
    public static final OfInt LAYOUT$memoryHeapCount = ValueLayout.JAVA_INT.withName("memoryHeapCount");
    public static final StructLayout LAYOUT$memoryHeaps = VkMemoryHeap.LAYOUT.withName("memoryHeaps");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$memoryTypeCount, LAYOUT$memoryTypes, LAYOUT$memoryHeapCount, LAYOUT$memoryHeaps);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceMemoryProperties allocate(Arena arena) {
        return new VkPhysicalDeviceMemoryProperties(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceMemoryProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceMemoryProperties[] ret = new VkPhysicalDeviceMemoryProperties[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceMemoryProperties(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceMemoryProperties clone(Arena arena, VkPhysicalDeviceMemoryProperties src) {
        VkPhysicalDeviceMemoryProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceMemoryProperties[] clone(Arena arena, VkPhysicalDeviceMemoryProperties[] src) {
        VkPhysicalDeviceMemoryProperties[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$memoryTypeCount = PathElement.groupElement("PATH$memoryTypeCount");
    public static final PathElement PATH$memoryTypes = PathElement.groupElement("PATH$memoryTypes");
    public static final PathElement PATH$memoryHeapCount = PathElement.groupElement("PATH$memoryHeapCount");
    public static final PathElement PATH$memoryHeaps = PathElement.groupElement("PATH$memoryHeaps");

    public static final long SIZE$memoryTypeCount = LAYOUT$memoryTypeCount.byteSize();
    public static final long SIZE$memoryTypes = LAYOUT$memoryTypes.byteSize();
    public static final long SIZE$memoryHeapCount = LAYOUT$memoryHeapCount.byteSize();
    public static final long SIZE$memoryHeaps = LAYOUT$memoryHeaps.byteSize();

    public static final long OFFSET$memoryTypeCount = LAYOUT.byteOffset(PATH$memoryTypeCount);
    public static final long OFFSET$memoryTypes = LAYOUT.byteOffset(PATH$memoryTypes);
    public static final long OFFSET$memoryHeapCount = LAYOUT.byteOffset(PATH$memoryHeapCount);
    public static final long OFFSET$memoryHeaps = LAYOUT.byteOffset(PATH$memoryHeaps);

    public @unsigned int memoryTypeCount() {
        return segment.get(LAYOUT$memoryTypeCount, OFFSET$memoryTypeCount);
    }

    public void memoryTypeCount(@unsigned int value) {
        segment.set(LAYOUT$memoryTypeCount, OFFSET$memoryTypeCount, value);
    }

    public VkMemoryType memoryTypes() {
        return new VkMemoryType(segment.asSlice(OFFSET$memoryTypes, LAYOUT$memoryTypes));
    }

    public void memoryTypes(VkMemoryType value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$memoryTypes, SIZE$memoryTypes);
    }

    public @unsigned int memoryHeapCount() {
        return segment.get(LAYOUT$memoryHeapCount, OFFSET$memoryHeapCount);
    }

    public void memoryHeapCount(@unsigned int value) {
        segment.set(LAYOUT$memoryHeapCount, OFFSET$memoryHeapCount, value);
    }

    public VkMemoryHeap memoryHeaps() {
        return new VkMemoryHeap(segment.asSlice(OFFSET$memoryHeaps, LAYOUT$memoryHeaps));
    }

    public void memoryHeaps(VkMemoryHeap value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$memoryHeaps, SIZE$memoryHeaps);
    }

}
