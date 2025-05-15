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

public record VkPipelineFragmentShadingRateEnumStateCreateInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$shadingRateType = ValueLayout.JAVA_INT.withName("shadingRateType");
    public static final OfInt LAYOUT$shadingRate = ValueLayout.JAVA_INT.withName("shadingRate");
    public static final OfInt LAYOUT$combinerOps = ValueLayout.JAVA_INT.withName("combinerOps");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$shadingRateType, LAYOUT$shadingRate, LAYOUT$combinerOps);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV allocate(Arena arena) {
        return new VkPipelineFragmentShadingRateEnumStateCreateInfoNV(arena.allocate(LAYOUT));
    }

    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineFragmentShadingRateEnumStateCreateInfoNV[] ret = new VkPipelineFragmentShadingRateEnumStateCreateInfoNV[count];
        for (int i = 0; i < count; i ++) {
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$shadingRateType = PathElement.groupElement("PATH$shadingRateType");
    public static final PathElement PATH$shadingRate = PathElement.groupElement("PATH$shadingRate");
    public static final PathElement PATH$combinerOps = PathElement.groupElement("PATH$combinerOps");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shadingRateType = LAYOUT$shadingRateType.byteSize();
    public static final long SIZE$shadingRate = LAYOUT$shadingRate.byteSize();
    public static final long SIZE$combinerOps = LAYOUT$combinerOps.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shadingRateType = LAYOUT.byteOffset(PATH$shadingRateType);
    public static final long OFFSET$shadingRate = LAYOUT.byteOffset(PATH$shadingRate);
    public static final long OFFSET$combinerOps = LAYOUT.byteOffset(PATH$combinerOps);

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

    public @enumtype(VkFragmentShadingRateCombinerOpKHR.class) int combinerOps() {
        return segment.get(LAYOUT$combinerOps, OFFSET$combinerOps);
    }

    public void combinerOps(@enumtype(VkFragmentShadingRateCombinerOpKHR.class) int value) {
        segment.set(LAYOUT$combinerOps, OFFSET$combinerOps, value);
    }

}
/// dummy, not implemented yet
