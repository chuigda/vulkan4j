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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPlaneDetectorBeginInfoEXT.html"><code>XrPlaneDetectorBeginInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrPlaneDetectorBeginInfoEXT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrSpace baseSpace; // @link substring="XrSpace" target="XrSpace" @link substring="baseSpace" target="#baseSpace"
///     XrTime time; // @link substring="time" target="#time"
///     uint32_t orientationCount; // optional // @link substring="orientationCount" target="#orientationCount"
///     XrPlaneDetectorOrientationEXT const* orientations; // optional // @link substring="XrPlaneDetectorOrientationEXT" target="XrPlaneDetectorOrientationEXT" @link substring="orientations" target="#orientations"
///     uint32_t semanticTypeCount; // optional // @link substring="semanticTypeCount" target="#semanticTypeCount"
///     XrPlaneDetectorSemanticTypeEXT const* semanticTypes; // optional // @link substring="XrPlaneDetectorSemanticTypeEXT" target="XrPlaneDetectorSemanticTypeEXT" @link substring="semanticTypes" target="#semanticTypes"
///     uint32_t maxPlanes; // @link substring="maxPlanes" target="#maxPlanes"
///     float minArea; // @link substring="minArea" target="#minArea"
///     XrPosef boundingBoxPose; // @link substring="XrPosef" target="XrPosef" @link substring="boundingBoxPose" target="#boundingBoxPose"
///     XrExtent3DfEXT boundingBoxExtent; // @link substring="XrExtent3DfEXT" target="XrExtent3DfEXT" @link substring="boundingBoxExtent" target="#boundingBoxExtent"
/// } XrPlaneDetectorBeginInfoEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_PLANE_DETECTOR_BEGIN_INFO_EXT`
///
/// The {@code allocate} ({@link XrPlaneDetectorBeginInfoEXT#allocate(Arena)}, {@link XrPlaneDetectorBeginInfoEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrPlaneDetectorBeginInfoEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPlaneDetectorBeginInfoEXT.html"><code>XrPlaneDetectorBeginInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrPlaneDetectorBeginInfoEXT(@NotNull MemorySegment segment) implements IXrPlaneDetectorBeginInfoEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPlaneDetectorBeginInfoEXT.html"><code>XrPlaneDetectorBeginInfoEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrPlaneDetectorBeginInfoEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrPlaneDetectorBeginInfoEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrPlaneDetectorBeginInfoEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrPlaneDetectorBeginInfoEXT, Iterable<XrPlaneDetectorBeginInfoEXT> {
        public long size() {
            return segment.byteSize() / XrPlaneDetectorBeginInfoEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrPlaneDetectorBeginInfoEXT at(long index) {
            return new XrPlaneDetectorBeginInfoEXT(segment.asSlice(index * XrPlaneDetectorBeginInfoEXT.BYTES, XrPlaneDetectorBeginInfoEXT.BYTES));
        }

        public void write(long index, @NotNull XrPlaneDetectorBeginInfoEXT value) {
            MemorySegment s = segment.asSlice(index * XrPlaneDetectorBeginInfoEXT.BYTES, XrPlaneDetectorBeginInfoEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrPlaneDetectorBeginInfoEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrPlaneDetectorBeginInfoEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrPlaneDetectorBeginInfoEXT.BYTES,
                (end - start) * XrPlaneDetectorBeginInfoEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrPlaneDetectorBeginInfoEXT.BYTES));
        }

        public XrPlaneDetectorBeginInfoEXT[] toArray() {
            XrPlaneDetectorBeginInfoEXT[] ret = new XrPlaneDetectorBeginInfoEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrPlaneDetectorBeginInfoEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrPlaneDetectorBeginInfoEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrPlaneDetectorBeginInfoEXT.BYTES;
            }

            @Override
            public XrPlaneDetectorBeginInfoEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrPlaneDetectorBeginInfoEXT ret = new XrPlaneDetectorBeginInfoEXT(segment.asSlice(0, XrPlaneDetectorBeginInfoEXT.BYTES));
                segment = segment.asSlice(XrPlaneDetectorBeginInfoEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrPlaneDetectorBeginInfoEXT allocate(Arena arena) {
        XrPlaneDetectorBeginInfoEXT ret = new XrPlaneDetectorBeginInfoEXT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_PLANE_DETECTOR_BEGIN_INFO_EXT);
        return ret;
    }

    public static XrPlaneDetectorBeginInfoEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrPlaneDetectorBeginInfoEXT.Ptr ret = new XrPlaneDetectorBeginInfoEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_PLANE_DETECTOR_BEGIN_INFO_EXT);
        }
        return ret;
    }

    public static XrPlaneDetectorBeginInfoEXT clone(Arena arena, XrPlaneDetectorBeginInfoEXT src) {
        XrPlaneDetectorBeginInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_PLANE_DETECTOR_BEGIN_INFO_EXT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrPlaneDetectorBeginInfoEXT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrPlaneDetectorBeginInfoEXT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrPlaneDetectorBeginInfoEXT next(@Nullable IPointer pointer) {
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

    public XrPlaneDetectorBeginInfoEXT baseSpace(@Nullable XrSpace value) {
        segment.set(LAYOUT$baseSpace, OFFSET$baseSpace, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @NativeType("XrTime") long time() {
        return segment.get(LAYOUT$time, OFFSET$time);
    }

    public XrPlaneDetectorBeginInfoEXT time(@NativeType("XrTime") long value) {
        segment.set(LAYOUT$time, OFFSET$time, value);
        return this;
    }

    public @Unsigned int orientationCount() {
        return segment.get(LAYOUT$orientationCount, OFFSET$orientationCount);
    }

    public XrPlaneDetectorBeginInfoEXT orientationCount(@Unsigned int value) {
        segment.set(LAYOUT$orientationCount, OFFSET$orientationCount, value);
        return this;
    }


    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @EnumType(XrPlaneDetectorOrientationEXT.class) IntPtr orientations() {
        MemorySegment s = orientationsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public XrPlaneDetectorBeginInfoEXT orientations(@Nullable @EnumType(XrPlaneDetectorOrientationEXT.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        orientationsRaw(s);
        return this;
    }

    public @Pointer(target=XrPlaneDetectorOrientationEXT.class) @NotNull MemorySegment orientationsRaw() {
        return segment.get(LAYOUT$orientations, OFFSET$orientations);
    }

    public void orientationsRaw(@Pointer(target=XrPlaneDetectorOrientationEXT.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$orientations, OFFSET$orientations, value);
    }

    public @Unsigned int semanticTypeCount() {
        return segment.get(LAYOUT$semanticTypeCount, OFFSET$semanticTypeCount);
    }

    public XrPlaneDetectorBeginInfoEXT semanticTypeCount(@Unsigned int value) {
        segment.set(LAYOUT$semanticTypeCount, OFFSET$semanticTypeCount, value);
        return this;
    }


    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @EnumType(XrPlaneDetectorSemanticTypeEXT.class) IntPtr semanticTypes() {
        MemorySegment s = semanticTypesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public XrPlaneDetectorBeginInfoEXT semanticTypes(@Nullable @EnumType(XrPlaneDetectorSemanticTypeEXT.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        semanticTypesRaw(s);
        return this;
    }

    public @Pointer(target=XrPlaneDetectorSemanticTypeEXT.class) @NotNull MemorySegment semanticTypesRaw() {
        return segment.get(LAYOUT$semanticTypes, OFFSET$semanticTypes);
    }

    public void semanticTypesRaw(@Pointer(target=XrPlaneDetectorSemanticTypeEXT.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$semanticTypes, OFFSET$semanticTypes, value);
    }

    public @Unsigned int maxPlanes() {
        return segment.get(LAYOUT$maxPlanes, OFFSET$maxPlanes);
    }

    public XrPlaneDetectorBeginInfoEXT maxPlanes(@Unsigned int value) {
        segment.set(LAYOUT$maxPlanes, OFFSET$maxPlanes, value);
        return this;
    }

    public float minArea() {
        return segment.get(LAYOUT$minArea, OFFSET$minArea);
    }

    public XrPlaneDetectorBeginInfoEXT minArea(float value) {
        segment.set(LAYOUT$minArea, OFFSET$minArea, value);
        return this;
    }

    public @NotNull XrPosef boundingBoxPose() {
        return new XrPosef(segment.asSlice(OFFSET$boundingBoxPose, LAYOUT$boundingBoxPose));
    }

    public XrPlaneDetectorBeginInfoEXT boundingBoxPose(@NotNull XrPosef value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$boundingBoxPose, SIZE$boundingBoxPose);
        return this;
    }

    public XrPlaneDetectorBeginInfoEXT boundingBoxPose(Consumer<@NotNull XrPosef> consumer) {
        consumer.accept(boundingBoxPose());
        return this;
    }

    public @NotNull XrExtent3DfEXT boundingBoxExtent() {
        return new XrExtent3DfEXT(segment.asSlice(OFFSET$boundingBoxExtent, LAYOUT$boundingBoxExtent));
    }

    public XrPlaneDetectorBeginInfoEXT boundingBoxExtent(@NotNull XrExtent3DfEXT value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$boundingBoxExtent, SIZE$boundingBoxExtent);
        return this;
    }

    public XrPlaneDetectorBeginInfoEXT boundingBoxExtent(Consumer<@NotNull XrExtent3DfEXT> consumer) {
        consumer.accept(boundingBoxExtent());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.ADDRESS.withName("baseSpace"),
        ValueLayout.JAVA_LONG.withName("time"),
        ValueLayout.JAVA_INT.withName("orientationCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("orientations"),
        ValueLayout.JAVA_INT.withName("semanticTypeCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("semanticTypes"),
        ValueLayout.JAVA_INT.withName("maxPlanes"),
        ValueLayout.JAVA_FLOAT.withName("minArea"),
        XrPosef.LAYOUT.withName("boundingBoxPose"),
        XrExtent3DfEXT.LAYOUT.withName("boundingBoxExtent")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$baseSpace = PathElement.groupElement("baseSpace");
    public static final PathElement PATH$time = PathElement.groupElement("time");
    public static final PathElement PATH$orientationCount = PathElement.groupElement("orientationCount");
    public static final PathElement PATH$orientations = PathElement.groupElement("orientations");
    public static final PathElement PATH$semanticTypeCount = PathElement.groupElement("semanticTypeCount");
    public static final PathElement PATH$semanticTypes = PathElement.groupElement("semanticTypes");
    public static final PathElement PATH$maxPlanes = PathElement.groupElement("maxPlanes");
    public static final PathElement PATH$minArea = PathElement.groupElement("minArea");
    public static final PathElement PATH$boundingBoxPose = PathElement.groupElement("boundingBoxPose");
    public static final PathElement PATH$boundingBoxExtent = PathElement.groupElement("boundingBoxExtent");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final AddressLayout LAYOUT$baseSpace = (AddressLayout) LAYOUT.select(PATH$baseSpace);
    public static final OfLong LAYOUT$time = (OfLong) LAYOUT.select(PATH$time);
    public static final OfInt LAYOUT$orientationCount = (OfInt) LAYOUT.select(PATH$orientationCount);
    public static final AddressLayout LAYOUT$orientations = (AddressLayout) LAYOUT.select(PATH$orientations);
    public static final OfInt LAYOUT$semanticTypeCount = (OfInt) LAYOUT.select(PATH$semanticTypeCount);
    public static final AddressLayout LAYOUT$semanticTypes = (AddressLayout) LAYOUT.select(PATH$semanticTypes);
    public static final OfInt LAYOUT$maxPlanes = (OfInt) LAYOUT.select(PATH$maxPlanes);
    public static final OfFloat LAYOUT$minArea = (OfFloat) LAYOUT.select(PATH$minArea);
    public static final StructLayout LAYOUT$boundingBoxPose = (StructLayout) LAYOUT.select(PATH$boundingBoxPose);
    public static final StructLayout LAYOUT$boundingBoxExtent = (StructLayout) LAYOUT.select(PATH$boundingBoxExtent);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$baseSpace = LAYOUT$baseSpace.byteSize();
    public static final long SIZE$time = LAYOUT$time.byteSize();
    public static final long SIZE$orientationCount = LAYOUT$orientationCount.byteSize();
    public static final long SIZE$orientations = LAYOUT$orientations.byteSize();
    public static final long SIZE$semanticTypeCount = LAYOUT$semanticTypeCount.byteSize();
    public static final long SIZE$semanticTypes = LAYOUT$semanticTypes.byteSize();
    public static final long SIZE$maxPlanes = LAYOUT$maxPlanes.byteSize();
    public static final long SIZE$minArea = LAYOUT$minArea.byteSize();
    public static final long SIZE$boundingBoxPose = LAYOUT$boundingBoxPose.byteSize();
    public static final long SIZE$boundingBoxExtent = LAYOUT$boundingBoxExtent.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$baseSpace = LAYOUT.byteOffset(PATH$baseSpace);
    public static final long OFFSET$time = LAYOUT.byteOffset(PATH$time);
    public static final long OFFSET$orientationCount = LAYOUT.byteOffset(PATH$orientationCount);
    public static final long OFFSET$orientations = LAYOUT.byteOffset(PATH$orientations);
    public static final long OFFSET$semanticTypeCount = LAYOUT.byteOffset(PATH$semanticTypeCount);
    public static final long OFFSET$semanticTypes = LAYOUT.byteOffset(PATH$semanticTypes);
    public static final long OFFSET$maxPlanes = LAYOUT.byteOffset(PATH$maxPlanes);
    public static final long OFFSET$minArea = LAYOUT.byteOffset(PATH$minArea);
    public static final long OFFSET$boundingBoxPose = LAYOUT.byteOffset(PATH$boundingBoxPose);
    public static final long OFFSET$boundingBoxExtent = LAYOUT.byteOffset(PATH$boundingBoxExtent);
}
