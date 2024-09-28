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
/// typedef struct VkDirectDriverLoadingInfoLUNARG {
///     VkStructureType sType;
///     void* pNext;
///     VkDirectDriverLoadingFlagsLUNARG flags;
///     PFN_vkGetInstanceProcAddrLUNARG pfnGetInstanceProcAddr;
/// } VkDirectDriverLoadingInfoLUNARG;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkDirectDriverLoadingInfoLUNARG.html">VkDirectDriverLoadingInfoLUNARG</a>
public record VkDirectDriverLoadingInfoLUNARG(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.ADDRESS.withName("pfnGetInstanceProcAddr")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$pfnGetInstanceProcAddr = PathElement.groupElement("pfnGetInstanceProcAddr");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final AddressLayout LAYOUT$pfnGetInstanceProcAddr = (AddressLayout) LAYOUT.select(PATH$pfnGetInstanceProcAddr);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$pfnGetInstanceProcAddr = LAYOUT.byteOffset(PATH$pfnGetInstanceProcAddr);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$pfnGetInstanceProcAddr = LAYOUT$pfnGetInstanceProcAddr.byteSize();

    public VkDirectDriverLoadingInfoLUNARG(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_DIRECT_DRIVER_LOADING_INFO_LUNARG);
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

    public @enumtype(VkDirectDriverLoadingFlagsLUNARG.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkDirectDriverLoadingFlagsLUNARG.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @pointer(comment="PFN_vkGetInstanceProcAddrLUNARG") MemorySegment pfnGetInstanceProcAddr() {
        return segment.get(LAYOUT$pfnGetInstanceProcAddr, OFFSET$pfnGetInstanceProcAddr);
    }

    public void pfnGetInstanceProcAddr(@pointer(comment="PFN_vkGetInstanceProcAddrLUNARG") MemorySegment value) {
        segment.set(LAYOUT$pfnGetInstanceProcAddr, OFFSET$pfnGetInstanceProcAddr, value);
    }

    public void pfnGetInstanceProcAddr(IPointer pointer) {
        pfnGetInstanceProcAddr(pointer.segment());
    }

    public static VkDirectDriverLoadingInfoLUNARG allocate(Arena arena) {
        return new VkDirectDriverLoadingInfoLUNARG(arena.allocate(LAYOUT));
    }
    
    public static VkDirectDriverLoadingInfoLUNARG[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkDirectDriverLoadingInfoLUNARG[] ret = new VkDirectDriverLoadingInfoLUNARG[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkDirectDriverLoadingInfoLUNARG(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
