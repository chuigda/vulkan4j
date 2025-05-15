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

/// Represents a pointer to a {@code VkScreenBufferFormatPropertiesQNX} structure in native memory.
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkScreenBufferFormatPropertiesQNX.html">VkScreenBufferFormatPropertiesQNX</a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkScreenBufferFormatPropertiesQNX(@NotNull MemorySegment segment) implements IPointer {
    public VkScreenBufferFormatPropertiesQNX {
        sType(VkStructureType.SCREEN_BUFFER_FORMAT_PROPERTIES_QNX);
    }

    public static VkScreenBufferFormatPropertiesQNX allocate(Arena arena) {
        return new VkScreenBufferFormatPropertiesQNX(arena.allocate(LAYOUT));
    }

    public static VkScreenBufferFormatPropertiesQNX[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkScreenBufferFormatPropertiesQNX[] ret = new VkScreenBufferFormatPropertiesQNX[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkScreenBufferFormatPropertiesQNX(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkScreenBufferFormatPropertiesQNX clone(Arena arena, VkScreenBufferFormatPropertiesQNX src) {
        VkScreenBufferFormatPropertiesQNX ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkScreenBufferFormatPropertiesQNX[] clone(Arena arena, VkScreenBufferFormatPropertiesQNX[] src) {
        VkScreenBufferFormatPropertiesQNX[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_LONG.withName("externalFormat"),
        ValueLayout.JAVA_LONG.withName("screenUsage"),
        ValueLayout.JAVA_INT.withName("formatFeatures"),
        VkComponentMapping.LAYOUT.withName("samplerYcbcrConversionComponents"),
        ValueLayout.JAVA_INT.withName("suggestedYcbcrModel"),
        ValueLayout.JAVA_INT.withName("suggestedYcbcrRange"),
        ValueLayout.JAVA_INT.withName("suggestedXChromaOffset"),
        ValueLayout.JAVA_INT.withName("suggestedYChromaOffset")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$format = PathElement.groupElement("PATH$format");
    public static final PathElement PATH$externalFormat = PathElement.groupElement("PATH$externalFormat");
    public static final PathElement PATH$screenUsage = PathElement.groupElement("PATH$screenUsage");
    public static final PathElement PATH$formatFeatures = PathElement.groupElement("PATH$formatFeatures");
    public static final PathElement PATH$samplerYcbcrConversionComponents = PathElement.groupElement("PATH$samplerYcbcrConversionComponents");
    public static final PathElement PATH$suggestedYcbcrModel = PathElement.groupElement("PATH$suggestedYcbcrModel");
    public static final PathElement PATH$suggestedYcbcrRange = PathElement.groupElement("PATH$suggestedYcbcrRange");
    public static final PathElement PATH$suggestedXChromaOffset = PathElement.groupElement("PATH$suggestedXChromaOffset");
    public static final PathElement PATH$suggestedYChromaOffset = PathElement.groupElement("PATH$suggestedYChromaOffset");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$format = (OfInt) LAYOUT.select(PATH$format);
    public static final OfLong LAYOUT$externalFormat = (OfLong) LAYOUT.select(PATH$externalFormat);
    public static final OfLong LAYOUT$screenUsage = (OfLong) LAYOUT.select(PATH$screenUsage);
    public static final OfInt LAYOUT$formatFeatures = (OfInt) LAYOUT.select(PATH$formatFeatures);
    public static final StructLayout LAYOUT$samplerYcbcrConversionComponents = (StructLayout) LAYOUT.select(PATH$samplerYcbcrConversionComponents);
    public static final OfInt LAYOUT$suggestedYcbcrModel = (OfInt) LAYOUT.select(PATH$suggestedYcbcrModel);
    public static final OfInt LAYOUT$suggestedYcbcrRange = (OfInt) LAYOUT.select(PATH$suggestedYcbcrRange);
    public static final OfInt LAYOUT$suggestedXChromaOffset = (OfInt) LAYOUT.select(PATH$suggestedXChromaOffset);
    public static final OfInt LAYOUT$suggestedYChromaOffset = (OfInt) LAYOUT.select(PATH$suggestedYChromaOffset);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$format = LAYOUT$format.byteSize();
    public static final long SIZE$externalFormat = LAYOUT$externalFormat.byteSize();
    public static final long SIZE$screenUsage = LAYOUT$screenUsage.byteSize();
    public static final long SIZE$formatFeatures = LAYOUT$formatFeatures.byteSize();
    public static final long SIZE$samplerYcbcrConversionComponents = LAYOUT$samplerYcbcrConversionComponents.byteSize();
    public static final long SIZE$suggestedYcbcrModel = LAYOUT$suggestedYcbcrModel.byteSize();
    public static final long SIZE$suggestedYcbcrRange = LAYOUT$suggestedYcbcrRange.byteSize();
    public static final long SIZE$suggestedXChromaOffset = LAYOUT$suggestedXChromaOffset.byteSize();
    public static final long SIZE$suggestedYChromaOffset = LAYOUT$suggestedYChromaOffset.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$format = LAYOUT.byteOffset(PATH$format);
    public static final long OFFSET$externalFormat = LAYOUT.byteOffset(PATH$externalFormat);
    public static final long OFFSET$screenUsage = LAYOUT.byteOffset(PATH$screenUsage);
    public static final long OFFSET$formatFeatures = LAYOUT.byteOffset(PATH$formatFeatures);
    public static final long OFFSET$samplerYcbcrConversionComponents = LAYOUT.byteOffset(PATH$samplerYcbcrConversionComponents);
    public static final long OFFSET$suggestedYcbcrModel = LAYOUT.byteOffset(PATH$suggestedYcbcrModel);
    public static final long OFFSET$suggestedYcbcrRange = LAYOUT.byteOffset(PATH$suggestedYcbcrRange);
    public static final long OFFSET$suggestedXChromaOffset = LAYOUT.byteOffset(PATH$suggestedXChromaOffset);
    public static final long OFFSET$suggestedYChromaOffset = LAYOUT.byteOffset(PATH$suggestedYChromaOffset);

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

    public @unsigned long externalFormat() {
        return segment.get(LAYOUT$externalFormat, OFFSET$externalFormat);
    }

    public void externalFormat(@unsigned long value) {
        segment.set(LAYOUT$externalFormat, OFFSET$externalFormat, value);
    }

    public @unsigned long screenUsage() {
        return segment.get(LAYOUT$screenUsage, OFFSET$screenUsage);
    }

    public void screenUsage(@unsigned long value) {
        segment.set(LAYOUT$screenUsage, OFFSET$screenUsage, value);
    }

    public @enumtype(VkFormatFeatureFlags.class) int formatFeatures() {
        return segment.get(LAYOUT$formatFeatures, OFFSET$formatFeatures);
    }

    public void formatFeatures(@enumtype(VkFormatFeatureFlags.class) int value) {
        segment.set(LAYOUT$formatFeatures, OFFSET$formatFeatures, value);
    }

    public VkComponentMapping samplerYcbcrConversionComponents() {
        return new VkComponentMapping(segment.asSlice(OFFSET$samplerYcbcrConversionComponents, LAYOUT$samplerYcbcrConversionComponents));
    }

    public void samplerYcbcrConversionComponents(VkComponentMapping value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$samplerYcbcrConversionComponents, SIZE$samplerYcbcrConversionComponents);
    }

    public @enumtype(VkSamplerYcbcrModelConversion.class) int suggestedYcbcrModel() {
        return segment.get(LAYOUT$suggestedYcbcrModel, OFFSET$suggestedYcbcrModel);
    }

    public void suggestedYcbcrModel(@enumtype(VkSamplerYcbcrModelConversion.class) int value) {
        segment.set(LAYOUT$suggestedYcbcrModel, OFFSET$suggestedYcbcrModel, value);
    }

    public @enumtype(VkSamplerYcbcrRange.class) int suggestedYcbcrRange() {
        return segment.get(LAYOUT$suggestedYcbcrRange, OFFSET$suggestedYcbcrRange);
    }

    public void suggestedYcbcrRange(@enumtype(VkSamplerYcbcrRange.class) int value) {
        segment.set(LAYOUT$suggestedYcbcrRange, OFFSET$suggestedYcbcrRange, value);
    }

    public @enumtype(VkChromaLocation.class) int suggestedXChromaOffset() {
        return segment.get(LAYOUT$suggestedXChromaOffset, OFFSET$suggestedXChromaOffset);
    }

    public void suggestedXChromaOffset(@enumtype(VkChromaLocation.class) int value) {
        segment.set(LAYOUT$suggestedXChromaOffset, OFFSET$suggestedXChromaOffset, value);
    }

    public @enumtype(VkChromaLocation.class) int suggestedYChromaOffset() {
        return segment.get(LAYOUT$suggestedYChromaOffset, OFFSET$suggestedYChromaOffset);
    }

    public void suggestedYChromaOffset(@enumtype(VkChromaLocation.class) int value) {
        segment.set(LAYOUT$suggestedYChromaOffset, OFFSET$suggestedYChromaOffset, value);
    }

}
