package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
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

public record VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3TessellationDomainOrigin"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3DepthClampEnable"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3PolygonMode"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3RasterizationSamples"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3SampleMask"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3AlphaToCoverageEnable"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3AlphaToOneEnable"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3LogicOpEnable"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3ColorBlendEnable"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3ColorBlendEquation"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3ColorWriteMask"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3RasterizationStream"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3ConservativeRasterizationMode"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3ExtraPrimitiveOverestimationSize"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3DepthClipEnable"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3SampleLocationsEnable"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3ColorBlendAdvanced"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3ProvokingVertexMode"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3LineRasterizationMode"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3LineStippleEnable"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3DepthClipNegativeOneToOne"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3ViewportWScalingEnable"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3ViewportSwizzle"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3CoverageToColorEnable"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3CoverageToColorLocation"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3CoverageModulationMode"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3CoverageModulationTableEnable"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3CoverageModulationTable"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3CoverageReductionMode"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3RepresentativeFragmentTestEnable"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState3ShadingRateImageEnable")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$extendedDynamicState3TessellationDomainOrigin = PathElement.groupElement("extendedDynamicState3TessellationDomainOrigin");
    public static final PathElement PATH$extendedDynamicState3DepthClampEnable = PathElement.groupElement("extendedDynamicState3DepthClampEnable");
    public static final PathElement PATH$extendedDynamicState3PolygonMode = PathElement.groupElement("extendedDynamicState3PolygonMode");
    public static final PathElement PATH$extendedDynamicState3RasterizationSamples = PathElement.groupElement("extendedDynamicState3RasterizationSamples");
    public static final PathElement PATH$extendedDynamicState3SampleMask = PathElement.groupElement("extendedDynamicState3SampleMask");
    public static final PathElement PATH$extendedDynamicState3AlphaToCoverageEnable = PathElement.groupElement("extendedDynamicState3AlphaToCoverageEnable");
    public static final PathElement PATH$extendedDynamicState3AlphaToOneEnable = PathElement.groupElement("extendedDynamicState3AlphaToOneEnable");
    public static final PathElement PATH$extendedDynamicState3LogicOpEnable = PathElement.groupElement("extendedDynamicState3LogicOpEnable");
    public static final PathElement PATH$extendedDynamicState3ColorBlendEnable = PathElement.groupElement("extendedDynamicState3ColorBlendEnable");
    public static final PathElement PATH$extendedDynamicState3ColorBlendEquation = PathElement.groupElement("extendedDynamicState3ColorBlendEquation");
    public static final PathElement PATH$extendedDynamicState3ColorWriteMask = PathElement.groupElement("extendedDynamicState3ColorWriteMask");
    public static final PathElement PATH$extendedDynamicState3RasterizationStream = PathElement.groupElement("extendedDynamicState3RasterizationStream");
    public static final PathElement PATH$extendedDynamicState3ConservativeRasterizationMode = PathElement.groupElement("extendedDynamicState3ConservativeRasterizationMode");
    public static final PathElement PATH$extendedDynamicState3ExtraPrimitiveOverestimationSize = PathElement.groupElement("extendedDynamicState3ExtraPrimitiveOverestimationSize");
    public static final PathElement PATH$extendedDynamicState3DepthClipEnable = PathElement.groupElement("extendedDynamicState3DepthClipEnable");
    public static final PathElement PATH$extendedDynamicState3SampleLocationsEnable = PathElement.groupElement("extendedDynamicState3SampleLocationsEnable");
    public static final PathElement PATH$extendedDynamicState3ColorBlendAdvanced = PathElement.groupElement("extendedDynamicState3ColorBlendAdvanced");
    public static final PathElement PATH$extendedDynamicState3ProvokingVertexMode = PathElement.groupElement("extendedDynamicState3ProvokingVertexMode");
    public static final PathElement PATH$extendedDynamicState3LineRasterizationMode = PathElement.groupElement("extendedDynamicState3LineRasterizationMode");
    public static final PathElement PATH$extendedDynamicState3LineStippleEnable = PathElement.groupElement("extendedDynamicState3LineStippleEnable");
    public static final PathElement PATH$extendedDynamicState3DepthClipNegativeOneToOne = PathElement.groupElement("extendedDynamicState3DepthClipNegativeOneToOne");
    public static final PathElement PATH$extendedDynamicState3ViewportWScalingEnable = PathElement.groupElement("extendedDynamicState3ViewportWScalingEnable");
    public static final PathElement PATH$extendedDynamicState3ViewportSwizzle = PathElement.groupElement("extendedDynamicState3ViewportSwizzle");
    public static final PathElement PATH$extendedDynamicState3CoverageToColorEnable = PathElement.groupElement("extendedDynamicState3CoverageToColorEnable");
    public static final PathElement PATH$extendedDynamicState3CoverageToColorLocation = PathElement.groupElement("extendedDynamicState3CoverageToColorLocation");
    public static final PathElement PATH$extendedDynamicState3CoverageModulationMode = PathElement.groupElement("extendedDynamicState3CoverageModulationMode");
    public static final PathElement PATH$extendedDynamicState3CoverageModulationTableEnable = PathElement.groupElement("extendedDynamicState3CoverageModulationTableEnable");
    public static final PathElement PATH$extendedDynamicState3CoverageModulationTable = PathElement.groupElement("extendedDynamicState3CoverageModulationTable");
    public static final PathElement PATH$extendedDynamicState3CoverageReductionMode = PathElement.groupElement("extendedDynamicState3CoverageReductionMode");
    public static final PathElement PATH$extendedDynamicState3RepresentativeFragmentTestEnable = PathElement.groupElement("extendedDynamicState3RepresentativeFragmentTestEnable");
    public static final PathElement PATH$extendedDynamicState3ShadingRateImageEnable = PathElement.groupElement("extendedDynamicState3ShadingRateImageEnable");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$extendedDynamicState3TessellationDomainOrigin = (OfInt) LAYOUT.select(PATH$extendedDynamicState3TessellationDomainOrigin);
    public static final OfInt LAYOUT$extendedDynamicState3DepthClampEnable = (OfInt) LAYOUT.select(PATH$extendedDynamicState3DepthClampEnable);
    public static final OfInt LAYOUT$extendedDynamicState3PolygonMode = (OfInt) LAYOUT.select(PATH$extendedDynamicState3PolygonMode);
    public static final OfInt LAYOUT$extendedDynamicState3RasterizationSamples = (OfInt) LAYOUT.select(PATH$extendedDynamicState3RasterizationSamples);
    public static final OfInt LAYOUT$extendedDynamicState3SampleMask = (OfInt) LAYOUT.select(PATH$extendedDynamicState3SampleMask);
    public static final OfInt LAYOUT$extendedDynamicState3AlphaToCoverageEnable = (OfInt) LAYOUT.select(PATH$extendedDynamicState3AlphaToCoverageEnable);
    public static final OfInt LAYOUT$extendedDynamicState3AlphaToOneEnable = (OfInt) LAYOUT.select(PATH$extendedDynamicState3AlphaToOneEnable);
    public static final OfInt LAYOUT$extendedDynamicState3LogicOpEnable = (OfInt) LAYOUT.select(PATH$extendedDynamicState3LogicOpEnable);
    public static final OfInt LAYOUT$extendedDynamicState3ColorBlendEnable = (OfInt) LAYOUT.select(PATH$extendedDynamicState3ColorBlendEnable);
    public static final OfInt LAYOUT$extendedDynamicState3ColorBlendEquation = (OfInt) LAYOUT.select(PATH$extendedDynamicState3ColorBlendEquation);
    public static final OfInt LAYOUT$extendedDynamicState3ColorWriteMask = (OfInt) LAYOUT.select(PATH$extendedDynamicState3ColorWriteMask);
    public static final OfInt LAYOUT$extendedDynamicState3RasterizationStream = (OfInt) LAYOUT.select(PATH$extendedDynamicState3RasterizationStream);
    public static final OfInt LAYOUT$extendedDynamicState3ConservativeRasterizationMode = (OfInt) LAYOUT.select(PATH$extendedDynamicState3ConservativeRasterizationMode);
    public static final OfInt LAYOUT$extendedDynamicState3ExtraPrimitiveOverestimationSize = (OfInt) LAYOUT.select(PATH$extendedDynamicState3ExtraPrimitiveOverestimationSize);
    public static final OfInt LAYOUT$extendedDynamicState3DepthClipEnable = (OfInt) LAYOUT.select(PATH$extendedDynamicState3DepthClipEnable);
    public static final OfInt LAYOUT$extendedDynamicState3SampleLocationsEnable = (OfInt) LAYOUT.select(PATH$extendedDynamicState3SampleLocationsEnable);
    public static final OfInt LAYOUT$extendedDynamicState3ColorBlendAdvanced = (OfInt) LAYOUT.select(PATH$extendedDynamicState3ColorBlendAdvanced);
    public static final OfInt LAYOUT$extendedDynamicState3ProvokingVertexMode = (OfInt) LAYOUT.select(PATH$extendedDynamicState3ProvokingVertexMode);
    public static final OfInt LAYOUT$extendedDynamicState3LineRasterizationMode = (OfInt) LAYOUT.select(PATH$extendedDynamicState3LineRasterizationMode);
    public static final OfInt LAYOUT$extendedDynamicState3LineStippleEnable = (OfInt) LAYOUT.select(PATH$extendedDynamicState3LineStippleEnable);
    public static final OfInt LAYOUT$extendedDynamicState3DepthClipNegativeOneToOne = (OfInt) LAYOUT.select(PATH$extendedDynamicState3DepthClipNegativeOneToOne);
    public static final OfInt LAYOUT$extendedDynamicState3ViewportWScalingEnable = (OfInt) LAYOUT.select(PATH$extendedDynamicState3ViewportWScalingEnable);
    public static final OfInt LAYOUT$extendedDynamicState3ViewportSwizzle = (OfInt) LAYOUT.select(PATH$extendedDynamicState3ViewportSwizzle);
    public static final OfInt LAYOUT$extendedDynamicState3CoverageToColorEnable = (OfInt) LAYOUT.select(PATH$extendedDynamicState3CoverageToColorEnable);
    public static final OfInt LAYOUT$extendedDynamicState3CoverageToColorLocation = (OfInt) LAYOUT.select(PATH$extendedDynamicState3CoverageToColorLocation);
    public static final OfInt LAYOUT$extendedDynamicState3CoverageModulationMode = (OfInt) LAYOUT.select(PATH$extendedDynamicState3CoverageModulationMode);
    public static final OfInt LAYOUT$extendedDynamicState3CoverageModulationTableEnable = (OfInt) LAYOUT.select(PATH$extendedDynamicState3CoverageModulationTableEnable);
    public static final OfInt LAYOUT$extendedDynamicState3CoverageModulationTable = (OfInt) LAYOUT.select(PATH$extendedDynamicState3CoverageModulationTable);
    public static final OfInt LAYOUT$extendedDynamicState3CoverageReductionMode = (OfInt) LAYOUT.select(PATH$extendedDynamicState3CoverageReductionMode);
    public static final OfInt LAYOUT$extendedDynamicState3RepresentativeFragmentTestEnable = (OfInt) LAYOUT.select(PATH$extendedDynamicState3RepresentativeFragmentTestEnable);
    public static final OfInt LAYOUT$extendedDynamicState3ShadingRateImageEnable = (OfInt) LAYOUT.select(PATH$extendedDynamicState3ShadingRateImageEnable);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$extendedDynamicState3TessellationDomainOrigin = LAYOUT.byteOffset(PATH$extendedDynamicState3TessellationDomainOrigin);
    public static final long OFFSET$extendedDynamicState3DepthClampEnable = LAYOUT.byteOffset(PATH$extendedDynamicState3DepthClampEnable);
    public static final long OFFSET$extendedDynamicState3PolygonMode = LAYOUT.byteOffset(PATH$extendedDynamicState3PolygonMode);
    public static final long OFFSET$extendedDynamicState3RasterizationSamples = LAYOUT.byteOffset(PATH$extendedDynamicState3RasterizationSamples);
    public static final long OFFSET$extendedDynamicState3SampleMask = LAYOUT.byteOffset(PATH$extendedDynamicState3SampleMask);
    public static final long OFFSET$extendedDynamicState3AlphaToCoverageEnable = LAYOUT.byteOffset(PATH$extendedDynamicState3AlphaToCoverageEnable);
    public static final long OFFSET$extendedDynamicState3AlphaToOneEnable = LAYOUT.byteOffset(PATH$extendedDynamicState3AlphaToOneEnable);
    public static final long OFFSET$extendedDynamicState3LogicOpEnable = LAYOUT.byteOffset(PATH$extendedDynamicState3LogicOpEnable);
    public static final long OFFSET$extendedDynamicState3ColorBlendEnable = LAYOUT.byteOffset(PATH$extendedDynamicState3ColorBlendEnable);
    public static final long OFFSET$extendedDynamicState3ColorBlendEquation = LAYOUT.byteOffset(PATH$extendedDynamicState3ColorBlendEquation);
    public static final long OFFSET$extendedDynamicState3ColorWriteMask = LAYOUT.byteOffset(PATH$extendedDynamicState3ColorWriteMask);
    public static final long OFFSET$extendedDynamicState3RasterizationStream = LAYOUT.byteOffset(PATH$extendedDynamicState3RasterizationStream);
    public static final long OFFSET$extendedDynamicState3ConservativeRasterizationMode = LAYOUT.byteOffset(PATH$extendedDynamicState3ConservativeRasterizationMode);
    public static final long OFFSET$extendedDynamicState3ExtraPrimitiveOverestimationSize = LAYOUT.byteOffset(PATH$extendedDynamicState3ExtraPrimitiveOverestimationSize);
    public static final long OFFSET$extendedDynamicState3DepthClipEnable = LAYOUT.byteOffset(PATH$extendedDynamicState3DepthClipEnable);
    public static final long OFFSET$extendedDynamicState3SampleLocationsEnable = LAYOUT.byteOffset(PATH$extendedDynamicState3SampleLocationsEnable);
    public static final long OFFSET$extendedDynamicState3ColorBlendAdvanced = LAYOUT.byteOffset(PATH$extendedDynamicState3ColorBlendAdvanced);
    public static final long OFFSET$extendedDynamicState3ProvokingVertexMode = LAYOUT.byteOffset(PATH$extendedDynamicState3ProvokingVertexMode);
    public static final long OFFSET$extendedDynamicState3LineRasterizationMode = LAYOUT.byteOffset(PATH$extendedDynamicState3LineRasterizationMode);
    public static final long OFFSET$extendedDynamicState3LineStippleEnable = LAYOUT.byteOffset(PATH$extendedDynamicState3LineStippleEnable);
    public static final long OFFSET$extendedDynamicState3DepthClipNegativeOneToOne = LAYOUT.byteOffset(PATH$extendedDynamicState3DepthClipNegativeOneToOne);
    public static final long OFFSET$extendedDynamicState3ViewportWScalingEnable = LAYOUT.byteOffset(PATH$extendedDynamicState3ViewportWScalingEnable);
    public static final long OFFSET$extendedDynamicState3ViewportSwizzle = LAYOUT.byteOffset(PATH$extendedDynamicState3ViewportSwizzle);
    public static final long OFFSET$extendedDynamicState3CoverageToColorEnable = LAYOUT.byteOffset(PATH$extendedDynamicState3CoverageToColorEnable);
    public static final long OFFSET$extendedDynamicState3CoverageToColorLocation = LAYOUT.byteOffset(PATH$extendedDynamicState3CoverageToColorLocation);
    public static final long OFFSET$extendedDynamicState3CoverageModulationMode = LAYOUT.byteOffset(PATH$extendedDynamicState3CoverageModulationMode);
    public static final long OFFSET$extendedDynamicState3CoverageModulationTableEnable = LAYOUT.byteOffset(PATH$extendedDynamicState3CoverageModulationTableEnable);
    public static final long OFFSET$extendedDynamicState3CoverageModulationTable = LAYOUT.byteOffset(PATH$extendedDynamicState3CoverageModulationTable);
    public static final long OFFSET$extendedDynamicState3CoverageReductionMode = LAYOUT.byteOffset(PATH$extendedDynamicState3CoverageReductionMode);
    public static final long OFFSET$extendedDynamicState3RepresentativeFragmentTestEnable = LAYOUT.byteOffset(PATH$extendedDynamicState3RepresentativeFragmentTestEnable);
    public static final long OFFSET$extendedDynamicState3ShadingRateImageEnable = LAYOUT.byteOffset(PATH$extendedDynamicState3ShadingRateImageEnable);

    public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_3_FEATURES_EXT);
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

    public @unsigned int extendedDynamicState3TessellationDomainOrigin() {
        return segment.get(LAYOUT$extendedDynamicState3TessellationDomainOrigin, OFFSET$extendedDynamicState3TessellationDomainOrigin);
    }

    public void extendedDynamicState3TessellationDomainOrigin(@unsigned int value) {
        segment.set(LAYOUT$extendedDynamicState3TessellationDomainOrigin, OFFSET$extendedDynamicState3TessellationDomainOrigin, value);
    }

    public @unsigned int extendedDynamicState3DepthClampEnable() {
        return segment.get(LAYOUT$extendedDynamicState3DepthClampEnable, OFFSET$extendedDynamicState3DepthClampEnable);
    }

    public void extendedDynamicState3DepthClampEnable(@unsigned int value) {
        segment.set(LAYOUT$extendedDynamicState3DepthClampEnable, OFFSET$extendedDynamicState3DepthClampEnable, value);
    }

    public @unsigned int extendedDynamicState3PolygonMode() {
        return segment.get(LAYOUT$extendedDynamicState3PolygonMode, OFFSET$extendedDynamicState3PolygonMode);
    }

    public void extendedDynamicState3PolygonMode(@unsigned int value) {
        segment.set(LAYOUT$extendedDynamicState3PolygonMode, OFFSET$extendedDynamicState3PolygonMode, value);
    }

    public @unsigned int extendedDynamicState3RasterizationSamples() {
        return segment.get(LAYOUT$extendedDynamicState3RasterizationSamples, OFFSET$extendedDynamicState3RasterizationSamples);
    }

    public void extendedDynamicState3RasterizationSamples(@unsigned int value) {
        segment.set(LAYOUT$extendedDynamicState3RasterizationSamples, OFFSET$extendedDynamicState3RasterizationSamples, value);
    }

    public @unsigned int extendedDynamicState3SampleMask() {
        return segment.get(LAYOUT$extendedDynamicState3SampleMask, OFFSET$extendedDynamicState3SampleMask);
    }

    public void extendedDynamicState3SampleMask(@unsigned int value) {
        segment.set(LAYOUT$extendedDynamicState3SampleMask, OFFSET$extendedDynamicState3SampleMask, value);
    }

    public @unsigned int extendedDynamicState3AlphaToCoverageEnable() {
        return segment.get(LAYOUT$extendedDynamicState3AlphaToCoverageEnable, OFFSET$extendedDynamicState3AlphaToCoverageEnable);
    }

    public void extendedDynamicState3AlphaToCoverageEnable(@unsigned int value) {
        segment.set(LAYOUT$extendedDynamicState3AlphaToCoverageEnable, OFFSET$extendedDynamicState3AlphaToCoverageEnable, value);
    }

    public @unsigned int extendedDynamicState3AlphaToOneEnable() {
        return segment.get(LAYOUT$extendedDynamicState3AlphaToOneEnable, OFFSET$extendedDynamicState3AlphaToOneEnable);
    }

    public void extendedDynamicState3AlphaToOneEnable(@unsigned int value) {
        segment.set(LAYOUT$extendedDynamicState3AlphaToOneEnable, OFFSET$extendedDynamicState3AlphaToOneEnable, value);
    }

    public @unsigned int extendedDynamicState3LogicOpEnable() {
        return segment.get(LAYOUT$extendedDynamicState3LogicOpEnable, OFFSET$extendedDynamicState3LogicOpEnable);
    }

    public void extendedDynamicState3LogicOpEnable(@unsigned int value) {
        segment.set(LAYOUT$extendedDynamicState3LogicOpEnable, OFFSET$extendedDynamicState3LogicOpEnable, value);
    }

    public @unsigned int extendedDynamicState3ColorBlendEnable() {
        return segment.get(LAYOUT$extendedDynamicState3ColorBlendEnable, OFFSET$extendedDynamicState3ColorBlendEnable);
    }

    public void extendedDynamicState3ColorBlendEnable(@unsigned int value) {
        segment.set(LAYOUT$extendedDynamicState3ColorBlendEnable, OFFSET$extendedDynamicState3ColorBlendEnable, value);
    }

    public @unsigned int extendedDynamicState3ColorBlendEquation() {
        return segment.get(LAYOUT$extendedDynamicState3ColorBlendEquation, OFFSET$extendedDynamicState3ColorBlendEquation);
    }

    public void extendedDynamicState3ColorBlendEquation(@unsigned int value) {
        segment.set(LAYOUT$extendedDynamicState3ColorBlendEquation, OFFSET$extendedDynamicState3ColorBlendEquation, value);
    }

    public @unsigned int extendedDynamicState3ColorWriteMask() {
        return segment.get(LAYOUT$extendedDynamicState3ColorWriteMask, OFFSET$extendedDynamicState3ColorWriteMask);
    }

    public void extendedDynamicState3ColorWriteMask(@unsigned int value) {
        segment.set(LAYOUT$extendedDynamicState3ColorWriteMask, OFFSET$extendedDynamicState3ColorWriteMask, value);
    }

    public @unsigned int extendedDynamicState3RasterizationStream() {
        return segment.get(LAYOUT$extendedDynamicState3RasterizationStream, OFFSET$extendedDynamicState3RasterizationStream);
    }

    public void extendedDynamicState3RasterizationStream(@unsigned int value) {
        segment.set(LAYOUT$extendedDynamicState3RasterizationStream, OFFSET$extendedDynamicState3RasterizationStream, value);
    }

    public @unsigned int extendedDynamicState3ConservativeRasterizationMode() {
        return segment.get(LAYOUT$extendedDynamicState3ConservativeRasterizationMode, OFFSET$extendedDynamicState3ConservativeRasterizationMode);
    }

    public void extendedDynamicState3ConservativeRasterizationMode(@unsigned int value) {
        segment.set(LAYOUT$extendedDynamicState3ConservativeRasterizationMode, OFFSET$extendedDynamicState3ConservativeRasterizationMode, value);
    }

    public @unsigned int extendedDynamicState3ExtraPrimitiveOverestimationSize() {
        return segment.get(LAYOUT$extendedDynamicState3ExtraPrimitiveOverestimationSize, OFFSET$extendedDynamicState3ExtraPrimitiveOverestimationSize);
    }

    public void extendedDynamicState3ExtraPrimitiveOverestimationSize(@unsigned int value) {
        segment.set(LAYOUT$extendedDynamicState3ExtraPrimitiveOverestimationSize, OFFSET$extendedDynamicState3ExtraPrimitiveOverestimationSize, value);
    }

    public @unsigned int extendedDynamicState3DepthClipEnable() {
        return segment.get(LAYOUT$extendedDynamicState3DepthClipEnable, OFFSET$extendedDynamicState3DepthClipEnable);
    }

    public void extendedDynamicState3DepthClipEnable(@unsigned int value) {
        segment.set(LAYOUT$extendedDynamicState3DepthClipEnable, OFFSET$extendedDynamicState3DepthClipEnable, value);
    }

    public @unsigned int extendedDynamicState3SampleLocationsEnable() {
        return segment.get(LAYOUT$extendedDynamicState3SampleLocationsEnable, OFFSET$extendedDynamicState3SampleLocationsEnable);
    }

    public void extendedDynamicState3SampleLocationsEnable(@unsigned int value) {
        segment.set(LAYOUT$extendedDynamicState3SampleLocationsEnable, OFFSET$extendedDynamicState3SampleLocationsEnable, value);
    }

    public @unsigned int extendedDynamicState3ColorBlendAdvanced() {
        return segment.get(LAYOUT$extendedDynamicState3ColorBlendAdvanced, OFFSET$extendedDynamicState3ColorBlendAdvanced);
    }

    public void extendedDynamicState3ColorBlendAdvanced(@unsigned int value) {
        segment.set(LAYOUT$extendedDynamicState3ColorBlendAdvanced, OFFSET$extendedDynamicState3ColorBlendAdvanced, value);
    }

    public @unsigned int extendedDynamicState3ProvokingVertexMode() {
        return segment.get(LAYOUT$extendedDynamicState3ProvokingVertexMode, OFFSET$extendedDynamicState3ProvokingVertexMode);
    }

    public void extendedDynamicState3ProvokingVertexMode(@unsigned int value) {
        segment.set(LAYOUT$extendedDynamicState3ProvokingVertexMode, OFFSET$extendedDynamicState3ProvokingVertexMode, value);
    }

    public @unsigned int extendedDynamicState3LineRasterizationMode() {
        return segment.get(LAYOUT$extendedDynamicState3LineRasterizationMode, OFFSET$extendedDynamicState3LineRasterizationMode);
    }

    public void extendedDynamicState3LineRasterizationMode(@unsigned int value) {
        segment.set(LAYOUT$extendedDynamicState3LineRasterizationMode, OFFSET$extendedDynamicState3LineRasterizationMode, value);
    }

    public @unsigned int extendedDynamicState3LineStippleEnable() {
        return segment.get(LAYOUT$extendedDynamicState3LineStippleEnable, OFFSET$extendedDynamicState3LineStippleEnable);
    }

    public void extendedDynamicState3LineStippleEnable(@unsigned int value) {
        segment.set(LAYOUT$extendedDynamicState3LineStippleEnable, OFFSET$extendedDynamicState3LineStippleEnable, value);
    }

    public @unsigned int extendedDynamicState3DepthClipNegativeOneToOne() {
        return segment.get(LAYOUT$extendedDynamicState3DepthClipNegativeOneToOne, OFFSET$extendedDynamicState3DepthClipNegativeOneToOne);
    }

    public void extendedDynamicState3DepthClipNegativeOneToOne(@unsigned int value) {
        segment.set(LAYOUT$extendedDynamicState3DepthClipNegativeOneToOne, OFFSET$extendedDynamicState3DepthClipNegativeOneToOne, value);
    }

    public @unsigned int extendedDynamicState3ViewportWScalingEnable() {
        return segment.get(LAYOUT$extendedDynamicState3ViewportWScalingEnable, OFFSET$extendedDynamicState3ViewportWScalingEnable);
    }

    public void extendedDynamicState3ViewportWScalingEnable(@unsigned int value) {
        segment.set(LAYOUT$extendedDynamicState3ViewportWScalingEnable, OFFSET$extendedDynamicState3ViewportWScalingEnable, value);
    }

    public @unsigned int extendedDynamicState3ViewportSwizzle() {
        return segment.get(LAYOUT$extendedDynamicState3ViewportSwizzle, OFFSET$extendedDynamicState3ViewportSwizzle);
    }

    public void extendedDynamicState3ViewportSwizzle(@unsigned int value) {
        segment.set(LAYOUT$extendedDynamicState3ViewportSwizzle, OFFSET$extendedDynamicState3ViewportSwizzle, value);
    }

    public @unsigned int extendedDynamicState3CoverageToColorEnable() {
        return segment.get(LAYOUT$extendedDynamicState3CoverageToColorEnable, OFFSET$extendedDynamicState3CoverageToColorEnable);
    }

    public void extendedDynamicState3CoverageToColorEnable(@unsigned int value) {
        segment.set(LAYOUT$extendedDynamicState3CoverageToColorEnable, OFFSET$extendedDynamicState3CoverageToColorEnable, value);
    }

    public @unsigned int extendedDynamicState3CoverageToColorLocation() {
        return segment.get(LAYOUT$extendedDynamicState3CoverageToColorLocation, OFFSET$extendedDynamicState3CoverageToColorLocation);
    }

    public void extendedDynamicState3CoverageToColorLocation(@unsigned int value) {
        segment.set(LAYOUT$extendedDynamicState3CoverageToColorLocation, OFFSET$extendedDynamicState3CoverageToColorLocation, value);
    }

    public @unsigned int extendedDynamicState3CoverageModulationMode() {
        return segment.get(LAYOUT$extendedDynamicState3CoverageModulationMode, OFFSET$extendedDynamicState3CoverageModulationMode);
    }

    public void extendedDynamicState3CoverageModulationMode(@unsigned int value) {
        segment.set(LAYOUT$extendedDynamicState3CoverageModulationMode, OFFSET$extendedDynamicState3CoverageModulationMode, value);
    }

    public @unsigned int extendedDynamicState3CoverageModulationTableEnable() {
        return segment.get(LAYOUT$extendedDynamicState3CoverageModulationTableEnable, OFFSET$extendedDynamicState3CoverageModulationTableEnable);
    }

    public void extendedDynamicState3CoverageModulationTableEnable(@unsigned int value) {
        segment.set(LAYOUT$extendedDynamicState3CoverageModulationTableEnable, OFFSET$extendedDynamicState3CoverageModulationTableEnable, value);
    }

    public @unsigned int extendedDynamicState3CoverageModulationTable() {
        return segment.get(LAYOUT$extendedDynamicState3CoverageModulationTable, OFFSET$extendedDynamicState3CoverageModulationTable);
    }

    public void extendedDynamicState3CoverageModulationTable(@unsigned int value) {
        segment.set(LAYOUT$extendedDynamicState3CoverageModulationTable, OFFSET$extendedDynamicState3CoverageModulationTable, value);
    }

    public @unsigned int extendedDynamicState3CoverageReductionMode() {
        return segment.get(LAYOUT$extendedDynamicState3CoverageReductionMode, OFFSET$extendedDynamicState3CoverageReductionMode);
    }

    public void extendedDynamicState3CoverageReductionMode(@unsigned int value) {
        segment.set(LAYOUT$extendedDynamicState3CoverageReductionMode, OFFSET$extendedDynamicState3CoverageReductionMode, value);
    }

    public @unsigned int extendedDynamicState3RepresentativeFragmentTestEnable() {
        return segment.get(LAYOUT$extendedDynamicState3RepresentativeFragmentTestEnable, OFFSET$extendedDynamicState3RepresentativeFragmentTestEnable);
    }

    public void extendedDynamicState3RepresentativeFragmentTestEnable(@unsigned int value) {
        segment.set(LAYOUT$extendedDynamicState3RepresentativeFragmentTestEnable, OFFSET$extendedDynamicState3RepresentativeFragmentTestEnable, value);
    }

    public @unsigned int extendedDynamicState3ShadingRateImageEnable() {
        return segment.get(LAYOUT$extendedDynamicState3ShadingRateImageEnable, OFFSET$extendedDynamicState3ShadingRateImageEnable);
    }

    public void extendedDynamicState3ShadingRateImageEnable(@unsigned int value) {
        segment.set(LAYOUT$extendedDynamicState3ShadingRateImageEnable, OFFSET$extendedDynamicState3ShadingRateImageEnable, value);
    }


    public static final class Factory implements IFactory<VkPhysicalDeviceExtendedDynamicState3FeaturesEXT> {
        @Override
        public Class<VkPhysicalDeviceExtendedDynamicState3FeaturesEXT> clazz() {
            return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceExtendedDynamicState3FeaturesEXT.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkPhysicalDeviceExtendedDynamicState3FeaturesEXT createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceExtendedDynamicState3FeaturesEXT(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
