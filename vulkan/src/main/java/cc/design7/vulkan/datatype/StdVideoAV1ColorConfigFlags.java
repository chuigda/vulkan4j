package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.bits.BitfieldUtil;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a {@code StdVideoAV1ColorConfigFlags} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoAV1ColorConfigFlags {
///     uint32_t mono_chrome : 1;
///     uint32_t color_range : 1;
///     uint32_t separate_uv_delta_q : 1;
///     uint32_t color_description_present_flag : 1;
///     uint32_t reserved : 28;
/// } StdVideoAV1ColorConfigFlags;
/// }
///
/// ## Contracts
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
@ValueBasedCandidate
@UnsafeConstructor
public record StdVideoAV1ColorConfigFlags(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoAV1ColorConfigFlags allocate(Arena arena) {
        StdVideoAV1ColorConfigFlags ret = new StdVideoAV1ColorConfigFlags(arena.allocate(LAYOUT));
        return ret;
    }

    public static StdVideoAV1ColorConfigFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoAV1ColorConfigFlags[] ret = new StdVideoAV1ColorConfigFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoAV1ColorConfigFlags(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoAV1ColorConfigFlags clone(Arena arena, StdVideoAV1ColorConfigFlags src) {
        StdVideoAV1ColorConfigFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoAV1ColorConfigFlags[] clone(Arena arena, StdVideoAV1ColorConfigFlags[] src) {
        StdVideoAV1ColorConfigFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public boolean mono_chrome() {
        MemorySegment s = segment.asSlice(OFFSET$mono_chrome_reserved, LAYOUT$mono_chrome_reserved);
        return BitfieldUtil.readBit(s, 0);
    }

    public void mono_chrome(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$mono_chrome_reserved, LAYOUT$mono_chrome_reserved);
        BitfieldUtil.writeBit(s, 0, value);
    }

    public boolean color_range() {
        MemorySegment s = segment.asSlice(OFFSET$mono_chrome_reserved, LAYOUT$mono_chrome_reserved);
        return BitfieldUtil.readBit(s, 1);
    }

    public void color_range(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$mono_chrome_reserved, LAYOUT$mono_chrome_reserved);
        BitfieldUtil.writeBit(s, 1, value);
    }

    public boolean separate_uv_delta_q() {
        MemorySegment s = segment.asSlice(OFFSET$mono_chrome_reserved, LAYOUT$mono_chrome_reserved);
        return BitfieldUtil.readBit(s, 2);
    }

    public void separate_uv_delta_q(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$mono_chrome_reserved, LAYOUT$mono_chrome_reserved);
        BitfieldUtil.writeBit(s, 2, value);
    }

    public boolean color_description_present_flag() {
        MemorySegment s = segment.asSlice(OFFSET$mono_chrome_reserved, LAYOUT$mono_chrome_reserved);
        return BitfieldUtil.readBit(s, 3);
    }

    public void color_description_present_flag(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$mono_chrome_reserved, LAYOUT$mono_chrome_reserved);
        BitfieldUtil.writeBit(s, 3, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bitfield$mono_chrome_reserved")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bitfield$mono_chrome_reserved = PathElement.groupElement("PATH$bitfield$mono_chrome_reserved");

    public static final OfInt LAYOUT$mono_chrome_reserved = (OfInt) LAYOUT.select(PATH$bitfield$mono_chrome_reserved);


    public static final long OFFSET$mono_chrome_reserved = LAYOUT.byteOffset(PATH$bitfield$mono_chrome_reserved);
}
