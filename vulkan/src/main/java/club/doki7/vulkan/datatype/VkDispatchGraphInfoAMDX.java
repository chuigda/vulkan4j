package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDispatchGraphInfoAMDX.html"><code>VkDispatchGraphInfoAMDX</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDispatchGraphInfoAMDX {
///     uint32_t nodeIndex; // @link substring="nodeIndex" target="#nodeIndex"
///     uint32_t payloadCount; // optional // @link substring="payloadCount" target="#payloadCount"
///     VkDeviceOrHostAddressConstAMDX payloads; // @link substring="VkDeviceOrHostAddressConstAMDX" target="VkDeviceOrHostAddressConstAMDX" @link substring="payloads" target="#payloads"
///     uint64_t payloadStride; // @link substring="payloadStride" target="#payloadStride"
/// } VkDispatchGraphInfoAMDX;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDispatchGraphInfoAMDX.html"><code>VkDispatchGraphInfoAMDX</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDispatchGraphInfoAMDX(@NotNull MemorySegment segment) implements IVkDispatchGraphInfoAMDX {
    /// Represents a pointer to / an array of <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDispatchGraphInfoAMDX.html"><code>VkDispatchGraphInfoAMDX</code></a> structure(s) in native memory.
    ///
    /// Technically speaking, this type has no difference with {@link VkDispatchGraphInfoAMDX}. This type
    /// is introduced mainly for user to distinguish between a pointer to a single structure
    /// and a pointer to (potentially) an array of structure(s). APIs should use interface
    /// IVkDispatchGraphInfoAMDX to handle both types uniformly. See package level documentation for more
    /// details.
    ///
    /// ## Contracts
    ///
    /// The property {@link #segment()} should always be not-null
    /// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
    /// {@code VkDispatchGraphInfoAMDX.LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
    /// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
    ///
    /// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
    /// perform any runtime check. The constructor can be useful for automatic code generators.
    @ValueBasedCandidate
    @UnsafeConstructor
    public record Ptr(@NotNull MemorySegment segment) implements IVkDispatchGraphInfoAMDX {
        public long size() {
            return segment.byteSize() / VkDispatchGraphInfoAMDX.BYTES;
        }
        /// Returns (a pointer to) the structure at the given index.
        ///
        /// Note that unlike {@code read} series functions ({@link IntPtr#read()} for
        /// example), modification on returned structure will be reflected on the original
        /// structure array. So this function is called {@code at} to explicitly
        /// indicate that the returned structure is a view of the original structure.
        public @NotNull VkDispatchGraphInfoAMDX at(long index) {
            return new VkDispatchGraphInfoAMDX(segment.asSlice(index * VkDispatchGraphInfoAMDX.BYTES, VkDispatchGraphInfoAMDX.BYTES));
        }
        public void write(long index, @NotNull VkDispatchGraphInfoAMDX value) {
            MemorySegment s = segment.asSlice(index * VkDispatchGraphInfoAMDX.BYTES, VkDispatchGraphInfoAMDX.BYTES);
            s.copyFrom(value.segment);
        }
    }
    public static VkDispatchGraphInfoAMDX allocate(Arena arena) {
        return new VkDispatchGraphInfoAMDX(arena.allocate(LAYOUT));
    }

    public static VkDispatchGraphInfoAMDX.Ptr allocate(Arena arena, long count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDispatchGraphInfoAMDX.Ptr ret = new VkDispatchGraphInfoAMDX.Ptr(segment);
        for (long i = 0; i < count; i ++) {
        }
        return ret;
    }

    public static VkDispatchGraphInfoAMDX clone(Arena arena, VkDispatchGraphInfoAMDX src) {
        VkDispatchGraphInfoAMDX ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public @unsigned int nodeIndex() {
        return segment.get(LAYOUT$nodeIndex, OFFSET$nodeIndex);
    }

    public void nodeIndex(@unsigned int value) {
        segment.set(LAYOUT$nodeIndex, OFFSET$nodeIndex, value);
    }

    public @unsigned int payloadCount() {
        return segment.get(LAYOUT$payloadCount, OFFSET$payloadCount);
    }

    public void payloadCount(@unsigned int value) {
        segment.set(LAYOUT$payloadCount, OFFSET$payloadCount, value);
    }

    public @NotNull VkDeviceOrHostAddressConstAMDX payloads() {
        return new VkDeviceOrHostAddressConstAMDX(segment.asSlice(OFFSET$payloads, LAYOUT$payloads));
    }

    public void payloads(@NotNull VkDeviceOrHostAddressConstAMDX value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$payloads, SIZE$payloads);
    }

    public @unsigned long payloadStride() {
        return segment.get(LAYOUT$payloadStride, OFFSET$payloadStride);
    }

    public void payloadStride(@unsigned long value) {
        segment.set(LAYOUT$payloadStride, OFFSET$payloadStride, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("nodeIndex"),
        ValueLayout.JAVA_INT.withName("payloadCount"),
        VkDeviceOrHostAddressConstAMDX.LAYOUT.withName("payloads"),
        ValueLayout.JAVA_LONG.withName("payloadStride")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$nodeIndex = PathElement.groupElement("nodeIndex");
    public static final PathElement PATH$payloadCount = PathElement.groupElement("payloadCount");
    public static final PathElement PATH$payloads = PathElement.groupElement("payloads");
    public static final PathElement PATH$payloadStride = PathElement.groupElement("payloadStride");

    public static final OfInt LAYOUT$nodeIndex = (OfInt) LAYOUT.select(PATH$nodeIndex);
    public static final OfInt LAYOUT$payloadCount = (OfInt) LAYOUT.select(PATH$payloadCount);
    public static final StructLayout LAYOUT$payloads = (StructLayout) LAYOUT.select(PATH$payloads);
    public static final OfLong LAYOUT$payloadStride = (OfLong) LAYOUT.select(PATH$payloadStride);

    public static final long SIZE$nodeIndex = LAYOUT$nodeIndex.byteSize();
    public static final long SIZE$payloadCount = LAYOUT$payloadCount.byteSize();
    public static final long SIZE$payloads = LAYOUT$payloads.byteSize();
    public static final long SIZE$payloadStride = LAYOUT$payloadStride.byteSize();

    public static final long OFFSET$nodeIndex = LAYOUT.byteOffset(PATH$nodeIndex);
    public static final long OFFSET$payloadCount = LAYOUT.byteOffset(PATH$payloadCount);
    public static final long OFFSET$payloads = LAYOUT.byteOffset(PATH$payloads);
    public static final long OFFSET$payloadStride = LAYOUT.byteOffset(PATH$payloadStride);
}
