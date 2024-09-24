package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkSparseImageMemoryRequirements2(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkSparseImageMemoryRequirements.LAYOUT.withName("memoryRequirements")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$memoryRequirements = PathElement.groupElement("memoryRequirements");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$memoryRequirements = (StructLayout) LAYOUT.select(PATH$memoryRequirements);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$memoryRequirements = LAYOUT.byteOffset(PATH$memoryRequirements);

    public VkSparseImageMemoryRequirements2(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2);
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

    public VkSparseImageMemoryRequirements memoryRequirements() {
        return new VkSparseImageMemoryRequirements(segment.asSlice(OFFSET$memoryRequirements, LAYOUT$memoryRequirements));
    }

    public void memoryRequirements(VkSparseImageMemoryRequirements value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$memoryRequirements, LAYOUT$memoryRequirements.byteSize());
    }


    public static final class Factory implements IFactory<VkSparseImageMemoryRequirements2> {
        @Override
        public Class<VkSparseImageMemoryRequirements2> clazz() {
            return VkSparseImageMemoryRequirements2.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkSparseImageMemoryRequirements2.LAYOUT;
        }

        @Override
        public VkSparseImageMemoryRequirements2 create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkSparseImageMemoryRequirements2 createUninit(MemorySegment segment) {
            return new VkSparseImageMemoryRequirements2(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
