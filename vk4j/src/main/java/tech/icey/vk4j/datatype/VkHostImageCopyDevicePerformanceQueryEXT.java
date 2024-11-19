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
/// typedef struct VkHostImageCopyDevicePerformanceQueryEXT {
///     VkStructureType sType;
///     void* pNext;
///     VkBool32 optimalDeviceAccess;
///     VkBool32 identicalMemoryLayout;
/// } VkHostImageCopyDevicePerformanceQueryEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkHostImageCopyDevicePerformanceQueryEXT.html">VkHostImageCopyDevicePerformanceQueryEXT</a>
public record VkHostImageCopyDevicePerformanceQueryEXT(MemorySegment segment) implements IPointer {
    public VkHostImageCopyDevicePerformanceQueryEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_HOST_IMAGE_COPY_DEVICE_PERFORMANCE_QUERY_EXT);
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

    public @unsigned int optimalDeviceAccess() {
        return segment.get(LAYOUT$optimalDeviceAccess, OFFSET$optimalDeviceAccess);
    }

    public void optimalDeviceAccess(@unsigned int value) {
        segment.set(LAYOUT$optimalDeviceAccess, OFFSET$optimalDeviceAccess, value);
    }

    public @unsigned int identicalMemoryLayout() {
        return segment.get(LAYOUT$identicalMemoryLayout, OFFSET$identicalMemoryLayout);
    }

    public void identicalMemoryLayout(@unsigned int value) {
        segment.set(LAYOUT$identicalMemoryLayout, OFFSET$identicalMemoryLayout, value);
    }

    public static VkHostImageCopyDevicePerformanceQueryEXT allocate(Arena arena) {
        return new VkHostImageCopyDevicePerformanceQueryEXT(arena.allocate(LAYOUT));
    }

    public static VkHostImageCopyDevicePerformanceQueryEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkHostImageCopyDevicePerformanceQueryEXT[] ret = new VkHostImageCopyDevicePerformanceQueryEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkHostImageCopyDevicePerformanceQueryEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkHostImageCopyDevicePerformanceQueryEXT clone(Arena arena, VkHostImageCopyDevicePerformanceQueryEXT src) {
        VkHostImageCopyDevicePerformanceQueryEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkHostImageCopyDevicePerformanceQueryEXT[] clone(Arena arena, VkHostImageCopyDevicePerformanceQueryEXT[] src) {
        VkHostImageCopyDevicePerformanceQueryEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("optimalDeviceAccess"),
        ValueLayout.JAVA_INT.withName("identicalMemoryLayout")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$optimalDeviceAccess = PathElement.groupElement("optimalDeviceAccess");
    public static final PathElement PATH$identicalMemoryLayout = PathElement.groupElement("identicalMemoryLayout");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$optimalDeviceAccess = (OfInt) LAYOUT.select(PATH$optimalDeviceAccess);
    public static final OfInt LAYOUT$identicalMemoryLayout = (OfInt) LAYOUT.select(PATH$identicalMemoryLayout);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$optimalDeviceAccess = LAYOUT.byteOffset(PATH$optimalDeviceAccess);
    public static final long OFFSET$identicalMemoryLayout = LAYOUT.byteOffset(PATH$identicalMemoryLayout);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$optimalDeviceAccess = LAYOUT$optimalDeviceAccess.byteSize();
    public static final long SIZE$identicalMemoryLayout = LAYOUT$identicalMemoryLayout.byteSize();
}
