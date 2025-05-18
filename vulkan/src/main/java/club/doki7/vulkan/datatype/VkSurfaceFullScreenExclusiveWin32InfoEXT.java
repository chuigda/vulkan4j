package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSurfaceFullScreenExclusiveWin32InfoEXT.html"><code>VkSurfaceFullScreenExclusiveWin32InfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkSurfaceFullScreenExclusiveWin32InfoEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     HMONITOR hmonitor; // @link substring="hmonitor" target="#hmonitor"
/// } VkSurfaceFullScreenExclusiveWin32InfoEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_SURFACE_FULL_SCREEN_EXCLUSIVE_WIN32_INFO_EXT`
///
/// The {@link VkSurfaceFullScreenExclusiveWin32InfoEXT#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkSurfaceFullScreenExclusiveWin32InfoEXT#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSurfaceFullScreenExclusiveWin32InfoEXT.html"><code>VkSurfaceFullScreenExclusiveWin32InfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkSurfaceFullScreenExclusiveWin32InfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkSurfaceFullScreenExclusiveWin32InfoEXT allocate(Arena arena) {
        VkSurfaceFullScreenExclusiveWin32InfoEXT ret = new VkSurfaceFullScreenExclusiveWin32InfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.SURFACE_FULL_SCREEN_EXCLUSIVE_WIN32_INFO_EXT);
        return ret;
    }

    public static VkSurfaceFullScreenExclusiveWin32InfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSurfaceFullScreenExclusiveWin32InfoEXT[] ret = new VkSurfaceFullScreenExclusiveWin32InfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSurfaceFullScreenExclusiveWin32InfoEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.SURFACE_FULL_SCREEN_EXCLUSIVE_WIN32_INFO_EXT);
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.SURFACE_FULL_SCREEN_EXCLUSIVE_WIN32_INFO_EXT);
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
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @pointer(comment="void*") MemorySegment hmonitor() {
        return segment.get(LAYOUT$hmonitor, OFFSET$hmonitor);
    }

    public void hmonitor(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$hmonitor, OFFSET$hmonitor, value);
    }

    public void hmonitor(@Nullable IPointer pointer) {
        hmonitor(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("hmonitor")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$hmonitor = PathElement.groupElement("PATH$hmonitor");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$hmonitor = (AddressLayout) LAYOUT.select(PATH$hmonitor);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$hmonitor = LAYOUT$hmonitor.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$hmonitor = LAYOUT.byteOffset(PATH$hmonitor);
}
