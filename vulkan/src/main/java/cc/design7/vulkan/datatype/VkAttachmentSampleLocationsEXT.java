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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAttachmentSampleLocationsEXT.html">VkAttachmentSampleLocationsEXT</a>
@ValueBasedCandidate
public record VkAttachmentSampleLocationsEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$attachmentIndex = ValueLayout.JAVA_INT.withName("attachmentIndex");
    public static final StructLayout LAYOUT$sampleLocationsInfo = VkSampleLocationsInfoEXT.LAYOUT.withName("sampleLocationsInfo");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$attachmentIndex, LAYOUT$sampleLocationsInfo);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkAttachmentSampleLocationsEXT allocate(Arena arena) {
        return new VkAttachmentSampleLocationsEXT(arena.allocate(LAYOUT));
    }

    public static VkAttachmentSampleLocationsEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAttachmentSampleLocationsEXT[] ret = new VkAttachmentSampleLocationsEXT[count];
        for (int i = 0; i < count; i ++) {
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$attachmentIndex = PathElement.groupElement("PATH$attachmentIndex");
    public static final PathElement PATH$sampleLocationsInfo = PathElement.groupElement("PATH$sampleLocationsInfo");

    public static final long SIZE$attachmentIndex = LAYOUT$attachmentIndex.byteSize();
    public static final long SIZE$sampleLocationsInfo = LAYOUT$sampleLocationsInfo.byteSize();

    public static final long OFFSET$attachmentIndex = LAYOUT.byteOffset(PATH$attachmentIndex);
    public static final long OFFSET$sampleLocationsInfo = LAYOUT.byteOffset(PATH$sampleLocationsInfo);

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

}
