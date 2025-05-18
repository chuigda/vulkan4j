package club.doki7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import club.doki7.ffm.IPointer;
import club.doki7.ffm.NativeLayout;
import club.doki7.ffm.annotation.*;
import club.doki7.ffm.ptr.*;
import club.doki7.vulkan.bitmask.*;
import club.doki7.vulkan.handle.*;
import club.doki7.vulkan.enumtype.*;
import static club.doki7.vulkan.VkConstants.*;

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAndroidHardwareBufferFormatPropertiesANDROID.html"><code>VkAndroidHardwareBufferFormatPropertiesANDROID</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkAndroidHardwareBufferFormatPropertiesANDROID {
///     VkStructureType sType; // @link substring="VkStructureType" target="VkStructureType" @link substring="sType" target="#sType"
///     void* pNext; // optional // @link substring="pNext" target="#pNext"
///     VkFormat format; // @link substring="VkFormat" target="VkFormat" @link substring="format" target="#format"
///     uint64_t externalFormat; // @link substring="externalFormat" target="#externalFormat"
///     VkFormatFeatureFlags formatFeatures; // @link substring="VkFormatFeatureFlags" target="VkFormatFeatureFlags" @link substring="formatFeatures" target="#formatFeatures"
///     VkComponentMapping samplerYcbcrConversionComponents; // @link substring="VkComponentMapping" target="VkComponentMapping" @link substring="samplerYcbcrConversionComponents" target="#samplerYcbcrConversionComponents"
///     VkSamplerYcbcrModelConversion suggestedYcbcrModel; // @link substring="VkSamplerYcbcrModelConversion" target="VkSamplerYcbcrModelConversion" @link substring="suggestedYcbcrModel" target="#suggestedYcbcrModel"
///     VkSamplerYcbcrRange suggestedYcbcrRange; // @link substring="VkSamplerYcbcrRange" target="VkSamplerYcbcrRange" @link substring="suggestedYcbcrRange" target="#suggestedYcbcrRange"
///     VkChromaLocation suggestedXChromaOffset; // @link substring="VkChromaLocation" target="VkChromaLocation" @link substring="suggestedXChromaOffset" target="#suggestedXChromaOffset"
///     VkChromaLocation suggestedYChromaOffset; // @link substring="VkChromaLocation" target="VkChromaLocation" @link substring="suggestedYChromaOffset" target="#suggestedYChromaOffset"
/// } VkAndroidHardwareBufferFormatPropertiesANDROID;
/// }
///
/// ## Auto initialization
/// This structure has the following members that can be automatically initialized:
/// - `sType = VK_STRUCTURE_TYPE_ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_ANDROID`
///
/// The {@code allocate} ({@link VkAndroidHardwareBufferFormatPropertiesANDROID#allocate(Arena)}, {@link VkAndroidHardwareBufferFormatPropertiesANDROID#allocate(Arena, int)})
/// functions will automatically initialize these fields. Also, you may call {@link VkAndroidHardwareBufferFormatPropertiesANDROID#autoInit}
/// to initialize these fields manually for non-allocated instances.
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkAndroidHardwareBufferFormatPropertiesANDROID.html"><code>VkAndroidHardwareBufferFormatPropertiesANDROID</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkAndroidHardwareBufferFormatPropertiesANDROID(@NotNull MemorySegment segment) implements IPointer {
    public static VkAndroidHardwareBufferFormatPropertiesANDROID allocate(Arena arena) {
        VkAndroidHardwareBufferFormatPropertiesANDROID ret = new VkAndroidHardwareBufferFormatPropertiesANDROID(arena.allocate(LAYOUT));
        ret.sType(VkStructureType.ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_ANDROID);
        return ret;
    }

    public static VkAndroidHardwareBufferFormatPropertiesANDROID[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkAndroidHardwareBufferFormatPropertiesANDROID[] ret = new VkAndroidHardwareBufferFormatPropertiesANDROID[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkAndroidHardwareBufferFormatPropertiesANDROID(segment.asSlice(i * BYTES, BYTES));
            ret[i].sType(VkStructureType.ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_ANDROID);
        }
        return ret;
    }

    public static VkAndroidHardwareBufferFormatPropertiesANDROID clone(Arena arena, VkAndroidHardwareBufferFormatPropertiesANDROID src) {
        VkAndroidHardwareBufferFormatPropertiesANDROID ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkAndroidHardwareBufferFormatPropertiesANDROID[] clone(Arena arena, VkAndroidHardwareBufferFormatPropertiesANDROID[] src) {
        VkAndroidHardwareBufferFormatPropertiesANDROID[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public void autoInit() {
        sType(VkStructureType.ANDROID_HARDWARE_BUFFER_FORMAT_PROPERTIES_ANDROID);
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
        pNext(pointer != null ? pointer.segment() : MemorySegment.NULL);
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

    public @enumtype(VkFormatFeatureFlags.class) int formatFeatures() {
        return segment.get(LAYOUT$formatFeatures, OFFSET$formatFeatures);
    }

    public void formatFeatures(@enumtype(VkFormatFeatureFlags.class) int value) {
        segment.set(LAYOUT$formatFeatures, OFFSET$formatFeatures, value);
    }

    public @NotNull VkComponentMapping samplerYcbcrConversionComponents() {
        return new VkComponentMapping(segment.asSlice(OFFSET$samplerYcbcrConversionComponents, LAYOUT$samplerYcbcrConversionComponents));
    }

    public void samplerYcbcrConversionComponents(@NotNull VkComponentMapping value) {
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

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("format"),
        ValueLayout.JAVA_LONG.withName("externalFormat"),
        ValueLayout.JAVA_INT.withName("formatFeatures"),
        VkComponentMapping.LAYOUT.withName("samplerYcbcrConversionComponents"),
        ValueLayout.JAVA_INT.withName("suggestedYcbcrModel"),
        ValueLayout.JAVA_INT.withName("suggestedYcbcrRange"),
        ValueLayout.JAVA_INT.withName("suggestedXChromaOffset"),
        ValueLayout.JAVA_INT.withName("suggestedYChromaOffset")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$format = PathElement.groupElement("PATH$format");
    public static final PathElement PATH$externalFormat = PathElement.groupElement("PATH$externalFormat");
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
    public static final long OFFSET$formatFeatures = LAYOUT.byteOffset(PATH$formatFeatures);
    public static final long OFFSET$samplerYcbcrConversionComponents = LAYOUT.byteOffset(PATH$samplerYcbcrConversionComponents);
    public static final long OFFSET$suggestedYcbcrModel = LAYOUT.byteOffset(PATH$suggestedYcbcrModel);
    public static final long OFFSET$suggestedYcbcrRange = LAYOUT.byteOffset(PATH$suggestedYcbcrRange);
    public static final long OFFSET$suggestedXChromaOffset = LAYOUT.byteOffset(PATH$suggestedXChromaOffset);
    public static final long OFFSET$suggestedYChromaOffset = LAYOUT.byteOffset(PATH$suggestedYChromaOffset);
}
