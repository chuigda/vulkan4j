package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkImageMemoryRequirementsInfo2(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("image")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$image = PathElement.groupElement("image");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$image = (AddressLayout) LAYOUT.select(PATH$image);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$image = LAYOUT.byteOffset(PATH$image);

    public VkImageMemoryRequirementsInfo2(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IMAGE_MEMORY_REQUIREMENTS_INFO_2);
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


    public static final class Factory implements IFactory<VkImageMemoryRequirementsInfo2> {
        @Override
        public Class<VkImageMemoryRequirementsInfo2> clazz() {
            return VkImageMemoryRequirementsInfo2.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkImageMemoryRequirementsInfo2.LAYOUT;
        }

        @Override
        public VkImageMemoryRequirementsInfo2 create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkImageMemoryRequirementsInfo2 createUninit(MemorySegment segment) {
            return new VkImageMemoryRequirementsInfo2(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
