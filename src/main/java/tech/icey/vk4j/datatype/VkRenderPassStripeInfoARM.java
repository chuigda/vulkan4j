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

public record VkRenderPassStripeInfoARM(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkRect2D.LAYOUT.withName("stripeArea")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$stripeArea = PathElement.groupElement(2);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$stripeArea = (StructLayout) LAYOUT.select(PATH$stripeArea);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$stripeArea = LAYOUT.byteOffset(PATH$stripeArea);

    public VkRenderPassStripeInfoARM(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_RENDER_PASS_STRIPE_INFO_ARM);
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

    public VkRect2D stripeArea() {
        return new VkRect2D(segment.asSlice(OFFSET$stripeArea, LAYOUT$stripeArea));
    }

    public void stripeArea(VkRect2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$stripeArea, LAYOUT$stripeArea.byteSize());
    }


    public static final class VkRenderPassStripeInfoARMFactory implements IDataTypeFactory<VkRenderPassStripeInfoARM> {
        @Override
        public Class<VkRenderPassStripeInfoARM> clazz() {
            return VkRenderPassStripeInfoARM.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkRenderPassStripeInfoARM.LAYOUT;
        }

        @Override
        public VkRenderPassStripeInfoARM create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkRenderPassStripeInfoARM createUninit(MemorySegment segment) {
            return new VkRenderPassStripeInfoARM(segment);
        }
    }

    public static final VkRenderPassStripeInfoARMFactory FACTORY = new VkRenderPassStripeInfoARMFactory();
}