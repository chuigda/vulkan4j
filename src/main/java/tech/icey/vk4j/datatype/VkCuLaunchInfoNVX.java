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

public record VkCuLaunchInfoNVX(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("function"),
        ValueLayout.JAVA_INT.withName("gridDimX"),
        ValueLayout.JAVA_INT.withName("gridDimY"),
        ValueLayout.JAVA_INT.withName("gridDimZ"),
        ValueLayout.JAVA_INT.withName("blockDimX"),
        ValueLayout.JAVA_INT.withName("blockDimY"),
        ValueLayout.JAVA_INT.withName("blockDimZ"),
        ValueLayout.JAVA_INT.withName("sharedMemBytes"),
        NativeLayout.C_SIZE_T.withName("paramCount"),
        ValueLayout.ADDRESS.withName("pParams"),
        NativeLayout.C_SIZE_T.withName("extraCount"),
        ValueLayout.ADDRESS.withName("pExtras")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$function = PathElement.groupElement(2);
    public static final PathElement PATH$gridDimX = PathElement.groupElement(3);
    public static final PathElement PATH$gridDimY = PathElement.groupElement(4);
    public static final PathElement PATH$gridDimZ = PathElement.groupElement(5);
    public static final PathElement PATH$blockDimX = PathElement.groupElement(6);
    public static final PathElement PATH$blockDimY = PathElement.groupElement(7);
    public static final PathElement PATH$blockDimZ = PathElement.groupElement(8);
    public static final PathElement PATH$sharedMemBytes = PathElement.groupElement(9);
    public static final PathElement PATH$paramCount = PathElement.groupElement(10);
    public static final PathElement PATH$pParams = PathElement.groupElement(11);
    public static final PathElement PATH$extraCount = PathElement.groupElement(12);
    public static final PathElement PATH$pExtras = PathElement.groupElement(13);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$function = (AddressLayout) LAYOUT.select(PATH$function);
    public static final OfInt LAYOUT$gridDimX = (OfInt) LAYOUT.select(PATH$gridDimX);
    public static final OfInt LAYOUT$gridDimY = (OfInt) LAYOUT.select(PATH$gridDimY);
    public static final OfInt LAYOUT$gridDimZ = (OfInt) LAYOUT.select(PATH$gridDimZ);
    public static final OfInt LAYOUT$blockDimX = (OfInt) LAYOUT.select(PATH$blockDimX);
    public static final OfInt LAYOUT$blockDimY = (OfInt) LAYOUT.select(PATH$blockDimY);
    public static final OfInt LAYOUT$blockDimZ = (OfInt) LAYOUT.select(PATH$blockDimZ);
    public static final OfInt LAYOUT$sharedMemBytes = (OfInt) LAYOUT.select(PATH$sharedMemBytes);
    public static final AddressLayout LAYOUT$pParams = (AddressLayout) LAYOUT.select(PATH$pParams);
    public static final AddressLayout LAYOUT$pExtras = (AddressLayout) LAYOUT.select(PATH$pExtras);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$function = LAYOUT.byteOffset(PATH$function);
    public static final long OFFSET$gridDimX = LAYOUT.byteOffset(PATH$gridDimX);
    public static final long OFFSET$gridDimY = LAYOUT.byteOffset(PATH$gridDimY);
    public static final long OFFSET$gridDimZ = LAYOUT.byteOffset(PATH$gridDimZ);
    public static final long OFFSET$blockDimX = LAYOUT.byteOffset(PATH$blockDimX);
    public static final long OFFSET$blockDimY = LAYOUT.byteOffset(PATH$blockDimY);
    public static final long OFFSET$blockDimZ = LAYOUT.byteOffset(PATH$blockDimZ);
    public static final long OFFSET$sharedMemBytes = LAYOUT.byteOffset(PATH$sharedMemBytes);
    public static final long OFFSET$paramCount = LAYOUT.byteOffset(PATH$paramCount);
    public static final long OFFSET$pParams = LAYOUT.byteOffset(PATH$pParams);
    public static final long OFFSET$extraCount = LAYOUT.byteOffset(PATH$extraCount);
    public static final long OFFSET$pExtras = LAYOUT.byteOffset(PATH$pExtras);

    public VkCuLaunchInfoNVX(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_CU_LAUNCH_INFO_NVX);
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

    public VkCuFunctionNVX function() {
        return new VkCuFunctionNVX(segment.asSlice(OFFSET$function, LAYOUT$function));
    }

    public void function(VkCuFunctionNVX value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$function, LAYOUT$function.byteSize());
    }

    public @unsigned int gridDimX() {
        return segment.get(LAYOUT$gridDimX, OFFSET$gridDimX);
    }

    public void gridDimX(@unsigned int value) {
        segment.set(LAYOUT$gridDimX, OFFSET$gridDimX, value);
    }

    public @unsigned int gridDimY() {
        return segment.get(LAYOUT$gridDimY, OFFSET$gridDimY);
    }

    public void gridDimY(@unsigned int value) {
        segment.set(LAYOUT$gridDimY, OFFSET$gridDimY, value);
    }

    public @unsigned int gridDimZ() {
        return segment.get(LAYOUT$gridDimZ, OFFSET$gridDimZ);
    }

    public void gridDimZ(@unsigned int value) {
        segment.set(LAYOUT$gridDimZ, OFFSET$gridDimZ, value);
    }

    public @unsigned int blockDimX() {
        return segment.get(LAYOUT$blockDimX, OFFSET$blockDimX);
    }

    public void blockDimX(@unsigned int value) {
        segment.set(LAYOUT$blockDimX, OFFSET$blockDimX, value);
    }

    public @unsigned int blockDimY() {
        return segment.get(LAYOUT$blockDimY, OFFSET$blockDimY);
    }

    public void blockDimY(@unsigned int value) {
        segment.set(LAYOUT$blockDimY, OFFSET$blockDimY, value);
    }

    public @unsigned int blockDimZ() {
        return segment.get(LAYOUT$blockDimZ, OFFSET$blockDimZ);
    }

    public void blockDimZ(@unsigned int value) {
        segment.set(LAYOUT$blockDimZ, OFFSET$blockDimZ, value);
    }

    public @unsigned int sharedMemBytes() {
        return segment.get(LAYOUT$sharedMemBytes, OFFSET$sharedMemBytes);
    }

    public void sharedMemBytes(@unsigned int value) {
        segment.set(LAYOUT$sharedMemBytes, OFFSET$sharedMemBytes, value);
    }

    public @unsigned long paramCount() {
            return NativeLayout.readCSizeT(segment, OFFSET$paramCount);
        }
    
        public void paramCount(@unsigned long value) {
            NativeLayout.writeCSizeT(segment, OFFSET$paramCount, value);
        }

    public @pointer(comment="void*") MemorySegment pParams() {
        return segment.get(LAYOUT$pParams, OFFSET$pParams);
    }

    public void pParams(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pParams, OFFSET$pParams, value);
    }

    public @unsigned long extraCount() {
            return NativeLayout.readCSizeT(segment, OFFSET$extraCount);
        }
    
        public void extraCount(@unsigned long value) {
            NativeLayout.writeCSizeT(segment, OFFSET$extraCount, value);
        }

    public @pointer(comment="void*") MemorySegment pExtras() {
        return segment.get(LAYOUT$pExtras, OFFSET$pExtras);
    }

    public void pExtras(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pExtras, OFFSET$pExtras, value);
    }


    public static final class VkCuLaunchInfoNVXFactory implements IDataTypeFactory<VkCuLaunchInfoNVX> {
        @Override
        public Class<VkCuLaunchInfoNVX> clazz() {
            return VkCuLaunchInfoNVX.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkCuLaunchInfoNVX.LAYOUT;
        }

        @Override
        public VkCuLaunchInfoNVX create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkCuLaunchInfoNVX createUninit(MemorySegment segment) {
            return new VkCuLaunchInfoNVX(segment);
        }
    }

    public static final VkCuLaunchInfoNVXFactory FACTORY = new VkCuLaunchInfoNVXFactory();
}
