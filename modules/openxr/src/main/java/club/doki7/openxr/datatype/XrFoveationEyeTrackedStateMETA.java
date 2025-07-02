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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFoveationEyeTrackedStateMETA.html"><code>XrFoveationEyeTrackedStateMETA</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrFoveationEyeTrackedStateMETA {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     XrVector2f[XR_FOVEATION_CENTER_SIZE_META] foveationCenter; // @link substring="XrVector2f" target="XrVector2f" @link substring="foveationCenter" target="#foveationCenter"
///     XrFoveationEyeTrackedStateFlagsMETA flags; // @link substring="XrFoveationEyeTrackedStateFlagsMETA" target="XrFoveationEyeTrackedStateFlagsMETA" @link substring="flags" target="#flags"
/// } XrFoveationEyeTrackedStateMETA;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_FOVEATION_EYE_TRACKED_STATE_META`
///
/// The {@code allocate} ({@link XrFoveationEyeTrackedStateMETA#allocate(Arena)}, {@link XrFoveationEyeTrackedStateMETA#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrFoveationEyeTrackedStateMETA#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFoveationEyeTrackedStateMETA.html"><code>XrFoveationEyeTrackedStateMETA</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrFoveationEyeTrackedStateMETA(@NotNull MemorySegment segment) implements IXrFoveationEyeTrackedStateMETA {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFoveationEyeTrackedStateMETA.html"><code>XrFoveationEyeTrackedStateMETA</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrFoveationEyeTrackedStateMETA}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrFoveationEyeTrackedStateMETA to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrFoveationEyeTrackedStateMETA.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrFoveationEyeTrackedStateMETA, Iterable<XrFoveationEyeTrackedStateMETA> {
        public long size() {
            return segment.byteSize() / XrFoveationEyeTrackedStateMETA.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrFoveationEyeTrackedStateMETA at(long index) {
            return new XrFoveationEyeTrackedStateMETA(segment.asSlice(index * XrFoveationEyeTrackedStateMETA.BYTES, XrFoveationEyeTrackedStateMETA.BYTES));
        }

        public XrFoveationEyeTrackedStateMETA.Ptr at(long index, @NotNull Consumer<@NotNull XrFoveationEyeTrackedStateMETA> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrFoveationEyeTrackedStateMETA value) {
            MemorySegment s = segment.asSlice(index * XrFoveationEyeTrackedStateMETA.BYTES, XrFoveationEyeTrackedStateMETA.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrFoveationEyeTrackedStateMETA.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrFoveationEyeTrackedStateMETA.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrFoveationEyeTrackedStateMETA.BYTES,
                (end - start) * XrFoveationEyeTrackedStateMETA.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrFoveationEyeTrackedStateMETA.BYTES));
        }

        public XrFoveationEyeTrackedStateMETA[] toArray() {
            XrFoveationEyeTrackedStateMETA[] ret = new XrFoveationEyeTrackedStateMETA[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrFoveationEyeTrackedStateMETA> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrFoveationEyeTrackedStateMETA> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrFoveationEyeTrackedStateMETA.BYTES;
            }

            @Override
            public XrFoveationEyeTrackedStateMETA next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrFoveationEyeTrackedStateMETA ret = new XrFoveationEyeTrackedStateMETA(segment.asSlice(0, XrFoveationEyeTrackedStateMETA.BYTES));
                segment = segment.asSlice(XrFoveationEyeTrackedStateMETA.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrFoveationEyeTrackedStateMETA allocate(Arena arena) {
        XrFoveationEyeTrackedStateMETA ret = new XrFoveationEyeTrackedStateMETA(arena.allocate(LAYOUT));
        ret.type(XrStructureType.FOVEATION_EYE_TRACKED_STATE_META);
        return ret;
    }

    public static XrFoveationEyeTrackedStateMETA.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrFoveationEyeTrackedStateMETA.Ptr ret = new XrFoveationEyeTrackedStateMETA.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.FOVEATION_EYE_TRACKED_STATE_META);
        }
        return ret;
    }

    public static XrFoveationEyeTrackedStateMETA clone(Arena arena, XrFoveationEyeTrackedStateMETA src) {
        XrFoveationEyeTrackedStateMETA ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.FOVEATION_EYE_TRACKED_STATE_META);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrFoveationEyeTrackedStateMETA type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrFoveationEyeTrackedStateMETA next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrFoveationEyeTrackedStateMETA next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public XrVector2f.Ptr foveationCenter() {
        return new XrVector2f.Ptr(foveationCenterRaw());
    }

    public XrFoveationEyeTrackedStateMETA foveationCenter(@NotNull Consumer<XrVector2f.Ptr> consumer) {
        XrVector2f.Ptr ptr = foveationCenter();
        consumer.accept(ptr);
        return this;
    }

    public XrFoveationEyeTrackedStateMETA foveationCenter(XrVector2f.Ptr value) {
        MemorySegment s = foveationCenterRaw();
        s.copyFrom(value.segment());
        return this;
    }

    public XrVector2f foveationCenterAt(int index) {
        MemorySegment s = foveationCenterRaw();
        return new XrVector2f(s.asSlice(index * XrVector2f.BYTES, XrVector2f.BYTES));
    }

    public void foveationCenterAt(int index, XrVector2f value) {
        MemorySegment s = foveationCenterRaw();
        MemorySegment.copy(value.segment(), 0, s, index * XrVector2f.BYTES, XrVector2f.BYTES);
    }

    public @NotNull MemorySegment foveationCenterRaw() {
        return segment.asSlice(OFFSET$foveationCenter, SIZE$foveationCenter);
    }

    public @Bitmask(XrFoveationEyeTrackedStateFlagsMETA.class) long flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public XrFoveationEyeTrackedStateMETA flags(@Bitmask(XrFoveationEyeTrackedStateFlagsMETA.class) long value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        MemoryLayout.sequenceLayout(FOVEATION_CENTER_SIZE_META, XrVector2f.LAYOUT).withName("foveationCenter"),
        ValueLayout.JAVA_LONG.withName("flags")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$foveationCenter = PathElement.groupElement("foveationCenter");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final SequenceLayout LAYOUT$foveationCenter = (SequenceLayout) LAYOUT.select(PATH$foveationCenter);
    public static final OfLong LAYOUT$flags = (OfLong) LAYOUT.select(PATH$flags);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$foveationCenter = LAYOUT$foveationCenter.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$foveationCenter = LAYOUT.byteOffset(PATH$foveationCenter);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
}
