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
/// typedef struct VkPipelineCoverageToColorStateCreateInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipelineCoverageToColorStateCreateFlagsNV flags;
///     VkBool32 coverageToColorEnable;
///     uint32_t coverageToColorLocation;
/// } VkPipelineCoverageToColorStateCreateInfoNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPipelineCoverageToColorStateCreateInfoNV.html">VkPipelineCoverageToColorStateCreateInfoNV</a>
public record VkPipelineCoverageToColorStateCreateInfoNV(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("coverageToColorEnable"),
        ValueLayout.JAVA_INT.withName("coverageToColorLocation")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$coverageToColorEnable = PathElement.groupElement("coverageToColorEnable");
    public static final PathElement PATH$coverageToColorLocation = PathElement.groupElement("coverageToColorLocation");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$coverageToColorEnable = (OfInt) LAYOUT.select(PATH$coverageToColorEnable);
    public static final OfInt LAYOUT$coverageToColorLocation = (OfInt) LAYOUT.select(PATH$coverageToColorLocation);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$coverageToColorEnable = LAYOUT.byteOffset(PATH$coverageToColorEnable);
    public static final long OFFSET$coverageToColorLocation = LAYOUT.byteOffset(PATH$coverageToColorLocation);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$coverageToColorEnable = LAYOUT$coverageToColorEnable.byteSize();
    public static final long SIZE$coverageToColorLocation = LAYOUT$coverageToColorLocation.byteSize();

    public VkPipelineCoverageToColorStateCreateInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_COVERAGE_TO_COLOR_STATE_CREATE_INFO_NV);
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

    public @enumtype(VkPipelineCoverageToColorStateCreateFlagsNV.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkPipelineCoverageToColorStateCreateFlagsNV.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int coverageToColorEnable() {
        return segment.get(LAYOUT$coverageToColorEnable, OFFSET$coverageToColorEnable);
    }

    public void coverageToColorEnable(@unsigned int value) {
        segment.set(LAYOUT$coverageToColorEnable, OFFSET$coverageToColorEnable, value);
    }

    public @unsigned int coverageToColorLocation() {
        return segment.get(LAYOUT$coverageToColorLocation, OFFSET$coverageToColorLocation);
    }

    public void coverageToColorLocation(@unsigned int value) {
        segment.set(LAYOUT$coverageToColorLocation, OFFSET$coverageToColorLocation, value);
    }

    public static VkPipelineCoverageToColorStateCreateInfoNV allocate(Arena arena) {
        return new VkPipelineCoverageToColorStateCreateInfoNV(arena.allocate(LAYOUT));
    }
    
    public static VkPipelineCoverageToColorStateCreateInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineCoverageToColorStateCreateInfoNV[] ret = new VkPipelineCoverageToColorStateCreateInfoNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPipelineCoverageToColorStateCreateInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
