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

/// Represents a pointer to a {@code WGPUPushConstantRange} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPUPushConstantRange {
///     WGPUShaderStage stages; // @link substring="WGPUShaderStage" target="WGPUShaderStage" @link substring="stages" target="#stages"
///     uint32_t start; // @link substring="start" target="#start"
///     uint32_t end; // @link substring="end" target="#end"
/// } WGPUPushConstantRange;
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
public record WGPUPushConstantRange(@NotNull MemorySegment segment) implements IWGPUPushConstantRange {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUPushConstantRange}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUPushConstantRange to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUPushConstantRange.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUPushConstantRange, Iterable<WGPUPushConstantRange> {
        public long size() {
            return segment.byteSize() / WGPUPushConstantRange.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUPushConstantRange at(long index) {
            return new WGPUPushConstantRange(segment.asSlice(index * WGPUPushConstantRange.BYTES, WGPUPushConstantRange.BYTES));
        }

        public WGPUPushConstantRange.Ptr at(long index, @NotNull Consumer<@NotNull WGPUPushConstantRange> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUPushConstantRange value) {
            MemorySegment s = segment.asSlice(index * WGPUPushConstantRange.BYTES, WGPUPushConstantRange.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUPushConstantRange.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUPushConstantRange.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUPushConstantRange.BYTES,
                (end - start) * WGPUPushConstantRange.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUPushConstantRange.BYTES));
        }

        public WGPUPushConstantRange[] toArray() {
            WGPUPushConstantRange[] ret = new WGPUPushConstantRange[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUPushConstantRange> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUPushConstantRange> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUPushConstantRange.BYTES;
            }

            @Override
            public WGPUPushConstantRange next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUPushConstantRange ret = new WGPUPushConstantRange(segment.asSlice(0, WGPUPushConstantRange.BYTES));
                segment = segment.asSlice(WGPUPushConstantRange.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUPushConstantRange allocate(Arena arena) {
        return new WGPUPushConstantRange(arena.allocate(LAYOUT));
    }

    public static WGPUPushConstantRange.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUPushConstantRange.Ptr(segment);
    }

    public static WGPUPushConstantRange clone(Arena arena, WGPUPushConstantRange src) {
        WGPUPushConstantRange ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Bitmask(WGPUShaderStage.class) long stages() {
        return segment.get(LAYOUT$stages, OFFSET$stages);
    }

    public WGPUPushConstantRange stages(@Bitmask(WGPUShaderStage.class) long value) {
        segment.set(LAYOUT$stages, OFFSET$stages, value);
        return this;
    }

    public @Unsigned int start() {
        return segment.get(LAYOUT$start, OFFSET$start);
    }

    public WGPUPushConstantRange start(@Unsigned int value) {
        segment.set(LAYOUT$start, OFFSET$start, value);
        return this;
    }

    public @Unsigned int end() {
        return segment.get(LAYOUT$end, OFFSET$end);
    }

    public WGPUPushConstantRange end(@Unsigned int value) {
        segment.set(LAYOUT$end, OFFSET$end, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("stages"),
        ValueLayout.JAVA_INT.withName("start"),
        ValueLayout.JAVA_INT.withName("end")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$stages = PathElement.groupElement("stages");
    public static final PathElement PATH$start = PathElement.groupElement("start");
    public static final PathElement PATH$end = PathElement.groupElement("end");

    public static final OfLong LAYOUT$stages = (OfLong) LAYOUT.select(PATH$stages);
    public static final OfInt LAYOUT$start = (OfInt) LAYOUT.select(PATH$start);
    public static final OfInt LAYOUT$end = (OfInt) LAYOUT.select(PATH$end);

    public static final long SIZE$stages = LAYOUT$stages.byteSize();
    public static final long SIZE$start = LAYOUT$start.byteSize();
    public static final long SIZE$end = LAYOUT$end.byteSize();

    public static final long OFFSET$stages = LAYOUT.byteOffset(PATH$stages);
    public static final long OFFSET$start = LAYOUT.byteOffset(PATH$start);
    public static final long OFFSET$end = LAYOUT.byteOffset(PATH$end);
}
