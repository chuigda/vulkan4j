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

/// A structure specifying a vertex attribute.
///
/// All vertex attribute locations provided to an SDL_GPUVertexInputState must
/// be unique.
///
/// \since This struct is available since SDL 3.2.0.
///
/// \sa SDL_GPUVertexBufferDescription
/// \sa SDL_GPUVertexInputState
/// \sa SDL_GPUVertexElementFormat
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_GPUVertexAttribute {
///     Uint32 location; // @link substring="location" target="#location"
///     Uint32 buffer_slot; // @link substring="buffer_slot" target="#buffer_slot"
///     SDL_GPUVertexElementFormat format; // @link substring="SDL_GPUVertexElementFormat" target="SDL_GPUVertexElementFormat" @link substring="format" target="#format"
///     Uint32 offset; // @link substring="offset" target="#offset"
/// } SDL_GPUVertexAttribute;
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
public record SDL_GPUVertexAttribute(@NotNull MemorySegment segment) implements ISDL_GPUVertexAttribute {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_GPUVertexAttribute}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_GPUVertexAttribute to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_GPUVertexAttribute.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_GPUVertexAttribute, Iterable<SDL_GPUVertexAttribute> {
        public long size() {
            return segment.byteSize() / SDL_GPUVertexAttribute.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_GPUVertexAttribute at(long index) {
            return new SDL_GPUVertexAttribute(segment.asSlice(index * SDL_GPUVertexAttribute.BYTES, SDL_GPUVertexAttribute.BYTES));
        }

        public void write(long index, @NotNull SDL_GPUVertexAttribute value) {
            MemorySegment s = segment.asSlice(index * SDL_GPUVertexAttribute.BYTES, SDL_GPUVertexAttribute.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_GPUVertexAttribute.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_GPUVertexAttribute.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_GPUVertexAttribute.BYTES,
                (end - start) * SDL_GPUVertexAttribute.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_GPUVertexAttribute.BYTES));
        }

        public SDL_GPUVertexAttribute[] toArray() {
            SDL_GPUVertexAttribute[] ret = new SDL_GPUVertexAttribute[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_GPUVertexAttribute> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_GPUVertexAttribute> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_GPUVertexAttribute.BYTES;
            }

            @Override
            public SDL_GPUVertexAttribute next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_GPUVertexAttribute ret = new SDL_GPUVertexAttribute(segment.asSlice(0, SDL_GPUVertexAttribute.BYTES));
                segment = segment.asSlice(SDL_GPUVertexAttribute.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_GPUVertexAttribute allocate(Arena arena) {
        return new SDL_GPUVertexAttribute(arena.allocate(LAYOUT));
    }

    public static SDL_GPUVertexAttribute.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_GPUVertexAttribute.Ptr(segment);
    }

    public static SDL_GPUVertexAttribute clone(Arena arena, SDL_GPUVertexAttribute src) {
        SDL_GPUVertexAttribute ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NativeType("Uint32") @Unsigned int location() {
        return segment.get(LAYOUT$location, OFFSET$location);
    }

    public SDL_GPUVertexAttribute location(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$location, OFFSET$location, value);
        return this;
    }

    public @NativeType("Uint32") @Unsigned int buffer_slot() {
        return segment.get(LAYOUT$buffer_slot, OFFSET$buffer_slot);
    }

    public SDL_GPUVertexAttribute buffer_slot(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$buffer_slot, OFFSET$buffer_slot, value);
        return this;
    }

    public @EnumType(SDL_GPUVertexElementFormat.class) int format() {
        return segment.get(LAYOUT$format, OFFSET$format);
    }

    public SDL_GPUVertexAttribute format(@EnumType(SDL_GPUVertexElementFormat.class) int value) {
        segment.set(LAYOUT$format, OFFSET$format, value);
        return this;
    }

    public @NativeType("Uint32") @Unsigned int offset() {
        return segment.get(LAYOUT$offset, OFFSET$offset);
    }

    public SDL_GPUVertexAttribute offset(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$offset, OFFSET$offset, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("location"),
        ValueLayout.JAVA_INT.withName("buffer_slot"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_INT.withName("offset")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$location = PathElement.groupElement("location");
    public static final PathElement PATH$buffer_slot = PathElement.groupElement("buffer_slot");
    public static final PathElement PATH$format = PathElement.groupElement("format");
    public static final PathElement PATH$offset = PathElement.groupElement("offset");

    public static final OfInt LAYOUT$location = (OfInt) LAYOUT.select(PATH$location);
    public static final OfInt LAYOUT$buffer_slot = (OfInt) LAYOUT.select(PATH$buffer_slot);
    public static final OfInt LAYOUT$format = (OfInt) LAYOUT.select(PATH$format);
    public static final OfInt LAYOUT$offset = (OfInt) LAYOUT.select(PATH$offset);

    public static final long SIZE$location = LAYOUT$location.byteSize();
    public static final long SIZE$buffer_slot = LAYOUT$buffer_slot.byteSize();
    public static final long SIZE$format = LAYOUT$format.byteSize();
    public static final long SIZE$offset = LAYOUT$offset.byteSize();

    public static final long OFFSET$location = LAYOUT.byteOffset(PATH$location);
    public static final long OFFSET$buffer_slot = LAYOUT.byteOffset(PATH$buffer_slot);
    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);
    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);
}
