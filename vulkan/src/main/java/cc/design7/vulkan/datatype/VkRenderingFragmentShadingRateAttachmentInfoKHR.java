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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkRenderingFragmentShadingRateAttachmentInfoKHR.html">VkRenderingFragmentShadingRateAttachmentInfoKHR</a>
@ValueBasedCandidate
public record VkRenderingFragmentShadingRateAttachmentInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final AddressLayout LAYOUT$imageView = ValueLayout.ADDRESS.withName("imageView");
    public static final OfInt LAYOUT$imageLayout = ValueLayout.JAVA_INT.withName("imageLayout");
    public static final StructLayout LAYOUT$shadingRateAttachmentTexelSize = VkExtent2D.LAYOUT.withName("shadingRateAttachmentTexelSize");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$imageView, LAYOUT$imageLayout, LAYOUT$shadingRateAttachmentTexelSize);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkRenderingFragmentShadingRateAttachmentInfoKHR allocate(Arena arena) {
        return new VkRenderingFragmentShadingRateAttachmentInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkRenderingFragmentShadingRateAttachmentInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRenderingFragmentShadingRateAttachmentInfoKHR[] ret = new VkRenderingFragmentShadingRateAttachmentInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkRenderingFragmentShadingRateAttachmentInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkRenderingFragmentShadingRateAttachmentInfoKHR clone(Arena arena, VkRenderingFragmentShadingRateAttachmentInfoKHR src) {
        VkRenderingFragmentShadingRateAttachmentInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkRenderingFragmentShadingRateAttachmentInfoKHR[] clone(Arena arena, VkRenderingFragmentShadingRateAttachmentInfoKHR[] src) {
        VkRenderingFragmentShadingRateAttachmentInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$imageView = PathElement.groupElement("PATH$imageView");
    public static final PathElement PATH$imageLayout = PathElement.groupElement("PATH$imageLayout");
    public static final PathElement PATH$shadingRateAttachmentTexelSize = PathElement.groupElement("PATH$shadingRateAttachmentTexelSize");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$imageView = LAYOUT$imageView.byteSize();
    public static final long SIZE$imageLayout = LAYOUT$imageLayout.byteSize();
    public static final long SIZE$shadingRateAttachmentTexelSize = LAYOUT$shadingRateAttachmentTexelSize.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$imageView = LAYOUT.byteOffset(PATH$imageView);
    public static final long OFFSET$imageLayout = LAYOUT.byteOffset(PATH$imageLayout);
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

    public @Nullable VkImageView imageView() {
        MemorySegment s = segment.asSlice(OFFSET$imageView, SIZE$imageView);
        if (s.address() == 0) {
            return null;
        }
        return new VkImageView(s);
    }

    public void imageView(@Nullable VkImageView value) {
        segment.set(LAYOUT$imageView, OFFSET$imageView, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @enumtype(VkImageLayout.class) int imageLayout() {
        return segment.get(LAYOUT$imageLayout, OFFSET$imageLayout);
    }

    public void imageLayout(@enumtype(VkImageLayout.class) int value) {
        segment.set(LAYOUT$imageLayout, OFFSET$imageLayout, value);
    }

    public VkExtent2D shadingRateAttachmentTexelSize() {
        return new VkExtent2D(segment.asSlice(OFFSET$shadingRateAttachmentTexelSize, LAYOUT$shadingRateAttachmentTexelSize));
    }

    public void shadingRateAttachmentTexelSize(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$shadingRateAttachmentTexelSize, SIZE$shadingRateAttachmentTexelSize);
    }

}
