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

public record VkDirectFBSurfaceCreateInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$flags = ValueLayout.JAVA_INT.withName("flags");
    public static final AddressLayout LAYOUT$dfb = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("dfb");
    public static final AddressLayout LAYOUT$surface = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("surface");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$flags, LAYOUT$dfb, LAYOUT$surface);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkDirectFBSurfaceCreateInfoEXT allocate(Arena arena) {
        return new VkDirectFBSurfaceCreateInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkDirectFBSurfaceCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDirectFBSurfaceCreateInfoEXT[] ret = new VkDirectFBSurfaceCreateInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDirectFBSurfaceCreateInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDirectFBSurfaceCreateInfoEXT clone(Arena arena, VkDirectFBSurfaceCreateInfoEXT src) {
        VkDirectFBSurfaceCreateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDirectFBSurfaceCreateInfoEXT[] clone(Arena arena, VkDirectFBSurfaceCreateInfoEXT[] src) {
        VkDirectFBSurfaceCreateInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("PATH$flags");
    public static final PathElement PATH$dfb = PathElement.groupElement("PATH$dfb");
    public static final PathElement PATH$surface = PathElement.groupElement("PATH$surface");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$dfb = LAYOUT$dfb.byteSize();
    public static final long SIZE$surface = LAYOUT$surface.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$dfb = LAYOUT.byteOffset(PATH$dfb);
    public static final long OFFSET$surface = LAYOUT.byteOffset(PATH$surface);

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

    public @enumtype(VkDirectFBSurfaceCreateFlagsEXT.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkDirectFBSurfaceCreateFlagsEXT.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @pointer(comment="void**") MemorySegment dfbRaw() {
        return segment.get(LAYOUT$dfb, OFFSET$dfb);
    }

    public void dfbRaw(@pointer(comment="void**") MemorySegment value) {
        segment.set(LAYOUT$dfb, OFFSET$dfb, value);
    }

    /// Note: the returned {@link PointerBuffer} does not have correct {@link PointerBuffer#size} property. It's up
    /// to user to track the size of the buffer, and use {@link PointerBuffer#reinterpret} to set the size before
    /// actually reading from or writing to the buffer.
    public @Nullable PointerBuffer dfb() {
        MemorySegment s = dfbRaw();
        if (s.address() == 0) {
            return null;
        }
        return new PointerBuffer(s);
    }

    public void dfb(@Nullable PointerBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        dfbRaw(s);
    }

    public @pointer(comment="void**") MemorySegment surfaceRaw() {
        return segment.get(LAYOUT$surface, OFFSET$surface);
    }

    public void surfaceRaw(@pointer(comment="void**") MemorySegment value) {
        segment.set(LAYOUT$surface, OFFSET$surface, value);
    }

    /// Note: the returned {@link PointerBuffer} does not have correct {@link PointerBuffer#size} property. It's up
    /// to user to track the size of the buffer, and use {@link PointerBuffer#reinterpret} to set the size before
    /// actually reading from or writing to the buffer.
    public @Nullable PointerBuffer surface() {
        MemorySegment s = surfaceRaw();
        if (s.address() == 0) {
            return null;
        }
        return new PointerBuffer(s);
    }

    public void surface(@Nullable PointerBuffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        surfaceRaw(s);
    }

}
/// dummy, not implemented yet
