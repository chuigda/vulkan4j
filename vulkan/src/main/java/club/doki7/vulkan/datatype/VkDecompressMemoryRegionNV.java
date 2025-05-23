package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;

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
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDecompressMemoryRegionNV.html"><code>VkDecompressMemoryRegionNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDecompressMemoryRegionNV(@NotNull MemorySegment segment) implements IVkDecompressMemoryRegionNV {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDecompressMemoryRegionNV.html"><code>VkDecompressMemoryRegionNV</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkDecompressMemoryRegionNV}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkDecompressMemoryRegionNV to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkDecompressMemoryRegionNV.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkDecompressMemoryRegionNV {
        public long size() {
            return segment.byteSize() / VkDecompressMemoryRegionNV.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkDecompressMemoryRegionNV at(long index) {
            return new VkDecompressMemoryRegionNV(segment.asSlice(index * VkDecompressMemoryRegionNV.BYTES, VkDecompressMemoryRegionNV.BYTES));
        }

        public void write(long index, @NotNull VkDecompressMemoryRegionNV value) {
            MemorySegment s = segment.asSlice(index * VkDecompressMemoryRegionNV.BYTES, VkDecompressMemoryRegionNV.BYTES);
            s.copyFrom(value.segment);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} structures,
        /// create a new view {@link Ptr} that uses the same backing storage as this
        /// {@link Ptr}, but with the new size. Since there is actually no way to really check
        /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
        /// marked as {@link unsafe}.
        ///
        /// This method could be useful when handling data returned from some C API, where the size of
        /// the data is not known in advance.
        ///
        /// If the size of the underlying segment is actually known in advance and correctly set, and
        /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
        /// instead.
        @unsafe
        public @NotNull Ptr reinterpret(long index) {
            return new Ptr(segment.asSlice(index * VkDecompressMemoryRegionNV.BYTES, VkDecompressMemoryRegionNV.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * VkDecompressMemoryRegionNV.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * VkDecompressMemoryRegionNV.BYTES,
                (end - start) * VkDecompressMemoryRegionNV.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * VkDecompressMemoryRegionNV.BYTES));
        }

        public VkDecompressMemoryRegionNV[] toArray() {
            VkDecompressMemoryRegionNV[] ret = new VkDecompressMemoryRegionNV[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static VkDecompressMemoryRegionNV allocate(Arena arena) {
        return new VkDecompressMemoryRegionNV(arena.allocate(LAYOUT));
    }

    public static VkDecompressMemoryRegionNV.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new VkDecompressMemoryRegionNV.Ptr(segment);
    }

    public static VkDecompressMemoryRegionNV clone(Arena arena, VkDecompressMemoryRegionNV src) {
        VkDecompressMemoryRegionNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
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
