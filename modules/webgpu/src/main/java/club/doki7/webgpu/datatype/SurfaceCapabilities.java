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

/// Represents a pointer to a {@code SurfaceCapabilities} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct SurfaceCapabilities {
///     ChainedStruct* nextInChain; // @link substring="ChainedStruct" target="ChainedStruct" @link substring="nextInChain" target="#nextInChain"
///     TextureUsage usages; // @link substring="TextureUsage" target="TextureUsage" @link substring="usages" target="#usages"
///     size_t formatCount; // @link substring="formatCount" target="#formatCount"
///     TextureFormat const* formats; // @link substring="TextureFormat" target="TextureFormat" @link substring="formats" target="#formats"
///     size_t presentModeCount; // @link substring="presentModeCount" target="#presentModeCount"
///     PresentMode const* presentModes; // @link substring="PresentMode" target="PresentMode" @link substring="presentModes" target="#presentModes"
///     size_t alphaModeCount; // @link substring="alphaModeCount" target="#alphaModeCount"
///     CompositeAlphaMode const* alphaModes; // @link substring="CompositeAlphaMode" target="CompositeAlphaMode" @link substring="alphaModes" target="#alphaModes"
/// } SurfaceCapabilities;
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
public record SurfaceCapabilities(@NotNull MemorySegment segment) implements ISurfaceCapabilities {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link SurfaceCapabilities}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// ISurfaceCapabilities to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code SurfaceCapabilities.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements ISurfaceCapabilities, Iterable<SurfaceCapabilities> {
        public long size() {
            return segment.byteSize() / SurfaceCapabilities.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull SurfaceCapabilities at(long index) {
            return new SurfaceCapabilities(segment.asSlice(index * SurfaceCapabilities.BYTES, SurfaceCapabilities.BYTES));
        }

        public void write(long index, @NotNull SurfaceCapabilities value) {
            MemorySegment s = segment.asSlice(index * SurfaceCapabilities.BYTES, SurfaceCapabilities.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * SurfaceCapabilities.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * SurfaceCapabilities.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * SurfaceCapabilities.BYTES,
                (end - start) * SurfaceCapabilities.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * SurfaceCapabilities.BYTES));
        }

        public SurfaceCapabilities[] toArray() {
            SurfaceCapabilities[] ret = new SurfaceCapabilities[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<SurfaceCapabilities> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<SurfaceCapabilities> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= SurfaceCapabilities.BYTES;
            }

            @Override
            public SurfaceCapabilities next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                SurfaceCapabilities ret = new SurfaceCapabilities(segment.asSlice(0, SurfaceCapabilities.BYTES));
                segment = segment.asSlice(SurfaceCapabilities.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static SurfaceCapabilities allocate(Arena arena) {
        return new SurfaceCapabilities(arena.allocate(LAYOUT));
    }

    public static SurfaceCapabilities.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new SurfaceCapabilities.Ptr(segment);
    }

    public static SurfaceCapabilities clone(Arena arena, SurfaceCapabilities src) {
        SurfaceCapabilities ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public SurfaceCapabilities nextInChain(@Nullable IChainedStruct value) {
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

    public @EnumType(TextureUsage.class) long usages() {
        return segment.get(LAYOUT$usages, OFFSET$usages);
    }

    public SurfaceCapabilities usages(@EnumType(TextureUsage.class) long value) {
        segment.set(LAYOUT$usages, OFFSET$usages, value);
        return this;
    }

    public @Unsigned long formatCount() {
        return NativeLayout.readCSizeT(segment, OFFSET$formatCount);
    }

    public SurfaceCapabilities formatCount(@Unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$formatCount, value);
        return this;
    }


    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @EnumType(TextureFormat.class) IntPtr formats() {
        MemorySegment s = formatsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public SurfaceCapabilities formats(@Nullable @EnumType(TextureFormat.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        formatsRaw(s);
        return this;
    }

    public @Pointer(target=TextureFormat.class) MemorySegment formatsRaw() {
        return segment.get(LAYOUT$formats, OFFSET$formats);
    }

    public void formatsRaw(@Pointer(target=TextureFormat.class) MemorySegment value) {
        segment.set(LAYOUT$formats, OFFSET$formats, value);
    }

    public @Unsigned long presentModeCount() {
        return NativeLayout.readCSizeT(segment, OFFSET$presentModeCount);
    }

    public SurfaceCapabilities presentModeCount(@Unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$presentModeCount, value);
        return this;
    }


    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @EnumType(PresentMode.class) IntPtr presentModes() {
        MemorySegment s = presentModesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public SurfaceCapabilities presentModes(@Nullable @EnumType(PresentMode.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        presentModesRaw(s);
        return this;
    }

    public @Pointer(target=PresentMode.class) MemorySegment presentModesRaw() {
        return segment.get(LAYOUT$presentModes, OFFSET$presentModes);
    }

    public void presentModesRaw(@Pointer(target=PresentMode.class) MemorySegment value) {
        segment.set(LAYOUT$presentModes, OFFSET$presentModes, value);
    }

    public @Unsigned long alphaModeCount() {
        return NativeLayout.readCSizeT(segment, OFFSET$alphaModeCount);
    }

    public SurfaceCapabilities alphaModeCount(@Unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$alphaModeCount, value);
        return this;
    }


    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @EnumType(CompositeAlphaMode.class) IntPtr alphaModes() {
        MemorySegment s = alphaModesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public SurfaceCapabilities alphaModes(@Nullable @EnumType(CompositeAlphaMode.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        alphaModesRaw(s);
        return this;
    }

    public @Pointer(target=CompositeAlphaMode.class) MemorySegment alphaModesRaw() {
        return segment.get(LAYOUT$alphaModes, OFFSET$alphaModes);
    }

    public void alphaModesRaw(@Pointer(target=CompositeAlphaMode.class) MemorySegment value) {
        segment.set(LAYOUT$alphaModes, OFFSET$alphaModes, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(ChainedStruct.LAYOUT).withName("nextInChain"),
        ValueLayout.JAVA_LONG.withName("usages"),
        NativeLayout.C_SIZE_T.withName("formatCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("formats"),
        NativeLayout.C_SIZE_T.withName("presentModeCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("presentModes"),
        NativeLayout.C_SIZE_T.withName("alphaModeCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("alphaModes")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$nextInChain = PathElement.groupElement("nextInChain");
    public static final PathElement PATH$usages = PathElement.groupElement("usages");
    public static final PathElement PATH$formatCount = PathElement.groupElement("formatCount");
    public static final PathElement PATH$formats = PathElement.groupElement("formats");
    public static final PathElement PATH$presentModeCount = PathElement.groupElement("presentModeCount");
    public static final PathElement PATH$presentModes = PathElement.groupElement("presentModes");
    public static final PathElement PATH$alphaModeCount = PathElement.groupElement("alphaModeCount");
    public static final PathElement PATH$alphaModes = PathElement.groupElement("alphaModes");

    public static final AddressLayout LAYOUT$nextInChain = (AddressLayout) LAYOUT.select(PATH$nextInChain);
    public static final OfLong LAYOUT$usages = (OfLong) LAYOUT.select(PATH$usages);
    public static final AddressLayout LAYOUT$formats = (AddressLayout) LAYOUT.select(PATH$formats);
    public static final AddressLayout LAYOUT$presentModes = (AddressLayout) LAYOUT.select(PATH$presentModes);
    public static final AddressLayout LAYOUT$alphaModes = (AddressLayout) LAYOUT.select(PATH$alphaModes);

    public static final long SIZE$nextInChain = LAYOUT$nextInChain.byteSize();
    public static final long SIZE$usages = LAYOUT$usages.byteSize();
    public static final long SIZE$formatCount = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$formats = LAYOUT$formats.byteSize();
    public static final long SIZE$presentModeCount = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$presentModes = LAYOUT$presentModes.byteSize();
    public static final long SIZE$alphaModeCount = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$alphaModes = LAYOUT$alphaModes.byteSize();

    public static final long OFFSET$nextInChain = LAYOUT.byteOffset(PATH$nextInChain);
    public static final long OFFSET$usages = LAYOUT.byteOffset(PATH$usages);
    public static final long OFFSET$formatCount = LAYOUT.byteOffset(PATH$formatCount);
    public static final long OFFSET$formats = LAYOUT.byteOffset(PATH$formats);
    public static final long OFFSET$presentModeCount = LAYOUT.byteOffset(PATH$presentModeCount);
    public static final long OFFSET$presentModes = LAYOUT.byteOffset(PATH$presentModes);
    public static final long OFFSET$alphaModeCount = LAYOUT.byteOffset(PATH$alphaModeCount);
    public static final long OFFSET$alphaModes = LAYOUT.byteOffset(PATH$alphaModes);
}
