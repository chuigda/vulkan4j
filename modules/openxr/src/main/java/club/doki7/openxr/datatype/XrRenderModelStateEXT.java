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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrRenderModelStateEXT.html"><code>XrRenderModelStateEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrRenderModelStateEXT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     uint32_t nodeStateCount; // optional // @link substring="nodeStateCount" target="#nodeStateCount"
///     XrRenderModelNodeStateEXT* nodeStates; // optional // @link substring="XrRenderModelNodeStateEXT" target="XrRenderModelNodeStateEXT" @link substring="nodeStates" target="#nodeStates"
/// } XrRenderModelStateEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_RENDER_MODEL_STATE_EXT`
///
/// The {@code allocate} ({@link XrRenderModelStateEXT#allocate(Arena)}, {@link XrRenderModelStateEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrRenderModelStateEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrRenderModelStateEXT.html"><code>XrRenderModelStateEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrRenderModelStateEXT(@NotNull MemorySegment segment) implements IXrRenderModelStateEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrRenderModelStateEXT.html"><code>XrRenderModelStateEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrRenderModelStateEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrRenderModelStateEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrRenderModelStateEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrRenderModelStateEXT, Iterable<XrRenderModelStateEXT> {
        public long size() {
            return segment.byteSize() / XrRenderModelStateEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrRenderModelStateEXT at(long index) {
            return new XrRenderModelStateEXT(segment.asSlice(index * XrRenderModelStateEXT.BYTES, XrRenderModelStateEXT.BYTES));
        }

        public XrRenderModelStateEXT.Ptr at(long index, @NotNull Consumer<@NotNull XrRenderModelStateEXT> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrRenderModelStateEXT value) {
            MemorySegment s = segment.asSlice(index * XrRenderModelStateEXT.BYTES, XrRenderModelStateEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrRenderModelStateEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrRenderModelStateEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrRenderModelStateEXT.BYTES,
                (end - start) * XrRenderModelStateEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrRenderModelStateEXT.BYTES));
        }

        public XrRenderModelStateEXT[] toArray() {
            XrRenderModelStateEXT[] ret = new XrRenderModelStateEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrRenderModelStateEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrRenderModelStateEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrRenderModelStateEXT.BYTES;
            }

            @Override
            public XrRenderModelStateEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrRenderModelStateEXT ret = new XrRenderModelStateEXT(segment.asSlice(0, XrRenderModelStateEXT.BYTES));
                segment = segment.asSlice(XrRenderModelStateEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrRenderModelStateEXT allocate(Arena arena) {
        XrRenderModelStateEXT ret = new XrRenderModelStateEXT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.RENDER_MODEL_STATE_EXT);
        return ret;
    }

    public static XrRenderModelStateEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrRenderModelStateEXT.Ptr ret = new XrRenderModelStateEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.RENDER_MODEL_STATE_EXT);
        }
        return ret;
    }

    public static XrRenderModelStateEXT clone(Arena arena, XrRenderModelStateEXT src) {
        XrRenderModelStateEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.RENDER_MODEL_STATE_EXT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrRenderModelStateEXT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrRenderModelStateEXT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrRenderModelStateEXT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int nodeStateCount() {
        return segment.get(LAYOUT$nodeStateCount, OFFSET$nodeStateCount);
    }

    public XrRenderModelStateEXT nodeStateCount(@Unsigned int value) {
        segment.set(LAYOUT$nodeStateCount, OFFSET$nodeStateCount, value);
        return this;
    }

    public XrRenderModelStateEXT nodeStates(@Nullable IXrRenderModelNodeStateEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        nodeStatesRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrRenderModelNodeStateEXT.Ptr nodeStates(int assumedCount) {
        MemorySegment s = nodeStatesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrRenderModelNodeStateEXT.BYTES);
        return new XrRenderModelNodeStateEXT.Ptr(s);
    }

    public @Nullable XrRenderModelNodeStateEXT nodeStates() {
        MemorySegment s = nodeStatesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrRenderModelNodeStateEXT(s);
    }

    public @Pointer(target=XrRenderModelNodeStateEXT.class) @NotNull MemorySegment nodeStatesRaw() {
        return segment.get(LAYOUT$nodeStates, OFFSET$nodeStates);
    }

    public void nodeStatesRaw(@Pointer(target=XrRenderModelNodeStateEXT.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$nodeStates, OFFSET$nodeStates, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("nodeStateCount"),
        ValueLayout.ADDRESS.withTargetLayout(XrRenderModelNodeStateEXT.LAYOUT).withName("nodeStates")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$nodeStateCount = PathElement.groupElement("nodeStateCount");
    public static final PathElement PATH$nodeStates = PathElement.groupElement("nodeStates");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$nodeStateCount = (OfInt) LAYOUT.select(PATH$nodeStateCount);
    public static final AddressLayout LAYOUT$nodeStates = (AddressLayout) LAYOUT.select(PATH$nodeStates);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$nodeStateCount = LAYOUT$nodeStateCount.byteSize();
    public static final long SIZE$nodeStates = LAYOUT$nodeStates.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$nodeStateCount = LAYOUT.byteOffset(PATH$nodeStateCount);
    public static final long OFFSET$nodeStates = LAYOUT.byteOffset(PATH$nodeStates);
}
