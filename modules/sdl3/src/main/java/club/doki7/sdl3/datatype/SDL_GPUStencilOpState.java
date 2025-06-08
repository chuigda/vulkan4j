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

/// A structure specifying the stencil operation state of a graphics pipeline.
///
/// Since: This struct is available since SDL 3.2.0.
///
/// See also:
/// - `SDL_GPUDepthStencilState`
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_GPUStencilOpState {
///     SDL_GPUStencilOp fail_op; // @link substring="SDL_GPUStencilOp" target="SDL_GPUStencilOp" @link substring="fail_op" target="#fail_op"
///     SDL_GPUStencilOp pass_op; // @link substring="SDL_GPUStencilOp" target="SDL_GPUStencilOp" @link substring="pass_op" target="#pass_op"
///     SDL_GPUStencilOp depth_fail_op; // @link substring="SDL_GPUStencilOp" target="SDL_GPUStencilOp" @link substring="depth_fail_op" target="#depth_fail_op"
///     SDL_GPUCompareOp compare_op; // @link substring="SDL_GPUCompareOp" target="SDL_GPUCompareOp" @link substring="compare_op" target="#compare_op"
/// } SDL_GPUStencilOpState;
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
public record SDL_GPUStencilOpState(@NotNull MemorySegment segment) implements ISDL_GPUStencilOpState {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_GPUStencilOpState}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_GPUStencilOpState to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_GPUStencilOpState.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_GPUStencilOpState, Iterable<SDL_GPUStencilOpState> {
        public long size() {
            return segment.byteSize() / SDL_GPUStencilOpState.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_GPUStencilOpState at(long index) {
            return new SDL_GPUStencilOpState(segment.asSlice(index * SDL_GPUStencilOpState.BYTES, SDL_GPUStencilOpState.BYTES));
        }

        public void write(long index, @NotNull SDL_GPUStencilOpState value) {
            MemorySegment s = segment.asSlice(index * SDL_GPUStencilOpState.BYTES, SDL_GPUStencilOpState.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_GPUStencilOpState.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_GPUStencilOpState.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_GPUStencilOpState.BYTES,
                (end - start) * SDL_GPUStencilOpState.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_GPUStencilOpState.BYTES));
        }

        public SDL_GPUStencilOpState[] toArray() {
            SDL_GPUStencilOpState[] ret = new SDL_GPUStencilOpState[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_GPUStencilOpState> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_GPUStencilOpState> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_GPUStencilOpState.BYTES;
            }

            @Override
            public SDL_GPUStencilOpState next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_GPUStencilOpState ret = new SDL_GPUStencilOpState(segment.asSlice(0, SDL_GPUStencilOpState.BYTES));
                segment = segment.asSlice(SDL_GPUStencilOpState.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_GPUStencilOpState allocate(Arena arena) {
        return new SDL_GPUStencilOpState(arena.allocate(LAYOUT));
    }

    public static SDL_GPUStencilOpState.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_GPUStencilOpState.Ptr(segment);
    }

    public static SDL_GPUStencilOpState clone(Arena arena, SDL_GPUStencilOpState src) {
        SDL_GPUStencilOpState ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(SDL_GPUStencilOp.class) int fail_op() {
        return segment.get(LAYOUT$fail_op, OFFSET$fail_op);
    }

    public SDL_GPUStencilOpState fail_op(@EnumType(SDL_GPUStencilOp.class) int value) {
        segment.set(LAYOUT$fail_op, OFFSET$fail_op, value);
        return this;
    }

    public @EnumType(SDL_GPUStencilOp.class) int pass_op() {
        return segment.get(LAYOUT$pass_op, OFFSET$pass_op);
    }

    public SDL_GPUStencilOpState pass_op(@EnumType(SDL_GPUStencilOp.class) int value) {
        segment.set(LAYOUT$pass_op, OFFSET$pass_op, value);
        return this;
    }

    public @EnumType(SDL_GPUStencilOp.class) int depth_fail_op() {
        return segment.get(LAYOUT$depth_fail_op, OFFSET$depth_fail_op);
    }

    public SDL_GPUStencilOpState depth_fail_op(@EnumType(SDL_GPUStencilOp.class) int value) {
        segment.set(LAYOUT$depth_fail_op, OFFSET$depth_fail_op, value);
        return this;
    }

    public @EnumType(SDL_GPUCompareOp.class) int compare_op() {
        return segment.get(LAYOUT$compare_op, OFFSET$compare_op);
    }

    public SDL_GPUStencilOpState compare_op(@EnumType(SDL_GPUCompareOp.class) int value) {
        segment.set(LAYOUT$compare_op, OFFSET$compare_op, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("fail_op"),
        ValueLayout.JAVA_INT.withName("pass_op"),
        ValueLayout.JAVA_INT.withName("depth_fail_op"),
        ValueLayout.JAVA_INT.withName("compare_op")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$fail_op = PathElement.groupElement("fail_op");
    public static final PathElement PATH$pass_op = PathElement.groupElement("pass_op");
    public static final PathElement PATH$depth_fail_op = PathElement.groupElement("depth_fail_op");
    public static final PathElement PATH$compare_op = PathElement.groupElement("compare_op");

    public static final OfInt LAYOUT$fail_op = (OfInt) LAYOUT.select(PATH$fail_op);
    public static final OfInt LAYOUT$pass_op = (OfInt) LAYOUT.select(PATH$pass_op);
    public static final OfInt LAYOUT$depth_fail_op = (OfInt) LAYOUT.select(PATH$depth_fail_op);
    public static final OfInt LAYOUT$compare_op = (OfInt) LAYOUT.select(PATH$compare_op);

    public static final long SIZE$fail_op = LAYOUT$fail_op.byteSize();
    public static final long SIZE$pass_op = LAYOUT$pass_op.byteSize();
    public static final long SIZE$depth_fail_op = LAYOUT$depth_fail_op.byteSize();
    public static final long SIZE$compare_op = LAYOUT$compare_op.byteSize();

    public static final long OFFSET$fail_op = LAYOUT.byteOffset(PATH$fail_op);
    public static final long OFFSET$pass_op = LAYOUT.byteOffset(PATH$pass_op);
    public static final long OFFSET$depth_fail_op = LAYOUT.byteOffset(PATH$depth_fail_op);
    public static final long OFFSET$compare_op = LAYOUT.byteOffset(PATH$compare_op);
}
