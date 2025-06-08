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

/// A structure specifying the parameters of an indexed indirect draw command.
///
/// Note that the `first_vertex` and `first_instance` parameters are NOT
/// compatible with built-in vertex/instance ID variables in shaders (for
/// example, SV_VertexID); GPU APIs and shader languages do not define these
/// built-in variables consistently, so if your shader depends on them, the
/// only way to keep behavior consistent and portable is to always pass 0 for
/// the correlating parameter in the draw calls.
///
/// \since This struct is available since SDL 3.2.0.
///
/// \sa SDL_DrawGPUIndexedPrimitivesIndirect
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_GPUIndexedIndirectDrawCommand {
///     Uint32 num_indices; // @link substring="num_indices" target="#num_indices"
///     Uint32 num_instances; // @link substring="num_instances" target="#num_instances"
///     Uint32 first_index; // @link substring="first_index" target="#first_index"
///     Sint32 vertex_offset; // @link substring="vertex_offset" target="#vertex_offset"
///     Uint32 first_instance; // @link substring="first_instance" target="#first_instance"
/// } SDL_GPUIndexedIndirectDrawCommand;
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
public record SDL_GPUIndexedIndirectDrawCommand(@NotNull MemorySegment segment) implements ISDL_GPUIndexedIndirectDrawCommand {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_GPUIndexedIndirectDrawCommand}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_GPUIndexedIndirectDrawCommand to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_GPUIndexedIndirectDrawCommand.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_GPUIndexedIndirectDrawCommand, Iterable<SDL_GPUIndexedIndirectDrawCommand> {
        public long size() {
            return segment.byteSize() / SDL_GPUIndexedIndirectDrawCommand.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_GPUIndexedIndirectDrawCommand at(long index) {
            return new SDL_GPUIndexedIndirectDrawCommand(segment.asSlice(index * SDL_GPUIndexedIndirectDrawCommand.BYTES, SDL_GPUIndexedIndirectDrawCommand.BYTES));
        }

        public void write(long index, @NotNull SDL_GPUIndexedIndirectDrawCommand value) {
            MemorySegment s = segment.asSlice(index * SDL_GPUIndexedIndirectDrawCommand.BYTES, SDL_GPUIndexedIndirectDrawCommand.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_GPUIndexedIndirectDrawCommand.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_GPUIndexedIndirectDrawCommand.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_GPUIndexedIndirectDrawCommand.BYTES,
                (end - start) * SDL_GPUIndexedIndirectDrawCommand.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_GPUIndexedIndirectDrawCommand.BYTES));
        }

        public SDL_GPUIndexedIndirectDrawCommand[] toArray() {
            SDL_GPUIndexedIndirectDrawCommand[] ret = new SDL_GPUIndexedIndirectDrawCommand[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_GPUIndexedIndirectDrawCommand> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_GPUIndexedIndirectDrawCommand> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_GPUIndexedIndirectDrawCommand.BYTES;
            }

            @Override
            public SDL_GPUIndexedIndirectDrawCommand next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_GPUIndexedIndirectDrawCommand ret = new SDL_GPUIndexedIndirectDrawCommand(segment.asSlice(0, SDL_GPUIndexedIndirectDrawCommand.BYTES));
                segment = segment.asSlice(SDL_GPUIndexedIndirectDrawCommand.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_GPUIndexedIndirectDrawCommand allocate(Arena arena) {
        return new SDL_GPUIndexedIndirectDrawCommand(arena.allocate(LAYOUT));
    }

    public static SDL_GPUIndexedIndirectDrawCommand.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_GPUIndexedIndirectDrawCommand.Ptr(segment);
    }

    public static SDL_GPUIndexedIndirectDrawCommand clone(Arena arena, SDL_GPUIndexedIndirectDrawCommand src) {
        SDL_GPUIndexedIndirectDrawCommand ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NativeType("Uint32") @Unsigned int num_indices() {
        return segment.get(LAYOUT$num_indices, OFFSET$num_indices);
    }

    public SDL_GPUIndexedIndirectDrawCommand num_indices(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$num_indices, OFFSET$num_indices, value);
        return this;
    }

    public @NativeType("Uint32") @Unsigned int num_instances() {
        return segment.get(LAYOUT$num_instances, OFFSET$num_instances);
    }

    public SDL_GPUIndexedIndirectDrawCommand num_instances(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$num_instances, OFFSET$num_instances, value);
        return this;
    }

    public @NativeType("Uint32") @Unsigned int first_index() {
        return segment.get(LAYOUT$first_index, OFFSET$first_index);
    }

    public SDL_GPUIndexedIndirectDrawCommand first_index(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$first_index, OFFSET$first_index, value);
        return this;
    }

    public @NativeType("Sint32") int vertex_offset() {
        return segment.get(LAYOUT$vertex_offset, OFFSET$vertex_offset);
    }

    public SDL_GPUIndexedIndirectDrawCommand vertex_offset(@NativeType("Sint32") int value) {
        segment.set(LAYOUT$vertex_offset, OFFSET$vertex_offset, value);
        return this;
    }

    public @NativeType("Uint32") @Unsigned int first_instance() {
        return segment.get(LAYOUT$first_instance, OFFSET$first_instance);
    }

    public SDL_GPUIndexedIndirectDrawCommand first_instance(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$first_instance, OFFSET$first_instance, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("num_indices"),
        ValueLayout.JAVA_INT.withName("num_instances"),
        ValueLayout.JAVA_INT.withName("first_index"),
        ValueLayout.JAVA_INT.withName("vertex_offset"),
        ValueLayout.JAVA_INT.withName("first_instance")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$num_indices = PathElement.groupElement("num_indices");
    public static final PathElement PATH$num_instances = PathElement.groupElement("num_instances");
    public static final PathElement PATH$first_index = PathElement.groupElement("first_index");
    public static final PathElement PATH$vertex_offset = PathElement.groupElement("vertex_offset");
    public static final PathElement PATH$first_instance = PathElement.groupElement("first_instance");

    public static final OfInt LAYOUT$num_indices = (OfInt) LAYOUT.select(PATH$num_indices);
    public static final OfInt LAYOUT$num_instances = (OfInt) LAYOUT.select(PATH$num_instances);
    public static final OfInt LAYOUT$first_index = (OfInt) LAYOUT.select(PATH$first_index);
    public static final OfInt LAYOUT$vertex_offset = (OfInt) LAYOUT.select(PATH$vertex_offset);
    public static final OfInt LAYOUT$first_instance = (OfInt) LAYOUT.select(PATH$first_instance);

    public static final long SIZE$num_indices = LAYOUT$num_indices.byteSize();
    public static final long SIZE$num_instances = LAYOUT$num_instances.byteSize();
    public static final long SIZE$first_index = LAYOUT$first_index.byteSize();
    public static final long SIZE$vertex_offset = LAYOUT$vertex_offset.byteSize();
    public static final long SIZE$first_instance = LAYOUT$first_instance.byteSize();

    public static final long OFFSET$num_indices = LAYOUT.byteOffset(PATH$num_indices);
    public static final long OFFSET$num_instances = LAYOUT.byteOffset(PATH$num_instances);
    public static final long OFFSET$first_index = LAYOUT.byteOffset(PATH$first_index);
    public static final long OFFSET$vertex_offset = LAYOUT.byteOffset(PATH$vertex_offset);
    public static final long OFFSET$first_instance = LAYOUT.byteOffset(PATH$first_instance);
}
