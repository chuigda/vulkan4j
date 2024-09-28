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

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceMeshShaderFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 taskShader;
///     VkBool32 meshShader;
///     VkBool32 multiviewMeshShader;
///     VkBool32 primitiveFragmentShadingRateMeshShader;
///     VkBool32 meshShaderQueries;
/// } VkPhysicalDeviceMeshShaderFeaturesEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceMeshShaderFeaturesEXT.html">VkPhysicalDeviceMeshShaderFeaturesEXT</a>
public record VkPhysicalDeviceMeshShaderFeaturesEXT(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("taskShader"),
        ValueLayout.JAVA_INT.withName("meshShader"),
        ValueLayout.JAVA_INT.withName("multiviewMeshShader"),
        ValueLayout.JAVA_INT.withName("primitiveFragmentShadingRateMeshShader"),
        ValueLayout.JAVA_INT.withName("meshShaderQueries")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$taskShader = PathElement.groupElement("taskShader");
    public static final PathElement PATH$meshShader = PathElement.groupElement("meshShader");
    public static final PathElement PATH$multiviewMeshShader = PathElement.groupElement("multiviewMeshShader");
    public static final PathElement PATH$primitiveFragmentShadingRateMeshShader = PathElement.groupElement("primitiveFragmentShadingRateMeshShader");
    public static final PathElement PATH$meshShaderQueries = PathElement.groupElement("meshShaderQueries");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$taskShader = (OfInt) LAYOUT.select(PATH$taskShader);
    public static final OfInt LAYOUT$meshShader = (OfInt) LAYOUT.select(PATH$meshShader);
    public static final OfInt LAYOUT$multiviewMeshShader = (OfInt) LAYOUT.select(PATH$multiviewMeshShader);
    public static final OfInt LAYOUT$primitiveFragmentShadingRateMeshShader = (OfInt) LAYOUT.select(PATH$primitiveFragmentShadingRateMeshShader);
    public static final OfInt LAYOUT$meshShaderQueries = (OfInt) LAYOUT.select(PATH$meshShaderQueries);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$taskShader = LAYOUT.byteOffset(PATH$taskShader);
    public static final long OFFSET$meshShader = LAYOUT.byteOffset(PATH$meshShader);
    public static final long OFFSET$multiviewMeshShader = LAYOUT.byteOffset(PATH$multiviewMeshShader);
    public static final long OFFSET$primitiveFragmentShadingRateMeshShader = LAYOUT.byteOffset(PATH$primitiveFragmentShadingRateMeshShader);
    public static final long OFFSET$meshShaderQueries = LAYOUT.byteOffset(PATH$meshShaderQueries);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$taskShader = LAYOUT$taskShader.byteSize();
    public static final long SIZE$meshShader = LAYOUT$meshShader.byteSize();
    public static final long SIZE$multiviewMeshShader = LAYOUT$multiviewMeshShader.byteSize();
    public static final long SIZE$primitiveFragmentShadingRateMeshShader = LAYOUT$primitiveFragmentShadingRateMeshShader.byteSize();
    public static final long SIZE$meshShaderQueries = LAYOUT$meshShaderQueries.byteSize();

    public VkPhysicalDeviceMeshShaderFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_FEATURES_EXT);
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

    public static VkPhysicalDeviceMeshShaderFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceMeshShaderFeaturesEXT(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceMeshShaderFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceMeshShaderFeaturesEXT[] ret = new VkPhysicalDeviceMeshShaderFeaturesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceMeshShaderFeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
