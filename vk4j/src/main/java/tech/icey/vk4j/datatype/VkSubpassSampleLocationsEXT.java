package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.unsigned;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;

/// {@snippet lang=c :
/// typedef struct VkSubpassSampleLocationsEXT {
///     uint32_t subpassIndex;
///     VkSampleLocationsInfoEXT sampleLocationsInfo;
/// } VkSubpassSampleLocationsEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkSubpassSampleLocationsEXT.html">VkSubpassSampleLocationsEXT</a>
public record VkSubpassSampleLocationsEXT(MemorySegment segment) implements IPointer {
    public VkSubpassSampleLocationsEXT(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int subpassIndex() {
        return segment.get(LAYOUT$subpassIndex, OFFSET$subpassIndex);
    }

    public void subpassIndex(@unsigned int value) {
        segment.set(LAYOUT$subpassIndex, OFFSET$subpassIndex, value);
    }

    public VkSampleLocationsInfoEXT sampleLocationsInfo() {
        return new VkSampleLocationsInfoEXT(segment.asSlice(OFFSET$sampleLocationsInfo, LAYOUT$sampleLocationsInfo));
    }

    public void sampleLocationsInfo(VkSampleLocationsInfoEXT value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$sampleLocationsInfo, SIZE$sampleLocationsInfo);
    }

    public static VkSubpassSampleLocationsEXT allocate(Arena arena) {
        return new VkSubpassSampleLocationsEXT(arena.allocate(LAYOUT));
    }

    public static VkSubpassSampleLocationsEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSubpassSampleLocationsEXT[] ret = new VkSubpassSampleLocationsEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkSubpassSampleLocationsEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSubpassSampleLocationsEXT clone(Arena arena, VkSubpassSampleLocationsEXT src) {
        VkSubpassSampleLocationsEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSubpassSampleLocationsEXT[] clone(Arena arena, VkSubpassSampleLocationsEXT[] src) {
        VkSubpassSampleLocationsEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("subpassIndex"),
        VkSampleLocationsInfoEXT.LAYOUT.withName("sampleLocationsInfo")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$subpassIndex = PathElement.groupElement("subpassIndex");
    public static final PathElement PATH$sampleLocationsInfo = PathElement.groupElement("sampleLocationsInfo");

    public static final OfInt LAYOUT$subpassIndex = (OfInt) LAYOUT.select(PATH$subpassIndex);
    public static final StructLayout LAYOUT$sampleLocationsInfo = (StructLayout) LAYOUT.select(PATH$sampleLocationsInfo);

    public static final long OFFSET$subpassIndex = LAYOUT.byteOffset(PATH$subpassIndex);
    public static final long OFFSET$sampleLocationsInfo = LAYOUT.byteOffset(PATH$sampleLocationsInfo);

    public static final long SIZE$subpassIndex = LAYOUT$subpassIndex.byteSize();
    public static final long SIZE$sampleLocationsInfo = LAYOUT$sampleLocationsInfo.byteSize();
}
