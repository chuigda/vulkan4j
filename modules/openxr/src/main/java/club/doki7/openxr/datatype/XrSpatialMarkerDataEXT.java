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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialMarkerDataEXT.html"><code>XrSpatialMarkerDataEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSpatialMarkerDataEXT {
///     XrSpatialCapabilityEXT capability; // @link substring="XrSpatialCapabilityEXT" target="XrSpatialCapabilityEXT" @link substring="capability" target="#capability"
///     uint32_t markerId; // @link substring="markerId" target="#markerId"
///     XrSpatialBufferEXT data; // @link substring="XrSpatialBufferEXT" target="XrSpatialBufferEXT" @link substring="data" target="#data"
/// } XrSpatialMarkerDataEXT;
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialMarkerDataEXT.html"><code>XrSpatialMarkerDataEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSpatialMarkerDataEXT(@NotNull MemorySegment segment) implements IXrSpatialMarkerDataEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialMarkerDataEXT.html"><code>XrSpatialMarkerDataEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSpatialMarkerDataEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSpatialMarkerDataEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSpatialMarkerDataEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSpatialMarkerDataEXT, Iterable<XrSpatialMarkerDataEXT> {
        public long size() {
            return segment.byteSize() / XrSpatialMarkerDataEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSpatialMarkerDataEXT at(long index) {
            return new XrSpatialMarkerDataEXT(segment.asSlice(index * XrSpatialMarkerDataEXT.BYTES, XrSpatialMarkerDataEXT.BYTES));
        }

        public XrSpatialMarkerDataEXT.Ptr at(long index, @NotNull Consumer<@NotNull XrSpatialMarkerDataEXT> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrSpatialMarkerDataEXT value) {
            MemorySegment s = segment.asSlice(index * XrSpatialMarkerDataEXT.BYTES, XrSpatialMarkerDataEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSpatialMarkerDataEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSpatialMarkerDataEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSpatialMarkerDataEXT.BYTES,
                (end - start) * XrSpatialMarkerDataEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSpatialMarkerDataEXT.BYTES));
        }

        public XrSpatialMarkerDataEXT[] toArray() {
            XrSpatialMarkerDataEXT[] ret = new XrSpatialMarkerDataEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSpatialMarkerDataEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSpatialMarkerDataEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSpatialMarkerDataEXT.BYTES;
            }

            @Override
            public XrSpatialMarkerDataEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSpatialMarkerDataEXT ret = new XrSpatialMarkerDataEXT(segment.asSlice(0, XrSpatialMarkerDataEXT.BYTES));
                segment = segment.asSlice(XrSpatialMarkerDataEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSpatialMarkerDataEXT allocate(Arena arena) {
        return new XrSpatialMarkerDataEXT(arena.allocate(LAYOUT));
    }

    public static XrSpatialMarkerDataEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrSpatialMarkerDataEXT.Ptr(segment);
    }

    public static XrSpatialMarkerDataEXT clone(Arena arena, XrSpatialMarkerDataEXT src) {
        XrSpatialMarkerDataEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(XrSpatialCapabilityEXT.class) int capability() {
        return segment.get(LAYOUT$capability, OFFSET$capability);
    }

    public XrSpatialMarkerDataEXT capability(@EnumType(XrSpatialCapabilityEXT.class) int value) {
        segment.set(LAYOUT$capability, OFFSET$capability, value);
        return this;
    }

    public @Unsigned int markerId() {
        return segment.get(LAYOUT$markerId, OFFSET$markerId);
    }

    public XrSpatialMarkerDataEXT markerId(@Unsigned int value) {
        segment.set(LAYOUT$markerId, OFFSET$markerId, value);
        return this;
    }

    public @NotNull XrSpatialBufferEXT data() {
        return new XrSpatialBufferEXT(segment.asSlice(OFFSET$data, LAYOUT$data));
    }

    public XrSpatialMarkerDataEXT data(@NotNull XrSpatialBufferEXT value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$data, SIZE$data);
        return this;
    }

    public XrSpatialMarkerDataEXT data(Consumer<@NotNull XrSpatialBufferEXT> consumer) {
        consumer.accept(data());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("capability"),
        ValueLayout.JAVA_INT.withName("markerId"),
        XrSpatialBufferEXT.LAYOUT.withName("data")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$capability = PathElement.groupElement("capability");
    public static final PathElement PATH$markerId = PathElement.groupElement("markerId");
    public static final PathElement PATH$data = PathElement.groupElement("data");

    public static final OfInt LAYOUT$capability = (OfInt) LAYOUT.select(PATH$capability);
    public static final OfInt LAYOUT$markerId = (OfInt) LAYOUT.select(PATH$markerId);
    public static final StructLayout LAYOUT$data = (StructLayout) LAYOUT.select(PATH$data);

    public static final long SIZE$capability = LAYOUT$capability.byteSize();
    public static final long SIZE$markerId = LAYOUT$markerId.byteSize();
    public static final long SIZE$data = LAYOUT$data.byteSize();

    public static final long OFFSET$capability = LAYOUT.byteOffset(PATH$capability);
    public static final long OFFSET$markerId = LAYOUT.byteOffset(PATH$markerId);
    public static final long OFFSET$data = LAYOUT.byteOffset(PATH$data);
}
