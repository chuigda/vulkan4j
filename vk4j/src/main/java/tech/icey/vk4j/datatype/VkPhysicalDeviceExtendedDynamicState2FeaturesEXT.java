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
/// typedef struct VkPhysicalDeviceExtendedDynamicState2FeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 extendedDynamicState2;
///     VkBool32 extendedDynamicState2LogicOp;
///     VkBool32 extendedDynamicState2PatchControlPoints;
/// } VkPhysicalDeviceExtendedDynamicState2FeaturesEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceExtendedDynamicState2FeaturesEXT.html">VkPhysicalDeviceExtendedDynamicState2FeaturesEXT</a>
public record VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTENDED_DYNAMIC_STATE_2_FEATURES_EXT);
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

    public @unsigned int extendedDynamicState2() {
        return segment.get(LAYOUT$extendedDynamicState2, OFFSET$extendedDynamicState2);
    }

    public void extendedDynamicState2(@unsigned int value) {
        segment.set(LAYOUT$extendedDynamicState2, OFFSET$extendedDynamicState2, value);
    }

    public @unsigned int extendedDynamicState2LogicOp() {
        return segment.get(LAYOUT$extendedDynamicState2LogicOp, OFFSET$extendedDynamicState2LogicOp);
    }

    public void extendedDynamicState2LogicOp(@unsigned int value) {
        segment.set(LAYOUT$extendedDynamicState2LogicOp, OFFSET$extendedDynamicState2LogicOp, value);
    }

    public @unsigned int extendedDynamicState2PatchControlPoints() {
        return segment.get(LAYOUT$extendedDynamicState2PatchControlPoints, OFFSET$extendedDynamicState2PatchControlPoints);
    }

    public void extendedDynamicState2PatchControlPoints(@unsigned int value) {
        segment.set(LAYOUT$extendedDynamicState2PatchControlPoints, OFFSET$extendedDynamicState2PatchControlPoints, value);
    }

    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceExtendedDynamicState2FeaturesEXT[] ret = new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceExtendedDynamicState2FeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT clone(Arena arena, VkPhysicalDeviceExtendedDynamicState2FeaturesEXT src) {
        VkPhysicalDeviceExtendedDynamicState2FeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceExtendedDynamicState2FeaturesEXT[] clone(Arena arena, VkPhysicalDeviceExtendedDynamicState2FeaturesEXT[] src) {
        VkPhysicalDeviceExtendedDynamicState2FeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState2"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState2LogicOp"),
        ValueLayout.JAVA_INT.withName("extendedDynamicState2PatchControlPoints")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$extendedDynamicState2 = PathElement.groupElement("extendedDynamicState2");
    public static final PathElement PATH$extendedDynamicState2LogicOp = PathElement.groupElement("extendedDynamicState2LogicOp");
    public static final PathElement PATH$extendedDynamicState2PatchControlPoints = PathElement.groupElement("extendedDynamicState2PatchControlPoints");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$extendedDynamicState2 = (OfInt) LAYOUT.select(PATH$extendedDynamicState2);
    public static final OfInt LAYOUT$extendedDynamicState2LogicOp = (OfInt) LAYOUT.select(PATH$extendedDynamicState2LogicOp);
    public static final OfInt LAYOUT$extendedDynamicState2PatchControlPoints = (OfInt) LAYOUT.select(PATH$extendedDynamicState2PatchControlPoints);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$extendedDynamicState2 = LAYOUT.byteOffset(PATH$extendedDynamicState2);
    public static final long OFFSET$extendedDynamicState2LogicOp = LAYOUT.byteOffset(PATH$extendedDynamicState2LogicOp);
    public static final long OFFSET$extendedDynamicState2PatchControlPoints = LAYOUT.byteOffset(PATH$extendedDynamicState2PatchControlPoints);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$extendedDynamicState2 = LAYOUT$extendedDynamicState2.byteSize();
    public static final long SIZE$extendedDynamicState2LogicOp = LAYOUT$extendedDynamicState2LogicOp.byteSize();
    public static final long SIZE$extendedDynamicState2PatchControlPoints = LAYOUT$extendedDynamicState2PatchControlPoints.byteSize();
}
