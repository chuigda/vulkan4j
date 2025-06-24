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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrViveTrackerPathsHTCX.html"><code>XrViveTrackerPathsHTCX</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrViveTrackerPathsHTCX {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     XrPath persistentPath; // @link substring="persistentPath" target="#persistentPath"
///     XrPath rolePath; // optional // @link substring="rolePath" target="#rolePath"
/// } XrViveTrackerPathsHTCX;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_VIVE_TRACKER_PATHS_HTCX`
///
/// The {@code allocate} ({@link XrViveTrackerPathsHTCX#allocate(Arena)}, {@link XrViveTrackerPathsHTCX#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrViveTrackerPathsHTCX#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrViveTrackerPathsHTCX.html"><code>XrViveTrackerPathsHTCX</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrViveTrackerPathsHTCX(@NotNull MemorySegment segment) implements IXrViveTrackerPathsHTCX {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrViveTrackerPathsHTCX.html"><code>XrViveTrackerPathsHTCX</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrViveTrackerPathsHTCX}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrViveTrackerPathsHTCX to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrViveTrackerPathsHTCX.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrViveTrackerPathsHTCX, Iterable<XrViveTrackerPathsHTCX> {
        public long size() {
            return segment.byteSize() / XrViveTrackerPathsHTCX.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrViveTrackerPathsHTCX at(long index) {
            return new XrViveTrackerPathsHTCX(segment.asSlice(index * XrViveTrackerPathsHTCX.BYTES, XrViveTrackerPathsHTCX.BYTES));
        }

        public void write(long index, @NotNull XrViveTrackerPathsHTCX value) {
            MemorySegment s = segment.asSlice(index * XrViveTrackerPathsHTCX.BYTES, XrViveTrackerPathsHTCX.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrViveTrackerPathsHTCX.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrViveTrackerPathsHTCX.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrViveTrackerPathsHTCX.BYTES,
                (end - start) * XrViveTrackerPathsHTCX.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrViveTrackerPathsHTCX.BYTES));
        }

        public XrViveTrackerPathsHTCX[] toArray() {
            XrViveTrackerPathsHTCX[] ret = new XrViveTrackerPathsHTCX[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrViveTrackerPathsHTCX> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrViveTrackerPathsHTCX> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrViveTrackerPathsHTCX.BYTES;
            }

            @Override
            public XrViveTrackerPathsHTCX next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrViveTrackerPathsHTCX ret = new XrViveTrackerPathsHTCX(segment.asSlice(0, XrViveTrackerPathsHTCX.BYTES));
                segment = segment.asSlice(XrViveTrackerPathsHTCX.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrViveTrackerPathsHTCX allocate(Arena arena) {
        XrViveTrackerPathsHTCX ret = new XrViveTrackerPathsHTCX(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_VIVE_TRACKER_PATHS_HTCX);
        return ret;
    }

    public static XrViveTrackerPathsHTCX.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrViveTrackerPathsHTCX.Ptr ret = new XrViveTrackerPathsHTCX.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_VIVE_TRACKER_PATHS_HTCX);
        }
        return ret;
    }

    public static XrViveTrackerPathsHTCX clone(Arena arena, XrViveTrackerPathsHTCX src) {
        XrViveTrackerPathsHTCX ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_VIVE_TRACKER_PATHS_HTCX);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrViveTrackerPathsHTCX type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrViveTrackerPathsHTCX next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrViveTrackerPathsHTCX next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @NativeType("XrPath") @Unsigned long persistentPath() {
        return segment.get(LAYOUT$persistentPath, OFFSET$persistentPath);
    }

    public XrViveTrackerPathsHTCX persistentPath(@NativeType("XrPath") @Unsigned long value) {
        segment.set(LAYOUT$persistentPath, OFFSET$persistentPath, value);
        return this;
    }

    public @NativeType("XrPath") @Unsigned long rolePath() {
        return segment.get(LAYOUT$rolePath, OFFSET$rolePath);
    }

    public XrViveTrackerPathsHTCX rolePath(@NativeType("XrPath") @Unsigned long value) {
        segment.set(LAYOUT$rolePath, OFFSET$rolePath, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_LONG.withName("persistentPath"),
        ValueLayout.JAVA_LONG.withName("rolePath")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$persistentPath = PathElement.groupElement("persistentPath");
    public static final PathElement PATH$rolePath = PathElement.groupElement("rolePath");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfLong LAYOUT$persistentPath = (OfLong) LAYOUT.select(PATH$persistentPath);
    public static final OfLong LAYOUT$rolePath = (OfLong) LAYOUT.select(PATH$rolePath);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$persistentPath = LAYOUT$persistentPath.byteSize();
    public static final long SIZE$rolePath = LAYOUT$rolePath.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$persistentPath = LAYOUT.byteOffset(PATH$persistentPath);
    public static final long OFFSET$rolePath = LAYOUT.byteOffset(PATH$rolePath);
}
