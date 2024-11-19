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
/// typedef struct VkDisplayProperties2KHR {
///     VkStructureType sType;
///     void* pNext;
///     VkDisplayPropertiesKHR displayProperties;
/// } VkDisplayProperties2KHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDisplayProperties2KHR.html">VkDisplayProperties2KHR</a>
public record VkDisplayProperties2KHR(MemorySegment segment) implements IPointer {
    public VkDisplayProperties2KHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DISPLAY_PROPERTIES_2_KHR);
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

    public VkDisplayPropertiesKHR displayProperties() {
        return new VkDisplayPropertiesKHR(segment.asSlice(OFFSET$displayProperties, LAYOUT$displayProperties));
    }

    public void displayProperties(VkDisplayPropertiesKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$displayProperties, SIZE$displayProperties);
    }

    public static VkDisplayProperties2KHR allocate(Arena arena) {
        return new VkDisplayProperties2KHR(arena.allocate(LAYOUT));
    }

    public static VkDisplayProperties2KHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDisplayProperties2KHR[] ret = new VkDisplayProperties2KHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDisplayProperties2KHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDisplayProperties2KHR clone(Arena arena, VkDisplayProperties2KHR src) {
        VkDisplayProperties2KHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDisplayProperties2KHR[] clone(Arena arena, VkDisplayProperties2KHR[] src) {
        VkDisplayProperties2KHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkDisplayPropertiesKHR.LAYOUT.withName("displayProperties")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$displayProperties = PathElement.groupElement("displayProperties");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$displayProperties = (StructLayout) LAYOUT.select(PATH$displayProperties);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$displayProperties = LAYOUT.byteOffset(PATH$displayProperties);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$displayProperties = LAYOUT$displayProperties.byteSize();
}
