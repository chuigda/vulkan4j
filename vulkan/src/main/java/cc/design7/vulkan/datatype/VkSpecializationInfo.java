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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSpecializationInfo.html">VkSpecializationInfo</a>
@ValueBasedCandidate
public record VkSpecializationInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$mapEntryCount = ValueLayout.JAVA_INT.withName("mapEntryCount");
    public static final AddressLayout LAYOUT$pMapEntries = ValueLayout.ADDRESS.withTargetLayout(VkSpecializationMapEntry.LAYOUT).withName("pMapEntries");
    public static final ValueLayout LAYOUT$dataSize = NativeLayout.C_SIZE_T.withName("dataSize");
    public static final AddressLayout LAYOUT$pData = ValueLayout.ADDRESS.withName("pData");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$mapEntryCount, LAYOUT$pMapEntries, LAYOUT$dataSize, LAYOUT$pData);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkSpecializationInfo allocate(Arena arena) {
        return new VkSpecializationInfo(arena.allocate(LAYOUT));
    }

    public static VkSpecializationInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSpecializationInfo[] ret = new VkSpecializationInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSpecializationInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSpecializationInfo clone(Arena arena, VkSpecializationInfo src) {
        VkSpecializationInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSpecializationInfo[] clone(Arena arena, VkSpecializationInfo[] src) {
        VkSpecializationInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$mapEntryCount = PathElement.groupElement("PATH$mapEntryCount");
    public static final PathElement PATH$pMapEntries = PathElement.groupElement("PATH$pMapEntries");
    public static final PathElement PATH$dataSize = PathElement.groupElement("PATH$dataSize");
    public static final PathElement PATH$pData = PathElement.groupElement("PATH$pData");

    public static final long SIZE$mapEntryCount = LAYOUT$mapEntryCount.byteSize();
    public static final long SIZE$pMapEntries = LAYOUT$pMapEntries.byteSize();
    public static final long SIZE$dataSize = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$pData = LAYOUT$pData.byteSize();

    public static final long OFFSET$mapEntryCount = LAYOUT.byteOffset(PATH$mapEntryCount);
    public static final long OFFSET$pMapEntries = LAYOUT.byteOffset(PATH$pMapEntries);
    public static final long OFFSET$dataSize = LAYOUT.byteOffset(PATH$dataSize);
    public static final long OFFSET$pData = LAYOUT.byteOffset(PATH$pData);

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

    public @Nullable VkSpecializationMapEntry pMapEntries() {
        MemorySegment s = pMapEntriesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSpecializationMapEntry(s);
    }

    public void pMapEntries(@Nullable VkSpecializationMapEntry value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pMapEntriesRaw(s);
    }

    @unsafe public @Nullable VkSpecializationMapEntry[] pMapEntries(int assumedCount) {
        MemorySegment s = pMapEntriesRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkSpecializationMapEntry.SIZE);
        VkSpecializationMapEntry[] ret = new VkSpecializationMapEntry[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkSpecializationMapEntry(s.asSlice(i * VkSpecializationMapEntry.SIZE, VkSpecializationMapEntry.SIZE));
        }
        return ret;
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

}
