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
/// typedef struct VkCommandBufferInheritanceInfo {
///     VkStructureType sType;
///     const void* pNext;
///     VkRenderPass renderPass;
///     uint32_t subpass;
///     VkFramebuffer framebuffer;
///     VkBool32 occlusionQueryEnable;
///     VkQueryControlFlags queryFlags;
///     VkQueryPipelineStatisticFlags pipelineStatistics;
/// } VkCommandBufferInheritanceInfo;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkCommandBufferInheritanceInfo.html">VkCommandBufferInheritanceInfo</a>
public record VkCommandBufferInheritanceInfo(MemorySegment segment) implements IPointer {
    public VkCommandBufferInheritanceInfo(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_INFO);
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

    public @Nullable VkRenderPass renderPass() {
        MemorySegment s = segment.get(LAYOUT$renderPass, OFFSET$renderPass);
        if (s.address() == 0) {
            return null;
        }
        return new VkRenderPass(s);
    }

    public void renderPass(@Nullable VkRenderPass value) {
        segment.set(
            LAYOUT$renderPass,
            OFFSET$renderPass,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @unsigned int subpass() {
        return segment.get(LAYOUT$subpass, OFFSET$subpass);
    }

    public void subpass(@unsigned int value) {
        segment.set(LAYOUT$subpass, OFFSET$subpass, value);
    }

    public @Nullable VkFramebuffer framebuffer() {
        MemorySegment s = segment.get(LAYOUT$framebuffer, OFFSET$framebuffer);
        if (s.address() == 0) {
            return null;
        }
        return new VkFramebuffer(s);
    }

    public void framebuffer(@Nullable VkFramebuffer value) {
        segment.set(
            LAYOUT$framebuffer,
            OFFSET$framebuffer,
            value != null ? value.segment() : MemorySegment.NULL
        );
    }

    public @unsigned int occlusionQueryEnable() {
        return segment.get(LAYOUT$occlusionQueryEnable, OFFSET$occlusionQueryEnable);
    }

    public void occlusionQueryEnable(@unsigned int value) {
        segment.set(LAYOUT$occlusionQueryEnable, OFFSET$occlusionQueryEnable, value);
    }

    public @enumtype(VkQueryControlFlags.class) int queryFlags() {
        return segment.get(LAYOUT$queryFlags, OFFSET$queryFlags);
    }

    public void queryFlags(@enumtype(VkQueryControlFlags.class) int value) {
        segment.set(LAYOUT$queryFlags, OFFSET$queryFlags, value);
    }

    public @enumtype(VkQueryPipelineStatisticFlags.class) int pipelineStatistics() {
        return segment.get(LAYOUT$pipelineStatistics, OFFSET$pipelineStatistics);
    }

    public void pipelineStatistics(@enumtype(VkQueryPipelineStatisticFlags.class) int value) {
        segment.set(LAYOUT$pipelineStatistics, OFFSET$pipelineStatistics, value);
    }

    public static VkCommandBufferInheritanceInfo allocate(Arena arena) {
        return new VkCommandBufferInheritanceInfo(arena.allocate(LAYOUT));
    }

    public static VkCommandBufferInheritanceInfo[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCommandBufferInheritanceInfo[] ret = new VkCommandBufferInheritanceInfo[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkCommandBufferInheritanceInfo(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }

    public static VkCommandBufferInheritanceInfo clone(Arena arena, VkCommandBufferInheritanceInfo src) {
        VkCommandBufferInheritanceInfo ret = allocate(arena);
        ret.segment.copyFrom(src.segment);
        return ret;
    }

    public static VkCommandBufferInheritanceInfo[] clone(Arena arena, VkCommandBufferInheritanceInfo[] src) {
        VkCommandBufferInheritanceInfo[] ret = allocate(arena, src.length);
        for (int i = 0; i < src.length; i++) {
            ret[i].segment.copyFrom(src[i].segment);
        }
        return ret;
    }

    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withName("renderPass"),
        ValueLayout.JAVA_INT.withName("subpass"),
        ValueLayout.ADDRESS.withName("framebuffer"),
        ValueLayout.JAVA_INT.withName("occlusionQueryEnable"),
        ValueLayout.JAVA_INT.withName("queryFlags"),
        ValueLayout.JAVA_INT.withName("pipelineStatistics")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$renderPass = PathElement.groupElement("renderPass");
    public static final PathElement PATH$subpass = PathElement.groupElement("subpass");
    public static final PathElement PATH$framebuffer = PathElement.groupElement("framebuffer");
    public static final PathElement PATH$occlusionQueryEnable = PathElement.groupElement("occlusionQueryEnable");
    public static final PathElement PATH$queryFlags = PathElement.groupElement("queryFlags");
    public static final PathElement PATH$pipelineStatistics = PathElement.groupElement("pipelineStatistics");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$renderPass = (AddressLayout) LAYOUT.select(PATH$renderPass);
    public static final OfInt LAYOUT$subpass = (OfInt) LAYOUT.select(PATH$subpass);
    public static final AddressLayout LAYOUT$framebuffer = (AddressLayout) LAYOUT.select(PATH$framebuffer);
    public static final OfInt LAYOUT$occlusionQueryEnable = (OfInt) LAYOUT.select(PATH$occlusionQueryEnable);
    public static final OfInt LAYOUT$queryFlags = (OfInt) LAYOUT.select(PATH$queryFlags);
    public static final OfInt LAYOUT$pipelineStatistics = (OfInt) LAYOUT.select(PATH$pipelineStatistics);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$renderPass = LAYOUT.byteOffset(PATH$renderPass);
    public static final long OFFSET$subpass = LAYOUT.byteOffset(PATH$subpass);
    public static final long OFFSET$framebuffer = LAYOUT.byteOffset(PATH$framebuffer);
    public static final long OFFSET$occlusionQueryEnable = LAYOUT.byteOffset(PATH$occlusionQueryEnable);
    public static final long OFFSET$queryFlags = LAYOUT.byteOffset(PATH$queryFlags);
    public static final long OFFSET$pipelineStatistics = LAYOUT.byteOffset(PATH$pipelineStatistics);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$renderPass = LAYOUT$renderPass.byteSize();
    public static final long SIZE$subpass = LAYOUT$subpass.byteSize();
    public static final long SIZE$framebuffer = LAYOUT$framebuffer.byteSize();
    public static final long SIZE$occlusionQueryEnable = LAYOUT$occlusionQueryEnable.byteSize();
    public static final long SIZE$queryFlags = LAYOUT$queryFlags.byteSize();
    public static final long SIZE$pipelineStatistics = LAYOUT$pipelineStatistics.byteSize();
}
