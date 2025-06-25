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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFrameEndInfoML.html"><code>XrFrameEndInfoML</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrFrameEndInfoML {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     float focusDistance; // @link substring="focusDistance" target="#focusDistance"
///     XrFrameEndInfoFlagsML flags; // optional // @link substring="XrFrameEndInfoFlagsML" target="XrFrameEndInfoFlagsML" @link substring="flags" target="#flags"
/// } XrFrameEndInfoML;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_FRAME_END_INFO_ML`
///
/// The {@code allocate} ({@link XrFrameEndInfoML#allocate(Arena)}, {@link XrFrameEndInfoML#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrFrameEndInfoML#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFrameEndInfoML.html"><code>XrFrameEndInfoML</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrFrameEndInfoML(@NotNull MemorySegment segment) implements IXrFrameEndInfoML {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFrameEndInfoML.html"><code>XrFrameEndInfoML</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrFrameEndInfoML}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrFrameEndInfoML to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrFrameEndInfoML.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrFrameEndInfoML, Iterable<XrFrameEndInfoML> {
        public long size() {
            return segment.byteSize() / XrFrameEndInfoML.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrFrameEndInfoML at(long index) {
            return new XrFrameEndInfoML(segment.asSlice(index * XrFrameEndInfoML.BYTES, XrFrameEndInfoML.BYTES));
        }

        public XrFrameEndInfoML.Ptr at(long index, @NotNull Consumer<@NotNull XrFrameEndInfoML> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrFrameEndInfoML value) {
            MemorySegment s = segment.asSlice(index * XrFrameEndInfoML.BYTES, XrFrameEndInfoML.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrFrameEndInfoML.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrFrameEndInfoML.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrFrameEndInfoML.BYTES,
                (end - start) * XrFrameEndInfoML.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrFrameEndInfoML.BYTES));
        }

        public XrFrameEndInfoML[] toArray() {
            XrFrameEndInfoML[] ret = new XrFrameEndInfoML[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrFrameEndInfoML> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrFrameEndInfoML> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrFrameEndInfoML.BYTES;
            }

            @Override
            public XrFrameEndInfoML next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrFrameEndInfoML ret = new XrFrameEndInfoML(segment.asSlice(0, XrFrameEndInfoML.BYTES));
                segment = segment.asSlice(XrFrameEndInfoML.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrFrameEndInfoML allocate(Arena arena) {
        XrFrameEndInfoML ret = new XrFrameEndInfoML(arena.allocate(LAYOUT));
        ret.type(XrStructureType.FRAME_END_INFO_ML);
        return ret;
    }

    public static XrFrameEndInfoML.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrFrameEndInfoML.Ptr ret = new XrFrameEndInfoML.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.FRAME_END_INFO_ML);
        }
        return ret;
    }

    public static XrFrameEndInfoML clone(Arena arena, XrFrameEndInfoML src) {
        XrFrameEndInfoML ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.FRAME_END_INFO_ML);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrFrameEndInfoML type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrFrameEndInfoML next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrFrameEndInfoML next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public float focusDistance() {
        return segment.get(LAYOUT$focusDistance, OFFSET$focusDistance);
    }

    public XrFrameEndInfoML focusDistance(float value) {
        segment.set(LAYOUT$focusDistance, OFFSET$focusDistance, value);
        return this;
    }

    public @Bitmask(XrFrameEndInfoFlagsML.class) long flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public XrFrameEndInfoML flags(@Bitmask(XrFrameEndInfoFlagsML.class) long value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_FLOAT.withName("focusDistance"),
        ValueLayout.JAVA_LONG.withName("flags")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$focusDistance = PathElement.groupElement("focusDistance");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfFloat LAYOUT$focusDistance = (OfFloat) LAYOUT.select(PATH$focusDistance);
    public static final OfLong LAYOUT$flags = (OfLong) LAYOUT.select(PATH$flags);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$focusDistance = LAYOUT$focusDistance.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$focusDistance = LAYOUT.byteOffset(PATH$focusDistance);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
}
