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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrBodySkeletonJointFB.html"><code>XrBodySkeletonJointFB</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrBodySkeletonJointFB {
///     int32_t joint; // @link substring="joint" target="#joint"
///     int32_t parentJoint; // @link substring="parentJoint" target="#parentJoint"
///     XrPosef pose; // @link substring="XrPosef" target="XrPosef" @link substring="pose" target="#pose"
/// } XrBodySkeletonJointFB;
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrBodySkeletonJointFB.html"><code>XrBodySkeletonJointFB</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrBodySkeletonJointFB(@NotNull MemorySegment segment) implements IXrBodySkeletonJointFB {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrBodySkeletonJointFB.html"><code>XrBodySkeletonJointFB</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrBodySkeletonJointFB}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrBodySkeletonJointFB to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrBodySkeletonJointFB.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrBodySkeletonJointFB, Iterable<XrBodySkeletonJointFB> {
        public long size() {
            return segment.byteSize() / XrBodySkeletonJointFB.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrBodySkeletonJointFB at(long index) {
            return new XrBodySkeletonJointFB(segment.asSlice(index * XrBodySkeletonJointFB.BYTES, XrBodySkeletonJointFB.BYTES));
        }

        public void write(long index, @NotNull XrBodySkeletonJointFB value) {
            MemorySegment s = segment.asSlice(index * XrBodySkeletonJointFB.BYTES, XrBodySkeletonJointFB.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrBodySkeletonJointFB.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrBodySkeletonJointFB.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrBodySkeletonJointFB.BYTES,
                (end - start) * XrBodySkeletonJointFB.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrBodySkeletonJointFB.BYTES));
        }

        public XrBodySkeletonJointFB[] toArray() {
            XrBodySkeletonJointFB[] ret = new XrBodySkeletonJointFB[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrBodySkeletonJointFB> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrBodySkeletonJointFB> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrBodySkeletonJointFB.BYTES;
            }

            @Override
            public XrBodySkeletonJointFB next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrBodySkeletonJointFB ret = new XrBodySkeletonJointFB(segment.asSlice(0, XrBodySkeletonJointFB.BYTES));
                segment = segment.asSlice(XrBodySkeletonJointFB.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrBodySkeletonJointFB allocate(Arena arena) {
        return new XrBodySkeletonJointFB(arena.allocate(LAYOUT));
    }

    public static XrBodySkeletonJointFB.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrBodySkeletonJointFB.Ptr(segment);
    }

    public static XrBodySkeletonJointFB clone(Arena arena, XrBodySkeletonJointFB src) {
        XrBodySkeletonJointFB ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public int joint() {
        return segment.get(LAYOUT$joint, OFFSET$joint);
    }

    public XrBodySkeletonJointFB joint(int value) {
        segment.set(LAYOUT$joint, OFFSET$joint, value);
        return this;
    }

    public int parentJoint() {
        return segment.get(LAYOUT$parentJoint, OFFSET$parentJoint);
    }

    public XrBodySkeletonJointFB parentJoint(int value) {
        segment.set(LAYOUT$parentJoint, OFFSET$parentJoint, value);
        return this;
    }

    public @NotNull XrPosef pose() {
        return new XrPosef(segment.asSlice(OFFSET$pose, LAYOUT$pose));
    }

    public XrBodySkeletonJointFB pose(@NotNull XrPosef value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$pose, SIZE$pose);
        return this;
    }

    public XrBodySkeletonJointFB pose(Consumer<@NotNull XrPosef> consumer) {
        consumer.accept(pose());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("joint"),
        ValueLayout.JAVA_INT.withName("parentJoint"),
        XrPosef.LAYOUT.withName("pose")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$joint = PathElement.groupElement("joint");
    public static final PathElement PATH$parentJoint = PathElement.groupElement("parentJoint");
    public static final PathElement PATH$pose = PathElement.groupElement("pose");

    public static final OfInt LAYOUT$joint = (OfInt) LAYOUT.select(PATH$joint);
    public static final OfInt LAYOUT$parentJoint = (OfInt) LAYOUT.select(PATH$parentJoint);
    public static final StructLayout LAYOUT$pose = (StructLayout) LAYOUT.select(PATH$pose);

    public static final long SIZE$joint = LAYOUT$joint.byteSize();
    public static final long SIZE$parentJoint = LAYOUT$parentJoint.byteSize();
    public static final long SIZE$pose = LAYOUT$pose.byteSize();

    public static final long OFFSET$joint = LAYOUT.byteOffset(PATH$joint);
    public static final long OFFSET$parentJoint = LAYOUT.byteOffset(PATH$parentJoint);
    public static final long OFFSET$pose = LAYOUT.byteOffset(PATH$pose);
}
