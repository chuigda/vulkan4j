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

public record VkSamplerBlockMatchWindowCreateInfoQCOM(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final StructLayout LAYOUT$windowExtent = VkExtent2D.LAYOUT.withName("windowExtent");
    public static final OfInt LAYOUT$windowCompareMode = ValueLayout.JAVA_INT.withName("windowCompareMode");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$windowExtent, LAYOUT$windowCompareMode);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkSamplerBlockMatchWindowCreateInfoQCOM allocate(Arena arena) {
        return new VkSamplerBlockMatchWindowCreateInfoQCOM(arena.allocate(LAYOUT));
    }

    public static VkSamplerBlockMatchWindowCreateInfoQCOM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSamplerBlockMatchWindowCreateInfoQCOM[] ret = new VkSamplerBlockMatchWindowCreateInfoQCOM[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSamplerBlockMatchWindowCreateInfoQCOM(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSamplerBlockMatchWindowCreateInfoQCOM clone(Arena arena, VkSamplerBlockMatchWindowCreateInfoQCOM src) {
        VkSamplerBlockMatchWindowCreateInfoQCOM ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSamplerBlockMatchWindowCreateInfoQCOM[] clone(Arena arena, VkSamplerBlockMatchWindowCreateInfoQCOM[] src) {
        VkSamplerBlockMatchWindowCreateInfoQCOM[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$windowExtent = PathElement.groupElement("PATH$windowExtent");
    public static final PathElement PATH$windowCompareMode = PathElement.groupElement("PATH$windowCompareMode");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$windowExtent = LAYOUT$windowExtent.byteSize();
    public static final long SIZE$windowCompareMode = LAYOUT$windowCompareMode.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$windowExtent = LAYOUT.byteOffset(PATH$windowExtent);
    public static final long OFFSET$windowCompareMode = LAYOUT.byteOffset(PATH$windowCompareMode);

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

    public VkExtent2D windowExtent() {
        return new VkExtent2D(segment.asSlice(OFFSET$windowExtent, LAYOUT$windowExtent));
    }

    public void windowExtent(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$windowExtent, SIZE$windowExtent);
    }

    public @enumtype(VkBlockMatchWindowCompareModeQCOM.class) int windowCompareMode() {
        return segment.get(LAYOUT$windowCompareMode, OFFSET$windowCompareMode);
    }

    public void windowCompareMode(@enumtype(VkBlockMatchWindowCompareModeQCOM.class) int value) {
        segment.set(LAYOUT$windowCompareMode, OFFSET$windowCompareMode, value);
    }

}
/// dummy, not implemented yet
