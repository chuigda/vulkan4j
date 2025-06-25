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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrRect3DfFB.html"><code>XrRect3DfFB</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrRect3DfFB {
///     XrOffset3DfFB offset; // @link substring="XrOffset3DfFB" target="XrOffset3DfFB" @link substring="offset" target="#offset"
///     XrExtent3DfFB extent; // @link substring="XrExtent3DfFB" target="XrExtent3DfFB" @link substring="extent" target="#extent"
/// } XrRect3DfFB;
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrRect3DfFB.html"><code>XrRect3DfFB</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrRect3DfFB(@NotNull MemorySegment segment) implements IXrRect3DfFB {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrRect3DfFB.html"><code>XrRect3DfFB</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrRect3DfFB}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrRect3DfFB to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrRect3DfFB.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrRect3DfFB, Iterable<XrRect3DfFB> {
        public long size() {
            return segment.byteSize() / XrRect3DfFB.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrRect3DfFB at(long index) {
            return new XrRect3DfFB(segment.asSlice(index * XrRect3DfFB.BYTES, XrRect3DfFB.BYTES));
        }

        public XrRect3DfFB.Ptr at(long index, @NotNull Consumer<@NotNull XrRect3DfFB> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrRect3DfFB value) {
            MemorySegment s = segment.asSlice(index * XrRect3DfFB.BYTES, XrRect3DfFB.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrRect3DfFB.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrRect3DfFB.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrRect3DfFB.BYTES,
                (end - start) * XrRect3DfFB.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrRect3DfFB.BYTES));
        }

        public XrRect3DfFB[] toArray() {
            XrRect3DfFB[] ret = new XrRect3DfFB[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrRect3DfFB> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrRect3DfFB> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrRect3DfFB.BYTES;
            }

            @Override
            public XrRect3DfFB next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrRect3DfFB ret = new XrRect3DfFB(segment.asSlice(0, XrRect3DfFB.BYTES));
                segment = segment.asSlice(XrRect3DfFB.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrRect3DfFB allocate(Arena arena) {
        return new XrRect3DfFB(arena.allocate(LAYOUT));
    }

    public static XrRect3DfFB.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrRect3DfFB.Ptr(segment);
    }

    public static XrRect3DfFB clone(Arena arena, XrRect3DfFB src) {
        XrRect3DfFB ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NotNull XrOffset3DfFB offset() {
        return new XrOffset3DfFB(segment.asSlice(OFFSET$offset, LAYOUT$offset));
    }

    public XrRect3DfFB offset(@NotNull XrOffset3DfFB value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$offset, SIZE$offset);
        return this;
    }

    public XrRect3DfFB offset(Consumer<@NotNull XrOffset3DfFB> consumer) {
        consumer.accept(offset());
        return this;
    }

    public @NotNull XrExtent3DfFB extent() {
        return new XrExtent3DfFB(segment.asSlice(OFFSET$extent, LAYOUT$extent));
    }

    public XrRect3DfFB extent(@NotNull XrExtent3DfFB value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$extent, SIZE$extent);
        return this;
    }

    public XrRect3DfFB extent(Consumer<@NotNull XrExtent3DfFB> consumer) {
        consumer.accept(extent());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        XrOffset3DfFB.LAYOUT.withName("offset"),
        XrExtent3DfFB.LAYOUT.withName("extent")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$offset = PathElement.groupElement("offset");
    public static final PathElement PATH$extent = PathElement.groupElement("extent");

    public static final StructLayout LAYOUT$offset = (StructLayout) LAYOUT.select(PATH$offset);
    public static final StructLayout LAYOUT$extent = (StructLayout) LAYOUT.select(PATH$extent);

    public static final long SIZE$offset = LAYOUT$offset.byteSize();
    public static final long SIZE$extent = LAYOUT$extent.byteSize();

    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);
    public static final long OFFSET$extent = LAYOUT.byteOffset(PATH$extent);
}
