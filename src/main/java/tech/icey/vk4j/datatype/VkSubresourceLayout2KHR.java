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

public record VkSubresourceLayout2KHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkSubresourceLayout.LAYOUT.withName("subresourceLayout")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$subresourceLayout = PathElement.groupElement(2);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$subresourceLayout = (StructLayout) LAYOUT.select(PATH$subresourceLayout);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$subresourceLayout = LAYOUT.byteOffset(PATH$subresourceLayout);

    public VkSubresourceLayout2KHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SUBRESOURCE_LAYOUT_2_KHR);
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

    public VkSubresourceLayout subresourceLayout() {
        return new VkSubresourceLayout(segment.asSlice(OFFSET$subresourceLayout, LAYOUT$subresourceLayout));
    }

    public void subresourceLayout(VkSubresourceLayout value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$subresourceLayout, LAYOUT$subresourceLayout.byteSize());
    }


    public static final class VkSubresourceLayout2KHRFactory implements IDataTypeFactory<VkSubresourceLayout2KHR> {
        @Override
        public Class<VkSubresourceLayout2KHR> clazz() {
            return VkSubresourceLayout2KHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkSubresourceLayout2KHR.LAYOUT;
        }

        @Override
        public VkSubresourceLayout2KHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkSubresourceLayout2KHR createUninit(MemorySegment segment) {
            return new VkSubresourceLayout2KHR(segment);
        }
    }

    public static final VkSubresourceLayout2KHRFactory FACTORY = new VkSubresourceLayout2KHRFactory();
}
