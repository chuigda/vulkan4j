package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.unsigned;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.Constants.VK_MAX_MEMORY_HEAPS;
import static tech.icey.vk4j.Constants.VK_MAX_MEMORY_TYPES;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceMemoryProperties {
///     uint32_t memoryTypeCount;
///     VkMemoryType memoryTypes[VK_MAX_MEMORY_TYPES];
///     uint32_t memoryHeapCount;
///     VkMemoryHeap memoryHeaps[VK_MAX_MEMORY_HEAPS];
/// } VkPhysicalDeviceMemoryProperties;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceMemoryProperties.html">VkPhysicalDeviceMemoryProperties</a>
public record VkPhysicalDeviceMemoryProperties(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceMemoryProperties(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int memoryTypeCount() {
        return segment.get(LAYOUT$memoryTypeCount, OFFSET$memoryTypeCount);
    }

    public void memoryTypeCount(@unsigned int value) {
        segment.set(LAYOUT$memoryTypeCount, OFFSET$memoryTypeCount, value);
    }

    public MemorySegment memoryTypesRaw() {
        return segment.asSlice(OFFSET$memoryTypes, SIZE$memoryTypes);
    }

    public VkMemoryType[] memoryTypes() {
        MemorySegment s = memoryTypesRaw();
        VkMemoryType[] arr = new VkMemoryType[(int)LAYOUT$memoryTypes.elementCount()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new VkMemoryType(s.asSlice(i * VkMemoryType.SIZE, VkMemoryType.SIZE));
        }
        return arr;
    }

    public void memoryTypes(VkMemoryType[] value) {
        MemorySegment s = memoryTypesRaw();
        for (int i = 0; i < value.length; i++) {
            MemorySegment.copy(value[i].segment(), 0, s, i * VkMemoryType.SIZE, VkMemoryType.SIZE);
        }
    }

    public VkMemoryType memoryTypesAt(long index) {
        MemorySegment s = memoryTypesRaw();
        return new VkMemoryType(s.asSlice(index * VkMemoryType.SIZE, VkMemoryType.SIZE));
    }

    public void memoryTypesAt(long index, VkMemoryType value) {
        MemorySegment s = memoryTypesRaw();
        MemorySegment.copy(value.segment(), 0, s, index * VkMemoryType.SIZE, VkMemoryType.SIZE);
    }

    public @unsigned int memoryHeapCount() {
        return segment.get(LAYOUT$memoryHeapCount, OFFSET$memoryHeapCount);
    }

    public void memoryHeapCount(@unsigned int value) {
        segment.set(LAYOUT$memoryHeapCount, OFFSET$memoryHeapCount, value);
    }

    public MemorySegment memoryHeapsRaw() {
        return segment.asSlice(OFFSET$memoryHeaps, SIZE$memoryHeaps);
    }

    public VkMemoryHeap[] memoryHeaps() {
        MemorySegment s = memoryHeapsRaw();
        VkMemoryHeap[] arr = new VkMemoryHeap[(int)LAYOUT$memoryHeaps.elementCount()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new VkMemoryHeap(s.asSlice(i * VkMemoryHeap.SIZE, VkMemoryHeap.SIZE));
        }
        return arr;
    }

    public void memoryHeaps(VkMemoryHeap[] value) {
        MemorySegment s = memoryHeapsRaw();
        for (int i = 0; i < value.length; i++) {
            MemorySegment.copy(value[i].segment(), 0, s, i * VkMemoryHeap.SIZE, VkMemoryHeap.SIZE);
        }
    }

    public VkMemoryHeap memoryHeapsAt(long index) {
        MemorySegment s = memoryHeapsRaw();
        return new VkMemoryHeap(s.asSlice(index * VkMemoryHeap.SIZE, VkMemoryHeap.SIZE));
    }

    public void memoryHeapsAt(long index, VkMemoryHeap value) {
        MemorySegment s = memoryHeapsRaw();
        MemorySegment.copy(value.segment(), 0, s, index * VkMemoryHeap.SIZE, VkMemoryHeap.SIZE);
    }

    public static VkPhysicalDeviceMemoryProperties allocate(Arena arena) {
        return new VkPhysicalDeviceMemoryProperties(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceMemoryProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceMemoryProperties[] ret = new VkPhysicalDeviceMemoryProperties[count];
        for (int i = 0; i < count; i++) {
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("memoryTypeCount"),
        MemoryLayout.sequenceLayout(VK_MAX_MEMORY_TYPES, VkMemoryType.LAYOUT).withName("memoryTypes"),
        ValueLayout.JAVA_INT.withName("memoryHeapCount"),
        MemoryLayout.sequenceLayout(VK_MAX_MEMORY_HEAPS, VkMemoryHeap.LAYOUT).withName("memoryHeaps")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$memoryTypeCount = PathElement.groupElement("memoryTypeCount");
    public static final PathElement PATH$memoryTypes = PathElement.groupElement("memoryTypes");
    public static final PathElement PATH$memoryHeapCount = PathElement.groupElement("memoryHeapCount");
    public static final PathElement PATH$memoryHeaps = PathElement.groupElement("memoryHeaps");

    public static final OfInt LAYOUT$memoryTypeCount = (OfInt) LAYOUT.select(PATH$memoryTypeCount);
    public static final SequenceLayout LAYOUT$memoryTypes = (SequenceLayout) LAYOUT.select(PATH$memoryTypes);
    public static final OfInt LAYOUT$memoryHeapCount = (OfInt) LAYOUT.select(PATH$memoryHeapCount);
    public static final SequenceLayout LAYOUT$memoryHeaps = (SequenceLayout) LAYOUT.select(PATH$memoryHeaps);

    public static final long OFFSET$memoryTypeCount = LAYOUT.byteOffset(PATH$memoryTypeCount);
    public static final long OFFSET$memoryTypes = LAYOUT.byteOffset(PATH$memoryTypes);
    public static final long OFFSET$memoryHeapCount = LAYOUT.byteOffset(PATH$memoryHeapCount);
    public static final long OFFSET$memoryHeaps = LAYOUT.byteOffset(PATH$memoryHeaps);

    public static final long SIZE$memoryTypeCount = LAYOUT$memoryTypeCount.byteSize();
    public static final long SIZE$memoryTypes = LAYOUT$memoryTypes.byteSize();
    public static final long SIZE$memoryHeapCount = LAYOUT$memoryHeapCount.byteSize();
    public static final long SIZE$memoryHeaps = LAYOUT$memoryHeaps.byteSize();
}
