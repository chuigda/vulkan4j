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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFaceTrackerCreateInfo2FB.html"><code>XrFaceTrackerCreateInfo2FB</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrFaceTrackerCreateInfo2FB {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrFaceExpressionSet2FB faceExpressionSet; // @link substring="XrFaceExpressionSet2FB" target="XrFaceExpressionSet2FB" @link substring="faceExpressionSet" target="#faceExpressionSet"
///     uint32_t requestedDataSourceCount; // optional // @link substring="requestedDataSourceCount" target="#requestedDataSourceCount"
///     XrFaceTrackingDataSource2FB* requestedDataSources; // optional // @link substring="XrFaceTrackingDataSource2FB" target="XrFaceTrackingDataSource2FB" @link substring="requestedDataSources" target="#requestedDataSources"
/// } XrFaceTrackerCreateInfo2FB;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_FACE_TRACKER_CREATE_INFO2_FB`
///
/// The {@code allocate} ({@link XrFaceTrackerCreateInfo2FB#allocate(Arena)}, {@link XrFaceTrackerCreateInfo2FB#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrFaceTrackerCreateInfo2FB#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFaceTrackerCreateInfo2FB.html"><code>XrFaceTrackerCreateInfo2FB</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrFaceTrackerCreateInfo2FB(@NotNull MemorySegment segment) implements IXrFaceTrackerCreateInfo2FB {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrFaceTrackerCreateInfo2FB.html"><code>XrFaceTrackerCreateInfo2FB</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrFaceTrackerCreateInfo2FB}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrFaceTrackerCreateInfo2FB to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrFaceTrackerCreateInfo2FB.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrFaceTrackerCreateInfo2FB, Iterable<XrFaceTrackerCreateInfo2FB> {
        public long size() {
            return segment.byteSize() / XrFaceTrackerCreateInfo2FB.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrFaceTrackerCreateInfo2FB at(long index) {
            return new XrFaceTrackerCreateInfo2FB(segment.asSlice(index * XrFaceTrackerCreateInfo2FB.BYTES, XrFaceTrackerCreateInfo2FB.BYTES));
        }

        public void at(long index, @NotNull Consumer<@NotNull XrFaceTrackerCreateInfo2FB> consumer) {
            consumer.accept(at(index));
        }

        public void write(long index, @NotNull XrFaceTrackerCreateInfo2FB value) {
            MemorySegment s = segment.asSlice(index * XrFaceTrackerCreateInfo2FB.BYTES, XrFaceTrackerCreateInfo2FB.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrFaceTrackerCreateInfo2FB.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrFaceTrackerCreateInfo2FB.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrFaceTrackerCreateInfo2FB.BYTES,
                (end - start) * XrFaceTrackerCreateInfo2FB.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrFaceTrackerCreateInfo2FB.BYTES));
        }

        public XrFaceTrackerCreateInfo2FB[] toArray() {
            XrFaceTrackerCreateInfo2FB[] ret = new XrFaceTrackerCreateInfo2FB[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrFaceTrackerCreateInfo2FB> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrFaceTrackerCreateInfo2FB> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrFaceTrackerCreateInfo2FB.BYTES;
            }

            @Override
            public XrFaceTrackerCreateInfo2FB next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrFaceTrackerCreateInfo2FB ret = new XrFaceTrackerCreateInfo2FB(segment.asSlice(0, XrFaceTrackerCreateInfo2FB.BYTES));
                segment = segment.asSlice(XrFaceTrackerCreateInfo2FB.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrFaceTrackerCreateInfo2FB allocate(Arena arena) {
        XrFaceTrackerCreateInfo2FB ret = new XrFaceTrackerCreateInfo2FB(arena.allocate(LAYOUT));
        ret.type(XrStructureType.FACE_TRACKER_CREATE_INFO2_FB);
        return ret;
    }

    public static XrFaceTrackerCreateInfo2FB.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrFaceTrackerCreateInfo2FB.Ptr ret = new XrFaceTrackerCreateInfo2FB.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.FACE_TRACKER_CREATE_INFO2_FB);
        }
        return ret;
    }

    public static XrFaceTrackerCreateInfo2FB clone(Arena arena, XrFaceTrackerCreateInfo2FB src) {
        XrFaceTrackerCreateInfo2FB ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.FACE_TRACKER_CREATE_INFO2_FB);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrFaceTrackerCreateInfo2FB type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrFaceTrackerCreateInfo2FB next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrFaceTrackerCreateInfo2FB next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @EnumType(XrFaceExpressionSet2FB.class) int faceExpressionSet() {
        return segment.get(LAYOUT$faceExpressionSet, OFFSET$faceExpressionSet);
    }

    public XrFaceTrackerCreateInfo2FB faceExpressionSet(@EnumType(XrFaceExpressionSet2FB.class) int value) {
        segment.set(LAYOUT$faceExpressionSet, OFFSET$faceExpressionSet, value);
        return this;
    }

    public @Unsigned int requestedDataSourceCount() {
        return segment.get(LAYOUT$requestedDataSourceCount, OFFSET$requestedDataSourceCount);
    }

    public XrFaceTrackerCreateInfo2FB requestedDataSourceCount(@Unsigned int value) {
        segment.set(LAYOUT$requestedDataSourceCount, OFFSET$requestedDataSourceCount, value);
        return this;
    }


    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @EnumType(XrFaceTrackingDataSource2FB.class) IntPtr requestedDataSources() {
        MemorySegment s = requestedDataSourcesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public XrFaceTrackerCreateInfo2FB requestedDataSources(@Nullable @EnumType(XrFaceTrackingDataSource2FB.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        requestedDataSourcesRaw(s);
        return this;
    }

    public @Pointer(target=XrFaceTrackingDataSource2FB.class) @NotNull MemorySegment requestedDataSourcesRaw() {
        return segment.get(LAYOUT$requestedDataSources, OFFSET$requestedDataSources);
    }

    public void requestedDataSourcesRaw(@Pointer(target=XrFaceTrackingDataSource2FB.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$requestedDataSources, OFFSET$requestedDataSources, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("faceExpressionSet"),
        ValueLayout.JAVA_INT.withName("requestedDataSourceCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("requestedDataSources")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$faceExpressionSet = PathElement.groupElement("faceExpressionSet");
    public static final PathElement PATH$requestedDataSourceCount = PathElement.groupElement("requestedDataSourceCount");
    public static final PathElement PATH$requestedDataSources = PathElement.groupElement("requestedDataSources");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$faceExpressionSet = (OfInt) LAYOUT.select(PATH$faceExpressionSet);
    public static final OfInt LAYOUT$requestedDataSourceCount = (OfInt) LAYOUT.select(PATH$requestedDataSourceCount);
    public static final AddressLayout LAYOUT$requestedDataSources = (AddressLayout) LAYOUT.select(PATH$requestedDataSources);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$faceExpressionSet = LAYOUT$faceExpressionSet.byteSize();
    public static final long SIZE$requestedDataSourceCount = LAYOUT$requestedDataSourceCount.byteSize();
    public static final long SIZE$requestedDataSources = LAYOUT$requestedDataSources.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$faceExpressionSet = LAYOUT.byteOffset(PATH$faceExpressionSet);
    public static final long OFFSET$requestedDataSourceCount = LAYOUT.byteOffset(PATH$requestedDataSourceCount);
    public static final long OFFSET$requestedDataSources = LAYOUT.byteOffset(PATH$requestedDataSources);
}
