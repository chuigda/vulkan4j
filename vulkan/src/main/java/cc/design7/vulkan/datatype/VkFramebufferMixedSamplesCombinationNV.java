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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkFramebufferMixedSamplesCombinationNV.html"><code>VkFramebufferMixedSamplesCombinationNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkFramebufferMixedSamplesCombinationNV {
///     VkStructureType sType;
///     void* pNext; // optional
///     VkCoverageReductionModeNV coverageReductionMode;
///     VkSampleCountFlags rasterizationSamples;
///     VkSampleCountFlags depthStencilSamples;
///     VkSampleCountFlags colorSamples;
/// } VkFramebufferMixedSamplesCombinationNV;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_FRAMEBUFFER_MIXED_SAMPLES_COMBINATION_NV`
///
/// The {@link VkFramebufferMixedSamplesCombinationNV#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkFramebufferMixedSamplesCombinationNV#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkFramebufferMixedSamplesCombinationNV.html"><code>VkFramebufferMixedSamplesCombinationNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkFramebufferMixedSamplesCombinationNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkFramebufferMixedSamplesCombinationNV allocate(Arena arena) {
        VkFramebufferMixedSamplesCombinationNV ret = new VkFramebufferMixedSamplesCombinationNV(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.FRAMEBUFFER_MIXED_SAMPLES_COMBINATION_NV);
        return ret;
    }

    public static VkFramebufferMixedSamplesCombinationNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkFramebufferMixedSamplesCombinationNV[] ret = new VkFramebufferMixedSamplesCombinationNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkFramebufferMixedSamplesCombinationNV(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.FRAMEBUFFER_MIXED_SAMPLES_COMBINATION_NV);
        }
        return ret;
    }

    public static VkFramebufferMixedSamplesCombinationNV clone(Arena arena, VkFramebufferMixedSamplesCombinationNV src) {
        VkFramebufferMixedSamplesCombinationNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkFramebufferMixedSamplesCombinationNV[] clone(Arena arena, VkFramebufferMixedSamplesCombinationNV[] src) {
        VkFramebufferMixedSamplesCombinationNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.FRAMEBUFFER_MIXED_SAMPLES_COMBINATION_NV);
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

    public @enumtype(VkCoverageReductionModeNV.class) int coverageReductionMode() {
        return segment.get(LAYOUT$coverageReductionMode, OFFSET$coverageReductionMode);
    }

    public void coverageReductionMode(@enumtype(VkCoverageReductionModeNV.class) int value) {
        segment.set(LAYOUT$coverageReductionMode, OFFSET$coverageReductionMode, value);
    }

    public @enumtype(VkSampleCountFlags.class) int rasterizationSamples() {
        return segment.get(LAYOUT$rasterizationSamples, OFFSET$rasterizationSamples);
    }

    public void rasterizationSamples(@enumtype(VkSampleCountFlags.class) int value) {
        segment.set(LAYOUT$rasterizationSamples, OFFSET$rasterizationSamples, value);
    }

    public @enumtype(VkSampleCountFlags.class) int depthStencilSamples() {
        return segment.get(LAYOUT$depthStencilSamples, OFFSET$depthStencilSamples);
    }

    public void depthStencilSamples(@enumtype(VkSampleCountFlags.class) int value) {
        segment.set(LAYOUT$depthStencilSamples, OFFSET$depthStencilSamples, value);
    }

    public @enumtype(VkSampleCountFlags.class) int colorSamples() {
        return segment.get(LAYOUT$colorSamples, OFFSET$colorSamples);
    }

    public void colorSamples(@enumtype(VkSampleCountFlags.class) int value) {
        segment.set(LAYOUT$colorSamples, OFFSET$colorSamples, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("coverageReductionMode"),
        ValueLayout.JAVA_INT.withName("rasterizationSamples"),
        ValueLayout.JAVA_INT.withName("depthStencilSamples"),
        ValueLayout.JAVA_INT.withName("colorSamples")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$coverageReductionMode = PathElement.groupElement("PATH$coverageReductionMode");
    public static final PathElement PATH$rasterizationSamples = PathElement.groupElement("PATH$rasterizationSamples");
    public static final PathElement PATH$depthStencilSamples = PathElement.groupElement("PATH$depthStencilSamples");
    public static final PathElement PATH$colorSamples = PathElement.groupElement("PATH$colorSamples");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$coverageReductionMode = (OfInt) LAYOUT.select(PATH$coverageReductionMode);
    public static final OfInt LAYOUT$rasterizationSamples = (OfInt) LAYOUT.select(PATH$rasterizationSamples);
    public static final OfInt LAYOUT$depthStencilSamples = (OfInt) LAYOUT.select(PATH$depthStencilSamples);
    public static final OfInt LAYOUT$colorSamples = (OfInt) LAYOUT.select(PATH$colorSamples);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$coverageReductionMode = LAYOUT$coverageReductionMode.byteSize();
    public static final long SIZE$rasterizationSamples = LAYOUT$rasterizationSamples.byteSize();
    public static final long SIZE$depthStencilSamples = LAYOUT$depthStencilSamples.byteSize();
    public static final long SIZE$colorSamples = LAYOUT$colorSamples.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$coverageReductionMode = LAYOUT.byteOffset(PATH$coverageReductionMode);
    public static final long OFFSET$rasterizationSamples = LAYOUT.byteOffset(PATH$rasterizationSamples);
    public static final long OFFSET$depthStencilSamples = LAYOUT.byteOffset(PATH$depthStencilSamples);
    public static final long OFFSET$colorSamples = LAYOUT.byteOffset(PATH$colorSamples);
}
