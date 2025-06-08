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

/// A structure specifying the parameters of the graphics pipeline depth
/// stencil state.
///
/// \since This struct is available since SDL 3.2.0.
///
/// \sa SDL_GPUGraphicsPipelineCreateInfo
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_GPUDepthStencilState {
///     SDL_GPUCompareOp compare_op; // @link substring="SDL_GPUCompareOp" target="SDL_GPUCompareOp" @link substring="compare_op" target="#compare_op"
///     SDL_GPUStencilOpState back_stencil_state; // @link substring="SDL_GPUStencilOpState" target="SDL_GPUStencilOpState" @link substring="back_stencil_state" target="#back_stencil_state"
///     SDL_GPUStencilOpState front_stencil_state; // @link substring="SDL_GPUStencilOpState" target="SDL_GPUStencilOpState" @link substring="front_stencil_state" target="#front_stencil_state"
///     Uint8 compare_mask; // @link substring="compare_mask" target="#compare_mask"
///     Uint8 write_mask; // @link substring="write_mask" target="#write_mask"
///     bool enable_depth_test; // @link substring="enable_depth_test" target="#enable_depth_test"
///     bool enable_depth_write; // @link substring="enable_depth_write" target="#enable_depth_write"
///     bool enable_stencil_test; // @link substring="enable_stencil_test" target="#enable_stencil_test"
///     Uint8 padding1; // @link substring="padding1" target="#padding1"
///     Uint8 padding2; // @link substring="padding2" target="#padding2"
///     Uint8 padding3; // @link substring="padding3" target="#padding3"
/// } SDL_GPUDepthStencilState;
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
public record SDL_GPUDepthStencilState(@NotNull MemorySegment segment) implements ISDL_GPUDepthStencilState {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_GPUDepthStencilState}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_GPUDepthStencilState to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_GPUDepthStencilState.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_GPUDepthStencilState, Iterable<SDL_GPUDepthStencilState> {
        public long size() {
            return segment.byteSize() / SDL_GPUDepthStencilState.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_GPUDepthStencilState at(long index) {
            return new SDL_GPUDepthStencilState(segment.asSlice(index * SDL_GPUDepthStencilState.BYTES, SDL_GPUDepthStencilState.BYTES));
        }

        public void write(long index, @NotNull SDL_GPUDepthStencilState value) {
            MemorySegment s = segment.asSlice(index * SDL_GPUDepthStencilState.BYTES, SDL_GPUDepthStencilState.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_GPUDepthStencilState.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_GPUDepthStencilState.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_GPUDepthStencilState.BYTES,
                (end - start) * SDL_GPUDepthStencilState.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_GPUDepthStencilState.BYTES));
        }

        public SDL_GPUDepthStencilState[] toArray() {
            SDL_GPUDepthStencilState[] ret = new SDL_GPUDepthStencilState[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_GPUDepthStencilState> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_GPUDepthStencilState> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_GPUDepthStencilState.BYTES;
            }

            @Override
            public SDL_GPUDepthStencilState next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_GPUDepthStencilState ret = new SDL_GPUDepthStencilState(segment.asSlice(0, SDL_GPUDepthStencilState.BYTES));
                segment = segment.asSlice(SDL_GPUDepthStencilState.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_GPUDepthStencilState allocate(Arena arena) {
        return new SDL_GPUDepthStencilState(arena.allocate(LAYOUT));
    }

    public static SDL_GPUDepthStencilState.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_GPUDepthStencilState.Ptr(segment);
    }

    public static SDL_GPUDepthStencilState clone(Arena arena, SDL_GPUDepthStencilState src) {
        SDL_GPUDepthStencilState ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(SDL_GPUCompareOp.class) int compare_op() {
        return segment.get(LAYOUT$compare_op, OFFSET$compare_op);
    }

    public SDL_GPUDepthStencilState compare_op(@EnumType(SDL_GPUCompareOp.class) int value) {
        segment.set(LAYOUT$compare_op, OFFSET$compare_op, value);
        return this;
    }

    public @NotNull SDL_GPUStencilOpState back_stencil_state() {
        return new SDL_GPUStencilOpState(segment.asSlice(OFFSET$back_stencil_state, LAYOUT$back_stencil_state));
    }

    public SDL_GPUDepthStencilState back_stencil_state(@NotNull SDL_GPUStencilOpState value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$back_stencil_state, SIZE$back_stencil_state);
        return this;
    }

    public SDL_GPUDepthStencilState back_stencil_state(Consumer<@NotNull SDL_GPUStencilOpState> consumer) {
        consumer.accept(back_stencil_state());
        return this;
    }

    public @NotNull SDL_GPUStencilOpState front_stencil_state() {
        return new SDL_GPUStencilOpState(segment.asSlice(OFFSET$front_stencil_state, LAYOUT$front_stencil_state));
    }

    public SDL_GPUDepthStencilState front_stencil_state(@NotNull SDL_GPUStencilOpState value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$front_stencil_state, SIZE$front_stencil_state);
        return this;
    }

    public SDL_GPUDepthStencilState front_stencil_state(Consumer<@NotNull SDL_GPUStencilOpState> consumer) {
        consumer.accept(front_stencil_state());
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte compare_mask() {
        return segment.get(LAYOUT$compare_mask, OFFSET$compare_mask);
    }

    public SDL_GPUDepthStencilState compare_mask(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$compare_mask, OFFSET$compare_mask, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte write_mask() {
        return segment.get(LAYOUT$write_mask, OFFSET$write_mask);
    }

    public SDL_GPUDepthStencilState write_mask(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$write_mask, OFFSET$write_mask, value);
        return this;
    }

    public @NativeType("boolean") boolean enable_depth_test() {
        return segment.get(LAYOUT$enable_depth_test, OFFSET$enable_depth_test);
    }

    public SDL_GPUDepthStencilState enable_depth_test(@NativeType("boolean") boolean value) {
        segment.set(LAYOUT$enable_depth_test, OFFSET$enable_depth_test, value);
        return this;
    }

    public @NativeType("boolean") boolean enable_depth_write() {
        return segment.get(LAYOUT$enable_depth_write, OFFSET$enable_depth_write);
    }

    public SDL_GPUDepthStencilState enable_depth_write(@NativeType("boolean") boolean value) {
        segment.set(LAYOUT$enable_depth_write, OFFSET$enable_depth_write, value);
        return this;
    }

    public @NativeType("boolean") boolean enable_stencil_test() {
        return segment.get(LAYOUT$enable_stencil_test, OFFSET$enable_stencil_test);
    }

    public SDL_GPUDepthStencilState enable_stencil_test(@NativeType("boolean") boolean value) {
        segment.set(LAYOUT$enable_stencil_test, OFFSET$enable_stencil_test, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte padding1() {
        return segment.get(LAYOUT$padding1, OFFSET$padding1);
    }

    public SDL_GPUDepthStencilState padding1(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$padding1, OFFSET$padding1, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte padding2() {
        return segment.get(LAYOUT$padding2, OFFSET$padding2);
    }

    public SDL_GPUDepthStencilState padding2(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$padding2, OFFSET$padding2, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte padding3() {
        return segment.get(LAYOUT$padding3, OFFSET$padding3);
    }

    public SDL_GPUDepthStencilState padding3(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$padding3, OFFSET$padding3, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("compare_op"),
        SDL_GPUStencilOpState.LAYOUT.withName("back_stencil_state"),
        SDL_GPUStencilOpState.LAYOUT.withName("front_stencil_state"),
        ValueLayout.JAVA_BYTE.withName("compare_mask"),
        ValueLayout.JAVA_BYTE.withName("write_mask"),
        ValueLayout.JAVA_BOOLEAN.withName("enable_depth_test"),
        ValueLayout.JAVA_BOOLEAN.withName("enable_depth_write"),
        ValueLayout.JAVA_BOOLEAN.withName("enable_stencil_test"),
        ValueLayout.JAVA_BYTE.withName("padding1"),
        ValueLayout.JAVA_BYTE.withName("padding2"),
        ValueLayout.JAVA_BYTE.withName("padding3")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$compare_op = PathElement.groupElement("compare_op");
    public static final PathElement PATH$back_stencil_state = PathElement.groupElement("back_stencil_state");
    public static final PathElement PATH$front_stencil_state = PathElement.groupElement("front_stencil_state");
    public static final PathElement PATH$compare_mask = PathElement.groupElement("compare_mask");
    public static final PathElement PATH$write_mask = PathElement.groupElement("write_mask");
    public static final PathElement PATH$enable_depth_test = PathElement.groupElement("enable_depth_test");
    public static final PathElement PATH$enable_depth_write = PathElement.groupElement("enable_depth_write");
    public static final PathElement PATH$enable_stencil_test = PathElement.groupElement("enable_stencil_test");
    public static final PathElement PATH$padding1 = PathElement.groupElement("padding1");
    public static final PathElement PATH$padding2 = PathElement.groupElement("padding2");
    public static final PathElement PATH$padding3 = PathElement.groupElement("padding3");

    public static final OfInt LAYOUT$compare_op = (OfInt) LAYOUT.select(PATH$compare_op);
    public static final StructLayout LAYOUT$back_stencil_state = (StructLayout) LAYOUT.select(PATH$back_stencil_state);
    public static final StructLayout LAYOUT$front_stencil_state = (StructLayout) LAYOUT.select(PATH$front_stencil_state);
    public static final OfByte LAYOUT$compare_mask = (OfByte) LAYOUT.select(PATH$compare_mask);
    public static final OfByte LAYOUT$write_mask = (OfByte) LAYOUT.select(PATH$write_mask);
    public static final OfBoolean LAYOUT$enable_depth_test = (OfBoolean) LAYOUT.select(PATH$enable_depth_test);
    public static final OfBoolean LAYOUT$enable_depth_write = (OfBoolean) LAYOUT.select(PATH$enable_depth_write);
    public static final OfBoolean LAYOUT$enable_stencil_test = (OfBoolean) LAYOUT.select(PATH$enable_stencil_test);
    public static final OfByte LAYOUT$padding1 = (OfByte) LAYOUT.select(PATH$padding1);
    public static final OfByte LAYOUT$padding2 = (OfByte) LAYOUT.select(PATH$padding2);
    public static final OfByte LAYOUT$padding3 = (OfByte) LAYOUT.select(PATH$padding3);

    public static final long SIZE$compare_op = LAYOUT$compare_op.byteSize();
    public static final long SIZE$back_stencil_state = LAYOUT$back_stencil_state.byteSize();
    public static final long SIZE$front_stencil_state = LAYOUT$front_stencil_state.byteSize();
    public static final long SIZE$compare_mask = LAYOUT$compare_mask.byteSize();
    public static final long SIZE$write_mask = LAYOUT$write_mask.byteSize();
    public static final long SIZE$enable_depth_test = LAYOUT$enable_depth_test.byteSize();
    public static final long SIZE$enable_depth_write = LAYOUT$enable_depth_write.byteSize();
    public static final long SIZE$enable_stencil_test = LAYOUT$enable_stencil_test.byteSize();
    public static final long SIZE$padding1 = LAYOUT$padding1.byteSize();
    public static final long SIZE$padding2 = LAYOUT$padding2.byteSize();
    public static final long SIZE$padding3 = LAYOUT$padding3.byteSize();

    public static final long OFFSET$compare_op = LAYOUT.byteOffset(PATH$compare_op);
    public static final long OFFSET$back_stencil_state = LAYOUT.byteOffset(PATH$back_stencil_state);
    public static final long OFFSET$front_stencil_state = LAYOUT.byteOffset(PATH$front_stencil_state);
    public static final long OFFSET$compare_mask = LAYOUT.byteOffset(PATH$compare_mask);
    public static final long OFFSET$write_mask = LAYOUT.byteOffset(PATH$write_mask);
    public static final long OFFSET$enable_depth_test = LAYOUT.byteOffset(PATH$enable_depth_test);
    public static final long OFFSET$enable_depth_write = LAYOUT.byteOffset(PATH$enable_depth_write);
    public static final long OFFSET$enable_stencil_test = LAYOUT.byteOffset(PATH$enable_stencil_test);
    public static final long OFFSET$padding1 = LAYOUT.byteOffset(PATH$padding1);
    public static final long OFFSET$padding2 = LAYOUT.byteOffset(PATH$padding2);
    public static final long OFFSET$padding3 = LAYOUT.byteOffset(PATH$padding3);
}
