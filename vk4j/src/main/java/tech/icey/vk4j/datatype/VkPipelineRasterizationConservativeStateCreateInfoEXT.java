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

/// {@snippet lang=c :
/// typedef struct VkPipelineRasterizationConservativeStateCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineRasterizationConservativeStateCreateFlagsEXT flags;
///     VkConservativeRasterizationModeEXT conservativeRasterizationMode;
///     float extraPrimitiveOverestimationSize;
/// } VkPipelineRasterizationConservativeStateCreateInfoEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPipelineRasterizationConservativeStateCreateInfoEXT.html">VkPipelineRasterizationConservativeStateCreateInfoEXT</a>
public record VkPipelineRasterizationConservativeStateCreateInfoEXT(MemorySegment segment) implements IPointer {
    public VkPipelineRasterizationConservativeStateCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_CONSERVATIVE_STATE_CREATE_INFO_EXT);
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

    public @enumtype(VkPipelineRasterizationConservativeStateCreateFlagsEXT.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkPipelineRasterizationConservativeStateCreateFlagsEXT.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @enumtype(VkConservativeRasterizationModeEXT.class) int conservativeRasterizationMode() {
        return segment.get(LAYOUT$conservativeRasterizationMode, OFFSET$conservativeRasterizationMode);
    }

    public void conservativeRasterizationMode(@enumtype(VkConservativeRasterizationModeEXT.class) int value) {
        segment.set(LAYOUT$conservativeRasterizationMode, OFFSET$conservativeRasterizationMode, value);
    }

    public float extraPrimitiveOverestimationSize() {
        return segment.get(LAYOUT$extraPrimitiveOverestimationSize, OFFSET$extraPrimitiveOverestimationSize);
    }

    public void extraPrimitiveOverestimationSize(float value) {
        segment.set(LAYOUT$extraPrimitiveOverestimationSize, OFFSET$extraPrimitiveOverestimationSize, value);
    }

    public static VkPipelineRasterizationConservativeStateCreateInfoEXT allocate(Arena arena) {
        return new VkPipelineRasterizationConservativeStateCreateInfoEXT(arena.allocate(LAYOUT));
    }
    
    public static VkPipelineRasterizationConservativeStateCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineRasterizationConservativeStateCreateInfoEXT[] ret = new VkPipelineRasterizationConservativeStateCreateInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPipelineRasterizationConservativeStateCreateInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("conservativeRasterizationMode"),
        ValueLayout.JAVA_FLOAT.withName("extraPrimitiveOverestimationSize")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$conservativeRasterizationMode = PathElement.groupElement("conservativeRasterizationMode");
    public static final PathElement PATH$extraPrimitiveOverestimationSize = PathElement.groupElement("extraPrimitiveOverestimationSize");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$conservativeRasterizationMode = (OfInt) LAYOUT.select(PATH$conservativeRasterizationMode);
    public static final OfFloat LAYOUT$extraPrimitiveOverestimationSize = (OfFloat) LAYOUT.select(PATH$extraPrimitiveOverestimationSize);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$conservativeRasterizationMode = LAYOUT.byteOffset(PATH$conservativeRasterizationMode);
    public static final long OFFSET$extraPrimitiveOverestimationSize = LAYOUT.byteOffset(PATH$extraPrimitiveOverestimationSize);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$conservativeRasterizationMode = LAYOUT$conservativeRasterizationMode.byteSize();
    public static final long SIZE$extraPrimitiveOverestimationSize = LAYOUT$extraPrimitiveOverestimationSize.byteSize();

}
