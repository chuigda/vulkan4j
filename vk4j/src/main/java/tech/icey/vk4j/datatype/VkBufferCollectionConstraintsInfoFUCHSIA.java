package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkBufferCollectionConstraintsInfoFUCHSIA {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t minBufferCount;
///     uint32_t maxBufferCount;
///     uint32_t minBufferCountForCamping;
///     uint32_t minBufferCountForDedicatedSlack;
///     uint32_t minBufferCountForSharedSlack;
/// } VkBufferCollectionConstraintsInfoFUCHSIA;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkBufferCollectionConstraintsInfoFUCHSIA.html">VkBufferCollectionConstraintsInfoFUCHSIA</a>
public record VkBufferCollectionConstraintsInfoFUCHSIA(MemorySegment segment) implements IPointer {
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
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

    public static VkBufferCollectionConstraintsInfoFUCHSIA allocate(Arena arena) {
        return new VkBufferCollectionConstraintsInfoFUCHSIA(arena.allocate(LAYOUT));
    }
    
    public static VkBufferCollectionConstraintsInfoFUCHSIA[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkBufferCollectionConstraintsInfoFUCHSIA[] ret = new VkBufferCollectionConstraintsInfoFUCHSIA[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkBufferCollectionConstraintsInfoFUCHSIA(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkBufferCollectionConstraintsInfoFUCHSIA clone(Arena arena, VkBufferCollectionConstraintsInfoFUCHSIA src) {
        VkBufferCollectionConstraintsInfoFUCHSIA ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkBufferCollectionConstraintsInfoFUCHSIA[] clone(Arena arena, VkBufferCollectionConstraintsInfoFUCHSIA[] src) {
        VkBufferCollectionConstraintsInfoFUCHSIA[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("minBufferCount"),
        ValueLayout.JAVA_INT.withName("maxBufferCount"),
        ValueLayout.JAVA_INT.withName("minBufferCountForCamping"),
        ValueLayout.JAVA_INT.withName("minBufferCountForDedicatedSlack"),
        ValueLayout.JAVA_INT.withName("minBufferCountForSharedSlack")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$minBufferCount = PathElement.groupElement("minBufferCount");
    public static final PathElement PATH$maxBufferCount = PathElement.groupElement("maxBufferCount");
    public static final PathElement PATH$minBufferCountForCamping = PathElement.groupElement("minBufferCountForCamping");
    public static final PathElement PATH$minBufferCountForDedicatedSlack = PathElement.groupElement("minBufferCountForDedicatedSlack");
    public static final PathElement PATH$minBufferCountForSharedSlack = PathElement.groupElement("minBufferCountForSharedSlack");

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

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$minBufferCount = LAYOUT$minBufferCount.byteSize();
    public static final long SIZE$maxBufferCount = LAYOUT$maxBufferCount.byteSize();
    public static final long SIZE$minBufferCountForCamping = LAYOUT$minBufferCountForCamping.byteSize();
    public static final long SIZE$minBufferCountForDedicatedSlack = LAYOUT$minBufferCountForDedicatedSlack.byteSize();
    public static final long SIZE$minBufferCountForSharedSlack = LAYOUT$minBufferCountForSharedSlack.byteSize();
}
