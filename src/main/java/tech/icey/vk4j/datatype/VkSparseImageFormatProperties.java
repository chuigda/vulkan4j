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

public record VkSparseImageFormatProperties(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("aspectMask"),
        VkExtent3D.LAYOUT.withName("imageGranularity"),
        ValueLayout.JAVA_INT.withName("flags")
    );

    public static final PathElement PATH$aspectMask = PathElement.groupElement(0);
    public static final PathElement PATH$imageGranularity = PathElement.groupElement(1);
    public static final PathElement PATH$flags = PathElement.groupElement(2);

    public static final OfInt LAYOUT$aspectMask = (OfInt) LAYOUT.select(PATH$aspectMask);
    public static final StructLayout LAYOUT$imageGranularity = (StructLayout) LAYOUT.select(PATH$imageGranularity);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);

    public static final long OFFSET$aspectMask = LAYOUT.byteOffset(PATH$aspectMask);
    public static final long OFFSET$imageGranularity = LAYOUT.byteOffset(PATH$imageGranularity);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);

    public VkSparseImageFormatProperties(MemorySegment segment) {
        this.segment = segment;
    }

    public @enumtype(VkImageAspectFlags.class) int aspectMask() {
        return segment.get(LAYOUT$aspectMask, OFFSET$aspectMask);
    }

    public void aspectMask(@enumtype(VkImageAspectFlags.class) int value) {
        segment.set(LAYOUT$aspectMask, OFFSET$aspectMask, value);
    }

    public VkExtent3D imageGranularity() {
        return new VkExtent3D(segment.asSlice(OFFSET$imageGranularity, LAYOUT$imageGranularity));
    }

    public void imageGranularity(VkExtent3D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$imageGranularity, LAYOUT$imageGranularity.byteSize());
    }

    public @enumtype(VkSparseImageFormatFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkSparseImageFormatFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }


    public static final class VkSparseImageFormatPropertiesFactory implements IDataTypeFactory<VkSparseImageFormatProperties> {
        @Override
        public Class<VkSparseImageFormatProperties> clazz() {
            return VkSparseImageFormatProperties.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkSparseImageFormatProperties.LAYOUT;
        }

        @Override
        public VkSparseImageFormatProperties create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkSparseImageFormatProperties createUninit(MemorySegment segment) {
            return new VkSparseImageFormatProperties(segment);
        }
    }

    public static final VkSparseImageFormatPropertiesFactory FACTORY = new VkSparseImageFormatPropertiesFactory();
}