package tech.icey.vk4j.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import tech.icey.vk4j.IPointer;
import tech.icey.vk4j.annotation.*;
import tech.icey.vk4j.bitmask.*;
import tech.icey.vk4j.buffer.*;
import tech.icey.vk4j.datatype.*;
import tech.icey.vk4j.enumtype.*;
import tech.icey.vk4j.handle.*;
import tech.icey.vk4j.NativeLayout;
import static tech.icey.vk4j.Constants.*;
import static tech.icey.vk4j.enumtype.VkStructureType.*;

/// {@snippet lang=c :
/// typedef struct VkCopyMemoryToAccelerationStructureInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkDeviceOrHostAddressConstKHR src;
///     VkAccelerationStructureKHR dst;
///     VkCopyAccelerationStructureModeKHR mode;
/// } VkCopyMemoryToAccelerationStructureInfoKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkCopyMemoryToAccelerationStructureInfoKHR.html">VkCopyMemoryToAccelerationStructureInfoKHR</a>
public record VkCopyMemoryToAccelerationStructureInfoKHR(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        VkDeviceOrHostAddressConstKHR.LAYOUT.withName("src"),
        ValueLayout.ADDRESS.withName("dst"),
        ValueLayout.JAVA_INT.withName("mode")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$src = PathElement.groupElement("src");
    public static final PathElement PATH$dst = PathElement.groupElement("dst");
    public static final PathElement PATH$mode = PathElement.groupElement("mode");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final UnionLayout LAYOUT$src = (UnionLayout) LAYOUT.select(PATH$src);
    public static final AddressLayout LAYOUT$dst = (AddressLayout) LAYOUT.select(PATH$dst);
    public static final OfInt LAYOUT$mode = (OfInt) LAYOUT.select(PATH$mode);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$src = LAYOUT.byteOffset(PATH$src);
    public static final long OFFSET$dst = LAYOUT.byteOffset(PATH$dst);
    public static final long OFFSET$mode = LAYOUT.byteOffset(PATH$mode);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$src = LAYOUT$src.byteSize();
    public static final long SIZE$dst = LAYOUT$dst.byteSize();
    public static final long SIZE$mode = LAYOUT$mode.byteSize();

    public VkCopyMemoryToAccelerationStructureInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_COPY_MEMORY_TO_ACCELERATION_STRUCTURE_INFO_KHR);
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

    public VkDeviceOrHostAddressConstKHR src() {
        return new VkDeviceOrHostAddressConstKHR(segment.asSlice(OFFSET$src, LAYOUT$src));
    }

    public void src(VkDeviceOrHostAddressConstKHR value) {
        MemorySegment.copy(value.segment(), 0, segment, OFFSET$src, SIZE$src);
    }

    public VkAccelerationStructureKHR dst() {
        return new VkAccelerationStructureKHR(segment.get(LAYOUT$dst, OFFSET$dst));
    }

    public void dst(VkAccelerationStructureKHR value) {
        segment.set(LAYOUT$dst, OFFSET$dst, value.segment());
    }

    public @enumtype(VkCopyAccelerationStructureModeKHR.class) int mode() {
        return segment.get(LAYOUT$mode, OFFSET$mode);
    }

    public void mode(@enumtype(VkCopyAccelerationStructureModeKHR.class) int value) {
        segment.set(LAYOUT$mode, OFFSET$mode, value);
    }

    public static VkCopyMemoryToAccelerationStructureInfoKHR allocate(Arena arena) {
        return new VkCopyMemoryToAccelerationStructureInfoKHR(arena.allocate(LAYOUT));
    }
    
    public static VkCopyMemoryToAccelerationStructureInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCopyMemoryToAccelerationStructureInfoKHR[] ret = new VkCopyMemoryToAccelerationStructureInfoKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkCopyMemoryToAccelerationStructureInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
