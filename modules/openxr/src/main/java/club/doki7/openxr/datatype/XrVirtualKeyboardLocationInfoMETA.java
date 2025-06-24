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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrVirtualKeyboardLocationInfoMETA.html"><code>XrVirtualKeyboardLocationInfoMETA</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrVirtualKeyboardLocationInfoMETA {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrVirtualKeyboardLocationTypeMETA locationType; // @link substring="XrVirtualKeyboardLocationTypeMETA" target="XrVirtualKeyboardLocationTypeMETA" @link substring="locationType" target="#locationType"
///     XrSpace space; // @link substring="XrSpace" target="XrSpace" @link substring="space" target="#space"
///     XrPosef poseInSpace; // @link substring="XrPosef" target="XrPosef" @link substring="poseInSpace" target="#poseInSpace"
///     float scale; // @link substring="scale" target="#scale"
/// } XrVirtualKeyboardLocationInfoMETA;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_VIRTUAL_KEYBOARD_LOCATION_INFO_META`
///
/// The {@code allocate} ({@link XrVirtualKeyboardLocationInfoMETA#allocate(Arena)}, {@link XrVirtualKeyboardLocationInfoMETA#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrVirtualKeyboardLocationInfoMETA#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrVirtualKeyboardLocationInfoMETA.html"><code>XrVirtualKeyboardLocationInfoMETA</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrVirtualKeyboardLocationInfoMETA(@NotNull MemorySegment segment) implements IXrVirtualKeyboardLocationInfoMETA {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrVirtualKeyboardLocationInfoMETA.html"><code>XrVirtualKeyboardLocationInfoMETA</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrVirtualKeyboardLocationInfoMETA}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrVirtualKeyboardLocationInfoMETA to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrVirtualKeyboardLocationInfoMETA.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrVirtualKeyboardLocationInfoMETA, Iterable<XrVirtualKeyboardLocationInfoMETA> {
        public long size() {
            return segment.byteSize() / XrVirtualKeyboardLocationInfoMETA.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrVirtualKeyboardLocationInfoMETA at(long index) {
            return new XrVirtualKeyboardLocationInfoMETA(segment.asSlice(index * XrVirtualKeyboardLocationInfoMETA.BYTES, XrVirtualKeyboardLocationInfoMETA.BYTES));
        }

        public void write(long index, @NotNull XrVirtualKeyboardLocationInfoMETA value) {
            MemorySegment s = segment.asSlice(index * XrVirtualKeyboardLocationInfoMETA.BYTES, XrVirtualKeyboardLocationInfoMETA.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrVirtualKeyboardLocationInfoMETA.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrVirtualKeyboardLocationInfoMETA.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrVirtualKeyboardLocationInfoMETA.BYTES,
                (end - start) * XrVirtualKeyboardLocationInfoMETA.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrVirtualKeyboardLocationInfoMETA.BYTES));
        }

        public XrVirtualKeyboardLocationInfoMETA[] toArray() {
            XrVirtualKeyboardLocationInfoMETA[] ret = new XrVirtualKeyboardLocationInfoMETA[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrVirtualKeyboardLocationInfoMETA> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrVirtualKeyboardLocationInfoMETA> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrVirtualKeyboardLocationInfoMETA.BYTES;
            }

            @Override
            public XrVirtualKeyboardLocationInfoMETA next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrVirtualKeyboardLocationInfoMETA ret = new XrVirtualKeyboardLocationInfoMETA(segment.asSlice(0, XrVirtualKeyboardLocationInfoMETA.BYTES));
                segment = segment.asSlice(XrVirtualKeyboardLocationInfoMETA.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrVirtualKeyboardLocationInfoMETA allocate(Arena arena) {
        XrVirtualKeyboardLocationInfoMETA ret = new XrVirtualKeyboardLocationInfoMETA(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_VIRTUAL_KEYBOARD_LOCATION_INFO_META);
        return ret;
    }

    public static XrVirtualKeyboardLocationInfoMETA.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrVirtualKeyboardLocationInfoMETA.Ptr ret = new XrVirtualKeyboardLocationInfoMETA.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_VIRTUAL_KEYBOARD_LOCATION_INFO_META);
        }
        return ret;
    }

    public static XrVirtualKeyboardLocationInfoMETA clone(Arena arena, XrVirtualKeyboardLocationInfoMETA src) {
        XrVirtualKeyboardLocationInfoMETA ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_VIRTUAL_KEYBOARD_LOCATION_INFO_META);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrVirtualKeyboardLocationInfoMETA type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrVirtualKeyboardLocationInfoMETA next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrVirtualKeyboardLocationInfoMETA next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @EnumType(XrVirtualKeyboardLocationTypeMETA.class) int locationType() {
        return segment.get(LAYOUT$locationType, OFFSET$locationType);
    }

    public XrVirtualKeyboardLocationInfoMETA locationType(@EnumType(XrVirtualKeyboardLocationTypeMETA.class) int value) {
        segment.set(LAYOUT$locationType, OFFSET$locationType, value);
        return this;
    }

    public @Nullable XrSpace space() {
        MemorySegment s = segment.asSlice(OFFSET$space, SIZE$space);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrSpace(s);
    }

    public XrVirtualKeyboardLocationInfoMETA space(@Nullable XrSpace value) {
        segment.set(LAYOUT$space, OFFSET$space, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @NotNull XrPosef poseInSpace() {
        return new XrPosef(segment.asSlice(OFFSET$poseInSpace, LAYOUT$poseInSpace));
    }

    public XrVirtualKeyboardLocationInfoMETA poseInSpace(@NotNull XrPosef value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$poseInSpace, SIZE$poseInSpace);
        return this;
    }

    public XrVirtualKeyboardLocationInfoMETA poseInSpace(Consumer<@NotNull XrPosef> consumer) {
        consumer.accept(poseInSpace());
        return this;
    }

    public float scale() {
        return segment.get(LAYOUT$scale, OFFSET$scale);
    }

    public XrVirtualKeyboardLocationInfoMETA scale(float value) {
        segment.set(LAYOUT$scale, OFFSET$scale, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("locationType"),
        ValueLayout.ADDRESS.withName("space"),
        XrPosef.LAYOUT.withName("poseInSpace"),
        ValueLayout.JAVA_FLOAT.withName("scale")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$locationType = PathElement.groupElement("locationType");
    public static final PathElement PATH$space = PathElement.groupElement("space");
    public static final PathElement PATH$poseInSpace = PathElement.groupElement("poseInSpace");
    public static final PathElement PATH$scale = PathElement.groupElement("scale");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$locationType = (OfInt) LAYOUT.select(PATH$locationType);
    public static final AddressLayout LAYOUT$space = (AddressLayout) LAYOUT.select(PATH$space);
    public static final StructLayout LAYOUT$poseInSpace = (StructLayout) LAYOUT.select(PATH$poseInSpace);
    public static final OfFloat LAYOUT$scale = (OfFloat) LAYOUT.select(PATH$scale);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$locationType = LAYOUT$locationType.byteSize();
    public static final long SIZE$space = LAYOUT$space.byteSize();
    public static final long SIZE$poseInSpace = LAYOUT$poseInSpace.byteSize();
    public static final long SIZE$scale = LAYOUT$scale.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$locationType = LAYOUT.byteOffset(PATH$locationType);
    public static final long OFFSET$space = LAYOUT.byteOffset(PATH$space);
    public static final long OFFSET$poseInSpace = LAYOUT.byteOffset(PATH$poseInSpace);
    public static final long OFFSET$scale = LAYOUT.byteOffset(PATH$scale);
}
