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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHapticVibration.html"><code>XrHapticVibration</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrHapticVibration {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrDuration duration; // @link substring="duration" target="#duration"
///     float frequency; // optional // @link substring="frequency" target="#frequency"
///     float amplitude; // @link substring="amplitude" target="#amplitude"
/// } XrHapticVibration;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_HAPTIC_VIBRATION`
///
/// The {@code allocate} ({@link XrHapticVibration#allocate(Arena)}, {@link XrHapticVibration#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrHapticVibration#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHapticVibration.html"><code>XrHapticVibration</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrHapticVibration(@NotNull MemorySegment segment) implements IXrHapticVibration {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHapticVibration.html"><code>XrHapticVibration</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrHapticVibration}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrHapticVibration to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrHapticVibration.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrHapticVibration, Iterable<XrHapticVibration> {
        public long size() {
            return segment.byteSize() / XrHapticVibration.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrHapticVibration at(long index) {
            return new XrHapticVibration(segment.asSlice(index * XrHapticVibration.BYTES, XrHapticVibration.BYTES));
        }

        public void write(long index, @NotNull XrHapticVibration value) {
            MemorySegment s = segment.asSlice(index * XrHapticVibration.BYTES, XrHapticVibration.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrHapticVibration.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrHapticVibration.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrHapticVibration.BYTES,
                (end - start) * XrHapticVibration.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrHapticVibration.BYTES));
        }

        public XrHapticVibration[] toArray() {
            XrHapticVibration[] ret = new XrHapticVibration[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrHapticVibration> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrHapticVibration> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrHapticVibration.BYTES;
            }

            @Override
            public XrHapticVibration next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrHapticVibration ret = new XrHapticVibration(segment.asSlice(0, XrHapticVibration.BYTES));
                segment = segment.asSlice(XrHapticVibration.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrHapticVibration allocate(Arena arena) {
        XrHapticVibration ret = new XrHapticVibration(arena.allocate(LAYOUT));
        ret.type(XrStructureType.HAPTIC_VIBRATION);
        return ret;
    }

    public static XrHapticVibration.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrHapticVibration.Ptr ret = new XrHapticVibration.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.HAPTIC_VIBRATION);
        }
        return ret;
    }

    public static XrHapticVibration clone(Arena arena, XrHapticVibration src) {
        XrHapticVibration ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.HAPTIC_VIBRATION);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrHapticVibration type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrHapticVibration next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrHapticVibration next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @NativeType("XrDuration") long duration() {
        return segment.get(LAYOUT$duration, OFFSET$duration);
    }

    public XrHapticVibration duration(@NativeType("XrDuration") long value) {
        segment.set(LAYOUT$duration, OFFSET$duration, value);
        return this;
    }

    public float frequency() {
        return segment.get(LAYOUT$frequency, OFFSET$frequency);
    }

    public XrHapticVibration frequency(float value) {
        segment.set(LAYOUT$frequency, OFFSET$frequency, value);
        return this;
    }

    public float amplitude() {
        return segment.get(LAYOUT$amplitude, OFFSET$amplitude);
    }

    public XrHapticVibration amplitude(float value) {
        segment.set(LAYOUT$amplitude, OFFSET$amplitude, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_LONG.withName("duration"),
        ValueLayout.JAVA_FLOAT.withName("frequency"),
        ValueLayout.JAVA_FLOAT.withName("amplitude")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$duration = PathElement.groupElement("duration");
    public static final PathElement PATH$frequency = PathElement.groupElement("frequency");
    public static final PathElement PATH$amplitude = PathElement.groupElement("amplitude");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfLong LAYOUT$duration = (OfLong) LAYOUT.select(PATH$duration);
    public static final OfFloat LAYOUT$frequency = (OfFloat) LAYOUT.select(PATH$frequency);
    public static final OfFloat LAYOUT$amplitude = (OfFloat) LAYOUT.select(PATH$amplitude);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$duration = LAYOUT$duration.byteSize();
    public static final long SIZE$frequency = LAYOUT$frequency.byteSize();
    public static final long SIZE$amplitude = LAYOUT$amplitude.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$duration = LAYOUT.byteOffset(PATH$duration);
    public static final long OFFSET$frequency = LAYOUT.byteOffset(PATH$frequency);
    public static final long OFFSET$amplitude = LAYOUT.byteOffset(PATH$amplitude);
}
