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

public record VkPhysicalDeviceRenderPassStripedPropertiesARM(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkExtent2D.LAYOUT.withName("renderPassStripeGranularity"),
        ValueLayout.JAVA_INT.withName("maxRenderPassStripes")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$renderPassStripeGranularity = PathElement.groupElement("renderPassStripeGranularity");
    public static final PathElement PATH$maxRenderPassStripes = PathElement.groupElement("maxRenderPassStripes");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$renderPassStripeGranularity = (StructLayout) LAYOUT.select(PATH$renderPassStripeGranularity);
    public static final OfInt LAYOUT$maxRenderPassStripes = (OfInt) LAYOUT.select(PATH$maxRenderPassStripes);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$renderPassStripeGranularity = LAYOUT.byteOffset(PATH$renderPassStripeGranularity);
    public static final long OFFSET$maxRenderPassStripes = LAYOUT.byteOffset(PATH$maxRenderPassStripes);

    public VkPhysicalDeviceRenderPassStripedPropertiesARM(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_RENDER_PASS_STRIPED_PROPERTIES_ARM);
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

    public VkExtent2D renderPassStripeGranularity() {
        return new VkExtent2D(segment.asSlice(OFFSET$renderPassStripeGranularity, LAYOUT$renderPassStripeGranularity));
    }

    public void renderPassStripeGranularity(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$renderPassStripeGranularity, LAYOUT$renderPassStripeGranularity.byteSize());
    }

    public @unsigned int maxRenderPassStripes() {
        return segment.get(LAYOUT$maxRenderPassStripes, OFFSET$maxRenderPassStripes);
    }

    public void maxRenderPassStripes(@unsigned int value) {
        segment.set(LAYOUT$maxRenderPassStripes, OFFSET$maxRenderPassStripes, value);
    }


    public static final class Factory implements IFactory<VkPhysicalDeviceRenderPassStripedPropertiesARM> {
        @Override
        public Class<VkPhysicalDeviceRenderPassStripedPropertiesARM> clazz() {
            return VkPhysicalDeviceRenderPassStripedPropertiesARM.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceRenderPassStripedPropertiesARM.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceRenderPassStripedPropertiesARM create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceRenderPassStripedPropertiesARM createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceRenderPassStripedPropertiesARM(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
