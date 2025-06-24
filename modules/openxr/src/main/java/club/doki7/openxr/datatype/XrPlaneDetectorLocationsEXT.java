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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPlaneDetectorLocationsEXT.html"><code>XrPlaneDetectorLocationsEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrPlaneDetectorLocationsEXT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     uint32_t planeLocationCapacityInput; // optional // @link substring="planeLocationCapacityInput" target="#planeLocationCapacityInput"
///     uint32_t planeLocationCountOutput; // optional // @link substring="planeLocationCountOutput" target="#planeLocationCountOutput"
///     XrPlaneDetectorLocationEXT* planeLocations; // optional // @link substring="XrPlaneDetectorLocationEXT" target="XrPlaneDetectorLocationEXT" @link substring="planeLocations" target="#planeLocations"
/// } XrPlaneDetectorLocationsEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_PLANE_DETECTOR_LOCATIONS_EXT`
///
/// The {@code allocate} ({@link XrPlaneDetectorLocationsEXT#allocate(Arena)}, {@link XrPlaneDetectorLocationsEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrPlaneDetectorLocationsEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPlaneDetectorLocationsEXT.html"><code>XrPlaneDetectorLocationsEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrPlaneDetectorLocationsEXT(@NotNull MemorySegment segment) implements IXrPlaneDetectorLocationsEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPlaneDetectorLocationsEXT.html"><code>XrPlaneDetectorLocationsEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrPlaneDetectorLocationsEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrPlaneDetectorLocationsEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrPlaneDetectorLocationsEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrPlaneDetectorLocationsEXT, Iterable<XrPlaneDetectorLocationsEXT> {
        public long size() {
            return segment.byteSize() / XrPlaneDetectorLocationsEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrPlaneDetectorLocationsEXT at(long index) {
            return new XrPlaneDetectorLocationsEXT(segment.asSlice(index * XrPlaneDetectorLocationsEXT.BYTES, XrPlaneDetectorLocationsEXT.BYTES));
        }

        public void write(long index, @NotNull XrPlaneDetectorLocationsEXT value) {
            MemorySegment s = segment.asSlice(index * XrPlaneDetectorLocationsEXT.BYTES, XrPlaneDetectorLocationsEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrPlaneDetectorLocationsEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrPlaneDetectorLocationsEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrPlaneDetectorLocationsEXT.BYTES,
                (end - start) * XrPlaneDetectorLocationsEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrPlaneDetectorLocationsEXT.BYTES));
        }

        public XrPlaneDetectorLocationsEXT[] toArray() {
            XrPlaneDetectorLocationsEXT[] ret = new XrPlaneDetectorLocationsEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrPlaneDetectorLocationsEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrPlaneDetectorLocationsEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrPlaneDetectorLocationsEXT.BYTES;
            }

            @Override
            public XrPlaneDetectorLocationsEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrPlaneDetectorLocationsEXT ret = new XrPlaneDetectorLocationsEXT(segment.asSlice(0, XrPlaneDetectorLocationsEXT.BYTES));
                segment = segment.asSlice(XrPlaneDetectorLocationsEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrPlaneDetectorLocationsEXT allocate(Arena arena) {
        XrPlaneDetectorLocationsEXT ret = new XrPlaneDetectorLocationsEXT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_PLANE_DETECTOR_LOCATIONS_EXT);
        return ret;
    }

    public static XrPlaneDetectorLocationsEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrPlaneDetectorLocationsEXT.Ptr ret = new XrPlaneDetectorLocationsEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_PLANE_DETECTOR_LOCATIONS_EXT);
        }
        return ret;
    }

    public static XrPlaneDetectorLocationsEXT clone(Arena arena, XrPlaneDetectorLocationsEXT src) {
        XrPlaneDetectorLocationsEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_PLANE_DETECTOR_LOCATIONS_EXT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrPlaneDetectorLocationsEXT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrPlaneDetectorLocationsEXT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrPlaneDetectorLocationsEXT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int planeLocationCapacityInput() {
        return segment.get(LAYOUT$planeLocationCapacityInput, OFFSET$planeLocationCapacityInput);
    }

    public XrPlaneDetectorLocationsEXT planeLocationCapacityInput(@Unsigned int value) {
        segment.set(LAYOUT$planeLocationCapacityInput, OFFSET$planeLocationCapacityInput, value);
        return this;
    }

    public @Unsigned int planeLocationCountOutput() {
        return segment.get(LAYOUT$planeLocationCountOutput, OFFSET$planeLocationCountOutput);
    }

    public XrPlaneDetectorLocationsEXT planeLocationCountOutput(@Unsigned int value) {
        segment.set(LAYOUT$planeLocationCountOutput, OFFSET$planeLocationCountOutput, value);
        return this;
    }

    public XrPlaneDetectorLocationsEXT planeLocations(@Nullable IXrPlaneDetectorLocationEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        planeLocationsRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrPlaneDetectorLocationEXT.Ptr planeLocations(int assumedCount) {
        MemorySegment s = planeLocationsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrPlaneDetectorLocationEXT.BYTES);
        return new XrPlaneDetectorLocationEXT.Ptr(s);
    }

    public @Nullable XrPlaneDetectorLocationEXT planeLocations() {
        MemorySegment s = planeLocationsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrPlaneDetectorLocationEXT(s);
    }

    public @Pointer(target=XrPlaneDetectorLocationEXT.class) @NotNull MemorySegment planeLocationsRaw() {
        return segment.get(LAYOUT$planeLocations, OFFSET$planeLocations);
    }

    public void planeLocationsRaw(@Pointer(target=XrPlaneDetectorLocationEXT.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$planeLocations, OFFSET$planeLocations, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("planeLocationCapacityInput"),
        ValueLayout.JAVA_INT.withName("planeLocationCountOutput"),
        ValueLayout.ADDRESS.withTargetLayout(XrPlaneDetectorLocationEXT.LAYOUT).withName("planeLocations")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$planeLocationCapacityInput = PathElement.groupElement("planeLocationCapacityInput");
    public static final PathElement PATH$planeLocationCountOutput = PathElement.groupElement("planeLocationCountOutput");
    public static final PathElement PATH$planeLocations = PathElement.groupElement("planeLocations");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$planeLocationCapacityInput = (OfInt) LAYOUT.select(PATH$planeLocationCapacityInput);
    public static final OfInt LAYOUT$planeLocationCountOutput = (OfInt) LAYOUT.select(PATH$planeLocationCountOutput);
    public static final AddressLayout LAYOUT$planeLocations = (AddressLayout) LAYOUT.select(PATH$planeLocations);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$planeLocationCapacityInput = LAYOUT$planeLocationCapacityInput.byteSize();
    public static final long SIZE$planeLocationCountOutput = LAYOUT$planeLocationCountOutput.byteSize();
    public static final long SIZE$planeLocations = LAYOUT$planeLocations.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$planeLocationCapacityInput = LAYOUT.byteOffset(PATH$planeLocationCapacityInput);
    public static final long OFFSET$planeLocationCountOutput = LAYOUT.byteOffset(PATH$planeLocationCountOutput);
    public static final long OFFSET$planeLocations = LAYOUT.byteOffset(PATH$planeLocations);
}
