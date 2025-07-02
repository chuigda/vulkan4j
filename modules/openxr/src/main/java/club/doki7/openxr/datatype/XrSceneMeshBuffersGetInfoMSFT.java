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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneMeshBuffersGetInfoMSFT.html"><code>XrSceneMeshBuffersGetInfoMSFT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSceneMeshBuffersGetInfoMSFT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     uint64_t meshBufferId; // @link substring="meshBufferId" target="#meshBufferId"
/// } XrSceneMeshBuffersGetInfoMSFT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SCENE_MESH_BUFFERS_GET_INFO_MSFT`
///
/// The {@code allocate} ({@link XrSceneMeshBuffersGetInfoMSFT#allocate(Arena)}, {@link XrSceneMeshBuffersGetInfoMSFT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSceneMeshBuffersGetInfoMSFT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneMeshBuffersGetInfoMSFT.html"><code>XrSceneMeshBuffersGetInfoMSFT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSceneMeshBuffersGetInfoMSFT(@NotNull MemorySegment segment) implements IXrSceneMeshBuffersGetInfoMSFT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneMeshBuffersGetInfoMSFT.html"><code>XrSceneMeshBuffersGetInfoMSFT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSceneMeshBuffersGetInfoMSFT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSceneMeshBuffersGetInfoMSFT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSceneMeshBuffersGetInfoMSFT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSceneMeshBuffersGetInfoMSFT, Iterable<XrSceneMeshBuffersGetInfoMSFT> {
        public long size() {
            return segment.byteSize() / XrSceneMeshBuffersGetInfoMSFT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSceneMeshBuffersGetInfoMSFT at(long index) {
            return new XrSceneMeshBuffersGetInfoMSFT(segment.asSlice(index * XrSceneMeshBuffersGetInfoMSFT.BYTES, XrSceneMeshBuffersGetInfoMSFT.BYTES));
        }

        public XrSceneMeshBuffersGetInfoMSFT.Ptr at(long index, @NotNull Consumer<@NotNull XrSceneMeshBuffersGetInfoMSFT> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrSceneMeshBuffersGetInfoMSFT value) {
            MemorySegment s = segment.asSlice(index * XrSceneMeshBuffersGetInfoMSFT.BYTES, XrSceneMeshBuffersGetInfoMSFT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSceneMeshBuffersGetInfoMSFT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSceneMeshBuffersGetInfoMSFT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSceneMeshBuffersGetInfoMSFT.BYTES,
                (end - start) * XrSceneMeshBuffersGetInfoMSFT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSceneMeshBuffersGetInfoMSFT.BYTES));
        }

        public XrSceneMeshBuffersGetInfoMSFT[] toArray() {
            XrSceneMeshBuffersGetInfoMSFT[] ret = new XrSceneMeshBuffersGetInfoMSFT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSceneMeshBuffersGetInfoMSFT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSceneMeshBuffersGetInfoMSFT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSceneMeshBuffersGetInfoMSFT.BYTES;
            }

            @Override
            public XrSceneMeshBuffersGetInfoMSFT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSceneMeshBuffersGetInfoMSFT ret = new XrSceneMeshBuffersGetInfoMSFT(segment.asSlice(0, XrSceneMeshBuffersGetInfoMSFT.BYTES));
                segment = segment.asSlice(XrSceneMeshBuffersGetInfoMSFT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSceneMeshBuffersGetInfoMSFT allocate(Arena arena) {
        XrSceneMeshBuffersGetInfoMSFT ret = new XrSceneMeshBuffersGetInfoMSFT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.SCENE_MESH_BUFFERS_GET_INFO_MSFT);
        return ret;
    }

    public static XrSceneMeshBuffersGetInfoMSFT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSceneMeshBuffersGetInfoMSFT.Ptr ret = new XrSceneMeshBuffersGetInfoMSFT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.SCENE_MESH_BUFFERS_GET_INFO_MSFT);
        }
        return ret;
    }

    public static XrSceneMeshBuffersGetInfoMSFT clone(Arena arena, XrSceneMeshBuffersGetInfoMSFT src) {
        XrSceneMeshBuffersGetInfoMSFT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.SCENE_MESH_BUFFERS_GET_INFO_MSFT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSceneMeshBuffersGetInfoMSFT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSceneMeshBuffersGetInfoMSFT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSceneMeshBuffersGetInfoMSFT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned long meshBufferId() {
        return segment.get(LAYOUT$meshBufferId, OFFSET$meshBufferId);
    }

    public XrSceneMeshBuffersGetInfoMSFT meshBufferId(@Unsigned long value) {
        segment.set(LAYOUT$meshBufferId, OFFSET$meshBufferId, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_LONG.withName("meshBufferId")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$meshBufferId = PathElement.groupElement("meshBufferId");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfLong LAYOUT$meshBufferId = (OfLong) LAYOUT.select(PATH$meshBufferId);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$meshBufferId = LAYOUT$meshBufferId.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$meshBufferId = LAYOUT.byteOffset(PATH$meshBufferId);
}
