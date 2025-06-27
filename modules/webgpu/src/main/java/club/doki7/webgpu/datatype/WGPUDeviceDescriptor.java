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

/// Represents a pointer to a {@code WGPUDeviceDescriptor} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct WGPUDeviceDescriptor {
///     WGPUStringView label; // @link substring="WGPUStringView" target="WGPUStringView" @link substring="label" target="#label"
///     WGPUFeatureName const* requiredFeatures; // @link substring="WGPUFeatureName" target="WGPUFeatureName" @link substring="requiredFeatures" target="#requiredFeatures"
///     WGPULimits const* requiredLimits; // optional // @link substring="WGPULimits" target="WGPULimits" @link substring="requiredLimits" target="#requiredLimits"
///     WGPUQueueDescriptor defaultQueue; // @link substring="WGPUQueueDescriptor" target="WGPUQueueDescriptor" @link substring="defaultQueue" target="#defaultQueue"
///     PFN_wgpuDeviceLost deviceLostCallbackInfo; // @link substring="deviceLostCallbackInfo" target="#deviceLostCallbackInfo"
///     PFN_wgpuUncapturedError uncapturedErrorCallbackInfo; // @link substring="uncapturedErrorCallbackInfo" target="#uncapturedErrorCallbackInfo"
/// } WGPUDeviceDescriptor;
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
public record WGPUDeviceDescriptor(@NotNull MemorySegment segment) implements IWGPUDeviceDescriptor {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUDeviceDescriptor}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUDeviceDescriptor to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUDeviceDescriptor.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUDeviceDescriptor, Iterable<WGPUDeviceDescriptor> {
        public long size() {
            return segment.byteSize() / WGPUDeviceDescriptor.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUDeviceDescriptor at(long index) {
            return new WGPUDeviceDescriptor(segment.asSlice(index * WGPUDeviceDescriptor.BYTES, WGPUDeviceDescriptor.BYTES));
        }

        public WGPUDeviceDescriptor.Ptr at(long index, @NotNull Consumer<@NotNull WGPUDeviceDescriptor> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUDeviceDescriptor value) {
            MemorySegment s = segment.asSlice(index * WGPUDeviceDescriptor.BYTES, WGPUDeviceDescriptor.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUDeviceDescriptor.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUDeviceDescriptor.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUDeviceDescriptor.BYTES,
                (end - start) * WGPUDeviceDescriptor.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUDeviceDescriptor.BYTES));
        }

        public WGPUDeviceDescriptor[] toArray() {
            WGPUDeviceDescriptor[] ret = new WGPUDeviceDescriptor[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUDeviceDescriptor> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUDeviceDescriptor> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUDeviceDescriptor.BYTES;
            }

            @Override
            public WGPUDeviceDescriptor next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUDeviceDescriptor ret = new WGPUDeviceDescriptor(segment.asSlice(0, WGPUDeviceDescriptor.BYTES));
                segment = segment.asSlice(WGPUDeviceDescriptor.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUDeviceDescriptor allocate(Arena arena) {
        return new WGPUDeviceDescriptor(arena.allocate(LAYOUT));
    }

    public static WGPUDeviceDescriptor.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUDeviceDescriptor.Ptr(segment);
    }

    public static WGPUDeviceDescriptor clone(Arena arena, WGPUDeviceDescriptor src) {
        WGPUDeviceDescriptor ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NotNull WGPUStringView label() {
        return new WGPUStringView(segment.asSlice(OFFSET$label, LAYOUT$label));
    }

    public WGPUDeviceDescriptor label(@NotNull WGPUStringView value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$label, SIZE$label);
        return this;
    }

    public WGPUDeviceDescriptor label(Consumer<@NotNull WGPUStringView> consumer) {
        consumer.accept(label());
        return this;
    }


    /// Note: the returned {@link IntPtr} does not have correct
    /// {@link IntPtr#size} property. It's up to user to track the size of the buffer,
    /// and use {@link IntPtr#reinterpret} to set the size before actually reading fro
    /// or writing to the buffer.
    public @Nullable @EnumType(WGPUFeatureName.class) IntPtr requiredFeatures() {
        MemorySegment s = requiredFeaturesRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new IntPtr(s);
    }

    public WGPUDeviceDescriptor requiredFeatures(@Nullable @EnumType(WGPUFeatureName.class) IntPtr value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        requiredFeaturesRaw(s);
        return this;
    }

    public @Pointer(target=WGPUFeatureName.class) @NotNull MemorySegment requiredFeaturesRaw() {
        return segment.get(LAYOUT$requiredFeatures, OFFSET$requiredFeatures);
    }

    public void requiredFeaturesRaw(@Pointer(target=WGPUFeatureName.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$requiredFeatures, OFFSET$requiredFeatures, value);
    }

    public WGPUDeviceDescriptor requiredLimits(@Nullable IWGPULimits value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        requiredLimitsRaw(s);
        return this;
    }

    @Unsafe public @Nullable WGPULimits.Ptr requiredLimits(int assumedCount) {
        MemorySegment s = requiredLimitsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }

        s = s.reinterpret(assumedCount * WGPULimits.BYTES);
        return new WGPULimits.Ptr(s);
    }

    public @Nullable WGPULimits requiredLimits() {
        MemorySegment s = requiredLimitsRaw();
        if (s.equals(MemorySegment.NULL)) {
            return null;
        }
        return new WGPULimits(s);
    }

    public @Pointer(target=WGPULimits.class) @NotNull MemorySegment requiredLimitsRaw() {
        return segment.get(LAYOUT$requiredLimits, OFFSET$requiredLimits);
    }

    public void requiredLimitsRaw(@Pointer(target=WGPULimits.class) @NotNull MemorySegment value) {
        segment.set(LAYOUT$requiredLimits, OFFSET$requiredLimits, value);
    }

    public @NotNull WGPUQueueDescriptor defaultQueue() {
        return new WGPUQueueDescriptor(segment.asSlice(OFFSET$defaultQueue, LAYOUT$defaultQueue));
    }

    public WGPUDeviceDescriptor defaultQueue(@NotNull WGPUQueueDescriptor value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$defaultQueue, SIZE$defaultQueue);
        return this;
    }

    public WGPUDeviceDescriptor defaultQueue(Consumer<@NotNull WGPUQueueDescriptor> consumer) {
        consumer.accept(defaultQueue());
        return this;
    }

    public @Pointer(comment="PFN_wgpuDeviceLost") @NotNull MemorySegment deviceLostCallbackInfo() {
        return segment.get(LAYOUT$deviceLostCallbackInfo, OFFSET$deviceLostCallbackInfo);
    }

    public WGPUDeviceDescriptor deviceLostCallbackInfo(@Pointer(comment="PFN_wgpuDeviceLost") @NotNull MemorySegment value) {
        segment.set(LAYOUT$deviceLostCallbackInfo, OFFSET$deviceLostCallbackInfo, value);
        return this;
    }

    public WGPUDeviceDescriptor deviceLostCallbackInfo(@Nullable IPointer pointer) {
        deviceLostCallbackInfo(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public @Pointer(comment="PFN_wgpuUncapturedError") @NotNull MemorySegment uncapturedErrorCallbackInfo() {
        return segment.get(LAYOUT$uncapturedErrorCallbackInfo, OFFSET$uncapturedErrorCallbackInfo);
    }

    public WGPUDeviceDescriptor uncapturedErrorCallbackInfo(@Pointer(comment="PFN_wgpuUncapturedError") @NotNull MemorySegment value) {
        segment.set(LAYOUT$uncapturedErrorCallbackInfo, OFFSET$uncapturedErrorCallbackInfo, value);
        return this;
    }

    public WGPUDeviceDescriptor uncapturedErrorCallbackInfo(@Nullable IPointer pointer) {
        uncapturedErrorCallbackInfo(pointer != null ? pointer.segment() : MemorySegment.NULL);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        WGPUStringView.LAYOUT.withName("label"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.JAVA_INT).withName("requiredFeatures"),
        ValueLayout.ADDRESS.withTargetLayout(WGPULimits.LAYOUT).withName("requiredLimits"),
        WGPUQueueDescriptor.LAYOUT.withName("defaultQueue"),
        ValueLayout.ADDRESS.withName("deviceLostCallbackInfo"),
        ValueLayout.ADDRESS.withName("uncapturedErrorCallbackInfo")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$label = PathElement.groupElement("label");
    public static final PathElement PATH$requiredFeatures = PathElement.groupElement("requiredFeatures");
    public static final PathElement PATH$requiredLimits = PathElement.groupElement("requiredLimits");
    public static final PathElement PATH$defaultQueue = PathElement.groupElement("defaultQueue");
    public static final PathElement PATH$deviceLostCallbackInfo = PathElement.groupElement("deviceLostCallbackInfo");
    public static final PathElement PATH$uncapturedErrorCallbackInfo = PathElement.groupElement("uncapturedErrorCallbackInfo");

    public static final StructLayout LAYOUT$label = (StructLayout) LAYOUT.select(PATH$label);
    public static final AddressLayout LAYOUT$requiredFeatures = (AddressLayout) LAYOUT.select(PATH$requiredFeatures);
    public static final AddressLayout LAYOUT$requiredLimits = (AddressLayout) LAYOUT.select(PATH$requiredLimits);
    public static final StructLayout LAYOUT$defaultQueue = (StructLayout) LAYOUT.select(PATH$defaultQueue);
    public static final AddressLayout LAYOUT$deviceLostCallbackInfo = (AddressLayout) LAYOUT.select(PATH$deviceLostCallbackInfo);
    public static final AddressLayout LAYOUT$uncapturedErrorCallbackInfo = (AddressLayout) LAYOUT.select(PATH$uncapturedErrorCallbackInfo);

    public static final long SIZE$label = LAYOUT$label.byteSize();
    public static final long SIZE$requiredFeatures = LAYOUT$requiredFeatures.byteSize();
    public static final long SIZE$requiredLimits = LAYOUT$requiredLimits.byteSize();
    public static final long SIZE$defaultQueue = LAYOUT$defaultQueue.byteSize();
    public static final long SIZE$deviceLostCallbackInfo = LAYOUT$deviceLostCallbackInfo.byteSize();
    public static final long SIZE$uncapturedErrorCallbackInfo = LAYOUT$uncapturedErrorCallbackInfo.byteSize();

    public static final long OFFSET$label = LAYOUT.byteOffset(PATH$label);
    public static final long OFFSET$requiredFeatures = LAYOUT.byteOffset(PATH$requiredFeatures);
    public static final long OFFSET$requiredLimits = LAYOUT.byteOffset(PATH$requiredLimits);
    public static final long OFFSET$defaultQueue = LAYOUT.byteOffset(PATH$defaultQueue);
    public static final long OFFSET$deviceLostCallbackInfo = LAYOUT.byteOffset(PATH$deviceLostCallbackInfo);
    public static final long OFFSET$uncapturedErrorCallbackInfo = LAYOUT.byteOffset(PATH$uncapturedErrorCallbackInfo);
}
