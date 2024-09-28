package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceSubgroupProperties(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("subgroupSize"),
        ValueLayout.JAVA_INT.withName("supportedStages"),
        ValueLayout.JAVA_INT.withName("supportedOperations"),
        ValueLayout.JAVA_INT.withName("quadOperationsInAllStages")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$subgroupSize = PathElement.groupElement("subgroupSize");
    public static final PathElement PATH$supportedStages = PathElement.groupElement("supportedStages");
    public static final PathElement PATH$supportedOperations = PathElement.groupElement("supportedOperations");
    public static final PathElement PATH$quadOperationsInAllStages = PathElement.groupElement("quadOperationsInAllStages");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$subgroupSize = (OfInt) LAYOUT.select(PATH$subgroupSize);
    public static final OfInt LAYOUT$supportedStages = (OfInt) LAYOUT.select(PATH$supportedStages);
    public static final OfInt LAYOUT$supportedOperations = (OfInt) LAYOUT.select(PATH$supportedOperations);
    public static final OfInt LAYOUT$quadOperationsInAllStages = (OfInt) LAYOUT.select(PATH$quadOperationsInAllStages);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$subgroupSize = LAYOUT.byteOffset(PATH$subgroupSize);
    public static final long OFFSET$supportedStages = LAYOUT.byteOffset(PATH$supportedStages);
    public static final long OFFSET$supportedOperations = LAYOUT.byteOffset(PATH$supportedOperations);
    public static final long OFFSET$quadOperationsInAllStages = LAYOUT.byteOffset(PATH$quadOperationsInAllStages);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$subgroupSize = LAYOUT$subgroupSize.byteSize();
    public static final long SIZE$supportedStages = LAYOUT$supportedStages.byteSize();
    public static final long SIZE$supportedOperations = LAYOUT$supportedOperations.byteSize();
    public static final long SIZE$quadOperationsInAllStages = LAYOUT$quadOperationsInAllStages.byteSize();

    public VkPhysicalDeviceSubgroupProperties(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SUBGROUP_PROPERTIES);
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

    public static VkPhysicalDeviceSubgroupProperties allocate(Arena arena) {
        return new VkPhysicalDeviceSubgroupProperties(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceSubgroupProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceSubgroupProperties[] ret = new VkPhysicalDeviceSubgroupProperties[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceSubgroupProperties(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
