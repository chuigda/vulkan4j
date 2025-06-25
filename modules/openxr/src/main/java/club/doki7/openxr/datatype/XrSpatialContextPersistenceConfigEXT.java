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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialContextPersistenceConfigEXT.html"><code>XrSpatialContextPersistenceConfigEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSpatialContextPersistenceConfigEXT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     uint32_t persistenceContextCount; // @link substring="persistenceContextCount" target="#persistenceContextCount"
///     XrSpatialPersistenceContextEXT const* persistenceContexts; // @link substring="XrSpatialPersistenceContextEXT" target="XrSpatialPersistenceContextEXT" @link substring="persistenceContexts" target="#persistenceContexts"
/// } XrSpatialContextPersistenceConfigEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SPATIAL_CONTEXT_PERSISTENCE_CONFIG_EXT`
///
/// The {@code allocate} ({@link XrSpatialContextPersistenceConfigEXT#allocate(Arena)}, {@link XrSpatialContextPersistenceConfigEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSpatialContextPersistenceConfigEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialContextPersistenceConfigEXT.html"><code>XrSpatialContextPersistenceConfigEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSpatialContextPersistenceConfigEXT(@NotNull MemorySegment segment) implements IXrSpatialContextPersistenceConfigEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialContextPersistenceConfigEXT.html"><code>XrSpatialContextPersistenceConfigEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSpatialContextPersistenceConfigEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSpatialContextPersistenceConfigEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSpatialContextPersistenceConfigEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSpatialContextPersistenceConfigEXT, Iterable<XrSpatialContextPersistenceConfigEXT> {
        public long size() {
            return segment.byteSize() / XrSpatialContextPersistenceConfigEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSpatialContextPersistenceConfigEXT at(long index) {
            return new XrSpatialContextPersistenceConfigEXT(segment.asSlice(index * XrSpatialContextPersistenceConfigEXT.BYTES, XrSpatialContextPersistenceConfigEXT.BYTES));
        }

        public void write(long index, @NotNull XrSpatialContextPersistenceConfigEXT value) {
            MemorySegment s = segment.asSlice(index * XrSpatialContextPersistenceConfigEXT.BYTES, XrSpatialContextPersistenceConfigEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSpatialContextPersistenceConfigEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSpatialContextPersistenceConfigEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSpatialContextPersistenceConfigEXT.BYTES,
                (end - start) * XrSpatialContextPersistenceConfigEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSpatialContextPersistenceConfigEXT.BYTES));
        }

        public XrSpatialContextPersistenceConfigEXT[] toArray() {
            XrSpatialContextPersistenceConfigEXT[] ret = new XrSpatialContextPersistenceConfigEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSpatialContextPersistenceConfigEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSpatialContextPersistenceConfigEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSpatialContextPersistenceConfigEXT.BYTES;
            }

            @Override
            public XrSpatialContextPersistenceConfigEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSpatialContextPersistenceConfigEXT ret = new XrSpatialContextPersistenceConfigEXT(segment.asSlice(0, XrSpatialContextPersistenceConfigEXT.BYTES));
                segment = segment.asSlice(XrSpatialContextPersistenceConfigEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSpatialContextPersistenceConfigEXT allocate(Arena arena) {
        XrSpatialContextPersistenceConfigEXT ret = new XrSpatialContextPersistenceConfigEXT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.SPATIAL_CONTEXT_PERSISTENCE_CONFIG_EXT);
        return ret;
    }

    public static XrSpatialContextPersistenceConfigEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSpatialContextPersistenceConfigEXT.Ptr ret = new XrSpatialContextPersistenceConfigEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.SPATIAL_CONTEXT_PERSISTENCE_CONFIG_EXT);
        }
        return ret;
    }

    public static XrSpatialContextPersistenceConfigEXT clone(Arena arena, XrSpatialContextPersistenceConfigEXT src) {
        XrSpatialContextPersistenceConfigEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.SPATIAL_CONTEXT_PERSISTENCE_CONFIG_EXT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSpatialContextPersistenceConfigEXT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSpatialContextPersistenceConfigEXT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSpatialContextPersistenceConfigEXT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int persistenceContextCount() {
        return segment.get(LAYOUT$persistenceContextCount, OFFSET$persistenceContextCount);
    }

    public XrSpatialContextPersistenceConfigEXT persistenceContextCount(@Unsigned int value) {
        segment.set(LAYOUT$persistenceContextCount, OFFSET$persistenceContextCount, value);
        return this;
    }

    /// Note: the returned {@link XrSpatialPersistenceContextEXT.Ptr} does not have correct {@link XrSpatialPersistenceContextEXT.Ptr#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link XrSpatialPersistenceContextEXT.Ptr#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable XrSpatialPersistenceContextEXT.Ptr persistenceContexts() {
        MemorySegment s = persistenceContextsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrSpatialPersistenceContextEXT.Ptr(s);
    }

    public XrSpatialContextPersistenceConfigEXT persistenceContexts(@Nullable XrSpatialPersistenceContextEXT.Ptr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        persistenceContextsRaw(s);
        return this;
    }

    public @Pointer(target=XrSpatialPersistenceContextEXT.class) @NotNull MemorySegment persistenceContextsRaw() {
        return segment.get(LAYOUT$persistenceContexts, OFFSET$persistenceContexts);
    }

    public void persistenceContextsRaw(@Pointer(target=XrSpatialPersistenceContextEXT.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$persistenceContexts, OFFSET$persistenceContexts, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("persistenceContextCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("persistenceContexts")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$persistenceContextCount = PathElement.groupElement("persistenceContextCount");
    public static final PathElement PATH$persistenceContexts = PathElement.groupElement("persistenceContexts");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$persistenceContextCount = (OfInt) LAYOUT.select(PATH$persistenceContextCount);
    public static final AddressLayout LAYOUT$persistenceContexts = (AddressLayout) LAYOUT.select(PATH$persistenceContexts);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$persistenceContextCount = LAYOUT$persistenceContextCount.byteSize();
    public static final long SIZE$persistenceContexts = LAYOUT$persistenceContexts.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$persistenceContextCount = LAYOUT.byteOffset(PATH$persistenceContextCount);
    public static final long OFFSET$persistenceContexts = LAYOUT.byteOffset(PATH$persistenceContexts);
}
