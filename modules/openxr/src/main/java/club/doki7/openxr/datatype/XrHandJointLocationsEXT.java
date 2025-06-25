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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHandJointLocationsEXT.html"><code>XrHandJointLocationsEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrHandJointLocationsEXT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void* next; // @link substring="next" target="#next"
///     XrBool32 isActive; // @link substring="isActive" target="#isActive"
///     uint32_t jointCount; // @link substring="jointCount" target="#jointCount"
///     XrHandJointLocationEXT* jointLocations; // @link substring="XrHandJointLocationEXT" target="XrHandJointLocationEXT" @link substring="jointLocations" target="#jointLocations"
/// } XrHandJointLocationsEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_HAND_JOINT_LOCATIONS_EXT`
///
/// The {@code allocate} ({@link XrHandJointLocationsEXT#allocate(Arena)}, {@link XrHandJointLocationsEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrHandJointLocationsEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHandJointLocationsEXT.html"><code>XrHandJointLocationsEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrHandJointLocationsEXT(@NotNull MemorySegment segment) implements IXrHandJointLocationsEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHandJointLocationsEXT.html"><code>XrHandJointLocationsEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrHandJointLocationsEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrHandJointLocationsEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrHandJointLocationsEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrHandJointLocationsEXT, Iterable<XrHandJointLocationsEXT> {
        public long size() {
            return segment.byteSize() / XrHandJointLocationsEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrHandJointLocationsEXT at(long index) {
            return new XrHandJointLocationsEXT(segment.asSlice(index * XrHandJointLocationsEXT.BYTES, XrHandJointLocationsEXT.BYTES));
        }

        public XrHandJointLocationsEXT.Ptr at(long index, @NotNull Consumer<@NotNull XrHandJointLocationsEXT> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrHandJointLocationsEXT value) {
            MemorySegment s = segment.asSlice(index * XrHandJointLocationsEXT.BYTES, XrHandJointLocationsEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrHandJointLocationsEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrHandJointLocationsEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrHandJointLocationsEXT.BYTES,
                (end - start) * XrHandJointLocationsEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrHandJointLocationsEXT.BYTES));
        }

        public XrHandJointLocationsEXT[] toArray() {
            XrHandJointLocationsEXT[] ret = new XrHandJointLocationsEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrHandJointLocationsEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrHandJointLocationsEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrHandJointLocationsEXT.BYTES;
            }

            @Override
            public XrHandJointLocationsEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrHandJointLocationsEXT ret = new XrHandJointLocationsEXT(segment.asSlice(0, XrHandJointLocationsEXT.BYTES));
                segment = segment.asSlice(XrHandJointLocationsEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrHandJointLocationsEXT allocate(Arena arena) {
        XrHandJointLocationsEXT ret = new XrHandJointLocationsEXT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.HAND_JOINT_LOCATIONS_EXT);
        return ret;
    }

    public static XrHandJointLocationsEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrHandJointLocationsEXT.Ptr ret = new XrHandJointLocationsEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.HAND_JOINT_LOCATIONS_EXT);
        }
        return ret;
    }

    public static XrHandJointLocationsEXT clone(Arena arena, XrHandJointLocationsEXT src) {
        XrHandJointLocationsEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.HAND_JOINT_LOCATIONS_EXT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrHandJointLocationsEXT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrHandJointLocationsEXT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrHandJointLocationsEXT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @NativeType("XrBool32") @Unsigned int isActive() {
        return segment.get(LAYOUT$isActive, OFFSET$isActive);
    }

    public XrHandJointLocationsEXT isActive(@NativeType("XrBool32") @Unsigned int value) {
        segment.set(LAYOUT$isActive, OFFSET$isActive, value);
        return this;
    }

    public @Unsigned int jointCount() {
        return segment.get(LAYOUT$jointCount, OFFSET$jointCount);
    }

    public XrHandJointLocationsEXT jointCount(@Unsigned int value) {
        segment.set(LAYOUT$jointCount, OFFSET$jointCount, value);
        return this;
    }

    public XrHandJointLocationsEXT jointLocations(@Nullable IXrHandJointLocationEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        jointLocationsRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrHandJointLocationEXT.Ptr jointLocations(int assumedCount) {
        MemorySegment s = jointLocationsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrHandJointLocationEXT.BYTES);
        return new XrHandJointLocationEXT.Ptr(s);
    }

    public @Nullable XrHandJointLocationEXT jointLocations() {
        MemorySegment s = jointLocationsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrHandJointLocationEXT(s);
    }

    public @Pointer(target=XrHandJointLocationEXT.class) @NotNull MemorySegment jointLocationsRaw() {
        return segment.get(LAYOUT$jointLocations, OFFSET$jointLocations);
    }

    public void jointLocationsRaw(@Pointer(target=XrHandJointLocationEXT.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$jointLocations, OFFSET$jointLocations, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("isActive"),
        ValueLayout.JAVA_INT.withName("jointCount"),
        ValueLayout.ADDRESS.withTargetLayout(XrHandJointLocationEXT.LAYOUT).withName("jointLocations")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$isActive = PathElement.groupElement("isActive");
    public static final PathElement PATH$jointCount = PathElement.groupElement("jointCount");
    public static final PathElement PATH$jointLocations = PathElement.groupElement("jointLocations");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$isActive = (OfInt) LAYOUT.select(PATH$isActive);
    public static final OfInt LAYOUT$jointCount = (OfInt) LAYOUT.select(PATH$jointCount);
    public static final AddressLayout LAYOUT$jointLocations = (AddressLayout) LAYOUT.select(PATH$jointLocations);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$isActive = LAYOUT$isActive.byteSize();
    public static final long SIZE$jointCount = LAYOUT$jointCount.byteSize();
    public static final long SIZE$jointLocations = LAYOUT$jointLocations.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$isActive = LAYOUT.byteOffset(PATH$isActive);
    public static final long OFFSET$jointCount = LAYOUT.byteOffset(PATH$jointCount);
    public static final long OFFSET$jointLocations = LAYOUT.byteOffset(PATH$jointLocations);
}
