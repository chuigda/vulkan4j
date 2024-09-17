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
import tech.icey.vk4j.IDataTypeFactory;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkPhysicalDeviceOpticalFlowPropertiesNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("supportedOutputGridSizes"),
        ValueLayout.JAVA_INT.withName("supportedHintGridSizes"),
        ValueLayout.JAVA_INT.withName("hintSupported"),
        ValueLayout.JAVA_INT.withName("costSupported"),
        ValueLayout.JAVA_INT.withName("bidirectionalFlowSupported"),
        ValueLayout.JAVA_INT.withName("globalFlowSupported"),
        ValueLayout.JAVA_INT.withName("minWidth"),
        ValueLayout.JAVA_INT.withName("minHeight"),
        ValueLayout.JAVA_INT.withName("maxWidth"),
        ValueLayout.JAVA_INT.withName("maxHeight"),
        ValueLayout.JAVA_INT.withName("maxNumRegionsOfInterest")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$supportedOutputGridSizes = PathElement.groupElement("supportedOutputGridSizes");
    public static final PathElement PATH$supportedHintGridSizes = PathElement.groupElement("supportedHintGridSizes");
    public static final PathElement PATH$hintSupported = PathElement.groupElement("hintSupported");
    public static final PathElement PATH$costSupported = PathElement.groupElement("costSupported");
    public static final PathElement PATH$bidirectionalFlowSupported = PathElement.groupElement("bidirectionalFlowSupported");
    public static final PathElement PATH$globalFlowSupported = PathElement.groupElement("globalFlowSupported");
    public static final PathElement PATH$minWidth = PathElement.groupElement("minWidth");
    public static final PathElement PATH$minHeight = PathElement.groupElement("minHeight");
    public static final PathElement PATH$maxWidth = PathElement.groupElement("maxWidth");
    public static final PathElement PATH$maxHeight = PathElement.groupElement("maxHeight");
    public static final PathElement PATH$maxNumRegionsOfInterest = PathElement.groupElement("maxNumRegionsOfInterest");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$supportedOutputGridSizes = (OfInt) LAYOUT.select(PATH$supportedOutputGridSizes);
    public static final OfInt LAYOUT$supportedHintGridSizes = (OfInt) LAYOUT.select(PATH$supportedHintGridSizes);
    public static final OfInt LAYOUT$hintSupported = (OfInt) LAYOUT.select(PATH$hintSupported);
    public static final OfInt LAYOUT$costSupported = (OfInt) LAYOUT.select(PATH$costSupported);
    public static final OfInt LAYOUT$bidirectionalFlowSupported = (OfInt) LAYOUT.select(PATH$bidirectionalFlowSupported);
    public static final OfInt LAYOUT$globalFlowSupported = (OfInt) LAYOUT.select(PATH$globalFlowSupported);
    public static final OfInt LAYOUT$minWidth = (OfInt) LAYOUT.select(PATH$minWidth);
    public static final OfInt LAYOUT$minHeight = (OfInt) LAYOUT.select(PATH$minHeight);
    public static final OfInt LAYOUT$maxWidth = (OfInt) LAYOUT.select(PATH$maxWidth);
    public static final OfInt LAYOUT$maxHeight = (OfInt) LAYOUT.select(PATH$maxHeight);
    public static final OfInt LAYOUT$maxNumRegionsOfInterest = (OfInt) LAYOUT.select(PATH$maxNumRegionsOfInterest);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$supportedOutputGridSizes = LAYOUT.byteOffset(PATH$supportedOutputGridSizes);
    public static final long OFFSET$supportedHintGridSizes = LAYOUT.byteOffset(PATH$supportedHintGridSizes);
    public static final long OFFSET$hintSupported = LAYOUT.byteOffset(PATH$hintSupported);
    public static final long OFFSET$costSupported = LAYOUT.byteOffset(PATH$costSupported);
    public static final long OFFSET$bidirectionalFlowSupported = LAYOUT.byteOffset(PATH$bidirectionalFlowSupported);
    public static final long OFFSET$globalFlowSupported = LAYOUT.byteOffset(PATH$globalFlowSupported);
    public static final long OFFSET$minWidth = LAYOUT.byteOffset(PATH$minWidth);
    public static final long OFFSET$minHeight = LAYOUT.byteOffset(PATH$minHeight);
    public static final long OFFSET$maxWidth = LAYOUT.byteOffset(PATH$maxWidth);
    public static final long OFFSET$maxHeight = LAYOUT.byteOffset(PATH$maxHeight);
    public static final long OFFSET$maxNumRegionsOfInterest = LAYOUT.byteOffset(PATH$maxNumRegionsOfInterest);

    public VkPhysicalDeviceOpticalFlowPropertiesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPTICAL_FLOW_PROPERTIES_NV);
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

    public @enumtype(VkOpticalFlowGridSizeFlagsNV.class) int supportedOutputGridSizes() {
        return segment.get(LAYOUT$supportedOutputGridSizes, OFFSET$supportedOutputGridSizes);
    }

    public void supportedOutputGridSizes(@enumtype(VkOpticalFlowGridSizeFlagsNV.class) int value) {
        segment.set(LAYOUT$supportedOutputGridSizes, OFFSET$supportedOutputGridSizes, value);
    }

    public @enumtype(VkOpticalFlowGridSizeFlagsNV.class) int supportedHintGridSizes() {
        return segment.get(LAYOUT$supportedHintGridSizes, OFFSET$supportedHintGridSizes);
    }

    public void supportedHintGridSizes(@enumtype(VkOpticalFlowGridSizeFlagsNV.class) int value) {
        segment.set(LAYOUT$supportedHintGridSizes, OFFSET$supportedHintGridSizes, value);
    }

    public @unsigned int hintSupported() {
        return segment.get(LAYOUT$hintSupported, OFFSET$hintSupported);
    }

    public void hintSupported(@unsigned int value) {
        segment.set(LAYOUT$hintSupported, OFFSET$hintSupported, value);
    }

    public @unsigned int costSupported() {
        return segment.get(LAYOUT$costSupported, OFFSET$costSupported);
    }

    public void costSupported(@unsigned int value) {
        segment.set(LAYOUT$costSupported, OFFSET$costSupported, value);
    }

    public @unsigned int bidirectionalFlowSupported() {
        return segment.get(LAYOUT$bidirectionalFlowSupported, OFFSET$bidirectionalFlowSupported);
    }

    public void bidirectionalFlowSupported(@unsigned int value) {
        segment.set(LAYOUT$bidirectionalFlowSupported, OFFSET$bidirectionalFlowSupported, value);
    }

    public @unsigned int globalFlowSupported() {
        return segment.get(LAYOUT$globalFlowSupported, OFFSET$globalFlowSupported);
    }

    public void globalFlowSupported(@unsigned int value) {
        segment.set(LAYOUT$globalFlowSupported, OFFSET$globalFlowSupported, value);
    }

    public @unsigned int minWidth() {
        return segment.get(LAYOUT$minWidth, OFFSET$minWidth);
    }

    public void minWidth(@unsigned int value) {
        segment.set(LAYOUT$minWidth, OFFSET$minWidth, value);
    }

    public @unsigned int minHeight() {
        return segment.get(LAYOUT$minHeight, OFFSET$minHeight);
    }

    public void minHeight(@unsigned int value) {
        segment.set(LAYOUT$minHeight, OFFSET$minHeight, value);
    }

    public @unsigned int maxWidth() {
        return segment.get(LAYOUT$maxWidth, OFFSET$maxWidth);
    }

    public void maxWidth(@unsigned int value) {
        segment.set(LAYOUT$maxWidth, OFFSET$maxWidth, value);
    }

    public @unsigned int maxHeight() {
        return segment.get(LAYOUT$maxHeight, OFFSET$maxHeight);
    }

    public void maxHeight(@unsigned int value) {
        segment.set(LAYOUT$maxHeight, OFFSET$maxHeight, value);
    }

    public @unsigned int maxNumRegionsOfInterest() {
        return segment.get(LAYOUT$maxNumRegionsOfInterest, OFFSET$maxNumRegionsOfInterest);
    }

    public void maxNumRegionsOfInterest(@unsigned int value) {
        segment.set(LAYOUT$maxNumRegionsOfInterest, OFFSET$maxNumRegionsOfInterest, value);
    }


    public static final class VkPhysicalDeviceOpticalFlowPropertiesNVFactory implements IDataTypeFactory<VkPhysicalDeviceOpticalFlowPropertiesNV> {
        @Override
        public Class<VkPhysicalDeviceOpticalFlowPropertiesNV> clazz() {
            return VkPhysicalDeviceOpticalFlowPropertiesNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkPhysicalDeviceOpticalFlowPropertiesNV.LAYOUT;
        }

        @Override
        public VkPhysicalDeviceOpticalFlowPropertiesNV create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkPhysicalDeviceOpticalFlowPropertiesNV createUninit(MemorySegment segment) {
            return new VkPhysicalDeviceOpticalFlowPropertiesNV(segment);
        }
    }

    public static final VkPhysicalDeviceOpticalFlowPropertiesNVFactory FACTORY = new VkPhysicalDeviceOpticalFlowPropertiesNVFactory();
}
