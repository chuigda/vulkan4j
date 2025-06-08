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

/// Structure that represents a haptic direction.
///
/// This is the direction where the force comes from, instead of the direction
/// in which the force is exerted.
///
/// Directions can be specified by:
///
/// - SDL_HAPTIC_POLAR : Specified by polar coordinates.
/// - SDL_HAPTIC_CARTESIAN : Specified by cartesian coordinates.
/// - SDL_HAPTIC_SPHERICAL : Specified by spherical coordinates.
///
/// Cardinal directions of the haptic device are relative to the positioning of
/// the device. North is considered to be away from the user.
///
/// The following diagram represents the cardinal directions:
///
/// ```
///                .--.
///                |__| .-------.
///                |=.| |.-----.|
///                |--| ||     ||
///                |  | |'-----'|
///                |__|~')_____('
///                  [ COMPUTER ]
///
///
///                    North (0,-1)
///                        ^
///                        |
///                        |
///  (-1,0)  West <----[ HAPTIC ]----> East (1,0)
///                        |
///                        |
///                        v
///                     South (0,1)
///
///
///                     [ USER ]
///                       \|||/
///                       (o o)
///                 ---ooO-(_)-Ooo---
/// ```
///
/// If type is SDL_HAPTIC_POLAR, direction is encoded by hundredths of a degree
/// starting north and turning clockwise. SDL_HAPTIC_POLAR only uses the first
/// `dir` parameter. The cardinal directions would be:
///
/// - North: 0 (0 degrees)
/// - East: 9000 (90 degrees)
/// - South: 18000 (180 degrees)
/// - West: 27000 (270 degrees)
///
/// If type is SDL_HAPTIC_CARTESIAN, direction is encoded by three positions (X
/// axis, Y axis and Z axis (with 3 axes)). SDL_HAPTIC_CARTESIAN uses the first
/// three `dir` parameters. The cardinal directions would be:
///
/// - North: 0,-1, 0
/// - East: 1, 0, 0
/// - South: 0, 1, 0
/// - West: -1, 0, 0
///
/// The Z axis represents the height of the effect if supported, otherwise it's
/// unused. In cartesian encoding (1, 2) would be the same as (2, 4), you can
/// use any multiple you want, only the direction matters.
///
/// If type is SDL_HAPTIC_SPHERICAL, direction is encoded by two rotations. The
/// first two `dir` parameters are used. The `dir` parameters are as follows
/// (all values are in hundredths of degrees):
///
/// - Degrees from (1, 0) rotated towards (0, 1).
/// - Degrees towards (0, 0, 1) (device needs at least 3 axes).
///
/// Example of force coming from the south with all encodings (force coming
/// from the south means the user will have to pull the stick to counteract):
///
/// ```c
///  SDL_HapticDirection direction;
///
///  // Cartesian directions
///  direction.type = SDL_HAPTIC_CARTESIAN; // Using cartesian direction encoding.
///  direction.dir[0] = 0; // X position
///  direction.dir[1] = 1; // Y position
///  // Assuming the device has 2 axes, we don't need to specify third parameter.
///
///  // Polar directions
///  direction.type = SDL_HAPTIC_POLAR; // We'll be using polar direction encoding.
///  direction.dir[0] = 18000; // Polar only uses first parameter
///
///  // Spherical coordinates
///  direction.type = SDL_HAPTIC_SPHERICAL; // Spherical encoding
///  direction.dir[0] = 9000; // Since we only have two axes we don't need more parameters.
/// ```
///
/// \since This struct is available since SDL 3.2.0.
///
/// \sa SDL_HAPTIC_POLAR
/// \sa SDL_HAPTIC_CARTESIAN
/// \sa SDL_HAPTIC_SPHERICAL
/// \sa SDL_HAPTIC_STEERING_AXIS
/// \sa SDL_HapticEffect
/// \sa SDL_GetNumHapticAxes
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_HapticDirection {
///     Uint8 type; // @link substring="type" target="#type"
///     Sint32[3] dir; // @link substring="dir" target="#dir"
/// } SDL_HapticDirection;
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
public record SDL_HapticDirection(@NotNull MemorySegment segment) implements ISDL_HapticDirection {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_HapticDirection}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_HapticDirection to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_HapticDirection.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_HapticDirection, Iterable<SDL_HapticDirection> {
        public long size() {
            return segment.byteSize() / SDL_HapticDirection.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_HapticDirection at(long index) {
            return new SDL_HapticDirection(segment.asSlice(index * SDL_HapticDirection.BYTES, SDL_HapticDirection.BYTES));
        }

        public void write(long index, @NotNull SDL_HapticDirection value) {
            MemorySegment s = segment.asSlice(index * SDL_HapticDirection.BYTES, SDL_HapticDirection.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_HapticDirection.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_HapticDirection.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_HapticDirection.BYTES,
                (end - start) * SDL_HapticDirection.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_HapticDirection.BYTES));
        }

        public SDL_HapticDirection[] toArray() {
            SDL_HapticDirection[] ret = new SDL_HapticDirection[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_HapticDirection> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_HapticDirection> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_HapticDirection.BYTES;
            }

            @Override
            public SDL_HapticDirection next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_HapticDirection ret = new SDL_HapticDirection(segment.asSlice(0, SDL_HapticDirection.BYTES));
                segment = segment.asSlice(SDL_HapticDirection.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_HapticDirection allocate(Arena arena) {
        return new SDL_HapticDirection(arena.allocate(LAYOUT));
    }

    public static SDL_HapticDirection.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_HapticDirection.Ptr(segment);
    }

    public static SDL_HapticDirection clone(Arena arena, SDL_HapticDirection src) {
        SDL_HapticDirection ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NativeType("Uint8") @Unsigned byte type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public SDL_HapticDirection type(@NativeType("Uint8") @Unsigned byte value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="Sint32") IntPtr dir() {
        return new IntPtr(dirRaw());
    }

    public SDL_HapticDirection dir(@Pointer(comment="Sint32") IntPtr value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$dir, SIZE$dir);
        return this;
    }

    public MemorySegment dirRaw() {
        return segment.asSlice(OFFSET$dir, SIZE$dir);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_BYTE.withName("type"),
        MemoryLayout.sequenceLayout(3, ValueLayout.JAVA_INT).withName("dir")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$dir = PathElement.groupElement("dir");

    public static final OfByte LAYOUT$type = (OfByte) LAYOUT.select(PATH$type);
    public static final SequenceLayout LAYOUT$dir = (SequenceLayout) LAYOUT.select(PATH$dir);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$dir = LAYOUT$dir.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$dir = LAYOUT.byteOffset(PATH$dir);
}
