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
/// typedef struct VkMemoryMapPlacedInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     void* pPlacedAddress;
/// } VkMemoryMapPlacedInfoEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkMemoryMapPlacedInfoEXT.html">VkMemoryMapPlacedInfoEXT</a>
public record VkMemoryMapPlacedInfoEXT(MemorySegment segment) implements IPointer {
    public VkMemoryMapPlacedInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_MEMORY_MAP_PLACED_INFO_EXT);
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

    public @pointer(comment="void*") MemorySegment pPlacedAddress() {
        return segment.get(LAYOUT$pPlacedAddress, OFFSET$pPlacedAddress);
    }

    public void pPlacedAddress(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pPlacedAddress, OFFSET$pPlacedAddress, value);
    }

    public void pPlacedAddress(IPointer pointer) {
        pPlacedAddress(pointer.segment());
    }

    public static VkMemoryMapPlacedInfoEXT allocate(Arena arena) {
        return new VkMemoryMapPlacedInfoEXT(arena.allocate(LAYOUT));
    }
    
    public static VkMemoryMapPlacedInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkMemoryMapPlacedInfoEXT[] ret = new VkMemoryMapPlacedInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkMemoryMapPlacedInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkMemoryMapPlacedInfoEXT clone(Arena arena, VkMemoryMapPlacedInfoEXT src) {
        VkMemoryMapPlacedInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkMemoryMapPlacedInfoEXT[] clone(Arena arena, VkMemoryMapPlacedInfoEXT[] src) {
        VkMemoryMapPlacedInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pPlacedAddress")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pPlacedAddress = PathElement.groupElement("pPlacedAddress");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pPlacedAddress = (AddressLayout) LAYOUT.select(PATH$pPlacedAddress);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pPlacedAddress = LAYOUT.byteOffset(PATH$pPlacedAddress);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pPlacedAddress = LAYOUT$pPlacedAddress.byteSize();
}
