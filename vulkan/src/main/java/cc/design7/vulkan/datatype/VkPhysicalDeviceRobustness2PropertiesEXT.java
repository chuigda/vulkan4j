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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceRobustness2PropertiesEXT.html">VkPhysicalDeviceRobustness2PropertiesEXT</a>
@ValueBasedCandidate
public record VkPhysicalDeviceRobustness2PropertiesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfLong LAYOUT$robustStorageBufferAccessSizeAlignment = ValueLayout.JAVA_LONG.withName("robustStorageBufferAccessSizeAlignment");
    public static final OfLong LAYOUT$robustUniformBufferAccessSizeAlignment = ValueLayout.JAVA_LONG.withName("robustUniformBufferAccessSizeAlignment");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$robustStorageBufferAccessSizeAlignment, LAYOUT$robustUniformBufferAccessSizeAlignment);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceRobustness2PropertiesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceRobustness2PropertiesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceRobustness2PropertiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceRobustness2PropertiesEXT[] ret = new VkPhysicalDeviceRobustness2PropertiesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceRobustness2PropertiesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceRobustness2PropertiesEXT clone(Arena arena, VkPhysicalDeviceRobustness2PropertiesEXT src) {
        VkPhysicalDeviceRobustness2PropertiesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceRobustness2PropertiesEXT[] clone(Arena arena, VkPhysicalDeviceRobustness2PropertiesEXT[] src) {
        VkPhysicalDeviceRobustness2PropertiesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$robustStorageBufferAccessSizeAlignment = PathElement.groupElement("PATH$robustStorageBufferAccessSizeAlignment");
    public static final PathElement PATH$robustUniformBufferAccessSizeAlignment = PathElement.groupElement("PATH$robustUniformBufferAccessSizeAlignment");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$robustStorageBufferAccessSizeAlignment = LAYOUT$robustStorageBufferAccessSizeAlignment.byteSize();
    public static final long SIZE$robustUniformBufferAccessSizeAlignment = LAYOUT$robustUniformBufferAccessSizeAlignment.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$robustStorageBufferAccessSizeAlignment = LAYOUT.byteOffset(PATH$robustStorageBufferAccessSizeAlignment);
    public static final long OFFSET$robustUniformBufferAccessSizeAlignment = LAYOUT.byteOffset(PATH$robustUniformBufferAccessSizeAlignment);

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

    public @unsigned long robustStorageBufferAccessSizeAlignment() {
        return segment.get(LAYOUT$robustStorageBufferAccessSizeAlignment, OFFSET$robustStorageBufferAccessSizeAlignment);
    }

    public void robustStorageBufferAccessSizeAlignment(@unsigned long value) {
        segment.set(LAYOUT$robustStorageBufferAccessSizeAlignment, OFFSET$robustStorageBufferAccessSizeAlignment, value);
    }

    public @unsigned long robustUniformBufferAccessSizeAlignment() {
        return segment.get(LAYOUT$robustUniformBufferAccessSizeAlignment, OFFSET$robustUniformBufferAccessSizeAlignment);
    }

    public void robustUniformBufferAccessSizeAlignment(@unsigned long value) {
        segment.set(LAYOUT$robustUniformBufferAccessSizeAlignment, OFFSET$robustUniformBufferAccessSizeAlignment, value);
    }

}
