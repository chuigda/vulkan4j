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
/// typedef struct VkExportMetalBufferInfoEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkDeviceMemory memory;
///     MTLBuffer_id mtlBuffer;
/// } VkExportMetalBufferInfoEXT;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkExportMetalBufferInfoEXT.html">VkExportMetalBufferInfoEXT</a>
public record VkExportMetalBufferInfoEXT(MemorySegment segment) implements IPointer {
    public VkExportMetalBufferInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_EXPORT_METAL_BUFFER_INFO_EXT);
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

    public @Nullable VkDeviceMemory memory() {
        MemorySegment s = segment.get(LAYOUT$memory, OFFSET$memory);
        if (s.address() == 0) {
            return null;
        }
        return new VkDeviceMemory(s);
    }

    public void memory(@Nullable VkDeviceMemory value) {
        segment.set(
            LAYOUT$memory,
            OFFSET$memory,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @pointer(comment="void*") MemorySegment mtlBuffer() {
        return segment.get(LAYOUT$mtlBuffer, OFFSET$mtlBuffer);
    }

    public void mtlBuffer(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$mtlBuffer, OFFSET$mtlBuffer, value);
    }

    public void mtlBuffer(@Nullable IPointer pointer) {
        mtlBuffer(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public static VkExportMetalBufferInfoEXT allocate(Arena arena) {
        return new VkExportMetalBufferInfoEXT(arena.allocate(LAYOUT));
    }

    public static VkExportMetalBufferInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkExportMetalBufferInfoEXT[] ret = new VkExportMetalBufferInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkExportMetalBufferInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkExportMetalBufferInfoEXT clone(Arena arena, VkExportMetalBufferInfoEXT src) {
        VkExportMetalBufferInfoEXT ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkExportMetalBufferInfoEXT[] clone(Arena arena, VkExportMetalBufferInfoEXT[] src) {
        VkExportMetalBufferInfoEXT[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("memory"),
        ValueLayout.ADDRESS.withName("mtlBuffer")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$memory = PathElement.groupElement("memory");
    public static final PathElement PATH$mtlBuffer = PathElement.groupElement("mtlBuffer");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$memory = (AddressLayout) LAYOUT.select(PATH$memory);
    public static final AddressLayout LAYOUT$mtlBuffer = (AddressLayout) LAYOUT.select(PATH$mtlBuffer);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$memory = LAYOUT.byteOffset(PATH$memory);
    public static final long OFFSET$mtlBuffer = LAYOUT.byteOffset(PATH$mtlBuffer);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$memory = LAYOUT$memory.byteSize();
    public static final long SIZE$mtlBuffer = LAYOUT$mtlBuffer.byteSize();
}
