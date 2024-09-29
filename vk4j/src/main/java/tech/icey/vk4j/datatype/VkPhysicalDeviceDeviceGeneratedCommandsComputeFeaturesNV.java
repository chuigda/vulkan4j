package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 deviceGeneratedCompute;
///     VkBool32 deviceGeneratedComputePipelines;
///     VkBool32 deviceGeneratedComputeCaptureReplay;
/// } VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV.html">VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV</a>
public record VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_DEVICE_GENERATED_COMMANDS_COMPUTE_FEATURES_NV);
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

    public @unsigned int deviceGeneratedCompute() {
        return segment.get(LAYOUT$deviceGeneratedCompute, OFFSET$deviceGeneratedCompute);
    }

    public void deviceGeneratedCompute(@unsigned int value) {
        segment.set(LAYOUT$deviceGeneratedCompute, OFFSET$deviceGeneratedCompute, value);
    }

    public @unsigned int deviceGeneratedComputePipelines() {
        return segment.get(LAYOUT$deviceGeneratedComputePipelines, OFFSET$deviceGeneratedComputePipelines);
    }

    public void deviceGeneratedComputePipelines(@unsigned int value) {
        segment.set(LAYOUT$deviceGeneratedComputePipelines, OFFSET$deviceGeneratedComputePipelines, value);
    }

    public @unsigned int deviceGeneratedComputeCaptureReplay() {
        return segment.get(LAYOUT$deviceGeneratedComputeCaptureReplay, OFFSET$deviceGeneratedComputeCaptureReplay);
    }

    public void deviceGeneratedComputeCaptureReplay(@unsigned int value) {
        segment.set(LAYOUT$deviceGeneratedComputeCaptureReplay, OFFSET$deviceGeneratedComputeCaptureReplay, value);
    }

    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV allocate(Arena arena) {
        return new VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV[] ret = new VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV clone(Arena arena, VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV src) {
        VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV[] clone(Arena arena, VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV[] src) {
        VkPhysicalDeviceDeviceGeneratedCommandsComputeFeaturesNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("deviceGeneratedCompute"),
        ValueLayout.JAVA_INT.withName("deviceGeneratedComputePipelines"),
        ValueLayout.JAVA_INT.withName("deviceGeneratedComputeCaptureReplay")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$deviceGeneratedCompute = PathElement.groupElement("deviceGeneratedCompute");
    public static final PathElement PATH$deviceGeneratedComputePipelines = PathElement.groupElement("deviceGeneratedComputePipelines");
    public static final PathElement PATH$deviceGeneratedComputeCaptureReplay = PathElement.groupElement("deviceGeneratedComputeCaptureReplay");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$deviceGeneratedCompute = (OfInt) LAYOUT.select(PATH$deviceGeneratedCompute);
    public static final OfInt LAYOUT$deviceGeneratedComputePipelines = (OfInt) LAYOUT.select(PATH$deviceGeneratedComputePipelines);
    public static final OfInt LAYOUT$deviceGeneratedComputeCaptureReplay = (OfInt) LAYOUT.select(PATH$deviceGeneratedComputeCaptureReplay);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$deviceGeneratedCompute = LAYOUT.byteOffset(PATH$deviceGeneratedCompute);
    public static final long OFFSET$deviceGeneratedComputePipelines = LAYOUT.byteOffset(PATH$deviceGeneratedComputePipelines);
    public static final long OFFSET$deviceGeneratedComputeCaptureReplay = LAYOUT.byteOffset(PATH$deviceGeneratedComputeCaptureReplay);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$deviceGeneratedCompute = LAYOUT$deviceGeneratedCompute.byteSize();
    public static final long SIZE$deviceGeneratedComputePipelines = LAYOUT$deviceGeneratedComputePipelines.byteSize();
    public static final long SIZE$deviceGeneratedComputeCaptureReplay = LAYOUT$deviceGeneratedComputeCaptureReplay.byteSize();
}
