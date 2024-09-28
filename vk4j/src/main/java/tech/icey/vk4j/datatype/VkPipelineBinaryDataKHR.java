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
/// typedef struct VkPipelineBinaryDataKHR {
///     size_t dataSize;
///     void* pData;
/// } VkPipelineBinaryDataKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPipelineBinaryDataKHR.html">VkPipelineBinaryDataKHR</a>
public record VkPipelineBinaryDataKHR(MemorySegment segment) implements IPointer {
    public VkPipelineBinaryDataKHR(MemorySegment segment) {
        this.segment = segment;
    }

    public @unsigned long dataSize() {
            return NativeLayout.readCSizeT(segment, OFFSET$dataSize);
        }
    
        public void dataSize(@unsigned long value) {
            NativeLayout.writeCSizeT(segment, OFFSET$dataSize, value);
        }

    public @pointer(comment="void*") MemorySegment pData() {
        return segment.get(LAYOUT$pData, OFFSET$pData);
    }

    public void pData(@pointer(comment="void*") MemorySegment value) {
        segment.set(LAYOUT$pData, OFFSET$pData, value);
    }

    public void pData(IPointer pointer) {
        pData(pointer.segment());
    }

    public static VkPipelineBinaryDataKHR allocate(Arena arena) {
        return new VkPipelineBinaryDataKHR(arena.allocate(LAYOUT));
    }
    
    public static VkPipelineBinaryDataKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineBinaryDataKHR[] ret = new VkPipelineBinaryDataKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPipelineBinaryDataKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        NativeLayout.C_SIZE_T.withName("dataSize"),
        ValueLayout.ADDRESS.withName("pData")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$dataSize = PathElement.groupElement("dataSize");
    public static final PathElement PATH$pData = PathElement.groupElement("pData");

    public static final AddressLayout LAYOUT$pData = (AddressLayout) LAYOUT.select(PATH$pData);

    public static final long OFFSET$dataSize = LAYOUT.byteOffset(PATH$dataSize);
    public static final long OFFSET$pData = LAYOUT.byteOffset(PATH$pData);

    public static final long SIZE$pData = LAYOUT$pData.byteSize();
}
