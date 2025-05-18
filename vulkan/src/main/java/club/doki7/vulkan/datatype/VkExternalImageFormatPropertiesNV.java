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

/// Represents a pointer to a <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkExternalImageFormatPropertiesNV.html"><code>VkExternalImageFormatPropertiesNV</code></a> structure in native memory.
///
/// ## Structure
///
/// {@snippet lang=c :
/// typedef struct VkExternalImageFormatPropertiesNV {
///     VkImageFormatProperties imageFormatProperties; // @link substring="VkImageFormatProperties" target="VkImageFormatProperties" @link substring="imageFormatProperties" target="#imageFormatProperties"
///     VkExternalMemoryFeatureFlagsNV externalMemoryFeatures; // optional // @link substring="VkExternalMemoryFeatureFlagsNV" target="VkExternalMemoryFeatureFlagsNV" @link substring="externalMemoryFeatures" target="#externalMemoryFeatures"
///     VkExternalMemoryHandleTypeFlagsNV exportFromImportedHandleTypes; // optional // @link substring="VkExternalMemoryHandleTypeFlagsNV" target="VkExternalMemoryHandleTypeFlagsNV" @link substring="exportFromImportedHandleTypes" target="#exportFromImportedHandleTypes"
///     VkExternalMemoryHandleTypeFlagsNV compatibleHandleTypes; // optional // @link substring="VkExternalMemoryHandleTypeFlagsNV" target="VkExternalMemoryHandleTypeFlagsNV" @link substring="compatibleHandleTypes" target="#compatibleHandleTypes"
/// } VkExternalImageFormatPropertiesNV;
/// }
///
/// ## Contracts
///
/// The property {@link #segment()} should always be not-null
/// (({@code segment != NULL && !segment.equals(MemorySegment.NULL)}), and properly aligned to)
/// {@code LAYOUT.byteAlignment()} bytes. To represent null pointer, you may use a Java
/// {@code null} instead. See the documentation of {@link IPointer#segment()} for more details.
///
/// The constructor of this class is marked as {@link UnsafeConstructor}, because it does not
/// perform any runtime check. The constructor can be useful for automatic code generators.
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkExternalImageFormatPropertiesNV.html"><code>VkExternalImageFormatPropertiesNV</code></a>
@ValueBasedCandidate
@UnsafeConstructor
public record VkExternalImageFormatPropertiesNV(@NotNull MemorySegment segment) implements IPointer {
    public static VkExternalImageFormatPropertiesNV allocate(Arena arena) {
        return new VkExternalImageFormatPropertiesNV(arena.allocate(LAYOUT));
    }

    public static VkExternalImageFormatPropertiesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkExternalImageFormatPropertiesNV[] ret = new VkExternalImageFormatPropertiesNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkExternalImageFormatPropertiesNV(segment.asSlice(i * BYTES, BYTES));
        }
        return ret;
    }

    public static VkExternalImageFormatPropertiesNV clone(Arena arena, VkExternalImageFormatPropertiesNV src) {
        VkExternalImageFormatPropertiesNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkExternalImageFormatPropertiesNV[] clone(Arena arena, VkExternalImageFormatPropertiesNV[] src) {
        VkExternalImageFormatPropertiesNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public @NotNull VkImageFormatProperties imageFormatProperties() {
        return new VkImageFormatProperties(segment.asSlice(OFFSET$imageFormatProperties, LAYOUT$imageFormatProperties));
    }

    public void imageFormatProperties(@NotNull VkImageFormatProperties value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$imageFormatProperties, SIZE$imageFormatProperties);
    }

    public @enumtype(VkExternalMemoryFeatureFlagsNV.class) int externalMemoryFeatures() {
        return segment.get(LAYOUT$externalMemoryFeatures, OFFSET$externalMemoryFeatures);
    }

    public void externalMemoryFeatures(@enumtype(VkExternalMemoryFeatureFlagsNV.class) int value) {
        segment.set(LAYOUT$externalMemoryFeatures, OFFSET$externalMemoryFeatures, value);
    }

    public @enumtype(VkExternalMemoryHandleTypeFlagsNV.class) int exportFromImportedHandleTypes() {
        return segment.get(LAYOUT$exportFromImportedHandleTypes, OFFSET$exportFromImportedHandleTypes);
    }

    public void exportFromImportedHandleTypes(@enumtype(VkExternalMemoryHandleTypeFlagsNV.class) int value) {
        segment.set(LAYOUT$exportFromImportedHandleTypes, OFFSET$exportFromImportedHandleTypes, value);
    }

    public @enumtype(VkExternalMemoryHandleTypeFlagsNV.class) int compatibleHandleTypes() {
        return segment.get(LAYOUT$compatibleHandleTypes, OFFSET$compatibleHandleTypes);
    }

    public void compatibleHandleTypes(@enumtype(VkExternalMemoryHandleTypeFlagsNV.class) int value) {
        segment.set(LAYOUT$compatibleHandleTypes, OFFSET$compatibleHandleTypes, value);
    }

    public static final StructLayout LAYOUT = NativeLayout.structLayout(
        VkImageFormatProperties.LAYOUT.withName("imageFormatProperties"),
        ValueLayout.JAVA_INT.withName("externalMemoryFeatures"),
        ValueLayout.JAVA_INT.withName("exportFromImportedHandleTypes"),
        ValueLayout.JAVA_INT.withName("compatibleHandleTypes")
    );
    public static final long BYTES = LAYOUT.byteSize();

    public static final PathElement PATH$imageFormatProperties = PathElement.groupElement("PATH$imageFormatProperties");
    public static final PathElement PATH$externalMemoryFeatures = PathElement.groupElement("PATH$externalMemoryFeatures");
    public static final PathElement PATH$exportFromImportedHandleTypes = PathElement.groupElement("PATH$exportFromImportedHandleTypes");
    public static final PathElement PATH$compatibleHandleTypes = PathElement.groupElement("PATH$compatibleHandleTypes");

    public static final StructLayout LAYOUT$imageFormatProperties = (StructLayout) LAYOUT.select(PATH$imageFormatProperties);
    public static final OfInt LAYOUT$externalMemoryFeatures = (OfInt) LAYOUT.select(PATH$externalMemoryFeatures);
    public static final OfInt LAYOUT$exportFromImportedHandleTypes = (OfInt) LAYOUT.select(PATH$exportFromImportedHandleTypes);
    public static final OfInt LAYOUT$compatibleHandleTypes = (OfInt) LAYOUT.select(PATH$compatibleHandleTypes);

    public static final long SIZE$imageFormatProperties = LAYOUT$imageFormatProperties.byteSize();
    public static final long SIZE$externalMemoryFeatures = LAYOUT$externalMemoryFeatures.byteSize();
    public static final long SIZE$exportFromImportedHandleTypes = LAYOUT$exportFromImportedHandleTypes.byteSize();
    public static final long SIZE$compatibleHandleTypes = LAYOUT$compatibleHandleTypes.byteSize();

    public static final long OFFSET$imageFormatProperties = LAYOUT.byteOffset(PATH$imageFormatProperties);
    public static final long OFFSET$externalMemoryFeatures = LAYOUT.byteOffset(PATH$externalMemoryFeatures);
    public static final long OFFSET$exportFromImportedHandleTypes = LAYOUT.byteOffset(PATH$exportFromImportedHandleTypes);
    public static final long OFFSET$compatibleHandleTypes = LAYOUT.byteOffset(PATH$compatibleHandleTypes);
}
