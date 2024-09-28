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
/// typedef struct VkImagePipeSurfaceCreateInfoFUCHSIA {
///     VkStructureType sType;
///     const void* pNext;
///     VkImagePipeSurfaceCreateFlagsFUCHSIA flags;
///     zx_handle_t imagePipeHandle;
/// } VkImagePipeSurfaceCreateInfoFUCHSIA;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkImagePipeSurfaceCreateInfoFUCHSIA.html">VkImagePipeSurfaceCreateInfoFUCHSIA</a>
public record VkImagePipeSurfaceCreateInfoFUCHSIA(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("imagePipeHandle")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$flags = PathElement.groupElement("flags");
    public static final PathElement PATH$imagePipeHandle = PathElement.groupElement("imagePipeHandle");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$flags = (OfInt) LAYOUT.select(PATH$flags);
    public static final OfInt LAYOUT$imagePipeHandle = (OfInt) LAYOUT.select(PATH$imagePipeHandle);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$flags = LAYOUT.byteOffset(PATH$flags);
    public static final long OFFSET$imagePipeHandle = LAYOUT.byteOffset(PATH$imagePipeHandle);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$flags = LAYOUT$flags.byteSize();
    public static final long SIZE$imagePipeHandle = LAYOUT$imagePipeHandle.byteSize();

    public VkImagePipeSurfaceCreateInfoFUCHSIA(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_IMAGEPIPE_SURFACE_CREATE_INFO_FUCHSIA);
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

    public @enumtype(VkImagePipeSurfaceCreateFlagsFUCHSIA.class) int flags() {
        return segment.get(LAYOUT$flags, OFFSET$flags);
    }

    public void flags(@enumtype(VkImagePipeSurfaceCreateFlagsFUCHSIA.class) int value) {
        segment.set(LAYOUT$flags, OFFSET$flags, value);
    }

    public @unsigned int imagePipeHandle() {
        return segment.get(LAYOUT$imagePipeHandle, OFFSET$imagePipeHandle);
    }

    public void imagePipeHandle(@unsigned int value) {
        segment.set(LAYOUT$imagePipeHandle, OFFSET$imagePipeHandle, value);
    }

    public static VkImagePipeSurfaceCreateInfoFUCHSIA allocate(Arena arena) {
        return new VkImagePipeSurfaceCreateInfoFUCHSIA(arena.allocate(LAYOUT));
    }
    
    public static VkImagePipeSurfaceCreateInfoFUCHSIA[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkImagePipeSurfaceCreateInfoFUCHSIA[] ret = new VkImagePipeSurfaceCreateInfoFUCHSIA[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkImagePipeSurfaceCreateInfoFUCHSIA(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
