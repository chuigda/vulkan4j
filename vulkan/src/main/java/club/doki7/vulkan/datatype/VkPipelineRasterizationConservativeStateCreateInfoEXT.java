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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineRasterizationConservativeStateCreateInfoEXT.html"><code>VkPipelineRasterizationConservativeStateCreateInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPipelineRasterizationConservativeStateCreateInfoEXT {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkPipelineRasterizationConservativeStateCreateFlagsEXT flags; // optional // @link substring="VkPipelineRasterizationConservativeStateCreateFlagsEXT" target="VkPipelineRasterizationConservativeStateCreateFlagsEXT" @link substring="flags" target="#flags"
///     VkConservativeRasterizationModeEXT conservativeRasterizationMode; // @link substring="VkConservativeRasterizationModeEXT" target="VkConservativeRasterizationModeEXT" @link substring="conservativeRasterizationMode" target="#conservativeRasterizationMode"
///     float extraPrimitiveOverestimationSize; // @link substring="extraPrimitiveOverestimationSize" target="#extraPrimitiveOverestimationSize"
/// } VkPipelineRasterizationConservativeStateCreateInfoEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_CONSERVATIVE_STATE_CREATE_INFO_EXT`
///
/// The {@code allocate} ({@link VkPipelineRasterizationConservativeStateCreateInfoEXT#allocate(Arena)}, {@link VkPipelineRasterizationConservativeStateCreateInfoEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPipelineRasterizationConservativeStateCreateInfoEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineRasterizationConservativeStateCreateInfoEXT.html"><code>VkPipelineRasterizationConservativeStateCreateInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPipelineRasterizationConservativeStateCreateInfoEXT(@NotNull MemorySegment segment) implements IVkPipelineRasterizationConservativeStateCreateInfoEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineRasterizationConservativeStateCreateInfoEXT.html"><code>VkPipelineRasterizationConservativeStateCreateInfoEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkPipelineRasterizationConservativeStateCreateInfoEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkPipelineRasterizationConservativeStateCreateInfoEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkPipelineRasterizationConservativeStateCreateInfoEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkPipelineRasterizationConservativeStateCreateInfoEXT {
        public long size() {
            return segment.byteSize() / VkPipelineRasterizationConservativeStateCreateInfoEXT.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkPipelineRasterizationConservativeStateCreateInfoEXT at(long index) {
            return new VkPipelineRasterizationConservativeStateCreateInfoEXT(segment.asSlice(index * VkPipelineRasterizationConservativeStateCreateInfoEXT.BYTES, VkPipelineRasterizationConservativeStateCreateInfoEXT.BYTES));
        }
        public void write(long index, @NotNull VkPipelineRasterizationConservativeStateCreateInfoEXT value) {
            MemorySegment s = segment.asSlice(index * VkPipelineRasterizationConservativeStateCreateInfoEXT.BYTES, VkPipelineRasterizationConservativeStateCreateInfoEXT.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkPipelineRasterizationConservativeStateCreateInfoEXT allocate(Arena arena) {
        VkPipelineRasterizationConservativeStateCreateInfoEXT ret = new VkPipelineRasterizationConservativeStateCreateInfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PIPELINE_RASTERIZATION_CONSERVATIVE_STATE_CREATE_INFO_EXT);
        return ret;
    }

    public static VkPipelineRasterizationConservativeStateCreateInfoEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineRasterizationConservativeStateCreateInfoEXT.Ptr ret = new VkPipelineRasterizationConservativeStateCreateInfoEXT.Ptr(segment);
        for (long i = 0; i < count; i ++) {
            ret.at(i).sType(VkStructureType.PIPELINE_RASTERIZATION_CONSERVATIVE_STATE_CREATE_INFO_EXT);
        }
        return ret;
    }

    public static VkPipelineRasterizationConservativeStateCreateInfoEXT clone(Arena arena, VkPipelineRasterizationConservativeStateCreateInfoEXT src) {
        VkPipelineRasterizationConservativeStateCreateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PIPELINE_RASTERIZATION_CONSERVATIVE_STATE_CREATE_INFO_EXT);
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

    public @enumtype(VkPipelineRasterizationConservativeStateCreateFlagsEXT.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkPipelineRasterizationConservativeStateCreateFlagsEXT.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @enumtype(VkConservativeRasterizationModeEXT.class) int conservativeRasterizationMode() {
        return segment.get(LAYOUT$conservativeRasterizationMode, OFFSET$conservativeRasterizationMode);
    }

    public void conservativeRasterizationMode(@enumtype(VkConservativeRasterizationModeEXT.class) int value) {
        segment.set(LAYOUT$conservativeRasterizationMode, OFFSET$conservativeRasterizationMode, value);
    }

    public float extraPrimitiveOverestimationSize() {
        return segment.get(LAYOUT$extraPrimitiveOverestimationSize, OFFSET$extraPrimitiveOverestimationSize);
    }

    public void extraPrimitiveOverestimationSize(float value) {
        segment.set(LAYOUT$extraPrimitiveOverestimationSize, OFFSET$extraPrimitiveOverestimationSize, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("conservativeRasterizationMode"),
        ValueLayout.JAVA_FLOAT.withName("extraPrimitiveOverestimationSize")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$conservativeRasterizationMode = PathElement.groupElement("conservativeRasterizationMode");
    public static final PathElement PATH$extraPrimitiveOverestimationSize = PathElement.groupElement("extraPrimitiveOverestimationSize");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$conservativeRasterizationMode = (OfInt) LAYOUT.select(PATH$conservativeRasterizationMode);
    public static final OfFloat LAYOUT$extraPrimitiveOverestimationSize = (OfFloat) LAYOUT.select(PATH$extraPrimitiveOverestimationSize);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$conservativeRasterizationMode = LAYOUT$conservativeRasterizationMode.byteSize();
    public static final long SIZE$extraPrimitiveOverestimationSize = LAYOUT$extraPrimitiveOverestimationSize.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$conservativeRasterizationMode = LAYOUT.byteOffset(PATH$conservativeRasterizationMode);
    public static final long OFFSET$extraPrimitiveOverestimationSize = LAYOUT.byteOffset(PATH$extraPrimitiveOverestimationSize);
}
