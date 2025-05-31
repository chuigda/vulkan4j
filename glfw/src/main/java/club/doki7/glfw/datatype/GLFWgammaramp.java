package club.doki7.glfw.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;
import java.util.Iterator;
import java.util.NoSuchElementException;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.glfw.handle.*;
import static club.doki7.glfw.GLFWConstants.*;

///  @brief Gamma ramp.
///
///  This describes the gamma ramp for a monitor.
///
///  @sa @ref monitor_gamma
///  @sa @ref glfwGetGammaRamp
///  @sa @ref glfwSetGammaRamp
///
///  @since Added in version 3.0.
///
///  @ingroup monitor
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct GLFWgammaramp {
///     short* red; // @link substring="red" target="#red"
///     short* green; // @link substring="green" target="#green"
///     short* blue; // @link substring="blue" target="#blue"
///     int size; // @link substring="size" target="#size"
/// } GLFWgammaramp;
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
///
/// ## Member documentation
///
/// <ul>
/// <li>{@link #red}  An array of value describing the response of the red channel.</li>
/// <li>{@link #green}  An array of value describing the response of the green channel.</li>
/// <li>{@link #blue}  An array of value describing the response of the blue channel.</li>
/// <li>{@link #size}  The number of elements in each array.</li>
/// </ul>
@ValueBasedCandidate
@UnsafeConstructor
public record GLFWgammaramp(@NotNull MemorySegment segment) implements IGLFWgammaramp {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link GLFWgammaramp}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IGLFWgammaramp to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code GLFWgammaramp.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IGLFWgammaramp, Iterable<GLFWgammaramp> {
        public long size() {
            return segment.byteSize() / GLFWgammaramp.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull GLFWgammaramp at(long index) {
            return new GLFWgammaramp(segment.asSlice(index * GLFWgammaramp.BYTES, GLFWgammaramp.BYTES));
        }

        public void write(long index, @NotNull GLFWgammaramp value) {
            MemorySegment s = segment.asSlice(index * GLFWgammaramp.BYTES, GLFWgammaramp.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * GLFWgammaramp.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * GLFWgammaramp.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * GLFWgammaramp.BYTES,
                (end - start) * GLFWgammaramp.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * GLFWgammaramp.BYTES));
        }

        public GLFWgammaramp[] toArray() {
            GLFWgammaramp[] ret = new GLFWgammaramp[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iter iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        public static final class Iter implements Iterator<GLFWgammaramp> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= GLFWgammaramp.BYTES;
            }

            @Override
            public GLFWgammaramp next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                GLFWgammaramp ret = new GLFWgammaramp(segment.asSlice(0, GLFWgammaramp.BYTES));
                segment = segment.asSlice(GLFWgammaramp.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static GLFWgammaramp allocate(Arena arena) {
        return new GLFWgammaramp(arena.allocate(LAYOUT));
    }

    public static GLFWgammaramp.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new GLFWgammaramp.Ptr(segment);
    }

    public static GLFWgammaramp clone(Arena arena, GLFWgammaramp src) {
        GLFWgammaramp ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    /// Note: the returned {@link ShortPtr} does not have correct
    /// {@link ShortPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link ShortPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable ShortPtr red() {
        MemorySegment s = redRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new ShortPtr(s);
    }

    public void red(@Nullable ShortPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        redRaw(s);
    }

    public @Pointer(comment="int16_t*") MemorySegment redRaw() {
        return segment.get(LAYOUT$red, OFFSET$red);
    }

    public void redRaw(@Pointer(comment="int16_t*") MemorySegment value) {
        segment.set(LAYOUT$red, OFFSET$red, value);
    }

    /// Note: the returned {@link ShortPtr} does not have correct
    /// {@link ShortPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link ShortPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable ShortPtr green() {
        MemorySegment s = greenRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new ShortPtr(s);
    }

    public void green(@Nullable ShortPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        greenRaw(s);
    }

    public @Pointer(comment="int16_t*") MemorySegment greenRaw() {
        return segment.get(LAYOUT$green, OFFSET$green);
    }

    public void greenRaw(@Pointer(comment="int16_t*") MemorySegment value) {
        segment.set(LAYOUT$green, OFFSET$green, value);
    }

    /// Note: the returned {@link ShortPtr} does not have correct
    /// {@link ShortPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link ShortPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable ShortPtr blue() {
        MemorySegment s = blueRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new ShortPtr(s);
    }

    public void blue(@Nullable ShortPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        blueRaw(s);
    }

    public @Pointer(comment="int16_t*") MemorySegment blueRaw() {
        return segment.get(LAYOUT$blue, OFFSET$blue);
    }

    public void blueRaw(@Pointer(comment="int16_t*") MemorySegment value) {
        segment.set(LAYOUT$blue, OFFSET$blue, value);
    }

    public int size() {
        return segment.get(LAYOUT$size, OFFSET$size);
    }

    public void size(int value) {
        segment.set(LAYOUT$size, OFFSET$size, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_SHORT).withName("red"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_SHORT).withName("green"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_SHORT).withName("blue"),
        ValueLayout.JAVA_INT.withName("size")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$red = PathElement.groupElement("red");
    public static final PathElement PATH$green = PathElement.groupElement("green");
    public static final PathElement PATH$blue = PathElement.groupElement("blue");
    public static final PathElement PATH$size = PathElement.groupElement("size");

    public static final AddressLayout LAYOUT$red = (AddressLayout) LAYOUT.select(PATH$red);
    public static final AddressLayout LAYOUT$green = (AddressLayout) LAYOUT.select(PATH$green);
    public static final AddressLayout LAYOUT$blue = (AddressLayout) LAYOUT.select(PATH$blue);
    public static final OfInt LAYOUT$size = (OfInt) LAYOUT.select(PATH$size);

    public static final long SIZE$red = LAYOUT$red.byteSize();
    public static final long SIZE$green = LAYOUT$green.byteSize();
    public static final long SIZE$blue = LAYOUT$blue.byteSize();
    public static final long SIZE$size = LAYOUT$size.byteSize();

    public static final long OFFSET$red = LAYOUT.byteOffset(PATH$red);
    public static final long OFFSET$green = LAYOUT.byteOffset(PATH$green);
    public static final long OFFSET$blue = LAYOUT.byteOffset(PATH$blue);
    public static final long OFFSET$size = LAYOUT.byteOffset(PATH$size);
}
