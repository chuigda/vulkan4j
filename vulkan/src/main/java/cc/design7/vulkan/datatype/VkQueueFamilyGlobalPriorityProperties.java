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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkQueueFamilyGlobalPriorityProperties.html"><code>VkQueueFamilyGlobalPriorityProperties</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkQueueFamilyGlobalPriorityProperties {
///     VkStructureType sType;
///     void* pNext; // optional
///     uint32_t priorityCount;
///     VkQueueGlobalPriority priorities;
/// } VkQueueFamilyGlobalPriorityProperties;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES`
///
/// The {@link VkQueueFamilyGlobalPriorityProperties#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkQueueFamilyGlobalPriorityProperties#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkQueueFamilyGlobalPriorityProperties.html"><code>VkQueueFamilyGlobalPriorityProperties</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkQueueFamilyGlobalPriorityProperties(@NotNull MemorySegment segment) implements IPointer {
    public static VkQueueFamilyGlobalPriorityProperties allocate(Arena arena) {
        VkQueueFamilyGlobalPriorityProperties ret = new VkQueueFamilyGlobalPriorityProperties(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES);
        return ret;
    }

    public static VkQueueFamilyGlobalPriorityProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkQueueFamilyGlobalPriorityProperties[] ret = new VkQueueFamilyGlobalPriorityProperties[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkQueueFamilyGlobalPriorityProperties(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES);
        }
        return ret;
    }

    public static VkQueueFamilyGlobalPriorityProperties clone(Arena arena, VkQueueFamilyGlobalPriorityProperties src) {
        VkQueueFamilyGlobalPriorityProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkQueueFamilyGlobalPriorityProperties[] clone(Arena arena, VkQueueFamilyGlobalPriorityProperties[] src) {
        VkQueueFamilyGlobalPriorityProperties[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.QUEUE_FAMILY_GLOBAL_PRIORITY_PROPERTIES);
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
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
    }

    public @unsigned int priorityCount() {
        return segment.get(LAYOUT$priorityCount, OFFSET$priorityCount);
    }

    public void priorityCount(@unsigned int value) {
        segment.set(LAYOUT$priorityCount, OFFSET$priorityCount, value);
    }

    public @enumtype(VkQueueGlobalPriority.class) int priorities() {
        return segment.get(LAYOUT$priorities, OFFSET$priorities);
    }

    public void priorities(@enumtype(VkQueueGlobalPriority.class) int value) {
        segment.set(LAYOUT$priorities, OFFSET$priorities, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("priorityCount"),
        ValueLayout.JAVA_INT.withName("priorities")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$priorityCount = PathElement.groupElement("PATH$priorityCount");
    public static final PathElement PATH$priorities = PathElement.groupElement("PATH$priorities");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$priorityCount = (OfInt) LAYOUT.select(PATH$priorityCount);
    public static final OfInt LAYOUT$priorities = (OfInt) LAYOUT.select(PATH$priorities);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$priorityCount = LAYOUT$priorityCount.byteSize();
    public static final long SIZE$priorities = LAYOUT$priorities.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$priorityCount = LAYOUT.byteOffset(PATH$priorityCount);
    public static final long OFFSET$priorities = LAYOUT.byteOffset(PATH$priorities);
}
