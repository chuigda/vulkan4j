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

/// Represents a pointer to a {@code DeviceDescriptor} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct DeviceDescriptor {
///     ChainedStruct* nextInChain; // @link substring="ChainedStruct" target="ChainedStruct" @link substring="nextInChain" target="#nextInChain"
///     StringView label; // @link substring="StringView" target="StringView" @link substring="label" target="#label"
///     size_t requiredFeatureCount; // @link substring="requiredFeatureCount" target="#requiredFeatureCount"
///     FeatureName const* requiredFeatures; // @link substring="FeatureName" target="FeatureName" @link substring="requiredFeatures" target="#requiredFeatures"
///     Limits requiredLimits; // optional // @link substring="Limits" target="Limits" @link substring="requiredLimits" target="#requiredLimits"
///     QueueDescriptor defaultQueue; // @link substring="QueueDescriptor" target="QueueDescriptor" @link substring="defaultQueue" target="#defaultQueue"
///     DeviceLostCallbackInfo* deviceLostCallbackInfo; // @link substring="DeviceLostCallbackInfo" target="DeviceLostCallbackInfo" @link substring="deviceLostCallbackInfo" target="#deviceLostCallbackInfo"
///     UncapturedErrorCallbackInfo* uncapturedErrorCallbackInfo; // @link substring="UncapturedErrorCallbackInfo" target="UncapturedErrorCallbackInfo" @link substring="uncapturedErrorCallbackInfo" target="#uncapturedErrorCallbackInfo"
/// } DeviceDescriptor;
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
public record DeviceDescriptor(@NotNull MemorySegment segment) implements IDeviceDescriptor {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link DeviceDescriptor}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IDeviceDescriptor to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code DeviceDescriptor.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IDeviceDescriptor, Iterable<DeviceDescriptor> {
        public long size() {
            return segment.byteSize() / DeviceDescriptor.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull DeviceDescriptor at(long index) {
            return new DeviceDescriptor(segment.asSlice(index * DeviceDescriptor.BYTES, DeviceDescriptor.BYTES));
        }

        public void write(long index, @NotNull DeviceDescriptor value) {
            MemorySegment s = segment.asSlice(index * DeviceDescriptor.BYTES, DeviceDescriptor.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * DeviceDescriptor.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * DeviceDescriptor.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * DeviceDescriptor.BYTES,
                (end - start) * DeviceDescriptor.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * DeviceDescriptor.BYTES));
        }

        public DeviceDescriptor[] toArray() {
            DeviceDescriptor[] ret = new DeviceDescriptor[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<DeviceDescriptor> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<DeviceDescriptor> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= DeviceDescriptor.BYTES;
            }

            @Override
            public DeviceDescriptor next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                DeviceDescriptor ret = new DeviceDescriptor(segment.asSlice(0, DeviceDescriptor.BYTES));
                segment = segment.asSlice(DeviceDescriptor.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static DeviceDescriptor allocate(Arena arena) {
        return new DeviceDescriptor(arena.allocate(LAYOUT));
    }

    public static DeviceDescriptor.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new DeviceDescriptor.Ptr(segment);
    }

    public static DeviceDescriptor clone(Arena arena, DeviceDescriptor src) {
        DeviceDescriptor ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public DeviceDescriptor nextInChain(@Nullable IChainedStruct value) {
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

    public @NotNull StringView label() {
        return new StringView(segment.asSlice(OFFSET$label, LAYOUT$label));
    }

    public DeviceDescriptor label(@NotNull StringView value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$label, SIZE$label);
        return this;
    }

    public DeviceDescriptor label(Consumer<@NotNull StringView> consumer) {
        consumer.accept(label());
        return this;
    }

    public @Unsigned long requiredFeatureCount() {
        return NativeLayout.readCSizeT(segment, OFFSET$requiredFeatureCount);
    }

    public DeviceDescriptor requiredFeatureCount(@Unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$requiredFeatureCount, value);
        return this;
    }


    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @EnumType(FeatureName.class) IntPtr requiredFeatures() {
        MemorySegment s = requiredFeaturesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public DeviceDescriptor requiredFeatures(@Nullable @EnumType(FeatureName.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        requiredFeaturesRaw(s);
        return this;
    }

    public @Pointer(target=FeatureName.class) MemorySegment requiredFeaturesRaw() {
        return segment.get(LAYOUT$requiredFeatures, OFFSET$requiredFeatures);
    }

    public void requiredFeaturesRaw(@Pointer(target=FeatureName.class) MemorySegment value) {
        segment.set(LAYOUT$requiredFeatures, OFFSET$requiredFeatures, value);
    }

    public @NotNull Limits requiredLimits() {
        return new Limits(segment.asSlice(OFFSET$requiredLimits, LAYOUT$requiredLimits));
    }

    public DeviceDescriptor requiredLimits(@NotNull Limits value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$requiredLimits, SIZE$requiredLimits);
        return this;
    }

    public DeviceDescriptor requiredLimits(Consumer<@NotNull Limits> consumer) {
        consumer.accept(requiredLimits());
        return this;
    }

    public @NotNull QueueDescriptor defaultQueue() {
        return new QueueDescriptor(segment.asSlice(OFFSET$defaultQueue, LAYOUT$defaultQueue));
    }

    public DeviceDescriptor defaultQueue(@NotNull QueueDescriptor value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$defaultQueue, SIZE$defaultQueue);
        return this;
    }

    public DeviceDescriptor defaultQueue(Consumer<@NotNull QueueDescriptor> consumer) {
        consumer.accept(defaultQueue());
        return this;
    }

    public DeviceDescriptor deviceLostCallbackInfo(@Nullable IDeviceLostCallbackInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        deviceLostCallbackInfoRaw(s);
        return this;
    }

    @Unsafe public @Nullable DeviceLostCallbackInfo.Ptr deviceLostCallbackInfo(int assumedCount) {
        MemorySegment s = deviceLostCallbackInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * DeviceLostCallbackInfo.BYTES);
        return new DeviceLostCallbackInfo.Ptr(s);
    }

    public @Nullable DeviceLostCallbackInfo deviceLostCallbackInfo() {
        MemorySegment s = deviceLostCallbackInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new DeviceLostCallbackInfo(s);
    }

    public @Pointer(target=DeviceLostCallbackInfo.class) MemorySegment deviceLostCallbackInfoRaw() {
        return segment.get(LAYOUT$deviceLostCallbackInfo, OFFSET$deviceLostCallbackInfo);
    }

    public void deviceLostCallbackInfoRaw(@Pointer(target=DeviceLostCallbackInfo.class) MemorySegment value) {
        segment.set(LAYOUT$deviceLostCallbackInfo, OFFSET$deviceLostCallbackInfo, value);
    }

    public DeviceDescriptor uncapturedErrorCallbackInfo(@Nullable IUncapturedErrorCallbackInfo value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        uncapturedErrorCallbackInfoRaw(s);
        return this;
    }

    @Unsafe public @Nullable UncapturedErrorCallbackInfo.Ptr uncapturedErrorCallbackInfo(int assumedCount) {
        MemorySegment s = uncapturedErrorCallbackInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * UncapturedErrorCallbackInfo.BYTES);
        return new UncapturedErrorCallbackInfo.Ptr(s);
    }

    public @Nullable UncapturedErrorCallbackInfo uncapturedErrorCallbackInfo() {
        MemorySegment s = uncapturedErrorCallbackInfoRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new UncapturedErrorCallbackInfo(s);
    }

    public @Pointer(target=UncapturedErrorCallbackInfo.class) MemorySegment uncapturedErrorCallbackInfoRaw() {
        return segment.get(LAYOUT$uncapturedErrorCallbackInfo, OFFSET$uncapturedErrorCallbackInfo);
    }

    public void uncapturedErrorCallbackInfoRaw(@Pointer(target=UncapturedErrorCallbackInfo.class) MemorySegment value) {
        segment.set(LAYOUT$uncapturedErrorCallbackInfo, OFFSET$uncapturedErrorCallbackInfo, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(ChainedStruct.LAYOUT).withName("nextInChain"),
        StringView.LAYOUT.withName("label"),
        NativeLayout.C_SIZE_T.withName("requiredFeatureCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("requiredFeatures"),
        Limits.LAYOUT.withName("requiredLimits"),
        QueueDescriptor.LAYOUT.withName("defaultQueue"),
        ValueLayout.ADDRESS.withTargetLayout(DeviceLostCallbackInfo.LAYOUT).withName("deviceLostCallbackInfo"),
        ValueLayout.ADDRESS.withTargetLayout(UncapturedErrorCallbackInfo.LAYOUT).withName("uncapturedErrorCallbackInfo")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$nextInChain = PathElement.groupElement("nextInChain");
    public static final PathElement PATH$label = PathElement.groupElement("label");
    public static final PathElement PATH$requiredFeatureCount = PathElement.groupElement("requiredFeatureCount");
    public static final PathElement PATH$requiredFeatures = PathElement.groupElement("requiredFeatures");
    public static final PathElement PATH$requiredLimits = PathElement.groupElement("requiredLimits");
    public static final PathElement PATH$defaultQueue = PathElement.groupElement("defaultQueue");
    public static final PathElement PATH$deviceLostCallbackInfo = PathElement.groupElement("deviceLostCallbackInfo");
    public static final PathElement PATH$uncapturedErrorCallbackInfo = PathElement.groupElement("uncapturedErrorCallbackInfo");

    public static final AddressLayout LAYOUT$nextInChain = (AddressLayout) LAYOUT.select(PATH$nextInChain);
    public static final StructLayout LAYOUT$label = (StructLayout) LAYOUT.select(PATH$label);
    public static final AddressLayout LAYOUT$requiredFeatures = (AddressLayout) LAYOUT.select(PATH$requiredFeatures);
    public static final StructLayout LAYOUT$requiredLimits = (StructLayout) LAYOUT.select(PATH$requiredLimits);
    public static final StructLayout LAYOUT$defaultQueue = (StructLayout) LAYOUT.select(PATH$defaultQueue);
    public static final AddressLayout LAYOUT$deviceLostCallbackInfo = (AddressLayout) LAYOUT.select(PATH$deviceLostCallbackInfo);
    public static final AddressLayout LAYOUT$uncapturedErrorCallbackInfo = (AddressLayout) LAYOUT.select(PATH$uncapturedErrorCallbackInfo);

    public static final long SIZE$nextInChain = LAYOUT$nextInChain.byteSize();
    public static final long SIZE$label = LAYOUT$label.byteSize();
    public static final long SIZE$requiredFeatureCount = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$requiredFeatures = LAYOUT$requiredFeatures.byteSize();
    public static final long SIZE$requiredLimits = LAYOUT$requiredLimits.byteSize();
    public static final long SIZE$defaultQueue = LAYOUT$defaultQueue.byteSize();
    public static final long SIZE$deviceLostCallbackInfo = LAYOUT$deviceLostCallbackInfo.byteSize();
    public static final long SIZE$uncapturedErrorCallbackInfo = LAYOUT$uncapturedErrorCallbackInfo.byteSize();

    public static final long OFFSET$nextInChain = LAYOUT.byteOffset(PATH$nextInChain);
    public static final long OFFSET$label = LAYOUT.byteOffset(PATH$label);
    public static final long OFFSET$requiredFeatureCount = LAYOUT.byteOffset(PATH$requiredFeatureCount);
    public static final long OFFSET$requiredFeatures = LAYOUT.byteOffset(PATH$requiredFeatures);
    public static final long OFFSET$requiredLimits = LAYOUT.byteOffset(PATH$requiredLimits);
    public static final long OFFSET$defaultQueue = LAYOUT.byteOffset(PATH$defaultQueue);
    public static final long OFFSET$deviceLostCallbackInfo = LAYOUT.byteOffset(PATH$deviceLostCallbackInfo);
    public static final long OFFSET$uncapturedErrorCallbackInfo = LAYOUT.byteOffset(PATH$uncapturedErrorCallbackInfo);
}
