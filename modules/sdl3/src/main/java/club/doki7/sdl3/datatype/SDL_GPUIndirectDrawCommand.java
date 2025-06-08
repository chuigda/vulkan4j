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

/// A structure specifying the parameters of an indirect draw command.
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
/// \sa SDL_DrawGPUPrimitivesIndirect
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_GPUIndirectDrawCommand {
///     Uint32 num_vertices; // @link substring="num_vertices" target="#num_vertices"
///     Uint32 num_instances; // @link substring="num_instances" target="#num_instances"
///     Uint32 first_vertex; // @link substring="first_vertex" target="#first_vertex"
///     Uint32 first_instance; // @link substring="first_instance" target="#first_instance"
/// } SDL_GPUIndirectDrawCommand;
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
public record SDL_GPUIndirectDrawCommand(@NotNull MemorySegment segment) implements ISDL_GPUIndirectDrawCommand {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_GPUIndirectDrawCommand}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_GPUIndirectDrawCommand to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_GPUIndirectDrawCommand.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_GPUIndirectDrawCommand, Iterable<SDL_GPUIndirectDrawCommand> {
        public long size() {
            return segment.byteSize() / SDL_GPUIndirectDrawCommand.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_GPUIndirectDrawCommand at(long index) {
            return new SDL_GPUIndirectDrawCommand(segment.asSlice(index * SDL_GPUIndirectDrawCommand.BYTES, SDL_GPUIndirectDrawCommand.BYTES));
        }

        public void write(long index, @NotNull SDL_GPUIndirectDrawCommand value) {
            MemorySegment s = segment.asSlice(index * SDL_GPUIndirectDrawCommand.BYTES, SDL_GPUIndirectDrawCommand.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_GPUIndirectDrawCommand.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_GPUIndirectDrawCommand.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_GPUIndirectDrawCommand.BYTES,
                (end - start) * SDL_GPUIndirectDrawCommand.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_GPUIndirectDrawCommand.BYTES));
        }

        public SDL_GPUIndirectDrawCommand[] toArray() {
            SDL_GPUIndirectDrawCommand[] ret = new SDL_GPUIndirectDrawCommand[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_GPUIndirectDrawCommand> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_GPUIndirectDrawCommand> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_GPUIndirectDrawCommand.BYTES;
            }

            @Override
            public SDL_GPUIndirectDrawCommand next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_GPUIndirectDrawCommand ret = new SDL_GPUIndirectDrawCommand(segment.asSlice(0, SDL_GPUIndirectDrawCommand.BYTES));
                segment = segment.asSlice(SDL_GPUIndirectDrawCommand.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_GPUIndirectDrawCommand allocate(Arena arena) {
        return new SDL_GPUIndirectDrawCommand(arena.allocate(LAYOUT));
    }

    public static SDL_GPUIndirectDrawCommand.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_GPUIndirectDrawCommand.Ptr(segment);
    }

    public static SDL_GPUIndirectDrawCommand clone(Arena arena, SDL_GPUIndirectDrawCommand src) {
        SDL_GPUIndirectDrawCommand ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NativeType("Uint32") @Unsigned int num_vertices() {
        return segment.get(LAYOUT$num_vertices, OFFSET$num_vertices);
    }

    public SDL_GPUIndirectDrawCommand num_vertices(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$num_vertices, OFFSET$num_vertices, value);
        return this;
    }

    public @NativeType("Uint32") @Unsigned int num_instances() {
        return segment.get(LAYOUT$num_instances, OFFSET$num_instances);
    }

    public SDL_GPUIndirectDrawCommand num_instances(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$num_instances, OFFSET$num_instances, value);
        return this;
    }

    public @NativeType("Uint32") @Unsigned int first_vertex() {
        return segment.get(LAYOUT$first_vertex, OFFSET$first_vertex);
    }

    public SDL_GPUIndirectDrawCommand first_vertex(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$first_vertex, OFFSET$first_vertex, value);
        return this;
    }

    public @NativeType("Uint32") @Unsigned int first_instance() {
        return segment.get(LAYOUT$first_instance, OFFSET$first_instance);
    }

    public SDL_GPUIndirectDrawCommand first_instance(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$first_instance, OFFSET$first_instance, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("num_vertices"),
        ValueLayout.JAVA_INT.withName("num_instances"),
        ValueLayout.JAVA_INT.withName("first_vertex"),
        ValueLayout.JAVA_INT.withName("first_instance")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$num_vertices = PathElement.groupElement("num_vertices");
    public static final PathElement PATH$num_instances = PathElement.groupElement("num_instances");
    public static final PathElement PATH$first_vertex = PathElement.groupElement("first_vertex");
    public static final PathElement PATH$first_instance = PathElement.groupElement("first_instance");

    public static final OfInt LAYOUT$num_vertices = (OfInt) LAYOUT.select(PATH$num_vertices);
    public static final OfInt LAYOUT$num_instances = (OfInt) LAYOUT.select(PATH$num_instances);
    public static final OfInt LAYOUT$first_vertex = (OfInt) LAYOUT.select(PATH$first_vertex);
    public static final OfInt LAYOUT$first_instance = (OfInt) LAYOUT.select(PATH$first_instance);

    public static final long SIZE$num_vertices = LAYOUT$num_vertices.byteSize();
    public static final long SIZE$num_instances = LAYOUT$num_instances.byteSize();
    public static final long SIZE$first_vertex = LAYOUT$first_vertex.byteSize();
    public static final long SIZE$first_instance = LAYOUT$first_instance.byteSize();

    public static final long OFFSET$num_vertices = LAYOUT.byteOffset(PATH$num_vertices);
    public static final long OFFSET$num_instances = LAYOUT.byteOffset(PATH$num_instances);
    public static final long OFFSET$first_vertex = LAYOUT.byteOffset(PATH$first_vertex);
    public static final long OFFSET$first_instance = LAYOUT.byteOffset(PATH$first_instance);
}
