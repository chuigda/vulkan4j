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

public record VkPhysicalDeviceDescriptorBufferFeaturesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$descriptorBuffer = ValueLayout.JAVA_INT.withName("descriptorBuffer");
    public static final OfInt LAYOUT$descriptorBufferCaptureReplay = ValueLayout.JAVA_INT.withName("descriptorBufferCaptureReplay");
    public static final OfInt LAYOUT$descriptorBufferImageLayoutIgnored = ValueLayout.JAVA_INT.withName("descriptorBufferImageLayoutIgnored");
    public static final OfInt LAYOUT$descriptorBufferPushDescriptors = ValueLayout.JAVA_INT.withName("descriptorBufferPushDescriptors");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$descriptorBuffer, LAYOUT$descriptorBufferCaptureReplay, LAYOUT$descriptorBufferImageLayoutIgnored, LAYOUT$descriptorBufferPushDescriptors);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceDescriptorBufferFeaturesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceDescriptorBufferFeaturesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceDescriptorBufferFeaturesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceDescriptorBufferFeaturesEXT[] ret = new VkPhysicalDeviceDescriptorBufferFeaturesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceDescriptorBufferFeaturesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceDescriptorBufferFeaturesEXT clone(Arena arena, VkPhysicalDeviceDescriptorBufferFeaturesEXT src) {
        VkPhysicalDeviceDescriptorBufferFeaturesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceDescriptorBufferFeaturesEXT[] clone(Arena arena, VkPhysicalDeviceDescriptorBufferFeaturesEXT[] src) {
        VkPhysicalDeviceDescriptorBufferFeaturesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$descriptorBuffer = PathElement.groupElement("PATH$descriptorBuffer");
    public static final PathElement PATH$descriptorBufferCaptureReplay = PathElement.groupElement("PATH$descriptorBufferCaptureReplay");
    public static final PathElement PATH$descriptorBufferImageLayoutIgnored = PathElement.groupElement("PATH$descriptorBufferImageLayoutIgnored");
    public static final PathElement PATH$descriptorBufferPushDescriptors = PathElement.groupElement("PATH$descriptorBufferPushDescriptors");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$descriptorBuffer = LAYOUT$descriptorBuffer.byteSize();
    public static final long SIZE$descriptorBufferCaptureReplay = LAYOUT$descriptorBufferCaptureReplay.byteSize();
    public static final long SIZE$descriptorBufferImageLayoutIgnored = LAYOUT$descriptorBufferImageLayoutIgnored.byteSize();
    public static final long SIZE$descriptorBufferPushDescriptors = LAYOUT$descriptorBufferPushDescriptors.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$descriptorBuffer = LAYOUT.byteOffset(PATH$descriptorBuffer);
    public static final long OFFSET$descriptorBufferCaptureReplay = LAYOUT.byteOffset(PATH$descriptorBufferCaptureReplay);
    public static final long OFFSET$descriptorBufferImageLayoutIgnored = LAYOUT.byteOffset(PATH$descriptorBufferImageLayoutIgnored);
    public static final long OFFSET$descriptorBufferPushDescriptors = LAYOUT.byteOffset(PATH$descriptorBufferPushDescriptors);

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

    public @unsigned int descriptorBuffer() {
        return segment.get(LAYOUT$descriptorBuffer, OFFSET$descriptorBuffer);
    }

    public void descriptorBuffer(@unsigned int value) {
        segment.set(LAYOUT$descriptorBuffer, OFFSET$descriptorBuffer, value);
    }

    public @unsigned int descriptorBufferCaptureReplay() {
        return segment.get(LAYOUT$descriptorBufferCaptureReplay, OFFSET$descriptorBufferCaptureReplay);
    }

    public void descriptorBufferCaptureReplay(@unsigned int value) {
        segment.set(LAYOUT$descriptorBufferCaptureReplay, OFFSET$descriptorBufferCaptureReplay, value);
    }

    public @unsigned int descriptorBufferImageLayoutIgnored() {
        return segment.get(LAYOUT$descriptorBufferImageLayoutIgnored, OFFSET$descriptorBufferImageLayoutIgnored);
    }

    public void descriptorBufferImageLayoutIgnored(@unsigned int value) {
        segment.set(LAYOUT$descriptorBufferImageLayoutIgnored, OFFSET$descriptorBufferImageLayoutIgnored, value);
    }

    public @unsigned int descriptorBufferPushDescriptors() {
        return segment.get(LAYOUT$descriptorBufferPushDescriptors, OFFSET$descriptorBufferPushDescriptors);
    }

    public void descriptorBufferPushDescriptors(@unsigned int value) {
        segment.set(LAYOUT$descriptorBufferPushDescriptors, OFFSET$descriptorBufferPushDescriptors, value);
    }

}
/// dummy, not implemented yet
