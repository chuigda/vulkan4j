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

/// Data about a single finger in a multitouch event.
///
/// Each touch event is a collection of fingers that are simultaneously in
/// contact with the touch device (so a "touch" can be a "multitouch," in
/// reality), and this struct reports details of the specific fingers.
///
/// \since This struct is available since SDL 3.2.0.
///
/// \sa SDL_GetTouchFingers
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_Finger {
///     SDL_FingerID id; // optional // @link substring="id" target="#id"
///     float x; // optional // @link substring="x" target="#x"
///     float y; // optional // @link substring="y" target="#y"
///     float pressure; // optional // @link substring="pressure" target="#pressure"
/// } SDL_Finger;
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
public record SDL_Finger(@NotNull MemorySegment segment) implements ISDL_Finger {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_Finger}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_Finger to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_Finger.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_Finger, Iterable<SDL_Finger> {
        public long size() {
            return segment.byteSize() / SDL_Finger.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_Finger at(long index) {
            return new SDL_Finger(segment.asSlice(index * SDL_Finger.BYTES, SDL_Finger.BYTES));
        }

        public void write(long index, @NotNull SDL_Finger value) {
            MemorySegment s = segment.asSlice(index * SDL_Finger.BYTES, SDL_Finger.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_Finger.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_Finger.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_Finger.BYTES,
                (end - start) * SDL_Finger.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_Finger.BYTES));
        }

        public SDL_Finger[] toArray() {
            SDL_Finger[] ret = new SDL_Finger[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_Finger> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_Finger> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_Finger.BYTES;
            }

            @Override
            public SDL_Finger next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_Finger ret = new SDL_Finger(segment.asSlice(0, SDL_Finger.BYTES));
                segment = segment.asSlice(SDL_Finger.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_Finger allocate(Arena arena) {
        return new SDL_Finger(arena.allocate(LAYOUT));
    }

    public static SDL_Finger.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_Finger.Ptr(segment);
    }

    public static SDL_Finger clone(Arena arena, SDL_Finger src) {
        SDL_Finger ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NativeType("SDL_FingerID") @Unsigned long id() {
        return segment.get(LAYOUT$id, OFFSET$id);
    }

    public SDL_Finger id(@NativeType("SDL_FingerID") @Unsigned long value) {
        segment.set(LAYOUT$id, OFFSET$id, value);
        return this;
    }

    public float x() {
        return segment.get(LAYOUT$x, OFFSET$x);
    }

    public SDL_Finger x(float value) {
        segment.set(LAYOUT$x, OFFSET$x, value);
        return this;
    }

    public float y() {
        return segment.get(LAYOUT$y, OFFSET$y);
    }

    public SDL_Finger y(float value) {
        segment.set(LAYOUT$y, OFFSET$y, value);
        return this;
    }

    public float pressure() {
        return segment.get(LAYOUT$pressure, OFFSET$pressure);
    }

    public SDL_Finger pressure(float value) {
        segment.set(LAYOUT$pressure, OFFSET$pressure, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("id"),
        ValueLayout.JAVA_FLOAT.withName("x"),
        ValueLayout.JAVA_FLOAT.withName("y"),
        ValueLayout.JAVA_FLOAT.withName("pressure")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$id = PathElement.groupElement("id");
    public static final PathElement PATH$x = PathElement.groupElement("x");
    public static final PathElement PATH$y = PathElement.groupElement("y");
    public static final PathElement PATH$pressure = PathElement.groupElement("pressure");

    public static final OfLong LAYOUT$id = (OfLong) LAYOUT.select(PATH$id);
    public static final OfFloat LAYOUT$x = (OfFloat) LAYOUT.select(PATH$x);
    public static final OfFloat LAYOUT$y = (OfFloat) LAYOUT.select(PATH$y);
    public static final OfFloat LAYOUT$pressure = (OfFloat) LAYOUT.select(PATH$pressure);

    public static final long SIZE$id = LAYOUT$id.byteSize();
    public static final long SIZE$x = LAYOUT$x.byteSize();
    public static final long SIZE$y = LAYOUT$y.byteSize();
    public static final long SIZE$pressure = LAYOUT$pressure.byteSize();

    public static final long OFFSET$id = LAYOUT.byteOffset(PATH$id);
    public static final long OFFSET$x = LAYOUT.byteOffset(PATH$x);
    public static final long OFFSET$y = LAYOUT.byteOffset(PATH$y);
    public static final long OFFSET$pressure = LAYOUT.byteOffset(PATH$pressure);
}
