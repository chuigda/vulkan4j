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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrWorldMeshStateRequestCompletionML.html"><code>XrWorldMeshStateRequestCompletionML</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrWorldMeshStateRequestCompletionML {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     XrResult futureResult; // @link substring="XrResult" target="XrResult" @link substring="futureResult" target="#futureResult"
///     XrTime timestamp; // optional // @link substring="timestamp" target="#timestamp"
///     uint32_t meshBlockStateCapacityInput; // optional // @link substring="meshBlockStateCapacityInput" target="#meshBlockStateCapacityInput"
///     uint32_t meshBlockStateCountOutput; // optional // @link substring="meshBlockStateCountOutput" target="#meshBlockStateCountOutput"
///     XrWorldMeshBlockStateML* meshBlockStates; // optional // @link substring="XrWorldMeshBlockStateML" target="XrWorldMeshBlockStateML" @link substring="meshBlockStates" target="#meshBlockStates"
/// } XrWorldMeshStateRequestCompletionML;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_WORLD_MESH_STATE_REQUEST_COMPLETION_ML`
///
/// The {@code allocate} ({@link XrWorldMeshStateRequestCompletionML#allocate(Arena)}, {@link XrWorldMeshStateRequestCompletionML#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrWorldMeshStateRequestCompletionML#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrWorldMeshStateRequestCompletionML.html"><code>XrWorldMeshStateRequestCompletionML</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrWorldMeshStateRequestCompletionML(@NotNull MemorySegment segment) implements IXrWorldMeshStateRequestCompletionML {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrWorldMeshStateRequestCompletionML.html"><code>XrWorldMeshStateRequestCompletionML</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrWorldMeshStateRequestCompletionML}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrWorldMeshStateRequestCompletionML to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrWorldMeshStateRequestCompletionML.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrWorldMeshStateRequestCompletionML, Iterable<XrWorldMeshStateRequestCompletionML> {
        public long size() {
            return segment.byteSize() / XrWorldMeshStateRequestCompletionML.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrWorldMeshStateRequestCompletionML at(long index) {
            return new XrWorldMeshStateRequestCompletionML(segment.asSlice(index * XrWorldMeshStateRequestCompletionML.BYTES, XrWorldMeshStateRequestCompletionML.BYTES));
        }

        public XrWorldMeshStateRequestCompletionML.Ptr at(long index, @NotNull Consumer<@NotNull XrWorldMeshStateRequestCompletionML> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrWorldMeshStateRequestCompletionML value) {
            MemorySegment s = segment.asSlice(index * XrWorldMeshStateRequestCompletionML.BYTES, XrWorldMeshStateRequestCompletionML.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrWorldMeshStateRequestCompletionML.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrWorldMeshStateRequestCompletionML.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrWorldMeshStateRequestCompletionML.BYTES,
                (end - start) * XrWorldMeshStateRequestCompletionML.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrWorldMeshStateRequestCompletionML.BYTES));
        }

        public XrWorldMeshStateRequestCompletionML[] toArray() {
            XrWorldMeshStateRequestCompletionML[] ret = new XrWorldMeshStateRequestCompletionML[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrWorldMeshStateRequestCompletionML> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrWorldMeshStateRequestCompletionML> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrWorldMeshStateRequestCompletionML.BYTES;
            }

            @Override
            public XrWorldMeshStateRequestCompletionML next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrWorldMeshStateRequestCompletionML ret = new XrWorldMeshStateRequestCompletionML(segment.asSlice(0, XrWorldMeshStateRequestCompletionML.BYTES));
                segment = segment.asSlice(XrWorldMeshStateRequestCompletionML.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrWorldMeshStateRequestCompletionML allocate(Arena arena) {
        XrWorldMeshStateRequestCompletionML ret = new XrWorldMeshStateRequestCompletionML(arena.allocate(LAYOUT));
        ret.type(XrStructureType.WORLD_MESH_STATE_REQUEST_COMPLETION_ML);
        return ret;
    }

    public static XrWorldMeshStateRequestCompletionML.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrWorldMeshStateRequestCompletionML.Ptr ret = new XrWorldMeshStateRequestCompletionML.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.WORLD_MESH_STATE_REQUEST_COMPLETION_ML);
        }
        return ret;
    }

    public static XrWorldMeshStateRequestCompletionML clone(Arena arena, XrWorldMeshStateRequestCompletionML src) {
        XrWorldMeshStateRequestCompletionML ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.WORLD_MESH_STATE_REQUEST_COMPLETION_ML);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrWorldMeshStateRequestCompletionML type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrWorldMeshStateRequestCompletionML next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrWorldMeshStateRequestCompletionML next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @EnumType(XrResult.class) int futureResult() {
        return segment.get(LAYOUT$futureResult, OFFSET$futureResult);
    }

    public XrWorldMeshStateRequestCompletionML futureResult(@EnumType(XrResult.class) int value) {
        segment.set(LAYOUT$futureResult, OFFSET$futureResult, value);
        return this;
    }

    public @NativeType("XrTime") long timestamp() {
        return segment.get(LAYOUT$timestamp, OFFSET$timestamp);
    }

    public XrWorldMeshStateRequestCompletionML timestamp(@NativeType("XrTime") long value) {
        segment.set(LAYOUT$timestamp, OFFSET$timestamp, value);
        return this;
    }

    public @Unsigned int meshBlockStateCapacityInput() {
        return segment.get(LAYOUT$meshBlockStateCapacityInput, OFFSET$meshBlockStateCapacityInput);
    }

    public XrWorldMeshStateRequestCompletionML meshBlockStateCapacityInput(@Unsigned int value) {
        segment.set(LAYOUT$meshBlockStateCapacityInput, OFFSET$meshBlockStateCapacityInput, value);
        return this;
    }

    public @Unsigned int meshBlockStateCountOutput() {
        return segment.get(LAYOUT$meshBlockStateCountOutput, OFFSET$meshBlockStateCountOutput);
    }

    public XrWorldMeshStateRequestCompletionML meshBlockStateCountOutput(@Unsigned int value) {
        segment.set(LAYOUT$meshBlockStateCountOutput, OFFSET$meshBlockStateCountOutput, value);
        return this;
    }

    public XrWorldMeshStateRequestCompletionML meshBlockStates(@Nullable IXrWorldMeshBlockStateML value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        meshBlockStatesRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrWorldMeshBlockStateML.Ptr meshBlockStates(int assumedCount) {
        MemorySegment s = meshBlockStatesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrWorldMeshBlockStateML.BYTES);
        return new XrWorldMeshBlockStateML.Ptr(s);
    }

    public @Nullable XrWorldMeshBlockStateML meshBlockStates() {
        MemorySegment s = meshBlockStatesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrWorldMeshBlockStateML(s);
    }

    public @Pointer(target=XrWorldMeshBlockStateML.class) @NotNull MemorySegment meshBlockStatesRaw() {
        return segment.get(LAYOUT$meshBlockStates, OFFSET$meshBlockStates);
    }

    public void meshBlockStatesRaw(@Pointer(target=XrWorldMeshBlockStateML.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$meshBlockStates, OFFSET$meshBlockStates, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("futureResult"),
        ValueLayout.JAVA_LONG.withName("timestamp"),
        ValueLayout.JAVA_INT.withName("meshBlockStateCapacityInput"),
        ValueLayout.JAVA_INT.withName("meshBlockStateCountOutput"),
        ValueLayout.ADDRESS.withTargetLayout(XrWorldMeshBlockStateML.LAYOUT).withName("meshBlockStates")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$futureResult = PathElement.groupElement("futureResult");
    public static final PathElement PATH$timestamp = PathElement.groupElement("timestamp");
    public static final PathElement PATH$meshBlockStateCapacityInput = PathElement.groupElement("meshBlockStateCapacityInput");
    public static final PathElement PATH$meshBlockStateCountOutput = PathElement.groupElement("meshBlockStateCountOutput");
    public static final PathElement PATH$meshBlockStates = PathElement.groupElement("meshBlockStates");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$futureResult = (OfInt) LAYOUT.select(PATH$futureResult);
    public static final OfLong LAYOUT$timestamp = (OfLong) LAYOUT.select(PATH$timestamp);
    public static final OfInt LAYOUT$meshBlockStateCapacityInput = (OfInt) LAYOUT.select(PATH$meshBlockStateCapacityInput);
    public static final OfInt LAYOUT$meshBlockStateCountOutput = (OfInt) LAYOUT.select(PATH$meshBlockStateCountOutput);
    public static final AddressLayout LAYOUT$meshBlockStates = (AddressLayout) LAYOUT.select(PATH$meshBlockStates);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$futureResult = LAYOUT$futureResult.byteSize();
    public static final long SIZE$timestamp = LAYOUT$timestamp.byteSize();
    public static final long SIZE$meshBlockStateCapacityInput = LAYOUT$meshBlockStateCapacityInput.byteSize();
    public static final long SIZE$meshBlockStateCountOutput = LAYOUT$meshBlockStateCountOutput.byteSize();
    public static final long SIZE$meshBlockStates = LAYOUT$meshBlockStates.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$futureResult = LAYOUT.byteOffset(PATH$futureResult);
    public static final long OFFSET$timestamp = LAYOUT.byteOffset(PATH$timestamp);
    public static final long OFFSET$meshBlockStateCapacityInput = LAYOUT.byteOffset(PATH$meshBlockStateCapacityInput);
    public static final long OFFSET$meshBlockStateCountOutput = LAYOUT.byteOffset(PATH$meshBlockStateCountOutput);
    public static final long OFFSET$meshBlockStates = LAYOUT.byteOffset(PATH$meshBlockStates);
}
