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

public record VkDependencyInfo(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("dependencyFlags"),
        ValueLayout.JAVA_INT.withName("memoryBarrierCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkMemoryBarrier2.LAYOUT).withName("pMemoryBarriers"),
        ValueLayout.JAVA_INT.withName("bufferMemoryBarrierCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkBufferMemoryBarrier2.LAYOUT).withName("pBufferMemoryBarriers"),
        ValueLayout.JAVA_INT.withName("imageMemoryBarrierCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkImageMemoryBarrier2.LAYOUT).withName("pImageMemoryBarriers")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$dependencyFlags = PathElement.groupElement("dependencyFlags");
    public static final PathElement PATH$memoryBarrierCount = PathElement.groupElement("memoryBarrierCount");
    public static final PathElement PATH$pMemoryBarriers = PathElement.groupElement("pMemoryBarriers");
    public static final PathElement PATH$bufferMemoryBarrierCount = PathElement.groupElement("bufferMemoryBarrierCount");
    public static final PathElement PATH$pBufferMemoryBarriers = PathElement.groupElement("pBufferMemoryBarriers");
    public static final PathElement PATH$imageMemoryBarrierCount = PathElement.groupElement("imageMemoryBarrierCount");
    public static final PathElement PATH$pImageMemoryBarriers = PathElement.groupElement("pImageMemoryBarriers");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$dependencyFlags = (OfInt) LAYOUT.select(PATH$dependencyFlags);
    public static final OfInt LAYOUT$memoryBarrierCount = (OfInt) LAYOUT.select(PATH$memoryBarrierCount);
    public static final AddressLayout LAYOUT$pMemoryBarriers = (AddressLayout) LAYOUT.select(PATH$pMemoryBarriers);
    public static final OfInt LAYOUT$bufferMemoryBarrierCount = (OfInt) LAYOUT.select(PATH$bufferMemoryBarrierCount);
    public static final AddressLayout LAYOUT$pBufferMemoryBarriers = (AddressLayout) LAYOUT.select(PATH$pBufferMemoryBarriers);
    public static final OfInt LAYOUT$imageMemoryBarrierCount = (OfInt) LAYOUT.select(PATH$imageMemoryBarrierCount);
    public static final AddressLayout LAYOUT$pImageMemoryBarriers = (AddressLayout) LAYOUT.select(PATH$pImageMemoryBarriers);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$dependencyFlags = LAYOUT.byteOffset(PATH$dependencyFlags);
    public static final long OFFSET$memoryBarrierCount = LAYOUT.byteOffset(PATH$memoryBarrierCount);
    public static final long OFFSET$pMemoryBarriers = LAYOUT.byteOffset(PATH$pMemoryBarriers);
    public static final long OFFSET$bufferMemoryBarrierCount = LAYOUT.byteOffset(PATH$bufferMemoryBarrierCount);
    public static final long OFFSET$pBufferMemoryBarriers = LAYOUT.byteOffset(PATH$pBufferMemoryBarriers);
    public static final long OFFSET$imageMemoryBarrierCount = LAYOUT.byteOffset(PATH$imageMemoryBarrierCount);
    public static final long OFFSET$pImageMemoryBarriers = LAYOUT.byteOffset(PATH$pImageMemoryBarriers);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$dependencyFlags = LAYOUT$dependencyFlags.byteSize();
    public static final long SIZE$memoryBarrierCount = LAYOUT$memoryBarrierCount.byteSize();
    public static final long SIZE$pMemoryBarriers = LAYOUT$pMemoryBarriers.byteSize();
    public static final long SIZE$bufferMemoryBarrierCount = LAYOUT$bufferMemoryBarrierCount.byteSize();
    public static final long SIZE$pBufferMemoryBarriers = LAYOUT$pBufferMemoryBarriers.byteSize();
    public static final long SIZE$imageMemoryBarrierCount = LAYOUT$imageMemoryBarrierCount.byteSize();
    public static final long SIZE$pImageMemoryBarriers = LAYOUT$pImageMemoryBarriers.byteSize();

    public VkDependencyInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEPENDENCY_INFO);
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

    public @enumtype(VkDependencyFlags.class) int dependencyFlags() {
        return segment.get(LAYOUT$dependencyFlags, OFFSET$dependencyFlags);
    }

    public void dependencyFlags(@enumtype(VkDependencyFlags.class) int value) {
        segment.set(LAYOUT$dependencyFlags, OFFSET$dependencyFlags, value);
    }

    public @unsigned int memoryBarrierCount() {
        return segment.get(LAYOUT$memoryBarrierCount, OFFSET$memoryBarrierCount);
    }

    public void memoryBarrierCount(@unsigned int value) {
        segment.set(LAYOUT$memoryBarrierCount, OFFSET$memoryBarrierCount, value);
    }

    public @pointer(comment="VkMemoryBarrier2*") MemorySegment pMemoryBarriersRaw() {
        return segment.get(LAYOUT$pMemoryBarriers, OFFSET$pMemoryBarriers);
    }

    public void pMemoryBarriersRaw(@pointer(comment="VkMemoryBarrier2*") MemorySegment value) {
        segment.set(LAYOUT$pMemoryBarriers, OFFSET$pMemoryBarriers, value);
    }
    
    public @nullable VkMemoryBarrier2 pMemoryBarriers() {
        MemorySegment s = pMemoryBarriersRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkMemoryBarrier2(s);
    }

    @unsafe
    public @nullable VkMemoryBarrier2[] pMemoryBarriers(int assumedCount) {
        MemorySegment s = pMemoryBarriersRaw().reinterpret(assumedCount * VkMemoryBarrier2.SIZE);
        VkMemoryBarrier2[] arr = new VkMemoryBarrier2[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkMemoryBarrier2(s.asSlice(i * VkMemoryBarrier2.SIZE, VkMemoryBarrier2.SIZE));
        }
        return arr;
    }

    public void pMemoryBarriers(@nullable VkMemoryBarrier2 value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pMemoryBarriersRaw(s);
    }

    public @unsigned int bufferMemoryBarrierCount() {
        return segment.get(LAYOUT$bufferMemoryBarrierCount, OFFSET$bufferMemoryBarrierCount);
    }

    public void bufferMemoryBarrierCount(@unsigned int value) {
        segment.set(LAYOUT$bufferMemoryBarrierCount, OFFSET$bufferMemoryBarrierCount, value);
    }

    public @pointer(comment="VkBufferMemoryBarrier2*") MemorySegment pBufferMemoryBarriersRaw() {
        return segment.get(LAYOUT$pBufferMemoryBarriers, OFFSET$pBufferMemoryBarriers);
    }

    public void pBufferMemoryBarriersRaw(@pointer(comment="VkBufferMemoryBarrier2*") MemorySegment value) {
        segment.set(LAYOUT$pBufferMemoryBarriers, OFFSET$pBufferMemoryBarriers, value);
    }
    
    public @nullable VkBufferMemoryBarrier2 pBufferMemoryBarriers() {
        MemorySegment s = pBufferMemoryBarriersRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkBufferMemoryBarrier2(s);
    }

    @unsafe
    public @nullable VkBufferMemoryBarrier2[] pBufferMemoryBarriers(int assumedCount) {
        MemorySegment s = pBufferMemoryBarriersRaw().reinterpret(assumedCount * VkBufferMemoryBarrier2.SIZE);
        VkBufferMemoryBarrier2[] arr = new VkBufferMemoryBarrier2[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkBufferMemoryBarrier2(s.asSlice(i * VkBufferMemoryBarrier2.SIZE, VkBufferMemoryBarrier2.SIZE));
        }
        return arr;
    }

    public void pBufferMemoryBarriers(@nullable VkBufferMemoryBarrier2 value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pBufferMemoryBarriersRaw(s);
    }

    public @unsigned int imageMemoryBarrierCount() {
        return segment.get(LAYOUT$imageMemoryBarrierCount, OFFSET$imageMemoryBarrierCount);
    }

    public void imageMemoryBarrierCount(@unsigned int value) {
        segment.set(LAYOUT$imageMemoryBarrierCount, OFFSET$imageMemoryBarrierCount, value);
    }

    public @pointer(comment="VkImageMemoryBarrier2*") MemorySegment pImageMemoryBarriersRaw() {
        return segment.get(LAYOUT$pImageMemoryBarriers, OFFSET$pImageMemoryBarriers);
    }

    public void pImageMemoryBarriersRaw(@pointer(comment="VkImageMemoryBarrier2*") MemorySegment value) {
        segment.set(LAYOUT$pImageMemoryBarriers, OFFSET$pImageMemoryBarriers, value);
    }
    
    public @nullable VkImageMemoryBarrier2 pImageMemoryBarriers() {
        MemorySegment s = pImageMemoryBarriersRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkImageMemoryBarrier2(s);
    }

    @unsafe
    public @nullable VkImageMemoryBarrier2[] pImageMemoryBarriers(int assumedCount) {
        MemorySegment s = pImageMemoryBarriersRaw().reinterpret(assumedCount * VkImageMemoryBarrier2.SIZE);
        VkImageMemoryBarrier2[] arr = new VkImageMemoryBarrier2[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkImageMemoryBarrier2(s.asSlice(i * VkImageMemoryBarrier2.SIZE, VkImageMemoryBarrier2.SIZE));
        }
        return arr;
    }

    public void pImageMemoryBarriers(@nullable VkImageMemoryBarrier2 value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pImageMemoryBarriersRaw(s);
    }

    public static VkDependencyInfo allocate(Arena arena) {
        return new VkDependencyInfo(arena.allocate(LAYOUT));
    }
    
    public static VkDependencyInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDependencyInfo[] ret = new VkDependencyInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDependencyInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
