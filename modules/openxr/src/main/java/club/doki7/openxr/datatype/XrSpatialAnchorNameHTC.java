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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialAnchorNameHTC.html"><code>XrSpatialAnchorNameHTC</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSpatialAnchorNameHTC {
///     char[XR_MAX_SPATIAL_ANCHOR_NAME_SIZE_HTC] name; // @link substring="name" target="#name"
/// } XrSpatialAnchorNameHTC;
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialAnchorNameHTC.html"><code>XrSpatialAnchorNameHTC</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSpatialAnchorNameHTC(@NotNull MemorySegment segment) implements IXrSpatialAnchorNameHTC {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialAnchorNameHTC.html"><code>XrSpatialAnchorNameHTC</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSpatialAnchorNameHTC}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSpatialAnchorNameHTC to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSpatialAnchorNameHTC.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSpatialAnchorNameHTC, Iterable<XrSpatialAnchorNameHTC> {
        public long size() {
            return segment.byteSize() / XrSpatialAnchorNameHTC.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSpatialAnchorNameHTC at(long index) {
            return new XrSpatialAnchorNameHTC(segment.asSlice(index * XrSpatialAnchorNameHTC.BYTES, XrSpatialAnchorNameHTC.BYTES));
        }

        public void at(long index, @NotNull Consumer<@NotNull XrSpatialAnchorNameHTC> consumer) {
            consumer.accept(at(index));
        }

        public void write(long index, @NotNull XrSpatialAnchorNameHTC value) {
            MemorySegment s = segment.asSlice(index * XrSpatialAnchorNameHTC.BYTES, XrSpatialAnchorNameHTC.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSpatialAnchorNameHTC.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSpatialAnchorNameHTC.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSpatialAnchorNameHTC.BYTES,
                (end - start) * XrSpatialAnchorNameHTC.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSpatialAnchorNameHTC.BYTES));
        }

        public XrSpatialAnchorNameHTC[] toArray() {
            XrSpatialAnchorNameHTC[] ret = new XrSpatialAnchorNameHTC[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSpatialAnchorNameHTC> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSpatialAnchorNameHTC> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSpatialAnchorNameHTC.BYTES;
            }

            @Override
            public XrSpatialAnchorNameHTC next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSpatialAnchorNameHTC ret = new XrSpatialAnchorNameHTC(segment.asSlice(0, XrSpatialAnchorNameHTC.BYTES));
                segment = segment.asSlice(XrSpatialAnchorNameHTC.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSpatialAnchorNameHTC allocate(Arena arena) {
        return new XrSpatialAnchorNameHTC(arena.allocate(LAYOUT));
    }

    public static XrSpatialAnchorNameHTC.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrSpatialAnchorNameHTC.Ptr(segment);
    }

    public static XrSpatialAnchorNameHTC clone(Arena arena, XrSpatialAnchorNameHTC src) {
        XrSpatialAnchorNameHTC ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public BytePtr name() {
        return new BytePtr(nameRaw());
    }

    public XrSpatialAnchorNameHTC name(@NotNull Consumer<BytePtr> consumer) {
        BytePtr ptr = name();
        consumer.accept(ptr);
        return this;
    }

    public XrSpatialAnchorNameHTC name(BytePtr value) {
        MemorySegment s = nameRaw();
        s.copyFrom(value.segment());
        return this;
    }

    public @NotNull MemorySegment nameRaw() {
        return segment.asSlice(OFFSET$name, SIZE$name);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        MemoryLayout.sequenceLayout(MAX_SPATIAL_ANCHOR_NAME_SIZE_HTC, ValueLayout.JAVA_BYTE).withName("name")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$name = PathElement.groupElement("name");

    public static final SequenceLayout LAYOUT$name = (SequenceLayout) LAYOUT.select(PATH$name);

    public static final long SIZE$name = LAYOUT$name.byteSize();

    public static final long OFFSET$name = LAYOUT.byteOffset(PATH$name);
}
