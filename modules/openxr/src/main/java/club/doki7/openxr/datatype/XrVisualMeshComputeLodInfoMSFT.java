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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrVisualMeshComputeLodInfoMSFT.html"><code>XrVisualMeshComputeLodInfoMSFT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrVisualMeshComputeLodInfoMSFT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrMeshComputeLodMSFT lod; // @link substring="XrMeshComputeLodMSFT" target="XrMeshComputeLodMSFT" @link substring="lod" target="#lod"
/// } XrVisualMeshComputeLodInfoMSFT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_VISUAL_MESH_COMPUTE_LOD_INFO_MSFT`
///
/// The {@code allocate} ({@link XrVisualMeshComputeLodInfoMSFT#allocate(Arena)}, {@link XrVisualMeshComputeLodInfoMSFT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrVisualMeshComputeLodInfoMSFT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrVisualMeshComputeLodInfoMSFT.html"><code>XrVisualMeshComputeLodInfoMSFT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrVisualMeshComputeLodInfoMSFT(@NotNull MemorySegment segment) implements IXrVisualMeshComputeLodInfoMSFT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrVisualMeshComputeLodInfoMSFT.html"><code>XrVisualMeshComputeLodInfoMSFT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrVisualMeshComputeLodInfoMSFT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrVisualMeshComputeLodInfoMSFT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrVisualMeshComputeLodInfoMSFT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrVisualMeshComputeLodInfoMSFT, Iterable<XrVisualMeshComputeLodInfoMSFT> {
        public long size() {
            return segment.byteSize() / XrVisualMeshComputeLodInfoMSFT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrVisualMeshComputeLodInfoMSFT at(long index) {
            return new XrVisualMeshComputeLodInfoMSFT(segment.asSlice(index * XrVisualMeshComputeLodInfoMSFT.BYTES, XrVisualMeshComputeLodInfoMSFT.BYTES));
        }

        public void at(long index, @NotNull Consumer<@NotNull XrVisualMeshComputeLodInfoMSFT> consumer) {
            consumer.accept(at(index));
        }

        public void write(long index, @NotNull XrVisualMeshComputeLodInfoMSFT value) {
            MemorySegment s = segment.asSlice(index * XrVisualMeshComputeLodInfoMSFT.BYTES, XrVisualMeshComputeLodInfoMSFT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrVisualMeshComputeLodInfoMSFT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrVisualMeshComputeLodInfoMSFT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrVisualMeshComputeLodInfoMSFT.BYTES,
                (end - start) * XrVisualMeshComputeLodInfoMSFT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrVisualMeshComputeLodInfoMSFT.BYTES));
        }

        public XrVisualMeshComputeLodInfoMSFT[] toArray() {
            XrVisualMeshComputeLodInfoMSFT[] ret = new XrVisualMeshComputeLodInfoMSFT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrVisualMeshComputeLodInfoMSFT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrVisualMeshComputeLodInfoMSFT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrVisualMeshComputeLodInfoMSFT.BYTES;
            }

            @Override
            public XrVisualMeshComputeLodInfoMSFT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrVisualMeshComputeLodInfoMSFT ret = new XrVisualMeshComputeLodInfoMSFT(segment.asSlice(0, XrVisualMeshComputeLodInfoMSFT.BYTES));
                segment = segment.asSlice(XrVisualMeshComputeLodInfoMSFT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrVisualMeshComputeLodInfoMSFT allocate(Arena arena) {
        XrVisualMeshComputeLodInfoMSFT ret = new XrVisualMeshComputeLodInfoMSFT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.VISUAL_MESH_COMPUTE_LOD_INFO_MSFT);
        return ret;
    }

    public static XrVisualMeshComputeLodInfoMSFT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrVisualMeshComputeLodInfoMSFT.Ptr ret = new XrVisualMeshComputeLodInfoMSFT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.VISUAL_MESH_COMPUTE_LOD_INFO_MSFT);
        }
        return ret;
    }

    public static XrVisualMeshComputeLodInfoMSFT clone(Arena arena, XrVisualMeshComputeLodInfoMSFT src) {
        XrVisualMeshComputeLodInfoMSFT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.VISUAL_MESH_COMPUTE_LOD_INFO_MSFT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrVisualMeshComputeLodInfoMSFT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrVisualMeshComputeLodInfoMSFT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrVisualMeshComputeLodInfoMSFT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @EnumType(XrMeshComputeLodMSFT.class) int lod() {
        return segment.get(LAYOUT$lod, OFFSET$lod);
    }

    public XrVisualMeshComputeLodInfoMSFT lod(@EnumType(XrMeshComputeLodMSFT.class) int value) {
        segment.set(LAYOUT$lod, OFFSET$lod, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("lod")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$lod = PathElement.groupElement("lod");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$lod = (OfInt) LAYOUT.select(PATH$lod);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$lod = LAYOUT$lod.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$lod = LAYOUT.byteOffset(PATH$lod);
}
