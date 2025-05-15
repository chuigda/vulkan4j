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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDecompressMemoryRegionNV.html">VkDecompressMemoryRegionNV</a>
@ValueBasedCandidate
public record VkDecompressMemoryRegionNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfLong LAYOUT$srcAddress = ValueLayout.JAVA_LONG.withName("srcAddress");
    public static final OfLong LAYOUT$dstAddress = ValueLayout.JAVA_LONG.withName("dstAddress");
    public static final OfLong LAYOUT$compressedSize = ValueLayout.JAVA_LONG.withName("compressedSize");
    public static final OfLong LAYOUT$decompressedSize = ValueLayout.JAVA_LONG.withName("decompressedSize");
    public static final OfLong LAYOUT$decompressionMethod = ValueLayout.JAVA_LONG.withName("decompressionMethod");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$srcAddress, LAYOUT$dstAddress, LAYOUT$compressedSize, LAYOUT$decompressedSize, LAYOUT$decompressionMethod);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkDecompressMemoryRegionNV allocate(Arena arena) {
        return new VkDecompressMemoryRegionNV(arena.allocate(LAYOUT));
    }

    public static VkDecompressMemoryRegionNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDecompressMemoryRegionNV[] ret = new VkDecompressMemoryRegionNV[count];
        for (int i = 0; i < count; i ++) {
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$srcAddress = PathElement.groupElement("PATH$srcAddress");
    public static final PathElement PATH$dstAddress = PathElement.groupElement("PATH$dstAddress");
    public static final PathElement PATH$compressedSize = PathElement.groupElement("PATH$compressedSize");
    public static final PathElement PATH$decompressedSize = PathElement.groupElement("PATH$decompressedSize");
    public static final PathElement PATH$decompressionMethod = PathElement.groupElement("PATH$decompressionMethod");

    public static final long SIZE$srcAddress = LAYOUT$srcAddress.byteSize();
    public static final long SIZE$dstAddress = LAYOUT$dstAddress.byteSize();
    public static final long SIZE$compressedSize = LAYOUT$compressedSize.byteSize();
    public static final long SIZE$decompressedSize = LAYOUT$decompressedSize.byteSize();
    public static final long SIZE$decompressionMethod = LAYOUT$decompressionMethod.byteSize();

    public static final long OFFSET$srcAddress = LAYOUT.byteOffset(PATH$srcAddress);
    public static final long OFFSET$dstAddress = LAYOUT.byteOffset(PATH$dstAddress);
    public static final long OFFSET$compressedSize = LAYOUT.byteOffset(PATH$compressedSize);
    public static final long OFFSET$decompressedSize = LAYOUT.byteOffset(PATH$decompressedSize);
    public static final long OFFSET$decompressionMethod = LAYOUT.byteOffset(PATH$decompressionMethod);

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

}
