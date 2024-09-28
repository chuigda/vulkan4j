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
/// typedef struct VkPhysicalDeviceVariablePointersFeatures {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 variablePointersStorageBuffer;
///     VkBool32 variablePointers;
/// } VkPhysicalDeviceVariablePointersFeatures;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceVariablePointersFeatures.html">VkPhysicalDeviceVariablePointersFeatures</a>
public record VkPhysicalDeviceVariablePointersFeatures(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("variablePointersStorageBuffer"),
        ValueLayout.JAVA_INT.withName("variablePointers")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$variablePointersStorageBuffer = PathElement.groupElement("variablePointersStorageBuffer");
    public static final PathElement PATH$variablePointers = PathElement.groupElement("variablePointers");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$variablePointersStorageBuffer = (OfInt) LAYOUT.select(PATH$variablePointersStorageBuffer);
    public static final OfInt LAYOUT$variablePointers = (OfInt) LAYOUT.select(PATH$variablePointers);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$variablePointersStorageBuffer = LAYOUT.byteOffset(PATH$variablePointersStorageBuffer);
    public static final long OFFSET$variablePointers = LAYOUT.byteOffset(PATH$variablePointers);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$variablePointersStorageBuffer = LAYOUT$variablePointersStorageBuffer.byteSize();
    public static final long SIZE$variablePointers = LAYOUT$variablePointers.byteSize();

    public VkPhysicalDeviceVariablePointersFeatures(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_VARIABLE_POINTERS_FEATURES);
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

    public @unsigned int variablePointersStorageBuffer() {
        return segment.get(LAYOUT$variablePointersStorageBuffer, OFFSET$variablePointersStorageBuffer);
    }

    public void variablePointersStorageBuffer(@unsigned int value) {
        segment.set(LAYOUT$variablePointersStorageBuffer, OFFSET$variablePointersStorageBuffer, value);
    }

    public @unsigned int variablePointers() {
        return segment.get(LAYOUT$variablePointers, OFFSET$variablePointers);
    }

    public void variablePointers(@unsigned int value) {
        segment.set(LAYOUT$variablePointers, OFFSET$variablePointers, value);
    }

    public static VkPhysicalDeviceVariablePointersFeatures allocate(Arena arena) {
        return new VkPhysicalDeviceVariablePointersFeatures(arena.allocate(LAYOUT));
    }
    
    public static VkPhysicalDeviceVariablePointersFeatures[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceVariablePointersFeatures[] ret = new VkPhysicalDeviceVariablePointersFeatures[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceVariablePointersFeatures(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
