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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineFragmentShadingRateEnumStateCreateInfoNV.html"><code>VkPipelineFragmentShadingRateEnumStateCreateInfoNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPipelineFragmentShadingRateEnumStateCreateInfoNV {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void const* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkFragmentShadingRateTypeNV shadingRateType; // @link substring="VkFragmentShadingRateTypeNV" target="VkFragmentShadingRateTypeNV" @link substring="shadingRateType" target="#shadingRateType"
///     VkFragmentShadingRateNV shadingRate; // @link substring="VkFragmentShadingRateNV" target="VkFragmentShadingRateNV" @link substring="shadingRate" target="#shadingRate"
///     VkFragmentShadingRateCombinerOpKHR combinerOps; // @link substring="VkFragmentShadingRateCombinerOpKHR" target="VkFragmentShadingRateCombinerOpKHR" @link substring="combinerOps" target="#combinerOps"
/// } VkPipelineFragmentShadingRateEnumStateCreateInfoNV;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_ENUM_STATE_CREATE_INFO_NV`
///
/// The {@code allocate} ({@link VkPipelineFragmentShadingRateEnumStateCreateInfoNV#allocate(Arena)}, {@link VkPipelineFragmentShadingRateEnumStateCreateInfoNV#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkPipelineFragmentShadingRateEnumStateCreateInfoNV#autoInit}
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineFragmentShadingRateEnumStateCreateInfoNV.html"><code>VkPipelineFragmentShadingRateEnumStateCreateInfoNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPipelineFragmentShadingRateEnumStateCreateInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV allocate(Arena arena) {
        VkPipelineFragmentShadingRateEnumStateCreateInfoNV ret = new VkPipelineFragmentShadingRateEnumStateCreateInfoNV(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PIPELINE_FRAGMENT_SHADING_RATE_ENUM_STATE_CREATE_INFO_NV);
        return ret;
    }

    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineFragmentShadingRateEnumStateCreateInfoNV[] ret = new VkPipelineFragmentShadingRateEnumStateCreateInfoNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineFragmentShadingRateEnumStateCreateInfoNV(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PIPELINE_FRAGMENT_SHADING_RATE_ENUM_STATE_CREATE_INFO_NV);
        }
        return ret;
    }

    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV clone(Arena arena, VkPipelineFragmentShadingRateEnumStateCreateInfoNV src) {
        VkPipelineFragmentShadingRateEnumStateCreateInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineFragmentShadingRateEnumStateCreateInfoNV[] clone(Arena arena, VkPipelineFragmentShadingRateEnumStateCreateInfoNV[] src) {
        VkPipelineFragmentShadingRateEnumStateCreateInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.PIPELINE_FRAGMENT_SHADING_RATE_ENUM_STATE_CREATE_INFO_NV);
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

    public @enumtype(VkFragmentShadingRateTypeNV.class) int shadingRateType() {
        return segment.get(LAYOUT$shadingRateType, OFFSET$shadingRateType);
    }

    public void shadingRateType(@enumtype(VkFragmentShadingRateTypeNV.class) int value) {
        segment.set(LAYOUT$shadingRateType, OFFSET$shadingRateType, value);
    }

    public @enumtype(VkFragmentShadingRateNV.class) int shadingRate() {
        return segment.get(LAYOUT$shadingRate, OFFSET$shadingRate);
    }

    public void shadingRate(@enumtype(VkFragmentShadingRateNV.class) int value) {
        segment.set(LAYOUT$shadingRate, OFFSET$shadingRate, value);
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
        ValueLayout.JAVA_INT.withName("shadingRateType"),
        ValueLayout.JAVA_INT.withName("shadingRate"),
        ValueLayout.JAVA_INT.withName("combinerOps")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$shadingRateType = PathElement.groupElement("PATH$shadingRateType");
    public static final PathElement PATH$shadingRate = PathElement.groupElement("PATH$shadingRate");
    public static final PathElement PATH$combinerOps = PathElement.groupElement("PATH$combinerOps");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shadingRateType = (OfInt) LAYOUT.select(PATH$shadingRateType);
    public static final OfInt LAYOUT$shadingRate = (OfInt) LAYOUT.select(PATH$shadingRate);
    public static final OfInt LAYOUT$combinerOps = (OfInt) LAYOUT.select(PATH$combinerOps);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shadingRateType = LAYOUT$shadingRateType.byteSize();
    public static final long SIZE$shadingRate = LAYOUT$shadingRate.byteSize();
    public static final long SIZE$combinerOps = LAYOUT$combinerOps.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shadingRateType = LAYOUT.byteOffset(PATH$shadingRateType);
    public static final long OFFSET$shadingRate = LAYOUT.byteOffset(PATH$shadingRate);
    public static final long OFFSET$combinerOps = LAYOUT.byteOffset(PATH$combinerOps);
}
