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

public record VkPipelineBinaryDataKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final ValueLayout LAYOUT$dataSize = NativeLayout.C_SIZE_T.withName("dataSize");
    public static final AddressLayout LAYOUT$pData = ValueLayout.ADDRESS.withName("pData");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$dataSize, LAYOUT$pData);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPipelineBinaryDataKHR allocate(Arena arena) {
        return new VkPipelineBinaryDataKHR(arena.allocate(LAYOUT));
    }

    public static VkPipelineBinaryDataKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineBinaryDataKHR[] ret = new VkPipelineBinaryDataKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineBinaryDataKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPipelineBinaryDataKHR clone(Arena arena, VkPipelineBinaryDataKHR src) {
        VkPipelineBinaryDataKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineBinaryDataKHR[] clone(Arena arena, VkPipelineBinaryDataKHR[] src) {
        VkPipelineBinaryDataKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$dataSize = PathElement.groupElement("PATH$dataSize");
    public static final PathElement PATH$pData = PathElement.groupElement("PATH$pData");

    public static final long SIZE$dataSize = NativeLayout.C_SIZE_T.byteSize();
    public static final long SIZE$pData = LAYOUT$pData.byteSize();

    public static final long OFFSET$dataSize = LAYOUT.byteOffset(PATH$dataSize);
    public static final long OFFSET$pData = LAYOUT.byteOffset(PATH$pData);

    public @unsigned long dataSize() {
        return NativeLayout.readCSizeT(segment, OFFSET$dataSize);
    }

    public void dataSize(@unsigned long value) {
        NativeLayout.writeCSizeT(segment, OFFSET$dataSize, value);
    }

    public @pointer(comment="void*") MemorySegment pData() {
        return segment.get(LAYOUT$pData, OFFSET$pData);
    }

    public void pData(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pData, OFFSET$pData, value);
    }

    public void pData(IPointer pointer) {
        pData(pointer.segment());
    }

}
/// dummy, not implemented yet
