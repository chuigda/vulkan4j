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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSenseDataFilterUuidBD.html"><code>XrSenseDataFilterUuidBD</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSenseDataFilterUuidBD {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     uint32_t uuidCount; // @link substring="uuidCount" target="#uuidCount"
///     XrUuidEXT const* uuids; // @link substring="XrUuidEXT" target="XrUuidEXT" @link substring="uuids" target="#uuids"
/// } XrSenseDataFilterUuidBD;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SENSE_DATA_FILTER_UUID_BD`
///
/// The {@code allocate} ({@link XrSenseDataFilterUuidBD#allocate(Arena)}, {@link XrSenseDataFilterUuidBD#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSenseDataFilterUuidBD#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSenseDataFilterUuidBD.html"><code>XrSenseDataFilterUuidBD</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSenseDataFilterUuidBD(@NotNull MemorySegment segment) implements IXrSenseDataFilterUuidBD {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSenseDataFilterUuidBD.html"><code>XrSenseDataFilterUuidBD</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSenseDataFilterUuidBD}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSenseDataFilterUuidBD to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSenseDataFilterUuidBD.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSenseDataFilterUuidBD, Iterable<XrSenseDataFilterUuidBD> {
        public long size() {
            return segment.byteSize() / XrSenseDataFilterUuidBD.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSenseDataFilterUuidBD at(long index) {
            return new XrSenseDataFilterUuidBD(segment.asSlice(index * XrSenseDataFilterUuidBD.BYTES, XrSenseDataFilterUuidBD.BYTES));
        }

        public void write(long index, @NotNull XrSenseDataFilterUuidBD value) {
            MemorySegment s = segment.asSlice(index * XrSenseDataFilterUuidBD.BYTES, XrSenseDataFilterUuidBD.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSenseDataFilterUuidBD.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSenseDataFilterUuidBD.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSenseDataFilterUuidBD.BYTES,
                (end - start) * XrSenseDataFilterUuidBD.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSenseDataFilterUuidBD.BYTES));
        }

        public XrSenseDataFilterUuidBD[] toArray() {
            XrSenseDataFilterUuidBD[] ret = new XrSenseDataFilterUuidBD[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSenseDataFilterUuidBD> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSenseDataFilterUuidBD> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSenseDataFilterUuidBD.BYTES;
            }

            @Override
            public XrSenseDataFilterUuidBD next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSenseDataFilterUuidBD ret = new XrSenseDataFilterUuidBD(segment.asSlice(0, XrSenseDataFilterUuidBD.BYTES));
                segment = segment.asSlice(XrSenseDataFilterUuidBD.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSenseDataFilterUuidBD allocate(Arena arena) {
        XrSenseDataFilterUuidBD ret = new XrSenseDataFilterUuidBD(arena.allocate(LAYOUT));
        ret.type(XrStructureType.SENSE_DATA_FILTER_UUID_BD);
        return ret;
    }

    public static XrSenseDataFilterUuidBD.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSenseDataFilterUuidBD.Ptr ret = new XrSenseDataFilterUuidBD.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.SENSE_DATA_FILTER_UUID_BD);
        }
        return ret;
    }

    public static XrSenseDataFilterUuidBD clone(Arena arena, XrSenseDataFilterUuidBD src) {
        XrSenseDataFilterUuidBD ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.SENSE_DATA_FILTER_UUID_BD);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSenseDataFilterUuidBD type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSenseDataFilterUuidBD next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSenseDataFilterUuidBD next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int uuidCount() {
        return segment.get(LAYOUT$uuidCount, OFFSET$uuidCount);
    }

    public XrSenseDataFilterUuidBD uuidCount(@Unsigned int value) {
        segment.set(LAYOUT$uuidCount, OFFSET$uuidCount, value);
        return this;
    }

    public XrSenseDataFilterUuidBD uuids(@Nullable IXrUuidEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        uuidsRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrUuidEXT.Ptr uuids(int assumedCount) {
        MemorySegment s = uuidsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrUuidEXT.BYTES);
        return new XrUuidEXT.Ptr(s);
    }

    public @Nullable XrUuidEXT uuids() {
        MemorySegment s = uuidsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrUuidEXT(s);
    }

    public @Pointer(target=XrUuidEXT.class) @NotNull MemorySegment uuidsRaw() {
        return segment.get(LAYOUT$uuids, OFFSET$uuids);
    }

    public void uuidsRaw(@Pointer(target=XrUuidEXT.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$uuids, OFFSET$uuids, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("uuidCount"),
        ValueLayout.ADDRESS.withTargetLayout(XrUuidEXT.LAYOUT).withName("uuids")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$uuidCount = PathElement.groupElement("uuidCount");
    public static final PathElement PATH$uuids = PathElement.groupElement("uuids");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$uuidCount = (OfInt) LAYOUT.select(PATH$uuidCount);
    public static final AddressLayout LAYOUT$uuids = (AddressLayout) LAYOUT.select(PATH$uuids);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$uuidCount = LAYOUT$uuidCount.byteSize();
    public static final long SIZE$uuids = LAYOUT$uuids.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$uuidCount = LAYOUT.byteOffset(PATH$uuidCount);
    public static final long OFFSET$uuids = LAYOUT.byteOffset(PATH$uuids);
}
