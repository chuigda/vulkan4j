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

public record VkAllocationCallbacks(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("pUserData"),
        ValueLayout.ADDRESS.withName("pfnAllocation"),
        ValueLayout.ADDRESS.withName("pfnReallocation"),
        ValueLayout.ADDRESS.withName("pfnFree"),
        ValueLayout.ADDRESS.withName("pfnInternalAllocation"),
        ValueLayout.ADDRESS.withName("pfnInternalFree")
    );

    public static final PathElement PATH$pUserData = PathElement.groupElement("pUserData");
    public static final PathElement PATH$pfnAllocation = PathElement.groupElement("pfnAllocation");
    public static final PathElement PATH$pfnReallocation = PathElement.groupElement("pfnReallocation");
    public static final PathElement PATH$pfnFree = PathElement.groupElement("pfnFree");
    public static final PathElement PATH$pfnInternalAllocation = PathElement.groupElement("pfnInternalAllocation");
    public static final PathElement PATH$pfnInternalFree = PathElement.groupElement("pfnInternalFree");

    public static final AddressLayout LAYOUT$pUserData = (AddressLayout) LAYOUT.select(PATH$pUserData);
    public static final AddressLayout LAYOUT$pfnAllocation = (AddressLayout) LAYOUT.select(PATH$pfnAllocation);
    public static final AddressLayout LAYOUT$pfnReallocation = (AddressLayout) LAYOUT.select(PATH$pfnReallocation);
    public static final AddressLayout LAYOUT$pfnFree = (AddressLayout) LAYOUT.select(PATH$pfnFree);
    public static final AddressLayout LAYOUT$pfnInternalAllocation = (AddressLayout) LAYOUT.select(PATH$pfnInternalAllocation);
    public static final AddressLayout LAYOUT$pfnInternalFree = (AddressLayout) LAYOUT.select(PATH$pfnInternalFree);

    public static final long OFFSET$pUserData = LAYOUT.byteOffset(PATH$pUserData);
    public static final long OFFSET$pfnAllocation = LAYOUT.byteOffset(PATH$pfnAllocation);
    public static final long OFFSET$pfnReallocation = LAYOUT.byteOffset(PATH$pfnReallocation);
    public static final long OFFSET$pfnFree = LAYOUT.byteOffset(PATH$pfnFree);
    public static final long OFFSET$pfnInternalAllocation = LAYOUT.byteOffset(PATH$pfnInternalAllocation);
    public static final long OFFSET$pfnInternalFree = LAYOUT.byteOffset(PATH$pfnInternalFree);

    public VkAllocationCallbacks(MemorySegment segment) {
        this.segment = segment;
    }

    public @pointer(comment="void*") MemorySegment pUserData() {
        return segment.get(LAYOUT$pUserData, OFFSET$pUserData);
    }

    public void pUserData(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pUserData, OFFSET$pUserData, value);
    }

    public @pointer(comment="PFN_vkAllocationFunction") MemorySegment pfnAllocation() {
        return segment.get(LAYOUT$pfnAllocation, OFFSET$pfnAllocation);
    }

    public void pfnAllocation(@pointer(comment="PFN_vkAllocationFunction") MemorySegment value) {
        segment.set(LAYOUT$pfnAllocation, OFFSET$pfnAllocation, value);
    }

    public @pointer(comment="PFN_vkReallocationFunction") MemorySegment pfnReallocation() {
        return segment.get(LAYOUT$pfnReallocation, OFFSET$pfnReallocation);
    }

    public void pfnReallocation(@pointer(comment="PFN_vkReallocationFunction") MemorySegment value) {
        segment.set(LAYOUT$pfnReallocation, OFFSET$pfnReallocation, value);
    }

    public @pointer(comment="PFN_vkFreeFunction") MemorySegment pfnFree() {
        return segment.get(LAYOUT$pfnFree, OFFSET$pfnFree);
    }

    public void pfnFree(@pointer(comment="PFN_vkFreeFunction") MemorySegment value) {
        segment.set(LAYOUT$pfnFree, OFFSET$pfnFree, value);
    }

    public @pointer(comment="PFN_vkInternalAllocationNotification") MemorySegment pfnInternalAllocation() {
        return segment.get(LAYOUT$pfnInternalAllocation, OFFSET$pfnInternalAllocation);
    }

    public void pfnInternalAllocation(@pointer(comment="PFN_vkInternalAllocationNotification") MemorySegment value) {
        segment.set(LAYOUT$pfnInternalAllocation, OFFSET$pfnInternalAllocation, value);
    }

    public @pointer(comment="PFN_vkInternalFreeNotification") MemorySegment pfnInternalFree() {
        return segment.get(LAYOUT$pfnInternalFree, OFFSET$pfnInternalFree);
    }

    public void pfnInternalFree(@pointer(comment="PFN_vkInternalFreeNotification") MemorySegment value) {
        segment.set(LAYOUT$pfnInternalFree, OFFSET$pfnInternalFree, value);
    }


    public static final class VkAllocationCallbacksFactory implements IFactory<VkAllocationCallbacks> {
        @Override
        public Class<VkAllocationCallbacks> clazz() {
            return VkAllocationCallbacks.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkAllocationCallbacks.LAYOUT;
        }

        @Override
        public VkAllocationCallbacks create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkAllocationCallbacks createUninit(MemorySegment segment) {
            return new VkAllocationCallbacks(segment);
        }
    }

    public static final VkAllocationCallbacksFactory FACTORY = new VkAllocationCallbacksFactory();
}
