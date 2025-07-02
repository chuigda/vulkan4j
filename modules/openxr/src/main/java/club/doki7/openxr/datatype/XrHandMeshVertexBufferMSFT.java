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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHandMeshVertexBufferMSFT.html"><code>XrHandMeshVertexBufferMSFT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrHandMeshVertexBufferMSFT {
///     XrTime vertexUpdateTime; // optional // @link substring="vertexUpdateTime" target="#vertexUpdateTime"
///     uint32_t vertexCapacityInput; // optional // @link substring="vertexCapacityInput" target="#vertexCapacityInput"
///     uint32_t vertexCountOutput; // optional // @link substring="vertexCountOutput" target="#vertexCountOutput"
///     XrHandMeshVertexMSFT* vertices; // optional // @link substring="XrHandMeshVertexMSFT" target="XrHandMeshVertexMSFT" @link substring="vertices" target="#vertices"
/// } XrHandMeshVertexBufferMSFT;
/// }
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHandMeshVertexBufferMSFT.html"><code>XrHandMeshVertexBufferMSFT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrHandMeshVertexBufferMSFT(@NotNull MemorySegment segment) implements IXrHandMeshVertexBufferMSFT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHandMeshVertexBufferMSFT.html"><code>XrHandMeshVertexBufferMSFT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrHandMeshVertexBufferMSFT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrHandMeshVertexBufferMSFT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrHandMeshVertexBufferMSFT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrHandMeshVertexBufferMSFT, Iterable<XrHandMeshVertexBufferMSFT> {
        public long size() {
            return segment.byteSize() / XrHandMeshVertexBufferMSFT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrHandMeshVertexBufferMSFT at(long index) {
            return new XrHandMeshVertexBufferMSFT(segment.asSlice(index * XrHandMeshVertexBufferMSFT.BYTES, XrHandMeshVertexBufferMSFT.BYTES));
        }

        public XrHandMeshVertexBufferMSFT.Ptr at(long index, @NotNull Consumer<@NotNull XrHandMeshVertexBufferMSFT> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrHandMeshVertexBufferMSFT value) {
            MemorySegment s = segment.asSlice(index * XrHandMeshVertexBufferMSFT.BYTES, XrHandMeshVertexBufferMSFT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrHandMeshVertexBufferMSFT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrHandMeshVertexBufferMSFT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrHandMeshVertexBufferMSFT.BYTES,
                (end - start) * XrHandMeshVertexBufferMSFT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrHandMeshVertexBufferMSFT.BYTES));
        }

        public XrHandMeshVertexBufferMSFT[] toArray() {
            XrHandMeshVertexBufferMSFT[] ret = new XrHandMeshVertexBufferMSFT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrHandMeshVertexBufferMSFT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrHandMeshVertexBufferMSFT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrHandMeshVertexBufferMSFT.BYTES;
            }

            @Override
            public XrHandMeshVertexBufferMSFT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrHandMeshVertexBufferMSFT ret = new XrHandMeshVertexBufferMSFT(segment.asSlice(0, XrHandMeshVertexBufferMSFT.BYTES));
                segment = segment.asSlice(XrHandMeshVertexBufferMSFT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrHandMeshVertexBufferMSFT allocate(Arena arena) {
        return new XrHandMeshVertexBufferMSFT(arena.allocate(LAYOUT));
    }

    public static XrHandMeshVertexBufferMSFT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrHandMeshVertexBufferMSFT.Ptr(segment);
    }

    public static XrHandMeshVertexBufferMSFT clone(Arena arena, XrHandMeshVertexBufferMSFT src) {
        XrHandMeshVertexBufferMSFT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NativeType("XrTime") long vertexUpdateTime() {
        return segment.get(LAYOUT$vertexUpdateTime, OFFSET$vertexUpdateTime);
    }

    public XrHandMeshVertexBufferMSFT vertexUpdateTime(@NativeType("XrTime") long value) {
        segment.set(LAYOUT$vertexUpdateTime, OFFSET$vertexUpdateTime, value);
        return this;
    }

    public @Unsigned int vertexCapacityInput() {
        return segment.get(LAYOUT$vertexCapacityInput, OFFSET$vertexCapacityInput);
    }

    public XrHandMeshVertexBufferMSFT vertexCapacityInput(@Unsigned int value) {
        segment.set(LAYOUT$vertexCapacityInput, OFFSET$vertexCapacityInput, value);
        return this;
    }

    public @Unsigned int vertexCountOutput() {
        return segment.get(LAYOUT$vertexCountOutput, OFFSET$vertexCountOutput);
    }

    public XrHandMeshVertexBufferMSFT vertexCountOutput(@Unsigned int value) {
        segment.set(LAYOUT$vertexCountOutput, OFFSET$vertexCountOutput, value);
        return this;
    }

    public XrHandMeshVertexBufferMSFT vertices(@Nullable IXrHandMeshVertexMSFT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        verticesRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrHandMeshVertexMSFT.Ptr vertices(int assumedCount) {
        MemorySegment s = verticesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrHandMeshVertexMSFT.BYTES);
        return new XrHandMeshVertexMSFT.Ptr(s);
    }

    public @Nullable XrHandMeshVertexMSFT vertices() {
        MemorySegment s = verticesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrHandMeshVertexMSFT(s);
    }

    public @Pointer(target=XrHandMeshVertexMSFT.class) @NotNull MemorySegment verticesRaw() {
        return segment.get(LAYOUT$vertices, OFFSET$vertices);
    }

    public void verticesRaw(@Pointer(target=XrHandMeshVertexMSFT.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$vertices, OFFSET$vertices, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("vertexUpdateTime"),
        ValueLayout.JAVA_INT.withName("vertexCapacityInput"),
        ValueLayout.JAVA_INT.withName("vertexCountOutput"),
        ValueLayout.ADDRESS.withTargetLayout(XrHandMeshVertexMSFT.LAYOUT).withName("vertices")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$vertexUpdateTime = PathElement.groupElement("vertexUpdateTime");
    public static final PathElement PATH$vertexCapacityInput = PathElement.groupElement("vertexCapacityInput");
    public static final PathElement PATH$vertexCountOutput = PathElement.groupElement("vertexCountOutput");
    public static final PathElement PATH$vertices = PathElement.groupElement("vertices");

    public static final OfLong LAYOUT$vertexUpdateTime = (OfLong) LAYOUT.select(PATH$vertexUpdateTime);
    public static final OfInt LAYOUT$vertexCapacityInput = (OfInt) LAYOUT.select(PATH$vertexCapacityInput);
    public static final OfInt LAYOUT$vertexCountOutput = (OfInt) LAYOUT.select(PATH$vertexCountOutput);
    public static final AddressLayout LAYOUT$vertices = (AddressLayout) LAYOUT.select(PATH$vertices);

    public static final long SIZE$vertexUpdateTime = LAYOUT$vertexUpdateTime.byteSize();
    public static final long SIZE$vertexCapacityInput = LAYOUT$vertexCapacityInput.byteSize();
    public static final long SIZE$vertexCountOutput = LAYOUT$vertexCountOutput.byteSize();
    public static final long SIZE$vertices = LAYOUT$vertices.byteSize();

    public static final long OFFSET$vertexUpdateTime = LAYOUT.byteOffset(PATH$vertexUpdateTime);
    public static final long OFFSET$vertexCapacityInput = LAYOUT.byteOffset(PATH$vertexCapacityInput);
    public static final long OFFSET$vertexCountOutput = LAYOUT.byteOffset(PATH$vertexCountOutput);
    public static final long OFFSET$vertices = LAYOUT.byteOffset(PATH$vertices);
}
