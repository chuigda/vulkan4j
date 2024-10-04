package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.nullable;
import tech.icey.panama.annotation.pointer;
import tech.icey.vk4j.enumtype.VkDescriptorType;
import tech.icey.vk4j.enumtype.VkStructureType;
import tech.icey.vk4j.handle.VkImageView;
import tech.icey.vk4j.handle.VkSampler;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_IMAGE_VIEW_HANDLE_INFO_NVX;

/// {@snippet lang=c :
/// typedef struct VkImageViewHandleInfoNVX {
///     VkStructureType sType;
///     const void* pNext;
///     VkImageView imageView;
///     VkDescriptorType descriptorType;
///     VkSampler sampler;
/// } VkImageViewHandleInfoNVX;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkImageViewHandleInfoNVX.html">VkImageViewHandleInfoNVX</a>
public record VkImageViewHandleInfoNVX(MemorySegment segment) implements IPointer {
    public VkImageViewHandleInfoNVX(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IMAGE_VIEW_HANDLE_INFO_NVX);
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

    public void pNext(@nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @nullable VkImageView imageView() {
        MemorySegment s = segment.get(LAYOUT$imageView, OFFSET$imageView);
        if (s.address() == 0) {
            return null;
        }
        return new VkImageView(s);
    }

    public void imageView(@nullable VkImageView value) {
        segment.set(
            LAYOUT$imageView,
            OFFSET$imageView,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @enumtype(VkDescriptorType.class) int descriptorType() {
        return segment.get(LAYOUT$descriptorType, OFFSET$descriptorType);
    }

    public void descriptorType(@enumtype(VkDescriptorType.class) int value) {
        segment.set(LAYOUT$descriptorType, OFFSET$descriptorType, value);
    }

    public @nullable VkSampler sampler() {
        MemorySegment s = segment.get(LAYOUT$sampler, OFFSET$sampler);
        if (s.address() == 0) {
            return null;
        }
        return new VkSampler(s);
    }

    public void sampler(@nullable VkSampler value) {
        segment.set(
            LAYOUT$sampler,
            OFFSET$sampler,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public static VkImageViewHandleInfoNVX allocate(Arena arena) {
        return new VkImageViewHandleInfoNVX(arena.allocate(LAYOUT));
    }

    public static VkImageViewHandleInfoNVX[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageViewHandleInfoNVX[] ret = new VkImageViewHandleInfoNVX[count];
        for (int i = 0; i < count; i++) {
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("imageView"),
        ValueLayout.JAVA_INT.withName("descriptorType"),
        ValueLayout.ADDRESS.withName("sampler")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$imageView = PathElement.groupElement("imageView");
    public static final PathElement PATH$descriptorType = PathElement.groupElement("descriptorType");
    public static final PathElement PATH$sampler = PathElement.groupElement("sampler");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$imageView = (AddressLayout) LAYOUT.select(PATH$imageView);
    public static final OfInt LAYOUT$descriptorType = (OfInt) LAYOUT.select(PATH$descriptorType);
    public static final AddressLayout LAYOUT$sampler = (AddressLayout) LAYOUT.select(PATH$sampler);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$imageView = LAYOUT.byteOffset(PATH$imageView);
    public static final long OFFSET$descriptorType = LAYOUT.byteOffset(PATH$descriptorType);
    public static final long OFFSET$sampler = LAYOUT.byteOffset(PATH$sampler);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$imageView = LAYOUT$imageView.byteSize();
    public static final long SIZE$descriptorType = LAYOUT$descriptorType.byteSize();
    public static final long SIZE$sampler = LAYOUT$sampler.byteSize();
}
