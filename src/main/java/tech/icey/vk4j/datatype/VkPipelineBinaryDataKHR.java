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

public record VkPipelineBinaryDataKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        NativeLayout.C_SIZE_T.withName("dataSize"),
        ValueLayout.ADDRESS.withName("pData")
    );

    public static final PathElement PATH$dataSize = PathElement.groupElement(0);
    public static final PathElement PATH$pData = PathElement.groupElement(1);

    public static final AddressLayout LAYOUT$pData = (AddressLayout) LAYOUT.select(PATH$pData);

    public static final long OFFSET$dataSize = LAYOUT.byteOffset(PATH$dataSize);
    public static final long OFFSET$pData = LAYOUT.byteOffset(PATH$pData);

    public VkPipelineBinaryDataKHR(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned long dataSize() {
            return NativeLayout.readCSizeT(segment, OFFSET$dataSize);
        }
    
        public void dataSize(@unsigned long value) {
            NativeLayout.writeCSizeT(segment, OFFSET$dataSize, value);
        }

    public @pointer(comment="void*") MemorySegment pData() {
        return segment.get(LAYOUT$pData, OFFSET$pData);
    }

    public void pData(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pData, OFFSET$pData, value);
    }


    public static final class VkPipelineBinaryDataKHRFactory implements IDataTypeFactory<VkPipelineBinaryDataKHR> {
        @Override
        public Class<VkPipelineBinaryDataKHR> clazz() {
            return VkPipelineBinaryDataKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPipelineBinaryDataKHR.LAYOUT;
        }

        @Override
        public VkPipelineBinaryDataKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPipelineBinaryDataKHR createUninit(MemorySegment segment) {
            return new VkPipelineBinaryDataKHR(segment);
        }
    }

    public static final VkPipelineBinaryDataKHRFactory FACTORY = new VkPipelineBinaryDataKHRFactory();
}