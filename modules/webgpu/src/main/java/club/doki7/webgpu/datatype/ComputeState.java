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

/// Represents a pointer to a {@code ComputeState} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct ComputeState {
///     ChainedStruct* nextInChain; // @link substring="ChainedStruct" target="ChainedStruct" @link substring="nextInChain" target="#nextInChain"
///     ShaderModule module; // @link substring="ShaderModule" target="ShaderModule" @link substring="module" target="#module"
///     StringView entryPoint; // @link substring="StringView" target="StringView" @link substring="entryPoint" target="#entryPoint"
///     size_t constantCount; // @link substring="constantCount" target="#constantCount"
///     ConstantEntry const* constants; // @link substring="ConstantEntry" target="ConstantEntry" @link substring="constants" target="#constants"
/// } ComputeState;
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
public record ComputeState(@NotNull MemorySegment segment) implements IComputeState {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link ComputeState}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IComputeState to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code ComputeState.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IComputeState, Iterable<ComputeState> {
        public long size() {
            return segment.byteSize() / ComputeState.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull ComputeState at(long index) {
            return new ComputeState(segment.asSlice(index * ComputeState.BYTES, ComputeState.BYTES));
        }

        public void write(long index, @NotNull ComputeState value) {
            MemorySegment s = segment.asSlice(index * ComputeState.BYTES, ComputeState.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * ComputeState.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * ComputeState.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * ComputeState.BYTES,
                (end - start) * ComputeState.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * ComputeState.BYTES));
        }

        public ComputeState[] toArray() {
            ComputeState[] ret = new ComputeState[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<ComputeState> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<ComputeState> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= ComputeState.BYTES;
            }

            @Override
            public ComputeState next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                ComputeState ret = new ComputeState(segment.asSlice(0, ComputeState.BYTES));
                segment = segment.asSlice(ComputeState.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static ComputeState allocate(Arena arena) {
        return new ComputeState(arena.allocate(LAYOUT));
    }

    public static ComputeState.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new ComputeState.Ptr(segment);
    }

    public static ComputeState clone(Arena arena, ComputeState src) {
        ComputeState ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public ComputeState nextInChain(@Nullable IChainedStruct value) {
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

    public @Nullable ShaderModule module() {
        MemorySegment s = segment.asSlice(OFFSET$module, SIZE$module);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new ShaderModule(s);
    }

    public ComputeState module(@Nullable ShaderModule value) {
        segment.set(LAYOUT$module, OFFSET$module, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @NotNull StringView entryPoint() {
        return new StringView(segment.asSlice(OFFSET$entryPoint, LAYOUT$entryPoint));
    }

    public ComputeState entryPoint(@NotNull StringView value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$entryPoint, SIZE$entryPoint);
        return this;
    }

    public ComputeState entryPoint(Consumer<@NotNull StringView> consumer) {
        consumer.accept(entryPoint());
        return this;
    }

    public @Unsigned long constantCount() {
        return NativeLayout.readCSizeT(segment, OFFSET$constantCount);
    }

    public ComputeState constantCount(@Unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$constantCount, value);
        return this;
    }

    public ComputeState constants(@Nullable IConstantEntry value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        constantsRaw(s);
        return this;
    }

    @Unsafe public @Nullable ConstantEntry.Ptr constants(int assumedCount) {
        MemorySegment s = constantsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * ConstantEntry.BYTES);
        return new ConstantEntry.Ptr(s);
    }

    public @Nullable ConstantEntry constants() {
        MemorySegment s = constantsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new ConstantEntry(s);
    }

    public @Pointer(target=ConstantEntry.class) MemorySegment constantsRaw() {
        return segment.get(LAYOUT$constants, OFFSET$constants);
    }

    public void constantsRaw(@Pointer(target=ConstantEntry.class) MemorySegment value) {
        segment.set(LAYOUT$constants, OFFSET$constants, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(ChainedStruct.LAYOUT).withName("nextInChain"),
        ValueLayout.ADDRESS.withName("module"),
        StringView.LAYOUT.withName("entryPoint"),
        NativeLayout.C_SIZE_T.withName("constantCount"),
        ValueLayout.ADDRESS.withTargetLayout(ConstantEntry.LAYOUT).withName("constants")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$nextInChain = PathElement.groupElement("nextInChain");
    public static final PathElement PATH$module = PathElement.groupElement("module");
    public static final PathElement PATH$entryPoint = PathElement.groupElement("entryPoint");
    public static final PathElement PATH$constantCount = PathElement.groupElement("constantCount");
    public static final PathElement PATH$constants = PathElement.groupElement("constants");

    public static final AddressLayout LAYOUT$nextInChain = (AddressLayout) LAYOUT.select(PATH$nextInChain);
    public static final AddressLayout LAYOUT$module = (AddressLayout) LAYOUT.select(PATH$module);
    public static final StructLayout LAYOUT$entryPoint = (StructLayout) LAYOUT.select(PATH$entryPoint);
    public static final AddressLayout LAYOUT$constants = (AddressLayout) LAYOUT.select(PATH$constants);

    public static final long SIZE$nextInChain = LAYOUT$nextInChain.byteSize();
    public static final long SIZE$module = LAYOUT$module.byteSize();
    public static final long SIZE$entryPoint = LAYOUT$entryPoint.byteSize();
    public static final long SIZE$constantCount = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$constants = LAYOUT$constants.byteSize();

    public static final long OFFSET$nextInChain = LAYOUT.byteOffset(PATH$nextInChain);
    public static final long OFFSET$module = LAYOUT.byteOffset(PATH$module);
    public static final long OFFSET$entryPoint = LAYOUT.byteOffset(PATH$entryPoint);
    public static final long OFFSET$constantCount = LAYOUT.byteOffset(PATH$constantCount);
    public static final long OFFSET$constants = LAYOUT.byteOffset(PATH$constants);
}
