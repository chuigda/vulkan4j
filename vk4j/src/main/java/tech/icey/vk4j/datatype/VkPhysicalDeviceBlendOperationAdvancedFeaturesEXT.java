package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
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

public record VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("advancedBlendCoherentOperations")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$advancedBlendCoherentOperations = PathElement.groupElement("advancedBlendCoherentOperations");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$advancedBlendCoherentOperations = (OfInt) LAYOUT.select(PATH$advancedBlendCoherentOperations);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$advancedBlendCoherentOperations = LAYOUT.byteOffset(PATH$advancedBlendCoherentOperations);

    public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_BLEND_OPERATION_ADVANCED_FEATURES_EXT);
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

    public @unsigned int advancedBlendCoherentOperations() {
        return segment.get(LAYOUT$advancedBlendCoherentOperations, OFFSET$advancedBlendCoherentOperations);
    }

    public void advancedBlendCoherentOperations(@unsigned int value) {
        segment.set(LAYOUT$advancedBlendCoherentOperations, OFFSET$advancedBlendCoherentOperations, value);
    }


    public static final class Factory implements IFactory<VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT> {
        @Override
        public Class<VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT> clazz() {
            return VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceBlendOperationAdvancedFeaturesEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
