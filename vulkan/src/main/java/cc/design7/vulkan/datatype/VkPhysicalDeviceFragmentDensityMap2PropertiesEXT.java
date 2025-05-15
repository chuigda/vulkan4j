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

public record VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$subsampledLoads = ValueLayout.JAVA_INT.withName("subsampledLoads");
    public static final OfInt LAYOUT$subsampledCoarseReconstructionEarlyAccess = ValueLayout.JAVA_INT.withName("subsampledCoarseReconstructionEarlyAccess");
    public static final OfInt LAYOUT$maxSubsampledArrayLayers = ValueLayout.JAVA_INT.withName("maxSubsampledArrayLayers");
    public static final OfInt LAYOUT$maxDescriptorSetSubsampledSamplers = ValueLayout.JAVA_INT.withName("maxDescriptorSetSubsampledSamplers");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$subsampledLoads, LAYOUT$subsampledCoarseReconstructionEarlyAccess, LAYOUT$maxSubsampledArrayLayers, LAYOUT$maxDescriptorSetSubsampledSamplers);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceFragmentDensityMap2PropertiesEXT[] ret = new VkPhysicalDeviceFragmentDensityMap2PropertiesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceFragmentDensityMap2PropertiesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT clone(Arena arena, VkPhysicalDeviceFragmentDensityMap2PropertiesEXT src) {
        VkPhysicalDeviceFragmentDensityMap2PropertiesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceFragmentDensityMap2PropertiesEXT[] clone(Arena arena, VkPhysicalDeviceFragmentDensityMap2PropertiesEXT[] src) {
        VkPhysicalDeviceFragmentDensityMap2PropertiesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$subsampledLoads = PathElement.groupElement("PATH$subsampledLoads");
    public static final PathElement PATH$subsampledCoarseReconstructionEarlyAccess = PathElement.groupElement("PATH$subsampledCoarseReconstructionEarlyAccess");
    public static final PathElement PATH$maxSubsampledArrayLayers = PathElement.groupElement("PATH$maxSubsampledArrayLayers");
    public static final PathElement PATH$maxDescriptorSetSubsampledSamplers = PathElement.groupElement("PATH$maxDescriptorSetSubsampledSamplers");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$subsampledLoads = LAYOUT$subsampledLoads.byteSize();
    public static final long SIZE$subsampledCoarseReconstructionEarlyAccess = LAYOUT$subsampledCoarseReconstructionEarlyAccess.byteSize();
    public static final long SIZE$maxSubsampledArrayLayers = LAYOUT$maxSubsampledArrayLayers.byteSize();
    public static final long SIZE$maxDescriptorSetSubsampledSamplers = LAYOUT$maxDescriptorSetSubsampledSamplers.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$subsampledLoads = LAYOUT.byteOffset(PATH$subsampledLoads);
    public static final long OFFSET$subsampledCoarseReconstructionEarlyAccess = LAYOUT.byteOffset(PATH$subsampledCoarseReconstructionEarlyAccess);
    public static final long OFFSET$maxSubsampledArrayLayers = LAYOUT.byteOffset(PATH$maxSubsampledArrayLayers);
    public static final long OFFSET$maxDescriptorSetSubsampledSamplers = LAYOUT.byteOffset(PATH$maxDescriptorSetSubsampledSamplers);

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

    public @unsigned int subsampledLoads() {
        return segment.get(LAYOUT$subsampledLoads, OFFSET$subsampledLoads);
    }

    public void subsampledLoads(@unsigned int value) {
        segment.set(LAYOUT$subsampledLoads, OFFSET$subsampledLoads, value);
    }

    public @unsigned int subsampledCoarseReconstructionEarlyAccess() {
        return segment.get(LAYOUT$subsampledCoarseReconstructionEarlyAccess, OFFSET$subsampledCoarseReconstructionEarlyAccess);
    }

    public void subsampledCoarseReconstructionEarlyAccess(@unsigned int value) {
        segment.set(LAYOUT$subsampledCoarseReconstructionEarlyAccess, OFFSET$subsampledCoarseReconstructionEarlyAccess, value);
    }

    public @unsigned int maxSubsampledArrayLayers() {
        return segment.get(LAYOUT$maxSubsampledArrayLayers, OFFSET$maxSubsampledArrayLayers);
    }

    public void maxSubsampledArrayLayers(@unsigned int value) {
        segment.set(LAYOUT$maxSubsampledArrayLayers, OFFSET$maxSubsampledArrayLayers, value);
    }

    public @unsigned int maxDescriptorSetSubsampledSamplers() {
        return segment.get(LAYOUT$maxDescriptorSetSubsampledSamplers, OFFSET$maxDescriptorSetSubsampledSamplers);
    }

    public void maxDescriptorSetSubsampledSamplers(@unsigned int value) {
        segment.set(LAYOUT$maxDescriptorSetSubsampledSamplers, OFFSET$maxDescriptorSetSubsampledSamplers, value);
    }

}
/// dummy, not implemented yet
