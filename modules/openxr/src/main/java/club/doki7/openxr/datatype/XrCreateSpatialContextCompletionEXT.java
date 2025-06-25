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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrCreateSpatialContextCompletionEXT.html"><code>XrCreateSpatialContextCompletionEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrCreateSpatialContextCompletionEXT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     XrResult futureResult; // @link substring="XrResult" target="XrResult" @link substring="futureResult" target="#futureResult"
///     XrSpatialContextEXT spatialContext; // optional // @link substring="XrSpatialContextEXT" target="XrSpatialContextEXT" @link substring="spatialContext" target="#spatialContext"
/// } XrCreateSpatialContextCompletionEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_CREATE_SPATIAL_CONTEXT_COMPLETION_EXT`
///
/// The {@code allocate} ({@link XrCreateSpatialContextCompletionEXT#allocate(Arena)}, {@link XrCreateSpatialContextCompletionEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrCreateSpatialContextCompletionEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrCreateSpatialContextCompletionEXT.html"><code>XrCreateSpatialContextCompletionEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrCreateSpatialContextCompletionEXT(@NotNull MemorySegment segment) implements IXrCreateSpatialContextCompletionEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrCreateSpatialContextCompletionEXT.html"><code>XrCreateSpatialContextCompletionEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrCreateSpatialContextCompletionEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrCreateSpatialContextCompletionEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrCreateSpatialContextCompletionEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrCreateSpatialContextCompletionEXT, Iterable<XrCreateSpatialContextCompletionEXT> {
        public long size() {
            return segment.byteSize() / XrCreateSpatialContextCompletionEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrCreateSpatialContextCompletionEXT at(long index) {
            return new XrCreateSpatialContextCompletionEXT(segment.asSlice(index * XrCreateSpatialContextCompletionEXT.BYTES, XrCreateSpatialContextCompletionEXT.BYTES));
        }

        public XrCreateSpatialContextCompletionEXT.Ptr at(long index, @NotNull Consumer<@NotNull XrCreateSpatialContextCompletionEXT> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrCreateSpatialContextCompletionEXT value) {
            MemorySegment s = segment.asSlice(index * XrCreateSpatialContextCompletionEXT.BYTES, XrCreateSpatialContextCompletionEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrCreateSpatialContextCompletionEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrCreateSpatialContextCompletionEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrCreateSpatialContextCompletionEXT.BYTES,
                (end - start) * XrCreateSpatialContextCompletionEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrCreateSpatialContextCompletionEXT.BYTES));
        }

        public XrCreateSpatialContextCompletionEXT[] toArray() {
            XrCreateSpatialContextCompletionEXT[] ret = new XrCreateSpatialContextCompletionEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrCreateSpatialContextCompletionEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrCreateSpatialContextCompletionEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrCreateSpatialContextCompletionEXT.BYTES;
            }

            @Override
            public XrCreateSpatialContextCompletionEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrCreateSpatialContextCompletionEXT ret = new XrCreateSpatialContextCompletionEXT(segment.asSlice(0, XrCreateSpatialContextCompletionEXT.BYTES));
                segment = segment.asSlice(XrCreateSpatialContextCompletionEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrCreateSpatialContextCompletionEXT allocate(Arena arena) {
        XrCreateSpatialContextCompletionEXT ret = new XrCreateSpatialContextCompletionEXT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.CREATE_SPATIAL_CONTEXT_COMPLETION_EXT);
        return ret;
    }

    public static XrCreateSpatialContextCompletionEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrCreateSpatialContextCompletionEXT.Ptr ret = new XrCreateSpatialContextCompletionEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.CREATE_SPATIAL_CONTEXT_COMPLETION_EXT);
        }
        return ret;
    }

    public static XrCreateSpatialContextCompletionEXT clone(Arena arena, XrCreateSpatialContextCompletionEXT src) {
        XrCreateSpatialContextCompletionEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.CREATE_SPATIAL_CONTEXT_COMPLETION_EXT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrCreateSpatialContextCompletionEXT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrCreateSpatialContextCompletionEXT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrCreateSpatialContextCompletionEXT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @EnumType(XrResult.class) int futureResult() {
        return segment.get(LAYOUT$futureResult, OFFSET$futureResult);
    }

    public XrCreateSpatialContextCompletionEXT futureResult(@EnumType(XrResult.class) int value) {
        segment.set(LAYOUT$futureResult, OFFSET$futureResult, value);
        return this;
    }

    public @Nullable XrSpatialContextEXT spatialContext() {
        MemorySegment s = segment.asSlice(OFFSET$spatialContext, SIZE$spatialContext);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrSpatialContextEXT(s);
    }

    public XrCreateSpatialContextCompletionEXT spatialContext(@Nullable XrSpatialContextEXT value) {
        segment.set(LAYOUT$spatialContext, OFFSET$spatialContext, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("futureResult"),
        ValueLayout.ADDRESS.withName("spatialContext")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$futureResult = PathElement.groupElement("futureResult");
    public static final PathElement PATH$spatialContext = PathElement.groupElement("spatialContext");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$futureResult = (OfInt) LAYOUT.select(PATH$futureResult);
    public static final AddressLayout LAYOUT$spatialContext = (AddressLayout) LAYOUT.select(PATH$spatialContext);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$futureResult = LAYOUT$futureResult.byteSize();
    public static final long SIZE$spatialContext = LAYOUT$spatialContext.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$futureResult = LAYOUT.byteOffset(PATH$futureResult);
    public static final long OFFSET$spatialContext = LAYOUT.byteOffset(PATH$spatialContext);
}
