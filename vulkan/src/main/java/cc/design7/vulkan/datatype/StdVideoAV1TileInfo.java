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

public record StdVideoAV1TileInfo(@NotNull MemorySegment segment) implements IPointer {
    public static final StructLayout LAYOUT$flags = StdVideoAV1TileInfoFlags.LAYOUT.withName("flags");
    public static final OfByte LAYOUT$TileCols = ValueLayout.JAVA_BYTE.withName("TileCols");
    public static final OfByte LAYOUT$TileRows = ValueLayout.JAVA_BYTE.withName("TileRows");
    public static final OfShort LAYOUT$context_update_tile_id = ValueLayout.JAVA_SHORT.withName("context_update_tile_id");
    public static final OfByte LAYOUT$tile_size_bytes_minus_1 = ValueLayout.JAVA_BYTE.withName("tile_size_bytes_minus_1");
    public static final OfByte LAYOUT$reserved1 = ValueLayout.JAVA_BYTE.withName("reserved1");
    public static final AddressLayout LAYOUT$pMiColStarts = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_SHORT).withName("pMiColStarts");
    public static final AddressLayout LAYOUT$pMiRowStarts = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_SHORT).withName("pMiRowStarts");
    public static final AddressLayout LAYOUT$pWidthInSbsMinus1 = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_SHORT).withName("pWidthInSbsMinus1");
    public static final AddressLayout LAYOUT$pHeightInSbsMinus1 = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_SHORT).withName("pHeightInSbsMinus1");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$flags, LAYOUT$TileCols, LAYOUT$TileRows, LAYOUT$context_update_tile_id, LAYOUT$tile_size_bytes_minus_1, LAYOUT$reserved1, LAYOUT$pMiColStarts, LAYOUT$pMiRowStarts, LAYOUT$pWidthInSbsMinus1, LAYOUT$pHeightInSbsMinus1);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoAV1TileInfo allocate(Arena arena) {
        return new StdVideoAV1TileInfo(arena.allocate(LAYOUT));
    }

    public static StdVideoAV1TileInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoAV1TileInfo[] ret = new StdVideoAV1TileInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoAV1TileInfo(segment.asSlice(i * SIZE, SIZE));
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

    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$TileCols = PathElement.groupElement("PATH$TileCols");
    public static final PathElement PATH$TileRows = PathElement.groupElement("PATH$TileRows");
    public static final PathElement PATH$context_update_tile_id = PathElement.groupElement("PATH$context_update_tile_id");
    public static final PathElement PATH$tile_size_bytes_minus_1 = PathElement.groupElement("PATH$tile_size_bytes_minus_1");
    public static final PathElement PATH$reserved1 = PathElement.groupElement("PATH$reserved1");
    public static final PathElement PATH$pMiColStarts = PathElement.groupElement("PATH$pMiColStarts");
    public static final PathElement PATH$pMiRowStarts = PathElement.groupElement("PATH$pMiRowStarts");
    public static final PathElement PATH$pWidthInSbsMinus1 = PathElement.groupElement("PATH$pWidthInSbsMinus1");
    public static final PathElement PATH$pHeightInSbsMinus1 = PathElement.groupElement("PATH$pHeightInSbsMinus1");

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$TileCols = LAYOUT$TileCols.byteSize();
    public static final long SIZE$TileRows = LAYOUT$TileRows.byteSize();
    public static final long SIZE$context_update_tile_id = LAYOUT$context_update_tile_id.byteSize();
    public static final long SIZE$tile_size_bytes_minus_1 = LAYOUT$tile_size_bytes_minus_1.byteSize();
    public static final long SIZE$reserved1 = LAYOUT$reserved1.byteSize();
    public static final long SIZE$pMiColStarts = LAYOUT$pMiColStarts.byteSize();
    public static final long SIZE$pMiRowStarts = LAYOUT$pMiRowStarts.byteSize();
    public static final long SIZE$pWidthInSbsMinus1 = LAYOUT$pWidthInSbsMinus1.byteSize();
    public static final long SIZE$pHeightInSbsMinus1 = LAYOUT$pHeightInSbsMinus1.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$TileCols = LAYOUT.byteOffset(PATH$TileCols);
    public static final long OFFSET$TileRows = LAYOUT.byteOffset(PATH$TileRows);
    public static final long OFFSET$context_update_tile_id = LAYOUT.byteOffset(PATH$context_update_tile_id);
    public static final long OFFSET$tile_size_bytes_minus_1 = LAYOUT.byteOffset(PATH$tile_size_bytes_minus_1);
    public static final long OFFSET$reserved1 = LAYOUT.byteOffset(PATH$reserved1);
    public static final long OFFSET$pMiColStarts = LAYOUT.byteOffset(PATH$pMiColStarts);
    public static final long OFFSET$pMiRowStarts = LAYOUT.byteOffset(PATH$pMiRowStarts);
    public static final long OFFSET$pWidthInSbsMinus1 = LAYOUT.byteOffset(PATH$pWidthInSbsMinus1);
    public static final long OFFSET$pHeightInSbsMinus1 = LAYOUT.byteOffset(PATH$pHeightInSbsMinus1);

    public StdVideoAV1TileInfoFlags flags() {
        return new StdVideoAV1TileInfoFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(StdVideoAV1TileInfoFlags value) {
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

    public @unsigned byte reserved1() {
        return segment.get(LAYOUT$reserved1, OFFSET$reserved1);
    }

    public void reserved1(@unsigned byte value) {
        segment.set(LAYOUT$reserved1, OFFSET$reserved1, value);
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
    public @Nullable @unsigned ShortPtr pMiColStarts() {
        MemorySegment s = pMiColStartsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new ShortPtr(s);
    }

    public void pMiColStarts(@Nullable @unsigned ShortPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pMiColStartsRaw(s);
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
    public @Nullable @unsigned ShortPtr pMiRowStarts() {
        MemorySegment s = pMiRowStartsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new ShortPtr(s);
    }

    public void pMiRowStarts(@Nullable @unsigned ShortPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pMiRowStartsRaw(s);
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
    public @Nullable @unsigned ShortPtr pWidthInSbsMinus1() {
        MemorySegment s = pWidthInSbsMinus1Raw();
        if (s.address() == 0) {
            return null;
        }
        return new ShortPtr(s);
    }

    public void pWidthInSbsMinus1(@Nullable @unsigned ShortPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pWidthInSbsMinus1Raw(s);
    }

    public @pointer(comment="short*") MemorySegment pHeightInSbsMinus1Raw() {
        return segment.get(LAYOUT$pHeightInSbsMinus1, OFFSET$pHeightInSbsMinus1);
    }

    public void pHeightInSbsMinus1Raw(@pointer(comment="short*") MemorySegment value) {
        segment.set(LAYOUT$pHeightInSbsMinus1, OFFSET$pHeightInSbsMinus1, value);
    }

    /// Note: the returned {@link ShortPtr} does not have correct
    /// {@link ShortPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link ShortPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned ShortPtr pHeightInSbsMinus1() {
        MemorySegment s = pHeightInSbsMinus1Raw();
        if (s.address() == 0) {
            return null;
        }
        return new ShortPtr(s);
    }

    public void pHeightInSbsMinus1(@Nullable @unsigned ShortPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pHeightInSbsMinus1Raw(s);
    }

}
/// dummy, not implemented yet
