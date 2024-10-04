package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

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
/// typedef struct VkSurfaceFullScreenExclusiveWin32InfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     HMONITOR hmonitor;
/// } VkSurfaceFullScreenExclusiveWin32InfoEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkSurfaceFullScreenExclusiveWin32InfoEXT.html">VkSurfaceFullScreenExclusiveWin32InfoEXT</a>
public record VkSurfaceFullScreenExclusiveWin32InfoEXT(MemorySegment segment) implements IPointer {
    public VkSurfaceFullScreenExclusiveWin32InfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SURFACE_FULL_SCREEN_EXCLUSIVE_WIN32_INFO_EXT);
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

    public @pointer(comment="void*") MemorySegment hmonitor() {
        return segment.get(LAYOUT$hmonitor, OFFSET$hmonitor);
    }

    public void hmonitor(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$hmonitor, OFFSET$hmonitor, value);
    }

    public void hmonitor(@nullable IPointer pointer) {
        hmonitor(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public static VkSurfaceFullScreenExclusiveWin32InfoEXT allocate(Arena arena) {
        return new VkSurfaceFullScreenExclusiveWin32InfoEXT(arena.allocate(LAYOUT));
    }

    public static VkSurfaceFullScreenExclusiveWin32InfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSurfaceFullScreenExclusiveWin32InfoEXT[] ret = new VkSurfaceFullScreenExclusiveWin32InfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkSurfaceFullScreenExclusiveWin32InfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSurfaceFullScreenExclusiveWin32InfoEXT clone(Arena arena, VkSurfaceFullScreenExclusiveWin32InfoEXT src) {
        VkSurfaceFullScreenExclusiveWin32InfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSurfaceFullScreenExclusiveWin32InfoEXT[] clone(Arena arena, VkSurfaceFullScreenExclusiveWin32InfoEXT[] src) {
        VkSurfaceFullScreenExclusiveWin32InfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("hmonitor")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$hmonitor = PathElement.groupElement("hmonitor");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$hmonitor = (AddressLayout) LAYOUT.select(PATH$hmonitor);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$hmonitor = LAYOUT.byteOffset(PATH$hmonitor);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$hmonitor = LAYOUT$hmonitor.byteSize();
}
