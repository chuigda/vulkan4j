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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrRenderModelNodeStateEXT.html"><code>XrRenderModelNodeStateEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrRenderModelNodeStateEXT {
///     XrPosef nodePose; // @link substring="XrPosef" target="XrPosef" @link substring="nodePose" target="#nodePose"
///     XrBool32 isVisible; // @link substring="isVisible" target="#isVisible"
/// } XrRenderModelNodeStateEXT;
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrRenderModelNodeStateEXT.html"><code>XrRenderModelNodeStateEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrRenderModelNodeStateEXT(@NotNull MemorySegment segment) implements IXrRenderModelNodeStateEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrRenderModelNodeStateEXT.html"><code>XrRenderModelNodeStateEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrRenderModelNodeStateEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrRenderModelNodeStateEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrRenderModelNodeStateEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrRenderModelNodeStateEXT, Iterable<XrRenderModelNodeStateEXT> {
        public long size() {
            return segment.byteSize() / XrRenderModelNodeStateEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrRenderModelNodeStateEXT at(long index) {
            return new XrRenderModelNodeStateEXT(segment.asSlice(index * XrRenderModelNodeStateEXT.BYTES, XrRenderModelNodeStateEXT.BYTES));
        }

        public void write(long index, @NotNull XrRenderModelNodeStateEXT value) {
            MemorySegment s = segment.asSlice(index * XrRenderModelNodeStateEXT.BYTES, XrRenderModelNodeStateEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrRenderModelNodeStateEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrRenderModelNodeStateEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrRenderModelNodeStateEXT.BYTES,
                (end - start) * XrRenderModelNodeStateEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrRenderModelNodeStateEXT.BYTES));
        }

        public XrRenderModelNodeStateEXT[] toArray() {
            XrRenderModelNodeStateEXT[] ret = new XrRenderModelNodeStateEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrRenderModelNodeStateEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrRenderModelNodeStateEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrRenderModelNodeStateEXT.BYTES;
            }

            @Override
            public XrRenderModelNodeStateEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrRenderModelNodeStateEXT ret = new XrRenderModelNodeStateEXT(segment.asSlice(0, XrRenderModelNodeStateEXT.BYTES));
                segment = segment.asSlice(XrRenderModelNodeStateEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrRenderModelNodeStateEXT allocate(Arena arena) {
        return new XrRenderModelNodeStateEXT(arena.allocate(LAYOUT));
    }

    public static XrRenderModelNodeStateEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrRenderModelNodeStateEXT.Ptr(segment);
    }

    public static XrRenderModelNodeStateEXT clone(Arena arena, XrRenderModelNodeStateEXT src) {
        XrRenderModelNodeStateEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NotNull XrPosef nodePose() {
        return new XrPosef(segment.asSlice(OFFSET$nodePose, LAYOUT$nodePose));
    }

    public XrRenderModelNodeStateEXT nodePose(@NotNull XrPosef value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$nodePose, SIZE$nodePose);
        return this;
    }

    public XrRenderModelNodeStateEXT nodePose(Consumer<@NotNull XrPosef> consumer) {
        consumer.accept(nodePose());
        return this;
    }

    public @NativeType("XrBool32") @Unsigned int isVisible() {
        return segment.get(LAYOUT$isVisible, OFFSET$isVisible);
    }

    public XrRenderModelNodeStateEXT isVisible(@NativeType("XrBool32") @Unsigned int value) {
        segment.set(LAYOUT$isVisible, OFFSET$isVisible, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        XrPosef.LAYOUT.withName("nodePose"),
        ValueLayout.JAVA_INT.withName("isVisible")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$nodePose = PathElement.groupElement("nodePose");
    public static final PathElement PATH$isVisible = PathElement.groupElement("isVisible");

    public static final StructLayout LAYOUT$nodePose = (StructLayout) LAYOUT.select(PATH$nodePose);
    public static final OfInt LAYOUT$isVisible = (OfInt) LAYOUT.select(PATH$isVisible);

    public static final long SIZE$nodePose = LAYOUT$nodePose.byteSize();
    public static final long SIZE$isVisible = LAYOUT$isVisible.byteSize();

    public static final long OFFSET$nodePose = LAYOUT.byteOffset(PATH$nodePose);
    public static final long OFFSET$isVisible = LAYOUT.byteOffset(PATH$isVisible);
}
