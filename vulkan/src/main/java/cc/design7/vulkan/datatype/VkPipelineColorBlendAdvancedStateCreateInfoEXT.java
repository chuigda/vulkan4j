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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPipelineColorBlendAdvancedStateCreateInfoEXT.html">VkPipelineColorBlendAdvancedStateCreateInfoEXT</a>
@ValueBasedCandidate
public record VkPipelineColorBlendAdvancedStateCreateInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$srcPremultiplied = ValueLayout.JAVA_INT.withName("srcPremultiplied");
    public static final OfInt LAYOUT$dstPremultiplied = ValueLayout.JAVA_INT.withName("dstPremultiplied");
    public static final OfInt LAYOUT$blendOverlap = ValueLayout.JAVA_INT.withName("blendOverlap");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$srcPremultiplied, LAYOUT$dstPremultiplied, LAYOUT$blendOverlap);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT allocate(Arena arena) {
        return new VkPipelineColorBlendAdvancedStateCreateInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineColorBlendAdvancedStateCreateInfoEXT[] ret = new VkPipelineColorBlendAdvancedStateCreateInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPipelineColorBlendAdvancedStateCreateInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT clone(Arena arena, VkPipelineColorBlendAdvancedStateCreateInfoEXT src) {
        VkPipelineColorBlendAdvancedStateCreateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT[] clone(Arena arena, VkPipelineColorBlendAdvancedStateCreateInfoEXT[] src) {
        VkPipelineColorBlendAdvancedStateCreateInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$srcPremultiplied = PathElement.groupElement("PATH$srcPremultiplied");
    public static final PathElement PATH$dstPremultiplied = PathElement.groupElement("PATH$dstPremultiplied");
    public static final PathElement PATH$blendOverlap = PathElement.groupElement("PATH$blendOverlap");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$srcPremultiplied = LAYOUT$srcPremultiplied.byteSize();
    public static final long SIZE$dstPremultiplied = LAYOUT$dstPremultiplied.byteSize();
    public static final long SIZE$blendOverlap = LAYOUT$blendOverlap.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$srcPremultiplied = LAYOUT.byteOffset(PATH$srcPremultiplied);
    public static final long OFFSET$dstPremultiplied = LAYOUT.byteOffset(PATH$dstPremultiplied);
    public static final long OFFSET$blendOverlap = LAYOUT.byteOffset(PATH$blendOverlap);

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

    public @unsigned int srcPremultiplied() {
        return segment.get(LAYOUT$srcPremultiplied, OFFSET$srcPremultiplied);
    }

    public void srcPremultiplied(@unsigned int value) {
        segment.set(LAYOUT$srcPremultiplied, OFFSET$srcPremultiplied, value);
    }

    public @unsigned int dstPremultiplied() {
        return segment.get(LAYOUT$dstPremultiplied, OFFSET$dstPremultiplied);
    }

    public void dstPremultiplied(@unsigned int value) {
        segment.set(LAYOUT$dstPremultiplied, OFFSET$dstPremultiplied, value);
    }

    public @enumtype(VkBlendOverlapEXT.class) int blendOverlap() {
        return segment.get(LAYOUT$blendOverlap, OFFSET$blendOverlap);
    }

    public void blendOverlap(@enumtype(VkBlendOverlapEXT.class) int value) {
        segment.set(LAYOUT$blendOverlap, OFFSET$blendOverlap, value);
    }

}
