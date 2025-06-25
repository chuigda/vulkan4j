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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialAnchorsQueryCompletionML.html"><code>XrSpatialAnchorsQueryCompletionML</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSpatialAnchorsQueryCompletionML {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     XrResult futureResult; // optional // @link substring="XrResult" target="XrResult" @link substring="futureResult" target="#futureResult"
///     uint32_t uuidCapacityInput; // optional // @link substring="uuidCapacityInput" target="#uuidCapacityInput"
///     uint32_t uuidCountOutput; // optional // @link substring="uuidCountOutput" target="#uuidCountOutput"
///     XrUuidEXT* uuids; // optional // @link substring="XrUuidEXT" target="XrUuidEXT" @link substring="uuids" target="#uuids"
/// } XrSpatialAnchorsQueryCompletionML;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SPATIAL_ANCHORS_QUERY_COMPLETION_ML`
///
/// The {@code allocate} ({@link XrSpatialAnchorsQueryCompletionML#allocate(Arena)}, {@link XrSpatialAnchorsQueryCompletionML#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSpatialAnchorsQueryCompletionML#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialAnchorsQueryCompletionML.html"><code>XrSpatialAnchorsQueryCompletionML</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSpatialAnchorsQueryCompletionML(@NotNull MemorySegment segment) implements IXrSpatialAnchorsQueryCompletionML {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialAnchorsQueryCompletionML.html"><code>XrSpatialAnchorsQueryCompletionML</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSpatialAnchorsQueryCompletionML}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSpatialAnchorsQueryCompletionML to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSpatialAnchorsQueryCompletionML.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSpatialAnchorsQueryCompletionML, Iterable<XrSpatialAnchorsQueryCompletionML> {
        public long size() {
            return segment.byteSize() / XrSpatialAnchorsQueryCompletionML.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSpatialAnchorsQueryCompletionML at(long index) {
            return new XrSpatialAnchorsQueryCompletionML(segment.asSlice(index * XrSpatialAnchorsQueryCompletionML.BYTES, XrSpatialAnchorsQueryCompletionML.BYTES));
        }

        public void write(long index, @NotNull XrSpatialAnchorsQueryCompletionML value) {
            MemorySegment s = segment.asSlice(index * XrSpatialAnchorsQueryCompletionML.BYTES, XrSpatialAnchorsQueryCompletionML.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSpatialAnchorsQueryCompletionML.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSpatialAnchorsQueryCompletionML.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSpatialAnchorsQueryCompletionML.BYTES,
                (end - start) * XrSpatialAnchorsQueryCompletionML.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSpatialAnchorsQueryCompletionML.BYTES));
        }

        public XrSpatialAnchorsQueryCompletionML[] toArray() {
            XrSpatialAnchorsQueryCompletionML[] ret = new XrSpatialAnchorsQueryCompletionML[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSpatialAnchorsQueryCompletionML> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSpatialAnchorsQueryCompletionML> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSpatialAnchorsQueryCompletionML.BYTES;
            }

            @Override
            public XrSpatialAnchorsQueryCompletionML next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSpatialAnchorsQueryCompletionML ret = new XrSpatialAnchorsQueryCompletionML(segment.asSlice(0, XrSpatialAnchorsQueryCompletionML.BYTES));
                segment = segment.asSlice(XrSpatialAnchorsQueryCompletionML.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSpatialAnchorsQueryCompletionML allocate(Arena arena) {
        XrSpatialAnchorsQueryCompletionML ret = new XrSpatialAnchorsQueryCompletionML(arena.allocate(LAYOUT));
        ret.type(XrStructureType.SPATIAL_ANCHORS_QUERY_COMPLETION_ML);
        return ret;
    }

    public static XrSpatialAnchorsQueryCompletionML.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSpatialAnchorsQueryCompletionML.Ptr ret = new XrSpatialAnchorsQueryCompletionML.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.SPATIAL_ANCHORS_QUERY_COMPLETION_ML);
        }
        return ret;
    }

    public static XrSpatialAnchorsQueryCompletionML clone(Arena arena, XrSpatialAnchorsQueryCompletionML src) {
        XrSpatialAnchorsQueryCompletionML ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.SPATIAL_ANCHORS_QUERY_COMPLETION_ML);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSpatialAnchorsQueryCompletionML type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSpatialAnchorsQueryCompletionML next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSpatialAnchorsQueryCompletionML next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @EnumType(XrResult.class) int futureResult() {
        return segment.get(LAYOUT$futureResult, OFFSET$futureResult);
    }

    public XrSpatialAnchorsQueryCompletionML futureResult(@EnumType(XrResult.class) int value) {
        segment.set(LAYOUT$futureResult, OFFSET$futureResult, value);
        return this;
    }

    public @Unsigned int uuidCapacityInput() {
        return segment.get(LAYOUT$uuidCapacityInput, OFFSET$uuidCapacityInput);
    }

    public XrSpatialAnchorsQueryCompletionML uuidCapacityInput(@Unsigned int value) {
        segment.set(LAYOUT$uuidCapacityInput, OFFSET$uuidCapacityInput, value);
        return this;
    }

    public @Unsigned int uuidCountOutput() {
        return segment.get(LAYOUT$uuidCountOutput, OFFSET$uuidCountOutput);
    }

    public XrSpatialAnchorsQueryCompletionML uuidCountOutput(@Unsigned int value) {
        segment.set(LAYOUT$uuidCountOutput, OFFSET$uuidCountOutput, value);
        return this;
    }

    public XrSpatialAnchorsQueryCompletionML uuids(@Nullable IXrUuidEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        uuidsRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrUuidEXT.Ptr uuids(int assumedCount) {
        MemorySegment s = uuidsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrUuidEXT.BYTES);
        return new XrUuidEXT.Ptr(s);
    }

    public @Nullable XrUuidEXT uuids() {
        MemorySegment s = uuidsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrUuidEXT(s);
    }

    public @Pointer(target=XrUuidEXT.class) @NotNull MemorySegment uuidsRaw() {
        return segment.get(LAYOUT$uuids, OFFSET$uuids);
    }

    public void uuidsRaw(@Pointer(target=XrUuidEXT.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$uuids, OFFSET$uuids, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("futureResult"),
        ValueLayout.JAVA_INT.withName("uuidCapacityInput"),
        ValueLayout.JAVA_INT.withName("uuidCountOutput"),
        ValueLayout.ADDRESS.withTargetLayout(XrUuidEXT.LAYOUT).withName("uuids")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$futureResult = PathElement.groupElement("futureResult");
    public static final PathElement PATH$uuidCapacityInput = PathElement.groupElement("uuidCapacityInput");
    public static final PathElement PATH$uuidCountOutput = PathElement.groupElement("uuidCountOutput");
    public static final PathElement PATH$uuids = PathElement.groupElement("uuids");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$futureResult = (OfInt) LAYOUT.select(PATH$futureResult);
    public static final OfInt LAYOUT$uuidCapacityInput = (OfInt) LAYOUT.select(PATH$uuidCapacityInput);
    public static final OfInt LAYOUT$uuidCountOutput = (OfInt) LAYOUT.select(PATH$uuidCountOutput);
    public static final AddressLayout LAYOUT$uuids = (AddressLayout) LAYOUT.select(PATH$uuids);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$futureResult = LAYOUT$futureResult.byteSize();
    public static final long SIZE$uuidCapacityInput = LAYOUT$uuidCapacityInput.byteSize();
    public static final long SIZE$uuidCountOutput = LAYOUT$uuidCountOutput.byteSize();
    public static final long SIZE$uuids = LAYOUT$uuids.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$futureResult = LAYOUT.byteOffset(PATH$futureResult);
    public static final long OFFSET$uuidCapacityInput = LAYOUT.byteOffset(PATH$uuidCapacityInput);
    public static final long OFFSET$uuidCountOutput = LAYOUT.byteOffset(PATH$uuidCountOutput);
    public static final long OFFSET$uuids = LAYOUT.byteOffset(PATH$uuids);
}
