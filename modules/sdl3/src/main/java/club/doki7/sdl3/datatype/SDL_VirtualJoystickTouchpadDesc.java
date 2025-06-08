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

/// The structure that describes a virtual joystick touchpad.
///
/// \since This struct is available since SDL 3.2.0.
///
/// \sa SDL_VirtualJoystickDesc
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_VirtualJoystickTouchpadDesc {
///     Uint16 nfingers; // @link substring="nfingers" target="#nfingers"
///     Uint16[3] padding; // @link substring="padding" target="#padding"
/// } SDL_VirtualJoystickTouchpadDesc;
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
public record SDL_VirtualJoystickTouchpadDesc(@NotNull MemorySegment segment) implements ISDL_VirtualJoystickTouchpadDesc {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_VirtualJoystickTouchpadDesc}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_VirtualJoystickTouchpadDesc to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_VirtualJoystickTouchpadDesc.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_VirtualJoystickTouchpadDesc, Iterable<SDL_VirtualJoystickTouchpadDesc> {
        public long size() {
            return segment.byteSize() / SDL_VirtualJoystickTouchpadDesc.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_VirtualJoystickTouchpadDesc at(long index) {
            return new SDL_VirtualJoystickTouchpadDesc(segment.asSlice(index * SDL_VirtualJoystickTouchpadDesc.BYTES, SDL_VirtualJoystickTouchpadDesc.BYTES));
        }

        public void write(long index, @NotNull SDL_VirtualJoystickTouchpadDesc value) {
            MemorySegment s = segment.asSlice(index * SDL_VirtualJoystickTouchpadDesc.BYTES, SDL_VirtualJoystickTouchpadDesc.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_VirtualJoystickTouchpadDesc.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_VirtualJoystickTouchpadDesc.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_VirtualJoystickTouchpadDesc.BYTES,
                (end - start) * SDL_VirtualJoystickTouchpadDesc.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_VirtualJoystickTouchpadDesc.BYTES));
        }

        public SDL_VirtualJoystickTouchpadDesc[] toArray() {
            SDL_VirtualJoystickTouchpadDesc[] ret = new SDL_VirtualJoystickTouchpadDesc[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_VirtualJoystickTouchpadDesc> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_VirtualJoystickTouchpadDesc> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_VirtualJoystickTouchpadDesc.BYTES;
            }

            @Override
            public SDL_VirtualJoystickTouchpadDesc next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_VirtualJoystickTouchpadDesc ret = new SDL_VirtualJoystickTouchpadDesc(segment.asSlice(0, SDL_VirtualJoystickTouchpadDesc.BYTES));
                segment = segment.asSlice(SDL_VirtualJoystickTouchpadDesc.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_VirtualJoystickTouchpadDesc allocate(Arena arena) {
        return new SDL_VirtualJoystickTouchpadDesc(arena.allocate(LAYOUT));
    }

    public static SDL_VirtualJoystickTouchpadDesc.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_VirtualJoystickTouchpadDesc.Ptr(segment);
    }

    public static SDL_VirtualJoystickTouchpadDesc clone(Arena arena, SDL_VirtualJoystickTouchpadDesc src) {
        SDL_VirtualJoystickTouchpadDesc ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NativeType("Uint16") @Unsigned short nfingers() {
        return segment.get(LAYOUT$nfingers, OFFSET$nfingers);
    }

    public SDL_VirtualJoystickTouchpadDesc nfingers(@NativeType("Uint16") @Unsigned short value) {
        segment.set(LAYOUT$nfingers, OFFSET$nfingers, value);
        return this;
    }

    public @Pointer(comment="Uint16") @Unsigned ShortPtr padding() {
        return new ShortPtr(paddingRaw());
    }

    public SDL_VirtualJoystickTouchpadDesc padding(@Pointer(comment="Uint16") @Unsigned ShortPtr value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$padding, SIZE$padding);
        return this;
    }

    public MemorySegment paddingRaw() {
        return segment.asSlice(OFFSET$padding, SIZE$padding);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_SHORT.withName("nfingers"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_SHORT).withName("padding")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$nfingers = PathElement.groupElement("nfingers");
    public static final PathElement PATH$padding = PathElement.groupElement("padding");

    public static final OfShort LAYOUT$nfingers = (OfShort) LAYOUT.select(PATH$nfingers);
    public static final SequenceLayout LAYOUT$padding = (SequenceLayout) LAYOUT.select(PATH$padding);

    public static final long SIZE$nfingers = LAYOUT$nfingers.byteSize();
    public static final long SIZE$padding = LAYOUT$padding.byteSize();

    public static final long OFFSET$nfingers = LAYOUT.byteOffset(PATH$nfingers);
    public static final long OFFSET$padding = LAYOUT.byteOffset(PATH$padding);
}
