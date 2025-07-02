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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrActionsSyncInfo.html"><code>XrActionsSyncInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrActionsSyncInfo {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     uint32_t countActiveActionSets; // optional // @link substring="countActiveActionSets" target="#countActiveActionSets"
///     XrActiveActionSet const* activeActionSets; // optional // @link substring="XrActiveActionSet" target="XrActiveActionSet" @link substring="activeActionSets" target="#activeActionSets"
/// } XrActionsSyncInfo;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_ACTIONS_SYNC_INFO`
///
/// The {@code allocate} ({@link XrActionsSyncInfo#allocate(Arena)}, {@link XrActionsSyncInfo#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrActionsSyncInfo#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrActionsSyncInfo.html"><code>XrActionsSyncInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrActionsSyncInfo(@NotNull MemorySegment segment) implements IXrActionsSyncInfo {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrActionsSyncInfo.html"><code>XrActionsSyncInfo</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrActionsSyncInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrActionsSyncInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrActionsSyncInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrActionsSyncInfo, Iterable<XrActionsSyncInfo> {
        public long size() {
            return segment.byteSize() / XrActionsSyncInfo.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrActionsSyncInfo at(long index) {
            return new XrActionsSyncInfo(segment.asSlice(index * XrActionsSyncInfo.BYTES, XrActionsSyncInfo.BYTES));
        }

        public XrActionsSyncInfo.Ptr at(long index, @NotNull Consumer<@NotNull XrActionsSyncInfo> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrActionsSyncInfo value) {
            MemorySegment s = segment.asSlice(index * XrActionsSyncInfo.BYTES, XrActionsSyncInfo.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrActionsSyncInfo.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrActionsSyncInfo.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrActionsSyncInfo.BYTES,
                (end - start) * XrActionsSyncInfo.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrActionsSyncInfo.BYTES));
        }

        public XrActionsSyncInfo[] toArray() {
            XrActionsSyncInfo[] ret = new XrActionsSyncInfo[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrActionsSyncInfo> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrActionsSyncInfo> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrActionsSyncInfo.BYTES;
            }

            @Override
            public XrActionsSyncInfo next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrActionsSyncInfo ret = new XrActionsSyncInfo(segment.asSlice(0, XrActionsSyncInfo.BYTES));
                segment = segment.asSlice(XrActionsSyncInfo.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrActionsSyncInfo allocate(Arena arena) {
        XrActionsSyncInfo ret = new XrActionsSyncInfo(arena.allocate(LAYOUT));
        ret.type(XrStructureType.ACTIONS_SYNC_INFO);
        return ret;
    }

    public static XrActionsSyncInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrActionsSyncInfo.Ptr ret = new XrActionsSyncInfo.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.ACTIONS_SYNC_INFO);
        }
        return ret;
    }

    public static XrActionsSyncInfo clone(Arena arena, XrActionsSyncInfo src) {
        XrActionsSyncInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.ACTIONS_SYNC_INFO);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrActionsSyncInfo type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrActionsSyncInfo next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrActionsSyncInfo next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int countActiveActionSets() {
        return segment.get(LAYOUT$countActiveActionSets, OFFSET$countActiveActionSets);
    }

    public XrActionsSyncInfo countActiveActionSets(@Unsigned int value) {
        segment.set(LAYOUT$countActiveActionSets, OFFSET$countActiveActionSets, value);
        return this;
    }

    public XrActionsSyncInfo activeActionSets(@Nullable IXrActiveActionSet value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        activeActionSetsRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrActiveActionSet.Ptr activeActionSets(int assumedCount) {
        MemorySegment s = activeActionSetsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrActiveActionSet.BYTES);
        return new XrActiveActionSet.Ptr(s);
    }

    public @Nullable XrActiveActionSet activeActionSets() {
        MemorySegment s = activeActionSetsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrActiveActionSet(s);
    }

    public @Pointer(target=XrActiveActionSet.class) @NotNull MemorySegment activeActionSetsRaw() {
        return segment.get(LAYOUT$activeActionSets, OFFSET$activeActionSets);
    }

    public void activeActionSetsRaw(@Pointer(target=XrActiveActionSet.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$activeActionSets, OFFSET$activeActionSets, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("countActiveActionSets"),
        ValueLayout.ADDRESS.withTargetLayout(XrActiveActionSet.LAYOUT).withName("activeActionSets")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$countActiveActionSets = PathElement.groupElement("countActiveActionSets");
    public static final PathElement PATH$activeActionSets = PathElement.groupElement("activeActionSets");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$countActiveActionSets = (OfInt) LAYOUT.select(PATH$countActiveActionSets);
    public static final AddressLayout LAYOUT$activeActionSets = (AddressLayout) LAYOUT.select(PATH$activeActionSets);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$countActiveActionSets = LAYOUT$countActiveActionSets.byteSize();
    public static final long SIZE$activeActionSets = LAYOUT$activeActionSets.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$countActiveActionSets = LAYOUT.byteOffset(PATH$countActiveActionSets);
    public static final long OFFSET$activeActionSets = LAYOUT.byteOffset(PATH$activeActionSets);
}
