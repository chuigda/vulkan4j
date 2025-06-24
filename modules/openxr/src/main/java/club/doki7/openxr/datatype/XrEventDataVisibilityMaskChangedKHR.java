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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrEventDataVisibilityMaskChangedKHR.html"><code>XrEventDataVisibilityMaskChangedKHR</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrEventDataVisibilityMaskChangedKHR {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrSession session; // @link substring="XrSession" target="XrSession" @link substring="session" target="#session"
///     XrViewConfigurationType viewConfigurationType; // @link substring="XrViewConfigurationType" target="XrViewConfigurationType" @link substring="viewConfigurationType" target="#viewConfigurationType"
///     uint32_t viewIndex; // @link substring="viewIndex" target="#viewIndex"
/// } XrEventDataVisibilityMaskChangedKHR;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_EVENT_DATA_VISIBILITY_MASK_CHANGED_KHR`
///
/// The {@code allocate} ({@link XrEventDataVisibilityMaskChangedKHR#allocate(Arena)}, {@link XrEventDataVisibilityMaskChangedKHR#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrEventDataVisibilityMaskChangedKHR#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrEventDataVisibilityMaskChangedKHR.html"><code>XrEventDataVisibilityMaskChangedKHR</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrEventDataVisibilityMaskChangedKHR(@NotNull MemorySegment segment) implements IXrEventDataVisibilityMaskChangedKHR {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrEventDataVisibilityMaskChangedKHR.html"><code>XrEventDataVisibilityMaskChangedKHR</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrEventDataVisibilityMaskChangedKHR}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrEventDataVisibilityMaskChangedKHR to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrEventDataVisibilityMaskChangedKHR.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrEventDataVisibilityMaskChangedKHR, Iterable<XrEventDataVisibilityMaskChangedKHR> {
        public long size() {
            return segment.byteSize() / XrEventDataVisibilityMaskChangedKHR.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrEventDataVisibilityMaskChangedKHR at(long index) {
            return new XrEventDataVisibilityMaskChangedKHR(segment.asSlice(index * XrEventDataVisibilityMaskChangedKHR.BYTES, XrEventDataVisibilityMaskChangedKHR.BYTES));
        }

        public void write(long index, @NotNull XrEventDataVisibilityMaskChangedKHR value) {
            MemorySegment s = segment.asSlice(index * XrEventDataVisibilityMaskChangedKHR.BYTES, XrEventDataVisibilityMaskChangedKHR.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrEventDataVisibilityMaskChangedKHR.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrEventDataVisibilityMaskChangedKHR.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrEventDataVisibilityMaskChangedKHR.BYTES,
                (end - start) * XrEventDataVisibilityMaskChangedKHR.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrEventDataVisibilityMaskChangedKHR.BYTES));
        }

        public XrEventDataVisibilityMaskChangedKHR[] toArray() {
            XrEventDataVisibilityMaskChangedKHR[] ret = new XrEventDataVisibilityMaskChangedKHR[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrEventDataVisibilityMaskChangedKHR> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrEventDataVisibilityMaskChangedKHR> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrEventDataVisibilityMaskChangedKHR.BYTES;
            }

            @Override
            public XrEventDataVisibilityMaskChangedKHR next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrEventDataVisibilityMaskChangedKHR ret = new XrEventDataVisibilityMaskChangedKHR(segment.asSlice(0, XrEventDataVisibilityMaskChangedKHR.BYTES));
                segment = segment.asSlice(XrEventDataVisibilityMaskChangedKHR.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrEventDataVisibilityMaskChangedKHR allocate(Arena arena) {
        XrEventDataVisibilityMaskChangedKHR ret = new XrEventDataVisibilityMaskChangedKHR(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_EVENT_DATA_VISIBILITY_MASK_CHANGED_KHR);
        return ret;
    }

    public static XrEventDataVisibilityMaskChangedKHR.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrEventDataVisibilityMaskChangedKHR.Ptr ret = new XrEventDataVisibilityMaskChangedKHR.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_EVENT_DATA_VISIBILITY_MASK_CHANGED_KHR);
        }
        return ret;
    }

    public static XrEventDataVisibilityMaskChangedKHR clone(Arena arena, XrEventDataVisibilityMaskChangedKHR src) {
        XrEventDataVisibilityMaskChangedKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_EVENT_DATA_VISIBILITY_MASK_CHANGED_KHR);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrEventDataVisibilityMaskChangedKHR type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrEventDataVisibilityMaskChangedKHR next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrEventDataVisibilityMaskChangedKHR next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Nullable XrSession session() {
        MemorySegment s = segment.asSlice(OFFSET$session, SIZE$session);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrSession(s);
    }

    public XrEventDataVisibilityMaskChangedKHR session(@Nullable XrSession value) {
        segment.set(LAYOUT$session, OFFSET$session, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @EnumType(XrViewConfigurationType.class) int viewConfigurationType() {
        return segment.get(LAYOUT$viewConfigurationType, OFFSET$viewConfigurationType);
    }

    public XrEventDataVisibilityMaskChangedKHR viewConfigurationType(@EnumType(XrViewConfigurationType.class) int value) {
        segment.set(LAYOUT$viewConfigurationType, OFFSET$viewConfigurationType, value);
        return this;
    }

    public @Unsigned int viewIndex() {
        return segment.get(LAYOUT$viewIndex, OFFSET$viewIndex);
    }

    public XrEventDataVisibilityMaskChangedKHR viewIndex(@Unsigned int value) {
        segment.set(LAYOUT$viewIndex, OFFSET$viewIndex, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.ADDRESS.withName("session"),
        ValueLayout.JAVA_INT.withName("viewConfigurationType"),
        ValueLayout.JAVA_INT.withName("viewIndex")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$session = PathElement.groupElement("session");
    public static final PathElement PATH$viewConfigurationType = PathElement.groupElement("viewConfigurationType");
    public static final PathElement PATH$viewIndex = PathElement.groupElement("viewIndex");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final AddressLayout LAYOUT$session = (AddressLayout) LAYOUT.select(PATH$session);
    public static final OfInt LAYOUT$viewConfigurationType = (OfInt) LAYOUT.select(PATH$viewConfigurationType);
    public static final OfInt LAYOUT$viewIndex = (OfInt) LAYOUT.select(PATH$viewIndex);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$session = LAYOUT$session.byteSize();
    public static final long SIZE$viewConfigurationType = LAYOUT$viewConfigurationType.byteSize();
    public static final long SIZE$viewIndex = LAYOUT$viewIndex.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$session = LAYOUT.byteOffset(PATH$session);
    public static final long OFFSET$viewConfigurationType = LAYOUT.byteOffset(PATH$viewConfigurationType);
    public static final long OFFSET$viewIndex = LAYOUT.byteOffset(PATH$viewIndex);
}
