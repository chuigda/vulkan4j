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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceMeshShaderFeaturesEXT.html">VkPhysicalDeviceMeshShaderFeaturesEXT</a>
@ValueBasedCandidate
public record VkPhysicalDeviceMeshShaderFeaturesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$taskShader = ValueLayout.JAVA_INT.withName("taskShader");
    public static final OfInt LAYOUT$meshShader = ValueLayout.JAVA_INT.withName("meshShader");
    public static final OfInt LAYOUT$multiviewMeshShader = ValueLayout.JAVA_INT.withName("multiviewMeshShader");
    public static final OfInt LAYOUT$primitiveFragmentShadingRateMeshShader = ValueLayout.JAVA_INT.withName("primitiveFragmentShadingRateMeshShader");
    public static final OfInt LAYOUT$meshShaderQueries = ValueLayout.JAVA_INT.withName("meshShaderQueries");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$taskShader, LAYOUT$meshShader, LAYOUT$multiviewMeshShader, LAYOUT$primitiveFragmentShadingRateMeshShader, LAYOUT$meshShaderQueries);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceMeshShaderFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceMeshShaderFeaturesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceMeshShaderFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceMeshShaderFeaturesEXT[] ret = new VkPhysicalDeviceMeshShaderFeaturesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceMeshShaderFeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceMeshShaderFeaturesEXT clone(Arena arena, VkPhysicalDeviceMeshShaderFeaturesEXT src) {
        VkPhysicalDeviceMeshShaderFeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceMeshShaderFeaturesEXT[] clone(Arena arena, VkPhysicalDeviceMeshShaderFeaturesEXT[] src) {
        VkPhysicalDeviceMeshShaderFeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$taskShader = PathElement.groupElement("PATH$taskShader");
    public static final PathElement PATH$meshShader = PathElement.groupElement("PATH$meshShader");
    public static final PathElement PATH$multiviewMeshShader = PathElement.groupElement("PATH$multiviewMeshShader");
    public static final PathElement PATH$primitiveFragmentShadingRateMeshShader = PathElement.groupElement("PATH$primitiveFragmentShadingRateMeshShader");
    public static final PathElement PATH$meshShaderQueries = PathElement.groupElement("PATH$meshShaderQueries");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$taskShader = LAYOUT$taskShader.byteSize();
    public static final long SIZE$meshShader = LAYOUT$meshShader.byteSize();
    public static final long SIZE$multiviewMeshShader = LAYOUT$multiviewMeshShader.byteSize();
    public static final long SIZE$primitiveFragmentShadingRateMeshShader = LAYOUT$primitiveFragmentShadingRateMeshShader.byteSize();
    public static final long SIZE$meshShaderQueries = LAYOUT$meshShaderQueries.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$taskShader = LAYOUT.byteOffset(PATH$taskShader);
    public static final long OFFSET$meshShader = LAYOUT.byteOffset(PATH$meshShader);
    public static final long OFFSET$multiviewMeshShader = LAYOUT.byteOffset(PATH$multiviewMeshShader);
    public static final long OFFSET$primitiveFragmentShadingRateMeshShader = LAYOUT.byteOffset(PATH$primitiveFragmentShadingRateMeshShader);
    public static final long OFFSET$meshShaderQueries = LAYOUT.byteOffset(PATH$meshShaderQueries);

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

    public @unsigned int taskShader() {
        return segment.get(LAYOUT$taskShader, OFFSET$taskShader);
    }

    public void taskShader(@unsigned int value) {
        segment.set(LAYOUT$taskShader, OFFSET$taskShader, value);
    }

    public @unsigned int meshShader() {
        return segment.get(LAYOUT$meshShader, OFFSET$meshShader);
    }

    public void meshShader(@unsigned int value) {
        segment.set(LAYOUT$meshShader, OFFSET$meshShader, value);
    }

    public @unsigned int multiviewMeshShader() {
        return segment.get(LAYOUT$multiviewMeshShader, OFFSET$multiviewMeshShader);
    }

    public void multiviewMeshShader(@unsigned int value) {
        segment.set(LAYOUT$multiviewMeshShader, OFFSET$multiviewMeshShader, value);
    }

    public @unsigned int primitiveFragmentShadingRateMeshShader() {
        return segment.get(LAYOUT$primitiveFragmentShadingRateMeshShader, OFFSET$primitiveFragmentShadingRateMeshShader);
    }

    public void primitiveFragmentShadingRateMeshShader(@unsigned int value) {
        segment.set(LAYOUT$primitiveFragmentShadingRateMeshShader, OFFSET$primitiveFragmentShadingRateMeshShader, value);
    }

    public @unsigned int meshShaderQueries() {
        return segment.get(LAYOUT$meshShaderQueries, OFFSET$meshShaderQueries);
    }

    public void meshShaderQueries(@unsigned int value) {
        segment.set(LAYOUT$meshShaderQueries, OFFSET$meshShaderQueries, value);
    }

}
