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
/// typedef struct VkMemoryPriorityAllocateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     float priority;
/// } VkMemoryPriorityAllocateInfoEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkMemoryPriorityAllocateInfoEXT.html">VkMemoryPriorityAllocateInfoEXT</a>
public record VkMemoryPriorityAllocateInfoEXT(MemorySegment segment) implements IPointer {
    public VkMemoryPriorityAllocateInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_MEMORY_PRIORITY_ALLOCATE_INFO_EXT);
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

    public float priority() {
        return segment.get(LAYOUT$priority, OFFSET$priority);
    }

    public void priority(float value) {
        segment.set(LAYOUT$priority, OFFSET$priority, value);
    }

    public static VkMemoryPriorityAllocateInfoEXT allocate(Arena arena) {
        return new VkMemoryPriorityAllocateInfoEXT(arena.allocate(LAYOUT));
    }
    
    public static VkMemoryPriorityAllocateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkMemoryPriorityAllocateInfoEXT[] ret = new VkMemoryPriorityAllocateInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkMemoryPriorityAllocateInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkMemoryPriorityAllocateInfoEXT clone(Arena arena, VkMemoryPriorityAllocateInfoEXT src) {
        VkMemoryPriorityAllocateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkMemoryPriorityAllocateInfoEXT[] clone(Arena arena, VkMemoryPriorityAllocateInfoEXT[] src) {
        VkMemoryPriorityAllocateInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_FLOAT.withName("priority")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$priority = PathElement.groupElement("priority");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfFloat LAYOUT$priority = (OfFloat) LAYOUT.select(PATH$priority);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$priority = LAYOUT.byteOffset(PATH$priority);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$priority = LAYOUT$priority.byteSize();
}
