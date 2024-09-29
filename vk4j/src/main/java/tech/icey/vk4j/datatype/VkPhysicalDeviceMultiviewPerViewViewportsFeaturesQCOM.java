package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 multiviewPerViewViewports;
/// } VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM.html">VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM</a>
public record VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PER_VIEW_VIEWPORTS_FEATURES_QCOM);
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

    public void pNext(IPointer pointer) {
        pNext(pointer.segment());
    }

    public @unsigned int multiviewPerViewViewports() {
        return segment.get(LAYOUT$multiviewPerViewViewports, OFFSET$multiviewPerViewViewports);
    }

    public void multiviewPerViewViewports(@unsigned int value) {
        segment.set(LAYOUT$multiviewPerViewViewports, OFFSET$multiviewPerViewViewports, value);
    }

    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM allocate(Arena arena) {
        return new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM[] ret = new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM clone(Arena arena, VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM src) {
        VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM[] clone(Arena arena, VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM[] src) {
        VkPhysicalDeviceMultiviewPerViewViewportsFeaturesQCOM[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("multiviewPerViewViewports")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$multiviewPerViewViewports = PathElement.groupElement("multiviewPerViewViewports");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$multiviewPerViewViewports = (OfInt) LAYOUT.select(PATH$multiviewPerViewViewports);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$multiviewPerViewViewports = LAYOUT.byteOffset(PATH$multiviewPerViewViewports);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$multiviewPerViewViewports = LAYOUT$multiviewPerViewViewports.byteSize();
}
