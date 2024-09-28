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

/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT.html">VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT</a>
public record VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("primitiveTopologyListRestart"),
        ValueLayout.JAVA_INT.withName("primitiveTopologyPatchListRestart")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$primitiveTopologyListRestart = PathElement.groupElement("primitiveTopologyListRestart");
    public static final PathElement PATH$primitiveTopologyPatchListRestart = PathElement.groupElement("primitiveTopologyPatchListRestart");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$primitiveTopologyListRestart = (OfInt) LAYOUT.select(PATH$primitiveTopologyListRestart);
    public static final OfInt LAYOUT$primitiveTopologyPatchListRestart = (OfInt) LAYOUT.select(PATH$primitiveTopologyPatchListRestart);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$primitiveTopologyListRestart = LAYOUT.byteOffset(PATH$primitiveTopologyListRestart);
    public static final long OFFSET$primitiveTopologyPatchListRestart = LAYOUT.byteOffset(PATH$primitiveTopologyPatchListRestart);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$primitiveTopologyListRestart = LAYOUT$primitiveTopologyListRestart.byteSize();
    public static final long SIZE$primitiveTopologyPatchListRestart = LAYOUT$primitiveTopologyPatchListRestart.byteSize();

    public VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PRIMITIVE_TOPOLOGY_LIST_RESTART_FEATURES_EXT);
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

    public @unsigned int primitiveTopologyListRestart() {
        return segment.get(LAYOUT$primitiveTopologyListRestart, OFFSET$primitiveTopologyListRestart);
    }

    public void primitiveTopologyListRestart(@unsigned int value) {
        segment.set(LAYOUT$primitiveTopologyListRestart, OFFSET$primitiveTopologyListRestart, value);
    }

    public @unsigned int primitiveTopologyPatchListRestart() {
        return segment.get(LAYOUT$primitiveTopologyPatchListRestart, OFFSET$primitiveTopologyPatchListRestart);
    }

    public void primitiveTopologyPatchListRestart(@unsigned int value) {
        segment.set(LAYOUT$primitiveTopologyPatchListRestart, OFFSET$primitiveTopologyPatchListRestart, value);
    }

    public static VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT[] ret = new VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDevicePrimitiveTopologyListRestartFeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
