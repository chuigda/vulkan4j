package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;

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

/// Represents a pointer to a {@code StdVideoH264ScalingLists} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoH264ScalingLists {
///     uint16_t scaling_list_present_mask; // @link substring="scaling_list_present_mask" target="#scaling_list_present_mask"
///     uint16_t use_default_scaling_matrix_mask; // @link substring="use_default_scaling_matrix_mask" target="#use_default_scaling_matrix_mask"
///     uint8_t ScalingList4x4; // @link substring="ScalingList4x4" target="#ScalingList4x4"
///     uint8_t ScalingList8x8; // @link substring="ScalingList8x8" target="#ScalingList8x8"
/// } StdVideoH264ScalingLists;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
@ValueBasedCandidate
@UnsafeConstructor
public record StdVideoH264ScalingLists(@NotNull MemorySegment segment) implements IStdVideoH264ScalingLists {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link StdVideoH264ScalingLists}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IStdVideoH264ScalingLists to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code StdVideoH264ScalingLists.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IStdVideoH264ScalingLists {
        public long size() {
            return segment.byteSize() / StdVideoH264ScalingLists.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull StdVideoH264ScalingLists at(long index) {
            return new StdVideoH264ScalingLists(segment.asSlice(index * StdVideoH264ScalingLists.BYTES, StdVideoH264ScalingLists.BYTES));
        }

        public void write(long index, @NotNull StdVideoH264ScalingLists value) {
            MemorySegment s = segment.asSlice(index * StdVideoH264ScalingLists.BYTES, StdVideoH264ScalingLists.BYTES);
            s.copyFrom(value.segment);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} structures,
        /// create a new view {@link Ptr} that uses the same backing storage as this
        /// {@link Ptr}, but with the new size. Since there is actually no way to really check
        /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
        /// marked as {@link unsafe}.
        ///
        /// This method could be useful when handling data returned from some C API, where the size of
        /// the data is not known in advance.
        ///
        /// If the size of the underlying segment is actually known in advance and correctly set, and
        /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
        /// instead.
        @unsafe
        public @NotNull Ptr reinterpret(long index) {
            return new Ptr(segment.asSlice(index * StdVideoH264ScalingLists.BYTES, StdVideoH264ScalingLists.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * StdVideoH264ScalingLists.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * StdVideoH264ScalingLists.BYTES,
                (end - start) * StdVideoH264ScalingLists.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * StdVideoH264ScalingLists.BYTES));
        }
    }

    public static StdVideoH264ScalingLists allocate(Arena arena) {
        return new StdVideoH264ScalingLists(arena.allocate(LAYOUT));
    }

    public static StdVideoH264ScalingLists.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH264ScalingLists.Ptr ret = new StdVideoH264ScalingLists.Ptr(segment);
        return ret;
    }

    public static StdVideoH264ScalingLists clone(Arena arena, StdVideoH264ScalingLists src) {
        StdVideoH264ScalingLists ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @unsigned short scaling_list_present_mask() {
        return segment.get(LAYOUT$scaling_list_present_mask, OFFSET$scaling_list_present_mask);
    }

    public void scaling_list_present_mask(@unsigned short value) {
        segment.set(LAYOUT$scaling_list_present_mask, OFFSET$scaling_list_present_mask, value);
    }

    public @unsigned short use_default_scaling_matrix_mask() {
        return segment.get(LAYOUT$use_default_scaling_matrix_mask, OFFSET$use_default_scaling_matrix_mask);
    }

    public void use_default_scaling_matrix_mask(@unsigned short value) {
        segment.set(LAYOUT$use_default_scaling_matrix_mask, OFFSET$use_default_scaling_matrix_mask, value);
    }

    public @unsigned byte ScalingList4x4() {
        return segment.get(LAYOUT$ScalingList4x4, OFFSET$ScalingList4x4);
    }

    public void ScalingList4x4(@unsigned byte value) {
        segment.set(LAYOUT$ScalingList4x4, OFFSET$ScalingList4x4, value);
    }

    public @unsigned byte ScalingList8x8() {
        return segment.get(LAYOUT$ScalingList8x8, OFFSET$ScalingList8x8);
    }

    public void ScalingList8x8(@unsigned byte value) {
        segment.set(LAYOUT$ScalingList8x8, OFFSET$ScalingList8x8, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_SHORT.withName("scaling_list_present_mask"),
        ValueLayout.JAVA_SHORT.withName("use_default_scaling_matrix_mask"),
        ValueLayout.JAVA_BYTE.withName("ScalingList4x4"),
        ValueLayout.JAVA_BYTE.withName("ScalingList8x8")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$scaling_list_present_mask = PathElement.groupElement("scaling_list_present_mask");
    public static final PathElement PATH$use_default_scaling_matrix_mask = PathElement.groupElement("use_default_scaling_matrix_mask");
    public static final PathElement PATH$ScalingList4x4 = PathElement.groupElement("ScalingList4x4");
    public static final PathElement PATH$ScalingList8x8 = PathElement.groupElement("ScalingList8x8");

    public static final OfShort LAYOUT$scaling_list_present_mask = (OfShort) LAYOUT.select(PATH$scaling_list_present_mask);
    public static final OfShort LAYOUT$use_default_scaling_matrix_mask = (OfShort) LAYOUT.select(PATH$use_default_scaling_matrix_mask);
    public static final OfByte LAYOUT$ScalingList4x4 = (OfByte) LAYOUT.select(PATH$ScalingList4x4);
    public static final OfByte LAYOUT$ScalingList8x8 = (OfByte) LAYOUT.select(PATH$ScalingList8x8);

    public static final long SIZE$scaling_list_present_mask = LAYOUT$scaling_list_present_mask.byteSize();
    public static final long SIZE$use_default_scaling_matrix_mask = LAYOUT$use_default_scaling_matrix_mask.byteSize();
    public static final long SIZE$ScalingList4x4 = LAYOUT$ScalingList4x4.byteSize();
    public static final long SIZE$ScalingList8x8 = LAYOUT$ScalingList8x8.byteSize();

    public static final long OFFSET$scaling_list_present_mask = LAYOUT.byteOffset(PATH$scaling_list_present_mask);
    public static final long OFFSET$use_default_scaling_matrix_mask = LAYOUT.byteOffset(PATH$use_default_scaling_matrix_mask);
    public static final long OFFSET$ScalingList4x4 = LAYOUT.byteOffset(PATH$ScalingList4x4);
    public static final long OFFSET$ScalingList8x8 = LAYOUT.byteOffset(PATH$ScalingList8x8);
}
