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
import static club.doki7.webgpu.WebGPUConstants.*;

/// Represents a pointer to a {@code RequestAdapterOptions} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct RequestAdapterOptions {
///     ChainedStruct* nextInChain; // @link substring="ChainedStruct" target="ChainedStruct" @link substring="nextInChain" target="#nextInChain"
///     FeatureLevel featureLevel; // @link substring="FeatureLevel" target="FeatureLevel" @link substring="featureLevel" target="#featureLevel"
///     PowerPreference powerPreference; // @link substring="PowerPreference" target="PowerPreference" @link substring="powerPreference" target="#powerPreference"
///     bool forceFallbackAdapter; // @link substring="forceFallbackAdapter" target="#forceFallbackAdapter"
///     BackendType backendType; // @link substring="BackendType" target="BackendType" @link substring="backendType" target="#backendType"
///     Surface compatibleSurface; // optional // @link substring="Surface" target="Surface" @link substring="compatibleSurface" target="#compatibleSurface"
/// } RequestAdapterOptions;
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
public record RequestAdapterOptions(@NotNull MemorySegment segment) implements IRequestAdapterOptions {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link RequestAdapterOptions}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IRequestAdapterOptions to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code RequestAdapterOptions.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IRequestAdapterOptions, Iterable<RequestAdapterOptions> {
        public long size() {
            return segment.byteSize() / RequestAdapterOptions.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull RequestAdapterOptions at(long index) {
            return new RequestAdapterOptions(segment.asSlice(index * RequestAdapterOptions.BYTES, RequestAdapterOptions.BYTES));
        }

        public void write(long index, @NotNull RequestAdapterOptions value) {
            MemorySegment s = segment.asSlice(index * RequestAdapterOptions.BYTES, RequestAdapterOptions.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * RequestAdapterOptions.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * RequestAdapterOptions.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * RequestAdapterOptions.BYTES,
                (end - start) * RequestAdapterOptions.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * RequestAdapterOptions.BYTES));
        }

        public RequestAdapterOptions[] toArray() {
            RequestAdapterOptions[] ret = new RequestAdapterOptions[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<RequestAdapterOptions> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<RequestAdapterOptions> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= RequestAdapterOptions.BYTES;
            }

            @Override
            public RequestAdapterOptions next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                RequestAdapterOptions ret = new RequestAdapterOptions(segment.asSlice(0, RequestAdapterOptions.BYTES));
                segment = segment.asSlice(RequestAdapterOptions.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static RequestAdapterOptions allocate(Arena arena) {
        return new RequestAdapterOptions(arena.allocate(LAYOUT));
    }

    public static RequestAdapterOptions.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new RequestAdapterOptions.Ptr(segment);
    }

    public static RequestAdapterOptions clone(Arena arena, RequestAdapterOptions src) {
        RequestAdapterOptions ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public RequestAdapterOptions nextInChain(@Nullable IChainedStruct value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        nextInChainRaw(s);
        return this;
    }

    @Unsafe public @Nullable ChainedStruct.Ptr nextInChain(int assumedCount) {
        MemorySegment s = nextInChainRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * ChainedStruct.BYTES);
        return new ChainedStruct.Ptr(s);
    }

    public @Nullable ChainedStruct nextInChain() {
        MemorySegment s = nextInChainRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new ChainedStruct(s);
    }

    public @Pointer(target=ChainedStruct.class) MemorySegment nextInChainRaw() {
        return segment.get(LAYOUT$nextInChain, OFFSET$nextInChain);
    }

    public void nextInChainRaw(@Pointer(target=ChainedStruct.class) MemorySegment value) {
        segment.set(LAYOUT$nextInChain, OFFSET$nextInChain, value);
    }

    public @EnumType(FeatureLevel.class) int featureLevel() {
        return segment.get(LAYOUT$featureLevel, OFFSET$featureLevel);
    }

    public RequestAdapterOptions featureLevel(@EnumType(FeatureLevel.class) int value) {
        segment.set(LAYOUT$featureLevel, OFFSET$featureLevel, value);
        return this;
    }

    public @EnumType(PowerPreference.class) int powerPreference() {
        return segment.get(LAYOUT$powerPreference, OFFSET$powerPreference);
    }

    public RequestAdapterOptions powerPreference(@EnumType(PowerPreference.class) int value) {
        segment.set(LAYOUT$powerPreference, OFFSET$powerPreference, value);
        return this;
    }

    public @NativeType("boolean") boolean forceFallbackAdapter() {
        return segment.get(LAYOUT$forceFallbackAdapter, OFFSET$forceFallbackAdapter);
    }

    public RequestAdapterOptions forceFallbackAdapter(@NativeType("boolean") boolean value) {
        segment.set(LAYOUT$forceFallbackAdapter, OFFSET$forceFallbackAdapter, value);
        return this;
    }

    public @EnumType(BackendType.class) int backendType() {
        return segment.get(LAYOUT$backendType, OFFSET$backendType);
    }

    public RequestAdapterOptions backendType(@EnumType(BackendType.class) int value) {
        segment.set(LAYOUT$backendType, OFFSET$backendType, value);
        return this;
    }

    public @Nullable Surface compatibleSurface() {
        MemorySegment s = segment.asSlice(OFFSET$compatibleSurface, SIZE$compatibleSurface);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new Surface(s);
    }

    public RequestAdapterOptions compatibleSurface(@Nullable Surface value) {
        segment.set(LAYOUT$compatibleSurface, OFFSET$compatibleSurface, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(ChainedStruct.LAYOUT).withName("nextInChain"),
        ValueLayout.JAVA_INT.withName("featureLevel"),
        ValueLayout.JAVA_INT.withName("powerPreference"),
        ValueLayout.JAVA_BOOLEAN.withName("forceFallbackAdapter"),
        ValueLayout.JAVA_INT.withName("backendType"),
        ValueLayout.ADDRESS.withName("compatibleSurface")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$nextInChain = PathElement.groupElement("nextInChain");
    public static final PathElement PATH$featureLevel = PathElement.groupElement("featureLevel");
    public static final PathElement PATH$powerPreference = PathElement.groupElement("powerPreference");
    public static final PathElement PATH$forceFallbackAdapter = PathElement.groupElement("forceFallbackAdapter");
    public static final PathElement PATH$backendType = PathElement.groupElement("backendType");
    public static final PathElement PATH$compatibleSurface = PathElement.groupElement("compatibleSurface");

    public static final AddressLayout LAYOUT$nextInChain = (AddressLayout) LAYOUT.select(PATH$nextInChain);
    public static final OfInt LAYOUT$featureLevel = (OfInt) LAYOUT.select(PATH$featureLevel);
    public static final OfInt LAYOUT$powerPreference = (OfInt) LAYOUT.select(PATH$powerPreference);
    public static final OfBoolean LAYOUT$forceFallbackAdapter = (OfBoolean) LAYOUT.select(PATH$forceFallbackAdapter);
    public static final OfInt LAYOUT$backendType = (OfInt) LAYOUT.select(PATH$backendType);
    public static final AddressLayout LAYOUT$compatibleSurface = (AddressLayout) LAYOUT.select(PATH$compatibleSurface);

    public static final long SIZE$nextInChain = LAYOUT$nextInChain.byteSize();
    public static final long SIZE$featureLevel = LAYOUT$featureLevel.byteSize();
    public static final long SIZE$powerPreference = LAYOUT$powerPreference.byteSize();
    public static final long SIZE$forceFallbackAdapter = LAYOUT$forceFallbackAdapter.byteSize();
    public static final long SIZE$backendType = LAYOUT$backendType.byteSize();
    public static final long SIZE$compatibleSurface = LAYOUT$compatibleSurface.byteSize();

    public static final long OFFSET$nextInChain = LAYOUT.byteOffset(PATH$nextInChain);
    public static final long OFFSET$featureLevel = LAYOUT.byteOffset(PATH$featureLevel);
    public static final long OFFSET$powerPreference = LAYOUT.byteOffset(PATH$powerPreference);
    public static final long OFFSET$forceFallbackAdapter = LAYOUT.byteOffset(PATH$forceFallbackAdapter);
    public static final long OFFSET$backendType = LAYOUT.byteOffset(PATH$backendType);
    public static final long OFFSET$compatibleSurface = LAYOUT.byteOffset(PATH$compatibleSurface);
}
