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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT.html">VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT</a>
@ValueBasedCandidate
public record VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$deviceGeneratedCommands = ValueLayout.JAVA_INT.withName("deviceGeneratedCommands");
    public static final OfInt LAYOUT$dynamicGeneratedPipelineLayout = ValueLayout.JAVA_INT.withName("dynamicGeneratedPipelineLayout");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$deviceGeneratedCommands, LAYOUT$dynamicGeneratedPipelineLayout);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT[] ret = new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT clone(Arena arena, VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT src) {
        VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT[] clone(Arena arena, VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT[] src) {
        VkPhysicalDeviceDeviceGeneratedCommandsFeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$deviceGeneratedCommands = PathElement.groupElement("PATH$deviceGeneratedCommands");
    public static final PathElement PATH$dynamicGeneratedPipelineLayout = PathElement.groupElement("PATH$dynamicGeneratedPipelineLayout");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$deviceGeneratedCommands = LAYOUT$deviceGeneratedCommands.byteSize();
    public static final long SIZE$dynamicGeneratedPipelineLayout = LAYOUT$dynamicGeneratedPipelineLayout.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$deviceGeneratedCommands = LAYOUT.byteOffset(PATH$deviceGeneratedCommands);
    public static final long OFFSET$dynamicGeneratedPipelineLayout = LAYOUT.byteOffset(PATH$dynamicGeneratedPipelineLayout);

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

    public @unsigned int deviceGeneratedCommands() {
        return segment.get(LAYOUT$deviceGeneratedCommands, OFFSET$deviceGeneratedCommands);
    }

    public void deviceGeneratedCommands(@unsigned int value) {
        segment.set(LAYOUT$deviceGeneratedCommands, OFFSET$deviceGeneratedCommands, value);
    }

    public @unsigned int dynamicGeneratedPipelineLayout() {
        return segment.get(LAYOUT$dynamicGeneratedPipelineLayout, OFFSET$dynamicGeneratedPipelineLayout);
    }

    public void dynamicGeneratedPipelineLayout(@unsigned int value) {
        segment.set(LAYOUT$dynamicGeneratedPipelineLayout, OFFSET$dynamicGeneratedPipelineLayout, value);
    }

}
