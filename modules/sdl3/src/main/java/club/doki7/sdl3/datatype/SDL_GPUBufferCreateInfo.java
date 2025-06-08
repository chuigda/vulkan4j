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

/// A structure specifying the parameters of a buffer.
///
/// Usage flags can be bitwise OR'd together for combinations of usages. Note
/// that certain combinations are invalid, for example VERTEX and INDEX.
///
/// \since This struct is available since SDL 3.2.0.
///
/// \sa SDL_CreateGPUBuffer
/// \sa SDL_GPUBufferUsageFlags
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_GPUBufferCreateInfo {
///     SDL_GPUBufferUsageFlags usage; // optional // @link substring="SDL_GPUBufferUsageFlags" target="SDL_GPUBufferUsageFlags" @link substring="usage" target="#usage"
///     Uint32 size; // optional // @link substring="size" target="#size"
///     SDL_PropertiesID props; // optional // @link substring="props" target="#props"
/// } SDL_GPUBufferCreateInfo;
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
public record SDL_GPUBufferCreateInfo(@NotNull MemorySegment segment) implements ISDL_GPUBufferCreateInfo {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_GPUBufferCreateInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_GPUBufferCreateInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_GPUBufferCreateInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_GPUBufferCreateInfo, Iterable<SDL_GPUBufferCreateInfo> {
        public long size() {
            return segment.byteSize() / SDL_GPUBufferCreateInfo.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_GPUBufferCreateInfo at(long index) {
            return new SDL_GPUBufferCreateInfo(segment.asSlice(index * SDL_GPUBufferCreateInfo.BYTES, SDL_GPUBufferCreateInfo.BYTES));
        }

        public void write(long index, @NotNull SDL_GPUBufferCreateInfo value) {
            MemorySegment s = segment.asSlice(index * SDL_GPUBufferCreateInfo.BYTES, SDL_GPUBufferCreateInfo.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_GPUBufferCreateInfo.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_GPUBufferCreateInfo.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_GPUBufferCreateInfo.BYTES,
                (end - start) * SDL_GPUBufferCreateInfo.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_GPUBufferCreateInfo.BYTES));
        }

        public SDL_GPUBufferCreateInfo[] toArray() {
            SDL_GPUBufferCreateInfo[] ret = new SDL_GPUBufferCreateInfo[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_GPUBufferCreateInfo> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_GPUBufferCreateInfo> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_GPUBufferCreateInfo.BYTES;
            }

            @Override
            public SDL_GPUBufferCreateInfo next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_GPUBufferCreateInfo ret = new SDL_GPUBufferCreateInfo(segment.asSlice(0, SDL_GPUBufferCreateInfo.BYTES));
                segment = segment.asSlice(SDL_GPUBufferCreateInfo.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_GPUBufferCreateInfo allocate(Arena arena) {
        return new SDL_GPUBufferCreateInfo(arena.allocate(LAYOUT));
    }

    public static SDL_GPUBufferCreateInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_GPUBufferCreateInfo.Ptr(segment);
    }

    public static SDL_GPUBufferCreateInfo clone(Arena arena, SDL_GPUBufferCreateInfo src) {
        SDL_GPUBufferCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(SDL_GPUBufferUsageFlags.class) int usage() {
        return segment.get(LAYOUT$usage, OFFSET$usage);
    }

    public SDL_GPUBufferCreateInfo usage(@EnumType(SDL_GPUBufferUsageFlags.class) int value) {
        segment.set(LAYOUT$usage, OFFSET$usage, value);
        return this;
    }

    public @NativeType("Uint32") @Unsigned int size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public SDL_GPUBufferCreateInfo size(@NativeType("Uint32") @Unsigned int value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
        return this;
    }

    public @NativeType("SDL_PropertiesID") @Unsigned int props() {
        return segment.get(LAYOUT$props, OFFSET$props);
    }

    public SDL_GPUBufferCreateInfo props(@NativeType("SDL_PropertiesID") @Unsigned int value) {
        segment.set(LAYOUT$props, OFFSET$props, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("usage"),
        ValueLayout.JAVA_INT.withName("size"),
        ValueLayout.JAVA_INT.withName("props")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$usage = PathElement.groupElement("usage");
    public static final PathElement PATH$size = PathElement.groupElement("size");
    public static final PathElement PATH$props = PathElement.groupElement("props");

    public static final OfInt LAYOUT$usage = (OfInt) LAYOUT.select(PATH$usage);
    public static final OfInt LAYOUT$size = (OfInt) LAYOUT.select(PATH$size);
    public static final OfInt LAYOUT$props = (OfInt) LAYOUT.select(PATH$props);

    public static final long SIZE$usage = LAYOUT$usage.byteSize();
    public static final long SIZE$size = LAYOUT$size.byteSize();
    public static final long SIZE$props = LAYOUT$props.byteSize();

    public static final long OFFSET$usage = LAYOUT.byteOffset(PATH$usage);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
    public static final long OFFSET$props = LAYOUT.byteOffset(PATH$props);
}
