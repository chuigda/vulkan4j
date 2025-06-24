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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialGraphNodeSpaceCreateInfoMSFT.html"><code>XrSpatialGraphNodeSpaceCreateInfoMSFT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSpatialGraphNodeSpaceCreateInfoMSFT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrSpatialGraphNodeTypeMSFT nodeType; // @link substring="XrSpatialGraphNodeTypeMSFT" target="XrSpatialGraphNodeTypeMSFT" @link substring="nodeType" target="#nodeType"
///     uint8_t nodeId; // @link substring="nodeId" target="#nodeId"
///     XrPosef pose; // @link substring="XrPosef" target="XrPosef" @link substring="pose" target="#pose"
/// } XrSpatialGraphNodeSpaceCreateInfoMSFT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SPATIAL_GRAPH_NODE_SPACE_CREATE_INFO_MSFT`
///
/// The {@code allocate} ({@link XrSpatialGraphNodeSpaceCreateInfoMSFT#allocate(Arena)}, {@link XrSpatialGraphNodeSpaceCreateInfoMSFT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSpatialGraphNodeSpaceCreateInfoMSFT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialGraphNodeSpaceCreateInfoMSFT.html"><code>XrSpatialGraphNodeSpaceCreateInfoMSFT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSpatialGraphNodeSpaceCreateInfoMSFT(@NotNull MemorySegment segment) implements IXrSpatialGraphNodeSpaceCreateInfoMSFT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialGraphNodeSpaceCreateInfoMSFT.html"><code>XrSpatialGraphNodeSpaceCreateInfoMSFT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSpatialGraphNodeSpaceCreateInfoMSFT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSpatialGraphNodeSpaceCreateInfoMSFT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSpatialGraphNodeSpaceCreateInfoMSFT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSpatialGraphNodeSpaceCreateInfoMSFT, Iterable<XrSpatialGraphNodeSpaceCreateInfoMSFT> {
        public long size() {
            return segment.byteSize() / XrSpatialGraphNodeSpaceCreateInfoMSFT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSpatialGraphNodeSpaceCreateInfoMSFT at(long index) {
            return new XrSpatialGraphNodeSpaceCreateInfoMSFT(segment.asSlice(index * XrSpatialGraphNodeSpaceCreateInfoMSFT.BYTES, XrSpatialGraphNodeSpaceCreateInfoMSFT.BYTES));
        }

        public void write(long index, @NotNull XrSpatialGraphNodeSpaceCreateInfoMSFT value) {
            MemorySegment s = segment.asSlice(index * XrSpatialGraphNodeSpaceCreateInfoMSFT.BYTES, XrSpatialGraphNodeSpaceCreateInfoMSFT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSpatialGraphNodeSpaceCreateInfoMSFT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSpatialGraphNodeSpaceCreateInfoMSFT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSpatialGraphNodeSpaceCreateInfoMSFT.BYTES,
                (end - start) * XrSpatialGraphNodeSpaceCreateInfoMSFT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSpatialGraphNodeSpaceCreateInfoMSFT.BYTES));
        }

        public XrSpatialGraphNodeSpaceCreateInfoMSFT[] toArray() {
            XrSpatialGraphNodeSpaceCreateInfoMSFT[] ret = new XrSpatialGraphNodeSpaceCreateInfoMSFT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSpatialGraphNodeSpaceCreateInfoMSFT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSpatialGraphNodeSpaceCreateInfoMSFT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSpatialGraphNodeSpaceCreateInfoMSFT.BYTES;
            }

            @Override
            public XrSpatialGraphNodeSpaceCreateInfoMSFT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSpatialGraphNodeSpaceCreateInfoMSFT ret = new XrSpatialGraphNodeSpaceCreateInfoMSFT(segment.asSlice(0, XrSpatialGraphNodeSpaceCreateInfoMSFT.BYTES));
                segment = segment.asSlice(XrSpatialGraphNodeSpaceCreateInfoMSFT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSpatialGraphNodeSpaceCreateInfoMSFT allocate(Arena arena) {
        XrSpatialGraphNodeSpaceCreateInfoMSFT ret = new XrSpatialGraphNodeSpaceCreateInfoMSFT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_SPATIAL_GRAPH_NODE_SPACE_CREATE_INFO_MSFT);
        return ret;
    }

    public static XrSpatialGraphNodeSpaceCreateInfoMSFT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSpatialGraphNodeSpaceCreateInfoMSFT.Ptr ret = new XrSpatialGraphNodeSpaceCreateInfoMSFT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_SPATIAL_GRAPH_NODE_SPACE_CREATE_INFO_MSFT);
        }
        return ret;
    }

    public static XrSpatialGraphNodeSpaceCreateInfoMSFT clone(Arena arena, XrSpatialGraphNodeSpaceCreateInfoMSFT src) {
        XrSpatialGraphNodeSpaceCreateInfoMSFT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_SPATIAL_GRAPH_NODE_SPACE_CREATE_INFO_MSFT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSpatialGraphNodeSpaceCreateInfoMSFT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSpatialGraphNodeSpaceCreateInfoMSFT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSpatialGraphNodeSpaceCreateInfoMSFT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @EnumType(XrSpatialGraphNodeTypeMSFT.class) int nodeType() {
        return segment.get(LAYOUT$nodeType, OFFSET$nodeType);
    }

    public XrSpatialGraphNodeSpaceCreateInfoMSFT nodeType(@EnumType(XrSpatialGraphNodeTypeMSFT.class) int value) {
        segment.set(LAYOUT$nodeType, OFFSET$nodeType, value);
        return this;
    }

    public @Unsigned byte nodeId() {
        return segment.get(LAYOUT$nodeId, OFFSET$nodeId);
    }

    public XrSpatialGraphNodeSpaceCreateInfoMSFT nodeId(@Unsigned byte value) {
        segment.set(LAYOUT$nodeId, OFFSET$nodeId, value);
        return this;
    }

    public @NotNull XrPosef pose() {
        return new XrPosef(segment.asSlice(OFFSET$pose, LAYOUT$pose));
    }

    public XrSpatialGraphNodeSpaceCreateInfoMSFT pose(@NotNull XrPosef value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$pose, SIZE$pose);
        return this;
    }

    public XrSpatialGraphNodeSpaceCreateInfoMSFT pose(Consumer<@NotNull XrPosef> consumer) {
        consumer.accept(pose());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("nodeType"),
        ValueLayout.JAVA_BYTE.withName("nodeId"),
        XrPosef.LAYOUT.withName("pose")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$nodeType = PathElement.groupElement("nodeType");
    public static final PathElement PATH$nodeId = PathElement.groupElement("nodeId");
    public static final PathElement PATH$pose = PathElement.groupElement("pose");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$nodeType = (OfInt) LAYOUT.select(PATH$nodeType);
    public static final OfByte LAYOUT$nodeId = (OfByte) LAYOUT.select(PATH$nodeId);
    public static final StructLayout LAYOUT$pose = (StructLayout) LAYOUT.select(PATH$pose);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$nodeType = LAYOUT$nodeType.byteSize();
    public static final long SIZE$nodeId = LAYOUT$nodeId.byteSize();
    public static final long SIZE$pose = LAYOUT$pose.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$nodeType = LAYOUT.byteOffset(PATH$nodeType);
    public static final long OFFSET$nodeId = LAYOUT.byteOffset(PATH$nodeId);
    public static final long OFFSET$pose = LAYOUT.byteOffset(PATH$pose);
}
