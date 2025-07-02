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

/// Represents a pointer to a {@code WGPUFutureWaitInfo} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPUFutureWaitInfo {
///     WGPUFuture future; // @link substring="WGPUFuture" target="WGPUFuture" @link substring="future" target="#future"
///     WGPUBool completed; // @link substring="completed" target="#completed"
/// } WGPUFutureWaitInfo;
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
public record WGPUFutureWaitInfo(@NotNull MemorySegment segment) implements IWGPUFutureWaitInfo {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUFutureWaitInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUFutureWaitInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUFutureWaitInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUFutureWaitInfo, Iterable<WGPUFutureWaitInfo> {
        public long size() {
            return segment.byteSize() / WGPUFutureWaitInfo.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUFutureWaitInfo at(long index) {
            return new WGPUFutureWaitInfo(segment.asSlice(index * WGPUFutureWaitInfo.BYTES, WGPUFutureWaitInfo.BYTES));
        }

        public WGPUFutureWaitInfo.Ptr at(long index, @NotNull Consumer<@NotNull WGPUFutureWaitInfo> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUFutureWaitInfo value) {
            MemorySegment s = segment.asSlice(index * WGPUFutureWaitInfo.BYTES, WGPUFutureWaitInfo.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUFutureWaitInfo.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUFutureWaitInfo.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUFutureWaitInfo.BYTES,
                (end - start) * WGPUFutureWaitInfo.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUFutureWaitInfo.BYTES));
        }

        public WGPUFutureWaitInfo[] toArray() {
            WGPUFutureWaitInfo[] ret = new WGPUFutureWaitInfo[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUFutureWaitInfo> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUFutureWaitInfo> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUFutureWaitInfo.BYTES;
            }

            @Override
            public WGPUFutureWaitInfo next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUFutureWaitInfo ret = new WGPUFutureWaitInfo(segment.asSlice(0, WGPUFutureWaitInfo.BYTES));
                segment = segment.asSlice(WGPUFutureWaitInfo.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUFutureWaitInfo allocate(Arena arena) {
        return new WGPUFutureWaitInfo(arena.allocate(LAYOUT));
    }

    public static WGPUFutureWaitInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUFutureWaitInfo.Ptr(segment);
    }

    public static WGPUFutureWaitInfo clone(Arena arena, WGPUFutureWaitInfo src) {
        WGPUFutureWaitInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NotNull WGPUFuture future() {
        return new WGPUFuture(segment.asSlice(OFFSET$future, LAYOUT$future));
    }

    public WGPUFutureWaitInfo future(@NotNull WGPUFuture value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$future, SIZE$future);
        return this;
    }

    public WGPUFutureWaitInfo future(Consumer<@NotNull WGPUFuture> consumer) {
        consumer.accept(future());
        return this;
    }

    public @NativeType("WGPUBool") @Unsigned int completed() {
        return segment.get(LAYOUT$completed, OFFSET$completed);
    }

    public WGPUFutureWaitInfo completed(@NativeType("WGPUBool") @Unsigned int value) {
        segment.set(LAYOUT$completed, OFFSET$completed, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        WGPUFuture.LAYOUT.withName("future"),
        ValueLayout.JAVA_INT.withName("completed")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$future = PathElement.groupElement("future");
    public static final PathElement PATH$completed = PathElement.groupElement("completed");

    public static final StructLayout LAYOUT$future = (StructLayout) LAYOUT.select(PATH$future);
    public static final OfInt LAYOUT$completed = (OfInt) LAYOUT.select(PATH$completed);

    public static final long SIZE$future = LAYOUT$future.byteSize();
    public static final long SIZE$completed = LAYOUT$completed.byteSize();

    public static final long OFFSET$future = LAYOUT.byteOffset(PATH$future);
    public static final long OFFSET$completed = LAYOUT.byteOffset(PATH$completed);
}
