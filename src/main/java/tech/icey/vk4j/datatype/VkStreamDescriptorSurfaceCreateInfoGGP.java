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
import tech.icey.vk4j.IDataTypeFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkStreamDescriptorSurfaceCreateInfoGGP(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("streamDescriptor")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$streamDescriptor = PathElement.groupElement("streamDescriptor");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$streamDescriptor = (OfInt) LAYOUT.select(PATH$streamDescriptor);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$streamDescriptor = LAYOUT.byteOffset(PATH$streamDescriptor);

    public VkStreamDescriptorSurfaceCreateInfoGGP(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_STREAM_DESCRIPTOR_SURFACE_CREATE_INFO_GGP);
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

    public @enumtype(VkStreamDescriptorSurfaceCreateFlagsGGP.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkStreamDescriptorSurfaceCreateFlagsGGP.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int streamDescriptor() {
        return segment.get(LAYOUT$streamDescriptor, OFFSET$streamDescriptor);
    }

    public void streamDescriptor(@unsigned int value) {
        segment.set(LAYOUT$streamDescriptor, OFFSET$streamDescriptor, value);
    }


    public static final class VkStreamDescriptorSurfaceCreateInfoGGPFactory implements IDataTypeFactory<VkStreamDescriptorSurfaceCreateInfoGGP> {
        @Override
        public Class<VkStreamDescriptorSurfaceCreateInfoGGP> clazz() {
            return VkStreamDescriptorSurfaceCreateInfoGGP.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkStreamDescriptorSurfaceCreateInfoGGP.LAYOUT;
        }

        @Override
        public VkStreamDescriptorSurfaceCreateInfoGGP create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkStreamDescriptorSurfaceCreateInfoGGP createUninit(MemorySegment segment) {
            return new VkStreamDescriptorSurfaceCreateInfoGGP(segment);
        }
    }

    public static final VkStreamDescriptorSurfaceCreateInfoGGPFactory FACTORY = new VkStreamDescriptorSurfaceCreateInfoGGPFactory();
}
