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

/// A structure specifying a viewport.
///
/// \since This struct is available since SDL 3.2.0.
///
/// \sa SDL_SetGPUViewport
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_GPUViewport {
///     float x; // optional // @link substring="x" target="#x"
///     float y; // optional // @link substring="y" target="#y"
///     float w; // optional // @link substring="w" target="#w"
///     float h; // optional // @link substring="h" target="#h"
///     float min_depth; // optional // @link substring="min_depth" target="#min_depth"
///     float max_depth; // optional // @link substring="max_depth" target="#max_depth"
/// } SDL_GPUViewport;
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
public record SDL_GPUViewport(@NotNull MemorySegment segment) implements ISDL_GPUViewport {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_GPUViewport}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_GPUViewport to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_GPUViewport.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_GPUViewport, Iterable<SDL_GPUViewport> {
        public long size() {
            return segment.byteSize() / SDL_GPUViewport.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_GPUViewport at(long index) {
            return new SDL_GPUViewport(segment.asSlice(index * SDL_GPUViewport.BYTES, SDL_GPUViewport.BYTES));
        }

        public void write(long index, @NotNull SDL_GPUViewport value) {
            MemorySegment s = segment.asSlice(index * SDL_GPUViewport.BYTES, SDL_GPUViewport.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_GPUViewport.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_GPUViewport.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_GPUViewport.BYTES,
                (end - start) * SDL_GPUViewport.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_GPUViewport.BYTES));
        }

        public SDL_GPUViewport[] toArray() {
            SDL_GPUViewport[] ret = new SDL_GPUViewport[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_GPUViewport> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_GPUViewport> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_GPUViewport.BYTES;
            }

            @Override
            public SDL_GPUViewport next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_GPUViewport ret = new SDL_GPUViewport(segment.asSlice(0, SDL_GPUViewport.BYTES));
                segment = segment.asSlice(SDL_GPUViewport.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_GPUViewport allocate(Arena arena) {
        return new SDL_GPUViewport(arena.allocate(LAYOUT));
    }

    public static SDL_GPUViewport.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_GPUViewport.Ptr(segment);
    }

    public static SDL_GPUViewport clone(Arena arena, SDL_GPUViewport src) {
        SDL_GPUViewport ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public float x() {
        return segment.get(LAYOUT$x, OFFSET$x);
    }

    public SDL_GPUViewport x(float value) {
        segment.set(LAYOUT$x, OFFSET$x, value);
        return this;
    }

    public float y() {
        return segment.get(LAYOUT$y, OFFSET$y);
    }

    public SDL_GPUViewport y(float value) {
        segment.set(LAYOUT$y, OFFSET$y, value);
        return this;
    }

    public float w() {
        return segment.get(LAYOUT$w, OFFSET$w);
    }

    public SDL_GPUViewport w(float value) {
        segment.set(LAYOUT$w, OFFSET$w, value);
        return this;
    }

    public float h() {
        return segment.get(LAYOUT$h, OFFSET$h);
    }

    public SDL_GPUViewport h(float value) {
        segment.set(LAYOUT$h, OFFSET$h, value);
        return this;
    }

    public float min_depth() {
        return segment.get(LAYOUT$min_depth, OFFSET$min_depth);
    }

    public SDL_GPUViewport min_depth(float value) {
        segment.set(LAYOUT$min_depth, OFFSET$min_depth, value);
        return this;
    }

    public float max_depth() {
        return segment.get(LAYOUT$max_depth, OFFSET$max_depth);
    }

    public SDL_GPUViewport max_depth(float value) {
        segment.set(LAYOUT$max_depth, OFFSET$max_depth, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_FLOAT.withName("x"),
        ValueLayout.JAVA_FLOAT.withName("y"),
        ValueLayout.JAVA_FLOAT.withName("w"),
        ValueLayout.JAVA_FLOAT.withName("h"),
        ValueLayout.JAVA_FLOAT.withName("min_depth"),
        ValueLayout.JAVA_FLOAT.withName("max_depth")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$x = PathElement.groupElement("x");
    public static final PathElement PATH$y = PathElement.groupElement("y");
    public static final PathElement PATH$w = PathElement.groupElement("w");
    public static final PathElement PATH$h = PathElement.groupElement("h");
    public static final PathElement PATH$min_depth = PathElement.groupElement("min_depth");
    public static final PathElement PATH$max_depth = PathElement.groupElement("max_depth");

    public static final OfFloat LAYOUT$x = (OfFloat) LAYOUT.select(PATH$x);
    public static final OfFloat LAYOUT$y = (OfFloat) LAYOUT.select(PATH$y);
    public static final OfFloat LAYOUT$w = (OfFloat) LAYOUT.select(PATH$w);
    public static final OfFloat LAYOUT$h = (OfFloat) LAYOUT.select(PATH$h);
    public static final OfFloat LAYOUT$min_depth = (OfFloat) LAYOUT.select(PATH$min_depth);
    public static final OfFloat LAYOUT$max_depth = (OfFloat) LAYOUT.select(PATH$max_depth);

    public static final long SIZE$x = LAYOUT$x.byteSize();
    public static final long SIZE$y = LAYOUT$y.byteSize();
    public static final long SIZE$w = LAYOUT$w.byteSize();
    public static final long SIZE$h = LAYOUT$h.byteSize();
    public static final long SIZE$min_depth = LAYOUT$min_depth.byteSize();
    public static final long SIZE$max_depth = LAYOUT$max_depth.byteSize();

    public static final long OFFSET$x = LAYOUT.byteOffset(PATH$x);
    public static final long OFFSET$y = LAYOUT.byteOffset(PATH$y);
    public static final long OFFSET$w = LAYOUT.byteOffset(PATH$w);
    public static final long OFFSET$h = LAYOUT.byteOffset(PATH$h);
    public static final long OFFSET$min_depth = LAYOUT.byteOffset(PATH$min_depth);
    public static final long OFFSET$max_depth = LAYOUT.byteOffset(PATH$max_depth);
}
