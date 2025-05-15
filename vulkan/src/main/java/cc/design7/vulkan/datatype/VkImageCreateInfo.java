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

public record VkImageCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final OfInt LAYOUT$imageType = ValueLayout.JAVA_INT.withName("imageType");
    public static final OfInt LAYOUT$format = ValueLayout.JAVA_INT.withName("format");
    public static final StructLayout LAYOUT$extent = VkExtent3D.LAYOUT.withName("extent");
    public static final OfInt LAYOUT$mipLevels = ValueLayout.JAVA_INT.withName("mipLevels");
    public static final OfInt LAYOUT$arrayLayers = ValueLayout.JAVA_INT.withName("arrayLayers");
    public static final OfInt LAYOUT$samples = ValueLayout.JAVA_INT.withName("samples");
    public static final OfInt LAYOUT$tiling = ValueLayout.JAVA_INT.withName("tiling");
    public static final OfInt LAYOUT$usage = ValueLayout.JAVA_INT.withName("usage");
    public static final OfInt LAYOUT$sharingMode = ValueLayout.JAVA_INT.withName("sharingMode");
    public static final OfInt LAYOUT$queueFamilyIndexCount = ValueLayout.JAVA_INT.withName("queueFamilyIndexCount");
    public static final AddressLayout LAYOUT$pQueueFamilyIndices = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pQueueFamilyIndices");
    public static final OfInt LAYOUT$initialLayout = ValueLayout.JAVA_INT.withName("initialLayout");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$flags, LAYOUT$imageType, LAYOUT$format, LAYOUT$extent, LAYOUT$mipLevels, LAYOUT$arrayLayers, LAYOUT$samples, LAYOUT$tiling, LAYOUT$usage, LAYOUT$sharingMode, LAYOUT$queueFamilyIndexCount, LAYOUT$pQueueFamilyIndices, LAYOUT$initialLayout);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkImageCreateInfo allocate(Arena arena) {
        return new VkImageCreateInfo(arena.allocate(LAYOUT));
    }

    public static VkImageCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImageCreateInfo[] ret = new VkImageCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkImageCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkImageCreateInfo clone(Arena arena, VkImageCreateInfo src) {
        VkImageCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkImageCreateInfo[] clone(Arena arena, VkImageCreateInfo[] src) {
        VkImageCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$imageType = PathElement.groupElement("PATH$imageType");
    public static final PathElement PATH$format = PathElement.groupElement("PATH$format");
    public static final PathElement PATH$extent = PathElement.groupElement("PATH$extent");
    public static final PathElement PATH$mipLevels = PathElement.groupElement("PATH$mipLevels");
    public static final PathElement PATH$arrayLayers = PathElement.groupElement("PATH$arrayLayers");
    public static final PathElement PATH$samples = PathElement.groupElement("PATH$samples");
    public static final PathElement PATH$tiling = PathElement.groupElement("PATH$tiling");
    public static final PathElement PATH$usage = PathElement.groupElement("PATH$usage");
    public static final PathElement PATH$sharingMode = PathElement.groupElement("PATH$sharingMode");
    public static final PathElement PATH$queueFamilyIndexCount = PathElement.groupElement("PATH$queueFamilyIndexCount");
    public static final PathElement PATH$pQueueFamilyIndices = PathElement.groupElement("PATH$pQueueFamilyIndices");
    public static final PathElement PATH$initialLayout = PathElement.groupElement("PATH$initialLayout");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$imageType = LAYOUT$imageType.byteSize();
    public static final long SIZE$format = LAYOUT$format.byteSize();
    public static final long SIZE$extent = LAYOUT$extent.byteSize();
    public static final long SIZE$mipLevels = LAYOUT$mipLevels.byteSize();
    public static final long SIZE$arrayLayers = LAYOUT$arrayLayers.byteSize();
    public static final long SIZE$samples = LAYOUT$samples.byteSize();
    public static final long SIZE$tiling = LAYOUT$tiling.byteSize();
    public static final long SIZE$usage = LAYOUT$usage.byteSize();
    public static final long SIZE$sharingMode = LAYOUT$sharingMode.byteSize();
    public static final long SIZE$queueFamilyIndexCount = LAYOUT$queueFamilyIndexCount.byteSize();
    public static final long SIZE$pQueueFamilyIndices = LAYOUT$pQueueFamilyIndices.byteSize();
    public static final long SIZE$initialLayout = LAYOUT$initialLayout.byteSize();

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
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$extent, SIZE$extent);
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

    public @pointer(comment="int*") MemorySegment pQueueFamilyIndicesRaw() {
        return segment.get(LAYOUT$pQueueFamilyIndices, OFFSET$pQueueFamilyIndices);
    }

    public void pQueueFamilyIndicesRaw(@pointer(comment="int*") MemorySegment value) {
        segment.set(LAYOUT$pQueueFamilyIndices, OFFSET$pQueueFamilyIndices, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned IntPtr pQueueFamilyIndices() {
        MemorySegment s = pQueueFamilyIndicesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pQueueFamilyIndices(@Nullable @unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pQueueFamilyIndicesRaw(s);
    }

    public @enumtype(VkImageLayout.class) int initialLayout() {
        return segment.get(LAYOUT$initialLayout, OFFSET$initialLayout);
    }

    public void initialLayout(@enumtype(VkImageLayout.class) int value) {
        segment.set(LAYOUT$initialLayout, OFFSET$initialLayout, value);
    }

}
/// dummy, not implemented yet
