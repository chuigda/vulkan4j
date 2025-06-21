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

/// Represents a pointer to a {@code SamplerDescriptor} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SamplerDescriptor {
///     ChainedStruct* nextInChain; // @link substring="ChainedStruct" target="ChainedStruct" @link substring="nextInChain" target="#nextInChain"
///     StringView label; // @link substring="StringView" target="StringView" @link substring="label" target="#label"
///     AddressMode addressModeU; // @link substring="AddressMode" target="AddressMode" @link substring="addressModeU" target="#addressModeU"
///     AddressMode addressModeV; // @link substring="AddressMode" target="AddressMode" @link substring="addressModeV" target="#addressModeV"
///     AddressMode addressModeW; // @link substring="AddressMode" target="AddressMode" @link substring="addressModeW" target="#addressModeW"
///     FilterMode magFilter; // @link substring="FilterMode" target="FilterMode" @link substring="magFilter" target="#magFilter"
///     FilterMode minFilter; // @link substring="FilterMode" target="FilterMode" @link substring="minFilter" target="#minFilter"
///     MipmapFilterMode mipmapFilter; // @link substring="MipmapFilterMode" target="MipmapFilterMode" @link substring="mipmapFilter" target="#mipmapFilter"
///     float lodMinClamp; // @link substring="lodMinClamp" target="#lodMinClamp"
///     float lodMaxClamp; // @link substring="lodMaxClamp" target="#lodMaxClamp"
///     CompareFunction compare; // @link substring="CompareFunction" target="CompareFunction" @link substring="compare" target="#compare"
///     uint16_t maxAnisotropy; // @link substring="maxAnisotropy" target="#maxAnisotropy"
/// } SamplerDescriptor;
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
public record SamplerDescriptor(@NotNull MemorySegment segment) implements ISamplerDescriptor {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SamplerDescriptor}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISamplerDescriptor to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SamplerDescriptor.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISamplerDescriptor, Iterable<SamplerDescriptor> {
        public long size() {
            return segment.byteSize() / SamplerDescriptor.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SamplerDescriptor at(long index) {
            return new SamplerDescriptor(segment.asSlice(index * SamplerDescriptor.BYTES, SamplerDescriptor.BYTES));
        }

        public void write(long index, @NotNull SamplerDescriptor value) {
            MemorySegment s = segment.asSlice(index * SamplerDescriptor.BYTES, SamplerDescriptor.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SamplerDescriptor.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SamplerDescriptor.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SamplerDescriptor.BYTES,
                (end - start) * SamplerDescriptor.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SamplerDescriptor.BYTES));
        }

        public SamplerDescriptor[] toArray() {
            SamplerDescriptor[] ret = new SamplerDescriptor[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SamplerDescriptor> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SamplerDescriptor> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SamplerDescriptor.BYTES;
            }

            @Override
            public SamplerDescriptor next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SamplerDescriptor ret = new SamplerDescriptor(segment.asSlice(0, SamplerDescriptor.BYTES));
                segment = segment.asSlice(SamplerDescriptor.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SamplerDescriptor allocate(Arena arena) {
        return new SamplerDescriptor(arena.allocate(LAYOUT));
    }

    public static SamplerDescriptor.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SamplerDescriptor.Ptr(segment);
    }

    public static SamplerDescriptor clone(Arena arena, SamplerDescriptor src) {
        SamplerDescriptor ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public SamplerDescriptor nextInChain(@Nullable IChainedStruct value) {
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

    public @NotNull StringView label() {
        return new StringView(segment.asSlice(OFFSET$label, LAYOUT$label));
    }

    public SamplerDescriptor label(@NotNull StringView value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$label, SIZE$label);
        return this;
    }

    public SamplerDescriptor label(Consumer<@NotNull StringView> consumer) {
        consumer.accept(label());
        return this;
    }

    public @EnumType(AddressMode.class) int addressModeU() {
        return segment.get(LAYOUT$addressModeU, OFFSET$addressModeU);
    }

    public SamplerDescriptor addressModeU(@EnumType(AddressMode.class) int value) {
        segment.set(LAYOUT$addressModeU, OFFSET$addressModeU, value);
        return this;
    }

    public @EnumType(AddressMode.class) int addressModeV() {
        return segment.get(LAYOUT$addressModeV, OFFSET$addressModeV);
    }

    public SamplerDescriptor addressModeV(@EnumType(AddressMode.class) int value) {
        segment.set(LAYOUT$addressModeV, OFFSET$addressModeV, value);
        return this;
    }

    public @EnumType(AddressMode.class) int addressModeW() {
        return segment.get(LAYOUT$addressModeW, OFFSET$addressModeW);
    }

    public SamplerDescriptor addressModeW(@EnumType(AddressMode.class) int value) {
        segment.set(LAYOUT$addressModeW, OFFSET$addressModeW, value);
        return this;
    }

    public @EnumType(FilterMode.class) int magFilter() {
        return segment.get(LAYOUT$magFilter, OFFSET$magFilter);
    }

    public SamplerDescriptor magFilter(@EnumType(FilterMode.class) int value) {
        segment.set(LAYOUT$magFilter, OFFSET$magFilter, value);
        return this;
    }

    public @EnumType(FilterMode.class) int minFilter() {
        return segment.get(LAYOUT$minFilter, OFFSET$minFilter);
    }

    public SamplerDescriptor minFilter(@EnumType(FilterMode.class) int value) {
        segment.set(LAYOUT$minFilter, OFFSET$minFilter, value);
        return this;
    }

    public @EnumType(MipmapFilterMode.class) int mipmapFilter() {
        return segment.get(LAYOUT$mipmapFilter, OFFSET$mipmapFilter);
    }

    public SamplerDescriptor mipmapFilter(@EnumType(MipmapFilterMode.class) int value) {
        segment.set(LAYOUT$mipmapFilter, OFFSET$mipmapFilter, value);
        return this;
    }

    public float lodMinClamp() {
        return segment.get(LAYOUT$lodMinClamp, OFFSET$lodMinClamp);
    }

    public SamplerDescriptor lodMinClamp(float value) {
        segment.set(LAYOUT$lodMinClamp, OFFSET$lodMinClamp, value);
        return this;
    }

    public float lodMaxClamp() {
        return segment.get(LAYOUT$lodMaxClamp, OFFSET$lodMaxClamp);
    }

    public SamplerDescriptor lodMaxClamp(float value) {
        segment.set(LAYOUT$lodMaxClamp, OFFSET$lodMaxClamp, value);
        return this;
    }

    public @EnumType(CompareFunction.class) int compare() {
        return segment.get(LAYOUT$compare, OFFSET$compare);
    }

    public SamplerDescriptor compare(@EnumType(CompareFunction.class) int value) {
        segment.set(LAYOUT$compare, OFFSET$compare, value);
        return this;
    }

    public @Unsigned short maxAnisotropy() {
        return segment.get(LAYOUT$maxAnisotropy, OFFSET$maxAnisotropy);
    }

    public SamplerDescriptor maxAnisotropy(@Unsigned short value) {
        segment.set(LAYOUT$maxAnisotropy, OFFSET$maxAnisotropy, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(ChainedStruct.LAYOUT).withName("nextInChain"),
        StringView.LAYOUT.withName("label"),
        ValueLayout.JAVA_INT.withName("addressModeU"),
        ValueLayout.JAVA_INT.withName("addressModeV"),
        ValueLayout.JAVA_INT.withName("addressModeW"),
        ValueLayout.JAVA_INT.withName("magFilter"),
        ValueLayout.JAVA_INT.withName("minFilter"),
        ValueLayout.JAVA_INT.withName("mipmapFilter"),
        ValueLayout.JAVA_FLOAT.withName("lodMinClamp"),
        ValueLayout.JAVA_FLOAT.withName("lodMaxClamp"),
        ValueLayout.JAVA_INT.withName("compare"),
        ValueLayout.JAVA_SHORT.withName("maxAnisotropy")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$nextInChain = PathElement.groupElement("nextInChain");
    public static final PathElement PATH$label = PathElement.groupElement("label");
    public static final PathElement PATH$addressModeU = PathElement.groupElement("addressModeU");
    public static final PathElement PATH$addressModeV = PathElement.groupElement("addressModeV");
    public static final PathElement PATH$addressModeW = PathElement.groupElement("addressModeW");
    public static final PathElement PATH$magFilter = PathElement.groupElement("magFilter");
    public static final PathElement PATH$minFilter = PathElement.groupElement("minFilter");
    public static final PathElement PATH$mipmapFilter = PathElement.groupElement("mipmapFilter");
    public static final PathElement PATH$lodMinClamp = PathElement.groupElement("lodMinClamp");
    public static final PathElement PATH$lodMaxClamp = PathElement.groupElement("lodMaxClamp");
    public static final PathElement PATH$compare = PathElement.groupElement("compare");
    public static final PathElement PATH$maxAnisotropy = PathElement.groupElement("maxAnisotropy");

    public static final AddressLayout LAYOUT$nextInChain = (AddressLayout) LAYOUT.select(PATH$nextInChain);
    public static final StructLayout LAYOUT$label = (StructLayout) LAYOUT.select(PATH$label);
    public static final OfInt LAYOUT$addressModeU = (OfInt) LAYOUT.select(PATH$addressModeU);
    public static final OfInt LAYOUT$addressModeV = (OfInt) LAYOUT.select(PATH$addressModeV);
    public static final OfInt LAYOUT$addressModeW = (OfInt) LAYOUT.select(PATH$addressModeW);
    public static final OfInt LAYOUT$magFilter = (OfInt) LAYOUT.select(PATH$magFilter);
    public static final OfInt LAYOUT$minFilter = (OfInt) LAYOUT.select(PATH$minFilter);
    public static final OfInt LAYOUT$mipmapFilter = (OfInt) LAYOUT.select(PATH$mipmapFilter);
    public static final OfFloat LAYOUT$lodMinClamp = (OfFloat) LAYOUT.select(PATH$lodMinClamp);
    public static final OfFloat LAYOUT$lodMaxClamp = (OfFloat) LAYOUT.select(PATH$lodMaxClamp);
    public static final OfInt LAYOUT$compare = (OfInt) LAYOUT.select(PATH$compare);
    public static final OfShort LAYOUT$maxAnisotropy = (OfShort) LAYOUT.select(PATH$maxAnisotropy);

    public static final long SIZE$nextInChain = LAYOUT$nextInChain.byteSize();
    public static final long SIZE$label = LAYOUT$label.byteSize();
    public static final long SIZE$addressModeU = LAYOUT$addressModeU.byteSize();
    public static final long SIZE$addressModeV = LAYOUT$addressModeV.byteSize();
    public static final long SIZE$addressModeW = LAYOUT$addressModeW.byteSize();
    public static final long SIZE$magFilter = LAYOUT$magFilter.byteSize();
    public static final long SIZE$minFilter = LAYOUT$minFilter.byteSize();
    public static final long SIZE$mipmapFilter = LAYOUT$mipmapFilter.byteSize();
    public static final long SIZE$lodMinClamp = LAYOUT$lodMinClamp.byteSize();
    public static final long SIZE$lodMaxClamp = LAYOUT$lodMaxClamp.byteSize();
    public static final long SIZE$compare = LAYOUT$compare.byteSize();
    public static final long SIZE$maxAnisotropy = LAYOUT$maxAnisotropy.byteSize();

    public static final long OFFSET$nextInChain = LAYOUT.byteOffset(PATH$nextInChain);
    public static final long OFFSET$label = LAYOUT.byteOffset(PATH$label);
    public static final long OFFSET$addressModeU = LAYOUT.byteOffset(PATH$addressModeU);
    public static final long OFFSET$addressModeV = LAYOUT.byteOffset(PATH$addressModeV);
    public static final long OFFSET$addressModeW = LAYOUT.byteOffset(PATH$addressModeW);
    public static final long OFFSET$magFilter = LAYOUT.byteOffset(PATH$magFilter);
    public static final long OFFSET$minFilter = LAYOUT.byteOffset(PATH$minFilter);
    public static final long OFFSET$mipmapFilter = LAYOUT.byteOffset(PATH$mipmapFilter);
    public static final long OFFSET$lodMinClamp = LAYOUT.byteOffset(PATH$lodMinClamp);
    public static final long OFFSET$lodMaxClamp = LAYOUT.byteOffset(PATH$lodMaxClamp);
    public static final long OFFSET$compare = LAYOUT.byteOffset(PATH$compare);
    public static final long OFFSET$maxAnisotropy = LAYOUT.byteOffset(PATH$maxAnisotropy);
}
