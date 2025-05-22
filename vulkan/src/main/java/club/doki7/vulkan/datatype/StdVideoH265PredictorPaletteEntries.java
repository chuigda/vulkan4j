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

/// Represents a pointer to a {@code StdVideoH265PredictorPaletteEntries} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoH265PredictorPaletteEntries {
///     uint16_t PredictorPaletteEntries; // @link substring="PredictorPaletteEntries" target="#PredictorPaletteEntries"
/// } StdVideoH265PredictorPaletteEntries;
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
public record StdVideoH265PredictorPaletteEntries(@NotNull MemorySegment segment) implements IStdVideoH265PredictorPaletteEntries {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link StdVideoH265PredictorPaletteEntries}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IStdVideoH265PredictorPaletteEntries to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code StdVideoH265PredictorPaletteEntries.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IStdVideoH265PredictorPaletteEntries {
        public long size() {
            return segment.byteSize() / StdVideoH265PredictorPaletteEntries.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull StdVideoH265PredictorPaletteEntries at(long index) {
            return new StdVideoH265PredictorPaletteEntries(segment.asSlice(index * StdVideoH265PredictorPaletteEntries.BYTES, StdVideoH265PredictorPaletteEntries.BYTES));
        }
        public void write(long index, @NotNull StdVideoH265PredictorPaletteEntries value) {
            MemorySegment s = segment.asSlice(index * StdVideoH265PredictorPaletteEntries.BYTES, StdVideoH265PredictorPaletteEntries.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static StdVideoH265PredictorPaletteEntries allocate(Arena arena) {
        return new StdVideoH265PredictorPaletteEntries(arena.allocate(LAYOUT));
    }

    public static StdVideoH265PredictorPaletteEntries.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH265PredictorPaletteEntries.Ptr ret = new StdVideoH265PredictorPaletteEntries.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static StdVideoH265PredictorPaletteEntries clone(Arena arena, StdVideoH265PredictorPaletteEntries src) {
        StdVideoH265PredictorPaletteEntries ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @unsigned short PredictorPaletteEntries() {
        return segment.get(LAYOUT$PredictorPaletteEntries, OFFSET$PredictorPaletteEntries);
    }

    public void PredictorPaletteEntries(@unsigned short value) {
        segment.set(LAYOUT$PredictorPaletteEntries, OFFSET$PredictorPaletteEntries, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_SHORT.withName("PredictorPaletteEntries")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$PredictorPaletteEntries = PathElement.groupElement("PredictorPaletteEntries");

    public static final OfShort LAYOUT$PredictorPaletteEntries = (OfShort) LAYOUT.select(PATH$PredictorPaletteEntries);

    public static final long SIZE$PredictorPaletteEntries = LAYOUT$PredictorPaletteEntries.byteSize();

    public static final long OFFSET$PredictorPaletteEntries = LAYOUT.byteOffset(PATH$PredictorPaletteEntries);
}
