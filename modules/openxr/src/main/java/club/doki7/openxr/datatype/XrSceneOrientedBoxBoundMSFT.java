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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneOrientedBoxBoundMSFT.html"><code>XrSceneOrientedBoxBoundMSFT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSceneOrientedBoxBoundMSFT {
///     XrPosef pose; // @link substring="XrPosef" target="XrPosef" @link substring="pose" target="#pose"
///     XrVector3f extents; // @link substring="XrVector3f" target="XrVector3f" @link substring="extents" target="#extents"
/// } XrSceneOrientedBoxBoundMSFT;
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneOrientedBoxBoundMSFT.html"><code>XrSceneOrientedBoxBoundMSFT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSceneOrientedBoxBoundMSFT(@NotNull MemorySegment segment) implements IXrSceneOrientedBoxBoundMSFT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSceneOrientedBoxBoundMSFT.html"><code>XrSceneOrientedBoxBoundMSFT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSceneOrientedBoxBoundMSFT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSceneOrientedBoxBoundMSFT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSceneOrientedBoxBoundMSFT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSceneOrientedBoxBoundMSFT, Iterable<XrSceneOrientedBoxBoundMSFT> {
        public long size() {
            return segment.byteSize() / XrSceneOrientedBoxBoundMSFT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSceneOrientedBoxBoundMSFT at(long index) {
            return new XrSceneOrientedBoxBoundMSFT(segment.asSlice(index * XrSceneOrientedBoxBoundMSFT.BYTES, XrSceneOrientedBoxBoundMSFT.BYTES));
        }

        public XrSceneOrientedBoxBoundMSFT.Ptr at(long index, @NotNull Consumer<@NotNull XrSceneOrientedBoxBoundMSFT> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrSceneOrientedBoxBoundMSFT value) {
            MemorySegment s = segment.asSlice(index * XrSceneOrientedBoxBoundMSFT.BYTES, XrSceneOrientedBoxBoundMSFT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSceneOrientedBoxBoundMSFT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSceneOrientedBoxBoundMSFT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSceneOrientedBoxBoundMSFT.BYTES,
                (end - start) * XrSceneOrientedBoxBoundMSFT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSceneOrientedBoxBoundMSFT.BYTES));
        }

        public XrSceneOrientedBoxBoundMSFT[] toArray() {
            XrSceneOrientedBoxBoundMSFT[] ret = new XrSceneOrientedBoxBoundMSFT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSceneOrientedBoxBoundMSFT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSceneOrientedBoxBoundMSFT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSceneOrientedBoxBoundMSFT.BYTES;
            }

            @Override
            public XrSceneOrientedBoxBoundMSFT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSceneOrientedBoxBoundMSFT ret = new XrSceneOrientedBoxBoundMSFT(segment.asSlice(0, XrSceneOrientedBoxBoundMSFT.BYTES));
                segment = segment.asSlice(XrSceneOrientedBoxBoundMSFT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSceneOrientedBoxBoundMSFT allocate(Arena arena) {
        return new XrSceneOrientedBoxBoundMSFT(arena.allocate(LAYOUT));
    }

    public static XrSceneOrientedBoxBoundMSFT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrSceneOrientedBoxBoundMSFT.Ptr(segment);
    }

    public static XrSceneOrientedBoxBoundMSFT clone(Arena arena, XrSceneOrientedBoxBoundMSFT src) {
        XrSceneOrientedBoxBoundMSFT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NotNull XrPosef pose() {
        return new XrPosef(segment.asSlice(OFFSET$pose, LAYOUT$pose));
    }

    public XrSceneOrientedBoxBoundMSFT pose(@NotNull XrPosef value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$pose, SIZE$pose);
        return this;
    }

    public XrSceneOrientedBoxBoundMSFT pose(Consumer<@NotNull XrPosef> consumer) {
        consumer.accept(pose());
        return this;
    }

    public @NotNull XrVector3f extents() {
        return new XrVector3f(segment.asSlice(OFFSET$extents, LAYOUT$extents));
    }

    public XrSceneOrientedBoxBoundMSFT extents(@NotNull XrVector3f value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$extents, SIZE$extents);
        return this;
    }

    public XrSceneOrientedBoxBoundMSFT extents(Consumer<@NotNull XrVector3f> consumer) {
        consumer.accept(extents());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        XrPosef.LAYOUT.withName("pose"),
        XrVector3f.LAYOUT.withName("extents")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$pose = PathElement.groupElement("pose");
    public static final PathElement PATH$extents = PathElement.groupElement("extents");

    public static final StructLayout LAYOUT$pose = (StructLayout) LAYOUT.select(PATH$pose);
    public static final StructLayout LAYOUT$extents = (StructLayout) LAYOUT.select(PATH$extents);

    public static final long SIZE$pose = LAYOUT$pose.byteSize();
    public static final long SIZE$extents = LAYOUT$extents.byteSize();

    public static final long OFFSET$pose = LAYOUT.byteOffset(PATH$pose);
    public static final long OFFSET$extents = LAYOUT.byteOffset(PATH$extents);
}
