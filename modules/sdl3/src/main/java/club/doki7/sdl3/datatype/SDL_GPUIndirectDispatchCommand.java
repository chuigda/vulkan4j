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

/// A structure specifying the parameters of an indexed dispatch command.
///
/// \since This struct is available since SDL 3.2.0.
///
/// \sa SDL_DispatchGPUComputeIndirect
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_GPUIndirectDispatchCommand {
///     Uint32 groupcount_x; // @link substring="groupcount_x" target="#groupcount_x"
///     Uint32 groupcount_y; // @link substring="groupcount_y" target="#groupcount_y"
///     Uint32 groupcount_z; // @link substring="groupcount_z" target="#groupcount_z"
/// } SDL_GPUIndirectDispatchCommand;
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
public record SDL_GPUIndirectDispatchCommand(@NotNull MemorySegment segment) implements ISDL_GPUIndirectDispatchCommand {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_GPUIndirectDispatchCommand}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_GPUIndirectDispatchCommand to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_GPUIndirectDispatchCommand.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_GPUIndirectDispatchCommand, Iterable<SDL_GPUIndirectDispatchCommand> {
        public long size() {
            return segment.byteSize() / SDL_GPUIndirectDispatchCommand.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_GPUIndirectDispatchCommand at(long index) {
            return new SDL_GPUIndirectDispatchCommand(segment.asSlice(index * SDL_GPUIndirectDispatchCommand.BYTES, SDL_GPUIndirectDispatchCommand.BYTES));
        }

        public void write(long index, @NotNull SDL_GPUIndirectDispatchCommand value) {
            MemorySegment s = segment.asSlice(index * SDL_GPUIndirectDispatchCommand.BYTES, SDL_GPUIndirectDispatchCommand.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_GPUIndirectDispatchCommand.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_GPUIndirectDispatchCommand.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_GPUIndirectDispatchCommand.BYTES,
                (end - start) * SDL_GPUIndirectDispatchCommand.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_GPUIndirectDispatchCommand.BYTES));
        }

        public SDL_GPUIndirectDispatchCommand[] toArray() {
            SDL_GPUIndirectDispatchCommand[] ret = new SDL_GPUIndirectDispatchCommand[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_GPUIndirectDispatchCommand> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_GPUIndirectDispatchCommand> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_GPUIndirectDispatchCommand.BYTES;
            }

            @Override
            public SDL_GPUIndirectDispatchCommand next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_GPUIndirectDispatchCommand ret = new SDL_GPUIndirectDispatchCommand(segment.asSlice(0, SDL_GPUIndirectDispatchCommand.BYTES));
                segment = segment.asSlice(SDL_GPUIndirectDispatchCommand.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_GPUIndirectDispatchCommand allocate(Arena arena) {
        return new SDL_GPUIndirectDispatchCommand(arena.allocate(LAYOUT));
    }

    public static SDL_GPUIndirectDispatchCommand.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_GPUIndirectDispatchCommand.Ptr(segment);
    }

    public static SDL_GPUIndirectDispatchCommand clone(Arena arena, SDL_GPUIndirectDispatchCommand src) {
        SDL_GPUIndirectDispatchCommand ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NativeType("Uint32") @Unsigned int groupcount_x() {
        return segment.get(LAYOUT$groupcount_x, OFFSET$groupcount_x);
    }

    public SDL_GPUIndirectDispatchCommand groupcount_x(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$groupcount_x, OFFSET$groupcount_x, value);
        return this;
    }

    public @NativeType("Uint32") @Unsigned int groupcount_y() {
        return segment.get(LAYOUT$groupcount_y, OFFSET$groupcount_y);
    }

    public SDL_GPUIndirectDispatchCommand groupcount_y(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$groupcount_y, OFFSET$groupcount_y, value);
        return this;
    }

    public @NativeType("Uint32") @Unsigned int groupcount_z() {
        return segment.get(LAYOUT$groupcount_z, OFFSET$groupcount_z);
    }

    public SDL_GPUIndirectDispatchCommand groupcount_z(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$groupcount_z, OFFSET$groupcount_z, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("groupcount_x"),
        ValueLayout.JAVA_INT.withName("groupcount_y"),
        ValueLayout.JAVA_INT.withName("groupcount_z")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$groupcount_x = PathElement.groupElement("groupcount_x");
    public static final PathElement PATH$groupcount_y = PathElement.groupElement("groupcount_y");
    public static final PathElement PATH$groupcount_z = PathElement.groupElement("groupcount_z");

    public static final OfInt LAYOUT$groupcount_x = (OfInt) LAYOUT.select(PATH$groupcount_x);
    public static final OfInt LAYOUT$groupcount_y = (OfInt) LAYOUT.select(PATH$groupcount_y);
    public static final OfInt LAYOUT$groupcount_z = (OfInt) LAYOUT.select(PATH$groupcount_z);

    public static final long SIZE$groupcount_x = LAYOUT$groupcount_x.byteSize();
    public static final long SIZE$groupcount_y = LAYOUT$groupcount_y.byteSize();
    public static final long SIZE$groupcount_z = LAYOUT$groupcount_z.byteSize();

    public static final long OFFSET$groupcount_x = LAYOUT.byteOffset(PATH$groupcount_x);
    public static final long OFFSET$groupcount_y = LAYOUT.byteOffset(PATH$groupcount_y);
    public static final long OFFSET$groupcount_z = LAYOUT.byteOffset(PATH$groupcount_z);
}
