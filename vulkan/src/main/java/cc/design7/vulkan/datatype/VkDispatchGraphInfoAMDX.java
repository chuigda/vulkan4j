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
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDispatchGraphInfoAMDX.html">VkDispatchGraphInfoAMDX</a>
@ValueBasedCandidate
public record VkDispatchGraphInfoAMDX(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$nodeIndex = ValueLayout.JAVA_INT.withName("nodeIndex");
    public static final OfInt LAYOUT$payloadCount = ValueLayout.JAVA_INT.withName("payloadCount");
    public static final StructLayout LAYOUT$payloads = VkDeviceOrHostAddressConstAMDX.LAYOUT.withName("payloads");
    public static final OfLong LAYOUT$payloadStride = ValueLayout.JAVA_LONG.withName("payloadStride");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$nodeIndex, LAYOUT$payloadCount, LAYOUT$payloads, LAYOUT$payloadStride);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkDispatchGraphInfoAMDX allocate(Arena arena) {
        return new VkDispatchGraphInfoAMDX(arena.allocate(LAYOUT));
    }

    public static VkDispatchGraphInfoAMDX[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDispatchGraphInfoAMDX[] ret = new VkDispatchGraphInfoAMDX[count];
        for (int i = 0; i < count; i ++) {
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$nodeIndex = PathElement.groupElement("PATH$nodeIndex");
    public static final PathElement PATH$payloadCount = PathElement.groupElement("PATH$payloadCount");
    public static final PathElement PATH$payloads = PathElement.groupElement("PATH$payloads");
    public static final PathElement PATH$payloadStride = PathElement.groupElement("PATH$payloadStride");

    public static final long SIZE$nodeIndex = LAYOUT$nodeIndex.byteSize();
    public static final long SIZE$payloadCount = LAYOUT$payloadCount.byteSize();
    public static final long SIZE$payloads = LAYOUT$payloads.byteSize();
    public static final long SIZE$payloadStride = LAYOUT$payloadStride.byteSize();

    public static final long OFFSET$nodeIndex = LAYOUT.byteOffset(PATH$nodeIndex);
    public static final long OFFSET$payloadCount = LAYOUT.byteOffset(PATH$payloadCount);
    public static final long OFFSET$payloads = LAYOUT.byteOffset(PATH$payloads);
    public static final long OFFSET$payloadStride = LAYOUT.byteOffset(PATH$payloadStride);

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

}
