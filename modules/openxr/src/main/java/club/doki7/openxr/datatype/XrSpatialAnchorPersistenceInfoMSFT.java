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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialAnchorPersistenceInfoMSFT.html"><code>XrSpatialAnchorPersistenceInfoMSFT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSpatialAnchorPersistenceInfoMSFT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrSpatialAnchorPersistenceNameMSFT spatialAnchorPersistenceName; // @link substring="XrSpatialAnchorPersistenceNameMSFT" target="XrSpatialAnchorPersistenceNameMSFT" @link substring="spatialAnchorPersistenceName" target="#spatialAnchorPersistenceName"
///     XrSpatialAnchorMSFT spatialAnchor; // @link substring="XrSpatialAnchorMSFT" target="XrSpatialAnchorMSFT" @link substring="spatialAnchor" target="#spatialAnchor"
/// } XrSpatialAnchorPersistenceInfoMSFT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SPATIAL_ANCHOR_PERSISTENCE_INFO_MSFT`
///
/// The {@code allocate} ({@link XrSpatialAnchorPersistenceInfoMSFT#allocate(Arena)}, {@link XrSpatialAnchorPersistenceInfoMSFT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSpatialAnchorPersistenceInfoMSFT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialAnchorPersistenceInfoMSFT.html"><code>XrSpatialAnchorPersistenceInfoMSFT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSpatialAnchorPersistenceInfoMSFT(@NotNull MemorySegment segment) implements IXrSpatialAnchorPersistenceInfoMSFT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialAnchorPersistenceInfoMSFT.html"><code>XrSpatialAnchorPersistenceInfoMSFT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSpatialAnchorPersistenceInfoMSFT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSpatialAnchorPersistenceInfoMSFT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSpatialAnchorPersistenceInfoMSFT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSpatialAnchorPersistenceInfoMSFT, Iterable<XrSpatialAnchorPersistenceInfoMSFT> {
        public long size() {
            return segment.byteSize() / XrSpatialAnchorPersistenceInfoMSFT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSpatialAnchorPersistenceInfoMSFT at(long index) {
            return new XrSpatialAnchorPersistenceInfoMSFT(segment.asSlice(index * XrSpatialAnchorPersistenceInfoMSFT.BYTES, XrSpatialAnchorPersistenceInfoMSFT.BYTES));
        }

        public XrSpatialAnchorPersistenceInfoMSFT.Ptr at(long index, @NotNull Consumer<@NotNull XrSpatialAnchorPersistenceInfoMSFT> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrSpatialAnchorPersistenceInfoMSFT value) {
            MemorySegment s = segment.asSlice(index * XrSpatialAnchorPersistenceInfoMSFT.BYTES, XrSpatialAnchorPersistenceInfoMSFT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSpatialAnchorPersistenceInfoMSFT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSpatialAnchorPersistenceInfoMSFT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSpatialAnchorPersistenceInfoMSFT.BYTES,
                (end - start) * XrSpatialAnchorPersistenceInfoMSFT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSpatialAnchorPersistenceInfoMSFT.BYTES));
        }

        public XrSpatialAnchorPersistenceInfoMSFT[] toArray() {
            XrSpatialAnchorPersistenceInfoMSFT[] ret = new XrSpatialAnchorPersistenceInfoMSFT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSpatialAnchorPersistenceInfoMSFT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSpatialAnchorPersistenceInfoMSFT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSpatialAnchorPersistenceInfoMSFT.BYTES;
            }

            @Override
            public XrSpatialAnchorPersistenceInfoMSFT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSpatialAnchorPersistenceInfoMSFT ret = new XrSpatialAnchorPersistenceInfoMSFT(segment.asSlice(0, XrSpatialAnchorPersistenceInfoMSFT.BYTES));
                segment = segment.asSlice(XrSpatialAnchorPersistenceInfoMSFT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSpatialAnchorPersistenceInfoMSFT allocate(Arena arena) {
        XrSpatialAnchorPersistenceInfoMSFT ret = new XrSpatialAnchorPersistenceInfoMSFT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.SPATIAL_ANCHOR_PERSISTENCE_INFO_MSFT);
        return ret;
    }

    public static XrSpatialAnchorPersistenceInfoMSFT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSpatialAnchorPersistenceInfoMSFT.Ptr ret = new XrSpatialAnchorPersistenceInfoMSFT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.SPATIAL_ANCHOR_PERSISTENCE_INFO_MSFT);
        }
        return ret;
    }

    public static XrSpatialAnchorPersistenceInfoMSFT clone(Arena arena, XrSpatialAnchorPersistenceInfoMSFT src) {
        XrSpatialAnchorPersistenceInfoMSFT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.SPATIAL_ANCHOR_PERSISTENCE_INFO_MSFT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSpatialAnchorPersistenceInfoMSFT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSpatialAnchorPersistenceInfoMSFT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSpatialAnchorPersistenceInfoMSFT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @NotNull XrSpatialAnchorPersistenceNameMSFT spatialAnchorPersistenceName() {
        return new XrSpatialAnchorPersistenceNameMSFT(segment.asSlice(OFFSET$spatialAnchorPersistenceName, LAYOUT$spatialAnchorPersistenceName));
    }

    public XrSpatialAnchorPersistenceInfoMSFT spatialAnchorPersistenceName(@NotNull XrSpatialAnchorPersistenceNameMSFT value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$spatialAnchorPersistenceName, SIZE$spatialAnchorPersistenceName);
        return this;
    }

    public XrSpatialAnchorPersistenceInfoMSFT spatialAnchorPersistenceName(Consumer<@NotNull XrSpatialAnchorPersistenceNameMSFT> consumer) {
        consumer.accept(spatialAnchorPersistenceName());
        return this;
    }

    public @Nullable XrSpatialAnchorMSFT spatialAnchor() {
        MemorySegment s = segment.asSlice(OFFSET$spatialAnchor, SIZE$spatialAnchor);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrSpatialAnchorMSFT(s);
    }

    public XrSpatialAnchorPersistenceInfoMSFT spatialAnchor(@Nullable XrSpatialAnchorMSFT value) {
        segment.set(LAYOUT$spatialAnchor, OFFSET$spatialAnchor, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        XrSpatialAnchorPersistenceNameMSFT.LAYOUT.withName("spatialAnchorPersistenceName"),
        ValueLayout.ADDRESS.withName("spatialAnchor")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$spatialAnchorPersistenceName = PathElement.groupElement("spatialAnchorPersistenceName");
    public static final PathElement PATH$spatialAnchor = PathElement.groupElement("spatialAnchor");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final StructLayout LAYOUT$spatialAnchorPersistenceName = (StructLayout) LAYOUT.select(PATH$spatialAnchorPersistenceName);
    public static final AddressLayout LAYOUT$spatialAnchor = (AddressLayout) LAYOUT.select(PATH$spatialAnchor);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$spatialAnchorPersistenceName = LAYOUT$spatialAnchorPersistenceName.byteSize();
    public static final long SIZE$spatialAnchor = LAYOUT$spatialAnchor.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$spatialAnchorPersistenceName = LAYOUT.byteOffset(PATH$spatialAnchorPersistenceName);
    public static final long OFFSET$spatialAnchor = LAYOUT.byteOffset(PATH$spatialAnchor);
}
