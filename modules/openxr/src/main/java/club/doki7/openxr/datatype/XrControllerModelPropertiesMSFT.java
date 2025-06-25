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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrControllerModelPropertiesMSFT.html"><code>XrControllerModelPropertiesMSFT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrControllerModelPropertiesMSFT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     uint32_t nodeCapacityInput; // optional // @link substring="nodeCapacityInput" target="#nodeCapacityInput"
///     uint32_t nodeCountOutput; // optional // @link substring="nodeCountOutput" target="#nodeCountOutput"
///     XrControllerModelNodePropertiesMSFT* nodeProperties; // optional // @link substring="XrControllerModelNodePropertiesMSFT" target="XrControllerModelNodePropertiesMSFT" @link substring="nodeProperties" target="#nodeProperties"
/// } XrControllerModelPropertiesMSFT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_CONTROLLER_MODEL_PROPERTIES_MSFT`
///
/// The {@code allocate} ({@link XrControllerModelPropertiesMSFT#allocate(Arena)}, {@link XrControllerModelPropertiesMSFT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrControllerModelPropertiesMSFT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrControllerModelPropertiesMSFT.html"><code>XrControllerModelPropertiesMSFT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrControllerModelPropertiesMSFT(@NotNull MemorySegment segment) implements IXrControllerModelPropertiesMSFT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrControllerModelPropertiesMSFT.html"><code>XrControllerModelPropertiesMSFT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrControllerModelPropertiesMSFT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrControllerModelPropertiesMSFT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrControllerModelPropertiesMSFT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrControllerModelPropertiesMSFT, Iterable<XrControllerModelPropertiesMSFT> {
        public long size() {
            return segment.byteSize() / XrControllerModelPropertiesMSFT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrControllerModelPropertiesMSFT at(long index) {
            return new XrControllerModelPropertiesMSFT(segment.asSlice(index * XrControllerModelPropertiesMSFT.BYTES, XrControllerModelPropertiesMSFT.BYTES));
        }

        public void write(long index, @NotNull XrControllerModelPropertiesMSFT value) {
            MemorySegment s = segment.asSlice(index * XrControllerModelPropertiesMSFT.BYTES, XrControllerModelPropertiesMSFT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrControllerModelPropertiesMSFT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrControllerModelPropertiesMSFT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrControllerModelPropertiesMSFT.BYTES,
                (end - start) * XrControllerModelPropertiesMSFT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrControllerModelPropertiesMSFT.BYTES));
        }

        public XrControllerModelPropertiesMSFT[] toArray() {
            XrControllerModelPropertiesMSFT[] ret = new XrControllerModelPropertiesMSFT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrControllerModelPropertiesMSFT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrControllerModelPropertiesMSFT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrControllerModelPropertiesMSFT.BYTES;
            }

            @Override
            public XrControllerModelPropertiesMSFT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrControllerModelPropertiesMSFT ret = new XrControllerModelPropertiesMSFT(segment.asSlice(0, XrControllerModelPropertiesMSFT.BYTES));
                segment = segment.asSlice(XrControllerModelPropertiesMSFT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrControllerModelPropertiesMSFT allocate(Arena arena) {
        XrControllerModelPropertiesMSFT ret = new XrControllerModelPropertiesMSFT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.CONTROLLER_MODEL_PROPERTIES_MSFT);
        return ret;
    }

    public static XrControllerModelPropertiesMSFT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrControllerModelPropertiesMSFT.Ptr ret = new XrControllerModelPropertiesMSFT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.CONTROLLER_MODEL_PROPERTIES_MSFT);
        }
        return ret;
    }

    public static XrControllerModelPropertiesMSFT clone(Arena arena, XrControllerModelPropertiesMSFT src) {
        XrControllerModelPropertiesMSFT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.CONTROLLER_MODEL_PROPERTIES_MSFT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrControllerModelPropertiesMSFT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrControllerModelPropertiesMSFT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrControllerModelPropertiesMSFT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int nodeCapacityInput() {
        return segment.get(LAYOUT$nodeCapacityInput, OFFSET$nodeCapacityInput);
    }

    public XrControllerModelPropertiesMSFT nodeCapacityInput(@Unsigned int value) {
        segment.set(LAYOUT$nodeCapacityInput, OFFSET$nodeCapacityInput, value);
        return this;
    }

    public @Unsigned int nodeCountOutput() {
        return segment.get(LAYOUT$nodeCountOutput, OFFSET$nodeCountOutput);
    }

    public XrControllerModelPropertiesMSFT nodeCountOutput(@Unsigned int value) {
        segment.set(LAYOUT$nodeCountOutput, OFFSET$nodeCountOutput, value);
        return this;
    }

    public XrControllerModelPropertiesMSFT nodeProperties(@Nullable IXrControllerModelNodePropertiesMSFT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        nodePropertiesRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrControllerModelNodePropertiesMSFT.Ptr nodeProperties(int assumedCount) {
        MemorySegment s = nodePropertiesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrControllerModelNodePropertiesMSFT.BYTES);
        return new XrControllerModelNodePropertiesMSFT.Ptr(s);
    }

    public @Nullable XrControllerModelNodePropertiesMSFT nodeProperties() {
        MemorySegment s = nodePropertiesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrControllerModelNodePropertiesMSFT(s);
    }

    public @Pointer(target=XrControllerModelNodePropertiesMSFT.class) @NotNull MemorySegment nodePropertiesRaw() {
        return segment.get(LAYOUT$nodeProperties, OFFSET$nodeProperties);
    }

    public void nodePropertiesRaw(@Pointer(target=XrControllerModelNodePropertiesMSFT.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$nodeProperties, OFFSET$nodeProperties, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("nodeCapacityInput"),
        ValueLayout.JAVA_INT.withName("nodeCountOutput"),
        ValueLayout.ADDRESS.withTargetLayout(XrControllerModelNodePropertiesMSFT.LAYOUT).withName("nodeProperties")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$nodeCapacityInput = PathElement.groupElement("nodeCapacityInput");
    public static final PathElement PATH$nodeCountOutput = PathElement.groupElement("nodeCountOutput");
    public static final PathElement PATH$nodeProperties = PathElement.groupElement("nodeProperties");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$nodeCapacityInput = (OfInt) LAYOUT.select(PATH$nodeCapacityInput);
    public static final OfInt LAYOUT$nodeCountOutput = (OfInt) LAYOUT.select(PATH$nodeCountOutput);
    public static final AddressLayout LAYOUT$nodeProperties = (AddressLayout) LAYOUT.select(PATH$nodeProperties);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$nodeCapacityInput = LAYOUT$nodeCapacityInput.byteSize();
    public static final long SIZE$nodeCountOutput = LAYOUT$nodeCountOutput.byteSize();
    public static final long SIZE$nodeProperties = LAYOUT$nodeProperties.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$nodeCapacityInput = LAYOUT.byteOffset(PATH$nodeCapacityInput);
    public static final long OFFSET$nodeCountOutput = LAYOUT.byteOffset(PATH$nodeCountOutput);
    public static final long OFFSET$nodeProperties = LAYOUT.byteOffset(PATH$nodeProperties);
}
