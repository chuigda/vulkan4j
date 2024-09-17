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

public record VkImageSubresource2KHR(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkImageSubresource.LAYOUT.withName("imageSubresource")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$imageSubresource = PathElement.groupElement("imageSubresource");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$imageSubresource = (StructLayout) LAYOUT.select(PATH$imageSubresource);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$imageSubresource = LAYOUT.byteOffset(PATH$imageSubresource);

    public VkImageSubresource2KHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IMAGE_SUBRESOURCE_2_KHR);
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

    public VkImageSubresource imageSubresource() {
        return new VkImageSubresource(segment.asSlice(OFFSET$imageSubresource, LAYOUT$imageSubresource));
    }

    public void imageSubresource(VkImageSubresource value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$imageSubresource, LAYOUT$imageSubresource.byteSize());
    }


    public static final class VkImageSubresource2KHRFactory implements IDataTypeFactory<VkImageSubresource2KHR> {
        @Override
        public Class<VkImageSubresource2KHR> clazz() {
            return VkImageSubresource2KHR.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkImageSubresource2KHR.LAYOUT;
        }

        @Override
        public VkImageSubresource2KHR create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkImageSubresource2KHR createUninit(MemorySegment segment) {
            return new VkImageSubresource2KHR(segment);
        }
    }

    public static final VkImageSubresource2KHRFactory FACTORY = new VkImageSubresource2KHRFactory();
}
