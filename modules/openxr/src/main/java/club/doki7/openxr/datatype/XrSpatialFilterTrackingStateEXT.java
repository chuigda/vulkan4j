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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialFilterTrackingStateEXT.html"><code>XrSpatialFilterTrackingStateEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSpatialFilterTrackingStateEXT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrSpatialEntityTrackingStateEXT trackingState; // @link substring="XrSpatialEntityTrackingStateEXT" target="XrSpatialEntityTrackingStateEXT" @link substring="trackingState" target="#trackingState"
/// } XrSpatialFilterTrackingStateEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SPATIAL_FILTER_TRACKING_STATE_EXT`
///
/// The {@code allocate} ({@link XrSpatialFilterTrackingStateEXT#allocate(Arena)}, {@link XrSpatialFilterTrackingStateEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSpatialFilterTrackingStateEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialFilterTrackingStateEXT.html"><code>XrSpatialFilterTrackingStateEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSpatialFilterTrackingStateEXT(@NotNull MemorySegment segment) implements IXrSpatialFilterTrackingStateEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialFilterTrackingStateEXT.html"><code>XrSpatialFilterTrackingStateEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSpatialFilterTrackingStateEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSpatialFilterTrackingStateEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSpatialFilterTrackingStateEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSpatialFilterTrackingStateEXT, Iterable<XrSpatialFilterTrackingStateEXT> {
        public long size() {
            return segment.byteSize() / XrSpatialFilterTrackingStateEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSpatialFilterTrackingStateEXT at(long index) {
            return new XrSpatialFilterTrackingStateEXT(segment.asSlice(index * XrSpatialFilterTrackingStateEXT.BYTES, XrSpatialFilterTrackingStateEXT.BYTES));
        }

        public void write(long index, @NotNull XrSpatialFilterTrackingStateEXT value) {
            MemorySegment s = segment.asSlice(index * XrSpatialFilterTrackingStateEXT.BYTES, XrSpatialFilterTrackingStateEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSpatialFilterTrackingStateEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSpatialFilterTrackingStateEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSpatialFilterTrackingStateEXT.BYTES,
                (end - start) * XrSpatialFilterTrackingStateEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSpatialFilterTrackingStateEXT.BYTES));
        }

        public XrSpatialFilterTrackingStateEXT[] toArray() {
            XrSpatialFilterTrackingStateEXT[] ret = new XrSpatialFilterTrackingStateEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSpatialFilterTrackingStateEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSpatialFilterTrackingStateEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSpatialFilterTrackingStateEXT.BYTES;
            }

            @Override
            public XrSpatialFilterTrackingStateEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSpatialFilterTrackingStateEXT ret = new XrSpatialFilterTrackingStateEXT(segment.asSlice(0, XrSpatialFilterTrackingStateEXT.BYTES));
                segment = segment.asSlice(XrSpatialFilterTrackingStateEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSpatialFilterTrackingStateEXT allocate(Arena arena) {
        XrSpatialFilterTrackingStateEXT ret = new XrSpatialFilterTrackingStateEXT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_SPATIAL_FILTER_TRACKING_STATE_EXT);
        return ret;
    }

    public static XrSpatialFilterTrackingStateEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSpatialFilterTrackingStateEXT.Ptr ret = new XrSpatialFilterTrackingStateEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_SPATIAL_FILTER_TRACKING_STATE_EXT);
        }
        return ret;
    }

    public static XrSpatialFilterTrackingStateEXT clone(Arena arena, XrSpatialFilterTrackingStateEXT src) {
        XrSpatialFilterTrackingStateEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_SPATIAL_FILTER_TRACKING_STATE_EXT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSpatialFilterTrackingStateEXT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSpatialFilterTrackingStateEXT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSpatialFilterTrackingStateEXT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @EnumType(XrSpatialEntityTrackingStateEXT.class) int trackingState() {
        return segment.get(LAYOUT$trackingState, OFFSET$trackingState);
    }

    public XrSpatialFilterTrackingStateEXT trackingState(@EnumType(XrSpatialEntityTrackingStateEXT.class) int value) {
        segment.set(LAYOUT$trackingState, OFFSET$trackingState, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("trackingState")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$trackingState = PathElement.groupElement("trackingState");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$trackingState = (OfInt) LAYOUT.select(PATH$trackingState);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$trackingState = LAYOUT$trackingState.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$trackingState = LAYOUT.byteOffset(PATH$trackingState);
}
