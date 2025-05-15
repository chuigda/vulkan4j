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

public record VkSamplerBorderColorComponentMappingCreateInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final StructLayout LAYOUT$components = VkComponentMapping.LAYOUT.withName("components");
    public static final OfInt LAYOUT$srgb = ValueLayout.JAVA_INT.withName("srgb");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$components, LAYOUT$srgb);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkSamplerBorderColorComponentMappingCreateInfoEXT allocate(Arena arena) {
        return new VkSamplerBorderColorComponentMappingCreateInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkSamplerBorderColorComponentMappingCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSamplerBorderColorComponentMappingCreateInfoEXT[] ret = new VkSamplerBorderColorComponentMappingCreateInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSamplerBorderColorComponentMappingCreateInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSamplerBorderColorComponentMappingCreateInfoEXT clone(Arena arena, VkSamplerBorderColorComponentMappingCreateInfoEXT src) {
        VkSamplerBorderColorComponentMappingCreateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSamplerBorderColorComponentMappingCreateInfoEXT[] clone(Arena arena, VkSamplerBorderColorComponentMappingCreateInfoEXT[] src) {
        VkSamplerBorderColorComponentMappingCreateInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$components = PathElement.groupElement("PATH$components");
    public static final PathElement PATH$srgb = PathElement.groupElement("PATH$srgb");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$components = LAYOUT$components.byteSize();
    public static final long SIZE$srgb = LAYOUT$srgb.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$components = LAYOUT.byteOffset(PATH$components);
    public static final long OFFSET$srgb = LAYOUT.byteOffset(PATH$srgb);

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

    public VkComponentMapping components() {
        return new VkComponentMapping(segment.asSlice(OFFSET$components, LAYOUT$components));
    }

    public void components(VkComponentMapping value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$components, SIZE$components);
    }

    public @unsigned int srgb() {
        return segment.get(LAYOUT$srgb, OFFSET$srgb);
    }

    public void srgb(@unsigned int value) {
        segment.set(LAYOUT$srgb, OFFSET$srgb, value);
    }

}
/// dummy, not implemented yet
