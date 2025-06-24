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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFacialExpressionsHTC.html"><code>XrFacialExpressionsHTC</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrFacialExpressionsHTC {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrBool32 isActive; // @link substring="isActive" target="#isActive"
///     XrTime sampleTime; // @link substring="sampleTime" target="#sampleTime"
///     uint32_t expressionCount; // @link substring="expressionCount" target="#expressionCount"
///     float* expressionWeightings; // @link substring="expressionWeightings" target="#expressionWeightings"
/// } XrFacialExpressionsHTC;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_FACIAL_EXPRESSIONS_HTC`
///
/// The {@code allocate} ({@link XrFacialExpressionsHTC#allocate(Arena)}, {@link XrFacialExpressionsHTC#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrFacialExpressionsHTC#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFacialExpressionsHTC.html"><code>XrFacialExpressionsHTC</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrFacialExpressionsHTC(@NotNull MemorySegment segment) implements IXrFacialExpressionsHTC {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFacialExpressionsHTC.html"><code>XrFacialExpressionsHTC</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrFacialExpressionsHTC}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrFacialExpressionsHTC to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrFacialExpressionsHTC.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrFacialExpressionsHTC, Iterable<XrFacialExpressionsHTC> {
        public long size() {
            return segment.byteSize() / XrFacialExpressionsHTC.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrFacialExpressionsHTC at(long index) {
            return new XrFacialExpressionsHTC(segment.asSlice(index * XrFacialExpressionsHTC.BYTES, XrFacialExpressionsHTC.BYTES));
        }

        public void write(long index, @NotNull XrFacialExpressionsHTC value) {
            MemorySegment s = segment.asSlice(index * XrFacialExpressionsHTC.BYTES, XrFacialExpressionsHTC.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrFacialExpressionsHTC.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrFacialExpressionsHTC.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrFacialExpressionsHTC.BYTES,
                (end - start) * XrFacialExpressionsHTC.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrFacialExpressionsHTC.BYTES));
        }

        public XrFacialExpressionsHTC[] toArray() {
            XrFacialExpressionsHTC[] ret = new XrFacialExpressionsHTC[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrFacialExpressionsHTC> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrFacialExpressionsHTC> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrFacialExpressionsHTC.BYTES;
            }

            @Override
            public XrFacialExpressionsHTC next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrFacialExpressionsHTC ret = new XrFacialExpressionsHTC(segment.asSlice(0, XrFacialExpressionsHTC.BYTES));
                segment = segment.asSlice(XrFacialExpressionsHTC.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrFacialExpressionsHTC allocate(Arena arena) {
        XrFacialExpressionsHTC ret = new XrFacialExpressionsHTC(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_FACIAL_EXPRESSIONS_HTC);
        return ret;
    }

    public static XrFacialExpressionsHTC.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrFacialExpressionsHTC.Ptr ret = new XrFacialExpressionsHTC.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_FACIAL_EXPRESSIONS_HTC);
        }
        return ret;
    }

    public static XrFacialExpressionsHTC clone(Arena arena, XrFacialExpressionsHTC src) {
        XrFacialExpressionsHTC ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_FACIAL_EXPRESSIONS_HTC);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrFacialExpressionsHTC type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrFacialExpressionsHTC next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrFacialExpressionsHTC next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @NativeType("XrBool32") @Unsigned int isActive() {
        return segment.get(LAYOUT$isActive, OFFSET$isActive);
    }

    public XrFacialExpressionsHTC isActive(@NativeType("XrBool32") @Unsigned int value) {
        segment.set(LAYOUT$isActive, OFFSET$isActive, value);
        return this;
    }

    public @NativeType("XrTime") long sampleTime() {
        return segment.get(LAYOUT$sampleTime, OFFSET$sampleTime);
    }

    public XrFacialExpressionsHTC sampleTime(@NativeType("XrTime") long value) {
        segment.set(LAYOUT$sampleTime, OFFSET$sampleTime, value);
        return this;
    }

    public @Unsigned int expressionCount() {
        return segment.get(LAYOUT$expressionCount, OFFSET$expressionCount);
    }

    public XrFacialExpressionsHTC expressionCount(@Unsigned int value) {
        segment.set(LAYOUT$expressionCount, OFFSET$expressionCount, value);
        return this;
    }

    /// Note: the returned {@link FloatPtr} does not have correct
    /// {@link FloatPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link FloatPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable FloatPtr expressionWeightings() {
        MemorySegment s = expressionWeightingsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new FloatPtr(s);
    }

    public XrFacialExpressionsHTC expressionWeightings(@Nullable FloatPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        expressionWeightingsRaw(s);
        return this;
    }

    public @Pointer(comment="float*") @NotNull MemorySegment expressionWeightingsRaw() {
        return segment.get(LAYOUT$expressionWeightings, OFFSET$expressionWeightings);
    }

    public void expressionWeightingsRaw(@Pointer(comment="float*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$expressionWeightings, OFFSET$expressionWeightings, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("isActive"),
        ValueLayout.JAVA_LONG.withName("sampleTime"),
        ValueLayout.JAVA_INT.withName("expressionCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT).withName("expressionWeightings")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$isActive = PathElement.groupElement("isActive");
    public static final PathElement PATH$sampleTime = PathElement.groupElement("sampleTime");
    public static final PathElement PATH$expressionCount = PathElement.groupElement("expressionCount");
    public static final PathElement PATH$expressionWeightings = PathElement.groupElement("expressionWeightings");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$isActive = (OfInt) LAYOUT.select(PATH$isActive);
    public static final OfLong LAYOUT$sampleTime = (OfLong) LAYOUT.select(PATH$sampleTime);
    public static final OfInt LAYOUT$expressionCount = (OfInt) LAYOUT.select(PATH$expressionCount);
    public static final AddressLayout LAYOUT$expressionWeightings = (AddressLayout) LAYOUT.select(PATH$expressionWeightings);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$isActive = LAYOUT$isActive.byteSize();
    public static final long SIZE$sampleTime = LAYOUT$sampleTime.byteSize();
    public static final long SIZE$expressionCount = LAYOUT$expressionCount.byteSize();
    public static final long SIZE$expressionWeightings = LAYOUT$expressionWeightings.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$isActive = LAYOUT.byteOffset(PATH$isActive);
    public static final long OFFSET$sampleTime = LAYOUT.byteOffset(PATH$sampleTime);
    public static final long OFFSET$expressionCount = LAYOUT.byteOffset(PATH$expressionCount);
    public static final long OFFSET$expressionWeightings = LAYOUT.byteOffset(PATH$expressionWeightings);
}
