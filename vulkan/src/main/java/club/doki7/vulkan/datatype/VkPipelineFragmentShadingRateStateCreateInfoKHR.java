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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineFragmentShadingRateStateCreateInfoKHR.html"><code>VkPipelineFragmentShadingRateStateCreateInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPipelineFragmentShadingRateStateCreateInfoKHR {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkExtent2D fragmentSize; // @link substring="VkExtent2D" target="VkExtent2D" @link substring="fragmentSize" target="#fragmentSize"
///     VkFragmentShadingRateCombinerOpKHR combinerOps; // @link substring="VkFragmentShadingRateCombinerOpKHR" target="VkFragmentShadingRateCombinerOpKHR" @link substring="combinerOps" target="#combinerOps"
/// } VkPipelineFragmentShadingRateStateCreateInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_STATE_CREATE_INFO_KHR`
///
/// The {@code allocate} ({@link VkPipelineFragmentShadingRateStateCreateInfoKHR#allocate(Arena)}, {@link VkPipelineFragmentShadingRateStateCreateInfoKHR#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPipelineFragmentShadingRateStateCreateInfoKHR#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineFragmentShadingRateStateCreateInfoKHR.html"><code>VkPipelineFragmentShadingRateStateCreateInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPipelineFragmentShadingRateStateCreateInfoKHR(@NotNull MemorySegment segment) implements IVkPipelineFragmentShadingRateStateCreateInfoKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineFragmentShadingRateStateCreateInfoKHR.html"><code>VkPipelineFragmentShadingRateStateCreateInfoKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkPipelineFragmentShadingRateStateCreateInfoKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkPipelineFragmentShadingRateStateCreateInfoKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkPipelineFragmentShadingRateStateCreateInfoKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkPipelineFragmentShadingRateStateCreateInfoKHR {
        public long size() {
            return segment.byteSize() / VkPipelineFragmentShadingRateStateCreateInfoKHR.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkPipelineFragmentShadingRateStateCreateInfoKHR at(long index) {
            return new VkPipelineFragmentShadingRateStateCreateInfoKHR(segment.asSlice(index * VkPipelineFragmentShadingRateStateCreateInfoKHR.BYTES, VkPipelineFragmentShadingRateStateCreateInfoKHR.BYTES));
        }
        public void write(long index, @NotNull VkPipelineFragmentShadingRateStateCreateInfoKHR value) {
            MemorySegment s = segment.asSlice(index * VkPipelineFragmentShadingRateStateCreateInfoKHR.BYTES, VkPipelineFragmentShadingRateStateCreateInfoKHR.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkPipelineFragmentShadingRateStateCreateInfoKHR allocate(Arena arena) {
        VkPipelineFragmentShadingRateStateCreateInfoKHR ret = new VkPipelineFragmentShadingRateStateCreateInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PIPELINE_FRAGMENT_SHADING_RATE_STATE_CREATE_INFO_KHR);
        return ret;
    }

    public static VkPipelineFragmentShadingRateStateCreateInfoKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineFragmentShadingRateStateCreateInfoKHR.Ptr ret = new VkPipelineFragmentShadingRateStateCreateInfoKHR.Ptr(segment);
        for (long i = 0; i < count; i ++) {
            ret.at(i).sType(VkStructureType.PIPELINE_FRAGMENT_SHADING_RATE_STATE_CREATE_INFO_KHR);
        }
        return ret;
    }

    public static VkPipelineFragmentShadingRateStateCreateInfoKHR clone(Arena arena, VkPipelineFragmentShadingRateStateCreateInfoKHR src) {
        VkPipelineFragmentShadingRateStateCreateInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PIPELINE_FRAGMENT_SHADING_RATE_STATE_CREATE_INFO_KHR);
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

    public @NotNull VkExtent2D fragmentSize() {
        return new VkExtent2D(segment.asSlice(OFFSET$fragmentSize, LAYOUT$fragmentSize));
    }

    public void fragmentSize(@NotNull VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$fragmentSize, SIZE$fragmentSize);
    }

    public @enumtype(VkFragmentShadingRateCombinerOpKHR.class) int combinerOps() {
        return segment.get(LAYOUT$combinerOps, OFFSET$combinerOps);
    }

    public void combinerOps(@enumtype(VkFragmentShadingRateCombinerOpKHR.class) int value) {
        segment.set(LAYOUT$combinerOps, OFFSET$combinerOps, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkExtent2D.LAYOUT.withName("fragmentSize"),
        ValueLayout.JAVA_INT.withName("combinerOps")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$fragmentSize = PathElement.groupElement("fragmentSize");
    public static final PathElement PATH$combinerOps = PathElement.groupElement("combinerOps");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$fragmentSize = (StructLayout) LAYOUT.select(PATH$fragmentSize);
    public static final OfInt LAYOUT$combinerOps = (OfInt) LAYOUT.select(PATH$combinerOps);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$fragmentSize = LAYOUT$fragmentSize.byteSize();
    public static final long SIZE$combinerOps = LAYOUT$combinerOps.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$fragmentSize = LAYOUT.byteOffset(PATH$fragmentSize);
    public static final long OFFSET$combinerOps = LAYOUT.byteOffset(PATH$combinerOps);
}
