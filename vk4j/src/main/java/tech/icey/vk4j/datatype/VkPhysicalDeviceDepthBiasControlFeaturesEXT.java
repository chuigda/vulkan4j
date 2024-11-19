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
/// typedef struct VkPhysicalDeviceDepthBiasControlFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 depthBiasControl;
///     VkBool32 leastRepresentableValueForceUnormRepresentation;
///     VkBool32 floatRepresentation;
///     VkBool32 depthBiasExact;
/// } VkPhysicalDeviceDepthBiasControlFeaturesEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceDepthBiasControlFeaturesEXT.html">VkPhysicalDeviceDepthBiasControlFeaturesEXT</a>
public record VkPhysicalDeviceDepthBiasControlFeaturesEXT(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceDepthBiasControlFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEPTH_BIAS_CONTROL_FEATURES_EXT);
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

    public static VkPhysicalDeviceDepthBiasControlFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceDepthBiasControlFeaturesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceDepthBiasControlFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceDepthBiasControlFeaturesEXT[] ret = new VkPhysicalDeviceDepthBiasControlFeaturesEXT[count];
        for (int i = 0; i < count; i++) {
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("depthBiasControl"),
        ValueLayout.JAVA_INT.withName("leastRepresentableValueForceUnormRepresentation"),
        ValueLayout.JAVA_INT.withName("floatRepresentation"),
        ValueLayout.JAVA_INT.withName("depthBiasExact")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$depthBiasControl = PathElement.groupElement("depthBiasControl");
    public static final PathElement PATH$leastRepresentableValueForceUnormRepresentation = PathElement.groupElement("leastRepresentableValueForceUnormRepresentation");
    public static final PathElement PATH$floatRepresentation = PathElement.groupElement("floatRepresentation");
    public static final PathElement PATH$depthBiasExact = PathElement.groupElement("depthBiasExact");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$depthBiasControl = (OfInt) LAYOUT.select(PATH$depthBiasControl);
    public static final OfInt LAYOUT$leastRepresentableValueForceUnormRepresentation = (OfInt) LAYOUT.select(PATH$leastRepresentableValueForceUnormRepresentation);
    public static final OfInt LAYOUT$floatRepresentation = (OfInt) LAYOUT.select(PATH$floatRepresentation);
    public static final OfInt LAYOUT$depthBiasExact = (OfInt) LAYOUT.select(PATH$depthBiasExact);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$depthBiasControl = LAYOUT.byteOffset(PATH$depthBiasControl);
    public static final long OFFSET$leastRepresentableValueForceUnormRepresentation = LAYOUT.byteOffset(PATH$leastRepresentableValueForceUnormRepresentation);
    public static final long OFFSET$floatRepresentation = LAYOUT.byteOffset(PATH$floatRepresentation);
    public static final long OFFSET$depthBiasExact = LAYOUT.byteOffset(PATH$depthBiasExact);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$depthBiasControl = LAYOUT$depthBiasControl.byteSize();
    public static final long SIZE$leastRepresentableValueForceUnormRepresentation = LAYOUT$leastRepresentableValueForceUnormRepresentation.byteSize();
    public static final long SIZE$floatRepresentation = LAYOUT$floatRepresentation.byteSize();
    public static final long SIZE$depthBiasExact = LAYOUT$depthBiasExact.byteSize();
}
