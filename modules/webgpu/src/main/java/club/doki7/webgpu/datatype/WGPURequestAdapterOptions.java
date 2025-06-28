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

/// Represents a pointer to a {@code WGPURequestAdapterOptions} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPURequestAdapterOptions {
///     WGPUChainedStruct const* nextInChain; // optional // @link substring="WGPUChainedStruct" target="WGPUChainedStruct" @link substring="nextInChain" target="#nextInChain"
///     WGPUFeatureLevel featureLevel; // @link substring="WGPUFeatureLevel" target="WGPUFeatureLevel" @link substring="featureLevel" target="#featureLevel"
///     WGPUPowerPreference powerPreference; // @link substring="WGPUPowerPreference" target="WGPUPowerPreference" @link substring="powerPreference" target="#powerPreference"
///     WGPUBool forceFallbackAdapter; // @link substring="forceFallbackAdapter" target="#forceFallbackAdapter"
///     WGPUBackendType backendType; // @link substring="WGPUBackendType" target="WGPUBackendType" @link substring="backendType" target="#backendType"
///     WGPUSurface compatibleSurface; // optional // @link substring="WGPUSurface" target="WGPUSurface" @link substring="compatibleSurface" target="#compatibleSurface"
/// } WGPURequestAdapterOptions;
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
public record WGPURequestAdapterOptions(@NotNull MemorySegment segment) implements IWGPURequestAdapterOptions {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPURequestAdapterOptions}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPURequestAdapterOptions to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPURequestAdapterOptions.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPURequestAdapterOptions, Iterable<WGPURequestAdapterOptions> {
        public long size() {
            return segment.byteSize() / WGPURequestAdapterOptions.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPURequestAdapterOptions at(long index) {
            return new WGPURequestAdapterOptions(segment.asSlice(index * WGPURequestAdapterOptions.BYTES, WGPURequestAdapterOptions.BYTES));
        }

        public WGPURequestAdapterOptions.Ptr at(long index, @NotNull Consumer<@NotNull WGPURequestAdapterOptions> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPURequestAdapterOptions value) {
            MemorySegment s = segment.asSlice(index * WGPURequestAdapterOptions.BYTES, WGPURequestAdapterOptions.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPURequestAdapterOptions.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPURequestAdapterOptions.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPURequestAdapterOptions.BYTES,
                (end - start) * WGPURequestAdapterOptions.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPURequestAdapterOptions.BYTES));
        }

        public WGPURequestAdapterOptions[] toArray() {
            WGPURequestAdapterOptions[] ret = new WGPURequestAdapterOptions[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPURequestAdapterOptions> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPURequestAdapterOptions> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPURequestAdapterOptions.BYTES;
            }

            @Override
            public WGPURequestAdapterOptions next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPURequestAdapterOptions ret = new WGPURequestAdapterOptions(segment.asSlice(0, WGPURequestAdapterOptions.BYTES));
                segment = segment.asSlice(WGPURequestAdapterOptions.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPURequestAdapterOptions allocate(Arena arena) {
        return new WGPURequestAdapterOptions(arena.allocate(LAYOUT));
    }

    public static WGPURequestAdapterOptions.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPURequestAdapterOptions.Ptr(segment);
    }

    public static WGPURequestAdapterOptions clone(Arena arena, WGPURequestAdapterOptions src) {
        WGPURequestAdapterOptions ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public WGPURequestAdapterOptions nextInChain(@Nullable IWGPUChainedStruct value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        nextInChainRaw(s);
        return this;
    }

    @Unsafe public @Nullable WGPUChainedStruct.Ptr nextInChain(int assumedCount) {
        MemorySegment s = nextInChainRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * WGPUChainedStruct.BYTES);
        return new WGPUChainedStruct.Ptr(s);
    }

    public @Nullable WGPUChainedStruct nextInChain() {
        MemorySegment s = nextInChainRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new WGPUChainedStruct(s);
    }

    public @Pointer(target=WGPUChainedStruct.class) @NotNull MemorySegment nextInChainRaw() {
        return segment.get(LAYOUT$nextInChain, OFFSET$nextInChain);
    }

    public void nextInChainRaw(@Pointer(target=WGPUChainedStruct.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$nextInChain, OFFSET$nextInChain, value);
    }

    public @EnumType(WGPUFeatureLevel.class) int featureLevel() {
        return segment.get(LAYOUT$featureLevel, OFFSET$featureLevel);
    }

    public WGPURequestAdapterOptions featureLevel(@EnumType(WGPUFeatureLevel.class) int value) {
        segment.set(LAYOUT$featureLevel, OFFSET$featureLevel, value);
        return this;
    }

    public @EnumType(WGPUPowerPreference.class) int powerPreference() {
        return segment.get(LAYOUT$powerPreference, OFFSET$powerPreference);
    }

    public WGPURequestAdapterOptions powerPreference(@EnumType(WGPUPowerPreference.class) int value) {
        segment.set(LAYOUT$powerPreference, OFFSET$powerPreference, value);
        return this;
    }

    public @NativeType("WGPUBool") @Unsigned int forceFallbackAdapter() {
        return segment.get(LAYOUT$forceFallbackAdapter, OFFSET$forceFallbackAdapter);
    }

    public WGPURequestAdapterOptions forceFallbackAdapter(@NativeType("WGPUBool") @Unsigned int value) {
        segment.set(LAYOUT$forceFallbackAdapter, OFFSET$forceFallbackAdapter, value);
        return this;
    }

    public @EnumType(WGPUBackendType.class) int backendType() {
        return segment.get(LAYOUT$backendType, OFFSET$backendType);
    }

    public WGPURequestAdapterOptions backendType(@EnumType(WGPUBackendType.class) int value) {
        segment.set(LAYOUT$backendType, OFFSET$backendType, value);
        return this;
    }

    public @Nullable WGPUSurface compatibleSurface() {
        MemorySegment s = segment.asSlice(OFFSET$compatibleSurface, SIZE$compatibleSurface);
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new WGPUSurface(s);
    }

    public WGPURequestAdapterOptions compatibleSurface(@Nullable WGPUSurface value) {
        segment.set(LAYOUT$compatibleSurface, OFFSET$compatibleSurface, value != null ? value.segment() : MemorySegment.NULL);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(WGPUChainedStruct.LAYOUT).withName("nextInChain"),
        ValueLayout.JAVA_INT.withName("featureLevel"),
        ValueLayout.JAVA_INT.withName("powerPreference"),
        ValueLayout.JAVA_INT.withName("forceFallbackAdapter"),
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
    public static final OfInt LAYOUT$forceFallbackAdapter = (OfInt) LAYOUT.select(PATH$forceFallbackAdapter);
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
