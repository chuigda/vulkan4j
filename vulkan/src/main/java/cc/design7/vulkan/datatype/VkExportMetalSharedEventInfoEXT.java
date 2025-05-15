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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkExportMetalSharedEventInfoEXT.html"><code>VkExportMetalSharedEventInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkExportMetalSharedEventInfoEXT {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkSemaphore semaphore; // optional
///     VkEvent event; // optional
///     MTLSharedEvent_id mtlSharedEvent;
/// } VkExportMetalSharedEventInfoEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_EXPORT_METAL_SHARED_EVENT_INFO_EXT`
///
/// The {@link VkExportMetalSharedEventInfoEXT#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkExportMetalSharedEventInfoEXT#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkExportMetalSharedEventInfoEXT.html"><code>VkExportMetalSharedEventInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkExportMetalSharedEventInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkExportMetalSharedEventInfoEXT allocate(Arena arena) {
        VkExportMetalSharedEventInfoEXT ret = new VkExportMetalSharedEventInfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.EXPORT_METAL_SHARED_EVENT_INFO_EXT);
        return ret;
    }

    public static VkExportMetalSharedEventInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkExportMetalSharedEventInfoEXT[] ret = new VkExportMetalSharedEventInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkExportMetalSharedEventInfoEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.EXPORT_METAL_SHARED_EVENT_INFO_EXT);
        }
        return ret;
    }

    public static VkExportMetalSharedEventInfoEXT clone(Arena arena, VkExportMetalSharedEventInfoEXT src) {
        VkExportMetalSharedEventInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkExportMetalSharedEventInfoEXT[] clone(Arena arena, VkExportMetalSharedEventInfoEXT[] src) {
        VkExportMetalSharedEventInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.EXPORT_METAL_SHARED_EVENT_INFO_EXT);
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

    public @Nullable VkSemaphore semaphore() {
        MemorySegment s = segment.asSlice(OFFSET$semaphore, SIZE$semaphore);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkSemaphore(s);
    }

    public void semaphore(@Nullable VkSemaphore value) {
        segment.set(LAYOUT$semaphore, OFFSET$semaphore, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @Nullable VkEvent event() {
        MemorySegment s = segment.asSlice(OFFSET$event, SIZE$event);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkEvent(s);
    }

    public void event(@Nullable VkEvent value) {
        segment.set(LAYOUT$event, OFFSET$event, value != null ? value.segment() : MemorySegment.NULL);
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
        ValueLayout.ADDRESS.withName("semaphore"),
        ValueLayout.ADDRESS.withName("event"),
        ValueLayout.ADDRESS.withName("mtlSharedEvent")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$semaphore = PathElement.groupElement("PATH$semaphore");
    public static final PathElement PATH$event = PathElement.groupElement("PATH$event");
    public static final PathElement PATH$mtlSharedEvent = PathElement.groupElement("PATH$mtlSharedEvent");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$semaphore = (AddressLayout) LAYOUT.select(PATH$semaphore);
    public static final AddressLayout LAYOUT$event = (AddressLayout) LAYOUT.select(PATH$event);
    public static final AddressLayout LAYOUT$mtlSharedEvent = (AddressLayout) LAYOUT.select(PATH$mtlSharedEvent);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$semaphore = LAYOUT$semaphore.byteSize();
    public static final long SIZE$event = LAYOUT$event.byteSize();
    public static final long SIZE$mtlSharedEvent = LAYOUT$mtlSharedEvent.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$semaphore = LAYOUT.byteOffset(PATH$semaphore);
    public static final long OFFSET$event = LAYOUT.byteOffset(PATH$event);
    public static final long OFFSET$mtlSharedEvent = LAYOUT.byteOffset(PATH$mtlSharedEvent);
}
