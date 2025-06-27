package club.doki7.webgpu.datatype;

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
import club.doki7.webgpu.bitmask.*;
import club.doki7.webgpu.handle.*;
import club.doki7.webgpu.enumtype.*;
import static club.doki7.webgpu.WGPUConstants.*;

/// Represents a pointer to a {@code SurfaceSourceMetalLayer} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SurfaceSourceMetalLayer {
///     void* layer; // @link substring="layer" target="#layer"
/// } SurfaceSourceMetalLayer;
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
@ValueBasedCandidate
@UnsafeConstructor
public record WGPUSurfaceSourceMetalLayer(@NotNull MemorySegment segment) implements IWGPUSurfaceSourceMetalLayer {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUSurfaceSourceMetalLayer}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUSurfaceSourceMetalLayer to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUSurfaceSourceMetalLayer.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUSurfaceSourceMetalLayer, Iterable<WGPUSurfaceSourceMetalLayer> {
        public long size() {
            return segment.byteSize() / WGPUSurfaceSourceMetalLayer.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUSurfaceSourceMetalLayer at(long index) {
            return new WGPUSurfaceSourceMetalLayer(segment.asSlice(index * WGPUSurfaceSourceMetalLayer.BYTES, WGPUSurfaceSourceMetalLayer.BYTES));
        }

        public WGPUSurfaceSourceMetalLayer.Ptr at(long index, @NotNull Consumer<@NotNull WGPUSurfaceSourceMetalLayer> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUSurfaceSourceMetalLayer value) {
            MemorySegment s = segment.asSlice(index * WGPUSurfaceSourceMetalLayer.BYTES, WGPUSurfaceSourceMetalLayer.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUSurfaceSourceMetalLayer.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUSurfaceSourceMetalLayer.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUSurfaceSourceMetalLayer.BYTES,
                (end - start) * WGPUSurfaceSourceMetalLayer.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUSurfaceSourceMetalLayer.BYTES));
        }

        public WGPUSurfaceSourceMetalLayer[] toArray() {
            WGPUSurfaceSourceMetalLayer[] ret = new WGPUSurfaceSourceMetalLayer[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUSurfaceSourceMetalLayer> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUSurfaceSourceMetalLayer> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUSurfaceSourceMetalLayer.BYTES;
            }

            @Override
            public WGPUSurfaceSourceMetalLayer next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUSurfaceSourceMetalLayer ret = new WGPUSurfaceSourceMetalLayer(segment.asSlice(0, WGPUSurfaceSourceMetalLayer.BYTES));
                segment = segment.asSlice(WGPUSurfaceSourceMetalLayer.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUSurfaceSourceMetalLayer allocate(Arena arena) {
        return new WGPUSurfaceSourceMetalLayer(arena.allocate(LAYOUT));
    }

    public static WGPUSurfaceSourceMetalLayer.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUSurfaceSourceMetalLayer.Ptr(segment);
    }

    public static WGPUSurfaceSourceMetalLayer clone(Arena arena, WGPUSurfaceSourceMetalLayer src) {
        WGPUSurfaceSourceMetalLayer ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Pointer(comment="void*") @NotNull MemorySegment layer() {
        return segment.get(LAYOUT$layer, OFFSET$layer);
    }

    public WGPUSurfaceSourceMetalLayer layer(@Pointer(comment="void*") @NotNull MemorySegment value) {
        segment.set(LAYOUT$layer, OFFSET$layer, value);
        return this;
    }

    public WGPUSurfaceSourceMetalLayer layer(@Nullable IPointer pointer) {
        layer(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("layer")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$layer = PathElement.groupElement("layer");

    public static final AddressLayout LAYOUT$layer = (AddressLayout) LAYOUT.select(PATH$layer);

    public static final long SIZE$layer = LAYOUT$layer.byteSize();

    public static final long OFFSET$layer = LAYOUT.byteOffset(PATH$layer);
}
