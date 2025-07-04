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

/// A structure specifying the parameters of the graphics pipeline multisample
/// state.
///
/// Since: This struct is available since SDL 3.2.0.
///
/// See also:
/// - `SDL_GPUGraphicsPipelineCreateInfo`
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_GPUMultisampleState {
///     SDL_GPUSampleCount sample_count; // @link substring="SDL_GPUSampleCount" target="SDL_GPUSampleCount" @link substring="sample_count" target="#sample_count"
///     Uint32 sample_mask; // @link substring="sample_mask" target="#sample_mask"
///     bool enable_mask; // @link substring="enable_mask" target="#enable_mask"
///     Uint8 padding1; // @link substring="padding1" target="#padding1"
///     Uint8 padding2; // @link substring="padding2" target="#padding2"
///     Uint8 padding3; // @link substring="padding3" target="#padding3"
/// } SDL_GPUMultisampleState;
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
public record SDL_GPUMultisampleState(@NotNull MemorySegment segment) implements ISDL_GPUMultisampleState {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_GPUMultisampleState}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_GPUMultisampleState to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_GPUMultisampleState.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_GPUMultisampleState, Iterable<SDL_GPUMultisampleState> {
        public long size() {
            return segment.byteSize() / SDL_GPUMultisampleState.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_GPUMultisampleState at(long index) {
            return new SDL_GPUMultisampleState(segment.asSlice(index * SDL_GPUMultisampleState.BYTES, SDL_GPUMultisampleState.BYTES));
        }

        public void write(long index, @NotNull SDL_GPUMultisampleState value) {
            MemorySegment s = segment.asSlice(index * SDL_GPUMultisampleState.BYTES, SDL_GPUMultisampleState.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_GPUMultisampleState.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_GPUMultisampleState.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_GPUMultisampleState.BYTES,
                (end - start) * SDL_GPUMultisampleState.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_GPUMultisampleState.BYTES));
        }

        public SDL_GPUMultisampleState[] toArray() {
            SDL_GPUMultisampleState[] ret = new SDL_GPUMultisampleState[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_GPUMultisampleState> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_GPUMultisampleState> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_GPUMultisampleState.BYTES;
            }

            @Override
            public SDL_GPUMultisampleState next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_GPUMultisampleState ret = new SDL_GPUMultisampleState(segment.asSlice(0, SDL_GPUMultisampleState.BYTES));
                segment = segment.asSlice(SDL_GPUMultisampleState.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_GPUMultisampleState allocate(Arena arena) {
        return new SDL_GPUMultisampleState(arena.allocate(LAYOUT));
    }

    public static SDL_GPUMultisampleState.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_GPUMultisampleState.Ptr(segment);
    }

    public static SDL_GPUMultisampleState clone(Arena arena, SDL_GPUMultisampleState src) {
        SDL_GPUMultisampleState ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(SDL_GPUSampleCount.class) int sample_count() {
        return segment.get(LAYOUT$sample_count, OFFSET$sample_count);
    }

    public SDL_GPUMultisampleState sample_count(@EnumType(SDL_GPUSampleCount.class) int value) {
        segment.set(LAYOUT$sample_count, OFFSET$sample_count, value);
        return this;
    }

    public @NativeType("Uint32") @Unsigned int sample_mask() {
        return segment.get(LAYOUT$sample_mask, OFFSET$sample_mask);
    }

    public SDL_GPUMultisampleState sample_mask(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$sample_mask, OFFSET$sample_mask, value);
        return this;
    }

    public @NativeType("boolean") boolean enable_mask() {
        return segment.get(LAYOUT$enable_mask, OFFSET$enable_mask);
    }

    public SDL_GPUMultisampleState enable_mask(@NativeType("boolean") boolean value) {
        segment.set(LAYOUT$enable_mask, OFFSET$enable_mask, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte padding1() {
        return segment.get(LAYOUT$padding1, OFFSET$padding1);
    }

    public SDL_GPUMultisampleState padding1(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$padding1, OFFSET$padding1, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte padding2() {
        return segment.get(LAYOUT$padding2, OFFSET$padding2);
    }

    public SDL_GPUMultisampleState padding2(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$padding2, OFFSET$padding2, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte padding3() {
        return segment.get(LAYOUT$padding3, OFFSET$padding3);
    }

    public SDL_GPUMultisampleState padding3(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$padding3, OFFSET$padding3, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sample_count"),
        ValueLayout.JAVA_INT.withName("sample_mask"),
        ValueLayout.JAVA_BOOLEAN.withName("enable_mask"),
        ValueLayout.JAVA_BYTE.withName("padding1"),
        ValueLayout.JAVA_BYTE.withName("padding2"),
        ValueLayout.JAVA_BYTE.withName("padding3")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sample_count = PathElement.groupElement("sample_count");
    public static final PathElement PATH$sample_mask = PathElement.groupElement("sample_mask");
    public static final PathElement PATH$enable_mask = PathElement.groupElement("enable_mask");
    public static final PathElement PATH$padding1 = PathElement.groupElement("padding1");
    public static final PathElement PATH$padding2 = PathElement.groupElement("padding2");
    public static final PathElement PATH$padding3 = PathElement.groupElement("padding3");

    public static final OfInt LAYOUT$sample_count = (OfInt) LAYOUT.select(PATH$sample_count);
    public static final OfInt LAYOUT$sample_mask = (OfInt) LAYOUT.select(PATH$sample_mask);
    public static final OfBoolean LAYOUT$enable_mask = (OfBoolean) LAYOUT.select(PATH$enable_mask);
    public static final OfByte LAYOUT$padding1 = (OfByte) LAYOUT.select(PATH$padding1);
    public static final OfByte LAYOUT$padding2 = (OfByte) LAYOUT.select(PATH$padding2);
    public static final OfByte LAYOUT$padding3 = (OfByte) LAYOUT.select(PATH$padding3);

    public static final long SIZE$sample_count = LAYOUT$sample_count.byteSize();
    public static final long SIZE$sample_mask = LAYOUT$sample_mask.byteSize();
    public static final long SIZE$enable_mask = LAYOUT$enable_mask.byteSize();
    public static final long SIZE$padding1 = LAYOUT$padding1.byteSize();
    public static final long SIZE$padding2 = LAYOUT$padding2.byteSize();
    public static final long SIZE$padding3 = LAYOUT$padding3.byteSize();

    public static final long OFFSET$sample_count = LAYOUT.byteOffset(PATH$sample_count);
    public static final long OFFSET$sample_mask = LAYOUT.byteOffset(PATH$sample_mask);
    public static final long OFFSET$enable_mask = LAYOUT.byteOffset(PATH$enable_mask);
    public static final long OFFSET$padding1 = LAYOUT.byteOffset(PATH$padding1);
    public static final long OFFSET$padding2 = LAYOUT.byteOffset(PATH$padding2);
    public static final long OFFSET$padding3 = LAYOUT.byteOffset(PATH$padding3);
}
