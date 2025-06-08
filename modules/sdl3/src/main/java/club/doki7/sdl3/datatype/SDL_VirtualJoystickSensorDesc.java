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

/// The structure that describes a virtual joystick sensor.
///
/// Since: This struct is available since SDL 3.2.0.
///
/// See also:
/// - `SDL_VirtualJoystickDesc`
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SDL_VirtualJoystickSensorDesc {
///     SDL_SensorType type; // @link substring="SDL_SensorType" target="SDL_SensorType" @link substring="type" target="#type"
///     float rate; // @link substring="rate" target="#rate"
/// } SDL_VirtualJoystickSensorDesc;
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
public record SDL_VirtualJoystickSensorDesc(@NotNull MemorySegment segment) implements ISDL_VirtualJoystickSensorDesc {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SDL_VirtualJoystickSensorDesc}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISDL_VirtualJoystickSensorDesc to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SDL_VirtualJoystickSensorDesc.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISDL_VirtualJoystickSensorDesc, Iterable<SDL_VirtualJoystickSensorDesc> {
        public long size() {
            return segment.byteSize() / SDL_VirtualJoystickSensorDesc.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SDL_VirtualJoystickSensorDesc at(long index) {
            return new SDL_VirtualJoystickSensorDesc(segment.asSlice(index * SDL_VirtualJoystickSensorDesc.BYTES, SDL_VirtualJoystickSensorDesc.BYTES));
        }

        public void write(long index, @NotNull SDL_VirtualJoystickSensorDesc value) {
            MemorySegment s = segment.asSlice(index * SDL_VirtualJoystickSensorDesc.BYTES, SDL_VirtualJoystickSensorDesc.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SDL_VirtualJoystickSensorDesc.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SDL_VirtualJoystickSensorDesc.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SDL_VirtualJoystickSensorDesc.BYTES,
                (end - start) * SDL_VirtualJoystickSensorDesc.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SDL_VirtualJoystickSensorDesc.BYTES));
        }

        public SDL_VirtualJoystickSensorDesc[] toArray() {
            SDL_VirtualJoystickSensorDesc[] ret = new SDL_VirtualJoystickSensorDesc[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SDL_VirtualJoystickSensorDesc> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SDL_VirtualJoystickSensorDesc> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SDL_VirtualJoystickSensorDesc.BYTES;
            }

            @Override
            public SDL_VirtualJoystickSensorDesc next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SDL_VirtualJoystickSensorDesc ret = new SDL_VirtualJoystickSensorDesc(segment.asSlice(0, SDL_VirtualJoystickSensorDesc.BYTES));
                segment = segment.asSlice(SDL_VirtualJoystickSensorDesc.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SDL_VirtualJoystickSensorDesc allocate(Arena arena) {
        return new SDL_VirtualJoystickSensorDesc(arena.allocate(LAYOUT));
    }

    public static SDL_VirtualJoystickSensorDesc.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SDL_VirtualJoystickSensorDesc.Ptr(segment);
    }

    public static SDL_VirtualJoystickSensorDesc clone(Arena arena, SDL_VirtualJoystickSensorDesc src) {
        SDL_VirtualJoystickSensorDesc ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(SDL_SensorType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public SDL_VirtualJoystickSensorDesc type(@EnumType(SDL_SensorType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public float rate() {
        return segment.get(LAYOUT$rate, OFFSET$rate);
    }

    public SDL_VirtualJoystickSensorDesc rate(float value) {
        segment.set(LAYOUT$rate, OFFSET$rate, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.JAVA_FLOAT.withName("rate")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$rate = PathElement.groupElement("rate");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final OfFloat LAYOUT$rate = (OfFloat) LAYOUT.select(PATH$rate);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$rate = LAYOUT$rate.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$rate = LAYOUT.byteOffset(PATH$rate);
}
