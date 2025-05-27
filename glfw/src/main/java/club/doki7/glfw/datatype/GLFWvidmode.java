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

///  @brief Video mode type.
///
///  This describes a single video mode.
///
///  @sa @ref monitor_modes
///  @sa @ref glfwGetVideoMode
///  @sa @ref glfwGetVideoModes
///
///  @since Added in version 1.0.
///  @glfw3 Added refresh rate member.
///
///  @ingroup monitor
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct GLFWvidmode {
///     int width; // @link substring="width" target="#width"
///     int height; // @link substring="height" target="#height"
///     int redBits; // @link substring="redBits" target="#redBits"
///     int greenBits; // @link substring="greenBits" target="#greenBits"
///     int blueBits; // @link substring="blueBits" target="#blueBits"
///     int refreshRate; // @link substring="refreshRate" target="#refreshRate"
/// } GLFWvidmode;
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
/// <li>{@link #width}  The width, in screen coordinates, of the video mode.</li>
/// <li>{@link #height}  The height, in screen coordinates, of the video mode.</li>
/// <li>{@link #redBits}  The bit depth of the red channel of the video mode.</li>
/// <li>{@link #greenBits}  The bit depth of the green channel of the video mode.</li>
/// <li>{@link #blueBits}  The bit depth of the blue channel of the video mode.</li>
/// <li>{@link #refreshRate}  The refresh rate, in Hz, of the video mode.</li>
/// </ul>
@ValueBasedCandidate
@UnsafeConstructor
public record GLFWvidmode(@NotNull MemorySegment segment) implements IGLFWvidmode {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link GLFWvidmode}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IGLFWvidmode to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code GLFWvidmode.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IGLFWvidmode, Iterable<GLFWvidmode> {
        public long size() {
            return segment.byteSize() / GLFWvidmode.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull GLFWvidmode at(long index) {
            return new GLFWvidmode(segment.asSlice(index * GLFWvidmode.BYTES, GLFWvidmode.BYTES));
        }

        public void write(long index, @NotNull GLFWvidmode value) {
            MemorySegment s = segment.asSlice(index * GLFWvidmode.BYTES, GLFWvidmode.BYTES);
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
        public @NotNull Ptr reinterpret(long index) {
            return new Ptr(segment.asSlice(index * GLFWvidmode.BYTES, GLFWvidmode.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * GLFWvidmode.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * GLFWvidmode.BYTES,
                (end - start) * GLFWvidmode.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * GLFWvidmode.BYTES));
        }

        public GLFWvidmode[] toArray() {
            GLFWvidmode[] ret = new GLFWvidmode[(int) size()];
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
        public static final class Iter implements Iterator<GLFWvidmode> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= GLFWvidmode.BYTES;
            }

            @Override
            public GLFWvidmode next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                GLFWvidmode ret = new GLFWvidmode(segment.asSlice(0, GLFWvidmode.BYTES));
                segment = segment.asSlice(GLFWvidmode.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static GLFWvidmode allocate(Arena arena) {
        return new GLFWvidmode(arena.allocate(LAYOUT));
    }

    public static GLFWvidmode.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new GLFWvidmode.Ptr(segment);
    }

    public static GLFWvidmode clone(Arena arena, GLFWvidmode src) {
        GLFWvidmode ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public int width() {
        return segment.get(LAYOUT$width, OFFSET$width);
    }

    public void width(int value) {
        segment.set(LAYOUT$width, OFFSET$width, value);
    }

    public int height() {
        return segment.get(LAYOUT$height, OFFSET$height);
    }

    public void height(int value) {
        segment.set(LAYOUT$height, OFFSET$height, value);
    }

    public int redBits() {
        return segment.get(LAYOUT$redBits, OFFSET$redBits);
    }

    public void redBits(int value) {
        segment.set(LAYOUT$redBits, OFFSET$redBits, value);
    }

    public int greenBits() {
        return segment.get(LAYOUT$greenBits, OFFSET$greenBits);
    }

    public void greenBits(int value) {
        segment.set(LAYOUT$greenBits, OFFSET$greenBits, value);
    }

    public int blueBits() {
        return segment.get(LAYOUT$blueBits, OFFSET$blueBits);
    }

    public void blueBits(int value) {
        segment.set(LAYOUT$blueBits, OFFSET$blueBits, value);
    }

    public int refreshRate() {
        return segment.get(LAYOUT$refreshRate, OFFSET$refreshRate);
    }

    public void refreshRate(int value) {
        segment.set(LAYOUT$refreshRate, OFFSET$refreshRate, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height"),
        ValueLayout.JAVA_INT.withName("redBits"),
        ValueLayout.JAVA_INT.withName("greenBits"),
        ValueLayout.JAVA_INT.withName("blueBits"),
        ValueLayout.JAVA_INT.withName("refreshRate")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$width = PathElement.groupElement("width");
    public static final PathElement PATH$height = PathElement.groupElement("height");
    public static final PathElement PATH$redBits = PathElement.groupElement("redBits");
    public static final PathElement PATH$greenBits = PathElement.groupElement("greenBits");
    public static final PathElement PATH$blueBits = PathElement.groupElement("blueBits");
    public static final PathElement PATH$refreshRate = PathElement.groupElement("refreshRate");

    public static final OfInt LAYOUT$width = (OfInt) LAYOUT.select(PATH$width);
    public static final OfInt LAYOUT$height = (OfInt) LAYOUT.select(PATH$height);
    public static final OfInt LAYOUT$redBits = (OfInt) LAYOUT.select(PATH$redBits);
    public static final OfInt LAYOUT$greenBits = (OfInt) LAYOUT.select(PATH$greenBits);
    public static final OfInt LAYOUT$blueBits = (OfInt) LAYOUT.select(PATH$blueBits);
    public static final OfInt LAYOUT$refreshRate = (OfInt) LAYOUT.select(PATH$refreshRate);

    public static final long SIZE$width = LAYOUT$width.byteSize();
    public static final long SIZE$height = LAYOUT$height.byteSize();
    public static final long SIZE$redBits = LAYOUT$redBits.byteSize();
    public static final long SIZE$greenBits = LAYOUT$greenBits.byteSize();
    public static final long SIZE$blueBits = LAYOUT$blueBits.byteSize();
    public static final long SIZE$refreshRate = LAYOUT$refreshRate.byteSize();

    public static final long OFFSET$width = LAYOUT.byteOffset(PATH$width);
    public static final long OFFSET$height = LAYOUT.byteOffset(PATH$height);
    public static final long OFFSET$redBits = LAYOUT.byteOffset(PATH$redBits);
    public static final long OFFSET$greenBits = LAYOUT.byteOffset(PATH$greenBits);
    public static final long OFFSET$blueBits = LAYOUT.byteOffset(PATH$blueBits);
    public static final long OFFSET$refreshRate = LAYOUT.byteOffset(PATH$refreshRate);
}
