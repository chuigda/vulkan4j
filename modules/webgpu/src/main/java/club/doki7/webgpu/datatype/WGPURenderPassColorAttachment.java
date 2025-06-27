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

/// Represents a pointer to a {@code WGPURenderPassColorAttachment} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPURenderPassColorAttachment {
///     WGPUTextureView view; // optional // @link substring="WGPUTextureView" target="WGPUTextureView" @link substring="view" target="#view"
///     uint32_t depthSlice; // @link substring="depthSlice" target="#depthSlice"
///     WGPUTextureView resolveTarget; // optional // @link substring="WGPUTextureView" target="WGPUTextureView" @link substring="resolveTarget" target="#resolveTarget"
///     WGPULoadOp loadOp; // @link substring="WGPULoadOp" target="WGPULoadOp" @link substring="loadOp" target="#loadOp"
///     WGPUStoreOp storeOp; // @link substring="WGPUStoreOp" target="WGPUStoreOp" @link substring="storeOp" target="#storeOp"
///     WGPUColor clearValue; // @link substring="WGPUColor" target="WGPUColor" @link substring="clearValue" target="#clearValue"
/// } WGPURenderPassColorAttachment;
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
public record WGPURenderPassColorAttachment(@NotNull MemorySegment segment) implements IWGPURenderPassColorAttachment {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPURenderPassColorAttachment}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPURenderPassColorAttachment to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPURenderPassColorAttachment.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPURenderPassColorAttachment, Iterable<WGPURenderPassColorAttachment> {
        public long size() {
            return segment.byteSize() / WGPURenderPassColorAttachment.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPURenderPassColorAttachment at(long index) {
            return new WGPURenderPassColorAttachment(segment.asSlice(index * WGPURenderPassColorAttachment.BYTES, WGPURenderPassColorAttachment.BYTES));
        }

        public WGPURenderPassColorAttachment.Ptr at(long index, @NotNull Consumer<@NotNull WGPURenderPassColorAttachment> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPURenderPassColorAttachment value) {
            MemorySegment s = segment.asSlice(index * WGPURenderPassColorAttachment.BYTES, WGPURenderPassColorAttachment.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPURenderPassColorAttachment.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPURenderPassColorAttachment.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPURenderPassColorAttachment.BYTES,
                (end - start) * WGPURenderPassColorAttachment.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPURenderPassColorAttachment.BYTES));
        }

        public WGPURenderPassColorAttachment[] toArray() {
            WGPURenderPassColorAttachment[] ret = new WGPURenderPassColorAttachment[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPURenderPassColorAttachment> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPURenderPassColorAttachment> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPURenderPassColorAttachment.BYTES;
            }

            @Override
            public WGPURenderPassColorAttachment next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPURenderPassColorAttachment ret = new WGPURenderPassColorAttachment(segment.asSlice(0, WGPURenderPassColorAttachment.BYTES));
                segment = segment.asSlice(WGPURenderPassColorAttachment.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPURenderPassColorAttachment allocate(Arena arena) {
        return new WGPURenderPassColorAttachment(arena.allocate(LAYOUT));
    }

    public static WGPURenderPassColorAttachment.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPURenderPassColorAttachment.Ptr(segment);
    }

    public static WGPURenderPassColorAttachment clone(Arena arena, WGPURenderPassColorAttachment src) {
        WGPURenderPassColorAttachment ret = allocate(arena);
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

    public WGPURenderPassColorAttachment view(@Nullable WGPUTextureView value) {
        segment.set(LAYOUT$view, OFFSET$view, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @Unsigned int depthSlice() {
        return segment.get(LAYOUT$depthSlice, OFFSET$depthSlice);
    }

    public WGPURenderPassColorAttachment depthSlice(@Unsigned int value) {
        segment.set(LAYOUT$depthSlice, OFFSET$depthSlice, value);
        return this;
    }

    public @Nullable WGPUTextureView resolveTarget() {
        MemorySegment s = segment.asSlice(OFFSET$resolveTarget, SIZE$resolveTarget);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new WGPUTextureView(s);
    }

    public WGPURenderPassColorAttachment resolveTarget(@Nullable WGPUTextureView value) {
        segment.set(LAYOUT$resolveTarget, OFFSET$resolveTarget, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @EnumType(WGPULoadOp.class) int loadOp() {
        return segment.get(LAYOUT$loadOp, OFFSET$loadOp);
    }

    public WGPURenderPassColorAttachment loadOp(@EnumType(WGPULoadOp.class) int value) {
        segment.set(LAYOUT$loadOp, OFFSET$loadOp, value);
        return this;
    }

    public @EnumType(WGPUStoreOp.class) int storeOp() {
        return segment.get(LAYOUT$storeOp, OFFSET$storeOp);
    }

    public WGPURenderPassColorAttachment storeOp(@EnumType(WGPUStoreOp.class) int value) {
        segment.set(LAYOUT$storeOp, OFFSET$storeOp, value);
        return this;
    }

    public @NotNull WGPUColor clearValue() {
        return new WGPUColor(segment.asSlice(OFFSET$clearValue, LAYOUT$clearValue));
    }

    public WGPURenderPassColorAttachment clearValue(@NotNull WGPUColor value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$clearValue, SIZE$clearValue);
        return this;
    }

    public WGPURenderPassColorAttachment clearValue(Consumer<@NotNull WGPUColor> consumer) {
        consumer.accept(clearValue());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("view"),
        ValueLayout.JAVA_INT.withName("depthSlice"),
        ValueLayout.ADDRESS.withName("resolveTarget"),
        ValueLayout.JAVA_INT.withName("loadOp"),
        ValueLayout.JAVA_INT.withName("storeOp"),
        WGPUColor.LAYOUT.withName("clearValue")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$view = PathElement.groupElement("view");
    public static final PathElement PATH$depthSlice = PathElement.groupElement("depthSlice");
    public static final PathElement PATH$resolveTarget = PathElement.groupElement("resolveTarget");
    public static final PathElement PATH$loadOp = PathElement.groupElement("loadOp");
    public static final PathElement PATH$storeOp = PathElement.groupElement("storeOp");
    public static final PathElement PATH$clearValue = PathElement.groupElement("clearValue");

    public static final AddressLayout LAYOUT$view = (AddressLayout) LAYOUT.select(PATH$view);
    public static final OfInt LAYOUT$depthSlice = (OfInt) LAYOUT.select(PATH$depthSlice);
    public static final AddressLayout LAYOUT$resolveTarget = (AddressLayout) LAYOUT.select(PATH$resolveTarget);
    public static final OfInt LAYOUT$loadOp = (OfInt) LAYOUT.select(PATH$loadOp);
    public static final OfInt LAYOUT$storeOp = (OfInt) LAYOUT.select(PATH$storeOp);
    public static final StructLayout LAYOUT$clearValue = (StructLayout) LAYOUT.select(PATH$clearValue);

    public static final long SIZE$view = LAYOUT$view.byteSize();
    public static final long SIZE$depthSlice = LAYOUT$depthSlice.byteSize();
    public static final long SIZE$resolveTarget = LAYOUT$resolveTarget.byteSize();
    public static final long SIZE$loadOp = LAYOUT$loadOp.byteSize();
    public static final long SIZE$storeOp = LAYOUT$storeOp.byteSize();
    public static final long SIZE$clearValue = LAYOUT$clearValue.byteSize();

    public static final long OFFSET$view = LAYOUT.byteOffset(PATH$view);
    public static final long OFFSET$depthSlice = LAYOUT.byteOffset(PATH$depthSlice);
    public static final long OFFSET$resolveTarget = LAYOUT.byteOffset(PATH$resolveTarget);
    public static final long OFFSET$loadOp = LAYOUT.byteOffset(PATH$loadOp);
    public static final long OFFSET$storeOp = LAYOUT.byteOffset(PATH$storeOp);
    public static final long OFFSET$clearValue = LAYOUT.byteOffset(PATH$clearValue);
}
