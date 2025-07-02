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

/// Represents a pointer to a {@code WGPUVertexBufferLayout} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPUVertexBufferLayout {
///     WGPUVertexStepMode stepMode; // @link substring="WGPUVertexStepMode" target="WGPUVertexStepMode" @link substring="stepMode" target="#stepMode"
///     uint64_t arrayStride; // @link substring="arrayStride" target="#arrayStride"
///     size_t attributeCount; // @link substring="attributeCount" target="#attributeCount"
///     WGPUVertexAttribute const* attributes; // @link substring="WGPUVertexAttribute" target="WGPUVertexAttribute" @link substring="attributes" target="#attributes"
/// } WGPUVertexBufferLayout;
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
public record WGPUVertexBufferLayout(@NotNull MemorySegment segment) implements IWGPUVertexBufferLayout {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUVertexBufferLayout}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUVertexBufferLayout to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUVertexBufferLayout.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUVertexBufferLayout, Iterable<WGPUVertexBufferLayout> {
        public long size() {
            return segment.byteSize() / WGPUVertexBufferLayout.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUVertexBufferLayout at(long index) {
            return new WGPUVertexBufferLayout(segment.asSlice(index * WGPUVertexBufferLayout.BYTES, WGPUVertexBufferLayout.BYTES));
        }

        public WGPUVertexBufferLayout.Ptr at(long index, @NotNull Consumer<@NotNull WGPUVertexBufferLayout> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUVertexBufferLayout value) {
            MemorySegment s = segment.asSlice(index * WGPUVertexBufferLayout.BYTES, WGPUVertexBufferLayout.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUVertexBufferLayout.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUVertexBufferLayout.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUVertexBufferLayout.BYTES,
                (end - start) * WGPUVertexBufferLayout.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUVertexBufferLayout.BYTES));
        }

        public WGPUVertexBufferLayout[] toArray() {
            WGPUVertexBufferLayout[] ret = new WGPUVertexBufferLayout[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUVertexBufferLayout> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUVertexBufferLayout> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUVertexBufferLayout.BYTES;
            }

            @Override
            public WGPUVertexBufferLayout next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUVertexBufferLayout ret = new WGPUVertexBufferLayout(segment.asSlice(0, WGPUVertexBufferLayout.BYTES));
                segment = segment.asSlice(WGPUVertexBufferLayout.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUVertexBufferLayout allocate(Arena arena) {
        return new WGPUVertexBufferLayout(arena.allocate(LAYOUT));
    }

    public static WGPUVertexBufferLayout.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUVertexBufferLayout.Ptr(segment);
    }

    public static WGPUVertexBufferLayout clone(Arena arena, WGPUVertexBufferLayout src) {
        WGPUVertexBufferLayout ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(WGPUVertexStepMode.class) int stepMode() {
        return segment.get(LAYOUT$stepMode, OFFSET$stepMode);
    }

    public WGPUVertexBufferLayout stepMode(@EnumType(WGPUVertexStepMode.class) int value) {
        segment.set(LAYOUT$stepMode, OFFSET$stepMode, value);
        return this;
    }

    public @Unsigned long arrayStride() {
        return segment.get(LAYOUT$arrayStride, OFFSET$arrayStride);
    }

    public WGPUVertexBufferLayout arrayStride(@Unsigned long value) {
        segment.set(LAYOUT$arrayStride, OFFSET$arrayStride, value);
        return this;
    }

    public @Unsigned long attributeCount() {
        return NativeLayout.readCSizeT(segment, OFFSET$attributeCount);
    }

    public WGPUVertexBufferLayout attributeCount(@Unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$attributeCount, value);
        return this;
    }

    public WGPUVertexBufferLayout attributes(@Nullable IWGPUVertexAttribute value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        attributesRaw(s);
        return this;
    }

    @Unsafe public @Nullable WGPUVertexAttribute.Ptr attributes(int assumedCount) {
        MemorySegment s = attributesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * WGPUVertexAttribute.BYTES);
        return new WGPUVertexAttribute.Ptr(s);
    }

    public @Nullable WGPUVertexAttribute attributes() {
        MemorySegment s = attributesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new WGPUVertexAttribute(s);
    }

    public @Pointer(target=WGPUVertexAttribute.class) @NotNull MemorySegment attributesRaw() {
        return segment.get(LAYOUT$attributes, OFFSET$attributes);
    }

    public void attributesRaw(@Pointer(target=WGPUVertexAttribute.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$attributes, OFFSET$attributes, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("stepMode"),
        ValueLayout.JAVA_LONG.withName("arrayStride"),
        NativeLayout.C_SIZE_T.withName("attributeCount"),
        ValueLayout.ADDRESS.withTargetLayout(WGPUVertexAttribute.LAYOUT).withName("attributes")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$stepMode = PathElement.groupElement("stepMode");
    public static final PathElement PATH$arrayStride = PathElement.groupElement("arrayStride");
    public static final PathElement PATH$attributeCount = PathElement.groupElement("attributeCount");
    public static final PathElement PATH$attributes = PathElement.groupElement("attributes");

    public static final OfInt LAYOUT$stepMode = (OfInt) LAYOUT.select(PATH$stepMode);
    public static final OfLong LAYOUT$arrayStride = (OfLong) LAYOUT.select(PATH$arrayStride);
    public static final AddressLayout LAYOUT$attributes = (AddressLayout) LAYOUT.select(PATH$attributes);

    public static final long SIZE$stepMode = LAYOUT$stepMode.byteSize();
    public static final long SIZE$arrayStride = LAYOUT$arrayStride.byteSize();
    public static final long SIZE$attributeCount = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$attributes = LAYOUT$attributes.byteSize();

    public static final long OFFSET$stepMode = LAYOUT.byteOffset(PATH$stepMode);
    public static final long OFFSET$arrayStride = LAYOUT.byteOffset(PATH$arrayStride);
    public static final long OFFSET$attributeCount = LAYOUT.byteOffset(PATH$attributeCount);
    public static final long OFFSET$attributes = LAYOUT.byteOffset(PATH$attributes);
}
