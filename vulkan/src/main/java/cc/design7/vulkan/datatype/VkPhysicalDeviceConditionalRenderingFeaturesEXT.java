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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceConditionalRenderingFeaturesEXT.html">VkPhysicalDeviceConditionalRenderingFeaturesEXT</a>
@ValueBasedCandidate
public record VkPhysicalDeviceConditionalRenderingFeaturesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$conditionalRendering = ValueLayout.JAVA_INT.withName("conditionalRendering");
    public static final OfInt LAYOUT$inheritedConditionalRendering = ValueLayout.JAVA_INT.withName("inheritedConditionalRendering");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$conditionalRendering, LAYOUT$inheritedConditionalRendering);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceConditionalRenderingFeaturesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceConditionalRenderingFeaturesEXT[] ret = new VkPhysicalDeviceConditionalRenderingFeaturesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceConditionalRenderingFeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT clone(Arena arena, VkPhysicalDeviceConditionalRenderingFeaturesEXT src) {
        VkPhysicalDeviceConditionalRenderingFeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT[] clone(Arena arena, VkPhysicalDeviceConditionalRenderingFeaturesEXT[] src) {
        VkPhysicalDeviceConditionalRenderingFeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$conditionalRendering = PathElement.groupElement("PATH$conditionalRendering");
    public static final PathElement PATH$inheritedConditionalRendering = PathElement.groupElement("PATH$inheritedConditionalRendering");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$conditionalRendering = LAYOUT$conditionalRendering.byteSize();
    public static final long SIZE$inheritedConditionalRendering = LAYOUT$inheritedConditionalRendering.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$conditionalRendering = LAYOUT.byteOffset(PATH$conditionalRendering);
    public static final long OFFSET$inheritedConditionalRendering = LAYOUT.byteOffset(PATH$inheritedConditionalRendering);

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

    public @unsigned int conditionalRendering() {
        return segment.get(LAYOUT$conditionalRendering, OFFSET$conditionalRendering);
    }

    public void conditionalRendering(@unsigned int value) {
        segment.set(LAYOUT$conditionalRendering, OFFSET$conditionalRendering, value);
    }

    public @unsigned int inheritedConditionalRendering() {
        return segment.get(LAYOUT$inheritedConditionalRendering, OFFSET$inheritedConditionalRendering);
    }

    public void inheritedConditionalRendering(@unsigned int value) {
        segment.set(LAYOUT$inheritedConditionalRendering, OFFSET$inheritedConditionalRendering, value);
    }

}
