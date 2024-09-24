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

public record VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("multisampledRenderToSingleSampled")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$multisampledRenderToSingleSampled = PathElement.groupElement("multisampledRenderToSingleSampled");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$multisampledRenderToSingleSampled = (OfInt) LAYOUT.select(PATH$multisampledRenderToSingleSampled);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$multisampledRenderToSingleSampled = LAYOUT.byteOffset(PATH$multisampledRenderToSingleSampled);

    public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTISAMPLED_RENDER_TO_SINGLE_SAMPLED_FEATURES_EXT);
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

    public @unsigned int multisampledRenderToSingleSampled() {
        return segment.get(LAYOUT$multisampledRenderToSingleSampled, OFFSET$multisampledRenderToSingleSampled);
    }

    public void multisampledRenderToSingleSampled(@unsigned int value) {
        segment.set(LAYOUT$multisampledRenderToSingleSampled, OFFSET$multisampledRenderToSingleSampled, value);
    }


    public static final class VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXTFactory implements IFactory<VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT> {
        @Override
        public Class<VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT> clazz() {
            return VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXT(segment);
        }
    }

    public static final VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXTFactory FACTORY = new VkPhysicalDeviceMultisampledRenderToSingleSampledFeaturesEXTFactory();
}
