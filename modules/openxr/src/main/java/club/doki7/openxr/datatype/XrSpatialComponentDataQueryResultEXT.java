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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialComponentDataQueryResultEXT.html"><code>XrSpatialComponentDataQueryResultEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSpatialComponentDataQueryResultEXT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     uint32_t entityIdCapacityInput; // optional // @link substring="entityIdCapacityInput" target="#entityIdCapacityInput"
///     uint32_t entityIdCountOutput; // optional // @link substring="entityIdCountOutput" target="#entityIdCountOutput"
///     XrSpatialEntityIdEXT* entityIds; // optional // @link substring="entityIds" target="#entityIds"
///     uint32_t entityStateCapacityInput; // optional // @link substring="entityStateCapacityInput" target="#entityStateCapacityInput"
///     uint32_t entityStateCountOutput; // optional // @link substring="entityStateCountOutput" target="#entityStateCountOutput"
///     XrSpatialEntityTrackingStateEXT* entityStates; // optional // @link substring="XrSpatialEntityTrackingStateEXT" target="XrSpatialEntityTrackingStateEXT" @link substring="entityStates" target="#entityStates"
/// } XrSpatialComponentDataQueryResultEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SPATIAL_COMPONENT_DATA_QUERY_RESULT_EXT`
///
/// The {@code allocate} ({@link XrSpatialComponentDataQueryResultEXT#allocate(Arena)}, {@link XrSpatialComponentDataQueryResultEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSpatialComponentDataQueryResultEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialComponentDataQueryResultEXT.html"><code>XrSpatialComponentDataQueryResultEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSpatialComponentDataQueryResultEXT(@NotNull MemorySegment segment) implements IXrSpatialComponentDataQueryResultEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialComponentDataQueryResultEXT.html"><code>XrSpatialComponentDataQueryResultEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSpatialComponentDataQueryResultEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSpatialComponentDataQueryResultEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSpatialComponentDataQueryResultEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSpatialComponentDataQueryResultEXT, Iterable<XrSpatialComponentDataQueryResultEXT> {
        public long size() {
            return segment.byteSize() / XrSpatialComponentDataQueryResultEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSpatialComponentDataQueryResultEXT at(long index) {
            return new XrSpatialComponentDataQueryResultEXT(segment.asSlice(index * XrSpatialComponentDataQueryResultEXT.BYTES, XrSpatialComponentDataQueryResultEXT.BYTES));
        }

        public void write(long index, @NotNull XrSpatialComponentDataQueryResultEXT value) {
            MemorySegment s = segment.asSlice(index * XrSpatialComponentDataQueryResultEXT.BYTES, XrSpatialComponentDataQueryResultEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSpatialComponentDataQueryResultEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSpatialComponentDataQueryResultEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSpatialComponentDataQueryResultEXT.BYTES,
                (end - start) * XrSpatialComponentDataQueryResultEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSpatialComponentDataQueryResultEXT.BYTES));
        }

        public XrSpatialComponentDataQueryResultEXT[] toArray() {
            XrSpatialComponentDataQueryResultEXT[] ret = new XrSpatialComponentDataQueryResultEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSpatialComponentDataQueryResultEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSpatialComponentDataQueryResultEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSpatialComponentDataQueryResultEXT.BYTES;
            }

            @Override
            public XrSpatialComponentDataQueryResultEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSpatialComponentDataQueryResultEXT ret = new XrSpatialComponentDataQueryResultEXT(segment.asSlice(0, XrSpatialComponentDataQueryResultEXT.BYTES));
                segment = segment.asSlice(XrSpatialComponentDataQueryResultEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSpatialComponentDataQueryResultEXT allocate(Arena arena) {
        XrSpatialComponentDataQueryResultEXT ret = new XrSpatialComponentDataQueryResultEXT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_SPATIAL_COMPONENT_DATA_QUERY_RESULT_EXT);
        return ret;
    }

    public static XrSpatialComponentDataQueryResultEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSpatialComponentDataQueryResultEXT.Ptr ret = new XrSpatialComponentDataQueryResultEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_SPATIAL_COMPONENT_DATA_QUERY_RESULT_EXT);
        }
        return ret;
    }

    public static XrSpatialComponentDataQueryResultEXT clone(Arena arena, XrSpatialComponentDataQueryResultEXT src) {
        XrSpatialComponentDataQueryResultEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_SPATIAL_COMPONENT_DATA_QUERY_RESULT_EXT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSpatialComponentDataQueryResultEXT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSpatialComponentDataQueryResultEXT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSpatialComponentDataQueryResultEXT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int entityIdCapacityInput() {
        return segment.get(LAYOUT$entityIdCapacityInput, OFFSET$entityIdCapacityInput);
    }

    public XrSpatialComponentDataQueryResultEXT entityIdCapacityInput(@Unsigned int value) {
        segment.set(LAYOUT$entityIdCapacityInput, OFFSET$entityIdCapacityInput, value);
        return this;
    }

    public @Unsigned int entityIdCountOutput() {
        return segment.get(LAYOUT$entityIdCountOutput, OFFSET$entityIdCountOutput);
    }

    public XrSpatialComponentDataQueryResultEXT entityIdCountOutput(@Unsigned int value) {
        segment.set(LAYOUT$entityIdCountOutput, OFFSET$entityIdCountOutput, value);
        return this;
    }

    /// Note: the returned {@link LongPtr} does not have correct
    /// {@link LongPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link LongPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable @Pointer(comment="XrSpatialEntityIdEXT") @Unsigned LongPtr entityIds() {
        MemorySegment s = entityIdsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new LongPtr(s);
    }

    public XrSpatialComponentDataQueryResultEXT entityIds(@Nullable @Pointer(comment="XrSpatialEntityIdEXT") @Unsigned LongPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        entityIdsRaw(s);
        return this;
    }

    public @Pointer(comment="uint64_t*") @NotNull MemorySegment entityIdsRaw() {
        return segment.get(LAYOUT$entityIds, OFFSET$entityIds);
    }

    public void entityIdsRaw(@Pointer(comment="uint64_t*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$entityIds, OFFSET$entityIds, value);
    }

    public @Unsigned int entityStateCapacityInput() {
        return segment.get(LAYOUT$entityStateCapacityInput, OFFSET$entityStateCapacityInput);
    }

    public XrSpatialComponentDataQueryResultEXT entityStateCapacityInput(@Unsigned int value) {
        segment.set(LAYOUT$entityStateCapacityInput, OFFSET$entityStateCapacityInput, value);
        return this;
    }

    public @Unsigned int entityStateCountOutput() {
        return segment.get(LAYOUT$entityStateCountOutput, OFFSET$entityStateCountOutput);
    }

    public XrSpatialComponentDataQueryResultEXT entityStateCountOutput(@Unsigned int value) {
        segment.set(LAYOUT$entityStateCountOutput, OFFSET$entityStateCountOutput, value);
        return this;
    }


    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @EnumType(XrSpatialEntityTrackingStateEXT.class) IntPtr entityStates() {
        MemorySegment s = entityStatesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public XrSpatialComponentDataQueryResultEXT entityStates(@Nullable @EnumType(XrSpatialEntityTrackingStateEXT.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        entityStatesRaw(s);
        return this;
    }

    public @Pointer(target=XrSpatialEntityTrackingStateEXT.class) @NotNull MemorySegment entityStatesRaw() {
        return segment.get(LAYOUT$entityStates, OFFSET$entityStates);
    }

    public void entityStatesRaw(@Pointer(target=XrSpatialEntityTrackingStateEXT.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$entityStates, OFFSET$entityStates, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("entityIdCapacityInput"),
        ValueLayout.JAVA_INT.withName("entityIdCountOutput"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_LONG).withName("entityIds"),
        ValueLayout.JAVA_INT.withName("entityStateCapacityInput"),
        ValueLayout.JAVA_INT.withName("entityStateCountOutput"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("entityStates")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$entityIdCapacityInput = PathElement.groupElement("entityIdCapacityInput");
    public static final PathElement PATH$entityIdCountOutput = PathElement.groupElement("entityIdCountOutput");
    public static final PathElement PATH$entityIds = PathElement.groupElement("entityIds");
    public static final PathElement PATH$entityStateCapacityInput = PathElement.groupElement("entityStateCapacityInput");
    public static final PathElement PATH$entityStateCountOutput = PathElement.groupElement("entityStateCountOutput");
    public static final PathElement PATH$entityStates = PathElement.groupElement("entityStates");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$entityIdCapacityInput = (OfInt) LAYOUT.select(PATH$entityIdCapacityInput);
    public static final OfInt LAYOUT$entityIdCountOutput = (OfInt) LAYOUT.select(PATH$entityIdCountOutput);
    public static final AddressLayout LAYOUT$entityIds = (AddressLayout) LAYOUT.select(PATH$entityIds);
    public static final OfInt LAYOUT$entityStateCapacityInput = (OfInt) LAYOUT.select(PATH$entityStateCapacityInput);
    public static final OfInt LAYOUT$entityStateCountOutput = (OfInt) LAYOUT.select(PATH$entityStateCountOutput);
    public static final AddressLayout LAYOUT$entityStates = (AddressLayout) LAYOUT.select(PATH$entityStates);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$entityIdCapacityInput = LAYOUT$entityIdCapacityInput.byteSize();
    public static final long SIZE$entityIdCountOutput = LAYOUT$entityIdCountOutput.byteSize();
    public static final long SIZE$entityIds = LAYOUT$entityIds.byteSize();
    public static final long SIZE$entityStateCapacityInput = LAYOUT$entityStateCapacityInput.byteSize();
    public static final long SIZE$entityStateCountOutput = LAYOUT$entityStateCountOutput.byteSize();
    public static final long SIZE$entityStates = LAYOUT$entityStates.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$entityIdCapacityInput = LAYOUT.byteOffset(PATH$entityIdCapacityInput);
    public static final long OFFSET$entityIdCountOutput = LAYOUT.byteOffset(PATH$entityIdCountOutput);
    public static final long OFFSET$entityIds = LAYOUT.byteOffset(PATH$entityIds);
    public static final long OFFSET$entityStateCapacityInput = LAYOUT.byteOffset(PATH$entityStateCapacityInput);
    public static final long OFFSET$entityStateCountOutput = LAYOUT.byteOffset(PATH$entityStateCountOutput);
    public static final long OFFSET$entityStates = LAYOUT.byteOffset(PATH$entityStates);
}
