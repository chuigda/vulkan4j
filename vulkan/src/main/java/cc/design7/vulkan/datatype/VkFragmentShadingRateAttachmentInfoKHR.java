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

public record VkFragmentShadingRateAttachmentInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final AddressLayout LAYOUT$pFragmentShadingRateAttachment = ValueLayout.ADDRESS.withTargetLayout(VkAttachmentReference2.LAYOUT).withName("pFragmentShadingRateAttachment");
    public static final StructLayout LAYOUT$shadingRateAttachmentTexelSize = VkExtent2D.LAYOUT.withName("shadingRateAttachmentTexelSize");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$pFragmentShadingRateAttachment, LAYOUT$shadingRateAttachmentTexelSize);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkFragmentShadingRateAttachmentInfoKHR allocate(Arena arena) {
        return new VkFragmentShadingRateAttachmentInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkFragmentShadingRateAttachmentInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkFragmentShadingRateAttachmentInfoKHR[] ret = new VkFragmentShadingRateAttachmentInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkFragmentShadingRateAttachmentInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkFragmentShadingRateAttachmentInfoKHR clone(Arena arena, VkFragmentShadingRateAttachmentInfoKHR src) {
        VkFragmentShadingRateAttachmentInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkFragmentShadingRateAttachmentInfoKHR[] clone(Arena arena, VkFragmentShadingRateAttachmentInfoKHR[] src) {
        VkFragmentShadingRateAttachmentInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$pFragmentShadingRateAttachment = PathElement.groupElement("PATH$pFragmentShadingRateAttachment");
    public static final PathElement PATH$shadingRateAttachmentTexelSize = PathElement.groupElement("PATH$shadingRateAttachmentTexelSize");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pFragmentShadingRateAttachment = LAYOUT$pFragmentShadingRateAttachment.byteSize();
    public static final long SIZE$shadingRateAttachmentTexelSize = LAYOUT$shadingRateAttachmentTexelSize.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pFragmentShadingRateAttachment = LAYOUT.byteOffset(PATH$pFragmentShadingRateAttachment);
    public static final long OFFSET$shadingRateAttachmentTexelSize = LAYOUT.byteOffset(PATH$shadingRateAttachmentTexelSize);

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

    public @pointer(comment="VkAttachmentReference2*") MemorySegment pFragmentShadingRateAttachmentRaw() {
        return segment.get(LAYOUT$pFragmentShadingRateAttachment, OFFSET$pFragmentShadingRateAttachment);
    }

    public void pFragmentShadingRateAttachmentRaw(@pointer(comment="VkAttachmentReference2*") MemorySegment value) {
        segment.set(LAYOUT$pFragmentShadingRateAttachment, OFFSET$pFragmentShadingRateAttachment, value);
    }

    public @Nullable VkAttachmentReference2 pFragmentShadingRateAttachment() {
        MemorySegment s = pFragmentShadingRateAttachmentRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkAttachmentReference2(s);
    }

    public void pFragmentShadingRateAttachment(@Nullable VkAttachmentReference2 value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pFragmentShadingRateAttachmentRaw(s);
    }

    @unsafe public @Nullable VkAttachmentReference2[] pFragmentShadingRateAttachment(int assumedCount) {
        MemorySegment s = pFragmentShadingRateAttachmentRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkAttachmentReference2.SIZE);
        VkAttachmentReference2[] ret = new VkAttachmentReference2[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkAttachmentReference2(s.asSlice(i * VkAttachmentReference2.SIZE, VkAttachmentReference2.SIZE));
        }
        return ret;
    }

    public VkExtent2D shadingRateAttachmentTexelSize() {
        return new VkExtent2D(segment.asSlice(OFFSET$shadingRateAttachmentTexelSize, LAYOUT$shadingRateAttachmentTexelSize));
    }

    public void shadingRateAttachmentTexelSize(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$shadingRateAttachmentTexelSize, SIZE$shadingRateAttachmentTexelSize);
    }

}
/// dummy, not implemented yet
