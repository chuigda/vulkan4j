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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHapticPcmVibrationFB.html"><code>XrHapticPcmVibrationFB</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrHapticPcmVibrationFB {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     uint32_t bufferSize; // @link substring="bufferSize" target="#bufferSize"
///     float const* buffer; // @link substring="buffer" target="#buffer"
///     float sampleRate; // @link substring="sampleRate" target="#sampleRate"
///     XrBool32 append; // @link substring="append" target="#append"
///     uint32_t* samplesConsumed; // @link substring="samplesConsumed" target="#samplesConsumed"
/// } XrHapticPcmVibrationFB;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_HAPTIC_PCM_VIBRATION_FB`
///
/// The {@code allocate} ({@link XrHapticPcmVibrationFB#allocate(Arena)}, {@link XrHapticPcmVibrationFB#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrHapticPcmVibrationFB#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHapticPcmVibrationFB.html"><code>XrHapticPcmVibrationFB</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrHapticPcmVibrationFB(@NotNull MemorySegment segment) implements IXrHapticPcmVibrationFB {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHapticPcmVibrationFB.html"><code>XrHapticPcmVibrationFB</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrHapticPcmVibrationFB}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrHapticPcmVibrationFB to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrHapticPcmVibrationFB.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrHapticPcmVibrationFB, Iterable<XrHapticPcmVibrationFB> {
        public long size() {
            return segment.byteSize() / XrHapticPcmVibrationFB.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrHapticPcmVibrationFB at(long index) {
            return new XrHapticPcmVibrationFB(segment.asSlice(index * XrHapticPcmVibrationFB.BYTES, XrHapticPcmVibrationFB.BYTES));
        }

        public XrHapticPcmVibrationFB.Ptr at(long index, @NotNull Consumer<@NotNull XrHapticPcmVibrationFB> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrHapticPcmVibrationFB value) {
            MemorySegment s = segment.asSlice(index * XrHapticPcmVibrationFB.BYTES, XrHapticPcmVibrationFB.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrHapticPcmVibrationFB.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrHapticPcmVibrationFB.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrHapticPcmVibrationFB.BYTES,
                (end - start) * XrHapticPcmVibrationFB.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrHapticPcmVibrationFB.BYTES));
        }

        public XrHapticPcmVibrationFB[] toArray() {
            XrHapticPcmVibrationFB[] ret = new XrHapticPcmVibrationFB[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrHapticPcmVibrationFB> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrHapticPcmVibrationFB> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrHapticPcmVibrationFB.BYTES;
            }

            @Override
            public XrHapticPcmVibrationFB next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrHapticPcmVibrationFB ret = new XrHapticPcmVibrationFB(segment.asSlice(0, XrHapticPcmVibrationFB.BYTES));
                segment = segment.asSlice(XrHapticPcmVibrationFB.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrHapticPcmVibrationFB allocate(Arena arena) {
        XrHapticPcmVibrationFB ret = new XrHapticPcmVibrationFB(arena.allocate(LAYOUT));
        ret.type(XrStructureType.HAPTIC_PCM_VIBRATION_FB);
        return ret;
    }

    public static XrHapticPcmVibrationFB.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrHapticPcmVibrationFB.Ptr ret = new XrHapticPcmVibrationFB.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.HAPTIC_PCM_VIBRATION_FB);
        }
        return ret;
    }

    public static XrHapticPcmVibrationFB clone(Arena arena, XrHapticPcmVibrationFB src) {
        XrHapticPcmVibrationFB ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.HAPTIC_PCM_VIBRATION_FB);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrHapticPcmVibrationFB type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrHapticPcmVibrationFB next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrHapticPcmVibrationFB next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int bufferSize() {
        return segment.get(LAYOUT$bufferSize, OFFSET$bufferSize);
    }

    public XrHapticPcmVibrationFB bufferSize(@Unsigned int value) {
        segment.set(LAYOUT$bufferSize, OFFSET$bufferSize, value);
        return this;
    }

    /// Note: the returned {@link FloatPtr} does not have correct
    /// {@link FloatPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link FloatPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable FloatPtr buffer() {
        MemorySegment s = bufferRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new FloatPtr(s);
    }

    public XrHapticPcmVibrationFB buffer(@Nullable FloatPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        bufferRaw(s);
        return this;
    }

    public @Pointer(comment="float*") @NotNull MemorySegment bufferRaw() {
        return segment.get(LAYOUT$buffer, OFFSET$buffer);
    }

    public void bufferRaw(@Pointer(comment="float*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$buffer, OFFSET$buffer, value);
    }

    public float sampleRate() {
        return segment.get(LAYOUT$sampleRate, OFFSET$sampleRate);
    }

    public XrHapticPcmVibrationFB sampleRate(float value) {
        segment.set(LAYOUT$sampleRate, OFFSET$sampleRate, value);
        return this;
    }

    public @NativeType("XrBool32") @Unsigned int append() {
        return segment.get(LAYOUT$append, OFFSET$append);
    }

    public XrHapticPcmVibrationFB append(@NativeType("XrBool32") @Unsigned int value) {
        segment.set(LAYOUT$append, OFFSET$append, value);
        return this;
    }

    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @Unsigned IntPtr samplesConsumed() {
        MemorySegment s = samplesConsumedRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public XrHapticPcmVibrationFB samplesConsumed(@Nullable @Unsigned IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        samplesConsumedRaw(s);
        return this;
    }

    public @Pointer(comment="uint32_t*") @NotNull MemorySegment samplesConsumedRaw() {
        return segment.get(LAYOUT$samplesConsumed, OFFSET$samplesConsumed);
    }

    public void samplesConsumedRaw(@Pointer(comment="uint32_t*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$samplesConsumed, OFFSET$samplesConsumed, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("bufferSize"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT).withName("buffer"),
        ValueLayout.JAVA_FLOAT.withName("sampleRate"),
        ValueLayout.JAVA_INT.withName("append"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("samplesConsumed")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$bufferSize = PathElement.groupElement("bufferSize");
    public static final PathElement PATH$buffer = PathElement.groupElement("buffer");
    public static final PathElement PATH$sampleRate = PathElement.groupElement("sampleRate");
    public static final PathElement PATH$append = PathElement.groupElement("append");
    public static final PathElement PATH$samplesConsumed = PathElement.groupElement("samplesConsumed");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$bufferSize = (OfInt) LAYOUT.select(PATH$bufferSize);
    public static final AddressLayout LAYOUT$buffer = (AddressLayout) LAYOUT.select(PATH$buffer);
    public static final OfFloat LAYOUT$sampleRate = (OfFloat) LAYOUT.select(PATH$sampleRate);
    public static final OfInt LAYOUT$append = (OfInt) LAYOUT.select(PATH$append);
    public static final AddressLayout LAYOUT$samplesConsumed = (AddressLayout) LAYOUT.select(PATH$samplesConsumed);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$bufferSize = LAYOUT$bufferSize.byteSize();
    public static final long SIZE$buffer = LAYOUT$buffer.byteSize();
    public static final long SIZE$sampleRate = LAYOUT$sampleRate.byteSize();
    public static final long SIZE$append = LAYOUT$append.byteSize();
    public static final long SIZE$samplesConsumed = LAYOUT$samplesConsumed.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$bufferSize = LAYOUT.byteOffset(PATH$bufferSize);
    public static final long OFFSET$buffer = LAYOUT.byteOffset(PATH$buffer);
    public static final long OFFSET$sampleRate = LAYOUT.byteOffset(PATH$sampleRate);
    public static final long OFFSET$append = LAYOUT.byteOffset(PATH$append);
    public static final long OFFSET$samplesConsumed = LAYOUT.byteOffset(PATH$samplesConsumed);
}
