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

/// Represents a pointer to a {@code WGPUPrimitiveState} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPUPrimitiveState {
///     WGPUChainedStruct const* nextInChain; // optional // @link substring="WGPUChainedStruct" target="WGPUChainedStruct" @link substring="nextInChain" target="#nextInChain"
///     WGPUPrimitiveTopology topology; // @link substring="WGPUPrimitiveTopology" target="WGPUPrimitiveTopology" @link substring="topology" target="#topology"
///     WGPUIndexFormat stripIndexFormat; // @link substring="WGPUIndexFormat" target="WGPUIndexFormat" @link substring="stripIndexFormat" target="#stripIndexFormat"
///     WGPUFrontFace frontFace; // @link substring="WGPUFrontFace" target="WGPUFrontFace" @link substring="frontFace" target="#frontFace"
///     WGPUCullMode cullMode; // @link substring="WGPUCullMode" target="WGPUCullMode" @link substring="cullMode" target="#cullMode"
///     WGPUBool unclippedDepth; // @link substring="unclippedDepth" target="#unclippedDepth"
/// } WGPUPrimitiveState;
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
public record WGPUPrimitiveState(@NotNull MemorySegment segment) implements IWGPUPrimitiveState {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUPrimitiveState}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUPrimitiveState to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUPrimitiveState.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUPrimitiveState, Iterable<WGPUPrimitiveState> {
        public long size() {
            return segment.byteSize() / WGPUPrimitiveState.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUPrimitiveState at(long index) {
            return new WGPUPrimitiveState(segment.asSlice(index * WGPUPrimitiveState.BYTES, WGPUPrimitiveState.BYTES));
        }

        public WGPUPrimitiveState.Ptr at(long index, @NotNull Consumer<@NotNull WGPUPrimitiveState> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUPrimitiveState value) {
            MemorySegment s = segment.asSlice(index * WGPUPrimitiveState.BYTES, WGPUPrimitiveState.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUPrimitiveState.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUPrimitiveState.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUPrimitiveState.BYTES,
                (end - start) * WGPUPrimitiveState.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUPrimitiveState.BYTES));
        }

        public WGPUPrimitiveState[] toArray() {
            WGPUPrimitiveState[] ret = new WGPUPrimitiveState[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUPrimitiveState> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUPrimitiveState> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUPrimitiveState.BYTES;
            }

            @Override
            public WGPUPrimitiveState next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUPrimitiveState ret = new WGPUPrimitiveState(segment.asSlice(0, WGPUPrimitiveState.BYTES));
                segment = segment.asSlice(WGPUPrimitiveState.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUPrimitiveState allocate(Arena arena) {
        return new WGPUPrimitiveState(arena.allocate(LAYOUT));
    }

    public static WGPUPrimitiveState.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUPrimitiveState.Ptr(segment);
    }

    public static WGPUPrimitiveState clone(Arena arena, WGPUPrimitiveState src) {
        WGPUPrimitiveState ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public WGPUPrimitiveState nextInChain(@Nullable IWGPUChainedStruct value) {
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

    public @EnumType(WGPUPrimitiveTopology.class) int topology() {
        return segment.get(LAYOUT$topology, OFFSET$topology);
    }

    public WGPUPrimitiveState topology(@EnumType(WGPUPrimitiveTopology.class) int value) {
        segment.set(LAYOUT$topology, OFFSET$topology, value);
        return this;
    }

    public @EnumType(WGPUIndexFormat.class) int stripIndexFormat() {
        return segment.get(LAYOUT$stripIndexFormat, OFFSET$stripIndexFormat);
    }

    public WGPUPrimitiveState stripIndexFormat(@EnumType(WGPUIndexFormat.class) int value) {
        segment.set(LAYOUT$stripIndexFormat, OFFSET$stripIndexFormat, value);
        return this;
    }

    public @EnumType(WGPUFrontFace.class) int frontFace() {
        return segment.get(LAYOUT$frontFace, OFFSET$frontFace);
    }

    public WGPUPrimitiveState frontFace(@EnumType(WGPUFrontFace.class) int value) {
        segment.set(LAYOUT$frontFace, OFFSET$frontFace, value);
        return this;
    }

    public @EnumType(WGPUCullMode.class) int cullMode() {
        return segment.get(LAYOUT$cullMode, OFFSET$cullMode);
    }

    public WGPUPrimitiveState cullMode(@EnumType(WGPUCullMode.class) int value) {
        segment.set(LAYOUT$cullMode, OFFSET$cullMode, value);
        return this;
    }

    public @NativeType("WGPUBool") @Unsigned int unclippedDepth() {
        return segment.get(LAYOUT$unclippedDepth, OFFSET$unclippedDepth);
    }

    public WGPUPrimitiveState unclippedDepth(@NativeType("WGPUBool") @Unsigned int value) {
        segment.set(LAYOUT$unclippedDepth, OFFSET$unclippedDepth, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(WGPUChainedStruct.LAYOUT).withName("nextInChain"),
        ValueLayout.JAVA_INT.withName("topology"),
        ValueLayout.JAVA_INT.withName("stripIndexFormat"),
        ValueLayout.JAVA_INT.withName("frontFace"),
        ValueLayout.JAVA_INT.withName("cullMode"),
        ValueLayout.JAVA_INT.withName("unclippedDepth")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$nextInChain = PathElement.groupElement("nextInChain");
    public static final PathElement PATH$topology = PathElement.groupElement("topology");
    public static final PathElement PATH$stripIndexFormat = PathElement.groupElement("stripIndexFormat");
    public static final PathElement PATH$frontFace = PathElement.groupElement("frontFace");
    public static final PathElement PATH$cullMode = PathElement.groupElement("cullMode");
    public static final PathElement PATH$unclippedDepth = PathElement.groupElement("unclippedDepth");

    public static final AddressLayout LAYOUT$nextInChain = (AddressLayout) LAYOUT.select(PATH$nextInChain);
    public static final OfInt LAYOUT$topology = (OfInt) LAYOUT.select(PATH$topology);
    public static final OfInt LAYOUT$stripIndexFormat = (OfInt) LAYOUT.select(PATH$stripIndexFormat);
    public static final OfInt LAYOUT$frontFace = (OfInt) LAYOUT.select(PATH$frontFace);
    public static final OfInt LAYOUT$cullMode = (OfInt) LAYOUT.select(PATH$cullMode);
    public static final OfInt LAYOUT$unclippedDepth = (OfInt) LAYOUT.select(PATH$unclippedDepth);

    public static final long SIZE$nextInChain = LAYOUT$nextInChain.byteSize();
    public static final long SIZE$topology = LAYOUT$topology.byteSize();
    public static final long SIZE$stripIndexFormat = LAYOUT$stripIndexFormat.byteSize();
    public static final long SIZE$frontFace = LAYOUT$frontFace.byteSize();
    public static final long SIZE$cullMode = LAYOUT$cullMode.byteSize();
    public static final long SIZE$unclippedDepth = LAYOUT$unclippedDepth.byteSize();

    public static final long OFFSET$nextInChain = LAYOUT.byteOffset(PATH$nextInChain);
    public static final long OFFSET$topology = LAYOUT.byteOffset(PATH$topology);
    public static final long OFFSET$stripIndexFormat = LAYOUT.byteOffset(PATH$stripIndexFormat);
    public static final long OFFSET$frontFace = LAYOUT.byteOffset(PATH$frontFace);
    public static final long OFFSET$cullMode = LAYOUT.byteOffset(PATH$cullMode);
    public static final long OFFSET$unclippedDepth = LAYOUT.byteOffset(PATH$unclippedDepth);
}
