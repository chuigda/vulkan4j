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

public record VkImageFormatConstraintsInfoFUCHSIA(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkImageCreateInfo.LAYOUT.withName("imageCreateInfo"),
        ValueLayout.JAVA_INT.withName("requiredFormatFeatures"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("sysmemPixelFormat"),
        ValueLayout.JAVA_INT.withName("colorSpaceCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkSysmemColorSpaceFUCHSIA.LAYOUT).withName("pColorSpaces")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$imageCreateInfo = PathElement.groupElement("imageCreateInfo");
    public static final PathElement PATH$requiredFormatFeatures = PathElement.groupElement("requiredFormatFeatures");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$sysmemPixelFormat = PathElement.groupElement("sysmemPixelFormat");
    public static final PathElement PATH$colorSpaceCount = PathElement.groupElement("colorSpaceCount");
    public static final PathElement PATH$pColorSpaces = PathElement.groupElement("pColorSpaces");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$imageCreateInfo = (StructLayout) LAYOUT.select(PATH$imageCreateInfo);
    public static final OfInt LAYOUT$requiredFormatFeatures = (OfInt) LAYOUT.select(PATH$requiredFormatFeatures);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfLong LAYOUT$sysmemPixelFormat = (OfLong) LAYOUT.select(PATH$sysmemPixelFormat);
    public static final OfInt LAYOUT$colorSpaceCount = (OfInt) LAYOUT.select(PATH$colorSpaceCount);
    public static final AddressLayout LAYOUT$pColorSpaces = (AddressLayout) LAYOUT.select(PATH$pColorSpaces);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$imageCreateInfo = LAYOUT.byteOffset(PATH$imageCreateInfo);
    public static final long OFFSET$requiredFormatFeatures = LAYOUT.byteOffset(PATH$requiredFormatFeatures);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$sysmemPixelFormat = LAYOUT.byteOffset(PATH$sysmemPixelFormat);
    public static final long OFFSET$colorSpaceCount = LAYOUT.byteOffset(PATH$colorSpaceCount);
    public static final long OFFSET$pColorSpaces = LAYOUT.byteOffset(PATH$pColorSpaces);

    public VkImageFormatConstraintsInfoFUCHSIA(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IMAGE_FORMAT_CONSTRAINTS_INFO_FUCHSIA);
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

    public VkImageCreateInfo imageCreateInfo() {
        return new VkImageCreateInfo(segment.asSlice(OFFSET$imageCreateInfo, LAYOUT$imageCreateInfo));
    }

    public void imageCreateInfo(VkImageCreateInfo value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$imageCreateInfo, LAYOUT$imageCreateInfo.byteSize());
    }

    public @enumtype(VkFormatFeatureFlags.class) int requiredFormatFeatures() {
        return segment.get(LAYOUT$requiredFormatFeatures, OFFSET$requiredFormatFeatures);
    }

    public void requiredFormatFeatures(@enumtype(VkFormatFeatureFlags.class) int value) {
        segment.set(LAYOUT$requiredFormatFeatures, OFFSET$requiredFormatFeatures, value);
    }

    public @enumtype(VkImageFormatConstraintsFlagsFUCHSIA.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkImageFormatConstraintsFlagsFUCHSIA.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned long sysmemPixelFormat() {
        return segment.get(LAYOUT$sysmemPixelFormat, OFFSET$sysmemPixelFormat);
    }

    public void sysmemPixelFormat(@unsigned long value) {
        segment.set(LAYOUT$sysmemPixelFormat, OFFSET$sysmemPixelFormat, value);
    }

    public @unsigned int colorSpaceCount() {
        return segment.get(LAYOUT$colorSpaceCount, OFFSET$colorSpaceCount);
    }

    public void colorSpaceCount(@unsigned int value) {
        segment.set(LAYOUT$colorSpaceCount, OFFSET$colorSpaceCount, value);
    }

    public @pointer(comment="VkSysmemColorSpaceFUCHSIA*") MemorySegment pColorSpacesRaw() {
        return segment.get(LAYOUT$pColorSpaces, OFFSET$pColorSpaces);
    }

    public void pColorSpacesRaw(@pointer(comment="VkSysmemColorSpaceFUCHSIA*") MemorySegment value) {
        segment.set(LAYOUT$pColorSpaces, OFFSET$pColorSpaces, value);
    }
    
    public @nullable VkSysmemColorSpaceFUCHSIA pColorSpaces() {
        MemorySegment s = pColorSpacesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkSysmemColorSpaceFUCHSIA(s);
    }

    public void pColorSpaces(@nullable VkSysmemColorSpaceFUCHSIA value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pColorSpacesRaw(s);
    }


    public static final class VkImageFormatConstraintsInfoFUCHSIAFactory implements IFactory<VkImageFormatConstraintsInfoFUCHSIA> {
        @Override
        public Class<VkImageFormatConstraintsInfoFUCHSIA> clazz() {
            return VkImageFormatConstraintsInfoFUCHSIA.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkImageFormatConstraintsInfoFUCHSIA.LAYOUT;
        }

        @Override
        public VkImageFormatConstraintsInfoFUCHSIA create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkImageFormatConstraintsInfoFUCHSIA createUninit(MemorySegment segment) {
            return new VkImageFormatConstraintsInfoFUCHSIA(segment);
        }
    }

    public static final VkImageFormatConstraintsInfoFUCHSIAFactory FACTORY = new VkImageFormatConstraintsInfoFUCHSIAFactory();
}
