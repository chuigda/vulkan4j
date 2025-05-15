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

public record VkQueryLowLatencySupportNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final AddressLayout LAYOUT$pQueriedLowLatencyData = ValueLayout.ADDRESS.withName("pQueriedLowLatencyData");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$pQueriedLowLatencyData);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkQueryLowLatencySupportNV allocate(Arena arena) {
        return new VkQueryLowLatencySupportNV(arena.allocate(LAYOUT));
    }

    public static VkQueryLowLatencySupportNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkQueryLowLatencySupportNV[] ret = new VkQueryLowLatencySupportNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkQueryLowLatencySupportNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkQueryLowLatencySupportNV clone(Arena arena, VkQueryLowLatencySupportNV src) {
        VkQueryLowLatencySupportNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkQueryLowLatencySupportNV[] clone(Arena arena, VkQueryLowLatencySupportNV[] src) {
        VkQueryLowLatencySupportNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$pQueriedLowLatencyData = PathElement.groupElement("PATH$pQueriedLowLatencyData");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pQueriedLowLatencyData = LAYOUT$pQueriedLowLatencyData.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pQueriedLowLatencyData = LAYOUT.byteOffset(PATH$pQueriedLowLatencyData);

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

    public @pointer(comment="void*") MemorySegment pQueriedLowLatencyData() {
        return segment.get(LAYOUT$pQueriedLowLatencyData, OFFSET$pQueriedLowLatencyData);
    }

    public void pQueriedLowLatencyData(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pQueriedLowLatencyData, OFFSET$pQueriedLowLatencyData, value);
    }

    public void pQueriedLowLatencyData(IPointer pointer) {
        pQueriedLowLatencyData(pointer.segment());
    }

}
/// dummy, not implemented yet
