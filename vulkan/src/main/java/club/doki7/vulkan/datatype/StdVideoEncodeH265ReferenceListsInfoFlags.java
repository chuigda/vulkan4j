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

/// Represents a pointer to a {@code StdVideoEncodeH265ReferenceListsInfoFlags} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoEncodeH265ReferenceListsInfoFlags {
///     uint32_t ref_pic_list_modification_flag_l0 : 1; // @link substring="ref_pic_list_modification_flag_l0" target="#ref_pic_list_modification_flag_l0"
///     uint32_t ref_pic_list_modification_flag_l1 : 1; // @link substring="ref_pic_list_modification_flag_l1" target="#ref_pic_list_modification_flag_l1"
///     uint32_t reserved : 30;
/// } StdVideoEncodeH265ReferenceListsInfoFlags;
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
public record StdVideoEncodeH265ReferenceListsInfoFlags(@NotNull MemorySegment segment) implements IStdVideoEncodeH265ReferenceListsInfoFlags {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link StdVideoEncodeH265ReferenceListsInfoFlags}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IStdVideoEncodeH265ReferenceListsInfoFlags to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code StdVideoEncodeH265ReferenceListsInfoFlags.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IStdVideoEncodeH265ReferenceListsInfoFlags {
        public long size() {
            return segment.byteSize() / StdVideoEncodeH265ReferenceListsInfoFlags.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull StdVideoEncodeH265ReferenceListsInfoFlags at(long index) {
            return new StdVideoEncodeH265ReferenceListsInfoFlags(segment.asSlice(index * StdVideoEncodeH265ReferenceListsInfoFlags.BYTES, StdVideoEncodeH265ReferenceListsInfoFlags.BYTES));
        }
        public void write(long index, @NotNull StdVideoEncodeH265ReferenceListsInfoFlags value) {
            MemorySegment s = segment.asSlice(index * StdVideoEncodeH265ReferenceListsInfoFlags.BYTES, StdVideoEncodeH265ReferenceListsInfoFlags.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static StdVideoEncodeH265ReferenceListsInfoFlags allocate(Arena arena) {
        return new StdVideoEncodeH265ReferenceListsInfoFlags(arena.allocate(LAYOUT));
    }

    public static StdVideoEncodeH265ReferenceListsInfoFlags.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoEncodeH265ReferenceListsInfoFlags.Ptr ret = new StdVideoEncodeH265ReferenceListsInfoFlags.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static StdVideoEncodeH265ReferenceListsInfoFlags clone(Arena arena, StdVideoEncodeH265ReferenceListsInfoFlags src) {
        StdVideoEncodeH265ReferenceListsInfoFlags ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public boolean ref_pic_list_modification_flag_l0() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$ref_pic_list_modification_flag_l0$reserved, LAYOUT$bitfield$ref_pic_list_modification_flag_l0$reserved);
        return BitfieldUtil.readBit(s, 0);
    }

    public void ref_pic_list_modification_flag_l0(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$ref_pic_list_modification_flag_l0$reserved, LAYOUT$bitfield$ref_pic_list_modification_flag_l0$reserved);
        BitfieldUtil.writeBit(s, 0, value);
    }

    public boolean ref_pic_list_modification_flag_l1() {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$ref_pic_list_modification_flag_l0$reserved, LAYOUT$bitfield$ref_pic_list_modification_flag_l0$reserved);
        return BitfieldUtil.readBit(s, 1);
    }

    public void ref_pic_list_modification_flag_l1(boolean value) {
        MemorySegment s = segment.asSlice(OFFSET$bitfield$ref_pic_list_modification_flag_l0$reserved, LAYOUT$bitfield$ref_pic_list_modification_flag_l0$reserved);
        BitfieldUtil.writeBit(s, 1, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bitfield$ref_pic_list_modification_flag_l0$reserved")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bitfield$ref_pic_list_modification_flag_l0$reserved = PathElement.groupElement("ref_pic_list_modification_flag_l0$reserved");

    public static final OfInt LAYOUT$bitfield$ref_pic_list_modification_flag_l0$reserved = (OfInt) LAYOUT.select(PATH$bitfield$ref_pic_list_modification_flag_l0$reserved);


    public static final long OFFSET$bitfield$ref_pic_list_modification_flag_l0$reserved = LAYOUT.byteOffset(PATH$bitfield$ref_pic_list_modification_flag_l0$reserved);
}
