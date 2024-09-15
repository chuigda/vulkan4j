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

public record VkBufferCollectionImageCreateInfoFUCHSIA(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("collection"),
        ValueLayout.JAVA_INT.withName("index")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$collection = PathElement.groupElement(2);
    public static final PathElement PATH$index = PathElement.groupElement(3);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$collection = (AddressLayout) LAYOUT.select(PATH$collection);
    public static final OfInt LAYOUT$index = (OfInt) LAYOUT.select(PATH$index);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$collection = LAYOUT.byteOffset(PATH$collection);
    public static final long OFFSET$index = LAYOUT.byteOffset(PATH$index);

    public VkBufferCollectionImageCreateInfoFUCHSIA(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_BUFFER_COLLECTION_IMAGE_CREATE_INFO_FUCHSIA);
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

    public VkBufferCollectionFUCHSIA collection() {
        return new VkBufferCollectionFUCHSIA(segment.asSlice(OFFSET$collection, LAYOUT$collection));
    }

    public void collection(VkBufferCollectionFUCHSIA value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$collection, LAYOUT$collection.byteSize());
    }

    public @unsigned int index() {
        return segment.get(LAYOUT$index, OFFSET$index);
    }

    public void index(@unsigned int value) {
        segment.set(LAYOUT$index, OFFSET$index, value);
    }


    public static final class VkBufferCollectionImageCreateInfoFUCHSIAFactory implements IDataTypeFactory<VkBufferCollectionImageCreateInfoFUCHSIA> {
        @Override
        public Class<VkBufferCollectionImageCreateInfoFUCHSIA> clazz() {
            return VkBufferCollectionImageCreateInfoFUCHSIA.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkBufferCollectionImageCreateInfoFUCHSIA.LAYOUT;
        }

        @Override
        public VkBufferCollectionImageCreateInfoFUCHSIA create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkBufferCollectionImageCreateInfoFUCHSIA createUninit(MemorySegment segment) {
            return new VkBufferCollectionImageCreateInfoFUCHSIA(segment);
        }
    }

    public static final VkBufferCollectionImageCreateInfoFUCHSIAFactory FACTORY = new VkBufferCollectionImageCreateInfoFUCHSIAFactory();
}
