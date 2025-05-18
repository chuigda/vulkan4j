package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDecompressMemoryRegionNV.html"><code>VkDecompressMemoryRegionNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDecompressMemoryRegionNV {
///     VkDeviceAddress srcAddress; // @link substring="srcAddress" target="#srcAddress"
///     VkDeviceAddress dstAddress; // @link substring="dstAddress" target="#dstAddress"
///     VkDeviceSize compressedSize; // @link substring="compressedSize" target="#compressedSize"
///     VkDeviceSize decompressedSize; // @link substring="decompressedSize" target="#decompressedSize"
///     VkMemoryDecompressionMethodFlagsNV decompressionMethod; // @link substring="VkMemoryDecompressionMethodFlagsNV" target="VkMemoryDecompressionMethodFlagsNV" @link substring="decompressionMethod" target="#decompressionMethod"
/// } VkDecompressMemoryRegionNV;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDecompressMemoryRegionNV.html"><code>VkDecompressMemoryRegionNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDecompressMemoryRegionNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkDecompressMemoryRegionNV allocate(Arena arena) {
        VkDecompressMemoryRegionNV ret = new VkDecompressMemoryRegionNV(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkDecompressMemoryRegionNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDecompressMemoryRegionNV[] ret = new VkDecompressMemoryRegionNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDecompressMemoryRegionNV(segment.asSlice(i * BYTES, BYTES));
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

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("srcAddress"),
        ValueLayout.JAVA_LONG.withName("dstAddress"),
        ValueLayout.JAVA_LONG.withName("compressedSize"),
        ValueLayout.JAVA_LONG.withName("decompressedSize"),
        ValueLayout.JAVA_LONG.withName("decompressionMethod")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$srcAddress = PathElement.groupElement("PATH$srcAddress");
    public static final PathElement PATH$dstAddress = PathElement.groupElement("PATH$dstAddress");
    public static final PathElement PATH$compressedSize = PathElement.groupElement("PATH$compressedSize");
    public static final PathElement PATH$decompressedSize = PathElement.groupElement("PATH$decompressedSize");
    public static final PathElement PATH$decompressionMethod = PathElement.groupElement("PATH$decompressionMethod");

    public static final OfLong LAYOUT$srcAddress = (OfLong) LAYOUT.select(PATH$srcAddress);
    public static final OfLong LAYOUT$dstAddress = (OfLong) LAYOUT.select(PATH$dstAddress);
    public static final OfLong LAYOUT$compressedSize = (OfLong) LAYOUT.select(PATH$compressedSize);
    public static final OfLong LAYOUT$decompressedSize = (OfLong) LAYOUT.select(PATH$decompressedSize);
    public static final OfLong LAYOUT$decompressionMethod = (OfLong) LAYOUT.select(PATH$decompressionMethod);

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
}
