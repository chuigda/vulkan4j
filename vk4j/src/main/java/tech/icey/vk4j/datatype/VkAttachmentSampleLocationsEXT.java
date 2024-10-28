package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkAttachmentSampleLocationsEXT {
///     uint32_t attachmentIndex;
///     VkSampleLocationsInfoEXT sampleLocationsInfo;
/// } VkAttachmentSampleLocationsEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkAttachmentSampleLocationsEXT.html">VkAttachmentSampleLocationsEXT</a>
public record VkAttachmentSampleLocationsEXT(MemorySegment segment) implements IPointer {
    public VkAttachmentSampleLocationsEXT(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int attachmentIndex() {
        return segment.get(LAYOUT$attachmentIndex, OFFSET$attachmentIndex);
    }

    public void attachmentIndex(@unsigned int value) {
        segment.set(LAYOUT$attachmentIndex, OFFSET$attachmentIndex, value);
    }

    public VkSampleLocationsInfoEXT sampleLocationsInfo() {
        return new VkSampleLocationsInfoEXT(segment.asSlice(OFFSET$sampleLocationsInfo, LAYOUT$sampleLocationsInfo));
    }

    public void sampleLocationsInfo(VkSampleLocationsInfoEXT value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$sampleLocationsInfo, SIZE$sampleLocationsInfo);
    }

    public static VkAttachmentSampleLocationsEXT allocate(Arena arena) {
        return new VkAttachmentSampleLocationsEXT(arena.allocate(LAYOUT));
    }

    public static VkAttachmentSampleLocationsEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAttachmentSampleLocationsEXT[] ret = new VkAttachmentSampleLocationsEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkAttachmentSampleLocationsEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkAttachmentSampleLocationsEXT clone(Arena arena, VkAttachmentSampleLocationsEXT src) {
        VkAttachmentSampleLocationsEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAttachmentSampleLocationsEXT[] clone(Arena arena, VkAttachmentSampleLocationsEXT[] src) {
        VkAttachmentSampleLocationsEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("attachmentIndex"),
        VkSampleLocationsInfoEXT.LAYOUT.withName("sampleLocationsInfo")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$attachmentIndex = PathElement.groupElement("attachmentIndex");
    public static final PathElement PATH$sampleLocationsInfo = PathElement.groupElement("sampleLocationsInfo");

    public static final OfInt LAYOUT$attachmentIndex = (OfInt) LAYOUT.select(PATH$attachmentIndex);
    public static final StructLayout LAYOUT$sampleLocationsInfo = (StructLayout) LAYOUT.select(PATH$sampleLocationsInfo);

    public static final long OFFSET$attachmentIndex = LAYOUT.byteOffset(PATH$attachmentIndex);
    public static final long OFFSET$sampleLocationsInfo = LAYOUT.byteOffset(PATH$sampleLocationsInfo);

    public static final long SIZE$attachmentIndex = LAYOUT$attachmentIndex.byteSize();
    public static final long SIZE$sampleLocationsInfo = LAYOUT$sampleLocationsInfo.byteSize();
}
