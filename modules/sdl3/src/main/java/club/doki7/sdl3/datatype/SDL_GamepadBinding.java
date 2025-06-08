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

/// Represents a pointer to a {@code SDL_GamepadBinding} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_GamepadBinding {
///     SDL_GamepadBindingType input_type; // optional // @link substring="SDL_GamepadBindingType" target="SDL_GamepadBindingType" @link substring="input_type" target="#input_type"
///     SDL_GamepadBinding_Input input; // optional // @link substring="SDL_GamepadBinding_Input" target="SDL_GamepadBinding_Input" @link substring="input" target="#input"
///     SDL_GamepadBindingType output_type; // optional // @link substring="SDL_GamepadBindingType" target="SDL_GamepadBindingType" @link substring="output_type" target="#output_type"
///     SDL_GamepadBinding_Output output; // optional // @link substring="SDL_GamepadBinding_Output" target="SDL_GamepadBinding_Output" @link substring="output" target="#output"
/// } SDL_GamepadBinding;
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
public record SDL_GamepadBinding(@NotNull MemorySegment segment) implements ISDL_GamepadBinding {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_GamepadBinding}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_GamepadBinding to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_GamepadBinding.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_GamepadBinding, Iterable<SDL_GamepadBinding> {
        public long size() {
            return segment.byteSize() / SDL_GamepadBinding.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_GamepadBinding at(long index) {
            return new SDL_GamepadBinding(segment.asSlice(index * SDL_GamepadBinding.BYTES, SDL_GamepadBinding.BYTES));
        }

        public void write(long index, @NotNull SDL_GamepadBinding value) {
            MemorySegment s = segment.asSlice(index * SDL_GamepadBinding.BYTES, SDL_GamepadBinding.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_GamepadBinding.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_GamepadBinding.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_GamepadBinding.BYTES,
                (end - start) * SDL_GamepadBinding.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_GamepadBinding.BYTES));
        }

        public SDL_GamepadBinding[] toArray() {
            SDL_GamepadBinding[] ret = new SDL_GamepadBinding[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_GamepadBinding> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_GamepadBinding> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_GamepadBinding.BYTES;
            }

            @Override
            public SDL_GamepadBinding next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_GamepadBinding ret = new SDL_GamepadBinding(segment.asSlice(0, SDL_GamepadBinding.BYTES));
                segment = segment.asSlice(SDL_GamepadBinding.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_GamepadBinding allocate(Arena arena) {
        return new SDL_GamepadBinding(arena.allocate(LAYOUT));
    }

    public static SDL_GamepadBinding.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_GamepadBinding.Ptr(segment);
    }

    public static SDL_GamepadBinding clone(Arena arena, SDL_GamepadBinding src) {
        SDL_GamepadBinding ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(SDL_GamepadBindingType.class) int input_type() {
        return segment.get(LAYOUT$input_type, OFFSET$input_type);
    }

    public SDL_GamepadBinding input_type(@EnumType(SDL_GamepadBindingType.class) int value) {
        segment.set(LAYOUT$input_type, OFFSET$input_type, value);
        return this;
    }

    public @NotNull SDL_GamepadBinding_Input input() {
        return new SDL_GamepadBinding_Input(segment.asSlice(OFFSET$input, LAYOUT$input));
    }

    public SDL_GamepadBinding input(@NotNull SDL_GamepadBinding_Input value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$input, SIZE$input);
        return this;
    }

    public SDL_GamepadBinding input(Consumer<@NotNull SDL_GamepadBinding_Input> consumer) {
        consumer.accept(input());
        return this;
    }

    public @EnumType(SDL_GamepadBindingType.class) int output_type() {
        return segment.get(LAYOUT$output_type, OFFSET$output_type);
    }

    public SDL_GamepadBinding output_type(@EnumType(SDL_GamepadBindingType.class) int value) {
        segment.set(LAYOUT$output_type, OFFSET$output_type, value);
        return this;
    }

    public @NotNull SDL_GamepadBinding_Output output() {
        return new SDL_GamepadBinding_Output(segment.asSlice(OFFSET$output, LAYOUT$output));
    }

    public SDL_GamepadBinding output(@NotNull SDL_GamepadBinding_Output value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$output, SIZE$output);
        return this;
    }

    public SDL_GamepadBinding output(Consumer<@NotNull SDL_GamepadBinding_Output> consumer) {
        consumer.accept(output());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("input_type"),
        SDL_GamepadBinding_Input.LAYOUT.withName("input"),
        ValueLayout.JAVA_INT.withName("output_type"),
        SDL_GamepadBinding_Output.LAYOUT.withName("output")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$input_type = PathElement.groupElement("input_type");
    public static final PathElement PATH$input = PathElement.groupElement("input");
    public static final PathElement PATH$output_type = PathElement.groupElement("output_type");
    public static final PathElement PATH$output = PathElement.groupElement("output");

    public static final OfInt LAYOUT$input_type = (OfInt) LAYOUT.select(PATH$input_type);
    public static final UnionLayout LAYOUT$input = (UnionLayout) LAYOUT.select(PATH$input);
    public static final OfInt LAYOUT$output_type = (OfInt) LAYOUT.select(PATH$output_type);
    public static final UnionLayout LAYOUT$output = (UnionLayout) LAYOUT.select(PATH$output);

    public static final long SIZE$input_type = LAYOUT$input_type.byteSize();
    public static final long SIZE$input = LAYOUT$input.byteSize();
    public static final long SIZE$output_type = LAYOUT$output_type.byteSize();
    public static final long SIZE$output = LAYOUT$output.byteSize();

    public static final long OFFSET$input_type = LAYOUT.byteOffset(PATH$input_type);
    public static final long OFFSET$input = LAYOUT.byteOffset(PATH$input);
    public static final long OFFSET$output_type = LAYOUT.byteOffset(PATH$output_type);
    public static final long OFFSET$output = LAYOUT.byteOffset(PATH$output);
}
