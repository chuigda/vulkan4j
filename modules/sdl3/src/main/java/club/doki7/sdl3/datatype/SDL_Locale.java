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

/// A struct to provide locale data.
///
/// Locale data is split into a spoken language, like English, and an optional
/// country, like Canada. The language will be in ISO-639 format (so English
/// would be "en"), and the country, if not NULL, will be an ISO-3166 country
/// code (so Canada would be "CA").
///
/// Since: This function is available since SDL 3.2.0.
///
/// See also:
/// - `SDL_GetPreferredLocales`
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_Locale {
///     char const* language; // @link substring="language" target="#language"
///     char const* country; // @link substring="country" target="#country"
/// } SDL_Locale;
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
public record SDL_Locale(@NotNull MemorySegment segment) implements ISDL_Locale {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_Locale}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_Locale to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_Locale.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_Locale, Iterable<SDL_Locale> {
        public long size() {
            return segment.byteSize() / SDL_Locale.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_Locale at(long index) {
            return new SDL_Locale(segment.asSlice(index * SDL_Locale.BYTES, SDL_Locale.BYTES));
        }

        public void write(long index, @NotNull SDL_Locale value) {
            MemorySegment s = segment.asSlice(index * SDL_Locale.BYTES, SDL_Locale.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_Locale.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_Locale.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_Locale.BYTES,
                (end - start) * SDL_Locale.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_Locale.BYTES));
        }

        public SDL_Locale[] toArray() {
            SDL_Locale[] ret = new SDL_Locale[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_Locale> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_Locale> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_Locale.BYTES;
            }

            @Override
            public SDL_Locale next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_Locale ret = new SDL_Locale(segment.asSlice(0, SDL_Locale.BYTES));
                segment = segment.asSlice(SDL_Locale.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_Locale allocate(Arena arena) {
        return new SDL_Locale(arena.allocate(LAYOUT));
    }

    public static SDL_Locale.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_Locale.Ptr(segment);
    }

    public static SDL_Locale clone(Arena arena, SDL_Locale src) {
        SDL_Locale ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    /// Note: the returned {@link BytePtr} does not have correct
    /// {@link BytePtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link BytePtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable BytePtr language() {
        MemorySegment s = languageRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new BytePtr(s);
    }

    public SDL_Locale language(@Nullable BytePtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        languageRaw(s);
        return this;
    }

    public @Pointer(comment="int8_t*") MemorySegment languageRaw() {
        return segment.get(LAYOUT$language, OFFSET$language);
    }

    public void languageRaw(@Pointer(comment="int8_t*") MemorySegment value) {
        segment.set(LAYOUT$language, OFFSET$language, value);
    }

    /// Note: the returned {@link BytePtr} does not have correct
    /// {@link BytePtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link BytePtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable BytePtr country() {
        MemorySegment s = countryRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new BytePtr(s);
    }

    public SDL_Locale country(@Nullable BytePtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        countryRaw(s);
        return this;
    }

    public @Pointer(comment="int8_t*") MemorySegment countryRaw() {
        return segment.get(LAYOUT$country, OFFSET$country);
    }

    public void countryRaw(@Pointer(comment="int8_t*") MemorySegment value) {
        segment.set(LAYOUT$country, OFFSET$country, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("language"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("country")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$language = PathElement.groupElement("language");
    public static final PathElement PATH$country = PathElement.groupElement("country");

    public static final AddressLayout LAYOUT$language = (AddressLayout) LAYOUT.select(PATH$language);
    public static final AddressLayout LAYOUT$country = (AddressLayout) LAYOUT.select(PATH$country);

    public static final long SIZE$language = LAYOUT$language.byteSize();
    public static final long SIZE$country = LAYOUT$country.byteSize();

    public static final long OFFSET$language = LAYOUT.byteOffset(PATH$language);
    public static final long OFFSET$country = LAYOUT.byteOffset(PATH$country);
}
