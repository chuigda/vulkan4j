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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceTilePropertiesFeaturesQCOM.html">VkPhysicalDeviceTilePropertiesFeaturesQCOM</a>
@ValueBasedCandidate
public record VkPhysicalDeviceTilePropertiesFeaturesQCOM(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$tileProperties = ValueLayout.JAVA_INT.withName("tileProperties");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$tileProperties);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceTilePropertiesFeaturesQCOM allocate(Arena arena) {
        return new VkPhysicalDeviceTilePropertiesFeaturesQCOM(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceTilePropertiesFeaturesQCOM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceTilePropertiesFeaturesQCOM[] ret = new VkPhysicalDeviceTilePropertiesFeaturesQCOM[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceTilePropertiesFeaturesQCOM(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceTilePropertiesFeaturesQCOM clone(Arena arena, VkPhysicalDeviceTilePropertiesFeaturesQCOM src) {
        VkPhysicalDeviceTilePropertiesFeaturesQCOM ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceTilePropertiesFeaturesQCOM[] clone(Arena arena, VkPhysicalDeviceTilePropertiesFeaturesQCOM[] src) {
        VkPhysicalDeviceTilePropertiesFeaturesQCOM[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$tileProperties = PathElement.groupElement("PATH$tileProperties");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$tileProperties = LAYOUT$tileProperties.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$tileProperties = LAYOUT.byteOffset(PATH$tileProperties);

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

    public @unsigned int tileProperties() {
        return segment.get(LAYOUT$tileProperties, OFFSET$tileProperties);
    }

    public void tileProperties(@unsigned int value) {
        segment.set(LAYOUT$tileProperties, OFFSET$tileProperties, value);
    }

}
