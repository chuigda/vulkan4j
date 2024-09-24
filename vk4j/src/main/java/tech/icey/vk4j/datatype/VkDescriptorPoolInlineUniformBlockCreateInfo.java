package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkDescriptorPoolInlineUniformBlockCreateInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxInlineUniformBlockBindings")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$maxInlineUniformBlockBindings = PathElement.groupElement("maxInlineUniformBlockBindings");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maxInlineUniformBlockBindings = (OfInt) LAYOUT.select(PATH$maxInlineUniformBlockBindings);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxInlineUniformBlockBindings = LAYOUT.byteOffset(PATH$maxInlineUniformBlockBindings);

    public VkDescriptorPoolInlineUniformBlockCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DESCRIPTOR_POOL_INLINE_UNIFORM_BLOCK_CREATE_INFO);
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

    public @unsigned int maxInlineUniformBlockBindings() {
        return segment.get(LAYOUT$maxInlineUniformBlockBindings, OFFSET$maxInlineUniformBlockBindings);
    }

    public void maxInlineUniformBlockBindings(@unsigned int value) {
        segment.set(LAYOUT$maxInlineUniformBlockBindings, OFFSET$maxInlineUniformBlockBindings, value);
    }


    public static final class Factory implements IFactory<VkDescriptorPoolInlineUniformBlockCreateInfo> {
        @Override
        public Class<VkDescriptorPoolInlineUniformBlockCreateInfo> clazz() {
            return VkDescriptorPoolInlineUniformBlockCreateInfo.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkDescriptorPoolInlineUniformBlockCreateInfo.LAYOUT;
        }

        @Override
        public VkDescriptorPoolInlineUniformBlockCreateInfo create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkDescriptorPoolInlineUniformBlockCreateInfo createUninit(MemorySegment segment) {
            return new VkDescriptorPoolInlineUniformBlockCreateInfo(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
