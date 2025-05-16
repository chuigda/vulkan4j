package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.handle.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDispatchGraphInfoAMDX.html"><code>VkDispatchGraphInfoAMDX</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkDispatchGraphInfoAMDX {
///     uint32_t nodeIndex;
///     uint32_t payloadCount; // optional
///     VkDeviceOrHostAddressConstAMDX payloads;
///     uint64_t payloadStride;
/// } VkDispatchGraphInfoAMDX;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDispatchGraphInfoAMDX.html"><code>VkDispatchGraphInfoAMDX</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkDispatchGraphInfoAMDX(@NotNull MemorySegment segment) implements IPointer {
    public static VkDispatchGraphInfoAMDX allocate(Arena arena) {
        VkDispatchGraphInfoAMDX ret = new VkDispatchGraphInfoAMDX(arena.allocate(LAYOUT));
        return ret;
    }

    public static VkDispatchGraphInfoAMDX[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDispatchGraphInfoAMDX[] ret = new VkDispatchGraphInfoAMDX[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDispatchGraphInfoAMDX(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkDispatchGraphInfoAMDX clone(Arena arena, VkDispatchGraphInfoAMDX src) {
        VkDispatchGraphInfoAMDX ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDispatchGraphInfoAMDX[] clone(Arena arena, VkDispatchGraphInfoAMDX[] src) {
        VkDispatchGraphInfoAMDX[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
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

    public VkDeviceOrHostAddressConstAMDX payloads() {
        return new VkDeviceOrHostAddressConstAMDX(segment.asSlice(OFFSET$payloads, LAYOUT$payloads));
    }

    public void payloads(VkDeviceOrHostAddressConstAMDX value) {
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

    public static final PathElement PATH$nodeIndex = PathElement.groupElement("PATH$nodeIndex");
    public static final PathElement PATH$payloadCount = PathElement.groupElement("PATH$payloadCount");
    public static final PathElement PATH$payloads = PathElement.groupElement("PATH$payloads");
    public static final PathElement PATH$payloadStride = PathElement.groupElement("PATH$payloadStride");

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
