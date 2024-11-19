package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.*;
import tech.icey.panama.buffer.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkPipelineRobustnessCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineRobustnessBufferBehaviorEXT storageBuffers;
///     VkPipelineRobustnessBufferBehaviorEXT uniformBuffers;
///     VkPipelineRobustnessBufferBehaviorEXT vertexInputs;
///     VkPipelineRobustnessImageBehaviorEXT images;
/// } VkPipelineRobustnessCreateInfoEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPipelineRobustnessCreateInfoEXT.html">VkPipelineRobustnessCreateInfoEXT</a>
public record VkPipelineRobustnessCreateInfoEXT(MemorySegment segment) implements IPointer {
    public VkPipelineRobustnessCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_ROBUSTNESS_CREATE_INFO_EXT);
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

    public void pNext(@Nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @enumtype(VkPipelineRobustnessBufferBehaviorEXT.class) int storageBuffers() {
        return segment.get(LAYOUT$storageBuffers, OFFSET$storageBuffers);
    }

    public void storageBuffers(@enumtype(VkPipelineRobustnessBufferBehaviorEXT.class) int value) {
        segment.set(LAYOUT$storageBuffers, OFFSET$storageBuffers, value);
    }

    public @enumtype(VkPipelineRobustnessBufferBehaviorEXT.class) int uniformBuffers() {
        return segment.get(LAYOUT$uniformBuffers, OFFSET$uniformBuffers);
    }

    public void uniformBuffers(@enumtype(VkPipelineRobustnessBufferBehaviorEXT.class) int value) {
        segment.set(LAYOUT$uniformBuffers, OFFSET$uniformBuffers, value);
    }

    public @enumtype(VkPipelineRobustnessBufferBehaviorEXT.class) int vertexInputs() {
        return segment.get(LAYOUT$vertexInputs, OFFSET$vertexInputs);
    }

    public void vertexInputs(@enumtype(VkPipelineRobustnessBufferBehaviorEXT.class) int value) {
        segment.set(LAYOUT$vertexInputs, OFFSET$vertexInputs, value);
    }

    public @enumtype(VkPipelineRobustnessImageBehaviorEXT.class) int images() {
        return segment.get(LAYOUT$images, OFFSET$images);
    }

    public void images(@enumtype(VkPipelineRobustnessImageBehaviorEXT.class) int value) {
        segment.set(LAYOUT$images, OFFSET$images, value);
    }

    public static VkPipelineRobustnessCreateInfoEXT allocate(Arena arena) {
        return new VkPipelineRobustnessCreateInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkPipelineRobustnessCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineRobustnessCreateInfoEXT[] ret = new VkPipelineRobustnessCreateInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPipelineRobustnessCreateInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPipelineRobustnessCreateInfoEXT clone(Arena arena, VkPipelineRobustnessCreateInfoEXT src) {
        VkPipelineRobustnessCreateInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineRobustnessCreateInfoEXT[] clone(Arena arena, VkPipelineRobustnessCreateInfoEXT[] src) {
        VkPipelineRobustnessCreateInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("storageBuffers"),
        ValueLayout.JAVA_INT.withName("uniformBuffers"),
        ValueLayout.JAVA_INT.withName("vertexInputs"),
        ValueLayout.JAVA_INT.withName("images")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$storageBuffers = PathElement.groupElement("storageBuffers");
    public static final PathElement PATH$uniformBuffers = PathElement.groupElement("uniformBuffers");
    public static final PathElement PATH$vertexInputs = PathElement.groupElement("vertexInputs");
    public static final PathElement PATH$images = PathElement.groupElement("images");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$storageBuffers = (OfInt) LAYOUT.select(PATH$storageBuffers);
    public static final OfInt LAYOUT$uniformBuffers = (OfInt) LAYOUT.select(PATH$uniformBuffers);
    public static final OfInt LAYOUT$vertexInputs = (OfInt) LAYOUT.select(PATH$vertexInputs);
    public static final OfInt LAYOUT$images = (OfInt) LAYOUT.select(PATH$images);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$storageBuffers = LAYOUT.byteOffset(PATH$storageBuffers);
    public static final long OFFSET$uniformBuffers = LAYOUT.byteOffset(PATH$uniformBuffers);
    public static final long OFFSET$vertexInputs = LAYOUT.byteOffset(PATH$vertexInputs);
    public static final long OFFSET$images = LAYOUT.byteOffset(PATH$images);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$storageBuffers = LAYOUT$storageBuffers.byteSize();
    public static final long SIZE$uniformBuffers = LAYOUT$uniformBuffers.byteSize();
    public static final long SIZE$vertexInputs = LAYOUT$vertexInputs.byteSize();
    public static final long SIZE$images = LAYOUT$images.byteSize();
}
