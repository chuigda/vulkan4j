package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotations.*;
import tech.icey.vk4j.array.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.ptr.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceMeshShaderFeaturesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("taskShader"),
        ValueLayout.JAVA_INT.withName("meshShader"),
        ValueLayout.JAVA_INT.withName("multiviewMeshShader"),
        ValueLayout.JAVA_INT.withName("primitiveFragmentShadingRateMeshShader"),
        ValueLayout.JAVA_INT.withName("meshShaderQueries")
    );

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


    public static final class VkPhysicalDeviceMeshShaderFeaturesEXTFactory implements IFactory<VkPhysicalDeviceMeshShaderFeaturesEXT> {
        @Override
        public Class<VkPhysicalDeviceMeshShaderFeaturesEXT> clazz() {
            return VkPhysicalDeviceMeshShaderFeaturesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceMeshShaderFeaturesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceMeshShaderFeaturesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceMeshShaderFeaturesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceMeshShaderFeaturesEXT(segment);
        }
    }

    public static final VkPhysicalDeviceMeshShaderFeaturesEXTFactory FACTORY = new VkPhysicalDeviceMeshShaderFeaturesEXTFactory();
}
