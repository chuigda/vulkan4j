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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFacialExpressionClientCreateInfoML.html"><code>XrFacialExpressionClientCreateInfoML</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrFacialExpressionClientCreateInfoML {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     uint32_t requestedCount; // optional // @link substring="requestedCount" target="#requestedCount"
///     XrFacialBlendShapeML const* requestedFacialBlendShapes; // optional // @link substring="XrFacialBlendShapeML" target="XrFacialBlendShapeML" @link substring="requestedFacialBlendShapes" target="#requestedFacialBlendShapes"
/// } XrFacialExpressionClientCreateInfoML;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_FACIAL_EXPRESSION_CLIENT_CREATE_INFO_ML`
///
/// The {@code allocate} ({@link XrFacialExpressionClientCreateInfoML#allocate(Arena)}, {@link XrFacialExpressionClientCreateInfoML#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrFacialExpressionClientCreateInfoML#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFacialExpressionClientCreateInfoML.html"><code>XrFacialExpressionClientCreateInfoML</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrFacialExpressionClientCreateInfoML(@NotNull MemorySegment segment) implements IXrFacialExpressionClientCreateInfoML {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFacialExpressionClientCreateInfoML.html"><code>XrFacialExpressionClientCreateInfoML</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrFacialExpressionClientCreateInfoML}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrFacialExpressionClientCreateInfoML to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrFacialExpressionClientCreateInfoML.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrFacialExpressionClientCreateInfoML, Iterable<XrFacialExpressionClientCreateInfoML> {
        public long size() {
            return segment.byteSize() / XrFacialExpressionClientCreateInfoML.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrFacialExpressionClientCreateInfoML at(long index) {
            return new XrFacialExpressionClientCreateInfoML(segment.asSlice(index * XrFacialExpressionClientCreateInfoML.BYTES, XrFacialExpressionClientCreateInfoML.BYTES));
        }

        public XrFacialExpressionClientCreateInfoML.Ptr at(long index, @NotNull Consumer<@NotNull XrFacialExpressionClientCreateInfoML> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrFacialExpressionClientCreateInfoML value) {
            MemorySegment s = segment.asSlice(index * XrFacialExpressionClientCreateInfoML.BYTES, XrFacialExpressionClientCreateInfoML.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrFacialExpressionClientCreateInfoML.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrFacialExpressionClientCreateInfoML.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrFacialExpressionClientCreateInfoML.BYTES,
                (end - start) * XrFacialExpressionClientCreateInfoML.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrFacialExpressionClientCreateInfoML.BYTES));
        }

        public XrFacialExpressionClientCreateInfoML[] toArray() {
            XrFacialExpressionClientCreateInfoML[] ret = new XrFacialExpressionClientCreateInfoML[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrFacialExpressionClientCreateInfoML> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrFacialExpressionClientCreateInfoML> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrFacialExpressionClientCreateInfoML.BYTES;
            }

            @Override
            public XrFacialExpressionClientCreateInfoML next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrFacialExpressionClientCreateInfoML ret = new XrFacialExpressionClientCreateInfoML(segment.asSlice(0, XrFacialExpressionClientCreateInfoML.BYTES));
                segment = segment.asSlice(XrFacialExpressionClientCreateInfoML.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrFacialExpressionClientCreateInfoML allocate(Arena arena) {
        XrFacialExpressionClientCreateInfoML ret = new XrFacialExpressionClientCreateInfoML(arena.allocate(LAYOUT));
        ret.type(XrStructureType.FACIAL_EXPRESSION_CLIENT_CREATE_INFO_ML);
        return ret;
    }

    public static XrFacialExpressionClientCreateInfoML.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrFacialExpressionClientCreateInfoML.Ptr ret = new XrFacialExpressionClientCreateInfoML.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.FACIAL_EXPRESSION_CLIENT_CREATE_INFO_ML);
        }
        return ret;
    }

    public static XrFacialExpressionClientCreateInfoML clone(Arena arena, XrFacialExpressionClientCreateInfoML src) {
        XrFacialExpressionClientCreateInfoML ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.FACIAL_EXPRESSION_CLIENT_CREATE_INFO_ML);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrFacialExpressionClientCreateInfoML type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrFacialExpressionClientCreateInfoML next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrFacialExpressionClientCreateInfoML next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int requestedCount() {
        return segment.get(LAYOUT$requestedCount, OFFSET$requestedCount);
    }

    public XrFacialExpressionClientCreateInfoML requestedCount(@Unsigned int value) {
        segment.set(LAYOUT$requestedCount, OFFSET$requestedCount, value);
        return this;
    }


    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @EnumType(XrFacialBlendShapeML.class) IntPtr requestedFacialBlendShapes() {
        MemorySegment s = requestedFacialBlendShapesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public XrFacialExpressionClientCreateInfoML requestedFacialBlendShapes(@Nullable @EnumType(XrFacialBlendShapeML.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        requestedFacialBlendShapesRaw(s);
        return this;
    }

    public @Pointer(target=XrFacialBlendShapeML.class) @NotNull MemorySegment requestedFacialBlendShapesRaw() {
        return segment.get(LAYOUT$requestedFacialBlendShapes, OFFSET$requestedFacialBlendShapes);
    }

    public void requestedFacialBlendShapesRaw(@Pointer(target=XrFacialBlendShapeML.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$requestedFacialBlendShapes, OFFSET$requestedFacialBlendShapes, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("requestedCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("requestedFacialBlendShapes")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$requestedCount = PathElement.groupElement("requestedCount");
    public static final PathElement PATH$requestedFacialBlendShapes = PathElement.groupElement("requestedFacialBlendShapes");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$requestedCount = (OfInt) LAYOUT.select(PATH$requestedCount);
    public static final AddressLayout LAYOUT$requestedFacialBlendShapes = (AddressLayout) LAYOUT.select(PATH$requestedFacialBlendShapes);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$requestedCount = LAYOUT$requestedCount.byteSize();
    public static final long SIZE$requestedFacialBlendShapes = LAYOUT$requestedFacialBlendShapes.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$requestedCount = LAYOUT.byteOffset(PATH$requestedCount);
    public static final long OFFSET$requestedFacialBlendShapes = LAYOUT.byteOffset(PATH$requestedFacialBlendShapes);
}
