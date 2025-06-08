package club.doki7.sdl3.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.function.Consumer;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.sdl3.bitmask.*;
import club.doki7.sdl3.handle.*;
import club.doki7.sdl3.enumtype.*;
import static club.doki7.sdl3.SDL3Constants.*;

/// Represents a pointer to a {@code SDL_GamepadBinding_Output_Axis} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_GamepadBinding_Output_Axis {
///     SDL_GamepadAxis axis; // optional // @link substring="SDL_GamepadAxis" target="SDL_GamepadAxis" @link substring="axis" target="#axis"
///     int axis_min; // optional // @link substring="axis_min" target="#axis_min"
///     int axis_max; // optional // @link substring="axis_max" target="#axis_max"
/// } SDL_GamepadBinding_Output_Axis;
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
public record SDL_GamepadBinding_Output_Axis(@NotNull MemorySegment segment) implements ISDL_GamepadBinding_Output_Axis {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_GamepadBinding_Output_Axis}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_GamepadBinding_Output_Axis to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_GamepadBinding_Output_Axis.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_GamepadBinding_Output_Axis, Iterable<SDL_GamepadBinding_Output_Axis> {
        public long size() {
            return segment.byteSize() / SDL_GamepadBinding_Output_Axis.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_GamepadBinding_Output_Axis at(long index) {
            return new SDL_GamepadBinding_Output_Axis(segment.asSlice(index * SDL_GamepadBinding_Output_Axis.BYTES, SDL_GamepadBinding_Output_Axis.BYTES));
        }

        public void write(long index, @NotNull SDL_GamepadBinding_Output_Axis value) {
            MemorySegment s = segment.asSlice(index * SDL_GamepadBinding_Output_Axis.BYTES, SDL_GamepadBinding_Output_Axis.BYTES);
            s.copyFrom(value.segment);
        }

        /// Assume the {@link Ptr} is capable of holding at least {@code newSize} structures,
        /// create a new view {@link Ptr} that uses the same backing storage as this
        /// {@link Ptr}, but with the new size. Since there is actually no way to really check
        /// whether the new size is valid, while buffer overflow is undefined behavior, this method is
        /// marked as {@link Unsafe}.
        ///
        /// This method could be useful when handling data returned from some C API, where the size of
        /// the data is not known in advance.
        ///
        /// If the size of the underlying segment is actually known in advance and correctly set, and
        /// you want to create a shrunk view, you may use {@link #slice(long)} (with validation)
        /// instead.
        @Unsafe
        public @NotNull Ptr reinterpret(long newSize) {
            return new Ptr(segment.reinterpret(newSize * SDL_GamepadBinding_Output_Axis.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_GamepadBinding_Output_Axis.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_GamepadBinding_Output_Axis.BYTES,
                (end - start) * SDL_GamepadBinding_Output_Axis.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_GamepadBinding_Output_Axis.BYTES));
        }

        public SDL_GamepadBinding_Output_Axis[] toArray() {
            SDL_GamepadBinding_Output_Axis[] ret = new SDL_GamepadBinding_Output_Axis[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_GamepadBinding_Output_Axis> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_GamepadBinding_Output_Axis> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_GamepadBinding_Output_Axis.BYTES;
            }

            @Override
            public SDL_GamepadBinding_Output_Axis next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_GamepadBinding_Output_Axis ret = new SDL_GamepadBinding_Output_Axis(segment.asSlice(0, SDL_GamepadBinding_Output_Axis.BYTES));
                segment = segment.asSlice(SDL_GamepadBinding_Output_Axis.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_GamepadBinding_Output_Axis allocate(Arena arena) {
        return new SDL_GamepadBinding_Output_Axis(arena.allocate(LAYOUT));
    }

    public static SDL_GamepadBinding_Output_Axis.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_GamepadBinding_Output_Axis.Ptr(segment);
    }

    public static SDL_GamepadBinding_Output_Axis clone(Arena arena, SDL_GamepadBinding_Output_Axis src) {
        SDL_GamepadBinding_Output_Axis ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(SDL_GamepadAxis.class) int axis() {
        return segment.get(LAYOUT$axis, OFFSET$axis);
    }

    public SDL_GamepadBinding_Output_Axis axis(@EnumType(SDL_GamepadAxis.class) int value) {
        segment.set(LAYOUT$axis, OFFSET$axis, value);
        return this;
    }

    public int axis_min() {
        return segment.get(LAYOUT$axis_min, OFFSET$axis_min);
    }

    public SDL_GamepadBinding_Output_Axis axis_min(int value) {
        segment.set(LAYOUT$axis_min, OFFSET$axis_min, value);
        return this;
    }

    public int axis_max() {
        return segment.get(LAYOUT$axis_max, OFFSET$axis_max);
    }

    public SDL_GamepadBinding_Output_Axis axis_max(int value) {
        segment.set(LAYOUT$axis_max, OFFSET$axis_max, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("axis"),
        ValueLayout.JAVA_INT.withName("axis_min"),
        ValueLayout.JAVA_INT.withName("axis_max")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$axis = PathElement.groupElement("axis");
    public static final PathElement PATH$axis_min = PathElement.groupElement("axis_min");
    public static final PathElement PATH$axis_max = PathElement.groupElement("axis_max");

    public static final OfInt LAYOUT$axis = (OfInt) LAYOUT.select(PATH$axis);
    public static final OfInt LAYOUT$axis_min = (OfInt) LAYOUT.select(PATH$axis_min);
    public static final OfInt LAYOUT$axis_max = (OfInt) LAYOUT.select(PATH$axis_max);

    public static final long SIZE$axis = LAYOUT$axis.byteSize();
    public static final long SIZE$axis_min = LAYOUT$axis_min.byteSize();
    public static final long SIZE$axis_max = LAYOUT$axis_max.byteSize();

    public static final long OFFSET$axis = LAYOUT.byteOffset(PATH$axis);
    public static final long OFFSET$axis_min = LAYOUT.byteOffset(PATH$axis_min);
    public static final long OFFSET$axis_max = LAYOUT.byteOffset(PATH$axis_max);
}
