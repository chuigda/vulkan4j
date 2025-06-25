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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSessionActionSetsAttachInfo.html"><code>XrSessionActionSetsAttachInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSessionActionSetsAttachInfo {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     uint32_t countActionSets; // @link substring="countActionSets" target="#countActionSets"
///     XrActionSet const* actionSets; // @link substring="XrActionSet" target="XrActionSet" @link substring="actionSets" target="#actionSets"
/// } XrSessionActionSetsAttachInfo;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SESSION_ACTION_SETS_ATTACH_INFO`
///
/// The {@code allocate} ({@link XrSessionActionSetsAttachInfo#allocate(Arena)}, {@link XrSessionActionSetsAttachInfo#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSessionActionSetsAttachInfo#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSessionActionSetsAttachInfo.html"><code>XrSessionActionSetsAttachInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSessionActionSetsAttachInfo(@NotNull MemorySegment segment) implements IXrSessionActionSetsAttachInfo {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSessionActionSetsAttachInfo.html"><code>XrSessionActionSetsAttachInfo</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSessionActionSetsAttachInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSessionActionSetsAttachInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSessionActionSetsAttachInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSessionActionSetsAttachInfo, Iterable<XrSessionActionSetsAttachInfo> {
        public long size() {
            return segment.byteSize() / XrSessionActionSetsAttachInfo.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSessionActionSetsAttachInfo at(long index) {
            return new XrSessionActionSetsAttachInfo(segment.asSlice(index * XrSessionActionSetsAttachInfo.BYTES, XrSessionActionSetsAttachInfo.BYTES));
        }

        public void write(long index, @NotNull XrSessionActionSetsAttachInfo value) {
            MemorySegment s = segment.asSlice(index * XrSessionActionSetsAttachInfo.BYTES, XrSessionActionSetsAttachInfo.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSessionActionSetsAttachInfo.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSessionActionSetsAttachInfo.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSessionActionSetsAttachInfo.BYTES,
                (end - start) * XrSessionActionSetsAttachInfo.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSessionActionSetsAttachInfo.BYTES));
        }

        public XrSessionActionSetsAttachInfo[] toArray() {
            XrSessionActionSetsAttachInfo[] ret = new XrSessionActionSetsAttachInfo[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSessionActionSetsAttachInfo> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSessionActionSetsAttachInfo> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSessionActionSetsAttachInfo.BYTES;
            }

            @Override
            public XrSessionActionSetsAttachInfo next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSessionActionSetsAttachInfo ret = new XrSessionActionSetsAttachInfo(segment.asSlice(0, XrSessionActionSetsAttachInfo.BYTES));
                segment = segment.asSlice(XrSessionActionSetsAttachInfo.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSessionActionSetsAttachInfo allocate(Arena arena) {
        XrSessionActionSetsAttachInfo ret = new XrSessionActionSetsAttachInfo(arena.allocate(LAYOUT));
        ret.type(XrStructureType.SESSION_ACTION_SETS_ATTACH_INFO);
        return ret;
    }

    public static XrSessionActionSetsAttachInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSessionActionSetsAttachInfo.Ptr ret = new XrSessionActionSetsAttachInfo.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.SESSION_ACTION_SETS_ATTACH_INFO);
        }
        return ret;
    }

    public static XrSessionActionSetsAttachInfo clone(Arena arena, XrSessionActionSetsAttachInfo src) {
        XrSessionActionSetsAttachInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.SESSION_ACTION_SETS_ATTACH_INFO);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSessionActionSetsAttachInfo type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSessionActionSetsAttachInfo next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSessionActionSetsAttachInfo next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int countActionSets() {
        return segment.get(LAYOUT$countActionSets, OFFSET$countActionSets);
    }

    public XrSessionActionSetsAttachInfo countActionSets(@Unsigned int value) {
        segment.set(LAYOUT$countActionSets, OFFSET$countActionSets, value);
        return this;
    }

    /// Note: the returned {@link XrActionSet.Ptr} does not have correct {@link XrActionSet.Ptr#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link XrActionSet.Ptr#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable XrActionSet.Ptr actionSets() {
        MemorySegment s = actionSetsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrActionSet.Ptr(s);
    }

    public XrSessionActionSetsAttachInfo actionSets(@Nullable XrActionSet.Ptr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        actionSetsRaw(s);
        return this;
    }

    public @Pointer(target=XrActionSet.class) @NotNull MemorySegment actionSetsRaw() {
        return segment.get(LAYOUT$actionSets, OFFSET$actionSets);
    }

    public void actionSetsRaw(@Pointer(target=XrActionSet.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$actionSets, OFFSET$actionSets, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("countActionSets"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("actionSets")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$countActionSets = PathElement.groupElement("countActionSets");
    public static final PathElement PATH$actionSets = PathElement.groupElement("actionSets");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$countActionSets = (OfInt) LAYOUT.select(PATH$countActionSets);
    public static final AddressLayout LAYOUT$actionSets = (AddressLayout) LAYOUT.select(PATH$actionSets);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$countActionSets = LAYOUT$countActionSets.byteSize();
    public static final long SIZE$actionSets = LAYOUT$actionSets.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$countActionSets = LAYOUT.byteOffset(PATH$countActionSets);
    public static final long OFFSET$actionSets = LAYOUT.byteOffset(PATH$actionSets);
}
