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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkVideoDecodeH264CapabilitiesKHR.html">VkVideoDecodeH264CapabilitiesKHR</a>
@ValueBasedCandidate
public record VkVideoDecodeH264CapabilitiesKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$maxLevelIdc = ValueLayout.JAVA_INT.withName("maxLevelIdc");
    public static final StructLayout LAYOUT$fieldOffsetGranularity = VkOffset2D.LAYOUT.withName("fieldOffsetGranularity");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$maxLevelIdc, LAYOUT$fieldOffsetGranularity);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkVideoDecodeH264CapabilitiesKHR allocate(Arena arena) {
        return new VkVideoDecodeH264CapabilitiesKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoDecodeH264CapabilitiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoDecodeH264CapabilitiesKHR[] ret = new VkVideoDecodeH264CapabilitiesKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoDecodeH264CapabilitiesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkVideoDecodeH264CapabilitiesKHR clone(Arena arena, VkVideoDecodeH264CapabilitiesKHR src) {
        VkVideoDecodeH264CapabilitiesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoDecodeH264CapabilitiesKHR[] clone(Arena arena, VkVideoDecodeH264CapabilitiesKHR[] src) {
        VkVideoDecodeH264CapabilitiesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$maxLevelIdc = PathElement.groupElement("PATH$maxLevelIdc");
    public static final PathElement PATH$fieldOffsetGranularity = PathElement.groupElement("PATH$fieldOffsetGranularity");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maxLevelIdc = LAYOUT$maxLevelIdc.byteSize();
    public static final long SIZE$fieldOffsetGranularity = LAYOUT$fieldOffsetGranularity.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxLevelIdc = LAYOUT.byteOffset(PATH$maxLevelIdc);
    public static final long OFFSET$fieldOffsetGranularity = LAYOUT.byteOffset(PATH$fieldOffsetGranularity);

    public @enumtype(VkStructureType.class) int sType() {
        return segment.get(LAYOUT$sType, OFFSET$sType);
    }

    public void sType(@enumtype(VkStructureType.class) int value) {
        segment.set(LAYOUT$sType, OFFSET$sType, value);
    }

    public @pointer(comment="void*") MemorySegment pNext() {
        return segment.get(LAYOUT$pNext, OFFSET$pNext);
    }

    public void pNext(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pNext, OFFSET$pNext, value);
    }

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @enumtype(StdVideoH264LevelIdc.class) int maxLevelIdc() {
        return segment.get(LAYOUT$maxLevelIdc, OFFSET$maxLevelIdc);
    }

    public void maxLevelIdc(@enumtype(StdVideoH264LevelIdc.class) int value) {
        segment.set(LAYOUT$maxLevelIdc, OFFSET$maxLevelIdc, value);
    }

    public VkOffset2D fieldOffsetGranularity() {
        return new VkOffset2D(segment.asSlice(OFFSET$fieldOffsetGranularity, LAYOUT$fieldOffsetGranularity));
    }

    public void fieldOffsetGranularity(VkOffset2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$fieldOffsetGranularity, SIZE$fieldOffsetGranularity);
    }

}
