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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceDepthBiasControlFeaturesEXT.html">VkPhysicalDeviceDepthBiasControlFeaturesEXT</a>
@ValueBasedCandidate
public record VkPhysicalDeviceDepthBiasControlFeaturesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$depthBiasControl = ValueLayout.JAVA_INT.withName("depthBiasControl");
    public static final OfInt LAYOUT$leastRepresentableValueForceUnormRepresentation = ValueLayout.JAVA_INT.withName("leastRepresentableValueForceUnormRepresentation");
    public static final OfInt LAYOUT$floatRepresentation = ValueLayout.JAVA_INT.withName("floatRepresentation");
    public static final OfInt LAYOUT$depthBiasExact = ValueLayout.JAVA_INT.withName("depthBiasExact");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$depthBiasControl, LAYOUT$leastRepresentableValueForceUnormRepresentation, LAYOUT$floatRepresentation, LAYOUT$depthBiasExact);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceDepthBiasControlFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceDepthBiasControlFeaturesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceDepthBiasControlFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceDepthBiasControlFeaturesEXT[] ret = new VkPhysicalDeviceDepthBiasControlFeaturesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceDepthBiasControlFeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceDepthBiasControlFeaturesEXT clone(Arena arena, VkPhysicalDeviceDepthBiasControlFeaturesEXT src) {
        VkPhysicalDeviceDepthBiasControlFeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceDepthBiasControlFeaturesEXT[] clone(Arena arena, VkPhysicalDeviceDepthBiasControlFeaturesEXT[] src) {
        VkPhysicalDeviceDepthBiasControlFeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$depthBiasControl = PathElement.groupElement("PATH$depthBiasControl");
    public static final PathElement PATH$leastRepresentableValueForceUnormRepresentation = PathElement.groupElement("PATH$leastRepresentableValueForceUnormRepresentation");
    public static final PathElement PATH$floatRepresentation = PathElement.groupElement("PATH$floatRepresentation");
    public static final PathElement PATH$depthBiasExact = PathElement.groupElement("PATH$depthBiasExact");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$depthBiasControl = LAYOUT$depthBiasControl.byteSize();
    public static final long SIZE$leastRepresentableValueForceUnormRepresentation = LAYOUT$leastRepresentableValueForceUnormRepresentation.byteSize();
    public static final long SIZE$floatRepresentation = LAYOUT$floatRepresentation.byteSize();
    public static final long SIZE$depthBiasExact = LAYOUT$depthBiasExact.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$depthBiasControl = LAYOUT.byteOffset(PATH$depthBiasControl);
    public static final long OFFSET$leastRepresentableValueForceUnormRepresentation = LAYOUT.byteOffset(PATH$leastRepresentableValueForceUnormRepresentation);
    public static final long OFFSET$floatRepresentation = LAYOUT.byteOffset(PATH$floatRepresentation);
    public static final long OFFSET$depthBiasExact = LAYOUT.byteOffset(PATH$depthBiasExact);

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

    public @unsigned int depthBiasControl() {
        return segment.get(LAYOUT$depthBiasControl, OFFSET$depthBiasControl);
    }

    public void depthBiasControl(@unsigned int value) {
        segment.set(LAYOUT$depthBiasControl, OFFSET$depthBiasControl, value);
    }

    public @unsigned int leastRepresentableValueForceUnormRepresentation() {
        return segment.get(LAYOUT$leastRepresentableValueForceUnormRepresentation, OFFSET$leastRepresentableValueForceUnormRepresentation);
    }

    public void leastRepresentableValueForceUnormRepresentation(@unsigned int value) {
        segment.set(LAYOUT$leastRepresentableValueForceUnormRepresentation, OFFSET$leastRepresentableValueForceUnormRepresentation, value);
    }

    public @unsigned int floatRepresentation() {
        return segment.get(LAYOUT$floatRepresentation, OFFSET$floatRepresentation);
    }

    public void floatRepresentation(@unsigned int value) {
        segment.set(LAYOUT$floatRepresentation, OFFSET$floatRepresentation, value);
    }

    public @unsigned int depthBiasExact() {
        return segment.get(LAYOUT$depthBiasExact, OFFSET$depthBiasExact);
    }

    public void depthBiasExact(@unsigned int value) {
        segment.set(LAYOUT$depthBiasExact, OFFSET$depthBiasExact, value);
    }

}
