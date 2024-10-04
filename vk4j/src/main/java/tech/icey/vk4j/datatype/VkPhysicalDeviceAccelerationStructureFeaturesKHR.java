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
/// typedef struct VkPhysicalDeviceAccelerationStructureFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 accelerationStructure;
///     VkBool32 accelerationStructureCaptureReplay;
///     VkBool32 accelerationStructureIndirectBuild;
///     VkBool32 accelerationStructureHostCommands;
///     VkBool32 descriptorBindingAccelerationStructureUpdateAfterBind;
/// } VkPhysicalDeviceAccelerationStructureFeaturesKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceAccelerationStructureFeaturesKHR.html">VkPhysicalDeviceAccelerationStructureFeaturesKHR</a>
public record VkPhysicalDeviceAccelerationStructureFeaturesKHR(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceAccelerationStructureFeaturesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_ACCELERATION_STRUCTURE_FEATURES_KHR);
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

    public @unsigned int accelerationStructure() {
        return segment.get(LAYOUT$accelerationStructure, OFFSET$accelerationStructure);
    }

    public void accelerationStructure(@unsigned int value) {
        segment.set(LAYOUT$accelerationStructure, OFFSET$accelerationStructure, value);
    }

    public @unsigned int accelerationStructureCaptureReplay() {
        return segment.get(LAYOUT$accelerationStructureCaptureReplay, OFFSET$accelerationStructureCaptureReplay);
    }

    public void accelerationStructureCaptureReplay(@unsigned int value) {
        segment.set(LAYOUT$accelerationStructureCaptureReplay, OFFSET$accelerationStructureCaptureReplay, value);
    }

    public @unsigned int accelerationStructureIndirectBuild() {
        return segment.get(LAYOUT$accelerationStructureIndirectBuild, OFFSET$accelerationStructureIndirectBuild);
    }

    public void accelerationStructureIndirectBuild(@unsigned int value) {
        segment.set(LAYOUT$accelerationStructureIndirectBuild, OFFSET$accelerationStructureIndirectBuild, value);
    }

    public @unsigned int accelerationStructureHostCommands() {
        return segment.get(LAYOUT$accelerationStructureHostCommands, OFFSET$accelerationStructureHostCommands);
    }

    public void accelerationStructureHostCommands(@unsigned int value) {
        segment.set(LAYOUT$accelerationStructureHostCommands, OFFSET$accelerationStructureHostCommands, value);
    }

    public @unsigned int descriptorBindingAccelerationStructureUpdateAfterBind() {
        return segment.get(LAYOUT$descriptorBindingAccelerationStructureUpdateAfterBind, OFFSET$descriptorBindingAccelerationStructureUpdateAfterBind);
    }

    public void descriptorBindingAccelerationStructureUpdateAfterBind(@unsigned int value) {
        segment.set(LAYOUT$descriptorBindingAccelerationStructureUpdateAfterBind, OFFSET$descriptorBindingAccelerationStructureUpdateAfterBind, value);
    }

    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR allocate(Arena arena) {
        return new VkPhysicalDeviceAccelerationStructureFeaturesKHR(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceAccelerationStructureFeaturesKHR[] ret = new VkPhysicalDeviceAccelerationStructureFeaturesKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceAccelerationStructureFeaturesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR clone(Arena arena, VkPhysicalDeviceAccelerationStructureFeaturesKHR src) {
        VkPhysicalDeviceAccelerationStructureFeaturesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceAccelerationStructureFeaturesKHR[] clone(Arena arena, VkPhysicalDeviceAccelerationStructureFeaturesKHR[] src) {
        VkPhysicalDeviceAccelerationStructureFeaturesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("accelerationStructure"),
        ValueLayout.JAVA_INT.withName("accelerationStructureCaptureReplay"),
        ValueLayout.JAVA_INT.withName("accelerationStructureIndirectBuild"),
        ValueLayout.JAVA_INT.withName("accelerationStructureHostCommands"),
        ValueLayout.JAVA_INT.withName("descriptorBindingAccelerationStructureUpdateAfterBind")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$accelerationStructure = PathElement.groupElement("accelerationStructure");
    public static final PathElement PATH$accelerationStructureCaptureReplay = PathElement.groupElement("accelerationStructureCaptureReplay");
    public static final PathElement PATH$accelerationStructureIndirectBuild = PathElement.groupElement("accelerationStructureIndirectBuild");
    public static final PathElement PATH$accelerationStructureHostCommands = PathElement.groupElement("accelerationStructureHostCommands");
    public static final PathElement PATH$descriptorBindingAccelerationStructureUpdateAfterBind = PathElement.groupElement("descriptorBindingAccelerationStructureUpdateAfterBind");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$accelerationStructure = (OfInt) LAYOUT.select(PATH$accelerationStructure);
    public static final OfInt LAYOUT$accelerationStructureCaptureReplay = (OfInt) LAYOUT.select(PATH$accelerationStructureCaptureReplay);
    public static final OfInt LAYOUT$accelerationStructureIndirectBuild = (OfInt) LAYOUT.select(PATH$accelerationStructureIndirectBuild);
    public static final OfInt LAYOUT$accelerationStructureHostCommands = (OfInt) LAYOUT.select(PATH$accelerationStructureHostCommands);
    public static final OfInt LAYOUT$descriptorBindingAccelerationStructureUpdateAfterBind = (OfInt) LAYOUT.select(PATH$descriptorBindingAccelerationStructureUpdateAfterBind);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$accelerationStructure = LAYOUT.byteOffset(PATH$accelerationStructure);
    public static final long OFFSET$accelerationStructureCaptureReplay = LAYOUT.byteOffset(PATH$accelerationStructureCaptureReplay);
    public static final long OFFSET$accelerationStructureIndirectBuild = LAYOUT.byteOffset(PATH$accelerationStructureIndirectBuild);
    public static final long OFFSET$accelerationStructureHostCommands = LAYOUT.byteOffset(PATH$accelerationStructureHostCommands);
    public static final long OFFSET$descriptorBindingAccelerationStructureUpdateAfterBind = LAYOUT.byteOffset(PATH$descriptorBindingAccelerationStructureUpdateAfterBind);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$accelerationStructure = LAYOUT$accelerationStructure.byteSize();
    public static final long SIZE$accelerationStructureCaptureReplay = LAYOUT$accelerationStructureCaptureReplay.byteSize();
    public static final long SIZE$accelerationStructureIndirectBuild = LAYOUT$accelerationStructureIndirectBuild.byteSize();
    public static final long SIZE$accelerationStructureHostCommands = LAYOUT$accelerationStructureHostCommands.byteSize();
    public static final long SIZE$descriptorBindingAccelerationStructureUpdateAfterBind = LAYOUT$descriptorBindingAccelerationStructureUpdateAfterBind.byteSize();
}
