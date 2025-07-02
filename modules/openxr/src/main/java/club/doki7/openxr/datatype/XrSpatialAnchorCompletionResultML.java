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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialAnchorCompletionResultML.html"><code>XrSpatialAnchorCompletionResultML</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrSpatialAnchorCompletionResultML {
///     XrUuidEXT uuid; // @link substring="XrUuidEXT" target="XrUuidEXT" @link substring="uuid" target="#uuid"
///     XrResult result; // @link substring="XrResult" target="XrResult" @link substring="result" target="#result"
/// } XrSpatialAnchorCompletionResultML;
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialAnchorCompletionResultML.html"><code>XrSpatialAnchorCompletionResultML</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrSpatialAnchorCompletionResultML(@NotNull MemorySegment segment) implements IXrSpatialAnchorCompletionResultML {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrSpatialAnchorCompletionResultML.html"><code>XrSpatialAnchorCompletionResultML</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrSpatialAnchorCompletionResultML}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrSpatialAnchorCompletionResultML to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrSpatialAnchorCompletionResultML.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrSpatialAnchorCompletionResultML, Iterable<XrSpatialAnchorCompletionResultML> {
        public long size() {
            return segment.byteSize() / XrSpatialAnchorCompletionResultML.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrSpatialAnchorCompletionResultML at(long index) {
            return new XrSpatialAnchorCompletionResultML(segment.asSlice(index * XrSpatialAnchorCompletionResultML.BYTES, XrSpatialAnchorCompletionResultML.BYTES));
        }

        public XrSpatialAnchorCompletionResultML.Ptr at(long index, @NotNull Consumer<@NotNull XrSpatialAnchorCompletionResultML> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrSpatialAnchorCompletionResultML value) {
            MemorySegment s = segment.asSlice(index * XrSpatialAnchorCompletionResultML.BYTES, XrSpatialAnchorCompletionResultML.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrSpatialAnchorCompletionResultML.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrSpatialAnchorCompletionResultML.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrSpatialAnchorCompletionResultML.BYTES,
                (end - start) * XrSpatialAnchorCompletionResultML.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrSpatialAnchorCompletionResultML.BYTES));
        }

        public XrSpatialAnchorCompletionResultML[] toArray() {
            XrSpatialAnchorCompletionResultML[] ret = new XrSpatialAnchorCompletionResultML[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrSpatialAnchorCompletionResultML> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrSpatialAnchorCompletionResultML> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrSpatialAnchorCompletionResultML.BYTES;
            }

            @Override
            public XrSpatialAnchorCompletionResultML next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrSpatialAnchorCompletionResultML ret = new XrSpatialAnchorCompletionResultML(segment.asSlice(0, XrSpatialAnchorCompletionResultML.BYTES));
                segment = segment.asSlice(XrSpatialAnchorCompletionResultML.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrSpatialAnchorCompletionResultML allocate(Arena arena) {
        return new XrSpatialAnchorCompletionResultML(arena.allocate(LAYOUT));
    }

    public static XrSpatialAnchorCompletionResultML.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrSpatialAnchorCompletionResultML.Ptr(segment);
    }

    public static XrSpatialAnchorCompletionResultML clone(Arena arena, XrSpatialAnchorCompletionResultML src) {
        XrSpatialAnchorCompletionResultML ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NotNull XrUuidEXT uuid() {
        return new XrUuidEXT(segment.asSlice(OFFSET$uuid, LAYOUT$uuid));
    }

    public XrSpatialAnchorCompletionResultML uuid(@NotNull XrUuidEXT value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$uuid, SIZE$uuid);
        return this;
    }

    public XrSpatialAnchorCompletionResultML uuid(Consumer<@NotNull XrUuidEXT> consumer) {
        consumer.accept(uuid());
        return this;
    }

    public @EnumType(XrResult.class) int result() {
        return segment.get(LAYOUT$result, OFFSET$result);
    }

    public XrSpatialAnchorCompletionResultML result(@EnumType(XrResult.class) int value) {
        segment.set(LAYOUT$result, OFFSET$result, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        XrUuidEXT.LAYOUT.withName("uuid"),
        ValueLayout.JAVA_INT.withName("result")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$uuid = PathElement.groupElement("uuid");
    public static final PathElement PATH$result = PathElement.groupElement("result");

    public static final StructLayout LAYOUT$uuid = (StructLayout) LAYOUT.select(PATH$uuid);
    public static final OfInt LAYOUT$result = (OfInt) LAYOUT.select(PATH$result);

    public static final long SIZE$uuid = LAYOUT$uuid.byteSize();
    public static final long SIZE$result = LAYOUT$result.byteSize();

    public static final long OFFSET$uuid = LAYOUT.byteOffset(PATH$uuid);
    public static final long OFFSET$result = LAYOUT.byteOffset(PATH$result);
}
