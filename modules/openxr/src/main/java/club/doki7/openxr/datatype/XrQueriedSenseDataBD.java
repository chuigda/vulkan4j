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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrQueriedSenseDataBD.html"><code>XrQueriedSenseDataBD</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrQueriedSenseDataBD {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     uint32_t stateCapacityInput; // optional // @link substring="stateCapacityInput" target="#stateCapacityInput"
///     uint32_t stateCountOutput; // optional // @link substring="stateCountOutput" target="#stateCountOutput"
///     XrSpatialEntityStateBD* states; // optional // @link substring="XrSpatialEntityStateBD" target="XrSpatialEntityStateBD" @link substring="states" target="#states"
/// } XrQueriedSenseDataBD;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_QUERIED_SENSE_DATA_BD`
///
/// The {@code allocate} ({@link XrQueriedSenseDataBD#allocate(Arena)}, {@link XrQueriedSenseDataBD#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrQueriedSenseDataBD#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrQueriedSenseDataBD.html"><code>XrQueriedSenseDataBD</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrQueriedSenseDataBD(@NotNull MemorySegment segment) implements IXrQueriedSenseDataBD {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrQueriedSenseDataBD.html"><code>XrQueriedSenseDataBD</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrQueriedSenseDataBD}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrQueriedSenseDataBD to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrQueriedSenseDataBD.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrQueriedSenseDataBD, Iterable<XrQueriedSenseDataBD> {
        public long size() {
            return segment.byteSize() / XrQueriedSenseDataBD.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrQueriedSenseDataBD at(long index) {
            return new XrQueriedSenseDataBD(segment.asSlice(index * XrQueriedSenseDataBD.BYTES, XrQueriedSenseDataBD.BYTES));
        }

        public XrQueriedSenseDataBD.Ptr at(long index, @NotNull Consumer<@NotNull XrQueriedSenseDataBD> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrQueriedSenseDataBD value) {
            MemorySegment s = segment.asSlice(index * XrQueriedSenseDataBD.BYTES, XrQueriedSenseDataBD.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrQueriedSenseDataBD.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrQueriedSenseDataBD.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrQueriedSenseDataBD.BYTES,
                (end - start) * XrQueriedSenseDataBD.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrQueriedSenseDataBD.BYTES));
        }

        public XrQueriedSenseDataBD[] toArray() {
            XrQueriedSenseDataBD[] ret = new XrQueriedSenseDataBD[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrQueriedSenseDataBD> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrQueriedSenseDataBD> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrQueriedSenseDataBD.BYTES;
            }

            @Override
            public XrQueriedSenseDataBD next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrQueriedSenseDataBD ret = new XrQueriedSenseDataBD(segment.asSlice(0, XrQueriedSenseDataBD.BYTES));
                segment = segment.asSlice(XrQueriedSenseDataBD.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrQueriedSenseDataBD allocate(Arena arena) {
        XrQueriedSenseDataBD ret = new XrQueriedSenseDataBD(arena.allocate(LAYOUT));
        ret.type(XrStructureType.QUERIED_SENSE_DATA_BD);
        return ret;
    }

    public static XrQueriedSenseDataBD.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrQueriedSenseDataBD.Ptr ret = new XrQueriedSenseDataBD.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.QUERIED_SENSE_DATA_BD);
        }
        return ret;
    }

    public static XrQueriedSenseDataBD clone(Arena arena, XrQueriedSenseDataBD src) {
        XrQueriedSenseDataBD ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.QUERIED_SENSE_DATA_BD);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrQueriedSenseDataBD type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrQueriedSenseDataBD next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrQueriedSenseDataBD next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int stateCapacityInput() {
        return segment.get(LAYOUT$stateCapacityInput, OFFSET$stateCapacityInput);
    }

    public XrQueriedSenseDataBD stateCapacityInput(@Unsigned int value) {
        segment.set(LAYOUT$stateCapacityInput, OFFSET$stateCapacityInput, value);
        return this;
    }

    public @Unsigned int stateCountOutput() {
        return segment.get(LAYOUT$stateCountOutput, OFFSET$stateCountOutput);
    }

    public XrQueriedSenseDataBD stateCountOutput(@Unsigned int value) {
        segment.set(LAYOUT$stateCountOutput, OFFSET$stateCountOutput, value);
        return this;
    }

    public XrQueriedSenseDataBD states(@Nullable IXrSpatialEntityStateBD value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        statesRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrSpatialEntityStateBD.Ptr states(int assumedCount) {
        MemorySegment s = statesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrSpatialEntityStateBD.BYTES);
        return new XrSpatialEntityStateBD.Ptr(s);
    }

    public @Nullable XrSpatialEntityStateBD states() {
        MemorySegment s = statesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrSpatialEntityStateBD(s);
    }

    public @Pointer(target=XrSpatialEntityStateBD.class) @NotNull MemorySegment statesRaw() {
        return segment.get(LAYOUT$states, OFFSET$states);
    }

    public void statesRaw(@Pointer(target=XrSpatialEntityStateBD.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$states, OFFSET$states, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("stateCapacityInput"),
        ValueLayout.JAVA_INT.withName("stateCountOutput"),
        ValueLayout.ADDRESS.withTargetLayout(XrSpatialEntityStateBD.LAYOUT).withName("states")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$stateCapacityInput = PathElement.groupElement("stateCapacityInput");
    public static final PathElement PATH$stateCountOutput = PathElement.groupElement("stateCountOutput");
    public static final PathElement PATH$states = PathElement.groupElement("states");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$stateCapacityInput = (OfInt) LAYOUT.select(PATH$stateCapacityInput);
    public static final OfInt LAYOUT$stateCountOutput = (OfInt) LAYOUT.select(PATH$stateCountOutput);
    public static final AddressLayout LAYOUT$states = (AddressLayout) LAYOUT.select(PATH$states);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$stateCapacityInput = LAYOUT$stateCapacityInput.byteSize();
    public static final long SIZE$stateCountOutput = LAYOUT$stateCountOutput.byteSize();
    public static final long SIZE$states = LAYOUT$states.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$stateCapacityInput = LAYOUT.byteOffset(PATH$stateCapacityInput);
    public static final long OFFSET$stateCountOutput = LAYOUT.byteOffset(PATH$stateCountOutput);
    public static final long OFFSET$states = LAYOUT.byteOffset(PATH$states);
}
