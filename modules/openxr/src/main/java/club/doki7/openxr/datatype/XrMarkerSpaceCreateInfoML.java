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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrMarkerSpaceCreateInfoML.html"><code>XrMarkerSpaceCreateInfoML</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrMarkerSpaceCreateInfoML {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrMarkerDetectorML markerDetector; // @link substring="XrMarkerDetectorML" target="XrMarkerDetectorML" @link substring="markerDetector" target="#markerDetector"
///     XrMarkerML marker; // @link substring="marker" target="#marker"
///     XrPosef poseInMarkerSpace; // @link substring="XrPosef" target="XrPosef" @link substring="poseInMarkerSpace" target="#poseInMarkerSpace"
/// } XrMarkerSpaceCreateInfoML;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_MARKER_SPACE_CREATE_INFO_ML`
///
/// The {@code allocate} ({@link XrMarkerSpaceCreateInfoML#allocate(Arena)}, {@link XrMarkerSpaceCreateInfoML#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrMarkerSpaceCreateInfoML#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrMarkerSpaceCreateInfoML.html"><code>XrMarkerSpaceCreateInfoML</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrMarkerSpaceCreateInfoML(@NotNull MemorySegment segment) implements IXrMarkerSpaceCreateInfoML {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrMarkerSpaceCreateInfoML.html"><code>XrMarkerSpaceCreateInfoML</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrMarkerSpaceCreateInfoML}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrMarkerSpaceCreateInfoML to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrMarkerSpaceCreateInfoML.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrMarkerSpaceCreateInfoML, Iterable<XrMarkerSpaceCreateInfoML> {
        public long size() {
            return segment.byteSize() / XrMarkerSpaceCreateInfoML.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrMarkerSpaceCreateInfoML at(long index) {
            return new XrMarkerSpaceCreateInfoML(segment.asSlice(index * XrMarkerSpaceCreateInfoML.BYTES, XrMarkerSpaceCreateInfoML.BYTES));
        }

        public void write(long index, @NotNull XrMarkerSpaceCreateInfoML value) {
            MemorySegment s = segment.asSlice(index * XrMarkerSpaceCreateInfoML.BYTES, XrMarkerSpaceCreateInfoML.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrMarkerSpaceCreateInfoML.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrMarkerSpaceCreateInfoML.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrMarkerSpaceCreateInfoML.BYTES,
                (end - start) * XrMarkerSpaceCreateInfoML.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrMarkerSpaceCreateInfoML.BYTES));
        }

        public XrMarkerSpaceCreateInfoML[] toArray() {
            XrMarkerSpaceCreateInfoML[] ret = new XrMarkerSpaceCreateInfoML[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrMarkerSpaceCreateInfoML> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrMarkerSpaceCreateInfoML> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrMarkerSpaceCreateInfoML.BYTES;
            }

            @Override
            public XrMarkerSpaceCreateInfoML next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrMarkerSpaceCreateInfoML ret = new XrMarkerSpaceCreateInfoML(segment.asSlice(0, XrMarkerSpaceCreateInfoML.BYTES));
                segment = segment.asSlice(XrMarkerSpaceCreateInfoML.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrMarkerSpaceCreateInfoML allocate(Arena arena) {
        XrMarkerSpaceCreateInfoML ret = new XrMarkerSpaceCreateInfoML(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_MARKER_SPACE_CREATE_INFO_ML);
        return ret;
    }

    public static XrMarkerSpaceCreateInfoML.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrMarkerSpaceCreateInfoML.Ptr ret = new XrMarkerSpaceCreateInfoML.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_MARKER_SPACE_CREATE_INFO_ML);
        }
        return ret;
    }

    public static XrMarkerSpaceCreateInfoML clone(Arena arena, XrMarkerSpaceCreateInfoML src) {
        XrMarkerSpaceCreateInfoML ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_MARKER_SPACE_CREATE_INFO_ML);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrMarkerSpaceCreateInfoML type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrMarkerSpaceCreateInfoML next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrMarkerSpaceCreateInfoML next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Nullable XrMarkerDetectorML markerDetector() {
        MemorySegment s = segment.asSlice(OFFSET$markerDetector, SIZE$markerDetector);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrMarkerDetectorML(s);
    }

    public XrMarkerSpaceCreateInfoML markerDetector(@Nullable XrMarkerDetectorML value) {
        segment.set(LAYOUT$markerDetector, OFFSET$markerDetector, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @NativeType("XrMarkerML") @Unsigned long marker() {
        return segment.get(LAYOUT$marker, OFFSET$marker);
    }

    public XrMarkerSpaceCreateInfoML marker(@NativeType("XrMarkerML") @Unsigned long value) {
        segment.set(LAYOUT$marker, OFFSET$marker, value);
        return this;
    }

    public @NotNull XrPosef poseInMarkerSpace() {
        return new XrPosef(segment.asSlice(OFFSET$poseInMarkerSpace, LAYOUT$poseInMarkerSpace));
    }

    public XrMarkerSpaceCreateInfoML poseInMarkerSpace(@NotNull XrPosef value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$poseInMarkerSpace, SIZE$poseInMarkerSpace);
        return this;
    }

    public XrMarkerSpaceCreateInfoML poseInMarkerSpace(Consumer<@NotNull XrPosef> consumer) {
        consumer.accept(poseInMarkerSpace());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.ADDRESS.withName("markerDetector"),
        ValueLayout.JAVA_LONG.withName("marker"),
        XrPosef.LAYOUT.withName("poseInMarkerSpace")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$markerDetector = PathElement.groupElement("markerDetector");
    public static final PathElement PATH$marker = PathElement.groupElement("marker");
    public static final PathElement PATH$poseInMarkerSpace = PathElement.groupElement("poseInMarkerSpace");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final AddressLayout LAYOUT$markerDetector = (AddressLayout) LAYOUT.select(PATH$markerDetector);
    public static final OfLong LAYOUT$marker = (OfLong) LAYOUT.select(PATH$marker);
    public static final StructLayout LAYOUT$poseInMarkerSpace = (StructLayout) LAYOUT.select(PATH$poseInMarkerSpace);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$markerDetector = LAYOUT$markerDetector.byteSize();
    public static final long SIZE$marker = LAYOUT$marker.byteSize();
    public static final long SIZE$poseInMarkerSpace = LAYOUT$poseInMarkerSpace.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$markerDetector = LAYOUT.byteOffset(PATH$markerDetector);
    public static final long OFFSET$marker = LAYOUT.byteOffset(PATH$marker);
    public static final long OFFSET$poseInMarkerSpace = LAYOUT.byteOffset(PATH$poseInMarkerSpace);
}
