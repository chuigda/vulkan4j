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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrDeserializeSceneFragmentMSFT.html"><code>XrDeserializeSceneFragmentMSFT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrDeserializeSceneFragmentMSFT {
///     uint32_t bufferSize; // optional // @link substring="bufferSize" target="#bufferSize"
///     uint8_t const* buffer; // optional // @link substring="buffer" target="#buffer"
/// } XrDeserializeSceneFragmentMSFT;
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrDeserializeSceneFragmentMSFT.html"><code>XrDeserializeSceneFragmentMSFT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrDeserializeSceneFragmentMSFT(@NotNull MemorySegment segment) implements IXrDeserializeSceneFragmentMSFT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrDeserializeSceneFragmentMSFT.html"><code>XrDeserializeSceneFragmentMSFT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrDeserializeSceneFragmentMSFT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrDeserializeSceneFragmentMSFT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrDeserializeSceneFragmentMSFT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrDeserializeSceneFragmentMSFT, Iterable<XrDeserializeSceneFragmentMSFT> {
        public long size() {
            return segment.byteSize() / XrDeserializeSceneFragmentMSFT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrDeserializeSceneFragmentMSFT at(long index) {
            return new XrDeserializeSceneFragmentMSFT(segment.asSlice(index * XrDeserializeSceneFragmentMSFT.BYTES, XrDeserializeSceneFragmentMSFT.BYTES));
        }

        public void write(long index, @NotNull XrDeserializeSceneFragmentMSFT value) {
            MemorySegment s = segment.asSlice(index * XrDeserializeSceneFragmentMSFT.BYTES, XrDeserializeSceneFragmentMSFT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrDeserializeSceneFragmentMSFT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrDeserializeSceneFragmentMSFT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrDeserializeSceneFragmentMSFT.BYTES,
                (end - start) * XrDeserializeSceneFragmentMSFT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrDeserializeSceneFragmentMSFT.BYTES));
        }

        public XrDeserializeSceneFragmentMSFT[] toArray() {
            XrDeserializeSceneFragmentMSFT[] ret = new XrDeserializeSceneFragmentMSFT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrDeserializeSceneFragmentMSFT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrDeserializeSceneFragmentMSFT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrDeserializeSceneFragmentMSFT.BYTES;
            }

            @Override
            public XrDeserializeSceneFragmentMSFT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrDeserializeSceneFragmentMSFT ret = new XrDeserializeSceneFragmentMSFT(segment.asSlice(0, XrDeserializeSceneFragmentMSFT.BYTES));
                segment = segment.asSlice(XrDeserializeSceneFragmentMSFT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrDeserializeSceneFragmentMSFT allocate(Arena arena) {
        return new XrDeserializeSceneFragmentMSFT(arena.allocate(LAYOUT));
    }

    public static XrDeserializeSceneFragmentMSFT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrDeserializeSceneFragmentMSFT.Ptr(segment);
    }

    public static XrDeserializeSceneFragmentMSFT clone(Arena arena, XrDeserializeSceneFragmentMSFT src) {
        XrDeserializeSceneFragmentMSFT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Unsigned int bufferSize() {
        return segment.get(LAYOUT$bufferSize, OFFSET$bufferSize);
    }

    public XrDeserializeSceneFragmentMSFT bufferSize(@Unsigned int value) {
        segment.set(LAYOUT$bufferSize, OFFSET$bufferSize, value);
        return this;
    }

    /// Note: the returned {@link BytePtr} does not have correct
    /// {@link BytePtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link BytePtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @Unsigned BytePtr buffer() {
        MemorySegment s = bufferRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new BytePtr(s);
    }

    public XrDeserializeSceneFragmentMSFT buffer(@Nullable @Unsigned BytePtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        bufferRaw(s);
        return this;
    }

    public @Pointer(comment="uint8_t*") @NotNull MemorySegment bufferRaw() {
        return segment.get(LAYOUT$buffer, OFFSET$buffer);
    }

    public void bufferRaw(@Pointer(comment="uint8_t*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$buffer, OFFSET$buffer, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("bufferSize"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_BYTE).withName("buffer")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$bufferSize = PathElement.groupElement("bufferSize");
    public static final PathElement PATH$buffer = PathElement.groupElement("buffer");

    public static final OfInt LAYOUT$bufferSize = (OfInt) LAYOUT.select(PATH$bufferSize);
    public static final AddressLayout LAYOUT$buffer = (AddressLayout) LAYOUT.select(PATH$buffer);

    public static final long SIZE$bufferSize = LAYOUT$bufferSize.byteSize();
    public static final long SIZE$buffer = LAYOUT$buffer.byteSize();

    public static final long OFFSET$bufferSize = LAYOUT.byteOffset(PATH$bufferSize);
    public static final long OFFSET$buffer = LAYOUT.byteOffset(PATH$buffer);
}
