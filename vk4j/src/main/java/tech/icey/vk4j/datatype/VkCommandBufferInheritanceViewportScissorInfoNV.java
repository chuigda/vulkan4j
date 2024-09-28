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
/// typedef struct VkCommandBufferInheritanceViewportScissorInfoNV {
///     VkStructureType sType;
///     const void* pNext;
///     VkBool32 viewportScissor2D;
///     uint32_t viewportDepthCount;
///     const VkViewport* pViewportDepths;
/// } VkCommandBufferInheritanceViewportScissorInfoNV;}
///
/// @see <a href="https://registry.khronos.org/vulkan/specs/1.3-extensions/man/html/VkCommandBufferInheritanceViewportScissorInfoNV.html">VkCommandBufferInheritanceViewportScissorInfoNV</a>
public record VkCommandBufferInheritanceViewportScissorInfoNV(MemorySegment segment) implements IPointer {
    public VkCommandBufferInheritanceViewportScissorInfoNV(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_COMMAND_BUFFER_INHERITANCE_VIEWPORT_SCISSOR_INFO_NV);
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

    public @unsigned int viewportScissor2D() {
        return segment.get(LAYOUT$viewportScissor2D, OFFSET$viewportScissor2D);
    }

    public void viewportScissor2D(@unsigned int value) {
        segment.set(LAYOUT$viewportScissor2D, OFFSET$viewportScissor2D, value);
    }

    public @unsigned int viewportDepthCount() {
        return segment.get(LAYOUT$viewportDepthCount, OFFSET$viewportDepthCount);
    }

    public void viewportDepthCount(@unsigned int value) {
        segment.set(LAYOUT$viewportDepthCount, OFFSET$viewportDepthCount, value);
    }

    public @pointer(comment="VkViewport*") MemorySegment pViewportDepthsRaw() {
        return segment.get(LAYOUT$pViewportDepths, OFFSET$pViewportDepths);
    }

    public void pViewportDepthsRaw(@pointer(comment="VkViewport*") MemorySegment value) {
        segment.set(LAYOUT$pViewportDepths, OFFSET$pViewportDepths, value);
    }

    public @nullable VkViewport pViewportDepths() {
        MemorySegment s = pViewportDepthsRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkViewport(s);
    }

    /// Note: this function is {@link unsafe} because it's up to user to provide the correct count of elements.
    @unsafe
    public @nullable VkViewport[] pViewportDepths(int assumedCount) {
        MemorySegment s = pViewportDepthsRaw().reinterpret(assumedCount * VkViewport.SIZE);
        VkViewport[] arr = new VkViewport[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkViewport(s.asSlice(i * VkViewport.SIZE, VkViewport.SIZE));
        }
        return arr;
    }

    public void pViewportDepths(@nullable VkViewport value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pViewportDepthsRaw(s);
    }

    public static VkCommandBufferInheritanceViewportScissorInfoNV allocate(Arena arena) {
        return new VkCommandBufferInheritanceViewportScissorInfoNV(arena.allocate(LAYOUT));
    }
    
    public static VkCommandBufferInheritanceViewportScissorInfoNV[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkCommandBufferInheritanceViewportScissorInfoNV[] ret = new VkCommandBufferInheritanceViewportScissorInfoNV[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkCommandBufferInheritanceViewportScissorInfoNV(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
    
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("viewportScissor2D"),
        ValueLayout.JAVA_INT.withName("viewportDepthCount"),
        ValueLayout.ADDRESS.withTargetLayout(VkViewport.LAYOUT).withName("pViewportDepths")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$viewportScissor2D = PathElement.groupElement("viewportScissor2D");
    public static final PathElement PATH$viewportDepthCount = PathElement.groupElement("viewportDepthCount");
    public static final PathElement PATH$pViewportDepths = PathElement.groupElement("pViewportDepths");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final OfInt LAYOUT$viewportScissor2D = (OfInt) LAYOUT.select(PATH$viewportScissor2D);
    public static final OfInt LAYOUT$viewportDepthCount = (OfInt) LAYOUT.select(PATH$viewportDepthCount);
    public static final AddressLayout LAYOUT$pViewportDepths = (AddressLayout) LAYOUT.select(PATH$pViewportDepths);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$viewportScissor2D = LAYOUT.byteOffset(PATH$viewportScissor2D);
    public static final long OFFSET$viewportDepthCount = LAYOUT.byteOffset(PATH$viewportDepthCount);
    public static final long OFFSET$pViewportDepths = LAYOUT.byteOffset(PATH$pViewportDepths);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$viewportScissor2D = LAYOUT$viewportScissor2D.byteSize();
    public static final long SIZE$viewportDepthCount = LAYOUT$viewportDepthCount.byteSize();
    public static final long SIZE$pViewportDepths = LAYOUT$pViewportDepths.byteSize();

}
