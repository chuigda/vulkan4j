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

/// Represents a pointer to a {@code StdVideoH265SubLayerHrdParameters} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoH265SubLayerHrdParameters {
///     uint32_t bit_rate_value_minus1; // @link substring="bit_rate_value_minus1" target="#bit_rate_value_minus1"
///     uint32_t cpb_size_value_minus1; // @link substring="cpb_size_value_minus1" target="#cpb_size_value_minus1"
///     uint32_t cpb_size_du_value_minus1; // @link substring="cpb_size_du_value_minus1" target="#cpb_size_du_value_minus1"
///     uint32_t bit_rate_du_value_minus1; // @link substring="bit_rate_du_value_minus1" target="#bit_rate_du_value_minus1"
///     uint32_t cbr_flag; // @link substring="cbr_flag" target="#cbr_flag"
/// } StdVideoH265SubLayerHrdParameters;
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
public record StdVideoH265SubLayerHrdParameters(@NotNull MemorySegment segment) implements IStdVideoH265SubLayerHrdParameters {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link StdVideoH265SubLayerHrdParameters}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IStdVideoH265SubLayerHrdParameters to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code StdVideoH265SubLayerHrdParameters.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IStdVideoH265SubLayerHrdParameters {
        public long size() {
            return segment.byteSize() / StdVideoH265SubLayerHrdParameters.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull StdVideoH265SubLayerHrdParameters at(long index) {
            return new StdVideoH265SubLayerHrdParameters(segment.asSlice(index * StdVideoH265SubLayerHrdParameters.BYTES, StdVideoH265SubLayerHrdParameters.BYTES));
        }
        public void write(long index, @NotNull StdVideoH265SubLayerHrdParameters value) {
            MemorySegment s = segment.asSlice(index * StdVideoH265SubLayerHrdParameters.BYTES, StdVideoH265SubLayerHrdParameters.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static StdVideoH265SubLayerHrdParameters allocate(Arena arena) {
        return new StdVideoH265SubLayerHrdParameters(arena.allocate(LAYOUT));
    }

    public static StdVideoH265SubLayerHrdParameters.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH265SubLayerHrdParameters.Ptr ret = new StdVideoH265SubLayerHrdParameters.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static StdVideoH265SubLayerHrdParameters clone(Arena arena, StdVideoH265SubLayerHrdParameters src) {
        StdVideoH265SubLayerHrdParameters ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @unsigned int bit_rate_value_minus1() {
        return segment.get(LAYOUT$bit_rate_value_minus1, OFFSET$bit_rate_value_minus1);
    }

    public void bit_rate_value_minus1(@unsigned int value) {
        segment.set(LAYOUT$bit_rate_value_minus1, OFFSET$bit_rate_value_minus1, value);
    }

    public @unsigned int cpb_size_value_minus1() {
        return segment.get(LAYOUT$cpb_size_value_minus1, OFFSET$cpb_size_value_minus1);
    }

    public void cpb_size_value_minus1(@unsigned int value) {
        segment.set(LAYOUT$cpb_size_value_minus1, OFFSET$cpb_size_value_minus1, value);
    }

    public @unsigned int cpb_size_du_value_minus1() {
        return segment.get(LAYOUT$cpb_size_du_value_minus1, OFFSET$cpb_size_du_value_minus1);
    }

    public void cpb_size_du_value_minus1(@unsigned int value) {
        segment.set(LAYOUT$cpb_size_du_value_minus1, OFFSET$cpb_size_du_value_minus1, value);
    }

    public @unsigned int bit_rate_du_value_minus1() {
        return segment.get(LAYOUT$bit_rate_du_value_minus1, OFFSET$bit_rate_du_value_minus1);
    }

    public void bit_rate_du_value_minus1(@unsigned int value) {
        segment.set(LAYOUT$bit_rate_du_value_minus1, OFFSET$bit_rate_du_value_minus1, value);
    }

    public @unsigned int cbr_flag() {
        return segment.get(LAYOUT$cbr_flag, OFFSET$cbr_flag);
    }

    public void cbr_flag(@unsigned int value) {
        segment.set(LAYOUT$cbr_flag, OFFSET$cbr_flag, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bit_rate_value_minus1"),
        ValueLayout.JAVA_INT.withName("cpb_size_value_minus1"),
        ValueLayout.JAVA_INT.withName("cpb_size_du_value_minus1"),
        ValueLayout.JAVA_INT.withName("bit_rate_du_value_minus1"),
        ValueLayout.JAVA_INT.withName("cbr_flag")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bit_rate_value_minus1 = PathElement.groupElement("bit_rate_value_minus1");
    public static final PathElement PATH$cpb_size_value_minus1 = PathElement.groupElement("cpb_size_value_minus1");
    public static final PathElement PATH$cpb_size_du_value_minus1 = PathElement.groupElement("cpb_size_du_value_minus1");
    public static final PathElement PATH$bit_rate_du_value_minus1 = PathElement.groupElement("bit_rate_du_value_minus1");
    public static final PathElement PATH$cbr_flag = PathElement.groupElement("cbr_flag");

    public static final OfInt LAYOUT$bit_rate_value_minus1 = (OfInt) LAYOUT.select(PATH$bit_rate_value_minus1);
    public static final OfInt LAYOUT$cpb_size_value_minus1 = (OfInt) LAYOUT.select(PATH$cpb_size_value_minus1);
    public static final OfInt LAYOUT$cpb_size_du_value_minus1 = (OfInt) LAYOUT.select(PATH$cpb_size_du_value_minus1);
    public static final OfInt LAYOUT$bit_rate_du_value_minus1 = (OfInt) LAYOUT.select(PATH$bit_rate_du_value_minus1);
    public static final OfInt LAYOUT$cbr_flag = (OfInt) LAYOUT.select(PATH$cbr_flag);

    public static final long SIZE$bit_rate_value_minus1 = LAYOUT$bit_rate_value_minus1.byteSize();
    public static final long SIZE$cpb_size_value_minus1 = LAYOUT$cpb_size_value_minus1.byteSize();
    public static final long SIZE$cpb_size_du_value_minus1 = LAYOUT$cpb_size_du_value_minus1.byteSize();
    public static final long SIZE$bit_rate_du_value_minus1 = LAYOUT$bit_rate_du_value_minus1.byteSize();
    public static final long SIZE$cbr_flag = LAYOUT$cbr_flag.byteSize();

    public static final long OFFSET$bit_rate_value_minus1 = LAYOUT.byteOffset(PATH$bit_rate_value_minus1);
    public static final long OFFSET$cpb_size_value_minus1 = LAYOUT.byteOffset(PATH$cpb_size_value_minus1);
    public static final long OFFSET$cpb_size_du_value_minus1 = LAYOUT.byteOffset(PATH$cpb_size_du_value_minus1);
    public static final long OFFSET$bit_rate_du_value_minus1 = LAYOUT.byteOffset(PATH$bit_rate_du_value_minus1);
    public static final long OFFSET$cbr_flag = LAYOUT.byteOffset(PATH$cbr_flag);
}
