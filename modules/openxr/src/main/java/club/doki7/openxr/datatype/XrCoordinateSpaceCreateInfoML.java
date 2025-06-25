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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrCoordinateSpaceCreateInfoML.html"><code>XrCoordinateSpaceCreateInfoML</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrCoordinateSpaceCreateInfoML {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     MLCoordinateFrameUID cfuid; // @link substring="MLCoordinateFrameUID" target="MLCoordinateFrameUID" @link substring="cfuid" target="#cfuid"
///     XrPosef poseInCoordinateSpace; // @link substring="XrPosef" target="XrPosef" @link substring="poseInCoordinateSpace" target="#poseInCoordinateSpace"
/// } XrCoordinateSpaceCreateInfoML;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_COORDINATE_SPACE_CREATE_INFO_ML`
///
/// The {@code allocate} ({@link XrCoordinateSpaceCreateInfoML#allocate(Arena)}, {@link XrCoordinateSpaceCreateInfoML#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrCoordinateSpaceCreateInfoML#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrCoordinateSpaceCreateInfoML.html"><code>XrCoordinateSpaceCreateInfoML</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrCoordinateSpaceCreateInfoML(@NotNull MemorySegment segment) implements IXrCoordinateSpaceCreateInfoML {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrCoordinateSpaceCreateInfoML.html"><code>XrCoordinateSpaceCreateInfoML</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrCoordinateSpaceCreateInfoML}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrCoordinateSpaceCreateInfoML to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrCoordinateSpaceCreateInfoML.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrCoordinateSpaceCreateInfoML, Iterable<XrCoordinateSpaceCreateInfoML> {
        public long size() {
            return segment.byteSize() / XrCoordinateSpaceCreateInfoML.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrCoordinateSpaceCreateInfoML at(long index) {
            return new XrCoordinateSpaceCreateInfoML(segment.asSlice(index * XrCoordinateSpaceCreateInfoML.BYTES, XrCoordinateSpaceCreateInfoML.BYTES));
        }

        public void write(long index, @NotNull XrCoordinateSpaceCreateInfoML value) {
            MemorySegment s = segment.asSlice(index * XrCoordinateSpaceCreateInfoML.BYTES, XrCoordinateSpaceCreateInfoML.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrCoordinateSpaceCreateInfoML.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrCoordinateSpaceCreateInfoML.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrCoordinateSpaceCreateInfoML.BYTES,
                (end - start) * XrCoordinateSpaceCreateInfoML.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrCoordinateSpaceCreateInfoML.BYTES));
        }

        public XrCoordinateSpaceCreateInfoML[] toArray() {
            XrCoordinateSpaceCreateInfoML[] ret = new XrCoordinateSpaceCreateInfoML[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrCoordinateSpaceCreateInfoML> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrCoordinateSpaceCreateInfoML> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrCoordinateSpaceCreateInfoML.BYTES;
            }

            @Override
            public XrCoordinateSpaceCreateInfoML next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrCoordinateSpaceCreateInfoML ret = new XrCoordinateSpaceCreateInfoML(segment.asSlice(0, XrCoordinateSpaceCreateInfoML.BYTES));
                segment = segment.asSlice(XrCoordinateSpaceCreateInfoML.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrCoordinateSpaceCreateInfoML allocate(Arena arena) {
        XrCoordinateSpaceCreateInfoML ret = new XrCoordinateSpaceCreateInfoML(arena.allocate(LAYOUT));
        ret.type(XrStructureType.COORDINATE_SPACE_CREATE_INFO_ML);
        return ret;
    }

    public static XrCoordinateSpaceCreateInfoML.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrCoordinateSpaceCreateInfoML.Ptr ret = new XrCoordinateSpaceCreateInfoML.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.COORDINATE_SPACE_CREATE_INFO_ML);
        }
        return ret;
    }

    public static XrCoordinateSpaceCreateInfoML clone(Arena arena, XrCoordinateSpaceCreateInfoML src) {
        XrCoordinateSpaceCreateInfoML ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.COORDINATE_SPACE_CREATE_INFO_ML);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrCoordinateSpaceCreateInfoML type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrCoordinateSpaceCreateInfoML next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrCoordinateSpaceCreateInfoML next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @NotNull MLCoordinateFrameUID cfuid() {
        return new MLCoordinateFrameUID(segment.asSlice(OFFSET$cfuid, LAYOUT$cfuid));
    }

    public XrCoordinateSpaceCreateInfoML cfuid(@NotNull MLCoordinateFrameUID value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$cfuid, SIZE$cfuid);
        return this;
    }

    public XrCoordinateSpaceCreateInfoML cfuid(Consumer<@NotNull MLCoordinateFrameUID> consumer) {
        consumer.accept(cfuid());
        return this;
    }

    public @NotNull XrPosef poseInCoordinateSpace() {
        return new XrPosef(segment.asSlice(OFFSET$poseInCoordinateSpace, LAYOUT$poseInCoordinateSpace));
    }

    public XrCoordinateSpaceCreateInfoML poseInCoordinateSpace(@NotNull XrPosef value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$poseInCoordinateSpace, SIZE$poseInCoordinateSpace);
        return this;
    }

    public XrCoordinateSpaceCreateInfoML poseInCoordinateSpace(Consumer<@NotNull XrPosef> consumer) {
        consumer.accept(poseInCoordinateSpace());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        MLCoordinateFrameUID.LAYOUT.withName("cfuid"),
        XrPosef.LAYOUT.withName("poseInCoordinateSpace")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$cfuid = PathElement.groupElement("cfuid");
    public static final PathElement PATH$poseInCoordinateSpace = PathElement.groupElement("poseInCoordinateSpace");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final StructLayout LAYOUT$cfuid = (StructLayout) LAYOUT.select(PATH$cfuid);
    public static final StructLayout LAYOUT$poseInCoordinateSpace = (StructLayout) LAYOUT.select(PATH$poseInCoordinateSpace);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$cfuid = LAYOUT$cfuid.byteSize();
    public static final long SIZE$poseInCoordinateSpace = LAYOUT$poseInCoordinateSpace.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$cfuid = LAYOUT.byteOffset(PATH$cfuid);
    public static final long OFFSET$poseInCoordinateSpace = LAYOUT.byteOffset(PATH$poseInCoordinateSpace);
}
