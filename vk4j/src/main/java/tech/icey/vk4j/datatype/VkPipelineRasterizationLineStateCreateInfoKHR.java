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
/// typedef struct VkPipelineRasterizationLineStateCreateInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkLineRasterizationModeKHR lineRasterizationMode;
///     VkBool32 stippledLineEnable;
///     uint32_t lineStippleFactor;
///     uint16_t lineStipplePattern;
/// } VkPipelineRasterizationLineStateCreateInfoKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPipelineRasterizationLineStateCreateInfoKHR.html">VkPipelineRasterizationLineStateCreateInfoKHR</a>
public record VkPipelineRasterizationLineStateCreateInfoKHR(MemorySegment segment) implements IPointer {
    public VkPipelineRasterizationLineStateCreateInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_RASTERIZATION_LINE_STATE_CREATE_INFO_KHR);
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

    public @enumtype(VkLineRasterizationModeKHR.class) int lineRasterizationMode() {
        return segment.get(LAYOUT$lineRasterizationMode, OFFSET$lineRasterizationMode);
    }

    public void lineRasterizationMode(@enumtype(VkLineRasterizationModeKHR.class) int value) {
        segment.set(LAYOUT$lineRasterizationMode, OFFSET$lineRasterizationMode, value);
    }

    public @unsigned int stippledLineEnable() {
        return segment.get(LAYOUT$stippledLineEnable, OFFSET$stippledLineEnable);
    }

    public void stippledLineEnable(@unsigned int value) {
        segment.set(LAYOUT$stippledLineEnable, OFFSET$stippledLineEnable, value);
    }

    public @unsigned int lineStippleFactor() {
        return segment.get(LAYOUT$lineStippleFactor, OFFSET$lineStippleFactor);
    }

    public void lineStippleFactor(@unsigned int value) {
        segment.set(LAYOUT$lineStippleFactor, OFFSET$lineStippleFactor, value);
    }

    public @unsigned short lineStipplePattern() {
        return segment.get(LAYOUT$lineStipplePattern, OFFSET$lineStipplePattern);
    }

    public void lineStipplePattern(@unsigned short value) {
        segment.set(LAYOUT$lineStipplePattern, OFFSET$lineStipplePattern, value);
    }

    public static VkPipelineRasterizationLineStateCreateInfoKHR allocate(Arena arena) {
        return new VkPipelineRasterizationLineStateCreateInfoKHR(arena.allocate(LAYOUT));
    }
    
    public static VkPipelineRasterizationLineStateCreateInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineRasterizationLineStateCreateInfoKHR[] ret = new VkPipelineRasterizationLineStateCreateInfoKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPipelineRasterizationLineStateCreateInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("lineRasterizationMode"),
        ValueLayout.JAVA_INT.withName("stippledLineEnable"),
        ValueLayout.JAVA_INT.withName("lineStippleFactor"),
        ValueLayout.JAVA_SHORT.withName("lineStipplePattern")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$lineRasterizationMode = PathElement.groupElement("lineRasterizationMode");
    public static final PathElement PATH$stippledLineEnable = PathElement.groupElement("stippledLineEnable");
    public static final PathElement PATH$lineStippleFactor = PathElement.groupElement("lineStippleFactor");
    public static final PathElement PATH$lineStipplePattern = PathElement.groupElement("lineStipplePattern");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$lineRasterizationMode = (OfInt) LAYOUT.select(PATH$lineRasterizationMode);
    public static final OfInt LAYOUT$stippledLineEnable = (OfInt) LAYOUT.select(PATH$stippledLineEnable);
    public static final OfInt LAYOUT$lineStippleFactor = (OfInt) LAYOUT.select(PATH$lineStippleFactor);
    public static final OfShort LAYOUT$lineStipplePattern = (OfShort) LAYOUT.select(PATH$lineStipplePattern);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$lineRasterizationMode = LAYOUT.byteOffset(PATH$lineRasterizationMode);
    public static final long OFFSET$stippledLineEnable = LAYOUT.byteOffset(PATH$stippledLineEnable);
    public static final long OFFSET$lineStippleFactor = LAYOUT.byteOffset(PATH$lineStippleFactor);
    public static final long OFFSET$lineStipplePattern = LAYOUT.byteOffset(PATH$lineStipplePattern);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$lineRasterizationMode = LAYOUT$lineRasterizationMode.byteSize();
    public static final long SIZE$stippledLineEnable = LAYOUT$stippledLineEnable.byteSize();
    public static final long SIZE$lineStippleFactor = LAYOUT$lineStippleFactor.byteSize();
    public static final long SIZE$lineStipplePattern = LAYOUT$lineStipplePattern.byteSize();

}
