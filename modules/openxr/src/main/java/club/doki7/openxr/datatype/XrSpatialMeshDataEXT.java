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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialMeshDataEXT.html"><code>XrSpatialMeshDataEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSpatialMeshDataEXT {
///     XrPosef origin; // @link substring="XrPosef" target="XrPosef" @link substring="origin" target="#origin"
///     XrSpatialBufferEXT vertexBuffer; // @link substring="XrSpatialBufferEXT" target="XrSpatialBufferEXT" @link substring="vertexBuffer" target="#vertexBuffer"
///     XrSpatialBufferEXT indexBuffer; // @link substring="XrSpatialBufferEXT" target="XrSpatialBufferEXT" @link substring="indexBuffer" target="#indexBuffer"
/// } XrSpatialMeshDataEXT;
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialMeshDataEXT.html"><code>XrSpatialMeshDataEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSpatialMeshDataEXT(@NotNull MemorySegment segment) implements IXrSpatialMeshDataEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialMeshDataEXT.html"><code>XrSpatialMeshDataEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSpatialMeshDataEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSpatialMeshDataEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSpatialMeshDataEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSpatialMeshDataEXT, Iterable<XrSpatialMeshDataEXT> {
        public long size() {
            return segment.byteSize() / XrSpatialMeshDataEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSpatialMeshDataEXT at(long index) {
            return new XrSpatialMeshDataEXT(segment.asSlice(index * XrSpatialMeshDataEXT.BYTES, XrSpatialMeshDataEXT.BYTES));
        }

        public void write(long index, @NotNull XrSpatialMeshDataEXT value) {
            MemorySegment s = segment.asSlice(index * XrSpatialMeshDataEXT.BYTES, XrSpatialMeshDataEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSpatialMeshDataEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSpatialMeshDataEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSpatialMeshDataEXT.BYTES,
                (end - start) * XrSpatialMeshDataEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSpatialMeshDataEXT.BYTES));
        }

        public XrSpatialMeshDataEXT[] toArray() {
            XrSpatialMeshDataEXT[] ret = new XrSpatialMeshDataEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSpatialMeshDataEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSpatialMeshDataEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSpatialMeshDataEXT.BYTES;
            }

            @Override
            public XrSpatialMeshDataEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSpatialMeshDataEXT ret = new XrSpatialMeshDataEXT(segment.asSlice(0, XrSpatialMeshDataEXT.BYTES));
                segment = segment.asSlice(XrSpatialMeshDataEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSpatialMeshDataEXT allocate(Arena arena) {
        return new XrSpatialMeshDataEXT(arena.allocate(LAYOUT));
    }

    public static XrSpatialMeshDataEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrSpatialMeshDataEXT.Ptr(segment);
    }

    public static XrSpatialMeshDataEXT clone(Arena arena, XrSpatialMeshDataEXT src) {
        XrSpatialMeshDataEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NotNull XrPosef origin() {
        return new XrPosef(segment.asSlice(OFFSET$origin, LAYOUT$origin));
    }

    public XrSpatialMeshDataEXT origin(@NotNull XrPosef value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$origin, SIZE$origin);
        return this;
    }

    public XrSpatialMeshDataEXT origin(Consumer<@NotNull XrPosef> consumer) {
        consumer.accept(origin());
        return this;
    }

    public @NotNull XrSpatialBufferEXT vertexBuffer() {
        return new XrSpatialBufferEXT(segment.asSlice(OFFSET$vertexBuffer, LAYOUT$vertexBuffer));
    }

    public XrSpatialMeshDataEXT vertexBuffer(@NotNull XrSpatialBufferEXT value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$vertexBuffer, SIZE$vertexBuffer);
        return this;
    }

    public XrSpatialMeshDataEXT vertexBuffer(Consumer<@NotNull XrSpatialBufferEXT> consumer) {
        consumer.accept(vertexBuffer());
        return this;
    }

    public @NotNull XrSpatialBufferEXT indexBuffer() {
        return new XrSpatialBufferEXT(segment.asSlice(OFFSET$indexBuffer, LAYOUT$indexBuffer));
    }

    public XrSpatialMeshDataEXT indexBuffer(@NotNull XrSpatialBufferEXT value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$indexBuffer, SIZE$indexBuffer);
        return this;
    }

    public XrSpatialMeshDataEXT indexBuffer(Consumer<@NotNull XrSpatialBufferEXT> consumer) {
        consumer.accept(indexBuffer());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        XrPosef.LAYOUT.withName("origin"),
        XrSpatialBufferEXT.LAYOUT.withName("vertexBuffer"),
        XrSpatialBufferEXT.LAYOUT.withName("indexBuffer")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$origin = PathElement.groupElement("origin");
    public static final PathElement PATH$vertexBuffer = PathElement.groupElement("vertexBuffer");
    public static final PathElement PATH$indexBuffer = PathElement.groupElement("indexBuffer");

    public static final StructLayout LAYOUT$origin = (StructLayout) LAYOUT.select(PATH$origin);
    public static final StructLayout LAYOUT$vertexBuffer = (StructLayout) LAYOUT.select(PATH$vertexBuffer);
    public static final StructLayout LAYOUT$indexBuffer = (StructLayout) LAYOUT.select(PATH$indexBuffer);

    public static final long SIZE$origin = LAYOUT$origin.byteSize();
    public static final long SIZE$vertexBuffer = LAYOUT$vertexBuffer.byteSize();
    public static final long SIZE$indexBuffer = LAYOUT$indexBuffer.byteSize();

    public static final long OFFSET$origin = LAYOUT.byteOffset(PATH$origin);
    public static final long OFFSET$vertexBuffer = LAYOUT.byteOffset(PATH$vertexBuffer);
    public static final long OFFSET$indexBuffer = LAYOUT.byteOffset(PATH$indexBuffer);
}
