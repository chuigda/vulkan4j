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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialAnchorsDeleteCompletionDetailsML.html"><code>XrSpatialAnchorsDeleteCompletionDetailsML</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSpatialAnchorsDeleteCompletionDetailsML {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     uint32_t resultCount; // @link substring="resultCount" target="#resultCount"
///     XrSpatialAnchorCompletionResultML* results; // @link substring="XrSpatialAnchorCompletionResultML" target="XrSpatialAnchorCompletionResultML" @link substring="results" target="#results"
/// } XrSpatialAnchorsDeleteCompletionDetailsML;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SPATIAL_ANCHORS_DELETE_COMPLETION_DETAILS_ML`
///
/// The {@code allocate} ({@link XrSpatialAnchorsDeleteCompletionDetailsML#allocate(Arena)}, {@link XrSpatialAnchorsDeleteCompletionDetailsML#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSpatialAnchorsDeleteCompletionDetailsML#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialAnchorsDeleteCompletionDetailsML.html"><code>XrSpatialAnchorsDeleteCompletionDetailsML</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSpatialAnchorsDeleteCompletionDetailsML(@NotNull MemorySegment segment) implements IXrSpatialAnchorsDeleteCompletionDetailsML {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialAnchorsDeleteCompletionDetailsML.html"><code>XrSpatialAnchorsDeleteCompletionDetailsML</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSpatialAnchorsDeleteCompletionDetailsML}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSpatialAnchorsDeleteCompletionDetailsML to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSpatialAnchorsDeleteCompletionDetailsML.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSpatialAnchorsDeleteCompletionDetailsML, Iterable<XrSpatialAnchorsDeleteCompletionDetailsML> {
        public long size() {
            return segment.byteSize() / XrSpatialAnchorsDeleteCompletionDetailsML.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSpatialAnchorsDeleteCompletionDetailsML at(long index) {
            return new XrSpatialAnchorsDeleteCompletionDetailsML(segment.asSlice(index * XrSpatialAnchorsDeleteCompletionDetailsML.BYTES, XrSpatialAnchorsDeleteCompletionDetailsML.BYTES));
        }

        public XrSpatialAnchorsDeleteCompletionDetailsML.Ptr at(long index, @NotNull Consumer<@NotNull XrSpatialAnchorsDeleteCompletionDetailsML> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrSpatialAnchorsDeleteCompletionDetailsML value) {
            MemorySegment s = segment.asSlice(index * XrSpatialAnchorsDeleteCompletionDetailsML.BYTES, XrSpatialAnchorsDeleteCompletionDetailsML.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSpatialAnchorsDeleteCompletionDetailsML.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSpatialAnchorsDeleteCompletionDetailsML.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSpatialAnchorsDeleteCompletionDetailsML.BYTES,
                (end - start) * XrSpatialAnchorsDeleteCompletionDetailsML.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSpatialAnchorsDeleteCompletionDetailsML.BYTES));
        }

        public XrSpatialAnchorsDeleteCompletionDetailsML[] toArray() {
            XrSpatialAnchorsDeleteCompletionDetailsML[] ret = new XrSpatialAnchorsDeleteCompletionDetailsML[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSpatialAnchorsDeleteCompletionDetailsML> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSpatialAnchorsDeleteCompletionDetailsML> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSpatialAnchorsDeleteCompletionDetailsML.BYTES;
            }

            @Override
            public XrSpatialAnchorsDeleteCompletionDetailsML next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSpatialAnchorsDeleteCompletionDetailsML ret = new XrSpatialAnchorsDeleteCompletionDetailsML(segment.asSlice(0, XrSpatialAnchorsDeleteCompletionDetailsML.BYTES));
                segment = segment.asSlice(XrSpatialAnchorsDeleteCompletionDetailsML.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSpatialAnchorsDeleteCompletionDetailsML allocate(Arena arena) {
        XrSpatialAnchorsDeleteCompletionDetailsML ret = new XrSpatialAnchorsDeleteCompletionDetailsML(arena.allocate(LAYOUT));
        ret.type(XrStructureType.SPATIAL_ANCHORS_DELETE_COMPLETION_DETAILS_ML);
        return ret;
    }

    public static XrSpatialAnchorsDeleteCompletionDetailsML.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSpatialAnchorsDeleteCompletionDetailsML.Ptr ret = new XrSpatialAnchorsDeleteCompletionDetailsML.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.SPATIAL_ANCHORS_DELETE_COMPLETION_DETAILS_ML);
        }
        return ret;
    }

    public static XrSpatialAnchorsDeleteCompletionDetailsML clone(Arena arena, XrSpatialAnchorsDeleteCompletionDetailsML src) {
        XrSpatialAnchorsDeleteCompletionDetailsML ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.SPATIAL_ANCHORS_DELETE_COMPLETION_DETAILS_ML);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSpatialAnchorsDeleteCompletionDetailsML type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSpatialAnchorsDeleteCompletionDetailsML next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSpatialAnchorsDeleteCompletionDetailsML next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int resultCount() {
        return segment.get(LAYOUT$resultCount, OFFSET$resultCount);
    }

    public XrSpatialAnchorsDeleteCompletionDetailsML resultCount(@Unsigned int value) {
        segment.set(LAYOUT$resultCount, OFFSET$resultCount, value);
        return this;
    }

    public XrSpatialAnchorsDeleteCompletionDetailsML results(@Nullable IXrSpatialAnchorCompletionResultML value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        resultsRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrSpatialAnchorCompletionResultML.Ptr results(int assumedCount) {
        MemorySegment s = resultsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrSpatialAnchorCompletionResultML.BYTES);
        return new XrSpatialAnchorCompletionResultML.Ptr(s);
    }

    public @Nullable XrSpatialAnchorCompletionResultML results() {
        MemorySegment s = resultsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrSpatialAnchorCompletionResultML(s);
    }

    public @Pointer(target=XrSpatialAnchorCompletionResultML.class) @NotNull MemorySegment resultsRaw() {
        return segment.get(LAYOUT$results, OFFSET$results);
    }

    public void resultsRaw(@Pointer(target=XrSpatialAnchorCompletionResultML.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$results, OFFSET$results, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("resultCount"),
        ValueLayout.ADDRESS.withTargetLayout(XrSpatialAnchorCompletionResultML.LAYOUT).withName("results")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$resultCount = PathElement.groupElement("resultCount");
    public static final PathElement PATH$results = PathElement.groupElement("results");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$resultCount = (OfInt) LAYOUT.select(PATH$resultCount);
    public static final AddressLayout LAYOUT$results = (AddressLayout) LAYOUT.select(PATH$results);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$resultCount = LAYOUT$resultCount.byteSize();
    public static final long SIZE$results = LAYOUT$results.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$resultCount = LAYOUT.byteOffset(PATH$resultCount);
    public static final long OFFSET$results = LAYOUT.byteOffset(PATH$results);
}
