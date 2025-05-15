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

/// Represents a pointer to a {@code StdVideoEncodeAV1PictureInfo} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
@ValueBasedCandidate
@UnsafeConstructor
public record StdVideoEncodeAV1PictureInfo(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoEncodeAV1PictureInfo allocate(Arena arena) {
        return new StdVideoEncodeAV1PictureInfo(arena.allocate(LAYOUT));
    }

    public static StdVideoEncodeAV1PictureInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeAV1PictureInfo[] ret = new StdVideoEncodeAV1PictureInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoEncodeAV1PictureInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoEncodeAV1PictureInfo clone(Arena arena, StdVideoEncodeAV1PictureInfo src) {
        StdVideoEncodeAV1PictureInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoEncodeAV1PictureInfo[] clone(Arena arena, StdVideoEncodeAV1PictureInfo[] src) {
        StdVideoEncodeAV1PictureInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        StdVideoEncodeAV1PictureInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_INT.withName("frame_type"),
        ValueLayout.JAVA_INT.withName("frame_presentation_time"),
        ValueLayout.JAVA_INT.withName("current_frame_id"),
        ValueLayout.JAVA_BYTE.withName("order_hint"),
        ValueLayout.JAVA_BYTE.withName("primary_ref_frame"),
        ValueLayout.JAVA_BYTE.withName("refresh_frame_flags"),
        ValueLayout.JAVA_BYTE.withName("coded_denom"),
        ValueLayout.JAVA_SHORT.withName("render_width_minus_1"),
        ValueLayout.JAVA_SHORT.withName("render_height_minus_1"),
        ValueLayout.JAVA_INT.withName("interpolation_filter"),
        ValueLayout.JAVA_INT.withName("TxMode"),
        ValueLayout.JAVA_BYTE.withName("delta_q_res"),
        ValueLayout.JAVA_BYTE.withName("delta_lf_res"),
        ValueLayout.JAVA_BYTE.withName("ref_order_hint"),
        ValueLayout.JAVA_BYTE.withName("ref_frame_idx"),
        ValueLayout.JAVA_BYTE.withName("reserved1"),
        ValueLayout.JAVA_INT.withName("delta_frame_id_minus_1"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoAV1TileInfo.LAYOUT).withName("pTileInfo"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoAV1Quantization.LAYOUT).withName("pQuantization"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoAV1Segmentation.LAYOUT).withName("pSegmentation"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoAV1LoopFilter.LAYOUT).withName("pLoopFilter"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoAV1CDEF.LAYOUT).withName("pCDEF"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoAV1LoopRestoration.LAYOUT).withName("pLoopRestoration"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoAV1GlobalMotion.LAYOUT).withName("pGlobalMotion"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoEncodeAV1ExtensionHeader.LAYOUT).withName("pExtensionHeader"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("pBufferRemovalTimes")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$frame_type = PathElement.groupElement("PATH$frame_type");
    public static final PathElement PATH$frame_presentation_time = PathElement.groupElement("PATH$frame_presentation_time");
    public static final PathElement PATH$current_frame_id = PathElement.groupElement("PATH$current_frame_id");
    public static final PathElement PATH$order_hint = PathElement.groupElement("PATH$order_hint");
    public static final PathElement PATH$primary_ref_frame = PathElement.groupElement("PATH$primary_ref_frame");
    public static final PathElement PATH$refresh_frame_flags = PathElement.groupElement("PATH$refresh_frame_flags");
    public static final PathElement PATH$coded_denom = PathElement.groupElement("PATH$coded_denom");
    public static final PathElement PATH$render_width_minus_1 = PathElement.groupElement("PATH$render_width_minus_1");
    public static final PathElement PATH$render_height_minus_1 = PathElement.groupElement("PATH$render_height_minus_1");
    public static final PathElement PATH$interpolation_filter = PathElement.groupElement("PATH$interpolation_filter");
    public static final PathElement PATH$TxMode = PathElement.groupElement("PATH$TxMode");
    public static final PathElement PATH$delta_q_res = PathElement.groupElement("PATH$delta_q_res");
    public static final PathElement PATH$delta_lf_res = PathElement.groupElement("PATH$delta_lf_res");
    public static final PathElement PATH$ref_order_hint = PathElement.groupElement("PATH$ref_order_hint");
    public static final PathElement PATH$ref_frame_idx = PathElement.groupElement("PATH$ref_frame_idx");
    public static final PathElement PATH$reserved1 = PathElement.groupElement("PATH$reserved1");
    public static final PathElement PATH$delta_frame_id_minus_1 = PathElement.groupElement("PATH$delta_frame_id_minus_1");
    public static final PathElement PATH$pTileInfo = PathElement.groupElement("PATH$pTileInfo");
    public static final PathElement PATH$pQuantization = PathElement.groupElement("PATH$pQuantization");
    public static final PathElement PATH$pSegmentation = PathElement.groupElement("PATH$pSegmentation");
    public static final PathElement PATH$pLoopFilter = PathElement.groupElement("PATH$pLoopFilter");
    public static final PathElement PATH$pCDEF = PathElement.groupElement("PATH$pCDEF");
    public static final PathElement PATH$pLoopRestoration = PathElement.groupElement("PATH$pLoopRestoration");
    public static final PathElement PATH$pGlobalMotion = PathElement.groupElement("PATH$pGlobalMotion");
    public static final PathElement PATH$pExtensionHeader = PathElement.groupElement("PATH$pExtensionHeader");
    public static final PathElement PATH$pBufferRemovalTimes = PathElement.groupElement("PATH$pBufferRemovalTimes");

    public static final StructLayout LAYOUT$flags = (StructLayout) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$frame_type = (OfInt) LAYOUT.select(PATH$frame_type);
    public static final OfInt LAYOUT$frame_presentation_time = (OfInt) LAYOUT.select(PATH$frame_presentation_time);
    public static final OfInt LAYOUT$current_frame_id = (OfInt) LAYOUT.select(PATH$current_frame_id);
    public static final OfByte LAYOUT$order_hint = (OfByte) LAYOUT.select(PATH$order_hint);
    public static final OfByte LAYOUT$primary_ref_frame = (OfByte) LAYOUT.select(PATH$primary_ref_frame);
    public static final OfByte LAYOUT$refresh_frame_flags = (OfByte) LAYOUT.select(PATH$refresh_frame_flags);
    public static final OfByte LAYOUT$coded_denom = (OfByte) LAYOUT.select(PATH$coded_denom);
    public static final OfShort LAYOUT$render_width_minus_1 = (OfShort) LAYOUT.select(PATH$render_width_minus_1);
    public static final OfShort LAYOUT$render_height_minus_1 = (OfShort) LAYOUT.select(PATH$render_height_minus_1);
    public static final OfInt LAYOUT$interpolation_filter = (OfInt) LAYOUT.select(PATH$interpolation_filter);
    public static final OfInt LAYOUT$TxMode = (OfInt) LAYOUT.select(PATH$TxMode);
    public static final OfByte LAYOUT$delta_q_res = (OfByte) LAYOUT.select(PATH$delta_q_res);
    public static final OfByte LAYOUT$delta_lf_res = (OfByte) LAYOUT.select(PATH$delta_lf_res);
    public static final OfByte LAYOUT$ref_order_hint = (OfByte) LAYOUT.select(PATH$ref_order_hint);
    public static final OfByte LAYOUT$ref_frame_idx = (OfByte) LAYOUT.select(PATH$ref_frame_idx);
    public static final OfByte LAYOUT$reserved1 = (OfByte) LAYOUT.select(PATH$reserved1);
    public static final OfInt LAYOUT$delta_frame_id_minus_1 = (OfInt) LAYOUT.select(PATH$delta_frame_id_minus_1);
    public static final AddressLayout LAYOUT$pTileInfo = (AddressLayout) LAYOUT.select(PATH$pTileInfo);
    public static final AddressLayout LAYOUT$pQuantization = (AddressLayout) LAYOUT.select(PATH$pQuantization);
    public static final AddressLayout LAYOUT$pSegmentation = (AddressLayout) LAYOUT.select(PATH$pSegmentation);
    public static final AddressLayout LAYOUT$pLoopFilter = (AddressLayout) LAYOUT.select(PATH$pLoopFilter);
    public static final AddressLayout LAYOUT$pCDEF = (AddressLayout) LAYOUT.select(PATH$pCDEF);
    public static final AddressLayout LAYOUT$pLoopRestoration = (AddressLayout) LAYOUT.select(PATH$pLoopRestoration);
    public static final AddressLayout LAYOUT$pGlobalMotion = (AddressLayout) LAYOUT.select(PATH$pGlobalMotion);
    public static final AddressLayout LAYOUT$pExtensionHeader = (AddressLayout) LAYOUT.select(PATH$pExtensionHeader);
    public static final AddressLayout LAYOUT$pBufferRemovalTimes = (AddressLayout) LAYOUT.select(PATH$pBufferRemovalTimes);

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$frame_type = LAYOUT$frame_type.byteSize();
    public static final long SIZE$frame_presentation_time = LAYOUT$frame_presentation_time.byteSize();
    public static final long SIZE$current_frame_id = LAYOUT$current_frame_id.byteSize();
    public static final long SIZE$order_hint = LAYOUT$order_hint.byteSize();
    public static final long SIZE$primary_ref_frame = LAYOUT$primary_ref_frame.byteSize();
    public static final long SIZE$refresh_frame_flags = LAYOUT$refresh_frame_flags.byteSize();
    public static final long SIZE$coded_denom = LAYOUT$coded_denom.byteSize();
    public static final long SIZE$render_width_minus_1 = LAYOUT$render_width_minus_1.byteSize();
    public static final long SIZE$render_height_minus_1 = LAYOUT$render_height_minus_1.byteSize();
    public static final long SIZE$interpolation_filter = LAYOUT$interpolation_filter.byteSize();
    public static final long SIZE$TxMode = LAYOUT$TxMode.byteSize();
    public static final long SIZE$delta_q_res = LAYOUT$delta_q_res.byteSize();
    public static final long SIZE$delta_lf_res = LAYOUT$delta_lf_res.byteSize();
    public static final long SIZE$ref_order_hint = LAYOUT$ref_order_hint.byteSize();
    public static final long SIZE$ref_frame_idx = LAYOUT$ref_frame_idx.byteSize();
    public static final long SIZE$reserved1 = LAYOUT$reserved1.byteSize();
    public static final long SIZE$delta_frame_id_minus_1 = LAYOUT$delta_frame_id_minus_1.byteSize();
    public static final long SIZE$pTileInfo = LAYOUT$pTileInfo.byteSize();
    public static final long SIZE$pQuantization = LAYOUT$pQuantization.byteSize();
    public static final long SIZE$pSegmentation = LAYOUT$pSegmentation.byteSize();
    public static final long SIZE$pLoopFilter = LAYOUT$pLoopFilter.byteSize();
    public static final long SIZE$pCDEF = LAYOUT$pCDEF.byteSize();
    public static final long SIZE$pLoopRestoration = LAYOUT$pLoopRestoration.byteSize();
    public static final long SIZE$pGlobalMotion = LAYOUT$pGlobalMotion.byteSize();
    public static final long SIZE$pExtensionHeader = LAYOUT$pExtensionHeader.byteSize();
    public static final long SIZE$pBufferRemovalTimes = LAYOUT$pBufferRemovalTimes.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$frame_type = LAYOUT.byteOffset(PATH$frame_type);
    public static final long OFFSET$frame_presentation_time = LAYOUT.byteOffset(PATH$frame_presentation_time);
    public static final long OFFSET$current_frame_id = LAYOUT.byteOffset(PATH$current_frame_id);
    public static final long OFFSET$order_hint = LAYOUT.byteOffset(PATH$order_hint);
    public static final long OFFSET$primary_ref_frame = LAYOUT.byteOffset(PATH$primary_ref_frame);
    public static final long OFFSET$refresh_frame_flags = LAYOUT.byteOffset(PATH$refresh_frame_flags);
    public static final long OFFSET$coded_denom = LAYOUT.byteOffset(PATH$coded_denom);
    public static final long OFFSET$render_width_minus_1 = LAYOUT.byteOffset(PATH$render_width_minus_1);
    public static final long OFFSET$render_height_minus_1 = LAYOUT.byteOffset(PATH$render_height_minus_1);
    public static final long OFFSET$interpolation_filter = LAYOUT.byteOffset(PATH$interpolation_filter);
    public static final long OFFSET$TxMode = LAYOUT.byteOffset(PATH$TxMode);
    public static final long OFFSET$delta_q_res = LAYOUT.byteOffset(PATH$delta_q_res);
    public static final long OFFSET$delta_lf_res = LAYOUT.byteOffset(PATH$delta_lf_res);
    public static final long OFFSET$ref_order_hint = LAYOUT.byteOffset(PATH$ref_order_hint);
    public static final long OFFSET$ref_frame_idx = LAYOUT.byteOffset(PATH$ref_frame_idx);
    public static final long OFFSET$reserved1 = LAYOUT.byteOffset(PATH$reserved1);
    public static final long OFFSET$delta_frame_id_minus_1 = LAYOUT.byteOffset(PATH$delta_frame_id_minus_1);
    public static final long OFFSET$pTileInfo = LAYOUT.byteOffset(PATH$pTileInfo);
    public static final long OFFSET$pQuantization = LAYOUT.byteOffset(PATH$pQuantization);
    public static final long OFFSET$pSegmentation = LAYOUT.byteOffset(PATH$pSegmentation);
    public static final long OFFSET$pLoopFilter = LAYOUT.byteOffset(PATH$pLoopFilter);
    public static final long OFFSET$pCDEF = LAYOUT.byteOffset(PATH$pCDEF);
    public static final long OFFSET$pLoopRestoration = LAYOUT.byteOffset(PATH$pLoopRestoration);
    public static final long OFFSET$pGlobalMotion = LAYOUT.byteOffset(PATH$pGlobalMotion);
    public static final long OFFSET$pExtensionHeader = LAYOUT.byteOffset(PATH$pExtensionHeader);
    public static final long OFFSET$pBufferRemovalTimes = LAYOUT.byteOffset(PATH$pBufferRemovalTimes);

    public StdVideoEncodeAV1PictureInfoFlags flags() {
        return new StdVideoEncodeAV1PictureInfoFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(StdVideoEncodeAV1PictureInfoFlags value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$flags, SIZE$flags);
    }

    public @enumtype(StdVideoAV1FrameType.class) int frame_type() {
        return segment.get(LAYOUT$frame_type, OFFSET$frame_type);
    }

    public void frame_type(@enumtype(StdVideoAV1FrameType.class) int value) {
        segment.set(LAYOUT$frame_type, OFFSET$frame_type, value);
    }

    public @unsigned int frame_presentation_time() {
        return segment.get(LAYOUT$frame_presentation_time, OFFSET$frame_presentation_time);
    }

    public void frame_presentation_time(@unsigned int value) {
        segment.set(LAYOUT$frame_presentation_time, OFFSET$frame_presentation_time, value);
    }

    public @unsigned int current_frame_id() {
        return segment.get(LAYOUT$current_frame_id, OFFSET$current_frame_id);
    }

    public void current_frame_id(@unsigned int value) {
        segment.set(LAYOUT$current_frame_id, OFFSET$current_frame_id, value);
    }

    public @unsigned byte order_hint() {
        return segment.get(LAYOUT$order_hint, OFFSET$order_hint);
    }

    public void order_hint(@unsigned byte value) {
        segment.set(LAYOUT$order_hint, OFFSET$order_hint, value);
    }

    public @unsigned byte primary_ref_frame() {
        return segment.get(LAYOUT$primary_ref_frame, OFFSET$primary_ref_frame);
    }

    public void primary_ref_frame(@unsigned byte value) {
        segment.set(LAYOUT$primary_ref_frame, OFFSET$primary_ref_frame, value);
    }

    public @unsigned byte refresh_frame_flags() {
        return segment.get(LAYOUT$refresh_frame_flags, OFFSET$refresh_frame_flags);
    }

    public void refresh_frame_flags(@unsigned byte value) {
        segment.set(LAYOUT$refresh_frame_flags, OFFSET$refresh_frame_flags, value);
    }

    public @unsigned byte coded_denom() {
        return segment.get(LAYOUT$coded_denom, OFFSET$coded_denom);
    }

    public void coded_denom(@unsigned byte value) {
        segment.set(LAYOUT$coded_denom, OFFSET$coded_denom, value);
    }

    public @unsigned short render_width_minus_1() {
        return segment.get(LAYOUT$render_width_minus_1, OFFSET$render_width_minus_1);
    }

    public void render_width_minus_1(@unsigned short value) {
        segment.set(LAYOUT$render_width_minus_1, OFFSET$render_width_minus_1, value);
    }

    public @unsigned short render_height_minus_1() {
        return segment.get(LAYOUT$render_height_minus_1, OFFSET$render_height_minus_1);
    }

    public void render_height_minus_1(@unsigned short value) {
        segment.set(LAYOUT$render_height_minus_1, OFFSET$render_height_minus_1, value);
    }

    public @enumtype(StdVideoAV1InterpolationFilter.class) int interpolation_filter() {
        return segment.get(LAYOUT$interpolation_filter, OFFSET$interpolation_filter);
    }

    public void interpolation_filter(@enumtype(StdVideoAV1InterpolationFilter.class) int value) {
        segment.set(LAYOUT$interpolation_filter, OFFSET$interpolation_filter, value);
    }

    public @enumtype(StdVideoAV1TxMode.class) int TxMode() {
        return segment.get(LAYOUT$TxMode, OFFSET$TxMode);
    }

    public void TxMode(@enumtype(StdVideoAV1TxMode.class) int value) {
        segment.set(LAYOUT$TxMode, OFFSET$TxMode, value);
    }

    public @unsigned byte delta_q_res() {
        return segment.get(LAYOUT$delta_q_res, OFFSET$delta_q_res);
    }

    public void delta_q_res(@unsigned byte value) {
        segment.set(LAYOUT$delta_q_res, OFFSET$delta_q_res, value);
    }

    public @unsigned byte delta_lf_res() {
        return segment.get(LAYOUT$delta_lf_res, OFFSET$delta_lf_res);
    }

    public void delta_lf_res(@unsigned byte value) {
        segment.set(LAYOUT$delta_lf_res, OFFSET$delta_lf_res, value);
    }

    public @unsigned byte ref_order_hint() {
        return segment.get(LAYOUT$ref_order_hint, OFFSET$ref_order_hint);
    }

    public void ref_order_hint(@unsigned byte value) {
        segment.set(LAYOUT$ref_order_hint, OFFSET$ref_order_hint, value);
    }

    public byte ref_frame_idx() {
        return segment.get(LAYOUT$ref_frame_idx, OFFSET$ref_frame_idx);
    }

    public void ref_frame_idx(byte value) {
        segment.set(LAYOUT$ref_frame_idx, OFFSET$ref_frame_idx, value);
    }

    public @unsigned byte reserved1() {
        return segment.get(LAYOUT$reserved1, OFFSET$reserved1);
    }

    public void reserved1(@unsigned byte value) {
        segment.set(LAYOUT$reserved1, OFFSET$reserved1, value);
    }

    public @unsigned int delta_frame_id_minus_1() {
        return segment.get(LAYOUT$delta_frame_id_minus_1, OFFSET$delta_frame_id_minus_1);
    }

    public void delta_frame_id_minus_1(@unsigned int value) {
        segment.set(LAYOUT$delta_frame_id_minus_1, OFFSET$delta_frame_id_minus_1, value);
    }

    public @pointer(comment="StdVideoAV1TileInfo*") MemorySegment pTileInfoRaw() {
        return segment.get(LAYOUT$pTileInfo, OFFSET$pTileInfo);
    }

    public void pTileInfoRaw(@pointer(comment="StdVideoAV1TileInfo*") MemorySegment value) {
        segment.set(LAYOUT$pTileInfo, OFFSET$pTileInfo, value);
    }

    public @Nullable StdVideoAV1TileInfo pTileInfo() {
        MemorySegment s = pTileInfoRaw();
        if (s.address() == 0) {
            return null;
        }
        return new StdVideoAV1TileInfo(s);
    }

    public void pTileInfo(@Nullable StdVideoAV1TileInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pTileInfoRaw(s);
    }

    @unsafe public @Nullable StdVideoAV1TileInfo[] pTileInfo(int assumedCount) {
        MemorySegment s = pTileInfoRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoAV1TileInfo.SIZE);
        StdVideoAV1TileInfo[] ret = new StdVideoAV1TileInfo[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoAV1TileInfo(s.asSlice(i * StdVideoAV1TileInfo.SIZE, StdVideoAV1TileInfo.SIZE));
        }
        return ret;
    }

    public @pointer(comment="StdVideoAV1Quantization*") MemorySegment pQuantizationRaw() {
        return segment.get(LAYOUT$pQuantization, OFFSET$pQuantization);
    }

    public void pQuantizationRaw(@pointer(comment="StdVideoAV1Quantization*") MemorySegment value) {
        segment.set(LAYOUT$pQuantization, OFFSET$pQuantization, value);
    }

    public @Nullable StdVideoAV1Quantization pQuantization() {
        MemorySegment s = pQuantizationRaw();
        if (s.address() == 0) {
            return null;
        }
        return new StdVideoAV1Quantization(s);
    }

    public void pQuantization(@Nullable StdVideoAV1Quantization value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pQuantizationRaw(s);
    }

    @unsafe public @Nullable StdVideoAV1Quantization[] pQuantization(int assumedCount) {
        MemorySegment s = pQuantizationRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoAV1Quantization.SIZE);
        StdVideoAV1Quantization[] ret = new StdVideoAV1Quantization[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoAV1Quantization(s.asSlice(i * StdVideoAV1Quantization.SIZE, StdVideoAV1Quantization.SIZE));
        }
        return ret;
    }

    public @pointer(comment="StdVideoAV1Segmentation*") MemorySegment pSegmentationRaw() {
        return segment.get(LAYOUT$pSegmentation, OFFSET$pSegmentation);
    }

    public void pSegmentationRaw(@pointer(comment="StdVideoAV1Segmentation*") MemorySegment value) {
        segment.set(LAYOUT$pSegmentation, OFFSET$pSegmentation, value);
    }

    public @Nullable StdVideoAV1Segmentation pSegmentation() {
        MemorySegment s = pSegmentationRaw();
        if (s.address() == 0) {
            return null;
        }
        return new StdVideoAV1Segmentation(s);
    }

    public void pSegmentation(@Nullable StdVideoAV1Segmentation value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSegmentationRaw(s);
    }

    @unsafe public @Nullable StdVideoAV1Segmentation[] pSegmentation(int assumedCount) {
        MemorySegment s = pSegmentationRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoAV1Segmentation.SIZE);
        StdVideoAV1Segmentation[] ret = new StdVideoAV1Segmentation[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoAV1Segmentation(s.asSlice(i * StdVideoAV1Segmentation.SIZE, StdVideoAV1Segmentation.SIZE));
        }
        return ret;
    }

    public @pointer(comment="StdVideoAV1LoopFilter*") MemorySegment pLoopFilterRaw() {
        return segment.get(LAYOUT$pLoopFilter, OFFSET$pLoopFilter);
    }

    public void pLoopFilterRaw(@pointer(comment="StdVideoAV1LoopFilter*") MemorySegment value) {
        segment.set(LAYOUT$pLoopFilter, OFFSET$pLoopFilter, value);
    }

    public @Nullable StdVideoAV1LoopFilter pLoopFilter() {
        MemorySegment s = pLoopFilterRaw();
        if (s.address() == 0) {
            return null;
        }
        return new StdVideoAV1LoopFilter(s);
    }

    public void pLoopFilter(@Nullable StdVideoAV1LoopFilter value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pLoopFilterRaw(s);
    }

    @unsafe public @Nullable StdVideoAV1LoopFilter[] pLoopFilter(int assumedCount) {
        MemorySegment s = pLoopFilterRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoAV1LoopFilter.SIZE);
        StdVideoAV1LoopFilter[] ret = new StdVideoAV1LoopFilter[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoAV1LoopFilter(s.asSlice(i * StdVideoAV1LoopFilter.SIZE, StdVideoAV1LoopFilter.SIZE));
        }
        return ret;
    }

    public @pointer(comment="StdVideoAV1CDEF*") MemorySegment pCDEFRaw() {
        return segment.get(LAYOUT$pCDEF, OFFSET$pCDEF);
    }

    public void pCDEFRaw(@pointer(comment="StdVideoAV1CDEF*") MemorySegment value) {
        segment.set(LAYOUT$pCDEF, OFFSET$pCDEF, value);
    }

    public @Nullable StdVideoAV1CDEF pCDEF() {
        MemorySegment s = pCDEFRaw();
        if (s.address() == 0) {
            return null;
        }
        return new StdVideoAV1CDEF(s);
    }

    public void pCDEF(@Nullable StdVideoAV1CDEF value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pCDEFRaw(s);
    }

    @unsafe public @Nullable StdVideoAV1CDEF[] pCDEF(int assumedCount) {
        MemorySegment s = pCDEFRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoAV1CDEF.SIZE);
        StdVideoAV1CDEF[] ret = new StdVideoAV1CDEF[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoAV1CDEF(s.asSlice(i * StdVideoAV1CDEF.SIZE, StdVideoAV1CDEF.SIZE));
        }
        return ret;
    }

    public @pointer(comment="StdVideoAV1LoopRestoration*") MemorySegment pLoopRestorationRaw() {
        return segment.get(LAYOUT$pLoopRestoration, OFFSET$pLoopRestoration);
    }

    public void pLoopRestorationRaw(@pointer(comment="StdVideoAV1LoopRestoration*") MemorySegment value) {
        segment.set(LAYOUT$pLoopRestoration, OFFSET$pLoopRestoration, value);
    }

    public @Nullable StdVideoAV1LoopRestoration pLoopRestoration() {
        MemorySegment s = pLoopRestorationRaw();
        if (s.address() == 0) {
            return null;
        }
        return new StdVideoAV1LoopRestoration(s);
    }

    public void pLoopRestoration(@Nullable StdVideoAV1LoopRestoration value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pLoopRestorationRaw(s);
    }

    @unsafe public @Nullable StdVideoAV1LoopRestoration[] pLoopRestoration(int assumedCount) {
        MemorySegment s = pLoopRestorationRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoAV1LoopRestoration.SIZE);
        StdVideoAV1LoopRestoration[] ret = new StdVideoAV1LoopRestoration[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoAV1LoopRestoration(s.asSlice(i * StdVideoAV1LoopRestoration.SIZE, StdVideoAV1LoopRestoration.SIZE));
        }
        return ret;
    }

    public @pointer(comment="StdVideoAV1GlobalMotion*") MemorySegment pGlobalMotionRaw() {
        return segment.get(LAYOUT$pGlobalMotion, OFFSET$pGlobalMotion);
    }

    public void pGlobalMotionRaw(@pointer(comment="StdVideoAV1GlobalMotion*") MemorySegment value) {
        segment.set(LAYOUT$pGlobalMotion, OFFSET$pGlobalMotion, value);
    }

    public @Nullable StdVideoAV1GlobalMotion pGlobalMotion() {
        MemorySegment s = pGlobalMotionRaw();
        if (s.address() == 0) {
            return null;
        }
        return new StdVideoAV1GlobalMotion(s);
    }

    public void pGlobalMotion(@Nullable StdVideoAV1GlobalMotion value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pGlobalMotionRaw(s);
    }

    @unsafe public @Nullable StdVideoAV1GlobalMotion[] pGlobalMotion(int assumedCount) {
        MemorySegment s = pGlobalMotionRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoAV1GlobalMotion.SIZE);
        StdVideoAV1GlobalMotion[] ret = new StdVideoAV1GlobalMotion[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoAV1GlobalMotion(s.asSlice(i * StdVideoAV1GlobalMotion.SIZE, StdVideoAV1GlobalMotion.SIZE));
        }
        return ret;
    }

    public @pointer(comment="StdVideoEncodeAV1ExtensionHeader*") MemorySegment pExtensionHeaderRaw() {
        return segment.get(LAYOUT$pExtensionHeader, OFFSET$pExtensionHeader);
    }

    public void pExtensionHeaderRaw(@pointer(comment="StdVideoEncodeAV1ExtensionHeader*") MemorySegment value) {
        segment.set(LAYOUT$pExtensionHeader, OFFSET$pExtensionHeader, value);
    }

    public @Nullable StdVideoEncodeAV1ExtensionHeader pExtensionHeader() {
        MemorySegment s = pExtensionHeaderRaw();
        if (s.address() == 0) {
            return null;
        }
        return new StdVideoEncodeAV1ExtensionHeader(s);
    }

    public void pExtensionHeader(@Nullable StdVideoEncodeAV1ExtensionHeader value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pExtensionHeaderRaw(s);
    }

    @unsafe public @Nullable StdVideoEncodeAV1ExtensionHeader[] pExtensionHeader(int assumedCount) {
        MemorySegment s = pExtensionHeaderRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoEncodeAV1ExtensionHeader.SIZE);
        StdVideoEncodeAV1ExtensionHeader[] ret = new StdVideoEncodeAV1ExtensionHeader[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoEncodeAV1ExtensionHeader(s.asSlice(i * StdVideoEncodeAV1ExtensionHeader.SIZE, StdVideoEncodeAV1ExtensionHeader.SIZE));
        }
        return ret;
    }

    public @pointer(comment="int*") MemorySegment pBufferRemovalTimesRaw() {
        return segment.get(LAYOUT$pBufferRemovalTimes, OFFSET$pBufferRemovalTimes);
    }

    public void pBufferRemovalTimesRaw(@pointer(comment="int*") MemorySegment value) {
        segment.set(LAYOUT$pBufferRemovalTimes, OFFSET$pBufferRemovalTimes, value);
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @unsigned IntPtr pBufferRemovalTimes() {
        MemorySegment s = pBufferRemovalTimesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new IntPtr(s);
    }

    public void pBufferRemovalTimes(@Nullable @unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pBufferRemovalTimesRaw(s);
    }

}
