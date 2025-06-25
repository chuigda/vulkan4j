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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneMarkerTypeFilterMSFT.html"><code>XrSceneMarkerTypeFilterMSFT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSceneMarkerTypeFilterMSFT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     uint32_t markerTypeCount; // optional // @link substring="markerTypeCount" target="#markerTypeCount"
///     XrSceneMarkerTypeMSFT* markerTypes; // optional // @link substring="XrSceneMarkerTypeMSFT" target="XrSceneMarkerTypeMSFT" @link substring="markerTypes" target="#markerTypes"
/// } XrSceneMarkerTypeFilterMSFT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SCENE_MARKER_TYPE_FILTER_MSFT`
///
/// The {@code allocate} ({@link XrSceneMarkerTypeFilterMSFT#allocate(Arena)}, {@link XrSceneMarkerTypeFilterMSFT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSceneMarkerTypeFilterMSFT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneMarkerTypeFilterMSFT.html"><code>XrSceneMarkerTypeFilterMSFT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSceneMarkerTypeFilterMSFT(@NotNull MemorySegment segment) implements IXrSceneMarkerTypeFilterMSFT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneMarkerTypeFilterMSFT.html"><code>XrSceneMarkerTypeFilterMSFT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSceneMarkerTypeFilterMSFT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSceneMarkerTypeFilterMSFT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSceneMarkerTypeFilterMSFT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSceneMarkerTypeFilterMSFT, Iterable<XrSceneMarkerTypeFilterMSFT> {
        public long size() {
            return segment.byteSize() / XrSceneMarkerTypeFilterMSFT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSceneMarkerTypeFilterMSFT at(long index) {
            return new XrSceneMarkerTypeFilterMSFT(segment.asSlice(index * XrSceneMarkerTypeFilterMSFT.BYTES, XrSceneMarkerTypeFilterMSFT.BYTES));
        }

        public void at(long index, @NotNull Consumer<@NotNull XrSceneMarkerTypeFilterMSFT> consumer) {
            consumer.accept(at(index));
        }

        public void write(long index, @NotNull XrSceneMarkerTypeFilterMSFT value) {
            MemorySegment s = segment.asSlice(index * XrSceneMarkerTypeFilterMSFT.BYTES, XrSceneMarkerTypeFilterMSFT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSceneMarkerTypeFilterMSFT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSceneMarkerTypeFilterMSFT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSceneMarkerTypeFilterMSFT.BYTES,
                (end - start) * XrSceneMarkerTypeFilterMSFT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSceneMarkerTypeFilterMSFT.BYTES));
        }

        public XrSceneMarkerTypeFilterMSFT[] toArray() {
            XrSceneMarkerTypeFilterMSFT[] ret = new XrSceneMarkerTypeFilterMSFT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSceneMarkerTypeFilterMSFT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSceneMarkerTypeFilterMSFT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSceneMarkerTypeFilterMSFT.BYTES;
            }

            @Override
            public XrSceneMarkerTypeFilterMSFT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSceneMarkerTypeFilterMSFT ret = new XrSceneMarkerTypeFilterMSFT(segment.asSlice(0, XrSceneMarkerTypeFilterMSFT.BYTES));
                segment = segment.asSlice(XrSceneMarkerTypeFilterMSFT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSceneMarkerTypeFilterMSFT allocate(Arena arena) {
        XrSceneMarkerTypeFilterMSFT ret = new XrSceneMarkerTypeFilterMSFT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.SCENE_MARKER_TYPE_FILTER_MSFT);
        return ret;
    }

    public static XrSceneMarkerTypeFilterMSFT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSceneMarkerTypeFilterMSFT.Ptr ret = new XrSceneMarkerTypeFilterMSFT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.SCENE_MARKER_TYPE_FILTER_MSFT);
        }
        return ret;
    }

    public static XrSceneMarkerTypeFilterMSFT clone(Arena arena, XrSceneMarkerTypeFilterMSFT src) {
        XrSceneMarkerTypeFilterMSFT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.SCENE_MARKER_TYPE_FILTER_MSFT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSceneMarkerTypeFilterMSFT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSceneMarkerTypeFilterMSFT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSceneMarkerTypeFilterMSFT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int markerTypeCount() {
        return segment.get(LAYOUT$markerTypeCount, OFFSET$markerTypeCount);
    }

    public XrSceneMarkerTypeFilterMSFT markerTypeCount(@Unsigned int value) {
        segment.set(LAYOUT$markerTypeCount, OFFSET$markerTypeCount, value);
        return this;
    }


    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @EnumType(XrSceneMarkerTypeMSFT.class) IntPtr markerTypes() {
        MemorySegment s = markerTypesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public XrSceneMarkerTypeFilterMSFT markerTypes(@Nullable @EnumType(XrSceneMarkerTypeMSFT.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        markerTypesRaw(s);
        return this;
    }

    public @Pointer(target=XrSceneMarkerTypeMSFT.class) @NotNull MemorySegment markerTypesRaw() {
        return segment.get(LAYOUT$markerTypes, OFFSET$markerTypes);
    }

    public void markerTypesRaw(@Pointer(target=XrSceneMarkerTypeMSFT.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$markerTypes, OFFSET$markerTypes, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("markerTypeCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("markerTypes")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$markerTypeCount = PathElement.groupElement("markerTypeCount");
    public static final PathElement PATH$markerTypes = PathElement.groupElement("markerTypes");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$markerTypeCount = (OfInt) LAYOUT.select(PATH$markerTypeCount);
    public static final AddressLayout LAYOUT$markerTypes = (AddressLayout) LAYOUT.select(PATH$markerTypes);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$markerTypeCount = LAYOUT$markerTypeCount.byteSize();
    public static final long SIZE$markerTypes = LAYOUT$markerTypes.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$markerTypeCount = LAYOUT.byteOffset(PATH$markerTypeCount);
    public static final long OFFSET$markerTypes = LAYOUT.byteOffset(PATH$markerTypes);
}
