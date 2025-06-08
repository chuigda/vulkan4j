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

/// A structure specifying the parameters of a graphics pipeline vertex input
/// state.
///
/// Since: This struct is available since SDL 3.2.0.
///
/// See also:
/// - `SDL_GPUGraphicsPipelineCreateInfo`
/// - `SDL_GPUVertexBufferDescription`
/// - `SDL_GPUVertexAttribute`
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_GPUVertexInputState {
///     SDL_GPUVertexBufferDescription const* vertex_buffer_descriptions; // @link substring="SDL_GPUVertexBufferDescription" target="SDL_GPUVertexBufferDescription" @link substring="vertex_buffer_descriptions" target="#vertex_buffer_descriptions"
///     Uint32 num_vertex_buffers; // @link substring="num_vertex_buffers" target="#num_vertex_buffers"
///     SDL_GPUVertexAttribute const* vertex_attributes; // @link substring="SDL_GPUVertexAttribute" target="SDL_GPUVertexAttribute" @link substring="vertex_attributes" target="#vertex_attributes"
///     Uint32 num_vertex_attributes; // @link substring="num_vertex_attributes" target="#num_vertex_attributes"
/// } SDL_GPUVertexInputState;
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
public record SDL_GPUVertexInputState(@NotNull MemorySegment segment) implements ISDL_GPUVertexInputState {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_GPUVertexInputState}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_GPUVertexInputState to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_GPUVertexInputState.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_GPUVertexInputState, Iterable<SDL_GPUVertexInputState> {
        public long size() {
            return segment.byteSize() / SDL_GPUVertexInputState.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_GPUVertexInputState at(long index) {
            return new SDL_GPUVertexInputState(segment.asSlice(index * SDL_GPUVertexInputState.BYTES, SDL_GPUVertexInputState.BYTES));
        }

        public void write(long index, @NotNull SDL_GPUVertexInputState value) {
            MemorySegment s = segment.asSlice(index * SDL_GPUVertexInputState.BYTES, SDL_GPUVertexInputState.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_GPUVertexInputState.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_GPUVertexInputState.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_GPUVertexInputState.BYTES,
                (end - start) * SDL_GPUVertexInputState.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_GPUVertexInputState.BYTES));
        }

        public SDL_GPUVertexInputState[] toArray() {
            SDL_GPUVertexInputState[] ret = new SDL_GPUVertexInputState[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_GPUVertexInputState> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_GPUVertexInputState> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_GPUVertexInputState.BYTES;
            }

            @Override
            public SDL_GPUVertexInputState next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_GPUVertexInputState ret = new SDL_GPUVertexInputState(segment.asSlice(0, SDL_GPUVertexInputState.BYTES));
                segment = segment.asSlice(SDL_GPUVertexInputState.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_GPUVertexInputState allocate(Arena arena) {
        return new SDL_GPUVertexInputState(arena.allocate(LAYOUT));
    }

    public static SDL_GPUVertexInputState.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_GPUVertexInputState.Ptr(segment);
    }

    public static SDL_GPUVertexInputState clone(Arena arena, SDL_GPUVertexInputState src) {
        SDL_GPUVertexInputState ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public SDL_GPUVertexInputState vertex_buffer_descriptions(@Nullable ISDL_GPUVertexBufferDescription value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        vertex_buffer_descriptionsRaw(s);
        return this;
    }

    @Unsafe public @Nullable SDL_GPUVertexBufferDescription.Ptr vertex_buffer_descriptions(int assumedCount) {
        MemorySegment s = vertex_buffer_descriptionsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * SDL_GPUVertexBufferDescription.BYTES);
        return new SDL_GPUVertexBufferDescription.Ptr(s);
    }

    public @Nullable SDL_GPUVertexBufferDescription vertex_buffer_descriptions() {
        MemorySegment s = vertex_buffer_descriptionsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new SDL_GPUVertexBufferDescription(s);
    }

    public @Pointer(target=SDL_GPUVertexBufferDescription.class) MemorySegment vertex_buffer_descriptionsRaw() {
        return segment.get(LAYOUT$vertex_buffer_descriptions, OFFSET$vertex_buffer_descriptions);
    }

    public void vertex_buffer_descriptionsRaw(@Pointer(target=SDL_GPUVertexBufferDescription.class) MemorySegment value) {
        segment.set(LAYOUT$vertex_buffer_descriptions, OFFSET$vertex_buffer_descriptions, value);
    }

    public @NativeType("Uint32") @Unsigned int num_vertex_buffers() {
        return segment.get(LAYOUT$num_vertex_buffers, OFFSET$num_vertex_buffers);
    }

    public SDL_GPUVertexInputState num_vertex_buffers(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$num_vertex_buffers, OFFSET$num_vertex_buffers, value);
        return this;
    }

    public SDL_GPUVertexInputState vertex_attributes(@Nullable ISDL_GPUVertexAttribute value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        vertex_attributesRaw(s);
        return this;
    }

    @Unsafe public @Nullable SDL_GPUVertexAttribute.Ptr vertex_attributes(int assumedCount) {
        MemorySegment s = vertex_attributesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * SDL_GPUVertexAttribute.BYTES);
        return new SDL_GPUVertexAttribute.Ptr(s);
    }

    public @Nullable SDL_GPUVertexAttribute vertex_attributes() {
        MemorySegment s = vertex_attributesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new SDL_GPUVertexAttribute(s);
    }

    public @Pointer(target=SDL_GPUVertexAttribute.class) MemorySegment vertex_attributesRaw() {
        return segment.get(LAYOUT$vertex_attributes, OFFSET$vertex_attributes);
    }

    public void vertex_attributesRaw(@Pointer(target=SDL_GPUVertexAttribute.class) MemorySegment value) {
        segment.set(LAYOUT$vertex_attributes, OFFSET$vertex_attributes, value);
    }

    public @NativeType("Uint32") @Unsigned int num_vertex_attributes() {
        return segment.get(LAYOUT$num_vertex_attributes, OFFSET$num_vertex_attributes);
    }

    public SDL_GPUVertexInputState num_vertex_attributes(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$num_vertex_attributes, OFFSET$num_vertex_attributes, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(SDL_GPUVertexBufferDescription.LAYOUT).withName("vertex_buffer_descriptions"),
        ValueLayout.JAVA_INT.withName("num_vertex_buffers"),
        ValueLayout.ADDRESS.withTargetLayout(SDL_GPUVertexAttribute.LAYOUT).withName("vertex_attributes"),
        ValueLayout.JAVA_INT.withName("num_vertex_attributes")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$vertex_buffer_descriptions = PathElement.groupElement("vertex_buffer_descriptions");
    public static final PathElement PATH$num_vertex_buffers = PathElement.groupElement("num_vertex_buffers");
    public static final PathElement PATH$vertex_attributes = PathElement.groupElement("vertex_attributes");
    public static final PathElement PATH$num_vertex_attributes = PathElement.groupElement("num_vertex_attributes");

    public static final AddressLayout LAYOUT$vertex_buffer_descriptions = (AddressLayout) LAYOUT.select(PATH$vertex_buffer_descriptions);
    public static final OfInt LAYOUT$num_vertex_buffers = (OfInt) LAYOUT.select(PATH$num_vertex_buffers);
    public static final AddressLayout LAYOUT$vertex_attributes = (AddressLayout) LAYOUT.select(PATH$vertex_attributes);
    public static final OfInt LAYOUT$num_vertex_attributes = (OfInt) LAYOUT.select(PATH$num_vertex_attributes);

    public static final long SIZE$vertex_buffer_descriptions = LAYOUT$vertex_buffer_descriptions.byteSize();
    public static final long SIZE$num_vertex_buffers = LAYOUT$num_vertex_buffers.byteSize();
    public static final long SIZE$vertex_attributes = LAYOUT$vertex_attributes.byteSize();
    public static final long SIZE$num_vertex_attributes = LAYOUT$num_vertex_attributes.byteSize();

    public static final long OFFSET$vertex_buffer_descriptions = LAYOUT.byteOffset(PATH$vertex_buffer_descriptions);
    public static final long OFFSET$num_vertex_buffers = LAYOUT.byteOffset(PATH$num_vertex_buffers);
    public static final long OFFSET$vertex_attributes = LAYOUT.byteOffset(PATH$vertex_attributes);
    public static final long OFFSET$num_vertex_attributes = LAYOUT.byteOffset(PATH$num_vertex_attributes);
}
