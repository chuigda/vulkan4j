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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialBufferEXT.html"><code>XrSpatialBufferEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSpatialBufferEXT {
///     XrSpatialBufferIdEXT bufferId; // @link substring="bufferId" target="#bufferId"
///     XrSpatialBufferTypeEXT bufferType; // @link substring="XrSpatialBufferTypeEXT" target="XrSpatialBufferTypeEXT" @link substring="bufferType" target="#bufferType"
/// } XrSpatialBufferEXT;
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialBufferEXT.html"><code>XrSpatialBufferEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSpatialBufferEXT(@NotNull MemorySegment segment) implements IXrSpatialBufferEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialBufferEXT.html"><code>XrSpatialBufferEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSpatialBufferEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSpatialBufferEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSpatialBufferEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSpatialBufferEXT, Iterable<XrSpatialBufferEXT> {
        public long size() {
            return segment.byteSize() / XrSpatialBufferEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSpatialBufferEXT at(long index) {
            return new XrSpatialBufferEXT(segment.asSlice(index * XrSpatialBufferEXT.BYTES, XrSpatialBufferEXT.BYTES));
        }

        public void at(long index, @NotNull Consumer<@NotNull XrSpatialBufferEXT> consumer) {
            consumer.accept(at(index));
        }

        public void write(long index, @NotNull XrSpatialBufferEXT value) {
            MemorySegment s = segment.asSlice(index * XrSpatialBufferEXT.BYTES, XrSpatialBufferEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSpatialBufferEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSpatialBufferEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSpatialBufferEXT.BYTES,
                (end - start) * XrSpatialBufferEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSpatialBufferEXT.BYTES));
        }

        public XrSpatialBufferEXT[] toArray() {
            XrSpatialBufferEXT[] ret = new XrSpatialBufferEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSpatialBufferEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSpatialBufferEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSpatialBufferEXT.BYTES;
            }

            @Override
            public XrSpatialBufferEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSpatialBufferEXT ret = new XrSpatialBufferEXT(segment.asSlice(0, XrSpatialBufferEXT.BYTES));
                segment = segment.asSlice(XrSpatialBufferEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSpatialBufferEXT allocate(Arena arena) {
        return new XrSpatialBufferEXT(arena.allocate(LAYOUT));
    }

    public static XrSpatialBufferEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrSpatialBufferEXT.Ptr(segment);
    }

    public static XrSpatialBufferEXT clone(Arena arena, XrSpatialBufferEXT src) {
        XrSpatialBufferEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NativeType("XrSpatialBufferIdEXT") @Unsigned long bufferId() {
        return segment.get(LAYOUT$bufferId, OFFSET$bufferId);
    }

    public XrSpatialBufferEXT bufferId(@NativeType("XrSpatialBufferIdEXT") @Unsigned long value) {
        segment.set(LAYOUT$bufferId, OFFSET$bufferId, value);
        return this;
    }

    public @EnumType(XrSpatialBufferTypeEXT.class) int bufferType() {
        return segment.get(LAYOUT$bufferType, OFFSET$bufferType);
    }

    public XrSpatialBufferEXT bufferType(@EnumType(XrSpatialBufferTypeEXT.class) int value) {
        segment.set(LAYOUT$bufferType, OFFSET$bufferType, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("bufferId"),
        ValueLayout.JAVA_INT.withName("bufferType")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bufferId = PathElement.groupElement("bufferId");
    public static final PathElement PATH$bufferType = PathElement.groupElement("bufferType");

    public static final OfLong LAYOUT$bufferId = (OfLong) LAYOUT.select(PATH$bufferId);
    public static final OfInt LAYOUT$bufferType = (OfInt) LAYOUT.select(PATH$bufferType);

    public static final long SIZE$bufferId = LAYOUT$bufferId.byteSize();
    public static final long SIZE$bufferType = LAYOUT$bufferType.byteSize();

    public static final long OFFSET$bufferId = LAYOUT.byteOffset(PATH$bufferId);
    public static final long OFFSET$bufferType = LAYOUT.byteOffset(PATH$bufferType);
}
