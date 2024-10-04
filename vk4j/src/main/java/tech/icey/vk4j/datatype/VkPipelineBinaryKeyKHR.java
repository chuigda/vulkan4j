package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.nullable;
import tech.icey.panama.annotation.pointer;
import tech.icey.panama.annotation.unsigned;
import tech.icey.panama.buffer.ByteBuffer;
import tech.icey.vk4j.enumtype.VkStructureType;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.Constants.VK_MAX_PIPELINE_BINARY_KEY_SIZE_KHR;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_BINARY_KEY_KHR;

/// {@snippet lang=c :
/// typedef struct VkPipelineBinaryKeyKHR {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t keySize;
///     uint8_t key[VK_MAX_PIPELINE_BINARY_KEY_SIZE_KHR];
/// } VkPipelineBinaryKeyKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPipelineBinaryKeyKHR.html">VkPipelineBinaryKeyKHR</a>
public record VkPipelineBinaryKeyKHR(MemorySegment segment) implements IPointer {
    public VkPipelineBinaryKeyKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_BINARY_KEY_KHR);
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

    public void pNext(@nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @unsigned int keySize() {
        return segment.get(LAYOUT$keySize, OFFSET$keySize);
    }

    public void keySize(@unsigned int value) {
        segment.set(LAYOUT$keySize, OFFSET$keySize, value);
    }

    public MemorySegment keyRaw() {
        return segment.asSlice(OFFSET$key, SIZE$key);
    }

    public @unsigned ByteBuffer key() {
        return new ByteBuffer(keyRaw());
    }

    public void key(@unsigned ByteBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$key, SIZE$key);
    }

    public static VkPipelineBinaryKeyKHR allocate(Arena arena) {
        return new VkPipelineBinaryKeyKHR(arena.allocate(LAYOUT));
    }

    public static VkPipelineBinaryKeyKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineBinaryKeyKHR[] ret = new VkPipelineBinaryKeyKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPipelineBinaryKeyKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPipelineBinaryKeyKHR clone(Arena arena, VkPipelineBinaryKeyKHR src) {
        VkPipelineBinaryKeyKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineBinaryKeyKHR[] clone(Arena arena, VkPipelineBinaryKeyKHR[] src) {
        VkPipelineBinaryKeyKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("keySize"),
        MemoryLayout.sequenceLayout(VK_MAX_PIPELINE_BINARY_KEY_SIZE_KHR, ValueLayout.JAVA_BYTE).withName("key")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$keySize = PathElement.groupElement("keySize");
    public static final PathElement PATH$key = PathElement.groupElement("key");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$keySize = (OfInt) LAYOUT.select(PATH$keySize);
    public static final SequenceLayout LAYOUT$key = (SequenceLayout) LAYOUT.select(PATH$key);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$keySize = LAYOUT.byteOffset(PATH$keySize);
    public static final long OFFSET$key = LAYOUT.byteOffset(PATH$key);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$keySize = LAYOUT$keySize.byteSize();
    public static final long SIZE$key = LAYOUT$key.byteSize();
}
