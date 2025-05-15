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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceExtendedDynamicStateFeaturesEXT.html">VkPhysicalDeviceExtendedDynamicStateFeaturesEXT</a>
@ValueBasedCandidate
public record VkPhysicalDeviceExtendedDynamicStateFeaturesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$extendedDynamicState = ValueLayout.JAVA_INT.withName("extendedDynamicState");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$extendedDynamicState);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceExtendedDynamicStateFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceExtendedDynamicStateFeaturesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceExtendedDynamicStateFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceExtendedDynamicStateFeaturesEXT[] ret = new VkPhysicalDeviceExtendedDynamicStateFeaturesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceExtendedDynamicStateFeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceExtendedDynamicStateFeaturesEXT clone(Arena arena, VkPhysicalDeviceExtendedDynamicStateFeaturesEXT src) {
        VkPhysicalDeviceExtendedDynamicStateFeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceExtendedDynamicStateFeaturesEXT[] clone(Arena arena, VkPhysicalDeviceExtendedDynamicStateFeaturesEXT[] src) {
        VkPhysicalDeviceExtendedDynamicStateFeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$extendedDynamicState = PathElement.groupElement("PATH$extendedDynamicState");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$extendedDynamicState = LAYOUT$extendedDynamicState.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$extendedDynamicState = LAYOUT.byteOffset(PATH$extendedDynamicState);

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

    public @unsigned int extendedDynamicState() {
        return segment.get(LAYOUT$extendedDynamicState, OFFSET$extendedDynamicState);
    }

    public void extendedDynamicState(@unsigned int value) {
        segment.set(LAYOUT$extendedDynamicState, OFFSET$extendedDynamicState, value);
    }

}
