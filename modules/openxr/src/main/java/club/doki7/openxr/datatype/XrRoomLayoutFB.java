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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrRoomLayoutFB.html"><code>XrRoomLayoutFB</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrRoomLayoutFB {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrUuidEXT floorUuid; // @link substring="XrUuidEXT" target="XrUuidEXT" @link substring="floorUuid" target="#floorUuid"
///     XrUuidEXT ceilingUuid; // @link substring="XrUuidEXT" target="XrUuidEXT" @link substring="ceilingUuid" target="#ceilingUuid"
///     uint32_t wallUuidCapacityInput; // optional // @link substring="wallUuidCapacityInput" target="#wallUuidCapacityInput"
///     uint32_t wallUuidCountOutput; // optional // @link substring="wallUuidCountOutput" target="#wallUuidCountOutput"
///     XrUuidEXT* wallUuids; // optional // @link substring="XrUuidEXT" target="XrUuidEXT" @link substring="wallUuids" target="#wallUuids"
/// } XrRoomLayoutFB;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_ROOM_LAYOUT_FB`
///
/// The {@code allocate} ({@link XrRoomLayoutFB#allocate(Arena)}, {@link XrRoomLayoutFB#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrRoomLayoutFB#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrRoomLayoutFB.html"><code>XrRoomLayoutFB</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrRoomLayoutFB(@NotNull MemorySegment segment) implements IXrRoomLayoutFB {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrRoomLayoutFB.html"><code>XrRoomLayoutFB</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrRoomLayoutFB}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrRoomLayoutFB to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrRoomLayoutFB.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrRoomLayoutFB, Iterable<XrRoomLayoutFB> {
        public long size() {
            return segment.byteSize() / XrRoomLayoutFB.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrRoomLayoutFB at(long index) {
            return new XrRoomLayoutFB(segment.asSlice(index * XrRoomLayoutFB.BYTES, XrRoomLayoutFB.BYTES));
        }

        public void write(long index, @NotNull XrRoomLayoutFB value) {
            MemorySegment s = segment.asSlice(index * XrRoomLayoutFB.BYTES, XrRoomLayoutFB.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrRoomLayoutFB.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrRoomLayoutFB.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrRoomLayoutFB.BYTES,
                (end - start) * XrRoomLayoutFB.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrRoomLayoutFB.BYTES));
        }

        public XrRoomLayoutFB[] toArray() {
            XrRoomLayoutFB[] ret = new XrRoomLayoutFB[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrRoomLayoutFB> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrRoomLayoutFB> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrRoomLayoutFB.BYTES;
            }

            @Override
            public XrRoomLayoutFB next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrRoomLayoutFB ret = new XrRoomLayoutFB(segment.asSlice(0, XrRoomLayoutFB.BYTES));
                segment = segment.asSlice(XrRoomLayoutFB.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrRoomLayoutFB allocate(Arena arena) {
        XrRoomLayoutFB ret = new XrRoomLayoutFB(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_ROOM_LAYOUT_FB);
        return ret;
    }

    public static XrRoomLayoutFB.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrRoomLayoutFB.Ptr ret = new XrRoomLayoutFB.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_ROOM_LAYOUT_FB);
        }
        return ret;
    }

    public static XrRoomLayoutFB clone(Arena arena, XrRoomLayoutFB src) {
        XrRoomLayoutFB ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_ROOM_LAYOUT_FB);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrRoomLayoutFB type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrRoomLayoutFB next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrRoomLayoutFB next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @NotNull XrUuidEXT floorUuid() {
        return new XrUuidEXT(segment.asSlice(OFFSET$floorUuid, LAYOUT$floorUuid));
    }

    public XrRoomLayoutFB floorUuid(@NotNull XrUuidEXT value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$floorUuid, SIZE$floorUuid);
        return this;
    }

    public XrRoomLayoutFB floorUuid(Consumer<@NotNull XrUuidEXT> consumer) {
        consumer.accept(floorUuid());
        return this;
    }

    public @NotNull XrUuidEXT ceilingUuid() {
        return new XrUuidEXT(segment.asSlice(OFFSET$ceilingUuid, LAYOUT$ceilingUuid));
    }

    public XrRoomLayoutFB ceilingUuid(@NotNull XrUuidEXT value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$ceilingUuid, SIZE$ceilingUuid);
        return this;
    }

    public XrRoomLayoutFB ceilingUuid(Consumer<@NotNull XrUuidEXT> consumer) {
        consumer.accept(ceilingUuid());
        return this;
    }

    public @Unsigned int wallUuidCapacityInput() {
        return segment.get(LAYOUT$wallUuidCapacityInput, OFFSET$wallUuidCapacityInput);
    }

    public XrRoomLayoutFB wallUuidCapacityInput(@Unsigned int value) {
        segment.set(LAYOUT$wallUuidCapacityInput, OFFSET$wallUuidCapacityInput, value);
        return this;
    }

    public @Unsigned int wallUuidCountOutput() {
        return segment.get(LAYOUT$wallUuidCountOutput, OFFSET$wallUuidCountOutput);
    }

    public XrRoomLayoutFB wallUuidCountOutput(@Unsigned int value) {
        segment.set(LAYOUT$wallUuidCountOutput, OFFSET$wallUuidCountOutput, value);
        return this;
    }

    public XrRoomLayoutFB wallUuids(@Nullable IXrUuidEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        wallUuidsRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrUuidEXT.Ptr wallUuids(int assumedCount) {
        MemorySegment s = wallUuidsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrUuidEXT.BYTES);
        return new XrUuidEXT.Ptr(s);
    }

    public @Nullable XrUuidEXT wallUuids() {
        MemorySegment s = wallUuidsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrUuidEXT(s);
    }

    public @Pointer(target=XrUuidEXT.class) @NotNull MemorySegment wallUuidsRaw() {
        return segment.get(LAYOUT$wallUuids, OFFSET$wallUuids);
    }

    public void wallUuidsRaw(@Pointer(target=XrUuidEXT.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$wallUuids, OFFSET$wallUuids, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        XrUuidEXT.LAYOUT.withName("floorUuid"),
        XrUuidEXT.LAYOUT.withName("ceilingUuid"),
        ValueLayout.JAVA_INT.withName("wallUuidCapacityInput"),
        ValueLayout.JAVA_INT.withName("wallUuidCountOutput"),
        ValueLayout.ADDRESS.withTargetLayout(XrUuidEXT.LAYOUT).withName("wallUuids")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$floorUuid = PathElement.groupElement("floorUuid");
    public static final PathElement PATH$ceilingUuid = PathElement.groupElement("ceilingUuid");
    public static final PathElement PATH$wallUuidCapacityInput = PathElement.groupElement("wallUuidCapacityInput");
    public static final PathElement PATH$wallUuidCountOutput = PathElement.groupElement("wallUuidCountOutput");
    public static final PathElement PATH$wallUuids = PathElement.groupElement("wallUuids");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final StructLayout LAYOUT$floorUuid = (StructLayout) LAYOUT.select(PATH$floorUuid);
    public static final StructLayout LAYOUT$ceilingUuid = (StructLayout) LAYOUT.select(PATH$ceilingUuid);
    public static final OfInt LAYOUT$wallUuidCapacityInput = (OfInt) LAYOUT.select(PATH$wallUuidCapacityInput);
    public static final OfInt LAYOUT$wallUuidCountOutput = (OfInt) LAYOUT.select(PATH$wallUuidCountOutput);
    public static final AddressLayout LAYOUT$wallUuids = (AddressLayout) LAYOUT.select(PATH$wallUuids);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$floorUuid = LAYOUT$floorUuid.byteSize();
    public static final long SIZE$ceilingUuid = LAYOUT$ceilingUuid.byteSize();
    public static final long SIZE$wallUuidCapacityInput = LAYOUT$wallUuidCapacityInput.byteSize();
    public static final long SIZE$wallUuidCountOutput = LAYOUT$wallUuidCountOutput.byteSize();
    public static final long SIZE$wallUuids = LAYOUT$wallUuids.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$floorUuid = LAYOUT.byteOffset(PATH$floorUuid);
    public static final long OFFSET$ceilingUuid = LAYOUT.byteOffset(PATH$ceilingUuid);
    public static final long OFFSET$wallUuidCapacityInput = LAYOUT.byteOffset(PATH$wallUuidCapacityInput);
    public static final long OFFSET$wallUuidCountOutput = LAYOUT.byteOffset(PATH$wallUuidCountOutput);
    public static final long OFFSET$wallUuids = LAYOUT.byteOffset(PATH$wallUuids);
}
