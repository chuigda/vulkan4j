package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkSpecializationInfo.html">VkSpecializationInfo</a>
public record VkSpecializationInfo(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("mapEntryCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkSpecializationMapEntry.LAYOUT).withName("pMapEntries"),
        NativeLayout.C_SIZE_T.withName("dataSize"),
        ValueLayout.ADDRESS.withName("pData")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$mapEntryCount = PathElement.groupElement("mapEntryCount");
    public static final PathElement PATH$pMapEntries = PathElement.groupElement("pMapEntries");
    public static final PathElement PATH$dataSize = PathElement.groupElement("dataSize");
    public static final PathElement PATH$pData = PathElement.groupElement("pData");

    public static final OfInt LAYOUT$mapEntryCount = (OfInt) LAYOUT.select(PATH$mapEntryCount);
    public static final AddressLayout LAYOUT$pMapEntries = (AddressLayout) LAYOUT.select(PATH$pMapEntries);
    public static final AddressLayout LAYOUT$pData = (AddressLayout) LAYOUT.select(PATH$pData);

    public static final long OFFSET$mapEntryCount = LAYOUT.byteOffset(PATH$mapEntryCount);
    public static final long OFFSET$pMapEntries = LAYOUT.byteOffset(PATH$pMapEntries);
    public static final long OFFSET$dataSize = LAYOUT.byteOffset(PATH$dataSize);
    public static final long OFFSET$pData = LAYOUT.byteOffset(PATH$pData);

    public static final long SIZE$mapEntryCount = LAYOUT$mapEntryCount.byteSize();
    public static final long SIZE$pMapEntries = LAYOUT$pMapEntries.byteSize();
    public static final long SIZE$pData = LAYOUT$pData.byteSize();

    public VkSpecializationInfo(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int mapEntryCount() {
        return segment.get(LAYOUT$mapEntryCount, OFFSET$mapEntryCount);
    }

    public void mapEntryCount(@unsigned int value) {
        segment.set(LAYOUT$mapEntryCount, OFFSET$mapEntryCount, value);
    }

    public @pointer(comment="VkSpecializationMapEntry*") MemorySegment pMapEntriesRaw() {
        return segment.get(LAYOUT$pMapEntries, OFFSET$pMapEntries);
    }

    public void pMapEntriesRaw(@pointer(comment="VkSpecializationMapEntry*") MemorySegment value) {
        segment.set(LAYOUT$pMapEntries, OFFSET$pMapEntries, value);
    }
    
    public @nullable VkSpecializationMapEntry pMapEntries() {
        MemorySegment s = pMapEntriesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSpecializationMapEntry(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkSpecializationMapEntry[] pMapEntries(int assumedCount) {
        MemorySegment s = pMapEntriesRaw().reinterpret(assumedCount * VkSpecializationMapEntry.SIZE);
        VkSpecializationMapEntry[] arr = new VkSpecializationMapEntry[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkSpecializationMapEntry(s.asSlice(i * VkSpecializationMapEntry.SIZE, VkSpecializationMapEntry.SIZE));
        }
        return arr;
    }

    public void pMapEntries(@nullable VkSpecializationMapEntry value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pMapEntriesRaw(s);
    }

    public @unsigned long dataSize() {
            return NativeLayout.readCSizeT(segment, OFFSET$dataSize);
        }
    
        public void dataSize(@unsigned long value) {
            NativeLayout.writeCSizeT(segment, OFFSET$dataSize, value);
        }

    public @pointer(comment="void*") MemorySegment pData() {
        return segment.get(LAYOUT$pData, OFFSET$pData);
    }

    public void pData(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pData, OFFSET$pData, value);
    }

    public void pData(IPointer pointer) {
        pData(pointer.segment());
    }

    public static VkSpecializationInfo allocate(Arena arena) {
        return new VkSpecializationInfo(arena.allocate(LAYOUT));
    }
    
    public static VkSpecializationInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSpecializationInfo[] ret = new VkSpecializationInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkSpecializationInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
