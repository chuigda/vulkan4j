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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceCooperativeMatrix2FeaturesNV.html">VkPhysicalDeviceCooperativeMatrix2FeaturesNV</a>
@ValueBasedCandidate
public record VkPhysicalDeviceCooperativeMatrix2FeaturesNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$cooperativeMatrixWorkgroupScope = ValueLayout.JAVA_INT.withName("cooperativeMatrixWorkgroupScope");
    public static final OfInt LAYOUT$cooperativeMatrixFlexibleDimensions = ValueLayout.JAVA_INT.withName("cooperativeMatrixFlexibleDimensions");
    public static final OfInt LAYOUT$cooperativeMatrixReductions = ValueLayout.JAVA_INT.withName("cooperativeMatrixReductions");
    public static final OfInt LAYOUT$cooperativeMatrixConversions = ValueLayout.JAVA_INT.withName("cooperativeMatrixConversions");
    public static final OfInt LAYOUT$cooperativeMatrixPerElementOperations = ValueLayout.JAVA_INT.withName("cooperativeMatrixPerElementOperations");
    public static final OfInt LAYOUT$cooperativeMatrixTensorAddressing = ValueLayout.JAVA_INT.withName("cooperativeMatrixTensorAddressing");
    public static final OfInt LAYOUT$cooperativeMatrixBlockLoads = ValueLayout.JAVA_INT.withName("cooperativeMatrixBlockLoads");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$cooperativeMatrixWorkgroupScope, LAYOUT$cooperativeMatrixFlexibleDimensions, LAYOUT$cooperativeMatrixReductions, LAYOUT$cooperativeMatrixConversions, LAYOUT$cooperativeMatrixPerElementOperations, LAYOUT$cooperativeMatrixTensorAddressing, LAYOUT$cooperativeMatrixBlockLoads);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV allocate(Arena arena) {
        return new VkPhysicalDeviceCooperativeMatrix2FeaturesNV(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceCooperativeMatrix2FeaturesNV[] ret = new VkPhysicalDeviceCooperativeMatrix2FeaturesNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceCooperativeMatrix2FeaturesNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV clone(Arena arena, VkPhysicalDeviceCooperativeMatrix2FeaturesNV src) {
        VkPhysicalDeviceCooperativeMatrix2FeaturesNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceCooperativeMatrix2FeaturesNV[] clone(Arena arena, VkPhysicalDeviceCooperativeMatrix2FeaturesNV[] src) {
        VkPhysicalDeviceCooperativeMatrix2FeaturesNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$cooperativeMatrixWorkgroupScope = PathElement.groupElement("PATH$cooperativeMatrixWorkgroupScope");
    public static final PathElement PATH$cooperativeMatrixFlexibleDimensions = PathElement.groupElement("PATH$cooperativeMatrixFlexibleDimensions");
    public static final PathElement PATH$cooperativeMatrixReductions = PathElement.groupElement("PATH$cooperativeMatrixReductions");
    public static final PathElement PATH$cooperativeMatrixConversions = PathElement.groupElement("PATH$cooperativeMatrixConversions");
    public static final PathElement PATH$cooperativeMatrixPerElementOperations = PathElement.groupElement("PATH$cooperativeMatrixPerElementOperations");
    public static final PathElement PATH$cooperativeMatrixTensorAddressing = PathElement.groupElement("PATH$cooperativeMatrixTensorAddressing");
    public static final PathElement PATH$cooperativeMatrixBlockLoads = PathElement.groupElement("PATH$cooperativeMatrixBlockLoads");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$cooperativeMatrixWorkgroupScope = LAYOUT$cooperativeMatrixWorkgroupScope.byteSize();
    public static final long SIZE$cooperativeMatrixFlexibleDimensions = LAYOUT$cooperativeMatrixFlexibleDimensions.byteSize();
    public static final long SIZE$cooperativeMatrixReductions = LAYOUT$cooperativeMatrixReductions.byteSize();
    public static final long SIZE$cooperativeMatrixConversions = LAYOUT$cooperativeMatrixConversions.byteSize();
    public static final long SIZE$cooperativeMatrixPerElementOperations = LAYOUT$cooperativeMatrixPerElementOperations.byteSize();
    public static final long SIZE$cooperativeMatrixTensorAddressing = LAYOUT$cooperativeMatrixTensorAddressing.byteSize();
    public static final long SIZE$cooperativeMatrixBlockLoads = LAYOUT$cooperativeMatrixBlockLoads.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$cooperativeMatrixWorkgroupScope = LAYOUT.byteOffset(PATH$cooperativeMatrixWorkgroupScope);
    public static final long OFFSET$cooperativeMatrixFlexibleDimensions = LAYOUT.byteOffset(PATH$cooperativeMatrixFlexibleDimensions);
    public static final long OFFSET$cooperativeMatrixReductions = LAYOUT.byteOffset(PATH$cooperativeMatrixReductions);
    public static final long OFFSET$cooperativeMatrixConversions = LAYOUT.byteOffset(PATH$cooperativeMatrixConversions);
    public static final long OFFSET$cooperativeMatrixPerElementOperations = LAYOUT.byteOffset(PATH$cooperativeMatrixPerElementOperations);
    public static final long OFFSET$cooperativeMatrixTensorAddressing = LAYOUT.byteOffset(PATH$cooperativeMatrixTensorAddressing);
    public static final long OFFSET$cooperativeMatrixBlockLoads = LAYOUT.byteOffset(PATH$cooperativeMatrixBlockLoads);

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

    public @unsigned int cooperativeMatrixWorkgroupScope() {
        return segment.get(LAYOUT$cooperativeMatrixWorkgroupScope, OFFSET$cooperativeMatrixWorkgroupScope);
    }

    public void cooperativeMatrixWorkgroupScope(@unsigned int value) {
        segment.set(LAYOUT$cooperativeMatrixWorkgroupScope, OFFSET$cooperativeMatrixWorkgroupScope, value);
    }

    public @unsigned int cooperativeMatrixFlexibleDimensions() {
        return segment.get(LAYOUT$cooperativeMatrixFlexibleDimensions, OFFSET$cooperativeMatrixFlexibleDimensions);
    }

    public void cooperativeMatrixFlexibleDimensions(@unsigned int value) {
        segment.set(LAYOUT$cooperativeMatrixFlexibleDimensions, OFFSET$cooperativeMatrixFlexibleDimensions, value);
    }

    public @unsigned int cooperativeMatrixReductions() {
        return segment.get(LAYOUT$cooperativeMatrixReductions, OFFSET$cooperativeMatrixReductions);
    }

    public void cooperativeMatrixReductions(@unsigned int value) {
        segment.set(LAYOUT$cooperativeMatrixReductions, OFFSET$cooperativeMatrixReductions, value);
    }

    public @unsigned int cooperativeMatrixConversions() {
        return segment.get(LAYOUT$cooperativeMatrixConversions, OFFSET$cooperativeMatrixConversions);
    }

    public void cooperativeMatrixConversions(@unsigned int value) {
        segment.set(LAYOUT$cooperativeMatrixConversions, OFFSET$cooperativeMatrixConversions, value);
    }

    public @unsigned int cooperativeMatrixPerElementOperations() {
        return segment.get(LAYOUT$cooperativeMatrixPerElementOperations, OFFSET$cooperativeMatrixPerElementOperations);
    }

    public void cooperativeMatrixPerElementOperations(@unsigned int value) {
        segment.set(LAYOUT$cooperativeMatrixPerElementOperations, OFFSET$cooperativeMatrixPerElementOperations, value);
    }

    public @unsigned int cooperativeMatrixTensorAddressing() {
        return segment.get(LAYOUT$cooperativeMatrixTensorAddressing, OFFSET$cooperativeMatrixTensorAddressing);
    }

    public void cooperativeMatrixTensorAddressing(@unsigned int value) {
        segment.set(LAYOUT$cooperativeMatrixTensorAddressing, OFFSET$cooperativeMatrixTensorAddressing, value);
    }

    public @unsigned int cooperativeMatrixBlockLoads() {
        return segment.get(LAYOUT$cooperativeMatrixBlockLoads, OFFSET$cooperativeMatrixBlockLoads);
    }

    public void cooperativeMatrixBlockLoads(@unsigned int value) {
        segment.set(LAYOUT$cooperativeMatrixBlockLoads, OFFSET$cooperativeMatrixBlockLoads, value);
    }

}
