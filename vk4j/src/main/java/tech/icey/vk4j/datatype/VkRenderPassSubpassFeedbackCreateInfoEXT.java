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

public record VkRenderPassSubpassFeedbackCreateInfoEXT(MemorySegment segment) implements IPointer {
    public static final MemoryLayout LAYOUT = NativeLayout.structLayout(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.ADDRESS.withTargetLayout(VkRenderPassSubpassFeedbackInfoEXT.LAYOUT).withName("pSubpassFeedback")
    );
    public static final long SIZE = LAYOUT.byteSize();

    public static final PathElement PATH$sType = PathElement.groupElement("sType");
    public static final PathElement PATH$pNext = PathElement.groupElement("pNext");
    public static final PathElement PATH$pSubpassFeedback = PathElement.groupElement("pSubpassFeedback");

    public static final OfInt LAYOUT$sType = (OfInt) LAYOUT.select(PATH$sType);
    public static final AddressLayout LAYOUT$pNext = (AddressLayout) LAYOUT.select(PATH$pNext);
    public static final AddressLayout LAYOUT$pSubpassFeedback = (AddressLayout) LAYOUT.select(PATH$pSubpassFeedback);

    public static final long OFFSET$sType = LAYOUT.byteOffset(PATH$sType);
    public static final long OFFSET$pNext = LAYOUT.byteOffset(PATH$pNext);
    public static final long OFFSET$pSubpassFeedback = LAYOUT.byteOffset(PATH$pSubpassFeedback);

    public static final long SIZE$sType = LAYOUT$sType.byteSize();
    public static final long SIZE$pNext = LAYOUT$pNext.byteSize();
    public static final long SIZE$pSubpassFeedback = LAYOUT$pSubpassFeedback.byteSize();

    public VkRenderPassSubpassFeedbackCreateInfoEXT(MemorySegment segment) {
        this.segment = segment;
        this.sType(VK_STRUCTURE_TYPE_RENDER_PASS_SUBPASS_FEEDBACK_CREATE_INFO_EXT);
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

    public @pointer(comment="VkRenderPassSubpassFeedbackInfoEXT*") MemorySegment pSubpassFeedbackRaw() {
        return segment.get(LAYOUT$pSubpassFeedback, OFFSET$pSubpassFeedback);
    }

    public void pSubpassFeedbackRaw(@pointer(comment="VkRenderPassSubpassFeedbackInfoEXT*") MemorySegment value) {
        segment.set(LAYOUT$pSubpassFeedback, OFFSET$pSubpassFeedback, value);
    }
    
    public @nullable VkRenderPassSubpassFeedbackInfoEXT pSubpassFeedback() {
        MemorySegment s = pSubpassFeedbackRaw();
        if (s.address() == 0) {
            return null;
        }
        return new VkRenderPassSubpassFeedbackInfoEXT(s);
    }

    @unsafe
    public @nullable VkRenderPassSubpassFeedbackInfoEXT[] pSubpassFeedback(int assumedCount) {
        MemorySegment s = pSubpassFeedbackRaw().reinterpret(assumedCount * VkRenderPassSubpassFeedbackInfoEXT.SIZE);
        VkRenderPassSubpassFeedbackInfoEXT[] arr = new VkRenderPassSubpassFeedbackInfoEXT[assumedCount];
        for (int i = 0; i < assumedCount; i++) {
            arr[i] = new VkRenderPassSubpassFeedbackInfoEXT(s.asSlice(i * VkRenderPassSubpassFeedbackInfoEXT.SIZE, VkRenderPassSubpassFeedbackInfoEXT.SIZE));
        }
        return arr;
    }

    public void pSubpassFeedback(@nullable VkRenderPassSubpassFeedbackInfoEXT value) {
        MemorySegment s = value == null ? MemorySegment.NULL : value.segment();
        pSubpassFeedbackRaw(s);
    }

    public static VkRenderPassSubpassFeedbackCreateInfoEXT allocate(Arena arena) {
        return new VkRenderPassSubpassFeedbackCreateInfoEXT(arena.allocate(LAYOUT));
    }
    
    public static VkRenderPassSubpassFeedbackCreateInfoEXT[] allocate(Arena arena, int count) {
        MemorySegment segment = arena.allocate(LAYOUT, count);
        VkRenderPassSubpassFeedbackCreateInfoEXT[] ret = new VkRenderPassSubpassFeedbackCreateInfoEXT[count];
        for (int i = 0; i < count; i++) {
            ret[i] = new VkRenderPassSubpassFeedbackCreateInfoEXT(segment.asSlice(i * SIZE, SIZE));
        }
        return ret;
    }
}
