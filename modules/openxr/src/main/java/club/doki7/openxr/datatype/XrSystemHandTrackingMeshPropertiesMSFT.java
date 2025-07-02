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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSystemHandTrackingMeshPropertiesMSFT.html"><code>XrSystemHandTrackingMeshPropertiesMSFT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSystemHandTrackingMeshPropertiesMSFT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     XrBool32 supportsHandTrackingMesh; // @link substring="supportsHandTrackingMesh" target="#supportsHandTrackingMesh"
///     uint32_t maxHandMeshIndexCount; // @link substring="maxHandMeshIndexCount" target="#maxHandMeshIndexCount"
///     uint32_t maxHandMeshVertexCount; // @link substring="maxHandMeshVertexCount" target="#maxHandMeshVertexCount"
/// } XrSystemHandTrackingMeshPropertiesMSFT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SYSTEM_HAND_TRACKING_MESH_PROPERTIES_MSFT`
///
/// The {@code allocate} ({@link XrSystemHandTrackingMeshPropertiesMSFT#allocate(Arena)}, {@link XrSystemHandTrackingMeshPropertiesMSFT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSystemHandTrackingMeshPropertiesMSFT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSystemHandTrackingMeshPropertiesMSFT.html"><code>XrSystemHandTrackingMeshPropertiesMSFT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSystemHandTrackingMeshPropertiesMSFT(@NotNull MemorySegment segment) implements IXrSystemHandTrackingMeshPropertiesMSFT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSystemHandTrackingMeshPropertiesMSFT.html"><code>XrSystemHandTrackingMeshPropertiesMSFT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSystemHandTrackingMeshPropertiesMSFT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSystemHandTrackingMeshPropertiesMSFT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSystemHandTrackingMeshPropertiesMSFT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSystemHandTrackingMeshPropertiesMSFT, Iterable<XrSystemHandTrackingMeshPropertiesMSFT> {
        public long size() {
            return segment.byteSize() / XrSystemHandTrackingMeshPropertiesMSFT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSystemHandTrackingMeshPropertiesMSFT at(long index) {
            return new XrSystemHandTrackingMeshPropertiesMSFT(segment.asSlice(index * XrSystemHandTrackingMeshPropertiesMSFT.BYTES, XrSystemHandTrackingMeshPropertiesMSFT.BYTES));
        }

        public XrSystemHandTrackingMeshPropertiesMSFT.Ptr at(long index, @NotNull Consumer<@NotNull XrSystemHandTrackingMeshPropertiesMSFT> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrSystemHandTrackingMeshPropertiesMSFT value) {
            MemorySegment s = segment.asSlice(index * XrSystemHandTrackingMeshPropertiesMSFT.BYTES, XrSystemHandTrackingMeshPropertiesMSFT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSystemHandTrackingMeshPropertiesMSFT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSystemHandTrackingMeshPropertiesMSFT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSystemHandTrackingMeshPropertiesMSFT.BYTES,
                (end - start) * XrSystemHandTrackingMeshPropertiesMSFT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSystemHandTrackingMeshPropertiesMSFT.BYTES));
        }

        public XrSystemHandTrackingMeshPropertiesMSFT[] toArray() {
            XrSystemHandTrackingMeshPropertiesMSFT[] ret = new XrSystemHandTrackingMeshPropertiesMSFT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSystemHandTrackingMeshPropertiesMSFT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSystemHandTrackingMeshPropertiesMSFT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSystemHandTrackingMeshPropertiesMSFT.BYTES;
            }

            @Override
            public XrSystemHandTrackingMeshPropertiesMSFT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSystemHandTrackingMeshPropertiesMSFT ret = new XrSystemHandTrackingMeshPropertiesMSFT(segment.asSlice(0, XrSystemHandTrackingMeshPropertiesMSFT.BYTES));
                segment = segment.asSlice(XrSystemHandTrackingMeshPropertiesMSFT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSystemHandTrackingMeshPropertiesMSFT allocate(Arena arena) {
        XrSystemHandTrackingMeshPropertiesMSFT ret = new XrSystemHandTrackingMeshPropertiesMSFT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.SYSTEM_HAND_TRACKING_MESH_PROPERTIES_MSFT);
        return ret;
    }

    public static XrSystemHandTrackingMeshPropertiesMSFT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSystemHandTrackingMeshPropertiesMSFT.Ptr ret = new XrSystemHandTrackingMeshPropertiesMSFT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.SYSTEM_HAND_TRACKING_MESH_PROPERTIES_MSFT);
        }
        return ret;
    }

    public static XrSystemHandTrackingMeshPropertiesMSFT clone(Arena arena, XrSystemHandTrackingMeshPropertiesMSFT src) {
        XrSystemHandTrackingMeshPropertiesMSFT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.SYSTEM_HAND_TRACKING_MESH_PROPERTIES_MSFT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSystemHandTrackingMeshPropertiesMSFT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSystemHandTrackingMeshPropertiesMSFT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSystemHandTrackingMeshPropertiesMSFT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @NativeType("XrBool32") @Unsigned int supportsHandTrackingMesh() {
        return segment.get(LAYOUT$supportsHandTrackingMesh, OFFSET$supportsHandTrackingMesh);
    }

    public XrSystemHandTrackingMeshPropertiesMSFT supportsHandTrackingMesh(@NativeType("XrBool32") @Unsigned int value) {
        segment.set(LAYOUT$supportsHandTrackingMesh, OFFSET$supportsHandTrackingMesh, value);
        return this;
    }

    public @Unsigned int maxHandMeshIndexCount() {
        return segment.get(LAYOUT$maxHandMeshIndexCount, OFFSET$maxHandMeshIndexCount);
    }

    public XrSystemHandTrackingMeshPropertiesMSFT maxHandMeshIndexCount(@Unsigned int value) {
        segment.set(LAYOUT$maxHandMeshIndexCount, OFFSET$maxHandMeshIndexCount, value);
        return this;
    }

    public @Unsigned int maxHandMeshVertexCount() {
        return segment.get(LAYOUT$maxHandMeshVertexCount, OFFSET$maxHandMeshVertexCount);
    }

    public XrSystemHandTrackingMeshPropertiesMSFT maxHandMeshVertexCount(@Unsigned int value) {
        segment.set(LAYOUT$maxHandMeshVertexCount, OFFSET$maxHandMeshVertexCount, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("supportsHandTrackingMesh"),
        ValueLayout.JAVA_INT.withName("maxHandMeshIndexCount"),
        ValueLayout.JAVA_INT.withName("maxHandMeshVertexCount")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$supportsHandTrackingMesh = PathElement.groupElement("supportsHandTrackingMesh");
    public static final PathElement PATH$maxHandMeshIndexCount = PathElement.groupElement("maxHandMeshIndexCount");
    public static final PathElement PATH$maxHandMeshVertexCount = PathElement.groupElement("maxHandMeshVertexCount");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$supportsHandTrackingMesh = (OfInt) LAYOUT.select(PATH$supportsHandTrackingMesh);
    public static final OfInt LAYOUT$maxHandMeshIndexCount = (OfInt) LAYOUT.select(PATH$maxHandMeshIndexCount);
    public static final OfInt LAYOUT$maxHandMeshVertexCount = (OfInt) LAYOUT.select(PATH$maxHandMeshVertexCount);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$supportsHandTrackingMesh = LAYOUT$supportsHandTrackingMesh.byteSize();
    public static final long SIZE$maxHandMeshIndexCount = LAYOUT$maxHandMeshIndexCount.byteSize();
    public static final long SIZE$maxHandMeshVertexCount = LAYOUT$maxHandMeshVertexCount.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$supportsHandTrackingMesh = LAYOUT.byteOffset(PATH$supportsHandTrackingMesh);
    public static final long OFFSET$maxHandMeshIndexCount = LAYOUT.byteOffset(PATH$maxHandMeshIndexCount);
    public static final long OFFSET$maxHandMeshVertexCount = LAYOUT.byteOffset(PATH$maxHandMeshVertexCount);
}
