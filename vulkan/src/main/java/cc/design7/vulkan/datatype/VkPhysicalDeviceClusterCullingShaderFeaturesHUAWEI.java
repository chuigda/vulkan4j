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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.html">VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI</a>
@ValueBasedCandidate
public record VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$clustercullingShader = ValueLayout.JAVA_INT.withName("clustercullingShader");
    public static final OfInt LAYOUT$multiviewClusterCullingShader = ValueLayout.JAVA_INT.withName("multiviewClusterCullingShader");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$clustercullingShader, LAYOUT$multiviewClusterCullingShader);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI allocate(Arena arena) {
        return new VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI[] ret = new VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI clone(Arena arena, VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI src) {
        VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI[] clone(Arena arena, VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI[] src) {
        VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$clustercullingShader = PathElement.groupElement("PATH$clustercullingShader");
    public static final PathElement PATH$multiviewClusterCullingShader = PathElement.groupElement("PATH$multiviewClusterCullingShader");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$clustercullingShader = LAYOUT$clustercullingShader.byteSize();
    public static final long SIZE$multiviewClusterCullingShader = LAYOUT$multiviewClusterCullingShader.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$clustercullingShader = LAYOUT.byteOffset(PATH$clustercullingShader);
    public static final long OFFSET$multiviewClusterCullingShader = LAYOUT.byteOffset(PATH$multiviewClusterCullingShader);

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

}
