package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkDispatchGraphInfoAMDX {
///     uint32_t nodeIndex;
///     uint32_t payloadCount;
///     VkDeviceOrHostAddressConstAMDX payloads;
///     uint64_t payloadStride;
/// } VkDispatchGraphInfoAMDX;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDispatchGraphInfoAMDX.html">VkDispatchGraphInfoAMDX</a>
public record VkDispatchGraphInfoAMDX(MemorySegment segment) implements IPointer {
    public VkDispatchGraphInfoAMDX(MemorySegment segment) {
        this.segment = segment;
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

    public static VkDispatchGraphInfoAMDX allocate(Arena arena) {
        return new VkDispatchGraphInfoAMDX(arena.allocate(LAYOUT));
    }

    public static VkDispatchGraphInfoAMDX[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDispatchGraphInfoAMDX[] ret = new VkDispatchGraphInfoAMDX[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDispatchGraphInfoAMDX(segment.asSlice(i * SIZE, SIZE));
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("nodeIndex"),
        ValueLayout.JAVA_INT.withName("payloadCount"),
        VkDeviceOrHostAddressConstAMDX.LAYOUT.withName("payloads"),
        ValueLayout.JAVA_LONG.withName("payloadStride")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$nodeIndex = PathElement.groupElement("nodeIndex");
    public static final PathElement PATH$payloadCount = PathElement.groupElement("payloadCount");
    public static final PathElement PATH$payloads = PathElement.groupElement("payloads");
    public static final PathElement PATH$payloadStride = PathElement.groupElement("payloadStride");

    public static final OfInt LAYOUT$nodeIndex = (OfInt) LAYOUT.select(PATH$nodeIndex);
    public static final OfInt LAYOUT$payloadCount = (OfInt) LAYOUT.select(PATH$payloadCount);
    public static final UnionLayout LAYOUT$payloads = (UnionLayout) LAYOUT.select(PATH$payloads);
    public static final OfLong LAYOUT$payloadStride = (OfLong) LAYOUT.select(PATH$payloadStride);

    public static final long OFFSET$nodeIndex = LAYOUT.byteOffset(PATH$nodeIndex);
    public static final long OFFSET$payloadCount = LAYOUT.byteOffset(PATH$payloadCount);
    public static final long OFFSET$payloads = LAYOUT.byteOffset(PATH$payloads);
    public static final long OFFSET$payloadStride = LAYOUT.byteOffset(PATH$payloadStride);

    public static final long SIZE$nodeIndex = LAYOUT$nodeIndex.byteSize();
    public static final long SIZE$payloadCount = LAYOUT$payloadCount.byteSize();
    public static final long SIZE$payloads = LAYOUT$payloads.byteSize();
    public static final long SIZE$payloadStride = LAYOUT$payloadStride.byteSize();
}
