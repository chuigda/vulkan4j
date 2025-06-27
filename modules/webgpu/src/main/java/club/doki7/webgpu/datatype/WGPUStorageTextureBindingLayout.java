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

/// Represents a pointer to a {@code StorageTextureBindingLayout} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct StorageTextureBindingLayout {
///     StorageTextureAccess access; // @link substring="WGPUStorageTextureAccess" target="WGPUStorageTextureAccess" @link substring="access" target="#access"
///     TextureFormat format; // @link substring="WGPUTextureFormat" target="WGPUTextureFormat" @link substring="format" target="#format"
///     TextureViewDimension viewDimension; // @link substring="WGPUTextureViewDimension" target="WGPUTextureViewDimension" @link substring="viewDimension" target="#viewDimension"
/// } StorageTextureBindingLayout;
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
public record WGPUStorageTextureBindingLayout(@NotNull MemorySegment segment) implements IWGPUStorageTextureBindingLayout {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUStorageTextureBindingLayout}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUStorageTextureBindingLayout to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUStorageTextureBindingLayout.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUStorageTextureBindingLayout, Iterable<WGPUStorageTextureBindingLayout> {
        public long size() {
            return segment.byteSize() / WGPUStorageTextureBindingLayout.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUStorageTextureBindingLayout at(long index) {
            return new WGPUStorageTextureBindingLayout(segment.asSlice(index * WGPUStorageTextureBindingLayout.BYTES, WGPUStorageTextureBindingLayout.BYTES));
        }

        public WGPUStorageTextureBindingLayout.Ptr at(long index, @NotNull Consumer<@NotNull WGPUStorageTextureBindingLayout> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUStorageTextureBindingLayout value) {
            MemorySegment s = segment.asSlice(index * WGPUStorageTextureBindingLayout.BYTES, WGPUStorageTextureBindingLayout.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUStorageTextureBindingLayout.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUStorageTextureBindingLayout.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUStorageTextureBindingLayout.BYTES,
                (end - start) * WGPUStorageTextureBindingLayout.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUStorageTextureBindingLayout.BYTES));
        }

        public WGPUStorageTextureBindingLayout[] toArray() {
            WGPUStorageTextureBindingLayout[] ret = new WGPUStorageTextureBindingLayout[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUStorageTextureBindingLayout> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUStorageTextureBindingLayout> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUStorageTextureBindingLayout.BYTES;
            }

            @Override
            public WGPUStorageTextureBindingLayout next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUStorageTextureBindingLayout ret = new WGPUStorageTextureBindingLayout(segment.asSlice(0, WGPUStorageTextureBindingLayout.BYTES));
                segment = segment.asSlice(WGPUStorageTextureBindingLayout.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUStorageTextureBindingLayout allocate(Arena arena) {
        return new WGPUStorageTextureBindingLayout(arena.allocate(LAYOUT));
    }

    public static WGPUStorageTextureBindingLayout.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUStorageTextureBindingLayout.Ptr(segment);
    }

    public static WGPUStorageTextureBindingLayout clone(Arena arena, WGPUStorageTextureBindingLayout src) {
        WGPUStorageTextureBindingLayout ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @EnumType(WGPUStorageTextureAccess.class) int access() {
        return segment.get(LAYOUT$access, OFFSET$access);
    }

    public WGPUStorageTextureBindingLayout access(@EnumType(WGPUStorageTextureAccess.class) int value) {
        segment.set(LAYOUT$access, OFFSET$access, value);
        return this;
    }

    public @EnumType(WGPUTextureFormat.class) int format() {
        return segment.get(LAYOUT$format, OFFSET$format);
    }

    public WGPUStorageTextureBindingLayout format(@EnumType(WGPUTextureFormat.class) int value) {
        segment.set(LAYOUT$format, OFFSET$format, value);
        return this;
    }

    public @EnumType(WGPUTextureViewDimension.class) int viewDimension() {
        return segment.get(LAYOUT$viewDimension, OFFSET$viewDimension);
    }

    public WGPUStorageTextureBindingLayout viewDimension(@EnumType(WGPUTextureViewDimension.class) int value) {
        segment.set(LAYOUT$viewDimension, OFFSET$viewDimension, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("access"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_INT.withName("viewDimension")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$access = PathElement.groupElement("access");
    public static final PathElement PATH$format = PathElement.groupElement("format");
    public static final PathElement PATH$viewDimension = PathElement.groupElement("viewDimension");

    public static final OfInt LAYOUT$access = (OfInt) LAYOUT.select(PATH$access);
    public static final OfInt LAYOUT$format = (OfInt) LAYOUT.select(PATH$format);
    public static final OfInt LAYOUT$viewDimension = (OfInt) LAYOUT.select(PATH$viewDimension);

    public static final long SIZE$access = LAYOUT$access.byteSize();
    public static final long SIZE$format = LAYOUT$format.byteSize();
    public static final long SIZE$viewDimension = LAYOUT$viewDimension.byteSize();

    public static final long OFFSET$access = LAYOUT.byteOffset(PATH$access);
    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);
    public static final long OFFSET$viewDimension = LAYOUT.byteOffset(PATH$viewDimension);
}
