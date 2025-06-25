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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrBodyJointLocationsFB.html"><code>XrBodyJointLocationsFB</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrBodyJointLocationsFB {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     XrBool32 isActive; // @link substring="isActive" target="#isActive"
///     float confidence; // @link substring="confidence" target="#confidence"
///     uint32_t jointCount; // @link substring="jointCount" target="#jointCount"
///     XrBodyJointLocationFB* jointLocations; // @link substring="XrBodyJointLocationFB" target="XrBodyJointLocationFB" @link substring="jointLocations" target="#jointLocations"
///     uint32_t skeletonChangedCount; // @link substring="skeletonChangedCount" target="#skeletonChangedCount"
///     XrTime time; // @link substring="time" target="#time"
/// } XrBodyJointLocationsFB;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_BODY_JOINT_LOCATIONS_FB`
///
/// The {@code allocate} ({@link XrBodyJointLocationsFB#allocate(Arena)}, {@link XrBodyJointLocationsFB#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrBodyJointLocationsFB#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrBodyJointLocationsFB.html"><code>XrBodyJointLocationsFB</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrBodyJointLocationsFB(@NotNull MemorySegment segment) implements IXrBodyJointLocationsFB {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrBodyJointLocationsFB.html"><code>XrBodyJointLocationsFB</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrBodyJointLocationsFB}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrBodyJointLocationsFB to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrBodyJointLocationsFB.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrBodyJointLocationsFB, Iterable<XrBodyJointLocationsFB> {
        public long size() {
            return segment.byteSize() / XrBodyJointLocationsFB.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrBodyJointLocationsFB at(long index) {
            return new XrBodyJointLocationsFB(segment.asSlice(index * XrBodyJointLocationsFB.BYTES, XrBodyJointLocationsFB.BYTES));
        }

        public XrBodyJointLocationsFB.Ptr at(long index, @NotNull Consumer<@NotNull XrBodyJointLocationsFB> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrBodyJointLocationsFB value) {
            MemorySegment s = segment.asSlice(index * XrBodyJointLocationsFB.BYTES, XrBodyJointLocationsFB.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrBodyJointLocationsFB.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrBodyJointLocationsFB.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrBodyJointLocationsFB.BYTES,
                (end - start) * XrBodyJointLocationsFB.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrBodyJointLocationsFB.BYTES));
        }

        public XrBodyJointLocationsFB[] toArray() {
            XrBodyJointLocationsFB[] ret = new XrBodyJointLocationsFB[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrBodyJointLocationsFB> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrBodyJointLocationsFB> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrBodyJointLocationsFB.BYTES;
            }

            @Override
            public XrBodyJointLocationsFB next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrBodyJointLocationsFB ret = new XrBodyJointLocationsFB(segment.asSlice(0, XrBodyJointLocationsFB.BYTES));
                segment = segment.asSlice(XrBodyJointLocationsFB.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrBodyJointLocationsFB allocate(Arena arena) {
        XrBodyJointLocationsFB ret = new XrBodyJointLocationsFB(arena.allocate(LAYOUT));
        ret.type(XrStructureType.BODY_JOINT_LOCATIONS_FB);
        return ret;
    }

    public static XrBodyJointLocationsFB.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrBodyJointLocationsFB.Ptr ret = new XrBodyJointLocationsFB.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.BODY_JOINT_LOCATIONS_FB);
        }
        return ret;
    }

    public static XrBodyJointLocationsFB clone(Arena arena, XrBodyJointLocationsFB src) {
        XrBodyJointLocationsFB ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.BODY_JOINT_LOCATIONS_FB);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrBodyJointLocationsFB type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrBodyJointLocationsFB next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrBodyJointLocationsFB next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @NativeType("XrBool32") @Unsigned int isActive() {
        return segment.get(LAYOUT$isActive, OFFSET$isActive);
    }

    public XrBodyJointLocationsFB isActive(@NativeType("XrBool32") @Unsigned int value) {
        segment.set(LAYOUT$isActive, OFFSET$isActive, value);
        return this;
    }

    public float confidence() {
        return segment.get(LAYOUT$confidence, OFFSET$confidence);
    }

    public XrBodyJointLocationsFB confidence(float value) {
        segment.set(LAYOUT$confidence, OFFSET$confidence, value);
        return this;
    }

    public @Unsigned int jointCount() {
        return segment.get(LAYOUT$jointCount, OFFSET$jointCount);
    }

    public XrBodyJointLocationsFB jointCount(@Unsigned int value) {
        segment.set(LAYOUT$jointCount, OFFSET$jointCount, value);
        return this;
    }

    public XrBodyJointLocationsFB jointLocations(@Nullable IXrBodyJointLocationFB value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        jointLocationsRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrBodyJointLocationFB.Ptr jointLocations(int assumedCount) {
        MemorySegment s = jointLocationsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrBodyJointLocationFB.BYTES);
        return new XrBodyJointLocationFB.Ptr(s);
    }

    public @Nullable XrBodyJointLocationFB jointLocations() {
        MemorySegment s = jointLocationsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrBodyJointLocationFB(s);
    }

    public @Pointer(target=XrBodyJointLocationFB.class) @NotNull MemorySegment jointLocationsRaw() {
        return segment.get(LAYOUT$jointLocations, OFFSET$jointLocations);
    }

    public void jointLocationsRaw(@Pointer(target=XrBodyJointLocationFB.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$jointLocations, OFFSET$jointLocations, value);
    }

    public @Unsigned int skeletonChangedCount() {
        return segment.get(LAYOUT$skeletonChangedCount, OFFSET$skeletonChangedCount);
    }

    public XrBodyJointLocationsFB skeletonChangedCount(@Unsigned int value) {
        segment.set(LAYOUT$skeletonChangedCount, OFFSET$skeletonChangedCount, value);
        return this;
    }

    public @NativeType("XrTime") long time() {
        return segment.get(LAYOUT$time, OFFSET$time);
    }

    public XrBodyJointLocationsFB time(@NativeType("XrTime") long value) {
        segment.set(LAYOUT$time, OFFSET$time, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("isActive"),
        ValueLayout.JAVA_FLOAT.withName("confidence"),
        ValueLayout.JAVA_INT.withName("jointCount"),
        ValueLayout.ADDRESS.withTargetLayout(XrBodyJointLocationFB.LAYOUT).withName("jointLocations"),
        ValueLayout.JAVA_INT.withName("skeletonChangedCount"),
        ValueLayout.JAVA_LONG.withName("time")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$isActive = PathElement.groupElement("isActive");
    public static final PathElement PATH$confidence = PathElement.groupElement("confidence");
    public static final PathElement PATH$jointCount = PathElement.groupElement("jointCount");
    public static final PathElement PATH$jointLocations = PathElement.groupElement("jointLocations");
    public static final PathElement PATH$skeletonChangedCount = PathElement.groupElement("skeletonChangedCount");
    public static final PathElement PATH$time = PathElement.groupElement("time");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$isActive = (OfInt) LAYOUT.select(PATH$isActive);
    public static final OfFloat LAYOUT$confidence = (OfFloat) LAYOUT.select(PATH$confidence);
    public static final OfInt LAYOUT$jointCount = (OfInt) LAYOUT.select(PATH$jointCount);
    public static final AddressLayout LAYOUT$jointLocations = (AddressLayout) LAYOUT.select(PATH$jointLocations);
    public static final OfInt LAYOUT$skeletonChangedCount = (OfInt) LAYOUT.select(PATH$skeletonChangedCount);
    public static final OfLong LAYOUT$time = (OfLong) LAYOUT.select(PATH$time);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$isActive = LAYOUT$isActive.byteSize();
    public static final long SIZE$confidence = LAYOUT$confidence.byteSize();
    public static final long SIZE$jointCount = LAYOUT$jointCount.byteSize();
    public static final long SIZE$jointLocations = LAYOUT$jointLocations.byteSize();
    public static final long SIZE$skeletonChangedCount = LAYOUT$skeletonChangedCount.byteSize();
    public static final long SIZE$time = LAYOUT$time.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$isActive = LAYOUT.byteOffset(PATH$isActive);
    public static final long OFFSET$confidence = LAYOUT.byteOffset(PATH$confidence);
    public static final long OFFSET$jointCount = LAYOUT.byteOffset(PATH$jointCount);
    public static final long OFFSET$jointLocations = LAYOUT.byteOffset(PATH$jointLocations);
    public static final long OFFSET$skeletonChangedCount = LAYOUT.byteOffset(PATH$skeletonChangedCount);
    public static final long OFFSET$time = LAYOUT.byteOffset(PATH$time);
}
