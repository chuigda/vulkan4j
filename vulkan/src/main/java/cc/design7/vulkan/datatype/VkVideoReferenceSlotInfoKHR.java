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

public record VkVideoReferenceSlotInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$slotIndex = ValueLayout.JAVA_INT.withName("slotIndex");
    public static final AddressLayout LAYOUT$pPictureResource = ValueLayout.ADDRESS.withTargetLayout(VkVideoPictureResourceInfoKHR.LAYOUT).withName("pPictureResource");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$slotIndex, LAYOUT$pPictureResource);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkVideoReferenceSlotInfoKHR allocate(Arena arena) {
        return new VkVideoReferenceSlotInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoReferenceSlotInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoReferenceSlotInfoKHR[] ret = new VkVideoReferenceSlotInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoReferenceSlotInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkVideoReferenceSlotInfoKHR clone(Arena arena, VkVideoReferenceSlotInfoKHR src) {
        VkVideoReferenceSlotInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoReferenceSlotInfoKHR[] clone(Arena arena, VkVideoReferenceSlotInfoKHR[] src) {
        VkVideoReferenceSlotInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$slotIndex = PathElement.groupElement("PATH$slotIndex");
    public static final PathElement PATH$pPictureResource = PathElement.groupElement("PATH$pPictureResource");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$slotIndex = LAYOUT$slotIndex.byteSize();
    public static final long SIZE$pPictureResource = LAYOUT$pPictureResource.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$slotIndex = LAYOUT.byteOffset(PATH$slotIndex);
    public static final long OFFSET$pPictureResource = LAYOUT.byteOffset(PATH$pPictureResource);

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

    public int slotIndex() {
        return segment.get(LAYOUT$slotIndex, OFFSET$slotIndex);
    }

    public void slotIndex(int value) {
        segment.set(LAYOUT$slotIndex, OFFSET$slotIndex, value);
    }

    public @pointer(comment="VkVideoPictureResourceInfoKHR*") MemorySegment pPictureResourceRaw() {
        return segment.get(LAYOUT$pPictureResource, OFFSET$pPictureResource);
    }

    public void pPictureResourceRaw(@pointer(comment="VkVideoPictureResourceInfoKHR*") MemorySegment value) {
        segment.set(LAYOUT$pPictureResource, OFFSET$pPictureResource, value);
    }

    public @Nullable VkVideoPictureResourceInfoKHR pPictureResource() {
        MemorySegment s = pPictureResourceRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkVideoPictureResourceInfoKHR(s);
    }

    public void pPictureResource(@Nullable VkVideoPictureResourceInfoKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPictureResourceRaw(s);
    }

    @unsafe public @Nullable VkVideoPictureResourceInfoKHR[] pPictureResource(int assumedCount) {
        MemorySegment s = pPictureResourceRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkVideoPictureResourceInfoKHR.SIZE);
        VkVideoPictureResourceInfoKHR[] ret = new VkVideoPictureResourceInfoKHR[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkVideoPictureResourceInfoKHR(s.asSlice(i * VkVideoPictureResourceInfoKHR.SIZE, VkVideoPictureResourceInfoKHR.SIZE));
        }
        return ret;
    }

}
/// dummy, not implemented yet
