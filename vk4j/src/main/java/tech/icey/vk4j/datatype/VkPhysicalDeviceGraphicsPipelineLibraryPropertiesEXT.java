package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

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
/// typedef struct VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 graphicsPipelineLibraryFastLinking;
///     VkBool32 graphicsPipelineLibraryIndependentInterpolationDecoration;
/// } VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT.html">VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT</a>
public record VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_GRAPHICS_PIPELINE_LIBRARY_PROPERTIES_EXT);
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

    public void pNext(@nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @unsigned int graphicsPipelineLibraryFastLinking() {
        return segment.get(LAYOUT$graphicsPipelineLibraryFastLinking, OFFSET$graphicsPipelineLibraryFastLinking);
    }

    public void graphicsPipelineLibraryFastLinking(@unsigned int value) {
        segment.set(LAYOUT$graphicsPipelineLibraryFastLinking, OFFSET$graphicsPipelineLibraryFastLinking, value);
    }

    public @unsigned int graphicsPipelineLibraryIndependentInterpolationDecoration() {
        return segment.get(LAYOUT$graphicsPipelineLibraryIndependentInterpolationDecoration, OFFSET$graphicsPipelineLibraryIndependentInterpolationDecoration);
    }

    public void graphicsPipelineLibraryIndependentInterpolationDecoration(@unsigned int value) {
        segment.set(LAYOUT$graphicsPipelineLibraryIndependentInterpolationDecoration, OFFSET$graphicsPipelineLibraryIndependentInterpolationDecoration, value);
    }

    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT[] ret = new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT clone(Arena arena, VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT src) {
        VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT[] clone(Arena arena, VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT[] src) {
        VkPhysicalDeviceGraphicsPipelineLibraryPropertiesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("graphicsPipelineLibraryFastLinking"),
        ValueLayout.JAVA_INT.withName("graphicsPipelineLibraryIndependentInterpolationDecoration")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$graphicsPipelineLibraryFastLinking = PathElement.groupElement("graphicsPipelineLibraryFastLinking");
    public static final PathElement PATH$graphicsPipelineLibraryIndependentInterpolationDecoration = PathElement.groupElement("graphicsPipelineLibraryIndependentInterpolationDecoration");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$graphicsPipelineLibraryFastLinking = (OfInt) LAYOUT.select(PATH$graphicsPipelineLibraryFastLinking);
    public static final OfInt LAYOUT$graphicsPipelineLibraryIndependentInterpolationDecoration = (OfInt) LAYOUT.select(PATH$graphicsPipelineLibraryIndependentInterpolationDecoration);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$graphicsPipelineLibraryFastLinking = LAYOUT.byteOffset(PATH$graphicsPipelineLibraryFastLinking);
    public static final long OFFSET$graphicsPipelineLibraryIndependentInterpolationDecoration = LAYOUT.byteOffset(PATH$graphicsPipelineLibraryIndependentInterpolationDecoration);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$graphicsPipelineLibraryFastLinking = LAYOUT$graphicsPipelineLibraryFastLinking.byteSize();
    public static final long SIZE$graphicsPipelineLibraryIndependentInterpolationDecoration = LAYOUT$graphicsPipelineLibraryIndependentInterpolationDecoration.byteSize();
}
