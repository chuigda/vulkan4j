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

/// Represents a pointer to a {@code StdVideoH265PredictorPaletteEntries} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StdVideoH265PredictorPaletteEntries {
///     uint16_t PredictorPaletteEntries;
/// } StdVideoH265PredictorPaletteEntries;
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
public record StdVideoH265PredictorPaletteEntries(@NotNull MemorySegment segment) implements IPointer {
    public static StdVideoH265PredictorPaletteEntries allocate(Arena arena) {
        StdVideoH265PredictorPaletteEntries ret = new StdVideoH265PredictorPaletteEntries(arena.allocate(LAYOUT));
        return ret;
    }

    public static StdVideoH265PredictorPaletteEntries[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        StdVideoH265PredictorPaletteEntries[] ret = new StdVideoH265PredictorPaletteEntries[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new StdVideoH265PredictorPaletteEntries(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static StdVideoH265PredictorPaletteEntries clone(Arena arena, StdVideoH265PredictorPaletteEntries src) {
        StdVideoH265PredictorPaletteEntries ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static StdVideoH265PredictorPaletteEntries[] clone(Arena arena, StdVideoH265PredictorPaletteEntries[] src) {
        StdVideoH265PredictorPaletteEntries[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
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

    public static final PathElement PATH$PredictorPaletteEntries = PathElement.groupElement("PATH$PredictorPaletteEntries");

    public static final OfShort LAYOUT$PredictorPaletteEntries = (OfShort) LAYOUT.select(PATH$PredictorPaletteEntries);

    public static final long SIZE$PredictorPaletteEntries = LAYOUT$PredictorPaletteEntries.byteSize();

    public static final long OFFSET$PredictorPaletteEntries = LAYOUT.byteOffset(PATH$PredictorPaletteEntries);
}
