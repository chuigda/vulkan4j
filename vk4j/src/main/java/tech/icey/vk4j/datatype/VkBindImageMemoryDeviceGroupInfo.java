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

public record VkBindImageMemoryDeviceGroupInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("deviceIndexCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pDeviceIndices"),
        ValueLayout.JAVA_INT.withName("splitInstanceBindRegionCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkRect2D.LAYOUT).withName("pSplitInstanceBindRegions")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$deviceIndexCount = PathElement.groupElement("deviceIndexCount");
    public static final PathElement PATH$pDeviceIndices = PathElement.groupElement("pDeviceIndices");
    public static final PathElement PATH$splitInstanceBindRegionCount = PathElement.groupElement("splitInstanceBindRegionCount");
    public static final PathElement PATH$pSplitInstanceBindRegions = PathElement.groupElement("pSplitInstanceBindRegions");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$deviceIndexCount = (OfInt) LAYOUT.select(PATH$deviceIndexCount);
    public static final AddressLayout LAYOUT$pDeviceIndices = (AddressLayout) LAYOUT.select(PATH$pDeviceIndices);
    public static final OfInt LAYOUT$splitInstanceBindRegionCount = (OfInt) LAYOUT.select(PATH$splitInstanceBindRegionCount);
    public static final AddressLayout LAYOUT$pSplitInstanceBindRegions = (AddressLayout) LAYOUT.select(PATH$pSplitInstanceBindRegions);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$deviceIndexCount = LAYOUT.byteOffset(PATH$deviceIndexCount);
    public static final long OFFSET$pDeviceIndices = LAYOUT.byteOffset(PATH$pDeviceIndices);
    public static final long OFFSET$splitInstanceBindRegionCount = LAYOUT.byteOffset(PATH$splitInstanceBindRegionCount);
    public static final long OFFSET$pSplitInstanceBindRegions = LAYOUT.byteOffset(PATH$pSplitInstanceBindRegions);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$deviceIndexCount = LAYOUT$deviceIndexCount.byteSize();
    public static final long SIZE$pDeviceIndices = LAYOUT$pDeviceIndices.byteSize();
    public static final long SIZE$splitInstanceBindRegionCount = LAYOUT$splitInstanceBindRegionCount.byteSize();
    public static final long SIZE$pSplitInstanceBindRegions = LAYOUT$pSplitInstanceBindRegions.byteSize();

    public VkBindImageMemoryDeviceGroupInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_BIND_IMAGE_MEMORY_DEVICE_GROUP_INFO);
    }

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

    public @unsigned int deviceIndexCount() {
        return segment.get(LAYOUT$deviceIndexCount, OFFSET$deviceIndexCount);
    }

    public void deviceIndexCount(@unsigned int value) {
        segment.set(LAYOUT$deviceIndexCount, OFFSET$deviceIndexCount, value);
    }

    public @pointer(comment="uint32_t*") MemorySegment pDeviceIndicesRaw() {
        return segment.get(LAYOUT$pDeviceIndices, OFFSET$pDeviceIndices);
    }

    public void pDeviceIndicesRaw(@pointer(comment="uint32_t*") MemorySegment value) {
        segment.set(LAYOUT$pDeviceIndices, OFFSET$pDeviceIndices, value);
    }

    public @nullable @unsigned IntBuffer pDeviceIndices() {
        MemorySegment s = pDeviceIndicesRaw();
        return s.address() == 0 ? null : new IntBuffer(s);
    }

    public void pDeviceIndices(@nullable @unsigned IntBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDeviceIndicesRaw(s);
    }

    public @unsigned int splitInstanceBindRegionCount() {
        return segment.get(LAYOUT$splitInstanceBindRegionCount, OFFSET$splitInstanceBindRegionCount);
    }

    public void splitInstanceBindRegionCount(@unsigned int value) {
        segment.set(LAYOUT$splitInstanceBindRegionCount, OFFSET$splitInstanceBindRegionCount, value);
    }

    public @pointer(comment="VkRect2D*") MemorySegment pSplitInstanceBindRegionsRaw() {
        return segment.get(LAYOUT$pSplitInstanceBindRegions, OFFSET$pSplitInstanceBindRegions);
    }

    public void pSplitInstanceBindRegionsRaw(@pointer(comment="VkRect2D*") MemorySegment value) {
        segment.set(LAYOUT$pSplitInstanceBindRegions, OFFSET$pSplitInstanceBindRegions, value);
    }
    
    public @nullable VkRect2D pSplitInstanceBindRegions() {
        MemorySegment s = pSplitInstanceBindRegionsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkRect2D(s);
    }

    @unsafe
    public @nullable VkRect2D[] pSplitInstanceBindRegions(int assumedCount) {
        MemorySegment s = pSplitInstanceBindRegionsRaw().reinterpret(assumedCount * VkRect2D.SIZE);
        VkRect2D[] arr = new VkRect2D[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkRect2D(s.asSlice(i * VkRect2D.SIZE, VkRect2D.SIZE));
        }
        return arr;
    }

    public void pSplitInstanceBindRegions(@nullable VkRect2D value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSplitInstanceBindRegionsRaw(s);
    }

    public static VkBindImageMemoryDeviceGroupInfo allocate(Arena arena) {
        return new VkBindImageMemoryDeviceGroupInfo(arena.allocate(LAYOUT));
    }
    
    public static VkBindImageMemoryDeviceGroupInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBindImageMemoryDeviceGroupInfo[] ret = new VkBindImageMemoryDeviceGroupInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkBindImageMemoryDeviceGroupInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
