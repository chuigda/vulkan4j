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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPerformanceMetricsCounterMETA.html"><code>XrPerformanceMetricsCounterMETA</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrPerformanceMetricsCounterMETA {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrPerformanceMetricsCounterFlagsMETA counterFlags; // optional // @link substring="XrPerformanceMetricsCounterFlagsMETA" target="XrPerformanceMetricsCounterFlagsMETA" @link substring="counterFlags" target="#counterFlags"
///     XrPerformanceMetricsCounterUnitMETA counterUnit; // @link substring="XrPerformanceMetricsCounterUnitMETA" target="XrPerformanceMetricsCounterUnitMETA" @link substring="counterUnit" target="#counterUnit"
///     uint32_t uintValue; // @link substring="uintValue" target="#uintValue"
///     float floatValue; // @link substring="floatValue" target="#floatValue"
/// } XrPerformanceMetricsCounterMETA;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_PERFORMANCE_METRICS_COUNTER_META`
///
/// The {@code allocate} ({@link XrPerformanceMetricsCounterMETA#allocate(Arena)}, {@link XrPerformanceMetricsCounterMETA#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrPerformanceMetricsCounterMETA#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPerformanceMetricsCounterMETA.html"><code>XrPerformanceMetricsCounterMETA</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrPerformanceMetricsCounterMETA(@NotNull MemorySegment segment) implements IXrPerformanceMetricsCounterMETA {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPerformanceMetricsCounterMETA.html"><code>XrPerformanceMetricsCounterMETA</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrPerformanceMetricsCounterMETA}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrPerformanceMetricsCounterMETA to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrPerformanceMetricsCounterMETA.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrPerformanceMetricsCounterMETA, Iterable<XrPerformanceMetricsCounterMETA> {
        public long size() {
            return segment.byteSize() / XrPerformanceMetricsCounterMETA.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrPerformanceMetricsCounterMETA at(long index) {
            return new XrPerformanceMetricsCounterMETA(segment.asSlice(index * XrPerformanceMetricsCounterMETA.BYTES, XrPerformanceMetricsCounterMETA.BYTES));
        }

        public XrPerformanceMetricsCounterMETA.Ptr at(long index, @NotNull Consumer<@NotNull XrPerformanceMetricsCounterMETA> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrPerformanceMetricsCounterMETA value) {
            MemorySegment s = segment.asSlice(index * XrPerformanceMetricsCounterMETA.BYTES, XrPerformanceMetricsCounterMETA.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrPerformanceMetricsCounterMETA.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrPerformanceMetricsCounterMETA.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrPerformanceMetricsCounterMETA.BYTES,
                (end - start) * XrPerformanceMetricsCounterMETA.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrPerformanceMetricsCounterMETA.BYTES));
        }

        public XrPerformanceMetricsCounterMETA[] toArray() {
            XrPerformanceMetricsCounterMETA[] ret = new XrPerformanceMetricsCounterMETA[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrPerformanceMetricsCounterMETA> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrPerformanceMetricsCounterMETA> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrPerformanceMetricsCounterMETA.BYTES;
            }

            @Override
            public XrPerformanceMetricsCounterMETA next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrPerformanceMetricsCounterMETA ret = new XrPerformanceMetricsCounterMETA(segment.asSlice(0, XrPerformanceMetricsCounterMETA.BYTES));
                segment = segment.asSlice(XrPerformanceMetricsCounterMETA.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrPerformanceMetricsCounterMETA allocate(Arena arena) {
        XrPerformanceMetricsCounterMETA ret = new XrPerformanceMetricsCounterMETA(arena.allocate(LAYOUT));
        ret.type(XrStructureType.PERFORMANCE_METRICS_COUNTER_META);
        return ret;
    }

    public static XrPerformanceMetricsCounterMETA.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrPerformanceMetricsCounterMETA.Ptr ret = new XrPerformanceMetricsCounterMETA.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.PERFORMANCE_METRICS_COUNTER_META);
        }
        return ret;
    }

    public static XrPerformanceMetricsCounterMETA clone(Arena arena, XrPerformanceMetricsCounterMETA src) {
        XrPerformanceMetricsCounterMETA ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.PERFORMANCE_METRICS_COUNTER_META);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrPerformanceMetricsCounterMETA type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrPerformanceMetricsCounterMETA next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrPerformanceMetricsCounterMETA next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Bitmask(XrPerformanceMetricsCounterFlagsMETA.class) long counterFlags() {
        return segment.get(LAYOUT$counterFlags, OFFSET$counterFlags);
    }

    public XrPerformanceMetricsCounterMETA counterFlags(@Bitmask(XrPerformanceMetricsCounterFlagsMETA.class) long value) {
        segment.set(LAYOUT$counterFlags, OFFSET$counterFlags, value);
        return this;
    }

    public @EnumType(XrPerformanceMetricsCounterUnitMETA.class) int counterUnit() {
        return segment.get(LAYOUT$counterUnit, OFFSET$counterUnit);
    }

    public XrPerformanceMetricsCounterMETA counterUnit(@EnumType(XrPerformanceMetricsCounterUnitMETA.class) int value) {
        segment.set(LAYOUT$counterUnit, OFFSET$counterUnit, value);
        return this;
    }

    public @Unsigned int uintValue() {
        return segment.get(LAYOUT$uintValue, OFFSET$uintValue);
    }

    public XrPerformanceMetricsCounterMETA uintValue(@Unsigned int value) {
        segment.set(LAYOUT$uintValue, OFFSET$uintValue, value);
        return this;
    }

    public float floatValue() {
        return segment.get(LAYOUT$floatValue, OFFSET$floatValue);
    }

    public XrPerformanceMetricsCounterMETA floatValue(float value) {
        segment.set(LAYOUT$floatValue, OFFSET$floatValue, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_LONG.withName("counterFlags"),
        ValueLayout.JAVA_INT.withName("counterUnit"),
        ValueLayout.JAVA_INT.withName("uintValue"),
        ValueLayout.JAVA_FLOAT.withName("floatValue")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$counterFlags = PathElement.groupElement("counterFlags");
    public static final PathElement PATH$counterUnit = PathElement.groupElement("counterUnit");
    public static final PathElement PATH$uintValue = PathElement.groupElement("uintValue");
    public static final PathElement PATH$floatValue = PathElement.groupElement("floatValue");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfLong LAYOUT$counterFlags = (OfLong) LAYOUT.select(PATH$counterFlags);
    public static final OfInt LAYOUT$counterUnit = (OfInt) LAYOUT.select(PATH$counterUnit);
    public static final OfInt LAYOUT$uintValue = (OfInt) LAYOUT.select(PATH$uintValue);
    public static final OfFloat LAYOUT$floatValue = (OfFloat) LAYOUT.select(PATH$floatValue);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$counterFlags = LAYOUT$counterFlags.byteSize();
    public static final long SIZE$counterUnit = LAYOUT$counterUnit.byteSize();
    public static final long SIZE$uintValue = LAYOUT$uintValue.byteSize();
    public static final long SIZE$floatValue = LAYOUT$floatValue.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$counterFlags = LAYOUT.byteOffset(PATH$counterFlags);
    public static final long OFFSET$counterUnit = LAYOUT.byteOffset(PATH$counterUnit);
    public static final long OFFSET$uintValue = LAYOUT.byteOffset(PATH$uintValue);
    public static final long OFFSET$floatValue = LAYOUT.byteOffset(PATH$floatValue);
}
