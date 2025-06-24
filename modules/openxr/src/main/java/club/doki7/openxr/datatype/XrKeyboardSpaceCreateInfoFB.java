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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrKeyboardSpaceCreateInfoFB.html"><code>XrKeyboardSpaceCreateInfoFB</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrKeyboardSpaceCreateInfoFB {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     uint64_t trackedKeyboardId; // @link substring="trackedKeyboardId" target="#trackedKeyboardId"
/// } XrKeyboardSpaceCreateInfoFB;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_KEYBOARD_SPACE_CREATE_INFO_FB`
///
/// The {@code allocate} ({@link XrKeyboardSpaceCreateInfoFB#allocate(Arena)}, {@link XrKeyboardSpaceCreateInfoFB#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrKeyboardSpaceCreateInfoFB#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrKeyboardSpaceCreateInfoFB.html"><code>XrKeyboardSpaceCreateInfoFB</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrKeyboardSpaceCreateInfoFB(@NotNull MemorySegment segment) implements IXrKeyboardSpaceCreateInfoFB {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrKeyboardSpaceCreateInfoFB.html"><code>XrKeyboardSpaceCreateInfoFB</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrKeyboardSpaceCreateInfoFB}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrKeyboardSpaceCreateInfoFB to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrKeyboardSpaceCreateInfoFB.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrKeyboardSpaceCreateInfoFB, Iterable<XrKeyboardSpaceCreateInfoFB> {
        public long size() {
            return segment.byteSize() / XrKeyboardSpaceCreateInfoFB.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrKeyboardSpaceCreateInfoFB at(long index) {
            return new XrKeyboardSpaceCreateInfoFB(segment.asSlice(index * XrKeyboardSpaceCreateInfoFB.BYTES, XrKeyboardSpaceCreateInfoFB.BYTES));
        }

        public void write(long index, @NotNull XrKeyboardSpaceCreateInfoFB value) {
            MemorySegment s = segment.asSlice(index * XrKeyboardSpaceCreateInfoFB.BYTES, XrKeyboardSpaceCreateInfoFB.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrKeyboardSpaceCreateInfoFB.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrKeyboardSpaceCreateInfoFB.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrKeyboardSpaceCreateInfoFB.BYTES,
                (end - start) * XrKeyboardSpaceCreateInfoFB.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrKeyboardSpaceCreateInfoFB.BYTES));
        }

        public XrKeyboardSpaceCreateInfoFB[] toArray() {
            XrKeyboardSpaceCreateInfoFB[] ret = new XrKeyboardSpaceCreateInfoFB[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrKeyboardSpaceCreateInfoFB> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrKeyboardSpaceCreateInfoFB> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrKeyboardSpaceCreateInfoFB.BYTES;
            }

            @Override
            public XrKeyboardSpaceCreateInfoFB next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrKeyboardSpaceCreateInfoFB ret = new XrKeyboardSpaceCreateInfoFB(segment.asSlice(0, XrKeyboardSpaceCreateInfoFB.BYTES));
                segment = segment.asSlice(XrKeyboardSpaceCreateInfoFB.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrKeyboardSpaceCreateInfoFB allocate(Arena arena) {
        XrKeyboardSpaceCreateInfoFB ret = new XrKeyboardSpaceCreateInfoFB(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_KEYBOARD_SPACE_CREATE_INFO_FB);
        return ret;
    }

    public static XrKeyboardSpaceCreateInfoFB.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrKeyboardSpaceCreateInfoFB.Ptr ret = new XrKeyboardSpaceCreateInfoFB.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_KEYBOARD_SPACE_CREATE_INFO_FB);
        }
        return ret;
    }

    public static XrKeyboardSpaceCreateInfoFB clone(Arena arena, XrKeyboardSpaceCreateInfoFB src) {
        XrKeyboardSpaceCreateInfoFB ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_KEYBOARD_SPACE_CREATE_INFO_FB);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrKeyboardSpaceCreateInfoFB type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrKeyboardSpaceCreateInfoFB next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrKeyboardSpaceCreateInfoFB next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned long trackedKeyboardId() {
        return segment.get(LAYOUT$trackedKeyboardId, OFFSET$trackedKeyboardId);
    }

    public XrKeyboardSpaceCreateInfoFB trackedKeyboardId(@Unsigned long value) {
        segment.set(LAYOUT$trackedKeyboardId, OFFSET$trackedKeyboardId, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_LONG.withName("trackedKeyboardId")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$trackedKeyboardId = PathElement.groupElement("trackedKeyboardId");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfLong LAYOUT$trackedKeyboardId = (OfLong) LAYOUT.select(PATH$trackedKeyboardId);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$trackedKeyboardId = LAYOUT$trackedKeyboardId.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$trackedKeyboardId = LAYOUT.byteOffset(PATH$trackedKeyboardId);
}
