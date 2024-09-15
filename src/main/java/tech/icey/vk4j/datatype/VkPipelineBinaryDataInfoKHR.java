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

public record VkPipelineBinaryDataInfoKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pipelineBinary")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$pipelineBinary = PathElement.groupElement(2);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pipelineBinary = (AddressLayout) LAYOUT.select(PATH$pipelineBinary);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pipelineBinary = LAYOUT.byteOffset(PATH$pipelineBinary);

    public VkPipelineBinaryDataInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_BINARY_DATA_INFO_KHR);
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

    public VkPipelineBinaryKHR pipelineBinary() {
        return new VkPipelineBinaryKHR(segment.asSlice(OFFSET$pipelineBinary, LAYOUT$pipelineBinary));
    }

    public void pipelineBinary(VkPipelineBinaryKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$pipelineBinary, LAYOUT$pipelineBinary.byteSize());
    }


    public static final class VkPipelineBinaryDataInfoKHRFactory implements IDataTypeFactory<VkPipelineBinaryDataInfoKHR> {
        @Override
        public Class<VkPipelineBinaryDataInfoKHR> clazz() {
            return VkPipelineBinaryDataInfoKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPipelineBinaryDataInfoKHR.LAYOUT;
        }

        @Override
        public VkPipelineBinaryDataInfoKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPipelineBinaryDataInfoKHR createUninit(MemorySegment segment) {
            return new VkPipelineBinaryDataInfoKHR(segment);
        }
    }

    public static final VkPipelineBinaryDataInfoKHRFactory FACTORY = new VkPipelineBinaryDataInfoKHRFactory();
}
