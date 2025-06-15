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

/// Represents a pointer to a {@code AdapterInfo} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct AdapterInfo {
///     ChainedStruct* nextInChain; // @link substring="ChainedStruct" target="ChainedStruct" @link substring="nextInChain" target="#nextInChain"
///     StringView vendor; // @link substring="StringView" target="StringView" @link substring="vendor" target="#vendor"
///     StringView architecture; // @link substring="StringView" target="StringView" @link substring="architecture" target="#architecture"
///     StringView device; // @link substring="StringView" target="StringView" @link substring="device" target="#device"
///     StringView description; // @link substring="StringView" target="StringView" @link substring="description" target="#description"
///     BackendType backendType; // @link substring="BackendType" target="BackendType" @link substring="backendType" target="#backendType"
///     AdapterType adapterType; // @link substring="AdapterType" target="AdapterType" @link substring="adapterType" target="#adapterType"
///     uint32_t vendorId; // @link substring="vendorId" target="#vendorId"
///     uint32_t deviceId; // @link substring="deviceId" target="#deviceId"
///     uint32_t subgroupMinSize; // @link substring="subgroupMinSize" target="#subgroupMinSize"
///     uint32_t subgroupMaxSize; // @link substring="subgroupMaxSize" target="#subgroupMaxSize"
/// } AdapterInfo;
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
public record AdapterInfo(@NotNull MemorySegment segment) implements IAdapterInfo {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link AdapterInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IAdapterInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code AdapterInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IAdapterInfo, Iterable<AdapterInfo> {
        public long size() {
            return segment.byteSize() / AdapterInfo.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull AdapterInfo at(long index) {
            return new AdapterInfo(segment.asSlice(index * AdapterInfo.BYTES, AdapterInfo.BYTES));
        }

        public void write(long index, @NotNull AdapterInfo value) {
            MemorySegment s = segment.asSlice(index * AdapterInfo.BYTES, AdapterInfo.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * AdapterInfo.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * AdapterInfo.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * AdapterInfo.BYTES,
                (end - start) * AdapterInfo.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * AdapterInfo.BYTES));
        }

        public AdapterInfo[] toArray() {
            AdapterInfo[] ret = new AdapterInfo[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<AdapterInfo> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<AdapterInfo> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= AdapterInfo.BYTES;
            }

            @Override
            public AdapterInfo next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                AdapterInfo ret = new AdapterInfo(segment.asSlice(0, AdapterInfo.BYTES));
                segment = segment.asSlice(AdapterInfo.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static AdapterInfo allocate(Arena arena) {
        return new AdapterInfo(arena.allocate(LAYOUT));
    }

    public static AdapterInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new AdapterInfo.Ptr(segment);
    }

    public static AdapterInfo clone(Arena arena, AdapterInfo src) {
        AdapterInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public AdapterInfo nextInChain(@Nullable IChainedStruct value) {
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

    public @NotNull StringView vendor() {
        return new StringView(segment.asSlice(OFFSET$vendor, LAYOUT$vendor));
    }

    public AdapterInfo vendor(@NotNull StringView value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$vendor, SIZE$vendor);
        return this;
    }

    public AdapterInfo vendor(Consumer<@NotNull StringView> consumer) {
        consumer.accept(vendor());
        return this;
    }

    public @NotNull StringView architecture() {
        return new StringView(segment.asSlice(OFFSET$architecture, LAYOUT$architecture));
    }

    public AdapterInfo architecture(@NotNull StringView value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$architecture, SIZE$architecture);
        return this;
    }

    public AdapterInfo architecture(Consumer<@NotNull StringView> consumer) {
        consumer.accept(architecture());
        return this;
    }

    public @NotNull StringView device() {
        return new StringView(segment.asSlice(OFFSET$device, LAYOUT$device));
    }

    public AdapterInfo device(@NotNull StringView value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$device, SIZE$device);
        return this;
    }

    public AdapterInfo device(Consumer<@NotNull StringView> consumer) {
        consumer.accept(device());
        return this;
    }

    public @NotNull StringView description() {
        return new StringView(segment.asSlice(OFFSET$description, LAYOUT$description));
    }

    public AdapterInfo description(@NotNull StringView value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$description, SIZE$description);
        return this;
    }

    public AdapterInfo description(Consumer<@NotNull StringView> consumer) {
        consumer.accept(description());
        return this;
    }

    public @EnumType(BackendType.class) int backendType() {
        return segment.get(LAYOUT$backendType, OFFSET$backendType);
    }

    public AdapterInfo backendType(@EnumType(BackendType.class) int value) {
        segment.set(LAYOUT$backendType, OFFSET$backendType, value);
        return this;
    }

    public @EnumType(AdapterType.class) int adapterType() {
        return segment.get(LAYOUT$adapterType, OFFSET$adapterType);
    }

    public AdapterInfo adapterType(@EnumType(AdapterType.class) int value) {
        segment.set(LAYOUT$adapterType, OFFSET$adapterType, value);
        return this;
    }

    public @Unsigned int vendorId() {
        return segment.get(LAYOUT$vendorId, OFFSET$vendorId);
    }

    public AdapterInfo vendorId(@Unsigned int value) {
        segment.set(LAYOUT$vendorId, OFFSET$vendorId, value);
        return this;
    }

    public @Unsigned int deviceId() {
        return segment.get(LAYOUT$deviceId, OFFSET$deviceId);
    }

    public AdapterInfo deviceId(@Unsigned int value) {
        segment.set(LAYOUT$deviceId, OFFSET$deviceId, value);
        return this;
    }

    public @Unsigned int subgroupMinSize() {
        return segment.get(LAYOUT$subgroupMinSize, OFFSET$subgroupMinSize);
    }

    public AdapterInfo subgroupMinSize(@Unsigned int value) {
        segment.set(LAYOUT$subgroupMinSize, OFFSET$subgroupMinSize, value);
        return this;
    }

    public @Unsigned int subgroupMaxSize() {
        return segment.get(LAYOUT$subgroupMaxSize, OFFSET$subgroupMaxSize);
    }

    public AdapterInfo subgroupMaxSize(@Unsigned int value) {
        segment.set(LAYOUT$subgroupMaxSize, OFFSET$subgroupMaxSize, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withTargetLayout(ChainedStruct.LAYOUT).withName("nextInChain"),
        StringView.LAYOUT.withName("vendor"),
        StringView.LAYOUT.withName("architecture"),
        StringView.LAYOUT.withName("device"),
        StringView.LAYOUT.withName("description"),
        ValueLayout.JAVA_INT.withName("backendType"),
        ValueLayout.JAVA_INT.withName("adapterType"),
        ValueLayout.JAVA_INT.withName("vendorId"),
        ValueLayout.JAVA_INT.withName("deviceId"),
        ValueLayout.JAVA_INT.withName("subgroupMinSize"),
        ValueLayout.JAVA_INT.withName("subgroupMaxSize")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$nextInChain = PathElement.groupElement("nextInChain");
    public static final PathElement PATH$vendor = PathElement.groupElement("vendor");
    public static final PathElement PATH$architecture = PathElement.groupElement("architecture");
    public static final PathElement PATH$device = PathElement.groupElement("device");
    public static final PathElement PATH$description = PathElement.groupElement("description");
    public static final PathElement PATH$backendType = PathElement.groupElement("backendType");
    public static final PathElement PATH$adapterType = PathElement.groupElement("adapterType");
    public static final PathElement PATH$vendorId = PathElement.groupElement("vendorId");
    public static final PathElement PATH$deviceId = PathElement.groupElement("deviceId");
    public static final PathElement PATH$subgroupMinSize = PathElement.groupElement("subgroupMinSize");
    public static final PathElement PATH$subgroupMaxSize = PathElement.groupElement("subgroupMaxSize");

    public static final AddressLayout LAYOUT$nextInChain = (AddressLayout) LAYOUT.select(PATH$nextInChain);
    public static final StructLayout LAYOUT$vendor = (StructLayout) LAYOUT.select(PATH$vendor);
    public static final StructLayout LAYOUT$architecture = (StructLayout) LAYOUT.select(PATH$architecture);
    public static final StructLayout LAYOUT$device = (StructLayout) LAYOUT.select(PATH$device);
    public static final StructLayout LAYOUT$description = (StructLayout) LAYOUT.select(PATH$description);
    public static final OfInt LAYOUT$backendType = (OfInt) LAYOUT.select(PATH$backendType);
    public static final OfInt LAYOUT$adapterType = (OfInt) LAYOUT.select(PATH$adapterType);
    public static final OfInt LAYOUT$vendorId = (OfInt) LAYOUT.select(PATH$vendorId);
    public static final OfInt LAYOUT$deviceId = (OfInt) LAYOUT.select(PATH$deviceId);
    public static final OfInt LAYOUT$subgroupMinSize = (OfInt) LAYOUT.select(PATH$subgroupMinSize);
    public static final OfInt LAYOUT$subgroupMaxSize = (OfInt) LAYOUT.select(PATH$subgroupMaxSize);

    public static final long SIZE$nextInChain = LAYOUT$nextInChain.byteSize();
    public static final long SIZE$vendor = LAYOUT$vendor.byteSize();
    public static final long SIZE$architecture = LAYOUT$architecture.byteSize();
    public static final long SIZE$device = LAYOUT$device.byteSize();
    public static final long SIZE$description = LAYOUT$description.byteSize();
    public static final long SIZE$backendType = LAYOUT$backendType.byteSize();
    public static final long SIZE$adapterType = LAYOUT$adapterType.byteSize();
    public static final long SIZE$vendorId = LAYOUT$vendorId.byteSize();
    public static final long SIZE$deviceId = LAYOUT$deviceId.byteSize();
    public static final long SIZE$subgroupMinSize = LAYOUT$subgroupMinSize.byteSize();
    public static final long SIZE$subgroupMaxSize = LAYOUT$subgroupMaxSize.byteSize();

    public static final long OFFSET$nextInChain = LAYOUT.byteOffset(PATH$nextInChain);
    public static final long OFFSET$vendor = LAYOUT.byteOffset(PATH$vendor);
    public static final long OFFSET$architecture = LAYOUT.byteOffset(PATH$architecture);
    public static final long OFFSET$device = LAYOUT.byteOffset(PATH$device);
    public static final long OFFSET$description = LAYOUT.byteOffset(PATH$description);
    public static final long OFFSET$backendType = LAYOUT.byteOffset(PATH$backendType);
    public static final long OFFSET$adapterType = LAYOUT.byteOffset(PATH$adapterType);
    public static final long OFFSET$vendorId = LAYOUT.byteOffset(PATH$vendorId);
    public static final long OFFSET$deviceId = LAYOUT.byteOffset(PATH$deviceId);
    public static final long OFFSET$subgroupMinSize = LAYOUT.byteOffset(PATH$subgroupMinSize);
    public static final long OFFSET$subgroupMaxSize = LAYOUT.byteOffset(PATH$subgroupMaxSize);
}
