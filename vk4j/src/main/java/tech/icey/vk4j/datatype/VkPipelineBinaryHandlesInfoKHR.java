package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPipelineBinaryHandlesInfoKHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("pipelineBinaryCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pPipelineBinaries")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pipelineBinaryCount = PathElement.groupElement("pipelineBinaryCount");
    public static final PathElement PATH$pPipelineBinaries = PathElement.groupElement("pPipelineBinaries");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$pipelineBinaryCount = (OfInt) LAYOUT.select(PATH$pipelineBinaryCount);
    public static final AddressLayout LAYOUT$pPipelineBinaries = (AddressLayout) LAYOUT.select(PATH$pPipelineBinaries);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pipelineBinaryCount = LAYOUT.byteOffset(PATH$pipelineBinaryCount);
    public static final long OFFSET$pPipelineBinaries = LAYOUT.byteOffset(PATH$pPipelineBinaries);

    public VkPipelineBinaryHandlesInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_BINARY_HANDLES_INFO_KHR);
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

    public @unsigned int pipelineBinaryCount() {
        return segment.get(LAYOUT$pipelineBinaryCount, OFFSET$pipelineBinaryCount);
    }

    public void pipelineBinaryCount(@unsigned int value) {
        segment.set(LAYOUT$pipelineBinaryCount, OFFSET$pipelineBinaryCount, value);
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


    public static final class Factory implements IFactory<VkPipelineBinaryHandlesInfoKHR> {
        @Override
        public Class<VkPipelineBinaryHandlesInfoKHR> clazz() {
            return VkPipelineBinaryHandlesInfoKHR.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkPipelineBinaryHandlesInfoKHR.LAYOUT;
        }

        @Override
        public VkPipelineBinaryHandlesInfoKHR create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPipelineBinaryHandlesInfoKHR createUninit(MemorySegment segment) {
            return new VkPipelineBinaryHandlesInfoKHR(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
