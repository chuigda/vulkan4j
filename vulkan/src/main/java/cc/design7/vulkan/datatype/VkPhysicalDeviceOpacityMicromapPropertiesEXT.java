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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceOpacityMicromapPropertiesEXT.html">VkPhysicalDeviceOpacityMicromapPropertiesEXT</a>
@ValueBasedCandidate
public record VkPhysicalDeviceOpacityMicromapPropertiesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$maxOpacity2StateSubdivisionLevel = ValueLayout.JAVA_INT.withName("maxOpacity2StateSubdivisionLevel");
    public static final OfInt LAYOUT$maxOpacity4StateSubdivisionLevel = ValueLayout.JAVA_INT.withName("maxOpacity4StateSubdivisionLevel");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$maxOpacity2StateSubdivisionLevel, LAYOUT$maxOpacity4StateSubdivisionLevel);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceOpacityMicromapPropertiesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceOpacityMicromapPropertiesEXT[] ret = new VkPhysicalDeviceOpacityMicromapPropertiesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceOpacityMicromapPropertiesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT clone(Arena arena, VkPhysicalDeviceOpacityMicromapPropertiesEXT src) {
        VkPhysicalDeviceOpacityMicromapPropertiesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceOpacityMicromapPropertiesEXT[] clone(Arena arena, VkPhysicalDeviceOpacityMicromapPropertiesEXT[] src) {
        VkPhysicalDeviceOpacityMicromapPropertiesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$maxOpacity2StateSubdivisionLevel = PathElement.groupElement("PATH$maxOpacity2StateSubdivisionLevel");
    public static final PathElement PATH$maxOpacity4StateSubdivisionLevel = PathElement.groupElement("PATH$maxOpacity4StateSubdivisionLevel");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maxOpacity2StateSubdivisionLevel = LAYOUT$maxOpacity2StateSubdivisionLevel.byteSize();
    public static final long SIZE$maxOpacity4StateSubdivisionLevel = LAYOUT$maxOpacity4StateSubdivisionLevel.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxOpacity2StateSubdivisionLevel = LAYOUT.byteOffset(PATH$maxOpacity2StateSubdivisionLevel);
    public static final long OFFSET$maxOpacity4StateSubdivisionLevel = LAYOUT.byteOffset(PATH$maxOpacity4StateSubdivisionLevel);

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

    public @unsigned int maxOpacity2StateSubdivisionLevel() {
        return segment.get(LAYOUT$maxOpacity2StateSubdivisionLevel, OFFSET$maxOpacity2StateSubdivisionLevel);
    }

    public void maxOpacity2StateSubdivisionLevel(@unsigned int value) {
        segment.set(LAYOUT$maxOpacity2StateSubdivisionLevel, OFFSET$maxOpacity2StateSubdivisionLevel, value);
    }

    public @unsigned int maxOpacity4StateSubdivisionLevel() {
        return segment.get(LAYOUT$maxOpacity4StateSubdivisionLevel, OFFSET$maxOpacity4StateSubdivisionLevel);
    }

    public void maxOpacity4StateSubdivisionLevel(@unsigned int value) {
        segment.set(LAYOUT$maxOpacity4StateSubdivisionLevel, OFFSET$maxOpacity4StateSubdivisionLevel, value);
    }

}
