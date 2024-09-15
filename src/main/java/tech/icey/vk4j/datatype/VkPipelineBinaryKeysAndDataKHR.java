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

public record VkPipelineBinaryKeysAndDataKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("binaryCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkPipelineBinaryKeyKHR.LAYOUT).withName("pPipelineBinaryKeys"),
        ValueLayout.ADDRESS.withTargetLayout(VkPipelineBinaryDataKHR.LAYOUT).withName("pPipelineBinaryData")
    );

    public static final PathElement PATH$binaryCount = PathElement.groupElement(0);
    public static final PathElement PATH$pPipelineBinaryKeys = PathElement.groupElement(1);
    public static final PathElement PATH$pPipelineBinaryData = PathElement.groupElement(2);

    public static final OfInt LAYOUT$binaryCount = (OfInt) LAYOUT.select(PATH$binaryCount);
    public static final AddressLayout LAYOUT$pPipelineBinaryKeys = (AddressLayout) LAYOUT.select(PATH$pPipelineBinaryKeys);
    public static final AddressLayout LAYOUT$pPipelineBinaryData = (AddressLayout) LAYOUT.select(PATH$pPipelineBinaryData);

    public static final long OFFSET$binaryCount = LAYOUT.byteOffset(PATH$binaryCount);
    public static final long OFFSET$pPipelineBinaryKeys = LAYOUT.byteOffset(PATH$pPipelineBinaryKeys);
    public static final long OFFSET$pPipelineBinaryData = LAYOUT.byteOffset(PATH$pPipelineBinaryData);

    public VkPipelineBinaryKeysAndDataKHR(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned int binaryCount() {
        return segment.get(LAYOUT$binaryCount, OFFSET$binaryCount);
    }

    public void binaryCount(@unsigned int value) {
        segment.set(LAYOUT$binaryCount, OFFSET$binaryCount, value);
    }

    public @pointer(comment="VkPipelineBinaryKeyKHR*") MemorySegment pPipelineBinaryKeysRaw() {
        return segment.get(LAYOUT$pPipelineBinaryKeys, OFFSET$pPipelineBinaryKeys);
    }

    public void pPipelineBinaryKeysRaw(@pointer(comment="VkPipelineBinaryKeyKHR*") MemorySegment value) {
        segment.set(LAYOUT$pPipelineBinaryKeys, OFFSET$pPipelineBinaryKeys, value);
    }
    
    public VkPipelineBinaryKeyKHR pPipelineBinaryKeys() {
        MemorySegment s = pPipelineBinaryKeysRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineBinaryKeyKHR(s);
    }

    public void pPipelineBinaryKeys(VkPipelineBinaryKeyKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPipelineBinaryKeysRaw(s);
    }

    public @pointer(comment="VkPipelineBinaryDataKHR*") MemorySegment pPipelineBinaryDataRaw() {
        return segment.get(LAYOUT$pPipelineBinaryData, OFFSET$pPipelineBinaryData);
    }

    public void pPipelineBinaryDataRaw(@pointer(comment="VkPipelineBinaryDataKHR*") MemorySegment value) {
        segment.set(LAYOUT$pPipelineBinaryData, OFFSET$pPipelineBinaryData, value);
    }
    
    public VkPipelineBinaryDataKHR pPipelineBinaryData() {
        MemorySegment s = pPipelineBinaryDataRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineBinaryDataKHR(s);
    }

    public void pPipelineBinaryData(VkPipelineBinaryDataKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPipelineBinaryDataRaw(s);
    }


    public static final class VkPipelineBinaryKeysAndDataKHRFactory implements IDataTypeFactory<VkPipelineBinaryKeysAndDataKHR> {
        @Override
        public Class<VkPipelineBinaryKeysAndDataKHR> clazz() {
            return VkPipelineBinaryKeysAndDataKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPipelineBinaryKeysAndDataKHR.LAYOUT;
        }

        @Override
        public VkPipelineBinaryKeysAndDataKHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPipelineBinaryKeysAndDataKHR createUninit(MemorySegment segment) {
            return new VkPipelineBinaryKeysAndDataKHR(segment);
        }
    }

    public static final VkPipelineBinaryKeysAndDataKHRFactory FACTORY = new VkPipelineBinaryKeysAndDataKHRFactory();
}
