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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkDisplayPlaneInfo2KHR.html">VkDisplayPlaneInfo2KHR</a>
@ValueBasedCandidate
public record VkDisplayPlaneInfo2KHR(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final AddressLayout LAYOUT$mode = ValueLayout.ADDRESS.withName("mode");
    public static final OfInt LAYOUT$planeIndex = ValueLayout.JAVA_INT.withName("planeIndex");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$mode, LAYOUT$planeIndex);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkDisplayPlaneInfo2KHR allocate(Arena arena) {
        return new VkDisplayPlaneInfo2KHR(arena.allocate(LAYOUT));
    }

    public static VkDisplayPlaneInfo2KHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDisplayPlaneInfo2KHR[] ret = new VkDisplayPlaneInfo2KHR[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDisplayPlaneInfo2KHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDisplayPlaneInfo2KHR clone(Arena arena, VkDisplayPlaneInfo2KHR src) {
        VkDisplayPlaneInfo2KHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDisplayPlaneInfo2KHR[] clone(Arena arena, VkDisplayPlaneInfo2KHR[] src) {
        VkDisplayPlaneInfo2KHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$mode = PathElement.groupElement("PATH$mode");
    public static final PathElement PATH$planeIndex = PathElement.groupElement("PATH$planeIndex");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$mode = LAYOUT$mode.byteSize();
    public static final long SIZE$planeIndex = LAYOUT$planeIndex.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$mode = LAYOUT.byteOffset(PATH$mode);
    public static final long OFFSET$planeIndex = LAYOUT.byteOffset(PATH$planeIndex);

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

    public @Nullable VkDisplayModeKHR mode() {
        MemorySegment s = segment.asSlice(OFFSET$mode, SIZE$mode);
        if (s.address() == 0) {
            return null;
        }
        return new VkDisplayModeKHR(s);
    }

    public void mode() {
        segment.set(LAYOUT$mode, OFFSET$mode, value != null ? value.segment() : MemorySegment.NULL);
    }

    public @unsigned int planeIndex() {
        return segment.get(LAYOUT$planeIndex, OFFSET$planeIndex);
    }

    public void planeIndex(@unsigned int value) {
        segment.set(LAYOUT$planeIndex, OFFSET$planeIndex, value);
    }

}
