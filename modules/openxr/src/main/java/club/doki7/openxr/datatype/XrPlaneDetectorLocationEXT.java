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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPlaneDetectorLocationEXT.html"><code>XrPlaneDetectorLocationEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrPlaneDetectorLocationEXT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     uint64_t planeId; // optional // @link substring="planeId" target="#planeId"
///     XrSpaceLocationFlags locationFlags; // optional // @link substring="XrSpaceLocationFlags" target="XrSpaceLocationFlags" @link substring="locationFlags" target="#locationFlags"
///     XrPosef pose; // optional // @link substring="XrPosef" target="XrPosef" @link substring="pose" target="#pose"
///     XrExtent2Df extents; // optional // @link substring="XrExtent2Df" target="XrExtent2Df" @link substring="extents" target="#extents"
///     XrPlaneDetectorOrientationEXT orientation; // optional // @link substring="XrPlaneDetectorOrientationEXT" target="XrPlaneDetectorOrientationEXT" @link substring="orientation" target="#orientation"
///     XrPlaneDetectorSemanticTypeEXT semanticType; // optional // @link substring="XrPlaneDetectorSemanticTypeEXT" target="XrPlaneDetectorSemanticTypeEXT" @link substring="semanticType" target="#semanticType"
///     uint32_t polygonBufferCount; // optional // @link substring="polygonBufferCount" target="#polygonBufferCount"
/// } XrPlaneDetectorLocationEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_PLANE_DETECTOR_LOCATION_EXT`
///
/// The {@code allocate} ({@link XrPlaneDetectorLocationEXT#allocate(Arena)}, {@link XrPlaneDetectorLocationEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrPlaneDetectorLocationEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPlaneDetectorLocationEXT.html"><code>XrPlaneDetectorLocationEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrPlaneDetectorLocationEXT(@NotNull MemorySegment segment) implements IXrPlaneDetectorLocationEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPlaneDetectorLocationEXT.html"><code>XrPlaneDetectorLocationEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrPlaneDetectorLocationEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrPlaneDetectorLocationEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrPlaneDetectorLocationEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrPlaneDetectorLocationEXT, Iterable<XrPlaneDetectorLocationEXT> {
        public long size() {
            return segment.byteSize() / XrPlaneDetectorLocationEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrPlaneDetectorLocationEXT at(long index) {
            return new XrPlaneDetectorLocationEXT(segment.asSlice(index * XrPlaneDetectorLocationEXT.BYTES, XrPlaneDetectorLocationEXT.BYTES));
        }

        public XrPlaneDetectorLocationEXT.Ptr at(long index, @NotNull Consumer<@NotNull XrPlaneDetectorLocationEXT> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrPlaneDetectorLocationEXT value) {
            MemorySegment s = segment.asSlice(index * XrPlaneDetectorLocationEXT.BYTES, XrPlaneDetectorLocationEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrPlaneDetectorLocationEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrPlaneDetectorLocationEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrPlaneDetectorLocationEXT.BYTES,
                (end - start) * XrPlaneDetectorLocationEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrPlaneDetectorLocationEXT.BYTES));
        }

        public XrPlaneDetectorLocationEXT[] toArray() {
            XrPlaneDetectorLocationEXT[] ret = new XrPlaneDetectorLocationEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrPlaneDetectorLocationEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrPlaneDetectorLocationEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrPlaneDetectorLocationEXT.BYTES;
            }

            @Override
            public XrPlaneDetectorLocationEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrPlaneDetectorLocationEXT ret = new XrPlaneDetectorLocationEXT(segment.asSlice(0, XrPlaneDetectorLocationEXT.BYTES));
                segment = segment.asSlice(XrPlaneDetectorLocationEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrPlaneDetectorLocationEXT allocate(Arena arena) {
        XrPlaneDetectorLocationEXT ret = new XrPlaneDetectorLocationEXT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.PLANE_DETECTOR_LOCATION_EXT);
        return ret;
    }

    public static XrPlaneDetectorLocationEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrPlaneDetectorLocationEXT.Ptr ret = new XrPlaneDetectorLocationEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.PLANE_DETECTOR_LOCATION_EXT);
        }
        return ret;
    }

    public static XrPlaneDetectorLocationEXT clone(Arena arena, XrPlaneDetectorLocationEXT src) {
        XrPlaneDetectorLocationEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.PLANE_DETECTOR_LOCATION_EXT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrPlaneDetectorLocationEXT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrPlaneDetectorLocationEXT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrPlaneDetectorLocationEXT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned long planeId() {
        return segment.get(LAYOUT$planeId, OFFSET$planeId);
    }

    public XrPlaneDetectorLocationEXT planeId(@Unsigned long value) {
        segment.set(LAYOUT$planeId, OFFSET$planeId, value);
        return this;
    }

    public @Bitmask(XrSpaceLocationFlags.class) long locationFlags() {
        return segment.get(LAYOUT$locationFlags, OFFSET$locationFlags);
    }

    public XrPlaneDetectorLocationEXT locationFlags(@Bitmask(XrSpaceLocationFlags.class) long value) {
        segment.set(LAYOUT$locationFlags, OFFSET$locationFlags, value);
        return this;
    }

    public @NotNull XrPosef pose() {
        return new XrPosef(segment.asSlice(OFFSET$pose, LAYOUT$pose));
    }

    public XrPlaneDetectorLocationEXT pose(@NotNull XrPosef value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$pose, SIZE$pose);
        return this;
    }

    public XrPlaneDetectorLocationEXT pose(Consumer<@NotNull XrPosef> consumer) {
        consumer.accept(pose());
        return this;
    }

    public @NotNull XrExtent2Df extents() {
        return new XrExtent2Df(segment.asSlice(OFFSET$extents, LAYOUT$extents));
    }

    public XrPlaneDetectorLocationEXT extents(@NotNull XrExtent2Df value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$extents, SIZE$extents);
        return this;
    }

    public XrPlaneDetectorLocationEXT extents(Consumer<@NotNull XrExtent2Df> consumer) {
        consumer.accept(extents());
        return this;
    }

    public @EnumType(XrPlaneDetectorOrientationEXT.class) int orientation() {
        return segment.get(LAYOUT$orientation, OFFSET$orientation);
    }

    public XrPlaneDetectorLocationEXT orientation(@EnumType(XrPlaneDetectorOrientationEXT.class) int value) {
        segment.set(LAYOUT$orientation, OFFSET$orientation, value);
        return this;
    }

    public @EnumType(XrPlaneDetectorSemanticTypeEXT.class) int semanticType() {
        return segment.get(LAYOUT$semanticType, OFFSET$semanticType);
    }

    public XrPlaneDetectorLocationEXT semanticType(@EnumType(XrPlaneDetectorSemanticTypeEXT.class) int value) {
        segment.set(LAYOUT$semanticType, OFFSET$semanticType, value);
        return this;
    }

    public @Unsigned int polygonBufferCount() {
        return segment.get(LAYOUT$polygonBufferCount, OFFSET$polygonBufferCount);
    }

    public XrPlaneDetectorLocationEXT polygonBufferCount(@Unsigned int value) {
        segment.set(LAYOUT$polygonBufferCount, OFFSET$polygonBufferCount, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_LONG.withName("planeId"),
        ValueLayout.JAVA_LONG.withName("locationFlags"),
        XrPosef.LAYOUT.withName("pose"),
        XrExtent2Df.LAYOUT.withName("extents"),
        ValueLayout.JAVA_INT.withName("orientation"),
        ValueLayout.JAVA_INT.withName("semanticType"),
        ValueLayout.JAVA_INT.withName("polygonBufferCount")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$planeId = PathElement.groupElement("planeId");
    public static final PathElement PATH$locationFlags = PathElement.groupElement("locationFlags");
    public static final PathElement PATH$pose = PathElement.groupElement("pose");
    public static final PathElement PATH$extents = PathElement.groupElement("extents");
    public static final PathElement PATH$orientation = PathElement.groupElement("orientation");
    public static final PathElement PATH$semanticType = PathElement.groupElement("semanticType");
    public static final PathElement PATH$polygonBufferCount = PathElement.groupElement("polygonBufferCount");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfLong LAYOUT$planeId = (OfLong) LAYOUT.select(PATH$planeId);
    public static final OfLong LAYOUT$locationFlags = (OfLong) LAYOUT.select(PATH$locationFlags);
    public static final StructLayout LAYOUT$pose = (StructLayout) LAYOUT.select(PATH$pose);
    public static final StructLayout LAYOUT$extents = (StructLayout) LAYOUT.select(PATH$extents);
    public static final OfInt LAYOUT$orientation = (OfInt) LAYOUT.select(PATH$orientation);
    public static final OfInt LAYOUT$semanticType = (OfInt) LAYOUT.select(PATH$semanticType);
    public static final OfInt LAYOUT$polygonBufferCount = (OfInt) LAYOUT.select(PATH$polygonBufferCount);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$planeId = LAYOUT$planeId.byteSize();
    public static final long SIZE$locationFlags = LAYOUT$locationFlags.byteSize();
    public static final long SIZE$pose = LAYOUT$pose.byteSize();
    public static final long SIZE$extents = LAYOUT$extents.byteSize();
    public static final long SIZE$orientation = LAYOUT$orientation.byteSize();
    public static final long SIZE$semanticType = LAYOUT$semanticType.byteSize();
    public static final long SIZE$polygonBufferCount = LAYOUT$polygonBufferCount.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$planeId = LAYOUT.byteOffset(PATH$planeId);
    public static final long OFFSET$locationFlags = LAYOUT.byteOffset(PATH$locationFlags);
    public static final long OFFSET$pose = LAYOUT.byteOffset(PATH$pose);
    public static final long OFFSET$extents = LAYOUT.byteOffset(PATH$extents);
    public static final long OFFSET$orientation = LAYOUT.byteOffset(PATH$orientation);
    public static final long OFFSET$semanticType = LAYOUT.byteOffset(PATH$semanticType);
    public static final long OFFSET$polygonBufferCount = LAYOUT.byteOffset(PATH$polygonBufferCount);
}
