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

/// A structure holding a calendar date and time broken down into its
/// components.
///
/// \since This struct is available since SDL 3.2.0.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_DateTime {
///     int year; // @link substring="year" target="#year"
///     int month; // @link substring="month" target="#month"
///     int day; // @link substring="day" target="#day"
///     int hour; // @link substring="hour" target="#hour"
///     int minute; // @link substring="minute" target="#minute"
///     int second; // @link substring="second" target="#second"
///     int nanosecond; // @link substring="nanosecond" target="#nanosecond"
///     int day_of_week; // @link substring="day_of_week" target="#day_of_week"
///     int utc_offset; // @link substring="utc_offset" target="#utc_offset"
/// } SDL_DateTime;
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
public record SDL_DateTime(@NotNull MemorySegment segment) implements ISDL_DateTime {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_DateTime}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_DateTime to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_DateTime.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_DateTime, Iterable<SDL_DateTime> {
        public long size() {
            return segment.byteSize() / SDL_DateTime.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_DateTime at(long index) {
            return new SDL_DateTime(segment.asSlice(index * SDL_DateTime.BYTES, SDL_DateTime.BYTES));
        }

        public void write(long index, @NotNull SDL_DateTime value) {
            MemorySegment s = segment.asSlice(index * SDL_DateTime.BYTES, SDL_DateTime.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_DateTime.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_DateTime.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_DateTime.BYTES,
                (end - start) * SDL_DateTime.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_DateTime.BYTES));
        }

        public SDL_DateTime[] toArray() {
            SDL_DateTime[] ret = new SDL_DateTime[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_DateTime> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_DateTime> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_DateTime.BYTES;
            }

            @Override
            public SDL_DateTime next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_DateTime ret = new SDL_DateTime(segment.asSlice(0, SDL_DateTime.BYTES));
                segment = segment.asSlice(SDL_DateTime.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_DateTime allocate(Arena arena) {
        return new SDL_DateTime(arena.allocate(LAYOUT));
    }

    public static SDL_DateTime.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_DateTime.Ptr(segment);
    }

    public static SDL_DateTime clone(Arena arena, SDL_DateTime src) {
        SDL_DateTime ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public int year() {
        return segment.get(LAYOUT$year, OFFSET$year);
    }

    public SDL_DateTime year(int value) {
        segment.set(LAYOUT$year, OFFSET$year, value);
        return this;
    }

    public int month() {
        return segment.get(LAYOUT$month, OFFSET$month);
    }

    public SDL_DateTime month(int value) {
        segment.set(LAYOUT$month, OFFSET$month, value);
        return this;
    }

    public int day() {
        return segment.get(LAYOUT$day, OFFSET$day);
    }

    public SDL_DateTime day(int value) {
        segment.set(LAYOUT$day, OFFSET$day, value);
        return this;
    }

    public int hour() {
        return segment.get(LAYOUT$hour, OFFSET$hour);
    }

    public SDL_DateTime hour(int value) {
        segment.set(LAYOUT$hour, OFFSET$hour, value);
        return this;
    }

    public int minute() {
        return segment.get(LAYOUT$minute, OFFSET$minute);
    }

    public SDL_DateTime minute(int value) {
        segment.set(LAYOUT$minute, OFFSET$minute, value);
        return this;
    }

    public int second() {
        return segment.get(LAYOUT$second, OFFSET$second);
    }

    public SDL_DateTime second(int value) {
        segment.set(LAYOUT$second, OFFSET$second, value);
        return this;
    }

    public int nanosecond() {
        return segment.get(LAYOUT$nanosecond, OFFSET$nanosecond);
    }

    public SDL_DateTime nanosecond(int value) {
        segment.set(LAYOUT$nanosecond, OFFSET$nanosecond, value);
        return this;
    }

    public int day_of_week() {
        return segment.get(LAYOUT$day_of_week, OFFSET$day_of_week);
    }

    public SDL_DateTime day_of_week(int value) {
        segment.set(LAYOUT$day_of_week, OFFSET$day_of_week, value);
        return this;
    }

    public int utc_offset() {
        return segment.get(LAYOUT$utc_offset, OFFSET$utc_offset);
    }

    public SDL_DateTime utc_offset(int value) {
        segment.set(LAYOUT$utc_offset, OFFSET$utc_offset, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("year"),
        ValueLayout.JAVA_INT.withName("month"),
        ValueLayout.JAVA_INT.withName("day"),
        ValueLayout.JAVA_INT.withName("hour"),
        ValueLayout.JAVA_INT.withName("minute"),
        ValueLayout.JAVA_INT.withName("second"),
        ValueLayout.JAVA_INT.withName("nanosecond"),
        ValueLayout.JAVA_INT.withName("day_of_week"),
        ValueLayout.JAVA_INT.withName("utc_offset")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$year = PathElement.groupElement("year");
    public static final PathElement PATH$month = PathElement.groupElement("month");
    public static final PathElement PATH$day = PathElement.groupElement("day");
    public static final PathElement PATH$hour = PathElement.groupElement("hour");
    public static final PathElement PATH$minute = PathElement.groupElement("minute");
    public static final PathElement PATH$second = PathElement.groupElement("second");
    public static final PathElement PATH$nanosecond = PathElement.groupElement("nanosecond");
    public static final PathElement PATH$day_of_week = PathElement.groupElement("day_of_week");
    public static final PathElement PATH$utc_offset = PathElement.groupElement("utc_offset");

    public static final OfInt LAYOUT$year = (OfInt) LAYOUT.select(PATH$year);
    public static final OfInt LAYOUT$month = (OfInt) LAYOUT.select(PATH$month);
    public static final OfInt LAYOUT$day = (OfInt) LAYOUT.select(PATH$day);
    public static final OfInt LAYOUT$hour = (OfInt) LAYOUT.select(PATH$hour);
    public static final OfInt LAYOUT$minute = (OfInt) LAYOUT.select(PATH$minute);
    public static final OfInt LAYOUT$second = (OfInt) LAYOUT.select(PATH$second);
    public static final OfInt LAYOUT$nanosecond = (OfInt) LAYOUT.select(PATH$nanosecond);
    public static final OfInt LAYOUT$day_of_week = (OfInt) LAYOUT.select(PATH$day_of_week);
    public static final OfInt LAYOUT$utc_offset = (OfInt) LAYOUT.select(PATH$utc_offset);

    public static final long SIZE$year = LAYOUT$year.byteSize();
    public static final long SIZE$month = LAYOUT$month.byteSize();
    public static final long SIZE$day = LAYOUT$day.byteSize();
    public static final long SIZE$hour = LAYOUT$hour.byteSize();
    public static final long SIZE$minute = LAYOUT$minute.byteSize();
    public static final long SIZE$second = LAYOUT$second.byteSize();
    public static final long SIZE$nanosecond = LAYOUT$nanosecond.byteSize();
    public static final long SIZE$day_of_week = LAYOUT$day_of_week.byteSize();
    public static final long SIZE$utc_offset = LAYOUT$utc_offset.byteSize();

    public static final long OFFSET$year = LAYOUT.byteOffset(PATH$year);
    public static final long OFFSET$month = LAYOUT.byteOffset(PATH$month);
    public static final long OFFSET$day = LAYOUT.byteOffset(PATH$day);
    public static final long OFFSET$hour = LAYOUT.byteOffset(PATH$hour);
    public static final long OFFSET$minute = LAYOUT.byteOffset(PATH$minute);
    public static final long OFFSET$second = LAYOUT.byteOffset(PATH$second);
    public static final long OFFSET$nanosecond = LAYOUT.byteOffset(PATH$nanosecond);
    public static final long OFFSET$day_of_week = LAYOUT.byteOffset(PATH$day_of_week);
    public static final long OFFSET$utc_offset = LAYOUT.byteOffset(PATH$utc_offset);
}
