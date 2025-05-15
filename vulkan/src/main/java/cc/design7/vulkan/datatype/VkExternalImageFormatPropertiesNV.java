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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkExternalImageFormatPropertiesNV.html">VkExternalImageFormatPropertiesNV</a>
@ValueBasedCandidate
public record VkExternalImageFormatPropertiesNV(@NotNull MemorySegment segment) implements IPointer {
    public static final StructLayout LAYOUT$imageFormatProperties = VkImageFormatProperties.LAYOUT.withName("imageFormatProperties");
    public static final OfInt LAYOUT$externalMemoryFeatures = ValueLayout.JAVA_INT.withName("externalMemoryFeatures");
    public static final OfInt LAYOUT$exportFromImportedHandleTypes = ValueLayout.JAVA_INT.withName("exportFromImportedHandleTypes");
    public static final OfInt LAYOUT$compatibleHandleTypes = ValueLayout.JAVA_INT.withName("compatibleHandleTypes");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$imageFormatProperties, LAYOUT$externalMemoryFeatures, LAYOUT$exportFromImportedHandleTypes, LAYOUT$compatibleHandleTypes);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkExternalImageFormatPropertiesNV allocate(Arena arena) {
        return new VkExternalImageFormatPropertiesNV(arena.allocate(LAYOUT));
    }

    public static VkExternalImageFormatPropertiesNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkExternalImageFormatPropertiesNV[] ret = new VkExternalImageFormatPropertiesNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkExternalImageFormatPropertiesNV(segment.asSlice(i * SIZE, SIZE));
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

    public static final PathElement PATH$imageFormatProperties = PathElement.groupElement("PATH$imageFormatProperties");
    public static final PathElement PATH$externalMemoryFeatures = PathElement.groupElement("PATH$externalMemoryFeatures");
    public static final PathElement PATH$exportFromImportedHandleTypes = PathElement.groupElement("PATH$exportFromImportedHandleTypes");
    public static final PathElement PATH$compatibleHandleTypes = PathElement.groupElement("PATH$compatibleHandleTypes");

    public static final long SIZE$imageFormatProperties = LAYOUT$imageFormatProperties.byteSize();
    public static final long SIZE$externalMemoryFeatures = LAYOUT$externalMemoryFeatures.byteSize();
    public static final long SIZE$exportFromImportedHandleTypes = LAYOUT$exportFromImportedHandleTypes.byteSize();
    public static final long SIZE$compatibleHandleTypes = LAYOUT$compatibleHandleTypes.byteSize();

    public static final long OFFSET$imageFormatProperties = LAYOUT.byteOffset(PATH$imageFormatProperties);
    public static final long OFFSET$externalMemoryFeatures = LAYOUT.byteOffset(PATH$externalMemoryFeatures);
    public static final long OFFSET$exportFromImportedHandleTypes = LAYOUT.byteOffset(PATH$exportFromImportedHandleTypes);
    public static final long OFFSET$compatibleHandleTypes = LAYOUT.byteOffset(PATH$compatibleHandleTypes);

    public VkImageFormatProperties imageFormatProperties() {
        return new VkImageFormatProperties(segment.asSlice(OFFSET$imageFormatProperties, LAYOUT$imageFormatProperties));
    }

    public void imageFormatProperties(VkImageFormatProperties value) {
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

}
