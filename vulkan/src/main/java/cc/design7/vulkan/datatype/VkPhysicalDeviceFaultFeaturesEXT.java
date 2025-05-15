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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceFaultFeaturesEXT.html">VkPhysicalDeviceFaultFeaturesEXT</a>
@ValueBasedCandidate
public record VkPhysicalDeviceFaultFeaturesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$deviceFault = ValueLayout.JAVA_INT.withName("deviceFault");
    public static final OfInt LAYOUT$deviceFaultVendorBinary = ValueLayout.JAVA_INT.withName("deviceFaultVendorBinary");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$deviceFault, LAYOUT$deviceFaultVendorBinary);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceFaultFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceFaultFeaturesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceFaultFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceFaultFeaturesEXT[] ret = new VkPhysicalDeviceFaultFeaturesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceFaultFeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceFaultFeaturesEXT clone(Arena arena, VkPhysicalDeviceFaultFeaturesEXT src) {
        VkPhysicalDeviceFaultFeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceFaultFeaturesEXT[] clone(Arena arena, VkPhysicalDeviceFaultFeaturesEXT[] src) {
        VkPhysicalDeviceFaultFeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$deviceFault = PathElement.groupElement("PATH$deviceFault");
    public static final PathElement PATH$deviceFaultVendorBinary = PathElement.groupElement("PATH$deviceFaultVendorBinary");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$deviceFault = LAYOUT$deviceFault.byteSize();
    public static final long SIZE$deviceFaultVendorBinary = LAYOUT$deviceFaultVendorBinary.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$deviceFault = LAYOUT.byteOffset(PATH$deviceFault);
    public static final long OFFSET$deviceFaultVendorBinary = LAYOUT.byteOffset(PATH$deviceFaultVendorBinary);

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

    public @unsigned int deviceFault() {
        return segment.get(LAYOUT$deviceFault, OFFSET$deviceFault);
    }

    public void deviceFault(@unsigned int value) {
        segment.set(LAYOUT$deviceFault, OFFSET$deviceFault, value);
    }

    public @unsigned int deviceFaultVendorBinary() {
        return segment.get(LAYOUT$deviceFaultVendorBinary, OFFSET$deviceFaultVendorBinary);
    }

    public void deviceFaultVendorBinary(@unsigned int value) {
        segment.set(LAYOUT$deviceFaultVendorBinary, OFFSET$deviceFaultVendorBinary, value);
    }

}
