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
import static club.doki7.openxr.enumtype.XrEyePositionFB.COUNT;
import static club.doki7.openxr.XRConstants.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.datatype.*;
import club.doki7.vulkan.enumtype.*;
import club.doki7.vulkan.handle.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrEyeGazesFB.html"><code>XrEyeGazesFB</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrEyeGazesFB {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     XrEyeGazeFB[XR_EYE_POSITION_COUNT_FB] gaze; // @link substring="XrEyeGazeFB" target="XrEyeGazeFB" @link substring="gaze" target="#gaze"
///     XrTime time; // @link substring="time" target="#time"
/// } XrEyeGazesFB;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_EYE_GAZES_FB`
///
/// The {@code allocate} ({@link XrEyeGazesFB#allocate(Arena)}, {@link XrEyeGazesFB#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrEyeGazesFB#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrEyeGazesFB.html"><code>XrEyeGazesFB</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrEyeGazesFB(@NotNull MemorySegment segment) implements IXrEyeGazesFB {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrEyeGazesFB.html"><code>XrEyeGazesFB</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrEyeGazesFB}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrEyeGazesFB to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrEyeGazesFB.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrEyeGazesFB, Iterable<XrEyeGazesFB> {
        public long size() {
            return segment.byteSize() / XrEyeGazesFB.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrEyeGazesFB at(long index) {
            return new XrEyeGazesFB(segment.asSlice(index * XrEyeGazesFB.BYTES, XrEyeGazesFB.BYTES));
        }

        public void write(long index, @NotNull XrEyeGazesFB value) {
            MemorySegment s = segment.asSlice(index * XrEyeGazesFB.BYTES, XrEyeGazesFB.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrEyeGazesFB.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrEyeGazesFB.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrEyeGazesFB.BYTES,
                (end - start) * XrEyeGazesFB.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrEyeGazesFB.BYTES));
        }

        public XrEyeGazesFB[] toArray() {
            XrEyeGazesFB[] ret = new XrEyeGazesFB[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrEyeGazesFB> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrEyeGazesFB> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrEyeGazesFB.BYTES;
            }

            @Override
            public XrEyeGazesFB next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrEyeGazesFB ret = new XrEyeGazesFB(segment.asSlice(0, XrEyeGazesFB.BYTES));
                segment = segment.asSlice(XrEyeGazesFB.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrEyeGazesFB allocate(Arena arena) {
        XrEyeGazesFB ret = new XrEyeGazesFB(arena.allocate(LAYOUT));
        ret.type(XrStructureType.EYE_GAZES_FB);
        return ret;
    }

    public static XrEyeGazesFB.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrEyeGazesFB.Ptr ret = new XrEyeGazesFB.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.EYE_GAZES_FB);
        }
        return ret;
    }

    public static XrEyeGazesFB clone(Arena arena, XrEyeGazesFB src) {
        XrEyeGazesFB ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.EYE_GAZES_FB);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrEyeGazesFB type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrEyeGazesFB next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrEyeGazesFB next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public XrEyeGazeFB.Ptr gaze() {
        return new XrEyeGazeFB.Ptr(gazeRaw());
    }

    public XrEyeGazesFB gaze(XrEyeGazeFB.Ptr value) {
        MemorySegment s = gazeRaw();
        s.copyFrom(value.segment());
        return this;
    }

    public XrEyeGazeFB gazeAt(int index) {
        MemorySegment s = gazeRaw();
        return new XrEyeGazeFB(s.asSlice(index * XrEyeGazeFB.BYTES, XrEyeGazeFB.BYTES));
    }

    public void gazeAt(int index, XrEyeGazeFB value) {
        MemorySegment s = gazeRaw();
        MemorySegment.copy(value.segment(), 0, s, index * XrEyeGazeFB.BYTES, XrEyeGazeFB.BYTES);
    }

    public @NotNull MemorySegment gazeRaw() {
        return segment.asSlice(OFFSET$gaze, SIZE$gaze);
    }

    public @NativeType("XrTime") long time() {
        return segment.get(LAYOUT$time, OFFSET$time);
    }

    public XrEyeGazesFB time(@NativeType("XrTime") long value) {
        segment.set(LAYOUT$time, OFFSET$time, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        MemoryLayout.sequenceLayout(COUNT, XrEyeGazeFB.LAYOUT).withName("gaze"),
        ValueLayout.JAVA_LONG.withName("time")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$gaze = PathElement.groupElement("gaze");
    public static final PathElement PATH$time = PathElement.groupElement("time");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final SequenceLayout LAYOUT$gaze = (SequenceLayout) LAYOUT.select(PATH$gaze);
    public static final OfLong LAYOUT$time = (OfLong) LAYOUT.select(PATH$time);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$gaze = LAYOUT$gaze.byteSize();
    public static final long SIZE$time = LAYOUT$time.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$gaze = LAYOUT.byteOffset(PATH$gaze);
    public static final long OFFSET$time = LAYOUT.byteOffset(PATH$time);
}
