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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrCompositionLayerProjection.html"><code>XrCompositionLayerProjection</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrCompositionLayerProjection {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrCompositionLayerFlags layerFlags; // optional // @link substring="XrCompositionLayerFlags" target="XrCompositionLayerFlags" @link substring="layerFlags" target="#layerFlags"
///     XrSpace space; // @link substring="XrSpace" target="XrSpace" @link substring="space" target="#space"
///     uint32_t viewCount; // @link substring="viewCount" target="#viewCount"
///     XrCompositionLayerProjectionView const* views; // @link substring="XrCompositionLayerProjectionView" target="XrCompositionLayerProjectionView" @link substring="views" target="#views"
/// } XrCompositionLayerProjection;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_COMPOSITION_LAYER_PROJECTION`
///
/// The {@code allocate} ({@link XrCompositionLayerProjection#allocate(Arena)}, {@link XrCompositionLayerProjection#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrCompositionLayerProjection#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrCompositionLayerProjection.html"><code>XrCompositionLayerProjection</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrCompositionLayerProjection(@NotNull MemorySegment segment) implements IXrCompositionLayerProjection {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrCompositionLayerProjection.html"><code>XrCompositionLayerProjection</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrCompositionLayerProjection}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrCompositionLayerProjection to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrCompositionLayerProjection.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrCompositionLayerProjection, Iterable<XrCompositionLayerProjection> {
        public long size() {
            return segment.byteSize() / XrCompositionLayerProjection.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrCompositionLayerProjection at(long index) {
            return new XrCompositionLayerProjection(segment.asSlice(index * XrCompositionLayerProjection.BYTES, XrCompositionLayerProjection.BYTES));
        }

        public void write(long index, @NotNull XrCompositionLayerProjection value) {
            MemorySegment s = segment.asSlice(index * XrCompositionLayerProjection.BYTES, XrCompositionLayerProjection.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrCompositionLayerProjection.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrCompositionLayerProjection.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrCompositionLayerProjection.BYTES,
                (end - start) * XrCompositionLayerProjection.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrCompositionLayerProjection.BYTES));
        }

        public XrCompositionLayerProjection[] toArray() {
            XrCompositionLayerProjection[] ret = new XrCompositionLayerProjection[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrCompositionLayerProjection> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrCompositionLayerProjection> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrCompositionLayerProjection.BYTES;
            }

            @Override
            public XrCompositionLayerProjection next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrCompositionLayerProjection ret = new XrCompositionLayerProjection(segment.asSlice(0, XrCompositionLayerProjection.BYTES));
                segment = segment.asSlice(XrCompositionLayerProjection.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrCompositionLayerProjection allocate(Arena arena) {
        XrCompositionLayerProjection ret = new XrCompositionLayerProjection(arena.allocate(LAYOUT));
        ret.type(XrStructureType.COMPOSITION_LAYER_PROJECTION);
        return ret;
    }

    public static XrCompositionLayerProjection.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrCompositionLayerProjection.Ptr ret = new XrCompositionLayerProjection.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.COMPOSITION_LAYER_PROJECTION);
        }
        return ret;
    }

    public static XrCompositionLayerProjection clone(Arena arena, XrCompositionLayerProjection src) {
        XrCompositionLayerProjection ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.COMPOSITION_LAYER_PROJECTION);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrCompositionLayerProjection type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrCompositionLayerProjection next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrCompositionLayerProjection next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Bitmask(XrCompositionLayerFlags.class) long layerFlags() {
        return segment.get(LAYOUT$layerFlags, OFFSET$layerFlags);
    }

    public XrCompositionLayerProjection layerFlags(@Bitmask(XrCompositionLayerFlags.class) long value) {
        segment.set(LAYOUT$layerFlags, OFFSET$layerFlags, value);
        return this;
    }

    public @Nullable XrSpace space() {
        MemorySegment s = segment.asSlice(OFFSET$space, SIZE$space);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrSpace(s);
    }

    public XrCompositionLayerProjection space(@Nullable XrSpace value) {
        segment.set(LAYOUT$space, OFFSET$space, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int viewCount() {
        return segment.get(LAYOUT$viewCount, OFFSET$viewCount);
    }

    public XrCompositionLayerProjection viewCount(@Unsigned int value) {
        segment.set(LAYOUT$viewCount, OFFSET$viewCount, value);
        return this;
    }

    public XrCompositionLayerProjection views(@Nullable IXrCompositionLayerProjectionView value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        viewsRaw(s);
        return this;
    }

    @Unsafe public @Nullable XrCompositionLayerProjectionView.Ptr views(int assumedCount) {
        MemorySegment s = viewsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * XrCompositionLayerProjectionView.BYTES);
        return new XrCompositionLayerProjectionView.Ptr(s);
    }

    public @Nullable XrCompositionLayerProjectionView views() {
        MemorySegment s = viewsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrCompositionLayerProjectionView(s);
    }

    public @Pointer(target=XrCompositionLayerProjectionView.class) @NotNull MemorySegment viewsRaw() {
        return segment.get(LAYOUT$views, OFFSET$views);
    }

    public void viewsRaw(@Pointer(target=XrCompositionLayerProjectionView.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$views, OFFSET$views, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_LONG.withName("layerFlags"),
        ValueLayout.ADDRESS.withName("space"),
        ValueLayout.JAVA_INT.withName("viewCount"),
        ValueLayout.ADDRESS.withTargetLayout(XrCompositionLayerProjectionView.LAYOUT).withName("views")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$layerFlags = PathElement.groupElement("layerFlags");
    public static final PathElement PATH$space = PathElement.groupElement("space");
    public static final PathElement PATH$viewCount = PathElement.groupElement("viewCount");
    public static final PathElement PATH$views = PathElement.groupElement("views");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfLong LAYOUT$layerFlags = (OfLong) LAYOUT.select(PATH$layerFlags);
    public static final AddressLayout LAYOUT$space = (AddressLayout) LAYOUT.select(PATH$space);
    public static final OfInt LAYOUT$viewCount = (OfInt) LAYOUT.select(PATH$viewCount);
    public static final AddressLayout LAYOUT$views = (AddressLayout) LAYOUT.select(PATH$views);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$layerFlags = LAYOUT$layerFlags.byteSize();
    public static final long SIZE$space = LAYOUT$space.byteSize();
    public static final long SIZE$viewCount = LAYOUT$viewCount.byteSize();
    public static final long SIZE$views = LAYOUT$views.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$layerFlags = LAYOUT.byteOffset(PATH$layerFlags);
    public static final long OFFSET$space = LAYOUT.byteOffset(PATH$space);
    public static final long OFFSET$viewCount = LAYOUT.byteOffset(PATH$viewCount);
    public static final long OFFSET$views = LAYOUT.byteOffset(PATH$views);
}
