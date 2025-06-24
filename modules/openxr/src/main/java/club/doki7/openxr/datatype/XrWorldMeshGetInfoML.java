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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrWorldMeshGetInfoML.html"><code>XrWorldMeshGetInfoML</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrWorldMeshGetInfoML {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrWorldMeshDetectorFlagsML flags; // optional // @link substring="XrWorldMeshDetectorFlagsML" target="XrWorldMeshDetectorFlagsML" @link substring="flags" target="#flags"
///     float fillHoleLength; // @link substring="fillHoleLength" target="#fillHoleLength"
///     float disconnectedComponentArea; // @link substring="disconnectedComponentArea" target="#disconnectedComponentArea"
///     uint32_t blockCount; // @link substring="blockCount" target="#blockCount"
///     XrWorldMeshBlockRequestML* blocks; // @link substring="XrWorldMeshBlockRequestML" target="XrWorldMeshBlockRequestML" @link substring="blocks" target="#blocks"
/// } XrWorldMeshGetInfoML;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_WORLD_MESH_GET_INFO_ML`
///
/// The {@code allocate} ({@link XrWorldMeshGetInfoML#allocate(Arena)}, {@link XrWorldMeshGetInfoML#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrWorldMeshGetInfoML#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrWorldMeshGetInfoML.html"><code>XrWorldMeshGetInfoML</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrWorldMeshGetInfoML(@NotNull MemorySegment segment) implements IXrWorldMeshGetInfoML {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrWorldMeshGetInfoML.html"><code>XrWorldMeshGetInfoML</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrWorldMeshGetInfoML}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrWorldMeshGetInfoML to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrWorldMeshGetInfoML.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrWorldMeshGetInfoML, Iterable<XrWorldMeshGetInfoML> {
        public long size() {
            return segment.byteSize() / XrWorldMeshGetInfoML.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrWorldMeshGetInfoML at(long index) {
            return new XrWorldMeshGetInfoML(segment.asSlice(index * XrWorldMeshGetInfoML.BYTES, XrWorldMeshGetInfoML.BYTES));
        }

        public void write(long index, @NotNull XrWorldMeshGetInfoML value) {
            MemorySegment s = segment.asSlice(index * XrWorldMeshGetInfoML.BYTES, XrWorldMeshGetInfoML.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrWorldMeshGetInfoML.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrWorldMeshGetInfoML.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrWorldMeshGetInfoML.BYTES,
                (end - start) * XrWorldMeshGetInfoML.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrWorldMeshGetInfoML.BYTES));
        }

        public XrWorldMeshGetInfoML[] toArray() {
            XrWorldMeshGetInfoML[] ret = new XrWorldMeshGetInfoML[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrWorldMeshGetInfoML> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrWorldMeshGetInfoML> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrWorldMeshGetInfoML.BYTES;
            }

            @Override
            public XrWorldMeshGetInfoML next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrWorldMeshGetInfoML ret = new XrWorldMeshGetInfoML(segment.asSlice(0, XrWorldMeshGetInfoML.BYTES));
                segment = segment.asSlice(XrWorldMeshGetInfoML.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrWorldMeshGetInfoML allocate(Arena arena) {
        XrWorldMeshGetInfoML ret = new XrWorldMeshGetInfoML(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_WORLD_MESH_GET_INFO_ML);
        return ret;
    }

    public static XrWorldMeshGetInfoML.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrWorldMeshGetInfoML.Ptr ret = new XrWorldMeshGetInfoML.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_WORLD_MESH_GET_INFO_ML);
        }
        return ret;
    }

    public static XrWorldMeshGetInfoML clone(Arena arena, XrWorldMeshGetInfoML src) {
        XrWorldMeshGetInfoML ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_WORLD_MESH_GET_INFO_ML);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrWorldMeshGetInfoML type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrWorldMeshGetInfoML next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrWorldMeshGetInfoML next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Bitmask(XrWorldMeshDetectorFlagsML.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public XrWorldMeshGetInfoML flags(@Bitmask(XrWorldMeshDetectorFlagsML.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
        return this;
    }

    public float fillHoleLength() {
        return segment.get(LAYOUT$fillHoleLength, OFFSET$fillHoleLength);
    }

    public XrWorldMeshGetInfoML fillHoleLength(float value) {
        segment.set(LAYOUT$fillHoleLength, OFFSET$fillHoleLength, value);
        return this;
    }

    public float disconnectedComponentArea() {
        return segment.get(LAYOUT$disconnectedComponentArea, OFFSET$disconnectedComponentArea);
    }

    public XrWorldMeshGetInfoML disconnectedComponentArea(float value) {
        segment.set(LAYOUT$disconnectedComponentArea, OFFSET$disconnectedComponentArea, value);
        return this;
    }

    public @Unsigned int blockCount() {
        return segment.get(LAYOUT$blockCount, OFFSET$blockCount);
    }

    public XrWorldMeshGetInfoML blockCount(@Unsigned int value) {
        segment.set(LAYOUT$blockCount, OFFSET$blockCount, value);
        return this;
    }

    public XrWorldMeshGetInfoML blocks(@Nullable IXrWorldMeshBlockRequestML value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        blocksRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrWorldMeshBlockRequestML.Ptr blocks(int assumedCount) {
        MemorySegment s = blocksRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrWorldMeshBlockRequestML.BYTES);
        return new XrWorldMeshBlockRequestML.Ptr(s);
    }

    public @Nullable XrWorldMeshBlockRequestML blocks() {
        MemorySegment s = blocksRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrWorldMeshBlockRequestML(s);
    }

    public @Pointer(target=XrWorldMeshBlockRequestML.class) @NotNull MemorySegment blocksRaw() {
        return segment.get(LAYOUT$blocks, OFFSET$blocks);
    }

    public void blocksRaw(@Pointer(target=XrWorldMeshBlockRequestML.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$blocks, OFFSET$blocks, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_FLOAT.withName("fillHoleLength"),
        ValueLayout.JAVA_FLOAT.withName("disconnectedComponentArea"),
        ValueLayout.JAVA_INT.withName("blockCount"),
        ValueLayout.ADDRESS.withTargetLayout(XrWorldMeshBlockRequestML.LAYOUT).withName("blocks")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$fillHoleLength = PathElement.groupElement("fillHoleLength");
    public static final PathElement PATH$disconnectedComponentArea = PathElement.groupElement("disconnectedComponentArea");
    public static final PathElement PATH$blockCount = PathElement.groupElement("blockCount");
    public static final PathElement PATH$blocks = PathElement.groupElement("blocks");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfFloat LAYOUT$fillHoleLength = (OfFloat) LAYOUT.select(PATH$fillHoleLength);
    public static final OfFloat LAYOUT$disconnectedComponentArea = (OfFloat) LAYOUT.select(PATH$disconnectedComponentArea);
    public static final OfInt LAYOUT$blockCount = (OfInt) LAYOUT.select(PATH$blockCount);
    public static final AddressLayout LAYOUT$blocks = (AddressLayout) LAYOUT.select(PATH$blocks);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$fillHoleLength = LAYOUT$fillHoleLength.byteSize();
    public static final long SIZE$disconnectedComponentArea = LAYOUT$disconnectedComponentArea.byteSize();
    public static final long SIZE$blockCount = LAYOUT$blockCount.byteSize();
    public static final long SIZE$blocks = LAYOUT$blocks.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$fillHoleLength = LAYOUT.byteOffset(PATH$fillHoleLength);
    public static final long OFFSET$disconnectedComponentArea = LAYOUT.byteOffset(PATH$disconnectedComponentArea);
    public static final long OFFSET$blockCount = LAYOUT.byteOffset(PATH$blockCount);
    public static final long OFFSET$blocks = LAYOUT.byteOffset(PATH$blocks);
}
