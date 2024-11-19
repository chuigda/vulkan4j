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
/// typedef struct VkSamplerYcbcrConversionCreateInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkFormat format;
///     VkSamplerYcbcrModelConversion ycbcrModel;
///     VkSamplerYcbcrRange ycbcrRange;
///     VkComponentMapping components;
///     VkChromaLocation xChromaOffset;
///     VkChromaLocation yChromaOffset;
///     VkFilter chromaFilter;
///     VkBool32 forceExplicitReconstruction;
/// } VkSamplerYcbcrConversionCreateInfo;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkSamplerYcbcrConversionCreateInfo.html">VkSamplerYcbcrConversionCreateInfo</a>
public record VkSamplerYcbcrConversionCreateInfo(MemorySegment segment) implements IPointer {
    public VkSamplerYcbcrConversionCreateInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO);
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

    public @enumtype(VkFormat.class) int format() {
        return segment.get(LAYOUT$format, OFFSET$format);
    }

    public void format(@enumtype(VkFormat.class) int value) {
        segment.set(LAYOUT$format, OFFSET$format, value);
    }

    public @enumtype(VkSamplerYcbcrModelConversion.class) int ycbcrModel() {
        return segment.get(LAYOUT$ycbcrModel, OFFSET$ycbcrModel);
    }

    public void ycbcrModel(@enumtype(VkSamplerYcbcrModelConversion.class) int value) {
        segment.set(LAYOUT$ycbcrModel, OFFSET$ycbcrModel, value);
    }

    public @enumtype(VkSamplerYcbcrRange.class) int ycbcrRange() {
        return segment.get(LAYOUT$ycbcrRange, OFFSET$ycbcrRange);
    }

    public void ycbcrRange(@enumtype(VkSamplerYcbcrRange.class) int value) {
        segment.set(LAYOUT$ycbcrRange, OFFSET$ycbcrRange, value);
    }

    public VkComponentMapping components() {
        return new VkComponentMapping(segment.asSlice(OFFSET$components, LAYOUT$components));
    }

    public void components(VkComponentMapping value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$components, SIZE$components);
    }

    public @enumtype(VkChromaLocation.class) int xChromaOffset() {
        return segment.get(LAYOUT$xChromaOffset, OFFSET$xChromaOffset);
    }

    public void xChromaOffset(@enumtype(VkChromaLocation.class) int value) {
        segment.set(LAYOUT$xChromaOffset, OFFSET$xChromaOffset, value);
    }

    public @enumtype(VkChromaLocation.class) int yChromaOffset() {
        return segment.get(LAYOUT$yChromaOffset, OFFSET$yChromaOffset);
    }

    public void yChromaOffset(@enumtype(VkChromaLocation.class) int value) {
        segment.set(LAYOUT$yChromaOffset, OFFSET$yChromaOffset, value);
    }

    public @enumtype(VkFilter.class) int chromaFilter() {
        return segment.get(LAYOUT$chromaFilter, OFFSET$chromaFilter);
    }

    public void chromaFilter(@enumtype(VkFilter.class) int value) {
        segment.set(LAYOUT$chromaFilter, OFFSET$chromaFilter, value);
    }

    public @unsigned int forceExplicitReconstruction() {
        return segment.get(LAYOUT$forceExplicitReconstruction, OFFSET$forceExplicitReconstruction);
    }

    public void forceExplicitReconstruction(@unsigned int value) {
        segment.set(LAYOUT$forceExplicitReconstruction, OFFSET$forceExplicitReconstruction, value);
    }

    public static VkSamplerYcbcrConversionCreateInfo allocate(Arena arena) {
        return new VkSamplerYcbcrConversionCreateInfo(arena.allocate(LAYOUT));
    }

    public static VkSamplerYcbcrConversionCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSamplerYcbcrConversionCreateInfo[] ret = new VkSamplerYcbcrConversionCreateInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkSamplerYcbcrConversionCreateInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkSamplerYcbcrConversionCreateInfo clone(Arena arena, VkSamplerYcbcrConversionCreateInfo src) {
        VkSamplerYcbcrConversionCreateInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkSamplerYcbcrConversionCreateInfo[] clone(Arena arena, VkSamplerYcbcrConversionCreateInfo[] src) {
        VkSamplerYcbcrConversionCreateInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_INT.withName("ycbcrModel"),
        ValueLayout.JAVA_INT.withName("ycbcrRange"),
        VkComponentMapping.LAYOUT.withName("components"),
        ValueLayout.JAVA_INT.withName("xChromaOffset"),
        ValueLayout.JAVA_INT.withName("yChromaOffset"),
        ValueLayout.JAVA_INT.withName("chromaFilter"),
        ValueLayout.JAVA_INT.withName("forceExplicitReconstruction")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$format = PathElement.groupElement("format");
    public static final PathElement PATH$ycbcrModel = PathElement.groupElement("ycbcrModel");
    public static final PathElement PATH$ycbcrRange = PathElement.groupElement("ycbcrRange");
    public static final PathElement PATH$components = PathElement.groupElement("components");
    public static final PathElement PATH$xChromaOffset = PathElement.groupElement("xChromaOffset");
    public static final PathElement PATH$yChromaOffset = PathElement.groupElement("yChromaOffset");
    public static final PathElement PATH$chromaFilter = PathElement.groupElement("chromaFilter");
    public static final PathElement PATH$forceExplicitReconstruction = PathElement.groupElement("forceExplicitReconstruction");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$format = (OfInt) LAYOUT.select(PATH$format);
    public static final OfInt LAYOUT$ycbcrModel = (OfInt) LAYOUT.select(PATH$ycbcrModel);
    public static final OfInt LAYOUT$ycbcrRange = (OfInt) LAYOUT.select(PATH$ycbcrRange);
    public static final StructLayout LAYOUT$components = (StructLayout) LAYOUT.select(PATH$components);
    public static final OfInt LAYOUT$xChromaOffset = (OfInt) LAYOUT.select(PATH$xChromaOffset);
    public static final OfInt LAYOUT$yChromaOffset = (OfInt) LAYOUT.select(PATH$yChromaOffset);
    public static final OfInt LAYOUT$chromaFilter = (OfInt) LAYOUT.select(PATH$chromaFilter);
    public static final OfInt LAYOUT$forceExplicitReconstruction = (OfInt) LAYOUT.select(PATH$forceExplicitReconstruction);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);
    public static final long OFFSET$ycbcrModel = LAYOUT.byteOffset(PATH$ycbcrModel);
    public static final long OFFSET$ycbcrRange = LAYOUT.byteOffset(PATH$ycbcrRange);
    public static final long OFFSET$components = LAYOUT.byteOffset(PATH$components);
    public static final long OFFSET$xChromaOffset = LAYOUT.byteOffset(PATH$xChromaOffset);
    public static final long OFFSET$yChromaOffset = LAYOUT.byteOffset(PATH$yChromaOffset);
    public static final long OFFSET$chromaFilter = LAYOUT.byteOffset(PATH$chromaFilter);
    public static final long OFFSET$forceExplicitReconstruction = LAYOUT.byteOffset(PATH$forceExplicitReconstruction);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$format = LAYOUT$format.byteSize();
    public static final long SIZE$ycbcrModel = LAYOUT$ycbcrModel.byteSize();
    public static final long SIZE$ycbcrRange = LAYOUT$ycbcrRange.byteSize();
    public static final long SIZE$components = LAYOUT$components.byteSize();
    public static final long SIZE$xChromaOffset = LAYOUT$xChromaOffset.byteSize();
    public static final long SIZE$yChromaOffset = LAYOUT$yChromaOffset.byteSize();
    public static final long SIZE$chromaFilter = LAYOUT$chromaFilter.byteSize();
    public static final long SIZE$forceExplicitReconstruction = LAYOUT$forceExplicitReconstruction.byteSize();
}
