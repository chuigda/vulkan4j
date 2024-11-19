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
/// typedef struct VkExternalSemaphoreProperties {
///     VkStructureType sType;
///     void* pNext;
///     VkExternalSemaphoreHandleTypeFlags exportFromImportedHandleTypes;
///     VkExternalSemaphoreHandleTypeFlags compatibleHandleTypes;
///     VkExternalSemaphoreFeatureFlags externalSemaphoreFeatures;
/// } VkExternalSemaphoreProperties;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkExternalSemaphoreProperties.html">VkExternalSemaphoreProperties</a>
public record VkExternalSemaphoreProperties(MemorySegment segment) implements IPointer {
    public VkExternalSemaphoreProperties(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_EXTERNAL_SEMAPHORE_PROPERTIES);
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

    public static VkExternalSemaphoreProperties allocate(Arena arena) {
        return new VkExternalSemaphoreProperties(arena.allocate(LAYOUT));
    }

    public static VkExternalSemaphoreProperties[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkExternalSemaphoreProperties[] ret = new VkExternalSemaphoreProperties[count];
        for (int i = 0; i < count; i++) {
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
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("exportFromImportedHandleTypes"),
        ValueLayout.JAVA_INT.withName("compatibleHandleTypes"),
        ValueLayout.JAVA_INT.withName("externalSemaphoreFeatures")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$exportFromImportedHandleTypes = PathElement.groupElement("exportFromImportedHandleTypes");
    public static final PathElement PATH$compatibleHandleTypes = PathElement.groupElement("compatibleHandleTypes");
    public static final PathElement PATH$externalSemaphoreFeatures = PathElement.groupElement("externalSemaphoreFeatures");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$exportFromImportedHandleTypes = (OfInt) LAYOUT.select(PATH$exportFromImportedHandleTypes);
    public static final OfInt LAYOUT$compatibleHandleTypes = (OfInt) LAYOUT.select(PATH$compatibleHandleTypes);
    public static final OfInt LAYOUT$externalSemaphoreFeatures = (OfInt) LAYOUT.select(PATH$externalSemaphoreFeatures);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$exportFromImportedHandleTypes = LAYOUT.byteOffset(PATH$exportFromImportedHandleTypes);
    public static final long OFFSET$compatibleHandleTypes = LAYOUT.byteOffset(PATH$compatibleHandleTypes);
    public static final long OFFSET$externalSemaphoreFeatures = LAYOUT.byteOffset(PATH$externalSemaphoreFeatures);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$exportFromImportedHandleTypes = LAYOUT$exportFromImportedHandleTypes.byteSize();
    public static final long SIZE$compatibleHandleTypes = LAYOUT$compatibleHandleTypes.byteSize();
    public static final long SIZE$externalSemaphoreFeatures = LAYOUT$externalSemaphoreFeatures.byteSize();
}
