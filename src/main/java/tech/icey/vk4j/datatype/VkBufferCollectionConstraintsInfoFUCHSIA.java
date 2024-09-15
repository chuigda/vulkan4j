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

public record VkBufferCollectionConstraintsInfoFUCHSIA(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("minBufferCount"),
        ValueLayout.JAVA_INT.withName("maxBufferCount"),
        ValueLayout.JAVA_INT.withName("minBufferCountForCamping"),
        ValueLayout.JAVA_INT.withName("minBufferCountForDedicatedSlack"),
        ValueLayout.JAVA_INT.withName("minBufferCountForSharedSlack")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$minBufferCount = PathElement.groupElement(2);
    public static final PathElement PATH$maxBufferCount = PathElement.groupElement(3);
    public static final PathElement PATH$minBufferCountForCamping = PathElement.groupElement(4);
    public static final PathElement PATH$minBufferCountForDedicatedSlack = PathElement.groupElement(5);
    public static final PathElement PATH$minBufferCountForSharedSlack = PathElement.groupElement(6);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$minBufferCount = (OfInt) LAYOUT.select(PATH$minBufferCount);
    public static final OfInt LAYOUT$maxBufferCount = (OfInt) LAYOUT.select(PATH$maxBufferCount);
    public static final OfInt LAYOUT$minBufferCountForCamping = (OfInt) LAYOUT.select(PATH$minBufferCountForCamping);
    public static final OfInt LAYOUT$minBufferCountForDedicatedSlack = (OfInt) LAYOUT.select(PATH$minBufferCountForDedicatedSlack);
    public static final OfInt LAYOUT$minBufferCountForSharedSlack = (OfInt) LAYOUT.select(PATH$minBufferCountForSharedSlack);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$minBufferCount = LAYOUT.byteOffset(PATH$minBufferCount);
    public static final long OFFSET$maxBufferCount = LAYOUT.byteOffset(PATH$maxBufferCount);
    public static final long OFFSET$minBufferCountForCamping = LAYOUT.byteOffset(PATH$minBufferCountForCamping);
    public static final long OFFSET$minBufferCountForDedicatedSlack = LAYOUT.byteOffset(PATH$minBufferCountForDedicatedSlack);
    public static final long OFFSET$minBufferCountForSharedSlack = LAYOUT.byteOffset(PATH$minBufferCountForSharedSlack);

    public VkBufferCollectionConstraintsInfoFUCHSIA(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_BUFFER_COLLECTION_CONSTRAINTS_INFO_FUCHSIA);
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

    public @unsigned int minBufferCount() {
        return segment.get(LAYOUT$minBufferCount, OFFSET$minBufferCount);
    }

    public void minBufferCount(@unsigned int value) {
        segment.set(LAYOUT$minBufferCount, OFFSET$minBufferCount, value);
    }

    public @unsigned int maxBufferCount() {
        return segment.get(LAYOUT$maxBufferCount, OFFSET$maxBufferCount);
    }

    public void maxBufferCount(@unsigned int value) {
        segment.set(LAYOUT$maxBufferCount, OFFSET$maxBufferCount, value);
    }

    public @unsigned int minBufferCountForCamping() {
        return segment.get(LAYOUT$minBufferCountForCamping, OFFSET$minBufferCountForCamping);
    }

    public void minBufferCountForCamping(@unsigned int value) {
        segment.set(LAYOUT$minBufferCountForCamping, OFFSET$minBufferCountForCamping, value);
    }

    public @unsigned int minBufferCountForDedicatedSlack() {
        return segment.get(LAYOUT$minBufferCountForDedicatedSlack, OFFSET$minBufferCountForDedicatedSlack);
    }

    public void minBufferCountForDedicatedSlack(@unsigned int value) {
        segment.set(LAYOUT$minBufferCountForDedicatedSlack, OFFSET$minBufferCountForDedicatedSlack, value);
    }

    public @unsigned int minBufferCountForSharedSlack() {
        return segment.get(LAYOUT$minBufferCountForSharedSlack, OFFSET$minBufferCountForSharedSlack);
    }

    public void minBufferCountForSharedSlack(@unsigned int value) {
        segment.set(LAYOUT$minBufferCountForSharedSlack, OFFSET$minBufferCountForSharedSlack, value);
    }


    public static final class VkBufferCollectionConstraintsInfoFUCHSIAFactory implements IDataTypeFactory<VkBufferCollectionConstraintsInfoFUCHSIA> {
        @Override
        public Class<VkBufferCollectionConstraintsInfoFUCHSIA> clazz() {
            return VkBufferCollectionConstraintsInfoFUCHSIA.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkBufferCollectionConstraintsInfoFUCHSIA.LAYOUT;
        }

        @Override
        public VkBufferCollectionConstraintsInfoFUCHSIA create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkBufferCollectionConstraintsInfoFUCHSIA createUninit(MemorySegment segment) {
            return new VkBufferCollectionConstraintsInfoFUCHSIA(segment);
        }
    }

    public static final VkBufferCollectionConstraintsInfoFUCHSIAFactory FACTORY = new VkBufferCollectionConstraintsInfoFUCHSIAFactory();
}
