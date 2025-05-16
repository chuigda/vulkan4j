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
import cc.design7.vulkan.handle.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH265QualityLevelPropertiesKHR.html"><code>VkVideoEncodeH265QualityLevelPropertiesKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoEncodeH265QualityLevelPropertiesKHR {
///     VkStructureType sType;
///     void* pNext; // optional
///     VkVideoEncodeH265RateControlFlagsKHR preferredRateControlFlags;
///     uint32_t preferredGopFrameCount;
///     uint32_t preferredIdrPeriod;
///     uint32_t preferredConsecutiveBFrameCount;
///     uint32_t preferredSubLayerCount;
///     VkVideoEncodeH265QpKHR preferredConstantQp;
///     uint32_t preferredMaxL0ReferenceCount;
///     uint32_t preferredMaxL1ReferenceCount;
/// } VkVideoEncodeH265QualityLevelPropertiesKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_ENCODE_H265_QUALITY_LEVEL_PROPERTIES_KHR`
///
/// The {@link VkVideoEncodeH265QualityLevelPropertiesKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkVideoEncodeH265QualityLevelPropertiesKHR#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoEncodeH265QualityLevelPropertiesKHR.html"><code>VkVideoEncodeH265QualityLevelPropertiesKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoEncodeH265QualityLevelPropertiesKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkVideoEncodeH265QualityLevelPropertiesKHR allocate(Arena arena) {
        VkVideoEncodeH265QualityLevelPropertiesKHR ret = new VkVideoEncodeH265QualityLevelPropertiesKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_ENCODE_H265_QUALITY_LEVEL_PROPERTIES_KHR);
        return ret;
    }

    public static VkVideoEncodeH265QualityLevelPropertiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeH265QualityLevelPropertiesKHR[] ret = new VkVideoEncodeH265QualityLevelPropertiesKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeH265QualityLevelPropertiesKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.VIDEO_ENCODE_H265_QUALITY_LEVEL_PROPERTIES_KHR);
        }
        return ret;
    }

    public static VkVideoEncodeH265QualityLevelPropertiesKHR clone(Arena arena, VkVideoEncodeH265QualityLevelPropertiesKHR src) {
        VkVideoEncodeH265QualityLevelPropertiesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeH265QualityLevelPropertiesKHR[] clone(Arena arena, VkVideoEncodeH265QualityLevelPropertiesKHR[] src) {
        VkVideoEncodeH265QualityLevelPropertiesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_ENCODE_H265_QUALITY_LEVEL_PROPERTIES_KHR);
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

    public @enumtype(VkVideoEncodeH265RateControlFlagsKHR.class) int preferredRateControlFlags() {
        return segment.get(LAYOUT$preferredRateControlFlags, OFFSET$preferredRateControlFlags);
    }

    public void preferredRateControlFlags(@enumtype(VkVideoEncodeH265RateControlFlagsKHR.class) int value) {
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

    public @unsigned int preferredSubLayerCount() {
        return segment.get(LAYOUT$preferredSubLayerCount, OFFSET$preferredSubLayerCount);
    }

    public void preferredSubLayerCount(@unsigned int value) {
        segment.set(LAYOUT$preferredSubLayerCount, OFFSET$preferredSubLayerCount, value);
    }

    public VkVideoEncodeH265QpKHR preferredConstantQp() {
        return new VkVideoEncodeH265QpKHR(segment.asSlice(OFFSET$preferredConstantQp, LAYOUT$preferredConstantQp));
    }

    public void preferredConstantQp(VkVideoEncodeH265QpKHR value) {
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

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("preferredRateControlFlags"),
        ValueLayout.JAVA_INT.withName("preferredGopFrameCount"),
        ValueLayout.JAVA_INT.withName("preferredIdrPeriod"),
        ValueLayout.JAVA_INT.withName("preferredConsecutiveBFrameCount"),
        ValueLayout.JAVA_INT.withName("preferredSubLayerCount"),
        VkVideoEncodeH265QpKHR.LAYOUT.withName("preferredConstantQp"),
        ValueLayout.JAVA_INT.withName("preferredMaxL0ReferenceCount"),
        ValueLayout.JAVA_INT.withName("preferredMaxL1ReferenceCount")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$preferredRateControlFlags = PathElement.groupElement("PATH$preferredRateControlFlags");
    public static final PathElement PATH$preferredGopFrameCount = PathElement.groupElement("PATH$preferredGopFrameCount");
    public static final PathElement PATH$preferredIdrPeriod = PathElement.groupElement("PATH$preferredIdrPeriod");
    public static final PathElement PATH$preferredConsecutiveBFrameCount = PathElement.groupElement("PATH$preferredConsecutiveBFrameCount");
    public static final PathElement PATH$preferredSubLayerCount = PathElement.groupElement("PATH$preferredSubLayerCount");
    public static final PathElement PATH$preferredConstantQp = PathElement.groupElement("PATH$preferredConstantQp");
    public static final PathElement PATH$preferredMaxL0ReferenceCount = PathElement.groupElement("PATH$preferredMaxL0ReferenceCount");
    public static final PathElement PATH$preferredMaxL1ReferenceCount = PathElement.groupElement("PATH$preferredMaxL1ReferenceCount");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$preferredRateControlFlags = (OfInt) LAYOUT.select(PATH$preferredRateControlFlags);
    public static final OfInt LAYOUT$preferredGopFrameCount = (OfInt) LAYOUT.select(PATH$preferredGopFrameCount);
    public static final OfInt LAYOUT$preferredIdrPeriod = (OfInt) LAYOUT.select(PATH$preferredIdrPeriod);
    public static final OfInt LAYOUT$preferredConsecutiveBFrameCount = (OfInt) LAYOUT.select(PATH$preferredConsecutiveBFrameCount);
    public static final OfInt LAYOUT$preferredSubLayerCount = (OfInt) LAYOUT.select(PATH$preferredSubLayerCount);
    public static final StructLayout LAYOUT$preferredConstantQp = (StructLayout) LAYOUT.select(PATH$preferredConstantQp);
    public static final OfInt LAYOUT$preferredMaxL0ReferenceCount = (OfInt) LAYOUT.select(PATH$preferredMaxL0ReferenceCount);
    public static final OfInt LAYOUT$preferredMaxL1ReferenceCount = (OfInt) LAYOUT.select(PATH$preferredMaxL1ReferenceCount);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$preferredRateControlFlags = LAYOUT$preferredRateControlFlags.byteSize();
    public static final long SIZE$preferredGopFrameCount = LAYOUT$preferredGopFrameCount.byteSize();
    public static final long SIZE$preferredIdrPeriod = LAYOUT$preferredIdrPeriod.byteSize();
    public static final long SIZE$preferredConsecutiveBFrameCount = LAYOUT$preferredConsecutiveBFrameCount.byteSize();
    public static final long SIZE$preferredSubLayerCount = LAYOUT$preferredSubLayerCount.byteSize();
    public static final long SIZE$preferredConstantQp = LAYOUT$preferredConstantQp.byteSize();
    public static final long SIZE$preferredMaxL0ReferenceCount = LAYOUT$preferredMaxL0ReferenceCount.byteSize();
    public static final long SIZE$preferredMaxL1ReferenceCount = LAYOUT$preferredMaxL1ReferenceCount.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$preferredRateControlFlags = LAYOUT.byteOffset(PATH$preferredRateControlFlags);
    public static final long OFFSET$preferredGopFrameCount = LAYOUT.byteOffset(PATH$preferredGopFrameCount);
    public static final long OFFSET$preferredIdrPeriod = LAYOUT.byteOffset(PATH$preferredIdrPeriod);
    public static final long OFFSET$preferredConsecutiveBFrameCount = LAYOUT.byteOffset(PATH$preferredConsecutiveBFrameCount);
    public static final long OFFSET$preferredSubLayerCount = LAYOUT.byteOffset(PATH$preferredSubLayerCount);
    public static final long OFFSET$preferredConstantQp = LAYOUT.byteOffset(PATH$preferredConstantQp);
    public static final long OFFSET$preferredMaxL0ReferenceCount = LAYOUT.byteOffset(PATH$preferredMaxL0ReferenceCount);
    public static final long OFFSET$preferredMaxL1ReferenceCount = LAYOUT.byteOffset(PATH$preferredMaxL1ReferenceCount);
}
