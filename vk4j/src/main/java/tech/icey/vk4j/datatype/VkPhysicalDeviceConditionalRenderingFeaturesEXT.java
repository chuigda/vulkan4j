package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceConditionalRenderingFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 conditionalRendering;
///     VkBool32 inheritedConditionalRendering;
/// } VkPhysicalDeviceConditionalRenderingFeaturesEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceConditionalRenderingFeaturesEXT.html">VkPhysicalDeviceConditionalRenderingFeaturesEXT</a>
public record VkPhysicalDeviceConditionalRenderingFeaturesEXT(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceConditionalRenderingFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_CONDITIONAL_RENDERING_FEATURES_EXT);
    }

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

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
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

    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceConditionalRenderingFeaturesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceConditionalRenderingFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceConditionalRenderingFeaturesEXT[] ret = new VkPhysicalDeviceConditionalRenderingFeaturesEXT[count];
        for (int i = 0; i < count; i++) {
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("conditionalRendering"),
        ValueLayout.JAVA_INT.withName("inheritedConditionalRendering")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$conditionalRendering = PathElement.groupElement("conditionalRendering");
    public static final PathElement PATH$inheritedConditionalRendering = PathElement.groupElement("inheritedConditionalRendering");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$conditionalRendering = (OfInt) LAYOUT.select(PATH$conditionalRendering);
    public static final OfInt LAYOUT$inheritedConditionalRendering = (OfInt) LAYOUT.select(PATH$inheritedConditionalRendering);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$conditionalRendering = LAYOUT.byteOffset(PATH$conditionalRendering);
    public static final long OFFSET$inheritedConditionalRendering = LAYOUT.byteOffset(PATH$inheritedConditionalRendering);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$conditionalRendering = LAYOUT$conditionalRendering.byteSize();
    public static final long SIZE$inheritedConditionalRendering = LAYOUT$inheritedConditionalRendering.byteSize();
}
