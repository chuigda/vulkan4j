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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHandTrackerCreateInfoEXT.html"><code>XrHandTrackerCreateInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrHandTrackerCreateInfoEXT {
///     XrStructureType type; // @link substring="XrStructureType" target="XrStructureType" @link substring="type" target="#type"
///     void const* next; // @link substring="next" target="#next"
///     XrHandEXT hand; // @link substring="XrHandEXT" target="XrHandEXT" @link substring="hand" target="#hand"
///     XrHandJointSetEXT handJointSet; // @link substring="XrHandJointSetEXT" target="XrHandJointSetEXT" @link substring="handJointSet" target="#handJointSet"
/// } XrHandTrackerCreateInfoEXT;
/// }
///
/// ## Auto initialization
///
/// This structure has the following members that can be automatically initialized:
/// - `type = XR_TYPE_HAND_TRACKER_CREATE_INFO_EXT`
///
/// The {@code allocate} ({@link XrHandTrackerCreateInfoEXT#allocate(Arena)}, {@link XrHandTrackerCreateInfoEXT#allocate(Arena, long)})
/// functions will automatically initialize these fields. Also, you may call {@link XrHandTrackerCreateInfoEXT#autoInit}
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHandTrackerCreateInfoEXT.html"><code>XrHandTrackerCreateInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrHandTrackerCreateInfoEXT(@NotNull MemorySegment segment) implements IXrHandTrackerCreateInfoEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHandTrackerCreateInfoEXT.html"><code>XrHandTrackerCreateInfoEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrHandTrackerCreateInfoEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrHandTrackerCreateInfoEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrHandTrackerCreateInfoEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrHandTrackerCreateInfoEXT, Iterable<XrHandTrackerCreateInfoEXT> {
        public long size() {
            return segment.byteSize() / XrHandTrackerCreateInfoEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrHandTrackerCreateInfoEXT at(long index) {
            return new XrHandTrackerCreateInfoEXT(segment.asSlice(index * XrHandTrackerCreateInfoEXT.BYTES, XrHandTrackerCreateInfoEXT.BYTES));
        }

        public XrHandTrackerCreateInfoEXT.Ptr at(long index, @NotNull Consumer<@NotNull XrHandTrackerCreateInfoEXT> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrHandTrackerCreateInfoEXT value) {
            MemorySegment s = segment.asSlice(index * XrHandTrackerCreateInfoEXT.BYTES, XrHandTrackerCreateInfoEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrHandTrackerCreateInfoEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrHandTrackerCreateInfoEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrHandTrackerCreateInfoEXT.BYTES,
                (end - start) * XrHandTrackerCreateInfoEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrHandTrackerCreateInfoEXT.BYTES));
        }

        public XrHandTrackerCreateInfoEXT[] toArray() {
            XrHandTrackerCreateInfoEXT[] ret = new XrHandTrackerCreateInfoEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrHandTrackerCreateInfoEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrHandTrackerCreateInfoEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrHandTrackerCreateInfoEXT.BYTES;
            }

            @Override
            public XrHandTrackerCreateInfoEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrHandTrackerCreateInfoEXT ret = new XrHandTrackerCreateInfoEXT(segment.asSlice(0, XrHandTrackerCreateInfoEXT.BYTES));
                segment = segment.asSlice(XrHandTrackerCreateInfoEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrHandTrackerCreateInfoEXT allocate(Arena arena) {
        XrHandTrackerCreateInfoEXT ret = new XrHandTrackerCreateInfoEXT(arena.allocate(LAYOUT));
        ret.type(XrStructureType.HAND_TRACKER_CREATE_INFO_EXT);
        return ret;
    }

    public static XrHandTrackerCreateInfoEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        XrHandTrackerCreateInfoEXT.Ptr ret = new XrHandTrackerCreateInfoEXT.Ptr(segment);
        for (long i = 0; i < count; i++) {
            ret.at(i).type(XrStructureType.HAND_TRACKER_CREATE_INFO_EXT);
        }
        return ret;
    }

    public static XrHandTrackerCreateInfoEXT clone(Arena arena, XrHandTrackerCreateInfoEXT src) {
        XrHandTrackerCreateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public void autoInit() {
        type(XrStructureType.HAND_TRACKER_CREATE_INFO_EXT);
    }

    public @EnumType(XrStructureType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public XrHandTrackerCreateInfoEXT type(@EnumType(XrStructureType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment next() {
        return segment.get(LAYOUT$next, OFFSET$next);
    }

    public XrHandTrackerCreateInfoEXT next(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$next, OFFSET$next, value);
        return this;
    }

    public XrHandTrackerCreateInfoEXT next(@Nullable IPointer pointer) {
        next(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @EnumType(XrHandEXT.class) int hand() {
        return segment.get(LAYOUT$hand, OFFSET$hand);
    }

    public XrHandTrackerCreateInfoEXT hand(@EnumType(XrHandEXT.class) int value) {
        segment.set(LAYOUT$hand, OFFSET$hand, value);
        return this;
    }

    public @EnumType(XrHandJointSetEXT.class) int handJointSet() {
        return segment.get(LAYOUT$handJointSet, OFFSET$handJointSet);
    }

    public XrHandTrackerCreateInfoEXT handJointSet(@EnumType(XrHandJointSetEXT.class) int value) {
        segment.set(LAYOUT$handJointSet, OFFSET$handJointSet, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("type"),
        ValueLayout.ADDRESS.withName("next"),
        ValueLayout.JAVA_INT.withName("hand"),
        ValueLayout.JAVA_INT.withName("handJointSet")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$type = PathElement.groupElement("type");
    public static final PathElement PATH$next = PathElement.groupElement("next");
    public static final PathElement PATH$hand = PathElement.groupElement("hand");
    public static final PathElement PATH$handJointSet = PathElement.groupElement("handJointSet");

    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);
    public static final AddressLayout LAYOUT$next = (AddressLayout) LAYOUT.select(PATH$next);
    public static final OfInt LAYOUT$hand = (OfInt) LAYOUT.select(PATH$hand);
    public static final OfInt LAYOUT$handJointSet = (OfInt) LAYOUT.select(PATH$handJointSet);

    public static final long SIZE$type = LAYOUT$type.byteSize();
    public static final long SIZE$next = LAYOUT$next.byteSize();
    public static final long SIZE$hand = LAYOUT$hand.byteSize();
    public static final long SIZE$handJointSet = LAYOUT$handJointSet.byteSize();

    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
    public static final long OFFSET$next = LAYOUT.byteOffset(PATH$next);
    public static final long OFFSET$hand = LAYOUT.byteOffset(PATH$hand);
    public static final long OFFSET$handJointSet = LAYOUT.byteOffset(PATH$handJointSet);
}
