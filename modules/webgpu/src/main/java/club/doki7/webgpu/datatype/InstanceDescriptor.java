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

/// Represents a pointer to a {@code InstanceDescriptor} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct InstanceDescriptor {
///     ChainedStruct* nextInChain; // @link substring="ChainedStruct" target="ChainedStruct" @link substring="nextInChain" target="#nextInChain"
///     size_t requiredFeatureCount; // @link substring="requiredFeatureCount" target="#requiredFeatureCount"
///     InstanceFeatureName const* requiredFeatures; // @link substring="InstanceFeatureName" target="InstanceFeatureName" @link substring="requiredFeatures" target="#requiredFeatures"
///     InstanceLimits requiredLimits; // optional // @link substring="InstanceLimits" target="InstanceLimits" @link substring="requiredLimits" target="#requiredLimits"
/// } InstanceDescriptor;
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
public record InstanceDescriptor(@NotNull MemorySegment segment) implements IInstanceDescriptor {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link InstanceDescriptor}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IInstanceDescriptor to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code InstanceDescriptor.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IInstanceDescriptor, Iterable<InstanceDescriptor> {
        public long size() {
            return segment.byteSize() / InstanceDescriptor.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull InstanceDescriptor at(long index) {
            return new InstanceDescriptor(segment.asSlice(index * InstanceDescriptor.BYTES, InstanceDescriptor.BYTES));
        }

        public void write(long index, @NotNull InstanceDescriptor value) {
            MemorySegment s = segment.asSlice(index * InstanceDescriptor.BYTES, InstanceDescriptor.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * InstanceDescriptor.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * InstanceDescriptor.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * InstanceDescriptor.BYTES,
                (end - start) * InstanceDescriptor.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * InstanceDescriptor.BYTES));
        }

        public InstanceDescriptor[] toArray() {
            InstanceDescriptor[] ret = new InstanceDescriptor[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<InstanceDescriptor> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<InstanceDescriptor> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= InstanceDescriptor.BYTES;
            }

            @Override
            public InstanceDescriptor next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                InstanceDescriptor ret = new InstanceDescriptor(segment.asSlice(0, InstanceDescriptor.BYTES));
                segment = segment.asSlice(InstanceDescriptor.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static InstanceDescriptor allocate(Arena arena) {
        return new InstanceDescriptor(arena.allocate(LAYOUT));
    }

    public static InstanceDescriptor.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new InstanceDescriptor.Ptr(segment);
    }

    public static InstanceDescriptor clone(Arena arena, InstanceDescriptor src) {
        InstanceDescriptor ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public InstanceDescriptor nextInChain(@Nullable IChainedStruct value) {
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

    public @Unsigned long requiredFeatureCount() {
        return NativeLayout.readCSizeT(segment, OFFSET$requiredFeatureCount);
    }

    public InstanceDescriptor requiredFeatureCount(@Unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$requiredFeatureCount, value);
        return this;
    }


    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @EnumType(InstanceFeatureName.class) IntPtr requiredFeatures() {
        MemorySegment s = requiredFeaturesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public InstanceDescriptor requiredFeatures(@Nullable @EnumType(InstanceFeatureName.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        requiredFeaturesRaw(s);
        return this;
    }

    public @Pointer(target=InstanceFeatureName.class) MemorySegment requiredFeaturesRaw() {
        return segment.get(LAYOUT$requiredFeatures, OFFSET$requiredFeatures);
    }

    public void requiredFeaturesRaw(@Pointer(target=InstanceFeatureName.class) MemorySegment value) {
        segment.set(LAYOUT$requiredFeatures, OFFSET$requiredFeatures, value);
    }

    public @NotNull InstanceLimits requiredLimits() {
        return new InstanceLimits(segment.asSlice(OFFSET$requiredLimits, LAYOUT$requiredLimits));
    }

    public InstanceDescriptor requiredLimits(@NotNull InstanceLimits value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$requiredLimits, SIZE$requiredLimits);
        return this;
    }

    public InstanceDescriptor requiredLimits(Consumer<@NotNull InstanceLimits> consumer) {
        consumer.accept(requiredLimits());
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(ChainedStruct.LAYOUT).withName("nextInChain"),
        NativeLayout.C_SIZE_T.withName("requiredFeatureCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("requiredFeatures"),
        InstanceLimits.LAYOUT.withName("requiredLimits")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$nextInChain = PathElement.groupElement("nextInChain");
    public static final PathElement PATH$requiredFeatureCount = PathElement.groupElement("requiredFeatureCount");
    public static final PathElement PATH$requiredFeatures = PathElement.groupElement("requiredFeatures");
    public static final PathElement PATH$requiredLimits = PathElement.groupElement("requiredLimits");

    public static final AddressLayout LAYOUT$nextInChain = (AddressLayout) LAYOUT.select(PATH$nextInChain);
    public static final AddressLayout LAYOUT$requiredFeatures = (AddressLayout) LAYOUT.select(PATH$requiredFeatures);
    public static final StructLayout LAYOUT$requiredLimits = (StructLayout) LAYOUT.select(PATH$requiredLimits);

    public static final long SIZE$nextInChain = LAYOUT$nextInChain.byteSize();
    public static final long SIZE$requiredFeatureCount = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$requiredFeatures = LAYOUT$requiredFeatures.byteSize();
    public static final long SIZE$requiredLimits = LAYOUT$requiredLimits.byteSize();

    public static final long OFFSET$nextInChain = LAYOUT.byteOffset(PATH$nextInChain);
    public static final long OFFSET$requiredFeatureCount = LAYOUT.byteOffset(PATH$requiredFeatureCount);
    public static final long OFFSET$requiredFeatures = LAYOUT.byteOffset(PATH$requiredFeatures);
    public static final long OFFSET$requiredLimits = LAYOUT.byteOffset(PATH$requiredLimits);
}
