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
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHandMeshVertexMSFT.html"><code>XrHandMeshVertexMSFT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrHandMeshVertexMSFT {
///     XrVector3f position; // @link substring="XrVector3f" target="XrVector3f" @link substring="position" target="#position"
///     XrVector3f normal; // @link substring="XrVector3f" target="XrVector3f" @link substring="normal" target="#normal"
/// } XrHandMeshVertexMSFT;
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHandMeshVertexMSFT.html"><code>XrHandMeshVertexMSFT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrHandMeshVertexMSFT(@NotNull MemorySegment segment) implements IXrHandMeshVertexMSFT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHandMeshVertexMSFT.html"><code>XrHandMeshVertexMSFT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrHandMeshVertexMSFT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrHandMeshVertexMSFT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrHandMeshVertexMSFT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrHandMeshVertexMSFT, Iterable<XrHandMeshVertexMSFT> {
        public long size() {
            return segment.byteSize() / XrHandMeshVertexMSFT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrHandMeshVertexMSFT at(long index) {
            return new XrHandMeshVertexMSFT(segment.asSlice(index * XrHandMeshVertexMSFT.BYTES, XrHandMeshVertexMSFT.BYTES));
        }

        public void at(long index, @NotNull Consumer<@NotNull XrHandMeshVertexMSFT> consumer) {
            consumer.accept(at(index));
        }

        public void write(long index, @NotNull XrHandMeshVertexMSFT value) {
            MemorySegment s = segment.asSlice(index * XrHandMeshVertexMSFT.BYTES, XrHandMeshVertexMSFT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrHandMeshVertexMSFT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrHandMeshVertexMSFT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrHandMeshVertexMSFT.BYTES,
                (end - start) * XrHandMeshVertexMSFT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrHandMeshVertexMSFT.BYTES));
        }

        public XrHandMeshVertexMSFT[] toArray() {
            XrHandMeshVertexMSFT[] ret = new XrHandMeshVertexMSFT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrHandMeshVertexMSFT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrHandMeshVertexMSFT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrHandMeshVertexMSFT.BYTES;
            }

            @Override
            public XrHandMeshVertexMSFT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrHandMeshVertexMSFT ret = new XrHandMeshVertexMSFT(segment.asSlice(0, XrHandMeshVertexMSFT.BYTES));
                segment = segment.asSlice(XrHandMeshVertexMSFT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrHandMeshVertexMSFT allocate(Arena arena) {
        return new XrHandMeshVertexMSFT(arena.allocate(LAYOUT));
    }

    public static XrHandMeshVertexMSFT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrHandMeshVertexMSFT.Ptr(segment);
    }

    public static XrHandMeshVertexMSFT clone(Arena arena, XrHandMeshVertexMSFT src) {
        XrHandMeshVertexMSFT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NotNull XrVector3f position() {
        return new XrVector3f(segment.asSlice(OFFSET$position, LAYOUT$position));
    }

    public XrHandMeshVertexMSFT position(@NotNull XrVector3f value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$position, SIZE$position);
        return this;
    }

    public XrHandMeshVertexMSFT position(Consumer<@NotNull XrVector3f> consumer) {
        consumer.accept(position());
        return this;
    }

    public @NotNull XrVector3f normal() {
        return new XrVector3f(segment.asSlice(OFFSET$normal, LAYOUT$normal));
    }

    public XrHandMeshVertexMSFT normal(@NotNull XrVector3f value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$normal, SIZE$normal);
        return this;
    }

    public XrHandMeshVertexMSFT normal(Consumer<@NotNull XrVector3f> consumer) {
        consumer.accept(normal());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        XrVector3f.LAYOUT.withName("position"),
        XrVector3f.LAYOUT.withName("normal")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$position = PathElement.groupElement("position");
    public static final PathElement PATH$normal = PathElement.groupElement("normal");

    public static final StructLayout LAYOUT$position = (StructLayout) LAYOUT.select(PATH$position);
    public static final StructLayout LAYOUT$normal = (StructLayout) LAYOUT.select(PATH$normal);

    public static final long SIZE$position = LAYOUT$position.byteSize();
    public static final long SIZE$normal = LAYOUT$normal.byteSize();

    public static final long OFFSET$position = LAYOUT.byteOffset(PATH$position);
    public static final long OFFSET$normal = LAYOUT.byteOffset(PATH$normal);
}
