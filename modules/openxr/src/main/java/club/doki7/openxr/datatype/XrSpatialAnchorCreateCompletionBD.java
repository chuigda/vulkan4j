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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialAnchorCreateCompletionBD.html"><code>XrSpatialAnchorCreateCompletionBD</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSpatialAnchorCreateCompletionBD {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     XrResult futureResult; // @link substring="XrResult" target="XrResult" @link substring="futureResult" target="#futureResult"
///     XrAnchorBD anchor; // @link substring="XrAnchorBD" target="XrAnchorBD" @link substring="anchor" target="#anchor"
///     XrUuidEXT uuid; // @link substring="XrUuidEXT" target="XrUuidEXT" @link substring="uuid" target="#uuid"
/// } XrSpatialAnchorCreateCompletionBD;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SPATIAL_ANCHOR_CREATE_COMPLETION_BD`
///
/// The {@code allocate} ({@link XrSpatialAnchorCreateCompletionBD#allocate(Arena)}, {@link XrSpatialAnchorCreateCompletionBD#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSpatialAnchorCreateCompletionBD#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialAnchorCreateCompletionBD.html"><code>XrSpatialAnchorCreateCompletionBD</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSpatialAnchorCreateCompletionBD(@NotNull MemorySegment segment) implements IXrSpatialAnchorCreateCompletionBD {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialAnchorCreateCompletionBD.html"><code>XrSpatialAnchorCreateCompletionBD</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSpatialAnchorCreateCompletionBD}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSpatialAnchorCreateCompletionBD to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSpatialAnchorCreateCompletionBD.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSpatialAnchorCreateCompletionBD, Iterable<XrSpatialAnchorCreateCompletionBD> {
        public long size() {
            return segment.byteSize() / XrSpatialAnchorCreateCompletionBD.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSpatialAnchorCreateCompletionBD at(long index) {
            return new XrSpatialAnchorCreateCompletionBD(segment.asSlice(index * XrSpatialAnchorCreateCompletionBD.BYTES, XrSpatialAnchorCreateCompletionBD.BYTES));
        }

        public XrSpatialAnchorCreateCompletionBD.Ptr at(long index, @NotNull Consumer<@NotNull XrSpatialAnchorCreateCompletionBD> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrSpatialAnchorCreateCompletionBD value) {
            MemorySegment s = segment.asSlice(index * XrSpatialAnchorCreateCompletionBD.BYTES, XrSpatialAnchorCreateCompletionBD.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSpatialAnchorCreateCompletionBD.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSpatialAnchorCreateCompletionBD.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSpatialAnchorCreateCompletionBD.BYTES,
                (end - start) * XrSpatialAnchorCreateCompletionBD.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSpatialAnchorCreateCompletionBD.BYTES));
        }

        public XrSpatialAnchorCreateCompletionBD[] toArray() {
            XrSpatialAnchorCreateCompletionBD[] ret = new XrSpatialAnchorCreateCompletionBD[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSpatialAnchorCreateCompletionBD> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSpatialAnchorCreateCompletionBD> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSpatialAnchorCreateCompletionBD.BYTES;
            }

            @Override
            public XrSpatialAnchorCreateCompletionBD next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSpatialAnchorCreateCompletionBD ret = new XrSpatialAnchorCreateCompletionBD(segment.asSlice(0, XrSpatialAnchorCreateCompletionBD.BYTES));
                segment = segment.asSlice(XrSpatialAnchorCreateCompletionBD.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSpatialAnchorCreateCompletionBD allocate(Arena arena) {
        XrSpatialAnchorCreateCompletionBD ret = new XrSpatialAnchorCreateCompletionBD(arena.allocate(LAYOUT));
        ret.type(XrStructureType.SPATIAL_ANCHOR_CREATE_COMPLETION_BD);
        return ret;
    }

    public static XrSpatialAnchorCreateCompletionBD.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSpatialAnchorCreateCompletionBD.Ptr ret = new XrSpatialAnchorCreateCompletionBD.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.SPATIAL_ANCHOR_CREATE_COMPLETION_BD);
        }
        return ret;
    }

    public static XrSpatialAnchorCreateCompletionBD clone(Arena arena, XrSpatialAnchorCreateCompletionBD src) {
        XrSpatialAnchorCreateCompletionBD ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.SPATIAL_ANCHOR_CREATE_COMPLETION_BD);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSpatialAnchorCreateCompletionBD type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSpatialAnchorCreateCompletionBD next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSpatialAnchorCreateCompletionBD next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @EnumType(XrResult.class) int futureResult() {
        return segment.get(LAYOUT$futureResult, OFFSET$futureResult);
    }

    public XrSpatialAnchorCreateCompletionBD futureResult(@EnumType(XrResult.class) int value) {
        segment.set(LAYOUT$futureResult, OFFSET$futureResult, value);
        return this;
    }

    public @Nullable XrAnchorBD anchor() {
        MemorySegment s = segment.asSlice(OFFSET$anchor, SIZE$anchor);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrAnchorBD(s);
    }

    public XrSpatialAnchorCreateCompletionBD anchor(@Nullable XrAnchorBD value) {
        segment.set(LAYOUT$anchor, OFFSET$anchor, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @NotNull XrUuidEXT uuid() {
        return new XrUuidEXT(segment.asSlice(OFFSET$uuid, LAYOUT$uuid));
    }

    public XrSpatialAnchorCreateCompletionBD uuid(@NotNull XrUuidEXT value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$uuid, SIZE$uuid);
        return this;
    }

    public XrSpatialAnchorCreateCompletionBD uuid(Consumer<@NotNull XrUuidEXT> consumer) {
        consumer.accept(uuid());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("futureResult"),
        ValueLayout.ADDRESS.withName("anchor"),
        XrUuidEXT.LAYOUT.withName("uuid")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$futureResult = PathElement.groupElement("futureResult");
    public static final PathElement PATH$anchor = PathElement.groupElement("anchor");
    public static final PathElement PATH$uuid = PathElement.groupElement("uuid");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$futureResult = (OfInt) LAYOUT.select(PATH$futureResult);
    public static final AddressLayout LAYOUT$anchor = (AddressLayout) LAYOUT.select(PATH$anchor);
    public static final StructLayout LAYOUT$uuid = (StructLayout) LAYOUT.select(PATH$uuid);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$futureResult = LAYOUT$futureResult.byteSize();
    public static final long SIZE$anchor = LAYOUT$anchor.byteSize();
    public static final long SIZE$uuid = LAYOUT$uuid.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$futureResult = LAYOUT.byteOffset(PATH$futureResult);
    public static final long OFFSET$anchor = LAYOUT.byteOffset(PATH$anchor);
    public static final long OFFSET$uuid = LAYOUT.byteOffset(PATH$uuid);
}
