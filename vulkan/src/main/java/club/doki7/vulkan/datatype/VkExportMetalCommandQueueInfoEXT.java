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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkExportMetalCommandQueueInfoEXT.html"><code>VkExportMetalCommandQueueInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkExportMetalCommandQueueInfoEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkQueue queue; // @link substring="VkQueue" target="VkQueue" @link substring="queue" target="#queue"
///     MTLCommandQueue_id mtlCommandQueue; // @link substring="mtlCommandQueue" target="#mtlCommandQueue"
/// } VkExportMetalCommandQueueInfoEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_EXPORT_METAL_COMMAND_QUEUE_INFO_EXT`
///
/// The {@code allocate} ({@link VkExportMetalCommandQueueInfoEXT#allocate(Arena)}, {@link VkExportMetalCommandQueueInfoEXT#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkExportMetalCommandQueueInfoEXT#autoInit}
/// to initialize these fields manually for non-allocated instances.
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkExportMetalCommandQueueInfoEXT.html"><code>VkExportMetalCommandQueueInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkExportMetalCommandQueueInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkExportMetalCommandQueueInfoEXT allocate(Arena arena) {
        VkExportMetalCommandQueueInfoEXT ret = new VkExportMetalCommandQueueInfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.EXPORT_METAL_COMMAND_QUEUE_INFO_EXT);
        return ret;
    }

    public static VkExportMetalCommandQueueInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkExportMetalCommandQueueInfoEXT[] ret = new VkExportMetalCommandQueueInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkExportMetalCommandQueueInfoEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.EXPORT_METAL_COMMAND_QUEUE_INFO_EXT);
        }
        return ret;
    }

    public static VkExportMetalCommandQueueInfoEXT clone(Arena arena, VkExportMetalCommandQueueInfoEXT src) {
        VkExportMetalCommandQueueInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkExportMetalCommandQueueInfoEXT[] clone(Arena arena, VkExportMetalCommandQueueInfoEXT[] src) {
        VkExportMetalCommandQueueInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.EXPORT_METAL_COMMAND_QUEUE_INFO_EXT);
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

    public @Nullable VkQueue queue() {
        MemorySegment s = segment.asSlice(OFFSET$queue, SIZE$queue);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkQueue(s);
    }

    public void queue(@Nullable VkQueue value) {
        segment.set(LAYOUT$queue, OFFSET$queue, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @pointer(comment="void*") MemorySegment mtlCommandQueue() {
        return segment.get(LAYOUT$mtlCommandQueue, OFFSET$mtlCommandQueue);
    }

    public void mtlCommandQueue(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$mtlCommandQueue, OFFSET$mtlCommandQueue, value);
    }

    public void mtlCommandQueue(@Nullable IPointer pointer) {
        mtlCommandQueue(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("queue"),
        ValueLayout.ADDRESS.withName("mtlCommandQueue")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$queue = PathElement.groupElement("PATH$queue");
    public static final PathElement PATH$mtlCommandQueue = PathElement.groupElement("PATH$mtlCommandQueue");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$queue = (AddressLayout) LAYOUT.select(PATH$queue);
    public static final AddressLayout LAYOUT$mtlCommandQueue = (AddressLayout) LAYOUT.select(PATH$mtlCommandQueue);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$queue = LAYOUT$queue.byteSize();
    public static final long SIZE$mtlCommandQueue = LAYOUT$mtlCommandQueue.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$queue = LAYOUT.byteOffset(PATH$queue);
    public static final long OFFSET$mtlCommandQueue = LAYOUT.byteOffset(PATH$mtlCommandQueue);
}
