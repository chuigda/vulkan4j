package tech.icey.vma.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vma.bitmask.*;
import tech.icey.vma.datatype.*;
import tech.icey.vma.enumtype.*;
import tech.icey.vma.handle.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;

public record VmaVulkanFunctions(MemorySegment segment) implements IPointer {
    public @pointer(comment="PFN_vkGetInstanceProcAddr") MemorySegment vkGetInstanceProcAddr() {
        return segment.get(LAYOUT$vkGetInstanceProcAddr, OFFSET$vkGetInstanceProcAddr);
    }

    public void vkGetInstanceProcAddr(@pointer(comment="PFN_vkGetInstanceProcAddr") MemorySegment value) {
        segment.set(LAYOUT$vkGetInstanceProcAddr, OFFSET$vkGetInstanceProcAddr, value);
    }

    public void vkGetInstanceProcAddr(IPointer pointer) {
        vkGetInstanceProcAddr(pointer.segment());
    }

    public @pointer(comment="PFN_vkGetDeviceProcAddr") MemorySegment vkGetDeviceProcAddr() {
        return segment.get(LAYOUT$vkGetDeviceProcAddr, OFFSET$vkGetDeviceProcAddr);
    }

    public void vkGetDeviceProcAddr(@pointer(comment="PFN_vkGetDeviceProcAddr") MemorySegment value) {
        segment.set(LAYOUT$vkGetDeviceProcAddr, OFFSET$vkGetDeviceProcAddr, value);
    }

    public void vkGetDeviceProcAddr(IPointer pointer) {
        vkGetDeviceProcAddr(pointer.segment());
    }

    public @pointer(comment="PFN_vkGetPhysicalDeviceProperties") MemorySegment vkGetPhysicalDeviceProperties() {
        return segment.get(LAYOUT$vkGetPhysicalDeviceProperties, OFFSET$vkGetPhysicalDeviceProperties);
    }

    public void vkGetPhysicalDeviceProperties(@pointer(comment="PFN_vkGetPhysicalDeviceProperties") MemorySegment value) {
        segment.set(LAYOUT$vkGetPhysicalDeviceProperties, OFFSET$vkGetPhysicalDeviceProperties, value);
    }

    public void vkGetPhysicalDeviceProperties(IPointer pointer) {
        vkGetPhysicalDeviceProperties(pointer.segment());
    }

    public @pointer(comment="PFN_vkGetPhysicalDeviceMemoryProperties") MemorySegment vkGetPhysicalDeviceMemoryProperties() {
        return segment.get(LAYOUT$vkGetPhysicalDeviceMemoryProperties, OFFSET$vkGetPhysicalDeviceMemoryProperties);
    }

    public void vkGetPhysicalDeviceMemoryProperties(@pointer(comment="PFN_vkGetPhysicalDeviceMemoryProperties") MemorySegment value) {
        segment.set(LAYOUT$vkGetPhysicalDeviceMemoryProperties, OFFSET$vkGetPhysicalDeviceMemoryProperties, value);
    }

    public void vkGetPhysicalDeviceMemoryProperties(IPointer pointer) {
        vkGetPhysicalDeviceMemoryProperties(pointer.segment());
    }

    public @pointer(comment="PFN_vkAllocateMemory") MemorySegment vkAllocateMemory() {
        return segment.get(LAYOUT$vkAllocateMemory, OFFSET$vkAllocateMemory);
    }

    public void vkAllocateMemory(@pointer(comment="PFN_vkAllocateMemory") MemorySegment value) {
        segment.set(LAYOUT$vkAllocateMemory, OFFSET$vkAllocateMemory, value);
    }

    public void vkAllocateMemory(IPointer pointer) {
        vkAllocateMemory(pointer.segment());
    }

    public @pointer(comment="PFN_vkFreeMemory") MemorySegment vkFreeMemory() {
        return segment.get(LAYOUT$vkFreeMemory, OFFSET$vkFreeMemory);
    }

    public void vkFreeMemory(@pointer(comment="PFN_vkFreeMemory") MemorySegment value) {
        segment.set(LAYOUT$vkFreeMemory, OFFSET$vkFreeMemory, value);
    }

    public void vkFreeMemory(IPointer pointer) {
        vkFreeMemory(pointer.segment());
    }

    public @pointer(comment="PFN_vkMapMemory") MemorySegment vkMapMemory() {
        return segment.get(LAYOUT$vkMapMemory, OFFSET$vkMapMemory);
    }

    public void vkMapMemory(@pointer(comment="PFN_vkMapMemory") MemorySegment value) {
        segment.set(LAYOUT$vkMapMemory, OFFSET$vkMapMemory, value);
    }

    public void vkMapMemory(IPointer pointer) {
        vkMapMemory(pointer.segment());
    }

    public @pointer(comment="PFN_vkUnmapMemory") MemorySegment vkUnmapMemory() {
        return segment.get(LAYOUT$vkUnmapMemory, OFFSET$vkUnmapMemory);
    }

    public void vkUnmapMemory(@pointer(comment="PFN_vkUnmapMemory") MemorySegment value) {
        segment.set(LAYOUT$vkUnmapMemory, OFFSET$vkUnmapMemory, value);
    }

    public void vkUnmapMemory(IPointer pointer) {
        vkUnmapMemory(pointer.segment());
    }

    public @pointer(comment="PFN_vkFlushMappedMemoryRanges") MemorySegment vkFlushMappedMemoryRanges() {
        return segment.get(LAYOUT$vkFlushMappedMemoryRanges, OFFSET$vkFlushMappedMemoryRanges);
    }

    public void vkFlushMappedMemoryRanges(@pointer(comment="PFN_vkFlushMappedMemoryRanges") MemorySegment value) {
        segment.set(LAYOUT$vkFlushMappedMemoryRanges, OFFSET$vkFlushMappedMemoryRanges, value);
    }

    public void vkFlushMappedMemoryRanges(IPointer pointer) {
        vkFlushMappedMemoryRanges(pointer.segment());
    }

    public @pointer(comment="PFN_vkInvalidateMappedMemoryRanges") MemorySegment vkInvalidateMappedMemoryRanges() {
        return segment.get(LAYOUT$vkInvalidateMappedMemoryRanges, OFFSET$vkInvalidateMappedMemoryRanges);
    }

    public void vkInvalidateMappedMemoryRanges(@pointer(comment="PFN_vkInvalidateMappedMemoryRanges") MemorySegment value) {
        segment.set(LAYOUT$vkInvalidateMappedMemoryRanges, OFFSET$vkInvalidateMappedMemoryRanges, value);
    }

    public void vkInvalidateMappedMemoryRanges(IPointer pointer) {
        vkInvalidateMappedMemoryRanges(pointer.segment());
    }

    public @pointer(comment="PFN_vkBindBufferMemory") MemorySegment vkBindBufferMemory() {
        return segment.get(LAYOUT$vkBindBufferMemory, OFFSET$vkBindBufferMemory);
    }

    public void vkBindBufferMemory(@pointer(comment="PFN_vkBindBufferMemory") MemorySegment value) {
        segment.set(LAYOUT$vkBindBufferMemory, OFFSET$vkBindBufferMemory, value);
    }

    public void vkBindBufferMemory(IPointer pointer) {
        vkBindBufferMemory(pointer.segment());
    }

    public @pointer(comment="PFN_vkBindImageMemory") MemorySegment vkBindImageMemory() {
        return segment.get(LAYOUT$vkBindImageMemory, OFFSET$vkBindImageMemory);
    }

    public void vkBindImageMemory(@pointer(comment="PFN_vkBindImageMemory") MemorySegment value) {
        segment.set(LAYOUT$vkBindImageMemory, OFFSET$vkBindImageMemory, value);
    }

    public void vkBindImageMemory(IPointer pointer) {
        vkBindImageMemory(pointer.segment());
    }

    public @pointer(comment="PFN_vkGetBufferMemoryRequirements") MemorySegment vkGetBufferMemoryRequirements() {
        return segment.get(LAYOUT$vkGetBufferMemoryRequirements, OFFSET$vkGetBufferMemoryRequirements);
    }

    public void vkGetBufferMemoryRequirements(@pointer(comment="PFN_vkGetBufferMemoryRequirements") MemorySegment value) {
        segment.set(LAYOUT$vkGetBufferMemoryRequirements, OFFSET$vkGetBufferMemoryRequirements, value);
    }

    public void vkGetBufferMemoryRequirements(IPointer pointer) {
        vkGetBufferMemoryRequirements(pointer.segment());
    }

    public @pointer(comment="PFN_vkGetImageMemoryRequirements") MemorySegment vkGetImageMemoryRequirements() {
        return segment.get(LAYOUT$vkGetImageMemoryRequirements, OFFSET$vkGetImageMemoryRequirements);
    }

    public void vkGetImageMemoryRequirements(@pointer(comment="PFN_vkGetImageMemoryRequirements") MemorySegment value) {
        segment.set(LAYOUT$vkGetImageMemoryRequirements, OFFSET$vkGetImageMemoryRequirements, value);
    }

    public void vkGetImageMemoryRequirements(IPointer pointer) {
        vkGetImageMemoryRequirements(pointer.segment());
    }

    public @pointer(comment="PFN_vkCreateBuffer") MemorySegment vkCreateBuffer() {
        return segment.get(LAYOUT$vkCreateBuffer, OFFSET$vkCreateBuffer);
    }

    public void vkCreateBuffer(@pointer(comment="PFN_vkCreateBuffer") MemorySegment value) {
        segment.set(LAYOUT$vkCreateBuffer, OFFSET$vkCreateBuffer, value);
    }

    public void vkCreateBuffer(IPointer pointer) {
        vkCreateBuffer(pointer.segment());
    }

    public @pointer(comment="PFN_vkDestroyBuffer") MemorySegment vkDestroyBuffer() {
        return segment.get(LAYOUT$vkDestroyBuffer, OFFSET$vkDestroyBuffer);
    }

    public void vkDestroyBuffer(@pointer(comment="PFN_vkDestroyBuffer") MemorySegment value) {
        segment.set(LAYOUT$vkDestroyBuffer, OFFSET$vkDestroyBuffer, value);
    }

    public void vkDestroyBuffer(IPointer pointer) {
        vkDestroyBuffer(pointer.segment());
    }

    public @pointer(comment="PFN_vkCreateImage") MemorySegment vkCreateImage() {
        return segment.get(LAYOUT$vkCreateImage, OFFSET$vkCreateImage);
    }

    public void vkCreateImage(@pointer(comment="PFN_vkCreateImage") MemorySegment value) {
        segment.set(LAYOUT$vkCreateImage, OFFSET$vkCreateImage, value);
    }

    public void vkCreateImage(IPointer pointer) {
        vkCreateImage(pointer.segment());
    }

    public @pointer(comment="PFN_vkDestroyImage") MemorySegment vkDestroyImage() {
        return segment.get(LAYOUT$vkDestroyImage, OFFSET$vkDestroyImage);
    }

    public void vkDestroyImage(@pointer(comment="PFN_vkDestroyImage") MemorySegment value) {
        segment.set(LAYOUT$vkDestroyImage, OFFSET$vkDestroyImage, value);
    }

    public void vkDestroyImage(IPointer pointer) {
        vkDestroyImage(pointer.segment());
    }

    public @pointer(comment="PFN_vkCmdCopyBuffer") MemorySegment vkCmdCopyBuffer() {
        return segment.get(LAYOUT$vkCmdCopyBuffer, OFFSET$vkCmdCopyBuffer);
    }

    public void vkCmdCopyBuffer(@pointer(comment="PFN_vkCmdCopyBuffer") MemorySegment value) {
        segment.set(LAYOUT$vkCmdCopyBuffer, OFFSET$vkCmdCopyBuffer, value);
    }

    public void vkCmdCopyBuffer(IPointer pointer) {
        vkCmdCopyBuffer(pointer.segment());
    }

    public @pointer(comment="PFN_vkGetBufferMemoryRequirements2KHR") MemorySegment vkGetBufferMemoryRequirements2KHR() {
        return segment.get(LAYOUT$vkGetBufferMemoryRequirements2KHR, OFFSET$vkGetBufferMemoryRequirements2KHR);
    }

    public void vkGetBufferMemoryRequirements2KHR(@pointer(comment="PFN_vkGetBufferMemoryRequirements2KHR") MemorySegment value) {
        segment.set(LAYOUT$vkGetBufferMemoryRequirements2KHR, OFFSET$vkGetBufferMemoryRequirements2KHR, value);
    }

    public void vkGetBufferMemoryRequirements2KHR(IPointer pointer) {
        vkGetBufferMemoryRequirements2KHR(pointer.segment());
    }

    public @pointer(comment="PFN_vkGetImageMemoryRequirements2KHR") MemorySegment vkGetImageMemoryRequirements2KHR() {
        return segment.get(LAYOUT$vkGetImageMemoryRequirements2KHR, OFFSET$vkGetImageMemoryRequirements2KHR);
    }

    public void vkGetImageMemoryRequirements2KHR(@pointer(comment="PFN_vkGetImageMemoryRequirements2KHR") MemorySegment value) {
        segment.set(LAYOUT$vkGetImageMemoryRequirements2KHR, OFFSET$vkGetImageMemoryRequirements2KHR, value);
    }

    public void vkGetImageMemoryRequirements2KHR(IPointer pointer) {
        vkGetImageMemoryRequirements2KHR(pointer.segment());
    }

    public @pointer(comment="PFN_vkBindBufferMemory2KHR") MemorySegment vkBindBufferMemory2KHR() {
        return segment.get(LAYOUT$vkBindBufferMemory2KHR, OFFSET$vkBindBufferMemory2KHR);
    }

    public void vkBindBufferMemory2KHR(@pointer(comment="PFN_vkBindBufferMemory2KHR") MemorySegment value) {
        segment.set(LAYOUT$vkBindBufferMemory2KHR, OFFSET$vkBindBufferMemory2KHR, value);
    }

    public void vkBindBufferMemory2KHR(IPointer pointer) {
        vkBindBufferMemory2KHR(pointer.segment());
    }

    public @pointer(comment="PFN_vkBindImageMemory2KHR") MemorySegment vkBindImageMemory2KHR() {
        return segment.get(LAYOUT$vkBindImageMemory2KHR, OFFSET$vkBindImageMemory2KHR);
    }

    public void vkBindImageMemory2KHR(@pointer(comment="PFN_vkBindImageMemory2KHR") MemorySegment value) {
        segment.set(LAYOUT$vkBindImageMemory2KHR, OFFSET$vkBindImageMemory2KHR, value);
    }

    public void vkBindImageMemory2KHR(IPointer pointer) {
        vkBindImageMemory2KHR(pointer.segment());
    }

    public @pointer(comment="PFN_vkGetPhysicalDeviceMemoryProperties2KHR") MemorySegment vkGetPhysicalDeviceMemoryProperties2KHR() {
        return segment.get(LAYOUT$vkGetPhysicalDeviceMemoryProperties2KHR, OFFSET$vkGetPhysicalDeviceMemoryProperties2KHR);
    }

    public void vkGetPhysicalDeviceMemoryProperties2KHR(@pointer(comment="PFN_vkGetPhysicalDeviceMemoryProperties2KHR") MemorySegment value) {
        segment.set(LAYOUT$vkGetPhysicalDeviceMemoryProperties2KHR, OFFSET$vkGetPhysicalDeviceMemoryProperties2KHR, value);
    }

    public void vkGetPhysicalDeviceMemoryProperties2KHR(IPointer pointer) {
        vkGetPhysicalDeviceMemoryProperties2KHR(pointer.segment());
    }

    public @pointer(comment="PFN_vkGetDeviceBufferMemoryRequirementsKHR") MemorySegment vkGetDeviceBufferMemoryRequirements() {
        return segment.get(LAYOUT$vkGetDeviceBufferMemoryRequirements, OFFSET$vkGetDeviceBufferMemoryRequirements);
    }

    public void vkGetDeviceBufferMemoryRequirements(@pointer(comment="PFN_vkGetDeviceBufferMemoryRequirementsKHR") MemorySegment value) {
        segment.set(LAYOUT$vkGetDeviceBufferMemoryRequirements, OFFSET$vkGetDeviceBufferMemoryRequirements, value);
    }

    public void vkGetDeviceBufferMemoryRequirements(IPointer pointer) {
        vkGetDeviceBufferMemoryRequirements(pointer.segment());
    }

    public @pointer(comment="PFN_vkGetDeviceImageMemoryRequirementsKHR") MemorySegment vkGetDeviceImageMemoryRequirements() {
        return segment.get(LAYOUT$vkGetDeviceImageMemoryRequirements, OFFSET$vkGetDeviceImageMemoryRequirements);
    }

    public void vkGetDeviceImageMemoryRequirements(@pointer(comment="PFN_vkGetDeviceImageMemoryRequirementsKHR") MemorySegment value) {
        segment.set(LAYOUT$vkGetDeviceImageMemoryRequirements, OFFSET$vkGetDeviceImageMemoryRequirements, value);
    }

    public void vkGetDeviceImageMemoryRequirements(IPointer pointer) {
        vkGetDeviceImageMemoryRequirements(pointer.segment());
    }

    public static VmaVulkanFunctions allocate(Arena arena) {
        return new VmaVulkanFunctions(arena.allocate(LAYOUT));
    }

    public static VmaVulkanFunctions[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VmaVulkanFunctions[] ret = new VmaVulkanFunctions[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VmaVulkanFunctions(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VmaVulkanFunctions clone(Arena arena, VmaVulkanFunctions src) {
        VmaVulkanFunctions ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VmaVulkanFunctions[] clone(Arena arena, VmaVulkanFunctions[] src) {
        VmaVulkanFunctions[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.ADDRESS.withName("vkGetInstanceProcAddr"),
        ValueLayout.ADDRESS.withName("vkGetDeviceProcAddr"),
        ValueLayout.ADDRESS.withName("vkGetPhysicalDeviceProperties"),
        ValueLayout.ADDRESS.withName("vkGetPhysicalDeviceMemoryProperties"),
        ValueLayout.ADDRESS.withName("vkAllocateMemory"),
        ValueLayout.ADDRESS.withName("vkFreeMemory"),
        ValueLayout.ADDRESS.withName("vkMapMemory"),
        ValueLayout.ADDRESS.withName("vkUnmapMemory"),
        ValueLayout.ADDRESS.withName("vkFlushMappedMemoryRanges"),
        ValueLayout.ADDRESS.withName("vkInvalidateMappedMemoryRanges"),
        ValueLayout.ADDRESS.withName("vkBindBufferMemory"),
        ValueLayout.ADDRESS.withName("vkBindImageMemory"),
        ValueLayout.ADDRESS.withName("vkGetBufferMemoryRequirements"),
        ValueLayout.ADDRESS.withName("vkGetImageMemoryRequirements"),
        ValueLayout.ADDRESS.withName("vkCreateBuffer"),
        ValueLayout.ADDRESS.withName("vkDestroyBuffer"),
        ValueLayout.ADDRESS.withName("vkCreateImage"),
        ValueLayout.ADDRESS.withName("vkDestroyImage"),
        ValueLayout.ADDRESS.withName("vkCmdCopyBuffer"),
        ValueLayout.ADDRESS.withName("vkGetBufferMemoryRequirements2KHR"),
        ValueLayout.ADDRESS.withName("vkGetImageMemoryRequirements2KHR"),
        ValueLayout.ADDRESS.withName("vkBindBufferMemory2KHR"),
        ValueLayout.ADDRESS.withName("vkBindImageMemory2KHR"),
        ValueLayout.ADDRESS.withName("vkGetPhysicalDeviceMemoryProperties2KHR"),
        ValueLayout.ADDRESS.withName("vkGetDeviceBufferMemoryRequirements"),
        ValueLayout.ADDRESS.withName("vkGetDeviceImageMemoryRequirements")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$vkGetInstanceProcAddr = PathElement.groupElement("vkGetInstanceProcAddr");
    public static final PathElement PATH$vkGetDeviceProcAddr = PathElement.groupElement("vkGetDeviceProcAddr");
    public static final PathElement PATH$vkGetPhysicalDeviceProperties = PathElement.groupElement("vkGetPhysicalDeviceProperties");
    public static final PathElement PATH$vkGetPhysicalDeviceMemoryProperties = PathElement.groupElement("vkGetPhysicalDeviceMemoryProperties");
    public static final PathElement PATH$vkAllocateMemory = PathElement.groupElement("vkAllocateMemory");
    public static final PathElement PATH$vkFreeMemory = PathElement.groupElement("vkFreeMemory");
    public static final PathElement PATH$vkMapMemory = PathElement.groupElement("vkMapMemory");
    public static final PathElement PATH$vkUnmapMemory = PathElement.groupElement("vkUnmapMemory");
    public static final PathElement PATH$vkFlushMappedMemoryRanges = PathElement.groupElement("vkFlushMappedMemoryRanges");
    public static final PathElement PATH$vkInvalidateMappedMemoryRanges = PathElement.groupElement("vkInvalidateMappedMemoryRanges");
    public static final PathElement PATH$vkBindBufferMemory = PathElement.groupElement("vkBindBufferMemory");
    public static final PathElement PATH$vkBindImageMemory = PathElement.groupElement("vkBindImageMemory");
    public static final PathElement PATH$vkGetBufferMemoryRequirements = PathElement.groupElement("vkGetBufferMemoryRequirements");
    public static final PathElement PATH$vkGetImageMemoryRequirements = PathElement.groupElement("vkGetImageMemoryRequirements");
    public static final PathElement PATH$vkCreateBuffer = PathElement.groupElement("vkCreateBuffer");
    public static final PathElement PATH$vkDestroyBuffer = PathElement.groupElement("vkDestroyBuffer");
    public static final PathElement PATH$vkCreateImage = PathElement.groupElement("vkCreateImage");
    public static final PathElement PATH$vkDestroyImage = PathElement.groupElement("vkDestroyImage");
    public static final PathElement PATH$vkCmdCopyBuffer = PathElement.groupElement("vkCmdCopyBuffer");
    public static final PathElement PATH$vkGetBufferMemoryRequirements2KHR = PathElement.groupElement("vkGetBufferMemoryRequirements2KHR");
    public static final PathElement PATH$vkGetImageMemoryRequirements2KHR = PathElement.groupElement("vkGetImageMemoryRequirements2KHR");
    public static final PathElement PATH$vkBindBufferMemory2KHR = PathElement.groupElement("vkBindBufferMemory2KHR");
    public static final PathElement PATH$vkBindImageMemory2KHR = PathElement.groupElement("vkBindImageMemory2KHR");
    public static final PathElement PATH$vkGetPhysicalDeviceMemoryProperties2KHR = PathElement.groupElement("vkGetPhysicalDeviceMemoryProperties2KHR");
    public static final PathElement PATH$vkGetDeviceBufferMemoryRequirements = PathElement.groupElement("vkGetDeviceBufferMemoryRequirements");
    public static final PathElement PATH$vkGetDeviceImageMemoryRequirements = PathElement.groupElement("vkGetDeviceImageMemoryRequirements");

    public static final AddressLayout LAYOUT$vkGetInstanceProcAddr = (AddressLayout) LAYOUT.select(PATH$vkGetInstanceProcAddr);
    public static final AddressLayout LAYOUT$vkGetDeviceProcAddr = (AddressLayout) LAYOUT.select(PATH$vkGetDeviceProcAddr);
    public static final AddressLayout LAYOUT$vkGetPhysicalDeviceProperties = (AddressLayout) LAYOUT.select(PATH$vkGetPhysicalDeviceProperties);
    public static final AddressLayout LAYOUT$vkGetPhysicalDeviceMemoryProperties = (AddressLayout) LAYOUT.select(PATH$vkGetPhysicalDeviceMemoryProperties);
    public static final AddressLayout LAYOUT$vkAllocateMemory = (AddressLayout) LAYOUT.select(PATH$vkAllocateMemory);
    public static final AddressLayout LAYOUT$vkFreeMemory = (AddressLayout) LAYOUT.select(PATH$vkFreeMemory);
    public static final AddressLayout LAYOUT$vkMapMemory = (AddressLayout) LAYOUT.select(PATH$vkMapMemory);
    public static final AddressLayout LAYOUT$vkUnmapMemory = (AddressLayout) LAYOUT.select(PATH$vkUnmapMemory);
    public static final AddressLayout LAYOUT$vkFlushMappedMemoryRanges = (AddressLayout) LAYOUT.select(PATH$vkFlushMappedMemoryRanges);
    public static final AddressLayout LAYOUT$vkInvalidateMappedMemoryRanges = (AddressLayout) LAYOUT.select(PATH$vkInvalidateMappedMemoryRanges);
    public static final AddressLayout LAYOUT$vkBindBufferMemory = (AddressLayout) LAYOUT.select(PATH$vkBindBufferMemory);
    public static final AddressLayout LAYOUT$vkBindImageMemory = (AddressLayout) LAYOUT.select(PATH$vkBindImageMemory);
    public static final AddressLayout LAYOUT$vkGetBufferMemoryRequirements = (AddressLayout) LAYOUT.select(PATH$vkGetBufferMemoryRequirements);
    public static final AddressLayout LAYOUT$vkGetImageMemoryRequirements = (AddressLayout) LAYOUT.select(PATH$vkGetImageMemoryRequirements);
    public static final AddressLayout LAYOUT$vkCreateBuffer = (AddressLayout) LAYOUT.select(PATH$vkCreateBuffer);
    public static final AddressLayout LAYOUT$vkDestroyBuffer = (AddressLayout) LAYOUT.select(PATH$vkDestroyBuffer);
    public static final AddressLayout LAYOUT$vkCreateImage = (AddressLayout) LAYOUT.select(PATH$vkCreateImage);
    public static final AddressLayout LAYOUT$vkDestroyImage = (AddressLayout) LAYOUT.select(PATH$vkDestroyImage);
    public static final AddressLayout LAYOUT$vkCmdCopyBuffer = (AddressLayout) LAYOUT.select(PATH$vkCmdCopyBuffer);
    public static final AddressLayout LAYOUT$vkGetBufferMemoryRequirements2KHR = (AddressLayout) LAYOUT.select(PATH$vkGetBufferMemoryRequirements2KHR);
    public static final AddressLayout LAYOUT$vkGetImageMemoryRequirements2KHR = (AddressLayout) LAYOUT.select(PATH$vkGetImageMemoryRequirements2KHR);
    public static final AddressLayout LAYOUT$vkBindBufferMemory2KHR = (AddressLayout) LAYOUT.select(PATH$vkBindBufferMemory2KHR);
    public static final AddressLayout LAYOUT$vkBindImageMemory2KHR = (AddressLayout) LAYOUT.select(PATH$vkBindImageMemory2KHR);
    public static final AddressLayout LAYOUT$vkGetPhysicalDeviceMemoryProperties2KHR = (AddressLayout) LAYOUT.select(PATH$vkGetPhysicalDeviceMemoryProperties2KHR);
    public static final AddressLayout LAYOUT$vkGetDeviceBufferMemoryRequirements = (AddressLayout) LAYOUT.select(PATH$vkGetDeviceBufferMemoryRequirements);
    public static final AddressLayout LAYOUT$vkGetDeviceImageMemoryRequirements = (AddressLayout) LAYOUT.select(PATH$vkGetDeviceImageMemoryRequirements);

    public static final long OFFSET$vkGetInstanceProcAddr = LAYOUT.byteOffset(PATH$vkGetInstanceProcAddr);
    public static final long OFFSET$vkGetDeviceProcAddr = LAYOUT.byteOffset(PATH$vkGetDeviceProcAddr);
    public static final long OFFSET$vkGetPhysicalDeviceProperties = LAYOUT.byteOffset(PATH$vkGetPhysicalDeviceProperties);
    public static final long OFFSET$vkGetPhysicalDeviceMemoryProperties = LAYOUT.byteOffset(PATH$vkGetPhysicalDeviceMemoryProperties);
    public static final long OFFSET$vkAllocateMemory = LAYOUT.byteOffset(PATH$vkAllocateMemory);
    public static final long OFFSET$vkFreeMemory = LAYOUT.byteOffset(PATH$vkFreeMemory);
    public static final long OFFSET$vkMapMemory = LAYOUT.byteOffset(PATH$vkMapMemory);
    public static final long OFFSET$vkUnmapMemory = LAYOUT.byteOffset(PATH$vkUnmapMemory);
    public static final long OFFSET$vkFlushMappedMemoryRanges = LAYOUT.byteOffset(PATH$vkFlushMappedMemoryRanges);
    public static final long OFFSET$vkInvalidateMappedMemoryRanges = LAYOUT.byteOffset(PATH$vkInvalidateMappedMemoryRanges);
    public static final long OFFSET$vkBindBufferMemory = LAYOUT.byteOffset(PATH$vkBindBufferMemory);
    public static final long OFFSET$vkBindImageMemory = LAYOUT.byteOffset(PATH$vkBindImageMemory);
    public static final long OFFSET$vkGetBufferMemoryRequirements = LAYOUT.byteOffset(PATH$vkGetBufferMemoryRequirements);
    public static final long OFFSET$vkGetImageMemoryRequirements = LAYOUT.byteOffset(PATH$vkGetImageMemoryRequirements);
    public static final long OFFSET$vkCreateBuffer = LAYOUT.byteOffset(PATH$vkCreateBuffer);
    public static final long OFFSET$vkDestroyBuffer = LAYOUT.byteOffset(PATH$vkDestroyBuffer);
    public static final long OFFSET$vkCreateImage = LAYOUT.byteOffset(PATH$vkCreateImage);
    public static final long OFFSET$vkDestroyImage = LAYOUT.byteOffset(PATH$vkDestroyImage);
    public static final long OFFSET$vkCmdCopyBuffer = LAYOUT.byteOffset(PATH$vkCmdCopyBuffer);
    public static final long OFFSET$vkGetBufferMemoryRequirements2KHR = LAYOUT.byteOffset(PATH$vkGetBufferMemoryRequirements2KHR);
    public static final long OFFSET$vkGetImageMemoryRequirements2KHR = LAYOUT.byteOffset(PATH$vkGetImageMemoryRequirements2KHR);
    public static final long OFFSET$vkBindBufferMemory2KHR = LAYOUT.byteOffset(PATH$vkBindBufferMemory2KHR);
    public static final long OFFSET$vkBindImageMemory2KHR = LAYOUT.byteOffset(PATH$vkBindImageMemory2KHR);
    public static final long OFFSET$vkGetPhysicalDeviceMemoryProperties2KHR = LAYOUT.byteOffset(PATH$vkGetPhysicalDeviceMemoryProperties2KHR);
    public static final long OFFSET$vkGetDeviceBufferMemoryRequirements = LAYOUT.byteOffset(PATH$vkGetDeviceBufferMemoryRequirements);
    public static final long OFFSET$vkGetDeviceImageMemoryRequirements = LAYOUT.byteOffset(PATH$vkGetDeviceImageMemoryRequirements);

    public static final long SIZE$vkGetInstanceProcAddr = LAYOUT$vkGetInstanceProcAddr.byteSize();
    public static final long SIZE$vkGetDeviceProcAddr = LAYOUT$vkGetDeviceProcAddr.byteSize();
    public static final long SIZE$vkGetPhysicalDeviceProperties = LAYOUT$vkGetPhysicalDeviceProperties.byteSize();
    public static final long SIZE$vkGetPhysicalDeviceMemoryProperties = LAYOUT$vkGetPhysicalDeviceMemoryProperties.byteSize();
    public static final long SIZE$vkAllocateMemory = LAYOUT$vkAllocateMemory.byteSize();
    public static final long SIZE$vkFreeMemory = LAYOUT$vkFreeMemory.byteSize();
    public static final long SIZE$vkMapMemory = LAYOUT$vkMapMemory.byteSize();
    public static final long SIZE$vkUnmapMemory = LAYOUT$vkUnmapMemory.byteSize();
    public static final long SIZE$vkFlushMappedMemoryRanges = LAYOUT$vkFlushMappedMemoryRanges.byteSize();
    public static final long SIZE$vkInvalidateMappedMemoryRanges = LAYOUT$vkInvalidateMappedMemoryRanges.byteSize();
    public static final long SIZE$vkBindBufferMemory = LAYOUT$vkBindBufferMemory.byteSize();
    public static final long SIZE$vkBindImageMemory = LAYOUT$vkBindImageMemory.byteSize();
    public static final long SIZE$vkGetBufferMemoryRequirements = LAYOUT$vkGetBufferMemoryRequirements.byteSize();
    public static final long SIZE$vkGetImageMemoryRequirements = LAYOUT$vkGetImageMemoryRequirements.byteSize();
    public static final long SIZE$vkCreateBuffer = LAYOUT$vkCreateBuffer.byteSize();
    public static final long SIZE$vkDestroyBuffer = LAYOUT$vkDestroyBuffer.byteSize();
    public static final long SIZE$vkCreateImage = LAYOUT$vkCreateImage.byteSize();
    public static final long SIZE$vkDestroyImage = LAYOUT$vkDestroyImage.byteSize();
    public static final long SIZE$vkCmdCopyBuffer = LAYOUT$vkCmdCopyBuffer.byteSize();
    public static final long SIZE$vkGetBufferMemoryRequirements2KHR = LAYOUT$vkGetBufferMemoryRequirements2KHR.byteSize();
    public static final long SIZE$vkGetImageMemoryRequirements2KHR = LAYOUT$vkGetImageMemoryRequirements2KHR.byteSize();
    public static final long SIZE$vkBindBufferMemory2KHR = LAYOUT$vkBindBufferMemory2KHR.byteSize();
    public static final long SIZE$vkBindImageMemory2KHR = LAYOUT$vkBindImageMemory2KHR.byteSize();
    public static final long SIZE$vkGetPhysicalDeviceMemoryProperties2KHR = LAYOUT$vkGetPhysicalDeviceMemoryProperties2KHR.byteSize();
    public static final long SIZE$vkGetDeviceBufferMemoryRequirements = LAYOUT$vkGetDeviceBufferMemoryRequirements.byteSize();
    public static final long SIZE$vkGetDeviceImageMemoryRequirements = LAYOUT$vkGetDeviceImageMemoryRequirements.byteSize();
}

