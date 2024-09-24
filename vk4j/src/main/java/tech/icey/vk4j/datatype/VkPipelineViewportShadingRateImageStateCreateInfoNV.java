package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotations.*;
import tech.icey.vk4j.array.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.ptr.*;
import tech.icey.vk4j.NativeLayout;
import tech.icey.vk4j.IFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPipelineViewportShadingRateImageStateCreateInfoNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shadingRateImageEnable"),
        ValueLayout.JAVA_INT.withName("viewportCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkShadingRatePaletteNV.LAYOUT).withName("pShadingRatePalettes")
    );

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
    
    public @nullable VkShadingRatePaletteNV pShadingRatePalettes() {
        MemorySegment s = pShadingRatePalettesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkShadingRatePaletteNV(s);
    }

    public void pShadingRatePalettes(@nullable VkShadingRatePaletteNV value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pShadingRatePalettesRaw(s);
    }


    public static final class VkPipelineViewportShadingRateImageStateCreateInfoNVFactory implements IFactory<VkPipelineViewportShadingRateImageStateCreateInfoNV> {
        @Override
        public Class<VkPipelineViewportShadingRateImageStateCreateInfoNV> clazz() {
            return VkPipelineViewportShadingRateImageStateCreateInfoNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPipelineViewportShadingRateImageStateCreateInfoNV.LAYOUT;
        }

        @Override
        public VkPipelineViewportShadingRateImageStateCreateInfoNV create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPipelineViewportShadingRateImageStateCreateInfoNV createUninit(MemorySegment segment) {
            return new VkPipelineViewportShadingRateImageStateCreateInfoNV(segment);
        }
    }

    public static final VkPipelineViewportShadingRateImageStateCreateInfoNVFactory FACTORY = new VkPipelineViewportShadingRateImageStateCreateInfoNVFactory();
}
