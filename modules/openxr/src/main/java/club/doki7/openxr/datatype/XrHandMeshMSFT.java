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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHandMeshMSFT.html"><code>XrHandMeshMSFT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrHandMeshMSFT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     XrBool32 isActive; // @link substring="isActive" target="#isActive"
///     XrBool32 indexBufferChanged; // @link substring="indexBufferChanged" target="#indexBufferChanged"
///     XrBool32 vertexBufferChanged; // @link substring="vertexBufferChanged" target="#vertexBufferChanged"
///     XrHandMeshIndexBufferMSFT indexBuffer; // @link substring="XrHandMeshIndexBufferMSFT" target="XrHandMeshIndexBufferMSFT" @link substring="indexBuffer" target="#indexBuffer"
///     XrHandMeshVertexBufferMSFT vertexBuffer; // @link substring="XrHandMeshVertexBufferMSFT" target="XrHandMeshVertexBufferMSFT" @link substring="vertexBuffer" target="#vertexBuffer"
/// } XrHandMeshMSFT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_HAND_MESH_MSFT`
///
/// The {@code allocate} ({@link XrHandMeshMSFT#allocate(Arena)}, {@link XrHandMeshMSFT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrHandMeshMSFT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHandMeshMSFT.html"><code>XrHandMeshMSFT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrHandMeshMSFT(@NotNull MemorySegment segment) implements IXrHandMeshMSFT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHandMeshMSFT.html"><code>XrHandMeshMSFT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrHandMeshMSFT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrHandMeshMSFT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrHandMeshMSFT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrHandMeshMSFT, Iterable<XrHandMeshMSFT> {
        public long size() {
            return segment.byteSize() / XrHandMeshMSFT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrHandMeshMSFT at(long index) {
            return new XrHandMeshMSFT(segment.asSlice(index * XrHandMeshMSFT.BYTES, XrHandMeshMSFT.BYTES));
        }

        public XrHandMeshMSFT.Ptr at(long index, @NotNull Consumer<@NotNull XrHandMeshMSFT> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrHandMeshMSFT value) {
            MemorySegment s = segment.asSlice(index * XrHandMeshMSFT.BYTES, XrHandMeshMSFT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrHandMeshMSFT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrHandMeshMSFT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrHandMeshMSFT.BYTES,
                (end - start) * XrHandMeshMSFT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrHandMeshMSFT.BYTES));
        }

        public XrHandMeshMSFT[] toArray() {
            XrHandMeshMSFT[] ret = new XrHandMeshMSFT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrHandMeshMSFT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrHandMeshMSFT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrHandMeshMSFT.BYTES;
            }

            @Override
            public XrHandMeshMSFT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrHandMeshMSFT ret = new XrHandMeshMSFT(segment.asSlice(0, XrHandMeshMSFT.BYTES));
                segment = segment.asSlice(XrHandMeshMSFT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrHandMeshMSFT allocate(Arena arena) {
        XrHandMeshMSFT ret = new XrHandMeshMSFT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.HAND_MESH_MSFT);
        return ret;
    }

    public static XrHandMeshMSFT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrHandMeshMSFT.Ptr ret = new XrHandMeshMSFT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.HAND_MESH_MSFT);
        }
        return ret;
    }

    public static XrHandMeshMSFT clone(Arena arena, XrHandMeshMSFT src) {
        XrHandMeshMSFT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.HAND_MESH_MSFT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrHandMeshMSFT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrHandMeshMSFT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrHandMeshMSFT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @NativeType("XrBool32") @Unsigned int isActive() {
        return segment.get(LAYOUT$isActive, OFFSET$isActive);
    }

    public XrHandMeshMSFT isActive(@NativeType("XrBool32") @Unsigned int value) {
        segment.set(LAYOUT$isActive, OFFSET$isActive, value);
        return this;
    }

    public @NativeType("XrBool32") @Unsigned int indexBufferChanged() {
        return segment.get(LAYOUT$indexBufferChanged, OFFSET$indexBufferChanged);
    }

    public XrHandMeshMSFT indexBufferChanged(@NativeType("XrBool32") @Unsigned int value) {
        segment.set(LAYOUT$indexBufferChanged, OFFSET$indexBufferChanged, value);
        return this;
    }

    public @NativeType("XrBool32") @Unsigned int vertexBufferChanged() {
        return segment.get(LAYOUT$vertexBufferChanged, OFFSET$vertexBufferChanged);
    }

    public XrHandMeshMSFT vertexBufferChanged(@NativeType("XrBool32") @Unsigned int value) {
        segment.set(LAYOUT$vertexBufferChanged, OFFSET$vertexBufferChanged, value);
        return this;
    }

    public @NotNull XrHandMeshIndexBufferMSFT indexBuffer() {
        return new XrHandMeshIndexBufferMSFT(segment.asSlice(OFFSET$indexBuffer, LAYOUT$indexBuffer));
    }

    public XrHandMeshMSFT indexBuffer(@NotNull XrHandMeshIndexBufferMSFT value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$indexBuffer, SIZE$indexBuffer);
        return this;
    }

    public XrHandMeshMSFT indexBuffer(Consumer<@NotNull XrHandMeshIndexBufferMSFT> consumer) {
        consumer.accept(indexBuffer());
        return this;
    }

    public @NotNull XrHandMeshVertexBufferMSFT vertexBuffer() {
        return new XrHandMeshVertexBufferMSFT(segment.asSlice(OFFSET$vertexBuffer, LAYOUT$vertexBuffer));
    }

    public XrHandMeshMSFT vertexBuffer(@NotNull XrHandMeshVertexBufferMSFT value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$vertexBuffer, SIZE$vertexBuffer);
        return this;
    }

    public XrHandMeshMSFT vertexBuffer(Consumer<@NotNull XrHandMeshVertexBufferMSFT> consumer) {
        consumer.accept(vertexBuffer());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("isActive"),
        ValueLayout.JAVA_INT.withName("indexBufferChanged"),
        ValueLayout.JAVA_INT.withName("vertexBufferChanged"),
        XrHandMeshIndexBufferMSFT.LAYOUT.withName("indexBuffer"),
        XrHandMeshVertexBufferMSFT.LAYOUT.withName("vertexBuffer")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$isActive = PathElement.groupElement("isActive");
    public static final PathElement PATH$indexBufferChanged = PathElement.groupElement("indexBufferChanged");
    public static final PathElement PATH$vertexBufferChanged = PathElement.groupElement("vertexBufferChanged");
    public static final PathElement PATH$indexBuffer = PathElement.groupElement("indexBuffer");
    public static final PathElement PATH$vertexBuffer = PathElement.groupElement("vertexBuffer");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$isActive = (OfInt) LAYOUT.select(PATH$isActive);
    public static final OfInt LAYOUT$indexBufferChanged = (OfInt) LAYOUT.select(PATH$indexBufferChanged);
    public static final OfInt LAYOUT$vertexBufferChanged = (OfInt) LAYOUT.select(PATH$vertexBufferChanged);
    public static final StructLayout LAYOUT$indexBuffer = (StructLayout) LAYOUT.select(PATH$indexBuffer);
    public static final StructLayout LAYOUT$vertexBuffer = (StructLayout) LAYOUT.select(PATH$vertexBuffer);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$isActive = LAYOUT$isActive.byteSize();
    public static final long SIZE$indexBufferChanged = LAYOUT$indexBufferChanged.byteSize();
    public static final long SIZE$vertexBufferChanged = LAYOUT$vertexBufferChanged.byteSize();
    public static final long SIZE$indexBuffer = LAYOUT$indexBuffer.byteSize();
    public static final long SIZE$vertexBuffer = LAYOUT$vertexBuffer.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$isActive = LAYOUT.byteOffset(PATH$isActive);
    public static final long OFFSET$indexBufferChanged = LAYOUT.byteOffset(PATH$indexBufferChanged);
    public static final long OFFSET$vertexBufferChanged = LAYOUT.byteOffset(PATH$vertexBufferChanged);
    public static final long OFFSET$indexBuffer = LAYOUT.byteOffset(PATH$indexBuffer);
    public static final long OFFSET$vertexBuffer = LAYOUT.byteOffset(PATH$vertexBuffer);
}
