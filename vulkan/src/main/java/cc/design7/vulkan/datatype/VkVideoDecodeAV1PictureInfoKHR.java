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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoDecodeAV1PictureInfoKHR.html"><code>VkVideoDecodeAV1PictureInfoKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkVideoDecodeAV1PictureInfoKHR {
///     VkStructureType sType;
///     void const* pNext; // optional
///     StdVideoDecodeAV1PictureInfo const* pStdPictureInfo;
///     int32_t referenceNameSlotIndices;
///     uint32_t frameHeaderOffset;
///     uint32_t tileCount;
///     uint32_t const* pTileOffsets;
///     uint32_t const* pTileSizes;
/// } VkVideoDecodeAV1PictureInfoKHR;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_VIDEO_DECODE_AV1_PICTURE_INFO_KHR`
///
/// The {@link VkVideoDecodeAV1PictureInfoKHR#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkVideoDecodeAV1PictureInfoKHR#autoInit} to initialize these fields manually for
/// non-allocated instances.
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
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoDecodeAV1PictureInfoKHR.html"><code>VkVideoDecodeAV1PictureInfoKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkVideoDecodeAV1PictureInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static VkVideoDecodeAV1PictureInfoKHR allocate(Arena arena) {
        VkVideoDecodeAV1PictureInfoKHR ret = new VkVideoDecodeAV1PictureInfoKHR(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.VIDEO_DECODE_AV1_PICTURE_INFO_KHR);
        return ret;
    }

    public static VkVideoDecodeAV1PictureInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoDecodeAV1PictureInfoKHR[] ret = new VkVideoDecodeAV1PictureInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoDecodeAV1PictureInfoKHR(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.VIDEO_DECODE_AV1_PICTURE_INFO_KHR);
        }
        return ret;
    }

    public static VkVideoDecodeAV1PictureInfoKHR clone(Arena arena, VkVideoDecodeAV1PictureInfoKHR src) {
        VkVideoDecodeAV1PictureInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoDecodeAV1PictureInfoKHR[] clone(Arena arena, VkVideoDecodeAV1PictureInfoKHR[] src) {
        VkVideoDecodeAV1PictureInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.VIDEO_DECODE_AV1_PICTURE_INFO_KHR);
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

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @pointer(comment="StdVideoDecodeAV1PictureInfo*") MemorySegment pStdPictureInfoRaw() {
        return segment.get(LAYOUT$pStdPictureInfo, OFFSET$pStdPictureInfo);
    }

    public void pStdPictureInfoRaw(@pointer(comment="StdVideoDecodeAV1PictureInfo*") MemorySegment value) {
        segment.set(LAYOUT$pStdPictureInfo, OFFSET$pStdPictureInfo, value);
    }

    public @Nullable StdVideoDecodeAV1PictureInfo pStdPictureInfo() {
        MemorySegment s = pStdPictureInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new StdVideoDecodeAV1PictureInfo(s);
    }

    public void pStdPictureInfo(@Nullable StdVideoDecodeAV1PictureInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pStdPictureInfoRaw(s);
    }

    @unsafe public @Nullable StdVideoDecodeAV1PictureInfo[] pStdPictureInfo(int assumedCount) {
        MemorySegment s = pStdPictureInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoDecodeAV1PictureInfo.BYTES);
        StdVideoDecodeAV1PictureInfo[] ret = new StdVideoDecodeAV1PictureInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoDecodeAV1PictureInfo(s.asSlice(i * StdVideoDecodeAV1PictureInfo.BYTES, StdVideoDecodeAV1PictureInfo.BYTES));
        }
        return ret;
    }

    public int referenceNameSlotIndices() {
        return segment.get(LAYOUT$referenceNameSlotIndices, OFFSET$referenceNameSlotIndices);
    }

    public void referenceNameSlotIndices(int value) {
        segment.set(LAYOUT$referenceNameSlotIndices, OFFSET$referenceNameSlotIndices, value);
    }

    public @unsigned int frameHeaderOffset() {
        return segment.get(LAYOUT$frameHeaderOffset, OFFSET$frameHeaderOffset);
    }

    public void frameHeaderOffset(@unsigned int value) {
        segment.set(LAYOUT$frameHeaderOffset, OFFSET$frameHeaderOffset, value);
    }

    public @unsigned int tileCount() {
        return segment.get(LAYOUT$tileCount, OFFSET$tileCount);
    }

    public void tileCount(@unsigned int value) {
        segment.set(LAYOUT$tileCount, OFFSET$tileCount, value);
    }

    public @pointer(comment="int*") MemorySegment pTileOffsetsRaw() {
        return segment.get(LAYOUT$pTileOffsets, OFFSET$pTileOffsets);
    }

    public void pTileOffsetsRaw(@pointer(comment="int*") MemorySegment value) {
        segment.set(LAYOUT$pTileOffsets, OFFSET$pTileOffsets, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned IntPtr pTileOffsets() {
        MemorySegment s = pTileOffsetsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pTileOffsets(@Nullable @unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pTileOffsetsRaw(s);
    }

    public @pointer(comment="int*") MemorySegment pTileSizesRaw() {
        return segment.get(LAYOUT$pTileSizes, OFFSET$pTileSizes);
    }

    public void pTileSizesRaw(@pointer(comment="int*") MemorySegment value) {
        segment.set(LAYOUT$pTileSizes, OFFSET$pTileSizes, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned IntPtr pTileSizes() {
        MemorySegment s = pTileSizesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pTileSizes(@Nullable @unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pTileSizesRaw(s);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoDecodeAV1PictureInfo.LAYOUT).withName("pStdPictureInfo"),
        ValueLayout.JAVA_INT.withName("referenceNameSlotIndices"),
        ValueLayout.JAVA_INT.withName("frameHeaderOffset"),
        ValueLayout.JAVA_INT.withName("tileCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pTileOffsets"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pTileSizes")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$pStdPictureInfo = PathElement.groupElement("PATH$pStdPictureInfo");
    public static final PathElement PATH$referenceNameSlotIndices = PathElement.groupElement("PATH$referenceNameSlotIndices");
    public static final PathElement PATH$frameHeaderOffset = PathElement.groupElement("PATH$frameHeaderOffset");
    public static final PathElement PATH$tileCount = PathElement.groupElement("PATH$tileCount");
    public static final PathElement PATH$pTileOffsets = PathElement.groupElement("PATH$pTileOffsets");
    public static final PathElement PATH$pTileSizes = PathElement.groupElement("PATH$pTileSizes");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pStdPictureInfo = (AddressLayout) LAYOUT.select(PATH$pStdPictureInfo);
    public static final OfInt LAYOUT$referenceNameSlotIndices = (OfInt) LAYOUT.select(PATH$referenceNameSlotIndices);
    public static final OfInt LAYOUT$frameHeaderOffset = (OfInt) LAYOUT.select(PATH$frameHeaderOffset);
    public static final OfInt LAYOUT$tileCount = (OfInt) LAYOUT.select(PATH$tileCount);
    public static final AddressLayout LAYOUT$pTileOffsets = (AddressLayout) LAYOUT.select(PATH$pTileOffsets);
    public static final AddressLayout LAYOUT$pTileSizes = (AddressLayout) LAYOUT.select(PATH$pTileSizes);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pStdPictureInfo = LAYOUT$pStdPictureInfo.byteSize();
    public static final long SIZE$referenceNameSlotIndices = LAYOUT$referenceNameSlotIndices.byteSize();
    public static final long SIZE$frameHeaderOffset = LAYOUT$frameHeaderOffset.byteSize();
    public static final long SIZE$tileCount = LAYOUT$tileCount.byteSize();
    public static final long SIZE$pTileOffsets = LAYOUT$pTileOffsets.byteSize();
    public static final long SIZE$pTileSizes = LAYOUT$pTileSizes.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pStdPictureInfo = LAYOUT.byteOffset(PATH$pStdPictureInfo);
    public static final long OFFSET$referenceNameSlotIndices = LAYOUT.byteOffset(PATH$referenceNameSlotIndices);
    public static final long OFFSET$frameHeaderOffset = LAYOUT.byteOffset(PATH$frameHeaderOffset);
    public static final long OFFSET$tileCount = LAYOUT.byteOffset(PATH$tileCount);
    public static final long OFFSET$pTileOffsets = LAYOUT.byteOffset(PATH$pTileOffsets);
    public static final long OFFSET$pTileSizes = LAYOUT.byteOffset(PATH$pTileSizes);
}
