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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSamplerYcbcrConversionCreateInfo.html"><code>VkSamplerYcbcrConversionCreateInfo</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkSamplerYcbcrConversionCreateInfo {
///     VkStructureType sType;
///     void const* pNext; // optional
///     VkFormat format;
///     VkSamplerYcbcrModelConversion ycbcrModel;
///     VkSamplerYcbcrRange ycbcrRange;
///     VkComponentMapping components;
///     VkChromaLocation xChromaOffset;
///     VkChromaLocation yChromaOffset;
///     VkFilter chromaFilter;
///     VkBool32 forceExplicitReconstruction;
/// } VkSamplerYcbcrConversionCreateInfo;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_SAMPLER_YCBCR_CONVERSION_CREATE_INFO`
///
/// The {@link VkSamplerYcbcrConversionCreateInfo#allocate} functions will automatically initialize these fields.
/// Also, you may call {@link VkSamplerYcbcrConversionCreateInfo#autoInit} to initialize these fields manually for
/// non-allocated instances.
///
/// ## Contracts
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkSamplerYcbcrConversionCreateInfo.html"><code>VkSamplerYcbcrConversionCreateInfo</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkSamplerYcbcrConversionCreateInfo(@NotNull MemorySegment segment) implements IPointer {
    public static VkSamplerYcbcrConversionCreateInfo allocate(Arena arena) {
        VkSamplerYcbcrConversionCreateInfo ret = new VkSamplerYcbcrConversionCreateInfo(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.SAMPLER_YCBCR_CONVERSION_CREATE_INFO);
        return ret;
    }

    public static VkSamplerYcbcrConversionCreateInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkSamplerYcbcrConversionCreateInfo[] ret = new VkSamplerYcbcrConversionCreateInfo[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkSamplerYcbcrConversionCreateInfo(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.SAMPLER_YCBCR_CONVERSION_CREATE_INFO);
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
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.SAMPLER_YCBCR_CONVERSION_CREATE_INFO);
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

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
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
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$format = PathElement.groupElement("PATH$format");
    public static final PathElement PATH$ycbcrModel = PathElement.groupElement("PATH$ycbcrModel");
    public static final PathElement PATH$ycbcrRange = PathElement.groupElement("PATH$ycbcrRange");
    public static final PathElement PATH$components = PathElement.groupElement("PATH$components");
    public static final PathElement PATH$xChromaOffset = PathElement.groupElement("PATH$xChromaOffset");
    public static final PathElement PATH$yChromaOffset = PathElement.groupElement("PATH$yChromaOffset");
    public static final PathElement PATH$chromaFilter = PathElement.groupElement("PATH$chromaFilter");
    public static final PathElement PATH$forceExplicitReconstruction = PathElement.groupElement("PATH$forceExplicitReconstruction");

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
}
