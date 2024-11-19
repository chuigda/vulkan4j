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
/// typedef struct VkQueueFamilyProperties2 {
///     VkStructureType sType;
///     void* pNext;
///     VkQueueFamilyProperties queueFamilyProperties;
/// } VkQueueFamilyProperties2;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkQueueFamilyProperties2.html">VkQueueFamilyProperties2</a>
public record VkQueueFamilyProperties2(MemorySegment segment) implements IPointer {
    public VkQueueFamilyProperties2(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_QUEUE_FAMILY_PROPERTIES_2);
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

    public VkQueueFamilyProperties queueFamilyProperties() {
        return new VkQueueFamilyProperties(segment.asSlice(OFFSET$queueFamilyProperties, LAYOUT$queueFamilyProperties));
    }

    public void queueFamilyProperties(VkQueueFamilyProperties value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$queueFamilyProperties, SIZE$queueFamilyProperties);
    }

    public static VkQueueFamilyProperties2 allocate(Arena arena) {
        return new VkQueueFamilyProperties2(arena.allocate(LAYOUT));
    }

    public static VkQueueFamilyProperties2[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkQueueFamilyProperties2[] ret = new VkQueueFamilyProperties2[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkQueueFamilyProperties2(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkQueueFamilyProperties2 clone(Arena arena, VkQueueFamilyProperties2 src) {
        VkQueueFamilyProperties2 ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkQueueFamilyProperties2[] clone(Arena arena, VkQueueFamilyProperties2[] src) {
        VkQueueFamilyProperties2[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkQueueFamilyProperties.LAYOUT.withName("queueFamilyProperties")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$queueFamilyProperties = PathElement.groupElement("queueFamilyProperties");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$queueFamilyProperties = (StructLayout) LAYOUT.select(PATH$queueFamilyProperties);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$queueFamilyProperties = LAYOUT.byteOffset(PATH$queueFamilyProperties);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$queueFamilyProperties = LAYOUT$queueFamilyProperties.byteSize();
}
