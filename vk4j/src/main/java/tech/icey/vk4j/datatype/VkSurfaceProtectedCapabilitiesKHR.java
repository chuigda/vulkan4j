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

public record VkSurfaceProtectedCapabilitiesKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("supportsProtected")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$supportsProtected = PathElement.groupElement("supportsProtected");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$supportsProtected = (OfInt) LAYOUT.select(PATH$supportsProtected);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$supportsProtected = LAYOUT.byteOffset(PATH$supportsProtected);

    public VkSurfaceProtectedCapabilitiesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SURFACE_PROTECTED_CAPABILITIES_KHR);
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

    public @unsigned int supportsProtected() {
        return segment.get(LAYOUT$supportsProtected, OFFSET$supportsProtected);
    }

    public void supportsProtected(@unsigned int value) {
        segment.set(LAYOUT$supportsProtected, OFFSET$supportsProtected, value);
    }


    public static final class VkSurfaceProtectedCapabilitiesKHRFactory implements IFactory<VkSurfaceProtectedCapabilitiesKHR> {
        @Override
        public Class<VkSurfaceProtectedCapabilitiesKHR> clazz() {
            return VkSurfaceProtectedCapabilitiesKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkSurfaceProtectedCapabilitiesKHR.LAYOUT;
        }

        @Override
        public VkSurfaceProtectedCapabilitiesKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkSurfaceProtectedCapabilitiesKHR createUninit(MemorySegment segment) {
            return new VkSurfaceProtectedCapabilitiesKHR(segment);
        }
    }

    public static final VkSurfaceProtectedCapabilitiesKHRFactory FACTORY = new VkSurfaceProtectedCapabilitiesKHRFactory();
}
