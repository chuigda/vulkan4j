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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoBeginCodingInfoKHR.html">VkVideoBeginCodingInfoKHR</a>
@ValueBasedCandidate
public record VkVideoBeginCodingInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final AddressLayout LAYOUT$videoSession = ValueLayout.ADDRESS.withName("videoSession");
    public static final AddressLayout LAYOUT$videoSessionParameters = ValueLayout.ADDRESS.withName("videoSessionParameters");
    public static final OfInt LAYOUT$referenceSlotCount = ValueLayout.JAVA_INT.withName("referenceSlotCount");
    public static final AddressLayout LAYOUT$pReferenceSlots = ValueLayout.ADDRESS.withTargetLayout(VkVideoReferenceSlotInfoKHR.LAYOUT).withName("pReferenceSlots");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$flags, LAYOUT$videoSession, LAYOUT$videoSessionParameters, LAYOUT$referenceSlotCount, LAYOUT$pReferenceSlots);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkVideoBeginCodingInfoKHR allocate(Arena arena) {
        return new VkVideoBeginCodingInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoBeginCodingInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoBeginCodingInfoKHR[] ret = new VkVideoBeginCodingInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoBeginCodingInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkVideoBeginCodingInfoKHR clone(Arena arena, VkVideoBeginCodingInfoKHR src) {
        VkVideoBeginCodingInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoBeginCodingInfoKHR[] clone(Arena arena, VkVideoBeginCodingInfoKHR[] src) {
        VkVideoBeginCodingInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$videoSession = PathElement.groupElement("PATH$videoSession");
    public static final PathElement PATH$videoSessionParameters = PathElement.groupElement("PATH$videoSessionParameters");
    public static final PathElement PATH$referenceSlotCount = PathElement.groupElement("PATH$referenceSlotCount");
    public static final PathElement PATH$pReferenceSlots = PathElement.groupElement("PATH$pReferenceSlots");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$videoSession = LAYOUT$videoSession.byteSize();
    public static final long SIZE$videoSessionParameters = LAYOUT$videoSessionParameters.byteSize();
    public static final long SIZE$referenceSlotCount = LAYOUT$referenceSlotCount.byteSize();
    public static final long SIZE$pReferenceSlots = LAYOUT$pReferenceSlots.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$videoSession = LAYOUT.byteOffset(PATH$videoSession);
    public static final long OFFSET$videoSessionParameters = LAYOUT.byteOffset(PATH$videoSessionParameters);
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

    public @enumtype(VkVideoBeginCodingFlagsKHR.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkVideoBeginCodingFlagsKHR.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @Nullable VkVideoSessionKHR videoSession() {
        MemorySegment s = segment.asSlice(OFFSET$videoSession, SIZE$videoSession);
        if (s.address() == 0) {
            return null;
        }
        return new VkVideoSessionKHR(s);
    }

    public void videoSession(@Nullable VkVideoSessionKHR value) {
        segment.set(LAYOUT$videoSession, OFFSET$videoSession, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @Nullable VkVideoSessionParametersKHR videoSessionParameters() {
        MemorySegment s = segment.asSlice(OFFSET$videoSessionParameters, SIZE$videoSessionParameters);
        if (s.address() == 0) {
            return null;
        }
        return new VkVideoSessionParametersKHR(s);
    }

    public void videoSessionParameters(@Nullable VkVideoSessionParametersKHR value) {
        segment.set(LAYOUT$videoSessionParameters, OFFSET$videoSessionParameters, value != null ? value.segment() : MemorySegment.NULL);
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
