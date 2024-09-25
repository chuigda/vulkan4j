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

public record VkCopyBufferInfo2(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("srcBuffer"),
        ValueLayout.ADDRESS.withName("dstBuffer"),
        ValueLayout.JAVA_INT.withName("regionCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkBufferCopy2.LAYOUT).withName("pRegions")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$srcBuffer = PathElement.groupElement("srcBuffer");
    public static final PathElement PATH$dstBuffer = PathElement.groupElement("dstBuffer");
    public static final PathElement PATH$regionCount = PathElement.groupElement("regionCount");
    public static final PathElement PATH$pRegions = PathElement.groupElement("pRegions");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$srcBuffer = (AddressLayout) LAYOUT.select(PATH$srcBuffer);
    public static final AddressLayout LAYOUT$dstBuffer = (AddressLayout) LAYOUT.select(PATH$dstBuffer);
    public static final OfInt LAYOUT$regionCount = (OfInt) LAYOUT.select(PATH$regionCount);
    public static final AddressLayout LAYOUT$pRegions = (AddressLayout) LAYOUT.select(PATH$pRegions);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$srcBuffer = LAYOUT.byteOffset(PATH$srcBuffer);
    public static final long OFFSET$dstBuffer = LAYOUT.byteOffset(PATH$dstBuffer);
    public static final long OFFSET$regionCount = LAYOUT.byteOffset(PATH$regionCount);
    public static final long OFFSET$pRegions = LAYOUT.byteOffset(PATH$pRegions);

    public VkCopyBufferInfo2(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_COPY_BUFFER_INFO_2);
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

    public VkBuffer srcBuffer() {
        return new VkBuffer(segment.asSlice(OFFSET$srcBuffer, LAYOUT$srcBuffer));
    }

    public void srcBuffer(VkBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$srcBuffer, LAYOUT$srcBuffer.byteSize());
    }

    public VkBuffer dstBuffer() {
        return new VkBuffer(segment.asSlice(OFFSET$dstBuffer, LAYOUT$dstBuffer));
    }

    public void dstBuffer(VkBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$dstBuffer, LAYOUT$dstBuffer.byteSize());
    }

    public @unsigned int regionCount() {
        return segment.get(LAYOUT$regionCount, OFFSET$regionCount);
    }

    public void regionCount(@unsigned int value) {
        segment.set(LAYOUT$regionCount, OFFSET$regionCount, value);
    }

    public @pointer(comment="VkBufferCopy2*") MemorySegment pRegionsRaw() {
        return segment.get(LAYOUT$pRegions, OFFSET$pRegions);
    }

    public void pRegionsRaw(@pointer(comment="VkBufferCopy2*") MemorySegment value) {
        segment.set(LAYOUT$pRegions, OFFSET$pRegions, value);
    }
    
    public @nullable VkBufferCopy2 pRegions() {
        MemorySegment s = pRegionsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkBufferCopy2(s);
    }

    public void pRegions(@nullable VkBufferCopy2 value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pRegionsRaw(s);
    }

    public static VkCopyBufferInfo2 allocate(Arena arena) {
        return new VkCopyBufferInfo2(arena.allocate(LAYOUT));
    }
    
    public static VkCopyBufferInfo2[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCopyBufferInfo2[] ret = new VkCopyBufferInfo2[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkCopyBufferInfo2(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}
