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

public record VkPhysicalDeviceMemoryProperties(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("memoryTypeCount"),
        MemoryLayout.sequenceLayout(VK_MAX_MEMORY_TYPES, VkMemoryType.LAYOUT).withName("memoryTypes"),
        ValueLayout.JAVA_INT.withName("memoryHeapCount"),
        MemoryLayout.sequenceLayout(VK_MAX_MEMORY_HEAPS, VkMemoryHeap.LAYOUT).withName("memoryHeaps")
    );

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
        return segment.asSlice(OFFSET$memoryTypes, LAYOUT$memoryTypes.byteSize());
    }

    public VkMemoryType[] memoryTypes() {
        MemorySegment s = memoryTypesRaw();
        VkMemoryType[] arr = new VkMemoryType[(int)LAYOUT$memoryTypes.elementCount()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new VkMemoryType(s.asSlice(i * LAYOUT$memoryTypes.byteSize(), LAYOUT$memoryTypes.byteSize()));
        }
        return arr;
    }

    public void memoryTypes(VkMemoryType[] value) {
        MemorySegment s = memoryTypesRaw();
        for (int i = 0; i < value.length; i++) {
            MemorySegment.copy(value[i].segment(), 0, s, i * LAYOUT$memoryTypes.byteSize(), LAYOUT$memoryTypes.byteSize());
        }
    }

    public VkMemoryType memoryTypesAt(long index) {
        MemorySegment s = memoryTypesRaw();
        return new VkMemoryType(s.asSlice(index * LAYOUT$memoryTypes.byteSize(), LAYOUT$memoryTypes.byteSize()));
    }

    public void memoryTypesAt(long index, VkMemoryType value) {
        MemorySegment.copy(value.segment(), 0, memoryTypesRaw(), index * LAYOUT$memoryTypes.byteSize(), LAYOUT$memoryTypes.byteSize());
    }

    public @unsigned int memoryHeapCount() {
        return segment.get(LAYOUT$memoryHeapCount, OFFSET$memoryHeapCount);
    }

    public void memoryHeapCount(@unsigned int value) {
        segment.set(LAYOUT$memoryHeapCount, OFFSET$memoryHeapCount, value);
    }

    public MemorySegment memoryHeapsRaw() {
        return segment.asSlice(OFFSET$memoryHeaps, LAYOUT$memoryHeaps.byteSize());
    }

    public VkMemoryHeap[] memoryHeaps() {
        MemorySegment s = memoryHeapsRaw();
        VkMemoryHeap[] arr = new VkMemoryHeap[(int)LAYOUT$memoryHeaps.elementCount()];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new VkMemoryHeap(s.asSlice(i * LAYOUT$memoryHeaps.byteSize(), LAYOUT$memoryHeaps.byteSize()));
        }
        return arr;
    }

    public void memoryHeaps(VkMemoryHeap[] value) {
        MemorySegment s = memoryHeapsRaw();
        for (int i = 0; i < value.length; i++) {
            MemorySegment.copy(value[i].segment(), 0, s, i * LAYOUT$memoryHeaps.byteSize(), LAYOUT$memoryHeaps.byteSize());
        }
    }

    public VkMemoryHeap memoryHeapsAt(long index) {
        MemorySegment s = memoryHeapsRaw();
        return new VkMemoryHeap(s.asSlice(index * LAYOUT$memoryHeaps.byteSize(), LAYOUT$memoryHeaps.byteSize()));
    }

    public void memoryHeapsAt(long index, VkMemoryHeap value) {
        MemorySegment.copy(value.segment(), 0, memoryHeapsRaw(), index * LAYOUT$memoryHeaps.byteSize(), LAYOUT$memoryHeaps.byteSize());
    }

    public static VkPhysicalDeviceMemoryProperties allocate(Arena arena) {
        return new VkPhysicalDeviceMemoryProperties(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceMemoryProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceMemoryProperties[] ret = new VkPhysicalDeviceMemoryProperties[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceMemoryProperties(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}
