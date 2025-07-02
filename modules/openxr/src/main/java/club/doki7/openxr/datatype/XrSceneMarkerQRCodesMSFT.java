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
import club.doki7.openxr.XRFunctionTypes.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneMarkerQRCodesMSFT.html"><code>XrSceneMarkerQRCodesMSFT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSceneMarkerQRCodesMSFT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     uint32_t qrCodeCapacityInput; // optional // @link substring="qrCodeCapacityInput" target="#qrCodeCapacityInput"
///     XrSceneMarkerQRCodeMSFT* qrCodes; // optional // @link substring="XrSceneMarkerQRCodeMSFT" target="XrSceneMarkerQRCodeMSFT" @link substring="qrCodes" target="#qrCodes"
/// } XrSceneMarkerQRCodesMSFT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SCENE_MARKER_QR_CODES_MSFT`
///
/// The {@code allocate} ({@link XrSceneMarkerQRCodesMSFT#allocate(Arena)}, {@link XrSceneMarkerQRCodesMSFT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSceneMarkerQRCodesMSFT#autoInit}
/// to initialize these fields manually for non-allocated instances.
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneMarkerQRCodesMSFT.html"><code>XrSceneMarkerQRCodesMSFT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSceneMarkerQRCodesMSFT(@NotNull MemorySegment segment) implements IXrSceneMarkerQRCodesMSFT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneMarkerQRCodesMSFT.html"><code>XrSceneMarkerQRCodesMSFT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSceneMarkerQRCodesMSFT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSceneMarkerQRCodesMSFT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSceneMarkerQRCodesMSFT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSceneMarkerQRCodesMSFT, Iterable<XrSceneMarkerQRCodesMSFT> {
        public long size() {
            return segment.byteSize() / XrSceneMarkerQRCodesMSFT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSceneMarkerQRCodesMSFT at(long index) {
            return new XrSceneMarkerQRCodesMSFT(segment.asSlice(index * XrSceneMarkerQRCodesMSFT.BYTES, XrSceneMarkerQRCodesMSFT.BYTES));
        }

        public XrSceneMarkerQRCodesMSFT.Ptr at(long index, @NotNull Consumer<@NotNull XrSceneMarkerQRCodesMSFT> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrSceneMarkerQRCodesMSFT value) {
            MemorySegment s = segment.asSlice(index * XrSceneMarkerQRCodesMSFT.BYTES, XrSceneMarkerQRCodesMSFT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSceneMarkerQRCodesMSFT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSceneMarkerQRCodesMSFT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSceneMarkerQRCodesMSFT.BYTES,
                (end - start) * XrSceneMarkerQRCodesMSFT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSceneMarkerQRCodesMSFT.BYTES));
        }

        public XrSceneMarkerQRCodesMSFT[] toArray() {
            XrSceneMarkerQRCodesMSFT[] ret = new XrSceneMarkerQRCodesMSFT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSceneMarkerQRCodesMSFT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSceneMarkerQRCodesMSFT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSceneMarkerQRCodesMSFT.BYTES;
            }

            @Override
            public XrSceneMarkerQRCodesMSFT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSceneMarkerQRCodesMSFT ret = new XrSceneMarkerQRCodesMSFT(segment.asSlice(0, XrSceneMarkerQRCodesMSFT.BYTES));
                segment = segment.asSlice(XrSceneMarkerQRCodesMSFT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSceneMarkerQRCodesMSFT allocate(Arena arena) {
        XrSceneMarkerQRCodesMSFT ret = new XrSceneMarkerQRCodesMSFT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.SCENE_MARKER_QR_CODES_MSFT);
        return ret;
    }

    public static XrSceneMarkerQRCodesMSFT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSceneMarkerQRCodesMSFT.Ptr ret = new XrSceneMarkerQRCodesMSFT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.SCENE_MARKER_QR_CODES_MSFT);
        }
        return ret;
    }

    public static XrSceneMarkerQRCodesMSFT clone(Arena arena, XrSceneMarkerQRCodesMSFT src) {
        XrSceneMarkerQRCodesMSFT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.SCENE_MARKER_QR_CODES_MSFT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSceneMarkerQRCodesMSFT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSceneMarkerQRCodesMSFT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSceneMarkerQRCodesMSFT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int qrCodeCapacityInput() {
        return segment.get(LAYOUT$qrCodeCapacityInput, OFFSET$qrCodeCapacityInput);
    }

    public XrSceneMarkerQRCodesMSFT qrCodeCapacityInput(@Unsigned int value) {
        segment.set(LAYOUT$qrCodeCapacityInput, OFFSET$qrCodeCapacityInput, value);
        return this;
    }

    public XrSceneMarkerQRCodesMSFT qrCodes(@Nullable IXrSceneMarkerQRCodeMSFT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        qrCodesRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrSceneMarkerQRCodeMSFT.Ptr qrCodes(int assumedCount) {
        MemorySegment s = qrCodesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrSceneMarkerQRCodeMSFT.BYTES);
        return new XrSceneMarkerQRCodeMSFT.Ptr(s);
    }

    public @Nullable XrSceneMarkerQRCodeMSFT qrCodes() {
        MemorySegment s = qrCodesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrSceneMarkerQRCodeMSFT(s);
    }

    public @Pointer(target=XrSceneMarkerQRCodeMSFT.class) @NotNull MemorySegment qrCodesRaw() {
        return segment.get(LAYOUT$qrCodes, OFFSET$qrCodes);
    }

    public void qrCodesRaw(@Pointer(target=XrSceneMarkerQRCodeMSFT.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$qrCodes, OFFSET$qrCodes, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("qrCodeCapacityInput"),
        ValueLayout.ADDRESS.withTargetLayout(XrSceneMarkerQRCodeMSFT.LAYOUT).withName("qrCodes")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$qrCodeCapacityInput = PathElement.groupElement("qrCodeCapacityInput");
    public static final PathElement PATH$qrCodes = PathElement.groupElement("qrCodes");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$qrCodeCapacityInput = (OfInt) LAYOUT.select(PATH$qrCodeCapacityInput);
    public static final AddressLayout LAYOUT$qrCodes = (AddressLayout) LAYOUT.select(PATH$qrCodes);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$qrCodeCapacityInput = LAYOUT$qrCodeCapacityInput.byteSize();
    public static final long SIZE$qrCodes = LAYOUT$qrCodes.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$qrCodeCapacityInput = LAYOUT.byteOffset(PATH$qrCodeCapacityInput);
    public static final long OFFSET$qrCodes = LAYOUT.byteOffset(PATH$qrCodes);
}
