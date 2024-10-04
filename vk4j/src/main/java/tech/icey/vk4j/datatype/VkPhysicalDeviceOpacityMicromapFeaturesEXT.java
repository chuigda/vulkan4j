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
/// typedef struct VkPhysicalDeviceOpacityMicromapFeaturesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 micromap;
///     VkBool32 micromapCaptureReplay;
///     VkBool32 micromapHostCommands;
/// } VkPhysicalDeviceOpacityMicromapFeaturesEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceOpacityMicromapFeaturesEXT.html">VkPhysicalDeviceOpacityMicromapFeaturesEXT</a>
public record VkPhysicalDeviceOpacityMicromapFeaturesEXT(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceOpacityMicromapFeaturesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_OPACITY_MICROMAP_FEATURES_EXT);
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

    public void pNext(@nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @unsigned int micromap() {
        return segment.get(LAYOUT$micromap, OFFSET$micromap);
    }

    public void micromap(@unsigned int value) {
        segment.set(LAYOUT$micromap, OFFSET$micromap, value);
    }

    public @unsigned int micromapCaptureReplay() {
        return segment.get(LAYOUT$micromapCaptureReplay, OFFSET$micromapCaptureReplay);
    }

    public void micromapCaptureReplay(@unsigned int value) {
        segment.set(LAYOUT$micromapCaptureReplay, OFFSET$micromapCaptureReplay, value);
    }

    public @unsigned int micromapHostCommands() {
        return segment.get(LAYOUT$micromapHostCommands, OFFSET$micromapHostCommands);
    }

    public void micromapHostCommands(@unsigned int value) {
        segment.set(LAYOUT$micromapHostCommands, OFFSET$micromapHostCommands, value);
    }

    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceOpacityMicromapFeaturesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceOpacityMicromapFeaturesEXT[] ret = new VkPhysicalDeviceOpacityMicromapFeaturesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceOpacityMicromapFeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT clone(Arena arena, VkPhysicalDeviceOpacityMicromapFeaturesEXT src) {
        VkPhysicalDeviceOpacityMicromapFeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceOpacityMicromapFeaturesEXT[] clone(Arena arena, VkPhysicalDeviceOpacityMicromapFeaturesEXT[] src) {
        VkPhysicalDeviceOpacityMicromapFeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("micromap"),
        ValueLayout.JAVA_INT.withName("micromapCaptureReplay"),
        ValueLayout.JAVA_INT.withName("micromapHostCommands")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$micromap = PathElement.groupElement("micromap");
    public static final PathElement PATH$micromapCaptureReplay = PathElement.groupElement("micromapCaptureReplay");
    public static final PathElement PATH$micromapHostCommands = PathElement.groupElement("micromapHostCommands");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$micromap = (OfInt) LAYOUT.select(PATH$micromap);
    public static final OfInt LAYOUT$micromapCaptureReplay = (OfInt) LAYOUT.select(PATH$micromapCaptureReplay);
    public static final OfInt LAYOUT$micromapHostCommands = (OfInt) LAYOUT.select(PATH$micromapHostCommands);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$micromap = LAYOUT.byteOffset(PATH$micromap);
    public static final long OFFSET$micromapCaptureReplay = LAYOUT.byteOffset(PATH$micromapCaptureReplay);
    public static final long OFFSET$micromapHostCommands = LAYOUT.byteOffset(PATH$micromapHostCommands);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$micromap = LAYOUT$micromap.byteSize();
    public static final long SIZE$micromapCaptureReplay = LAYOUT$micromapCaptureReplay.byteSize();
    public static final long SIZE$micromapHostCommands = LAYOUT$micromapHostCommands.byteSize();
}
