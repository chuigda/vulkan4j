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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH264QualityLevelPropertiesKHR.html">VkVideoEncodeH264QualityLevelPropertiesKHR</a>
@ValueBasedCandidate
public record VkVideoEncodeH264QualityLevelPropertiesKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$preferredRateControlFlags = ValueLayout.JAVA_INT.withName("preferredRateControlFlags");
    public static final OfInt LAYOUT$preferredGopFrameCount = ValueLayout.JAVA_INT.withName("preferredGopFrameCount");
    public static final OfInt LAYOUT$preferredIdrPeriod = ValueLayout.JAVA_INT.withName("preferredIdrPeriod");
    public static final OfInt LAYOUT$preferredConsecutiveBFrameCount = ValueLayout.JAVA_INT.withName("preferredConsecutiveBFrameCount");
    public static final OfInt LAYOUT$preferredTemporalLayerCount = ValueLayout.JAVA_INT.withName("preferredTemporalLayerCount");
    public static final StructLayout LAYOUT$preferredConstantQp = VkVideoEncodeH264QpKHR.LAYOUT.withName("preferredConstantQp");
    public static final OfInt LAYOUT$preferredMaxL0ReferenceCount = ValueLayout.JAVA_INT.withName("preferredMaxL0ReferenceCount");
    public static final OfInt LAYOUT$preferredMaxL1ReferenceCount = ValueLayout.JAVA_INT.withName("preferredMaxL1ReferenceCount");
    public static final OfInt LAYOUT$preferredStdEntropyCodingModeFlag = ValueLayout.JAVA_INT.withName("preferredStdEntropyCodingModeFlag");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$preferredRateControlFlags, LAYOUT$preferredGopFrameCount, LAYOUT$preferredIdrPeriod, LAYOUT$preferredConsecutiveBFrameCount, LAYOUT$preferredTemporalLayerCount, LAYOUT$preferredConstantQp, LAYOUT$preferredMaxL0ReferenceCount, LAYOUT$preferredMaxL1ReferenceCount, LAYOUT$preferredStdEntropyCodingModeFlag);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkVideoEncodeH264QualityLevelPropertiesKHR allocate(Arena arena) {
        return new VkVideoEncodeH264QualityLevelPropertiesKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoEncodeH264QualityLevelPropertiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeH264QualityLevelPropertiesKHR[] ret = new VkVideoEncodeH264QualityLevelPropertiesKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeH264QualityLevelPropertiesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkVideoEncodeH264QualityLevelPropertiesKHR clone(Arena arena, VkVideoEncodeH264QualityLevelPropertiesKHR src) {
        VkVideoEncodeH264QualityLevelPropertiesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeH264QualityLevelPropertiesKHR[] clone(Arena arena, VkVideoEncodeH264QualityLevelPropertiesKHR[] src) {
        VkVideoEncodeH264QualityLevelPropertiesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$preferredRateControlFlags = PathElement.groupElement("PATH$preferredRateControlFlags");
    public static final PathElement PATH$preferredGopFrameCount = PathElement.groupElement("PATH$preferredGopFrameCount");
    public static final PathElement PATH$preferredIdrPeriod = PathElement.groupElement("PATH$preferredIdrPeriod");
    public static final PathElement PATH$preferredConsecutiveBFrameCount = PathElement.groupElement("PATH$preferredConsecutiveBFrameCount");
    public static final PathElement PATH$preferredTemporalLayerCount = PathElement.groupElement("PATH$preferredTemporalLayerCount");
    public static final PathElement PATH$preferredConstantQp = PathElement.groupElement("PATH$preferredConstantQp");
    public static final PathElement PATH$preferredMaxL0ReferenceCount = PathElement.groupElement("PATH$preferredMaxL0ReferenceCount");
    public static final PathElement PATH$preferredMaxL1ReferenceCount = PathElement.groupElement("PATH$preferredMaxL1ReferenceCount");
    public static final PathElement PATH$preferredStdEntropyCodingModeFlag = PathElement.groupElement("PATH$preferredStdEntropyCodingModeFlag");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$preferredRateControlFlags = LAYOUT$preferredRateControlFlags.byteSize();
    public static final long SIZE$preferredGopFrameCount = LAYOUT$preferredGopFrameCount.byteSize();
    public static final long SIZE$preferredIdrPeriod = LAYOUT$preferredIdrPeriod.byteSize();
    public static final long SIZE$preferredConsecutiveBFrameCount = LAYOUT$preferredConsecutiveBFrameCount.byteSize();
    public static final long SIZE$preferredTemporalLayerCount = LAYOUT$preferredTemporalLayerCount.byteSize();
    public static final long SIZE$preferredConstantQp = LAYOUT$preferredConstantQp.byteSize();
    public static final long SIZE$preferredMaxL0ReferenceCount = LAYOUT$preferredMaxL0ReferenceCount.byteSize();
    public static final long SIZE$preferredMaxL1ReferenceCount = LAYOUT$preferredMaxL1ReferenceCount.byteSize();
    public static final long SIZE$preferredStdEntropyCodingModeFlag = LAYOUT$preferredStdEntropyCodingModeFlag.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$preferredRateControlFlags = LAYOUT.byteOffset(PATH$preferredRateControlFlags);
    public static final long OFFSET$preferredGopFrameCount = LAYOUT.byteOffset(PATH$preferredGopFrameCount);
    public static final long OFFSET$preferredIdrPeriod = LAYOUT.byteOffset(PATH$preferredIdrPeriod);
    public static final long OFFSET$preferredConsecutiveBFrameCount = LAYOUT.byteOffset(PATH$preferredConsecutiveBFrameCount);
    public static final long OFFSET$preferredTemporalLayerCount = LAYOUT.byteOffset(PATH$preferredTemporalLayerCount);
    public static final long OFFSET$preferredConstantQp = LAYOUT.byteOffset(PATH$preferredConstantQp);
    public static final long OFFSET$preferredMaxL0ReferenceCount = LAYOUT.byteOffset(PATH$preferredMaxL0ReferenceCount);
    public static final long OFFSET$preferredMaxL1ReferenceCount = LAYOUT.byteOffset(PATH$preferredMaxL1ReferenceCount);
    public static final long OFFSET$preferredStdEntropyCodingModeFlag = LAYOUT.byteOffset(PATH$preferredStdEntropyCodingModeFlag);

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

    public @enumtype(VkVideoEncodeH264RateControlFlagsKHR.class) int preferredRateControlFlags() {
        return segment.get(LAYOUT$preferredRateControlFlags, OFFSET$preferredRateControlFlags);
    }

    public void preferredRateControlFlags(@enumtype(VkVideoEncodeH264RateControlFlagsKHR.class) int value) {
        segment.set(LAYOUT$preferredRateControlFlags, OFFSET$preferredRateControlFlags, value);
    }

    public @unsigned int preferredGopFrameCount() {
        return segment.get(LAYOUT$preferredGopFrameCount, OFFSET$preferredGopFrameCount);
    }

    public void preferredGopFrameCount(@unsigned int value) {
        segment.set(LAYOUT$preferredGopFrameCount, OFFSET$preferredGopFrameCount, value);
    }

    public @unsigned int preferredIdrPeriod() {
        return segment.get(LAYOUT$preferredIdrPeriod, OFFSET$preferredIdrPeriod);
    }

    public void preferredIdrPeriod(@unsigned int value) {
        segment.set(LAYOUT$preferredIdrPeriod, OFFSET$preferredIdrPeriod, value);
    }

    public @unsigned int preferredConsecutiveBFrameCount() {
        return segment.get(LAYOUT$preferredConsecutiveBFrameCount, OFFSET$preferredConsecutiveBFrameCount);
    }

    public void preferredConsecutiveBFrameCount(@unsigned int value) {
        segment.set(LAYOUT$preferredConsecutiveBFrameCount, OFFSET$preferredConsecutiveBFrameCount, value);
    }

    public @unsigned int preferredTemporalLayerCount() {
        return segment.get(LAYOUT$preferredTemporalLayerCount, OFFSET$preferredTemporalLayerCount);
    }

    public void preferredTemporalLayerCount(@unsigned int value) {
        segment.set(LAYOUT$preferredTemporalLayerCount, OFFSET$preferredTemporalLayerCount, value);
    }

    public VkVideoEncodeH264QpKHR preferredConstantQp() {
        return new VkVideoEncodeH264QpKHR(segment.asSlice(OFFSET$preferredConstantQp, LAYOUT$preferredConstantQp));
    }

    public void preferredConstantQp(VkVideoEncodeH264QpKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$preferredConstantQp, SIZE$preferredConstantQp);
    }

    public @unsigned int preferredMaxL0ReferenceCount() {
        return segment.get(LAYOUT$preferredMaxL0ReferenceCount, OFFSET$preferredMaxL0ReferenceCount);
    }

    public void preferredMaxL0ReferenceCount(@unsigned int value) {
        segment.set(LAYOUT$preferredMaxL0ReferenceCount, OFFSET$preferredMaxL0ReferenceCount, value);
    }

    public @unsigned int preferredMaxL1ReferenceCount() {
        return segment.get(LAYOUT$preferredMaxL1ReferenceCount, OFFSET$preferredMaxL1ReferenceCount);
    }

    public void preferredMaxL1ReferenceCount(@unsigned int value) {
        segment.set(LAYOUT$preferredMaxL1ReferenceCount, OFFSET$preferredMaxL1ReferenceCount, value);
    }

    public @unsigned int preferredStdEntropyCodingModeFlag() {
        return segment.get(LAYOUT$preferredStdEntropyCodingModeFlag, OFFSET$preferredStdEntropyCodingModeFlag);
    }

    public void preferredStdEntropyCodingModeFlag(@unsigned int value) {
        segment.set(LAYOUT$preferredStdEntropyCodingModeFlag, OFFSET$preferredStdEntropyCodingModeFlag, value);
    }

}
