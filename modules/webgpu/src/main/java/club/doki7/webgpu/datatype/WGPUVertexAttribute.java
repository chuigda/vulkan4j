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

/// Represents a pointer to a {@code WGPUVertexAttribute} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPUVertexAttribute {
///     WGPUVertexFormat format; // @link substring="WGPUVertexFormat" target="WGPUVertexFormat" @link substring="format" target="#format"
///     uint64_t offset; // @link substring="offset" target="#offset"
///     uint32_t shaderLocation; // @link substring="shaderLocation" target="#shaderLocation"
/// } WGPUVertexAttribute;
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
public record WGPUVertexAttribute(@NotNull MemorySegment segment) implements IWGPUVertexAttribute {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUVertexAttribute}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUVertexAttribute to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUVertexAttribute.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUVertexAttribute, Iterable<WGPUVertexAttribute> {
        public long size() {
            return segment.byteSize() / WGPUVertexAttribute.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUVertexAttribute at(long index) {
            return new WGPUVertexAttribute(segment.asSlice(index * WGPUVertexAttribute.BYTES, WGPUVertexAttribute.BYTES));
        }

        public WGPUVertexAttribute.Ptr at(long index, @NotNull Consumer<@NotNull WGPUVertexAttribute> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUVertexAttribute value) {
            MemorySegment s = segment.asSlice(index * WGPUVertexAttribute.BYTES, WGPUVertexAttribute.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUVertexAttribute.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUVertexAttribute.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUVertexAttribute.BYTES,
                (end - start) * WGPUVertexAttribute.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUVertexAttribute.BYTES));
        }

        public WGPUVertexAttribute[] toArray() {
            WGPUVertexAttribute[] ret = new WGPUVertexAttribute[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUVertexAttribute> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUVertexAttribute> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUVertexAttribute.BYTES;
            }

            @Override
            public WGPUVertexAttribute next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUVertexAttribute ret = new WGPUVertexAttribute(segment.asSlice(0, WGPUVertexAttribute.BYTES));
                segment = segment.asSlice(WGPUVertexAttribute.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUVertexAttribute allocate(Arena arena) {
        return new WGPUVertexAttribute(arena.allocate(LAYOUT));
    }

    public static WGPUVertexAttribute.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUVertexAttribute.Ptr(segment);
    }

    public static WGPUVertexAttribute clone(Arena arena, WGPUVertexAttribute src) {
        WGPUVertexAttribute ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(WGPUVertexFormat.class) int format() {
        return segment.get(LAYOUT$format, OFFSET$format);
    }

    public WGPUVertexAttribute format(@EnumType(WGPUVertexFormat.class) int value) {
        segment.set(LAYOUT$format, OFFSET$format, value);
        return this;
    }

    public @Unsigned long offset() {
        return segment.get(LAYOUT$offset, OFFSET$offset);
    }

    public WGPUVertexAttribute offset(@Unsigned long value) {
        segment.set(LAYOUT$offset, OFFSET$offset, value);
        return this;
    }

    public @Unsigned int shaderLocation() {
        return segment.get(LAYOUT$shaderLocation, OFFSET$shaderLocation);
    }

    public WGPUVertexAttribute shaderLocation(@Unsigned int value) {
        segment.set(LAYOUT$shaderLocation, OFFSET$shaderLocation, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_LONG.withName("offset"),
        ValueLayout.JAVA_INT.withName("shaderLocation")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$format = PathElement.groupElement("format");
    public static final PathElement PATH$offset = PathElement.groupElement("offset");
    public static final PathElement PATH$shaderLocation = PathElement.groupElement("shaderLocation");

    public static final OfInt LAYOUT$format = (OfInt) LAYOUT.select(PATH$format);
    public static final OfLong LAYOUT$offset = (OfLong) LAYOUT.select(PATH$offset);
    public static final OfInt LAYOUT$shaderLocation = (OfInt) LAYOUT.select(PATH$shaderLocation);

    public static final long SIZE$format = LAYOUT$format.byteSize();
    public static final long SIZE$offset = LAYOUT$offset.byteSize();
    public static final long SIZE$shaderLocation = LAYOUT$shaderLocation.byteSize();

    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);
    public static final long OFFSET$offset = LAYOUT.byteOffset(PATH$offset);
    public static final long OFFSET$shaderLocation = LAYOUT.byteOffset(PATH$shaderLocation);
}
