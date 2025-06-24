package club.doki7.openxr.datatype;

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
import club.doki7.openxr.bitmask.*;
import club.doki7.openxr.handle.*;
import club.doki7.openxr.enumtype.*;
import static club.doki7.openxr.XRConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialPolygon2DDataEXT.html"><code>XrSpatialPolygon2DDataEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSpatialPolygon2DDataEXT {
///     XrPosef origin; // @link substring="XrPosef" target="XrPosef" @link substring="origin" target="#origin"
///     XrSpatialBufferEXT vertexBuffer; // @link substring="XrSpatialBufferEXT" target="XrSpatialBufferEXT" @link substring="vertexBuffer" target="#vertexBuffer"
/// } XrSpatialPolygon2DDataEXT;
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialPolygon2DDataEXT.html"><code>XrSpatialPolygon2DDataEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSpatialPolygon2DDataEXT(@NotNull MemorySegment segment) implements IXrSpatialPolygon2DDataEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialPolygon2DDataEXT.html"><code>XrSpatialPolygon2DDataEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSpatialPolygon2DDataEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSpatialPolygon2DDataEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSpatialPolygon2DDataEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSpatialPolygon2DDataEXT, Iterable<XrSpatialPolygon2DDataEXT> {
        public long size() {
            return segment.byteSize() / XrSpatialPolygon2DDataEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSpatialPolygon2DDataEXT at(long index) {
            return new XrSpatialPolygon2DDataEXT(segment.asSlice(index * XrSpatialPolygon2DDataEXT.BYTES, XrSpatialPolygon2DDataEXT.BYTES));
        }

        public void write(long index, @NotNull XrSpatialPolygon2DDataEXT value) {
            MemorySegment s = segment.asSlice(index * XrSpatialPolygon2DDataEXT.BYTES, XrSpatialPolygon2DDataEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSpatialPolygon2DDataEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSpatialPolygon2DDataEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSpatialPolygon2DDataEXT.BYTES,
                (end - start) * XrSpatialPolygon2DDataEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSpatialPolygon2DDataEXT.BYTES));
        }

        public XrSpatialPolygon2DDataEXT[] toArray() {
            XrSpatialPolygon2DDataEXT[] ret = new XrSpatialPolygon2DDataEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSpatialPolygon2DDataEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSpatialPolygon2DDataEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSpatialPolygon2DDataEXT.BYTES;
            }

            @Override
            public XrSpatialPolygon2DDataEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSpatialPolygon2DDataEXT ret = new XrSpatialPolygon2DDataEXT(segment.asSlice(0, XrSpatialPolygon2DDataEXT.BYTES));
                segment = segment.asSlice(XrSpatialPolygon2DDataEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSpatialPolygon2DDataEXT allocate(Arena arena) {
        return new XrSpatialPolygon2DDataEXT(arena.allocate(LAYOUT));
    }

    public static XrSpatialPolygon2DDataEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrSpatialPolygon2DDataEXT.Ptr(segment);
    }

    public static XrSpatialPolygon2DDataEXT clone(Arena arena, XrSpatialPolygon2DDataEXT src) {
        XrSpatialPolygon2DDataEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NotNull XrPosef origin() {
        return new XrPosef(segment.asSlice(OFFSET$origin, LAYOUT$origin));
    }

    public XrSpatialPolygon2DDataEXT origin(@NotNull XrPosef value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$origin, SIZE$origin);
        return this;
    }

    public XrSpatialPolygon2DDataEXT origin(Consumer<@NotNull XrPosef> consumer) {
        consumer.accept(origin());
        return this;
    }

    public @NotNull XrSpatialBufferEXT vertexBuffer() {
        return new XrSpatialBufferEXT(segment.asSlice(OFFSET$vertexBuffer, LAYOUT$vertexBuffer));
    }

    public XrSpatialPolygon2DDataEXT vertexBuffer(@NotNull XrSpatialBufferEXT value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$vertexBuffer, SIZE$vertexBuffer);
        return this;
    }

    public XrSpatialPolygon2DDataEXT vertexBuffer(Consumer<@NotNull XrSpatialBufferEXT> consumer) {
        consumer.accept(vertexBuffer());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        XrPosef.LAYOUT.withName("origin"),
        XrSpatialBufferEXT.LAYOUT.withName("vertexBuffer")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$origin = PathElement.groupElement("origin");
    public static final PathElement PATH$vertexBuffer = PathElement.groupElement("vertexBuffer");

    public static final StructLayout LAYOUT$origin = (StructLayout) LAYOUT.select(PATH$origin);
    public static final StructLayout LAYOUT$vertexBuffer = (StructLayout) LAYOUT.select(PATH$vertexBuffer);

    public static final long SIZE$origin = LAYOUT$origin.byteSize();
    public static final long SIZE$vertexBuffer = LAYOUT$vertexBuffer.byteSize();

    public static final long OFFSET$origin = LAYOUT.byteOffset(PATH$origin);
    public static final long OFFSET$vertexBuffer = LAYOUT.byteOffset(PATH$vertexBuffer);
}
