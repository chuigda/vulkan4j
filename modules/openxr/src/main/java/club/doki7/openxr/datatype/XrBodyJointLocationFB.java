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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrBodyJointLocationFB.html"><code>XrBodyJointLocationFB</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrBodyJointLocationFB {
///     XrSpaceLocationFlags locationFlags; // @link substring="XrSpaceLocationFlags" target="XrSpaceLocationFlags" @link substring="locationFlags" target="#locationFlags"
///     XrPosef pose; // @link substring="XrPosef" target="XrPosef" @link substring="pose" target="#pose"
/// } XrBodyJointLocationFB;
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrBodyJointLocationFB.html"><code>XrBodyJointLocationFB</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrBodyJointLocationFB(@NotNull MemorySegment segment) implements IXrBodyJointLocationFB {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrBodyJointLocationFB.html"><code>XrBodyJointLocationFB</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrBodyJointLocationFB}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrBodyJointLocationFB to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrBodyJointLocationFB.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrBodyJointLocationFB, Iterable<XrBodyJointLocationFB> {
        public long size() {
            return segment.byteSize() / XrBodyJointLocationFB.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrBodyJointLocationFB at(long index) {
            return new XrBodyJointLocationFB(segment.asSlice(index * XrBodyJointLocationFB.BYTES, XrBodyJointLocationFB.BYTES));
        }

        public void at(long index, @NotNull Consumer<@NotNull XrBodyJointLocationFB> consumer) {
            consumer.accept(at(index));
        }

        public void write(long index, @NotNull XrBodyJointLocationFB value) {
            MemorySegment s = segment.asSlice(index * XrBodyJointLocationFB.BYTES, XrBodyJointLocationFB.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrBodyJointLocationFB.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrBodyJointLocationFB.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrBodyJointLocationFB.BYTES,
                (end - start) * XrBodyJointLocationFB.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrBodyJointLocationFB.BYTES));
        }

        public XrBodyJointLocationFB[] toArray() {
            XrBodyJointLocationFB[] ret = new XrBodyJointLocationFB[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrBodyJointLocationFB> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrBodyJointLocationFB> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrBodyJointLocationFB.BYTES;
            }

            @Override
            public XrBodyJointLocationFB next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrBodyJointLocationFB ret = new XrBodyJointLocationFB(segment.asSlice(0, XrBodyJointLocationFB.BYTES));
                segment = segment.asSlice(XrBodyJointLocationFB.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrBodyJointLocationFB allocate(Arena arena) {
        return new XrBodyJointLocationFB(arena.allocate(LAYOUT));
    }

    public static XrBodyJointLocationFB.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrBodyJointLocationFB.Ptr(segment);
    }

    public static XrBodyJointLocationFB clone(Arena arena, XrBodyJointLocationFB src) {
        XrBodyJointLocationFB ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Bitmask(XrSpaceLocationFlags.class) long locationFlags() {
        return segment.get(LAYOUT$locationFlags, OFFSET$locationFlags);
    }

    public XrBodyJointLocationFB locationFlags(@Bitmask(XrSpaceLocationFlags.class) long value) {
        segment.set(LAYOUT$locationFlags, OFFSET$locationFlags, value);
        return this;
    }

    public @NotNull XrPosef pose() {
        return new XrPosef(segment.asSlice(OFFSET$pose, LAYOUT$pose));
    }

    public XrBodyJointLocationFB pose(@NotNull XrPosef value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$pose, SIZE$pose);
        return this;
    }

    public XrBodyJointLocationFB pose(Consumer<@NotNull XrPosef> consumer) {
        consumer.accept(pose());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("locationFlags"),
        XrPosef.LAYOUT.withName("pose")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$locationFlags = PathElement.groupElement("locationFlags");
    public static final PathElement PATH$pose = PathElement.groupElement("pose");

    public static final OfLong LAYOUT$locationFlags = (OfLong) LAYOUT.select(PATH$locationFlags);
    public static final StructLayout LAYOUT$pose = (StructLayout) LAYOUT.select(PATH$pose);

    public static final long SIZE$locationFlags = LAYOUT$locationFlags.byteSize();
    public static final long SIZE$pose = LAYOUT$pose.byteSize();

    public static final long OFFSET$locationFlags = LAYOUT.byteOffset(PATH$locationFlags);
    public static final long OFFSET$pose = LAYOUT.byteOffset(PATH$pose);
}
