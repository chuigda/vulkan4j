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

/// Represents a pointer to a {@code WGPUStencilFaceState} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPUStencilFaceState {
///     WGPUCompareFunction compare; // @link substring="WGPUCompareFunction" target="WGPUCompareFunction" @link substring="compare" target="#compare"
///     WGPUStencilOperation failOp; // @link substring="WGPUStencilOperation" target="WGPUStencilOperation" @link substring="failOp" target="#failOp"
///     WGPUStencilOperation depthFailOp; // @link substring="WGPUStencilOperation" target="WGPUStencilOperation" @link substring="depthFailOp" target="#depthFailOp"
///     WGPUStencilOperation passOp; // @link substring="WGPUStencilOperation" target="WGPUStencilOperation" @link substring="passOp" target="#passOp"
/// } WGPUStencilFaceState;
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
public record WGPUStencilFaceState(@NotNull MemorySegment segment) implements IWGPUStencilFaceState {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUStencilFaceState}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUStencilFaceState to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUStencilFaceState.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUStencilFaceState, Iterable<WGPUStencilFaceState> {
        public long size() {
            return segment.byteSize() / WGPUStencilFaceState.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUStencilFaceState at(long index) {
            return new WGPUStencilFaceState(segment.asSlice(index * WGPUStencilFaceState.BYTES, WGPUStencilFaceState.BYTES));
        }

        public WGPUStencilFaceState.Ptr at(long index, @NotNull Consumer<@NotNull WGPUStencilFaceState> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUStencilFaceState value) {
            MemorySegment s = segment.asSlice(index * WGPUStencilFaceState.BYTES, WGPUStencilFaceState.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUStencilFaceState.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUStencilFaceState.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUStencilFaceState.BYTES,
                (end - start) * WGPUStencilFaceState.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUStencilFaceState.BYTES));
        }

        public WGPUStencilFaceState[] toArray() {
            WGPUStencilFaceState[] ret = new WGPUStencilFaceState[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUStencilFaceState> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUStencilFaceState> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUStencilFaceState.BYTES;
            }

            @Override
            public WGPUStencilFaceState next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUStencilFaceState ret = new WGPUStencilFaceState(segment.asSlice(0, WGPUStencilFaceState.BYTES));
                segment = segment.asSlice(WGPUStencilFaceState.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUStencilFaceState allocate(Arena arena) {
        return new WGPUStencilFaceState(arena.allocate(LAYOUT));
    }

    public static WGPUStencilFaceState.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUStencilFaceState.Ptr(segment);
    }

    public static WGPUStencilFaceState clone(Arena arena, WGPUStencilFaceState src) {
        WGPUStencilFaceState ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(WGPUCompareFunction.class) int compare() {
        return segment.get(LAYOUT$compare, OFFSET$compare);
    }

    public WGPUStencilFaceState compare(@EnumType(WGPUCompareFunction.class) int value) {
        segment.set(LAYOUT$compare, OFFSET$compare, value);
        return this;
    }

    public @EnumType(WGPUStencilOperation.class) int failOp() {
        return segment.get(LAYOUT$failOp, OFFSET$failOp);
    }

    public WGPUStencilFaceState failOp(@EnumType(WGPUStencilOperation.class) int value) {
        segment.set(LAYOUT$failOp, OFFSET$failOp, value);
        return this;
    }

    public @EnumType(WGPUStencilOperation.class) int depthFailOp() {
        return segment.get(LAYOUT$depthFailOp, OFFSET$depthFailOp);
    }

    public WGPUStencilFaceState depthFailOp(@EnumType(WGPUStencilOperation.class) int value) {
        segment.set(LAYOUT$depthFailOp, OFFSET$depthFailOp, value);
        return this;
    }

    public @EnumType(WGPUStencilOperation.class) int passOp() {
        return segment.get(LAYOUT$passOp, OFFSET$passOp);
    }

    public WGPUStencilFaceState passOp(@EnumType(WGPUStencilOperation.class) int value) {
        segment.set(LAYOUT$passOp, OFFSET$passOp, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("compare"),
        ValueLayout.JAVA_INT.withName("failOp"),
        ValueLayout.JAVA_INT.withName("depthFailOp"),
        ValueLayout.JAVA_INT.withName("passOp")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$compare = PathElement.groupElement("compare");
    public static final PathElement PATH$failOp = PathElement.groupElement("failOp");
    public static final PathElement PATH$depthFailOp = PathElement.groupElement("depthFailOp");
    public static final PathElement PATH$passOp = PathElement.groupElement("passOp");

    public static final OfInt LAYOUT$compare = (OfInt) LAYOUT.select(PATH$compare);
    public static final OfInt LAYOUT$failOp = (OfInt) LAYOUT.select(PATH$failOp);
    public static final OfInt LAYOUT$depthFailOp = (OfInt) LAYOUT.select(PATH$depthFailOp);
    public static final OfInt LAYOUT$passOp = (OfInt) LAYOUT.select(PATH$passOp);

    public static final long SIZE$compare = LAYOUT$compare.byteSize();
    public static final long SIZE$failOp = LAYOUT$failOp.byteSize();
    public static final long SIZE$depthFailOp = LAYOUT$depthFailOp.byteSize();
    public static final long SIZE$passOp = LAYOUT$passOp.byteSize();

    public static final long OFFSET$compare = LAYOUT.byteOffset(PATH$compare);
    public static final long OFFSET$failOp = LAYOUT.byteOffset(PATH$failOp);
    public static final long OFFSET$depthFailOp = LAYOUT.byteOffset(PATH$depthFailOp);
    public static final long OFFSET$passOp = LAYOUT.byteOffset(PATH$passOp);
}
