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
/// typedef struct VkFormatProperties2 {
///     VkStructureType sType;
///     void* pNext;
///     VkFormatProperties formatProperties;
/// } VkFormatProperties2;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkFormatProperties2.html">VkFormatProperties2</a>
public record VkFormatProperties2(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkFormatProperties.LAYOUT.withName("formatProperties")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$formatProperties = PathElement.groupElement("formatProperties");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$formatProperties = (StructLayout) LAYOUT.select(PATH$formatProperties);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$formatProperties = LAYOUT.byteOffset(PATH$formatProperties);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$formatProperties = LAYOUT$formatProperties.byteSize();

    public VkFormatProperties2(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_FORMAT_PROPERTIES_2);
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

    public VkFormatProperties formatProperties() {
        return new VkFormatProperties(segment.asSlice(OFFSET$formatProperties, LAYOUT$formatProperties));
    }

    public void formatProperties(VkFormatProperties value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$formatProperties, SIZE$formatProperties);
    }

    public static VkFormatProperties2 allocate(Arena arena) {
        return new VkFormatProperties2(arena.allocate(LAYOUT));
    }
    
    public static VkFormatProperties2[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkFormatProperties2[] ret = new VkFormatProperties2[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkFormatProperties2(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
