package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.nullable;
import tech.icey.panama.annotation.pointer;
import tech.icey.panama.buffer.ByteBuffer;
import tech.icey.vk4j.bitmask.VkPerformanceCounterDescriptionFlagsKHR;
import tech.icey.vk4j.enumtype.VkStructureType;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.Constants.VK_MAX_DESCRIPTION_SIZE;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_KHR;

/// {@snippet lang=c :
/// typedef struct VkPerformanceCounterDescriptionKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkPerformanceCounterDescriptionFlagsKHR flags;
///     char name[VK_MAX_DESCRIPTION_SIZE];
///     char category[VK_MAX_DESCRIPTION_SIZE];
///     char description[VK_MAX_DESCRIPTION_SIZE];
/// } VkPerformanceCounterDescriptionKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPerformanceCounterDescriptionKHR.html">VkPerformanceCounterDescriptionKHR</a>
public record VkPerformanceCounterDescriptionKHR(MemorySegment segment) implements IPointer {
    public VkPerformanceCounterDescriptionKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PERFORMANCE_COUNTER_DESCRIPTION_KHR);
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

    public @enumtype(VkPerformanceCounterDescriptionFlagsKHR.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkPerformanceCounterDescriptionFlagsKHR.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public MemorySegment nameRaw() {
        return segment.asSlice(OFFSET$name, SIZE$name);
    }

    public ByteBuffer name() {
        return new ByteBuffer(nameRaw());
    }

    public void name(ByteBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$name, SIZE$name);
    }

    public MemorySegment categoryRaw() {
        return segment.asSlice(OFFSET$category, SIZE$category);
    }

    public ByteBuffer category() {
        return new ByteBuffer(categoryRaw());
    }

    public void category(ByteBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$category, SIZE$category);
    }

    public MemorySegment descriptionRaw() {
        return segment.asSlice(OFFSET$description, SIZE$description);
    }

    public ByteBuffer description() {
        return new ByteBuffer(descriptionRaw());
    }

    public void description(ByteBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$description, SIZE$description);
    }

    public static VkPerformanceCounterDescriptionKHR allocate(Arena arena) {
        return new VkPerformanceCounterDescriptionKHR(arena.allocate(LAYOUT));
    }

    public static VkPerformanceCounterDescriptionKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPerformanceCounterDescriptionKHR[] ret = new VkPerformanceCounterDescriptionKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPerformanceCounterDescriptionKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPerformanceCounterDescriptionKHR clone(Arena arena, VkPerformanceCounterDescriptionKHR src) {
        VkPerformanceCounterDescriptionKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPerformanceCounterDescriptionKHR[] clone(Arena arena, VkPerformanceCounterDescriptionKHR[] src) {
        VkPerformanceCounterDescriptionKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        MemoryLayout.sequenceLayout(VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("name"),
        MemoryLayout.sequenceLayout(VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("category"),
        MemoryLayout.sequenceLayout(VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("description")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$name = PathElement.groupElement("name");
    public static final PathElement PATH$category = PathElement.groupElement("category");
    public static final PathElement PATH$description = PathElement.groupElement("description");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final SequenceLayout LAYOUT$name = (SequenceLayout) LAYOUT.select(PATH$name);
    public static final SequenceLayout LAYOUT$category = (SequenceLayout) LAYOUT.select(PATH$category);
    public static final SequenceLayout LAYOUT$description = (SequenceLayout) LAYOUT.select(PATH$description);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$name = LAYOUT.byteOffset(PATH$name);
    public static final long OFFSET$category = LAYOUT.byteOffset(PATH$category);
    public static final long OFFSET$description = LAYOUT.byteOffset(PATH$description);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$name = LAYOUT$name.byteSize();
    public static final long SIZE$category = LAYOUT$category.byteSize();
    public static final long SIZE$description = LAYOUT$description.byteSize();
}
