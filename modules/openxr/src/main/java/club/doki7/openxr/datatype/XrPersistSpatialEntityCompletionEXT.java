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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPersistSpatialEntityCompletionEXT.html"><code>XrPersistSpatialEntityCompletionEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrPersistSpatialEntityCompletionEXT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     XrResult futureResult; // @link substring="XrResult" target="XrResult" @link substring="futureResult" target="#futureResult"
///     XrSpatialPersistenceContextResultEXT persistResult; // @link substring="XrSpatialPersistenceContextResultEXT" target="XrSpatialPersistenceContextResultEXT" @link substring="persistResult" target="#persistResult"
///     XrUuid persistUuid; // @link substring="XrUuid" target="XrUuid" @link substring="persistUuid" target="#persistUuid"
/// } XrPersistSpatialEntityCompletionEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_PERSIST_SPATIAL_ENTITY_COMPLETION_EXT`
///
/// The {@code allocate} ({@link XrPersistSpatialEntityCompletionEXT#allocate(Arena)}, {@link XrPersistSpatialEntityCompletionEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrPersistSpatialEntityCompletionEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPersistSpatialEntityCompletionEXT.html"><code>XrPersistSpatialEntityCompletionEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrPersistSpatialEntityCompletionEXT(@NotNull MemorySegment segment) implements IXrPersistSpatialEntityCompletionEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrPersistSpatialEntityCompletionEXT.html"><code>XrPersistSpatialEntityCompletionEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrPersistSpatialEntityCompletionEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrPersistSpatialEntityCompletionEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrPersistSpatialEntityCompletionEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrPersistSpatialEntityCompletionEXT, Iterable<XrPersistSpatialEntityCompletionEXT> {
        public long size() {
            return segment.byteSize() / XrPersistSpatialEntityCompletionEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrPersistSpatialEntityCompletionEXT at(long index) {
            return new XrPersistSpatialEntityCompletionEXT(segment.asSlice(index * XrPersistSpatialEntityCompletionEXT.BYTES, XrPersistSpatialEntityCompletionEXT.BYTES));
        }

        public XrPersistSpatialEntityCompletionEXT.Ptr at(long index, @NotNull Consumer<@NotNull XrPersistSpatialEntityCompletionEXT> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrPersistSpatialEntityCompletionEXT value) {
            MemorySegment s = segment.asSlice(index * XrPersistSpatialEntityCompletionEXT.BYTES, XrPersistSpatialEntityCompletionEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrPersistSpatialEntityCompletionEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrPersistSpatialEntityCompletionEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrPersistSpatialEntityCompletionEXT.BYTES,
                (end - start) * XrPersistSpatialEntityCompletionEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrPersistSpatialEntityCompletionEXT.BYTES));
        }

        public XrPersistSpatialEntityCompletionEXT[] toArray() {
            XrPersistSpatialEntityCompletionEXT[] ret = new XrPersistSpatialEntityCompletionEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrPersistSpatialEntityCompletionEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrPersistSpatialEntityCompletionEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrPersistSpatialEntityCompletionEXT.BYTES;
            }

            @Override
            public XrPersistSpatialEntityCompletionEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrPersistSpatialEntityCompletionEXT ret = new XrPersistSpatialEntityCompletionEXT(segment.asSlice(0, XrPersistSpatialEntityCompletionEXT.BYTES));
                segment = segment.asSlice(XrPersistSpatialEntityCompletionEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrPersistSpatialEntityCompletionEXT allocate(Arena arena) {
        XrPersistSpatialEntityCompletionEXT ret = new XrPersistSpatialEntityCompletionEXT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.PERSIST_SPATIAL_ENTITY_COMPLETION_EXT);
        return ret;
    }

    public static XrPersistSpatialEntityCompletionEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrPersistSpatialEntityCompletionEXT.Ptr ret = new XrPersistSpatialEntityCompletionEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.PERSIST_SPATIAL_ENTITY_COMPLETION_EXT);
        }
        return ret;
    }

    public static XrPersistSpatialEntityCompletionEXT clone(Arena arena, XrPersistSpatialEntityCompletionEXT src) {
        XrPersistSpatialEntityCompletionEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.PERSIST_SPATIAL_ENTITY_COMPLETION_EXT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrPersistSpatialEntityCompletionEXT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrPersistSpatialEntityCompletionEXT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrPersistSpatialEntityCompletionEXT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @EnumType(XrResult.class) int futureResult() {
        return segment.get(LAYOUT$futureResult, OFFSET$futureResult);
    }

    public XrPersistSpatialEntityCompletionEXT futureResult(@EnumType(XrResult.class) int value) {
        segment.set(LAYOUT$futureResult, OFFSET$futureResult, value);
        return this;
    }

    public @EnumType(XrSpatialPersistenceContextResultEXT.class) int persistResult() {
        return segment.get(LAYOUT$persistResult, OFFSET$persistResult);
    }

    public XrPersistSpatialEntityCompletionEXT persistResult(@EnumType(XrSpatialPersistenceContextResultEXT.class) int value) {
        segment.set(LAYOUT$persistResult, OFFSET$persistResult, value);
        return this;
    }

    public @NotNull XrUuid persistUuid() {
        return new XrUuid(segment.asSlice(OFFSET$persistUuid, LAYOUT$persistUuid));
    }

    public XrPersistSpatialEntityCompletionEXT persistUuid(@NotNull XrUuid value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$persistUuid, SIZE$persistUuid);
        return this;
    }

    public XrPersistSpatialEntityCompletionEXT persistUuid(Consumer<@NotNull XrUuid> consumer) {
        consumer.accept(persistUuid());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("futureResult"),
        ValueLayout.JAVA_INT.withName("persistResult"),
        XrUuid.LAYOUT.withName("persistUuid")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$futureResult = PathElement.groupElement("futureResult");
    public static final PathElement PATH$persistResult = PathElement.groupElement("persistResult");
    public static final PathElement PATH$persistUuid = PathElement.groupElement("persistUuid");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$futureResult = (OfInt) LAYOUT.select(PATH$futureResult);
    public static final OfInt LAYOUT$persistResult = (OfInt) LAYOUT.select(PATH$persistResult);
    public static final StructLayout LAYOUT$persistUuid = (StructLayout) LAYOUT.select(PATH$persistUuid);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$futureResult = LAYOUT$futureResult.byteSize();
    public static final long SIZE$persistResult = LAYOUT$persistResult.byteSize();
    public static final long SIZE$persistUuid = LAYOUT$persistUuid.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$futureResult = LAYOUT.byteOffset(PATH$futureResult);
    public static final long OFFSET$persistResult = LAYOUT.byteOffset(PATH$persistResult);
    public static final long OFFSET$persistUuid = LAYOUT.byteOffset(PATH$persistUuid);
}
