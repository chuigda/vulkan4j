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
/// typedef struct VkDepthBiasRepresentationInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkDepthBiasRepresentationEXT depthBiasRepresentation;
///     VkBool32 depthBiasExact;
/// } VkDepthBiasRepresentationInfoEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDepthBiasRepresentationInfoEXT.html">VkDepthBiasRepresentationInfoEXT</a>
public record VkDepthBiasRepresentationInfoEXT(MemorySegment segment) implements IPointer {
    public VkDepthBiasRepresentationInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DEPTH_BIAS_REPRESENTATION_INFO_EXT);
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

    public static VkDepthBiasRepresentationInfoEXT allocate(Arena arena) {
        return new VkDepthBiasRepresentationInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkDepthBiasRepresentationInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDepthBiasRepresentationInfoEXT[] ret = new VkDepthBiasRepresentationInfoEXT[count];
        for (int i = 0; i < count; i++) {
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("depthBiasRepresentation"),
        ValueLayout.JAVA_INT.withName("depthBiasExact")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$depthBiasRepresentation = PathElement.groupElement("depthBiasRepresentation");
    public static final PathElement PATH$depthBiasExact = PathElement.groupElement("depthBiasExact");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$depthBiasRepresentation = (OfInt) LAYOUT.select(PATH$depthBiasRepresentation);
    public static final OfInt LAYOUT$depthBiasExact = (OfInt) LAYOUT.select(PATH$depthBiasExact);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$depthBiasRepresentation = LAYOUT.byteOffset(PATH$depthBiasRepresentation);
    public static final long OFFSET$depthBiasExact = LAYOUT.byteOffset(PATH$depthBiasExact);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$depthBiasRepresentation = LAYOUT$depthBiasRepresentation.byteSize();
    public static final long SIZE$depthBiasExact = LAYOUT$depthBiasExact.byteSize();
}
