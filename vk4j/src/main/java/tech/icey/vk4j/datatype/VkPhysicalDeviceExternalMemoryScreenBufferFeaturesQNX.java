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
/// typedef struct VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 screenBufferImport;
/// } VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX.html">VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX</a>
public record VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_MEMORY_SCREEN_BUFFER_FEATURES_QNX);
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

    public @unsigned int screenBufferImport() {
        return segment.get(LAYOUT$screenBufferImport, OFFSET$screenBufferImport);
    }

    public void screenBufferImport(@unsigned int value) {
        segment.set(LAYOUT$screenBufferImport, OFFSET$screenBufferImport, value);
    }

    public static VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX allocate(Arena arena) {
        return new VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX[] ret = new VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX clone(Arena arena, VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX src) {
        VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX[] clone(Arena arena, VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX[] src) {
        VkPhysicalDeviceExternalMemoryScreenBufferFeaturesQNX[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("screenBufferImport")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$screenBufferImport = PathElement.groupElement("screenBufferImport");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$screenBufferImport = (OfInt) LAYOUT.select(PATH$screenBufferImport);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$screenBufferImport = LAYOUT.byteOffset(PATH$screenBufferImport);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$screenBufferImport = LAYOUT$screenBufferImport.byteSize();
}
