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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDevicePCIBusInfoPropertiesEXT.html">VkPhysicalDevicePCIBusInfoPropertiesEXT</a>
@ValueBasedCandidate
public record VkPhysicalDevicePCIBusInfoPropertiesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$pciDomain = ValueLayout.JAVA_INT.withName("pciDomain");
    public static final OfInt LAYOUT$pciBus = ValueLayout.JAVA_INT.withName("pciBus");
    public static final OfInt LAYOUT$pciDevice = ValueLayout.JAVA_INT.withName("pciDevice");
    public static final OfInt LAYOUT$pciFunction = ValueLayout.JAVA_INT.withName("pciFunction");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$pciDomain, LAYOUT$pciBus, LAYOUT$pciDevice, LAYOUT$pciFunction);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDevicePCIBusInfoPropertiesEXT allocate(Arena arena) {
        return new VkPhysicalDevicePCIBusInfoPropertiesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDevicePCIBusInfoPropertiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDevicePCIBusInfoPropertiesEXT[] ret = new VkPhysicalDevicePCIBusInfoPropertiesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDevicePCIBusInfoPropertiesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDevicePCIBusInfoPropertiesEXT clone(Arena arena, VkPhysicalDevicePCIBusInfoPropertiesEXT src) {
        VkPhysicalDevicePCIBusInfoPropertiesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDevicePCIBusInfoPropertiesEXT[] clone(Arena arena, VkPhysicalDevicePCIBusInfoPropertiesEXT[] src) {
        VkPhysicalDevicePCIBusInfoPropertiesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$pciDomain = PathElement.groupElement("PATH$pciDomain");
    public static final PathElement PATH$pciBus = PathElement.groupElement("PATH$pciBus");
    public static final PathElement PATH$pciDevice = PathElement.groupElement("PATH$pciDevice");
    public static final PathElement PATH$pciFunction = PathElement.groupElement("PATH$pciFunction");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pciDomain = LAYOUT$pciDomain.byteSize();
    public static final long SIZE$pciBus = LAYOUT$pciBus.byteSize();
    public static final long SIZE$pciDevice = LAYOUT$pciDevice.byteSize();
    public static final long SIZE$pciFunction = LAYOUT$pciFunction.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pciDomain = LAYOUT.byteOffset(PATH$pciDomain);
    public static final long OFFSET$pciBus = LAYOUT.byteOffset(PATH$pciBus);
    public static final long OFFSET$pciDevice = LAYOUT.byteOffset(PATH$pciDevice);
    public static final long OFFSET$pciFunction = LAYOUT.byteOffset(PATH$pciFunction);

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

    public @unsigned int pciDomain() {
        return segment.get(LAYOUT$pciDomain, OFFSET$pciDomain);
    }

    public void pciDomain(@unsigned int value) {
        segment.set(LAYOUT$pciDomain, OFFSET$pciDomain, value);
    }

    public @unsigned int pciBus() {
        return segment.get(LAYOUT$pciBus, OFFSET$pciBus);
    }

    public void pciBus(@unsigned int value) {
        segment.set(LAYOUT$pciBus, OFFSET$pciBus, value);
    }

    public @unsigned int pciDevice() {
        return segment.get(LAYOUT$pciDevice, OFFSET$pciDevice);
    }

    public void pciDevice(@unsigned int value) {
        segment.set(LAYOUT$pciDevice, OFFSET$pciDevice, value);
    }

    public @unsigned int pciFunction() {
        return segment.get(LAYOUT$pciFunction, OFFSET$pciFunction);
    }

    public void pciFunction(@unsigned int value) {
        segment.set(LAYOUT$pciFunction, OFFSET$pciFunction, value);
    }

}
