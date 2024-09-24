package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkSwapchainDisplayNativeHdrCreateInfoAMD(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("localDimmingEnable")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$localDimmingEnable = PathElement.groupElement("localDimmingEnable");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$localDimmingEnable = (OfInt) LAYOUT.select(PATH$localDimmingEnable);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$localDimmingEnable = LAYOUT.byteOffset(PATH$localDimmingEnable);

    public VkSwapchainDisplayNativeHdrCreateInfoAMD(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SWAPCHAIN_DISPLAY_NATIVE_HDR_CREATE_INFO_AMD);
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

    public @unsigned int localDimmingEnable() {
        return segment.get(LAYOUT$localDimmingEnable, OFFSET$localDimmingEnable);
    }

    public void localDimmingEnable(@unsigned int value) {
        segment.set(LAYOUT$localDimmingEnable, OFFSET$localDimmingEnable, value);
    }


    public static final class Factory implements IFactory<VkSwapchainDisplayNativeHdrCreateInfoAMD> {
        @Override
        public Class<VkSwapchainDisplayNativeHdrCreateInfoAMD> clazz() {
            return VkSwapchainDisplayNativeHdrCreateInfoAMD.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkSwapchainDisplayNativeHdrCreateInfoAMD.LAYOUT;
        }

        @Override
        public VkSwapchainDisplayNativeHdrCreateInfoAMD create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkSwapchainDisplayNativeHdrCreateInfoAMD createUninit(MemorySegment segment) {
            return new VkSwapchainDisplayNativeHdrCreateInfoAMD(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
