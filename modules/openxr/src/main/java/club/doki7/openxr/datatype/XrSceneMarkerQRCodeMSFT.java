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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneMarkerQRCodeMSFT.html"><code>XrSceneMarkerQRCodeMSFT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSceneMarkerQRCodeMSFT {
///     XrSceneMarkerQRCodeSymbolTypeMSFT symbolType; // @link substring="XrSceneMarkerQRCodeSymbolTypeMSFT" target="XrSceneMarkerQRCodeSymbolTypeMSFT" @link substring="symbolType" target="#symbolType"
///     uint8_t version; // @link substring="version" target="#version"
/// } XrSceneMarkerQRCodeMSFT;
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneMarkerQRCodeMSFT.html"><code>XrSceneMarkerQRCodeMSFT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSceneMarkerQRCodeMSFT(@NotNull MemorySegment segment) implements IXrSceneMarkerQRCodeMSFT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneMarkerQRCodeMSFT.html"><code>XrSceneMarkerQRCodeMSFT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSceneMarkerQRCodeMSFT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSceneMarkerQRCodeMSFT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSceneMarkerQRCodeMSFT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSceneMarkerQRCodeMSFT, Iterable<XrSceneMarkerQRCodeMSFT> {
        public long size() {
            return segment.byteSize() / XrSceneMarkerQRCodeMSFT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSceneMarkerQRCodeMSFT at(long index) {
            return new XrSceneMarkerQRCodeMSFT(segment.asSlice(index * XrSceneMarkerQRCodeMSFT.BYTES, XrSceneMarkerQRCodeMSFT.BYTES));
        }

        public void write(long index, @NotNull XrSceneMarkerQRCodeMSFT value) {
            MemorySegment s = segment.asSlice(index * XrSceneMarkerQRCodeMSFT.BYTES, XrSceneMarkerQRCodeMSFT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSceneMarkerQRCodeMSFT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSceneMarkerQRCodeMSFT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSceneMarkerQRCodeMSFT.BYTES,
                (end - start) * XrSceneMarkerQRCodeMSFT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSceneMarkerQRCodeMSFT.BYTES));
        }

        public XrSceneMarkerQRCodeMSFT[] toArray() {
            XrSceneMarkerQRCodeMSFT[] ret = new XrSceneMarkerQRCodeMSFT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSceneMarkerQRCodeMSFT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSceneMarkerQRCodeMSFT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSceneMarkerQRCodeMSFT.BYTES;
            }

            @Override
            public XrSceneMarkerQRCodeMSFT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSceneMarkerQRCodeMSFT ret = new XrSceneMarkerQRCodeMSFT(segment.asSlice(0, XrSceneMarkerQRCodeMSFT.BYTES));
                segment = segment.asSlice(XrSceneMarkerQRCodeMSFT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSceneMarkerQRCodeMSFT allocate(Arena arena) {
        return new XrSceneMarkerQRCodeMSFT(arena.allocate(LAYOUT));
    }

    public static XrSceneMarkerQRCodeMSFT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrSceneMarkerQRCodeMSFT.Ptr(segment);
    }

    public static XrSceneMarkerQRCodeMSFT clone(Arena arena, XrSceneMarkerQRCodeMSFT src) {
        XrSceneMarkerQRCodeMSFT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(XrSceneMarkerQRCodeSymbolTypeMSFT.class) int symbolType() {
        return segment.get(LAYOUT$symbolType, OFFSET$symbolType);
    }

    public XrSceneMarkerQRCodeMSFT symbolType(@EnumType(XrSceneMarkerQRCodeSymbolTypeMSFT.class) int value) {
        segment.set(LAYOUT$symbolType, OFFSET$symbolType, value);
        return this;
    }

    public @Unsigned byte version() {
        return segment.get(LAYOUT$version, OFFSET$version);
    }

    public XrSceneMarkerQRCodeMSFT version(@Unsigned byte value) {
        segment.set(LAYOUT$version, OFFSET$version, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("symbolType"),
        ValueLayout.JAVA_BYTE.withName("version")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$symbolType = PathElement.groupElement("symbolType");
    public static final PathElement PATH$version = PathElement.groupElement("version");

    public static final OfInt LAYOUT$symbolType = (OfInt) LAYOUT.select(PATH$symbolType);
    public static final OfByte LAYOUT$version = (OfByte) LAYOUT.select(PATH$version);

    public static final long SIZE$symbolType = LAYOUT$symbolType.byteSize();
    public static final long SIZE$version = LAYOUT$version.byteSize();

    public static final long OFFSET$symbolType = LAYOUT.byteOffset(PATH$symbolType);
    public static final long OFFSET$version = LAYOUT.byteOffset(PATH$version);
}
