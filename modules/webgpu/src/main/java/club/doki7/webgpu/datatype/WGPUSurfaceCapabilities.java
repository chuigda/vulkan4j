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

/// Represents a pointer to a {@code WGPUSurfaceCapabilities} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPUSurfaceCapabilities {
///     WGPUTextureUsage usages; // @link substring="WGPUTextureUsage" target="WGPUTextureUsage" @link substring="usages" target="#usages"
///     WGPUTextureFormat const* formats; // @link substring="WGPUTextureFormat" target="WGPUTextureFormat" @link substring="formats" target="#formats"
///     WGPUPresentMode const* presentModes; // @link substring="WGPUPresentMode" target="WGPUPresentMode" @link substring="presentModes" target="#presentModes"
///     WGPUCompositeAlphaMode const* alphaModes; // @link substring="WGPUCompositeAlphaMode" target="WGPUCompositeAlphaMode" @link substring="alphaModes" target="#alphaModes"
/// } WGPUSurfaceCapabilities;
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
public record WGPUSurfaceCapabilities(@NotNull MemorySegment segment) implements IWGPUSurfaceCapabilities {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUSurfaceCapabilities}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUSurfaceCapabilities to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUSurfaceCapabilities.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUSurfaceCapabilities, Iterable<WGPUSurfaceCapabilities> {
        public long size() {
            return segment.byteSize() / WGPUSurfaceCapabilities.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUSurfaceCapabilities at(long index) {
            return new WGPUSurfaceCapabilities(segment.asSlice(index * WGPUSurfaceCapabilities.BYTES, WGPUSurfaceCapabilities.BYTES));
        }

        public WGPUSurfaceCapabilities.Ptr at(long index, @NotNull Consumer<@NotNull WGPUSurfaceCapabilities> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUSurfaceCapabilities value) {
            MemorySegment s = segment.asSlice(index * WGPUSurfaceCapabilities.BYTES, WGPUSurfaceCapabilities.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUSurfaceCapabilities.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUSurfaceCapabilities.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUSurfaceCapabilities.BYTES,
                (end - start) * WGPUSurfaceCapabilities.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUSurfaceCapabilities.BYTES));
        }

        public WGPUSurfaceCapabilities[] toArray() {
            WGPUSurfaceCapabilities[] ret = new WGPUSurfaceCapabilities[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUSurfaceCapabilities> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUSurfaceCapabilities> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUSurfaceCapabilities.BYTES;
            }

            @Override
            public WGPUSurfaceCapabilities next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUSurfaceCapabilities ret = new WGPUSurfaceCapabilities(segment.asSlice(0, WGPUSurfaceCapabilities.BYTES));
                segment = segment.asSlice(WGPUSurfaceCapabilities.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUSurfaceCapabilities allocate(Arena arena) {
        return new WGPUSurfaceCapabilities(arena.allocate(LAYOUT));
    }

    public static WGPUSurfaceCapabilities.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUSurfaceCapabilities.Ptr(segment);
    }

    public static WGPUSurfaceCapabilities clone(Arena arena, WGPUSurfaceCapabilities src) {
        WGPUSurfaceCapabilities ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @Bitmask(WGPUTextureUsage.class) long usages() {
        return segment.get(LAYOUT$usages, OFFSET$usages);
    }

    public WGPUSurfaceCapabilities usages(@Bitmask(WGPUTextureUsage.class) long value) {
        segment.set(LAYOUT$usages, OFFSET$usages, value);
        return this;
    }


    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @EnumType(WGPUTextureFormat.class) IntPtr formats() {
        MemorySegment s = formatsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public WGPUSurfaceCapabilities formats(@Nullable @EnumType(WGPUTextureFormat.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        formatsRaw(s);
        return this;
    }

    public @Pointer(target=WGPUTextureFormat.class) @NotNull MemorySegment formatsRaw() {
        return segment.get(LAYOUT$formats, OFFSET$formats);
    }

    public void formatsRaw(@Pointer(target=WGPUTextureFormat.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$formats, OFFSET$formats, value);
    }


    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @EnumType(WGPUPresentMode.class) IntPtr presentModes() {
        MemorySegment s = presentModesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public WGPUSurfaceCapabilities presentModes(@Nullable @EnumType(WGPUPresentMode.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        presentModesRaw(s);
        return this;
    }

    public @Pointer(target=WGPUPresentMode.class) @NotNull MemorySegment presentModesRaw() {
        return segment.get(LAYOUT$presentModes, OFFSET$presentModes);
    }

    public void presentModesRaw(@Pointer(target=WGPUPresentMode.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$presentModes, OFFSET$presentModes, value);
    }


    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @EnumType(WGPUCompositeAlphaMode.class) IntPtr alphaModes() {
        MemorySegment s = alphaModesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public WGPUSurfaceCapabilities alphaModes(@Nullable @EnumType(WGPUCompositeAlphaMode.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        alphaModesRaw(s);
        return this;
    }

    public @Pointer(target=WGPUCompositeAlphaMode.class) @NotNull MemorySegment alphaModesRaw() {
        return segment.get(LAYOUT$alphaModes, OFFSET$alphaModes);
    }

    public void alphaModesRaw(@Pointer(target=WGPUCompositeAlphaMode.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$alphaModes, OFFSET$alphaModes, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_LONG.withName("usages"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("formats"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("presentModes"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("alphaModes")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$usages = PathElement.groupElement("usages");
    public static final PathElement PATH$formats = PathElement.groupElement("formats");
    public static final PathElement PATH$presentModes = PathElement.groupElement("presentModes");
    public static final PathElement PATH$alphaModes = PathElement.groupElement("alphaModes");

    public static final OfLong LAYOUT$usages = (OfLong) LAYOUT.select(PATH$usages);
    public static final AddressLayout LAYOUT$formats = (AddressLayout) LAYOUT.select(PATH$formats);
    public static final AddressLayout LAYOUT$presentModes = (AddressLayout) LAYOUT.select(PATH$presentModes);
    public static final AddressLayout LAYOUT$alphaModes = (AddressLayout) LAYOUT.select(PATH$alphaModes);

    public static final long SIZE$usages = LAYOUT$usages.byteSize();
    public static final long SIZE$formats = LAYOUT$formats.byteSize();
    public static final long SIZE$presentModes = LAYOUT$presentModes.byteSize();
    public static final long SIZE$alphaModes = LAYOUT$alphaModes.byteSize();

    public static final long OFFSET$usages = LAYOUT.byteOffset(PATH$usages);
    public static final long OFFSET$formats = LAYOUT.byteOffset(PATH$formats);
    public static final long OFFSET$presentModes = LAYOUT.byteOffset(PATH$presentModes);
    public static final long OFFSET$alphaModes = LAYOUT.byteOffset(PATH$alphaModes);
}
