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

public record VkOpticalFlowSessionCreateInfoNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height"),
        ValueLayout.JAVA_INT.withName("imageFormat"),
        ValueLayout.JAVA_INT.withName("flowVectorFormat"),
        ValueLayout.JAVA_INT.withName("costFormat"),
        ValueLayout.JAVA_INT.withName("outputGridSize"),
        ValueLayout.JAVA_INT.withName("hintGridSize"),
        ValueLayout.JAVA_INT.withName("performanceLevel"),
        ValueLayout.JAVA_INT.withName("flags")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$width = PathElement.groupElement("width");
    public static final PathElement PATH$height = PathElement.groupElement("height");
    public static final PathElement PATH$imageFormat = PathElement.groupElement("imageFormat");
    public static final PathElement PATH$flowVectorFormat = PathElement.groupElement("flowVectorFormat");
    public static final PathElement PATH$costFormat = PathElement.groupElement("costFormat");
    public static final PathElement PATH$outputGridSize = PathElement.groupElement("outputGridSize");
    public static final PathElement PATH$hintGridSize = PathElement.groupElement("hintGridSize");
    public static final PathElement PATH$performanceLevel = PathElement.groupElement("performanceLevel");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$width = (OfInt) LAYOUT.select(PATH$width);
    public static final OfInt LAYOUT$height = (OfInt) LAYOUT.select(PATH$height);
    public static final OfInt LAYOUT$imageFormat = (OfInt) LAYOUT.select(PATH$imageFormat);
    public static final OfInt LAYOUT$flowVectorFormat = (OfInt) LAYOUT.select(PATH$flowVectorFormat);
    public static final OfInt LAYOUT$costFormat = (OfInt) LAYOUT.select(PATH$costFormat);
    public static final OfInt LAYOUT$outputGridSize = (OfInt) LAYOUT.select(PATH$outputGridSize);
    public static final OfInt LAYOUT$hintGridSize = (OfInt) LAYOUT.select(PATH$hintGridSize);
    public static final OfInt LAYOUT$performanceLevel = (OfInt) LAYOUT.select(PATH$performanceLevel);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$width = LAYOUT.byteOffset(PATH$width);
    public static final long OFFSET$height = LAYOUT.byteOffset(PATH$height);
    public static final long OFFSET$imageFormat = LAYOUT.byteOffset(PATH$imageFormat);
    public static final long OFFSET$flowVectorFormat = LAYOUT.byteOffset(PATH$flowVectorFormat);
    public static final long OFFSET$costFormat = LAYOUT.byteOffset(PATH$costFormat);
    public static final long OFFSET$outputGridSize = LAYOUT.byteOffset(PATH$outputGridSize);
    public static final long OFFSET$hintGridSize = LAYOUT.byteOffset(PATH$hintGridSize);
    public static final long OFFSET$performanceLevel = LAYOUT.byteOffset(PATH$performanceLevel);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);

    public VkOpticalFlowSessionCreateInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_OPTICAL_FLOW_SESSION_CREATE_INFO_NV);
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

    public @unsigned int width() {
        return segment.get(LAYOUT$width, OFFSET$width);
    }

    public void width(@unsigned int value) {
        segment.set(LAYOUT$width, OFFSET$width, value);
    }

    public @unsigned int height() {
        return segment.get(LAYOUT$height, OFFSET$height);
    }

    public void height(@unsigned int value) {
        segment.set(LAYOUT$height, OFFSET$height, value);
    }

    public @enumtype(VkFormat.class) int imageFormat() {
        return segment.get(LAYOUT$imageFormat, OFFSET$imageFormat);
    }

    public void imageFormat(@enumtype(VkFormat.class) int value) {
        segment.set(LAYOUT$imageFormat, OFFSET$imageFormat, value);
    }

    public @enumtype(VkFormat.class) int flowVectorFormat() {
        return segment.get(LAYOUT$flowVectorFormat, OFFSET$flowVectorFormat);
    }

    public void flowVectorFormat(@enumtype(VkFormat.class) int value) {
        segment.set(LAYOUT$flowVectorFormat, OFFSET$flowVectorFormat, value);
    }

    public @enumtype(VkFormat.class) int costFormat() {
        return segment.get(LAYOUT$costFormat, OFFSET$costFormat);
    }

    public void costFormat(@enumtype(VkFormat.class) int value) {
        segment.set(LAYOUT$costFormat, OFFSET$costFormat, value);
    }

    public @enumtype(VkOpticalFlowGridSizeFlagsNV.class) int outputGridSize() {
        return segment.get(LAYOUT$outputGridSize, OFFSET$outputGridSize);
    }

    public void outputGridSize(@enumtype(VkOpticalFlowGridSizeFlagsNV.class) int value) {
        segment.set(LAYOUT$outputGridSize, OFFSET$outputGridSize, value);
    }

    public @enumtype(VkOpticalFlowGridSizeFlagsNV.class) int hintGridSize() {
        return segment.get(LAYOUT$hintGridSize, OFFSET$hintGridSize);
    }

    public void hintGridSize(@enumtype(VkOpticalFlowGridSizeFlagsNV.class) int value) {
        segment.set(LAYOUT$hintGridSize, OFFSET$hintGridSize, value);
    }

    public @enumtype(VkOpticalFlowPerformanceLevelNV.class) int performanceLevel() {
        return segment.get(LAYOUT$performanceLevel, OFFSET$performanceLevel);
    }

    public void performanceLevel(@enumtype(VkOpticalFlowPerformanceLevelNV.class) int value) {
        segment.set(LAYOUT$performanceLevel, OFFSET$performanceLevel, value);
    }

    public @enumtype(VkOpticalFlowSessionCreateFlagsNV.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkOpticalFlowSessionCreateFlagsNV.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }


    public static final class Factory implements IFactory<VkOpticalFlowSessionCreateInfoNV> {
        @Override
        public Class<VkOpticalFlowSessionCreateInfoNV> clazz() {
            return VkOpticalFlowSessionCreateInfoNV.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkOpticalFlowSessionCreateInfoNV.LAYOUT;
        }

        @Override
        public VkOpticalFlowSessionCreateInfoNV create(MemorySegment segment) {
            return createUninit(segment);
        }

        @Override
        public VkOpticalFlowSessionCreateInfoNV createUninit(MemorySegment segment) {
            return new VkOpticalFlowSessionCreateInfoNV(segment);
        }
    }

    public static final Factory FACTORY = new Factory();
}
