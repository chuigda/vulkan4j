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

public record VkDepthBiasRepresentationInfoEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$depthBiasRepresentation = ValueLayout.JAVA_INT.withName("depthBiasRepresentation");
    public static final OfInt LAYOUT$depthBiasExact = ValueLayout.JAVA_INT.withName("depthBiasExact");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$depthBiasRepresentation, LAYOUT$depthBiasExact);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkDepthBiasRepresentationInfoEXT allocate(Arena arena) {
        return new VkDepthBiasRepresentationInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkDepthBiasRepresentationInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDepthBiasRepresentationInfoEXT[] ret = new VkDepthBiasRepresentationInfoEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkDepthBiasRepresentationInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkDepthBiasRepresentationInfoEXT clone(Arena arena, VkDepthBiasRepresentationInfoEXT src) {
        VkDepthBiasRepresentationInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkDepthBiasRepresentationInfoEXT[] clone(Arena arena, VkDepthBiasRepresentationInfoEXT[] src) {
        VkDepthBiasRepresentationInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$depthBiasRepresentation = PathElement.groupElement("PATH$depthBiasRepresentation");
    public static final PathElement PATH$depthBiasExact = PathElement.groupElement("PATH$depthBiasExact");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$depthBiasRepresentation = LAYOUT$depthBiasRepresentation.byteSize();
    public static final long SIZE$depthBiasExact = LAYOUT$depthBiasExact.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$depthBiasRepresentation = LAYOUT.byteOffset(PATH$depthBiasRepresentation);
    public static final long OFFSET$depthBiasExact = LAYOUT.byteOffset(PATH$depthBiasExact);

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

    public @enumtype(VkDepthBiasRepresentationEXT.class) int depthBiasRepresentation() {
        return segment.get(LAYOUT$depthBiasRepresentation, OFFSET$depthBiasRepresentation);
    }

    public void depthBiasRepresentation(@enumtype(VkDepthBiasRepresentationEXT.class) int value) {
        segment.set(LAYOUT$depthBiasRepresentation, OFFSET$depthBiasRepresentation, value);
    }

    public @unsigned int depthBiasExact() {
        return segment.get(LAYOUT$depthBiasExact, OFFSET$depthBiasExact);
    }

    public void depthBiasExact(@unsigned int value) {
        segment.set(LAYOUT$depthBiasExact, OFFSET$depthBiasExact, value);
    }

}
/// dummy, not implemented yet
