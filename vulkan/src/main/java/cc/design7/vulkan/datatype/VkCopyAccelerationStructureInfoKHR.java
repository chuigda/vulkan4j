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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkCopyAccelerationStructureInfoKHR.html">VkCopyAccelerationStructureInfoKHR</a>
@ValueBasedCandidate
public record VkCopyAccelerationStructureInfoKHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final AddressLayout LAYOUT$src = ValueLayout.ADDRESS.withName("src");
    public static final AddressLayout LAYOUT$dst = ValueLayout.ADDRESS.withName("dst");
    public static final OfInt LAYOUT$mode = ValueLayout.JAVA_INT.withName("mode");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$src, LAYOUT$dst, LAYOUT$mode);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkCopyAccelerationStructureInfoKHR allocate(Arena arena) {
        return new VkCopyAccelerationStructureInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkCopyAccelerationStructureInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCopyAccelerationStructureInfoKHR[] ret = new VkCopyAccelerationStructureInfoKHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkCopyAccelerationStructureInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkCopyAccelerationStructureInfoKHR clone(Arena arena, VkCopyAccelerationStructureInfoKHR src) {
        VkCopyAccelerationStructureInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkCopyAccelerationStructureInfoKHR[] clone(Arena arena, VkCopyAccelerationStructureInfoKHR[] src) {
        VkCopyAccelerationStructureInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$src = PathElement.groupElement("PATH$src");
    public static final PathElement PATH$dst = PathElement.groupElement("PATH$dst");
    public static final PathElement PATH$mode = PathElement.groupElement("PATH$mode");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$src = LAYOUT$src.byteSize();
    public static final long SIZE$dst = LAYOUT$dst.byteSize();
    public static final long SIZE$mode = LAYOUT$mode.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$src = LAYOUT.byteOffset(PATH$src);
    public static final long OFFSET$dst = LAYOUT.byteOffset(PATH$dst);
    public static final long OFFSET$mode = LAYOUT.byteOffset(PATH$mode);

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

    public @Nullable VkAccelerationStructureKHR src() {
        MemorySegment s = segment.asSlice(OFFSET$src, SIZE$src);
        if (s.address() == 0) {
            return null;
        }
        return new VkAccelerationStructureKHR(s);
    }

    public void src() {
        segment.set(LAYOUT$src, OFFSET$src, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @Nullable VkAccelerationStructureKHR dst() {
        MemorySegment s = segment.asSlice(OFFSET$dst, SIZE$dst);
        if (s.address() == 0) {
            return null;
        }
        return new VkAccelerationStructureKHR(s);
    }

    public void dst() {
        segment.set(LAYOUT$dst, OFFSET$dst, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @enumtype(VkCopyAccelerationStructureModeKHR.class) int mode() {
        return segment.get(LAYOUT$mode, OFFSET$mode);
    }

    public void mode(@enumtype(VkCopyAccelerationStructureModeKHR.class) int value) {
        segment.set(LAYOUT$mode, OFFSET$mode, value);
    }

}
