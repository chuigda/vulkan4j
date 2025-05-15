package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkExportMetalIOSurfaceInfoEXT.html">VkExportMetalIOSurfaceInfoEXT</a>
@ValueBasedCandidate
public record VkExportMetalIOSurfaceInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final AddressLayout LAYOUT$image = ValueLayout.ADDRESS.withName("image");
    public static final AddressLayout LAYOUT$ioSurface = ValueLayout.ADDRESS.withName("ioSurface");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$image, LAYOUT$ioSurface);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkExportMetalIOSurfaceInfoEXT allocate(Arena arena) {
        return new VkExportMetalIOSurfaceInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkExportMetalIOSurfaceInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkExportMetalIOSurfaceInfoEXT[] ret = new VkExportMetalIOSurfaceInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkExportMetalIOSurfaceInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkExportMetalIOSurfaceInfoEXT clone(Arena arena, VkExportMetalIOSurfaceInfoEXT src) {
        VkExportMetalIOSurfaceInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkExportMetalIOSurfaceInfoEXT[] clone(Arena arena, VkExportMetalIOSurfaceInfoEXT[] src) {
        VkExportMetalIOSurfaceInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$image = PathElement.groupElement("PATH$image");
    public static final PathElement PATH$ioSurface = PathElement.groupElement("PATH$ioSurface");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$image = LAYOUT$image.byteSize();
    public static final long SIZE$ioSurface = LAYOUT$ioSurface.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$image = LAYOUT.byteOffset(PATH$image);
    public static final long OFFSET$ioSurface = LAYOUT.byteOffset(PATH$ioSurface);

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

    public @Nullable VkImage image() {
        MemorySegment s = segment.asSlice(OFFSET$image, SIZE$image);
        if (s.address() == 0) {
            return null;
        }
        return new VkImage(s);
    }

    public void image() {
        segment.set(LAYOUT$image, OFFSET$image, value != null ? value.segment() : MemorySegment.NULL);
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

}
