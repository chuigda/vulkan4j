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

/// MessageBox structure containing title, text, window, etc.
///
/// Since: This struct is available since SDL 3.2.0.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_MessageBoxData {
///     SDL_MessageBoxFlags flags; // @link substring="SDL_MessageBoxFlags" target="SDL_MessageBoxFlags" @link substring="flags" target="#flags"
///     SDL_Window* window; // @link substring="SDL_Window" target="SDL_Window" @link substring="window" target="#window"
///     char const* title; // @link substring="title" target="#title"
///     char const* message; // @link substring="message" target="#message"
///     int numbuttons; // @link substring="numbuttons" target="#numbuttons"
///     SDL_MessageBoxButtonData const* buttons; // @link substring="SDL_MessageBoxButtonData" target="SDL_MessageBoxButtonData" @link substring="buttons" target="#buttons"
///     SDL_MessageBoxColorScheme const* colorScheme; // @link substring="SDL_MessageBoxColorScheme" target="SDL_MessageBoxColorScheme" @link substring="colorScheme" target="#colorScheme"
/// } SDL_MessageBoxData;
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
public record SDL_MessageBoxData(@NotNull MemorySegment segment) implements ISDL_MessageBoxData {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_MessageBoxData}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_MessageBoxData to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_MessageBoxData.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_MessageBoxData, Iterable<SDL_MessageBoxData> {
        public long size() {
            return segment.byteSize() / SDL_MessageBoxData.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_MessageBoxData at(long index) {
            return new SDL_MessageBoxData(segment.asSlice(index * SDL_MessageBoxData.BYTES, SDL_MessageBoxData.BYTES));
        }

        public void write(long index, @NotNull SDL_MessageBoxData value) {
            MemorySegment s = segment.asSlice(index * SDL_MessageBoxData.BYTES, SDL_MessageBoxData.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_MessageBoxData.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_MessageBoxData.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_MessageBoxData.BYTES,
                (end - start) * SDL_MessageBoxData.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_MessageBoxData.BYTES));
        }

        public SDL_MessageBoxData[] toArray() {
            SDL_MessageBoxData[] ret = new SDL_MessageBoxData[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_MessageBoxData> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_MessageBoxData> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_MessageBoxData.BYTES;
            }

            @Override
            public SDL_MessageBoxData next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_MessageBoxData ret = new SDL_MessageBoxData(segment.asSlice(0, SDL_MessageBoxData.BYTES));
                segment = segment.asSlice(SDL_MessageBoxData.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_MessageBoxData allocate(Arena arena) {
        return new SDL_MessageBoxData(arena.allocate(LAYOUT));
    }

    public static SDL_MessageBoxData.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_MessageBoxData.Ptr(segment);
    }

    public static SDL_MessageBoxData clone(Arena arena, SDL_MessageBoxData src) {
        SDL_MessageBoxData ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(SDL_MessageBoxFlags.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public SDL_MessageBoxData flags(@EnumType(SDL_MessageBoxFlags.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
        return this;
    }

    public @Nullable SDL_Window window() {
        MemorySegment s = segment.asSlice(OFFSET$window, SIZE$window);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new SDL_Window(s);
    }

    public SDL_MessageBoxData window(@Nullable SDL_Window value) {
        segment.set(LAYOUT$window, OFFSET$window, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    /// Note: the returned {@link BytePtr} does not have correct
    /// {@link BytePtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link BytePtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable BytePtr title() {
        MemorySegment s = titleRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new BytePtr(s);
    }

    public SDL_MessageBoxData title(@Nullable BytePtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        titleRaw(s);
        return this;
    }

    public @Pointer(comment="int8_t*") MemorySegment titleRaw() {
        return segment.get(LAYOUT$title, OFFSET$title);
    }

    public void titleRaw(@Pointer(comment="int8_t*") MemorySegment value) {
        segment.set(LAYOUT$title, OFFSET$title, value);
    }

    /// Note: the returned {@link BytePtr} does not have correct
    /// {@link BytePtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link BytePtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable BytePtr message() {
        MemorySegment s = messageRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new BytePtr(s);
    }

    public SDL_MessageBoxData message(@Nullable BytePtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        messageRaw(s);
        return this;
    }

    public @Pointer(comment="int8_t*") MemorySegment messageRaw() {
        return segment.get(LAYOUT$message, OFFSET$message);
    }

    public void messageRaw(@Pointer(comment="int8_t*") MemorySegment value) {
        segment.set(LAYOUT$message, OFFSET$message, value);
    }

    public int numbuttons() {
        return segment.get(LAYOUT$numbuttons, OFFSET$numbuttons);
    }

    public SDL_MessageBoxData numbuttons(int value) {
        segment.set(LAYOUT$numbuttons, OFFSET$numbuttons, value);
        return this;
    }

    public SDL_MessageBoxData buttons(@Nullable ISDL_MessageBoxButtonData value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        buttonsRaw(s);
        return this;
    }

    @Unsafe public @Nullable SDL_MessageBoxButtonData.Ptr buttons(int assumedCount) {
        MemorySegment s = buttonsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * SDL_MessageBoxButtonData.BYTES);
        return new SDL_MessageBoxButtonData.Ptr(s);
    }

    public @Nullable SDL_MessageBoxButtonData buttons() {
        MemorySegment s = buttonsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new SDL_MessageBoxButtonData(s);
    }

    public @Pointer(target=SDL_MessageBoxButtonData.class) MemorySegment buttonsRaw() {
        return segment.get(LAYOUT$buttons, OFFSET$buttons);
    }

    public void buttonsRaw(@Pointer(target=SDL_MessageBoxButtonData.class) MemorySegment value) {
        segment.set(LAYOUT$buttons, OFFSET$buttons, value);
    }

    public SDL_MessageBoxData colorScheme(@Nullable ISDL_MessageBoxColorScheme value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        colorSchemeRaw(s);
        return this;
    }

    @Unsafe public @Nullable SDL_MessageBoxColorScheme.Ptr colorScheme(int assumedCount) {
        MemorySegment s = colorSchemeRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * SDL_MessageBoxColorScheme.BYTES);
        return new SDL_MessageBoxColorScheme.Ptr(s);
    }

    public @Nullable SDL_MessageBoxColorScheme colorScheme() {
        MemorySegment s = colorSchemeRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new SDL_MessageBoxColorScheme(s);
    }

    public @Pointer(target=SDL_MessageBoxColorScheme.class) MemorySegment colorSchemeRaw() {
        return segment.get(LAYOUT$colorScheme, OFFSET$colorScheme);
    }

    public void colorSchemeRaw(@Pointer(target=SDL_MessageBoxColorScheme.class) MemorySegment value) {
        segment.set(LAYOUT$colorScheme, OFFSET$colorScheme, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("window"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("title"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("message"),
        ValueLayout.JAVA_INT.withName("numbuttons"),
        ValueLayout.ADDRESS.withTargetLayout(SDL_MessageBoxButtonData.LAYOUT).withName("buttons"),
        ValueLayout.ADDRESS.withTargetLayout(SDL_MessageBoxColorScheme.LAYOUT).withName("colorScheme")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$window = PathElement.groupElement("window");
    public static final PathElement PATH$title = PathElement.groupElement("title");
    public static final PathElement PATH$message = PathElement.groupElement("message");
    public static final PathElement PATH$numbuttons = PathElement.groupElement("numbuttons");
    public static final PathElement PATH$buttons = PathElement.groupElement("buttons");
    public static final PathElement PATH$colorScheme = PathElement.groupElement("colorScheme");

    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$window = (AddressLayout) LAYOUT.select(PATH$window);
    public static final AddressLayout LAYOUT$title = (AddressLayout) LAYOUT.select(PATH$title);
    public static final AddressLayout LAYOUT$message = (AddressLayout) LAYOUT.select(PATH$message);
    public static final OfInt LAYOUT$numbuttons = (OfInt) LAYOUT.select(PATH$numbuttons);
    public static final AddressLayout LAYOUT$buttons = (AddressLayout) LAYOUT.select(PATH$buttons);
    public static final AddressLayout LAYOUT$colorScheme = (AddressLayout) LAYOUT.select(PATH$colorScheme);

    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$window = LAYOUT$window.byteSize();
    public static final long SIZE$title = LAYOUT$title.byteSize();
    public static final long SIZE$message = LAYOUT$message.byteSize();
    public static final long SIZE$numbuttons = LAYOUT$numbuttons.byteSize();
    public static final long SIZE$buttons = LAYOUT$buttons.byteSize();
    public static final long SIZE$colorScheme = LAYOUT$colorScheme.byteSize();

    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$window = LAYOUT.byteOffset(PATH$window);
    public static final long OFFSET$title = LAYOUT.byteOffset(PATH$title);
    public static final long OFFSET$message = LAYOUT.byteOffset(PATH$message);
    public static final long OFFSET$numbuttons = LAYOUT.byteOffset(PATH$numbuttons);
    public static final long OFFSET$buttons = LAYOUT.byteOffset(PATH$buttons);
    public static final long OFFSET$colorScheme = LAYOUT.byteOffset(PATH$colorScheme);
}
