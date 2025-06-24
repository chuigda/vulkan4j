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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialPersistenceDataEXT.html"><code>XrSpatialPersistenceDataEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSpatialPersistenceDataEXT {
///     XrUuid persistUuid; // @link substring="XrUuid" target="XrUuid" @link substring="persistUuid" target="#persistUuid"
///     XrSpatialPersistenceStateEXT persistState; // @link substring="XrSpatialPersistenceStateEXT" target="XrSpatialPersistenceStateEXT" @link substring="persistState" target="#persistState"
/// } XrSpatialPersistenceDataEXT;
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialPersistenceDataEXT.html"><code>XrSpatialPersistenceDataEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSpatialPersistenceDataEXT(@NotNull MemorySegment segment) implements IXrSpatialPersistenceDataEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialPersistenceDataEXT.html"><code>XrSpatialPersistenceDataEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSpatialPersistenceDataEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSpatialPersistenceDataEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSpatialPersistenceDataEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSpatialPersistenceDataEXT, Iterable<XrSpatialPersistenceDataEXT> {
        public long size() {
            return segment.byteSize() / XrSpatialPersistenceDataEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSpatialPersistenceDataEXT at(long index) {
            return new XrSpatialPersistenceDataEXT(segment.asSlice(index * XrSpatialPersistenceDataEXT.BYTES, XrSpatialPersistenceDataEXT.BYTES));
        }

        public void write(long index, @NotNull XrSpatialPersistenceDataEXT value) {
            MemorySegment s = segment.asSlice(index * XrSpatialPersistenceDataEXT.BYTES, XrSpatialPersistenceDataEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSpatialPersistenceDataEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSpatialPersistenceDataEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSpatialPersistenceDataEXT.BYTES,
                (end - start) * XrSpatialPersistenceDataEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSpatialPersistenceDataEXT.BYTES));
        }

        public XrSpatialPersistenceDataEXT[] toArray() {
            XrSpatialPersistenceDataEXT[] ret = new XrSpatialPersistenceDataEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSpatialPersistenceDataEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSpatialPersistenceDataEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSpatialPersistenceDataEXT.BYTES;
            }

            @Override
            public XrSpatialPersistenceDataEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSpatialPersistenceDataEXT ret = new XrSpatialPersistenceDataEXT(segment.asSlice(0, XrSpatialPersistenceDataEXT.BYTES));
                segment = segment.asSlice(XrSpatialPersistenceDataEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSpatialPersistenceDataEXT allocate(Arena arena) {
        return new XrSpatialPersistenceDataEXT(arena.allocate(LAYOUT));
    }

    public static XrSpatialPersistenceDataEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrSpatialPersistenceDataEXT.Ptr(segment);
    }

    public static XrSpatialPersistenceDataEXT clone(Arena arena, XrSpatialPersistenceDataEXT src) {
        XrSpatialPersistenceDataEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NotNull XrUuid persistUuid() {
        return new XrUuid(segment.asSlice(OFFSET$persistUuid, LAYOUT$persistUuid));
    }

    public XrSpatialPersistenceDataEXT persistUuid(@NotNull XrUuid value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$persistUuid, SIZE$persistUuid);
        return this;
    }

    public XrSpatialPersistenceDataEXT persistUuid(Consumer<@NotNull XrUuid> consumer) {
        consumer.accept(persistUuid());
        return this;
    }

    public @EnumType(XrSpatialPersistenceStateEXT.class) int persistState() {
        return segment.get(LAYOUT$persistState, OFFSET$persistState);
    }

    public XrSpatialPersistenceDataEXT persistState(@EnumType(XrSpatialPersistenceStateEXT.class) int value) {
        segment.set(LAYOUT$persistState, OFFSET$persistState, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        XrUuid.LAYOUT.withName("persistUuid"),
        ValueLayout.JAVA_INT.withName("persistState")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$persistUuid = PathElement.groupElement("persistUuid");
    public static final PathElement PATH$persistState = PathElement.groupElement("persistState");

    public static final StructLayout LAYOUT$persistUuid = (StructLayout) LAYOUT.select(PATH$persistUuid);
    public static final OfInt LAYOUT$persistState = (OfInt) LAYOUT.select(PATH$persistState);

    public static final long SIZE$persistUuid = LAYOUT$persistUuid.byteSize();
    public static final long SIZE$persistState = LAYOUT$persistState.byteSize();

    public static final long OFFSET$persistUuid = LAYOUT.byteOffset(PATH$persistUuid);
    public static final long OFFSET$persistState = LAYOUT.byteOffset(PATH$persistState);
}
