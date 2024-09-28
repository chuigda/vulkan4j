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

public record VkIOSSurfaceCreateInfoMVK(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("pView")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$pView = PathElement.groupElement("pView");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$pView = (AddressLayout) LAYOUT.select(PATH$pView);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$pView = LAYOUT.byteOffset(PATH$pView);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$pView = LAYOUT$pView.byteSize();

    public VkIOSSurfaceCreateInfoMVK(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IOS_SURFACE_CREATE_INFO_MVK);
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

    public @enumtype(VkIOSSurfaceCreateFlagsMVK.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkIOSSurfaceCreateFlagsMVK.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @pointer(comment="void*") MemorySegment pView() {
        return segment.get(LAYOUT$pView, OFFSET$pView);
    }

    public void pView(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pView, OFFSET$pView, value);
    }

    public void pView(IPointer pointer) {
        pView(pointer.segment());
    }

    public static VkIOSSurfaceCreateInfoMVK allocate(Arena arena) {
        return new VkIOSSurfaceCreateInfoMVK(arena.allocate(LAYOUT));
    }
    
    public static VkIOSSurfaceCreateInfoMVK[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkIOSSurfaceCreateInfoMVK[] ret = new VkIOSSurfaceCreateInfoMVK[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkIOSSurfaceCreateInfoMVK(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
