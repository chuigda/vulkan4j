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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceSubgroupProperties.html">VkPhysicalDeviceSubgroupProperties</a>
@ValueBasedCandidate
public record VkPhysicalDeviceSubgroupProperties(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$subgroupSize = ValueLayout.JAVA_INT.withName("subgroupSize");
    public static final OfInt LAYOUT$supportedStages = ValueLayout.JAVA_INT.withName("supportedStages");
    public static final OfInt LAYOUT$supportedOperations = ValueLayout.JAVA_INT.withName("supportedOperations");
    public static final OfInt LAYOUT$quadOperationsInAllStages = ValueLayout.JAVA_INT.withName("quadOperationsInAllStages");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$subgroupSize, LAYOUT$supportedStages, LAYOUT$supportedOperations, LAYOUT$quadOperationsInAllStages);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceSubgroupProperties allocate(Arena arena) {
        return new VkPhysicalDeviceSubgroupProperties(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceSubgroupProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceSubgroupProperties[] ret = new VkPhysicalDeviceSubgroupProperties[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceSubgroupProperties(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceSubgroupProperties clone(Arena arena, VkPhysicalDeviceSubgroupProperties src) {
        VkPhysicalDeviceSubgroupProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceSubgroupProperties[] clone(Arena arena, VkPhysicalDeviceSubgroupProperties[] src) {
        VkPhysicalDeviceSubgroupProperties[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$subgroupSize = PathElement.groupElement("PATH$subgroupSize");
    public static final PathElement PATH$supportedStages = PathElement.groupElement("PATH$supportedStages");
    public static final PathElement PATH$supportedOperations = PathElement.groupElement("PATH$supportedOperations");
    public static final PathElement PATH$quadOperationsInAllStages = PathElement.groupElement("PATH$quadOperationsInAllStages");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$subgroupSize = LAYOUT$subgroupSize.byteSize();
    public static final long SIZE$supportedStages = LAYOUT$supportedStages.byteSize();
    public static final long SIZE$supportedOperations = LAYOUT$supportedOperations.byteSize();
    public static final long SIZE$quadOperationsInAllStages = LAYOUT$quadOperationsInAllStages.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$subgroupSize = LAYOUT.byteOffset(PATH$subgroupSize);
    public static final long OFFSET$supportedStages = LAYOUT.byteOffset(PATH$supportedStages);
    public static final long OFFSET$supportedOperations = LAYOUT.byteOffset(PATH$supportedOperations);
    public static final long OFFSET$quadOperationsInAllStages = LAYOUT.byteOffset(PATH$quadOperationsInAllStages);

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

    public @unsigned int subgroupSize() {
        return segment.get(LAYOUT$subgroupSize, OFFSET$subgroupSize);
    }

    public void subgroupSize(@unsigned int value) {
        segment.set(LAYOUT$subgroupSize, OFFSET$subgroupSize, value);
    }

    public @enumtype(VkShaderStageFlags.class) int supportedStages() {
        return segment.get(LAYOUT$supportedStages, OFFSET$supportedStages);
    }

    public void supportedStages(@enumtype(VkShaderStageFlags.class) int value) {
        segment.set(LAYOUT$supportedStages, OFFSET$supportedStages, value);
    }

    public @enumtype(VkSubgroupFeatureFlags.class) int supportedOperations() {
        return segment.get(LAYOUT$supportedOperations, OFFSET$supportedOperations);
    }

    public void supportedOperations(@enumtype(VkSubgroupFeatureFlags.class) int value) {
        segment.set(LAYOUT$supportedOperations, OFFSET$supportedOperations, value);
    }

    public @unsigned int quadOperationsInAllStages() {
        return segment.get(LAYOUT$quadOperationsInAllStages, OFFSET$quadOperationsInAllStages);
    }

    public void quadOperationsInAllStages(@unsigned int value) {
        segment.set(LAYOUT$quadOperationsInAllStages, OFFSET$quadOperationsInAllStages, value);
    }

}
