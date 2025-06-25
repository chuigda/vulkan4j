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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrEventDataMainSessionVisibilityChangedEXTX.html"><code>XrEventDataMainSessionVisibilityChangedEXTX</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrEventDataMainSessionVisibilityChangedEXTX {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrBool32 visible; // @link substring="visible" target="#visible"
///     XrOverlayMainSessionFlagsEXTX flags; // @link substring="XrOverlayMainSessionFlagsEXTX" target="XrOverlayMainSessionFlagsEXTX" @link substring="flags" target="#flags"
/// } XrEventDataMainSessionVisibilityChangedEXTX;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_EVENT_DATA_MAIN_SESSION_VISIBILITY_CHANGED_EXTX`
///
/// The {@code allocate} ({@link XrEventDataMainSessionVisibilityChangedEXTX#allocate(Arena)}, {@link XrEventDataMainSessionVisibilityChangedEXTX#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrEventDataMainSessionVisibilityChangedEXTX#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrEventDataMainSessionVisibilityChangedEXTX.html"><code>XrEventDataMainSessionVisibilityChangedEXTX</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrEventDataMainSessionVisibilityChangedEXTX(@NotNull MemorySegment segment) implements IXrEventDataMainSessionVisibilityChangedEXTX {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrEventDataMainSessionVisibilityChangedEXTX.html"><code>XrEventDataMainSessionVisibilityChangedEXTX</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrEventDataMainSessionVisibilityChangedEXTX}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrEventDataMainSessionVisibilityChangedEXTX to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrEventDataMainSessionVisibilityChangedEXTX.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrEventDataMainSessionVisibilityChangedEXTX, Iterable<XrEventDataMainSessionVisibilityChangedEXTX> {
        public long size() {
            return segment.byteSize() / XrEventDataMainSessionVisibilityChangedEXTX.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrEventDataMainSessionVisibilityChangedEXTX at(long index) {
            return new XrEventDataMainSessionVisibilityChangedEXTX(segment.asSlice(index * XrEventDataMainSessionVisibilityChangedEXTX.BYTES, XrEventDataMainSessionVisibilityChangedEXTX.BYTES));
        }

        public void write(long index, @NotNull XrEventDataMainSessionVisibilityChangedEXTX value) {
            MemorySegment s = segment.asSlice(index * XrEventDataMainSessionVisibilityChangedEXTX.BYTES, XrEventDataMainSessionVisibilityChangedEXTX.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrEventDataMainSessionVisibilityChangedEXTX.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrEventDataMainSessionVisibilityChangedEXTX.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrEventDataMainSessionVisibilityChangedEXTX.BYTES,
                (end - start) * XrEventDataMainSessionVisibilityChangedEXTX.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrEventDataMainSessionVisibilityChangedEXTX.BYTES));
        }

        public XrEventDataMainSessionVisibilityChangedEXTX[] toArray() {
            XrEventDataMainSessionVisibilityChangedEXTX[] ret = new XrEventDataMainSessionVisibilityChangedEXTX[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrEventDataMainSessionVisibilityChangedEXTX> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrEventDataMainSessionVisibilityChangedEXTX> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrEventDataMainSessionVisibilityChangedEXTX.BYTES;
            }

            @Override
            public XrEventDataMainSessionVisibilityChangedEXTX next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrEventDataMainSessionVisibilityChangedEXTX ret = new XrEventDataMainSessionVisibilityChangedEXTX(segment.asSlice(0, XrEventDataMainSessionVisibilityChangedEXTX.BYTES));
                segment = segment.asSlice(XrEventDataMainSessionVisibilityChangedEXTX.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrEventDataMainSessionVisibilityChangedEXTX allocate(Arena arena) {
        XrEventDataMainSessionVisibilityChangedEXTX ret = new XrEventDataMainSessionVisibilityChangedEXTX(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_EVENT_DATA_MAIN_SESSION_VISIBILITY_CHANGED_EXTX);
        return ret;
    }

    public static XrEventDataMainSessionVisibilityChangedEXTX.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrEventDataMainSessionVisibilityChangedEXTX.Ptr ret = new XrEventDataMainSessionVisibilityChangedEXTX.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_EVENT_DATA_MAIN_SESSION_VISIBILITY_CHANGED_EXTX);
        }
        return ret;
    }

    public static XrEventDataMainSessionVisibilityChangedEXTX clone(Arena arena, XrEventDataMainSessionVisibilityChangedEXTX src) {
        XrEventDataMainSessionVisibilityChangedEXTX ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_EVENT_DATA_MAIN_SESSION_VISIBILITY_CHANGED_EXTX);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrEventDataMainSessionVisibilityChangedEXTX type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrEventDataMainSessionVisibilityChangedEXTX next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrEventDataMainSessionVisibilityChangedEXTX next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @NativeType("XrBool32") @Unsigned int visible() {
        return segment.get(LAYOUT$visible, OFFSET$visible);
    }

    public XrEventDataMainSessionVisibilityChangedEXTX visible(@NativeType("XrBool32") @Unsigned int value) {
        segment.set(LAYOUT$visible, OFFSET$visible, value);
        return this;
    }

    public @Bitmask(XrOverlayMainSessionFlagsEXTX.class) long flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public XrEventDataMainSessionVisibilityChangedEXTX flags(@Bitmask(XrOverlayMainSessionFlagsEXTX.class) long value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("visible"),
        ValueLayout.JAVA_LONG.withName("flags")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$visible = PathElement.groupElement("visible");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$visible = (OfInt) LAYOUT.select(PATH$visible);
    public static final OfLong LAYOUT$flags = (OfLong) LAYOUT.select(PATH$flags);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$visible = LAYOUT$visible.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$visible = LAYOUT.byteOffset(PATH$visible);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
}
