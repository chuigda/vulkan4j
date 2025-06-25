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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialGraphNodeBindingPropertiesMSFT.html"><code>XrSpatialGraphNodeBindingPropertiesMSFT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSpatialGraphNodeBindingPropertiesMSFT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     uint8_t[XR_GUID_SIZE_MSFT] nodeId; // @link substring="nodeId" target="#nodeId"
///     XrPosef poseInNodeSpace; // @link substring="XrPosef" target="XrPosef" @link substring="poseInNodeSpace" target="#poseInNodeSpace"
/// } XrSpatialGraphNodeBindingPropertiesMSFT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SPATIAL_GRAPH_NODE_BINDING_PROPERTIES_MSFT`
///
/// The {@code allocate} ({@link XrSpatialGraphNodeBindingPropertiesMSFT#allocate(Arena)}, {@link XrSpatialGraphNodeBindingPropertiesMSFT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSpatialGraphNodeBindingPropertiesMSFT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialGraphNodeBindingPropertiesMSFT.html"><code>XrSpatialGraphNodeBindingPropertiesMSFT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSpatialGraphNodeBindingPropertiesMSFT(@NotNull MemorySegment segment) implements IXrSpatialGraphNodeBindingPropertiesMSFT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialGraphNodeBindingPropertiesMSFT.html"><code>XrSpatialGraphNodeBindingPropertiesMSFT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSpatialGraphNodeBindingPropertiesMSFT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSpatialGraphNodeBindingPropertiesMSFT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSpatialGraphNodeBindingPropertiesMSFT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSpatialGraphNodeBindingPropertiesMSFT, Iterable<XrSpatialGraphNodeBindingPropertiesMSFT> {
        public long size() {
            return segment.byteSize() / XrSpatialGraphNodeBindingPropertiesMSFT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSpatialGraphNodeBindingPropertiesMSFT at(long index) {
            return new XrSpatialGraphNodeBindingPropertiesMSFT(segment.asSlice(index * XrSpatialGraphNodeBindingPropertiesMSFT.BYTES, XrSpatialGraphNodeBindingPropertiesMSFT.BYTES));
        }

        public void write(long index, @NotNull XrSpatialGraphNodeBindingPropertiesMSFT value) {
            MemorySegment s = segment.asSlice(index * XrSpatialGraphNodeBindingPropertiesMSFT.BYTES, XrSpatialGraphNodeBindingPropertiesMSFT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSpatialGraphNodeBindingPropertiesMSFT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSpatialGraphNodeBindingPropertiesMSFT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSpatialGraphNodeBindingPropertiesMSFT.BYTES,
                (end - start) * XrSpatialGraphNodeBindingPropertiesMSFT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSpatialGraphNodeBindingPropertiesMSFT.BYTES));
        }

        public XrSpatialGraphNodeBindingPropertiesMSFT[] toArray() {
            XrSpatialGraphNodeBindingPropertiesMSFT[] ret = new XrSpatialGraphNodeBindingPropertiesMSFT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSpatialGraphNodeBindingPropertiesMSFT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSpatialGraphNodeBindingPropertiesMSFT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSpatialGraphNodeBindingPropertiesMSFT.BYTES;
            }

            @Override
            public XrSpatialGraphNodeBindingPropertiesMSFT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSpatialGraphNodeBindingPropertiesMSFT ret = new XrSpatialGraphNodeBindingPropertiesMSFT(segment.asSlice(0, XrSpatialGraphNodeBindingPropertiesMSFT.BYTES));
                segment = segment.asSlice(XrSpatialGraphNodeBindingPropertiesMSFT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSpatialGraphNodeBindingPropertiesMSFT allocate(Arena arena) {
        XrSpatialGraphNodeBindingPropertiesMSFT ret = new XrSpatialGraphNodeBindingPropertiesMSFT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.SPATIAL_GRAPH_NODE_BINDING_PROPERTIES_MSFT);
        return ret;
    }

    public static XrSpatialGraphNodeBindingPropertiesMSFT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSpatialGraphNodeBindingPropertiesMSFT.Ptr ret = new XrSpatialGraphNodeBindingPropertiesMSFT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.SPATIAL_GRAPH_NODE_BINDING_PROPERTIES_MSFT);
        }
        return ret;
    }

    public static XrSpatialGraphNodeBindingPropertiesMSFT clone(Arena arena, XrSpatialGraphNodeBindingPropertiesMSFT src) {
        XrSpatialGraphNodeBindingPropertiesMSFT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.SPATIAL_GRAPH_NODE_BINDING_PROPERTIES_MSFT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSpatialGraphNodeBindingPropertiesMSFT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSpatialGraphNodeBindingPropertiesMSFT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSpatialGraphNodeBindingPropertiesMSFT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned BytePtr nodeId() {
        return new BytePtr(nodeIdRaw());
    }

    public XrSpatialGraphNodeBindingPropertiesMSFT nodeId(@Unsigned BytePtr value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$nodeId, SIZE$nodeId);
        return this;
    }

    public @NotNull MemorySegment nodeIdRaw() {
        return segment.asSlice(OFFSET$nodeId, SIZE$nodeId);
    }

    public @NotNull XrPosef poseInNodeSpace() {
        return new XrPosef(segment.asSlice(OFFSET$poseInNodeSpace, LAYOUT$poseInNodeSpace));
    }

    public XrSpatialGraphNodeBindingPropertiesMSFT poseInNodeSpace(@NotNull XrPosef value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$poseInNodeSpace, SIZE$poseInNodeSpace);
        return this;
    }

    public XrSpatialGraphNodeBindingPropertiesMSFT poseInNodeSpace(Consumer<@NotNull XrPosef> consumer) {
        consumer.accept(poseInNodeSpace());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        MemoryLayout.sequenceLayout(GUID_SIZE_MSFT, ValueLayout.JAVA_BYTE).withName("nodeId"),
        XrPosef.LAYOUT.withName("poseInNodeSpace")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$nodeId = PathElement.groupElement("nodeId");
    public static final PathElement PATH$poseInNodeSpace = PathElement.groupElement("poseInNodeSpace");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final SequenceLayout LAYOUT$nodeId = (SequenceLayout) LAYOUT.select(PATH$nodeId);
    public static final StructLayout LAYOUT$poseInNodeSpace = (StructLayout) LAYOUT.select(PATH$poseInNodeSpace);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$nodeId = LAYOUT$nodeId.byteSize();
    public static final long SIZE$poseInNodeSpace = LAYOUT$poseInNodeSpace.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$nodeId = LAYOUT.byteOffset(PATH$nodeId);
    public static final long OFFSET$poseInNodeSpace = LAYOUT.byteOffset(PATH$poseInNodeSpace);
}
