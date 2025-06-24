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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialAnchorCreateInfoHTC.html"><code>XrSpatialAnchorCreateInfoHTC</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSpatialAnchorCreateInfoHTC {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrSpace space; // @link substring="XrSpace" target="XrSpace" @link substring="space" target="#space"
///     XrPosef poseInSpace; // @link substring="XrPosef" target="XrPosef" @link substring="poseInSpace" target="#poseInSpace"
///     XrSpatialAnchorNameHTC name; // @link substring="XrSpatialAnchorNameHTC" target="XrSpatialAnchorNameHTC" @link substring="name" target="#name"
/// } XrSpatialAnchorCreateInfoHTC;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SPATIAL_ANCHOR_CREATE_INFO_HTC`
///
/// The {@code allocate} ({@link XrSpatialAnchorCreateInfoHTC#allocate(Arena)}, {@link XrSpatialAnchorCreateInfoHTC#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSpatialAnchorCreateInfoHTC#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialAnchorCreateInfoHTC.html"><code>XrSpatialAnchorCreateInfoHTC</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSpatialAnchorCreateInfoHTC(@NotNull MemorySegment segment) implements IXrSpatialAnchorCreateInfoHTC {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialAnchorCreateInfoHTC.html"><code>XrSpatialAnchorCreateInfoHTC</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSpatialAnchorCreateInfoHTC}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSpatialAnchorCreateInfoHTC to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSpatialAnchorCreateInfoHTC.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSpatialAnchorCreateInfoHTC, Iterable<XrSpatialAnchorCreateInfoHTC> {
        public long size() {
            return segment.byteSize() / XrSpatialAnchorCreateInfoHTC.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSpatialAnchorCreateInfoHTC at(long index) {
            return new XrSpatialAnchorCreateInfoHTC(segment.asSlice(index * XrSpatialAnchorCreateInfoHTC.BYTES, XrSpatialAnchorCreateInfoHTC.BYTES));
        }

        public void write(long index, @NotNull XrSpatialAnchorCreateInfoHTC value) {
            MemorySegment s = segment.asSlice(index * XrSpatialAnchorCreateInfoHTC.BYTES, XrSpatialAnchorCreateInfoHTC.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSpatialAnchorCreateInfoHTC.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSpatialAnchorCreateInfoHTC.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSpatialAnchorCreateInfoHTC.BYTES,
                (end - start) * XrSpatialAnchorCreateInfoHTC.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSpatialAnchorCreateInfoHTC.BYTES));
        }

        public XrSpatialAnchorCreateInfoHTC[] toArray() {
            XrSpatialAnchorCreateInfoHTC[] ret = new XrSpatialAnchorCreateInfoHTC[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSpatialAnchorCreateInfoHTC> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSpatialAnchorCreateInfoHTC> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSpatialAnchorCreateInfoHTC.BYTES;
            }

            @Override
            public XrSpatialAnchorCreateInfoHTC next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSpatialAnchorCreateInfoHTC ret = new XrSpatialAnchorCreateInfoHTC(segment.asSlice(0, XrSpatialAnchorCreateInfoHTC.BYTES));
                segment = segment.asSlice(XrSpatialAnchorCreateInfoHTC.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSpatialAnchorCreateInfoHTC allocate(Arena arena) {
        XrSpatialAnchorCreateInfoHTC ret = new XrSpatialAnchorCreateInfoHTC(arena.allocate(LAYOUT));
        ret.type(XrStructureType.XR_TYPE_SPATIAL_ANCHOR_CREATE_INFO_HTC);
        return ret;
    }

    public static XrSpatialAnchorCreateInfoHTC.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSpatialAnchorCreateInfoHTC.Ptr ret = new XrSpatialAnchorCreateInfoHTC.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.XR_TYPE_SPATIAL_ANCHOR_CREATE_INFO_HTC);
        }
        return ret;
    }

    public static XrSpatialAnchorCreateInfoHTC clone(Arena arena, XrSpatialAnchorCreateInfoHTC src) {
        XrSpatialAnchorCreateInfoHTC ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.XR_TYPE_SPATIAL_ANCHOR_CREATE_INFO_HTC);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSpatialAnchorCreateInfoHTC type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSpatialAnchorCreateInfoHTC next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSpatialAnchorCreateInfoHTC next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Nullable XrSpace space() {
        MemorySegment s = segment.asSlice(OFFSET$space, SIZE$space);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new XrSpace(s);
    }

    public XrSpatialAnchorCreateInfoHTC space(@Nullable XrSpace value) {
        segment.set(LAYOUT$space, OFFSET$space, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @NotNull XrPosef poseInSpace() {
        return new XrPosef(segment.asSlice(OFFSET$poseInSpace, LAYOUT$poseInSpace));
    }

    public XrSpatialAnchorCreateInfoHTC poseInSpace(@NotNull XrPosef value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$poseInSpace, SIZE$poseInSpace);
        return this;
    }

    public XrSpatialAnchorCreateInfoHTC poseInSpace(Consumer<@NotNull XrPosef> consumer) {
        consumer.accept(poseInSpace());
        return this;
    }

    public @NotNull XrSpatialAnchorNameHTC name() {
        return new XrSpatialAnchorNameHTC(segment.asSlice(OFFSET$name, LAYOUT$name));
    }

    public XrSpatialAnchorCreateInfoHTC name(@NotNull XrSpatialAnchorNameHTC value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$name, SIZE$name);
        return this;
    }

    public XrSpatialAnchorCreateInfoHTC name(Consumer<@NotNull XrSpatialAnchorNameHTC> consumer) {
        consumer.accept(name());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.ADDRESS.withName("space"),
        XrPosef.LAYOUT.withName("poseInSpace"),
        XrSpatialAnchorNameHTC.LAYOUT.withName("name")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$space = PathElement.groupElement("space");
    public static final PathElement PATH$poseInSpace = PathElement.groupElement("poseInSpace");
    public static final PathElement PATH$name = PathElement.groupElement("name");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final AddressLayout LAYOUT$space = (AddressLayout) LAYOUT.select(PATH$space);
    public static final StructLayout LAYOUT$poseInSpace = (StructLayout) LAYOUT.select(PATH$poseInSpace);
    public static final StructLayout LAYOUT$name = (StructLayout) LAYOUT.select(PATH$name);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$space = LAYOUT$space.byteSize();
    public static final long SIZE$poseInSpace = LAYOUT$poseInSpace.byteSize();
    public static final long SIZE$name = LAYOUT$name.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$space = LAYOUT.byteOffset(PATH$space);
    public static final long OFFSET$poseInSpace = LAYOUT.byteOffset(PATH$poseInSpace);
    public static final long OFFSET$name = LAYOUT.byteOffset(PATH$name);
}
