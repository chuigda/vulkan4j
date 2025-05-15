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

public record VkPhysicalDeviceVulkanMemoryModelFeatures(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$vulkanMemoryModel = ValueLayout.JAVA_INT.withName("vulkanMemoryModel");
    public static final OfInt LAYOUT$vulkanMemoryModelDeviceScope = ValueLayout.JAVA_INT.withName("vulkanMemoryModelDeviceScope");
    public static final OfInt LAYOUT$vulkanMemoryModelAvailabilityVisibilityChains = ValueLayout.JAVA_INT.withName("vulkanMemoryModelAvailabilityVisibilityChains");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$vulkanMemoryModel, LAYOUT$vulkanMemoryModelDeviceScope, LAYOUT$vulkanMemoryModelAvailabilityVisibilityChains);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceVulkanMemoryModelFeatures allocate(Arena arena) {
        return new VkPhysicalDeviceVulkanMemoryModelFeatures(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceVulkanMemoryModelFeatures[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceVulkanMemoryModelFeatures[] ret = new VkPhysicalDeviceVulkanMemoryModelFeatures[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceVulkanMemoryModelFeatures(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceVulkanMemoryModelFeatures clone(Arena arena, VkPhysicalDeviceVulkanMemoryModelFeatures src) {
        VkPhysicalDeviceVulkanMemoryModelFeatures ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceVulkanMemoryModelFeatures[] clone(Arena arena, VkPhysicalDeviceVulkanMemoryModelFeatures[] src) {
        VkPhysicalDeviceVulkanMemoryModelFeatures[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$vulkanMemoryModel = PathElement.groupElement("PATH$vulkanMemoryModel");
    public static final PathElement PATH$vulkanMemoryModelDeviceScope = PathElement.groupElement("PATH$vulkanMemoryModelDeviceScope");
    public static final PathElement PATH$vulkanMemoryModelAvailabilityVisibilityChains = PathElement.groupElement("PATH$vulkanMemoryModelAvailabilityVisibilityChains");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$vulkanMemoryModel = LAYOUT$vulkanMemoryModel.byteSize();
    public static final long SIZE$vulkanMemoryModelDeviceScope = LAYOUT$vulkanMemoryModelDeviceScope.byteSize();
    public static final long SIZE$vulkanMemoryModelAvailabilityVisibilityChains = LAYOUT$vulkanMemoryModelAvailabilityVisibilityChains.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$vulkanMemoryModel = LAYOUT.byteOffset(PATH$vulkanMemoryModel);
    public static final long OFFSET$vulkanMemoryModelDeviceScope = LAYOUT.byteOffset(PATH$vulkanMemoryModelDeviceScope);
    public static final long OFFSET$vulkanMemoryModelAvailabilityVisibilityChains = LAYOUT.byteOffset(PATH$vulkanMemoryModelAvailabilityVisibilityChains);

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

    public @unsigned int vulkanMemoryModel() {
        return segment.get(LAYOUT$vulkanMemoryModel, OFFSET$vulkanMemoryModel);
    }

    public void vulkanMemoryModel(@unsigned int value) {
        segment.set(LAYOUT$vulkanMemoryModel, OFFSET$vulkanMemoryModel, value);
    }

    public @unsigned int vulkanMemoryModelDeviceScope() {
        return segment.get(LAYOUT$vulkanMemoryModelDeviceScope, OFFSET$vulkanMemoryModelDeviceScope);
    }

    public void vulkanMemoryModelDeviceScope(@unsigned int value) {
        segment.set(LAYOUT$vulkanMemoryModelDeviceScope, OFFSET$vulkanMemoryModelDeviceScope, value);
    }

    public @unsigned int vulkanMemoryModelAvailabilityVisibilityChains() {
        return segment.get(LAYOUT$vulkanMemoryModelAvailabilityVisibilityChains, OFFSET$vulkanMemoryModelAvailabilityVisibilityChains);
    }

    public void vulkanMemoryModelAvailabilityVisibilityChains(@unsigned int value) {
        segment.set(LAYOUT$vulkanMemoryModelAvailabilityVisibilityChains, OFFSET$vulkanMemoryModelAvailabilityVisibilityChains, value);
    }

}
/// dummy, not implemented yet
