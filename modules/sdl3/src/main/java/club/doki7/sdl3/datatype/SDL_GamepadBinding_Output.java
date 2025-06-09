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

/// Represents a pointer to a {@code SDL_GamepadBinding_Output} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_GamepadBinding_Output {
///     SDL_GamepadButton button; // optional // @link substring="SDL_GamepadButton" target="SDL_GamepadButton" @link substring="button" target="#button"
///     SDL_GamepadBinding_Output_Axis axis; // optional // @link substring="SDL_GamepadBinding_Output_Axis" target="SDL_GamepadBinding_Output_Axis" @link substring="axis" target="#axis"
/// } SDL_GamepadBinding_Output;
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
public record SDL_GamepadBinding_Output(@NotNull MemorySegment segment) implements ISDL_GamepadBinding_Output {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_GamepadBinding_Output}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_GamepadBinding_Output to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_GamepadBinding_Output.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_GamepadBinding_Output, Iterable<SDL_GamepadBinding_Output> {
        public long size() {
            return segment.byteSize() / SDL_GamepadBinding_Output.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_GamepadBinding_Output at(long index) {
            return new SDL_GamepadBinding_Output(segment.asSlice(index * SDL_GamepadBinding_Output.BYTES, SDL_GamepadBinding_Output.BYTES));
        }

        public void write(long index, @NotNull SDL_GamepadBinding_Output value) {
            MemorySegment s = segment.asSlice(index * SDL_GamepadBinding_Output.BYTES, SDL_GamepadBinding_Output.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_GamepadBinding_Output.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_GamepadBinding_Output.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_GamepadBinding_Output.BYTES,
                (end - start) * SDL_GamepadBinding_Output.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_GamepadBinding_Output.BYTES));
        }

        public SDL_GamepadBinding_Output[] toArray() {
            SDL_GamepadBinding_Output[] ret = new SDL_GamepadBinding_Output[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_GamepadBinding_Output> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_GamepadBinding_Output> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_GamepadBinding_Output.BYTES;
            }

            @Override
            public SDL_GamepadBinding_Output next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_GamepadBinding_Output ret = new SDL_GamepadBinding_Output(segment.asSlice(0, SDL_GamepadBinding_Output.BYTES));
                segment = segment.asSlice(SDL_GamepadBinding_Output.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_GamepadBinding_Output allocate(Arena arena) {
        return new SDL_GamepadBinding_Output(arena.allocate(LAYOUT));
    }

    public static SDL_GamepadBinding_Output.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_GamepadBinding_Output.Ptr(segment);
    }

    public static SDL_GamepadBinding_Output clone(Arena arena, SDL_GamepadBinding_Output src) {
        SDL_GamepadBinding_Output ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(SDL_GamepadButton.class) int button() {
        return segment.get(LAYOUT$button, OFFSET$button);
    }

    public SDL_GamepadBinding_Output button(@EnumType(SDL_GamepadButton.class) int value) {
        segment.set(LAYOUT$button, OFFSET$button, value);
        return this;
    }

    public @NotNull SDL_GamepadBinding_Output_Axis axis() {
        return new SDL_GamepadBinding_Output_Axis(segment.asSlice(OFFSET$axis, LAYOUT$axis));
    }

    public SDL_GamepadBinding_Output axis(@NotNull SDL_GamepadBinding_Output_Axis value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$axis, SIZE$axis);
        return this;
    }

    public SDL_GamepadBinding_Output axis(Consumer<@NotNull SDL_GamepadBinding_Output_Axis> consumer) {
        consumer.accept(axis());
        return this;
    }

    public static final UnionLayout LAYOUT = NativeLayout.unionLayout(
        ValueLayout.JAVA_INT.withName("button"),
        SDL_GamepadBinding_Output_Axis.LAYOUT.withName("axis")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$button = PathElement.groupElement("button");
    public static final PathElement PATH$axis = PathElement.groupElement("axis");

    public static final OfInt LAYOUT$button = (OfInt) LAYOUT.select(PATH$button);
    public static final StructLayout LAYOUT$axis = (StructLayout) LAYOUT.select(PATH$axis);

    public static final long SIZE$button = LAYOUT$button.byteSize();
    public static final long SIZE$axis = LAYOUT$axis.byteSize();

    public static final long OFFSET$button = LAYOUT.byteOffset(PATH$button);
    public static final long OFFSET$axis = LAYOUT.byteOffset(PATH$axis);
}
