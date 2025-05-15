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

public record VkOpaqueCaptureDescriptorDataCreateInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final AddressLayout LAYOUT$opaqueCaptureDescriptorData = ValueLayout.ADDRESS.withName("opaqueCaptureDescriptorData");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$opaqueCaptureDescriptorData);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkOpaqueCaptureDescriptorDataCreateInfoEXT allocate(Arena arena) {
        return new VkOpaqueCaptureDescriptorDataCreateInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkOpaqueCaptureDescriptorDataCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkOpaqueCaptureDescriptorDataCreateInfoEXT[] ret = new VkOpaqueCaptureDescriptorDataCreateInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkOpaqueCaptureDescriptorDataCreateInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkOpaqueCaptureDescriptorDataCreateInfoEXT clone(Arena arena, VkOpaqueCaptureDescriptorDataCreateInfoEXT src) {
        VkOpaqueCaptureDescriptorDataCreateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkOpaqueCaptureDescriptorDataCreateInfoEXT[] clone(Arena arena, VkOpaqueCaptureDescriptorDataCreateInfoEXT[] src) {
        VkOpaqueCaptureDescriptorDataCreateInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$opaqueCaptureDescriptorData = PathElement.groupElement("PATH$opaqueCaptureDescriptorData");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$opaqueCaptureDescriptorData = LAYOUT$opaqueCaptureDescriptorData.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$opaqueCaptureDescriptorData = LAYOUT.byteOffset(PATH$opaqueCaptureDescriptorData);

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

    public @pointer(comment="void*") MemorySegment opaqueCaptureDescriptorData() {
        return segment.get(LAYOUT$opaqueCaptureDescriptorData, OFFSET$opaqueCaptureDescriptorData);
    }

    public void opaqueCaptureDescriptorData(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$opaqueCaptureDescriptorData, OFFSET$opaqueCaptureDescriptorData, value);
    }

    public void opaqueCaptureDescriptorData(IPointer pointer) {
        opaqueCaptureDescriptorData(pointer.segment());
    }

}
/// dummy, not implemented yet
