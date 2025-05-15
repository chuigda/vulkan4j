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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDependencyInfo.html">VkDependencyInfo</a>
@ValueBasedCandidate
public record VkDependencyInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$dependencyFlags = ValueLayout.JAVA_INT.withName("dependencyFlags");
    public static final OfInt LAYOUT$memoryBarrierCount = ValueLayout.JAVA_INT.withName("memoryBarrierCount");
    public static final AddressLayout LAYOUT$pMemoryBarriers = ValueLayout.ADDRESS.withTargetLayout(VkMemoryBarrier2.LAYOUT).withName("pMemoryBarriers");
    public static final OfInt LAYOUT$bufferMemoryBarrierCount = ValueLayout.JAVA_INT.withName("bufferMemoryBarrierCount");
    public static final AddressLayout LAYOUT$pBufferMemoryBarriers = ValueLayout.ADDRESS.withTargetLayout(VkBufferMemoryBarrier2.LAYOUT).withName("pBufferMemoryBarriers");
    public static final OfInt LAYOUT$imageMemoryBarrierCount = ValueLayout.JAVA_INT.withName("imageMemoryBarrierCount");
    public static final AddressLayout LAYOUT$pImageMemoryBarriers = ValueLayout.ADDRESS.withTargetLayout(VkImageMemoryBarrier2.LAYOUT).withName("pImageMemoryBarriers");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$dependencyFlags, LAYOUT$memoryBarrierCount, LAYOUT$pMemoryBarriers, LAYOUT$bufferMemoryBarrierCount, LAYOUT$pBufferMemoryBarriers, LAYOUT$imageMemoryBarrierCount, LAYOUT$pImageMemoryBarriers);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkDependencyInfo allocate(Arena arena) {
        return new VkDependencyInfo(arena.allocate(LAYOUT));
    }

    public static VkDependencyInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDependencyInfo[] ret = new VkDependencyInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDependencyInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDependencyInfo clone(Arena arena, VkDependencyInfo src) {
        VkDependencyInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDependencyInfo[] clone(Arena arena, VkDependencyInfo[] src) {
        VkDependencyInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$dependencyFlags = PathElement.groupElement("PATH$dependencyFlags");
    public static final PathElement PATH$memoryBarrierCount = PathElement.groupElement("PATH$memoryBarrierCount");
    public static final PathElement PATH$pMemoryBarriers = PathElement.groupElement("PATH$pMemoryBarriers");
    public static final PathElement PATH$bufferMemoryBarrierCount = PathElement.groupElement("PATH$bufferMemoryBarrierCount");
    public static final PathElement PATH$pBufferMemoryBarriers = PathElement.groupElement("PATH$pBufferMemoryBarriers");
    public static final PathElement PATH$imageMemoryBarrierCount = PathElement.groupElement("PATH$imageMemoryBarrierCount");
    public static final PathElement PATH$pImageMemoryBarriers = PathElement.groupElement("PATH$pImageMemoryBarriers");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$dependencyFlags = LAYOUT$dependencyFlags.byteSize();
    public static final long SIZE$memoryBarrierCount = LAYOUT$memoryBarrierCount.byteSize();
    public static final long SIZE$pMemoryBarriers = LAYOUT$pMemoryBarriers.byteSize();
    public static final long SIZE$bufferMemoryBarrierCount = LAYOUT$bufferMemoryBarrierCount.byteSize();
    public static final long SIZE$pBufferMemoryBarriers = LAYOUT$pBufferMemoryBarriers.byteSize();
    public static final long SIZE$imageMemoryBarrierCount = LAYOUT$imageMemoryBarrierCount.byteSize();
    public static final long SIZE$pImageMemoryBarriers = LAYOUT$pImageMemoryBarriers.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$dependencyFlags = LAYOUT.byteOffset(PATH$dependencyFlags);
    public static final long OFFSET$memoryBarrierCount = LAYOUT.byteOffset(PATH$memoryBarrierCount);
    public static final long OFFSET$pMemoryBarriers = LAYOUT.byteOffset(PATH$pMemoryBarriers);
    public static final long OFFSET$bufferMemoryBarrierCount = LAYOUT.byteOffset(PATH$bufferMemoryBarrierCount);
    public static final long OFFSET$pBufferMemoryBarriers = LAYOUT.byteOffset(PATH$pBufferMemoryBarriers);
    public static final long OFFSET$imageMemoryBarrierCount = LAYOUT.byteOffset(PATH$imageMemoryBarrierCount);
    public static final long OFFSET$pImageMemoryBarriers = LAYOUT.byteOffset(PATH$pImageMemoryBarriers);

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

    public @Nullable VkMemoryBarrier2 pMemoryBarriers() {
        MemorySegment s = pMemoryBarriersRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkMemoryBarrier2(s);
    }

    public void pMemoryBarriers(@Nullable VkMemoryBarrier2 value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pMemoryBarriersRaw(s);
    }

    @unsafe public @Nullable VkMemoryBarrier2[] pMemoryBarriers(int assumedCount) {
        MemorySegment s = pMemoryBarriersRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkMemoryBarrier2.SIZE);
        VkMemoryBarrier2[] ret = new VkMemoryBarrier2[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkMemoryBarrier2(s.asSlice(i * VkMemoryBarrier2.SIZE, VkMemoryBarrier2.SIZE));
        }
        return ret;
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

    public @Nullable VkBufferMemoryBarrier2 pBufferMemoryBarriers() {
        MemorySegment s = pBufferMemoryBarriersRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkBufferMemoryBarrier2(s);
    }

    public void pBufferMemoryBarriers(@Nullable VkBufferMemoryBarrier2 value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pBufferMemoryBarriersRaw(s);
    }

    @unsafe public @Nullable VkBufferMemoryBarrier2[] pBufferMemoryBarriers(int assumedCount) {
        MemorySegment s = pBufferMemoryBarriersRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkBufferMemoryBarrier2.SIZE);
        VkBufferMemoryBarrier2[] ret = new VkBufferMemoryBarrier2[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkBufferMemoryBarrier2(s.asSlice(i * VkBufferMemoryBarrier2.SIZE, VkBufferMemoryBarrier2.SIZE));
        }
        return ret;
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

    public @Nullable VkImageMemoryBarrier2 pImageMemoryBarriers() {
        MemorySegment s = pImageMemoryBarriersRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkImageMemoryBarrier2(s);
    }

    public void pImageMemoryBarriers(@Nullable VkImageMemoryBarrier2 value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pImageMemoryBarriersRaw(s);
    }

    @unsafe public @Nullable VkImageMemoryBarrier2[] pImageMemoryBarriers(int assumedCount) {
        MemorySegment s = pImageMemoryBarriersRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkImageMemoryBarrier2.SIZE);
        VkImageMemoryBarrier2[] ret = new VkImageMemoryBarrier2[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkImageMemoryBarrier2(s.asSlice(i * VkImageMemoryBarrier2.SIZE, VkImageMemoryBarrier2.SIZE));
        }
        return ret;
    }

}
