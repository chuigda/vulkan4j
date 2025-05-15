package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSamplerCreateInfo.html">VkSamplerCreateInfo</a>
@ValueBasedCandidate
public record VkSamplerCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final OfInt LAYOUT$magFilter = ValueLayout.JAVA_INT.withName("magFilter");
    public static final OfInt LAYOUT$minFilter = ValueLayout.JAVA_INT.withName("minFilter");
    public static final OfInt LAYOUT$mipmapMode = ValueLayout.JAVA_INT.withName("mipmapMode");
    public static final OfInt LAYOUT$addressModeU = ValueLayout.JAVA_INT.withName("addressModeU");
    public static final OfInt LAYOUT$addressModeV = ValueLayout.JAVA_INT.withName("addressModeV");
    public static final OfInt LAYOUT$addressModeW = ValueLayout.JAVA_INT.withName("addressModeW");
    public static final OfFloat LAYOUT$mipLodBias = ValueLayout.JAVA_FLOAT.withName("mipLodBias");
    public static final OfInt LAYOUT$anisotropyEnable = ValueLayout.JAVA_INT.withName("anisotropyEnable");
    public static final OfFloat LAYOUT$maxAnisotropy = ValueLayout.JAVA_FLOAT.withName("maxAnisotropy");
    public static final OfInt LAYOUT$compareEnable = ValueLayout.JAVA_INT.withName("compareEnable");
    public static final OfInt LAYOUT$compareOp = ValueLayout.JAVA_INT.withName("compareOp");
    public static final OfFloat LAYOUT$minLod = ValueLayout.JAVA_FLOAT.withName("minLod");
    public static final OfFloat LAYOUT$maxLod = ValueLayout.JAVA_FLOAT.withName("maxLod");
    public static final OfInt LAYOUT$borderColor = ValueLayout.JAVA_INT.withName("borderColor");
    public static final OfInt LAYOUT$unnormalizedCoordinates = ValueLayout.JAVA_INT.withName("unnormalizedCoordinates");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$flags, LAYOUT$magFilter, LAYOUT$minFilter, LAYOUT$mipmapMode, LAYOUT$addressModeU, LAYOUT$addressModeV, LAYOUT$addressModeW, LAYOUT$mipLodBias, LAYOUT$anisotropyEnable, LAYOUT$maxAnisotropy, LAYOUT$compareEnable, LAYOUT$compareOp, LAYOUT$minLod, LAYOUT$maxLod, LAYOUT$borderColor, LAYOUT$unnormalizedCoordinates);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkSamplerCreateInfo allocate(Arena arena) {
        return new VkSamplerCreateInfo(arena.allocate(LAYOUT));
    }

    public static VkSamplerCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSamplerCreateInfo[] ret = new VkSamplerCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSamplerCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSamplerCreateInfo clone(Arena arena, VkSamplerCreateInfo src) {
        VkSamplerCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSamplerCreateInfo[] clone(Arena arena, VkSamplerCreateInfo[] src) {
        VkSamplerCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$magFilter = PathElement.groupElement("PATH$magFilter");
    public static final PathElement PATH$minFilter = PathElement.groupElement("PATH$minFilter");
    public static final PathElement PATH$mipmapMode = PathElement.groupElement("PATH$mipmapMode");
    public static final PathElement PATH$addressModeU = PathElement.groupElement("PATH$addressModeU");
    public static final PathElement PATH$addressModeV = PathElement.groupElement("PATH$addressModeV");
    public static final PathElement PATH$addressModeW = PathElement.groupElement("PATH$addressModeW");
    public static final PathElement PATH$mipLodBias = PathElement.groupElement("PATH$mipLodBias");
    public static final PathElement PATH$anisotropyEnable = PathElement.groupElement("PATH$anisotropyEnable");
    public static final PathElement PATH$maxAnisotropy = PathElement.groupElement("PATH$maxAnisotropy");
    public static final PathElement PATH$compareEnable = PathElement.groupElement("PATH$compareEnable");
    public static final PathElement PATH$compareOp = PathElement.groupElement("PATH$compareOp");
    public static final PathElement PATH$minLod = PathElement.groupElement("PATH$minLod");
    public static final PathElement PATH$maxLod = PathElement.groupElement("PATH$maxLod");
    public static final PathElement PATH$borderColor = PathElement.groupElement("PATH$borderColor");
    public static final PathElement PATH$unnormalizedCoordinates = PathElement.groupElement("PATH$unnormalizedCoordinates");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$magFilter = LAYOUT$magFilter.byteSize();
    public static final long SIZE$minFilter = LAYOUT$minFilter.byteSize();
    public static final long SIZE$mipmapMode = LAYOUT$mipmapMode.byteSize();
    public static final long SIZE$addressModeU = LAYOUT$addressModeU.byteSize();
    public static final long SIZE$addressModeV = LAYOUT$addressModeV.byteSize();
    public static final long SIZE$addressModeW = LAYOUT$addressModeW.byteSize();
    public static final long SIZE$mipLodBias = LAYOUT$mipLodBias.byteSize();
    public static final long SIZE$anisotropyEnable = LAYOUT$anisotropyEnable.byteSize();
    public static final long SIZE$maxAnisotropy = LAYOUT$maxAnisotropy.byteSize();
    public static final long SIZE$compareEnable = LAYOUT$compareEnable.byteSize();
    public static final long SIZE$compareOp = LAYOUT$compareOp.byteSize();
    public static final long SIZE$minLod = LAYOUT$minLod.byteSize();
    public static final long SIZE$maxLod = LAYOUT$maxLod.byteSize();
    public static final long SIZE$borderColor = LAYOUT$borderColor.byteSize();
    public static final long SIZE$unnormalizedCoordinates = LAYOUT$unnormalizedCoordinates.byteSize();

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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
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

}
