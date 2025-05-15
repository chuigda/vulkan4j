package cc.design7.vulkan.datatype;

import java.lang.foreign.*;
import static java.lang.foreign.ValueLayout.*;

import org.jetbrains.annotations.Nullable;
import org.jetbrains.annotations.NotNull;
import cc.design7.ffm.IPointer;
import cc.design7.ffm.NativeLayout;
import cc.design7.ffm.annotation.*;
import cc.design7.ffm.ptr.*;
import cc.design7.vulkan.bitmask.*;
import cc.design7.vulkan.datatype.*;
import cc.design7.vulkan.enumtype.*;
import static cc.design7.vulkan.VkConstants.*;

public record VkGraphicsPipelineShaderGroupsCreateInfoNV(@NotNull MemorySegment segment) implements IPointer {
    public static final OfInt LAYOUT$sType = ValueLayout.JAVA_INT.withName("sType");
    public static final AddressLayout LAYOUT$pNext = ValueLayout.ADDRESS.withName("pNext");
    public static final OfInt LAYOUT$groupCount = ValueLayout.JAVA_INT.withName("groupCount");
    public static final AddressLayout LAYOUT$pGroups = ValueLayout.ADDRESS.withTargetLayout(VkGraphicsShaderGroupCreateInfoNV.LAYOUT).withName("pGroups");
    public static final OfInt LAYOUT$pipelineCount = ValueLayout.JAVA_INT.withName("pipelineCount");
    public static final AddressLayout LAYOUT$pPipelines = ValueLayout.ADDRESS.withTargetLayout(ValueLayout.ADDRESS).withName("pPipelines");

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(LAYOUT$sType, LAYOUT$pNext, LAYOUT$groupCount, LAYOUT$pGroups, LAYOUT$pipelineCount, LAYOUT$pPipelines);
    public static final long SIZE = LAYOUT.byteSize();

    public static VkGraphicsPipelineShaderGroupsCreateInfoNV allocate(Arena arena) {
        return new VkGraphicsPipelineShaderGroupsCreateInfoNV(arena.allocate(LAYOUT));
    }

    public static VkGraphicsPipelineShaderGroupsCreateInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkGraphicsPipelineShaderGroupsCreateInfoNV[] ret = new VkGraphicsPipelineShaderGroupsCreateInfoNV[count];
        for (int i = 0; i < count; i ++) {
            ret[i] = new VkGraphicsPipelineShaderGroupsCreateInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkGraphicsPipelineShaderGroupsCreateInfoNV clone(Arena arena, VkGraphicsPipelineShaderGroupsCreateInfoNV src) {
        VkGraphicsPipelineShaderGroupsCreateInfoNV ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkGraphicsPipelineShaderGroupsCreateInfoNV[] clone(Arena arena, VkGraphicsPipelineShaderGroupsCreateInfoNV[] src) {
        VkGraphicsPipelineShaderGroupsCreateInfoNV[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i ++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final PathElement PATH$sType = PathElement.groupElement("PATH$sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("PATH$pNext");
    public static final PathElement PATH$groupCount = PathElement.groupElement("PATH$groupCount");
    public static final PathElement PATH$pGroups = PathElement.groupElement("PATH$pGroups");
    public static final PathElement PATH$pipelineCount = PathElement.groupElement("PATH$pipelineCount");
    public static final PathElement PATH$pPipelines = PathElement.groupElement("PATH$pPipelines");

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$groupCount = LAYOUT$groupCount.byteSize();
    public static final long SIZE$pGroups = LAYOUT$pGroups.byteSize();
    public static final long SIZE$pipelineCount = LAYOUT$pipelineCount.byteSize();
    public static final long SIZE$pPipelines = LAYOUT$pPipelines.byteSize();

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$groupCount = LAYOUT.byteOffset(PATH$groupCount);
    public static final long OFFSET$pGroups = LAYOUT.byteOffset(PATH$pGroups);
    public static final long OFFSET$pipelineCount = LAYOUT.byteOffset(PATH$pipelineCount);
    public static final long OFFSET$pPipelines = LAYOUT.byteOffset(PATH$pPipelines);

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

    public @Nullable VkGraphicsShaderGroupCreateInfoNV pGroups() {
        MemorySegment s = pGroupsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkGraphicsShaderGroupCreateInfoNV(s);
    }

    public void pGroups(@Nullable VkGraphicsShaderGroupCreateInfoNV value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pGroupsRaw(s);
    }

    @unsafe public @Nullable VkGraphicsShaderGroupCreateInfoNV[] pGroups(int assumedCount) {
        MemorySegment s = pGroupsRaw();
        if (s.address() == 0) {
            return null;
        }

        s = s.reinterpret(assumedCount * VkGraphicsShaderGroupCreateInfoNV.SIZE);
        VkGraphicsShaderGroupCreateInfoNV[] ret = new VkGraphicsShaderGroupCreateInfoNV[assumedCount];
        for (int i = 0; i < assumedCount; i ++) {
            ret[i] = new VkGraphicsShaderGroupCreateInfoNV(s.asSlice(i * VkGraphicsShaderGroupCreateInfoNV.SIZE, VkGraphicsShaderGroupCreateInfoNV.SIZE));
        }
        return ret;
    }

    public @unsigned int pipelineCount() {
        return segment.get(LAYOUT$pipelineCount, OFFSET$pipelineCount);
    }

    public void pipelineCount(@unsigned int value) {
        segment.set(LAYOUT$pipelineCount, OFFSET$pipelineCount, value);
    }

    public @pointer(comment="VkPipeline*") MemorySegment pPipelinesRaw() {
        return segment.get(LAYOUT$pPipelines, OFFSET$pPipelines);
    }

    public void pPipelinesRaw(@pointer(comment="VkPipeline*") MemorySegment value) {
        segment.set(LAYOUT$pPipelines, OFFSET$pPipelines, value);
    }

    /// Note: the returned {@link VkPipeline.Buffer} does not have correct {@link VkPipeline.Buffer#size}
    /// property. It's up to user to track the size of the buffer, and use
    /// {@link VkPipeline.Buffer#reinterpret} to set the size before actually reading from or writing to the
    /// buffer.
    public @Nullable VkPipeline.Buffer pPipelines() {
        MemorySegment s = pPipelinesRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkPipeline.Buffer(s);
    }


}
/// dummy, not implemented yet
