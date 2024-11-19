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
/// typedef struct VkPhysicalDeviceMemoryBudgetPropertiesEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkDeviceSize heapBudget[VK_MAX_MEMORY_HEAPS];
///     VkDeviceSize heapUsage[VK_MAX_MEMORY_HEAPS];
/// } VkPhysicalDeviceMemoryBudgetPropertiesEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPhysicalDeviceMemoryBudgetPropertiesEXT.html">VkPhysicalDeviceMemoryBudgetPropertiesEXT</a>
public record VkPhysicalDeviceMemoryBudgetPropertiesEXT(MemorySegment segment) implements IPointer {
    public VkPhysicalDeviceMemoryBudgetPropertiesEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_MEMORY_BUDGET_PROPERTIES_EXT);
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

    public MemorySegment heapBudgetRaw() {
        return segment.asSlice(OFFSET$heapBudget, SIZE$heapBudget);
    }

    public @unsigned LongBuffer heapBudget() {
        return new LongBuffer(heapBudgetRaw());
    }

    public void heapBudget(@unsigned LongBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$heapBudget, SIZE$heapBudget);
    }

    public MemorySegment heapUsageRaw() {
        return segment.asSlice(OFFSET$heapUsage, SIZE$heapUsage);
    }

    public @unsigned LongBuffer heapUsage() {
        return new LongBuffer(heapUsageRaw());
    }

    public void heapUsage(@unsigned LongBuffer value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$heapUsage, SIZE$heapUsage);
    }

    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceMemoryBudgetPropertiesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceMemoryBudgetPropertiesEXT[] ret = new VkPhysicalDeviceMemoryBudgetPropertiesEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPhysicalDeviceMemoryBudgetPropertiesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT clone(Arena arena, VkPhysicalDeviceMemoryBudgetPropertiesEXT src) {
        VkPhysicalDeviceMemoryBudgetPropertiesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceMemoryBudgetPropertiesEXT[] clone(Arena arena, VkPhysicalDeviceMemoryBudgetPropertiesEXT[] src) {
        VkPhysicalDeviceMemoryBudgetPropertiesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        MemoryLayout.sequenceLayout(VK_MAX_MEMORY_HEAPS, ValueLayout.JAVA_LONG).withName("heapBudget"),
        MemoryLayout.sequenceLayout(VK_MAX_MEMORY_HEAPS, ValueLayout.JAVA_LONG).withName("heapUsage")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$heapBudget = PathElement.groupElement("heapBudget");
    public static final PathElement PATH$heapUsage = PathElement.groupElement("heapUsage");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final SequenceLayout LAYOUT$heapBudget = (SequenceLayout) LAYOUT.select(PATH$heapBudget);
    public static final SequenceLayout LAYOUT$heapUsage = (SequenceLayout) LAYOUT.select(PATH$heapUsage);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$heapBudget = LAYOUT.byteOffset(PATH$heapBudget);
    public static final long OFFSET$heapUsage = LAYOUT.byteOffset(PATH$heapUsage);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$heapBudget = LAYOUT$heapBudget.byteSize();
    public static final long SIZE$heapUsage = LAYOUT$heapUsage.byteSize();
}
