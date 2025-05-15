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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceTransformFeedbackPropertiesEXT.html">VkPhysicalDeviceTransformFeedbackPropertiesEXT</a>
@ValueBasedCandidate
public record VkPhysicalDeviceTransformFeedbackPropertiesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$maxTransformFeedbackStreams = ValueLayout.JAVA_INT.withName("maxTransformFeedbackStreams");
    public static final OfInt LAYOUT$maxTransformFeedbackBuffers = ValueLayout.JAVA_INT.withName("maxTransformFeedbackBuffers");
    public static final OfLong LAYOUT$maxTransformFeedbackBufferSize = ValueLayout.JAVA_LONG.withName("maxTransformFeedbackBufferSize");
    public static final OfInt LAYOUT$maxTransformFeedbackStreamDataSize = ValueLayout.JAVA_INT.withName("maxTransformFeedbackStreamDataSize");
    public static final OfInt LAYOUT$maxTransformFeedbackBufferDataSize = ValueLayout.JAVA_INT.withName("maxTransformFeedbackBufferDataSize");
    public static final OfInt LAYOUT$maxTransformFeedbackBufferDataStride = ValueLayout.JAVA_INT.withName("maxTransformFeedbackBufferDataStride");
    public static final OfInt LAYOUT$transformFeedbackQueries = ValueLayout.JAVA_INT.withName("transformFeedbackQueries");
    public static final OfInt LAYOUT$transformFeedbackStreamsLinesTriangles = ValueLayout.JAVA_INT.withName("transformFeedbackStreamsLinesTriangles");
    public static final OfInt LAYOUT$transformFeedbackRasterizationStreamSelect = ValueLayout.JAVA_INT.withName("transformFeedbackRasterizationStreamSelect");
    public static final OfInt LAYOUT$transformFeedbackDraw = ValueLayout.JAVA_INT.withName("transformFeedbackDraw");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$maxTransformFeedbackStreams, LAYOUT$maxTransformFeedbackBuffers, LAYOUT$maxTransformFeedbackBufferSize, LAYOUT$maxTransformFeedbackStreamDataSize, LAYOUT$maxTransformFeedbackBufferDataSize, LAYOUT$maxTransformFeedbackBufferDataStride, LAYOUT$transformFeedbackQueries, LAYOUT$transformFeedbackStreamsLinesTriangles, LAYOUT$transformFeedbackRasterizationStreamSelect, LAYOUT$transformFeedbackDraw);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceTransformFeedbackPropertiesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceTransformFeedbackPropertiesEXT[] ret = new VkPhysicalDeviceTransformFeedbackPropertiesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceTransformFeedbackPropertiesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT clone(Arena arena, VkPhysicalDeviceTransformFeedbackPropertiesEXT src) {
        VkPhysicalDeviceTransformFeedbackPropertiesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceTransformFeedbackPropertiesEXT[] clone(Arena arena, VkPhysicalDeviceTransformFeedbackPropertiesEXT[] src) {
        VkPhysicalDeviceTransformFeedbackPropertiesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$maxTransformFeedbackStreams = PathElement.groupElement("PATH$maxTransformFeedbackStreams");
    public static final PathElement PATH$maxTransformFeedbackBuffers = PathElement.groupElement("PATH$maxTransformFeedbackBuffers");
    public static final PathElement PATH$maxTransformFeedbackBufferSize = PathElement.groupElement("PATH$maxTransformFeedbackBufferSize");
    public static final PathElement PATH$maxTransformFeedbackStreamDataSize = PathElement.groupElement("PATH$maxTransformFeedbackStreamDataSize");
    public static final PathElement PATH$maxTransformFeedbackBufferDataSize = PathElement.groupElement("PATH$maxTransformFeedbackBufferDataSize");
    public static final PathElement PATH$maxTransformFeedbackBufferDataStride = PathElement.groupElement("PATH$maxTransformFeedbackBufferDataStride");
    public static final PathElement PATH$transformFeedbackQueries = PathElement.groupElement("PATH$transformFeedbackQueries");
    public static final PathElement PATH$transformFeedbackStreamsLinesTriangles = PathElement.groupElement("PATH$transformFeedbackStreamsLinesTriangles");
    public static final PathElement PATH$transformFeedbackRasterizationStreamSelect = PathElement.groupElement("PATH$transformFeedbackRasterizationStreamSelect");
    public static final PathElement PATH$transformFeedbackDraw = PathElement.groupElement("PATH$transformFeedbackDraw");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maxTransformFeedbackStreams = LAYOUT$maxTransformFeedbackStreams.byteSize();
    public static final long SIZE$maxTransformFeedbackBuffers = LAYOUT$maxTransformFeedbackBuffers.byteSize();
    public static final long SIZE$maxTransformFeedbackBufferSize = LAYOUT$maxTransformFeedbackBufferSize.byteSize();
    public static final long SIZE$maxTransformFeedbackStreamDataSize = LAYOUT$maxTransformFeedbackStreamDataSize.byteSize();
    public static final long SIZE$maxTransformFeedbackBufferDataSize = LAYOUT$maxTransformFeedbackBufferDataSize.byteSize();
    public static final long SIZE$maxTransformFeedbackBufferDataStride = LAYOUT$maxTransformFeedbackBufferDataStride.byteSize();
    public static final long SIZE$transformFeedbackQueries = LAYOUT$transformFeedbackQueries.byteSize();
    public static final long SIZE$transformFeedbackStreamsLinesTriangles = LAYOUT$transformFeedbackStreamsLinesTriangles.byteSize();
    public static final long SIZE$transformFeedbackRasterizationStreamSelect = LAYOUT$transformFeedbackRasterizationStreamSelect.byteSize();
    public static final long SIZE$transformFeedbackDraw = LAYOUT$transformFeedbackDraw.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxTransformFeedbackStreams = LAYOUT.byteOffset(PATH$maxTransformFeedbackStreams);
    public static final long OFFSET$maxTransformFeedbackBuffers = LAYOUT.byteOffset(PATH$maxTransformFeedbackBuffers);
    public static final long OFFSET$maxTransformFeedbackBufferSize = LAYOUT.byteOffset(PATH$maxTransformFeedbackBufferSize);
    public static final long OFFSET$maxTransformFeedbackStreamDataSize = LAYOUT.byteOffset(PATH$maxTransformFeedbackStreamDataSize);
    public static final long OFFSET$maxTransformFeedbackBufferDataSize = LAYOUT.byteOffset(PATH$maxTransformFeedbackBufferDataSize);
    public static final long OFFSET$maxTransformFeedbackBufferDataStride = LAYOUT.byteOffset(PATH$maxTransformFeedbackBufferDataStride);
    public static final long OFFSET$transformFeedbackQueries = LAYOUT.byteOffset(PATH$transformFeedbackQueries);
    public static final long OFFSET$transformFeedbackStreamsLinesTriangles = LAYOUT.byteOffset(PATH$transformFeedbackStreamsLinesTriangles);
    public static final long OFFSET$transformFeedbackRasterizationStreamSelect = LAYOUT.byteOffset(PATH$transformFeedbackRasterizationStreamSelect);
    public static final long OFFSET$transformFeedbackDraw = LAYOUT.byteOffset(PATH$transformFeedbackDraw);

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

    public @unsigned int maxTransformFeedbackStreams() {
        return segment.get(LAYOUT$maxTransformFeedbackStreams, OFFSET$maxTransformFeedbackStreams);
    }

    public void maxTransformFeedbackStreams(@unsigned int value) {
        segment.set(LAYOUT$maxTransformFeedbackStreams, OFFSET$maxTransformFeedbackStreams, value);
    }

    public @unsigned int maxTransformFeedbackBuffers() {
        return segment.get(LAYOUT$maxTransformFeedbackBuffers, OFFSET$maxTransformFeedbackBuffers);
    }

    public void maxTransformFeedbackBuffers(@unsigned int value) {
        segment.set(LAYOUT$maxTransformFeedbackBuffers, OFFSET$maxTransformFeedbackBuffers, value);
    }

    public @unsigned long maxTransformFeedbackBufferSize() {
        return segment.get(LAYOUT$maxTransformFeedbackBufferSize, OFFSET$maxTransformFeedbackBufferSize);
    }

    public void maxTransformFeedbackBufferSize(@unsigned long value) {
        segment.set(LAYOUT$maxTransformFeedbackBufferSize, OFFSET$maxTransformFeedbackBufferSize, value);
    }

    public @unsigned int maxTransformFeedbackStreamDataSize() {
        return segment.get(LAYOUT$maxTransformFeedbackStreamDataSize, OFFSET$maxTransformFeedbackStreamDataSize);
    }

    public void maxTransformFeedbackStreamDataSize(@unsigned int value) {
        segment.set(LAYOUT$maxTransformFeedbackStreamDataSize, OFFSET$maxTransformFeedbackStreamDataSize, value);
    }

    public @unsigned int maxTransformFeedbackBufferDataSize() {
        return segment.get(LAYOUT$maxTransformFeedbackBufferDataSize, OFFSET$maxTransformFeedbackBufferDataSize);
    }

    public void maxTransformFeedbackBufferDataSize(@unsigned int value) {
        segment.set(LAYOUT$maxTransformFeedbackBufferDataSize, OFFSET$maxTransformFeedbackBufferDataSize, value);
    }

    public @unsigned int maxTransformFeedbackBufferDataStride() {
        return segment.get(LAYOUT$maxTransformFeedbackBufferDataStride, OFFSET$maxTransformFeedbackBufferDataStride);
    }

    public void maxTransformFeedbackBufferDataStride(@unsigned int value) {
        segment.set(LAYOUT$maxTransformFeedbackBufferDataStride, OFFSET$maxTransformFeedbackBufferDataStride, value);
    }

    public @unsigned int transformFeedbackQueries() {
        return segment.get(LAYOUT$transformFeedbackQueries, OFFSET$transformFeedbackQueries);
    }

    public void transformFeedbackQueries(@unsigned int value) {
        segment.set(LAYOUT$transformFeedbackQueries, OFFSET$transformFeedbackQueries, value);
    }

    public @unsigned int transformFeedbackStreamsLinesTriangles() {
        return segment.get(LAYOUT$transformFeedbackStreamsLinesTriangles, OFFSET$transformFeedbackStreamsLinesTriangles);
    }

    public void transformFeedbackStreamsLinesTriangles(@unsigned int value) {
        segment.set(LAYOUT$transformFeedbackStreamsLinesTriangles, OFFSET$transformFeedbackStreamsLinesTriangles, value);
    }

    public @unsigned int transformFeedbackRasterizationStreamSelect() {
        return segment.get(LAYOUT$transformFeedbackRasterizationStreamSelect, OFFSET$transformFeedbackRasterizationStreamSelect);
    }

    public void transformFeedbackRasterizationStreamSelect(@unsigned int value) {
        segment.set(LAYOUT$transformFeedbackRasterizationStreamSelect, OFFSET$transformFeedbackRasterizationStreamSelect, value);
    }

    public @unsigned int transformFeedbackDraw() {
        return segment.get(LAYOUT$transformFeedbackDraw, OFFSET$transformFeedbackDraw);
    }

    public void transformFeedbackDraw(@unsigned int value) {
        segment.set(LAYOUT$transformFeedbackDraw, OFFSET$transformFeedbackDraw, value);
    }

}
