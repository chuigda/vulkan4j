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

public record VkAttachmentDescriptionStencilLayout(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$stencilInitialLayout = ValueLayout.JAVA_INT.withName("stencilInitialLayout");
    public static final OfInt LAYOUT$stencilFinalLayout = ValueLayout.JAVA_INT.withName("stencilFinalLayout");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$stencilInitialLayout, LAYOUT$stencilFinalLayout);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkAttachmentDescriptionStencilLayout allocate(Arena arena) {
        return new VkAttachmentDescriptionStencilLayout(arena.allocate(LAYOUT));
    }

    public static VkAttachmentDescriptionStencilLayout[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAttachmentDescriptionStencilLayout[] ret = new VkAttachmentDescriptionStencilLayout[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkAttachmentDescriptionStencilLayout(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkAttachmentDescriptionStencilLayout clone(Arena arena, VkAttachmentDescriptionStencilLayout src) {
        VkAttachmentDescriptionStencilLayout ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAttachmentDescriptionStencilLayout[] clone(Arena arena, VkAttachmentDescriptionStencilLayout[] src) {
        VkAttachmentDescriptionStencilLayout[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$stencilInitialLayout = PathElement.groupElement("PATH$stencilInitialLayout");
    public static final PathElement PATH$stencilFinalLayout = PathElement.groupElement("PATH$stencilFinalLayout");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$stencilInitialLayout = LAYOUT$stencilInitialLayout.byteSize();
    public static final long SIZE$stencilFinalLayout = LAYOUT$stencilFinalLayout.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$stencilInitialLayout = LAYOUT.byteOffset(PATH$stencilInitialLayout);
    public static final long OFFSET$stencilFinalLayout = LAYOUT.byteOffset(PATH$stencilFinalLayout);

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

    public @enumtype(VkImageLayout.class) int stencilInitialLayout() {
        return segment.get(LAYOUT$stencilInitialLayout, OFFSET$stencilInitialLayout);
    }

    public void stencilInitialLayout(@enumtype(VkImageLayout.class) int value) {
        segment.set(LAYOUT$stencilInitialLayout, OFFSET$stencilInitialLayout, value);
    }

    public @enumtype(VkImageLayout.class) int stencilFinalLayout() {
        return segment.get(LAYOUT$stencilFinalLayout, OFFSET$stencilFinalLayout);
    }

    public void stencilFinalLayout(@enumtype(VkImageLayout.class) int value) {
        segment.set(LAYOUT$stencilFinalLayout, OFFSET$stencilFinalLayout, value);
    }

}
/// dummy, not implemented yet
