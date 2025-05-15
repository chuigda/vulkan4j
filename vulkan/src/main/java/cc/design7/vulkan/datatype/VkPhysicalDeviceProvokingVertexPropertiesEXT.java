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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkPhysicalDeviceProvokingVertexPropertiesEXT.html">VkPhysicalDeviceProvokingVertexPropertiesEXT</a>
@ValueBasedCandidate
public record VkPhysicalDeviceProvokingVertexPropertiesEXT(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$provokingVertexModePerPipeline = ValueLayout.JAVA_INT.withName("provokingVertexModePerPipeline");
    public static final OfInt LAYOUT$transformFeedbackPreservesTriangleFanProvokingVertex = ValueLayout.JAVA_INT.withName("transformFeedbackPreservesTriangleFanProvokingVertex");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$provokingVertexModePerPipeline, LAYOUT$transformFeedbackPreservesTriangleFanProvokingVertex);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkPhysicalDeviceProvokingVertexPropertiesEXT allocate(Arena arena) {
        return new VkPhysicalDeviceProvokingVertexPropertiesEXT(arena.allocate(LAYOUT));
    }

    public static VkPhysicalDeviceProvokingVertexPropertiesEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPhysicalDeviceProvokingVertexPropertiesEXT[] ret = new VkPhysicalDeviceProvokingVertexPropertiesEXT[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkPhysicalDeviceProvokingVertexPropertiesEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPhysicalDeviceProvokingVertexPropertiesEXT clone(Arena arena, VkPhysicalDeviceProvokingVertexPropertiesEXT src) {
        VkPhysicalDeviceProvokingVertexPropertiesEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPhysicalDeviceProvokingVertexPropertiesEXT[] clone(Arena arena, VkPhysicalDeviceProvokingVertexPropertiesEXT[] src) {
        VkPhysicalDeviceProvokingVertexPropertiesEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$provokingVertexModePerPipeline = PathElement.groupElement("PATH$provokingVertexModePerPipeline");
    public static final PathElement PATH$transformFeedbackPreservesTriangleFanProvokingVertex = PathElement.groupElement("PATH$transformFeedbackPreservesTriangleFanProvokingVertex");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$provokingVertexModePerPipeline = LAYOUT$provokingVertexModePerPipeline.byteSize();
    public static final long SIZE$transformFeedbackPreservesTriangleFanProvokingVertex = LAYOUT$transformFeedbackPreservesTriangleFanProvokingVertex.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$provokingVertexModePerPipeline = LAYOUT.byteOffset(PATH$provokingVertexModePerPipeline);
    public static final long OFFSET$transformFeedbackPreservesTriangleFanProvokingVertex = LAYOUT.byteOffset(PATH$transformFeedbackPreservesTriangleFanProvokingVertex);

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

    public @unsigned int provokingVertexModePerPipeline() {
        return segment.get(LAYOUT$provokingVertexModePerPipeline, OFFSET$provokingVertexModePerPipeline);
    }

    public void provokingVertexModePerPipeline(@unsigned int value) {
        segment.set(LAYOUT$provokingVertexModePerPipeline, OFFSET$provokingVertexModePerPipeline, value);
    }

    public @unsigned int transformFeedbackPreservesTriangleFanProvokingVertex() {
        return segment.get(LAYOUT$transformFeedbackPreservesTriangleFanProvokingVertex, OFFSET$transformFeedbackPreservesTriangleFanProvokingVertex);
    }

    public void transformFeedbackPreservesTriangleFanProvokingVertex(@unsigned int value) {
        segment.set(LAYOUT$transformFeedbackPreservesTriangleFanProvokingVertex, OFFSET$transformFeedbackPreservesTriangleFanProvokingVertex, value);
    }

}
