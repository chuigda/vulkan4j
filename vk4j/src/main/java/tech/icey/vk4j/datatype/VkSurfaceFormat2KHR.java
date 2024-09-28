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
/// typedef struct VkSurfaceFormat2KHR {
///     VkStructureType sType;
///     void* pNext;
///     VkSurfaceFormatKHR surfaceFormat;
/// } VkSurfaceFormat2KHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkSurfaceFormat2KHR.html">VkSurfaceFormat2KHR</a>
public record VkSurfaceFormat2KHR(MemorySegment segment) implements IPointer {
    public VkSurfaceFormat2KHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SURFACE_FORMAT_2_KHR);
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

    public VkSurfaceFormatKHR surfaceFormat() {
        return new VkSurfaceFormatKHR(segment.asSlice(OFFSET$surfaceFormat, LAYOUT$surfaceFormat));
    }

    public void surfaceFormat(VkSurfaceFormatKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$surfaceFormat, SIZE$surfaceFormat);
    }

    public static VkSurfaceFormat2KHR allocate(Arena arena) {
        return new VkSurfaceFormat2KHR(arena.allocate(LAYOUT));
    }
    
    public static VkSurfaceFormat2KHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSurfaceFormat2KHR[] ret = new VkSurfaceFormat2KHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkSurfaceFormat2KHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkSurfaceFormatKHR.LAYOUT.withName("surfaceFormat")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$surfaceFormat = PathElement.groupElement("surfaceFormat");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$surfaceFormat = (StructLayout) LAYOUT.select(PATH$surfaceFormat);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$surfaceFormat = LAYOUT.byteOffset(PATH$surfaceFormat);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$surfaceFormat = LAYOUT$surfaceFormat.byteSize();
}
