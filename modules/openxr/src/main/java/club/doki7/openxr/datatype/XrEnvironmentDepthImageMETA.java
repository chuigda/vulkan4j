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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrEnvironmentDepthImageMETA.html"><code>XrEnvironmentDepthImageMETA</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrEnvironmentDepthImageMETA {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     uint32_t swapchainIndex; // @link substring="swapchainIndex" target="#swapchainIndex"
///     float nearZ; // @link substring="nearZ" target="#nearZ"
///     float farZ; // @link substring="farZ" target="#farZ"
///     XrEnvironmentDepthImageViewMETA[2] views; // @link substring="XrEnvironmentDepthImageViewMETA" target="XrEnvironmentDepthImageViewMETA" @link substring="views" target="#views"
/// } XrEnvironmentDepthImageMETA;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_ENVIRONMENT_DEPTH_IMAGE_META`
///
/// The {@code allocate} ({@link XrEnvironmentDepthImageMETA#allocate(Arena)}, {@link XrEnvironmentDepthImageMETA#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrEnvironmentDepthImageMETA#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrEnvironmentDepthImageMETA.html"><code>XrEnvironmentDepthImageMETA</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrEnvironmentDepthImageMETA(@NotNull MemorySegment segment) implements IXrEnvironmentDepthImageMETA {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrEnvironmentDepthImageMETA.html"><code>XrEnvironmentDepthImageMETA</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrEnvironmentDepthImageMETA}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrEnvironmentDepthImageMETA to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrEnvironmentDepthImageMETA.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrEnvironmentDepthImageMETA, Iterable<XrEnvironmentDepthImageMETA> {
        public long size() {
            return segment.byteSize() / XrEnvironmentDepthImageMETA.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrEnvironmentDepthImageMETA at(long index) {
            return new XrEnvironmentDepthImageMETA(segment.asSlice(index * XrEnvironmentDepthImageMETA.BYTES, XrEnvironmentDepthImageMETA.BYTES));
        }

        public XrEnvironmentDepthImageMETA.Ptr at(long index, @NotNull Consumer<@NotNull XrEnvironmentDepthImageMETA> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrEnvironmentDepthImageMETA value) {
            MemorySegment s = segment.asSlice(index * XrEnvironmentDepthImageMETA.BYTES, XrEnvironmentDepthImageMETA.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrEnvironmentDepthImageMETA.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrEnvironmentDepthImageMETA.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrEnvironmentDepthImageMETA.BYTES,
                (end - start) * XrEnvironmentDepthImageMETA.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrEnvironmentDepthImageMETA.BYTES));
        }

        public XrEnvironmentDepthImageMETA[] toArray() {
            XrEnvironmentDepthImageMETA[] ret = new XrEnvironmentDepthImageMETA[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrEnvironmentDepthImageMETA> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrEnvironmentDepthImageMETA> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrEnvironmentDepthImageMETA.BYTES;
            }

            @Override
            public XrEnvironmentDepthImageMETA next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrEnvironmentDepthImageMETA ret = new XrEnvironmentDepthImageMETA(segment.asSlice(0, XrEnvironmentDepthImageMETA.BYTES));
                segment = segment.asSlice(XrEnvironmentDepthImageMETA.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrEnvironmentDepthImageMETA allocate(Arena arena) {
        XrEnvironmentDepthImageMETA ret = new XrEnvironmentDepthImageMETA(arena.allocate(LAYOUT));
        ret.type(XrStructureType.ENVIRONMENT_DEPTH_IMAGE_META);
        return ret;
    }

    public static XrEnvironmentDepthImageMETA.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrEnvironmentDepthImageMETA.Ptr ret = new XrEnvironmentDepthImageMETA.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.ENVIRONMENT_DEPTH_IMAGE_META);
        }
        return ret;
    }

    public static XrEnvironmentDepthImageMETA clone(Arena arena, XrEnvironmentDepthImageMETA src) {
        XrEnvironmentDepthImageMETA ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.ENVIRONMENT_DEPTH_IMAGE_META);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrEnvironmentDepthImageMETA type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrEnvironmentDepthImageMETA next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrEnvironmentDepthImageMETA next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int swapchainIndex() {
        return segment.get(LAYOUT$swapchainIndex, OFFSET$swapchainIndex);
    }

    public XrEnvironmentDepthImageMETA swapchainIndex(@Unsigned int value) {
        segment.set(LAYOUT$swapchainIndex, OFFSET$swapchainIndex, value);
        return this;
    }

    public float nearZ() {
        return segment.get(LAYOUT$nearZ, OFFSET$nearZ);
    }

    public XrEnvironmentDepthImageMETA nearZ(float value) {
        segment.set(LAYOUT$nearZ, OFFSET$nearZ, value);
        return this;
    }

    public float farZ() {
        return segment.get(LAYOUT$farZ, OFFSET$farZ);
    }

    public XrEnvironmentDepthImageMETA farZ(float value) {
        segment.set(LAYOUT$farZ, OFFSET$farZ, value);
        return this;
    }

    public XrEnvironmentDepthImageViewMETA.Ptr views() {
        return new XrEnvironmentDepthImageViewMETA.Ptr(viewsRaw());
    }

    public XrEnvironmentDepthImageMETA views(@NotNull Consumer<XrEnvironmentDepthImageViewMETA.Ptr> consumer) {
        XrEnvironmentDepthImageViewMETA.Ptr ptr = views();
        consumer.accept(ptr);
        return this;
    }

    public XrEnvironmentDepthImageMETA views(XrEnvironmentDepthImageViewMETA.Ptr value) {
        MemorySegment s = viewsRaw();
        s.copyFrom(value.segment());
        return this;
    }

    public XrEnvironmentDepthImageViewMETA viewsAt(int index) {
        MemorySegment s = viewsRaw();
        return new XrEnvironmentDepthImageViewMETA(s.asSlice(index * XrEnvironmentDepthImageViewMETA.BYTES, XrEnvironmentDepthImageViewMETA.BYTES));
    }

    public void viewsAt(int index, XrEnvironmentDepthImageViewMETA value) {
        MemorySegment s = viewsRaw();
        MemorySegment.copy(value.segment(), 0, s, index * XrEnvironmentDepthImageViewMETA.BYTES, XrEnvironmentDepthImageViewMETA.BYTES);
    }

    public @NotNull MemorySegment viewsRaw() {
        return segment.asSlice(OFFSET$views, SIZE$views);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("swapchainIndex"),
        ValueLayout.JAVA_FLOAT.withName("nearZ"),
        ValueLayout.JAVA_FLOAT.withName("farZ"),
        MemoryLayout.sequenceLayout(2, XrEnvironmentDepthImageViewMETA.LAYOUT).withName("views")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$swapchainIndex = PathElement.groupElement("swapchainIndex");
    public static final PathElement PATH$nearZ = PathElement.groupElement("nearZ");
    public static final PathElement PATH$farZ = PathElement.groupElement("farZ");
    public static final PathElement PATH$views = PathElement.groupElement("views");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$swapchainIndex = (OfInt) LAYOUT.select(PATH$swapchainIndex);
    public static final OfFloat LAYOUT$nearZ = (OfFloat) LAYOUT.select(PATH$nearZ);
    public static final OfFloat LAYOUT$farZ = (OfFloat) LAYOUT.select(PATH$farZ);
    public static final SequenceLayout LAYOUT$views = (SequenceLayout) LAYOUT.select(PATH$views);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$swapchainIndex = LAYOUT$swapchainIndex.byteSize();
    public static final long SIZE$nearZ = LAYOUT$nearZ.byteSize();
    public static final long SIZE$farZ = LAYOUT$farZ.byteSize();
    public static final long SIZE$views = LAYOUT$views.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$swapchainIndex = LAYOUT.byteOffset(PATH$swapchainIndex);
    public static final long OFFSET$nearZ = LAYOUT.byteOffset(PATH$nearZ);
    public static final long OFFSET$farZ = LAYOUT.byteOffset(PATH$farZ);
    public static final long OFFSET$views = LAYOUT.byteOffset(PATH$views);
}
