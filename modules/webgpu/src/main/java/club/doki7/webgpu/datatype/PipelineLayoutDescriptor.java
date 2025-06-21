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

/// Represents a pointer to a {@code PipelineLayoutDescriptor} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct PipelineLayoutDescriptor {
///     ChainedStruct* nextInChain; // @link substring="ChainedStruct" target="ChainedStruct" @link substring="nextInChain" target="#nextInChain"
///     StringView label; // @link substring="StringView" target="StringView" @link substring="label" target="#label"
///     size_t bindGroupLayoutCount; // @link substring="bindGroupLayoutCount" target="#bindGroupLayoutCount"
///     BindGroupLayout const* bindGroupLayouts; // @link substring="BindGroupLayout" target="BindGroupLayout" @link substring="bindGroupLayouts" target="#bindGroupLayouts"
///     uint32_t immediateSize; // @link substring="immediateSize" target="#immediateSize"
/// } PipelineLayoutDescriptor;
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
public record PipelineLayoutDescriptor(@NotNull MemorySegment segment) implements IPipelineLayoutDescriptor {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link PipelineLayoutDescriptor}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IPipelineLayoutDescriptor to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code PipelineLayoutDescriptor.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IPipelineLayoutDescriptor, Iterable<PipelineLayoutDescriptor> {
        public long size() {
            return segment.byteSize() / PipelineLayoutDescriptor.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull PipelineLayoutDescriptor at(long index) {
            return new PipelineLayoutDescriptor(segment.asSlice(index * PipelineLayoutDescriptor.BYTES, PipelineLayoutDescriptor.BYTES));
        }

        public void write(long index, @NotNull PipelineLayoutDescriptor value) {
            MemorySegment s = segment.asSlice(index * PipelineLayoutDescriptor.BYTES, PipelineLayoutDescriptor.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * PipelineLayoutDescriptor.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * PipelineLayoutDescriptor.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * PipelineLayoutDescriptor.BYTES,
                (end - start) * PipelineLayoutDescriptor.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * PipelineLayoutDescriptor.BYTES));
        }

        public PipelineLayoutDescriptor[] toArray() {
            PipelineLayoutDescriptor[] ret = new PipelineLayoutDescriptor[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<PipelineLayoutDescriptor> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<PipelineLayoutDescriptor> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= PipelineLayoutDescriptor.BYTES;
            }

            @Override
            public PipelineLayoutDescriptor next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                PipelineLayoutDescriptor ret = new PipelineLayoutDescriptor(segment.asSlice(0, PipelineLayoutDescriptor.BYTES));
                segment = segment.asSlice(PipelineLayoutDescriptor.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static PipelineLayoutDescriptor allocate(Arena arena) {
        return new PipelineLayoutDescriptor(arena.allocate(LAYOUT));
    }

    public static PipelineLayoutDescriptor.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new PipelineLayoutDescriptor.Ptr(segment);
    }

    public static PipelineLayoutDescriptor clone(Arena arena, PipelineLayoutDescriptor src) {
        PipelineLayoutDescriptor ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public PipelineLayoutDescriptor nextInChain(@Nullable IChainedStruct value) {
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

    public PipelineLayoutDescriptor label(@NotNull StringView value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$label, SIZE$label);
        return this;
    }

    public PipelineLayoutDescriptor label(Consumer<@NotNull StringView> consumer) {
        consumer.accept(label());
        return this;
    }

    public @Unsigned long bindGroupLayoutCount() {
        return NativeLayout.readCSizeT(segment, OFFSET$bindGroupLayoutCount);
    }

    public PipelineLayoutDescriptor bindGroupLayoutCount(@Unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$bindGroupLayoutCount, value);
        return this;
    }

    /// Note: the returned {@link BindGroupLayout.Ptr} does not have correct {@link BindGroupLayout.Ptr#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link BindGroupLayout.Ptr#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable BindGroupLayout.Ptr bindGroupLayouts() {
        MemorySegment s = bindGroupLayoutsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new BindGroupLayout.Ptr(s);
    }

    public PipelineLayoutDescriptor bindGroupLayouts(@Nullable BindGroupLayout.Ptr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        bindGroupLayoutsRaw(s);
        return this;
    }

    public @Pointer(target=BindGroupLayout.class) MemorySegment bindGroupLayoutsRaw() {
        return segment.get(LAYOUT$bindGroupLayouts, OFFSET$bindGroupLayouts);
    }

    public void bindGroupLayoutsRaw(@Pointer(target=BindGroupLayout.class) MemorySegment value) {
        segment.set(LAYOUT$bindGroupLayouts, OFFSET$bindGroupLayouts, value);
    }

    public @Unsigned int immediateSize() {
        return segment.get(LAYOUT$immediateSize, OFFSET$immediateSize);
    }

    public PipelineLayoutDescriptor immediateSize(@Unsigned int value) {
        segment.set(LAYOUT$immediateSize, OFFSET$immediateSize, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(ChainedStruct.LAYOUT).withName("nextInChain"),
        StringView.LAYOUT.withName("label"),
        NativeLayout.C_SIZE_T.withName("bindGroupLayoutCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("bindGroupLayouts"),
        ValueLayout.JAVA_INT.withName("immediateSize")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$nextInChain = PathElement.groupElement("nextInChain");
    public static final PathElement PATH$label = PathElement.groupElement("label");
    public static final PathElement PATH$bindGroupLayoutCount = PathElement.groupElement("bindGroupLayoutCount");
    public static final PathElement PATH$bindGroupLayouts = PathElement.groupElement("bindGroupLayouts");
    public static final PathElement PATH$immediateSize = PathElement.groupElement("immediateSize");

    public static final AddressLayout LAYOUT$nextInChain = (AddressLayout) LAYOUT.select(PATH$nextInChain);
    public static final StructLayout LAYOUT$label = (StructLayout) LAYOUT.select(PATH$label);
    public static final AddressLayout LAYOUT$bindGroupLayouts = (AddressLayout) LAYOUT.select(PATH$bindGroupLayouts);
    public static final OfInt LAYOUT$immediateSize = (OfInt) LAYOUT.select(PATH$immediateSize);

    public static final long SIZE$nextInChain = LAYOUT$nextInChain.byteSize();
    public static final long SIZE$label = LAYOUT$label.byteSize();
    public static final long SIZE$bindGroupLayoutCount = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$bindGroupLayouts = LAYOUT$bindGroupLayouts.byteSize();
    public static final long SIZE$immediateSize = LAYOUT$immediateSize.byteSize();

    public static final long OFFSET$nextInChain = LAYOUT.byteOffset(PATH$nextInChain);
    public static final long OFFSET$label = LAYOUT.byteOffset(PATH$label);
    public static final long OFFSET$bindGroupLayoutCount = LAYOUT.byteOffset(PATH$bindGroupLayoutCount);
    public static final long OFFSET$bindGroupLayouts = LAYOUT.byteOffset(PATH$bindGroupLayouts);
    public static final long OFFSET$immediateSize = LAYOUT.byteOffset(PATH$immediateSize);
}
