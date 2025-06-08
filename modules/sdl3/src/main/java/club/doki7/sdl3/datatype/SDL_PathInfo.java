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

/// Information about a path on the filesystem.
///
/// \since This datatype is available since SDL 3.2.0.
///
/// \sa SDL_GetPathInfo
/// \sa SDL_GetStoragePathInfo
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_PathInfo {
///     SDL_PathType type; // optional // @link substring="SDL_PathType" target="SDL_PathType" @link substring="type" target="#type"
///     Uint64 size; // optional // @link substring="size" target="#size"
///     SDL_Time create_time; // optional // @link substring="create_time" target="#create_time"
///     SDL_Time modify_time; // optional // @link substring="modify_time" target="#modify_time"
///     SDL_Time access_time; // optional // @link substring="access_time" target="#access_time"
/// } SDL_PathInfo;
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
public record SDL_PathInfo(@NotNull MemorySegment segment) implements ISDL_PathInfo {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_PathInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_PathInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_PathInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_PathInfo, Iterable<SDL_PathInfo> {
        public long size() {
            return segment.byteSize() / SDL_PathInfo.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_PathInfo at(long index) {
            return new SDL_PathInfo(segment.asSlice(index * SDL_PathInfo.BYTES, SDL_PathInfo.BYTES));
        }

        public void write(long index, @NotNull SDL_PathInfo value) {
            MemorySegment s = segment.asSlice(index * SDL_PathInfo.BYTES, SDL_PathInfo.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_PathInfo.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_PathInfo.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_PathInfo.BYTES,
                (end - start) * SDL_PathInfo.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_PathInfo.BYTES));
        }

        public SDL_PathInfo[] toArray() {
            SDL_PathInfo[] ret = new SDL_PathInfo[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_PathInfo> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_PathInfo> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_PathInfo.BYTES;
            }

            @Override
            public SDL_PathInfo next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_PathInfo ret = new SDL_PathInfo(segment.asSlice(0, SDL_PathInfo.BYTES));
                segment = segment.asSlice(SDL_PathInfo.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_PathInfo allocate(Arena arena) {
        return new SDL_PathInfo(arena.allocate(LAYOUT));
    }

    public static SDL_PathInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_PathInfo.Ptr(segment);
    }

    public static SDL_PathInfo clone(Arena arena, SDL_PathInfo src) {
        SDL_PathInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(SDL_PathType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public SDL_PathInfo type(@EnumType(SDL_PathType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @NativeType("Uint64") @Unsigned long size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public SDL_PathInfo size(@NativeType("Uint64") @Unsigned long value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
        return this;
    }

    public @NativeType("SDL_Time") long create_time() {
        return segment.get(LAYOUT$create_time, OFFSET$create_time);
    }

    public SDL_PathInfo create_time(@NativeType("SDL_Time") long value) {
        segment.set(LAYOUT$create_time, OFFSET$create_time, value);
        return this;
    }

    public @NativeType("SDL_Time") long modify_time() {
        return segment.get(LAYOUT$modify_time, OFFSET$modify_time);
    }

    public SDL_PathInfo modify_time(@NativeType("SDL_Time") long value) {
        segment.set(LAYOUT$modify_time, OFFSET$modify_time, value);
        return this;
    }

    public @NativeType("SDL_Time") long access_time() {
        return segment.get(LAYOUT$access_time, OFFSET$access_time);
    }

    public SDL_PathInfo access_time(@NativeType("SDL_Time") long value) {
        segment.set(LAYOUT$access_time, OFFSET$access_time, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_LONG.withName("size"),
        ValueLayout.JAVA_LONG.withName("create_time"),
        ValueLayout.JAVA_LONG.withName("modify_time"),
        ValueLayout.JAVA_LONG.withName("access_time")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$size = PathElement.groupElement("size");
    public static final PathElement PATH$create_time = PathElement.groupElement("create_time");
    public static final PathElement PATH$modify_time = PathElement.groupElement("modify_time");
    public static final PathElement PATH$access_time = PathElement.groupElement("access_time");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final OfLong LAYOUT$size = (OfLong) LAYOUT.select(PATH$size);
    public static final OfLong LAYOUT$create_time = (OfLong) LAYOUT.select(PATH$create_time);
    public static final OfLong LAYOUT$modify_time = (OfLong) LAYOUT.select(PATH$modify_time);
    public static final OfLong LAYOUT$access_time = (OfLong) LAYOUT.select(PATH$access_time);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$size = LAYOUT$size.byteSize();
    public static final long SIZE$create_time = LAYOUT$create_time.byteSize();
    public static final long SIZE$modify_time = LAYOUT$modify_time.byteSize();
    public static final long SIZE$access_time = LAYOUT$access_time.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
    public static final long OFFSET$create_time = LAYOUT.byteOffset(PATH$create_time);
    public static final long OFFSET$modify_time = LAYOUT.byteOffset(PATH$modify_time);
    public static final long OFFSET$access_time = LAYOUT.byteOffset(PATH$access_time);
}
