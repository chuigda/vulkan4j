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

/// Represents a pointer to a {@code WGPURenderPassDepthStencilAttachment} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPURenderPassDepthStencilAttachment {
///     WGPUTextureView view; // @link substring="WGPUTextureView" target="WGPUTextureView" @link substring="view" target="#view"
///     WGPULoadOp depthLoadOp; // @link substring="WGPULoadOp" target="WGPULoadOp" @link substring="depthLoadOp" target="#depthLoadOp"
///     WGPUStoreOp depthStoreOp; // @link substring="WGPUStoreOp" target="WGPUStoreOp" @link substring="depthStoreOp" target="#depthStoreOp"
///     float depthClearValue; // @link substring="depthClearValue" target="#depthClearValue"
///     bool depthReadOnly; // @link substring="depthReadOnly" target="#depthReadOnly"
///     WGPULoadOp stencilLoadOp; // @link substring="WGPULoadOp" target="WGPULoadOp" @link substring="stencilLoadOp" target="#stencilLoadOp"
///     WGPUStoreOp stencilStoreOp; // @link substring="WGPUStoreOp" target="WGPUStoreOp" @link substring="stencilStoreOp" target="#stencilStoreOp"
///     uint32_t stencilClearValue; // @link substring="stencilClearValue" target="#stencilClearValue"
///     bool stencilReadOnly; // @link substring="stencilReadOnly" target="#stencilReadOnly"
/// } WGPURenderPassDepthStencilAttachment;
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
public record WGPURenderPassDepthStencilAttachment(@NotNull MemorySegment segment) implements IWGPURenderPassDepthStencilAttachment {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPURenderPassDepthStencilAttachment}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPURenderPassDepthStencilAttachment to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPURenderPassDepthStencilAttachment.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPURenderPassDepthStencilAttachment, Iterable<WGPURenderPassDepthStencilAttachment> {
        public long size() {
            return segment.byteSize() / WGPURenderPassDepthStencilAttachment.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPURenderPassDepthStencilAttachment at(long index) {
            return new WGPURenderPassDepthStencilAttachment(segment.asSlice(index * WGPURenderPassDepthStencilAttachment.BYTES, WGPURenderPassDepthStencilAttachment.BYTES));
        }

        public WGPURenderPassDepthStencilAttachment.Ptr at(long index, @NotNull Consumer<@NotNull WGPURenderPassDepthStencilAttachment> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPURenderPassDepthStencilAttachment value) {
            MemorySegment s = segment.asSlice(index * WGPURenderPassDepthStencilAttachment.BYTES, WGPURenderPassDepthStencilAttachment.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPURenderPassDepthStencilAttachment.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPURenderPassDepthStencilAttachment.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPURenderPassDepthStencilAttachment.BYTES,
                (end - start) * WGPURenderPassDepthStencilAttachment.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPURenderPassDepthStencilAttachment.BYTES));
        }

        public WGPURenderPassDepthStencilAttachment[] toArray() {
            WGPURenderPassDepthStencilAttachment[] ret = new WGPURenderPassDepthStencilAttachment[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPURenderPassDepthStencilAttachment> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPURenderPassDepthStencilAttachment> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPURenderPassDepthStencilAttachment.BYTES;
            }

            @Override
            public WGPURenderPassDepthStencilAttachment next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPURenderPassDepthStencilAttachment ret = new WGPURenderPassDepthStencilAttachment(segment.asSlice(0, WGPURenderPassDepthStencilAttachment.BYTES));
                segment = segment.asSlice(WGPURenderPassDepthStencilAttachment.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPURenderPassDepthStencilAttachment allocate(Arena arena) {
        return new WGPURenderPassDepthStencilAttachment(arena.allocate(LAYOUT));
    }

    public static WGPURenderPassDepthStencilAttachment.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPURenderPassDepthStencilAttachment.Ptr(segment);
    }

    public static WGPURenderPassDepthStencilAttachment clone(Arena arena, WGPURenderPassDepthStencilAttachment src) {
        WGPURenderPassDepthStencilAttachment ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Nullable WGPUTextureView view() {
        MemorySegment s = segment.asSlice(OFFSET$view, SIZE$view);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new WGPUTextureView(s);
    }

    public WGPURenderPassDepthStencilAttachment view(@Nullable WGPUTextureView value) {
        segment.set(LAYOUT$view, OFFSET$view, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @EnumType(WGPULoadOp.class) int depthLoadOp() {
        return segment.get(LAYOUT$depthLoadOp, OFFSET$depthLoadOp);
    }

    public WGPURenderPassDepthStencilAttachment depthLoadOp(@EnumType(WGPULoadOp.class) int value) {
        segment.set(LAYOUT$depthLoadOp, OFFSET$depthLoadOp, value);
        return this;
    }

    public @EnumType(WGPUStoreOp.class) int depthStoreOp() {
        return segment.get(LAYOUT$depthStoreOp, OFFSET$depthStoreOp);
    }

    public WGPURenderPassDepthStencilAttachment depthStoreOp(@EnumType(WGPUStoreOp.class) int value) {
        segment.set(LAYOUT$depthStoreOp, OFFSET$depthStoreOp, value);
        return this;
    }

    public float depthClearValue() {
        return segment.get(LAYOUT$depthClearValue, OFFSET$depthClearValue);
    }

    public WGPURenderPassDepthStencilAttachment depthClearValue(float value) {
        segment.set(LAYOUT$depthClearValue, OFFSET$depthClearValue, value);
        return this;
    }

    public @NativeType("boolean") boolean depthReadOnly() {
        return segment.get(LAYOUT$depthReadOnly, OFFSET$depthReadOnly);
    }

    public WGPURenderPassDepthStencilAttachment depthReadOnly(@NativeType("boolean") boolean value) {
        segment.set(LAYOUT$depthReadOnly, OFFSET$depthReadOnly, value);
        return this;
    }

    public @EnumType(WGPULoadOp.class) int stencilLoadOp() {
        return segment.get(LAYOUT$stencilLoadOp, OFFSET$stencilLoadOp);
    }

    public WGPURenderPassDepthStencilAttachment stencilLoadOp(@EnumType(WGPULoadOp.class) int value) {
        segment.set(LAYOUT$stencilLoadOp, OFFSET$stencilLoadOp, value);
        return this;
    }

    public @EnumType(WGPUStoreOp.class) int stencilStoreOp() {
        return segment.get(LAYOUT$stencilStoreOp, OFFSET$stencilStoreOp);
    }

    public WGPURenderPassDepthStencilAttachment stencilStoreOp(@EnumType(WGPUStoreOp.class) int value) {
        segment.set(LAYOUT$stencilStoreOp, OFFSET$stencilStoreOp, value);
        return this;
    }

    public @Unsigned int stencilClearValue() {
        return segment.get(LAYOUT$stencilClearValue, OFFSET$stencilClearValue);
    }

    public WGPURenderPassDepthStencilAttachment stencilClearValue(@Unsigned int value) {
        segment.set(LAYOUT$stencilClearValue, OFFSET$stencilClearValue, value);
        return this;
    }

    public @NativeType("boolean") boolean stencilReadOnly() {
        return segment.get(LAYOUT$stencilReadOnly, OFFSET$stencilReadOnly);
    }

    public WGPURenderPassDepthStencilAttachment stencilReadOnly(@NativeType("boolean") boolean value) {
        segment.set(LAYOUT$stencilReadOnly, OFFSET$stencilReadOnly, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("view"),
        ValueLayout.JAVA_INT.withName("depthLoadOp"),
        ValueLayout.JAVA_INT.withName("depthStoreOp"),
        ValueLayout.JAVA_FLOAT.withName("depthClearValue"),
        ValueLayout.JAVA_BOOLEAN.withName("depthReadOnly"),
        ValueLayout.JAVA_INT.withName("stencilLoadOp"),
        ValueLayout.JAVA_INT.withName("stencilStoreOp"),
        ValueLayout.JAVA_INT.withName("stencilClearValue"),
        ValueLayout.JAVA_BOOLEAN.withName("stencilReadOnly")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$view = PathElement.groupElement("view");
    public static final PathElement PATH$depthLoadOp = PathElement.groupElement("depthLoadOp");
    public static final PathElement PATH$depthStoreOp = PathElement.groupElement("depthStoreOp");
    public static final PathElement PATH$depthClearValue = PathElement.groupElement("depthClearValue");
    public static final PathElement PATH$depthReadOnly = PathElement.groupElement("depthReadOnly");
    public static final PathElement PATH$stencilLoadOp = PathElement.groupElement("stencilLoadOp");
    public static final PathElement PATH$stencilStoreOp = PathElement.groupElement("stencilStoreOp");
    public static final PathElement PATH$stencilClearValue = PathElement.groupElement("stencilClearValue");
    public static final PathElement PATH$stencilReadOnly = PathElement.groupElement("stencilReadOnly");

    public static final AddressLayout LAYOUT$view = (AddressLayout) LAYOUT.select(PATH$view);
    public static final OfInt LAYOUT$depthLoadOp = (OfInt) LAYOUT.select(PATH$depthLoadOp);
    public static final OfInt LAYOUT$depthStoreOp = (OfInt) LAYOUT.select(PATH$depthStoreOp);
    public static final OfFloat LAYOUT$depthClearValue = (OfFloat) LAYOUT.select(PATH$depthClearValue);
    public static final OfBoolean LAYOUT$depthReadOnly = (OfBoolean) LAYOUT.select(PATH$depthReadOnly);
    public static final OfInt LAYOUT$stencilLoadOp = (OfInt) LAYOUT.select(PATH$stencilLoadOp);
    public static final OfInt LAYOUT$stencilStoreOp = (OfInt) LAYOUT.select(PATH$stencilStoreOp);
    public static final OfInt LAYOUT$stencilClearValue = (OfInt) LAYOUT.select(PATH$stencilClearValue);
    public static final OfBoolean LAYOUT$stencilReadOnly = (OfBoolean) LAYOUT.select(PATH$stencilReadOnly);

    public static final long SIZE$view = LAYOUT$view.byteSize();
    public static final long SIZE$depthLoadOp = LAYOUT$depthLoadOp.byteSize();
    public static final long SIZE$depthStoreOp = LAYOUT$depthStoreOp.byteSize();
    public static final long SIZE$depthClearValue = LAYOUT$depthClearValue.byteSize();
    public static final long SIZE$depthReadOnly = LAYOUT$depthReadOnly.byteSize();
    public static final long SIZE$stencilLoadOp = LAYOUT$stencilLoadOp.byteSize();
    public static final long SIZE$stencilStoreOp = LAYOUT$stencilStoreOp.byteSize();
    public static final long SIZE$stencilClearValue = LAYOUT$stencilClearValue.byteSize();
    public static final long SIZE$stencilReadOnly = LAYOUT$stencilReadOnly.byteSize();

    public static final long OFFSET$view = LAYOUT.byteOffset(PATH$view);
    public static final long OFFSET$depthLoadOp = LAYOUT.byteOffset(PATH$depthLoadOp);
    public static final long OFFSET$depthStoreOp = LAYOUT.byteOffset(PATH$depthStoreOp);
    public static final long OFFSET$depthClearValue = LAYOUT.byteOffset(PATH$depthClearValue);
    public static final long OFFSET$depthReadOnly = LAYOUT.byteOffset(PATH$depthReadOnly);
    public static final long OFFSET$stencilLoadOp = LAYOUT.byteOffset(PATH$stencilLoadOp);
    public static final long OFFSET$stencilStoreOp = LAYOUT.byteOffset(PATH$stencilStoreOp);
    public static final long OFFSET$stencilClearValue = LAYOUT.byteOffset(PATH$stencilClearValue);
    public static final long OFFSET$stencilReadOnly = LAYOUT.byteOffset(PATH$stencilReadOnly);
}
