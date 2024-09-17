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

public record VkImageCreateInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("imageType"),
        ValueLayout.JAVA_INT.withName("format"),
        VkExtent3D.LAYOUT.withName("extent"),
        ValueLayout.JAVA_INT.withName("mipLevels"),
        ValueLayout.JAVA_INT.withName("arrayLayers"),
        ValueLayout.JAVA_INT.withName("samples"),
        ValueLayout.JAVA_INT.withName("tiling"),
        ValueLayout.JAVA_INT.withName("usage"),
        ValueLayout.JAVA_INT.withName("sharingMode"),
        ValueLayout.JAVA_INT.withName("queueFamilyIndexCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pQueueFamilyIndices"),
        ValueLayout.JAVA_INT.withName("initialLayout")
    );

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$imageType = PathElement.groupElement("imageType");
    public static final PathElement PATH$format = PathElement.groupElement("format");
    public static final PathElement PATH$extent = PathElement.groupElement("extent");
    public static final PathElement PATH$mipLevels = PathElement.groupElement("mipLevels");
    public static final PathElement PATH$arrayLayers = PathElement.groupElement("arrayLayers");
    public static final PathElement PATH$samples = PathElement.groupElement("samples");
    public static final PathElement PATH$tiling = PathElement.groupElement("tiling");
    public static final PathElement PATH$usage = PathElement.groupElement("usage");
    public static final PathElement PATH$sharingMode = PathElement.groupElement("sharingMode");
    public static final PathElement PATH$queueFamilyIndexCount = PathElement.groupElement("queueFamilyIndexCount");
    public static final PathElement PATH$pQueueFamilyIndices = PathElement.groupElement("pQueueFamilyIndices");
    public static final PathElement PATH$initialLayout = PathElement.groupElement("initialLayout");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$imageType = (OfInt) LAYOUT.select(PATH$imageType);
    public static final OfInt LAYOUT$format = (OfInt) LAYOUT.select(PATH$format);
    public static final StructLayout LAYOUT$extent = (StructLayout) LAYOUT.select(PATH$extent);
    public static final OfInt LAYOUT$mipLevels = (OfInt) LAYOUT.select(PATH$mipLevels);
    public static final OfInt LAYOUT$arrayLayers = (OfInt) LAYOUT.select(PATH$arrayLayers);
    public static final OfInt LAYOUT$samples = (OfInt) LAYOUT.select(PATH$samples);
    public static final OfInt LAYOUT$tiling = (OfInt) LAYOUT.select(PATH$tiling);
    public static final OfInt LAYOUT$usage = (OfInt) LAYOUT.select(PATH$usage);
    public static final OfInt LAYOUT$sharingMode = (OfInt) LAYOUT.select(PATH$sharingMode);
    public static final OfInt LAYOUT$queueFamilyIndexCount = (OfInt) LAYOUT.select(PATH$queueFamilyIndexCount);
    public static final AddressLayout LAYOUT$pQueueFamilyIndices = (AddressLayout) LAYOUT.select(PATH$pQueueFamilyIndices);
    public static final OfInt LAYOUT$initialLayout = (OfInt) LAYOUT.select(PATH$initialLayout);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$imageType = LAYOUT.byteOffset(PATH$imageType);
    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);
    public static final long OFFSET$extent = LAYOUT.byteOffset(PATH$extent);
    public static final long OFFSET$mipLevels = LAYOUT.byteOffset(PATH$mipLevels);
    public static final long OFFSET$arrayLayers = LAYOUT.byteOffset(PATH$arrayLayers);
    public static final long OFFSET$samples = LAYOUT.byteOffset(PATH$samples);
    public static final long OFFSET$tiling = LAYOUT.byteOffset(PATH$tiling);
    public static final long OFFSET$usage = LAYOUT.byteOffset(PATH$usage);
    public static final long OFFSET$sharingMode = LAYOUT.byteOffset(PATH$sharingMode);
    public static final long OFFSET$queueFamilyIndexCount = LAYOUT.byteOffset(PATH$queueFamilyIndexCount);
    public static final long OFFSET$pQueueFamilyIndices = LAYOUT.byteOffset(PATH$pQueueFamilyIndices);
    public static final long OFFSET$initialLayout = LAYOUT.byteOffset(PATH$initialLayout);

    public VkImageCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IMAGE_CREATE_INFO);
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

    public @enumtype(VkImageCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkImageCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @enumtype(VkImageType.class) int imageType() {
        return segment.get(LAYOUT$imageType, OFFSET$imageType);
    }

    public void imageType(@enumtype(VkImageType.class) int value) {
        segment.set(LAYOUT$imageType, OFFSET$imageType, value);
    }

    public @enumtype(VkFormat.class) int format() {
        return segment.get(LAYOUT$format, OFFSET$format);
    }

    public void format(@enumtype(VkFormat.class) int value) {
        segment.set(LAYOUT$format, OFFSET$format, value);
    }

    public VkExtent3D extent() {
        return new VkExtent3D(segment.asSlice(OFFSET$extent, LAYOUT$extent));
    }

    public void extent(VkExtent3D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$extent, LAYOUT$extent.byteSize());
    }

    public @unsigned int mipLevels() {
        return segment.get(LAYOUT$mipLevels, OFFSET$mipLevels);
    }

    public void mipLevels(@unsigned int value) {
        segment.set(LAYOUT$mipLevels, OFFSET$mipLevels, value);
    }

    public @unsigned int arrayLayers() {
        return segment.get(LAYOUT$arrayLayers, OFFSET$arrayLayers);
    }

    public void arrayLayers(@unsigned int value) {
        segment.set(LAYOUT$arrayLayers, OFFSET$arrayLayers, value);
    }

    public @enumtype(VkSampleCountFlags.class) int samples() {
        return segment.get(LAYOUT$samples, OFFSET$samples);
    }

    public void samples(@enumtype(VkSampleCountFlags.class) int value) {
        segment.set(LAYOUT$samples, OFFSET$samples, value);
    }

    public @enumtype(VkImageTiling.class) int tiling() {
        return segment.get(LAYOUT$tiling, OFFSET$tiling);
    }

    public void tiling(@enumtype(VkImageTiling.class) int value) {
        segment.set(LAYOUT$tiling, OFFSET$tiling, value);
    }

    public @enumtype(VkImageUsageFlags.class) int usage() {
        return segment.get(LAYOUT$usage, OFFSET$usage);
    }

    public void usage(@enumtype(VkImageUsageFlags.class) int value) {
        segment.set(LAYOUT$usage, OFFSET$usage, value);
    }

    public @enumtype(VkSharingMode.class) int sharingMode() {
        return segment.get(LAYOUT$sharingMode, OFFSET$sharingMode);
    }

    public void sharingMode(@enumtype(VkSharingMode.class) int value) {
        segment.set(LAYOUT$sharingMode, OFFSET$sharingMode, value);
    }

    public @unsigned int queueFamilyIndexCount() {
        return segment.get(LAYOUT$queueFamilyIndexCount, OFFSET$queueFamilyIndexCount);
    }

    public void queueFamilyIndexCount(@unsigned int value) {
        segment.set(LAYOUT$queueFamilyIndexCount, OFFSET$queueFamilyIndexCount, value);
    }

    public @pointer(comment="uint32_t*") MemorySegment pQueueFamilyIndicesRaw() {
        return segment.get(LAYOUT$pQueueFamilyIndices, OFFSET$pQueueFamilyIndices);
    }

    public void pQueueFamilyIndicesRaw(@pointer(comment="uint32_t*") MemorySegment value) {
        segment.set(LAYOUT$pQueueFamilyIndices, OFFSET$pQueueFamilyIndices, value);
    }
    
    public @unsigned IntPtr pQueueFamilyIndices() {
        return new IntPtr(pQueueFamilyIndicesRaw());
    }

    public void pQueueFamilyIndices(@unsigned IntPtr value) {
        pQueueFamilyIndicesRaw(value.segment());
    }

    public @enumtype(VkImageLayout.class) int initialLayout() {
        return segment.get(LAYOUT$initialLayout, OFFSET$initialLayout);
    }

    public void initialLayout(@enumtype(VkImageLayout.class) int value) {
        segment.set(LAYOUT$initialLayout, OFFSET$initialLayout, value);
    }


    public static final class VkImageCreateInfoFactory implements IDataTypeFactory<VkImageCreateInfo> {
        @Override
        public Class<VkImageCreateInfo> clazz() {
            return VkImageCreateInfo.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkImageCreateInfo.LAYOUT;
        }

        @Override
        public VkImageCreateInfo create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkImageCreateInfo createUninit(MemorySegment segment) {
            return new VkImageCreateInfo(segment);
        }
    }

    public static final VkImageCreateInfoFactory FACTORY = new VkImageCreateInfoFactory();
}
