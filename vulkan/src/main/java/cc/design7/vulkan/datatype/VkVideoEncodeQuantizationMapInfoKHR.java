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

public record VkVideoEncodeQuantizationMapInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final AddressLayout LAYOUT$quantizationMap = ValueLayout.ADDRESS.withName("quantizationMap");
    public static final StructLayout LAYOUT$quantizationMapExtent = VkExtent2D.LAYOUT.withName("quantizationMapExtent");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$quantizationMap, LAYOUT$quantizationMapExtent);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkVideoEncodeQuantizationMapInfoKHR allocate(Arena arena) {
        return new VkVideoEncodeQuantizationMapInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkVideoEncodeQuantizationMapInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkVideoEncodeQuantizationMapInfoKHR[] ret = new VkVideoEncodeQuantizationMapInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkVideoEncodeQuantizationMapInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkVideoEncodeQuantizationMapInfoKHR clone(Arena arena, VkVideoEncodeQuantizationMapInfoKHR src) {
        VkVideoEncodeQuantizationMapInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkVideoEncodeQuantizationMapInfoKHR[] clone(Arena arena, VkVideoEncodeQuantizationMapInfoKHR[] src) {
        VkVideoEncodeQuantizationMapInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$quantizationMap = PathElement.groupElement("PATH$quantizationMap");
    public static final PathElement PATH$quantizationMapExtent = PathElement.groupElement("PATH$quantizationMapExtent");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$quantizationMap = LAYOUT$quantizationMap.byteSize();
    public static final long SIZE$quantizationMapExtent = LAYOUT$quantizationMapExtent.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$quantizationMap = LAYOUT.byteOffset(PATH$quantizationMap);
    public static final long OFFSET$quantizationMapExtent = LAYOUT.byteOffset(PATH$quantizationMapExtent);

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

    public @Nullable VkImageView quantizationMap() {
        MemorySegment s = segment.asSlice(OFFSET$quantizationMap, SIZE$quantizationMap);
        if (s.address() == 0) {
            return null;
        }
        return new VkImageView(s);
    }

    public void quantizationMap() {
        segment.set(LAYOUT$quantizationMap, OFFSET$quantizationMap, value != null ? value.segment() : MemorySegment.NULL);
    }

    public VkExtent2D quantizationMapExtent() {
        return new VkExtent2D(segment.asSlice(OFFSET$quantizationMapExtent, LAYOUT$quantizationMapExtent));
    }

    public void quantizationMapExtent(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$quantizationMapExtent, SIZE$quantizationMapExtent);
    }

}
/// dummy, not implemented yet
