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

/// @see <a href="https://registry.khronos.org/vulkan/specs/latest/man/html/VkExternalMemoryProperties.html">VkExternalMemoryProperties</a>
@ValueBasedCandidate
public record VkExternalMemoryProperties(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$externalMemoryFeatures = ValueLayout.JAVA_INT.withName("externalMemoryFeatures");
    public static final OfInt LAYOUT$exportFromImportedHandleTypes = ValueLayout.JAVA_INT.withName("exportFromImportedHandleTypes");
    public static final OfInt LAYOUT$compatibleHandleTypes = ValueLayout.JAVA_INT.withName("compatibleHandleTypes");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$externalMemoryFeatures, LAYOUT$exportFromImportedHandleTypes, LAYOUT$compatibleHandleTypes);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkExternalMemoryProperties allocate(Arena arena) {
        return new VkExternalMemoryProperties(arena.allocate(LAYOUT));
    }

    public static VkExternalMemoryProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkExternalMemoryProperties[] ret = new VkExternalMemoryProperties[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkExternalMemoryProperties(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkExternalMemoryProperties clone(Arena arena, VkExternalMemoryProperties src) {
        VkExternalMemoryProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkExternalMemoryProperties[] clone(Arena arena, VkExternalMemoryProperties[] src) {
        VkExternalMemoryProperties[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$externalMemoryFeatures = PathElement.groupElement("PATH$externalMemoryFeatures");
    public static final PathElement PATH$exportFromImportedHandleTypes = PathElement.groupElement("PATH$exportFromImportedHandleTypes");
    public static final PathElement PATH$compatibleHandleTypes = PathElement.groupElement("PATH$compatibleHandleTypes");

    public static final long SIZE$externalMemoryFeatures = LAYOUT$externalMemoryFeatures.byteSize();
    public static final long SIZE$exportFromImportedHandleTypes = LAYOUT$exportFromImportedHandleTypes.byteSize();
    public static final long SIZE$compatibleHandleTypes = LAYOUT$compatibleHandleTypes.byteSize();

    public static final long OFFSET$externalMemoryFeatures = LAYOUT.byteOffset(PATH$externalMemoryFeatures);
    public static final long OFFSET$exportFromImportedHandleTypes = LAYOUT.byteOffset(PATH$exportFromImportedHandleTypes);
    public static final long OFFSET$compatibleHandleTypes = LAYOUT.byteOffset(PATH$compatibleHandleTypes);

    public @enumtype(VkExternalMemoryFeatureFlags.class) int externalMemoryFeatures() {
        return segment.get(LAYOUT$externalMemoryFeatures, OFFSET$externalMemoryFeatures);
    }

    public void externalMemoryFeatures(@enumtype(VkExternalMemoryFeatureFlags.class) int value) {
        segment.set(LAYOUT$externalMemoryFeatures, OFFSET$externalMemoryFeatures, value);
    }

    public @enumtype(VkExternalMemoryHandleTypeFlags.class) int exportFromImportedHandleTypes() {
        return segment.get(LAYOUT$exportFromImportedHandleTypes, OFFSET$exportFromImportedHandleTypes);
    }

    public void exportFromImportedHandleTypes(@enumtype(VkExternalMemoryHandleTypeFlags.class) int value) {
        segment.set(LAYOUT$exportFromImportedHandleTypes, OFFSET$exportFromImportedHandleTypes, value);
    }

    public @enumtype(VkExternalMemoryHandleTypeFlags.class) int compatibleHandleTypes() {
        return segment.get(LAYOUT$compatibleHandleTypes, OFFSET$compatibleHandleTypes);
    }

    public void compatibleHandleTypes(@enumtype(VkExternalMemoryHandleTypeFlags.class) int value) {
        segment.set(LAYOUT$compatibleHandleTypes, OFFSET$compatibleHandleTypes, value);
    }

}
