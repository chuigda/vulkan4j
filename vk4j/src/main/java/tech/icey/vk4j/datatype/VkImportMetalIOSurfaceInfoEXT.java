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
/// typedef struct VkImportMetalIOSurfaceInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     IOSurfaceRef ioSurface;
/// } VkImportMetalIOSurfaceInfoEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkImportMetalIOSurfaceInfoEXT.html">VkImportMetalIOSurfaceInfoEXT</a>
public record VkImportMetalIOSurfaceInfoEXT(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("ioSurface")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$ioSurface = PathElement.groupElement("ioSurface");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$ioSurface = (AddressLayout) LAYOUT.select(PATH$ioSurface);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$ioSurface = LAYOUT.byteOffset(PATH$ioSurface);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$ioSurface = LAYOUT$ioSurface.byteSize();

    public VkImportMetalIOSurfaceInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IMPORT_METAL_IO_SURFACE_INFO_EXT);
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

    public @pointer(comment="void*") MemorySegment ioSurface() {
        return segment.get(LAYOUT$ioSurface, OFFSET$ioSurface);
    }

    public void ioSurface(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$ioSurface, OFFSET$ioSurface, value);
    }

    public void ioSurface(IPointer pointer) {
        ioSurface(pointer.segment());
    }

    public static VkImportMetalIOSurfaceInfoEXT allocate(Arena arena) {
        return new VkImportMetalIOSurfaceInfoEXT(arena.allocate(LAYOUT));
    }
    
    public static VkImportMetalIOSurfaceInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImportMetalIOSurfaceInfoEXT[] ret = new VkImportMetalIOSurfaceInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkImportMetalIOSurfaceInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
