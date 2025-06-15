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

/// Represents a pointer to a {@code BindGroupLayoutEntry} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct BindGroupLayoutEntry {
///     ChainedStruct* nextInChain; // @link substring="ChainedStruct" target="ChainedStruct" @link substring="nextInChain" target="#nextInChain"
///     uint32_t binding; // @link substring="binding" target="#binding"
///     ShaderStage visibility; // @link substring="ShaderStage" target="ShaderStage" @link substring="visibility" target="#visibility"
///     uint32_t bindingArraySize; // @link substring="bindingArraySize" target="#bindingArraySize"
///     BufferBindingLayout buffer; // @link substring="BufferBindingLayout" target="BufferBindingLayout" @link substring="buffer" target="#buffer"
///     SamplerBindingLayout sampler; // @link substring="SamplerBindingLayout" target="SamplerBindingLayout" @link substring="sampler" target="#sampler"
///     TextureBindingLayout texture; // @link substring="TextureBindingLayout" target="TextureBindingLayout" @link substring="texture" target="#texture"
///     StorageTextureBindingLayout storageTexture; // @link substring="StorageTextureBindingLayout" target="StorageTextureBindingLayout" @link substring="storageTexture" target="#storageTexture"
/// } BindGroupLayoutEntry;
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
public record BindGroupLayoutEntry(@NotNull MemorySegment segment) implements IBindGroupLayoutEntry {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link BindGroupLayoutEntry}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IBindGroupLayoutEntry to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code BindGroupLayoutEntry.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IBindGroupLayoutEntry, Iterable<BindGroupLayoutEntry> {
        public long size() {
            return segment.byteSize() / BindGroupLayoutEntry.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull BindGroupLayoutEntry at(long index) {
            return new BindGroupLayoutEntry(segment.asSlice(index * BindGroupLayoutEntry.BYTES, BindGroupLayoutEntry.BYTES));
        }

        public void write(long index, @NotNull BindGroupLayoutEntry value) {
            MemorySegment s = segment.asSlice(index * BindGroupLayoutEntry.BYTES, BindGroupLayoutEntry.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * BindGroupLayoutEntry.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * BindGroupLayoutEntry.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * BindGroupLayoutEntry.BYTES,
                (end - start) * BindGroupLayoutEntry.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * BindGroupLayoutEntry.BYTES));
        }

        public BindGroupLayoutEntry[] toArray() {
            BindGroupLayoutEntry[] ret = new BindGroupLayoutEntry[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<BindGroupLayoutEntry> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<BindGroupLayoutEntry> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= BindGroupLayoutEntry.BYTES;
            }

            @Override
            public BindGroupLayoutEntry next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                BindGroupLayoutEntry ret = new BindGroupLayoutEntry(segment.asSlice(0, BindGroupLayoutEntry.BYTES));
                segment = segment.asSlice(BindGroupLayoutEntry.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static BindGroupLayoutEntry allocate(Arena arena) {
        return new BindGroupLayoutEntry(arena.allocate(LAYOUT));
    }

    public static BindGroupLayoutEntry.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new BindGroupLayoutEntry.Ptr(segment);
    }

    public static BindGroupLayoutEntry clone(Arena arena, BindGroupLayoutEntry src) {
        BindGroupLayoutEntry ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public BindGroupLayoutEntry nextInChain(@Nullable IChainedStruct value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        nextInChainRaw(s);
        return this;
    }

    @Unsafe public @Nullable ChainedStruct.Ptr nextInChain(int assumedCount) {
        MemorySegment s = nextInChainRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * ChainedStruct.BYTES);
        return new ChainedStruct.Ptr(s);
    }

    public @Nullable ChainedStruct nextInChain() {
        MemorySegment s = nextInChainRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new ChainedStruct(s);
    }

    public @Pointer(target=ChainedStruct.class) MemorySegment nextInChainRaw() {
        return segment.get(LAYOUT$nextInChain, OFFSET$nextInChain);
    }

    public void nextInChainRaw(@Pointer(target=ChainedStruct.class) MemorySegment value) {
        segment.set(LAYOUT$nextInChain, OFFSET$nextInChain, value);
    }

    public @Unsigned int binding() {
        return segment.get(LAYOUT$binding, OFFSET$binding);
    }

    public BindGroupLayoutEntry binding(@Unsigned int value) {
        segment.set(LAYOUT$binding, OFFSET$binding, value);
        return this;
    }

    public @EnumType(ShaderStage.class) long visibility() {
        return segment.get(LAYOUT$visibility, OFFSET$visibility);
    }

    public BindGroupLayoutEntry visibility(@EnumType(ShaderStage.class) long value) {
        segment.set(LAYOUT$visibility, OFFSET$visibility, value);
        return this;
    }

    public @Unsigned int bindingArraySize() {
        return segment.get(LAYOUT$bindingArraySize, OFFSET$bindingArraySize);
    }

    public BindGroupLayoutEntry bindingArraySize(@Unsigned int value) {
        segment.set(LAYOUT$bindingArraySize, OFFSET$bindingArraySize, value);
        return this;
    }

    public @NotNull BufferBindingLayout buffer() {
        return new BufferBindingLayout(segment.asSlice(OFFSET$buffer, LAYOUT$buffer));
    }

    public BindGroupLayoutEntry buffer(@NotNull BufferBindingLayout value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$buffer, SIZE$buffer);
        return this;
    }

    public BindGroupLayoutEntry buffer(Consumer<@NotNull BufferBindingLayout> consumer) {
        consumer.accept(buffer());
        return this;
    }

    public @NotNull SamplerBindingLayout sampler() {
        return new SamplerBindingLayout(segment.asSlice(OFFSET$sampler, LAYOUT$sampler));
    }

    public BindGroupLayoutEntry sampler(@NotNull SamplerBindingLayout value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$sampler, SIZE$sampler);
        return this;
    }

    public BindGroupLayoutEntry sampler(Consumer<@NotNull SamplerBindingLayout> consumer) {
        consumer.accept(sampler());
        return this;
    }

    public @NotNull TextureBindingLayout texture() {
        return new TextureBindingLayout(segment.asSlice(OFFSET$texture, LAYOUT$texture));
    }

    public BindGroupLayoutEntry texture(@NotNull TextureBindingLayout value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$texture, SIZE$texture);
        return this;
    }

    public BindGroupLayoutEntry texture(Consumer<@NotNull TextureBindingLayout> consumer) {
        consumer.accept(texture());
        return this;
    }

    public @NotNull StorageTextureBindingLayout storageTexture() {
        return new StorageTextureBindingLayout(segment.asSlice(OFFSET$storageTexture, LAYOUT$storageTexture));
    }

    public BindGroupLayoutEntry storageTexture(@NotNull StorageTextureBindingLayout value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$storageTexture, SIZE$storageTexture);
        return this;
    }

    public BindGroupLayoutEntry storageTexture(Consumer<@NotNull StorageTextureBindingLayout> consumer) {
        consumer.accept(storageTexture());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(ChainedStruct.LAYOUT).withName("nextInChain"),
        ValueLayout.JAVA_INT.withName("binding"),
        ValueLayout.JAVA_LONG.withName("visibility"),
        ValueLayout.JAVA_INT.withName("bindingArraySize"),
        BufferBindingLayout.LAYOUT.withName("buffer"),
        SamplerBindingLayout.LAYOUT.withName("sampler"),
        TextureBindingLayout.LAYOUT.withName("texture"),
        StorageTextureBindingLayout.LAYOUT.withName("storageTexture")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$nextInChain = PathElement.groupElement("nextInChain");
    public static final PathElement PATH$binding = PathElement.groupElement("binding");
    public static final PathElement PATH$visibility = PathElement.groupElement("visibility");
    public static final PathElement PATH$bindingArraySize = PathElement.groupElement("bindingArraySize");
    public static final PathElement PATH$buffer = PathElement.groupElement("buffer");
    public static final PathElement PATH$sampler = PathElement.groupElement("sampler");
    public static final PathElement PATH$texture = PathElement.groupElement("texture");
    public static final PathElement PATH$storageTexture = PathElement.groupElement("storageTexture");

    public static final AddressLayout LAYOUT$nextInChain = (AddressLayout) LAYOUT.select(PATH$nextInChain);
    public static final OfInt LAYOUT$binding = (OfInt) LAYOUT.select(PATH$binding);
    public static final OfLong LAYOUT$visibility = (OfLong) LAYOUT.select(PATH$visibility);
    public static final OfInt LAYOUT$bindingArraySize = (OfInt) LAYOUT.select(PATH$bindingArraySize);
    public static final StructLayout LAYOUT$buffer = (StructLayout) LAYOUT.select(PATH$buffer);
    public static final StructLayout LAYOUT$sampler = (StructLayout) LAYOUT.select(PATH$sampler);
    public static final StructLayout LAYOUT$texture = (StructLayout) LAYOUT.select(PATH$texture);
    public static final StructLayout LAYOUT$storageTexture = (StructLayout) LAYOUT.select(PATH$storageTexture);

    public static final long SIZE$nextInChain = LAYOUT$nextInChain.byteSize();
    public static final long SIZE$binding = LAYOUT$binding.byteSize();
    public static final long SIZE$visibility = LAYOUT$visibility.byteSize();
    public static final long SIZE$bindingArraySize = LAYOUT$bindingArraySize.byteSize();
    public static final long SIZE$buffer = LAYOUT$buffer.byteSize();
    public static final long SIZE$sampler = LAYOUT$sampler.byteSize();
    public static final long SIZE$texture = LAYOUT$texture.byteSize();
    public static final long SIZE$storageTexture = LAYOUT$storageTexture.byteSize();

    public static final long OFFSET$nextInChain = LAYOUT.byteOffset(PATH$nextInChain);
    public static final long OFFSET$binding = LAYOUT.byteOffset(PATH$binding);
    public static final long OFFSET$visibility = LAYOUT.byteOffset(PATH$visibility);
    public static final long OFFSET$bindingArraySize = LAYOUT.byteOffset(PATH$bindingArraySize);
    public static final long OFFSET$buffer = LAYOUT.byteOffset(PATH$buffer);
    public static final long OFFSET$sampler = LAYOUT.byteOffset(PATH$sampler);
    public static final long OFFSET$texture = LAYOUT.byteOffset(PATH$texture);
    public static final long OFFSET$storageTexture = LAYOUT.byteOffset(PATH$storageTexture);
}
