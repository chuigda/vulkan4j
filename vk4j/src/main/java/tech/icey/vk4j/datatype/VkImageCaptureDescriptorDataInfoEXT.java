package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkImageCaptureDescriptorDataInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkImage image;
/// } VkImageCaptureDescriptorDataInfoEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkImageCaptureDescriptorDataInfoEXT.html">VkImageCaptureDescriptorDataInfoEXT</a>
public record VkImageCaptureDescriptorDataInfoEXT(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("image")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$image = PathElement.groupElement("image");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$image = (AddressLayout) LAYOUT.select(PATH$image);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$image = LAYOUT.byteOffset(PATH$image);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$image = LAYOUT$image.byteSize();

    public VkImageCaptureDescriptorDataInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IMAGE_CAPTURE_DESCRIPTOR_DATA_INFO_EXT);
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public VkImage image() {
        return new VkImage(segment.get(LAYOUT$image, OFFSET$image));
    }

    public void image(VkImage value) {
        segment.set(LAYOUT$image, OFFSET$image, value.segment());
    }

    public static VkImageCaptureDescriptorDataInfoEXT allocate(Arena arena) {
        return new VkImageCaptureDescriptorDataInfoEXT(arena.allocate(LAYOUT));
    }
    
    public static VkImageCaptureDescriptorDataInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageCaptureDescriptorDataInfoEXT[] ret = new VkImageCaptureDescriptorDataInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkImageCaptureDescriptorDataInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
