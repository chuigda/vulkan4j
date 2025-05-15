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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImageViewHandleInfoNVX.html">VkImageViewHandleInfoNVX</a>
@ValueBasedCandidate
public record VkImageViewHandleInfoNVX(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final AddressLayout LAYOUT$imageView = ValueLayout.ADDRESS.withName("imageView");
    public static final OfInt LAYOUT$descriptorType = ValueLayout.JAVA_INT.withName("descriptorType");
    public static final AddressLayout LAYOUT$sampler = ValueLayout.ADDRESS.withName("sampler");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$imageView, LAYOUT$descriptorType, LAYOUT$sampler);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkImageViewHandleInfoNVX allocate(Arena arena) {
        return new VkImageViewHandleInfoNVX(arena.allocate(LAYOUT));
    }

    public static VkImageViewHandleInfoNVX[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageViewHandleInfoNVX[] ret = new VkImageViewHandleInfoNVX[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkImageViewHandleInfoNVX(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkImageViewHandleInfoNVX clone(Arena arena, VkImageViewHandleInfoNVX src) {
        VkImageViewHandleInfoNVX ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkImageViewHandleInfoNVX[] clone(Arena arena, VkImageViewHandleInfoNVX[] src) {
        VkImageViewHandleInfoNVX[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$imageView = PathElement.groupElement("PATH$imageView");
    public static final PathElement PATH$descriptorType = PathElement.groupElement("PATH$descriptorType");
    public static final PathElement PATH$sampler = PathElement.groupElement("PATH$sampler");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$imageView = LAYOUT$imageView.byteSize();
    public static final long SIZE$descriptorType = LAYOUT$descriptorType.byteSize();
    public static final long SIZE$sampler = LAYOUT$sampler.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$imageView = LAYOUT.byteOffset(PATH$imageView);
    public static final long OFFSET$descriptorType = LAYOUT.byteOffset(PATH$descriptorType);
    public static final long OFFSET$sampler = LAYOUT.byteOffset(PATH$sampler);

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

    public @enumtype(VkDescriptorType.class) int descriptorType() {
        return segment.get(LAYOUT$descriptorType, OFFSET$descriptorType);
    }

    public void descriptorType(@enumtype(VkDescriptorType.class) int value) {
        segment.set(LAYOUT$descriptorType, OFFSET$descriptorType, value);
    }

    public @Nullable VkSampler sampler() {
        MemorySegment s = segment.asSlice(OFFSET$sampler, SIZE$sampler);
        if (s.address() == 0) {
            return null;
        }
        return new VkSampler(s);
    }

    public void sampler(@Nullable VkSampler value) {
        segment.set(LAYOUT$sampler, OFFSET$sampler, value != null ? value.segment() : MemorySegment.NULL);
    }

}
