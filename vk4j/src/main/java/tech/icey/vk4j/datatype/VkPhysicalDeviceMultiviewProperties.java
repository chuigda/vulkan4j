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
/// typedef struct VkPhysicalDeviceMultiviewProperties {
///     VkStructureType sType;
///     void* pNext;
///     uint32_t maxMultiviewViewCount;
///     uint32_t maxMultiviewInstanceIndex;
/// } VkPhysicalDeviceMultiviewProperties;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceMultiviewProperties.html">VkPhysicalDeviceMultiviewProperties</a>
public record VkPhysicalDeviceMultiviewProperties(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceMultiviewProperties(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MULTIVIEW_PROPERTIES);
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

    public @unsigned int maxMultiviewViewCount() {
        return segment.get(LAYOUT$maxMultiviewViewCount, OFFSET$maxMultiviewViewCount);
    }

    public void maxMultiviewViewCount(@unsigned int value) {
        segment.set(LAYOUT$maxMultiviewViewCount, OFFSET$maxMultiviewViewCount, value);
    }

    public @unsigned int maxMultiviewInstanceIndex() {
        return segment.get(LAYOUT$maxMultiviewInstanceIndex, OFFSET$maxMultiviewInstanceIndex);
    }

    public void maxMultiviewInstanceIndex(@unsigned int value) {
        segment.set(LAYOUT$maxMultiviewInstanceIndex, OFFSET$maxMultiviewInstanceIndex, value);
    }

    public static VkPhysicalDeviceMultiviewProperties allocate(Arena arena) {
        return new VkPhysicalDeviceMultiviewProperties(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceMultiviewProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceMultiviewProperties[] ret = new VkPhysicalDeviceMultiviewProperties[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceMultiviewProperties(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceMultiviewProperties clone(Arena arena, VkPhysicalDeviceMultiviewProperties src) {
        VkPhysicalDeviceMultiviewProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceMultiviewProperties[] clone(Arena arena, VkPhysicalDeviceMultiviewProperties[] src) {
        VkPhysicalDeviceMultiviewProperties[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("maxMultiviewViewCount"),
        ValueLayout.JAVA_INT.withName("maxMultiviewInstanceIndex")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$maxMultiviewViewCount = PathElement.groupElement("maxMultiviewViewCount");
    public static final PathElement PATH$maxMultiviewInstanceIndex = PathElement.groupElement("maxMultiviewInstanceIndex");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$maxMultiviewViewCount = (OfInt) LAYOUT.select(PATH$maxMultiviewViewCount);
    public static final OfInt LAYOUT$maxMultiviewInstanceIndex = (OfInt) LAYOUT.select(PATH$maxMultiviewInstanceIndex);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$maxMultiviewViewCount = LAYOUT.byteOffset(PATH$maxMultiviewViewCount);
    public static final long OFFSET$maxMultiviewInstanceIndex = LAYOUT.byteOffset(PATH$maxMultiviewInstanceIndex);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$maxMultiviewViewCount = LAYOUT$maxMultiviewViewCount.byteSize();
    public static final long SIZE$maxMultiviewInstanceIndex = LAYOUT$maxMultiviewInstanceIndex.byteSize();
}
