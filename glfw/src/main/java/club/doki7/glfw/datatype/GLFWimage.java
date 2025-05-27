package club.doki7.glfw.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;
import java.util.List;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.glfw.handle.*;
import static club.doki7.glfw.GLFWConstants.*;

///  @brief Image data.
///
///  This describes a single 2D image.  See the documentation for each related
///  function what the expected pixel format is.
///
///  @sa @ref cursor_custom
///  @sa @ref window_icon
///
///  @since Added in version 2.1.
///  @glfw3 Removed format and bytes-per-pixel members.
///
///  @ingroup window
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct GLFWimage {
///     int width; // @link substring="width" target="#width"
///     int height; // @link substring="height" target="#height"
///     char* pixels; // @link substring="pixels" target="#pixels"
/// } GLFWimage;
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
/// <li>{@link #width}  The width, in pixels, of this image.</li>
/// <li>{@link #height}  The height, in pixels, of this image.</li>
/// <li>{@link #pixels}  The pixel data of this image, arranged left-to-right, top-to-bottom.</li>
/// </ul>
@ValueBasedCandidate
@UnsafeConstructor
public record GLFWimage(@NotNull MemorySegment segment) implements IGLFWimage {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link GLFWimage}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IGLFWimage to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code GLFWimage.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IGLFWimage {
        public long size() {
            return segment.byteSize() / GLFWimage.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull GLFWimage at(long index) {
            return new GLFWimage(segment.asSlice(index * GLFWimage.BYTES, GLFWimage.BYTES));
        }

        public void write(long index, @NotNull GLFWimage value) {
            MemorySegment s = segment.asSlice(index * GLFWimage.BYTES, GLFWimage.BYTES);
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
            return new Ptr(segment.asSlice(index * GLFWimage.BYTES, GLFWimage.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * GLFWimage.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * GLFWimage.BYTES,
                (end - start) * GLFWimage.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * GLFWimage.BYTES));
        }

        public GLFWimage[] toArray() {
            GLFWimage[] ret = new GLFWimage[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }
    }

    public static GLFWimage allocate(Arena arena) {
        return new GLFWimage(arena.allocate(LAYOUT));
    }

    public static GLFWimage.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new GLFWimage.Ptr(segment);
    }

    public static GLFWimage clone(Arena arena, GLFWimage src) {
        GLFWimage ret = allocate(arena);
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

    /// Note: the returned {@link BytePtr} does not have correct
    /// {@link BytePtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link BytePtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable BytePtr pixels() {
        MemorySegment s = pixelsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new BytePtr(s);
    }

    public void pixels(@Nullable BytePtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pixelsRaw(s);
    }

    public @Pointer(comment="int8_t*") MemorySegment pixelsRaw() {
        return segment.get(LAYOUT$pixels, OFFSET$pixels);
    }

    public void pixelsRaw(@Pointer(comment="int8_t*") MemorySegment value) {
        segment.set(LAYOUT$pixels, OFFSET$pixels, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("pixels")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$width = PathElement.groupElement("width");
    public static final PathElement PATH$height = PathElement.groupElement("height");
    public static final PathElement PATH$pixels = PathElement.groupElement("pixels");

    public static final OfInt LAYOUT$width = (OfInt) LAYOUT.select(PATH$width);
    public static final OfInt LAYOUT$height = (OfInt) LAYOUT.select(PATH$height);
    public static final AddressLayout LAYOUT$pixels = (AddressLayout) LAYOUT.select(PATH$pixels);

    public static final long SIZE$width = LAYOUT$width.byteSize();
    public static final long SIZE$height = LAYOUT$height.byteSize();
    public static final long SIZE$pixels = LAYOUT$pixels.byteSize();

    public static final long OFFSET$width = LAYOUT.byteOffset(PATH$width);
    public static final long OFFSET$height = LAYOUT.byteOffset(PATH$height);
    public static final long OFFSET$pixels = LAYOUT.byteOffset(PATH$pixels);
}
