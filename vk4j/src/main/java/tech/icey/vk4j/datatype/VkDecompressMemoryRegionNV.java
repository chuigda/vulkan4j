package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

public record VkDecompressMemoryRegionNV(MemorySegment segment) {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("srcAddress"),
        ValueLayout.JAVA_LONG.withName("dstAddress"),
        ValueLayout.JAVA_LONG.withName("compressedSize"),
        ValueLayout.JAVA_LONG.withName("decompressedSize"),
        ValueLayout.JAVA_INT.withName("decompressionMethod")
    );

    public static final PathElement PATH$srcAddress = PathElement.groupElement("srcAddress");
    public static final PathElement PATH$dstAddress = PathElement.groupElement("dstAddress");
    public static final PathElement PATH$compressedSize = PathElement.groupElement("compressedSize");
    public static final PathElement PATH$decompressedSize = PathElement.groupElement("decompressedSize");
    public static final PathElement PATH$decompressionMethod = PathElement.groupElement("decompressionMethod");

    public static final OfLong LAYOUT$srcAddress = (OfLong) LAYOUT.select(PATH$srcAddress);
    public static final OfLong LAYOUT$dstAddress = (OfLong) LAYOUT.select(PATH$dstAddress);
    public static final OfLong LAYOUT$compressedSize = (OfLong) LAYOUT.select(PATH$compressedSize);
    public static final OfLong LAYOUT$decompressedSize = (OfLong) LAYOUT.select(PATH$decompressedSize);
    public static final OfInt LAYOUT$decompressionMethod = (OfInt) LAYOUT.select(PATH$decompressionMethod);

    public static final long OFFSET$srcAddress = LAYOUT.byteOffset(PATH$srcAddress);
    public static final long OFFSET$dstAddress = LAYOUT.byteOffset(PATH$dstAddress);
    public static final long OFFSET$compressedSize = LAYOUT.byteOffset(PATH$compressedSize);
    public static final long OFFSET$decompressedSize = LAYOUT.byteOffset(PATH$decompressedSize);
    public static final long OFFSET$decompressionMethod = LAYOUT.byteOffset(PATH$decompressionMethod);

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

    public @enumtype(VkMemoryDecompressionMethodFlagsNV.class) int decompressionMethod() {
        return segment.get(LAYOUT$decompressionMethod, OFFSET$decompressionMethod);
    }

    public void decompressionMethod(@enumtype(VkMemoryDecompressionMethodFlagsNV.class) int value) {
        segment.set(LAYOUT$decompressionMethod, OFFSET$decompressionMethod, value);
    }

    public static VkDecompressMemoryRegionNV allocate(Arena arena) {
        return new VkDecompressMemoryRegionNV(arena.allocate(LAYOUT));
    }
    
    public static VkDecompressMemoryRegionNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDecompressMemoryRegionNV[] ret = new VkDecompressMemoryRegionNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDecompressMemoryRegionNV(segment.asSlice(i * LAYOUT.byteSize(), LAYOUT.byteSize()));
        }
        return ret;
    }
}
