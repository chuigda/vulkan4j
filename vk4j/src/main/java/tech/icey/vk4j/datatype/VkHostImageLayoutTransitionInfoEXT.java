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

public record VkHostImageLayoutTransitionInfoEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("image"),
        ValueLayout.JAVA_INT.withName("oldLayout"),
        ValueLayout.JAVA_INT.withName("newLayout"),
        VkImageSubresourceRange.LAYOUT.withName("subresourceRange")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$image = PathElement.groupElement("image");
    public static final PathElement PATH$oldLayout = PathElement.groupElement("oldLayout");
    public static final PathElement PATH$newLayout = PathElement.groupElement("newLayout");
    public static final PathElement PATH$subresourceRange = PathElement.groupElement("subresourceRange");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$image = (AddressLayout) LAYOUT.select(PATH$image);
    public static final OfInt LAYOUT$oldLayout = (OfInt) LAYOUT.select(PATH$oldLayout);
    public static final OfInt LAYOUT$newLayout = (OfInt) LAYOUT.select(PATH$newLayout);
    public static final StructLayout LAYOUT$subresourceRange = (StructLayout) LAYOUT.select(PATH$subresourceRange);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$image = LAYOUT.byteOffset(PATH$image);
    public static final long OFFSET$oldLayout = LAYOUT.byteOffset(PATH$oldLayout);
    public static final long OFFSET$newLayout = LAYOUT.byteOffset(PATH$newLayout);
    public static final long OFFSET$subresourceRange = LAYOUT.byteOffset(PATH$subresourceRange);

    public VkHostImageLayoutTransitionInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_HOST_IMAGE_LAYOUT_TRANSITION_INFO_EXT);
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

    public VkImage image() {
        return new VkImage(segment.asSlice(OFFSET$image, LAYOUT$image));
    }

    public void image(VkImage value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$image, LAYOUT$image.byteSize());
    }

    public @enumtype(VkImageLayout.class) int oldLayout() {
        return segment.get(LAYOUT$oldLayout, OFFSET$oldLayout);
    }

    public void oldLayout(@enumtype(VkImageLayout.class) int value) {
        segment.set(LAYOUT$oldLayout, OFFSET$oldLayout, value);
    }

    public @enumtype(VkImageLayout.class) int newLayout() {
        return segment.get(LAYOUT$newLayout, OFFSET$newLayout);
    }

    public void newLayout(@enumtype(VkImageLayout.class) int value) {
        segment.set(LAYOUT$newLayout, OFFSET$newLayout, value);
    }

    public VkImageSubresourceRange subresourceRange() {
        return new VkImageSubresourceRange(segment.asSlice(OFFSET$subresourceRange, LAYOUT$subresourceRange));
    }

    public void subresourceRange(VkImageSubresourceRange value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$subresourceRange, LAYOUT$subresourceRange.byteSize());
    }


    public static final class VkHostImageLayoutTransitionInfoEXTFactory implements IFactory<VkHostImageLayoutTransitionInfoEXT> {
        @Override
        public Class<VkHostImageLayoutTransitionInfoEXT> clazz() {
            return VkHostImageLayoutTransitionInfoEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkHostImageLayoutTransitionInfoEXT.LAYOUT;
        }

        @Override
        public VkHostImageLayoutTransitionInfoEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkHostImageLayoutTransitionInfoEXT createUninit(MemorySegment segment) {
            return new VkHostImageLayoutTransitionInfoEXT(segment);
        }
    }

    public static final VkHostImageLayoutTransitionInfoEXTFactory FACTORY = new VkHostImageLayoutTransitionInfoEXTFactory();
}
