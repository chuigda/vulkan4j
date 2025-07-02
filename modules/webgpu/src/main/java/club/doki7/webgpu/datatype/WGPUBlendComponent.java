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

/// Represents a pointer to a {@code WGPUBlendComponent} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPUBlendComponent {
///     WGPUBlendOperation operation; // @link substring="WGPUBlendOperation" target="WGPUBlendOperation" @link substring="operation" target="#operation"
///     WGPUBlendFactor srcFactor; // @link substring="WGPUBlendFactor" target="WGPUBlendFactor" @link substring="srcFactor" target="#srcFactor"
///     WGPUBlendFactor dstFactor; // @link substring="WGPUBlendFactor" target="WGPUBlendFactor" @link substring="dstFactor" target="#dstFactor"
/// } WGPUBlendComponent;
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
public record WGPUBlendComponent(@NotNull MemorySegment segment) implements IWGPUBlendComponent {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUBlendComponent}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUBlendComponent to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUBlendComponent.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUBlendComponent, Iterable<WGPUBlendComponent> {
        public long size() {
            return segment.byteSize() / WGPUBlendComponent.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUBlendComponent at(long index) {
            return new WGPUBlendComponent(segment.asSlice(index * WGPUBlendComponent.BYTES, WGPUBlendComponent.BYTES));
        }

        public WGPUBlendComponent.Ptr at(long index, @NotNull Consumer<@NotNull WGPUBlendComponent> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUBlendComponent value) {
            MemorySegment s = segment.asSlice(index * WGPUBlendComponent.BYTES, WGPUBlendComponent.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUBlendComponent.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUBlendComponent.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUBlendComponent.BYTES,
                (end - start) * WGPUBlendComponent.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUBlendComponent.BYTES));
        }

        public WGPUBlendComponent[] toArray() {
            WGPUBlendComponent[] ret = new WGPUBlendComponent[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUBlendComponent> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUBlendComponent> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUBlendComponent.BYTES;
            }

            @Override
            public WGPUBlendComponent next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUBlendComponent ret = new WGPUBlendComponent(segment.asSlice(0, WGPUBlendComponent.BYTES));
                segment = segment.asSlice(WGPUBlendComponent.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUBlendComponent allocate(Arena arena) {
        return new WGPUBlendComponent(arena.allocate(LAYOUT));
    }

    public static WGPUBlendComponent.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUBlendComponent.Ptr(segment);
    }

    public static WGPUBlendComponent clone(Arena arena, WGPUBlendComponent src) {
        WGPUBlendComponent ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(WGPUBlendOperation.class) int operation() {
        return segment.get(LAYOUT$operation, OFFSET$operation);
    }

    public WGPUBlendComponent operation(@EnumType(WGPUBlendOperation.class) int value) {
        segment.set(LAYOUT$operation, OFFSET$operation, value);
        return this;
    }

    public @EnumType(WGPUBlendFactor.class) int srcFactor() {
        return segment.get(LAYOUT$srcFactor, OFFSET$srcFactor);
    }

    public WGPUBlendComponent srcFactor(@EnumType(WGPUBlendFactor.class) int value) {
        segment.set(LAYOUT$srcFactor, OFFSET$srcFactor, value);
        return this;
    }

    public @EnumType(WGPUBlendFactor.class) int dstFactor() {
        return segment.get(LAYOUT$dstFactor, OFFSET$dstFactor);
    }

    public WGPUBlendComponent dstFactor(@EnumType(WGPUBlendFactor.class) int value) {
        segment.set(LAYOUT$dstFactor, OFFSET$dstFactor, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("operation"),
        ValueLayout.JAVA_INT.withName("srcFactor"),
        ValueLayout.JAVA_INT.withName("dstFactor")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$operation = PathElement.groupElement("operation");
    public static final PathElement PATH$srcFactor = PathElement.groupElement("srcFactor");
    public static final PathElement PATH$dstFactor = PathElement.groupElement("dstFactor");

    public static final OfInt LAYOUT$operation = (OfInt) LAYOUT.select(PATH$operation);
    public static final OfInt LAYOUT$srcFactor = (OfInt) LAYOUT.select(PATH$srcFactor);
    public static final OfInt LAYOUT$dstFactor = (OfInt) LAYOUT.select(PATH$dstFactor);

    public static final long SIZE$operation = LAYOUT$operation.byteSize();
    public static final long SIZE$srcFactor = LAYOUT$srcFactor.byteSize();
    public static final long SIZE$dstFactor = LAYOUT$dstFactor.byteSize();

    public static final long OFFSET$operation = LAYOUT.byteOffset(PATH$operation);
    public static final long OFFSET$srcFactor = LAYOUT.byteOffset(PATH$srcFactor);
    public static final long OFFSET$dstFactor = LAYOUT.byteOffset(PATH$dstFactor);
}
