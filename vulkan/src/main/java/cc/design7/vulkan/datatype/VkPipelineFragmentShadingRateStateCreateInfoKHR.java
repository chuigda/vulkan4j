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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineFragmentShadingRateStateCreateInfoKHR.html"><code>VkPipelineFragmentShadingRateStateCreateInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkPipelineFragmentShadingRateStateCreateInfoKHR {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkExtent2D fragmentSize;
///     VkFragmentShadingRateCombinerOpKHR combinerOps;
/// } VkPipelineFragmentShadingRateStateCreateInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_PIPELINE_FRAGMENT_SHADING_RATE_STATE_CREATE_INFO_KHR`
///
/// The {@link VkPipelineFragmentShadingRateStateCreateInfoKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkPipelineFragmentShadingRateStateCreateInfoKHR#autoInit} to initialize these fields manually for
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineFragmentShadingRateStateCreateInfoKHR.html"><code>VkPipelineFragmentShadingRateStateCreateInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPipelineFragmentShadingRateStateCreateInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkPipelineFragmentShadingRateStateCreateInfoKHR allocate(Arena arena) {
        VkPipelineFragmentShadingRateStateCreateInfoKHR ret = new VkPipelineFragmentShadingRateStateCreateInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.PIPELINE_FRAGMENT_SHADING_RATE_STATE_CREATE_INFO_KHR);
        return ret;
    }

    public static VkPipelineFragmentShadingRateStateCreateInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineFragmentShadingRateStateCreateInfoKHR[] ret = new VkPipelineFragmentShadingRateStateCreateInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineFragmentShadingRateStateCreateInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.PIPELINE_FRAGMENT_SHADING_RATE_STATE_CREATE_INFO_KHR);
        }
        return ret;
    }

    public static VkPipelineFragmentShadingRateStateCreateInfoKHR clone(Arena arena, VkPipelineFragmentShadingRateStateCreateInfoKHR src) {
        VkPipelineFragmentShadingRateStateCreateInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineFragmentShadingRateStateCreateInfoKHR[] clone(Arena arena, VkPipelineFragmentShadingRateStateCreateInfoKHR[] src) {
        VkPipelineFragmentShadingRateStateCreateInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public VkExtent2D fragmentSize() {
        return new VkExtent2D(segment.asSlice(OFFSET$fragmentSize, LAYOUT$fragmentSize));
    }

    public void fragmentSize(VkExtent2D value) {
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

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$fragmentSize = PathElement.groupElement("PATH$fragmentSize");
    public static final PathElement PATH$combinerOps = PathElement.groupElement("PATH$combinerOps");

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
