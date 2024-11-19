package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkPipelineViewportShadingRateImageStateCreateInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkBool32 shadingRateImageEnable;
///     uint32_t viewportCount;
///     const VkShadingRatePaletteNV* pShadingRatePalettes;
/// } VkPipelineViewportShadingRateImageStateCreateInfoNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPipelineViewportShadingRateImageStateCreateInfoNV.html">VkPipelineViewportShadingRateImageStateCreateInfoNV</a>
public record VkPipelineViewportShadingRateImageStateCreateInfoNV(MemorySegment segment) implements IPointer {
    public VkPipelineViewportShadingRateImageStateCreateInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_VIEWPORT_SHADING_RATE_IMAGE_STATE_CREATE_INFO_NV);
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
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
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

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @Nullable VkShadingRatePaletteNV[] pShadingRatePalettes(int assumedCount) {
        MemorySegment s = pShadingRatePalettesRaw().reinterpret(assumedCount * VkShadingRatePaletteNV.SIZE);
        VkShadingRatePaletteNV[] arr = new VkShadingRatePaletteNV[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkShadingRatePaletteNV(s.asSlice(i * VkShadingRatePaletteNV.SIZE, VkShadingRatePaletteNV.SIZE));
        }
        return arr;
    }

    public void pShadingRatePalettes(@Nullable VkShadingRatePaletteNV value) {
        pShadingRatePalettesRaw(value == null ? MemorySegment.NULL : value.segment());
    }

    public static VkPipelineViewportShadingRateImageStateCreateInfoNV allocate(Arena arena) {
        return new VkPipelineViewportShadingRateImageStateCreateInfoNV(arena.allocate(LAYOUT));
    }

    public static VkPipelineViewportShadingRateImageStateCreateInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineViewportShadingRateImageStateCreateInfoNV[] ret = new VkPipelineViewportShadingRateImageStateCreateInfoNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPipelineViewportShadingRateImageStateCreateInfoNV(segment.asSlice(i * SIZE, SIZE));
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shadingRateImageEnable"),
        ValueLayout.JAVA_INT.withName("viewportCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkShadingRatePaletteNV.LAYOUT).withName("pShadingRatePalettes")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$shadingRateImageEnable = PathElement.groupElement("shadingRateImageEnable");
    public static final PathElement PATH$viewportCount = PathElement.groupElement("viewportCount");
    public static final PathElement PATH$pShadingRatePalettes = PathElement.groupElement("pShadingRatePalettes");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shadingRateImageEnable = (OfInt) LAYOUT.select(PATH$shadingRateImageEnable);
    public static final OfInt LAYOUT$viewportCount = (OfInt) LAYOUT.select(PATH$viewportCount);
    public static final AddressLayout LAYOUT$pShadingRatePalettes = (AddressLayout) LAYOUT.select(PATH$pShadingRatePalettes);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shadingRateImageEnable = LAYOUT.byteOffset(PATH$shadingRateImageEnable);
    public static final long OFFSET$viewportCount = LAYOUT.byteOffset(PATH$viewportCount);
    public static final long OFFSET$pShadingRatePalettes = LAYOUT.byteOffset(PATH$pShadingRatePalettes);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shadingRateImageEnable = LAYOUT$shadingRateImageEnable.byteSize();
    public static final long SIZE$viewportCount = LAYOUT$viewportCount.byteSize();
    public static final long SIZE$pShadingRatePalettes = LAYOUT$pShadingRatePalettes.byteSize();
}
