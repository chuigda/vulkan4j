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

public record VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("clustercullingShader"),
        ValueLayout.JAVA_INT.withName("multiviewClusterCullingShader")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$clustercullingShader = PathElement.groupElement("clustercullingShader");
    public static final PathElement PATH$multiviewClusterCullingShader = PathElement.groupElement("multiviewClusterCullingShader");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$clustercullingShader = (OfInt) LAYOUT.select(PATH$clustercullingShader);
    public static final OfInt LAYOUT$multiviewClusterCullingShader = (OfInt) LAYOUT.select(PATH$multiviewClusterCullingShader);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$clustercullingShader = LAYOUT.byteOffset(PATH$clustercullingShader);
    public static final long OFFSET$multiviewClusterCullingShader = LAYOUT.byteOffset(PATH$multiviewClusterCullingShader);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$clustercullingShader = LAYOUT$clustercullingShader.byteSize();
    public static final long SIZE$multiviewClusterCullingShader = LAYOUT$multiviewClusterCullingShader.byteSize();

    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_FEATURES_HUAWEI);
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @unsigned int clustercullingShader() {
        return segment.get(LAYOUT$clustercullingShader, OFFSET$clustercullingShader);
    }

    public void clustercullingShader(@unsigned int value) {
        segment.set(LAYOUT$clustercullingShader, OFFSET$clustercullingShader, value);
    }

    public @unsigned int multiviewClusterCullingShader() {
        return segment.get(LAYOUT$multiviewClusterCullingShader, OFFSET$multiviewClusterCullingShader);
    }

    public void multiviewClusterCullingShader(@unsigned int value) {
        segment.set(LAYOUT$multiviewClusterCullingShader, OFFSET$multiviewClusterCullingShader, value);
    }

    public static VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI allocate(Arena arena) {
        return new VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI[] ret = new VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
