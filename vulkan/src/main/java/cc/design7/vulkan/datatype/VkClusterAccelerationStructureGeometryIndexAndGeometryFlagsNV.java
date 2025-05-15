package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.bits.BitfieldUtil;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV.html">VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV</a>
@ValueBasedCandidate
public record VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$geometryIndex_geometryFlags = ValueLayout.JAVA_INT.withName("bitfield$geometryIndex_geometryFlags");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$geometryIndex_geometryFlags);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV allocate(Arena arena) {
        return new VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(arena.allocate(LAYOUT));
    }

    public static VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV[] ret = new VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV clone(Arena arena, VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV src) {
        VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV[] clone(Arena arena, VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV[] src) {
        VkClusterAccelerationStructureGeometryIndexAndGeometryFlagsNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$bitfield$geometryIndex_geometryFlags = PathElement.groupElement("PATH$bitfield$geometryIndex_geometryFlags");


    public static final long OFFSET$geometryIndex_geometryFlags = LAYOUT.byteOffset(PATH$bitfield$geometryIndex_geometryFlags);

    public @unsigned int geometryIndex() {
        MemorySegment s = segment.asSlice(OFFSET$geometryIndex_geometryFlags, LAYOUT$geometryIndex_geometryFlags);
        return BitfieldUtil.readBits(s, 0, 24);
    }

    public void geometryIndex(@unsigned int value) {
        MemorySegment s = segment.asSlice(OFFSET$geometryIndex_geometryFlags, LAYOUT$geometryIndex_geometryFlags);
        BitfieldUtil.writeBits(s, 0, 24, value);
    }

    public @unsigned int geometryFlags() {
        MemorySegment s = segment.asSlice(OFFSET$geometryIndex_geometryFlags, LAYOUT$geometryIndex_geometryFlags);
        return BitfieldUtil.readBits(s, 29, 32);
    }

    public void geometryFlags(@unsigned int value) {
        MemorySegment s = segment.asSlice(OFFSET$geometryIndex_geometryFlags, LAYOUT$geometryIndex_geometryFlags);
        BitfieldUtil.writeBits(s, 29, 32, value);
    }

}
