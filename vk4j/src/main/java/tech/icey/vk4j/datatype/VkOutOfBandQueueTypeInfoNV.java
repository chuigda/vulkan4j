package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
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
/// typedef struct VkOutOfBandQueueTypeInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkOutOfBandQueueTypeNV queueType;
/// } VkOutOfBandQueueTypeInfoNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkOutOfBandQueueTypeInfoNV.html">VkOutOfBandQueueTypeInfoNV</a>
public record VkOutOfBandQueueTypeInfoNV(MemorySegment segment) implements IPointer {
    public VkOutOfBandQueueTypeInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_OUT_OF_BAND_QUEUE_TYPE_INFO_NV);
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

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @enumtype(VkOutOfBandQueueTypeNV.class) int queueType() {
        return segment.get(LAYOUT$queueType, OFFSET$queueType);
    }

    public void queueType(@enumtype(VkOutOfBandQueueTypeNV.class) int value) {
        segment.set(LAYOUT$queueType, OFFSET$queueType, value);
    }

    public static VkOutOfBandQueueTypeInfoNV allocate(Arena arena) {
        return new VkOutOfBandQueueTypeInfoNV(arena.allocate(LAYOUT));
    }

    public static VkOutOfBandQueueTypeInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkOutOfBandQueueTypeInfoNV[] ret = new VkOutOfBandQueueTypeInfoNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkOutOfBandQueueTypeInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkOutOfBandQueueTypeInfoNV clone(Arena arena, VkOutOfBandQueueTypeInfoNV src) {
        VkOutOfBandQueueTypeInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkOutOfBandQueueTypeInfoNV[] clone(Arena arena, VkOutOfBandQueueTypeInfoNV[] src) {
        VkOutOfBandQueueTypeInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("queueType")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$queueType = PathElement.groupElement("queueType");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$queueType = (OfInt) LAYOUT.select(PATH$queueType);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$queueType = LAYOUT.byteOffset(PATH$queueType);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$queueType = LAYOUT$queueType.byteSize();
}
