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

public record VkAntiLagPresentationInfoAMD(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("stage"),
        ValueLayout.JAVA_LONG.withName("frameIndex")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$stage = PathElement.groupElement("stage");
    public static final PathElement PATH$frameIndex = PathElement.groupElement("frameIndex");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$stage = (OfInt) LAYOUT.select(PATH$stage);
    public static final OfLong LAYOUT$frameIndex = (OfLong) LAYOUT.select(PATH$frameIndex);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$stage = LAYOUT.byteOffset(PATH$stage);
    public static final long OFFSET$frameIndex = LAYOUT.byteOffset(PATH$frameIndex);

    public VkAntiLagPresentationInfoAMD(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_ANTI_LAG_PRESENTATION_INFO_AMD);
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

    public @enumtype(VkAntiLagStageAMD.class) int stage() {
        return segment.get(LAYOUT$stage, OFFSET$stage);
    }

    public void stage(@enumtype(VkAntiLagStageAMD.class) int value) {
        segment.set(LAYOUT$stage, OFFSET$stage, value);
    }

    public @unsigned long frameIndex() {
        return segment.get(LAYOUT$frameIndex, OFFSET$frameIndex);
    }

    public void frameIndex(@unsigned long value) {
        segment.set(LAYOUT$frameIndex, OFFSET$frameIndex, value);
    }


    public static final class VkAntiLagPresentationInfoAMDFactory implements IFactory<VkAntiLagPresentationInfoAMD> {
        @Override
        public Class<VkAntiLagPresentationInfoAMD> clazz() {
            return VkAntiLagPresentationInfoAMD.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkAntiLagPresentationInfoAMD.LAYOUT;
        }

        @Override
        public VkAntiLagPresentationInfoAMD create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkAntiLagPresentationInfoAMD createUninit(MemorySegment segment) {
            return new VkAntiLagPresentationInfoAMD(segment);
        }
    }

    public static final VkAntiLagPresentationInfoAMDFactory FACTORY = new VkAntiLagPresentationInfoAMDFactory();
}