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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkQueryLowLatencySupportNV.html"><code>VkQueryLowLatencySupportNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkQueryLowLatencySupportNV {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     void* pQueriedLowLatencyData; // @link substring="pQueriedLowLatencyData" target="#pQueriedLowLatencyData"
/// } VkQueryLowLatencySupportNV;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_QUERY_LOW_LATENCY_SUPPORT_NV`
///
/// The {@code allocate} ({@link VkQueryLowLatencySupportNV#allocate(Arena)}, {@link VkQueryLowLatencySupportNV#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkQueryLowLatencySupportNV#autoInit}
/// to initialize these fields manually for non-allocated instances.
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkQueryLowLatencySupportNV.html"><code>VkQueryLowLatencySupportNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkQueryLowLatencySupportNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkQueryLowLatencySupportNV allocate(Arena arena) {
        VkQueryLowLatencySupportNV ret = new VkQueryLowLatencySupportNV(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.QUERY_LOW_LATENCY_SUPPORT_NV);
        return ret;
    }

    public static VkQueryLowLatencySupportNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkQueryLowLatencySupportNV[] ret = new VkQueryLowLatencySupportNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkQueryLowLatencySupportNV(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.QUERY_LOW_LATENCY_SUPPORT_NV);
        }
        return ret;
    }

    public static VkQueryLowLatencySupportNV clone(Arena arena, VkQueryLowLatencySupportNV src) {
        VkQueryLowLatencySupportNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkQueryLowLatencySupportNV[] clone(Arena arena, VkQueryLowLatencySupportNV[] src) {
        VkQueryLowLatencySupportNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.QUERY_LOW_LATENCY_SUPPORT_NV);
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

    public @pointer(comment="void*") MemorySegment pQueriedLowLatencyData() {
        return segment.get(LAYOUT$pQueriedLowLatencyData, OFFSET$pQueriedLowLatencyData);
    }

    public void pQueriedLowLatencyData(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pQueriedLowLatencyData, OFFSET$pQueriedLowLatencyData, value);
    }

    public void pQueriedLowLatencyData(@Nullable IPointer pointer) {
        pQueriedLowLatencyData(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pQueriedLowLatencyData")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$pQueriedLowLatencyData = PathElement.groupElement("PATH$pQueriedLowLatencyData");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pQueriedLowLatencyData = (AddressLayout) LAYOUT.select(PATH$pQueriedLowLatencyData);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pQueriedLowLatencyData = LAYOUT$pQueriedLowLatencyData.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pQueriedLowLatencyData = LAYOUT.byteOffset(PATH$pQueriedLowLatencyData);
}
