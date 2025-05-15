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

/// Represents a pointer to a {@code StdVideoEncodeH265ReferenceInfoFlags} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoEncodeH265ReferenceInfoFlags {
///     uint32_t used_for_long_term_reference : 1;
///     uint32_t unused_for_reference : 1;
///     uint32_t reserved : 30;
/// } StdVideoEncodeH265ReferenceInfoFlags;
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
public record StdVideoEncodeH265ReferenceInfoFlags(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoEncodeH265ReferenceInfoFlags allocate(Arena arena) {
        StdVideoEncodeH265ReferenceInfoFlags ret = new StdVideoEncodeH265ReferenceInfoFlags(arena.allocate(LAYOUT));
        return ret;
    }

    public static StdVideoEncodeH265ReferenceInfoFlags[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeH265ReferenceInfoFlags[] ret = new StdVideoEncodeH265ReferenceInfoFlags[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoEncodeH265ReferenceInfoFlags(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoEncodeH265ReferenceInfoFlags clone(Arena arena, StdVideoEncodeH265ReferenceInfoFlags src) {
        StdVideoEncodeH265ReferenceInfoFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoEncodeH265ReferenceInfoFlags[] clone(Arena arena, StdVideoEncodeH265ReferenceInfoFlags[] src) {
        StdVideoEncodeH265ReferenceInfoFlags[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public boolean used_for_long_term_reference() {
        MemorySegment s = segment.asSlice(OFFSET$used_for_long_term_reference_reserved, LAYOUT$used_for_long_term_reference_reserved);
        return BitfieldUtil.readBit(s, 0);
    }

    public void used_for_long_term_reference(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$used_for_long_term_reference_reserved, LAYOUT$used_for_long_term_reference_reserved);
        BitfieldUtil.writeBit(s, 0, value);
    }

    public boolean unused_for_reference() {
        MemorySegment s = segment.asSlice(OFFSET$used_for_long_term_reference_reserved, LAYOUT$used_for_long_term_reference_reserved);
        return BitfieldUtil.readBit(s, 1);
    }

    public void unused_for_reference(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$used_for_long_term_reference_reserved, LAYOUT$used_for_long_term_reference_reserved);
        BitfieldUtil.writeBit(s, 1, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bitfield$used_for_long_term_reference_reserved")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bitfield$used_for_long_term_reference_reserved = PathElement.groupElement("PATH$bitfield$used_for_long_term_reference_reserved");

    public static final OfInt LAYOUT$used_for_long_term_reference_reserved = (OfInt) LAYOUT.select(PATH$bitfield$used_for_long_term_reference_reserved);


    public static final long OFFSET$used_for_long_term_reference_reserved = LAYOUT.byteOffset(PATH$bitfield$used_for_long_term_reference_reserved);
}
