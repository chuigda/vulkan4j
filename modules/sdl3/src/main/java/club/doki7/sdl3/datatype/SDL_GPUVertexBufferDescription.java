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

/// A structure specifying the parameters of vertex buffers used in a graphics
/// pipeline.
///
/// When you call SDL_BindGPUVertexBuffers, you specify the binding slots of
/// the vertex buffers. For example if you called SDL_BindGPUVertexBuffers with
/// a first_slot of 2 and num_bindings of 3, the binding slots 2, 3, 4 would be
/// used by the vertex buffers you pass in.
///
/// Vertex attributes are linked to buffers via the buffer_slot field of
/// SDL_GPUVertexAttribute. For example, if an attribute has a buffer_slot of
/// 0, then that attribute belongs to the vertex buffer bound at slot 0.
///
/// Since: This struct is available since SDL 3.2.0.
///
/// See also:
/// - `SDL_GPUVertexAttribute`
/// - `SDL_GPUVertexInputRate`
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_GPUVertexBufferDescription {
///     Uint32 slot; // @link substring="slot" target="#slot"
///     Uint32 pitch; // @link substring="pitch" target="#pitch"
///     SDL_GPUVertexInputRate input_rate; // @link substring="SDL_GPUVertexInputRate" target="SDL_GPUVertexInputRate" @link substring="input_rate" target="#input_rate"
///     Uint32 instance_step_rate; // @link substring="instance_step_rate" target="#instance_step_rate"
/// } SDL_GPUVertexBufferDescription;
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
public record SDL_GPUVertexBufferDescription(@NotNull MemorySegment segment) implements ISDL_GPUVertexBufferDescription {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_GPUVertexBufferDescription}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_GPUVertexBufferDescription to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_GPUVertexBufferDescription.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_GPUVertexBufferDescription, Iterable<SDL_GPUVertexBufferDescription> {
        public long size() {
            return segment.byteSize() / SDL_GPUVertexBufferDescription.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_GPUVertexBufferDescription at(long index) {
            return new SDL_GPUVertexBufferDescription(segment.asSlice(index * SDL_GPUVertexBufferDescription.BYTES, SDL_GPUVertexBufferDescription.BYTES));
        }

        public void write(long index, @NotNull SDL_GPUVertexBufferDescription value) {
            MemorySegment s = segment.asSlice(index * SDL_GPUVertexBufferDescription.BYTES, SDL_GPUVertexBufferDescription.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_GPUVertexBufferDescription.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_GPUVertexBufferDescription.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_GPUVertexBufferDescription.BYTES,
                (end - start) * SDL_GPUVertexBufferDescription.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_GPUVertexBufferDescription.BYTES));
        }

        public SDL_GPUVertexBufferDescription[] toArray() {
            SDL_GPUVertexBufferDescription[] ret = new SDL_GPUVertexBufferDescription[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_GPUVertexBufferDescription> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_GPUVertexBufferDescription> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_GPUVertexBufferDescription.BYTES;
            }

            @Override
            public SDL_GPUVertexBufferDescription next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_GPUVertexBufferDescription ret = new SDL_GPUVertexBufferDescription(segment.asSlice(0, SDL_GPUVertexBufferDescription.BYTES));
                segment = segment.asSlice(SDL_GPUVertexBufferDescription.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_GPUVertexBufferDescription allocate(Arena arena) {
        return new SDL_GPUVertexBufferDescription(arena.allocate(LAYOUT));
    }

    public static SDL_GPUVertexBufferDescription.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_GPUVertexBufferDescription.Ptr(segment);
    }

    public static SDL_GPUVertexBufferDescription clone(Arena arena, SDL_GPUVertexBufferDescription src) {
        SDL_GPUVertexBufferDescription ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NativeType("Uint32") @Unsigned int slot() {
        return segment.get(LAYOUT$slot, OFFSET$slot);
    }

    public SDL_GPUVertexBufferDescription slot(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$slot, OFFSET$slot, value);
        return this;
    }

    public @NativeType("Uint32") @Unsigned int pitch() {
        return segment.get(LAYOUT$pitch, OFFSET$pitch);
    }

    public SDL_GPUVertexBufferDescription pitch(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$pitch, OFFSET$pitch, value);
        return this;
    }

    public @EnumType(SDL_GPUVertexInputRate.class) int input_rate() {
        return segment.get(LAYOUT$input_rate, OFFSET$input_rate);
    }

    public SDL_GPUVertexBufferDescription input_rate(@EnumType(SDL_GPUVertexInputRate.class) int value) {
        segment.set(LAYOUT$input_rate, OFFSET$input_rate, value);
        return this;
    }

    public @NativeType("Uint32") @Unsigned int instance_step_rate() {
        return segment.get(LAYOUT$instance_step_rate, OFFSET$instance_step_rate);
    }

    public SDL_GPUVertexBufferDescription instance_step_rate(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$instance_step_rate, OFFSET$instance_step_rate, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("slot"),
        ValueLayout.JAVA_INT.withName("pitch"),
        ValueLayout.JAVA_INT.withName("input_rate"),
        ValueLayout.JAVA_INT.withName("instance_step_rate")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$slot = PathElement.groupElement("slot");
    public static final PathElement PATH$pitch = PathElement.groupElement("pitch");
    public static final PathElement PATH$input_rate = PathElement.groupElement("input_rate");
    public static final PathElement PATH$instance_step_rate = PathElement.groupElement("instance_step_rate");

    public static final OfInt LAYOUT$slot = (OfInt) LAYOUT.select(PATH$slot);
    public static final OfInt LAYOUT$pitch = (OfInt) LAYOUT.select(PATH$pitch);
    public static final OfInt LAYOUT$input_rate = (OfInt) LAYOUT.select(PATH$input_rate);
    public static final OfInt LAYOUT$instance_step_rate = (OfInt) LAYOUT.select(PATH$instance_step_rate);

    public static final long SIZE$slot = LAYOUT$slot.byteSize();
    public static final long SIZE$pitch = LAYOUT$pitch.byteSize();
    public static final long SIZE$input_rate = LAYOUT$input_rate.byteSize();
    public static final long SIZE$instance_step_rate = LAYOUT$instance_step_rate.byteSize();

    public static final long OFFSET$slot = LAYOUT.byteOffset(PATH$slot);
    public static final long OFFSET$pitch = LAYOUT.byteOffset(PATH$pitch);
    public static final long OFFSET$input_rate = LAYOUT.byteOffset(PATH$input_rate);
    public static final long OFFSET$instance_step_rate = LAYOUT.byteOffset(PATH$instance_step_rate);
}
