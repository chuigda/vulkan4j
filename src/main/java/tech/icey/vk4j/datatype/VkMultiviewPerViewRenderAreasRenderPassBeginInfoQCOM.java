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

public record VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("perViewRenderAreaCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkRect2D.LAYOUT).withName("pPerViewRenderAreas")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$perViewRenderAreaCount = PathElement.groupElement(2);
    public static final PathElement PATH$pPerViewRenderAreas = PathElement.groupElement(3);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$perViewRenderAreaCount = (OfInt) LAYOUT.select(PATH$perViewRenderAreaCount);
    public static final AddressLayout LAYOUT$pPerViewRenderAreas = (AddressLayout) LAYOUT.select(PATH$pPerViewRenderAreas);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$perViewRenderAreaCount = LAYOUT.byteOffset(PATH$perViewRenderAreaCount);
    public static final long OFFSET$pPerViewRenderAreas = LAYOUT.byteOffset(PATH$pPerViewRenderAreas);

    public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_MULTIVIEW_PER_VIEW_RENDER_AREAS_RENDER_PASS_BEGIN_INFO_QCOM);
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

    public @unsigned int perViewRenderAreaCount() {
        return segment.get(LAYOUT$perViewRenderAreaCount, OFFSET$perViewRenderAreaCount);
    }

    public void perViewRenderAreaCount(@unsigned int value) {
        segment.set(LAYOUT$perViewRenderAreaCount, OFFSET$perViewRenderAreaCount, value);
    }

    public @pointer(comment="VkRect2D*") MemorySegment pPerViewRenderAreasRaw() {
        return segment.get(LAYOUT$pPerViewRenderAreas, OFFSET$pPerViewRenderAreas);
    }

    public void pPerViewRenderAreasRaw(@pointer(comment="VkRect2D*") MemorySegment value) {
        segment.set(LAYOUT$pPerViewRenderAreas, OFFSET$pPerViewRenderAreas, value);
    }
    
    public VkRect2D pPerViewRenderAreas() {
        MemorySegment s = pPerViewRenderAreasRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkRect2D(s);
    }

    public void pPerViewRenderAreas(VkRect2D value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPerViewRenderAreasRaw(s);
    }


    public static final class VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOMFactory implements IDataTypeFactory<VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM> {
        @Override
        public Class<VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM> clazz() {
            return VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM.LAYOUT;
        }

        @Override
        public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM createUninit(MemorySegment segment) {
            return new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOM(segment);
        }
    }

    public static final VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOMFactory FACTORY = new VkMultiviewPerViewRenderAreasRenderPassBeginInfoQCOMFactory();
}