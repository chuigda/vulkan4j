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

public record VkSamplerCreateInfo(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("magFilter"),
        ValueLayout.JAVA_INT.withName("minFilter"),
        ValueLayout.JAVA_INT.withName("mipmapMode"),
        ValueLayout.JAVA_INT.withName("addressModeU"),
        ValueLayout.JAVA_INT.withName("addressModeV"),
        ValueLayout.JAVA_INT.withName("addressModeW"),
        ValueLayout.JAVA_FLOAT.withName("mipLodBias"),
        ValueLayout.JAVA_INT.withName("anisotropyEnable"),
        ValueLayout.JAVA_FLOAT.withName("maxAnisotropy"),
        ValueLayout.JAVA_INT.withName("compareEnable"),
        ValueLayout.JAVA_INT.withName("compareOp"),
        ValueLayout.JAVA_FLOAT.withName("minLod"),
        ValueLayout.JAVA_FLOAT.withName("maxLod"),
        ValueLayout.JAVA_INT.withName("borderColor"),
        ValueLayout.JAVA_INT.withName("unnormalizedCoordinates")
    );

    public static final PathElement PATH$sType = PathElement.groupElement(0);
    public static final PathElement PATH$pNext = PathElement.groupElement(1);
    public static final PathElement PATH$flags = PathElement.groupElement(2);
    public static final PathElement PATH$magFilter = PathElement.groupElement(3);
    public static final PathElement PATH$minFilter = PathElement.groupElement(4);
    public static final PathElement PATH$mipmapMode = PathElement.groupElement(5);
    public static final PathElement PATH$addressModeU = PathElement.groupElement(6);
    public static final PathElement PATH$addressModeV = PathElement.groupElement(7);
    public static final PathElement PATH$addressModeW = PathElement.groupElement(8);
    public static final PathElement PATH$mipLodBias = PathElement.groupElement(9);
    public static final PathElement PATH$anisotropyEnable = PathElement.groupElement(10);
    public static final PathElement PATH$maxAnisotropy = PathElement.groupElement(11);
    public static final PathElement PATH$compareEnable = PathElement.groupElement(12);
    public static final PathElement PATH$compareOp = PathElement.groupElement(13);
    public static final PathElement PATH$minLod = PathElement.groupElement(14);
    public static final PathElement PATH$maxLod = PathElement.groupElement(15);
    public static final PathElement PATH$borderColor = PathElement.groupElement(16);
    public static final PathElement PATH$unnormalizedCoordinates = PathElement.groupElement(17);

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$magFilter = (OfInt) LAYOUT.select(PATH$magFilter);
    public static final OfInt LAYOUT$minFilter = (OfInt) LAYOUT.select(PATH$minFilter);
    public static final OfInt LAYOUT$mipmapMode = (OfInt) LAYOUT.select(PATH$mipmapMode);
    public static final OfInt LAYOUT$addressModeU = (OfInt) LAYOUT.select(PATH$addressModeU);
    public static final OfInt LAYOUT$addressModeV = (OfInt) LAYOUT.select(PATH$addressModeV);
    public static final OfInt LAYOUT$addressModeW = (OfInt) LAYOUT.select(PATH$addressModeW);
    public static final OfFloat LAYOUT$mipLodBias = (OfFloat) LAYOUT.select(PATH$mipLodBias);
    public static final OfInt LAYOUT$anisotropyEnable = (OfInt) LAYOUT.select(PATH$anisotropyEnable);
    public static final OfFloat LAYOUT$maxAnisotropy = (OfFloat) LAYOUT.select(PATH$maxAnisotropy);
    public static final OfInt LAYOUT$compareEnable = (OfInt) LAYOUT.select(PATH$compareEnable);
    public static final OfInt LAYOUT$compareOp = (OfInt) LAYOUT.select(PATH$compareOp);
    public static final OfFloat LAYOUT$minLod = (OfFloat) LAYOUT.select(PATH$minLod);
    public static final OfFloat LAYOUT$maxLod = (OfFloat) LAYOUT.select(PATH$maxLod);
    public static final OfInt LAYOUT$borderColor = (OfInt) LAYOUT.select(PATH$borderColor);
    public static final OfInt LAYOUT$unnormalizedCoordinates = (OfInt) LAYOUT.select(PATH$unnormalizedCoordinates);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$magFilter = LAYOUT.byteOffset(PATH$magFilter);
    public static final long OFFSET$minFilter = LAYOUT.byteOffset(PATH$minFilter);
    public static final long OFFSET$mipmapMode = LAYOUT.byteOffset(PATH$mipmapMode);
    public static final long OFFSET$addressModeU = LAYOUT.byteOffset(PATH$addressModeU);
    public static final long OFFSET$addressModeV = LAYOUT.byteOffset(PATH$addressModeV);
    public static final long OFFSET$addressModeW = LAYOUT.byteOffset(PATH$addressModeW);
    public static final long OFFSET$mipLodBias = LAYOUT.byteOffset(PATH$mipLodBias);
    public static final long OFFSET$anisotropyEnable = LAYOUT.byteOffset(PATH$anisotropyEnable);
    public static final long OFFSET$maxAnisotropy = LAYOUT.byteOffset(PATH$maxAnisotropy);
    public static final long OFFSET$compareEnable = LAYOUT.byteOffset(PATH$compareEnable);
    public static final long OFFSET$compareOp = LAYOUT.byteOffset(PATH$compareOp);
    public static final long OFFSET$minLod = LAYOUT.byteOffset(PATH$minLod);
    public static final long OFFSET$maxLod = LAYOUT.byteOffset(PATH$maxLod);
    public static final long OFFSET$borderColor = LAYOUT.byteOffset(PATH$borderColor);
    public static final long OFFSET$unnormalizedCoordinates = LAYOUT.byteOffset(PATH$unnormalizedCoordinates);

    public VkSamplerCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SAMPLER_CREATE_INFO);
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

    public @enumtype(VkSamplerCreateFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkSamplerCreateFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @enumtype(VkFilter.class) int magFilter() {
        return segment.get(LAYOUT$magFilter, OFFSET$magFilter);
    }

    public void magFilter(@enumtype(VkFilter.class) int value) {
        segment.set(LAYOUT$magFilter, OFFSET$magFilter, value);
    }

    public @enumtype(VkFilter.class) int minFilter() {
        return segment.get(LAYOUT$minFilter, OFFSET$minFilter);
    }

    public void minFilter(@enumtype(VkFilter.class) int value) {
        segment.set(LAYOUT$minFilter, OFFSET$minFilter, value);
    }

    public @enumtype(VkSamplerMipmapMode.class) int mipmapMode() {
        return segment.get(LAYOUT$mipmapMode, OFFSET$mipmapMode);
    }

    public void mipmapMode(@enumtype(VkSamplerMipmapMode.class) int value) {
        segment.set(LAYOUT$mipmapMode, OFFSET$mipmapMode, value);
    }

    public @enumtype(VkSamplerAddressMode.class) int addressModeU() {
        return segment.get(LAYOUT$addressModeU, OFFSET$addressModeU);
    }

    public void addressModeU(@enumtype(VkSamplerAddressMode.class) int value) {
        segment.set(LAYOUT$addressModeU, OFFSET$addressModeU, value);
    }

    public @enumtype(VkSamplerAddressMode.class) int addressModeV() {
        return segment.get(LAYOUT$addressModeV, OFFSET$addressModeV);
    }

    public void addressModeV(@enumtype(VkSamplerAddressMode.class) int value) {
        segment.set(LAYOUT$addressModeV, OFFSET$addressModeV, value);
    }

    public @enumtype(VkSamplerAddressMode.class) int addressModeW() {
        return segment.get(LAYOUT$addressModeW, OFFSET$addressModeW);
    }

    public void addressModeW(@enumtype(VkSamplerAddressMode.class) int value) {
        segment.set(LAYOUT$addressModeW, OFFSET$addressModeW, value);
    }

    public float mipLodBias() {
        return segment.get(LAYOUT$mipLodBias, OFFSET$mipLodBias);
    }

    public void mipLodBias(float value) {
        segment.set(LAYOUT$mipLodBias, OFFSET$mipLodBias, value);
    }

    public @unsigned int anisotropyEnable() {
        return segment.get(LAYOUT$anisotropyEnable, OFFSET$anisotropyEnable);
    }

    public void anisotropyEnable(@unsigned int value) {
        segment.set(LAYOUT$anisotropyEnable, OFFSET$anisotropyEnable, value);
    }

    public float maxAnisotropy() {
        return segment.get(LAYOUT$maxAnisotropy, OFFSET$maxAnisotropy);
    }

    public void maxAnisotropy(float value) {
        segment.set(LAYOUT$maxAnisotropy, OFFSET$maxAnisotropy, value);
    }

    public @unsigned int compareEnable() {
        return segment.get(LAYOUT$compareEnable, OFFSET$compareEnable);
    }

    public void compareEnable(@unsigned int value) {
        segment.set(LAYOUT$compareEnable, OFFSET$compareEnable, value);
    }

    public @enumtype(VkCompareOp.class) int compareOp() {
        return segment.get(LAYOUT$compareOp, OFFSET$compareOp);
    }

    public void compareOp(@enumtype(VkCompareOp.class) int value) {
        segment.set(LAYOUT$compareOp, OFFSET$compareOp, value);
    }

    public float minLod() {
        return segment.get(LAYOUT$minLod, OFFSET$minLod);
    }

    public void minLod(float value) {
        segment.set(LAYOUT$minLod, OFFSET$minLod, value);
    }

    public float maxLod() {
        return segment.get(LAYOUT$maxLod, OFFSET$maxLod);
    }

    public void maxLod(float value) {
        segment.set(LAYOUT$maxLod, OFFSET$maxLod, value);
    }

    public @enumtype(VkBorderColor.class) int borderColor() {
        return segment.get(LAYOUT$borderColor, OFFSET$borderColor);
    }

    public void borderColor(@enumtype(VkBorderColor.class) int value) {
        segment.set(LAYOUT$borderColor, OFFSET$borderColor, value);
    }

    public @unsigned int unnormalizedCoordinates() {
        return segment.get(LAYOUT$unnormalizedCoordinates, OFFSET$unnormalizedCoordinates);
    }

    public void unnormalizedCoordinates(@unsigned int value) {
        segment.set(LAYOUT$unnormalizedCoordinates, OFFSET$unnormalizedCoordinates, value);
    }


    public static final class VkSamplerCreateInfoFactory implements IDataTypeFactory<VkSamplerCreateInfo> {
        @Override
        public Class<VkSamplerCreateInfo> clazz() {
            return VkSamplerCreateInfo.class;
        } 

        @Override
        public MemoryLayout layout() {
            return VkSamplerCreateInfo.LAYOUT;
        }

        @Override
        public VkSamplerCreateInfo create(MemorySegment segment) {
            return createUninit(segment);
        }
        
        @Override
        public VkSamplerCreateInfo createUninit(MemorySegment segment) {
            return new VkSamplerCreateInfo(segment);
        }
    }

    public static final VkSamplerCreateInfoFactory FACTORY = new VkSamplerCreateInfoFactory();
}
