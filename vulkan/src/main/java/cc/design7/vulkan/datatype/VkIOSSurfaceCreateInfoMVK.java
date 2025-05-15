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

public record VkIOSSurfaceCreateInfoMVK(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final AddressLayout LAYOUT$pView = ValueLayout.ADDRESS.withName("pView");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$flags, LAYOUT$pView);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkIOSSurfaceCreateInfoMVK allocate(Arena arena) {
        return new VkIOSSurfaceCreateInfoMVK(arena.allocate(LAYOUT));
    }

    public static VkIOSSurfaceCreateInfoMVK[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkIOSSurfaceCreateInfoMVK[] ret = new VkIOSSurfaceCreateInfoMVK[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkIOSSurfaceCreateInfoMVK(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkIOSSurfaceCreateInfoMVK clone(Arena arena, VkIOSSurfaceCreateInfoMVK src) {
        VkIOSSurfaceCreateInfoMVK ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkIOSSurfaceCreateInfoMVK[] clone(Arena arena, VkIOSSurfaceCreateInfoMVK[] src) {
        VkIOSSurfaceCreateInfoMVK[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$pView = PathElement.groupElement("PATH$pView");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$pView = LAYOUT$pView.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$pView = LAYOUT.byteOffset(PATH$pView);

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

}
/// dummy, not implemented yet
