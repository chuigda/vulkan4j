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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialComponentDataQueryConditionEXT.html"><code>XrSpatialComponentDataQueryConditionEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSpatialComponentDataQueryConditionEXT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     uint32_t componentTypeCount; // optional // @link substring="componentTypeCount" target="#componentTypeCount"
///     XrSpatialComponentTypeEXT const* componentTypes; // optional // @link substring="XrSpatialComponentTypeEXT" target="XrSpatialComponentTypeEXT" @link substring="componentTypes" target="#componentTypes"
/// } XrSpatialComponentDataQueryConditionEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SPATIAL_COMPONENT_DATA_QUERY_CONDITION_EXT`
///
/// The {@code allocate} ({@link XrSpatialComponentDataQueryConditionEXT#allocate(Arena)}, {@link XrSpatialComponentDataQueryConditionEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSpatialComponentDataQueryConditionEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialComponentDataQueryConditionEXT.html"><code>XrSpatialComponentDataQueryConditionEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSpatialComponentDataQueryConditionEXT(@NotNull MemorySegment segment) implements IXrSpatialComponentDataQueryConditionEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialComponentDataQueryConditionEXT.html"><code>XrSpatialComponentDataQueryConditionEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSpatialComponentDataQueryConditionEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSpatialComponentDataQueryConditionEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSpatialComponentDataQueryConditionEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSpatialComponentDataQueryConditionEXT, Iterable<XrSpatialComponentDataQueryConditionEXT> {
        public long size() {
            return segment.byteSize() / XrSpatialComponentDataQueryConditionEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSpatialComponentDataQueryConditionEXT at(long index) {
            return new XrSpatialComponentDataQueryConditionEXT(segment.asSlice(index * XrSpatialComponentDataQueryConditionEXT.BYTES, XrSpatialComponentDataQueryConditionEXT.BYTES));
        }

        public void at(long index, @NotNull Consumer<@NotNull XrSpatialComponentDataQueryConditionEXT> consumer) {
            consumer.accept(at(index));
        }

        public void write(long index, @NotNull XrSpatialComponentDataQueryConditionEXT value) {
            MemorySegment s = segment.asSlice(index * XrSpatialComponentDataQueryConditionEXT.BYTES, XrSpatialComponentDataQueryConditionEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSpatialComponentDataQueryConditionEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSpatialComponentDataQueryConditionEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSpatialComponentDataQueryConditionEXT.BYTES,
                (end - start) * XrSpatialComponentDataQueryConditionEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSpatialComponentDataQueryConditionEXT.BYTES));
        }

        public XrSpatialComponentDataQueryConditionEXT[] toArray() {
            XrSpatialComponentDataQueryConditionEXT[] ret = new XrSpatialComponentDataQueryConditionEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSpatialComponentDataQueryConditionEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSpatialComponentDataQueryConditionEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSpatialComponentDataQueryConditionEXT.BYTES;
            }

            @Override
            public XrSpatialComponentDataQueryConditionEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSpatialComponentDataQueryConditionEXT ret = new XrSpatialComponentDataQueryConditionEXT(segment.asSlice(0, XrSpatialComponentDataQueryConditionEXT.BYTES));
                segment = segment.asSlice(XrSpatialComponentDataQueryConditionEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSpatialComponentDataQueryConditionEXT allocate(Arena arena) {
        XrSpatialComponentDataQueryConditionEXT ret = new XrSpatialComponentDataQueryConditionEXT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.SPATIAL_COMPONENT_DATA_QUERY_CONDITION_EXT);
        return ret;
    }

    public static XrSpatialComponentDataQueryConditionEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSpatialComponentDataQueryConditionEXT.Ptr ret = new XrSpatialComponentDataQueryConditionEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.SPATIAL_COMPONENT_DATA_QUERY_CONDITION_EXT);
        }
        return ret;
    }

    public static XrSpatialComponentDataQueryConditionEXT clone(Arena arena, XrSpatialComponentDataQueryConditionEXT src) {
        XrSpatialComponentDataQueryConditionEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.SPATIAL_COMPONENT_DATA_QUERY_CONDITION_EXT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSpatialComponentDataQueryConditionEXT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSpatialComponentDataQueryConditionEXT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSpatialComponentDataQueryConditionEXT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int componentTypeCount() {
        return segment.get(LAYOUT$componentTypeCount, OFFSET$componentTypeCount);
    }

    public XrSpatialComponentDataQueryConditionEXT componentTypeCount(@Unsigned int value) {
        segment.set(LAYOUT$componentTypeCount, OFFSET$componentTypeCount, value);
        return this;
    }


    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @EnumType(XrSpatialComponentTypeEXT.class) IntPtr componentTypes() {
        MemorySegment s = componentTypesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public XrSpatialComponentDataQueryConditionEXT componentTypes(@Nullable @EnumType(XrSpatialComponentTypeEXT.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        componentTypesRaw(s);
        return this;
    }

    public @Pointer(target=XrSpatialComponentTypeEXT.class) @NotNull MemorySegment componentTypesRaw() {
        return segment.get(LAYOUT$componentTypes, OFFSET$componentTypes);
    }

    public void componentTypesRaw(@Pointer(target=XrSpatialComponentTypeEXT.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$componentTypes, OFFSET$componentTypes, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("componentTypeCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("componentTypes")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$componentTypeCount = PathElement.groupElement("componentTypeCount");
    public static final PathElement PATH$componentTypes = PathElement.groupElement("componentTypes");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$componentTypeCount = (OfInt) LAYOUT.select(PATH$componentTypeCount);
    public static final AddressLayout LAYOUT$componentTypes = (AddressLayout) LAYOUT.select(PATH$componentTypes);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$componentTypeCount = LAYOUT$componentTypeCount.byteSize();
    public static final long SIZE$componentTypes = LAYOUT$componentTypes.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$componentTypeCount = LAYOUT.byteOffset(PATH$componentTypeCount);
    public static final long OFFSET$componentTypes = LAYOUT.byteOffset(PATH$componentTypes);
}
