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

/// Represents a pointer to a {@code StdVideoAV1TileInfo} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoAV1TileInfo {
///     StdVideoAV1TileInfoFlags flags; // @link substring="StdVideoAV1TileInfoFlags" target="StdVideoAV1TileInfoFlags" @link substring="flags" target="#flags"
///     uint8_t TileCols; // @link substring="TileCols" target="#TileCols"
///     uint8_t TileRows; // @link substring="TileRows" target="#TileRows"
///     uint16_t context_update_tile_id; // @link substring="context_update_tile_id" target="#context_update_tile_id"
///     uint8_t tile_size_bytes_minus_1; // @link substring="tile_size_bytes_minus_1" target="#tile_size_bytes_minus_1"
///     uint8_t reserved1;
///     uint16_t const* pMiColStarts; // @link substring="pMiColStarts" target="#pMiColStarts"
///     uint16_t const* pMiRowStarts; // @link substring="pMiRowStarts" target="#pMiRowStarts"
///     uint16_t const* pWidthInSbsMinus1; // @link substring="pWidthInSbsMinus1" target="#pWidthInSbsMinus1"
///     uint16_t const* pHeightInSbsMinus1; // @link substring="pHeightInSbsMinus1" target="#pHeightInSbsMinus1"
/// } StdVideoAV1TileInfo;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
@ValueBasedCandidate
@UnsafeConstructor
public record StdVideoAV1TileInfo(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoAV1TileInfo allocate(Arena arena) {
        return new StdVideoAV1TileInfo(arena.allocate(LAYOUT));
    }

    public static StdVideoAV1TileInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoAV1TileInfo[] ret = new StdVideoAV1TileInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoAV1TileInfo(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoAV1TileInfo clone(Arena arena, StdVideoAV1TileInfo src) {
        StdVideoAV1TileInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoAV1TileInfo[] clone(Arena arena, StdVideoAV1TileInfo[] src) {
        StdVideoAV1TileInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @NotNull StdVideoAV1TileInfoFlags flags() {
        return new StdVideoAV1TileInfoFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(@NotNull StdVideoAV1TileInfoFlags value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$flags, SIZE$flags);
    }

    public @unsigned byte TileCols() {
        return segment.get(LAYOUT$TileCols, OFFSET$TileCols);
    }

    public void TileCols(@unsigned byte value) {
        segment.set(LAYOUT$TileCols, OFFSET$TileCols, value);
    }

    public @unsigned byte TileRows() {
        return segment.get(LAYOUT$TileRows, OFFSET$TileRows);
    }

    public void TileRows(@unsigned byte value) {
        segment.set(LAYOUT$TileRows, OFFSET$TileRows, value);
    }

    public @unsigned short context_update_tile_id() {
        return segment.get(LAYOUT$context_update_tile_id, OFFSET$context_update_tile_id);
    }

    public void context_update_tile_id(@unsigned short value) {
        segment.set(LAYOUT$context_update_tile_id, OFFSET$context_update_tile_id, value);
    }

    public @unsigned byte tile_size_bytes_minus_1() {
        return segment.get(LAYOUT$tile_size_bytes_minus_1, OFFSET$tile_size_bytes_minus_1);
    }

    public void tile_size_bytes_minus_1(@unsigned byte value) {
        segment.set(LAYOUT$tile_size_bytes_minus_1, OFFSET$tile_size_bytes_minus_1, value);
    }


    /// Note: the returned {@link ShortPtr} does not have correct
    /// {@link ShortPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link ShortPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned ShortPtr pMiColStarts() {
        MemorySegment s = pMiColStartsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new ShortPtr(s);
    }

    public void pMiColStarts(@Nullable @unsigned ShortPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pMiColStartsRaw(s);
    }

    public @pointer(comment="short*") MemorySegment pMiColStartsRaw() {
        return segment.get(LAYOUT$pMiColStarts, OFFSET$pMiColStarts);
    }

    public void pMiColStartsRaw(@pointer(comment="short*") MemorySegment value) {
        segment.set(LAYOUT$pMiColStarts, OFFSET$pMiColStarts, value);
    }

    /// Note: the returned {@link ShortPtr} does not have correct
    /// {@link ShortPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link ShortPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned ShortPtr pMiRowStarts() {
        MemorySegment s = pMiRowStartsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new ShortPtr(s);
    }

    public void pMiRowStarts(@Nullable @unsigned ShortPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pMiRowStartsRaw(s);
    }

    public @pointer(comment="short*") MemorySegment pMiRowStartsRaw() {
        return segment.get(LAYOUT$pMiRowStarts, OFFSET$pMiRowStarts);
    }

    public void pMiRowStartsRaw(@pointer(comment="short*") MemorySegment value) {
        segment.set(LAYOUT$pMiRowStarts, OFFSET$pMiRowStarts, value);
    }

    /// Note: the returned {@link ShortPtr} does not have correct
    /// {@link ShortPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link ShortPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned ShortPtr pWidthInSbsMinus1() {
        MemorySegment s = pWidthInSbsMinus1Raw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new ShortPtr(s);
    }

    public void pWidthInSbsMinus1(@Nullable @unsigned ShortPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pWidthInSbsMinus1Raw(s);
    }

    public @pointer(comment="short*") MemorySegment pWidthInSbsMinus1Raw() {
        return segment.get(LAYOUT$pWidthInSbsMinus1, OFFSET$pWidthInSbsMinus1);
    }

    public void pWidthInSbsMinus1Raw(@pointer(comment="short*") MemorySegment value) {
        segment.set(LAYOUT$pWidthInSbsMinus1, OFFSET$pWidthInSbsMinus1, value);
    }

    /// Note: the returned {@link ShortPtr} does not have correct
    /// {@link ShortPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link ShortPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned ShortPtr pHeightInSbsMinus1() {
        MemorySegment s = pHeightInSbsMinus1Raw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new ShortPtr(s);
    }

    public void pHeightInSbsMinus1(@Nullable @unsigned ShortPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pHeightInSbsMinus1Raw(s);
    }

    public @pointer(comment="short*") MemorySegment pHeightInSbsMinus1Raw() {
        return segment.get(LAYOUT$pHeightInSbsMinus1, OFFSET$pHeightInSbsMinus1);
    }

    public void pHeightInSbsMinus1Raw(@pointer(comment="short*") MemorySegment value) {
        segment.set(LAYOUT$pHeightInSbsMinus1, OFFSET$pHeightInSbsMinus1, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        StdVideoAV1TileInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("TileCols"),
        ValueLayout.JAVA_BYTE.withName("TileRows"),
        ValueLayout.JAVA_SHORT.withName("context_update_tile_id"),
        ValueLayout.JAVA_BYTE.withName("tile_size_bytes_minus_1"),
        ValueLayout.JAVA_BYTE.withName("reserved1"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_SHORT).withName("pMiColStarts"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_SHORT).withName("pMiRowStarts"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_SHORT).withName("pWidthInSbsMinus1"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_SHORT).withName("pHeightInSbsMinus1")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$TileCols = PathElement.groupElement("TileCols");
    public static final PathElement PATH$TileRows = PathElement.groupElement("TileRows");
    public static final PathElement PATH$context_update_tile_id = PathElement.groupElement("context_update_tile_id");
    public static final PathElement PATH$tile_size_bytes_minus_1 = PathElement.groupElement("tile_size_bytes_minus_1");
    public static final PathElement PATH$pMiColStarts = PathElement.groupElement("pMiColStarts");
    public static final PathElement PATH$pMiRowStarts = PathElement.groupElement("pMiRowStarts");
    public static final PathElement PATH$pWidthInSbsMinus1 = PathElement.groupElement("pWidthInSbsMinus1");
    public static final PathElement PATH$pHeightInSbsMinus1 = PathElement.groupElement("pHeightInSbsMinus1");

    public static final StructLayout LAYOUT$flags = (StructLayout) LAYOUT.select(PATH$flags);
    public static final OfByte LAYOUT$TileCols = (OfByte) LAYOUT.select(PATH$TileCols);
    public static final OfByte LAYOUT$TileRows = (OfByte) LAYOUT.select(PATH$TileRows);
    public static final OfShort LAYOUT$context_update_tile_id = (OfShort) LAYOUT.select(PATH$context_update_tile_id);
    public static final OfByte LAYOUT$tile_size_bytes_minus_1 = (OfByte) LAYOUT.select(PATH$tile_size_bytes_minus_1);
    public static final AddressLayout LAYOUT$pMiColStarts = (AddressLayout) LAYOUT.select(PATH$pMiColStarts);
    public static final AddressLayout LAYOUT$pMiRowStarts = (AddressLayout) LAYOUT.select(PATH$pMiRowStarts);
    public static final AddressLayout LAYOUT$pWidthInSbsMinus1 = (AddressLayout) LAYOUT.select(PATH$pWidthInSbsMinus1);
    public static final AddressLayout LAYOUT$pHeightInSbsMinus1 = (AddressLayout) LAYOUT.select(PATH$pHeightInSbsMinus1);

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$TileCols = LAYOUT$TileCols.byteSize();
    public static final long SIZE$TileRows = LAYOUT$TileRows.byteSize();
    public static final long SIZE$context_update_tile_id = LAYOUT$context_update_tile_id.byteSize();
    public static final long SIZE$tile_size_bytes_minus_1 = LAYOUT$tile_size_bytes_minus_1.byteSize();
    public static final long SIZE$pMiColStarts = LAYOUT$pMiColStarts.byteSize();
    public static final long SIZE$pMiRowStarts = LAYOUT$pMiRowStarts.byteSize();
    public static final long SIZE$pWidthInSbsMinus1 = LAYOUT$pWidthInSbsMinus1.byteSize();
    public static final long SIZE$pHeightInSbsMinus1 = LAYOUT$pHeightInSbsMinus1.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$TileCols = LAYOUT.byteOffset(PATH$TileCols);
    public static final long OFFSET$TileRows = LAYOUT.byteOffset(PATH$TileRows);
    public static final long OFFSET$context_update_tile_id = LAYOUT.byteOffset(PATH$context_update_tile_id);
    public static final long OFFSET$tile_size_bytes_minus_1 = LAYOUT.byteOffset(PATH$tile_size_bytes_minus_1);
    public static final long OFFSET$pMiColStarts = LAYOUT.byteOffset(PATH$pMiColStarts);
    public static final long OFFSET$pMiRowStarts = LAYOUT.byteOffset(PATH$pMiRowStarts);
    public static final long OFFSET$pWidthInSbsMinus1 = LAYOUT.byteOffset(PATH$pWidthInSbsMinus1);
    public static final long OFFSET$pHeightInSbsMinus1 = LAYOUT.byteOffset(PATH$pHeightInSbsMinus1);
}
