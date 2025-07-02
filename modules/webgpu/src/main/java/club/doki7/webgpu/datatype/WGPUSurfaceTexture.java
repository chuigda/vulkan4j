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
import club.doki7.webgpu.WGPUFunctionTypes.*;

/// Represents a pointer to a {@code WGPUSurfaceTexture} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPUSurfaceTexture {
///     WGPUChainedStruct const* nextInChain; // optional // @link substring="WGPUChainedStruct" target="WGPUChainedStruct" @link substring="nextInChain" target="#nextInChain"
///     WGPUTexture texture; // @link substring="WGPUTexture" target="WGPUTexture" @link substring="texture" target="#texture"
///     WGPUSurfaceGetCurrentTextureStatus status; // @link substring="WGPUSurfaceGetCurrentTextureStatus" target="WGPUSurfaceGetCurrentTextureStatus" @link substring="status" target="#status"
/// } WGPUSurfaceTexture;
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
public record WGPUSurfaceTexture(@NotNull MemorySegment segment) implements IWGPUSurfaceTexture {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUSurfaceTexture}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUSurfaceTexture to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUSurfaceTexture.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUSurfaceTexture, Iterable<WGPUSurfaceTexture> {
        public long size() {
            return segment.byteSize() / WGPUSurfaceTexture.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUSurfaceTexture at(long index) {
            return new WGPUSurfaceTexture(segment.asSlice(index * WGPUSurfaceTexture.BYTES, WGPUSurfaceTexture.BYTES));
        }

        public WGPUSurfaceTexture.Ptr at(long index, @NotNull Consumer<@NotNull WGPUSurfaceTexture> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUSurfaceTexture value) {
            MemorySegment s = segment.asSlice(index * WGPUSurfaceTexture.BYTES, WGPUSurfaceTexture.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUSurfaceTexture.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUSurfaceTexture.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUSurfaceTexture.BYTES,
                (end - start) * WGPUSurfaceTexture.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUSurfaceTexture.BYTES));
        }

        public WGPUSurfaceTexture[] toArray() {
            WGPUSurfaceTexture[] ret = new WGPUSurfaceTexture[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUSurfaceTexture> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUSurfaceTexture> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUSurfaceTexture.BYTES;
            }

            @Override
            public WGPUSurfaceTexture next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUSurfaceTexture ret = new WGPUSurfaceTexture(segment.asSlice(0, WGPUSurfaceTexture.BYTES));
                segment = segment.asSlice(WGPUSurfaceTexture.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUSurfaceTexture allocate(Arena arena) {
        return new WGPUSurfaceTexture(arena.allocate(LAYOUT));
    }

    public static WGPUSurfaceTexture.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUSurfaceTexture.Ptr(segment);
    }

    public static WGPUSurfaceTexture clone(Arena arena, WGPUSurfaceTexture src) {
        WGPUSurfaceTexture ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public WGPUSurfaceTexture nextInChain(@Nullable IWGPUChainedStruct value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        nextInChainRaw(s);
        return this;
    }

    @Unsafe public @Nullable WGPUChainedStruct.Ptr nextInChain(int assumedCount) {
        MemorySegment s = nextInChainRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * WGPUChainedStruct.BYTES);
        return new WGPUChainedStruct.Ptr(s);
    }

    public @Nullable WGPUChainedStruct nextInChain() {
        MemorySegment s = nextInChainRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new WGPUChainedStruct(s);
    }

    public @Pointer(target=WGPUChainedStruct.class) @NotNull MemorySegment nextInChainRaw() {
        return segment.get(LAYOUT$nextInChain, OFFSET$nextInChain);
    }

    public void nextInChainRaw(@Pointer(target=WGPUChainedStruct.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$nextInChain, OFFSET$nextInChain, value);
    }

    public @Nullable WGPUTexture texture() {
        MemorySegment s = segment.asSlice(OFFSET$texture, SIZE$texture);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new WGPUTexture(s);
    }

    public WGPUSurfaceTexture texture(@Nullable WGPUTexture value) {
        segment.set(LAYOUT$texture, OFFSET$texture, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @EnumType(WGPUSurfaceGetCurrentTextureStatus.class) int status() {
        return segment.get(LAYOUT$status, OFFSET$status);
    }

    public WGPUSurfaceTexture status(@EnumType(WGPUSurfaceGetCurrentTextureStatus.class) int value) {
        segment.set(LAYOUT$status, OFFSET$status, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(WGPUChainedStruct.LAYOUT).withName("nextInChain"),
        ValueLayout.ADDRESS.withName("texture"),
        ValueLayout.JAVA_INT.withName("status")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$nextInChain = PathElement.groupElement("nextInChain");
    public static final PathElement PATH$texture = PathElement.groupElement("texture");
    public static final PathElement PATH$status = PathElement.groupElement("status");

    public static final AddressLayout LAYOUT$nextInChain = (AddressLayout) LAYOUT.select(PATH$nextInChain);
    public static final AddressLayout LAYOUT$texture = (AddressLayout) LAYOUT.select(PATH$texture);
    public static final OfInt LAYOUT$status = (OfInt) LAYOUT.select(PATH$status);

    public static final long SIZE$nextInChain = LAYOUT$nextInChain.byteSize();
    public static final long SIZE$texture = LAYOUT$texture.byteSize();
    public static final long SIZE$status = LAYOUT$status.byteSize();

    public static final long OFFSET$nextInChain = LAYOUT.byteOffset(PATH$nextInChain);
    public static final long OFFSET$texture = LAYOUT.byteOffset(PATH$texture);
    public static final long OFFSET$status = LAYOUT.byteOffset(PATH$status);
}
