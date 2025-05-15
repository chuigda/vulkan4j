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

public record VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$spheres = ValueLayout.JAVA_INT.withName("spheres");
    public static final OfInt LAYOUT$linearSweptSpheres = ValueLayout.JAVA_INT.withName("linearSweptSpheres");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$spheres, LAYOUT$linearSweptSpheres);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV allocate(Arena arena) {
        return new VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV[] ret = new VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV clone(Arena arena, VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV src) {
        VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV[] clone(Arena arena, VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV[] src) {
        VkPhysicalDeviceRayTracingLinearSweptSpheresFeaturesNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$spheres = PathElement.groupElement("PATH$spheres");
    public static final PathElement PATH$linearSweptSpheres = PathElement.groupElement("PATH$linearSweptSpheres");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$spheres = LAYOUT$spheres.byteSize();
    public static final long SIZE$linearSweptSpheres = LAYOUT$linearSweptSpheres.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$spheres = LAYOUT.byteOffset(PATH$spheres);
    public static final long OFFSET$linearSweptSpheres = LAYOUT.byteOffset(PATH$linearSweptSpheres);

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

    public @unsigned int spheres() {
        return segment.get(LAYOUT$spheres, OFFSET$spheres);
    }

    public void spheres(@unsigned int value) {
        segment.set(LAYOUT$spheres, OFFSET$spheres, value);
    }

    public @unsigned int linearSweptSpheres() {
        return segment.get(LAYOUT$linearSweptSpheres, OFFSET$linearSweptSpheres);
    }

    public void linearSweptSpheres(@unsigned int value) {
        segment.set(LAYOUT$linearSweptSpheres, OFFSET$linearSweptSpheres, value);
    }

}
/// dummy, not implemented yet
