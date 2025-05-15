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

/// Represents a pointer to a {@code VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI.html">VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI(@NotNull MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceClusterCullingShaderFeaturesHUAWEI {
        sType(VkStructureType.PHYSICAL_DEVICE_CLUSTER_CULLING_SHADER_FEATURES_HUAWEI);
    }

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

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("clustercullingShader"),
        ValueLayout.JAVA_INT.withName("multiviewClusterCullingShader")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$clustercullingShader = PathElement.groupElement("PATH$clustercullingShader");
    public static final PathElement PATH$multiviewClusterCullingShader = PathElement.groupElement("PATH$multiviewClusterCullingShader");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$clustercullingShader = (OfInt) LAYOUT.select(PATH$clustercullingShader);
    public static final OfInt LAYOUT$multiviewClusterCullingShader = (OfInt) LAYOUT.select(PATH$multiviewClusterCullingShader);

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
