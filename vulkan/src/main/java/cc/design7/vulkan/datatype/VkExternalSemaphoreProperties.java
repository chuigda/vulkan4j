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

public record VkExternalSemaphoreProperties(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$exportFromImportedHandleTypes = ValueLayout.JAVA_INT.withName("exportFromImportedHandleTypes");
    public static final OfInt LAYOUT$compatibleHandleTypes = ValueLayout.JAVA_INT.withName("compatibleHandleTypes");
    public static final OfInt LAYOUT$externalSemaphoreFeatures = ValueLayout.JAVA_INT.withName("externalSemaphoreFeatures");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$exportFromImportedHandleTypes, LAYOUT$compatibleHandleTypes, LAYOUT$externalSemaphoreFeatures);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkExternalSemaphoreProperties allocate(Arena arena) {
        return new VkExternalSemaphoreProperties(arena.allocate(LAYOUT));
    }

    public static VkExternalSemaphoreProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkExternalSemaphoreProperties[] ret = new VkExternalSemaphoreProperties[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkExternalSemaphoreProperties(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkExternalSemaphoreProperties clone(Arena arena, VkExternalSemaphoreProperties src) {
        VkExternalSemaphoreProperties ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkExternalSemaphoreProperties[] clone(Arena arena, VkExternalSemaphoreProperties[] src) {
        VkExternalSemaphoreProperties[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$exportFromImportedHandleTypes = PathElement.groupElement("PATH$exportFromImportedHandleTypes");
    public static final PathElement PATH$compatibleHandleTypes = PathElement.groupElement("PATH$compatibleHandleTypes");
    public static final PathElement PATH$externalSemaphoreFeatures = PathElement.groupElement("PATH$externalSemaphoreFeatures");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$exportFromImportedHandleTypes = LAYOUT$exportFromImportedHandleTypes.byteSize();
    public static final long SIZE$compatibleHandleTypes = LAYOUT$compatibleHandleTypes.byteSize();
    public static final long SIZE$externalSemaphoreFeatures = LAYOUT$externalSemaphoreFeatures.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$exportFromImportedHandleTypes = LAYOUT.byteOffset(PATH$exportFromImportedHandleTypes);
    public static final long OFFSET$compatibleHandleTypes = LAYOUT.byteOffset(PATH$compatibleHandleTypes);
    public static final long OFFSET$externalSemaphoreFeatures = LAYOUT.byteOffset(PATH$externalSemaphoreFeatures);

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

    public @enumtype(VkExternalSemaphoreHandleTypeFlags.class) int exportFromImportedHandleTypes() {
        return segment.get(LAYOUT$exportFromImportedHandleTypes, OFFSET$exportFromImportedHandleTypes);
    }

    public void exportFromImportedHandleTypes(@enumtype(VkExternalSemaphoreHandleTypeFlags.class) int value) {
        segment.set(LAYOUT$exportFromImportedHandleTypes, OFFSET$exportFromImportedHandleTypes, value);
    }

    public @enumtype(VkExternalSemaphoreHandleTypeFlags.class) int compatibleHandleTypes() {
        return segment.get(LAYOUT$compatibleHandleTypes, OFFSET$compatibleHandleTypes);
    }

    public void compatibleHandleTypes(@enumtype(VkExternalSemaphoreHandleTypeFlags.class) int value) {
        segment.set(LAYOUT$compatibleHandleTypes, OFFSET$compatibleHandleTypes, value);
    }

    public @enumtype(VkExternalSemaphoreFeatureFlags.class) int externalSemaphoreFeatures() {
        return segment.get(LAYOUT$externalSemaphoreFeatures, OFFSET$externalSemaphoreFeatures);
    }

    public void externalSemaphoreFeatures(@enumtype(VkExternalSemaphoreFeatureFlags.class) int value) {
        segment.set(LAYOUT$externalSemaphoreFeatures, OFFSET$externalSemaphoreFeatures, value);
    }

}
/// dummy, not implemented yet
