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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH264QualityLevelPropertiesKHR.html"><code>VkVideoEncodeH264QualityLevelPropertiesKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoEncodeH264QualityLevelPropertiesKHR {
///     VkStructureType sType;
///     void* pNext; // optional
///     VkVideoEncodeH264RateControlFlagsKHR preferredRateControlFlags;
///     uint32_t preferredGopFrameCount;
///     uint32_t preferredIdrPeriod;
///     uint32_t preferredConsecutiveBFrameCount;
///     uint32_t preferredTemporalLayerCount;
///     VkVideoEncodeH264QpKHR preferredConstantQp;
///     uint32_t preferredMaxL0ReferenceCount;
///     uint32_t preferredMaxL1ReferenceCount;
///     VkBool32 preferredStdEntropyCodingModeFlag;
/// } VkVideoEncodeH264QualityLevelPropertiesKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_ENCODE_H264_QUALITY_LEVEL_PROPERTIES_KHR`
///
/// The {@link VkVideoEncodeH264QualityLevelPropertiesKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkVideoEncodeH264QualityLevelPropertiesKHR#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH264QualityLevelPropertiesKHR.html"><code>VkVideoEncodeH264QualityLevelPropertiesKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeH264QualityLevelPropertiesKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkVideoEncodeH264QualityLevelPropertiesKHR allocate(Arena arena) {
        VkVideoEncodeH264QualityLevelPropertiesKHR ret = new VkVideoEncodeH264QualityLevelPropertiesKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_ENCODE_H264_QUALITY_LEVEL_PROPERTIES_KHR);
        return ret;
    }

    public static VkVideoEncodeH264QualityLevelPropertiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeH264QualityLevelPropertiesKHR[] ret = new VkVideoEncodeH264QualityLevelPropertiesKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeH264QualityLevelPropertiesKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.VIDEO_ENCODE_H264_QUALITY_LEVEL_PROPERTIES_KHR);
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

    public void autoInit() {
        sType(VkStructureType.VIDEO_ENCODE_H264_QUALITY_LEVEL_PROPERTIES_KHR);
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

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
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

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("preferredRateControlFlags"),
        ValueLayout.JAVA_INT.withName("preferredGopFrameCount"),
        ValueLayout.JAVA_INT.withName("preferredIdrPeriod"),
        ValueLayout.JAVA_INT.withName("preferredConsecutiveBFrameCount"),
        ValueLayout.JAVA_INT.withName("preferredTemporalLayerCount"),
        VkVideoEncodeH264QpKHR.LAYOUT.withName("preferredConstantQp"),
        ValueLayout.JAVA_INT.withName("preferredMaxL0ReferenceCount"),
        ValueLayout.JAVA_INT.withName("preferredMaxL1ReferenceCount"),
        ValueLayout.JAVA_INT.withName("preferredStdEntropyCodingModeFlag")
    );
    public static final long BYTES = LAYOUT.byteSize();

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

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$preferredRateControlFlags = (OfInt) LAYOUT.select(PATH$preferredRateControlFlags);
    public static final OfInt LAYOUT$preferredGopFrameCount = (OfInt) LAYOUT.select(PATH$preferredGopFrameCount);
    public static final OfInt LAYOUT$preferredIdrPeriod = (OfInt) LAYOUT.select(PATH$preferredIdrPeriod);
    public static final OfInt LAYOUT$preferredConsecutiveBFrameCount = (OfInt) LAYOUT.select(PATH$preferredConsecutiveBFrameCount);
    public static final OfInt LAYOUT$preferredTemporalLayerCount = (OfInt) LAYOUT.select(PATH$preferredTemporalLayerCount);
    public static final StructLayout LAYOUT$preferredConstantQp = (StructLayout) LAYOUT.select(PATH$preferredConstantQp);
    public static final OfInt LAYOUT$preferredMaxL0ReferenceCount = (OfInt) LAYOUT.select(PATH$preferredMaxL0ReferenceCount);
    public static final OfInt LAYOUT$preferredMaxL1ReferenceCount = (OfInt) LAYOUT.select(PATH$preferredMaxL1ReferenceCount);
    public static final OfInt LAYOUT$preferredStdEntropyCodingModeFlag = (OfInt) LAYOUT.select(PATH$preferredStdEntropyCodingModeFlag);

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
}
