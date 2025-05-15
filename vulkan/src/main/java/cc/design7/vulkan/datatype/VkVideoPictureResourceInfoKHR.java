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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoPictureResourceInfoKHR.html">VkVideoPictureResourceInfoKHR</a>
@ValueBasedCandidate
public record VkVideoPictureResourceInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final StructLayout LAYOUT$codedOffset = VkOffset2D.LAYOUT.withName("codedOffset");
    public static final StructLayout LAYOUT$codedExtent = VkExtent2D.LAYOUT.withName("codedExtent");
    public static final OfInt LAYOUT$baseArrayLayer = ValueLayout.JAVA_INT.withName("baseArrayLayer");
    public static final AddressLayout LAYOUT$imageViewBinding = ValueLayout.ADDRESS.withName("imageViewBinding");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$codedOffset, LAYOUT$codedExtent, LAYOUT$baseArrayLayer, LAYOUT$imageViewBinding);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkVideoPictureResourceInfoKHR allocate(Arena arena) {
        return new VkVideoPictureResourceInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoPictureResourceInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoPictureResourceInfoKHR[] ret = new VkVideoPictureResourceInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoPictureResourceInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkVideoPictureResourceInfoKHR clone(Arena arena, VkVideoPictureResourceInfoKHR src) {
        VkVideoPictureResourceInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoPictureResourceInfoKHR[] clone(Arena arena, VkVideoPictureResourceInfoKHR[] src) {
        VkVideoPictureResourceInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$codedOffset = PathElement.groupElement("PATH$codedOffset");
    public static final PathElement PATH$codedExtent = PathElement.groupElement("PATH$codedExtent");
    public static final PathElement PATH$baseArrayLayer = PathElement.groupElement("PATH$baseArrayLayer");
    public static final PathElement PATH$imageViewBinding = PathElement.groupElement("PATH$imageViewBinding");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$codedOffset = LAYOUT$codedOffset.byteSize();
    public static final long SIZE$codedExtent = LAYOUT$codedExtent.byteSize();
    public static final long SIZE$baseArrayLayer = LAYOUT$baseArrayLayer.byteSize();
    public static final long SIZE$imageViewBinding = LAYOUT$imageViewBinding.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$codedOffset = LAYOUT.byteOffset(PATH$codedOffset);
    public static final long OFFSET$codedExtent = LAYOUT.byteOffset(PATH$codedExtent);
    public static final long OFFSET$baseArrayLayer = LAYOUT.byteOffset(PATH$baseArrayLayer);
    public static final long OFFSET$imageViewBinding = LAYOUT.byteOffset(PATH$imageViewBinding);

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

    public VkOffset2D codedOffset() {
        return new VkOffset2D(segment.asSlice(OFFSET$codedOffset, LAYOUT$codedOffset));
    }

    public void codedOffset(VkOffset2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$codedOffset, SIZE$codedOffset);
    }

    public VkExtent2D codedExtent() {
        return new VkExtent2D(segment.asSlice(OFFSET$codedExtent, LAYOUT$codedExtent));
    }

    public void codedExtent(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$codedExtent, SIZE$codedExtent);
    }

    public @unsigned int baseArrayLayer() {
        return segment.get(LAYOUT$baseArrayLayer, OFFSET$baseArrayLayer);
    }

    public void baseArrayLayer(@unsigned int value) {
        segment.set(LAYOUT$baseArrayLayer, OFFSET$baseArrayLayer, value);
    }

    public @Nullable VkImageView imageViewBinding() {
        MemorySegment s = segment.asSlice(OFFSET$imageViewBinding, SIZE$imageViewBinding);
        if (s.address() == 0) {
            return null;
        }
        return new VkImageView(s);
    }

    public void imageViewBinding() {
        segment.set(LAYOUT$imageViewBinding, OFFSET$imageViewBinding, value != null ? value.segment() : MemorySegment.NULL);
    }

}
