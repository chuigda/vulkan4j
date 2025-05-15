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

/// Represents a pointer to a {@code VkPipelineViewportShadingRateImageStateCreateInfoNV} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineViewportShadingRateImageStateCreateInfoNV.html">VkPipelineViewportShadingRateImageStateCreateInfoNV</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkPipelineViewportShadingRateImageStateCreateInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public VkPipelineViewportShadingRateImageStateCreateInfoNV {
        sType(VkStructureType.PIPELINE_VIEWPORT_SHADING_RATE_IMAGE_STATE_CREATE_INFO_NV);
    }

    public static VkPipelineViewportShadingRateImageStateCreateInfoNV allocate(Arena arena) {
        return new VkPipelineViewportShadingRateImageStateCreateInfoNV(arena.allocate(LAYOUT));
    }

    public static VkPipelineViewportShadingRateImageStateCreateInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineViewportShadingRateImageStateCreateInfoNV[] ret = new VkPipelineViewportShadingRateImageStateCreateInfoNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineViewportShadingRateImageStateCreateInfoNV(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkPipelineViewportShadingRateImageStateCreateInfoNV clone(Arena arena, VkPipelineViewportShadingRateImageStateCreateInfoNV src) {
        VkPipelineViewportShadingRateImageStateCreateInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineViewportShadingRateImageStateCreateInfoNV[] clone(Arena arena, VkPipelineViewportShadingRateImageStateCreateInfoNV[] src) {
        VkPipelineViewportShadingRateImageStateCreateInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shadingRateImageEnable"),
        ValueLayout.JAVA_INT.withName("viewportCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkShadingRatePaletteNV.LAYOUT).withName("pShadingRatePalettes")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$shadingRateImageEnable = PathElement.groupElement("PATH$shadingRateImageEnable");
    public static final PathElement PATH$viewportCount = PathElement.groupElement("PATH$viewportCount");
    public static final PathElement PATH$pShadingRatePalettes = PathElement.groupElement("PATH$pShadingRatePalettes");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shadingRateImageEnable = (OfInt) LAYOUT.select(PATH$shadingRateImageEnable);
    public static final OfInt LAYOUT$viewportCount = (OfInt) LAYOUT.select(PATH$viewportCount);
    public static final AddressLayout LAYOUT$pShadingRatePalettes = (AddressLayout) LAYOUT.select(PATH$pShadingRatePalettes);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shadingRateImageEnable = LAYOUT$shadingRateImageEnable.byteSize();
    public static final long SIZE$viewportCount = LAYOUT$viewportCount.byteSize();
    public static final long SIZE$pShadingRatePalettes = LAYOUT$pShadingRatePalettes.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shadingRateImageEnable = LAYOUT.byteOffset(PATH$shadingRateImageEnable);
    public static final long OFFSET$viewportCount = LAYOUT.byteOffset(PATH$viewportCount);
    public static final long OFFSET$pShadingRatePalettes = LAYOUT.byteOffset(PATH$pShadingRatePalettes);

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

    public @unsigned int shadingRateImageEnable() {
        return segment.get(LAYOUT$shadingRateImageEnable, OFFSET$shadingRateImageEnable);
    }

    public void shadingRateImageEnable(@unsigned int value) {
        segment.set(LAYOUT$shadingRateImageEnable, OFFSET$shadingRateImageEnable, value);
    }

    public @unsigned int viewportCount() {
        return segment.get(LAYOUT$viewportCount, OFFSET$viewportCount);
    }

    public void viewportCount(@unsigned int value) {
        segment.set(LAYOUT$viewportCount, OFFSET$viewportCount, value);
    }

    public @pointer(comment="VkShadingRatePaletteNV*") MemorySegment pShadingRatePalettesRaw() {
        return segment.get(LAYOUT$pShadingRatePalettes, OFFSET$pShadingRatePalettes);
    }

    public void pShadingRatePalettesRaw(@pointer(comment="VkShadingRatePaletteNV*") MemorySegment value) {
        segment.set(LAYOUT$pShadingRatePalettes, OFFSET$pShadingRatePalettes, value);
    }

    public @Nullable VkShadingRatePaletteNV pShadingRatePalettes() {
        MemorySegment s = pShadingRatePalettesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkShadingRatePaletteNV(s);
    }

    public void pShadingRatePalettes(@Nullable VkShadingRatePaletteNV value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pShadingRatePalettesRaw(s);
    }

    @unsafe public @Nullable VkShadingRatePaletteNV[] pShadingRatePalettes(int assumedCount) {
        MemorySegment s = pShadingRatePalettesRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkShadingRatePaletteNV.SIZE);
        VkShadingRatePaletteNV[] ret = new VkShadingRatePaletteNV[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkShadingRatePaletteNV(s.asSlice(i * VkShadingRatePaletteNV.SIZE, VkShadingRatePaletteNV.SIZE));
        }
        return ret;
    }

}
