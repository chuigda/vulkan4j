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

/// Represents a pointer to a {@code StdVideoEncodeH265ReferenceListsInfo} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoEncodeH265ReferenceListsInfo {
///     StdVideoEncodeH265ReferenceListsInfoFlags flags;
///     uint8_t num_ref_idx_l0_active_minus1;
///     uint8_t num_ref_idx_l1_active_minus1;
///     uint8_t RefPicList0;
///     uint8_t RefPicList1;
///     uint8_t list_entry_l0;
///     uint8_t list_entry_l1;
/// } StdVideoEncodeH265ReferenceListsInfo;
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
public record StdVideoEncodeH265ReferenceListsInfo(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoEncodeH265ReferenceListsInfo allocate(Arena arena) {
        StdVideoEncodeH265ReferenceListsInfo ret = new StdVideoEncodeH265ReferenceListsInfo(arena.allocate(LAYOUT));
        return ret;
    }

    public static StdVideoEncodeH265ReferenceListsInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeH265ReferenceListsInfo[] ret = new StdVideoEncodeH265ReferenceListsInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoEncodeH265ReferenceListsInfo(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoEncodeH265ReferenceListsInfo clone(Arena arena, StdVideoEncodeH265ReferenceListsInfo src) {
        StdVideoEncodeH265ReferenceListsInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoEncodeH265ReferenceListsInfo[] clone(Arena arena, StdVideoEncodeH265ReferenceListsInfo[] src) {
        StdVideoEncodeH265ReferenceListsInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public StdVideoEncodeH265ReferenceListsInfoFlags flags() {
        return new StdVideoEncodeH265ReferenceListsInfoFlags(segment.asSlice(OFFSET$flags, LAYOUT$flags));
    }

    public void flags(StdVideoEncodeH265ReferenceListsInfoFlags value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$flags, SIZE$flags);
    }

    public @unsigned byte num_ref_idx_l0_active_minus1() {
        return segment.get(LAYOUT$num_ref_idx_l0_active_minus1, OFFSET$num_ref_idx_l0_active_minus1);
    }

    public void num_ref_idx_l0_active_minus1(@unsigned byte value) {
        segment.set(LAYOUT$num_ref_idx_l0_active_minus1, OFFSET$num_ref_idx_l0_active_minus1, value);
    }

    public @unsigned byte num_ref_idx_l1_active_minus1() {
        return segment.get(LAYOUT$num_ref_idx_l1_active_minus1, OFFSET$num_ref_idx_l1_active_minus1);
    }

    public void num_ref_idx_l1_active_minus1(@unsigned byte value) {
        segment.set(LAYOUT$num_ref_idx_l1_active_minus1, OFFSET$num_ref_idx_l1_active_minus1, value);
    }

    public @unsigned byte RefPicList0() {
        return segment.get(LAYOUT$RefPicList0, OFFSET$RefPicList0);
    }

    public void RefPicList0(@unsigned byte value) {
        segment.set(LAYOUT$RefPicList0, OFFSET$RefPicList0, value);
    }

    public @unsigned byte RefPicList1() {
        return segment.get(LAYOUT$RefPicList1, OFFSET$RefPicList1);
    }

    public void RefPicList1(@unsigned byte value) {
        segment.set(LAYOUT$RefPicList1, OFFSET$RefPicList1, value);
    }

    public @unsigned byte list_entry_l0() {
        return segment.get(LAYOUT$list_entry_l0, OFFSET$list_entry_l0);
    }

    public void list_entry_l0(@unsigned byte value) {
        segment.set(LAYOUT$list_entry_l0, OFFSET$list_entry_l0, value);
    }

    public @unsigned byte list_entry_l1() {
        return segment.get(LAYOUT$list_entry_l1, OFFSET$list_entry_l1);
    }

    public void list_entry_l1(@unsigned byte value) {
        segment.set(LAYOUT$list_entry_l1, OFFSET$list_entry_l1, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        StdVideoEncodeH265ReferenceListsInfoFlags.LAYOUT.withName("flags"),
        ValueLayout.JAVA_BYTE.withName("num_ref_idx_l0_active_minus1"),
        ValueLayout.JAVA_BYTE.withName("num_ref_idx_l1_active_minus1"),
        ValueLayout.JAVA_BYTE.withName("RefPicList0"),
        ValueLayout.JAVA_BYTE.withName("RefPicList1"),
        ValueLayout.JAVA_BYTE.withName("list_entry_l0"),
        ValueLayout.JAVA_BYTE.withName("list_entry_l1")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$num_ref_idx_l0_active_minus1 = PathElement.groupElement("PATH$num_ref_idx_l0_active_minus1");
    public static final PathElement PATH$num_ref_idx_l1_active_minus1 = PathElement.groupElement("PATH$num_ref_idx_l1_active_minus1");
    public static final PathElement PATH$RefPicList0 = PathElement.groupElement("PATH$RefPicList0");
    public static final PathElement PATH$RefPicList1 = PathElement.groupElement("PATH$RefPicList1");
    public static final PathElement PATH$list_entry_l0 = PathElement.groupElement("PATH$list_entry_l0");
    public static final PathElement PATH$list_entry_l1 = PathElement.groupElement("PATH$list_entry_l1");

    public static final StructLayout LAYOUT$flags = (StructLayout) LAYOUT.select(PATH$flags);
    public static final OfByte LAYOUT$num_ref_idx_l0_active_minus1 = (OfByte) LAYOUT.select(PATH$num_ref_idx_l0_active_minus1);
    public static final OfByte LAYOUT$num_ref_idx_l1_active_minus1 = (OfByte) LAYOUT.select(PATH$num_ref_idx_l1_active_minus1);
    public static final OfByte LAYOUT$RefPicList0 = (OfByte) LAYOUT.select(PATH$RefPicList0);
    public static final OfByte LAYOUT$RefPicList1 = (OfByte) LAYOUT.select(PATH$RefPicList1);
    public static final OfByte LAYOUT$list_entry_l0 = (OfByte) LAYOUT.select(PATH$list_entry_l0);
    public static final OfByte LAYOUT$list_entry_l1 = (OfByte) LAYOUT.select(PATH$list_entry_l1);

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$num_ref_idx_l0_active_minus1 = LAYOUT$num_ref_idx_l0_active_minus1.byteSize();
    public static final long SIZE$num_ref_idx_l1_active_minus1 = LAYOUT$num_ref_idx_l1_active_minus1.byteSize();
    public static final long SIZE$RefPicList0 = LAYOUT$RefPicList0.byteSize();
    public static final long SIZE$RefPicList1 = LAYOUT$RefPicList1.byteSize();
    public static final long SIZE$list_entry_l0 = LAYOUT$list_entry_l0.byteSize();
    public static final long SIZE$list_entry_l1 = LAYOUT$list_entry_l1.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$num_ref_idx_l0_active_minus1 = LAYOUT.byteOffset(PATH$num_ref_idx_l0_active_minus1);
    public static final long OFFSET$num_ref_idx_l1_active_minus1 = LAYOUT.byteOffset(PATH$num_ref_idx_l1_active_minus1);
    public static final long OFFSET$RefPicList0 = LAYOUT.byteOffset(PATH$RefPicList0);
    public static final long OFFSET$RefPicList1 = LAYOUT.byteOffset(PATH$RefPicList1);
    public static final long OFFSET$list_entry_l0 = LAYOUT.byteOffset(PATH$list_entry_l0);
    public static final long OFFSET$list_entry_l1 = LAYOUT.byteOffset(PATH$list_entry_l1);
}
