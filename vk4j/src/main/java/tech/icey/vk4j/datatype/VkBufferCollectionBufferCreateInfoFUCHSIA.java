package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkBufferCollectionBufferCreateInfoFUCHSIA(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("collection"),
        ValueLayout.JAVA_INT.withName("index")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$collection = PathElement.groupElement("collection");
    public static final PathElement PATH$index = PathElement.groupElement("index");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$collection = (AddressLayout) LAYOUT.select(PATH$collection);
    public static final OfInt LAYOUT$index = (OfInt) LAYOUT.select(PATH$index);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$collection = LAYOUT.byteOffset(PATH$collection);
    public static final long OFFSET$index = LAYOUT.byteOffset(PATH$index);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$collection = LAYOUT$collection.byteSize();
    public static final long SIZE$index = LAYOUT$index.byteSize();

    public VkBufferCollectionBufferCreateInfoFUCHSIA(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_BUFFER_COLLECTION_BUFFER_CREATE_INFO_FUCHSIA);
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
        return new VkBufferCollectionFUCHSIA(segment.get(LAYOUT$collection, OFFSET$collection));
    }

    public void collection(VkBufferCollectionFUCHSIA value) {
        segment.set(LAYOUT$collection, OFFSET$collection, value.segment());
    }

    public @unsigned int index() {
        return segment.get(LAYOUT$index, OFFSET$index);
    }

    public void index(@unsigned int value) {
        segment.set(LAYOUT$index, OFFSET$index, value);
    }

    public static VkBufferCollectionBufferCreateInfoFUCHSIA allocate(Arena arena) {
        return new VkBufferCollectionBufferCreateInfoFUCHSIA(arena.allocate(LAYOUT));
    }
    
    public static VkBufferCollectionBufferCreateInfoFUCHSIA[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBufferCollectionBufferCreateInfoFUCHSIA[] ret = new VkBufferCollectionBufferCreateInfoFUCHSIA[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkBufferCollectionBufferCreateInfoFUCHSIA(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
