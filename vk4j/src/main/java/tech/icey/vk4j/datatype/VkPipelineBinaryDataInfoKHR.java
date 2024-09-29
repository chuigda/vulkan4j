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
/// typedef struct VkPipelineBinaryDataInfoKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkPipelineBinaryKHR pipelineBinary;
/// } VkPipelineBinaryDataInfoKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPipelineBinaryDataInfoKHR.html">VkPipelineBinaryDataInfoKHR</a>
public record VkPipelineBinaryDataInfoKHR(MemorySegment segment) implements IPointer {
    public VkPipelineBinaryDataInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_BINARY_DATA_INFO_KHR);
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

    public @nullable VkPipelineBinaryKHR pipelineBinary() {
        MemorySegment s = segment.get(LAYOUT$pipelineBinary, OFFSET$pipelineBinary);
        if (s.address() == 0) {
            return null;
        }
        return new VkPipelineBinaryKHR(s);
    }

    public void pipelineBinary(@nullable VkPipelineBinaryKHR value) {
        segment.set(
            LAYOUT$pipelineBinary,
            OFFSET$pipelineBinary,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public static VkPipelineBinaryDataInfoKHR allocate(Arena arena) {
        return new VkPipelineBinaryDataInfoKHR(arena.allocate(LAYOUT));
    }
    
    public static VkPipelineBinaryDataInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineBinaryDataInfoKHR[] ret = new VkPipelineBinaryDataInfoKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPipelineBinaryDataInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPipelineBinaryDataInfoKHR clone(Arena arena, VkPipelineBinaryDataInfoKHR src) {
        VkPipelineBinaryDataInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineBinaryDataInfoKHR[] clone(Arena arena, VkPipelineBinaryDataInfoKHR[] src) {
        VkPipelineBinaryDataInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pipelineBinary")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pipelineBinary = PathElement.groupElement("pipelineBinary");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pipelineBinary = (AddressLayout) LAYOUT.select(PATH$pipelineBinary);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pipelineBinary = LAYOUT.byteOffset(PATH$pipelineBinary);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pipelineBinary = LAYOUT$pipelineBinary.byteSize();
}
