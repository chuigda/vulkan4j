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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrActiveActionSetPrioritiesEXT.html"><code>XrActiveActionSetPrioritiesEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrActiveActionSetPrioritiesEXT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     uint32_t actionSetPriorityCount; // @link substring="actionSetPriorityCount" target="#actionSetPriorityCount"
///     XrActiveActionSetPriorityEXT const* actionSetPriorities; // @link substring="XrActiveActionSetPriorityEXT" target="XrActiveActionSetPriorityEXT" @link substring="actionSetPriorities" target="#actionSetPriorities"
/// } XrActiveActionSetPrioritiesEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_ACTIVE_ACTION_SET_PRIORITIES_EXT`
///
/// The {@code allocate} ({@link XrActiveActionSetPrioritiesEXT#allocate(Arena)}, {@link XrActiveActionSetPrioritiesEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrActiveActionSetPrioritiesEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrActiveActionSetPrioritiesEXT.html"><code>XrActiveActionSetPrioritiesEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrActiveActionSetPrioritiesEXT(@NotNull MemorySegment segment) implements IXrActiveActionSetPrioritiesEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrActiveActionSetPrioritiesEXT.html"><code>XrActiveActionSetPrioritiesEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrActiveActionSetPrioritiesEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrActiveActionSetPrioritiesEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrActiveActionSetPrioritiesEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrActiveActionSetPrioritiesEXT, Iterable<XrActiveActionSetPrioritiesEXT> {
        public long size() {
            return segment.byteSize() / XrActiveActionSetPrioritiesEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrActiveActionSetPrioritiesEXT at(long index) {
            return new XrActiveActionSetPrioritiesEXT(segment.asSlice(index * XrActiveActionSetPrioritiesEXT.BYTES, XrActiveActionSetPrioritiesEXT.BYTES));
        }

        public void write(long index, @NotNull XrActiveActionSetPrioritiesEXT value) {
            MemorySegment s = segment.asSlice(index * XrActiveActionSetPrioritiesEXT.BYTES, XrActiveActionSetPrioritiesEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrActiveActionSetPrioritiesEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrActiveActionSetPrioritiesEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrActiveActionSetPrioritiesEXT.BYTES,
                (end - start) * XrActiveActionSetPrioritiesEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrActiveActionSetPrioritiesEXT.BYTES));
        }

        public XrActiveActionSetPrioritiesEXT[] toArray() {
            XrActiveActionSetPrioritiesEXT[] ret = new XrActiveActionSetPrioritiesEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrActiveActionSetPrioritiesEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrActiveActionSetPrioritiesEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrActiveActionSetPrioritiesEXT.BYTES;
            }

            @Override
            public XrActiveActionSetPrioritiesEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrActiveActionSetPrioritiesEXT ret = new XrActiveActionSetPrioritiesEXT(segment.asSlice(0, XrActiveActionSetPrioritiesEXT.BYTES));
                segment = segment.asSlice(XrActiveActionSetPrioritiesEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrActiveActionSetPrioritiesEXT allocate(Arena arena) {
        XrActiveActionSetPrioritiesEXT ret = new XrActiveActionSetPrioritiesEXT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_ACTIVE_ACTION_SET_PRIORITIES_EXT);
        return ret;
    }

    public static XrActiveActionSetPrioritiesEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrActiveActionSetPrioritiesEXT.Ptr ret = new XrActiveActionSetPrioritiesEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_ACTIVE_ACTION_SET_PRIORITIES_EXT);
        }
        return ret;
    }

    public static XrActiveActionSetPrioritiesEXT clone(Arena arena, XrActiveActionSetPrioritiesEXT src) {
        XrActiveActionSetPrioritiesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_ACTIVE_ACTION_SET_PRIORITIES_EXT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrActiveActionSetPrioritiesEXT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrActiveActionSetPrioritiesEXT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrActiveActionSetPrioritiesEXT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int actionSetPriorityCount() {
        return segment.get(LAYOUT$actionSetPriorityCount, OFFSET$actionSetPriorityCount);
    }

    public XrActiveActionSetPrioritiesEXT actionSetPriorityCount(@Unsigned int value) {
        segment.set(LAYOUT$actionSetPriorityCount, OFFSET$actionSetPriorityCount, value);
        return this;
    }

    public XrActiveActionSetPrioritiesEXT actionSetPriorities(@Nullable IXrActiveActionSetPriorityEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        actionSetPrioritiesRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrActiveActionSetPriorityEXT.Ptr actionSetPriorities(int assumedCount) {
        MemorySegment s = actionSetPrioritiesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrActiveActionSetPriorityEXT.BYTES);
        return new XrActiveActionSetPriorityEXT.Ptr(s);
    }

    public @Nullable XrActiveActionSetPriorityEXT actionSetPriorities() {
        MemorySegment s = actionSetPrioritiesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrActiveActionSetPriorityEXT(s);
    }

    public @Pointer(target=XrActiveActionSetPriorityEXT.class) @NotNull MemorySegment actionSetPrioritiesRaw() {
        return segment.get(LAYOUT$actionSetPriorities, OFFSET$actionSetPriorities);
    }

    public void actionSetPrioritiesRaw(@Pointer(target=XrActiveActionSetPriorityEXT.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$actionSetPriorities, OFFSET$actionSetPriorities, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("actionSetPriorityCount"),
        ValueLayout.ADDRESS.withTargetLayout(XrActiveActionSetPriorityEXT.LAYOUT).withName("actionSetPriorities")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$actionSetPriorityCount = PathElement.groupElement("actionSetPriorityCount");
    public static final PathElement PATH$actionSetPriorities = PathElement.groupElement("actionSetPriorities");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$actionSetPriorityCount = (OfInt) LAYOUT.select(PATH$actionSetPriorityCount);
    public static final AddressLayout LAYOUT$actionSetPriorities = (AddressLayout) LAYOUT.select(PATH$actionSetPriorities);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$actionSetPriorityCount = LAYOUT$actionSetPriorityCount.byteSize();
    public static final long SIZE$actionSetPriorities = LAYOUT$actionSetPriorities.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$actionSetPriorityCount = LAYOUT.byteOffset(PATH$actionSetPriorityCount);
    public static final long OFFSET$actionSetPriorities = LAYOUT.byteOffset(PATH$actionSetPriorities);
}
