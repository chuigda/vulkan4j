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

public record VkOpticalFlowExecuteInfoNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("regionCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkRect2D.LAYOUT).withName("pRegions")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$regionCount = PathElement.groupElement("regionCount");
    public static final PathElement PATH$pRegions = PathElement.groupElement("pRegions");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$regionCount = (OfInt) LAYOUT.select(PATH$regionCount);
    public static final AddressLayout LAYOUT$pRegions = (AddressLayout) LAYOUT.select(PATH$pRegions);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$regionCount = LAYOUT.byteOffset(PATH$regionCount);
    public static final long OFFSET$pRegions = LAYOUT.byteOffset(PATH$pRegions);

    public VkOpticalFlowExecuteInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_OPTICAL_FLOW_EXECUTE_INFO_NV);
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

    public @enumtype(VkOpticalFlowExecuteFlagsNV.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkOpticalFlowExecuteFlagsNV.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int regionCount() {
        return segment.get(LAYOUT$regionCount, OFFSET$regionCount);
    }

    public void regionCount(@unsigned int value) {
        segment.set(LAYOUT$regionCount, OFFSET$regionCount, value);
    }

    public @pointer(comment="VkRect2D*") MemorySegment pRegionsRaw() {
        return segment.get(LAYOUT$pRegions, OFFSET$pRegions);
    }

    public void pRegionsRaw(@pointer(comment="VkRect2D*") MemorySegment value) {
        segment.set(LAYOUT$pRegions, OFFSET$pRegions, value);
    }
    
    public @nullable VkRect2D pRegions() {
        MemorySegment s = pRegionsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkRect2D(s);
    }

    public void pRegions(@nullable VkRect2D value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pRegionsRaw(s);
    }


    public static final class VkOpticalFlowExecuteInfoNVFactory implements IFactory<VkOpticalFlowExecuteInfoNV> {
        @Override
        public Class<VkOpticalFlowExecuteInfoNV> clazz() {
            return VkOpticalFlowExecuteInfoNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkOpticalFlowExecuteInfoNV.LAYOUT;
        }

        @Override
        public VkOpticalFlowExecuteInfoNV create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkOpticalFlowExecuteInfoNV createUninit(MemorySegment segment) {
            return new VkOpticalFlowExecuteInfoNV(segment);
        }
    }

    public static final VkOpticalFlowExecuteInfoNVFactory FACTORY = new VkOpticalFlowExecuteInfoNVFactory();
}
