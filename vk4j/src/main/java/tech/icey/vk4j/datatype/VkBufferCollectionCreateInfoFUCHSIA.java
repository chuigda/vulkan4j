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

public record VkBufferCollectionCreateInfoFUCHSIA(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("collectionToken")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$collectionToken = PathElement.groupElement("collectionToken");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$collectionToken = (OfInt) LAYOUT.select(PATH$collectionToken);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$collectionToken = LAYOUT.byteOffset(PATH$collectionToken);

    public VkBufferCollectionCreateInfoFUCHSIA(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_BUFFER_COLLECTION_CREATE_INFO_FUCHSIA);
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

    public @unsigned int collectionToken() {
        return segment.get(LAYOUT$collectionToken, OFFSET$collectionToken);
    }

    public void collectionToken(@unsigned int value) {
        segment.set(LAYOUT$collectionToken, OFFSET$collectionToken, value);
    }


    public static final class VkBufferCollectionCreateInfoFUCHSIAFactory implements IFactory<VkBufferCollectionCreateInfoFUCHSIA> {
        @Override
        public Class<VkBufferCollectionCreateInfoFUCHSIA> clazz() {
            return VkBufferCollectionCreateInfoFUCHSIA.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkBufferCollectionCreateInfoFUCHSIA.LAYOUT;
        }

        @Override
        public VkBufferCollectionCreateInfoFUCHSIA create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkBufferCollectionCreateInfoFUCHSIA createUninit(MemorySegment segment) {
            return new VkBufferCollectionCreateInfoFUCHSIA(segment);
        }
    }

    public static final VkBufferCollectionCreateInfoFUCHSIAFactory FACTORY = new VkBufferCollectionCreateInfoFUCHSIAFactory();
}