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

/// Represents a pointer to a {@code SamplerBindingLayout} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SamplerBindingLayout {
///     ChainedStruct* nextInChain; // @link substring="ChainedStruct" target="ChainedStruct" @link substring="nextInChain" target="#nextInChain"
///     SamplerBindingType type; // @link substring="SamplerBindingType" target="SamplerBindingType" @link substring="type" target="#type"
/// } SamplerBindingLayout;
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
public record SamplerBindingLayout(@NotNull MemorySegment segment) implements ISamplerBindingLayout {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SamplerBindingLayout}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISamplerBindingLayout to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SamplerBindingLayout.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISamplerBindingLayout, Iterable<SamplerBindingLayout> {
        public long size() {
            return segment.byteSize() / SamplerBindingLayout.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SamplerBindingLayout at(long index) {
            return new SamplerBindingLayout(segment.asSlice(index * SamplerBindingLayout.BYTES, SamplerBindingLayout.BYTES));
        }

        public void write(long index, @NotNull SamplerBindingLayout value) {
            MemorySegment s = segment.asSlice(index * SamplerBindingLayout.BYTES, SamplerBindingLayout.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SamplerBindingLayout.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SamplerBindingLayout.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SamplerBindingLayout.BYTES,
                (end - start) * SamplerBindingLayout.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SamplerBindingLayout.BYTES));
        }

        public SamplerBindingLayout[] toArray() {
            SamplerBindingLayout[] ret = new SamplerBindingLayout[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SamplerBindingLayout> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SamplerBindingLayout> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SamplerBindingLayout.BYTES;
            }

            @Override
            public SamplerBindingLayout next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SamplerBindingLayout ret = new SamplerBindingLayout(segment.asSlice(0, SamplerBindingLayout.BYTES));
                segment = segment.asSlice(SamplerBindingLayout.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SamplerBindingLayout allocate(Arena arena) {
        return new SamplerBindingLayout(arena.allocate(LAYOUT));
    }

    public static SamplerBindingLayout.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SamplerBindingLayout.Ptr(segment);
    }

    public static SamplerBindingLayout clone(Arena arena, SamplerBindingLayout src) {
        SamplerBindingLayout ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public SamplerBindingLayout nextInChain(@Nullable IChainedStruct value) {
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

    public @EnumType(SamplerBindingType.class) int type() {
        return segment.get(LAYOUT$type, OFFSET$type);
    }

    public SamplerBindingLayout type(@EnumType(SamplerBindingType.class) int value) {
        segment.set(LAYOUT$type, OFFSET$type, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(ChainedStruct.LAYOUT).withName("nextInChain"),
        ValueLayout.JAVA_INT.withName("type")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$nextInChain = PathElement.groupElement("nextInChain");
    public static final PathElement PATH$type = PathElement.groupElement("type");

    public static final AddressLayout LAYOUT$nextInChain = (AddressLayout) LAYOUT.select(PATH$nextInChain);
    public static final OfInt LAYOUT$type = (OfInt) LAYOUT.select(PATH$type);

    public static final long SIZE$nextInChain = LAYOUT$nextInChain.byteSize();
    public static final long SIZE$type = LAYOUT$type.byteSize();

    public static final long OFFSET$nextInChain = LAYOUT.byteOffset(PATH$nextInChain);
    public static final long OFFSET$type = LAYOUT.byteOffset(PATH$type);
}
