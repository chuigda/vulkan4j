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

/// Represents a pointer to a {@code StdVideoH265VideoParameterSet} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoH265VideoParameterSet {
///     StdVideoH265VpsFlags flags;
///     uint8_t vps_video_parameter_set_id;
///     uint8_t vps_max_sub_layers_minus1;
///     uint8_t reserved1;
///     uint8_t reserved2;
///     uint32_t vps_num_units_in_tick;
///     uint32_t vps_time_scale;
///     uint32_t vps_num_ticks_poc_diff_one_minus1;
///     uint32_t reserved3;
///     StdVideoH265DecPicBufMgr const* pDecPicBufMgr;
///     StdVideoH265HrdParameters const* pHrdParameters;
///     StdVideoH265ProfileTierLevel const* pProfileTierLevel;
/// } StdVideoH265VideoParameterSet;
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
@ValueBasedCandidate
@UnsafeConstructor
public record StdVideoH265VideoParameterSet(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoH265VideoParameterSet allocate(Arena arena) {
        StdVideoH265VideoParameterSet ret = new StdVideoH265VideoParameterSet(arena.allocate(LAYOUT));
        return ret;
    }

    public static StdVideoH265VideoParameterSet[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH265VideoParameterSet[] ret = new StdVideoH265VideoParameterSet[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoH265VideoParameterSet(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoH265VideoParameterSet clone(Arena arena, StdVideoH265VideoParameterSet src) {
        StdVideoH265VideoParameterSet ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoH265VideoParameterSet[] clone(Arena arena, StdVideoH265VideoParameterSet[] src) {
        StdVideoH265VideoParameterSet[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public StdVideoH265VpsFlags flags() {
        return new StdVideoH265VpsFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(StdVideoH265VpsFlags value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$flags, SIZE$flags);
    }

    public @unsigned byte vps_video_parameter_set_id() {
        return segment.get(LAYOUT$vps_video_parameter_set_id, OFFSET$vps_video_parameter_set_id);
    }

    public void vps_video_parameter_set_id(@unsigned byte value) {
        segment.set(LAYOUT$vps_video_parameter_set_id, OFFSET$vps_video_parameter_set_id, value);
    }

    public @unsigned byte vps_max_sub_layers_minus1() {
        return segment.get(LAYOUT$vps_max_sub_layers_minus1, OFFSET$vps_max_sub_layers_minus1);
    }

    public void vps_max_sub_layers_minus1(@unsigned byte value) {
        segment.set(LAYOUT$vps_max_sub_layers_minus1, OFFSET$vps_max_sub_layers_minus1, value);
    }

    public @unsigned byte reserved1() {
        return segment.get(LAYOUT$reserved1, OFFSET$reserved1);
    }

    public void reserved1(@unsigned byte value) {
        segment.set(LAYOUT$reserved1, OFFSET$reserved1, value);
    }

    public @unsigned byte reserved2() {
        return segment.get(LAYOUT$reserved2, OFFSET$reserved2);
    }

    public void reserved2(@unsigned byte value) {
        segment.set(LAYOUT$reserved2, OFFSET$reserved2, value);
    }

    public @unsigned int vps_num_units_in_tick() {
        return segment.get(LAYOUT$vps_num_units_in_tick, OFFSET$vps_num_units_in_tick);
    }

    public void vps_num_units_in_tick(@unsigned int value) {
        segment.set(LAYOUT$vps_num_units_in_tick, OFFSET$vps_num_units_in_tick, value);
    }

    public @unsigned int vps_time_scale() {
        return segment.get(LAYOUT$vps_time_scale, OFFSET$vps_time_scale);
    }

    public void vps_time_scale(@unsigned int value) {
        segment.set(LAYOUT$vps_time_scale, OFFSET$vps_time_scale, value);
    }

    public @unsigned int vps_num_ticks_poc_diff_one_minus1() {
        return segment.get(LAYOUT$vps_num_ticks_poc_diff_one_minus1, OFFSET$vps_num_ticks_poc_diff_one_minus1);
    }

    public void vps_num_ticks_poc_diff_one_minus1(@unsigned int value) {
        segment.set(LAYOUT$vps_num_ticks_poc_diff_one_minus1, OFFSET$vps_num_ticks_poc_diff_one_minus1, value);
    }

    public @unsigned int reserved3() {
        return segment.get(LAYOUT$reserved3, OFFSET$reserved3);
    }

    public void reserved3(@unsigned int value) {
        segment.set(LAYOUT$reserved3, OFFSET$reserved3, value);
    }

    public @pointer(target=StdVideoH265DecPicBufMgr.class) MemorySegment pDecPicBufMgrRaw() {
        return segment.get(LAYOUT$pDecPicBufMgr, OFFSET$pDecPicBufMgr);
    }

    public void pDecPicBufMgrRaw(@pointer(target=StdVideoH265DecPicBufMgr.class) MemorySegment value) {
        segment.set(LAYOUT$pDecPicBufMgr, OFFSET$pDecPicBufMgr, value);
    }

    public @Nullable StdVideoH265DecPicBufMgr pDecPicBufMgr() {
        MemorySegment s = pDecPicBufMgrRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new StdVideoH265DecPicBufMgr(s);
    }

    public void pDecPicBufMgr(@Nullable StdVideoH265DecPicBufMgr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pDecPicBufMgrRaw(s);
    }

    @unsafe public @Nullable StdVideoH265DecPicBufMgr[] pDecPicBufMgr(int assumedCount) {
        MemorySegment s = pDecPicBufMgrRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoH265DecPicBufMgr.BYTES);
        StdVideoH265DecPicBufMgr[] ret = new StdVideoH265DecPicBufMgr[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoH265DecPicBufMgr(s.asSlice(i * StdVideoH265DecPicBufMgr.BYTES, StdVideoH265DecPicBufMgr.BYTES));
        }
        return ret;
    }

    public @pointer(target=StdVideoH265HrdParameters.class) MemorySegment pHrdParametersRaw() {
        return segment.get(LAYOUT$pHrdParameters, OFFSET$pHrdParameters);
    }

    public void pHrdParametersRaw(@pointer(target=StdVideoH265HrdParameters.class) MemorySegment value) {
        segment.set(LAYOUT$pHrdParameters, OFFSET$pHrdParameters, value);
    }

    public @Nullable StdVideoH265HrdParameters pHrdParameters() {
        MemorySegment s = pHrdParametersRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new StdVideoH265HrdParameters(s);
    }

    public void pHrdParameters(@Nullable StdVideoH265HrdParameters value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pHrdParametersRaw(s);
    }

    @unsafe public @Nullable StdVideoH265HrdParameters[] pHrdParameters(int assumedCount) {
        MemorySegment s = pHrdParametersRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoH265HrdParameters.BYTES);
        StdVideoH265HrdParameters[] ret = new StdVideoH265HrdParameters[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoH265HrdParameters(s.asSlice(i * StdVideoH265HrdParameters.BYTES, StdVideoH265HrdParameters.BYTES));
        }
        return ret;
    }

    public @pointer(target=StdVideoH265ProfileTierLevel.class) MemorySegment pProfileTierLevelRaw() {
        return segment.get(LAYOUT$pProfileTierLevel, OFFSET$pProfileTierLevel);
    }

    public void pProfileTierLevelRaw(@pointer(target=StdVideoH265ProfileTierLevel.class) MemorySegment value) {
        segment.set(LAYOUT$pProfileTierLevel, OFFSET$pProfileTierLevel, value);
    }

    public @Nullable StdVideoH265ProfileTierLevel pProfileTierLevel() {
        MemorySegment s = pProfileTierLevelRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new StdVideoH265ProfileTierLevel(s);
    }

    public void pProfileTierLevel(@Nullable StdVideoH265ProfileTierLevel value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pProfileTierLevelRaw(s);
    }

    @unsafe public @Nullable StdVideoH265ProfileTierLevel[] pProfileTierLevel(int assumedCount) {
        MemorySegment s = pProfileTierLevelRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoH265ProfileTierLevel.BYTES);
        StdVideoH265ProfileTierLevel[] ret = new StdVideoH265ProfileTierLevel[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoH265ProfileTierLevel(s.asSlice(i * StdVideoH265ProfileTierLevel.BYTES, StdVideoH265ProfileTierLevel.BYTES));
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        StdVideoH265VpsFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("vps_video_parameter_set_id"),
        ValueLayout.JAVA_BYTE.withName("vps_max_sub_layers_minus1"),
        ValueLayout.JAVA_BYTE.withName("reserved1"),
        ValueLayout.JAVA_BYTE.withName("reserved2"),
        ValueLayout.JAVA_INT.withName("vps_num_units_in_tick"),
        ValueLayout.JAVA_INT.withName("vps_time_scale"),
        ValueLayout.JAVA_INT.withName("vps_num_ticks_poc_diff_one_minus1"),
        ValueLayout.JAVA_INT.withName("reserved3"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoH265DecPicBufMgr.LAYOUT).withName("pDecPicBufMgr"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoH265HrdParameters.LAYOUT).withName("pHrdParameters"),
        ValueLayout.ADDRESS.withTargetLayout(StdVideoH265ProfileTierLevel.LAYOUT).withName("pProfileTierLevel")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$vps_video_parameter_set_id = PathElement.groupElement("PATH$vps_video_parameter_set_id");
    public static final PathElement PATH$vps_max_sub_layers_minus1 = PathElement.groupElement("PATH$vps_max_sub_layers_minus1");
    public static final PathElement PATH$reserved1 = PathElement.groupElement("PATH$reserved1");
    public static final PathElement PATH$reserved2 = PathElement.groupElement("PATH$reserved2");
    public static final PathElement PATH$vps_num_units_in_tick = PathElement.groupElement("PATH$vps_num_units_in_tick");
    public static final PathElement PATH$vps_time_scale = PathElement.groupElement("PATH$vps_time_scale");
    public static final PathElement PATH$vps_num_ticks_poc_diff_one_minus1 = PathElement.groupElement("PATH$vps_num_ticks_poc_diff_one_minus1");
    public static final PathElement PATH$reserved3 = PathElement.groupElement("PATH$reserved3");
    public static final PathElement PATH$pDecPicBufMgr = PathElement.groupElement("PATH$pDecPicBufMgr");
    public static final PathElement PATH$pHrdParameters = PathElement.groupElement("PATH$pHrdParameters");
    public static final PathElement PATH$pProfileTierLevel = PathElement.groupElement("PATH$pProfileTierLevel");

    public static final StructLayout LAYOUT$flags = (StructLayout) LAYOUT.select(PATH$flags);
    public static final OfByte LAYOUT$vps_video_parameter_set_id = (OfByte) LAYOUT.select(PATH$vps_video_parameter_set_id);
    public static final OfByte LAYOUT$vps_max_sub_layers_minus1 = (OfByte) LAYOUT.select(PATH$vps_max_sub_layers_minus1);
    public static final OfByte LAYOUT$reserved1 = (OfByte) LAYOUT.select(PATH$reserved1);
    public static final OfByte LAYOUT$reserved2 = (OfByte) LAYOUT.select(PATH$reserved2);
    public static final OfInt LAYOUT$vps_num_units_in_tick = (OfInt) LAYOUT.select(PATH$vps_num_units_in_tick);
    public static final OfInt LAYOUT$vps_time_scale = (OfInt) LAYOUT.select(PATH$vps_time_scale);
    public static final OfInt LAYOUT$vps_num_ticks_poc_diff_one_minus1 = (OfInt) LAYOUT.select(PATH$vps_num_ticks_poc_diff_one_minus1);
    public static final OfInt LAYOUT$reserved3 = (OfInt) LAYOUT.select(PATH$reserved3);
    public static final AddressLayout LAYOUT$pDecPicBufMgr = (AddressLayout) LAYOUT.select(PATH$pDecPicBufMgr);
    public static final AddressLayout LAYOUT$pHrdParameters = (AddressLayout) LAYOUT.select(PATH$pHrdParameters);
    public static final AddressLayout LAYOUT$pProfileTierLevel = (AddressLayout) LAYOUT.select(PATH$pProfileTierLevel);

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$vps_video_parameter_set_id = LAYOUT$vps_video_parameter_set_id.byteSize();
    public static final long SIZE$vps_max_sub_layers_minus1 = LAYOUT$vps_max_sub_layers_minus1.byteSize();
    public static final long SIZE$reserved1 = LAYOUT$reserved1.byteSize();
    public static final long SIZE$reserved2 = LAYOUT$reserved2.byteSize();
    public static final long SIZE$vps_num_units_in_tick = LAYOUT$vps_num_units_in_tick.byteSize();
    public static final long SIZE$vps_time_scale = LAYOUT$vps_time_scale.byteSize();
    public static final long SIZE$vps_num_ticks_poc_diff_one_minus1 = LAYOUT$vps_num_ticks_poc_diff_one_minus1.byteSize();
    public static final long SIZE$reserved3 = LAYOUT$reserved3.byteSize();
    public static final long SIZE$pDecPicBufMgr = LAYOUT$pDecPicBufMgr.byteSize();
    public static final long SIZE$pHrdParameters = LAYOUT$pHrdParameters.byteSize();
    public static final long SIZE$pProfileTierLevel = LAYOUT$pProfileTierLevel.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$vps_video_parameter_set_id = LAYOUT.byteOffset(PATH$vps_video_parameter_set_id);
    public static final long OFFSET$vps_max_sub_layers_minus1 = LAYOUT.byteOffset(PATH$vps_max_sub_layers_minus1);
    public static final long OFFSET$reserved1 = LAYOUT.byteOffset(PATH$reserved1);
    public static final long OFFSET$reserved2 = LAYOUT.byteOffset(PATH$reserved2);
    public static final long OFFSET$vps_num_units_in_tick = LAYOUT.byteOffset(PATH$vps_num_units_in_tick);
    public static final long OFFSET$vps_time_scale = LAYOUT.byteOffset(PATH$vps_time_scale);
    public static final long OFFSET$vps_num_ticks_poc_diff_one_minus1 = LAYOUT.byteOffset(PATH$vps_num_ticks_poc_diff_one_minus1);
    public static final long OFFSET$reserved3 = LAYOUT.byteOffset(PATH$reserved3);
    public static final long OFFSET$pDecPicBufMgr = LAYOUT.byteOffset(PATH$pDecPicBufMgr);
    public static final long OFFSET$pHrdParameters = LAYOUT.byteOffset(PATH$pHrdParameters);
    public static final long OFFSET$pProfileTierLevel = LAYOUT.byteOffset(PATH$pProfileTierLevel);
}
