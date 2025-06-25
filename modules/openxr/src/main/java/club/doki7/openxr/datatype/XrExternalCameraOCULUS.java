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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrExternalCameraOCULUS.html"><code>XrExternalCameraOCULUS</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrExternalCameraOCULUS {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     char[XR_MAX_EXTERNAL_CAMERA_NAME_SIZE_OCULUS] name; // @link substring="name" target="#name"
///     XrExternalCameraIntrinsicsOCULUS intrinsics; // @link substring="XrExternalCameraIntrinsicsOCULUS" target="XrExternalCameraIntrinsicsOCULUS" @link substring="intrinsics" target="#intrinsics"
///     XrExternalCameraExtrinsicsOCULUS extrinsics; // @link substring="XrExternalCameraExtrinsicsOCULUS" target="XrExternalCameraExtrinsicsOCULUS" @link substring="extrinsics" target="#extrinsics"
/// } XrExternalCameraOCULUS;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_EXTERNAL_CAMERA_OCULUS`
///
/// The {@code allocate} ({@link XrExternalCameraOCULUS#allocate(Arena)}, {@link XrExternalCameraOCULUS#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrExternalCameraOCULUS#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrExternalCameraOCULUS.html"><code>XrExternalCameraOCULUS</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrExternalCameraOCULUS(@NotNull MemorySegment segment) implements IXrExternalCameraOCULUS {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrExternalCameraOCULUS.html"><code>XrExternalCameraOCULUS</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrExternalCameraOCULUS}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrExternalCameraOCULUS to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrExternalCameraOCULUS.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrExternalCameraOCULUS, Iterable<XrExternalCameraOCULUS> {
        public long size() {
            return segment.byteSize() / XrExternalCameraOCULUS.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrExternalCameraOCULUS at(long index) {
            return new XrExternalCameraOCULUS(segment.asSlice(index * XrExternalCameraOCULUS.BYTES, XrExternalCameraOCULUS.BYTES));
        }

        public XrExternalCameraOCULUS.Ptr at(long index, @NotNull Consumer<@NotNull XrExternalCameraOCULUS> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrExternalCameraOCULUS value) {
            MemorySegment s = segment.asSlice(index * XrExternalCameraOCULUS.BYTES, XrExternalCameraOCULUS.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrExternalCameraOCULUS.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrExternalCameraOCULUS.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrExternalCameraOCULUS.BYTES,
                (end - start) * XrExternalCameraOCULUS.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrExternalCameraOCULUS.BYTES));
        }

        public XrExternalCameraOCULUS[] toArray() {
            XrExternalCameraOCULUS[] ret = new XrExternalCameraOCULUS[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrExternalCameraOCULUS> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrExternalCameraOCULUS> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrExternalCameraOCULUS.BYTES;
            }

            @Override
            public XrExternalCameraOCULUS next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrExternalCameraOCULUS ret = new XrExternalCameraOCULUS(segment.asSlice(0, XrExternalCameraOCULUS.BYTES));
                segment = segment.asSlice(XrExternalCameraOCULUS.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrExternalCameraOCULUS allocate(Arena arena) {
        XrExternalCameraOCULUS ret = new XrExternalCameraOCULUS(arena.allocate(LAYOUT));
        ret.type(XrStructureType.EXTERNAL_CAMERA_OCULUS);
        return ret;
    }

    public static XrExternalCameraOCULUS.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrExternalCameraOCULUS.Ptr ret = new XrExternalCameraOCULUS.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.EXTERNAL_CAMERA_OCULUS);
        }
        return ret;
    }

    public static XrExternalCameraOCULUS clone(Arena arena, XrExternalCameraOCULUS src) {
        XrExternalCameraOCULUS ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.EXTERNAL_CAMERA_OCULUS);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrExternalCameraOCULUS type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrExternalCameraOCULUS next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrExternalCameraOCULUS next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public BytePtr name() {
        return new BytePtr(nameRaw());
    }

    public XrExternalCameraOCULUS name(@NotNull Consumer<BytePtr> consumer) {
        BytePtr ptr = name();
        consumer.accept(ptr);
        return this;
    }

    public XrExternalCameraOCULUS name(BytePtr value) {
        MemorySegment s = nameRaw();
        s.copyFrom(value.segment());
        return this;
    }

    public @NotNull MemorySegment nameRaw() {
        return segment.asSlice(OFFSET$name, SIZE$name);
    }

    public @NotNull XrExternalCameraIntrinsicsOCULUS intrinsics() {
        return new XrExternalCameraIntrinsicsOCULUS(segment.asSlice(OFFSET$intrinsics, LAYOUT$intrinsics));
    }

    public XrExternalCameraOCULUS intrinsics(@NotNull XrExternalCameraIntrinsicsOCULUS value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$intrinsics, SIZE$intrinsics);
        return this;
    }

    public XrExternalCameraOCULUS intrinsics(Consumer<@NotNull XrExternalCameraIntrinsicsOCULUS> consumer) {
        consumer.accept(intrinsics());
        return this;
    }

    public @NotNull XrExternalCameraExtrinsicsOCULUS extrinsics() {
        return new XrExternalCameraExtrinsicsOCULUS(segment.asSlice(OFFSET$extrinsics, LAYOUT$extrinsics));
    }

    public XrExternalCameraOCULUS extrinsics(@NotNull XrExternalCameraExtrinsicsOCULUS value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$extrinsics, SIZE$extrinsics);
        return this;
    }

    public XrExternalCameraOCULUS extrinsics(Consumer<@NotNull XrExternalCameraExtrinsicsOCULUS> consumer) {
        consumer.accept(extrinsics());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        MemoryLayout.sequenceLayout(MAX_EXTERNAL_CAMERA_NAME_SIZE_OCULUS, ValueLayout.JAVA_BYTE).withName("name"),
        XrExternalCameraIntrinsicsOCULUS.LAYOUT.withName("intrinsics"),
        XrExternalCameraExtrinsicsOCULUS.LAYOUT.withName("extrinsics")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$name = PathElement.groupElement("name");
    public static final PathElement PATH$intrinsics = PathElement.groupElement("intrinsics");
    public static final PathElement PATH$extrinsics = PathElement.groupElement("extrinsics");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final SequenceLayout LAYOUT$name = (SequenceLayout) LAYOUT.select(PATH$name);
    public static final StructLayout LAYOUT$intrinsics = (StructLayout) LAYOUT.select(PATH$intrinsics);
    public static final StructLayout LAYOUT$extrinsics = (StructLayout) LAYOUT.select(PATH$extrinsics);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$name = LAYOUT$name.byteSize();
    public static final long SIZE$intrinsics = LAYOUT$intrinsics.byteSize();
    public static final long SIZE$extrinsics = LAYOUT$extrinsics.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$name = LAYOUT.byteOffset(PATH$name);
    public static final long OFFSET$intrinsics = LAYOUT.byteOffset(PATH$intrinsics);
    public static final long OFFSET$extrinsics = LAYOUT.byteOffset(PATH$extrinsics);
}
