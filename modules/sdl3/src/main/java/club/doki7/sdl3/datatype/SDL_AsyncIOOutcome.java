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

/// Information about a completed asynchronous I/O request.
///
/// Since: This struct is available since SDL 3.2.0.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_AsyncIOOutcome {
///     SDL_AsyncIO* asyncio; // @link substring="SDL_AsyncIO" target="SDL_AsyncIO" @link substring="asyncio" target="#asyncio"
///     SDL_AsyncIOTaskType type; // @link substring="SDL_AsyncIOTaskType" target="SDL_AsyncIOTaskType" @link substring="type" target="#type"
///     SDL_AsyncIOResult result; // @link substring="SDL_AsyncIOResult" target="SDL_AsyncIOResult" @link substring="result" target="#result"
///     void* buffer; // @link substring="buffer" target="#buffer"
///     Uint64 offset; // @link substring="offset" target="#offset"
///     Uint64 bytes_requested; // @link substring="bytes_requested" target="#bytes_requested"
///     Uint64 bytes_transferred; // @link substring="bytes_transferred" target="#bytes_transferred"
///     void* userdata; // @link substring="userdata" target="#userdata"
/// } SDL_AsyncIOOutcome;
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
public record SDL_AsyncIOOutcome(@NotNull MemorySegment segment) implements ISDL_AsyncIOOutcome {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_AsyncIOOutcome}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_AsyncIOOutcome to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_AsyncIOOutcome.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_AsyncIOOutcome, Iterable<SDL_AsyncIOOutcome> {
        public long size() {
            return segment.byteSize() / SDL_AsyncIOOutcome.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_AsyncIOOutcome at(long index) {
            return new SDL_AsyncIOOutcome(segment.asSlice(index * SDL_AsyncIOOutcome.BYTES, SDL_AsyncIOOutcome.BYTES));
        }

        public void write(long index, @NotNull SDL_AsyncIOOutcome value) {
            MemorySegment s = segment.asSlice(index * SDL_AsyncIOOutcome.BYTES, SDL_AsyncIOOutcome.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_AsyncIOOutcome.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_AsyncIOOutcome.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_AsyncIOOutcome.BYTES,
                (end - start) * SDL_AsyncIOOutcome.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_AsyncIOOutcome.BYTES));
        }

        public SDL_AsyncIOOutcome[] toArray() {
            SDL_AsyncIOOutcome[] ret = new SDL_AsyncIOOutcome[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_AsyncIOOutcome> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_AsyncIOOutcome> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_AsyncIOOutcome.BYTES;
            }

            @Override
            public SDL_AsyncIOOutcome next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_AsyncIOOutcome ret = new SDL_AsyncIOOutcome(segment.asSlice(0, SDL_AsyncIOOutcome.BYTES));
                segment = segment.asSlice(SDL_AsyncIOOutcome.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_AsyncIOOutcome allocate(Arena arena) {
        return new SDL_AsyncIOOutcome(arena.allocate(LAYOUT));
    }

    public static SDL_AsyncIOOutcome.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_AsyncIOOutcome.Ptr(segment);
    }

    public static SDL_AsyncIOOutcome clone(Arena arena, SDL_AsyncIOOutcome src) {
        SDL_AsyncIOOutcome ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Nullable SDL_AsyncIO asyncio() {
        MemorySegment s = segment.asSlice(OFFSET$asyncio, SIZE$asyncio);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new SDL_AsyncIO(s);
    }

    public SDL_AsyncIOOutcome asyncio(@Nullable SDL_AsyncIO value) {
        segment.set(LAYOUT$asyncio, OFFSET$asyncio, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @EnumType(SDL_AsyncIOTaskType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public SDL_AsyncIOOutcome type(@EnumType(SDL_AsyncIOTaskType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @EnumType(SDL_AsyncIOResult.class) int result() {
        return segment.get(LAYOUT$result, OFFSET$result);
    }

    public SDL_AsyncIOOutcome result(@EnumType(SDL_AsyncIOResult.class) int value) {
        segment.set(LAYOUT$result, OFFSET$result, value);
        return this;
    }

    public @Pointer(comment="void*") MemorySegment buffer() {
        return segment.get(LAYOUT$buffer, OFFSET$buffer);
    }

    public void buffer(@Pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$buffer, OFFSET$buffer, value);
    }

    public SDL_AsyncIOOutcome buffer(@Nullable IPointer pointer) {
        buffer(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @NativeType("Uint64") @Unsigned long offset() {
        return segment.get(LAYOUT$offset, OFFSET$offset);
    }

    public SDL_AsyncIOOutcome offset(@NativeType("Uint64") @Unsigned long value) {
        segment.set(LAYOUT$offset, OFFSET$offset, value);
        return this;
    }

    public @NativeType("Uint64") @Unsigned long bytes_requested() {
        return segment.get(LAYOUT$bytes_requested, OFFSET$bytes_requested);
    }

    public SDL_AsyncIOOutcome bytes_requested(@NativeType("Uint64") @Unsigned long value) {
        segment.set(LAYOUT$bytes_requested, OFFSET$bytes_requested, value);
        return this;
    }

    public @NativeType("Uint64") @Unsigned long bytes_transferred() {
        return segment.get(LAYOUT$bytes_transferred, OFFSET$bytes_transferred);
    }

    public SDL_AsyncIOOutcome bytes_transferred(@NativeType("Uint64") @Unsigned long value) {
        segment.set(LAYOUT$bytes_transferred, OFFSET$bytes_transferred, value);
        return this;
    }

    public @Pointer(comment="void*") MemorySegment userdata() {
        return segment.get(LAYOUT$userdata, OFFSET$userdata);
    }

    public void userdata(@Pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$userdata, OFFSET$userdata, value);
    }

    public SDL_AsyncIOOutcome userdata(@Nullable IPointer pointer) {
        userdata(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("asyncio"),
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_INT.withName("result"),
        ValueLayout.ADDRESS.withName("buffer"),
        ValueLayout.JAVA_LONG.withName("offset"),
        ValueLayout.JAVA_LONG.withName("bytes_requested"),
        ValueLayout.JAVA_LONG.withName("bytes_transferred"),
        ValueLayout.ADDRESS.withName("userdata")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$asyncio = PathElement.groupElement("asyncio");
    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$result = PathElement.groupElement("result");
    public static final PathElement PATH$buffer = PathElement.groupElement("buffer");
    public static final PathElement PATH$offset = PathElement.groupElement("offset");
    public static final PathElement PATH$bytes_requested = PathElement.groupElement("bytes_requested");
    public static final PathElement PATH$bytes_transferred = PathElement.groupElement("bytes_transferred");
    public static final PathElement PATH$userdata = PathElement.groupElement("userdata");

    public static final AddressLayout LAYOUT$asyncio = (AddressLayout) LAYOUT.select(PATH$asyncio);
    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final OfInt LAYOUT$result = (OfInt) LAYOUT.select(PATH$result);
    public static final AddressLayout LAYOUT$buffer = (AddressLayout) LAYOUT.select(PATH$buffer);
    public static final OfLong LAYOUT$offset = (OfLong) LAYOUT.select(PATH$offset);
    public static final OfLong LAYOUT$bytes_requested = (OfLong) LAYOUT.select(PATH$bytes_requested);
    public static final OfLong LAYOUT$bytes_transferred = (OfLong) LAYOUT.select(PATH$bytes_transferred);
    public static final AddressLayout LAYOUT$userdata = (AddressLayout) LAYOUT.select(PATH$userdata);

    public static final long SIZE$asyncio = LAYOUT$asyncio.byteSize();
    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$result = LAYOUT$result.byteSize();
    public static final long SIZE$buffer = LAYOUT$buffer.byteSize();
    public static final long SIZE$offset = LAYOUT$offset.byteSize();
    public static final long SIZE$bytes_requested = LAYOUT$bytes_requested.byteSize();
    public static final long SIZE$bytes_transferred = LAYOUT$bytes_transferred.byteSize();
    public static final long SIZE$userdata = LAYOUT$userdata.byteSize();

    public static final long OFFSET$asyncio = LAYOUT.byteOffset(PATH$asyncio);
    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$result = LAYOUT.byteOffset(PATH$result);
    public static final long OFFSET$buffer = LAYOUT.byteOffset(PATH$buffer);
    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);
    public static final long OFFSET$bytes_requested = LAYOUT.byteOffset(PATH$bytes_requested);
    public static final long OFFSET$bytes_transferred = LAYOUT.byteOffset(PATH$bytes_transferred);
    public static final long OFFSET$userdata = LAYOUT.byteOffset(PATH$userdata);
}
