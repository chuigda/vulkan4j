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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineViewportDepthClampControlCreateInfoEXT.html"><code>VkPipelineViewportDepthClampControlCreateInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPipelineViewportDepthClampControlCreateInfoEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkDepthClampModeEXT depthClampMode; // @link substring="VkDepthClampModeEXT" target="VkDepthClampModeEXT" @link substring="depthClampMode" target="#depthClampMode"
///     VkDepthClampRangeEXT const* pDepthClampRange; // optional // @link substring="VkDepthClampRangeEXT" target="VkDepthClampRangeEXT" @link substring="pDepthClampRange" target="#pDepthClampRange"
/// } VkPipelineViewportDepthClampControlCreateInfoEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_DEPTH_CLAMP_CONTROL_CREATE_INFO_EXT`
///
/// The {@code allocate} ({@link VkPipelineViewportDepthClampControlCreateInfoEXT#allocate(Arena)}, {@link VkPipelineViewportDepthClampControlCreateInfoEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPipelineViewportDepthClampControlCreateInfoEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineViewportDepthClampControlCreateInfoEXT.html"><code>VkPipelineViewportDepthClampControlCreateInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPipelineViewportDepthClampControlCreateInfoEXT(@NotNull MemorySegment segment) implements IVkPipelineViewportDepthClampControlCreateInfoEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineViewportDepthClampControlCreateInfoEXT.html"><code>VkPipelineViewportDepthClampControlCreateInfoEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkPipelineViewportDepthClampControlCreateInfoEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkPipelineViewportDepthClampControlCreateInfoEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkPipelineViewportDepthClampControlCreateInfoEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkPipelineViewportDepthClampControlCreateInfoEXT {
        public long size() {
            return segment.byteSize() / VkPipelineViewportDepthClampControlCreateInfoEXT.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkPipelineViewportDepthClampControlCreateInfoEXT at(long index) {
            return new VkPipelineViewportDepthClampControlCreateInfoEXT(segment.asSlice(index * VkPipelineViewportDepthClampControlCreateInfoEXT.BYTES, VkPipelineViewportDepthClampControlCreateInfoEXT.BYTES));
        }
        public void write(long index, @NotNull VkPipelineViewportDepthClampControlCreateInfoEXT value) {
            MemorySegment s = segment.asSlice(index * VkPipelineViewportDepthClampControlCreateInfoEXT.BYTES, VkPipelineViewportDepthClampControlCreateInfoEXT.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkPipelineViewportDepthClampControlCreateInfoEXT allocate(Arena arena) {
        VkPipelineViewportDepthClampControlCreateInfoEXT ret = new VkPipelineViewportDepthClampControlCreateInfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PIPELINE_VIEWPORT_DEPTH_CLAMP_CONTROL_CREATE_INFO_EXT);
        return ret;
    }

    public static VkPipelineViewportDepthClampControlCreateInfoEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineViewportDepthClampControlCreateInfoEXT.Ptr ret = new VkPipelineViewportDepthClampControlCreateInfoEXT.Ptr(segment);
        for (long i = 0; i < count; i ++) {
            ret.at(i).sType(VkStructureType.PIPELINE_VIEWPORT_DEPTH_CLAMP_CONTROL_CREATE_INFO_EXT);
        }
        return ret;
    }

    public static VkPipelineViewportDepthClampControlCreateInfoEXT clone(Arena arena, VkPipelineViewportDepthClampControlCreateInfoEXT src) {
        VkPipelineViewportDepthClampControlCreateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PIPELINE_VIEWPORT_DEPTH_CLAMP_CONTROL_CREATE_INFO_EXT);
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

    public @enumtype(VkDepthClampModeEXT.class) int depthClampMode() {
        return segment.get(LAYOUT$depthClampMode, OFFSET$depthClampMode);
    }

    public void depthClampMode(@enumtype(VkDepthClampModeEXT.class) int value) {
        segment.set(LAYOUT$depthClampMode, OFFSET$depthClampMode, value);
    }

    public @Nullable VkDepthClampRangeEXT pDepthClampRange() {
        MemorySegment s = pDepthClampRangeRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new VkDepthClampRangeEXT(s);
    }

    public void pDepthClampRange(@Nullable VkDepthClampRangeEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDepthClampRangeRaw(s);
    }

    @unsafe public @Nullable VkDepthClampRangeEXT[] pDepthClampRange(int assumedCount) {
        MemorySegment s = pDepthClampRangeRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkDepthClampRangeEXT.BYTES);
        VkDepthClampRangeEXT[] ret = new VkDepthClampRangeEXT[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkDepthClampRangeEXT(s.asSlice(i * VkDepthClampRangeEXT.BYTES, VkDepthClampRangeEXT.BYTES));
        }
        return ret;
    }

    public @pointer(target=VkDepthClampRangeEXT.class) MemorySegment pDepthClampRangeRaw() {
        return segment.get(LAYOUT$pDepthClampRange, OFFSET$pDepthClampRange);
    }

    public void pDepthClampRangeRaw(@pointer(target=VkDepthClampRangeEXT.class) MemorySegment value) {
        segment.set(LAYOUT$pDepthClampRange, OFFSET$pDepthClampRange, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("depthClampMode"),
        ValueLayout.ADDRESS.withTargetLayout(VkDepthClampRangeEXT.LAYOUT).withName("pDepthClampRange")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$depthClampMode = PathElement.groupElement("depthClampMode");
    public static final PathElement PATH$pDepthClampRange = PathElement.groupElement("pDepthClampRange");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$depthClampMode = (OfInt) LAYOUT.select(PATH$depthClampMode);
    public static final AddressLayout LAYOUT$pDepthClampRange = (AddressLayout) LAYOUT.select(PATH$pDepthClampRange);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$depthClampMode = LAYOUT$depthClampMode.byteSize();
    public static final long SIZE$pDepthClampRange = LAYOUT$pDepthClampRange.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$depthClampMode = LAYOUT.byteOffset(PATH$depthClampMode);
    public static final long OFFSET$pDepthClampRange = LAYOUT.byteOffset(PATH$pDepthClampRange);
}
