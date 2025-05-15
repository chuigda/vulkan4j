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

public record StdVideoH265HrdParameters(@NotNull MemorySegment segment) implements IPointer {
    public static final StructLayout LAYOUT$flags = StdVideoH265HrdFlags.LAYOUT.withName("flags");
    public static final OfByte LAYOUT$tick_divisor_minus2 = ValueLayout.JAVA_BYTE.withName("tick_divisor_minus2");
    public static final OfByte LAYOUT$du_cpb_removal_delay_increment_length_minus1 = ValueLayout.JAVA_BYTE.withName("du_cpb_removal_delay_increment_length_minus1");
    public static final OfByte LAYOUT$dpb_output_delay_du_length_minus1 = ValueLayout.JAVA_BYTE.withName("dpb_output_delay_du_length_minus1");
    public static final OfByte LAYOUT$bit_rate_scale = ValueLayout.JAVA_BYTE.withName("bit_rate_scale");
    public static final OfByte LAYOUT$cpb_size_scale = ValueLayout.JAVA_BYTE.withName("cpb_size_scale");
    public static final OfByte LAYOUT$cpb_size_du_scale = ValueLayout.JAVA_BYTE.withName("cpb_size_du_scale");
    public static final OfByte LAYOUT$initial_cpb_removal_delay_length_minus1 = ValueLayout.JAVA_BYTE.withName("initial_cpb_removal_delay_length_minus1");
    public static final OfByte LAYOUT$au_cpb_removal_delay_length_minus1 = ValueLayout.JAVA_BYTE.withName("au_cpb_removal_delay_length_minus1");
    public static final OfByte LAYOUT$dpb_output_delay_length_minus1 = ValueLayout.JAVA_BYTE.withName("dpb_output_delay_length_minus1");
    public static final OfByte LAYOUT$cpb_cnt_minus1 = ValueLayout.JAVA_BYTE.withName("cpb_cnt_minus1");
    public static final OfShort LAYOUT$elemental_duration_in_tc_minus1 = ValueLayout.JAVA_SHORT.withName("elemental_duration_in_tc_minus1");
    public static final OfShort LAYOUT$reserved = ValueLayout.JAVA_SHORT.withName("reserved");
    public static final AddressLayout LAYOUT$pSubLayerHrdParametersNal = ValueLayout.ADDRESS.withTargetLayout(StdVideoH265SubLayerHrdParameters.LAYOUT).withName("pSubLayerHrdParametersNal");
    public static final AddressLayout LAYOUT$pSubLayerHrdParametersVcl = ValueLayout.ADDRESS.withTargetLayout(StdVideoH265SubLayerHrdParameters.LAYOUT).withName("pSubLayerHrdParametersVcl");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$flags, LAYOUT$tick_divisor_minus2, LAYOUT$du_cpb_removal_delay_increment_length_minus1, LAYOUT$dpb_output_delay_du_length_minus1, LAYOUT$bit_rate_scale, LAYOUT$cpb_size_scale, LAYOUT$cpb_size_du_scale, LAYOUT$initial_cpb_removal_delay_length_minus1, LAYOUT$au_cpb_removal_delay_length_minus1, LAYOUT$dpb_output_delay_length_minus1, LAYOUT$cpb_cnt_minus1, LAYOUT$elemental_duration_in_tc_minus1, LAYOUT$reserved, LAYOUT$pSubLayerHrdParametersNal, LAYOUT$pSubLayerHrdParametersVcl);
    public static final long SIZE = LAYOUT.byteSize();

    public static StdVideoH265HrdParameters allocate(Arena arena) {
        return new StdVideoH265HrdParameters(arena.allocate(LAYOUT));
    }

    public static StdVideoH265HrdParameters[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH265HrdParameters[] ret = new StdVideoH265HrdParameters[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoH265HrdParameters(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static StdVideoH265HrdParameters clone(Arena arena, StdVideoH265HrdParameters src) {
        StdVideoH265HrdParameters ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoH265HrdParameters[] clone(Arena arena, StdVideoH265HrdParameters[] src) {
        StdVideoH265HrdParameters[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$tick_divisor_minus2 = PathElement.groupElement("PATH$tick_divisor_minus2");
    public static final PathElement PATH$du_cpb_removal_delay_increment_length_minus1 = PathElement.groupElement("PATH$du_cpb_removal_delay_increment_length_minus1");
    public static final PathElement PATH$dpb_output_delay_du_length_minus1 = PathElement.groupElement("PATH$dpb_output_delay_du_length_minus1");
    public static final PathElement PATH$bit_rate_scale = PathElement.groupElement("PATH$bit_rate_scale");
    public static final PathElement PATH$cpb_size_scale = PathElement.groupElement("PATH$cpb_size_scale");
    public static final PathElement PATH$cpb_size_du_scale = PathElement.groupElement("PATH$cpb_size_du_scale");
    public static final PathElement PATH$initial_cpb_removal_delay_length_minus1 = PathElement.groupElement("PATH$initial_cpb_removal_delay_length_minus1");
    public static final PathElement PATH$au_cpb_removal_delay_length_minus1 = PathElement.groupElement("PATH$au_cpb_removal_delay_length_minus1");
    public static final PathElement PATH$dpb_output_delay_length_minus1 = PathElement.groupElement("PATH$dpb_output_delay_length_minus1");
    public static final PathElement PATH$cpb_cnt_minus1 = PathElement.groupElement("PATH$cpb_cnt_minus1");
    public static final PathElement PATH$elemental_duration_in_tc_minus1 = PathElement.groupElement("PATH$elemental_duration_in_tc_minus1");
    public static final PathElement PATH$reserved = PathElement.groupElement("PATH$reserved");
    public static final PathElement PATH$pSubLayerHrdParametersNal = PathElement.groupElement("PATH$pSubLayerHrdParametersNal");
    public static final PathElement PATH$pSubLayerHrdParametersVcl = PathElement.groupElement("PATH$pSubLayerHrdParametersVcl");

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$tick_divisor_minus2 = LAYOUT$tick_divisor_minus2.byteSize();
    public static final long SIZE$du_cpb_removal_delay_increment_length_minus1 = LAYOUT$du_cpb_removal_delay_increment_length_minus1.byteSize();
    public static final long SIZE$dpb_output_delay_du_length_minus1 = LAYOUT$dpb_output_delay_du_length_minus1.byteSize();
    public static final long SIZE$bit_rate_scale = LAYOUT$bit_rate_scale.byteSize();
    public static final long SIZE$cpb_size_scale = LAYOUT$cpb_size_scale.byteSize();
    public static final long SIZE$cpb_size_du_scale = LAYOUT$cpb_size_du_scale.byteSize();
    public static final long SIZE$initial_cpb_removal_delay_length_minus1 = LAYOUT$initial_cpb_removal_delay_length_minus1.byteSize();
    public static final long SIZE$au_cpb_removal_delay_length_minus1 = LAYOUT$au_cpb_removal_delay_length_minus1.byteSize();
    public static final long SIZE$dpb_output_delay_length_minus1 = LAYOUT$dpb_output_delay_length_minus1.byteSize();
    public static final long SIZE$cpb_cnt_minus1 = LAYOUT$cpb_cnt_minus1.byteSize();
    public static final long SIZE$elemental_duration_in_tc_minus1 = LAYOUT$elemental_duration_in_tc_minus1.byteSize();
    public static final long SIZE$reserved = LAYOUT$reserved.byteSize();
    public static final long SIZE$pSubLayerHrdParametersNal = LAYOUT$pSubLayerHrdParametersNal.byteSize();
    public static final long SIZE$pSubLayerHrdParametersVcl = LAYOUT$pSubLayerHrdParametersVcl.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$tick_divisor_minus2 = LAYOUT.byteOffset(PATH$tick_divisor_minus2);
    public static final long OFFSET$du_cpb_removal_delay_increment_length_minus1 = LAYOUT.byteOffset(PATH$du_cpb_removal_delay_increment_length_minus1);
    public static final long OFFSET$dpb_output_delay_du_length_minus1 = LAYOUT.byteOffset(PATH$dpb_output_delay_du_length_minus1);
    public static final long OFFSET$bit_rate_scale = LAYOUT.byteOffset(PATH$bit_rate_scale);
    public static final long OFFSET$cpb_size_scale = LAYOUT.byteOffset(PATH$cpb_size_scale);
    public static final long OFFSET$cpb_size_du_scale = LAYOUT.byteOffset(PATH$cpb_size_du_scale);
    public static final long OFFSET$initial_cpb_removal_delay_length_minus1 = LAYOUT.byteOffset(PATH$initial_cpb_removal_delay_length_minus1);
    public static final long OFFSET$au_cpb_removal_delay_length_minus1 = LAYOUT.byteOffset(PATH$au_cpb_removal_delay_length_minus1);
    public static final long OFFSET$dpb_output_delay_length_minus1 = LAYOUT.byteOffset(PATH$dpb_output_delay_length_minus1);
    public static final long OFFSET$cpb_cnt_minus1 = LAYOUT.byteOffset(PATH$cpb_cnt_minus1);
    public static final long OFFSET$elemental_duration_in_tc_minus1 = LAYOUT.byteOffset(PATH$elemental_duration_in_tc_minus1);
    public static final long OFFSET$reserved = LAYOUT.byteOffset(PATH$reserved);
    public static final long OFFSET$pSubLayerHrdParametersNal = LAYOUT.byteOffset(PATH$pSubLayerHrdParametersNal);
    public static final long OFFSET$pSubLayerHrdParametersVcl = LAYOUT.byteOffset(PATH$pSubLayerHrdParametersVcl);

    public StdVideoH265HrdFlags flags() {
        return new StdVideoH265HrdFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(StdVideoH265HrdFlags value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$flags, SIZE$flags);
    }

    public @unsigned byte tick_divisor_minus2() {
        return segment.get(LAYOUT$tick_divisor_minus2, OFFSET$tick_divisor_minus2);
    }

    public void tick_divisor_minus2(@unsigned byte value) {
        segment.set(LAYOUT$tick_divisor_minus2, OFFSET$tick_divisor_minus2, value);
    }

    public @unsigned byte du_cpb_removal_delay_increment_length_minus1() {
        return segment.get(LAYOUT$du_cpb_removal_delay_increment_length_minus1, OFFSET$du_cpb_removal_delay_increment_length_minus1);
    }

    public void du_cpb_removal_delay_increment_length_minus1(@unsigned byte value) {
        segment.set(LAYOUT$du_cpb_removal_delay_increment_length_minus1, OFFSET$du_cpb_removal_delay_increment_length_minus1, value);
    }

    public @unsigned byte dpb_output_delay_du_length_minus1() {
        return segment.get(LAYOUT$dpb_output_delay_du_length_minus1, OFFSET$dpb_output_delay_du_length_minus1);
    }

    public void dpb_output_delay_du_length_minus1(@unsigned byte value) {
        segment.set(LAYOUT$dpb_output_delay_du_length_minus1, OFFSET$dpb_output_delay_du_length_minus1, value);
    }

    public @unsigned byte bit_rate_scale() {
        return segment.get(LAYOUT$bit_rate_scale, OFFSET$bit_rate_scale);
    }

    public void bit_rate_scale(@unsigned byte value) {
        segment.set(LAYOUT$bit_rate_scale, OFFSET$bit_rate_scale, value);
    }

    public @unsigned byte cpb_size_scale() {
        return segment.get(LAYOUT$cpb_size_scale, OFFSET$cpb_size_scale);
    }

    public void cpb_size_scale(@unsigned byte value) {
        segment.set(LAYOUT$cpb_size_scale, OFFSET$cpb_size_scale, value);
    }

    public @unsigned byte cpb_size_du_scale() {
        return segment.get(LAYOUT$cpb_size_du_scale, OFFSET$cpb_size_du_scale);
    }

    public void cpb_size_du_scale(@unsigned byte value) {
        segment.set(LAYOUT$cpb_size_du_scale, OFFSET$cpb_size_du_scale, value);
    }

    public @unsigned byte initial_cpb_removal_delay_length_minus1() {
        return segment.get(LAYOUT$initial_cpb_removal_delay_length_minus1, OFFSET$initial_cpb_removal_delay_length_minus1);
    }

    public void initial_cpb_removal_delay_length_minus1(@unsigned byte value) {
        segment.set(LAYOUT$initial_cpb_removal_delay_length_minus1, OFFSET$initial_cpb_removal_delay_length_minus1, value);
    }

    public @unsigned byte au_cpb_removal_delay_length_minus1() {
        return segment.get(LAYOUT$au_cpb_removal_delay_length_minus1, OFFSET$au_cpb_removal_delay_length_minus1);
    }

    public void au_cpb_removal_delay_length_minus1(@unsigned byte value) {
        segment.set(LAYOUT$au_cpb_removal_delay_length_minus1, OFFSET$au_cpb_removal_delay_length_minus1, value);
    }

    public @unsigned byte dpb_output_delay_length_minus1() {
        return segment.get(LAYOUT$dpb_output_delay_length_minus1, OFFSET$dpb_output_delay_length_minus1);
    }

    public void dpb_output_delay_length_minus1(@unsigned byte value) {
        segment.set(LAYOUT$dpb_output_delay_length_minus1, OFFSET$dpb_output_delay_length_minus1, value);
    }

    public @unsigned byte cpb_cnt_minus1() {
        return segment.get(LAYOUT$cpb_cnt_minus1, OFFSET$cpb_cnt_minus1);
    }

    public void cpb_cnt_minus1(@unsigned byte value) {
        segment.set(LAYOUT$cpb_cnt_minus1, OFFSET$cpb_cnt_minus1, value);
    }

    public @unsigned short elemental_duration_in_tc_minus1() {
        return segment.get(LAYOUT$elemental_duration_in_tc_minus1, OFFSET$elemental_duration_in_tc_minus1);
    }

    public void elemental_duration_in_tc_minus1(@unsigned short value) {
        segment.set(LAYOUT$elemental_duration_in_tc_minus1, OFFSET$elemental_duration_in_tc_minus1, value);
    }

    public @unsigned short reserved() {
        return segment.get(LAYOUT$reserved, OFFSET$reserved);
    }

    public void reserved(@unsigned short value) {
        segment.set(LAYOUT$reserved, OFFSET$reserved, value);
    }

    public @pointer(comment="StdVideoH265SubLayerHrdParameters*") MemorySegment pSubLayerHrdParametersNalRaw() {
        return segment.get(LAYOUT$pSubLayerHrdParametersNal, OFFSET$pSubLayerHrdParametersNal);
    }

    public void pSubLayerHrdParametersNalRaw(@pointer(comment="StdVideoH265SubLayerHrdParameters*") MemorySegment value) {
        segment.set(LAYOUT$pSubLayerHrdParametersNal, OFFSET$pSubLayerHrdParametersNal, value);
    }

    public @Nullable StdVideoH265SubLayerHrdParameters pSubLayerHrdParametersNal() {
        MemorySegment s = pSubLayerHrdParametersNalRaw();
        if (s.address() == 0) {
            return null;
        }
        return new StdVideoH265SubLayerHrdParameters(s);
    }

    public void pSubLayerHrdParametersNal(@Nullable StdVideoH265SubLayerHrdParameters value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSubLayerHrdParametersNalRaw(s);
    }

    @unsafe public @Nullable StdVideoH265SubLayerHrdParameters[] pSubLayerHrdParametersNal(int assumedCount) {
        MemorySegment s = pSubLayerHrdParametersNalRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoH265SubLayerHrdParameters.SIZE);
        StdVideoH265SubLayerHrdParameters[] ret = new StdVideoH265SubLayerHrdParameters[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoH265SubLayerHrdParameters(s.asSlice(i * StdVideoH265SubLayerHrdParameters.SIZE, StdVideoH265SubLayerHrdParameters.SIZE));
        }
        return ret;
    }

    public @pointer(comment="StdVideoH265SubLayerHrdParameters*") MemorySegment pSubLayerHrdParametersVclRaw() {
        return segment.get(LAYOUT$pSubLayerHrdParametersVcl, OFFSET$pSubLayerHrdParametersVcl);
    }

    public void pSubLayerHrdParametersVclRaw(@pointer(comment="StdVideoH265SubLayerHrdParameters*") MemorySegment value) {
        segment.set(LAYOUT$pSubLayerHrdParametersVcl, OFFSET$pSubLayerHrdParametersVcl, value);
    }

    public @Nullable StdVideoH265SubLayerHrdParameters pSubLayerHrdParametersVcl() {
        MemorySegment s = pSubLayerHrdParametersVclRaw();
        if (s.address() == 0) {
            return null;
        }
        return new StdVideoH265SubLayerHrdParameters(s);
    }

    public void pSubLayerHrdParametersVcl(@Nullable StdVideoH265SubLayerHrdParameters value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSubLayerHrdParametersVclRaw(s);
    }

    @unsafe public @Nullable StdVideoH265SubLayerHrdParameters[] pSubLayerHrdParametersVcl(int assumedCount) {
        MemorySegment s = pSubLayerHrdParametersVclRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * StdVideoH265SubLayerHrdParameters.SIZE);
        StdVideoH265SubLayerHrdParameters[] ret = new StdVideoH265SubLayerHrdParameters[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new StdVideoH265SubLayerHrdParameters(s.asSlice(i * StdVideoH265SubLayerHrdParameters.SIZE, StdVideoH265SubLayerHrdParameters.SIZE));
        }
        return ret;
    }

}
/// dummy, not implemented yet
