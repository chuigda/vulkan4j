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

public record VkImagePipeSurfaceCreateInfoFUCHSIA(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("imagePipeHandle")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$flags = PathElement.groupElement(2);
    public static final PathElement PATH$imagePipeHandle = PathElement.groupElement(3);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$imagePipeHandle = (OfInt) LAYOUT.select(PATH$imagePipeHandle);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$imagePipeHandle = LAYOUT.byteOffset(PATH$imagePipeHandle);

    public VkImagePipeSurfaceCreateInfoFUCHSIA(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IMAGEPIPE_SURFACE_CREATE_INFO_FUCHSIA);
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

    public @enumtype(VkImagePipeSurfaceCreateFlagsFUCHSIA.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkImagePipeSurfaceCreateFlagsFUCHSIA.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int imagePipeHandle() {
        return segment.get(LAYOUT$imagePipeHandle, OFFSET$imagePipeHandle);
    }

    public void imagePipeHandle(@unsigned int value) {
        segment.set(LAYOUT$imagePipeHandle, OFFSET$imagePipeHandle, value);
    }


    public static final class VkImagePipeSurfaceCreateInfoFUCHSIAFactory implements IDataTypeFactory<VkImagePipeSurfaceCreateInfoFUCHSIA> {
        @Override
        public Class<VkImagePipeSurfaceCreateInfoFUCHSIA> clazz() {
            return VkImagePipeSurfaceCreateInfoFUCHSIA.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkImagePipeSurfaceCreateInfoFUCHSIA.LAYOUT;
        }

        @Override
        public VkImagePipeSurfaceCreateInfoFUCHSIA create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkImagePipeSurfaceCreateInfoFUCHSIA createUninit(MemorySegment segment) {
            return new VkImagePipeSurfaceCreateInfoFUCHSIA(segment);
        }
    }

    public static final VkImagePipeSurfaceCreateInfoFUCHSIAFactory FACTORY = new VkImagePipeSurfaceCreateInfoFUCHSIAFactory();
}