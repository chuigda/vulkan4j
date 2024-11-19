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
/// typedef struct VkPipelineColorBlendAdvancedStateCreateInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkBool32 srcPremultiplied;
///     VkBool32 dstPremultiplied;
///     VkBlendOverlapEXT blendOverlap;
/// } VkPipelineColorBlendAdvancedStateCreateInfoEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPipelineColorBlendAdvancedStateCreateInfoEXT.html">VkPipelineColorBlendAdvancedStateCreateInfoEXT</a>
public record VkPipelineColorBlendAdvancedStateCreateInfoEXT(MemorySegment segment) implements IPointer {
    public VkPipelineColorBlendAdvancedStateCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_COLOR_BLEND_ADVANCED_STATE_CREATE_INFO_EXT);
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

    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT allocate(Arena arena) {
        return new VkPipelineColorBlendAdvancedStateCreateInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkPipelineColorBlendAdvancedStateCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineColorBlendAdvancedStateCreateInfoEXT[] ret = new VkPipelineColorBlendAdvancedStateCreateInfoEXT[count];
        for (int i = 0; i < count; i++) {
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("srcPremultiplied"),
        ValueLayout.JAVA_INT.withName("dstPremultiplied"),
        ValueLayout.JAVA_INT.withName("blendOverlap")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$srcPremultiplied = PathElement.groupElement("srcPremultiplied");
    public static final PathElement PATH$dstPremultiplied = PathElement.groupElement("dstPremultiplied");
    public static final PathElement PATH$blendOverlap = PathElement.groupElement("blendOverlap");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$srcPremultiplied = (OfInt) LAYOUT.select(PATH$srcPremultiplied);
    public static final OfInt LAYOUT$dstPremultiplied = (OfInt) LAYOUT.select(PATH$dstPremultiplied);
    public static final OfInt LAYOUT$blendOverlap = (OfInt) LAYOUT.select(PATH$blendOverlap);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$srcPremultiplied = LAYOUT.byteOffset(PATH$srcPremultiplied);
    public static final long OFFSET$dstPremultiplied = LAYOUT.byteOffset(PATH$dstPremultiplied);
    public static final long OFFSET$blendOverlap = LAYOUT.byteOffset(PATH$blendOverlap);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$srcPremultiplied = LAYOUT$srcPremultiplied.byteSize();
    public static final long SIZE$dstPremultiplied = LAYOUT$dstPremultiplied.byteSize();
    public static final long SIZE$blendOverlap = LAYOUT$blendOverlap.byteSize();
}
