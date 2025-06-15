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
import static club.doki7.webgpu.WebGPUConstants.*;

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
public record SurfaceSourceMetalLayer(@NotNull MemorySegment segment) implements ISurfaceSourceMetalLayer {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SurfaceSourceMetalLayer}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISurfaceSourceMetalLayer to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SurfaceSourceMetalLayer.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISurfaceSourceMetalLayer, Iterable<SurfaceSourceMetalLayer> {
        public long size() {
            return segment.byteSize() / SurfaceSourceMetalLayer.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SurfaceSourceMetalLayer at(long index) {
            return new SurfaceSourceMetalLayer(segment.asSlice(index * SurfaceSourceMetalLayer.BYTES, SurfaceSourceMetalLayer.BYTES));
        }

        public void write(long index, @NotNull SurfaceSourceMetalLayer value) {
            MemorySegment s = segment.asSlice(index * SurfaceSourceMetalLayer.BYTES, SurfaceSourceMetalLayer.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SurfaceSourceMetalLayer.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SurfaceSourceMetalLayer.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SurfaceSourceMetalLayer.BYTES,
                (end - start) * SurfaceSourceMetalLayer.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SurfaceSourceMetalLayer.BYTES));
        }

        public SurfaceSourceMetalLayer[] toArray() {
            SurfaceSourceMetalLayer[] ret = new SurfaceSourceMetalLayer[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SurfaceSourceMetalLayer> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SurfaceSourceMetalLayer> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SurfaceSourceMetalLayer.BYTES;
            }

            @Override
            public SurfaceSourceMetalLayer next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SurfaceSourceMetalLayer ret = new SurfaceSourceMetalLayer(segment.asSlice(0, SurfaceSourceMetalLayer.BYTES));
                segment = segment.asSlice(SurfaceSourceMetalLayer.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SurfaceSourceMetalLayer allocate(Arena arena) {
        return new SurfaceSourceMetalLayer(arena.allocate(LAYOUT));
    }

    public static SurfaceSourceMetalLayer.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SurfaceSourceMetalLayer.Ptr(segment);
    }

    public static SurfaceSourceMetalLayer clone(Arena arena, SurfaceSourceMetalLayer src) {
        SurfaceSourceMetalLayer ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Pointer(comment="void*") MemorySegment layer() {
        return segment.get(LAYOUT$layer, OFFSET$layer);
    }

    public void layer(@Pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$layer, OFFSET$layer, value);
    }

    public SurfaceSourceMetalLayer layer(@Nullable IPointer pointer) {
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
