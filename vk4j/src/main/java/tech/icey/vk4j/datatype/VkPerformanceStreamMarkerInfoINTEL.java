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
/// typedef struct VkPerformanceStreamMarkerInfoINTEL {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t marker;
/// } VkPerformanceStreamMarkerInfoINTEL;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPerformanceStreamMarkerInfoINTEL.html">VkPerformanceStreamMarkerInfoINTEL</a>
public record VkPerformanceStreamMarkerInfoINTEL(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("marker")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$marker = PathElement.groupElement("marker");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$marker = (OfInt) LAYOUT.select(PATH$marker);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$marker = LAYOUT.byteOffset(PATH$marker);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$marker = LAYOUT$marker.byteSize();

    public VkPerformanceStreamMarkerInfoINTEL(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PERFORMANCE_STREAM_MARKER_INFO_INTEL);
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

    public @unsigned int marker() {
        return segment.get(LAYOUT$marker, OFFSET$marker);
    }

    public void marker(@unsigned int value) {
        segment.set(LAYOUT$marker, OFFSET$marker, value);
    }

    public static VkPerformanceStreamMarkerInfoINTEL allocate(Arena arena) {
        return new VkPerformanceStreamMarkerInfoINTEL(arena.allocate(LAYOUT));
    }
    
    public static VkPerformanceStreamMarkerInfoINTEL[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPerformanceStreamMarkerInfoINTEL[] ret = new VkPerformanceStreamMarkerInfoINTEL[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPerformanceStreamMarkerInfoINTEL(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
