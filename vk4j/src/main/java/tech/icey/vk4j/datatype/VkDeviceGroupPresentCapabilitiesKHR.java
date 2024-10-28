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
/// typedef struct VkDeviceGroupPresentCapabilitiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t presentMask[VK_MAX_DEVICE_GROUP_SIZE];
///     VkDeviceGroupPresentModeFlagsKHR modes;
/// } VkDeviceGroupPresentCapabilitiesKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDeviceGroupPresentCapabilitiesKHR.html">VkDeviceGroupPresentCapabilitiesKHR</a>
public record VkDeviceGroupPresentCapabilitiesKHR(MemorySegment segment) implements IPointer {
    public VkDeviceGroupPresentCapabilitiesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEVICE_GROUP_PRESENT_CAPABILITIES_KHR);
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

    public MemorySegment presentMaskRaw() {
        return segment.asSlice(OFFSET$presentMask, SIZE$presentMask);
    }

    public @unsigned IntBuffer presentMask() {
        return new IntBuffer(presentMaskRaw());
    }

    public void presentMask(@unsigned IntBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$presentMask, SIZE$presentMask);
    }

    public @enumtype(VkDeviceGroupPresentModeFlagsKHR.class) int modes() {
        return segment.get(LAYOUT$modes, OFFSET$modes);
    }

    public void modes(@enumtype(VkDeviceGroupPresentModeFlagsKHR.class) int value) {
        segment.set(LAYOUT$modes, OFFSET$modes, value);
    }

    public static VkDeviceGroupPresentCapabilitiesKHR allocate(Arena arena) {
        return new VkDeviceGroupPresentCapabilitiesKHR(arena.allocate(LAYOUT));
    }

    public static VkDeviceGroupPresentCapabilitiesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDeviceGroupPresentCapabilitiesKHR[] ret = new VkDeviceGroupPresentCapabilitiesKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDeviceGroupPresentCapabilitiesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDeviceGroupPresentCapabilitiesKHR clone(Arena arena, VkDeviceGroupPresentCapabilitiesKHR src) {
        VkDeviceGroupPresentCapabilitiesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDeviceGroupPresentCapabilitiesKHR[] clone(Arena arena, VkDeviceGroupPresentCapabilitiesKHR[] src) {
        VkDeviceGroupPresentCapabilitiesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(VK_MAX_DEVICE_GROUP_SIZE, ValueLayout.JAVA_INT).withName("presentMask"),
        ValueLayout.JAVA_INT.withName("modes")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$presentMask = PathElement.groupElement("presentMask");
    public static final PathElement PATH$modes = PathElement.groupElement("modes");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final SequenceLayout LAYOUT$presentMask = (SequenceLayout) LAYOUT.select(PATH$presentMask);
    public static final OfInt LAYOUT$modes = (OfInt) LAYOUT.select(PATH$modes);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$presentMask = LAYOUT.byteOffset(PATH$presentMask);
    public static final long OFFSET$modes = LAYOUT.byteOffset(PATH$modes);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$presentMask = LAYOUT$presentMask.byteSize();
    public static final long SIZE$modes = LAYOUT$modes.byteSize();
}
