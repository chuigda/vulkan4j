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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialAnchorCreateInfoMSFT.html"><code>XrSpatialAnchorCreateInfoMSFT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSpatialAnchorCreateInfoMSFT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrSpace space; // @link substring="XrSpace" target="XrSpace" @link substring="space" target="#space"
///     XrPosef pose; // @link substring="XrPosef" target="XrPosef" @link substring="pose" target="#pose"
///     XrTime time; // @link substring="time" target="#time"
/// } XrSpatialAnchorCreateInfoMSFT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_SPATIAL_ANCHOR_CREATE_INFO_MSFT`
///
/// The {@code allocate} ({@link XrSpatialAnchorCreateInfoMSFT#allocate(Arena)}, {@link XrSpatialAnchorCreateInfoMSFT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrSpatialAnchorCreateInfoMSFT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialAnchorCreateInfoMSFT.html"><code>XrSpatialAnchorCreateInfoMSFT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSpatialAnchorCreateInfoMSFT(@NotNull MemorySegment segment) implements IXrSpatialAnchorCreateInfoMSFT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialAnchorCreateInfoMSFT.html"><code>XrSpatialAnchorCreateInfoMSFT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSpatialAnchorCreateInfoMSFT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSpatialAnchorCreateInfoMSFT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSpatialAnchorCreateInfoMSFT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSpatialAnchorCreateInfoMSFT, Iterable<XrSpatialAnchorCreateInfoMSFT> {
        public long size() {
            return segment.byteSize() / XrSpatialAnchorCreateInfoMSFT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSpatialAnchorCreateInfoMSFT at(long index) {
            return new XrSpatialAnchorCreateInfoMSFT(segment.asSlice(index * XrSpatialAnchorCreateInfoMSFT.BYTES, XrSpatialAnchorCreateInfoMSFT.BYTES));
        }

        public XrSpatialAnchorCreateInfoMSFT.Ptr at(long index, @NotNull Consumer<@NotNull XrSpatialAnchorCreateInfoMSFT> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrSpatialAnchorCreateInfoMSFT value) {
            MemorySegment s = segment.asSlice(index * XrSpatialAnchorCreateInfoMSFT.BYTES, XrSpatialAnchorCreateInfoMSFT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSpatialAnchorCreateInfoMSFT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSpatialAnchorCreateInfoMSFT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSpatialAnchorCreateInfoMSFT.BYTES,
                (end - start) * XrSpatialAnchorCreateInfoMSFT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSpatialAnchorCreateInfoMSFT.BYTES));
        }

        public XrSpatialAnchorCreateInfoMSFT[] toArray() {
            XrSpatialAnchorCreateInfoMSFT[] ret = new XrSpatialAnchorCreateInfoMSFT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSpatialAnchorCreateInfoMSFT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSpatialAnchorCreateInfoMSFT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSpatialAnchorCreateInfoMSFT.BYTES;
            }

            @Override
            public XrSpatialAnchorCreateInfoMSFT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSpatialAnchorCreateInfoMSFT ret = new XrSpatialAnchorCreateInfoMSFT(segment.asSlice(0, XrSpatialAnchorCreateInfoMSFT.BYTES));
                segment = segment.asSlice(XrSpatialAnchorCreateInfoMSFT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSpatialAnchorCreateInfoMSFT allocate(Arena arena) {
        XrSpatialAnchorCreateInfoMSFT ret = new XrSpatialAnchorCreateInfoMSFT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.SPATIAL_ANCHOR_CREATE_INFO_MSFT);
        return ret;
    }

    public static XrSpatialAnchorCreateInfoMSFT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrSpatialAnchorCreateInfoMSFT.Ptr ret = new XrSpatialAnchorCreateInfoMSFT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.SPATIAL_ANCHOR_CREATE_INFO_MSFT);
        }
        return ret;
    }

    public static XrSpatialAnchorCreateInfoMSFT clone(Arena arena, XrSpatialAnchorCreateInfoMSFT src) {
        XrSpatialAnchorCreateInfoMSFT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.SPATIAL_ANCHOR_CREATE_INFO_MSFT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrSpatialAnchorCreateInfoMSFT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrSpatialAnchorCreateInfoMSFT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrSpatialAnchorCreateInfoMSFT next(@Nullable IPointer pointer) {
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

    public XrSpatialAnchorCreateInfoMSFT space(@Nullable XrSpace value) {
        segment.set(LAYOUT$space, OFFSET$space, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @NotNull XrPosef pose() {
        return new XrPosef(segment.asSlice(OFFSET$pose, LAYOUT$pose));
    }

    public XrSpatialAnchorCreateInfoMSFT pose(@NotNull XrPosef value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$pose, SIZE$pose);
        return this;
    }

    public XrSpatialAnchorCreateInfoMSFT pose(Consumer<@NotNull XrPosef> consumer) {
        consumer.accept(pose());
        return this;
    }

    public @NativeType("XrTime") long time() {
        return segment.get(LAYOUT$time, OFFSET$time);
    }

    public XrSpatialAnchorCreateInfoMSFT time(@NativeType("XrTime") long value) {
        segment.set(LAYOUT$time, OFFSET$time, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.ADDRESS.withName("space"),
        XrPosef.LAYOUT.withName("pose"),
        ValueLayout.JAVA_LONG.withName("time")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$space = PathElement.groupElement("space");
    public static final PathElement PATH$pose = PathElement.groupElement("pose");
    public static final PathElement PATH$time = PathElement.groupElement("time");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final AddressLayout LAYOUT$space = (AddressLayout) LAYOUT.select(PATH$space);
    public static final StructLayout LAYOUT$pose = (StructLayout) LAYOUT.select(PATH$pose);
    public static final OfLong LAYOUT$time = (OfLong) LAYOUT.select(PATH$time);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$space = LAYOUT$space.byteSize();
    public static final long SIZE$pose = LAYOUT$pose.byteSize();
    public static final long SIZE$time = LAYOUT$time.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$space = LAYOUT.byteOffset(PATH$space);
    public static final long OFFSET$pose = LAYOUT.byteOffset(PATH$pose);
    public static final long OFFSET$time = LAYOUT.byteOffset(PATH$time);
}
