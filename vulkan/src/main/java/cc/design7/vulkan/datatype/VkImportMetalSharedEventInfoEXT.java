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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImportMetalSharedEventInfoEXT.html"><code>VkImportMetalSharedEventInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkImportMetalSharedEventInfoEXT {
///     VkStructureType sType;
///     void const* pNext; // optional
///     MTLSharedEvent_id mtlSharedEvent;
/// } VkImportMetalSharedEventInfoEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_IMPORT_METAL_SHARED_EVENT_INFO_EXT`
///
/// The {@link VkImportMetalSharedEventInfoEXT#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkImportMetalSharedEventInfoEXT#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkImportMetalSharedEventInfoEXT.html"><code>VkImportMetalSharedEventInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkImportMetalSharedEventInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkImportMetalSharedEventInfoEXT allocate(Arena arena) {
        VkImportMetalSharedEventInfoEXT ret = new VkImportMetalSharedEventInfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.IMPORT_METAL_SHARED_EVENT_INFO_EXT);
        return ret;
    }

    public static VkImportMetalSharedEventInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImportMetalSharedEventInfoEXT[] ret = new VkImportMetalSharedEventInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkImportMetalSharedEventInfoEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.IMPORT_METAL_SHARED_EVENT_INFO_EXT);
        }
        return ret;
    }

    public static VkImportMetalSharedEventInfoEXT clone(Arena arena, VkImportMetalSharedEventInfoEXT src) {
        VkImportMetalSharedEventInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkImportMetalSharedEventInfoEXT[] clone(Arena arena, VkImportMetalSharedEventInfoEXT[] src) {
        VkImportMetalSharedEventInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.IMPORT_METAL_SHARED_EVENT_INFO_EXT);
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

    public @pointer(comment="void*") MemorySegment mtlSharedEvent() {
        return segment.get(LAYOUT$mtlSharedEvent, OFFSET$mtlSharedEvent);
    }

    public void mtlSharedEvent(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$mtlSharedEvent, OFFSET$mtlSharedEvent, value);
    }

    public void mtlSharedEvent(@Nullable IPointer pointer) {
        mtlSharedEvent(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("mtlSharedEvent")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$mtlSharedEvent = PathElement.groupElement("PATH$mtlSharedEvent");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$mtlSharedEvent = (AddressLayout) LAYOUT.select(PATH$mtlSharedEvent);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$mtlSharedEvent = LAYOUT$mtlSharedEvent.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$mtlSharedEvent = LAYOUT.byteOffset(PATH$mtlSharedEvent);
}
