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

/// Represents a pointer to a {@code WGPUSupportedFeatures} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPUSupportedFeatures {
///     WGPUFeatureName const* features; // @link substring="WGPUFeatureName" target="WGPUFeatureName" @link substring="features" target="#features"
/// } WGPUSupportedFeatures;
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
public record WGPUSupportedFeatures(@NotNull MemorySegment segment) implements IWGPUSupportedFeatures {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUSupportedFeatures}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUSupportedFeatures to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUSupportedFeatures.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUSupportedFeatures, Iterable<WGPUSupportedFeatures> {
        public long size() {
            return segment.byteSize() / WGPUSupportedFeatures.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUSupportedFeatures at(long index) {
            return new WGPUSupportedFeatures(segment.asSlice(index * WGPUSupportedFeatures.BYTES, WGPUSupportedFeatures.BYTES));
        }

        public WGPUSupportedFeatures.Ptr at(long index, @NotNull Consumer<@NotNull WGPUSupportedFeatures> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUSupportedFeatures value) {
            MemorySegment s = segment.asSlice(index * WGPUSupportedFeatures.BYTES, WGPUSupportedFeatures.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUSupportedFeatures.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUSupportedFeatures.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUSupportedFeatures.BYTES,
                (end - start) * WGPUSupportedFeatures.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUSupportedFeatures.BYTES));
        }

        public WGPUSupportedFeatures[] toArray() {
            WGPUSupportedFeatures[] ret = new WGPUSupportedFeatures[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUSupportedFeatures> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUSupportedFeatures> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUSupportedFeatures.BYTES;
            }

            @Override
            public WGPUSupportedFeatures next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUSupportedFeatures ret = new WGPUSupportedFeatures(segment.asSlice(0, WGPUSupportedFeatures.BYTES));
                segment = segment.asSlice(WGPUSupportedFeatures.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUSupportedFeatures allocate(Arena arena) {
        return new WGPUSupportedFeatures(arena.allocate(LAYOUT));
    }

    public static WGPUSupportedFeatures.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUSupportedFeatures.Ptr(segment);
    }

    public static WGPUSupportedFeatures clone(Arena arena, WGPUSupportedFeatures src) {
        WGPUSupportedFeatures ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }


    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @EnumType(WGPUFeatureName.class) IntPtr features() {
        MemorySegment s = featuresRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public WGPUSupportedFeatures features(@Nullable @EnumType(WGPUFeatureName.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        featuresRaw(s);
        return this;
    }

    public @Pointer(target=WGPUFeatureName.class) @NotNull MemorySegment featuresRaw() {
        return segment.get(LAYOUT$features, OFFSET$features);
    }

    public void featuresRaw(@Pointer(target=WGPUFeatureName.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$features, OFFSET$features, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("features")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$features = PathElement.groupElement("features");

    public static final AddressLayout LAYOUT$features = (AddressLayout) LAYOUT.select(PATH$features);

    public static final long SIZE$features = LAYOUT$features.byteSize();

    public static final long OFFSET$features = LAYOUT.byteOffset(PATH$features);
}
