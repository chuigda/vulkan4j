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
/// typedef struct VkPhysicalDeviceShaderClockFeaturesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 shaderSubgroupClock;
///     VkBool32 shaderDeviceClock;
/// } VkPhysicalDeviceShaderClockFeaturesKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceShaderClockFeaturesKHR.html">VkPhysicalDeviceShaderClockFeaturesKHR</a>
public record VkPhysicalDeviceShaderClockFeaturesKHR(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceShaderClockFeaturesKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_SHADER_CLOCK_FEATURES_KHR);
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

    public @unsigned int shaderSubgroupClock() {
        return segment.get(LAYOUT$shaderSubgroupClock, OFFSET$shaderSubgroupClock);
    }

    public void shaderSubgroupClock(@unsigned int value) {
        segment.set(LAYOUT$shaderSubgroupClock, OFFSET$shaderSubgroupClock, value);
    }

    public @unsigned int shaderDeviceClock() {
        return segment.get(LAYOUT$shaderDeviceClock, OFFSET$shaderDeviceClock);
    }

    public void shaderDeviceClock(@unsigned int value) {
        segment.set(LAYOUT$shaderDeviceClock, OFFSET$shaderDeviceClock, value);
    }

    public static VkPhysicalDeviceShaderClockFeaturesKHR allocate(Arena arena) {
        return new VkPhysicalDeviceShaderClockFeaturesKHR(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceShaderClockFeaturesKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceShaderClockFeaturesKHR[] ret = new VkPhysicalDeviceShaderClockFeaturesKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceShaderClockFeaturesKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceShaderClockFeaturesKHR clone(Arena arena, VkPhysicalDeviceShaderClockFeaturesKHR src) {
        VkPhysicalDeviceShaderClockFeaturesKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceShaderClockFeaturesKHR[] clone(Arena arena, VkPhysicalDeviceShaderClockFeaturesKHR[] src) {
        VkPhysicalDeviceShaderClockFeaturesKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("shaderSubgroupClock"),
        ValueLayout.JAVA_INT.withName("shaderDeviceClock")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$shaderSubgroupClock = PathElement.groupElement("shaderSubgroupClock");
    public static final PathElement PATH$shaderDeviceClock = PathElement.groupElement("shaderDeviceClock");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$shaderSubgroupClock = (OfInt) LAYOUT.select(PATH$shaderSubgroupClock);
    public static final OfInt LAYOUT$shaderDeviceClock = (OfInt) LAYOUT.select(PATH$shaderDeviceClock);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$shaderSubgroupClock = LAYOUT.byteOffset(PATH$shaderSubgroupClock);
    public static final long OFFSET$shaderDeviceClock = LAYOUT.byteOffset(PATH$shaderDeviceClock);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$shaderSubgroupClock = LAYOUT$shaderSubgroupClock.byteSize();
    public static final long SIZE$shaderDeviceClock = LAYOUT$shaderDeviceClock.byteSize();
}
