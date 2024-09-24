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

public record VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("primitiveTopologyListRestart"),
        ValueLayout.JAVA_INT.withName("primitiveTopologyPatchListRestart")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$primitiveTopologyListRestart = PathElement.groupElement("primitiveTopologyListRestart");
    public static final PathElement PATH$primitiveTopologyPatchListRestart = PathElement.groupElement("primitiveTopologyPatchListRestart");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$primitiveTopologyListRestart = (OfInt) LAYOUT.select(PATH$primitiveTopologyListRestart);
    public static final OfInt LAYOUT$primitiveTopologyPatchListRestart = (OfInt) LAYOUT.select(PATH$primitiveTopologyPatchListRestart);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$primitiveTopologyListRestart = LAYOUT.byteOffset(PATH$primitiveTopologyListRestart);
    public static final long OFFSET$primitiveTopologyPatchListRestart = LAYOUT.byteOffset(PATH$primitiveTopologyPatchListRestart);

    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIMITIVE_TOPOLOGY_LIST_RESTART_FEATURES_EXT);
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

    public @unsigned int primitiveTopologyListRestart() {
        return segment.get(LAYOUT$primitiveTopologyListRestart, OFFSET$primitiveTopologyListRestart);
    }

    public void primitiveTopologyListRestart(@unsigned int value) {
        segment.set(LAYOUT$primitiveTopologyListRestart, OFFSET$primitiveTopologyListRestart, value);
    }

    public @unsigned int primitiveTopologyPatchListRestart() {
        return segment.get(LAYOUT$primitiveTopologyPatchListRestart, OFFSET$primitiveTopologyPatchListRestart);
    }

    public void primitiveTopologyPatchListRestart(@unsigned int value) {
        segment.set(LAYOUT$primitiveTopologyPatchListRestart, OFFSET$primitiveTopologyPatchListRestart, value);
    }


    public static final class Factory implements IFactory<VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT> {
        @Override
        public Class<VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT> clazz() {
            return VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
