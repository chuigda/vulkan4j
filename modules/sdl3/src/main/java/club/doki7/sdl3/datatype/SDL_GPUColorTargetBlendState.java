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

/// A structure specifying the blend state of a color target.
///
/// \since This struct is available since SDL 3.2.0.
///
/// \sa SDL_GPUColorTargetDescription
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_GPUColorTargetBlendState {
///     SDL_GPUBlendFactor src_color_blendfactor; // @link substring="SDL_GPUBlendFactor" target="SDL_GPUBlendFactor" @link substring="src_color_blendfactor" target="#src_color_blendfactor"
///     SDL_GPUBlendFactor dst_color_blendfactor; // @link substring="SDL_GPUBlendFactor" target="SDL_GPUBlendFactor" @link substring="dst_color_blendfactor" target="#dst_color_blendfactor"
///     SDL_GPUBlendOp color_blend_op; // @link substring="SDL_GPUBlendOp" target="SDL_GPUBlendOp" @link substring="color_blend_op" target="#color_blend_op"
///     SDL_GPUBlendFactor src_alpha_blendfactor; // @link substring="SDL_GPUBlendFactor" target="SDL_GPUBlendFactor" @link substring="src_alpha_blendfactor" target="#src_alpha_blendfactor"
///     SDL_GPUBlendFactor dst_alpha_blendfactor; // @link substring="SDL_GPUBlendFactor" target="SDL_GPUBlendFactor" @link substring="dst_alpha_blendfactor" target="#dst_alpha_blendfactor"
///     SDL_GPUBlendOp alpha_blend_op; // @link substring="SDL_GPUBlendOp" target="SDL_GPUBlendOp" @link substring="alpha_blend_op" target="#alpha_blend_op"
///     SDL_GPUColorComponentFlags color_write_mask; // @link substring="SDL_GPUColorComponentFlags" target="SDL_GPUColorComponentFlags" @link substring="color_write_mask" target="#color_write_mask"
///     bool enable_blend; // @link substring="enable_blend" target="#enable_blend"
///     bool enable_color_write_mask; // @link substring="enable_color_write_mask" target="#enable_color_write_mask"
///     Uint8 padding1; // @link substring="padding1" target="#padding1"
///     Uint8 padding2; // @link substring="padding2" target="#padding2"
/// } SDL_GPUColorTargetBlendState;
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
public record SDL_GPUColorTargetBlendState(@NotNull MemorySegment segment) implements ISDL_GPUColorTargetBlendState {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_GPUColorTargetBlendState}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_GPUColorTargetBlendState to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_GPUColorTargetBlendState.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_GPUColorTargetBlendState, Iterable<SDL_GPUColorTargetBlendState> {
        public long size() {
            return segment.byteSize() / SDL_GPUColorTargetBlendState.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_GPUColorTargetBlendState at(long index) {
            return new SDL_GPUColorTargetBlendState(segment.asSlice(index * SDL_GPUColorTargetBlendState.BYTES, SDL_GPUColorTargetBlendState.BYTES));
        }

        public void write(long index, @NotNull SDL_GPUColorTargetBlendState value) {
            MemorySegment s = segment.asSlice(index * SDL_GPUColorTargetBlendState.BYTES, SDL_GPUColorTargetBlendState.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_GPUColorTargetBlendState.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_GPUColorTargetBlendState.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_GPUColorTargetBlendState.BYTES,
                (end - start) * SDL_GPUColorTargetBlendState.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_GPUColorTargetBlendState.BYTES));
        }

        public SDL_GPUColorTargetBlendState[] toArray() {
            SDL_GPUColorTargetBlendState[] ret = new SDL_GPUColorTargetBlendState[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_GPUColorTargetBlendState> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_GPUColorTargetBlendState> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_GPUColorTargetBlendState.BYTES;
            }

            @Override
            public SDL_GPUColorTargetBlendState next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_GPUColorTargetBlendState ret = new SDL_GPUColorTargetBlendState(segment.asSlice(0, SDL_GPUColorTargetBlendState.BYTES));
                segment = segment.asSlice(SDL_GPUColorTargetBlendState.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_GPUColorTargetBlendState allocate(Arena arena) {
        return new SDL_GPUColorTargetBlendState(arena.allocate(LAYOUT));
    }

    public static SDL_GPUColorTargetBlendState.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_GPUColorTargetBlendState.Ptr(segment);
    }

    public static SDL_GPUColorTargetBlendState clone(Arena arena, SDL_GPUColorTargetBlendState src) {
        SDL_GPUColorTargetBlendState ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(SDL_GPUBlendFactor.class) int src_color_blendfactor() {
        return segment.get(LAYOUT$src_color_blendfactor, OFFSET$src_color_blendfactor);
    }

    public SDL_GPUColorTargetBlendState src_color_blendfactor(@EnumType(SDL_GPUBlendFactor.class) int value) {
        segment.set(LAYOUT$src_color_blendfactor, OFFSET$src_color_blendfactor, value);
        return this;
    }

    public @EnumType(SDL_GPUBlendFactor.class) int dst_color_blendfactor() {
        return segment.get(LAYOUT$dst_color_blendfactor, OFFSET$dst_color_blendfactor);
    }

    public SDL_GPUColorTargetBlendState dst_color_blendfactor(@EnumType(SDL_GPUBlendFactor.class) int value) {
        segment.set(LAYOUT$dst_color_blendfactor, OFFSET$dst_color_blendfactor, value);
        return this;
    }

    public @EnumType(SDL_GPUBlendOp.class) int color_blend_op() {
        return segment.get(LAYOUT$color_blend_op, OFFSET$color_blend_op);
    }

    public SDL_GPUColorTargetBlendState color_blend_op(@EnumType(SDL_GPUBlendOp.class) int value) {
        segment.set(LAYOUT$color_blend_op, OFFSET$color_blend_op, value);
        return this;
    }

    public @EnumType(SDL_GPUBlendFactor.class) int src_alpha_blendfactor() {
        return segment.get(LAYOUT$src_alpha_blendfactor, OFFSET$src_alpha_blendfactor);
    }

    public SDL_GPUColorTargetBlendState src_alpha_blendfactor(@EnumType(SDL_GPUBlendFactor.class) int value) {
        segment.set(LAYOUT$src_alpha_blendfactor, OFFSET$src_alpha_blendfactor, value);
        return this;
    }

    public @EnumType(SDL_GPUBlendFactor.class) int dst_alpha_blendfactor() {
        return segment.get(LAYOUT$dst_alpha_blendfactor, OFFSET$dst_alpha_blendfactor);
    }

    public SDL_GPUColorTargetBlendState dst_alpha_blendfactor(@EnumType(SDL_GPUBlendFactor.class) int value) {
        segment.set(LAYOUT$dst_alpha_blendfactor, OFFSET$dst_alpha_blendfactor, value);
        return this;
    }

    public @EnumType(SDL_GPUBlendOp.class) int alpha_blend_op() {
        return segment.get(LAYOUT$alpha_blend_op, OFFSET$alpha_blend_op);
    }

    public SDL_GPUColorTargetBlendState alpha_blend_op(@EnumType(SDL_GPUBlendOp.class) int value) {
        segment.set(LAYOUT$alpha_blend_op, OFFSET$alpha_blend_op, value);
        return this;
    }

    public @EnumType(SDL_GPUColorComponentFlags.class) byte color_write_mask() {
        return segment.get(LAYOUT$color_write_mask, OFFSET$color_write_mask);
    }

    public SDL_GPUColorTargetBlendState color_write_mask(@EnumType(SDL_GPUColorComponentFlags.class) byte value) {
        segment.set(LAYOUT$color_write_mask, OFFSET$color_write_mask, value);
        return this;
    }

    public @NativeType("boolean") boolean enable_blend() {
        return segment.get(LAYOUT$enable_blend, OFFSET$enable_blend);
    }

    public SDL_GPUColorTargetBlendState enable_blend(@NativeType("boolean") boolean value) {
        segment.set(LAYOUT$enable_blend, OFFSET$enable_blend, value);
        return this;
    }

    public @NativeType("boolean") boolean enable_color_write_mask() {
        return segment.get(LAYOUT$enable_color_write_mask, OFFSET$enable_color_write_mask);
    }

    public SDL_GPUColorTargetBlendState enable_color_write_mask(@NativeType("boolean") boolean value) {
        segment.set(LAYOUT$enable_color_write_mask, OFFSET$enable_color_write_mask, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte padding1() {
        return segment.get(LAYOUT$padding1, OFFSET$padding1);
    }

    public SDL_GPUColorTargetBlendState padding1(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$padding1, OFFSET$padding1, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte padding2() {
        return segment.get(LAYOUT$padding2, OFFSET$padding2);
    }

    public SDL_GPUColorTargetBlendState padding2(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$padding2, OFFSET$padding2, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("src_color_blendfactor"),
        ValueLayout.JAVA_INT.withName("dst_color_blendfactor"),
        ValueLayout.JAVA_INT.withName("color_blend_op"),
        ValueLayout.JAVA_INT.withName("src_alpha_blendfactor"),
        ValueLayout.JAVA_INT.withName("dst_alpha_blendfactor"),
        ValueLayout.JAVA_INT.withName("alpha_blend_op"),
        ValueLayout.JAVA_BYTE.withName("color_write_mask"),
        ValueLayout.JAVA_BOOLEAN.withName("enable_blend"),
        ValueLayout.JAVA_BOOLEAN.withName("enable_color_write_mask"),
        ValueLayout.JAVA_BYTE.withName("padding1"),
        ValueLayout.JAVA_BYTE.withName("padding2")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$src_color_blendfactor = PathElement.groupElement("src_color_blendfactor");
    public static final PathElement PATH$dst_color_blendfactor = PathElement.groupElement("dst_color_blendfactor");
    public static final PathElement PATH$color_blend_op = PathElement.groupElement("color_blend_op");
    public static final PathElement PATH$src_alpha_blendfactor = PathElement.groupElement("src_alpha_blendfactor");
    public static final PathElement PATH$dst_alpha_blendfactor = PathElement.groupElement("dst_alpha_blendfactor");
    public static final PathElement PATH$alpha_blend_op = PathElement.groupElement("alpha_blend_op");
    public static final PathElement PATH$color_write_mask = PathElement.groupElement("color_write_mask");
    public static final PathElement PATH$enable_blend = PathElement.groupElement("enable_blend");
    public static final PathElement PATH$enable_color_write_mask = PathElement.groupElement("enable_color_write_mask");
    public static final PathElement PATH$padding1 = PathElement.groupElement("padding1");
    public static final PathElement PATH$padding2 = PathElement.groupElement("padding2");

    public static final OfInt LAYOUT$src_color_blendfactor = (OfInt) LAYOUT.select(PATH$src_color_blendfactor);
    public static final OfInt LAYOUT$dst_color_blendfactor = (OfInt) LAYOUT.select(PATH$dst_color_blendfactor);
    public static final OfInt LAYOUT$color_blend_op = (OfInt) LAYOUT.select(PATH$color_blend_op);
    public static final OfInt LAYOUT$src_alpha_blendfactor = (OfInt) LAYOUT.select(PATH$src_alpha_blendfactor);
    public static final OfInt LAYOUT$dst_alpha_blendfactor = (OfInt) LAYOUT.select(PATH$dst_alpha_blendfactor);
    public static final OfInt LAYOUT$alpha_blend_op = (OfInt) LAYOUT.select(PATH$alpha_blend_op);
    public static final OfByte LAYOUT$color_write_mask = (OfByte) LAYOUT.select(PATH$color_write_mask);
    public static final OfBoolean LAYOUT$enable_blend = (OfBoolean) LAYOUT.select(PATH$enable_blend);
    public static final OfBoolean LAYOUT$enable_color_write_mask = (OfBoolean) LAYOUT.select(PATH$enable_color_write_mask);
    public static final OfByte LAYOUT$padding1 = (OfByte) LAYOUT.select(PATH$padding1);
    public static final OfByte LAYOUT$padding2 = (OfByte) LAYOUT.select(PATH$padding2);

    public static final long SIZE$src_color_blendfactor = LAYOUT$src_color_blendfactor.byteSize();
    public static final long SIZE$dst_color_blendfactor = LAYOUT$dst_color_blendfactor.byteSize();
    public static final long SIZE$color_blend_op = LAYOUT$color_blend_op.byteSize();
    public static final long SIZE$src_alpha_blendfactor = LAYOUT$src_alpha_blendfactor.byteSize();
    public static final long SIZE$dst_alpha_blendfactor = LAYOUT$dst_alpha_blendfactor.byteSize();
    public static final long SIZE$alpha_blend_op = LAYOUT$alpha_blend_op.byteSize();
    public static final long SIZE$color_write_mask = LAYOUT$color_write_mask.byteSize();
    public static final long SIZE$enable_blend = LAYOUT$enable_blend.byteSize();
    public static final long SIZE$enable_color_write_mask = LAYOUT$enable_color_write_mask.byteSize();
    public static final long SIZE$padding1 = LAYOUT$padding1.byteSize();
    public static final long SIZE$padding2 = LAYOUT$padding2.byteSize();

    public static final long OFFSET$src_color_blendfactor = LAYOUT.byteOffset(PATH$src_color_blendfactor);
    public static final long OFFSET$dst_color_blendfactor = LAYOUT.byteOffset(PATH$dst_color_blendfactor);
    public static final long OFFSET$color_blend_op = LAYOUT.byteOffset(PATH$color_blend_op);
    public static final long OFFSET$src_alpha_blendfactor = LAYOUT.byteOffset(PATH$src_alpha_blendfactor);
    public static final long OFFSET$dst_alpha_blendfactor = LAYOUT.byteOffset(PATH$dst_alpha_blendfactor);
    public static final long OFFSET$alpha_blend_op = LAYOUT.byteOffset(PATH$alpha_blend_op);
    public static final long OFFSET$color_write_mask = LAYOUT.byteOffset(PATH$color_write_mask);
    public static final long OFFSET$enable_blend = LAYOUT.byteOffset(PATH$enable_blend);
    public static final long OFFSET$enable_color_write_mask = LAYOUT.byteOffset(PATH$enable_color_write_mask);
    public static final long OFFSET$padding1 = LAYOUT.byteOffset(PATH$padding1);
    public static final long OFFSET$padding2 = LAYOUT.byteOffset(PATH$padding2);
}
