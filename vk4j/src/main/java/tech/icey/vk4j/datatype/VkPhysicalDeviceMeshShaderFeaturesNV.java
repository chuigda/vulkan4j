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

public record VkPhysicalDeviceMeshShaderFeaturesNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("taskShader"),
        ValueLayout.JAVA_INT.withName("meshShader")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$taskShader = PathElement.groupElement("taskShader");
    public static final PathElement PATH$meshShader = PathElement.groupElement("meshShader");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$taskShader = (OfInt) LAYOUT.select(PATH$taskShader);
    public static final OfInt LAYOUT$meshShader = (OfInt) LAYOUT.select(PATH$meshShader);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$taskShader = LAYOUT.byteOffset(PATH$taskShader);
    public static final long OFFSET$meshShader = LAYOUT.byteOffset(PATH$meshShader);

    public VkPhysicalDeviceMeshShaderFeaturesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MESH_SHADER_FEATURES_NV);
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


    public static final class VkPhysicalDeviceMeshShaderFeaturesNVFactory implements IFactory<VkPhysicalDeviceMeshShaderFeaturesNV> {
        @Override
        public Class<VkPhysicalDeviceMeshShaderFeaturesNV> clazz() {
            return VkPhysicalDeviceMeshShaderFeaturesNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceMeshShaderFeaturesNV.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceMeshShaderFeaturesNV create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceMeshShaderFeaturesNV createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceMeshShaderFeaturesNV(segment);
        }
    }

    public static final VkPhysicalDeviceMeshShaderFeaturesNVFactory FACTORY = new VkPhysicalDeviceMeshShaderFeaturesNVFactory();
}
