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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPerformanceStreamMarkerInfoINTEL.html"><code>VkPerformanceStreamMarkerInfoINTEL</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPerformanceStreamMarkerInfoINTEL {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     uint32_t marker; // @link substring="marker" target="#marker"
/// } VkPerformanceStreamMarkerInfoINTEL;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PERFORMANCE_STREAM_MARKER_INFO_INTEL`
///
/// The {@code allocate} ({@link VkPerformanceStreamMarkerInfoINTEL#allocate(Arena)}, {@link VkPerformanceStreamMarkerInfoINTEL#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPerformanceStreamMarkerInfoINTEL#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPerformanceStreamMarkerInfoINTEL.html"><code>VkPerformanceStreamMarkerInfoINTEL</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPerformanceStreamMarkerInfoINTEL(@NotNull MemorySegment segment) implements IVkPerformanceStreamMarkerInfoINTEL {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPerformanceStreamMarkerInfoINTEL.html"><code>VkPerformanceStreamMarkerInfoINTEL</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkPerformanceStreamMarkerInfoINTEL}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkPerformanceStreamMarkerInfoINTEL to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkPerformanceStreamMarkerInfoINTEL.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkPerformanceStreamMarkerInfoINTEL {
        public long size() {
            return segment.byteSize() / VkPerformanceStreamMarkerInfoINTEL.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkPerformanceStreamMarkerInfoINTEL at(long index) {
            return new VkPerformanceStreamMarkerInfoINTEL(segment.asSlice(index * VkPerformanceStreamMarkerInfoINTEL.BYTES, VkPerformanceStreamMarkerInfoINTEL.BYTES));
        }
        public void write(long index, @NotNull VkPerformanceStreamMarkerInfoINTEL value) {
            MemorySegment s = segment.asSlice(index * VkPerformanceStreamMarkerInfoINTEL.BYTES, VkPerformanceStreamMarkerInfoINTEL.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkPerformanceStreamMarkerInfoINTEL allocate(Arena arena) {
        VkPerformanceStreamMarkerInfoINTEL ret = new VkPerformanceStreamMarkerInfoINTEL(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PERFORMANCE_STREAM_MARKER_INFO_INTEL);
        return ret;
    }

    public static VkPerformanceStreamMarkerInfoINTEL.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPerformanceStreamMarkerInfoINTEL.Ptr ret = new VkPerformanceStreamMarkerInfoINTEL.Ptr(segment);
        for (long i = 0; i < count; i ++) {
            ret.at(i).sType(VkStructureType.PERFORMANCE_STREAM_MARKER_INFO_INTEL);
        }
        return ret;
    }

    public static VkPerformanceStreamMarkerInfoINTEL clone(Arena arena, VkPerformanceStreamMarkerInfoINTEL src) {
        VkPerformanceStreamMarkerInfoINTEL ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PERFORMANCE_STREAM_MARKER_INFO_INTEL);
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

    public @unsigned int marker() {
        return segment.get(LAYOUT$marker, OFFSET$marker);
    }

    public void marker(@unsigned int value) {
        segment.set(LAYOUT$marker, OFFSET$marker, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("marker")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$marker = PathElement.groupElement("marker");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$marker = (OfInt) LAYOUT.select(PATH$marker);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$marker = LAYOUT$marker.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$marker = LAYOUT.byteOffset(PATH$marker);
}
