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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrWorldMeshStateRequestInfoML.html"><code>XrWorldMeshStateRequestInfoML</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrWorldMeshStateRequestInfoML {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrSpace baseSpace; // @link substring="XrSpace" target="XrSpace" @link substring="baseSpace" target="#baseSpace"
///     XrTime time; // @link substring="time" target="#time"
///     XrPosef boundingBoxCenter; // @link substring="XrPosef" target="XrPosef" @link substring="boundingBoxCenter" target="#boundingBoxCenter"
///     XrExtent3DfEXT boundingBoxExtents; // @link substring="XrExtent3DfEXT" target="XrExtent3DfEXT" @link substring="boundingBoxExtents" target="#boundingBoxExtents"
/// } XrWorldMeshStateRequestInfoML;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_WORLD_MESH_STATE_REQUEST_INFO_ML`
///
/// The {@code allocate} ({@link XrWorldMeshStateRequestInfoML#allocate(Arena)}, {@link XrWorldMeshStateRequestInfoML#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrWorldMeshStateRequestInfoML#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrWorldMeshStateRequestInfoML.html"><code>XrWorldMeshStateRequestInfoML</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrWorldMeshStateRequestInfoML(@NotNull MemorySegment segment) implements IXrWorldMeshStateRequestInfoML {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrWorldMeshStateRequestInfoML.html"><code>XrWorldMeshStateRequestInfoML</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrWorldMeshStateRequestInfoML}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrWorldMeshStateRequestInfoML to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrWorldMeshStateRequestInfoML.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrWorldMeshStateRequestInfoML, Iterable<XrWorldMeshStateRequestInfoML> {
        public long size() {
            return segment.byteSize() / XrWorldMeshStateRequestInfoML.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrWorldMeshStateRequestInfoML at(long index) {
            return new XrWorldMeshStateRequestInfoML(segment.asSlice(index * XrWorldMeshStateRequestInfoML.BYTES, XrWorldMeshStateRequestInfoML.BYTES));
        }

        public void write(long index, @NotNull XrWorldMeshStateRequestInfoML value) {
            MemorySegment s = segment.asSlice(index * XrWorldMeshStateRequestInfoML.BYTES, XrWorldMeshStateRequestInfoML.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrWorldMeshStateRequestInfoML.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrWorldMeshStateRequestInfoML.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrWorldMeshStateRequestInfoML.BYTES,
                (end - start) * XrWorldMeshStateRequestInfoML.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrWorldMeshStateRequestInfoML.BYTES));
        }

        public XrWorldMeshStateRequestInfoML[] toArray() {
            XrWorldMeshStateRequestInfoML[] ret = new XrWorldMeshStateRequestInfoML[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrWorldMeshStateRequestInfoML> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrWorldMeshStateRequestInfoML> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrWorldMeshStateRequestInfoML.BYTES;
            }

            @Override
            public XrWorldMeshStateRequestInfoML next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrWorldMeshStateRequestInfoML ret = new XrWorldMeshStateRequestInfoML(segment.asSlice(0, XrWorldMeshStateRequestInfoML.BYTES));
                segment = segment.asSlice(XrWorldMeshStateRequestInfoML.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrWorldMeshStateRequestInfoML allocate(Arena arena) {
        XrWorldMeshStateRequestInfoML ret = new XrWorldMeshStateRequestInfoML(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_WORLD_MESH_STATE_REQUEST_INFO_ML);
        return ret;
    }

    public static XrWorldMeshStateRequestInfoML.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrWorldMeshStateRequestInfoML.Ptr ret = new XrWorldMeshStateRequestInfoML.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_WORLD_MESH_STATE_REQUEST_INFO_ML);
        }
        return ret;
    }

    public static XrWorldMeshStateRequestInfoML clone(Arena arena, XrWorldMeshStateRequestInfoML src) {
        XrWorldMeshStateRequestInfoML ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_WORLD_MESH_STATE_REQUEST_INFO_ML);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrWorldMeshStateRequestInfoML type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrWorldMeshStateRequestInfoML next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrWorldMeshStateRequestInfoML next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Nullable XrSpace baseSpace() {
        MemorySegment s = segment.asSlice(OFFSET$baseSpace, SIZE$baseSpace);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrSpace(s);
    }

    public XrWorldMeshStateRequestInfoML baseSpace(@Nullable XrSpace value) {
        segment.set(LAYOUT$baseSpace, OFFSET$baseSpace, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @NativeType("XrTime") long time() {
        return segment.get(LAYOUT$time, OFFSET$time);
    }

    public XrWorldMeshStateRequestInfoML time(@NativeType("XrTime") long value) {
        segment.set(LAYOUT$time, OFFSET$time, value);
        return this;
    }

    public @NotNull XrPosef boundingBoxCenter() {
        return new XrPosef(segment.asSlice(OFFSET$boundingBoxCenter, LAYOUT$boundingBoxCenter));
    }

    public XrWorldMeshStateRequestInfoML boundingBoxCenter(@NotNull XrPosef value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$boundingBoxCenter, SIZE$boundingBoxCenter);
        return this;
    }

    public XrWorldMeshStateRequestInfoML boundingBoxCenter(Consumer<@NotNull XrPosef> consumer) {
        consumer.accept(boundingBoxCenter());
        return this;
    }

    public @NotNull XrExtent3DfEXT boundingBoxExtents() {
        return new XrExtent3DfEXT(segment.asSlice(OFFSET$boundingBoxExtents, LAYOUT$boundingBoxExtents));
    }

    public XrWorldMeshStateRequestInfoML boundingBoxExtents(@NotNull XrExtent3DfEXT value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$boundingBoxExtents, SIZE$boundingBoxExtents);
        return this;
    }

    public XrWorldMeshStateRequestInfoML boundingBoxExtents(Consumer<@NotNull XrExtent3DfEXT> consumer) {
        consumer.accept(boundingBoxExtents());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.ADDRESS.withName("baseSpace"),
        ValueLayout.JAVA_LONG.withName("time"),
        XrPosef.LAYOUT.withName("boundingBoxCenter"),
        XrExtent3DfEXT.LAYOUT.withName("boundingBoxExtents")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$baseSpace = PathElement.groupElement("baseSpace");
    public static final PathElement PATH$time = PathElement.groupElement("time");
    public static final PathElement PATH$boundingBoxCenter = PathElement.groupElement("boundingBoxCenter");
    public static final PathElement PATH$boundingBoxExtents = PathElement.groupElement("boundingBoxExtents");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final AddressLayout LAYOUT$baseSpace = (AddressLayout) LAYOUT.select(PATH$baseSpace);
    public static final OfLong LAYOUT$time = (OfLong) LAYOUT.select(PATH$time);
    public static final StructLayout LAYOUT$boundingBoxCenter = (StructLayout) LAYOUT.select(PATH$boundingBoxCenter);
    public static final StructLayout LAYOUT$boundingBoxExtents = (StructLayout) LAYOUT.select(PATH$boundingBoxExtents);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$baseSpace = LAYOUT$baseSpace.byteSize();
    public static final long SIZE$time = LAYOUT$time.byteSize();
    public static final long SIZE$boundingBoxCenter = LAYOUT$boundingBoxCenter.byteSize();
    public static final long SIZE$boundingBoxExtents = LAYOUT$boundingBoxExtents.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$baseSpace = LAYOUT.byteOffset(PATH$baseSpace);
    public static final long OFFSET$time = LAYOUT.byteOffset(PATH$time);
    public static final long OFFSET$boundingBoxCenter = LAYOUT.byteOffset(PATH$boundingBoxCenter);
    public static final long OFFSET$boundingBoxExtents = LAYOUT.byteOffset(PATH$boundingBoxExtents);
}
