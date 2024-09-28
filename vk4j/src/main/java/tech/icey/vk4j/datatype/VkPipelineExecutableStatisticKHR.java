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

/// {@snippet lang=c :
/// typedef struct VkPipelineExecutableStatisticKHR {
///     VkStructureType sType;
///     void* pNext;
///     char name[VK_MAX_DESCRIPTION_SIZE];
///     char description[VK_MAX_DESCRIPTION_SIZE];
///     VkPipelineExecutableStatisticFormatKHR format;
///     VkPipelineExecutableStatisticValueKHR value;
/// } VkPipelineExecutableStatisticKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPipelineExecutableStatisticKHR.html">VkPipelineExecutableStatisticKHR</a>
public record VkPipelineExecutableStatisticKHR(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("name"),
        MemoryLayout.sequenceLayout(VK_MAX_DESCRIPTION_SIZE, ValueLayout.JAVA_BYTE).withName("description"),
        ValueLayout.JAVA_INT.withName("format"),
        VkPipelineExecutableStatisticValueKHR.LAYOUT.withName("value")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$name = PathElement.groupElement("name");
    public static final PathElement PATH$description = PathElement.groupElement("description");
    public static final PathElement PATH$format = PathElement.groupElement("format");
    public static final PathElement PATH$value = PathElement.groupElement("value");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final SequenceLayout LAYOUT$name = (SequenceLayout) LAYOUT.select(PATH$name);
    public static final SequenceLayout LAYOUT$description = (SequenceLayout) LAYOUT.select(PATH$description);
    public static final OfInt LAYOUT$format = (OfInt) LAYOUT.select(PATH$format);
    public static final UnionLayout LAYOUT$value = (UnionLayout) LAYOUT.select(PATH$value);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$name = LAYOUT.byteOffset(PATH$name);
    public static final long OFFSET$description = LAYOUT.byteOffset(PATH$description);
    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);
    public static final long OFFSET$value = LAYOUT.byteOffset(PATH$value);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$name = LAYOUT$name.byteSize();
    public static final long SIZE$description = LAYOUT$description.byteSize();
    public static final long SIZE$format = LAYOUT$format.byteSize();
    public static final long SIZE$value = LAYOUT$value.byteSize();

    public VkPipelineExecutableStatisticKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_STATISTIC_KHR);
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

    public MemorySegment nameRaw() {
        return segment.asSlice(OFFSET$name, SIZE$name);
    }

    public ByteBuffer name() {
        return new ByteBuffer(nameRaw());
    }

    public void name(ByteBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$name, SIZE$name);
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

    public @enumtype(VkPipelineExecutableStatisticFormatKHR.class) int format() {
        return segment.get(LAYOUT$format, OFFSET$format);
    }

    public void format(@enumtype(VkPipelineExecutableStatisticFormatKHR.class) int value) {
        segment.set(LAYOUT$format, OFFSET$format, value);
    }

    public VkPipelineExecutableStatisticValueKHR value() {
        return new VkPipelineExecutableStatisticValueKHR(segment.asSlice(OFFSET$value, LAYOUT$value));
    }

    public void value(VkPipelineExecutableStatisticValueKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$value, SIZE$value);
    }

    public static VkPipelineExecutableStatisticKHR allocate(Arena arena) {
        return new VkPipelineExecutableStatisticKHR(arena.allocate(LAYOUT));
    }
    
    public static VkPipelineExecutableStatisticKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineExecutableStatisticKHR[] ret = new VkPipelineExecutableStatisticKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPipelineExecutableStatisticKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
