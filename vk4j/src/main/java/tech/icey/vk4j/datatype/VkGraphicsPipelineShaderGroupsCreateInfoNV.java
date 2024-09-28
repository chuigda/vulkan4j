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
/// typedef struct VkGraphicsPipelineShaderGroupsCreateInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     uint32_t groupCount;
///     const VkGraphicsShaderGroupCreateInfoNV* pGroups;
///     uint32_t pipelineCount;
///     const VkPipeline* pPipelines;
/// } VkGraphicsPipelineShaderGroupsCreateInfoNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkGraphicsPipelineShaderGroupsCreateInfoNV.html">VkGraphicsPipelineShaderGroupsCreateInfoNV</a>
public record VkGraphicsPipelineShaderGroupsCreateInfoNV(MemorySegment segment) implements IPointer {
    public VkGraphicsPipelineShaderGroupsCreateInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_GRAPHICS_PIPELINE_SHADER_GROUPS_CREATE_INFO_NV);
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

    public @unsigned int groupCount() {
        return segment.get(LAYOUT$groupCount, OFFSET$groupCount);
    }

    public void groupCount(@unsigned int value) {
        segment.set(LAYOUT$groupCount, OFFSET$groupCount, value);
    }

    public @pointer(comment="VkGraphicsShaderGroupCreateInfoNV*") MemorySegment pGroupsRaw() {
        return segment.get(LAYOUT$pGroups, OFFSET$pGroups);
    }

    public void pGroupsRaw(@pointer(comment="VkGraphicsShaderGroupCreateInfoNV*") MemorySegment value) {
        segment.set(LAYOUT$pGroups, OFFSET$pGroups, value);
    }

    public @nullable VkGraphicsShaderGroupCreateInfoNV pGroups() {
        MemorySegment s = pGroupsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkGraphicsShaderGroupCreateInfoNV(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkGraphicsShaderGroupCreateInfoNV[] pGroups(int assumedCount) {
        MemorySegment s = pGroupsRaw().reinterpret(assumedCount * VkGraphicsShaderGroupCreateInfoNV.SIZE);
        VkGraphicsShaderGroupCreateInfoNV[] arr = new VkGraphicsShaderGroupCreateInfoNV[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkGraphicsShaderGroupCreateInfoNV(s.asSlice(i * VkGraphicsShaderGroupCreateInfoNV.SIZE, VkGraphicsShaderGroupCreateInfoNV.SIZE));
        }
        return arr;
    }

    public void pGroups(@nullable VkGraphicsShaderGroupCreateInfoNV value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pGroupsRaw(s);
    }

    public @unsigned int pipelineCount() {
        return segment.get(LAYOUT$pipelineCount, OFFSET$pipelineCount);
    }

    public void pipelineCount(@unsigned int value) {
        segment.set(LAYOUT$pipelineCount, OFFSET$pipelineCount, value);
    }

    public @pointer(comment="VkPipeline") MemorySegment pPipelinesRaw() {
        return segment.get(LAYOUT$pPipelines, OFFSET$pPipelines);
    }

    public void pPipelinesRaw(@pointer(comment="VkPipeline") MemorySegment value) {
        segment.set(LAYOUT$pPipelines, OFFSET$pPipelines, value);
    }

    /// Note: the returned {@link VkPipeline.Buffer} does not have correct
    /// {@link VkPipeline.Buffer#size} property. It's up to user to track the size of the buffer,
    /// and use {@link VkPipeline.Buffer#reinterpret} to set the size before actually
    /// {@link VkPipeline.Buffer#read}ing or {@link VkPipeline.Buffer#write}ing
    /// the buffer.
    public @nullable VkPipeline.Buffer pPipelines() {
        MemorySegment s = pPipelinesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipeline.Buffer(s);
    }

    public void pPipelines(@nullable VkPipeline.Buffer value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pPipelinesRaw(s);
    }

    public static VkGraphicsPipelineShaderGroupsCreateInfoNV allocate(Arena arena) {
        return new VkGraphicsPipelineShaderGroupsCreateInfoNV(arena.allocate(LAYOUT));
    }
    
    public static VkGraphicsPipelineShaderGroupsCreateInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkGraphicsPipelineShaderGroupsCreateInfoNV[] ret = new VkGraphicsPipelineShaderGroupsCreateInfoNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkGraphicsPipelineShaderGroupsCreateInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("groupCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkGraphicsShaderGroupCreateInfoNV.LAYOUT).withName("pGroups"),
        ValueLayout.JAVA_INT.withName("pipelineCount"),
        ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pPipelines")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$groupCount = PathElement.groupElement("groupCount");
    public static final PathElement PATH$pGroups = PathElement.groupElement("pGroups");
    public static final PathElement PATH$pipelineCount = PathElement.groupElement("pipelineCount");
    public static final PathElement PATH$pPipelines = PathElement.groupElement("pPipelines");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$groupCount = (OfInt) LAYOUT.select(PATH$groupCount);
    public static final AddressLayout LAYOUT$pGroups = (AddressLayout) LAYOUT.select(PATH$pGroups);
    public static final OfInt LAYOUT$pipelineCount = (OfInt) LAYOUT.select(PATH$pipelineCount);
    public static final AddressLayout LAYOUT$pPipelines = (AddressLayout) LAYOUT.select(PATH$pPipelines);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$groupCount = LAYOUT.byteOffset(PATH$groupCount);
    public static final long OFFSET$pGroups = LAYOUT.byteOffset(PATH$pGroups);
    public static final long OFFSET$pipelineCount = LAYOUT.byteOffset(PATH$pipelineCount);
    public static final long OFFSET$pPipelines = LAYOUT.byteOffset(PATH$pPipelines);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$groupCount = LAYOUT$groupCount.byteSize();
    public static final long SIZE$pGroups = LAYOUT$pGroups.byteSize();
    public static final long SIZE$pipelineCount = LAYOUT$pipelineCount.byteSize();
    public static final long SIZE$pPipelines = LAYOUT$pPipelines.byteSize();

}
