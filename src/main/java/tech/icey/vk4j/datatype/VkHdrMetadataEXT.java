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

public record VkHdrMetadataEXT(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkXYColorEXT.LAYOUT.withName("displayPrimaryRed"),
        VkXYColorEXT.LAYOUT.withName("displayPrimaryGreen"),
        VkXYColorEXT.LAYOUT.withName("displayPrimaryBlue"),
        VkXYColorEXT.LAYOUT.withName("whitePoint"),
        ValueLayout.JAVA_FLOAT.withName("maxLuminance"),
        ValueLayout.JAVA_FLOAT.withName("minLuminance"),
        ValueLayout.JAVA_FLOAT.withName("maxContentLightLevel"),
        ValueLayout.JAVA_FLOAT.withName("maxFrameAverageLightLevel")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$displayPrimaryRed = PathElement.groupElement(2);
    public static final PathElement PATH$displayPrimaryGreen = PathElement.groupElement(3);
    public static final PathElement PATH$displayPrimaryBlue = PathElement.groupElement(4);
    public static final PathElement PATH$whitePoint = PathElement.groupElement(5);
    public static final PathElement PATH$maxLuminance = PathElement.groupElement(6);
    public static final PathElement PATH$minLuminance = PathElement.groupElement(7);
    public static final PathElement PATH$maxContentLightLevel = PathElement.groupElement(8);
    public static final PathElement PATH$maxFrameAverageLightLevel = PathElement.groupElement(9);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$displayPrimaryRed = (StructLayout) LAYOUT.select(PATH$displayPrimaryRed);
    public static final StructLayout LAYOUT$displayPrimaryGreen = (StructLayout) LAYOUT.select(PATH$displayPrimaryGreen);
    public static final StructLayout LAYOUT$displayPrimaryBlue = (StructLayout) LAYOUT.select(PATH$displayPrimaryBlue);
    public static final StructLayout LAYOUT$whitePoint = (StructLayout) LAYOUT.select(PATH$whitePoint);
    public static final OfFloat LAYOUT$maxLuminance = (OfFloat) LAYOUT.select(PATH$maxLuminance);
    public static final OfFloat LAYOUT$minLuminance = (OfFloat) LAYOUT.select(PATH$minLuminance);
    public static final OfFloat LAYOUT$maxContentLightLevel = (OfFloat) LAYOUT.select(PATH$maxContentLightLevel);
    public static final OfFloat LAYOUT$maxFrameAverageLightLevel = (OfFloat) LAYOUT.select(PATH$maxFrameAverageLightLevel);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$displayPrimaryRed = LAYOUT.byteOffset(PATH$displayPrimaryRed);
    public static final long OFFSET$displayPrimaryGreen = LAYOUT.byteOffset(PATH$displayPrimaryGreen);
    public static final long OFFSET$displayPrimaryBlue = LAYOUT.byteOffset(PATH$displayPrimaryBlue);
    public static final long OFFSET$whitePoint = LAYOUT.byteOffset(PATH$whitePoint);
    public static final long OFFSET$maxLuminance = LAYOUT.byteOffset(PATH$maxLuminance);
    public static final long OFFSET$minLuminance = LAYOUT.byteOffset(PATH$minLuminance);
    public static final long OFFSET$maxContentLightLevel = LAYOUT.byteOffset(PATH$maxContentLightLevel);
    public static final long OFFSET$maxFrameAverageLightLevel = LAYOUT.byteOffset(PATH$maxFrameAverageLightLevel);

    public VkHdrMetadataEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_HDR_METADATA_EXT);
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

    public VkXYColorEXT displayPrimaryRed() {
        return new VkXYColorEXT(segment.asSlice(OFFSET$displayPrimaryRed, LAYOUT$displayPrimaryRed));
    }

    public void displayPrimaryRed(VkXYColorEXT value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$displayPrimaryRed, LAYOUT$displayPrimaryRed.byteSize());
    }

    public VkXYColorEXT displayPrimaryGreen() {
        return new VkXYColorEXT(segment.asSlice(OFFSET$displayPrimaryGreen, LAYOUT$displayPrimaryGreen));
    }

    public void displayPrimaryGreen(VkXYColorEXT value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$displayPrimaryGreen, LAYOUT$displayPrimaryGreen.byteSize());
    }

    public VkXYColorEXT displayPrimaryBlue() {
        return new VkXYColorEXT(segment.asSlice(OFFSET$displayPrimaryBlue, LAYOUT$displayPrimaryBlue));
    }

    public void displayPrimaryBlue(VkXYColorEXT value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$displayPrimaryBlue, LAYOUT$displayPrimaryBlue.byteSize());
    }

    public VkXYColorEXT whitePoint() {
        return new VkXYColorEXT(segment.asSlice(OFFSET$whitePoint, LAYOUT$whitePoint));
    }

    public void whitePoint(VkXYColorEXT value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$whitePoint, LAYOUT$whitePoint.byteSize());
    }

    public float maxLuminance() {
        return segment.get(LAYOUT$maxLuminance, OFFSET$maxLuminance);
    }

    public void maxLuminance(float value) {
        segment.set(LAYOUT$maxLuminance, OFFSET$maxLuminance, value);
    }

    public float minLuminance() {
        return segment.get(LAYOUT$minLuminance, OFFSET$minLuminance);
    }

    public void minLuminance(float value) {
        segment.set(LAYOUT$minLuminance, OFFSET$minLuminance, value);
    }

    public float maxContentLightLevel() {
        return segment.get(LAYOUT$maxContentLightLevel, OFFSET$maxContentLightLevel);
    }

    public void maxContentLightLevel(float value) {
        segment.set(LAYOUT$maxContentLightLevel, OFFSET$maxContentLightLevel, value);
    }

    public float maxFrameAverageLightLevel() {
        return segment.get(LAYOUT$maxFrameAverageLightLevel, OFFSET$maxFrameAverageLightLevel);
    }

    public void maxFrameAverageLightLevel(float value) {
        segment.set(LAYOUT$maxFrameAverageLightLevel, OFFSET$maxFrameAverageLightLevel, value);
    }


    public static final class VkHdrMetadataEXTFactory implements IDataTypeFactory<VkHdrMetadataEXT> {
        @Override
        public Class<VkHdrMetadataEXT> clazz() {
            return VkHdrMetadataEXT.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkHdrMetadataEXT.LAYOUT;
        }

        @Override
        public VkHdrMetadataEXT create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkHdrMetadataEXT createUninit(MemorySegment segment) {
            return new VkHdrMetadataEXT(segment);
        }
    }

    public static final VkHdrMetadataEXTFactory FACTORY = new VkHdrMetadataEXTFactory();
}
