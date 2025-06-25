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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialEntityComponentDataSemanticBD.html"><code>XrSpatialEntityComponentDataSemanticBD</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSpatialEntityComponentDataSemanticBD {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     uint32_t labelCapacityInput; // optional // @link substring="labelCapacityInput" target="#labelCapacityInput"
///     uint32_t labelCountOutput; // optional // @link substring="labelCountOutput" target="#labelCountOutput"
///     XrSemanticLabelBD* labels; // optional // @link substring="XrSemanticLabelBD" target="XrSemanticLabelBD" @link substring="labels" target="#labels"
/// } XrSpatialEntityComponentDataSemanticBD;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SPATIAL_ENTITY_COMPONENT_DATA_SEMANTIC_BD`
///
/// The {@code allocate} ({@link XrSpatialEntityComponentDataSemanticBD#allocate(Arena)}, {@link XrSpatialEntityComponentDataSemanticBD#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSpatialEntityComponentDataSemanticBD#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialEntityComponentDataSemanticBD.html"><code>XrSpatialEntityComponentDataSemanticBD</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSpatialEntityComponentDataSemanticBD(@NotNull MemorySegment segment) implements IXrSpatialEntityComponentDataSemanticBD {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialEntityComponentDataSemanticBD.html"><code>XrSpatialEntityComponentDataSemanticBD</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSpatialEntityComponentDataSemanticBD}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSpatialEntityComponentDataSemanticBD to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSpatialEntityComponentDataSemanticBD.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSpatialEntityComponentDataSemanticBD, Iterable<XrSpatialEntityComponentDataSemanticBD> {
        public long size() {
            return segment.byteSize() / XrSpatialEntityComponentDataSemanticBD.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSpatialEntityComponentDataSemanticBD at(long index) {
            return new XrSpatialEntityComponentDataSemanticBD(segment.asSlice(index * XrSpatialEntityComponentDataSemanticBD.BYTES, XrSpatialEntityComponentDataSemanticBD.BYTES));
        }

        public void at(long index, @NotNull Consumer<@NotNull XrSpatialEntityComponentDataSemanticBD> consumer) {
            consumer.accept(at(index));
        }

        public void write(long index, @NotNull XrSpatialEntityComponentDataSemanticBD value) {
            MemorySegment s = segment.asSlice(index * XrSpatialEntityComponentDataSemanticBD.BYTES, XrSpatialEntityComponentDataSemanticBD.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSpatialEntityComponentDataSemanticBD.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSpatialEntityComponentDataSemanticBD.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSpatialEntityComponentDataSemanticBD.BYTES,
                (end - start) * XrSpatialEntityComponentDataSemanticBD.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSpatialEntityComponentDataSemanticBD.BYTES));
        }

        public XrSpatialEntityComponentDataSemanticBD[] toArray() {
            XrSpatialEntityComponentDataSemanticBD[] ret = new XrSpatialEntityComponentDataSemanticBD[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSpatialEntityComponentDataSemanticBD> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSpatialEntityComponentDataSemanticBD> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSpatialEntityComponentDataSemanticBD.BYTES;
            }

            @Override
            public XrSpatialEntityComponentDataSemanticBD next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSpatialEntityComponentDataSemanticBD ret = new XrSpatialEntityComponentDataSemanticBD(segment.asSlice(0, XrSpatialEntityComponentDataSemanticBD.BYTES));
                segment = segment.asSlice(XrSpatialEntityComponentDataSemanticBD.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSpatialEntityComponentDataSemanticBD allocate(Arena arena) {
        XrSpatialEntityComponentDataSemanticBD ret = new XrSpatialEntityComponentDataSemanticBD(arena.allocate(LAYOUT));
        ret.type(XrStructureType.SPATIAL_ENTITY_COMPONENT_DATA_SEMANTIC_BD);
        return ret;
    }

    public static XrSpatialEntityComponentDataSemanticBD.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSpatialEntityComponentDataSemanticBD.Ptr ret = new XrSpatialEntityComponentDataSemanticBD.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.SPATIAL_ENTITY_COMPONENT_DATA_SEMANTIC_BD);
        }
        return ret;
    }

    public static XrSpatialEntityComponentDataSemanticBD clone(Arena arena, XrSpatialEntityComponentDataSemanticBD src) {
        XrSpatialEntityComponentDataSemanticBD ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.SPATIAL_ENTITY_COMPONENT_DATA_SEMANTIC_BD);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSpatialEntityComponentDataSemanticBD type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSpatialEntityComponentDataSemanticBD next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSpatialEntityComponentDataSemanticBD next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int labelCapacityInput() {
        return segment.get(LAYOUT$labelCapacityInput, OFFSET$labelCapacityInput);
    }

    public XrSpatialEntityComponentDataSemanticBD labelCapacityInput(@Unsigned int value) {
        segment.set(LAYOUT$labelCapacityInput, OFFSET$labelCapacityInput, value);
        return this;
    }

    public @Unsigned int labelCountOutput() {
        return segment.get(LAYOUT$labelCountOutput, OFFSET$labelCountOutput);
    }

    public XrSpatialEntityComponentDataSemanticBD labelCountOutput(@Unsigned int value) {
        segment.set(LAYOUT$labelCountOutput, OFFSET$labelCountOutput, value);
        return this;
    }


    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @EnumType(XrSemanticLabelBD.class) IntPtr labels() {
        MemorySegment s = labelsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public XrSpatialEntityComponentDataSemanticBD labels(@Nullable @EnumType(XrSemanticLabelBD.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        labelsRaw(s);
        return this;
    }

    public @Pointer(target=XrSemanticLabelBD.class) @NotNull MemorySegment labelsRaw() {
        return segment.get(LAYOUT$labels, OFFSET$labels);
    }

    public void labelsRaw(@Pointer(target=XrSemanticLabelBD.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$labels, OFFSET$labels, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("labelCapacityInput"),
        ValueLayout.JAVA_INT.withName("labelCountOutput"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("labels")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$labelCapacityInput = PathElement.groupElement("labelCapacityInput");
    public static final PathElement PATH$labelCountOutput = PathElement.groupElement("labelCountOutput");
    public static final PathElement PATH$labels = PathElement.groupElement("labels");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$labelCapacityInput = (OfInt) LAYOUT.select(PATH$labelCapacityInput);
    public static final OfInt LAYOUT$labelCountOutput = (OfInt) LAYOUT.select(PATH$labelCountOutput);
    public static final AddressLayout LAYOUT$labels = (AddressLayout) LAYOUT.select(PATH$labels);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$labelCapacityInput = LAYOUT$labelCapacityInput.byteSize();
    public static final long SIZE$labelCountOutput = LAYOUT$labelCountOutput.byteSize();
    public static final long SIZE$labels = LAYOUT$labels.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$labelCapacityInput = LAYOUT.byteOffset(PATH$labelCapacityInput);
    public static final long OFFSET$labelCountOutput = LAYOUT.byteOffset(PATH$labelCountOutput);
    public static final long OFFSET$labels = LAYOUT.byteOffset(PATH$labels);
}
