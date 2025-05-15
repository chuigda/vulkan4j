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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceSubgroupSizeControlProperties.html">VkPhysicalDeviceSubgroupSizeControlProperties</a>
@ValueBasedCandidate
public record VkPhysicalDeviceSubgroupSizeControlProperties(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$minSubgroupSize = ValueLayout.JAVA_INT.withName("minSubgroupSize");
    public static final OfInt LAYOUT$maxSubgroupSize = ValueLayout.JAVA_INT.withName("maxSubgroupSize");
    public static final OfInt LAYOUT$maxComputeWorkgroupSubgroups = ValueLayout.JAVA_INT.withName("maxComputeWorkgroupSubgroups");
    public static final OfInt LAYOUT$requiredSubgroupSizeStages = ValueLayout.JAVA_INT.withName("requiredSubgroupSizeStages");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$minSubgroupSize, LAYOUT$maxSubgroupSize, LAYOUT$maxComputeWorkgroupSubgroups, LAYOUT$requiredSubgroupSizeStages);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceSubgroupSizeControlProperties allocate(Arena arena) {
        return new VkPhysicalDeviceSubgroupSizeControlProperties(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceSubgroupSizeControlProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceSubgroupSizeControlProperties[] ret = new VkPhysicalDeviceSubgroupSizeControlProperties[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceSubgroupSizeControlProperties(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceSubgroupSizeControlProperties clone(Arena arena, VkPhysicalDeviceSubgroupSizeControlProperties src) {
        VkPhysicalDeviceSubgroupSizeControlProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceSubgroupSizeControlProperties[] clone(Arena arena, VkPhysicalDeviceSubgroupSizeControlProperties[] src) {
        VkPhysicalDeviceSubgroupSizeControlProperties[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$minSubgroupSize = PathElement.groupElement("PATH$minSubgroupSize");
    public static final PathElement PATH$maxSubgroupSize = PathElement.groupElement("PATH$maxSubgroupSize");
    public static final PathElement PATH$maxComputeWorkgroupSubgroups = PathElement.groupElement("PATH$maxComputeWorkgroupSubgroups");
    public static final PathElement PATH$requiredSubgroupSizeStages = PathElement.groupElement("PATH$requiredSubgroupSizeStages");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$minSubgroupSize = LAYOUT$minSubgroupSize.byteSize();
    public static final long SIZE$maxSubgroupSize = LAYOUT$maxSubgroupSize.byteSize();
    public static final long SIZE$maxComputeWorkgroupSubgroups = LAYOUT$maxComputeWorkgroupSubgroups.byteSize();
    public static final long SIZE$requiredSubgroupSizeStages = LAYOUT$requiredSubgroupSizeStages.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$minSubgroupSize = LAYOUT.byteOffset(PATH$minSubgroupSize);
    public static final long OFFSET$maxSubgroupSize = LAYOUT.byteOffset(PATH$maxSubgroupSize);
    public static final long OFFSET$maxComputeWorkgroupSubgroups = LAYOUT.byteOffset(PATH$maxComputeWorkgroupSubgroups);
    public static final long OFFSET$requiredSubgroupSizeStages = LAYOUT.byteOffset(PATH$requiredSubgroupSizeStages);

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

    public @unsigned int minSubgroupSize() {
        return segment.get(LAYOUT$minSubgroupSize, OFFSET$minSubgroupSize);
    }

    public void minSubgroupSize(@unsigned int value) {
        segment.set(LAYOUT$minSubgroupSize, OFFSET$minSubgroupSize, value);
    }

    public @unsigned int maxSubgroupSize() {
        return segment.get(LAYOUT$maxSubgroupSize, OFFSET$maxSubgroupSize);
    }

    public void maxSubgroupSize(@unsigned int value) {
        segment.set(LAYOUT$maxSubgroupSize, OFFSET$maxSubgroupSize, value);
    }

    public @unsigned int maxComputeWorkgroupSubgroups() {
        return segment.get(LAYOUT$maxComputeWorkgroupSubgroups, OFFSET$maxComputeWorkgroupSubgroups);
    }

    public void maxComputeWorkgroupSubgroups(@unsigned int value) {
        segment.set(LAYOUT$maxComputeWorkgroupSubgroups, OFFSET$maxComputeWorkgroupSubgroups, value);
    }

    public @enumtype(VkShaderStageFlags.class) int requiredSubgroupSizeStages() {
        return segment.get(LAYOUT$requiredSubgroupSizeStages, OFFSET$requiredSubgroupSizeStages);
    }

    public void requiredSubgroupSizeStages(@enumtype(VkShaderStageFlags.class) int value) {
        segment.set(LAYOUT$requiredSubgroupSizeStages, OFFSET$requiredSubgroupSizeStages, value);
    }

}
