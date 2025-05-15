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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoDecodeInfoKHR.html">VkVideoDecodeInfoKHR</a>
@ValueBasedCandidate
public record VkVideoDecodeInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final AddressLayout LAYOUT$srcBuffer = ValueLayout.ADDRESS.withName("srcBuffer");
    public static final OfLong LAYOUT$srcBufferOffset = ValueLayout.JAVA_LONG.withName("srcBufferOffset");
    public static final OfLong LAYOUT$srcBufferRange = ValueLayout.JAVA_LONG.withName("srcBufferRange");
    public static final StructLayout LAYOUT$dstPictureResource = VkVideoPictureResourceInfoKHR.LAYOUT.withName("dstPictureResource");
    public static final AddressLayout LAYOUT$pSetupReferenceSlot = ValueLayout.ADDRESS.withTargetLayout(VkVideoReferenceSlotInfoKHR.LAYOUT).withName("pSetupReferenceSlot");
    public static final OfInt LAYOUT$referenceSlotCount = ValueLayout.JAVA_INT.withName("referenceSlotCount");
    public static final AddressLayout LAYOUT$pReferenceSlots = ValueLayout.ADDRESS.withTargetLayout(VkVideoReferenceSlotInfoKHR.LAYOUT).withName("pReferenceSlots");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$flags, LAYOUT$srcBuffer, LAYOUT$srcBufferOffset, LAYOUT$srcBufferRange, LAYOUT$dstPictureResource, LAYOUT$pSetupReferenceSlot, LAYOUT$referenceSlotCount, LAYOUT$pReferenceSlots);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkVideoDecodeInfoKHR allocate(Arena arena) {
        return new VkVideoDecodeInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoDecodeInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoDecodeInfoKHR[] ret = new VkVideoDecodeInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoDecodeInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkVideoDecodeInfoKHR clone(Arena arena, VkVideoDecodeInfoKHR src) {
        VkVideoDecodeInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoDecodeInfoKHR[] clone(Arena arena, VkVideoDecodeInfoKHR[] src) {
        VkVideoDecodeInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$srcBuffer = PathElement.groupElement("PATH$srcBuffer");
    public static final PathElement PATH$srcBufferOffset = PathElement.groupElement("PATH$srcBufferOffset");
    public static final PathElement PATH$srcBufferRange = PathElement.groupElement("PATH$srcBufferRange");
    public static final PathElement PATH$dstPictureResource = PathElement.groupElement("PATH$dstPictureResource");
    public static final PathElement PATH$pSetupReferenceSlot = PathElement.groupElement("PATH$pSetupReferenceSlot");
    public static final PathElement PATH$referenceSlotCount = PathElement.groupElement("PATH$referenceSlotCount");
    public static final PathElement PATH$pReferenceSlots = PathElement.groupElement("PATH$pReferenceSlots");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$srcBuffer = LAYOUT$srcBuffer.byteSize();
    public static final long SIZE$srcBufferOffset = LAYOUT$srcBufferOffset.byteSize();
    public static final long SIZE$srcBufferRange = LAYOUT$srcBufferRange.byteSize();
    public static final long SIZE$dstPictureResource = LAYOUT$dstPictureResource.byteSize();
    public static final long SIZE$pSetupReferenceSlot = LAYOUT$pSetupReferenceSlot.byteSize();
    public static final long SIZE$referenceSlotCount = LAYOUT$referenceSlotCount.byteSize();
    public static final long SIZE$pReferenceSlots = LAYOUT$pReferenceSlots.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$srcBuffer = LAYOUT.byteOffset(PATH$srcBuffer);
    public static final long OFFSET$srcBufferOffset = LAYOUT.byteOffset(PATH$srcBufferOffset);
    public static final long OFFSET$srcBufferRange = LAYOUT.byteOffset(PATH$srcBufferRange);
    public static final long OFFSET$dstPictureResource = LAYOUT.byteOffset(PATH$dstPictureResource);
    public static final long OFFSET$pSetupReferenceSlot = LAYOUT.byteOffset(PATH$pSetupReferenceSlot);
    public static final long OFFSET$referenceSlotCount = LAYOUT.byteOffset(PATH$referenceSlotCount);
    public static final long OFFSET$pReferenceSlots = LAYOUT.byteOffset(PATH$pReferenceSlots);

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

    public @enumtype(VkVideoDecodeFlagsKHR.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkVideoDecodeFlagsKHR.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @Nullable VkBuffer srcBuffer() {
        MemorySegment s = segment.asSlice(OFFSET$srcBuffer, SIZE$srcBuffer);
        if (s.address() == 0) {
            return null;
        }
        return new VkBuffer(s);
    }

    public void srcBuffer() {
        segment.set(LAYOUT$srcBuffer, OFFSET$srcBuffer, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned long srcBufferOffset() {
        return segment.get(LAYOUT$srcBufferOffset, OFFSET$srcBufferOffset);
    }

    public void srcBufferOffset(@unsigned long value) {
        segment.set(LAYOUT$srcBufferOffset, OFFSET$srcBufferOffset, value);
    }

    public @unsigned long srcBufferRange() {
        return segment.get(LAYOUT$srcBufferRange, OFFSET$srcBufferRange);
    }

    public void srcBufferRange(@unsigned long value) {
        segment.set(LAYOUT$srcBufferRange, OFFSET$srcBufferRange, value);
    }

    public VkVideoPictureResourceInfoKHR dstPictureResource() {
        return new VkVideoPictureResourceInfoKHR(segment.asSlice(OFFSET$dstPictureResource, LAYOUT$dstPictureResource));
    }

    public void dstPictureResource(VkVideoPictureResourceInfoKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$dstPictureResource, SIZE$dstPictureResource);
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

}
