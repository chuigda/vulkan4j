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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPerformanceMarkerInfoINTEL.html"><code>VkPerformanceMarkerInfoINTEL</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPerformanceMarkerInfoINTEL {
///     VkStructureType sType;
///     void const* pNext; // optional
///     uint64_t marker;
/// } VkPerformanceMarkerInfoINTEL;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PERFORMANCE_MARKER_INFO_INTEL`
///
/// The {@link VkPerformanceMarkerInfoINTEL#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPerformanceMarkerInfoINTEL#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPerformanceMarkerInfoINTEL.html"><code>VkPerformanceMarkerInfoINTEL</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPerformanceMarkerInfoINTEL(@NotNull MemorySegment segment) implements IPointer {
    public static VkPerformanceMarkerInfoINTEL allocate(Arena arena) {
        VkPerformanceMarkerInfoINTEL ret = new VkPerformanceMarkerInfoINTEL(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PERFORMANCE_MARKER_INFO_INTEL);
        return ret;
    }

    public static VkPerformanceMarkerInfoINTEL[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPerformanceMarkerInfoINTEL[] ret = new VkPerformanceMarkerInfoINTEL[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPerformanceMarkerInfoINTEL(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PERFORMANCE_MARKER_INFO_INTEL);
        }
        return ret;
    }

    public static VkPerformanceMarkerInfoINTEL clone(Arena arena, VkPerformanceMarkerInfoINTEL src) {
        VkPerformanceMarkerInfoINTEL ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPerformanceMarkerInfoINTEL[] clone(Arena arena, VkPerformanceMarkerInfoINTEL[] src) {
        VkPerformanceMarkerInfoINTEL[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PERFORMANCE_MARKER_INFO_INTEL);
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

    public @unsigned long marker() {
        return segment.get(LAYOUT$marker, OFFSET$marker);
    }

    public void marker(@unsigned long value) {
        segment.set(LAYOUT$marker, OFFSET$marker, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("marker")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$marker = PathElement.groupElement("PATH$marker");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfLong LAYOUT$marker = (OfLong) LAYOUT.select(PATH$marker);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$marker = LAYOUT$marker.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$marker = LAYOUT.byteOffset(PATH$marker);
}
