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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV.html">VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV</a>
@ValueBasedCandidate
public record VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$maxGraphicsShaderGroupCount = ValueLayout.JAVA_INT.withName("maxGraphicsShaderGroupCount");
    public static final OfInt LAYOUT$maxIndirectSequenceCount = ValueLayout.JAVA_INT.withName("maxIndirectSequenceCount");
    public static final OfInt LAYOUT$maxIndirectCommandsTokenCount = ValueLayout.JAVA_INT.withName("maxIndirectCommandsTokenCount");
    public static final OfInt LAYOUT$maxIndirectCommandsStreamCount = ValueLayout.JAVA_INT.withName("maxIndirectCommandsStreamCount");
    public static final OfInt LAYOUT$maxIndirectCommandsTokenOffset = ValueLayout.JAVA_INT.withName("maxIndirectCommandsTokenOffset");
    public static final OfInt LAYOUT$maxIndirectCommandsStreamStride = ValueLayout.JAVA_INT.withName("maxIndirectCommandsStreamStride");
    public static final OfInt LAYOUT$minSequencesCountBufferOffsetAlignment = ValueLayout.JAVA_INT.withName("minSequencesCountBufferOffsetAlignment");
    public static final OfInt LAYOUT$minSequencesIndexBufferOffsetAlignment = ValueLayout.JAVA_INT.withName("minSequencesIndexBufferOffsetAlignment");
    public static final OfInt LAYOUT$minIndirectCommandsBufferOffsetAlignment = ValueLayout.JAVA_INT.withName("minIndirectCommandsBufferOffsetAlignment");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$maxGraphicsShaderGroupCount, LAYOUT$maxIndirectSequenceCount, LAYOUT$maxIndirectCommandsTokenCount, LAYOUT$maxIndirectCommandsStreamCount, LAYOUT$maxIndirectCommandsTokenOffset, LAYOUT$maxIndirectCommandsStreamStride, LAYOUT$minSequencesCountBufferOffsetAlignment, LAYOUT$minSequencesIndexBufferOffsetAlignment, LAYOUT$minIndirectCommandsBufferOffsetAlignment);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV allocate(Arena arena) {
        return new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV[] ret = new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV clone(Arena arena, VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV src) {
        VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV[] clone(Arena arena, VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV[] src) {
        VkPhysicalDeviceDeviceGeneratedCommandsPropertiesNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$maxGraphicsShaderGroupCount = PathElement.groupElement("PATH$maxGraphicsShaderGroupCount");
    public static final PathElement PATH$maxIndirectSequenceCount = PathElement.groupElement("PATH$maxIndirectSequenceCount");
    public static final PathElement PATH$maxIndirectCommandsTokenCount = PathElement.groupElement("PATH$maxIndirectCommandsTokenCount");
    public static final PathElement PATH$maxIndirectCommandsStreamCount = PathElement.groupElement("PATH$maxIndirectCommandsStreamCount");
    public static final PathElement PATH$maxIndirectCommandsTokenOffset = PathElement.groupElement("PATH$maxIndirectCommandsTokenOffset");
    public static final PathElement PATH$maxIndirectCommandsStreamStride = PathElement.groupElement("PATH$maxIndirectCommandsStreamStride");
    public static final PathElement PATH$minSequencesCountBufferOffsetAlignment = PathElement.groupElement("PATH$minSequencesCountBufferOffsetAlignment");
    public static final PathElement PATH$minSequencesIndexBufferOffsetAlignment = PathElement.groupElement("PATH$minSequencesIndexBufferOffsetAlignment");
    public static final PathElement PATH$minIndirectCommandsBufferOffsetAlignment = PathElement.groupElement("PATH$minIndirectCommandsBufferOffsetAlignment");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maxGraphicsShaderGroupCount = LAYOUT$maxGraphicsShaderGroupCount.byteSize();
    public static final long SIZE$maxIndirectSequenceCount = LAYOUT$maxIndirectSequenceCount.byteSize();
    public static final long SIZE$maxIndirectCommandsTokenCount = LAYOUT$maxIndirectCommandsTokenCount.byteSize();
    public static final long SIZE$maxIndirectCommandsStreamCount = LAYOUT$maxIndirectCommandsStreamCount.byteSize();
    public static final long SIZE$maxIndirectCommandsTokenOffset = LAYOUT$maxIndirectCommandsTokenOffset.byteSize();
    public static final long SIZE$maxIndirectCommandsStreamStride = LAYOUT$maxIndirectCommandsStreamStride.byteSize();
    public static final long SIZE$minSequencesCountBufferOffsetAlignment = LAYOUT$minSequencesCountBufferOffsetAlignment.byteSize();
    public static final long SIZE$minSequencesIndexBufferOffsetAlignment = LAYOUT$minSequencesIndexBufferOffsetAlignment.byteSize();
    public static final long SIZE$minIndirectCommandsBufferOffsetAlignment = LAYOUT$minIndirectCommandsBufferOffsetAlignment.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxGraphicsShaderGroupCount = LAYOUT.byteOffset(PATH$maxGraphicsShaderGroupCount);
    public static final long OFFSET$maxIndirectSequenceCount = LAYOUT.byteOffset(PATH$maxIndirectSequenceCount);
    public static final long OFFSET$maxIndirectCommandsTokenCount = LAYOUT.byteOffset(PATH$maxIndirectCommandsTokenCount);
    public static final long OFFSET$maxIndirectCommandsStreamCount = LAYOUT.byteOffset(PATH$maxIndirectCommandsStreamCount);
    public static final long OFFSET$maxIndirectCommandsTokenOffset = LAYOUT.byteOffset(PATH$maxIndirectCommandsTokenOffset);
    public static final long OFFSET$maxIndirectCommandsStreamStride = LAYOUT.byteOffset(PATH$maxIndirectCommandsStreamStride);
    public static final long OFFSET$minSequencesCountBufferOffsetAlignment = LAYOUT.byteOffset(PATH$minSequencesCountBufferOffsetAlignment);
    public static final long OFFSET$minSequencesIndexBufferOffsetAlignment = LAYOUT.byteOffset(PATH$minSequencesIndexBufferOffsetAlignment);
    public static final long OFFSET$minIndirectCommandsBufferOffsetAlignment = LAYOUT.byteOffset(PATH$minIndirectCommandsBufferOffsetAlignment);

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

    public @unsigned int maxGraphicsShaderGroupCount() {
        return segment.get(LAYOUT$maxGraphicsShaderGroupCount, OFFSET$maxGraphicsShaderGroupCount);
    }

    public void maxGraphicsShaderGroupCount(@unsigned int value) {
        segment.set(LAYOUT$maxGraphicsShaderGroupCount, OFFSET$maxGraphicsShaderGroupCount, value);
    }

    public @unsigned int maxIndirectSequenceCount() {
        return segment.get(LAYOUT$maxIndirectSequenceCount, OFFSET$maxIndirectSequenceCount);
    }

    public void maxIndirectSequenceCount(@unsigned int value) {
        segment.set(LAYOUT$maxIndirectSequenceCount, OFFSET$maxIndirectSequenceCount, value);
    }

    public @unsigned int maxIndirectCommandsTokenCount() {
        return segment.get(LAYOUT$maxIndirectCommandsTokenCount, OFFSET$maxIndirectCommandsTokenCount);
    }

    public void maxIndirectCommandsTokenCount(@unsigned int value) {
        segment.set(LAYOUT$maxIndirectCommandsTokenCount, OFFSET$maxIndirectCommandsTokenCount, value);
    }

    public @unsigned int maxIndirectCommandsStreamCount() {
        return segment.get(LAYOUT$maxIndirectCommandsStreamCount, OFFSET$maxIndirectCommandsStreamCount);
    }

    public void maxIndirectCommandsStreamCount(@unsigned int value) {
        segment.set(LAYOUT$maxIndirectCommandsStreamCount, OFFSET$maxIndirectCommandsStreamCount, value);
    }

    public @unsigned int maxIndirectCommandsTokenOffset() {
        return segment.get(LAYOUT$maxIndirectCommandsTokenOffset, OFFSET$maxIndirectCommandsTokenOffset);
    }

    public void maxIndirectCommandsTokenOffset(@unsigned int value) {
        segment.set(LAYOUT$maxIndirectCommandsTokenOffset, OFFSET$maxIndirectCommandsTokenOffset, value);
    }

    public @unsigned int maxIndirectCommandsStreamStride() {
        return segment.get(LAYOUT$maxIndirectCommandsStreamStride, OFFSET$maxIndirectCommandsStreamStride);
    }

    public void maxIndirectCommandsStreamStride(@unsigned int value) {
        segment.set(LAYOUT$maxIndirectCommandsStreamStride, OFFSET$maxIndirectCommandsStreamStride, value);
    }

    public @unsigned int minSequencesCountBufferOffsetAlignment() {
        return segment.get(LAYOUT$minSequencesCountBufferOffsetAlignment, OFFSET$minSequencesCountBufferOffsetAlignment);
    }

    public void minSequencesCountBufferOffsetAlignment(@unsigned int value) {
        segment.set(LAYOUT$minSequencesCountBufferOffsetAlignment, OFFSET$minSequencesCountBufferOffsetAlignment, value);
    }

    public @unsigned int minSequencesIndexBufferOffsetAlignment() {
        return segment.get(LAYOUT$minSequencesIndexBufferOffsetAlignment, OFFSET$minSequencesIndexBufferOffsetAlignment);
    }

    public void minSequencesIndexBufferOffsetAlignment(@unsigned int value) {
        segment.set(LAYOUT$minSequencesIndexBufferOffsetAlignment, OFFSET$minSequencesIndexBufferOffsetAlignment, value);
    }

    public @unsigned int minIndirectCommandsBufferOffsetAlignment() {
        return segment.get(LAYOUT$minIndirectCommandsBufferOffsetAlignment, OFFSET$minIndirectCommandsBufferOffsetAlignment);
    }

    public void minIndirectCommandsBufferOffsetAlignment(@unsigned int value) {
        segment.set(LAYOUT$minIndirectCommandsBufferOffsetAlignment, OFFSET$minIndirectCommandsBufferOffsetAlignment, value);
    }

}
