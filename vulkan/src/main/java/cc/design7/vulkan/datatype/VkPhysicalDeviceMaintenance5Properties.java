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

public record VkPhysicalDeviceMaintenance5Properties(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$earlyFragmentMultisampleCoverageAfterSampleCounting = ValueLayout.JAVA_INT.withName("earlyFragmentMultisampleCoverageAfterSampleCounting");
    public static final OfInt LAYOUT$earlyFragmentSampleMaskTestBeforeSampleCounting = ValueLayout.JAVA_INT.withName("earlyFragmentSampleMaskTestBeforeSampleCounting");
    public static final OfInt LAYOUT$depthStencilSwizzleOneSupport = ValueLayout.JAVA_INT.withName("depthStencilSwizzleOneSupport");
    public static final OfInt LAYOUT$polygonModePointSize = ValueLayout.JAVA_INT.withName("polygonModePointSize");
    public static final OfInt LAYOUT$nonStrictSinglePixelWideLinesUseParallelogram = ValueLayout.JAVA_INT.withName("nonStrictSinglePixelWideLinesUseParallelogram");
    public static final OfInt LAYOUT$nonStrictWideLinesUseParallelogram = ValueLayout.JAVA_INT.withName("nonStrictWideLinesUseParallelogram");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$earlyFragmentMultisampleCoverageAfterSampleCounting, LAYOUT$earlyFragmentSampleMaskTestBeforeSampleCounting, LAYOUT$depthStencilSwizzleOneSupport, LAYOUT$polygonModePointSize, LAYOUT$nonStrictSinglePixelWideLinesUseParallelogram, LAYOUT$nonStrictWideLinesUseParallelogram);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceMaintenance5Properties allocate(Arena arena) {
        return new VkPhysicalDeviceMaintenance5Properties(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceMaintenance5Properties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceMaintenance5Properties[] ret = new VkPhysicalDeviceMaintenance5Properties[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceMaintenance5Properties(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceMaintenance5Properties clone(Arena arena, VkPhysicalDeviceMaintenance5Properties src) {
        VkPhysicalDeviceMaintenance5Properties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceMaintenance5Properties[] clone(Arena arena, VkPhysicalDeviceMaintenance5Properties[] src) {
        VkPhysicalDeviceMaintenance5Properties[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$earlyFragmentMultisampleCoverageAfterSampleCounting = PathElement.groupElement("PATH$earlyFragmentMultisampleCoverageAfterSampleCounting");
    public static final PathElement PATH$earlyFragmentSampleMaskTestBeforeSampleCounting = PathElement.groupElement("PATH$earlyFragmentSampleMaskTestBeforeSampleCounting");
    public static final PathElement PATH$depthStencilSwizzleOneSupport = PathElement.groupElement("PATH$depthStencilSwizzleOneSupport");
    public static final PathElement PATH$polygonModePointSize = PathElement.groupElement("PATH$polygonModePointSize");
    public static final PathElement PATH$nonStrictSinglePixelWideLinesUseParallelogram = PathElement.groupElement("PATH$nonStrictSinglePixelWideLinesUseParallelogram");
    public static final PathElement PATH$nonStrictWideLinesUseParallelogram = PathElement.groupElement("PATH$nonStrictWideLinesUseParallelogram");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$earlyFragmentMultisampleCoverageAfterSampleCounting = LAYOUT$earlyFragmentMultisampleCoverageAfterSampleCounting.byteSize();
    public static final long SIZE$earlyFragmentSampleMaskTestBeforeSampleCounting = LAYOUT$earlyFragmentSampleMaskTestBeforeSampleCounting.byteSize();
    public static final long SIZE$depthStencilSwizzleOneSupport = LAYOUT$depthStencilSwizzleOneSupport.byteSize();
    public static final long SIZE$polygonModePointSize = LAYOUT$polygonModePointSize.byteSize();
    public static final long SIZE$nonStrictSinglePixelWideLinesUseParallelogram = LAYOUT$nonStrictSinglePixelWideLinesUseParallelogram.byteSize();
    public static final long SIZE$nonStrictWideLinesUseParallelogram = LAYOUT$nonStrictWideLinesUseParallelogram.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$earlyFragmentMultisampleCoverageAfterSampleCounting = LAYOUT.byteOffset(PATH$earlyFragmentMultisampleCoverageAfterSampleCounting);
    public static final long OFFSET$earlyFragmentSampleMaskTestBeforeSampleCounting = LAYOUT.byteOffset(PATH$earlyFragmentSampleMaskTestBeforeSampleCounting);
    public static final long OFFSET$depthStencilSwizzleOneSupport = LAYOUT.byteOffset(PATH$depthStencilSwizzleOneSupport);
    public static final long OFFSET$polygonModePointSize = LAYOUT.byteOffset(PATH$polygonModePointSize);
    public static final long OFFSET$nonStrictSinglePixelWideLinesUseParallelogram = LAYOUT.byteOffset(PATH$nonStrictSinglePixelWideLinesUseParallelogram);
    public static final long OFFSET$nonStrictWideLinesUseParallelogram = LAYOUT.byteOffset(PATH$nonStrictWideLinesUseParallelogram);

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

    public @unsigned int earlyFragmentMultisampleCoverageAfterSampleCounting() {
        return segment.get(LAYOUT$earlyFragmentMultisampleCoverageAfterSampleCounting, OFFSET$earlyFragmentMultisampleCoverageAfterSampleCounting);
    }

    public void earlyFragmentMultisampleCoverageAfterSampleCounting(@unsigned int value) {
        segment.set(LAYOUT$earlyFragmentMultisampleCoverageAfterSampleCounting, OFFSET$earlyFragmentMultisampleCoverageAfterSampleCounting, value);
    }

    public @unsigned int earlyFragmentSampleMaskTestBeforeSampleCounting() {
        return segment.get(LAYOUT$earlyFragmentSampleMaskTestBeforeSampleCounting, OFFSET$earlyFragmentSampleMaskTestBeforeSampleCounting);
    }

    public void earlyFragmentSampleMaskTestBeforeSampleCounting(@unsigned int value) {
        segment.set(LAYOUT$earlyFragmentSampleMaskTestBeforeSampleCounting, OFFSET$earlyFragmentSampleMaskTestBeforeSampleCounting, value);
    }

    public @unsigned int depthStencilSwizzleOneSupport() {
        return segment.get(LAYOUT$depthStencilSwizzleOneSupport, OFFSET$depthStencilSwizzleOneSupport);
    }

    public void depthStencilSwizzleOneSupport(@unsigned int value) {
        segment.set(LAYOUT$depthStencilSwizzleOneSupport, OFFSET$depthStencilSwizzleOneSupport, value);
    }

    public @unsigned int polygonModePointSize() {
        return segment.get(LAYOUT$polygonModePointSize, OFFSET$polygonModePointSize);
    }

    public void polygonModePointSize(@unsigned int value) {
        segment.set(LAYOUT$polygonModePointSize, OFFSET$polygonModePointSize, value);
    }

    public @unsigned int nonStrictSinglePixelWideLinesUseParallelogram() {
        return segment.get(LAYOUT$nonStrictSinglePixelWideLinesUseParallelogram, OFFSET$nonStrictSinglePixelWideLinesUseParallelogram);
    }

    public void nonStrictSinglePixelWideLinesUseParallelogram(@unsigned int value) {
        segment.set(LAYOUT$nonStrictSinglePixelWideLinesUseParallelogram, OFFSET$nonStrictSinglePixelWideLinesUseParallelogram, value);
    }

    public @unsigned int nonStrictWideLinesUseParallelogram() {
        return segment.get(LAYOUT$nonStrictWideLinesUseParallelogram, OFFSET$nonStrictWideLinesUseParallelogram);
    }

    public void nonStrictWideLinesUseParallelogram(@unsigned int value) {
        segment.set(LAYOUT$nonStrictWideLinesUseParallelogram, OFFSET$nonStrictWideLinesUseParallelogram, value);
    }

}
/// dummy, not implemented yet
