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

public record VkPipelineBinaryInfoKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("binaryCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pPipelineBinaries")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$binaryCount = PathElement.groupElement("binaryCount");
    public static final PathElement PATH$pPipelineBinaries = PathElement.groupElement("pPipelineBinaries");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$binaryCount = (OfInt) LAYOUT.select(PATH$binaryCount);
    public static final AddressLayout LAYOUT$pPipelineBinaries = (AddressLayout) LAYOUT.select(PATH$pPipelineBinaries);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$binaryCount = LAYOUT.byteOffset(PATH$binaryCount);
    public static final long OFFSET$pPipelineBinaries = LAYOUT.byteOffset(PATH$pPipelineBinaries);

    public VkPipelineBinaryInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_BINARY_INFO_KHR);
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

    public @unsigned int binaryCount() {
        return segment.get(LAYOUT$binaryCount, OFFSET$binaryCount);
    }

    public void binaryCount(@unsigned int value) {
        segment.set(LAYOUT$binaryCount, OFFSET$binaryCount, value);
    }

    public @pointer(comment="VkPipelineBinaryKHR*") MemorySegment pPipelineBinariesRaw() {
        return segment.get(LAYOUT$pPipelineBinaries, OFFSET$pPipelineBinaries);
    }

    public void pPipelineBinariesRaw(@pointer(comment="VkPipelineBinaryKHR*") MemorySegment value) {
        segment.set(LAYOUT$pPipelineBinaries, OFFSET$pPipelineBinaries, value);
    }
    
    public @nullable VkPipelineBinaryKHR pPipelineBinaries() {
        MemorySegment s = pPipelineBinariesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineBinaryKHR(s);
    }

    public void pPipelineBinaries(@nullable VkPipelineBinaryKHR value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPipelineBinariesRaw(s);
    }


    public static final class VkPipelineBinaryInfoKHRFactory implements IFactory<VkPipelineBinaryInfoKHR> {
        @Override
        public Class<VkPipelineBinaryInfoKHR> clazz() {
            return VkPipelineBinaryInfoKHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPipelineBinaryInfoKHR.LAYOUT;
        }

        @Override
        public VkPipelineBinaryInfoKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPipelineBinaryInfoKHR createUninit(MemorySegment segment) {
            return new VkPipelineBinaryInfoKHR(segment);
        }
    }

    public static final VkPipelineBinaryInfoKHRFactory FACTORY = new VkPipelineBinaryInfoKHRFactory();
}
