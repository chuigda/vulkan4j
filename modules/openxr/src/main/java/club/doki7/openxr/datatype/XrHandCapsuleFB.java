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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHandCapsuleFB.html"><code>XrHandCapsuleFB</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrHandCapsuleFB {
///     XrVector3f[XR_HAND_TRACKING_CAPSULE_POINT_COUNT_FB] points; // @link substring="XrVector3f" target="XrVector3f" @link substring="points" target="#points"
///     float radius; // @link substring="radius" target="#radius"
///     XrHandJointEXT joint; // @link substring="XrHandJointEXT" target="XrHandJointEXT" @link substring="joint" target="#joint"
/// } XrHandCapsuleFB;
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHandCapsuleFB.html"><code>XrHandCapsuleFB</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrHandCapsuleFB(@NotNull MemorySegment segment) implements IXrHandCapsuleFB {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrHandCapsuleFB.html"><code>XrHandCapsuleFB</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrHandCapsuleFB}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrHandCapsuleFB to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrHandCapsuleFB.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrHandCapsuleFB, Iterable<XrHandCapsuleFB> {
        public long size() {
            return segment.byteSize() / XrHandCapsuleFB.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrHandCapsuleFB at(long index) {
            return new XrHandCapsuleFB(segment.asSlice(index * XrHandCapsuleFB.BYTES, XrHandCapsuleFB.BYTES));
        }

        public void write(long index, @NotNull XrHandCapsuleFB value) {
            MemorySegment s = segment.asSlice(index * XrHandCapsuleFB.BYTES, XrHandCapsuleFB.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrHandCapsuleFB.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrHandCapsuleFB.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrHandCapsuleFB.BYTES,
                (end - start) * XrHandCapsuleFB.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrHandCapsuleFB.BYTES));
        }

        public XrHandCapsuleFB[] toArray() {
            XrHandCapsuleFB[] ret = new XrHandCapsuleFB[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrHandCapsuleFB> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrHandCapsuleFB> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrHandCapsuleFB.BYTES;
            }

            @Override
            public XrHandCapsuleFB next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrHandCapsuleFB ret = new XrHandCapsuleFB(segment.asSlice(0, XrHandCapsuleFB.BYTES));
                segment = segment.asSlice(XrHandCapsuleFB.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrHandCapsuleFB allocate(Arena arena) {
        return new XrHandCapsuleFB(arena.allocate(LAYOUT));
    }

    public static XrHandCapsuleFB.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrHandCapsuleFB.Ptr(segment);
    }

    public static XrHandCapsuleFB clone(Arena arena, XrHandCapsuleFB src) {
        XrHandCapsuleFB ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public XrVector3f.Ptr points() {
        return new XrVector3f.Ptr(pointsRaw());
    }

    public XrHandCapsuleFB points(XrVector3f.Ptr value) {
        MemorySegment s = pointsRaw();
        s.copyFrom(value.segment());
        return this;
    }

    public XrVector3f pointsAt(int index) {
        MemorySegment s = pointsRaw();
        return new XrVector3f(s.asSlice(index * XrVector3f.BYTES, XrVector3f.BYTES));
    }

    public void pointsAt(int index, XrVector3f value) {
        MemorySegment s = pointsRaw();
        MemorySegment.copy(value.segment(), 0, s, index * XrVector3f.BYTES, XrVector3f.BYTES);
    }

    public @NotNull MemorySegment pointsRaw() {
        return segment.asSlice(OFFSET$points, SIZE$points);
    }

    public float radius() {
        return segment.get(LAYOUT$radius, OFFSET$radius);
    }

    public XrHandCapsuleFB radius(float value) {
        segment.set(LAYOUT$radius, OFFSET$radius, value);
        return this;
    }

    public @EnumType(XrHandJointEXT.class) int joint() {
        return segment.get(LAYOUT$joint, OFFSET$joint);
    }

    public XrHandCapsuleFB joint(@EnumType(XrHandJointEXT.class) int value) {
        segment.set(LAYOUT$joint, OFFSET$joint, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        MemoryLayout.sequenceLayout(HAND_TRACKING_CAPSULE_POINT_COUNT_FB, XrVector3f.LAYOUT).withName("points"),
        ValueLayout.JAVA_FLOAT.withName("radius"),
        ValueLayout.JAVA_INT.withName("joint")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$points = PathElement.groupElement("points");
    public static final PathElement PATH$radius = PathElement.groupElement("radius");
    public static final PathElement PATH$joint = PathElement.groupElement("joint");

    public static final SequenceLayout LAYOUT$points = (SequenceLayout) LAYOUT.select(PATH$points);
    public static final OfFloat LAYOUT$radius = (OfFloat) LAYOUT.select(PATH$radius);
    public static final OfInt LAYOUT$joint = (OfInt) LAYOUT.select(PATH$joint);

    public static final long SIZE$points = LAYOUT$points.byteSize();
    public static final long SIZE$radius = LAYOUT$radius.byteSize();
    public static final long SIZE$joint = LAYOUT$joint.byteSize();

    public static final long OFFSET$points = LAYOUT.byteOffset(PATH$points);
    public static final long OFFSET$radius = LAYOUT.byteOffset(PATH$radius);
    public static final long OFFSET$joint = LAYOUT.byteOffset(PATH$joint);
}
