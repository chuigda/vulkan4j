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

/// A structure containing parameters for a blit command.
///
/// \since This struct is available since SDL 3.2.0.
///
/// \sa SDL_BlitGPUTexture
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_GPUBlitInfo {
///     SDL_GPUBlitRegion destination; // optional // @link substring="SDL_GPUBlitRegion" target="SDL_GPUBlitRegion" @link substring="destination" target="#destination"
///     SDL_GPULoadOp load_op; // optional // @link substring="SDL_GPULoadOp" target="SDL_GPULoadOp" @link substring="load_op" target="#load_op"
///     SDL_FColor clear_color; // optional // @link substring="SDL_FColor" target="SDL_FColor" @link substring="clear_color" target="#clear_color"
///     SDL_FlipMode flip_mode; // optional // @link substring="SDL_FlipMode" target="SDL_FlipMode" @link substring="flip_mode" target="#flip_mode"
///     SDL_GPUFilter filter; // optional // @link substring="SDL_GPUFilter" target="SDL_GPUFilter" @link substring="filter" target="#filter"
///     bool cycle; // optional // @link substring="cycle" target="#cycle"
///     Uint8 padding1; // optional // @link substring="padding1" target="#padding1"
///     Uint8 padding2; // optional // @link substring="padding2" target="#padding2"
///     Uint8 padding3; // optional // @link substring="padding3" target="#padding3"
/// } SDL_GPUBlitInfo;
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
public record SDL_GPUBlitInfo(@NotNull MemorySegment segment) implements ISDL_GPUBlitInfo {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_GPUBlitInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_GPUBlitInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_GPUBlitInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_GPUBlitInfo, Iterable<SDL_GPUBlitInfo> {
        public long size() {
            return segment.byteSize() / SDL_GPUBlitInfo.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_GPUBlitInfo at(long index) {
            return new SDL_GPUBlitInfo(segment.asSlice(index * SDL_GPUBlitInfo.BYTES, SDL_GPUBlitInfo.BYTES));
        }

        public void write(long index, @NotNull SDL_GPUBlitInfo value) {
            MemorySegment s = segment.asSlice(index * SDL_GPUBlitInfo.BYTES, SDL_GPUBlitInfo.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_GPUBlitInfo.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_GPUBlitInfo.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_GPUBlitInfo.BYTES,
                (end - start) * SDL_GPUBlitInfo.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_GPUBlitInfo.BYTES));
        }

        public SDL_GPUBlitInfo[] toArray() {
            SDL_GPUBlitInfo[] ret = new SDL_GPUBlitInfo[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_GPUBlitInfo> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_GPUBlitInfo> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_GPUBlitInfo.BYTES;
            }

            @Override
            public SDL_GPUBlitInfo next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_GPUBlitInfo ret = new SDL_GPUBlitInfo(segment.asSlice(0, SDL_GPUBlitInfo.BYTES));
                segment = segment.asSlice(SDL_GPUBlitInfo.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_GPUBlitInfo allocate(Arena arena) {
        return new SDL_GPUBlitInfo(arena.allocate(LAYOUT));
    }

    public static SDL_GPUBlitInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_GPUBlitInfo.Ptr(segment);
    }

    public static SDL_GPUBlitInfo clone(Arena arena, SDL_GPUBlitInfo src) {
        SDL_GPUBlitInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NotNull SDL_GPUBlitRegion destination() {
        return new SDL_GPUBlitRegion(segment.asSlice(OFFSET$destination, LAYOUT$destination));
    }

    public SDL_GPUBlitInfo destination(@NotNull SDL_GPUBlitRegion value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$destination, SIZE$destination);
        return this;
    }

    public SDL_GPUBlitInfo destination(Consumer<@NotNull SDL_GPUBlitRegion> consumer) {
        consumer.accept(destination());
        return this;
    }

    public @EnumType(SDL_GPULoadOp.class) int load_op() {
        return segment.get(LAYOUT$load_op, OFFSET$load_op);
    }

    public SDL_GPUBlitInfo load_op(@EnumType(SDL_GPULoadOp.class) int value) {
        segment.set(LAYOUT$load_op, OFFSET$load_op, value);
        return this;
    }

    public @NotNull SDL_FColor clear_color() {
        return new SDL_FColor(segment.asSlice(OFFSET$clear_color, LAYOUT$clear_color));
    }

    public SDL_GPUBlitInfo clear_color(@NotNull SDL_FColor value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$clear_color, SIZE$clear_color);
        return this;
    }

    public SDL_GPUBlitInfo clear_color(Consumer<@NotNull SDL_FColor> consumer) {
        consumer.accept(clear_color());
        return this;
    }

    public @EnumType(SDL_FlipMode.class) int flip_mode() {
        return segment.get(LAYOUT$flip_mode, OFFSET$flip_mode);
    }

    public SDL_GPUBlitInfo flip_mode(@EnumType(SDL_FlipMode.class) int value) {
        segment.set(LAYOUT$flip_mode, OFFSET$flip_mode, value);
        return this;
    }

    public @EnumType(SDL_GPUFilter.class) int filter() {
        return segment.get(LAYOUT$filter, OFFSET$filter);
    }

    public SDL_GPUBlitInfo filter(@EnumType(SDL_GPUFilter.class) int value) {
        segment.set(LAYOUT$filter, OFFSET$filter, value);
        return this;
    }

    public @NativeType("boolean") boolean cycle() {
        return segment.get(LAYOUT$cycle, OFFSET$cycle);
    }

    public SDL_GPUBlitInfo cycle(@NativeType("boolean") boolean value) {
        segment.set(LAYOUT$cycle, OFFSET$cycle, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte padding1() {
        return segment.get(LAYOUT$padding1, OFFSET$padding1);
    }

    public SDL_GPUBlitInfo padding1(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$padding1, OFFSET$padding1, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte padding2() {
        return segment.get(LAYOUT$padding2, OFFSET$padding2);
    }

    public SDL_GPUBlitInfo padding2(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$padding2, OFFSET$padding2, value);
        return this;
    }

    public @NativeType("Uint8") @Unsigned byte padding3() {
        return segment.get(LAYOUT$padding3, OFFSET$padding3);
    }

    public SDL_GPUBlitInfo padding3(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$padding3, OFFSET$padding3, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        SDL_GPUBlitRegion.LAYOUT.withName("destination"),
        ValueLayout.JAVA_INT.withName("load_op"),
        SDL_FColor.LAYOUT.withName("clear_color"),
        ValueLayout.JAVA_INT.withName("flip_mode"),
        ValueLayout.JAVA_INT.withName("filter"),
        ValueLayout.JAVA_BOOLEAN.withName("cycle"),
        ValueLayout.JAVA_BYTE.withName("padding1"),
        ValueLayout.JAVA_BYTE.withName("padding2"),
        ValueLayout.JAVA_BYTE.withName("padding3")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$destination = PathElement.groupElement("destination");
    public static final PathElement PATH$load_op = PathElement.groupElement("load_op");
    public static final PathElement PATH$clear_color = PathElement.groupElement("clear_color");
    public static final PathElement PATH$flip_mode = PathElement.groupElement("flip_mode");
    public static final PathElement PATH$filter = PathElement.groupElement("filter");
    public static final PathElement PATH$cycle = PathElement.groupElement("cycle");
    public static final PathElement PATH$padding1 = PathElement.groupElement("padding1");
    public static final PathElement PATH$padding2 = PathElement.groupElement("padding2");
    public static final PathElement PATH$padding3 = PathElement.groupElement("padding3");

    public static final StructLayout LAYOUT$destination = (StructLayout) LAYOUT.select(PATH$destination);
    public static final OfInt LAYOUT$load_op = (OfInt) LAYOUT.select(PATH$load_op);
    public static final StructLayout LAYOUT$clear_color = (StructLayout) LAYOUT.select(PATH$clear_color);
    public static final OfInt LAYOUT$flip_mode = (OfInt) LAYOUT.select(PATH$flip_mode);
    public static final OfInt LAYOUT$filter = (OfInt) LAYOUT.select(PATH$filter);
    public static final OfBoolean LAYOUT$cycle = (OfBoolean) LAYOUT.select(PATH$cycle);
    public static final OfByte LAYOUT$padding1 = (OfByte) LAYOUT.select(PATH$padding1);
    public static final OfByte LAYOUT$padding2 = (OfByte) LAYOUT.select(PATH$padding2);
    public static final OfByte LAYOUT$padding3 = (OfByte) LAYOUT.select(PATH$padding3);

    public static final long SIZE$destination = LAYOUT$destination.byteSize();
    public static final long SIZE$load_op = LAYOUT$load_op.byteSize();
    public static final long SIZE$clear_color = LAYOUT$clear_color.byteSize();
    public static final long SIZE$flip_mode = LAYOUT$flip_mode.byteSize();
    public static final long SIZE$filter = LAYOUT$filter.byteSize();
    public static final long SIZE$cycle = LAYOUT$cycle.byteSize();
    public static final long SIZE$padding1 = LAYOUT$padding1.byteSize();
    public static final long SIZE$padding2 = LAYOUT$padding2.byteSize();
    public static final long SIZE$padding3 = LAYOUT$padding3.byteSize();

    public static final long OFFSET$destination = LAYOUT.byteOffset(PATH$destination);
    public static final long OFFSET$load_op = LAYOUT.byteOffset(PATH$load_op);
    public static final long OFFSET$clear_color = LAYOUT.byteOffset(PATH$clear_color);
    public static final long OFFSET$flip_mode = LAYOUT.byteOffset(PATH$flip_mode);
    public static final long OFFSET$filter = LAYOUT.byteOffset(PATH$filter);
    public static final long OFFSET$cycle = LAYOUT.byteOffset(PATH$cycle);
    public static final long OFFSET$padding1 = LAYOUT.byteOffset(PATH$padding1);
    public static final long OFFSET$padding2 = LAYOUT.byteOffset(PATH$padding2);
    public static final long OFFSET$padding3 = LAYOUT.byteOffset(PATH$padding3);
}
