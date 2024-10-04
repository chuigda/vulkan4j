package tech.icey.vk4j.datatype;

import tech.icey.panama.IPointer;
import tech.icey.panama.NativeLayout;
import tech.icey.panama.annotation.enumtype;
import tech.icey.panama.annotation.nullable;
import tech.icey.panama.annotation.pointer;
import tech.icey.panama.annotation.unsigned;
import tech.icey.vk4j.enumtype.VkStructureType;
import tech.icey.vk4j.handle.VkPipeline;

import java.lang.foreign.*;

import static java.lang.foreign.ValueLayout.OfInt;
import static java.lang.foreign.ValueLayout.PathElement;
import static tech.icey.vk4j.enumtype.VkStructureType.VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INFO_KHR;

/// {@snippet lang=c :
/// typedef struct VkPipelineExecutableInfoKHR {
///     VkStructureType sType;
///     const void* pNext;
///     VkPipeline pipeline;
///     uint32_t executableIndex;
/// } VkPipelineExecutableInfoKHR;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkPipelineExecutableInfoKHR.html">VkPipelineExecutableInfoKHR</a>
public record VkPipelineExecutableInfoKHR(MemorySegment segment) implements IPointer {
    public VkPipelineExecutableInfoKHR(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_PIPELINE_EXECUTABLE_INFO_KHR);
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

    public void pNext(@nullable IPointer pointer) {
        pNext(pointer == null ? MemorySegment.NULL : pointer.segment());
    }

    public @nullable VkPipeline pipeline() {
        MemorySegment s = segment.get(LAYOUT$pipeline, OFFSET$pipeline);
        if (s.address() == 0) {
            return null;
        }
        return new VkPipeline(s);
    }

    public void pipeline(@nullable VkPipeline value) {
        segment.set(
            LAYOUT$pipeline,
            OFFSET$pipeline,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @unsigned int executableIndex() {
        return segment.get(LAYOUT$executableIndex, OFFSET$executableIndex);
    }

    public void executableIndex(@unsigned int value) {
        segment.set(LAYOUT$executableIndex, OFFSET$executableIndex, value);
    }

    public static VkPipelineExecutableInfoKHR allocate(Arena arena) {
        return new VkPipelineExecutableInfoKHR(arena.allocate(LAYOUT));
    }

    public static VkPipelineExecutableInfoKHR[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkPipelineExecutableInfoKHR[] ret = new VkPipelineExecutableInfoKHR[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkPipelineExecutableInfoKHR(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkPipelineExecutableInfoKHR clone(Arena arena, VkPipelineExecutableInfoKHR src) {
        VkPipelineExecutableInfoKHR ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkPipelineExecutableInfoKHR[] clone(Arena arena, VkPipelineExecutableInfoKHR[] src) {
        VkPipelineExecutableInfoKHR[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("pipeline"),
        ValueLayout.JAVA_INT.withName("executableIndex")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pipeline = PathElement.groupElement("pipeline");
    public static final PathElement PATH$executableIndex = PathElement.groupElement("executableIndex");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pipeline = (AddressLayout) LAYOUT.select(PATH$pipeline);
    public static final OfInt LAYOUT$executableIndex = (OfInt) LAYOUT.select(PATH$executableIndex);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pipeline = LAYOUT.byteOffset(PATH$pipeline);
    public static final long OFFSET$executableIndex = LAYOUT.byteOffset(PATH$executableIndex);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pipeline = LAYOUT$pipeline.byteSize();
    public static final long SIZE$executableIndex = LAYOUT$executableIndex.byteSize();
}
