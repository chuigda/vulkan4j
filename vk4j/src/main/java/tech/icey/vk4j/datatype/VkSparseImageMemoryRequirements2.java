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
/// typedef struct VkSparseImageMemoryRequirements2 {
///     VkStructureType sType;
///     void* pNext;
///     VkSparseImageMemoryRequirements memoryRequirements;
/// } VkSparseImageMemoryRequirements2;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkSparseImageMemoryRequirements2.html">VkSparseImageMemoryRequirements2</a>
public record VkSparseImageMemoryRequirements2(MemorySegment segment) implements IPointer {
    public VkSparseImageMemoryRequirements2(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SPARSE_IMAGE_MEMORY_REQUIREMENTS_2);
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

    public VkSparseImageMemoryRequirements memoryRequirements() {
        return new VkSparseImageMemoryRequirements(segment.asSlice(OFFSET$memoryRequirements, LAYOUT$memoryRequirements));
    }

    public void memoryRequirements(VkSparseImageMemoryRequirements value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$memoryRequirements, SIZE$memoryRequirements);
    }

    public static VkSparseImageMemoryRequirements2 allocate(Arena arena) {
        return new VkSparseImageMemoryRequirements2(arena.allocate(LAYOUT));
    }

    public static VkSparseImageMemoryRequirements2[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSparseImageMemoryRequirements2[] ret = new VkSparseImageMemoryRequirements2[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkSparseImageMemoryRequirements2(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSparseImageMemoryRequirements2 clone(Arena arena, VkSparseImageMemoryRequirements2 src) {
        VkSparseImageMemoryRequirements2 ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSparseImageMemoryRequirements2[] clone(Arena arena, VkSparseImageMemoryRequirements2[] src) {
        VkSparseImageMemoryRequirements2[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkSparseImageMemoryRequirements.LAYOUT.withName("memoryRequirements")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$memoryRequirements = PathElement.groupElement("memoryRequirements");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final StructLayout LAYOUT$memoryRequirements = (StructLayout) LAYOUT.select(PATH$memoryRequirements);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$memoryRequirements = LAYOUT.byteOffset(PATH$memoryRequirements);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$memoryRequirements = LAYOUT$memoryRequirements.byteSize();
}
