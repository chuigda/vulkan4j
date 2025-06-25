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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrRect2Di.html"><code>XrRect2Di</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrRect2Di {
///     XrOffset2Di offset; // @link substring="XrOffset2Di" target="XrOffset2Di" @link substring="offset" target="#offset"
///     XrExtent2Di extent; // @link substring="XrExtent2Di" target="XrExtent2Di" @link substring="extent" target="#extent"
/// } XrRect2Di;
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrRect2Di.html"><code>XrRect2Di</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrRect2Di(@NotNull MemorySegment segment) implements IXrRect2Di {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrRect2Di.html"><code>XrRect2Di</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrRect2Di}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrRect2Di to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrRect2Di.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrRect2Di, Iterable<XrRect2Di> {
        public long size() {
            return segment.byteSize() / XrRect2Di.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrRect2Di at(long index) {
            return new XrRect2Di(segment.asSlice(index * XrRect2Di.BYTES, XrRect2Di.BYTES));
        }

        public XrRect2Di.Ptr at(long index, @NotNull Consumer<@NotNull XrRect2Di> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrRect2Di value) {
            MemorySegment s = segment.asSlice(index * XrRect2Di.BYTES, XrRect2Di.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrRect2Di.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrRect2Di.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrRect2Di.BYTES,
                (end - start) * XrRect2Di.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrRect2Di.BYTES));
        }

        public XrRect2Di[] toArray() {
            XrRect2Di[] ret = new XrRect2Di[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrRect2Di> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrRect2Di> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrRect2Di.BYTES;
            }

            @Override
            public XrRect2Di next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrRect2Di ret = new XrRect2Di(segment.asSlice(0, XrRect2Di.BYTES));
                segment = segment.asSlice(XrRect2Di.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrRect2Di allocate(Arena arena) {
        return new XrRect2Di(arena.allocate(LAYOUT));
    }

    public static XrRect2Di.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrRect2Di.Ptr(segment);
    }

    public static XrRect2Di clone(Arena arena, XrRect2Di src) {
        XrRect2Di ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NotNull XrOffset2Di offset() {
        return new XrOffset2Di(segment.asSlice(OFFSET$offset, LAYOUT$offset));
    }

    public XrRect2Di offset(@NotNull XrOffset2Di value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$offset, SIZE$offset);
        return this;
    }

    public XrRect2Di offset(Consumer<@NotNull XrOffset2Di> consumer) {
        consumer.accept(offset());
        return this;
    }

    public @NotNull XrExtent2Di extent() {
        return new XrExtent2Di(segment.asSlice(OFFSET$extent, LAYOUT$extent));
    }

    public XrRect2Di extent(@NotNull XrExtent2Di value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$extent, SIZE$extent);
        return this;
    }

    public XrRect2Di extent(Consumer<@NotNull XrExtent2Di> consumer) {
        consumer.accept(extent());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        XrOffset2Di.LAYOUT.withName("offset"),
        XrExtent2Di.LAYOUT.withName("extent")
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
