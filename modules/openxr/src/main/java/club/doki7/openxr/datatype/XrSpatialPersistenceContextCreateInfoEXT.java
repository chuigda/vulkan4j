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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialPersistenceContextCreateInfoEXT.html"><code>XrSpatialPersistenceContextCreateInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSpatialPersistenceContextCreateInfoEXT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrSpatialPersistenceScopeEXT scope; // @link substring="XrSpatialPersistenceScopeEXT" target="XrSpatialPersistenceScopeEXT" @link substring="scope" target="#scope"
/// } XrSpatialPersistenceContextCreateInfoEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SPATIAL_PERSISTENCE_CONTEXT_CREATE_INFO_EXT`
///
/// The {@code allocate} ({@link XrSpatialPersistenceContextCreateInfoEXT#allocate(Arena)}, {@link XrSpatialPersistenceContextCreateInfoEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSpatialPersistenceContextCreateInfoEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialPersistenceContextCreateInfoEXT.html"><code>XrSpatialPersistenceContextCreateInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSpatialPersistenceContextCreateInfoEXT(@NotNull MemorySegment segment) implements IXrSpatialPersistenceContextCreateInfoEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialPersistenceContextCreateInfoEXT.html"><code>XrSpatialPersistenceContextCreateInfoEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSpatialPersistenceContextCreateInfoEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSpatialPersistenceContextCreateInfoEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSpatialPersistenceContextCreateInfoEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSpatialPersistenceContextCreateInfoEXT, Iterable<XrSpatialPersistenceContextCreateInfoEXT> {
        public long size() {
            return segment.byteSize() / XrSpatialPersistenceContextCreateInfoEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSpatialPersistenceContextCreateInfoEXT at(long index) {
            return new XrSpatialPersistenceContextCreateInfoEXT(segment.asSlice(index * XrSpatialPersistenceContextCreateInfoEXT.BYTES, XrSpatialPersistenceContextCreateInfoEXT.BYTES));
        }

        public XrSpatialPersistenceContextCreateInfoEXT.Ptr at(long index, @NotNull Consumer<@NotNull XrSpatialPersistenceContextCreateInfoEXT> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrSpatialPersistenceContextCreateInfoEXT value) {
            MemorySegment s = segment.asSlice(index * XrSpatialPersistenceContextCreateInfoEXT.BYTES, XrSpatialPersistenceContextCreateInfoEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSpatialPersistenceContextCreateInfoEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSpatialPersistenceContextCreateInfoEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSpatialPersistenceContextCreateInfoEXT.BYTES,
                (end - start) * XrSpatialPersistenceContextCreateInfoEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSpatialPersistenceContextCreateInfoEXT.BYTES));
        }

        public XrSpatialPersistenceContextCreateInfoEXT[] toArray() {
            XrSpatialPersistenceContextCreateInfoEXT[] ret = new XrSpatialPersistenceContextCreateInfoEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSpatialPersistenceContextCreateInfoEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSpatialPersistenceContextCreateInfoEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSpatialPersistenceContextCreateInfoEXT.BYTES;
            }

            @Override
            public XrSpatialPersistenceContextCreateInfoEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSpatialPersistenceContextCreateInfoEXT ret = new XrSpatialPersistenceContextCreateInfoEXT(segment.asSlice(0, XrSpatialPersistenceContextCreateInfoEXT.BYTES));
                segment = segment.asSlice(XrSpatialPersistenceContextCreateInfoEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSpatialPersistenceContextCreateInfoEXT allocate(Arena arena) {
        XrSpatialPersistenceContextCreateInfoEXT ret = new XrSpatialPersistenceContextCreateInfoEXT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.SPATIAL_PERSISTENCE_CONTEXT_CREATE_INFO_EXT);
        return ret;
    }

    public static XrSpatialPersistenceContextCreateInfoEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSpatialPersistenceContextCreateInfoEXT.Ptr ret = new XrSpatialPersistenceContextCreateInfoEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.SPATIAL_PERSISTENCE_CONTEXT_CREATE_INFO_EXT);
        }
        return ret;
    }

    public static XrSpatialPersistenceContextCreateInfoEXT clone(Arena arena, XrSpatialPersistenceContextCreateInfoEXT src) {
        XrSpatialPersistenceContextCreateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.SPATIAL_PERSISTENCE_CONTEXT_CREATE_INFO_EXT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSpatialPersistenceContextCreateInfoEXT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSpatialPersistenceContextCreateInfoEXT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSpatialPersistenceContextCreateInfoEXT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @EnumType(XrSpatialPersistenceScopeEXT.class) int scope() {
        return segment.get(LAYOUT$scope, OFFSET$scope);
    }

    public XrSpatialPersistenceContextCreateInfoEXT scope(@EnumType(XrSpatialPersistenceScopeEXT.class) int value) {
        segment.set(LAYOUT$scope, OFFSET$scope, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("scope")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$scope = PathElement.groupElement("scope");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$scope = (OfInt) LAYOUT.select(PATH$scope);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$scope = LAYOUT$scope.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$scope = LAYOUT.byteOffset(PATH$scope);
}
