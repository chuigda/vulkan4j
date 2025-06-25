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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFaceExpressionWeightsFB.html"><code>XrFaceExpressionWeightsFB</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrFaceExpressionWeightsFB {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     uint32_t weightCount; // @link substring="weightCount" target="#weightCount"
///     float* weights; // @link substring="weights" target="#weights"
///     uint32_t confidenceCount; // @link substring="confidenceCount" target="#confidenceCount"
///     float* confidences; // @link substring="confidences" target="#confidences"
///     XrFaceExpressionStatusFB status; // @link substring="XrFaceExpressionStatusFB" target="XrFaceExpressionStatusFB" @link substring="status" target="#status"
///     XrTime time; // @link substring="time" target="#time"
/// } XrFaceExpressionWeightsFB;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_FACE_EXPRESSION_WEIGHTS_FB`
///
/// The {@code allocate} ({@link XrFaceExpressionWeightsFB#allocate(Arena)}, {@link XrFaceExpressionWeightsFB#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrFaceExpressionWeightsFB#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFaceExpressionWeightsFB.html"><code>XrFaceExpressionWeightsFB</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrFaceExpressionWeightsFB(@NotNull MemorySegment segment) implements IXrFaceExpressionWeightsFB {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFaceExpressionWeightsFB.html"><code>XrFaceExpressionWeightsFB</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrFaceExpressionWeightsFB}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrFaceExpressionWeightsFB to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrFaceExpressionWeightsFB.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrFaceExpressionWeightsFB, Iterable<XrFaceExpressionWeightsFB> {
        public long size() {
            return segment.byteSize() / XrFaceExpressionWeightsFB.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrFaceExpressionWeightsFB at(long index) {
            return new XrFaceExpressionWeightsFB(segment.asSlice(index * XrFaceExpressionWeightsFB.BYTES, XrFaceExpressionWeightsFB.BYTES));
        }

        public XrFaceExpressionWeightsFB.Ptr at(long index, @NotNull Consumer<@NotNull XrFaceExpressionWeightsFB> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrFaceExpressionWeightsFB value) {
            MemorySegment s = segment.asSlice(index * XrFaceExpressionWeightsFB.BYTES, XrFaceExpressionWeightsFB.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrFaceExpressionWeightsFB.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrFaceExpressionWeightsFB.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrFaceExpressionWeightsFB.BYTES,
                (end - start) * XrFaceExpressionWeightsFB.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrFaceExpressionWeightsFB.BYTES));
        }

        public XrFaceExpressionWeightsFB[] toArray() {
            XrFaceExpressionWeightsFB[] ret = new XrFaceExpressionWeightsFB[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrFaceExpressionWeightsFB> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrFaceExpressionWeightsFB> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrFaceExpressionWeightsFB.BYTES;
            }

            @Override
            public XrFaceExpressionWeightsFB next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrFaceExpressionWeightsFB ret = new XrFaceExpressionWeightsFB(segment.asSlice(0, XrFaceExpressionWeightsFB.BYTES));
                segment = segment.asSlice(XrFaceExpressionWeightsFB.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrFaceExpressionWeightsFB allocate(Arena arena) {
        XrFaceExpressionWeightsFB ret = new XrFaceExpressionWeightsFB(arena.allocate(LAYOUT));
        ret.type(XrStructureType.FACE_EXPRESSION_WEIGHTS_FB);
        return ret;
    }

    public static XrFaceExpressionWeightsFB.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrFaceExpressionWeightsFB.Ptr ret = new XrFaceExpressionWeightsFB.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.FACE_EXPRESSION_WEIGHTS_FB);
        }
        return ret;
    }

    public static XrFaceExpressionWeightsFB clone(Arena arena, XrFaceExpressionWeightsFB src) {
        XrFaceExpressionWeightsFB ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.FACE_EXPRESSION_WEIGHTS_FB);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrFaceExpressionWeightsFB type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrFaceExpressionWeightsFB next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrFaceExpressionWeightsFB next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int weightCount() {
        return segment.get(LAYOUT$weightCount, OFFSET$weightCount);
    }

    public XrFaceExpressionWeightsFB weightCount(@Unsigned int value) {
        segment.set(LAYOUT$weightCount, OFFSET$weightCount, value);
        return this;
    }

    /// Note: the returned {@link FloatPtr} does not have correct
    /// {@link FloatPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link FloatPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable FloatPtr weights() {
        MemorySegment s = weightsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new FloatPtr(s);
    }

    public XrFaceExpressionWeightsFB weights(@Nullable FloatPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        weightsRaw(s);
        return this;
    }

    public @Pointer(comment="float*") @NotNull MemorySegment weightsRaw() {
        return segment.get(LAYOUT$weights, OFFSET$weights);
    }

    public void weightsRaw(@Pointer(comment="float*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$weights, OFFSET$weights, value);
    }

    public @Unsigned int confidenceCount() {
        return segment.get(LAYOUT$confidenceCount, OFFSET$confidenceCount);
    }

    public XrFaceExpressionWeightsFB confidenceCount(@Unsigned int value) {
        segment.set(LAYOUT$confidenceCount, OFFSET$confidenceCount, value);
        return this;
    }

    /// Note: the returned {@link FloatPtr} does not have correct
    /// {@link FloatPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link FloatPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable FloatPtr confidences() {
        MemorySegment s = confidencesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new FloatPtr(s);
    }

    public XrFaceExpressionWeightsFB confidences(@Nullable FloatPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        confidencesRaw(s);
        return this;
    }

    public @Pointer(comment="float*") @NotNull MemorySegment confidencesRaw() {
        return segment.get(LAYOUT$confidences, OFFSET$confidences);
    }

    public void confidencesRaw(@Pointer(comment="float*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$confidences, OFFSET$confidences, value);
    }

    public @NotNull XrFaceExpressionStatusFB status() {
        return new XrFaceExpressionStatusFB(segment.asSlice(OFFSET$status, LAYOUT$status));
    }

    public XrFaceExpressionWeightsFB status(@NotNull XrFaceExpressionStatusFB value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$status, SIZE$status);
        return this;
    }

    public XrFaceExpressionWeightsFB status(Consumer<@NotNull XrFaceExpressionStatusFB> consumer) {
        consumer.accept(status());
        return this;
    }

    public @NativeType("XrTime") long time() {
        return segment.get(LAYOUT$time, OFFSET$time);
    }

    public XrFaceExpressionWeightsFB time(@NativeType("XrTime") long value) {
        segment.set(LAYOUT$time, OFFSET$time, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("weightCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT).withName("weights"),
        ValueLayout.JAVA_INT.withName("confidenceCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT).withName("confidences"),
        XrFaceExpressionStatusFB.LAYOUT.withName("status"),
        ValueLayout.JAVA_LONG.withName("time")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$weightCount = PathElement.groupElement("weightCount");
    public static final PathElement PATH$weights = PathElement.groupElement("weights");
    public static final PathElement PATH$confidenceCount = PathElement.groupElement("confidenceCount");
    public static final PathElement PATH$confidences = PathElement.groupElement("confidences");
    public static final PathElement PATH$status = PathElement.groupElement("status");
    public static final PathElement PATH$time = PathElement.groupElement("time");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$weightCount = (OfInt) LAYOUT.select(PATH$weightCount);
    public static final AddressLayout LAYOUT$weights = (AddressLayout) LAYOUT.select(PATH$weights);
    public static final OfInt LAYOUT$confidenceCount = (OfInt) LAYOUT.select(PATH$confidenceCount);
    public static final AddressLayout LAYOUT$confidences = (AddressLayout) LAYOUT.select(PATH$confidences);
    public static final StructLayout LAYOUT$status = (StructLayout) LAYOUT.select(PATH$status);
    public static final OfLong LAYOUT$time = (OfLong) LAYOUT.select(PATH$time);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$weightCount = LAYOUT$weightCount.byteSize();
    public static final long SIZE$weights = LAYOUT$weights.byteSize();
    public static final long SIZE$confidenceCount = LAYOUT$confidenceCount.byteSize();
    public static final long SIZE$confidences = LAYOUT$confidences.byteSize();
    public static final long SIZE$status = LAYOUT$status.byteSize();
    public static final long SIZE$time = LAYOUT$time.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$weightCount = LAYOUT.byteOffset(PATH$weightCount);
    public static final long OFFSET$weights = LAYOUT.byteOffset(PATH$weights);
    public static final long OFFSET$confidenceCount = LAYOUT.byteOffset(PATH$confidenceCount);
    public static final long OFFSET$confidences = LAYOUT.byteOffset(PATH$confidences);
    public static final long OFFSET$status = LAYOUT.byteOffset(PATH$status);
    public static final long OFFSET$time = LAYOUT.byteOffset(PATH$time);
}
