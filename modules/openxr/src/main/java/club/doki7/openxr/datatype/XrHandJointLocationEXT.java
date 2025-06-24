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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHandJointLocationEXT.html"><code>XrHandJointLocationEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrHandJointLocationEXT {
///     XrSpaceLocationFlags locationFlags; // optional // @link substring="XrSpaceLocationFlags" target="XrSpaceLocationFlags" @link substring="locationFlags" target="#locationFlags"
///     XrPosef pose; // @link substring="XrPosef" target="XrPosef" @link substring="pose" target="#pose"
///     float radius; // @link substring="radius" target="#radius"
/// } XrHandJointLocationEXT;
/// }
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHandJointLocationEXT.html"><code>XrHandJointLocationEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrHandJointLocationEXT(@NotNull MemorySegment segment) implements IXrHandJointLocationEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHandJointLocationEXT.html"><code>XrHandJointLocationEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrHandJointLocationEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrHandJointLocationEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrHandJointLocationEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrHandJointLocationEXT, Iterable<XrHandJointLocationEXT> {
        public long size() {
            return segment.byteSize() / XrHandJointLocationEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrHandJointLocationEXT at(long index) {
            return new XrHandJointLocationEXT(segment.asSlice(index * XrHandJointLocationEXT.BYTES, XrHandJointLocationEXT.BYTES));
        }

        public void write(long index, @NotNull XrHandJointLocationEXT value) {
            MemorySegment s = segment.asSlice(index * XrHandJointLocationEXT.BYTES, XrHandJointLocationEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrHandJointLocationEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrHandJointLocationEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrHandJointLocationEXT.BYTES,
                (end - start) * XrHandJointLocationEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrHandJointLocationEXT.BYTES));
        }

        public XrHandJointLocationEXT[] toArray() {
            XrHandJointLocationEXT[] ret = new XrHandJointLocationEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrHandJointLocationEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrHandJointLocationEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrHandJointLocationEXT.BYTES;
            }

            @Override
            public XrHandJointLocationEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrHandJointLocationEXT ret = new XrHandJointLocationEXT(segment.asSlice(0, XrHandJointLocationEXT.BYTES));
                segment = segment.asSlice(XrHandJointLocationEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrHandJointLocationEXT allocate(Arena arena) {
        return new XrHandJointLocationEXT(arena.allocate(LAYOUT));
    }

    public static XrHandJointLocationEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrHandJointLocationEXT.Ptr(segment);
    }

    public static XrHandJointLocationEXT clone(Arena arena, XrHandJointLocationEXT src) {
        XrHandJointLocationEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Bitmask(XrSpaceLocationFlags.class) int locationFlags() {
        return segment.get(LAYOUT$locationFlags, OFFSET$locationFlags);
    }

    public XrHandJointLocationEXT locationFlags(@Bitmask(XrSpaceLocationFlags.class) int value) {
        segment.set(LAYOUT$locationFlags, OFFSET$locationFlags, value);
        return this;
    }

    public @NotNull XrPosef pose() {
        return new XrPosef(segment.asSlice(OFFSET$pose, LAYOUT$pose));
    }

    public XrHandJointLocationEXT pose(@NotNull XrPosef value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$pose, SIZE$pose);
        return this;
    }

    public XrHandJointLocationEXT pose(Consumer<@NotNull XrPosef> consumer) {
        consumer.accept(pose());
        return this;
    }

    public float radius() {
        return segment.get(LAYOUT$radius, OFFSET$radius);
    }

    public XrHandJointLocationEXT radius(float value) {
        segment.set(LAYOUT$radius, OFFSET$radius, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("locationFlags"),
        XrPosef.LAYOUT.withName("pose"),
        ValueLayout.JAVA_FLOAT.withName("radius")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$locationFlags = PathElement.groupElement("locationFlags");
    public static final PathElement PATH$pose = PathElement.groupElement("pose");
    public static final PathElement PATH$radius = PathElement.groupElement("radius");

    public static final OfInt LAYOUT$locationFlags = (OfInt) LAYOUT.select(PATH$locationFlags);
    public static final StructLayout LAYOUT$pose = (StructLayout) LAYOUT.select(PATH$pose);
    public static final OfFloat LAYOUT$radius = (OfFloat) LAYOUT.select(PATH$radius);

    public static final long SIZE$locationFlags = LAYOUT$locationFlags.byteSize();
    public static final long SIZE$pose = LAYOUT$pose.byteSize();
    public static final long SIZE$radius = LAYOUT$radius.byteSize();

    public static final long OFFSET$locationFlags = LAYOUT.byteOffset(PATH$locationFlags);
    public static final long OFFSET$pose = LAYOUT.byteOffset(PATH$pose);
    public static final long OFFSET$radius = LAYOUT.byteOffset(PATH$radius);
}
