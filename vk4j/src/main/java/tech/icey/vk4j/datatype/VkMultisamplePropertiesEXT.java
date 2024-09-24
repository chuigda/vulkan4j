package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;

import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkMultisamplePropertiesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkExtent2D.LAYOUT.withName("maxSampleLocationGridSize")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$maxSampleLocationGridSize = PathElement.groupElement("maxSampleLocationGridSize");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$maxSampleLocationGridSize = (StructLayout) LAYOUT.select(PATH$maxSampleLocationGridSize);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxSampleLocationGridSize = LAYOUT.byteOffset(PATH$maxSampleLocationGridSize);

    public VkMultisamplePropertiesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_MULTISAMPLE_PROPERTIES_EXT);
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

    public VkExtent2D maxSampleLocationGridSize() {
        return new VkExtent2D(segment.asSlice(OFFSET$maxSampleLocationGridSize, LAYOUT$maxSampleLocationGridSize));
    }

    public void maxSampleLocationGridSize(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxSampleLocationGridSize, LAYOUT$maxSampleLocationGridSize.byteSize());
    }


    public static final class Factory implements IFactory<VkMultisamplePropertiesEXT> {
        @Override
        public Class<VkMultisamplePropertiesEXT> clazz() {
            return VkMultisamplePropertiesEXT.class;
        }

        @Override
        public MemoryLayout layout() {
            return VkMultisamplePropertiesEXT.LAYOUT;
        }

        @Override
        public VkMultisamplePropertiesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkMultisamplePropertiesEXT createUninit(MemorySegment segment) {
            return new VkMultisamplePropertiesEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
