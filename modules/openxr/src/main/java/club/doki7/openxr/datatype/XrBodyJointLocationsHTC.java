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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrBodyJointLocationsHTC.html"><code>XrBodyJointLocationsHTC</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrBodyJointLocationsHTC {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     XrSpaceLocationFlags combinedLocationFlags; // optional // @link substring="XrSpaceLocationFlags" target="XrSpaceLocationFlags" @link substring="combinedLocationFlags" target="#combinedLocationFlags"
///     XrBodyJointConfidenceHTC confidenceLevel; // @link substring="XrBodyJointConfidenceHTC" target="XrBodyJointConfidenceHTC" @link substring="confidenceLevel" target="#confidenceLevel"
///     uint32_t jointLocationCount; // @link substring="jointLocationCount" target="#jointLocationCount"
///     XrBodyJointLocationHTC* jointLocations; // @link substring="XrBodyJointLocationHTC" target="XrBodyJointLocationHTC" @link substring="jointLocations" target="#jointLocations"
///     uint32_t skeletonGenerationId; // @link substring="skeletonGenerationId" target="#skeletonGenerationId"
/// } XrBodyJointLocationsHTC;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_BODY_JOINT_LOCATIONS_HTC`
///
/// The {@code allocate} ({@link XrBodyJointLocationsHTC#allocate(Arena)}, {@link XrBodyJointLocationsHTC#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrBodyJointLocationsHTC#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrBodyJointLocationsHTC.html"><code>XrBodyJointLocationsHTC</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrBodyJointLocationsHTC(@NotNull MemorySegment segment) implements IXrBodyJointLocationsHTC {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrBodyJointLocationsHTC.html"><code>XrBodyJointLocationsHTC</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrBodyJointLocationsHTC}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrBodyJointLocationsHTC to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrBodyJointLocationsHTC.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrBodyJointLocationsHTC, Iterable<XrBodyJointLocationsHTC> {
        public long size() {
            return segment.byteSize() / XrBodyJointLocationsHTC.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrBodyJointLocationsHTC at(long index) {
            return new XrBodyJointLocationsHTC(segment.asSlice(index * XrBodyJointLocationsHTC.BYTES, XrBodyJointLocationsHTC.BYTES));
        }

        public void write(long index, @NotNull XrBodyJointLocationsHTC value) {
            MemorySegment s = segment.asSlice(index * XrBodyJointLocationsHTC.BYTES, XrBodyJointLocationsHTC.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrBodyJointLocationsHTC.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrBodyJointLocationsHTC.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrBodyJointLocationsHTC.BYTES,
                (end - start) * XrBodyJointLocationsHTC.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrBodyJointLocationsHTC.BYTES));
        }

        public XrBodyJointLocationsHTC[] toArray() {
            XrBodyJointLocationsHTC[] ret = new XrBodyJointLocationsHTC[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrBodyJointLocationsHTC> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrBodyJointLocationsHTC> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrBodyJointLocationsHTC.BYTES;
            }

            @Override
            public XrBodyJointLocationsHTC next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrBodyJointLocationsHTC ret = new XrBodyJointLocationsHTC(segment.asSlice(0, XrBodyJointLocationsHTC.BYTES));
                segment = segment.asSlice(XrBodyJointLocationsHTC.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrBodyJointLocationsHTC allocate(Arena arena) {
        XrBodyJointLocationsHTC ret = new XrBodyJointLocationsHTC(arena.allocate(LAYOUT));
        ret.type(XrStructureType.BODY_JOINT_LOCATIONS_HTC);
        return ret;
    }

    public static XrBodyJointLocationsHTC.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrBodyJointLocationsHTC.Ptr ret = new XrBodyJointLocationsHTC.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.BODY_JOINT_LOCATIONS_HTC);
        }
        return ret;
    }

    public static XrBodyJointLocationsHTC clone(Arena arena, XrBodyJointLocationsHTC src) {
        XrBodyJointLocationsHTC ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.BODY_JOINT_LOCATIONS_HTC);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrBodyJointLocationsHTC type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrBodyJointLocationsHTC next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrBodyJointLocationsHTC next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Bitmask(XrSpaceLocationFlags.class) long combinedLocationFlags() {
        return segment.get(LAYOUT$combinedLocationFlags, OFFSET$combinedLocationFlags);
    }

    public XrBodyJointLocationsHTC combinedLocationFlags(@Bitmask(XrSpaceLocationFlags.class) long value) {
        segment.set(LAYOUT$combinedLocationFlags, OFFSET$combinedLocationFlags, value);
        return this;
    }

    public @EnumType(XrBodyJointConfidenceHTC.class) int confidenceLevel() {
        return segment.get(LAYOUT$confidenceLevel, OFFSET$confidenceLevel);
    }

    public XrBodyJointLocationsHTC confidenceLevel(@EnumType(XrBodyJointConfidenceHTC.class) int value) {
        segment.set(LAYOUT$confidenceLevel, OFFSET$confidenceLevel, value);
        return this;
    }

    public @Unsigned int jointLocationCount() {
        return segment.get(LAYOUT$jointLocationCount, OFFSET$jointLocationCount);
    }

    public XrBodyJointLocationsHTC jointLocationCount(@Unsigned int value) {
        segment.set(LAYOUT$jointLocationCount, OFFSET$jointLocationCount, value);
        return this;
    }

    public XrBodyJointLocationsHTC jointLocations(@Nullable IXrBodyJointLocationHTC value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        jointLocationsRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrBodyJointLocationHTC.Ptr jointLocations(int assumedCount) {
        MemorySegment s = jointLocationsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrBodyJointLocationHTC.BYTES);
        return new XrBodyJointLocationHTC.Ptr(s);
    }

    public @Nullable XrBodyJointLocationHTC jointLocations() {
        MemorySegment s = jointLocationsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrBodyJointLocationHTC(s);
    }

    public @Pointer(target=XrBodyJointLocationHTC.class) @NotNull MemorySegment jointLocationsRaw() {
        return segment.get(LAYOUT$jointLocations, OFFSET$jointLocations);
    }

    public void jointLocationsRaw(@Pointer(target=XrBodyJointLocationHTC.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$jointLocations, OFFSET$jointLocations, value);
    }

    public @Unsigned int skeletonGenerationId() {
        return segment.get(LAYOUT$skeletonGenerationId, OFFSET$skeletonGenerationId);
    }

    public XrBodyJointLocationsHTC skeletonGenerationId(@Unsigned int value) {
        segment.set(LAYOUT$skeletonGenerationId, OFFSET$skeletonGenerationId, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_LONG.withName("combinedLocationFlags"),
        ValueLayout.JAVA_INT.withName("confidenceLevel"),
        ValueLayout.JAVA_INT.withName("jointLocationCount"),
        ValueLayout.ADDRESS.withTargetLayout(XrBodyJointLocationHTC.LAYOUT).withName("jointLocations"),
        ValueLayout.JAVA_INT.withName("skeletonGenerationId")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$combinedLocationFlags = PathElement.groupElement("combinedLocationFlags");
    public static final PathElement PATH$confidenceLevel = PathElement.groupElement("confidenceLevel");
    public static final PathElement PATH$jointLocationCount = PathElement.groupElement("jointLocationCount");
    public static final PathElement PATH$jointLocations = PathElement.groupElement("jointLocations");
    public static final PathElement PATH$skeletonGenerationId = PathElement.groupElement("skeletonGenerationId");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfLong LAYOUT$combinedLocationFlags = (OfLong) LAYOUT.select(PATH$combinedLocationFlags);
    public static final OfInt LAYOUT$confidenceLevel = (OfInt) LAYOUT.select(PATH$confidenceLevel);
    public static final OfInt LAYOUT$jointLocationCount = (OfInt) LAYOUT.select(PATH$jointLocationCount);
    public static final AddressLayout LAYOUT$jointLocations = (AddressLayout) LAYOUT.select(PATH$jointLocations);
    public static final OfInt LAYOUT$skeletonGenerationId = (OfInt) LAYOUT.select(PATH$skeletonGenerationId);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$combinedLocationFlags = LAYOUT$combinedLocationFlags.byteSize();
    public static final long SIZE$confidenceLevel = LAYOUT$confidenceLevel.byteSize();
    public static final long SIZE$jointLocationCount = LAYOUT$jointLocationCount.byteSize();
    public static final long SIZE$jointLocations = LAYOUT$jointLocations.byteSize();
    public static final long SIZE$skeletonGenerationId = LAYOUT$skeletonGenerationId.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$combinedLocationFlags = LAYOUT.byteOffset(PATH$combinedLocationFlags);
    public static final long OFFSET$confidenceLevel = LAYOUT.byteOffset(PATH$confidenceLevel);
    public static final long OFFSET$jointLocationCount = LAYOUT.byteOffset(PATH$jointLocationCount);
    public static final long OFFSET$jointLocations = LAYOUT.byteOffset(PATH$jointLocations);
    public static final long OFFSET$skeletonGenerationId = LAYOUT.byteOffset(PATH$skeletonGenerationId);
}
