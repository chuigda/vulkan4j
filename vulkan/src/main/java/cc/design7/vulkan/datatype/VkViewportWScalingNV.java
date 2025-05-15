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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkViewportWScalingNV.html">VkViewportWScalingNV</a>
@ValueBasedCandidate
public record VkViewportWScalingNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfFloat LAYOUT$xcoeff = ValueLayout.JAVA_FLOAT.withName("xcoeff");
    public static final OfFloat LAYOUT$ycoeff = ValueLayout.JAVA_FLOAT.withName("ycoeff");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$xcoeff, LAYOUT$ycoeff);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkViewportWScalingNV allocate(Arena arena) {
        return new VkViewportWScalingNV(arena.allocate(LAYOUT));
    }

    public static VkViewportWScalingNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkViewportWScalingNV[] ret = new VkViewportWScalingNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkViewportWScalingNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkViewportWScalingNV clone(Arena arena, VkViewportWScalingNV src) {
        VkViewportWScalingNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkViewportWScalingNV[] clone(Arena arena, VkViewportWScalingNV[] src) {
        VkViewportWScalingNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$xcoeff = PathElement.groupElement("PATH$xcoeff");
    public static final PathElement PATH$ycoeff = PathElement.groupElement("PATH$ycoeff");

    public static final long SIZE$xcoeff = LAYOUT$xcoeff.byteSize();
    public static final long SIZE$ycoeff = LAYOUT$ycoeff.byteSize();

    public static final long OFFSET$xcoeff = LAYOUT.byteOffset(PATH$xcoeff);
    public static final long OFFSET$ycoeff = LAYOUT.byteOffset(PATH$ycoeff);

    public float xcoeff() {
        return segment.get(LAYOUT$xcoeff, OFFSET$xcoeff);
    }

    public void xcoeff(float value) {
        segment.set(LAYOUT$xcoeff, OFFSET$xcoeff, value);
    }

    public float ycoeff() {
        return segment.get(LAYOUT$ycoeff, OFFSET$ycoeff);
    }

    public void ycoeff(float value) {
        segment.set(LAYOUT$ycoeff, OFFSET$ycoeff, value);
    }

}
