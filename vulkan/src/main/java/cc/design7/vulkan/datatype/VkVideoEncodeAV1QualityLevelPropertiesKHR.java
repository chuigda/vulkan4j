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

/// Represents a pointer to a {@code VkVideoEncodeAV1QualityLevelPropertiesKHR} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeAV1QualityLevelPropertiesKHR.html">VkVideoEncodeAV1QualityLevelPropertiesKHR</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeAV1QualityLevelPropertiesKHR(@NotNull MemorySegment segment) implements IPointer {
    public VkVideoEncodeAV1QualityLevelPropertiesKHR {
        sType(VkStructureType.VIDEO_ENCODE_AV1_QUALITY_LEVEL_PROPERTIES_KHR);
    }

    public static VkVideoEncodeAV1QualityLevelPropertiesKHR allocate(Arena arena) {
        return new VkVideoEncodeAV1QualityLevelPropertiesKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoEncodeAV1QualityLevelPropertiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeAV1QualityLevelPropertiesKHR[] ret = new VkVideoEncodeAV1QualityLevelPropertiesKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeAV1QualityLevelPropertiesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkVideoEncodeAV1QualityLevelPropertiesKHR clone(Arena arena, VkVideoEncodeAV1QualityLevelPropertiesKHR src) {
        VkVideoEncodeAV1QualityLevelPropertiesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeAV1QualityLevelPropertiesKHR[] clone(Arena arena, VkVideoEncodeAV1QualityLevelPropertiesKHR[] src) {
        VkVideoEncodeAV1QualityLevelPropertiesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("preferredRateControlFlags"),
        ValueLayout.JAVA_INT.withName("preferredGopFrameCount"),
        ValueLayout.JAVA_INT.withName("preferredKeyFramePeriod"),
        ValueLayout.JAVA_INT.withName("preferredConsecutiveBipredictiveFrameCount"),
        ValueLayout.JAVA_INT.withName("preferredTemporalLayerCount"),
        VkVideoEncodeAV1QIndexKHR.LAYOUT.withName("preferredConstantQIndex"),
        ValueLayout.JAVA_INT.withName("preferredMaxSingleReferenceCount"),
        ValueLayout.JAVA_INT.withName("preferredSingleReferenceNameMask"),
        ValueLayout.JAVA_INT.withName("preferredMaxUnidirectionalCompoundReferenceCount"),
        ValueLayout.JAVA_INT.withName("preferredMaxUnidirectionalCompoundGroup1ReferenceCount"),
        ValueLayout.JAVA_INT.withName("preferredUnidirectionalCompoundReferenceNameMask"),
        ValueLayout.JAVA_INT.withName("preferredMaxBidirectionalCompoundReferenceCount"),
        ValueLayout.JAVA_INT.withName("preferredMaxBidirectionalCompoundGroup1ReferenceCount"),
        ValueLayout.JAVA_INT.withName("preferredMaxBidirectionalCompoundGroup2ReferenceCount"),
        ValueLayout.JAVA_INT.withName("preferredBidirectionalCompoundReferenceNameMask")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$preferredRateControlFlags = PathElement.groupElement("PATH$preferredRateControlFlags");
    public static final PathElement PATH$preferredGopFrameCount = PathElement.groupElement("PATH$preferredGopFrameCount");
    public static final PathElement PATH$preferredKeyFramePeriod = PathElement.groupElement("PATH$preferredKeyFramePeriod");
    public static final PathElement PATH$preferredConsecutiveBipredictiveFrameCount = PathElement.groupElement("PATH$preferredConsecutiveBipredictiveFrameCount");
    public static final PathElement PATH$preferredTemporalLayerCount = PathElement.groupElement("PATH$preferredTemporalLayerCount");
    public static final PathElement PATH$preferredConstantQIndex = PathElement.groupElement("PATH$preferredConstantQIndex");
    public static final PathElement PATH$preferredMaxSingleReferenceCount = PathElement.groupElement("PATH$preferredMaxSingleReferenceCount");
    public static final PathElement PATH$preferredSingleReferenceNameMask = PathElement.groupElement("PATH$preferredSingleReferenceNameMask");
    public static final PathElement PATH$preferredMaxUnidirectionalCompoundReferenceCount = PathElement.groupElement("PATH$preferredMaxUnidirectionalCompoundReferenceCount");
    public static final PathElement PATH$preferredMaxUnidirectionalCompoundGroup1ReferenceCount = PathElement.groupElement("PATH$preferredMaxUnidirectionalCompoundGroup1ReferenceCount");
    public static final PathElement PATH$preferredUnidirectionalCompoundReferenceNameMask = PathElement.groupElement("PATH$preferredUnidirectionalCompoundReferenceNameMask");
    public static final PathElement PATH$preferredMaxBidirectionalCompoundReferenceCount = PathElement.groupElement("PATH$preferredMaxBidirectionalCompoundReferenceCount");
    public static final PathElement PATH$preferredMaxBidirectionalCompoundGroup1ReferenceCount = PathElement.groupElement("PATH$preferredMaxBidirectionalCompoundGroup1ReferenceCount");
    public static final PathElement PATH$preferredMaxBidirectionalCompoundGroup2ReferenceCount = PathElement.groupElement("PATH$preferredMaxBidirectionalCompoundGroup2ReferenceCount");
    public static final PathElement PATH$preferredBidirectionalCompoundReferenceNameMask = PathElement.groupElement("PATH$preferredBidirectionalCompoundReferenceNameMask");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$preferredRateControlFlags = (OfInt) LAYOUT.select(PATH$preferredRateControlFlags);
    public static final OfInt LAYOUT$preferredGopFrameCount = (OfInt) LAYOUT.select(PATH$preferredGopFrameCount);
    public static final OfInt LAYOUT$preferredKeyFramePeriod = (OfInt) LAYOUT.select(PATH$preferredKeyFramePeriod);
    public static final OfInt LAYOUT$preferredConsecutiveBipredictiveFrameCount = (OfInt) LAYOUT.select(PATH$preferredConsecutiveBipredictiveFrameCount);
    public static final OfInt LAYOUT$preferredTemporalLayerCount = (OfInt) LAYOUT.select(PATH$preferredTemporalLayerCount);
    public static final StructLayout LAYOUT$preferredConstantQIndex = (StructLayout) LAYOUT.select(PATH$preferredConstantQIndex);
    public static final OfInt LAYOUT$preferredMaxSingleReferenceCount = (OfInt) LAYOUT.select(PATH$preferredMaxSingleReferenceCount);
    public static final OfInt LAYOUT$preferredSingleReferenceNameMask = (OfInt) LAYOUT.select(PATH$preferredSingleReferenceNameMask);
    public static final OfInt LAYOUT$preferredMaxUnidirectionalCompoundReferenceCount = (OfInt) LAYOUT.select(PATH$preferredMaxUnidirectionalCompoundReferenceCount);
    public static final OfInt LAYOUT$preferredMaxUnidirectionalCompoundGroup1ReferenceCount = (OfInt) LAYOUT.select(PATH$preferredMaxUnidirectionalCompoundGroup1ReferenceCount);
    public static final OfInt LAYOUT$preferredUnidirectionalCompoundReferenceNameMask = (OfInt) LAYOUT.select(PATH$preferredUnidirectionalCompoundReferenceNameMask);
    public static final OfInt LAYOUT$preferredMaxBidirectionalCompoundReferenceCount = (OfInt) LAYOUT.select(PATH$preferredMaxBidirectionalCompoundReferenceCount);
    public static final OfInt LAYOUT$preferredMaxBidirectionalCompoundGroup1ReferenceCount = (OfInt) LAYOUT.select(PATH$preferredMaxBidirectionalCompoundGroup1ReferenceCount);
    public static final OfInt LAYOUT$preferredMaxBidirectionalCompoundGroup2ReferenceCount = (OfInt) LAYOUT.select(PATH$preferredMaxBidirectionalCompoundGroup2ReferenceCount);
    public static final OfInt LAYOUT$preferredBidirectionalCompoundReferenceNameMask = (OfInt) LAYOUT.select(PATH$preferredBidirectionalCompoundReferenceNameMask);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$preferredRateControlFlags = LAYOUT$preferredRateControlFlags.byteSize();
    public static final long SIZE$preferredGopFrameCount = LAYOUT$preferredGopFrameCount.byteSize();
    public static final long SIZE$preferredKeyFramePeriod = LAYOUT$preferredKeyFramePeriod.byteSize();
    public static final long SIZE$preferredConsecutiveBipredictiveFrameCount = LAYOUT$preferredConsecutiveBipredictiveFrameCount.byteSize();
    public static final long SIZE$preferredTemporalLayerCount = LAYOUT$preferredTemporalLayerCount.byteSize();
    public static final long SIZE$preferredConstantQIndex = LAYOUT$preferredConstantQIndex.byteSize();
    public static final long SIZE$preferredMaxSingleReferenceCount = LAYOUT$preferredMaxSingleReferenceCount.byteSize();
    public static final long SIZE$preferredSingleReferenceNameMask = LAYOUT$preferredSingleReferenceNameMask.byteSize();
    public static final long SIZE$preferredMaxUnidirectionalCompoundReferenceCount = LAYOUT$preferredMaxUnidirectionalCompoundReferenceCount.byteSize();
    public static final long SIZE$preferredMaxUnidirectionalCompoundGroup1ReferenceCount = LAYOUT$preferredMaxUnidirectionalCompoundGroup1ReferenceCount.byteSize();
    public static final long SIZE$preferredUnidirectionalCompoundReferenceNameMask = LAYOUT$preferredUnidirectionalCompoundReferenceNameMask.byteSize();
    public static final long SIZE$preferredMaxBidirectionalCompoundReferenceCount = LAYOUT$preferredMaxBidirectionalCompoundReferenceCount.byteSize();
    public static final long SIZE$preferredMaxBidirectionalCompoundGroup1ReferenceCount = LAYOUT$preferredMaxBidirectionalCompoundGroup1ReferenceCount.byteSize();
    public static final long SIZE$preferredMaxBidirectionalCompoundGroup2ReferenceCount = LAYOUT$preferredMaxBidirectionalCompoundGroup2ReferenceCount.byteSize();
    public static final long SIZE$preferredBidirectionalCompoundReferenceNameMask = LAYOUT$preferredBidirectionalCompoundReferenceNameMask.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$preferredRateControlFlags = LAYOUT.byteOffset(PATH$preferredRateControlFlags);
    public static final long OFFSET$preferredGopFrameCount = LAYOUT.byteOffset(PATH$preferredGopFrameCount);
    public static final long OFFSET$preferredKeyFramePeriod = LAYOUT.byteOffset(PATH$preferredKeyFramePeriod);
    public static final long OFFSET$preferredConsecutiveBipredictiveFrameCount = LAYOUT.byteOffset(PATH$preferredConsecutiveBipredictiveFrameCount);
    public static final long OFFSET$preferredTemporalLayerCount = LAYOUT.byteOffset(PATH$preferredTemporalLayerCount);
    public static final long OFFSET$preferredConstantQIndex = LAYOUT.byteOffset(PATH$preferredConstantQIndex);
    public static final long OFFSET$preferredMaxSingleReferenceCount = LAYOUT.byteOffset(PATH$preferredMaxSingleReferenceCount);
    public static final long OFFSET$preferredSingleReferenceNameMask = LAYOUT.byteOffset(PATH$preferredSingleReferenceNameMask);
    public static final long OFFSET$preferredMaxUnidirectionalCompoundReferenceCount = LAYOUT.byteOffset(PATH$preferredMaxUnidirectionalCompoundReferenceCount);
    public static final long OFFSET$preferredMaxUnidirectionalCompoundGroup1ReferenceCount = LAYOUT.byteOffset(PATH$preferredMaxUnidirectionalCompoundGroup1ReferenceCount);
    public static final long OFFSET$preferredUnidirectionalCompoundReferenceNameMask = LAYOUT.byteOffset(PATH$preferredUnidirectionalCompoundReferenceNameMask);
    public static final long OFFSET$preferredMaxBidirectionalCompoundReferenceCount = LAYOUT.byteOffset(PATH$preferredMaxBidirectionalCompoundReferenceCount);
    public static final long OFFSET$preferredMaxBidirectionalCompoundGroup1ReferenceCount = LAYOUT.byteOffset(PATH$preferredMaxBidirectionalCompoundGroup1ReferenceCount);
    public static final long OFFSET$preferredMaxBidirectionalCompoundGroup2ReferenceCount = LAYOUT.byteOffset(PATH$preferredMaxBidirectionalCompoundGroup2ReferenceCount);
    public static final long OFFSET$preferredBidirectionalCompoundReferenceNameMask = LAYOUT.byteOffset(PATH$preferredBidirectionalCompoundReferenceNameMask);

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

    public @enumtype(VkVideoEncodeAV1RateControlFlagsKHR.class) int preferredRateControlFlags() {
        return segment.get(LAYOUT$preferredRateControlFlags, OFFSET$preferredRateControlFlags);
    }

    public void preferredRateControlFlags(@enumtype(VkVideoEncodeAV1RateControlFlagsKHR.class) int value) {
        segment.set(LAYOUT$preferredRateControlFlags, OFFSET$preferredRateControlFlags, value);
    }

    public @unsigned int preferredGopFrameCount() {
        return segment.get(LAYOUT$preferredGopFrameCount, OFFSET$preferredGopFrameCount);
    }

    public void preferredGopFrameCount(@unsigned int value) {
        segment.set(LAYOUT$preferredGopFrameCount, OFFSET$preferredGopFrameCount, value);
    }

    public @unsigned int preferredKeyFramePeriod() {
        return segment.get(LAYOUT$preferredKeyFramePeriod, OFFSET$preferredKeyFramePeriod);
    }

    public void preferredKeyFramePeriod(@unsigned int value) {
        segment.set(LAYOUT$preferredKeyFramePeriod, OFFSET$preferredKeyFramePeriod, value);
    }

    public @unsigned int preferredConsecutiveBipredictiveFrameCount() {
        return segment.get(LAYOUT$preferredConsecutiveBipredictiveFrameCount, OFFSET$preferredConsecutiveBipredictiveFrameCount);
    }

    public void preferredConsecutiveBipredictiveFrameCount(@unsigned int value) {
        segment.set(LAYOUT$preferredConsecutiveBipredictiveFrameCount, OFFSET$preferredConsecutiveBipredictiveFrameCount, value);
    }

    public @unsigned int preferredTemporalLayerCount() {
        return segment.get(LAYOUT$preferredTemporalLayerCount, OFFSET$preferredTemporalLayerCount);
    }

    public void preferredTemporalLayerCount(@unsigned int value) {
        segment.set(LAYOUT$preferredTemporalLayerCount, OFFSET$preferredTemporalLayerCount, value);
    }

    public VkVideoEncodeAV1QIndexKHR preferredConstantQIndex() {
        return new VkVideoEncodeAV1QIndexKHR(segment.asSlice(OFFSET$preferredConstantQIndex, LAYOUT$preferredConstantQIndex));
    }

    public void preferredConstantQIndex(VkVideoEncodeAV1QIndexKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$preferredConstantQIndex, SIZE$preferredConstantQIndex);
    }

    public @unsigned int preferredMaxSingleReferenceCount() {
        return segment.get(LAYOUT$preferredMaxSingleReferenceCount, OFFSET$preferredMaxSingleReferenceCount);
    }

    public void preferredMaxSingleReferenceCount(@unsigned int value) {
        segment.set(LAYOUT$preferredMaxSingleReferenceCount, OFFSET$preferredMaxSingleReferenceCount, value);
    }

    public @unsigned int preferredSingleReferenceNameMask() {
        return segment.get(LAYOUT$preferredSingleReferenceNameMask, OFFSET$preferredSingleReferenceNameMask);
    }

    public void preferredSingleReferenceNameMask(@unsigned int value) {
        segment.set(LAYOUT$preferredSingleReferenceNameMask, OFFSET$preferredSingleReferenceNameMask, value);
    }

    public @unsigned int preferredMaxUnidirectionalCompoundReferenceCount() {
        return segment.get(LAYOUT$preferredMaxUnidirectionalCompoundReferenceCount, OFFSET$preferredMaxUnidirectionalCompoundReferenceCount);
    }

    public void preferredMaxUnidirectionalCompoundReferenceCount(@unsigned int value) {
        segment.set(LAYOUT$preferredMaxUnidirectionalCompoundReferenceCount, OFFSET$preferredMaxUnidirectionalCompoundReferenceCount, value);
    }

    public @unsigned int preferredMaxUnidirectionalCompoundGroup1ReferenceCount() {
        return segment.get(LAYOUT$preferredMaxUnidirectionalCompoundGroup1ReferenceCount, OFFSET$preferredMaxUnidirectionalCompoundGroup1ReferenceCount);
    }

    public void preferredMaxUnidirectionalCompoundGroup1ReferenceCount(@unsigned int value) {
        segment.set(LAYOUT$preferredMaxUnidirectionalCompoundGroup1ReferenceCount, OFFSET$preferredMaxUnidirectionalCompoundGroup1ReferenceCount, value);
    }

    public @unsigned int preferredUnidirectionalCompoundReferenceNameMask() {
        return segment.get(LAYOUT$preferredUnidirectionalCompoundReferenceNameMask, OFFSET$preferredUnidirectionalCompoundReferenceNameMask);
    }

    public void preferredUnidirectionalCompoundReferenceNameMask(@unsigned int value) {
        segment.set(LAYOUT$preferredUnidirectionalCompoundReferenceNameMask, OFFSET$preferredUnidirectionalCompoundReferenceNameMask, value);
    }

    public @unsigned int preferredMaxBidirectionalCompoundReferenceCount() {
        return segment.get(LAYOUT$preferredMaxBidirectionalCompoundReferenceCount, OFFSET$preferredMaxBidirectionalCompoundReferenceCount);
    }

    public void preferredMaxBidirectionalCompoundReferenceCount(@unsigned int value) {
        segment.set(LAYOUT$preferredMaxBidirectionalCompoundReferenceCount, OFFSET$preferredMaxBidirectionalCompoundReferenceCount, value);
    }

    public @unsigned int preferredMaxBidirectionalCompoundGroup1ReferenceCount() {
        return segment.get(LAYOUT$preferredMaxBidirectionalCompoundGroup1ReferenceCount, OFFSET$preferredMaxBidirectionalCompoundGroup1ReferenceCount);
    }

    public void preferredMaxBidirectionalCompoundGroup1ReferenceCount(@unsigned int value) {
        segment.set(LAYOUT$preferredMaxBidirectionalCompoundGroup1ReferenceCount, OFFSET$preferredMaxBidirectionalCompoundGroup1ReferenceCount, value);
    }

    public @unsigned int preferredMaxBidirectionalCompoundGroup2ReferenceCount() {
        return segment.get(LAYOUT$preferredMaxBidirectionalCompoundGroup2ReferenceCount, OFFSET$preferredMaxBidirectionalCompoundGroup2ReferenceCount);
    }

    public void preferredMaxBidirectionalCompoundGroup2ReferenceCount(@unsigned int value) {
        segment.set(LAYOUT$preferredMaxBidirectionalCompoundGroup2ReferenceCount, OFFSET$preferredMaxBidirectionalCompoundGroup2ReferenceCount, value);
    }

    public @unsigned int preferredBidirectionalCompoundReferenceNameMask() {
        return segment.get(LAYOUT$preferredBidirectionalCompoundReferenceNameMask, OFFSET$preferredBidirectionalCompoundReferenceNameMask);
    }

    public void preferredBidirectionalCompoundReferenceNameMask(@unsigned int value) {
        segment.set(LAYOUT$preferredBidirectionalCompoundReferenceNameMask, OFFSET$preferredBidirectionalCompoundReferenceNameMask, value);
    }

}
