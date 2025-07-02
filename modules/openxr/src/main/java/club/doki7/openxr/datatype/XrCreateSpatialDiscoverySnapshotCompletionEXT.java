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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrCreateSpatialDiscoverySnapshotCompletionEXT.html"><code>XrCreateSpatialDiscoverySnapshotCompletionEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrCreateSpatialDiscoverySnapshotCompletionEXT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     XrResult futureResult; // @link substring="XrResult" target="XrResult" @link substring="futureResult" target="#futureResult"
///     XrSpatialSnapshotEXT snapshot; // optional // @link substring="XrSpatialSnapshotEXT" target="XrSpatialSnapshotEXT" @link substring="snapshot" target="#snapshot"
/// } XrCreateSpatialDiscoverySnapshotCompletionEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_CREATE_SPATIAL_DISCOVERY_SNAPSHOT_COMPLETION_EXT`
///
/// The {@code allocate} ({@link XrCreateSpatialDiscoverySnapshotCompletionEXT#allocate(Arena)}, {@link XrCreateSpatialDiscoverySnapshotCompletionEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrCreateSpatialDiscoverySnapshotCompletionEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrCreateSpatialDiscoverySnapshotCompletionEXT.html"><code>XrCreateSpatialDiscoverySnapshotCompletionEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrCreateSpatialDiscoverySnapshotCompletionEXT(@NotNull MemorySegment segment) implements IXrCreateSpatialDiscoverySnapshotCompletionEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrCreateSpatialDiscoverySnapshotCompletionEXT.html"><code>XrCreateSpatialDiscoverySnapshotCompletionEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrCreateSpatialDiscoverySnapshotCompletionEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrCreateSpatialDiscoverySnapshotCompletionEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrCreateSpatialDiscoverySnapshotCompletionEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrCreateSpatialDiscoverySnapshotCompletionEXT, Iterable<XrCreateSpatialDiscoverySnapshotCompletionEXT> {
        public long size() {
            return segment.byteSize() / XrCreateSpatialDiscoverySnapshotCompletionEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrCreateSpatialDiscoverySnapshotCompletionEXT at(long index) {
            return new XrCreateSpatialDiscoverySnapshotCompletionEXT(segment.asSlice(index * XrCreateSpatialDiscoverySnapshotCompletionEXT.BYTES, XrCreateSpatialDiscoverySnapshotCompletionEXT.BYTES));
        }

        public XrCreateSpatialDiscoverySnapshotCompletionEXT.Ptr at(long index, @NotNull Consumer<@NotNull XrCreateSpatialDiscoverySnapshotCompletionEXT> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrCreateSpatialDiscoverySnapshotCompletionEXT value) {
            MemorySegment s = segment.asSlice(index * XrCreateSpatialDiscoverySnapshotCompletionEXT.BYTES, XrCreateSpatialDiscoverySnapshotCompletionEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrCreateSpatialDiscoverySnapshotCompletionEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrCreateSpatialDiscoverySnapshotCompletionEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrCreateSpatialDiscoverySnapshotCompletionEXT.BYTES,
                (end - start) * XrCreateSpatialDiscoverySnapshotCompletionEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrCreateSpatialDiscoverySnapshotCompletionEXT.BYTES));
        }

        public XrCreateSpatialDiscoverySnapshotCompletionEXT[] toArray() {
            XrCreateSpatialDiscoverySnapshotCompletionEXT[] ret = new XrCreateSpatialDiscoverySnapshotCompletionEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrCreateSpatialDiscoverySnapshotCompletionEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrCreateSpatialDiscoverySnapshotCompletionEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrCreateSpatialDiscoverySnapshotCompletionEXT.BYTES;
            }

            @Override
            public XrCreateSpatialDiscoverySnapshotCompletionEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrCreateSpatialDiscoverySnapshotCompletionEXT ret = new XrCreateSpatialDiscoverySnapshotCompletionEXT(segment.asSlice(0, XrCreateSpatialDiscoverySnapshotCompletionEXT.BYTES));
                segment = segment.asSlice(XrCreateSpatialDiscoverySnapshotCompletionEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrCreateSpatialDiscoverySnapshotCompletionEXT allocate(Arena arena) {
        XrCreateSpatialDiscoverySnapshotCompletionEXT ret = new XrCreateSpatialDiscoverySnapshotCompletionEXT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.CREATE_SPATIAL_DISCOVERY_SNAPSHOT_COMPLETION_EXT);
        return ret;
    }

    public static XrCreateSpatialDiscoverySnapshotCompletionEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrCreateSpatialDiscoverySnapshotCompletionEXT.Ptr ret = new XrCreateSpatialDiscoverySnapshotCompletionEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.CREATE_SPATIAL_DISCOVERY_SNAPSHOT_COMPLETION_EXT);
        }
        return ret;
    }

    public static XrCreateSpatialDiscoverySnapshotCompletionEXT clone(Arena arena, XrCreateSpatialDiscoverySnapshotCompletionEXT src) {
        XrCreateSpatialDiscoverySnapshotCompletionEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.CREATE_SPATIAL_DISCOVERY_SNAPSHOT_COMPLETION_EXT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrCreateSpatialDiscoverySnapshotCompletionEXT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrCreateSpatialDiscoverySnapshotCompletionEXT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrCreateSpatialDiscoverySnapshotCompletionEXT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @EnumType(XrResult.class) int futureResult() {
        return segment.get(LAYOUT$futureResult, OFFSET$futureResult);
    }

    public XrCreateSpatialDiscoverySnapshotCompletionEXT futureResult(@EnumType(XrResult.class) int value) {
        segment.set(LAYOUT$futureResult, OFFSET$futureResult, value);
        return this;
    }

    public @Nullable XrSpatialSnapshotEXT snapshot() {
        MemorySegment s = segment.asSlice(OFFSET$snapshot, SIZE$snapshot);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrSpatialSnapshotEXT(s);
    }

    public XrCreateSpatialDiscoverySnapshotCompletionEXT snapshot(@Nullable XrSpatialSnapshotEXT value) {
        segment.set(LAYOUT$snapshot, OFFSET$snapshot, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("futureResult"),
        ValueLayout.ADDRESS.withName("snapshot")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$futureResult = PathElement.groupElement("futureResult");
    public static final PathElement PATH$snapshot = PathElement.groupElement("snapshot");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$futureResult = (OfInt) LAYOUT.select(PATH$futureResult);
    public static final AddressLayout LAYOUT$snapshot = (AddressLayout) LAYOUT.select(PATH$snapshot);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$futureResult = LAYOUT$futureResult.byteSize();
    public static final long SIZE$snapshot = LAYOUT$snapshot.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$futureResult = LAYOUT.byteOffset(PATH$futureResult);
    public static final long OFFSET$snapshot = LAYOUT.byteOffset(PATH$snapshot);
}
