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

/// Represents a pointer to a <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrRenderModelAssetNodePropertiesEXT.html"><code>XrRenderModelAssetNodePropertiesEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct XrRenderModelAssetNodePropertiesEXT {
///     char[XR_MAX_RENDER_MODEL_ASSET_NODE_NAME_SIZE_EXT] uniqueName; // @link substring="uniqueName" target="#uniqueName"
/// } XrRenderModelAssetNodePropertiesEXT;
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
/// @see <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrRenderModelAssetNodePropertiesEXT.html"><code>XrRenderModelAssetNodePropertiesEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record XrRenderModelAssetNodePropertiesEXT(@NotNull MemorySegment segment) implements IXrRenderModelAssetNodePropertiesEXT {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/OpenXR/specs/1.1/man/html/XrRenderModelAssetNodePropertiesEXT.html"><code>XrRenderModelAssetNodePropertiesEXT</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link XrRenderModelAssetNodePropertiesEXT}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IXrRenderModelAssetNodePropertiesEXT to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code XrRenderModelAssetNodePropertiesEXT.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IXrRenderModelAssetNodePropertiesEXT, Iterable<XrRenderModelAssetNodePropertiesEXT> {
        public long size() {
            return segment.byteSize() / XrRenderModelAssetNodePropertiesEXT.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull XrRenderModelAssetNodePropertiesEXT at(long index) {
            return new XrRenderModelAssetNodePropertiesEXT(segment.asSlice(index * XrRenderModelAssetNodePropertiesEXT.BYTES, XrRenderModelAssetNodePropertiesEXT.BYTES));
        }

        public XrRenderModelAssetNodePropertiesEXT.Ptr at(long index, @NotNull Consumer<@NotNull XrRenderModelAssetNodePropertiesEXT> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull XrRenderModelAssetNodePropertiesEXT value) {
            MemorySegment s = segment.asSlice(index * XrRenderModelAssetNodePropertiesEXT.BYTES, XrRenderModelAssetNodePropertiesEXT.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * XrRenderModelAssetNodePropertiesEXT.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * XrRenderModelAssetNodePropertiesEXT.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * XrRenderModelAssetNodePropertiesEXT.BYTES,
                (end - start) * XrRenderModelAssetNodePropertiesEXT.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * XrRenderModelAssetNodePropertiesEXT.BYTES));
        }

        public XrRenderModelAssetNodePropertiesEXT[] toArray() {
            XrRenderModelAssetNodePropertiesEXT[] ret = new XrRenderModelAssetNodePropertiesEXT[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<XrRenderModelAssetNodePropertiesEXT> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<XrRenderModelAssetNodePropertiesEXT> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= XrRenderModelAssetNodePropertiesEXT.BYTES;
            }

            @Override
            public XrRenderModelAssetNodePropertiesEXT next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                XrRenderModelAssetNodePropertiesEXT ret = new XrRenderModelAssetNodePropertiesEXT(segment.asSlice(0, XrRenderModelAssetNodePropertiesEXT.BYTES));
                segment = segment.asSlice(XrRenderModelAssetNodePropertiesEXT.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static XrRenderModelAssetNodePropertiesEXT allocate(Arena arena) {
        return new XrRenderModelAssetNodePropertiesEXT(arena.allocate(LAYOUT));
    }

    public static XrRenderModelAssetNodePropertiesEXT.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new XrRenderModelAssetNodePropertiesEXT.Ptr(segment);
    }

    public static XrRenderModelAssetNodePropertiesEXT clone(Arena arena, XrRenderModelAssetNodePropertiesEXT src) {
        XrRenderModelAssetNodePropertiesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public BytePtr uniqueName() {
        return new BytePtr(uniqueNameRaw());
    }

    public XrRenderModelAssetNodePropertiesEXT uniqueName(@NotNull Consumer<BytePtr> consumer) {
        BytePtr ptr = uniqueName();
        consumer.accept(ptr);
        return this;
    }

    public XrRenderModelAssetNodePropertiesEXT uniqueName(BytePtr value) {
        MemorySegment s = uniqueNameRaw();
        s.copyFrom(value.segment());
        return this;
    }

    public @NotNull MemorySegment uniqueNameRaw() {
        return segment.asSlice(OFFSET$uniqueName, SIZE$uniqueName);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        MemoryLayout.sequenceLayout(MAX_RENDER_MODEL_ASSET_NODE_NAME_SIZE_EXT, ValueLayout.JAVA_BYTE).withName("uniqueName")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$uniqueName = PathElement.groupElement("uniqueName");

    public static final SequenceLayout LAYOUT$uniqueName = (SequenceLayout) LAYOUT.select(PATH$uniqueName);

    public static final long SIZE$uniqueName = LAYOUT$uniqueName.byteSize();

    public static final long OFFSET$uniqueName = LAYOUT.byteOffset(PATH$uniqueName);
}
