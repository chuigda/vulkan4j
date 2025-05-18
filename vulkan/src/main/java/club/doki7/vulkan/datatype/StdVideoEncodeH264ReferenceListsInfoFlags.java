package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.bits.BitfieldUtil;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a {@code StdVideoEncodeH264ReferenceListsInfoFlags} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoEncodeH264ReferenceListsInfoFlags {
///     uint32_t ref_pic_list_modification_flag_l0 : 1; // @link substring="ref_pic_list_modification_flag_l0" target="#ref_pic_list_modification_flag_l0"
///     uint32_t ref_pic_list_modification_flag_l1 : 1; // @link substring="ref_pic_list_modification_flag_l1" target="#ref_pic_list_modification_flag_l1"
///     uint32_t reserved : 30;
/// } StdVideoEncodeH264ReferenceListsInfoFlags;
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
public record StdVideoEncodeH264ReferenceListsInfoFlags(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoEncodeH264ReferenceListsInfoFlags allocate(Arena arena) {
        StdVideoEncodeH264ReferenceListsInfoFlags ret = new StdVideoEncodeH264ReferenceListsInfoFlags(arena.allocate(LAYOUT));
        return ret;
    }

    public static StdVideoEncodeH264ReferenceListsInfoFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeH264ReferenceListsInfoFlags[] ret = new StdVideoEncodeH264ReferenceListsInfoFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoEncodeH264ReferenceListsInfoFlags(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoEncodeH264ReferenceListsInfoFlags clone(Arena arena, StdVideoEncodeH264ReferenceListsInfoFlags src) {
        StdVideoEncodeH264ReferenceListsInfoFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoEncodeH264ReferenceListsInfoFlags[] clone(Arena arena, StdVideoEncodeH264ReferenceListsInfoFlags[] src) {
        StdVideoEncodeH264ReferenceListsInfoFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public boolean ref_pic_list_modification_flag_l0() {
        MemorySegment s = segment.asSlice(OFFSET$ref_pic_list_modification_flag_l0_reserved, LAYOUT$ref_pic_list_modification_flag_l0_reserved);
        return BitfieldUtil.readBit(s, 0);
    }

    public void ref_pic_list_modification_flag_l0(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$ref_pic_list_modification_flag_l0_reserved, LAYOUT$ref_pic_list_modification_flag_l0_reserved);
        BitfieldUtil.writeBit(s, 0, value);
    }

    public boolean ref_pic_list_modification_flag_l1() {
        MemorySegment s = segment.asSlice(OFFSET$ref_pic_list_modification_flag_l0_reserved, LAYOUT$ref_pic_list_modification_flag_l0_reserved);
        return BitfieldUtil.readBit(s, 1);
    }

    public void ref_pic_list_modification_flag_l1(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$ref_pic_list_modification_flag_l0_reserved, LAYOUT$ref_pic_list_modification_flag_l0_reserved);
        BitfieldUtil.writeBit(s, 1, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bitfield$ref_pic_list_modification_flag_l0_reserved")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bitfield$ref_pic_list_modification_flag_l0_reserved = PathElement.groupElement("PATH$bitfield$ref_pic_list_modification_flag_l0_reserved");

    public static final OfInt LAYOUT$ref_pic_list_modification_flag_l0_reserved = (OfInt) LAYOUT.select(PATH$bitfield$ref_pic_list_modification_flag_l0_reserved);


    public static final long OFFSET$ref_pic_list_modification_flag_l0_reserved = LAYOUT.byteOffset(PATH$bitfield$ref_pic_list_modification_flag_l0_reserved);
}
