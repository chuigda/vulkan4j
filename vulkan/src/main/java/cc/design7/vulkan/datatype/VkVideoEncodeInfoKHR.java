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

public record VkVideoEncodeInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final AddressLayout LAYOUT$dstBuffer = ValueLayout.ADDRESS.withName("dstBuffer");
    public static final OfLong LAYOUT$dstBufferOffset = ValueLayout.JAVA_LONG.withName("dstBufferOffset");
    public static final OfLong LAYOUT$dstBufferRange = ValueLayout.JAVA_LONG.withName("dstBufferRange");
    public static final StructLayout LAYOUT$srcPictureResource = VkVideoPictureResourceInfoKHR.LAYOUT.withName("srcPictureResource");
    public static final AddressLayout LAYOUT$pSetupReferenceSlot = ValueLayout.ADDRESS.withTargetLayout(VkVideoReferenceSlotInfoKHR.LAYOUT).withName("pSetupReferenceSlot");
    public static final OfInt LAYOUT$referenceSlotCount = ValueLayout.JAVA_INT.withName("referenceSlotCount");
    public static final AddressLayout LAYOUT$pReferenceSlots = ValueLayout.ADDRESS.withTargetLayout(VkVideoReferenceSlotInfoKHR.LAYOUT).withName("pReferenceSlots");
    public static final OfInt LAYOUT$precedingExternallyEncodedBytes = ValueLayout.JAVA_INT.withName("precedingExternallyEncodedBytes");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$flags, LAYOUT$dstBuffer, LAYOUT$dstBufferOffset, LAYOUT$dstBufferRange, LAYOUT$srcPictureResource, LAYOUT$pSetupReferenceSlot, LAYOUT$referenceSlotCount, LAYOUT$pReferenceSlots, LAYOUT$precedingExternallyEncodedBytes);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkVideoEncodeInfoKHR allocate(Arena arena) {
        return new VkVideoEncodeInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoEncodeInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeInfoKHR[] ret = new VkVideoEncodeInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkVideoEncodeInfoKHR clone(Arena arena, VkVideoEncodeInfoKHR src) {
        VkVideoEncodeInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeInfoKHR[] clone(Arena arena, VkVideoEncodeInfoKHR[] src) {
        VkVideoEncodeInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$dstBuffer = PathElement.groupElement("PATH$dstBuffer");
    public static final PathElement PATH$dstBufferOffset = PathElement.groupElement("PATH$dstBufferOffset");
    public static final PathElement PATH$dstBufferRange = PathElement.groupElement("PATH$dstBufferRange");
    public static final PathElement PATH$srcPictureResource = PathElement.groupElement("PATH$srcPictureResource");
    public static final PathElement PATH$pSetupReferenceSlot = PathElement.groupElement("PATH$pSetupReferenceSlot");
    public static final PathElement PATH$referenceSlotCount = PathElement.groupElement("PATH$referenceSlotCount");
    public static final PathElement PATH$pReferenceSlots = PathElement.groupElement("PATH$pReferenceSlots");
    public static final PathElement PATH$precedingExternallyEncodedBytes = PathElement.groupElement("PATH$precedingExternallyEncodedBytes");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$dstBuffer = LAYOUT$dstBuffer.byteSize();
    public static final long SIZE$dstBufferOffset = LAYOUT$dstBufferOffset.byteSize();
    public static final long SIZE$dstBufferRange = LAYOUT$dstBufferRange.byteSize();
    public static final long SIZE$srcPictureResource = LAYOUT$srcPictureResource.byteSize();
    public static final long SIZE$pSetupReferenceSlot = LAYOUT$pSetupReferenceSlot.byteSize();
    public static final long SIZE$referenceSlotCount = LAYOUT$referenceSlotCount.byteSize();
    public static final long SIZE$pReferenceSlots = LAYOUT$pReferenceSlots.byteSize();
    public static final long SIZE$precedingExternallyEncodedBytes = LAYOUT$precedingExternallyEncodedBytes.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$dstBuffer = LAYOUT.byteOffset(PATH$dstBuffer);
    public static final long OFFSET$dstBufferOffset = LAYOUT.byteOffset(PATH$dstBufferOffset);
    public static final long OFFSET$dstBufferRange = LAYOUT.byteOffset(PATH$dstBufferRange);
    public static final long OFFSET$srcPictureResource = LAYOUT.byteOffset(PATH$srcPictureResource);
    public static final long OFFSET$pSetupReferenceSlot = LAYOUT.byteOffset(PATH$pSetupReferenceSlot);
    public static final long OFFSET$referenceSlotCount = LAYOUT.byteOffset(PATH$referenceSlotCount);
    public static final long OFFSET$pReferenceSlots = LAYOUT.byteOffset(PATH$pReferenceSlots);
    public static final long OFFSET$precedingExternallyEncodedBytes = LAYOUT.byteOffset(PATH$precedingExternallyEncodedBytes);

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

    public @enumtype(VkVideoEncodeFlagsKHR.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkVideoEncodeFlagsKHR.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @Nullable VkBuffer dstBuffer() {
        MemorySegment s = segment.asSlice(OFFSET$dstBuffer, SIZE$dstBuffer);
        if (s.address() == 0) {
            return null;
        }
        return new VkBuffer(s);
    }

    public void dstBuffer() {
        segment.set(LAYOUT$dstBuffer, OFFSET$dstBuffer, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned long dstBufferOffset() {
        return segment.get(LAYOUT$dstBufferOffset, OFFSET$dstBufferOffset);
    }

    public void dstBufferOffset(@unsigned long value) {
        segment.set(LAYOUT$dstBufferOffset, OFFSET$dstBufferOffset, value);
    }

    public @unsigned long dstBufferRange() {
        return segment.get(LAYOUT$dstBufferRange, OFFSET$dstBufferRange);
    }

    public void dstBufferRange(@unsigned long value) {
        segment.set(LAYOUT$dstBufferRange, OFFSET$dstBufferRange, value);
    }

    public VkVideoPictureResourceInfoKHR srcPictureResource() {
        return new VkVideoPictureResourceInfoKHR(segment.asSlice(OFFSET$srcPictureResource, LAYOUT$srcPictureResource));
    }

    public void srcPictureResource(VkVideoPictureResourceInfoKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$srcPictureResource, SIZE$srcPictureResource);
    }

    public @pointer(comment="VkVideoReferenceSlotInfoKHR*") MemorySegment pSetupReferenceSlotRaw() {
        return segment.get(LAYOUT$pSetupReferenceSlot, OFFSET$pSetupReferenceSlot);
    }

    public void pSetupReferenceSlotRaw(@pointer(comment="VkVideoReferenceSlotInfoKHR*") MemorySegment value) {
        segment.set(LAYOUT$pSetupReferenceSlot, OFFSET$pSetupReferenceSlot, value);
    }

    public @Nullable VkVideoReferenceSlotInfoKHR pSetupReferenceSlot() {
        MemorySegment s = pSetupReferenceSlotRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkVideoReferenceSlotInfoKHR(s);
    }

    public void pSetupReferenceSlot(@Nullable VkVideoReferenceSlotInfoKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSetupReferenceSlotRaw(s);
    }

    @unsafe public @Nullable VkVideoReferenceSlotInfoKHR[] pSetupReferenceSlot(int assumedCount) {
        MemorySegment s = pSetupReferenceSlotRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkVideoReferenceSlotInfoKHR.SIZE);
        VkVideoReferenceSlotInfoKHR[] ret = new VkVideoReferenceSlotInfoKHR[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkVideoReferenceSlotInfoKHR(s.asSlice(i * VkVideoReferenceSlotInfoKHR.SIZE, VkVideoReferenceSlotInfoKHR.SIZE));
        }
        return ret;
    }

    public @unsigned int referenceSlotCount() {
        return segment.get(LAYOUT$referenceSlotCount, OFFSET$referenceSlotCount);
    }

    public void referenceSlotCount(@unsigned int value) {
        segment.set(LAYOUT$referenceSlotCount, OFFSET$referenceSlotCount, value);
    }

    public @pointer(comment="VkVideoReferenceSlotInfoKHR*") MemorySegment pReferenceSlotsRaw() {
        return segment.get(LAYOUT$pReferenceSlots, OFFSET$pReferenceSlots);
    }

    public void pReferenceSlotsRaw(@pointer(comment="VkVideoReferenceSlotInfoKHR*") MemorySegment value) {
        segment.set(LAYOUT$pReferenceSlots, OFFSET$pReferenceSlots, value);
    }

    public @Nullable VkVideoReferenceSlotInfoKHR pReferenceSlots() {
        MemorySegment s = pReferenceSlotsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkVideoReferenceSlotInfoKHR(s);
    }

    public void pReferenceSlots(@Nullable VkVideoReferenceSlotInfoKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pReferenceSlotsRaw(s);
    }

    @unsafe public @Nullable VkVideoReferenceSlotInfoKHR[] pReferenceSlots(int assumedCount) {
        MemorySegment s = pReferenceSlotsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkVideoReferenceSlotInfoKHR.SIZE);
        VkVideoReferenceSlotInfoKHR[] ret = new VkVideoReferenceSlotInfoKHR[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkVideoReferenceSlotInfoKHR(s.asSlice(i * VkVideoReferenceSlotInfoKHR.SIZE, VkVideoReferenceSlotInfoKHR.SIZE));
        }
        return ret;
    }

    public @unsigned int precedingExternallyEncodedBytes() {
        return segment.get(LAYOUT$precedingExternallyEncodedBytes, OFFSET$precedingExternallyEncodedBytes);
    }

    public void precedingExternallyEncodedBytes(@unsigned int value) {
        segment.set(LAYOUT$precedingExternallyEncodedBytes, OFFSET$precedingExternallyEncodedBytes, value);
    }

}
/// dummy, not implemented yet
