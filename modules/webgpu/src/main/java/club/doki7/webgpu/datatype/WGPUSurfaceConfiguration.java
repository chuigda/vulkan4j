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

/// Represents a pointer to a {@code SurfaceConfiguration} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SurfaceConfiguration {
///     Device device; // @link substring="WGPUDevice" target="WGPUDevice" @link substring="device" target="#device"
///     TextureFormat format; // @link substring="WGPUTextureFormat" target="WGPUTextureFormat" @link substring="format" target="#format"
///     TextureUsage usage; // @link substring="WGPUTextureUsage" target="WGPUTextureUsage" @link substring="usage" target="#usage"
///     uint32_t width; // @link substring="width" target="#width"
///     uint32_t height; // @link substring="height" target="#height"
///     size_t viewFormatCount; // @link substring="viewFormatCount" target="#viewFormatCount"
///     TextureFormat const* viewFormats; // @link substring="WGPUTextureFormat" target="WGPUTextureFormat" @link substring="viewFormats" target="#viewFormats"
///     CompositeAlphaMode alphaMode; // @link substring="WGPUCompositeAlphaMode" target="WGPUCompositeAlphaMode" @link substring="alphaMode" target="#alphaMode"
///     PresentMode presentMode; // @link substring="WGPUPresentMode" target="WGPUPresentMode" @link substring="presentMode" target="#presentMode"
/// } SurfaceConfiguration;
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
public record WGPUSurfaceConfiguration(@NotNull MemorySegment segment) implements IWGPUSurfaceConfiguration {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUSurfaceConfiguration}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUSurfaceConfiguration to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUSurfaceConfiguration.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUSurfaceConfiguration, Iterable<WGPUSurfaceConfiguration> {
        public long size() {
            return segment.byteSize() / WGPUSurfaceConfiguration.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUSurfaceConfiguration at(long index) {
            return new WGPUSurfaceConfiguration(segment.asSlice(index * WGPUSurfaceConfiguration.BYTES, WGPUSurfaceConfiguration.BYTES));
        }

        public WGPUSurfaceConfiguration.Ptr at(long index, @NotNull Consumer<@NotNull WGPUSurfaceConfiguration> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUSurfaceConfiguration value) {
            MemorySegment s = segment.asSlice(index * WGPUSurfaceConfiguration.BYTES, WGPUSurfaceConfiguration.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUSurfaceConfiguration.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUSurfaceConfiguration.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUSurfaceConfiguration.BYTES,
                (end - start) * WGPUSurfaceConfiguration.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUSurfaceConfiguration.BYTES));
        }

        public WGPUSurfaceConfiguration[] toArray() {
            WGPUSurfaceConfiguration[] ret = new WGPUSurfaceConfiguration[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUSurfaceConfiguration> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUSurfaceConfiguration> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUSurfaceConfiguration.BYTES;
            }

            @Override
            public WGPUSurfaceConfiguration next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUSurfaceConfiguration ret = new WGPUSurfaceConfiguration(segment.asSlice(0, WGPUSurfaceConfiguration.BYTES));
                segment = segment.asSlice(WGPUSurfaceConfiguration.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUSurfaceConfiguration allocate(Arena arena) {
        return new WGPUSurfaceConfiguration(arena.allocate(LAYOUT));
    }

    public static WGPUSurfaceConfiguration.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUSurfaceConfiguration.Ptr(segment);
    }

    public static WGPUSurfaceConfiguration clone(Arena arena, WGPUSurfaceConfiguration src) {
        WGPUSurfaceConfiguration ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Nullable WGPUDevice device() {
        MemorySegment s = segment.asSlice(OFFSET$device, SIZE$device);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new WGPUDevice(s);
    }

    public WGPUSurfaceConfiguration device(@Nullable WGPUDevice value) {
        segment.set(LAYOUT$device, OFFSET$device, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public @EnumType(WGPUTextureFormat.class) int format() {
        return segment.get(LAYOUT$format, OFFSET$format);
    }

    public WGPUSurfaceConfiguration format(@EnumType(WGPUTextureFormat.class) int value) {
        segment.set(LAYOUT$format, OFFSET$format, value);
        return this;
    }

    public @Bitmask(WGPUTextureUsage.class) long usage() {
        return segment.get(LAYOUT$usage, OFFSET$usage);
    }

    public WGPUSurfaceConfiguration usage(@Bitmask(WGPUTextureUsage.class) long value) {
        segment.set(LAYOUT$usage, OFFSET$usage, value);
        return this;
    }

    public @Unsigned int width() {
        return segment.get(LAYOUT$width, OFFSET$width);
    }

    public WGPUSurfaceConfiguration width(@Unsigned int value) {
        segment.set(LAYOUT$width, OFFSET$width, value);
        return this;
    }

    public @Unsigned int height() {
        return segment.get(LAYOUT$height, OFFSET$height);
    }

    public WGPUSurfaceConfiguration height(@Unsigned int value) {
        segment.set(LAYOUT$height, OFFSET$height, value);
        return this;
    }

    public @Unsigned long viewFormatCount() {
        return NativeLayout.readCSizeT(segment, OFFSET$viewFormatCount);
    }

    public WGPUSurfaceConfiguration viewFormatCount(@Unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$viewFormatCount, value);
        return this;
    }


    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @EnumType(WGPUTextureFormat.class) IntPtr viewFormats() {
        MemorySegment s = viewFormatsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public WGPUSurfaceConfiguration viewFormats(@Nullable @EnumType(WGPUTextureFormat.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        viewFormatsRaw(s);
        return this;
    }

    public @Pointer(target=WGPUTextureFormat.class) @NotNull MemorySegment viewFormatsRaw() {
        return segment.get(LAYOUT$viewFormats, OFFSET$viewFormats);
    }

    public void viewFormatsRaw(@Pointer(target=WGPUTextureFormat.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$viewFormats, OFFSET$viewFormats, value);
    }

    public @EnumType(WGPUCompositeAlphaMode.class) int alphaMode() {
        return segment.get(LAYOUT$alphaMode, OFFSET$alphaMode);
    }

    public WGPUSurfaceConfiguration alphaMode(@EnumType(WGPUCompositeAlphaMode.class) int value) {
        segment.set(LAYOUT$alphaMode, OFFSET$alphaMode, value);
        return this;
    }

    public @EnumType(WGPUPresentMode.class) int presentMode() {
        return segment.get(LAYOUT$presentMode, OFFSET$presentMode);
    }

    public WGPUSurfaceConfiguration presentMode(@EnumType(WGPUPresentMode.class) int value) {
        segment.set(LAYOUT$presentMode, OFFSET$presentMode, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("device"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_LONG.withName("usage"),
        ValueLayout.JAVA_INT.withName("width"),
        ValueLayout.JAVA_INT.withName("height"),
        NativeLayout.C_SIZE_T.withName("viewFormatCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("viewFormats"),
        ValueLayout.JAVA_INT.withName("alphaMode"),
        ValueLayout.JAVA_INT.withName("presentMode")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$device = PathElement.groupElement("device");
    public static final PathElement PATH$format = PathElement.groupElement("format");
    public static final PathElement PATH$usage = PathElement.groupElement("usage");
    public static final PathElement PATH$width = PathElement.groupElement("width");
    public static final PathElement PATH$height = PathElement.groupElement("height");
    public static final PathElement PATH$viewFormatCount = PathElement.groupElement("viewFormatCount");
    public static final PathElement PATH$viewFormats = PathElement.groupElement("viewFormats");
    public static final PathElement PATH$alphaMode = PathElement.groupElement("alphaMode");
    public static final PathElement PATH$presentMode = PathElement.groupElement("presentMode");

    public static final AddressLayout LAYOUT$device = (AddressLayout) LAYOUT.select(PATH$device);
    public static final OfInt LAYOUT$format = (OfInt) LAYOUT.select(PATH$format);
    public static final OfLong LAYOUT$usage = (OfLong) LAYOUT.select(PATH$usage);
    public static final OfInt LAYOUT$width = (OfInt) LAYOUT.select(PATH$width);
    public static final OfInt LAYOUT$height = (OfInt) LAYOUT.select(PATH$height);
    public static final AddressLayout LAYOUT$viewFormats = (AddressLayout) LAYOUT.select(PATH$viewFormats);
    public static final OfInt LAYOUT$alphaMode = (OfInt) LAYOUT.select(PATH$alphaMode);
    public static final OfInt LAYOUT$presentMode = (OfInt) LAYOUT.select(PATH$presentMode);

    public static final long SIZE$device = LAYOUT$device.byteSize();
    public static final long SIZE$format = LAYOUT$format.byteSize();
    public static final long SIZE$usage = LAYOUT$usage.byteSize();
    public static final long SIZE$width = LAYOUT$width.byteSize();
    public static final long SIZE$height = LAYOUT$height.byteSize();
    public static final long SIZE$viewFormatCount = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$viewFormats = LAYOUT$viewFormats.byteSize();
    public static final long SIZE$alphaMode = LAYOUT$alphaMode.byteSize();
    public static final long SIZE$presentMode = LAYOUT$presentMode.byteSize();

    public static final long OFFSET$device = LAYOUT.byteOffset(PATH$device);
    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);
    public static final long OFFSET$usage = LAYOUT.byteOffset(PATH$usage);
    public static final long OFFSET$width = LAYOUT.byteOffset(PATH$width);
    public static final long OFFSET$height = LAYOUT.byteOffset(PATH$height);
    public static final long OFFSET$viewFormatCount = LAYOUT.byteOffset(PATH$viewFormatCount);
    public static final long OFFSET$viewFormats = LAYOUT.byteOffset(PATH$viewFormats);
    public static final long OFFSET$alphaMode = LAYOUT.byteOffset(PATH$alphaMode);
    public static final long OFFSET$presentMode = LAYOUT.byteOffset(PATH$presentMode);
}
