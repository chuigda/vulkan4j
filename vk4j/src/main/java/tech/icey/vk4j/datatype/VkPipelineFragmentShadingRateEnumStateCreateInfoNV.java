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
/// typedef struct VkPipelineFragmentShadingRateEnumStateCreateInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkFragmentShadingRateTypeNV shadingRateType;
///     VkFragmentShadingRateNV shadingRate;
///     VkFragmentShadingRateCombinerOpKHR combinerOps[2];
/// } VkPipelineFragmentShadingRateEnumStateCreateInfoNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPipelineFragmentShadingRateEnumStateCreateInfoNV.html">VkPipelineFragmentShadingRateEnumStateCreateInfoNV</a>
public record VkPipelineFragmentShadingRateEnumStateCreateInfoNV(MemorySegment segment) implements IPointer {
    public VkPipelineFragmentShadingRateEnumStateCreateInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_ENUM_STATE_CREATE_INFO_NV);
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

    public void pNext(@nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @enumtype(VkFragmentShadingRateTypeNV.class) int shadingRateType() {
        return segment.get(LAYOUT$shadingRateType, OFFSET$shadingRateType);
    }

    public void shadingRateType(@enumtype(VkFragmentShadingRateTypeNV.class) int value) {
        segment.set(LAYOUT$shadingRateType, OFFSET$shadingRateType, value);
    }

    public @enumtype(VkFragmentShadingRateNV.class) int shadingRate() {
        return segment.get(LAYOUT$shadingRate, OFFSET$shadingRate);
    }

    public void shadingRate(@enumtype(VkFragmentShadingRateNV.class) int value) {
        segment.set(LAYOUT$shadingRate, OFFSET$shadingRate, value);
    }

    public MemorySegment combinerOpsRaw() {
        return segment.asSlice(OFFSET$combinerOps, SIZE$combinerOps);
    }

    public IntBuffer combinerOps() {
        return new IntBuffer(combinerOpsRaw());
    }

    public void combinerOps(IntBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$combinerOps, SIZE$combinerOps);
    }

    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV allocate(Arena arena) {
        return new VkPipelineFragmentShadingRateEnumStateCreateInfoNV(arena.allocate(LAYOUT));
    }

    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineFragmentShadingRateEnumStateCreateInfoNV[] ret = new VkPipelineFragmentShadingRateEnumStateCreateInfoNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPipelineFragmentShadingRateEnumStateCreateInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV clone(Arena arena, VkPipelineFragmentShadingRateEnumStateCreateInfoNV src) {
        VkPipelineFragmentShadingRateEnumStateCreateInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV[] clone(Arena arena, VkPipelineFragmentShadingRateEnumStateCreateInfoNV[] src) {
        VkPipelineFragmentShadingRateEnumStateCreateInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shadingRateType"),
        ValueLayout.JAVA_INT.withName("shadingRate"),
        MemoryLayout.sequenceLayout(2, ValueLayout.JAVA_INT).withName("combinerOps")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$shadingRateType = PathElement.groupElement("shadingRateType");
    public static final PathElement PATH$shadingRate = PathElement.groupElement("shadingRate");
    public static final PathElement PATH$combinerOps = PathElement.groupElement("combinerOps");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shadingRateType = (OfInt) LAYOUT.select(PATH$shadingRateType);
    public static final OfInt LAYOUT$shadingRate = (OfInt) LAYOUT.select(PATH$shadingRate);
    public static final SequenceLayout LAYOUT$combinerOps = (SequenceLayout) LAYOUT.select(PATH$combinerOps);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shadingRateType = LAYOUT.byteOffset(PATH$shadingRateType);
    public static final long OFFSET$shadingRate = LAYOUT.byteOffset(PATH$shadingRate);
    public static final long OFFSET$combinerOps = LAYOUT.byteOffset(PATH$combinerOps);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shadingRateType = LAYOUT$shadingRateType.byteSize();
    public static final long SIZE$shadingRate = LAYOUT$shadingRate.byteSize();
    public static final long SIZE$combinerOps = LAYOUT$combinerOps.byteSize();
}
