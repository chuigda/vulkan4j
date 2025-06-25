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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialAnchorsQueryInfoRadiusML.html"><code>XrSpatialAnchorsQueryInfoRadiusML</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSpatialAnchorsQueryInfoRadiusML {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrSpace baseSpace; // @link substring="XrSpace" target="XrSpace" @link substring="baseSpace" target="#baseSpace"
///     XrVector3f center; // @link substring="XrVector3f" target="XrVector3f" @link substring="center" target="#center"
///     XrTime time; // @link substring="time" target="#time"
///     float radius; // @link substring="radius" target="#radius"
/// } XrSpatialAnchorsQueryInfoRadiusML;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SPATIAL_ANCHORS_QUERY_INFO_RADIUS_ML`
///
/// The {@code allocate} ({@link XrSpatialAnchorsQueryInfoRadiusML#allocate(Arena)}, {@link XrSpatialAnchorsQueryInfoRadiusML#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSpatialAnchorsQueryInfoRadiusML#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialAnchorsQueryInfoRadiusML.html"><code>XrSpatialAnchorsQueryInfoRadiusML</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSpatialAnchorsQueryInfoRadiusML(@NotNull MemorySegment segment) implements IXrSpatialAnchorsQueryInfoRadiusML {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialAnchorsQueryInfoRadiusML.html"><code>XrSpatialAnchorsQueryInfoRadiusML</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSpatialAnchorsQueryInfoRadiusML}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSpatialAnchorsQueryInfoRadiusML to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSpatialAnchorsQueryInfoRadiusML.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSpatialAnchorsQueryInfoRadiusML, Iterable<XrSpatialAnchorsQueryInfoRadiusML> {
        public long size() {
            return segment.byteSize() / XrSpatialAnchorsQueryInfoRadiusML.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSpatialAnchorsQueryInfoRadiusML at(long index) {
            return new XrSpatialAnchorsQueryInfoRadiusML(segment.asSlice(index * XrSpatialAnchorsQueryInfoRadiusML.BYTES, XrSpatialAnchorsQueryInfoRadiusML.BYTES));
        }

        public XrSpatialAnchorsQueryInfoRadiusML.Ptr at(long index, @NotNull Consumer<@NotNull XrSpatialAnchorsQueryInfoRadiusML> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrSpatialAnchorsQueryInfoRadiusML value) {
            MemorySegment s = segment.asSlice(index * XrSpatialAnchorsQueryInfoRadiusML.BYTES, XrSpatialAnchorsQueryInfoRadiusML.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSpatialAnchorsQueryInfoRadiusML.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSpatialAnchorsQueryInfoRadiusML.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSpatialAnchorsQueryInfoRadiusML.BYTES,
                (end - start) * XrSpatialAnchorsQueryInfoRadiusML.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSpatialAnchorsQueryInfoRadiusML.BYTES));
        }

        public XrSpatialAnchorsQueryInfoRadiusML[] toArray() {
            XrSpatialAnchorsQueryInfoRadiusML[] ret = new XrSpatialAnchorsQueryInfoRadiusML[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSpatialAnchorsQueryInfoRadiusML> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSpatialAnchorsQueryInfoRadiusML> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSpatialAnchorsQueryInfoRadiusML.BYTES;
            }

            @Override
            public XrSpatialAnchorsQueryInfoRadiusML next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSpatialAnchorsQueryInfoRadiusML ret = new XrSpatialAnchorsQueryInfoRadiusML(segment.asSlice(0, XrSpatialAnchorsQueryInfoRadiusML.BYTES));
                segment = segment.asSlice(XrSpatialAnchorsQueryInfoRadiusML.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSpatialAnchorsQueryInfoRadiusML allocate(Arena arena) {
        XrSpatialAnchorsQueryInfoRadiusML ret = new XrSpatialAnchorsQueryInfoRadiusML(arena.allocate(LAYOUT));
        ret.type(XrStructureType.SPATIAL_ANCHORS_QUERY_INFO_RADIUS_ML);
        return ret;
    }

    public static XrSpatialAnchorsQueryInfoRadiusML.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSpatialAnchorsQueryInfoRadiusML.Ptr ret = new XrSpatialAnchorsQueryInfoRadiusML.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.SPATIAL_ANCHORS_QUERY_INFO_RADIUS_ML);
        }
        return ret;
    }

    public static XrSpatialAnchorsQueryInfoRadiusML clone(Arena arena, XrSpatialAnchorsQueryInfoRadiusML src) {
        XrSpatialAnchorsQueryInfoRadiusML ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.SPATIAL_ANCHORS_QUERY_INFO_RADIUS_ML);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSpatialAnchorsQueryInfoRadiusML type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSpatialAnchorsQueryInfoRadiusML next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSpatialAnchorsQueryInfoRadiusML next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Nullable XrSpace baseSpace() {
        MemorySegment s = segment.asSlice(OFFSET$baseSpace, SIZE$baseSpace);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrSpace(s);
    }

    public XrSpatialAnchorsQueryInfoRadiusML baseSpace(@Nullable XrSpace value) {
        segment.set(LAYOUT$baseSpace, OFFSET$baseSpace, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @NotNull XrVector3f center() {
        return new XrVector3f(segment.asSlice(OFFSET$center, LAYOUT$center));
    }

    public XrSpatialAnchorsQueryInfoRadiusML center(@NotNull XrVector3f value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$center, SIZE$center);
        return this;
    }

    public XrSpatialAnchorsQueryInfoRadiusML center(Consumer<@NotNull XrVector3f> consumer) {
        consumer.accept(center());
        return this;
    }

    public @NativeType("XrTime") long time() {
        return segment.get(LAYOUT$time, OFFSET$time);
    }

    public XrSpatialAnchorsQueryInfoRadiusML time(@NativeType("XrTime") long value) {
        segment.set(LAYOUT$time, OFFSET$time, value);
        return this;
    }

    public float radius() {
        return segment.get(LAYOUT$radius, OFFSET$radius);
    }

    public XrSpatialAnchorsQueryInfoRadiusML radius(float value) {
        segment.set(LAYOUT$radius, OFFSET$radius, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.ADDRESS.withName("baseSpace"),
        XrVector3f.LAYOUT.withName("center"),
        ValueLayout.JAVA_LONG.withName("time"),
        ValueLayout.JAVA_FLOAT.withName("radius")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$baseSpace = PathElement.groupElement("baseSpace");
    public static final PathElement PATH$center = PathElement.groupElement("center");
    public static final PathElement PATH$time = PathElement.groupElement("time");
    public static final PathElement PATH$radius = PathElement.groupElement("radius");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final AddressLayout LAYOUT$baseSpace = (AddressLayout) LAYOUT.select(PATH$baseSpace);
    public static final StructLayout LAYOUT$center = (StructLayout) LAYOUT.select(PATH$center);
    public static final OfLong LAYOUT$time = (OfLong) LAYOUT.select(PATH$time);
    public static final OfFloat LAYOUT$radius = (OfFloat) LAYOUT.select(PATH$radius);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$baseSpace = LAYOUT$baseSpace.byteSize();
    public static final long SIZE$center = LAYOUT$center.byteSize();
    public static final long SIZE$time = LAYOUT$time.byteSize();
    public static final long SIZE$radius = LAYOUT$radius.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$baseSpace = LAYOUT.byteOffset(PATH$baseSpace);
    public static final long OFFSET$center = LAYOUT.byteOffset(PATH$center);
    public static final long OFFSET$time = LAYOUT.byteOffset(PATH$time);
    public static final long OFFSET$radius = LAYOUT.byteOffset(PATH$radius);
}
