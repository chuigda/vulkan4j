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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCommandBufferInheritanceRenderPassTransformInfoQCOM.html">VkCommandBufferInheritanceRenderPassTransformInfoQCOM</a>
@ValueBasedCandidate
public record VkCommandBufferInheritanceRenderPassTransformInfoQCOM(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$transform = ValueLayout.JAVA_INT.withName("transform");
    public static final StructLayout LAYOUT$renderArea = VkRect2D.LAYOUT.withName("renderArea");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$transform, LAYOUT$renderArea);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkCommandBufferInheritanceRenderPassTransformInfoQCOM allocate(Arena arena) {
        return new VkCommandBufferInheritanceRenderPassTransformInfoQCOM(arena.allocate(LAYOUT));
    }

    public static VkCommandBufferInheritanceRenderPassTransformInfoQCOM[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCommandBufferInheritanceRenderPassTransformInfoQCOM[] ret = new VkCommandBufferInheritanceRenderPassTransformInfoQCOM[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkCommandBufferInheritanceRenderPassTransformInfoQCOM(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkCommandBufferInheritanceRenderPassTransformInfoQCOM clone(Arena arena, VkCommandBufferInheritanceRenderPassTransformInfoQCOM src) {
        VkCommandBufferInheritanceRenderPassTransformInfoQCOM ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkCommandBufferInheritanceRenderPassTransformInfoQCOM[] clone(Arena arena, VkCommandBufferInheritanceRenderPassTransformInfoQCOM[] src) {
        VkCommandBufferInheritanceRenderPassTransformInfoQCOM[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$transform = PathElement.groupElement("PATH$transform");
    public static final PathElement PATH$renderArea = PathElement.groupElement("PATH$renderArea");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$transform = LAYOUT$transform.byteSize();
    public static final long SIZE$renderArea = LAYOUT$renderArea.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$transform = LAYOUT.byteOffset(PATH$transform);
    public static final long OFFSET$renderArea = LAYOUT.byteOffset(PATH$renderArea);

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

    public @enumtype(VkSurfaceTransformFlagsKHR.class) int transform() {
        return segment.get(LAYOUT$transform, OFFSET$transform);
    }

    public void transform(@enumtype(VkSurfaceTransformFlagsKHR.class) int value) {
        segment.set(LAYOUT$transform, OFFSET$transform, value);
    }

    public VkRect2D renderArea() {
        return new VkRect2D(segment.asSlice(OFFSET$renderArea, LAYOUT$renderArea));
    }

    public void renderArea(VkRect2D value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$renderArea, SIZE$renderArea);
    }

}
