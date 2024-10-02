package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.unsigned;
import tech.icey.vk4j.bitmask.VkMemoryDecompressionMethodFlagsNV;

import java.lang.foreign.Arena;
import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.ValueLayout;

import static java.lang.foreign.ValueLayout.OfLong;
import static java.lang.foreign.ValueLayout.PathElement;

/// {@snippet lang=c :
/// typedef struct VkDecompressMemoryRegionNV {
///     VkDeviceAddress srcAddress;
///     VkDeviceAddress dstAddress;
///     VkDeviceSize compressedSize;
///     VkDeviceSize decompressedSize;
///     VkMemoryDecompressionMethodFlagsNV decompressionMethod;
/// } VkDecompressMemoryRegionNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDecompressMemoryRegionNV.html">VkDecompressMemoryRegionNV</a>
public record VkDecompressMemoryRegionNV(MemorySegment segment) implements IPointer {
    public VkDecompressMemoryRegionNV(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned long srcAddress() {
        return segment.get(LAYOUT$srcAddress, OFFSET$srcAddress);
    }

    public void srcAddress(@unsigned long value) {
        segment.set(LAYOUT$srcAddress, OFFSET$srcAddress, value);
    }

    public @unsigned long dstAddress() {
        return segment.get(LAYOUT$dstAddress, OFFSET$dstAddress);
    }

    public void dstAddress(@unsigned long value) {
        segment.set(LAYOUT$dstAddress, OFFSET$dstAddress, value);
    }

    public @unsigned long compressedSize() {
        return segment.get(LAYOUT$compressedSize, OFFSET$compressedSize);
    }

    public void compressedSize(@unsigned long value) {
        segment.set(LAYOUT$compressedSize, OFFSET$compressedSize, value);
    }

    public @unsigned long decompressedSize() {
        return segment.get(LAYOUT$decompressedSize, OFFSET$decompressedSize);
    }

    public void decompressedSize(@unsigned long value) {
        segment.set(LAYOUT$decompressedSize, OFFSET$decompressedSize, value);
    }

    public @enumtype(VkMemoryDecompressionMethodFlagsNV.class) long decompressionMethod() {
        return segment.get(LAYOUT$decompressionMethod, OFFSET$decompressionMethod);
    }

    public void decompressionMethod(@enumtype(VkMemoryDecompressionMethodFlagsNV.class) long value) {
        segment.set(LAYOUT$decompressionMethod, OFFSET$decompressionMethod, value);
    }

    public static VkDecompressMemoryRegionNV allocate(Arena arena) {
        return new VkDecompressMemoryRegionNV(arena.allocate(LAYOUT));
    }

    public static VkDecompressMemoryRegionNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDecompressMemoryRegionNV[] ret = new VkDecompressMemoryRegionNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDecompressMemoryRegionNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDecompressMemoryRegionNV clone(Arena arena, VkDecompressMemoryRegionNV src) {
        VkDecompressMemoryRegionNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDecompressMemoryRegionNV[] clone(Arena arena, VkDecompressMemoryRegionNV[] src) {
        VkDecompressMemoryRegionNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("srcAddress"),
        ValueLayout.JAVA_LONG.withName("dstAddress"),
        ValueLayout.JAVA_LONG.withName("compressedSize"),
        ValueLayout.JAVA_LONG.withName("decompressedSize"),
        ValueLayout.JAVA_LONG.withName("decompressionMethod")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$srcAddress = PathElement.groupElement("srcAddress");
    public static final PathElement PATH$dstAddress = PathElement.groupElement("dstAddress");
    public static final PathElement PATH$compressedSize = PathElement.groupElement("compressedSize");
    public static final PathElement PATH$decompressedSize = PathElement.groupElement("decompressedSize");
    public static final PathElement PATH$decompressionMethod = PathElement.groupElement("decompressionMethod");

    public static final OfLong LAYOUT$srcAddress = (OfLong) LAYOUT.select(PATH$srcAddress);
    public static final OfLong LAYOUT$dstAddress = (OfLong) LAYOUT.select(PATH$dstAddress);
    public static final OfLong LAYOUT$compressedSize = (OfLong) LAYOUT.select(PATH$compressedSize);
    public static final OfLong LAYOUT$decompressedSize = (OfLong) LAYOUT.select(PATH$decompressedSize);
    public static final OfLong LAYOUT$decompressionMethod = (OfLong) LAYOUT.select(PATH$decompressionMethod);

    public static final long OFFSET$srcAddress = LAYOUT.byteOffset(PATH$srcAddress);
    public static final long OFFSET$dstAddress = LAYOUT.byteOffset(PATH$dstAddress);
    public static final long OFFSET$compressedSize = LAYOUT.byteOffset(PATH$compressedSize);
    public static final long OFFSET$decompressedSize = LAYOUT.byteOffset(PATH$decompressedSize);
    public static final long OFFSET$decompressionMethod = LAYOUT.byteOffset(PATH$decompressionMethod);

    public static final long SIZE$srcAddress = LAYOUT$srcAddress.byteSize();
    public static final long SIZE$dstAddress = LAYOUT$dstAddress.byteSize();
    public static final long SIZE$compressedSize = LAYOUT$compressedSize.byteSize();
    public static final long SIZE$decompressedSize = LAYOUT$decompressedSize.byteSize();
    public static final long SIZE$decompressionMethod = LAYOUT$decompressionMethod.byteSize();
}
