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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkMemoryPriorityAllocateInfoEXT.html"><code>VkMemoryPriorityAllocateInfoEXT</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkMemoryPriorityAllocateInfoEXT {
///     VkStructureType sType;
///     void const* pNext; // optional
///     float priority;
/// } VkMemoryPriorityAllocateInfoEXT;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_MEMORY_PRIORITY_ALLOCATE_INFO_EXT`
///
/// The {@link VkMemoryPriorityAllocateInfoEXT#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkMemoryPriorityAllocateInfoEXT#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkMemoryPriorityAllocateInfoEXT.html"><code>VkMemoryPriorityAllocateInfoEXT</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkMemoryPriorityAllocateInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static VkMemoryPriorityAllocateInfoEXT allocate(Arena arena) {
        VkMemoryPriorityAllocateInfoEXT ret = new VkMemoryPriorityAllocateInfoEXT(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.MEMORY_PRIORITY_ALLOCATE_INFO_EXT);
        return ret;
    }

    public static VkMemoryPriorityAllocateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkMemoryPriorityAllocateInfoEXT[] ret = new VkMemoryPriorityAllocateInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkMemoryPriorityAllocateInfoEXT(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.MEMORY_PRIORITY_ALLOCATE_INFO_EXT);
        }
        return ret;
    }

    public static VkMemoryPriorityAllocateInfoEXT clone(Arena arena, VkMemoryPriorityAllocateInfoEXT src) {
        VkMemoryPriorityAllocateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkMemoryPriorityAllocateInfoEXT[] clone(Arena arena, VkMemoryPriorityAllocateInfoEXT[] src) {
        VkMemoryPriorityAllocateInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.MEMORY_PRIORITY_ALLOCATE_INFO_EXT);
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

    public float priority() {
        return segment.get(LAYOUT$priority, OFFSET$priority);
    }

    public void priority(float value) {
        segment.set(LAYOUT$priority, OFFSET$priority, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_FLOAT.withName("priority")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$priority = PathElement.groupElement("PATH$priority");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfFloat LAYOUT$priority = (OfFloat) LAYOUT.select(PATH$priority);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$priority = LAYOUT$priority.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$priority = LAYOUT.byteOffset(PATH$priority);
}
