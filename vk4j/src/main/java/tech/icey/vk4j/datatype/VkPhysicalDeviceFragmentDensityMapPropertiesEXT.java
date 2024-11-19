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
/// typedef struct VkPhysicalDeviceFragmentDensityMapPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkExtent2D minFragmentDensityTexelSize;
///     VkExtent2D maxFragmentDensityTexelSize;
///     VkBool32 fragmentDensityInvocations;
/// } VkPhysicalDeviceFragmentDensityMapPropertiesEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceFragmentDensityMapPropertiesEXT.html">VkPhysicalDeviceFragmentDensityMapPropertiesEXT</a>
public record VkPhysicalDeviceFragmentDensityMapPropertiesEXT(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceFragmentDensityMapPropertiesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FRAGMENT_DENSITY_MAP_PROPERTIES_EXT);
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

    public VkExtent2D minFragmentDensityTexelSize() {
        return new VkExtent2D(segment.asSlice(OFFSET$minFragmentDensityTexelSize, LAYOUT$minFragmentDensityTexelSize));
    }

    public void minFragmentDensityTexelSize(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$minFragmentDensityTexelSize, SIZE$minFragmentDensityTexelSize);
    }

    public VkExtent2D maxFragmentDensityTexelSize() {
        return new VkExtent2D(segment.asSlice(OFFSET$maxFragmentDensityTexelSize, LAYOUT$maxFragmentDensityTexelSize));
    }

    public void maxFragmentDensityTexelSize(VkExtent2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$maxFragmentDensityTexelSize, SIZE$maxFragmentDensityTexelSize);
    }

    public @unsigned int fragmentDensityInvocations() {
        return segment.get(LAYOUT$fragmentDensityInvocations, OFFSET$fragmentDensityInvocations);
    }

    public void fragmentDensityInvocations(@unsigned int value) {
        segment.set(LAYOUT$fragmentDensityInvocations, OFFSET$fragmentDensityInvocations, value);
    }

    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceFragmentDensityMapPropertiesEXT[] ret = new VkPhysicalDeviceFragmentDensityMapPropertiesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceFragmentDensityMapPropertiesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT clone(Arena arena, VkPhysicalDeviceFragmentDensityMapPropertiesEXT src) {
        VkPhysicalDeviceFragmentDensityMapPropertiesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceFragmentDensityMapPropertiesEXT[] clone(Arena arena, VkPhysicalDeviceFragmentDensityMapPropertiesEXT[] src) {
        VkPhysicalDeviceFragmentDensityMapPropertiesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkExtent2D.LAYOUT.withName("minFragmentDensityTexelSize"),
        VkExtent2D.LAYOUT.withName("maxFragmentDensityTexelSize"),
        ValueLayout.JAVA_INT.withName("fragmentDensityInvocations")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$minFragmentDensityTexelSize = PathElement.groupElement("minFragmentDensityTexelSize");
    public static final PathElement PATH$maxFragmentDensityTexelSize = PathElement.groupElement("maxFragmentDensityTexelSize");
    public static final PathElement PATH$fragmentDensityInvocations = PathElement.groupElement("fragmentDensityInvocations");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$minFragmentDensityTexelSize = (StructLayout) LAYOUT.select(PATH$minFragmentDensityTexelSize);
    public static final StructLayout LAYOUT$maxFragmentDensityTexelSize = (StructLayout) LAYOUT.select(PATH$maxFragmentDensityTexelSize);
    public static final OfInt LAYOUT$fragmentDensityInvocations = (OfInt) LAYOUT.select(PATH$fragmentDensityInvocations);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$minFragmentDensityTexelSize = LAYOUT.byteOffset(PATH$minFragmentDensityTexelSize);
    public static final long OFFSET$maxFragmentDensityTexelSize = LAYOUT.byteOffset(PATH$maxFragmentDensityTexelSize);
    public static final long OFFSET$fragmentDensityInvocations = LAYOUT.byteOffset(PATH$fragmentDensityInvocations);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$minFragmentDensityTexelSize = LAYOUT$minFragmentDensityTexelSize.byteSize();
    public static final long SIZE$maxFragmentDensityTexelSize = LAYOUT$maxFragmentDensityTexelSize.byteSize();
    public static final long SIZE$fragmentDensityInvocations = LAYOUT$fragmentDensityInvocations.byteSize();
}
