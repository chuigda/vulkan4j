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

/// Represents a pointer to a {@code AdapterInfo} structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct AdapterInfo {
///     StringView vendor; // @link substring="WGPUStringView" target="WGPUStringView" @link substring="vendor" target="#vendor"
///     StringView architecture; // @link substring="WGPUStringView" target="WGPUStringView" @link substring="architecture" target="#architecture"
///     StringView device; // @link substring="WGPUStringView" target="WGPUStringView" @link substring="device" target="#device"
///     StringView description; // @link substring="WGPUStringView" target="WGPUStringView" @link substring="description" target="#description"
///     BackendType backendType; // @link substring="WGPUBackendType" target="WGPUBackendType" @link substring="backendType" target="#backendType"
///     AdapterType adapterType; // @link substring="WGPUAdapterType" target="WGPUAdapterType" @link substring="adapterType" target="#adapterType"
///     uint32_t vendorId; // @link substring="vendorId" target="#vendorId"
///     uint32_t deviceId; // @link substring="deviceId" target="#deviceId"
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
public record WGPUAdapterInfo(@NotNull MemorySegment segment) implements IWGPUAdapterInfo {
    /// Represents a pointer to / an array of null structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link WGPUAdapterInfo}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IWGPUAdapterInfo to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// ({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code WGPUAdapterInfo.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IWGPUAdapterInfo, Iterable<WGPUAdapterInfo> {
        public long size() {
            return segment.byteSize() / WGPUAdapterInfo.BYTES;
        }

        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull WGPUAdapterInfo at(long index) {
            return new WGPUAdapterInfo(segment.asSlice(index * WGPUAdapterInfo.BYTES, WGPUAdapterInfo.BYTES));
        }

        public WGPUAdapterInfo.Ptr at(long index, @NotNull Consumer<@NotNull WGPUAdapterInfo> consumer) {
            consumer.accept(at(index));
            return this;
        }

        public void write(long index, @NotNull WGPUAdapterInfo value) {
            MemorySegment s = segment.asSlice(index * WGPUAdapterInfo.BYTES, WGPUAdapterInfo.BYTES);
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
            return new Ptr(segment.reinterpret(newSize * WGPUAdapterInfo.BYTES));
        }

        public @NotNull Ptr offset(long offset) {
            return new Ptr(segment.asSlice(offset * WGPUAdapterInfo.BYTES));
        }

        /// Note that this function uses the {@link List#subList(int, int)} semantics (left inclusive,
        /// right exclusive interval), not {@link MemorySegment#asSlice(long, long)} semantics
        /// (offset + newSize). Be careful with the difference
        public @NotNull Ptr slice(long start, long end) {
            return new Ptr(segment.asSlice(
                start * WGPUAdapterInfo.BYTES,
                (end - start) * WGPUAdapterInfo.BYTES
            ));
        }

        public Ptr slice(long end) {
            return new Ptr(segment.asSlice(0, end * WGPUAdapterInfo.BYTES));
        }

        public WGPUAdapterInfo[] toArray() {
            WGPUAdapterInfo[] ret = new WGPUAdapterInfo[(int) size()];
            for (long i = 0; i < size(); i++) {
                ret[(int) i] = at(i);
            }
            return ret;
        }

        @Override
        public @NotNull Iterator<WGPUAdapterInfo> iterator() {
            return new Iter(this.segment());
        }

        /// An iterator over the structures.
        private static final class Iter implements Iterator<WGPUAdapterInfo> {
            Iter(@NotNull MemorySegment segment) {
                this.segment = segment;
            }

            @Override
            public boolean hasNext() {
                return segment.byteSize() >= WGPUAdapterInfo.BYTES;
            }

            @Override
            public WGPUAdapterInfo next() {
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                WGPUAdapterInfo ret = new WGPUAdapterInfo(segment.asSlice(0, WGPUAdapterInfo.BYTES));
                segment = segment.asSlice(WGPUAdapterInfo.BYTES);
                return ret;
            }

            private @NotNull MemorySegment segment;
        }
    }

    public static WGPUAdapterInfo allocate(Arena arena) {
        return new WGPUAdapterInfo(arena.allocate(LAYOUT));
    }

    public static WGPUAdapterInfo.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        return new WGPUAdapterInfo.Ptr(segment);
    }

    public static WGPUAdapterInfo clone(Arena arena, WGPUAdapterInfo src) {
        WGPUAdapterInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @NotNull WGPUStringView vendor() {
        return new WGPUStringView(segment.asSlice(OFFSET$vendor, LAYOUT$vendor));
    }

    public WGPUAdapterInfo vendor(@NotNull WGPUStringView value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$vendor, SIZE$vendor);
        return this;
    }

    public WGPUAdapterInfo vendor(Consumer<@NotNull WGPUStringView> consumer) {
        consumer.accept(vendor());
        return this;
    }

    public @NotNull WGPUStringView architecture() {
        return new WGPUStringView(segment.asSlice(OFFSET$architecture, LAYOUT$architecture));
    }

    public WGPUAdapterInfo architecture(@NotNull WGPUStringView value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$architecture, SIZE$architecture);
        return this;
    }

    public WGPUAdapterInfo architecture(Consumer<@NotNull WGPUStringView> consumer) {
        consumer.accept(architecture());
        return this;
    }

    public @NotNull WGPUStringView device() {
        return new WGPUStringView(segment.asSlice(OFFSET$device, LAYOUT$device));
    }

    public WGPUAdapterInfo device(@NotNull WGPUStringView value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$device, SIZE$device);
        return this;
    }

    public WGPUAdapterInfo device(Consumer<@NotNull WGPUStringView> consumer) {
        consumer.accept(device());
        return this;
    }

    public @NotNull WGPUStringView description() {
        return new WGPUStringView(segment.asSlice(OFFSET$description, LAYOUT$description));
    }

    public WGPUAdapterInfo description(@NotNull WGPUStringView value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$description, SIZE$description);
        return this;
    }

    public WGPUAdapterInfo description(Consumer<@NotNull WGPUStringView> consumer) {
        consumer.accept(description());
        return this;
    }

    public @EnumType(WGPUBackendType.class) int backendType() {
        return segment.get(LAYOUT$backendType, OFFSET$backendType);
    }

    public WGPUAdapterInfo backendType(@EnumType(WGPUBackendType.class) int value) {
        segment.set(LAYOUT$backendType, OFFSET$backendType, value);
        return this;
    }

    public @EnumType(WGPUAdapterType.class) int adapterType() {
        return segment.get(LAYOUT$adapterType, OFFSET$adapterType);
    }

    public WGPUAdapterInfo adapterType(@EnumType(WGPUAdapterType.class) int value) {
        segment.set(LAYOUT$adapterType, OFFSET$adapterType, value);
        return this;
    }

    public @Unsigned int vendorId() {
        return segment.get(LAYOUT$vendorId, OFFSET$vendorId);
    }

    public WGPUAdapterInfo vendorId(@Unsigned int value) {
        segment.set(LAYOUT$vendorId, OFFSET$vendorId, value);
        return this;
    }

    public @Unsigned int deviceId() {
        return segment.get(LAYOUT$deviceId, OFFSET$deviceId);
    }

    public WGPUAdapterInfo deviceId(@Unsigned int value) {
        segment.set(LAYOUT$deviceId, OFFSET$deviceId, value);
        return this;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        WGPUStringView.LAYOUT.withName("vendor"),
        WGPUStringView.LAYOUT.withName("architecture"),
        WGPUStringView.LAYOUT.withName("device"),
        WGPUStringView.LAYOUT.withName("description"),
        ValueLayout.JAVA_INT.withName("backendType"),
        ValueLayout.JAVA_INT.withName("adapterType"),
        ValueLayout.JAVA_INT.withName("vendorId"),
        ValueLayout.JAVA_INT.withName("deviceId")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$vendor = PathElement.groupElement("vendor");
    public static final PathElement PATH$architecture = PathElement.groupElement("architecture");
    public static final PathElement PATH$device = PathElement.groupElement("device");
    public static final PathElement PATH$description = PathElement.groupElement("description");
    public static final PathElement PATH$backendType = PathElement.groupElement("backendType");
    public static final PathElement PATH$adapterType = PathElement.groupElement("adapterType");
    public static final PathElement PATH$vendorId = PathElement.groupElement("vendorId");
    public static final PathElement PATH$deviceId = PathElement.groupElement("deviceId");

    public static final StructLayout LAYOUT$vendor = (StructLayout) LAYOUT.select(PATH$vendor);
    public static final StructLayout LAYOUT$architecture = (StructLayout) LAYOUT.select(PATH$architecture);
    public static final StructLayout LAYOUT$device = (StructLayout) LAYOUT.select(PATH$device);
    public static final StructLayout LAYOUT$description = (StructLayout) LAYOUT.select(PATH$description);
    public static final OfInt LAYOUT$backendType = (OfInt) LAYOUT.select(PATH$backendType);
    public static final OfInt LAYOUT$adapterType = (OfInt) LAYOUT.select(PATH$adapterType);
    public static final OfInt LAYOUT$vendorId = (OfInt) LAYOUT.select(PATH$vendorId);
    public static final OfInt LAYOUT$deviceId = (OfInt) LAYOUT.select(PATH$deviceId);

    public static final long SIZE$vendor = LAYOUT$vendor.byteSize();
    public static final long SIZE$architecture = LAYOUT$architecture.byteSize();
    public static final long SIZE$device = LAYOUT$device.byteSize();
    public static final long SIZE$description = LAYOUT$description.byteSize();
    public static final long SIZE$backendType = LAYOUT$backendType.byteSize();
    public static final long SIZE$adapterType = LAYOUT$adapterType.byteSize();
    public static final long SIZE$vendorId = LAYOUT$vendorId.byteSize();
    public static final long SIZE$deviceId = LAYOUT$deviceId.byteSize();

    public static final long OFFSET$vendor = LAYOUT.byteOffset(PATH$vendor);
    public static final long OFFSET$architecture = LAYOUT.byteOffset(PATH$architecture);
    public static final long OFFSET$device = LAYOUT.byteOffset(PATH$device);
    public static final long OFFSET$description = LAYOUT.byteOffset(PATH$description);
    public static final long OFFSET$backendType = LAYOUT.byteOffset(PATH$backendType);
    public static final long OFFSET$adapterType = LAYOUT.byteOffset(PATH$adapterType);
    public static final long OFFSET$vendorId = LAYOUT.byteOffset(PATH$vendorId);
    public static final long OFFSET$deviceId = LAYOUT.byteOffset(PATH$deviceId);
}
