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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHandTrackingMeshFB.html"><code>XrHandTrackingMeshFB</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrHandTrackingMeshFB {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     uint32_t jointCapacityInput; // optional // @link substring="jointCapacityInput" target="#jointCapacityInput"
///     uint32_t jointCountOutput; // optional // @link substring="jointCountOutput" target="#jointCountOutput"
///     XrPosef* jointBindPoses; // optional // @link substring="XrPosef" target="XrPosef" @link substring="jointBindPoses" target="#jointBindPoses"
///     float* jointRadii; // optional // @link substring="jointRadii" target="#jointRadii"
///     XrHandJointEXT* jointParents; // optional // @link substring="XrHandJointEXT" target="XrHandJointEXT" @link substring="jointParents" target="#jointParents"
///     uint32_t vertexCapacityInput; // optional // @link substring="vertexCapacityInput" target="#vertexCapacityInput"
///     uint32_t vertexCountOutput; // optional // @link substring="vertexCountOutput" target="#vertexCountOutput"
///     XrVector3f* vertexPositions; // optional // @link substring="XrVector3f" target="XrVector3f" @link substring="vertexPositions" target="#vertexPositions"
///     XrVector3f* vertexNormals; // optional // @link substring="XrVector3f" target="XrVector3f" @link substring="vertexNormals" target="#vertexNormals"
///     XrVector2f* vertexUVs; // optional // @link substring="XrVector2f" target="XrVector2f" @link substring="vertexUVs" target="#vertexUVs"
///     XrVector4sFB* vertexBlendIndices; // optional // @link substring="XrVector4sFB" target="XrVector4sFB" @link substring="vertexBlendIndices" target="#vertexBlendIndices"
///     XrVector4f* vertexBlendWeights; // optional // @link substring="XrVector4f" target="XrVector4f" @link substring="vertexBlendWeights" target="#vertexBlendWeights"
///     uint32_t indexCapacityInput; // optional // @link substring="indexCapacityInput" target="#indexCapacityInput"
///     uint32_t indexCountOutput; // optional // @link substring="indexCountOutput" target="#indexCountOutput"
///     int16_t* indices; // optional // @link substring="indices" target="#indices"
/// } XrHandTrackingMeshFB;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_HAND_TRACKING_MESH_FB`
///
/// The {@code allocate} ({@link XrHandTrackingMeshFB#allocate(Arena)}, {@link XrHandTrackingMeshFB#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrHandTrackingMeshFB#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHandTrackingMeshFB.html"><code>XrHandTrackingMeshFB</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrHandTrackingMeshFB(@NotNull MemorySegment segment) implements IXrHandTrackingMeshFB {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHandTrackingMeshFB.html"><code>XrHandTrackingMeshFB</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrHandTrackingMeshFB}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrHandTrackingMeshFB to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrHandTrackingMeshFB.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrHandTrackingMeshFB, Iterable<XrHandTrackingMeshFB> {
        public long size() {
            return segment.byteSize() / XrHandTrackingMeshFB.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrHandTrackingMeshFB at(long index) {
            return new XrHandTrackingMeshFB(segment.asSlice(index * XrHandTrackingMeshFB.BYTES, XrHandTrackingMeshFB.BYTES));
        }

        public void at(long index, @NotNull Consumer<@NotNull XrHandTrackingMeshFB> consumer) {
            consumer.accept(at(index));
        }

        public void write(long index, @NotNull XrHandTrackingMeshFB value) {
            MemorySegment s = segment.asSlice(index * XrHandTrackingMeshFB.BYTES, XrHandTrackingMeshFB.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrHandTrackingMeshFB.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrHandTrackingMeshFB.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrHandTrackingMeshFB.BYTES,
                (end - start) * XrHandTrackingMeshFB.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrHandTrackingMeshFB.BYTES));
        }

        public XrHandTrackingMeshFB[] toArray() {
            XrHandTrackingMeshFB[] ret = new XrHandTrackingMeshFB[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrHandTrackingMeshFB> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrHandTrackingMeshFB> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrHandTrackingMeshFB.BYTES;
            }

            @Override
            public XrHandTrackingMeshFB next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrHandTrackingMeshFB ret = new XrHandTrackingMeshFB(segment.asSlice(0, XrHandTrackingMeshFB.BYTES));
                segment = segment.asSlice(XrHandTrackingMeshFB.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrHandTrackingMeshFB allocate(Arena arena) {
        XrHandTrackingMeshFB ret = new XrHandTrackingMeshFB(arena.allocate(LAYOUT));
        ret.type(XrStructureType.HAND_TRACKING_MESH_FB);
        return ret;
    }

    public static XrHandTrackingMeshFB.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrHandTrackingMeshFB.Ptr ret = new XrHandTrackingMeshFB.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.HAND_TRACKING_MESH_FB);
        }
        return ret;
    }

    public static XrHandTrackingMeshFB clone(Arena arena, XrHandTrackingMeshFB src) {
        XrHandTrackingMeshFB ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.HAND_TRACKING_MESH_FB);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrHandTrackingMeshFB type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrHandTrackingMeshFB next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrHandTrackingMeshFB next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int jointCapacityInput() {
        return segment.get(LAYOUT$jointCapacityInput, OFFSET$jointCapacityInput);
    }

    public XrHandTrackingMeshFB jointCapacityInput(@Unsigned int value) {
        segment.set(LAYOUT$jointCapacityInput, OFFSET$jointCapacityInput, value);
        return this;
    }

    public @Unsigned int jointCountOutput() {
        return segment.get(LAYOUT$jointCountOutput, OFFSET$jointCountOutput);
    }

    public XrHandTrackingMeshFB jointCountOutput(@Unsigned int value) {
        segment.set(LAYOUT$jointCountOutput, OFFSET$jointCountOutput, value);
        return this;
    }

    public XrHandTrackingMeshFB jointBindPoses(@Nullable IXrPosef value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        jointBindPosesRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrPosef.Ptr jointBindPoses(int assumedCount) {
        MemorySegment s = jointBindPosesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrPosef.BYTES);
        return new XrPosef.Ptr(s);
    }

    public @Nullable XrPosef jointBindPoses() {
        MemorySegment s = jointBindPosesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrPosef(s);
    }

    public @Pointer(target=XrPosef.class) @NotNull MemorySegment jointBindPosesRaw() {
        return segment.get(LAYOUT$jointBindPoses, OFFSET$jointBindPoses);
    }

    public void jointBindPosesRaw(@Pointer(target=XrPosef.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$jointBindPoses, OFFSET$jointBindPoses, value);
    }

    /// Note: the returned {@link FloatPtr} does not have correct
    /// {@link FloatPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link FloatPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable FloatPtr jointRadii() {
        MemorySegment s = jointRadiiRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new FloatPtr(s);
    }

    public XrHandTrackingMeshFB jointRadii(@Nullable FloatPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        jointRadiiRaw(s);
        return this;
    }

    public @Pointer(comment="float*") @NotNull MemorySegment jointRadiiRaw() {
        return segment.get(LAYOUT$jointRadii, OFFSET$jointRadii);
    }

    public void jointRadiiRaw(@Pointer(comment="float*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$jointRadii, OFFSET$jointRadii, value);
    }


    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @EnumType(XrHandJointEXT.class) IntPtr jointParents() {
        MemorySegment s = jointParentsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public XrHandTrackingMeshFB jointParents(@Nullable @EnumType(XrHandJointEXT.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        jointParentsRaw(s);
        return this;
    }

    public @Pointer(target=XrHandJointEXT.class) @NotNull MemorySegment jointParentsRaw() {
        return segment.get(LAYOUT$jointParents, OFFSET$jointParents);
    }

    public void jointParentsRaw(@Pointer(target=XrHandJointEXT.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$jointParents, OFFSET$jointParents, value);
    }

    public @Unsigned int vertexCapacityInput() {
        return segment.get(LAYOUT$vertexCapacityInput, OFFSET$vertexCapacityInput);
    }

    public XrHandTrackingMeshFB vertexCapacityInput(@Unsigned int value) {
        segment.set(LAYOUT$vertexCapacityInput, OFFSET$vertexCapacityInput, value);
        return this;
    }

    public @Unsigned int vertexCountOutput() {
        return segment.get(LAYOUT$vertexCountOutput, OFFSET$vertexCountOutput);
    }

    public XrHandTrackingMeshFB vertexCountOutput(@Unsigned int value) {
        segment.set(LAYOUT$vertexCountOutput, OFFSET$vertexCountOutput, value);
        return this;
    }

    public XrHandTrackingMeshFB vertexPositions(@Nullable IXrVector3f value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        vertexPositionsRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrVector3f.Ptr vertexPositions(int assumedCount) {
        MemorySegment s = vertexPositionsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrVector3f.BYTES);
        return new XrVector3f.Ptr(s);
    }

    public @Nullable XrVector3f vertexPositions() {
        MemorySegment s = vertexPositionsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrVector3f(s);
    }

    public @Pointer(target=XrVector3f.class) @NotNull MemorySegment vertexPositionsRaw() {
        return segment.get(LAYOUT$vertexPositions, OFFSET$vertexPositions);
    }

    public void vertexPositionsRaw(@Pointer(target=XrVector3f.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$vertexPositions, OFFSET$vertexPositions, value);
    }

    public XrHandTrackingMeshFB vertexNormals(@Nullable IXrVector3f value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        vertexNormalsRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrVector3f.Ptr vertexNormals(int assumedCount) {
        MemorySegment s = vertexNormalsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrVector3f.BYTES);
        return new XrVector3f.Ptr(s);
    }

    public @Nullable XrVector3f vertexNormals() {
        MemorySegment s = vertexNormalsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrVector3f(s);
    }

    public @Pointer(target=XrVector3f.class) @NotNull MemorySegment vertexNormalsRaw() {
        return segment.get(LAYOUT$vertexNormals, OFFSET$vertexNormals);
    }

    public void vertexNormalsRaw(@Pointer(target=XrVector3f.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$vertexNormals, OFFSET$vertexNormals, value);
    }

    public XrHandTrackingMeshFB vertexUVs(@Nullable IXrVector2f value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        vertexUVsRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrVector2f.Ptr vertexUVs(int assumedCount) {
        MemorySegment s = vertexUVsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrVector2f.BYTES);
        return new XrVector2f.Ptr(s);
    }

    public @Nullable XrVector2f vertexUVs() {
        MemorySegment s = vertexUVsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrVector2f(s);
    }

    public @Pointer(target=XrVector2f.class) @NotNull MemorySegment vertexUVsRaw() {
        return segment.get(LAYOUT$vertexUVs, OFFSET$vertexUVs);
    }

    public void vertexUVsRaw(@Pointer(target=XrVector2f.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$vertexUVs, OFFSET$vertexUVs, value);
    }

    public XrHandTrackingMeshFB vertexBlendIndices(@Nullable IXrVector4sFB value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        vertexBlendIndicesRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrVector4sFB.Ptr vertexBlendIndices(int assumedCount) {
        MemorySegment s = vertexBlendIndicesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrVector4sFB.BYTES);
        return new XrVector4sFB.Ptr(s);
    }

    public @Nullable XrVector4sFB vertexBlendIndices() {
        MemorySegment s = vertexBlendIndicesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrVector4sFB(s);
    }

    public @Pointer(target=XrVector4sFB.class) @NotNull MemorySegment vertexBlendIndicesRaw() {
        return segment.get(LAYOUT$vertexBlendIndices, OFFSET$vertexBlendIndices);
    }

    public void vertexBlendIndicesRaw(@Pointer(target=XrVector4sFB.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$vertexBlendIndices, OFFSET$vertexBlendIndices, value);
    }

    public XrHandTrackingMeshFB vertexBlendWeights(@Nullable IXrVector4f value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        vertexBlendWeightsRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrVector4f.Ptr vertexBlendWeights(int assumedCount) {
        MemorySegment s = vertexBlendWeightsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrVector4f.BYTES);
        return new XrVector4f.Ptr(s);
    }

    public @Nullable XrVector4f vertexBlendWeights() {
        MemorySegment s = vertexBlendWeightsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrVector4f(s);
    }

    public @Pointer(target=XrVector4f.class) @NotNull MemorySegment vertexBlendWeightsRaw() {
        return segment.get(LAYOUT$vertexBlendWeights, OFFSET$vertexBlendWeights);
    }

    public void vertexBlendWeightsRaw(@Pointer(target=XrVector4f.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$vertexBlendWeights, OFFSET$vertexBlendWeights, value);
    }

    public @Unsigned int indexCapacityInput() {
        return segment.get(LAYOUT$indexCapacityInput, OFFSET$indexCapacityInput);
    }

    public XrHandTrackingMeshFB indexCapacityInput(@Unsigned int value) {
        segment.set(LAYOUT$indexCapacityInput, OFFSET$indexCapacityInput, value);
        return this;
    }

    public @Unsigned int indexCountOutput() {
        return segment.get(LAYOUT$indexCountOutput, OFFSET$indexCountOutput);
    }

    public XrHandTrackingMeshFB indexCountOutput(@Unsigned int value) {
        segment.set(LAYOUT$indexCountOutput, OFFSET$indexCountOutput, value);
        return this;
    }

    /// Note: the returned {@link ShortPtr} does not have correct
    /// {@link ShortPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link ShortPtr#reinterpret} to set the size before actually reading from or
    /// writing to the buffer.
    public @Nullable ShortPtr indices() {
        MemorySegment s = indicesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new ShortPtr(s);
    }

    public XrHandTrackingMeshFB indices(@Nullable ShortPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        indicesRaw(s);
        return this;
    }

    public @Pointer(comment="int16_t*") @NotNull MemorySegment indicesRaw() {
        return segment.get(LAYOUT$indices, OFFSET$indices);
    }

    public void indicesRaw(@Pointer(comment="int16_t*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$indices, OFFSET$indices, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("jointCapacityInput"),
        ValueLayout.JAVA_INT.withName("jointCountOutput"),
        ValueLayout.ADDRESS.withTargetLayout(XrPosef.LAYOUT).withName("jointBindPoses"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_FLOAT).withName("jointRadii"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("jointParents"),
        ValueLayout.JAVA_INT.withName("vertexCapacityInput"),
        ValueLayout.JAVA_INT.withName("vertexCountOutput"),
        ValueLayout.ADDRESS.withTargetLayout(XrVector3f.LAYOUT).withName("vertexPositions"),
        ValueLayout.ADDRESS.withTargetLayout(XrVector3f.LAYOUT).withName("vertexNormals"),
        ValueLayout.ADDRESS.withTargetLayout(XrVector2f.LAYOUT).withName("vertexUVs"),
        ValueLayout.ADDRESS.withTargetLayout(XrVector4sFB.LAYOUT).withName("vertexBlendIndices"),
        ValueLayout.ADDRESS.withTargetLayout(XrVector4f.LAYOUT).withName("vertexBlendWeights"),
        ValueLayout.JAVA_INT.withName("indexCapacityInput"),
        ValueLayout.JAVA_INT.withName("indexCountOutput"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_SHORT).withName("indices")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$jointCapacityInput = PathElement.groupElement("jointCapacityInput");
    public static final PathElement PATH$jointCountOutput = PathElement.groupElement("jointCountOutput");
    public static final PathElement PATH$jointBindPoses = PathElement.groupElement("jointBindPoses");
    public static final PathElement PATH$jointRadii = PathElement.groupElement("jointRadii");
    public static final PathElement PATH$jointParents = PathElement.groupElement("jointParents");
    public static final PathElement PATH$vertexCapacityInput = PathElement.groupElement("vertexCapacityInput");
    public static final PathElement PATH$vertexCountOutput = PathElement.groupElement("vertexCountOutput");
    public static final PathElement PATH$vertexPositions = PathElement.groupElement("vertexPositions");
    public static final PathElement PATH$vertexNormals = PathElement.groupElement("vertexNormals");
    public static final PathElement PATH$vertexUVs = PathElement.groupElement("vertexUVs");
    public static final PathElement PATH$vertexBlendIndices = PathElement.groupElement("vertexBlendIndices");
    public static final PathElement PATH$vertexBlendWeights = PathElement.groupElement("vertexBlendWeights");
    public static final PathElement PATH$indexCapacityInput = PathElement.groupElement("indexCapacityInput");
    public static final PathElement PATH$indexCountOutput = PathElement.groupElement("indexCountOutput");
    public static final PathElement PATH$indices = PathElement.groupElement("indices");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$jointCapacityInput = (OfInt) LAYOUT.select(PATH$jointCapacityInput);
    public static final OfInt LAYOUT$jointCountOutput = (OfInt) LAYOUT.select(PATH$jointCountOutput);
    public static final AddressLayout LAYOUT$jointBindPoses = (AddressLayout) LAYOUT.select(PATH$jointBindPoses);
    public static final AddressLayout LAYOUT$jointRadii = (AddressLayout) LAYOUT.select(PATH$jointRadii);
    public static final AddressLayout LAYOUT$jointParents = (AddressLayout) LAYOUT.select(PATH$jointParents);
    public static final OfInt LAYOUT$vertexCapacityInput = (OfInt) LAYOUT.select(PATH$vertexCapacityInput);
    public static final OfInt LAYOUT$vertexCountOutput = (OfInt) LAYOUT.select(PATH$vertexCountOutput);
    public static final AddressLayout LAYOUT$vertexPositions = (AddressLayout) LAYOUT.select(PATH$vertexPositions);
    public static final AddressLayout LAYOUT$vertexNormals = (AddressLayout) LAYOUT.select(PATH$vertexNormals);
    public static final AddressLayout LAYOUT$vertexUVs = (AddressLayout) LAYOUT.select(PATH$vertexUVs);
    public static final AddressLayout LAYOUT$vertexBlendIndices = (AddressLayout) LAYOUT.select(PATH$vertexBlendIndices);
    public static final AddressLayout LAYOUT$vertexBlendWeights = (AddressLayout) LAYOUT.select(PATH$vertexBlendWeights);
    public static final OfInt LAYOUT$indexCapacityInput = (OfInt) LAYOUT.select(PATH$indexCapacityInput);
    public static final OfInt LAYOUT$indexCountOutput = (OfInt) LAYOUT.select(PATH$indexCountOutput);
    public static final AddressLayout LAYOUT$indices = (AddressLayout) LAYOUT.select(PATH$indices);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$jointCapacityInput = LAYOUT$jointCapacityInput.byteSize();
    public static final long SIZE$jointCountOutput = LAYOUT$jointCountOutput.byteSize();
    public static final long SIZE$jointBindPoses = LAYOUT$jointBindPoses.byteSize();
    public static final long SIZE$jointRadii = LAYOUT$jointRadii.byteSize();
    public static final long SIZE$jointParents = LAYOUT$jointParents.byteSize();
    public static final long SIZE$vertexCapacityInput = LAYOUT$vertexCapacityInput.byteSize();
    public static final long SIZE$vertexCountOutput = LAYOUT$vertexCountOutput.byteSize();
    public static final long SIZE$vertexPositions = LAYOUT$vertexPositions.byteSize();
    public static final long SIZE$vertexNormals = LAYOUT$vertexNormals.byteSize();
    public static final long SIZE$vertexUVs = LAYOUT$vertexUVs.byteSize();
    public static final long SIZE$vertexBlendIndices = LAYOUT$vertexBlendIndices.byteSize();
    public static final long SIZE$vertexBlendWeights = LAYOUT$vertexBlendWeights.byteSize();
    public static final long SIZE$indexCapacityInput = LAYOUT$indexCapacityInput.byteSize();
    public static final long SIZE$indexCountOutput = LAYOUT$indexCountOutput.byteSize();
    public static final long SIZE$indices = LAYOUT$indices.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$jointCapacityInput = LAYOUT.byteOffset(PATH$jointCapacityInput);
    public static final long OFFSET$jointCountOutput = LAYOUT.byteOffset(PATH$jointCountOutput);
    public static final long OFFSET$jointBindPoses = LAYOUT.byteOffset(PATH$jointBindPoses);
    public static final long OFFSET$jointRadii = LAYOUT.byteOffset(PATH$jointRadii);
    public static final long OFFSET$jointParents = LAYOUT.byteOffset(PATH$jointParents);
    public static final long OFFSET$vertexCapacityInput = LAYOUT.byteOffset(PATH$vertexCapacityInput);
    public static final long OFFSET$vertexCountOutput = LAYOUT.byteOffset(PATH$vertexCountOutput);
    public static final long OFFSET$vertexPositions = LAYOUT.byteOffset(PATH$vertexPositions);
    public static final long OFFSET$vertexNormals = LAYOUT.byteOffset(PATH$vertexNormals);
    public static final long OFFSET$vertexUVs = LAYOUT.byteOffset(PATH$vertexUVs);
    public static final long OFFSET$vertexBlendIndices = LAYOUT.byteOffset(PATH$vertexBlendIndices);
    public static final long OFFSET$vertexBlendWeights = LAYOUT.byteOffset(PATH$vertexBlendWeights);
    public static final long OFFSET$indexCapacityInput = LAYOUT.byteOffset(PATH$indexCapacityInput);
    public static final long OFFSET$indexCountOutput = LAYOUT.byteOffset(PATH$indexCountOutput);
    public static final long OFFSET$indices = LAYOUT.byteOffset(PATH$indices);
}
