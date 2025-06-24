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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrWorldMeshRequestCompletionML.html"><code>XrWorldMeshRequestCompletionML</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrWorldMeshRequestCompletionML {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     XrResult futureResult; // @link substring="XrResult" target="XrResult" @link substring="futureResult" target="#futureResult"
///     uint32_t blockCount; // @link substring="blockCount" target="#blockCount"
///     XrWorldMeshBlockML* blocks; // @link substring="XrWorldMeshBlockML" target="XrWorldMeshBlockML" @link substring="blocks" target="#blocks"
/// } XrWorldMeshRequestCompletionML;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_WORLD_MESH_REQUEST_COMPLETION_ML`
///
/// The {@code allocate} ({@link XrWorldMeshRequestCompletionML#allocate(Arena)}, {@link XrWorldMeshRequestCompletionML#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrWorldMeshRequestCompletionML#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrWorldMeshRequestCompletionML.html"><code>XrWorldMeshRequestCompletionML</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrWorldMeshRequestCompletionML(@NotNull MemorySegment segment) implements IXrWorldMeshRequestCompletionML {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrWorldMeshRequestCompletionML.html"><code>XrWorldMeshRequestCompletionML</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrWorldMeshRequestCompletionML}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrWorldMeshRequestCompletionML to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrWorldMeshRequestCompletionML.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrWorldMeshRequestCompletionML, Iterable<XrWorldMeshRequestCompletionML> {
        public long size() {
            return segment.byteSize() / XrWorldMeshRequestCompletionML.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrWorldMeshRequestCompletionML at(long index) {
            return new XrWorldMeshRequestCompletionML(segment.asSlice(index * XrWorldMeshRequestCompletionML.BYTES, XrWorldMeshRequestCompletionML.BYTES));
        }

        public void write(long index, @NotNull XrWorldMeshRequestCompletionML value) {
            MemorySegment s = segment.asSlice(index * XrWorldMeshRequestCompletionML.BYTES, XrWorldMeshRequestCompletionML.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrWorldMeshRequestCompletionML.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrWorldMeshRequestCompletionML.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrWorldMeshRequestCompletionML.BYTES,
                (end - start) * XrWorldMeshRequestCompletionML.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrWorldMeshRequestCompletionML.BYTES));
        }

        public XrWorldMeshRequestCompletionML[] toArray() {
            XrWorldMeshRequestCompletionML[] ret = new XrWorldMeshRequestCompletionML[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrWorldMeshRequestCompletionML> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrWorldMeshRequestCompletionML> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrWorldMeshRequestCompletionML.BYTES;
            }

            @Override
            public XrWorldMeshRequestCompletionML next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrWorldMeshRequestCompletionML ret = new XrWorldMeshRequestCompletionML(segment.asSlice(0, XrWorldMeshRequestCompletionML.BYTES));
                segment = segment.asSlice(XrWorldMeshRequestCompletionML.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrWorldMeshRequestCompletionML allocate(Arena arena) {
        XrWorldMeshRequestCompletionML ret = new XrWorldMeshRequestCompletionML(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_WORLD_MESH_REQUEST_COMPLETION_ML);
        return ret;
    }

    public static XrWorldMeshRequestCompletionML.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrWorldMeshRequestCompletionML.Ptr ret = new XrWorldMeshRequestCompletionML.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_WORLD_MESH_REQUEST_COMPLETION_ML);
        }
        return ret;
    }

    public static XrWorldMeshRequestCompletionML clone(Arena arena, XrWorldMeshRequestCompletionML src) {
        XrWorldMeshRequestCompletionML ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_WORLD_MESH_REQUEST_COMPLETION_ML);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrWorldMeshRequestCompletionML type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrWorldMeshRequestCompletionML next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrWorldMeshRequestCompletionML next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @EnumType(XrResult.class) int futureResult() {
        return segment.get(LAYOUT$futureResult, OFFSET$futureResult);
    }

    public XrWorldMeshRequestCompletionML futureResult(@EnumType(XrResult.class) int value) {
        segment.set(LAYOUT$futureResult, OFFSET$futureResult, value);
        return this;
    }

    public @Unsigned int blockCount() {
        return segment.get(LAYOUT$blockCount, OFFSET$blockCount);
    }

    public XrWorldMeshRequestCompletionML blockCount(@Unsigned int value) {
        segment.set(LAYOUT$blockCount, OFFSET$blockCount, value);
        return this;
    }

    public XrWorldMeshRequestCompletionML blocks(@Nullable IXrWorldMeshBlockML value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        blocksRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrWorldMeshBlockML.Ptr blocks(int assumedCount) {
        MemorySegment s = blocksRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrWorldMeshBlockML.BYTES);
        return new XrWorldMeshBlockML.Ptr(s);
    }

    public @Nullable XrWorldMeshBlockML blocks() {
        MemorySegment s = blocksRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrWorldMeshBlockML(s);
    }

    public @Pointer(target=XrWorldMeshBlockML.class) @NotNull MemorySegment blocksRaw() {
        return segment.get(LAYOUT$blocks, OFFSET$blocks);
    }

    public void blocksRaw(@Pointer(target=XrWorldMeshBlockML.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$blocks, OFFSET$blocks, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("futureResult"),
        ValueLayout.JAVA_INT.withName("blockCount"),
        ValueLayout.ADDRESS.withTargetLayout(XrWorldMeshBlockML.LAYOUT).withName("blocks")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$futureResult = PathElement.groupElement("futureResult");
    public static final PathElement PATH$blockCount = PathElement.groupElement("blockCount");
    public static final PathElement PATH$blocks = PathElement.groupElement("blocks");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$futureResult = (OfInt) LAYOUT.select(PATH$futureResult);
    public static final OfInt LAYOUT$blockCount = (OfInt) LAYOUT.select(PATH$blockCount);
    public static final AddressLayout LAYOUT$blocks = (AddressLayout) LAYOUT.select(PATH$blocks);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$futureResult = LAYOUT$futureResult.byteSize();
    public static final long SIZE$blockCount = LAYOUT$blockCount.byteSize();
    public static final long SIZE$blocks = LAYOUT$blocks.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$futureResult = LAYOUT.byteOffset(PATH$futureResult);
    public static final long OFFSET$blockCount = LAYOUT.byteOffset(PATH$blockCount);
    public static final long OFFSET$blocks = LAYOUT.byteOffset(PATH$blocks);
}
